package ee.agri.alkor.util.convert;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.RegistryEntry;

public class Alkor2Dao extends HibernateDaoSupport implements IAlkor2Service {

	private final static int buffer = 50;
	private int count = 0;
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
			.append(propName).append(" = ?");

		List result = getHibernateTemplate().find(qsbuf.toString(), value);
		return (result.size() == 0) ? null : result.get(0);
	}

	public void saveList(List <IEntity>iEntityList) {
		getHibernateTemplate().saveOrUpdateAll(iEntityList);
		getHibernateTemplate().flush();
		getHibernateTemplate().clear();
	}

	public void callFlush() {
		getHibernateTemplate().flush();
	}

	public Hashtable<String, RegistryEntry> findAllRegEntry() {
		return (Hashtable<String, RegistryEntry>)getHibernateTemplate().execute(new HibernateCallback(){
			/* (non-Javadoc)
			 * @see org.springframework.orm.hibernate3.HibernateCallback#doInHibernate(org.hibernate.Session)
			 */
			public Object doInHibernate(Session arg0) throws HibernateException, SQLException {
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
