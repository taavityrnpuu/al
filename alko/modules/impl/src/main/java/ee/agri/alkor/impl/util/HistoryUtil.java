/**
 *
 */
package ee.agri.alkor.impl.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.hibernate.EntityMode;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ee.agri.alkor.impl.ClassificatorServiceImpl;
import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.Decision;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Faq;
import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.News;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductEnterpriseRole;
import ee.agri.alkor.model.ProductMovementReport;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.UserGroup;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.history.AddressHistory;
import ee.agri.alkor.model.history.ClassificatorHistory;
import ee.agri.alkor.model.history.DecisionHistory;
import ee.agri.alkor.model.history.EnterpriseHistory;
import ee.agri.alkor.model.history.FaqHistory;
import ee.agri.alkor.model.history.IHistorical;
import ee.agri.alkor.model.history.NewsHistory;
import ee.agri.alkor.model.history.PersonHistory;
import ee.agri.alkor.model.history.ProductEnterpriseRoleHistory;
import ee.agri.alkor.model.history.ProductHistory;
import ee.agri.alkor.model.history.ProductMovementReportHistory;
import ee.agri.alkor.model.history.ProductMovementReportRecordHistory;
import ee.agri.alkor.model.history.RegistryApplicationHistory;
import ee.agri.alkor.model.history.RegistryDocumentHistory;
import ee.agri.alkor.model.history.RegistryEntryHistory;
import ee.agri.alkor.model.history.RegistryPaymentHistory;
import ee.agri.alkor.model.history.SystemUserHistory;
import ee.agri.alkor.model.history.UserGroupHistory;
import ee.agri.alkor.service.ConstraintViolationException;
import ee.agri.alkor.service.ServiceFactory;

/**
 * Helper class used to add changes to history tables
 * @author Kaupo Parmas
 *
 */
public class HistoryUtil {

	private static Logger LOGGER = Logger
	.getLogger(HistoryUtil.class);

	/**
    *
    */
	private static final long serialVersionUID = 7925030002706017322L;

	private static Hashtable<Class, Class> classes;

	static {
		classes = new Hashtable<Class, Class>();
		classes.put(Enterprise.class, EnterpriseHistory.class);
		classes.put(Person.class, PersonHistory.class);
		classes.put(Product.class, ProductHistory.class);
		classes
				.put(RegistryApplication.class,
						RegistryApplicationHistory.class);
		classes.put(News.class, NewsHistory.class);
		classes.put(Faq.class, FaqHistory.class);
		classes.put(ProductEnterpriseRole.class,
				ProductEnterpriseRoleHistory.class);
		classes.put(Classificator.class, ClassificatorHistory.class);
		classes.put(ProductMovementReport.class,
				ProductMovementReportHistory.class);
		classes.put(ProductMovementReportRecord.class,
				ProductMovementReportRecordHistory.class);
		classes.put(RegistryDocument.class, RegistryDocumentHistory.class);
		classes.put(RegistryEntry.class, RegistryEntryHistory.class);
		classes.put(RegistryPayment.class, RegistryPaymentHistory.class);
		classes.put(SystemUser.class, SystemUserHistory.class);
		classes.put(UserGroup.class, UserGroupHistory.class);
		classes.put(Address.class, AddressHistory.class);
		classes.put(Decision.class, DecisionHistory.class);

	}

	/**
	 * Add the entity to its corresponding history table
	 * @param entity - the entity that needs to be archived in a history table
	 * @param session - the current active session used to add the entity
	 */
	public static void doHistory(Object entity, Session session) {
		Object history = null;
		try {
			if (entity.getClass().getSuperclass() == Classificator.class && entity.getClass() != Classificator.class) {
				history = new ClassificatorHistory();
			} else {
				history = classes.containsKey(entity.getClass()) ? classes.get(
						entity.getClass()).newInstance() : null;
			}
		} catch (InstantiationException e1) {
			LOGGER.error(e1.getMessage());
		} catch (IllegalAccessException e1) {
			LOGGER.error(e1.getMessage());
		}
		if (history == null) {
			return;
		}
		//get the current session
		//session = session.getSessionFactory().getCurrentSession();
		history = doMapping(entity, history, session);

		// Save change to history
		//LOGGER.debug(history.getClass().getName() + " " + ((IEntity) history).getId());
//		try {
//			ServiceFactory.getRegistryService().saveOrUpdate((IEntity)history);
//		} catch (ConstraintViolationException e) {
//			LOGGER.error(e.getMessage());
//			e.printStackTrace();
//		}
		Session sess = session.getSessionFactory().openSession();
		sess.setFlushMode(FlushMode.MANUAL);
		Transaction tx = sess.beginTransaction();
		sess.save(history);
		sess.flush();
		tx.commit();
		sess.close();
	}

	private static void invokeMethod(String methodName, Object history, Object value,
			Class clazz) throws IllegalArgumentException, SecurityException,
			IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		history.getClass().getMethod(methodName, clazz).invoke(history, value);
	}

	private static Object doMapping(Object entity, Object history, Session session) {
		Method[] methods = entity.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().indexOf("get") == 0) {

				// get the return type of the get method
				Class clazz = m.getReturnType();

				// make up the name of the set method
				String methodName = "set" + m.getName().substring(3);

				try {
					Object o = m.invoke(entity, (Object[])null);
					if(o != null) {
						if (Classificator.class.isAssignableFrom(clazz)) {
							o = ((Classificator)o).getName() != null ? ((Classificator)o).getName() : ClassificatorServiceImpl.findClassItem(session
									.getSession(EntityMode.POJO), clazz,
									((Classificator) o).getCode()).getName();
							invokeMethod(methodName, history, o, String.class);
						} else if (classes.get(clazz) != null) {
							if (IHistorical.class.isAssignableFrom(clazz)) {
								o = ((IEntity) o).getId();
								invokeMethod(methodName, history, o, Long.class);
							} else {
								// map embedded classes
								o = doMapping(o, classes.get(clazz).newInstance(),
										session);
								invokeMethod(methodName, history, o, classes.get(clazz));
							}
						} else {
							invokeMethod(methodName, history, o, clazz);
						}
					}
				} catch (NoSuchMethodException e) {
				} catch (Exception e) {
					LOGGER.error(e.getStackTrace().toString());
				}
			}
		}
		return history;
	}

}
