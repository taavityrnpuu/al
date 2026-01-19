package ee.agri.alkor.util.convert;

import java.util.Hashtable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.RegistryEntry;

public class Alkor2Dao extends HibernateDaoSupport implements IAlkor2Service {

	private final static int buffer = 50;
	/* (non-Javadoc)
	 * @see ee.agri.alkor.util.convert.IAlkor2Service#save(ee.agri.alkor.model.IEntity)
	 */
	@Transactional
	public void save(IEntity entity) {
			getHibernateTemplate().saveOrUpdate(entity);
			getHibernateTemplate().flush();
			getHibernateTemplate().clear();
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.util.convert.IAlkor2Service#find(java.lang.Class)
	 */
	public Object find(Class entityClazz, String propName, Object value) {
		if(value == null) return null;

		StringBuffer qsbuf = new StringBuffer("from ")
			.append(entityClazz.getName())
			.append( " where ")
			.append(propName).append(" = ?0");

		List result = getHibernateTemplate().find(qsbuf.toString(), value);
		return (result.size() == 0) ? null : result.get(0);
	}

	public void saveList(List <IEntity>iEntityList) {
		int count = 0;
		for (IEntity entity : iEntityList) {
			getHibernateTemplate().saveOrUpdate(entity);
			count++;
			if (count % buffer == 0) {
				getHibernateTemplate().flush();
				getHibernateTemplate().clear();
			}
		}
		getHibernateTemplate().flush();
		getHibernateTemplate().clear();
	}

	public void callFlush() {
		getHibernateTemplate().flush();
	}

	public Hashtable<String, RegistryEntry> findAllRegEntry() {
		return getHibernateTemplate().execute(new HibernateCallback<Hashtable<String, RegistryEntry>>() {
			/* (non-Javadoc)
			 * @see org.springframework.orm.hibernate5.HibernateCallback#doInHibernate(org.hibernate.Session)
			 */
			public Hashtable<String, RegistryEntry> doInHibernate(Session arg0) throws HibernateException {
				//StatelessSession session = arg0.getSessionFactory().openStatelessSession();
				//Transaction tx = session.beginTransaction();
				List<RegistryEntry> entrys = arg0.createQuery("from RegistryEntry").list();
				Hashtable<String, RegistryEntry> entryTable = new Hashtable<String, RegistryEntry>();
				for(RegistryEntry entry : entrys) {
					entryTable.put(entry.getNr(), entry);
				}
				//session.close();
				return entryTable;
			}
		});
	}

}
