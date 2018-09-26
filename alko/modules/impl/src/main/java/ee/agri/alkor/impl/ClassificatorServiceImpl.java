package ee.agri.alkor.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;

import org.apache.log4j.Logger;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.transaction.annotation.Transactional;

import ee.agri.alkor.model.IClassificatorAware;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.classes.ClassificatorRow;
import ee.agri.alkor.service.ConstraintViolationException;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.LinkedHashMap;
import ee.agri.alkor.service.SystemException;

/**
 * Classificator Service implementation.
 *
 * @author ivar
 *
 *
 */

/*
 * @author MARTIN VT BUG 3917
 * 
 */
public class ClassificatorServiceImpl extends BaseBO implements IClassificatorService {

	private static Logger LOGGER = Logger.getLogger(ClassificatorServiceImpl.class);

	private static Set<IClassificatorAware> alreadyLinkedHierarchy = new HashSet<IClassificatorAware>();

	@Transactional
	public void addClassList(List<Classificator> classList) throws ConstraintViolationException {
		// Check for duplicates
		Map classMap = new HashMap();

		for (Classificator classItem : classList) {
			Classificator preItem = (Classificator) classMap.get(classItem.getCode());
			if (preItem != null)
				throw new ConstraintViolationException(classItem.getClass().getName() + " code=" + classItem.getCode());
			else
				classMap.put(classItem.getCode(), classItem);
		}
		// getHibernateTemplate().setEntityInterceptor(new AuditInterceptor());
		try {
			for(Classificator classItem : classList) {
				getHibernateTemplate().saveOrUpdate(classItem);
			}
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(classList.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	@Transactional
	public void delete(Long classItemId) {
		super.delete(ClassificatorRow.class, classItemId);
	}

	/**
	 *
	 * @return Map of (category->categoryName)
	 */
	public LinkedHashMap findCategories(String category) {
		StringBuffer sbuff = new StringBuffer("select c.category, c.categoryName from ClassificatorRow c");
		if (category != null && category.length() != 0) {
			sbuff.append(" where lower(c.categoryName) like lower('" + category
					+ "') and (c.systemClass is null or c.systemClass is false) ");
		} else {
			sbuff.append(" where (c.systemClass is null or c.systemClass is false)");
		}
		sbuff.append(" group by c.category, c.categoryName order by c.categoryName");
		Iterator it = getHibernateTemplate().find(sbuff.toString()).iterator();
		LinkedHashMap categoryMap = new LinkedHashMap();
		while (it.hasNext()) {
			Object[] row = (Object[]) it.next();
			categoryMap.put((String) row[0], (String) row[1]);
		}

		return categoryMap;
	}

	public List<Classificator> findClassItems(String category) {
		return findAllClassItems(category, false);
	}
	/*
	 * @author Martin VT BUG 3198
	 * 
	 */

	public List<Classificator> findClassItems2(String category) {
		return findAllClassItems(category, true);
	}

	synchronized public List<Classificator> findAllClassItems(final String category, boolean all) {

		 //final StringBuffer sbuf = new StringBuffer("SELECT * from classificator WHERE category = '").append(category.replace("Otsi","")).append("' ");
		final StringBuffer sbuf = new StringBuffer("from ").append(category.replace("Otsi", ""));
		if (!all) {
			sbuf.append(" where active=true");
		}
		
		// if (!all) { sbuf.append(" AND active=true"); }
		 
		if (category.equals("Month")) {
			sbuf.append(" order by id");
		} else if (category.equals("Capacity")) {
			sbuf.append(" order by NULLIF(regexp_replace(name, '[^0-9]*' ,'', 'g'), '') asc");
		} else {
			sbuf.append(" order by name");
		}
		
		 //List<Classificator> list = null; try{ list = (List<Classificator>)
		 // getHibernateTemplate().find(sbuf.toString()); } catch(Exception x){
		  //x.printStackTrace(); } return list ;
		 

		/*
		  List<Classificator> list = new ArrayList<Classificator>();
		  
		  ResultSet rs = PostgreUtils.query(sbuf.toString());
		  
		  while(rs.next()){ Classificator c = new Classificator();
		  
		  c.setId(rs.getLong("id"));
		  c.setVersion(rs.getInteger("version"));
		  c.setModified(rs.getTimestamp("modified"));
		  c.setCreated(rs.getTimestamp("created"));
		  c.setCreatedBy(rs.getString("created_by"));
		  c.setModifiedBy(rs.getString("modified_by"));
		  c.setDeleted(rs.getTimestamp("deleted"));
		  c.setDeletedBy(rs.getString("deleted_by"));
		  c.setName(rs.getString("name"));
		  c.setActive(rs.getBoolean("active"));
		  c.setCode(rs.getString("code"));
		  c.setValidFrom(rs.getTimestamp("valid_from"));
		  c.setValidUntil(rs.getTimestamp("valid_until"));
		  c.setCategoryName(rs.getString("category"));
		  c.setCategoryName(rs.getString("cat_name"));
		  c.setSystemClass(rs.getBoolean("system_class"));
		  c.setOrderNr(rs.getInteger("order_nr"));
		  c.setOrderNrVta(rs.getInteger("order_nr_vta"));
		  
		  list.add(c); }
		  
		  return list;
		 */
		
		//System.out.println("--- findAllClassItems: " + category+" , SQL: " + sbuf.toString());
		
		Exception x = new Exception("findAllClassItems error");
/*
		//for (int times = 5; times > 0; times--) {
			try {
				return (List<Classificator>) getHibernateTemplate().execute(new HibernateCallback() {
					public Object doInHibernate(Session session) {
						List<Classificator> list = session.createQuery(sbuf.toString()).list();
						System.out.println("--- "+category+", list.size(): " + (list != null ? list.size() : "NULL"));
						return list;
					}
				});
			} catch (IndexOutOfBoundsException iof) {
				return new ArrayList<Classificator>();
			} catch (Exception e) {
				x = e;
				//LOGGER.debug("findAllClassItems error, we try " + times + " more times : " + e.getMessage());
				// throw new SystemException(e);
			}
		//}
*/
		
		//for (int times = 5; times > 0; times--) {
			try {
				List<Classificator> list = (List<Classificator>) getHibernateTemplate().find(sbuf.toString());
				//System.out.println("--- "+category+", list.size(): " + (list != null ? list.size() : "NULL"));
				return list;
			} catch (IndexOutOfBoundsException iof) {
				return new ArrayList<Classificator>();
			} catch (Exception e) {
				//System.out.println("--- "+category+" loading EXCEPTION "+ times + "/5 tries");
				x = e;
			}
		//}
		
		throw new SystemException(x);
	}

	public static List findClassItems(Session session, String className) {
		StringBuffer sbuf = new StringBuffer("from ").append(className).append(" order by name");

		return session.createQuery(sbuf.toString()).list();

	}

	public static List findClassItems2(Session session, String className) {
		StringBuffer sbuf = new StringBuffer("from ").append(className).append(" order by name");

		return session.createQuery(sbuf.toString()).list();

	}

	public static Classificator findClassItem(Session session, String category, String classItemCode) {
		StringBuffer sbuf = new StringBuffer("from ");
		sbuf.append(category).append(" c where c.code = ?");
		/*
		 * Classificator c = null; try{ c = (Classificator)
		 * session.createQuery(sbuf.toString()).setString( 0,
		 * classItemCode).list().get(0); }catch(Exception x){
		 * System.out.println("--------------------"); x.printStackTrace(); }
		 */
		return (Classificator) session.createQuery(sbuf.toString()).setString(0, classItemCode).list().get(0);
	}

	@SuppressWarnings("unchecked")
	public Classificator find(String category, String code) {
		StringBuffer sbuf = new StringBuffer("from ");
		sbuf.append(category).append(" c where c.code = '").append(code).append("' ");

		List<Classificator> classificatorList = (List<Classificator>)getHibernateTemplate().find(sbuf.toString());
		return (classificatorList != null && classificatorList.size() > 0) ? classificatorList.get(0) : null;
	}

	public static Classificator findClassItem(Session session, Class classificatorClass, String classItemCode) {
		StringBuffer sbuf = new StringBuffer("from ");
		sbuf.append(classificatorClass.getName()).append(" c where c.code = ?");

		Classificator c = null;
		try {
			c = (Classificator) session.createQuery(sbuf.toString()).setString(0, classItemCode).list().get(0);
		} catch (Exception x) {
			// x.printStackTrace();
		}
		return c;
	}

	public static void linkClassificators(Session session, IClassificatorAware instance)
			throws InvocationTargetException,

			IllegalAccessException, NoSuchMethodException {
		// if(LOGGER.isDebugEnabled())
		// LOGGER.debug("linkClassificators, entity: " +
		// instance.getClass().getName());

		FlushModeType before = session.getFlushMode();

		session.setFlushMode(FlushMode.COMMIT);
		alreadyLinkedHierarchy = new HashSet<IClassificatorAware>();
		linkHierarchy(session, instance);
		session.setFlushMode(before);
	}

	@Transactional
	public void delete(String className, String code) {
		StringBuffer sbuf = new StringBuffer("select id from ").append(className).append(" c where c.code='")
				.append(code).append("'");
		Long classif = (Long) getHibernateTemplate().find(sbuf.toString()).iterator().next();
		super.delete(Classificator.class, classif);
	}

	private static void linkHierarchy(Session session, IClassificatorAware instance)
			throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

		if (!alreadyLinkedHierarchy.contains(instance)) {

			alreadyLinkedHierarchy.add(instance);

			Method[] methods = instance.getClass().getMethods();

			for (Method m : methods) {
				Class returnType = m.getReturnType();
				if (Classificator.class.isAssignableFrom(returnType)) {

					Classificator classValue = (Classificator) m.invoke(instance, (Object[]) null);
					if (classValue != null) {
						if (classValue.getCode() != null) {
							Classificator persistentValue = null;
							try {
								persistentValue = findClassItem(session, returnType, classValue.getCode());
							} catch (Exception e) {
								LOGGER.info(e, e);
								continue;
							}
							String getMethodName = m.getName();
							String setMethodName = "set" + getMethodName.substring(3);

							Class[] paramTypes = new Class[] { returnType };
							Method setMethod = instance.getClass().getMethod(setMethodName, paramTypes);
							Object[] params = new Object[] { persistentValue };
							setMethod.invoke(instance, params);
						}
					}

				} else if (IClassificatorAware.class.isAssignableFrom(returnType)) {
					IClassificatorAware classAware = (IClassificatorAware) m.invoke(instance, (Object[]) null);
					if (classAware != null)
						linkHierarchy(session, classAware);
				}
			}

		}

	}

	/**
	 * @author raido.kalbre
	 */
	synchronized public List<Classificator> findEnterpriseSpecificClassItems(String className, String regCode) {

		String query = "";

		/*
		 * String q = "FROM Product prod, "+ className +
		 * " cl, Enterprise e1, Enterprise e2, RegistryApplication app WHERE " +
		 * "app.product_id=prod.id " + "AND app.appl_subj_id=e1.id " +
		 * "AND prod.producer_subj_id=e2.id " + "AND e2.country_class_id=cl.id "
		 * + "AND e1.reg_id=" + regCode;
		 */

		if ("Country".equals(className)) {
			query = "SELECT distinct(c) FROM " + className + " c, RegistryApplication app "
					+ "WHERE app.product.producer.address.country.id = c.id " + "AND app.applicant.registrationId='"
					+ regCode + "' ORDER BY c.name";
		} else if ("ProductType".equals(className)) {
			query = "SELECT distinct(c) FROM " + className + " c, RegistryApplication app "
					+ "WHERE app.product.type.id = c.id " + "AND app.applicant.registrationId='" + regCode
					+ "' ORDER BY c.name";
		} else if ("Capacity".equals(className)) {
			query = "SELECT distinct(c) FROM " + className + " c, RegistryApplication app "
					+ "WHERE app.product.packingVolume.id = c.id " + "AND app.applicant.registrationId='" + regCode
					+ "' ORDER BY c.name";
		}
		/*
		 * select distinct(cl.name) from product prod, classificator cl,
		 * enterprise e1,--taotleja enterprise e2,--tootja reg_application app
		 * where app.product_id=prod.id and app.appl_subj_id=e1.id and
		 * prod.producer_subj_id=e2.id and e2.country_class_id=cl.id and
		 * e1.reg_id= EIT-st antud äriregistrikoodiga
		 */

		return (List<Classificator>) getHibernateTemplate().find(query);
	}
}
