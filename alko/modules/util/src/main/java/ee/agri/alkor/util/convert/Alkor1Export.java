package ee.agri.alkor.util.convert;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class Alkor1Export extends HibernateDaoSupport {
	
	private int pageSize = 500;
	
	public List findNext(final String entityName, final int startRow) {
		return (List) getHibernateTemplate().execute(new HibernateCallback<List>() {

			public List doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery("from " + entityName);
				q.setFirstResult(startRow);
				q.setMaxResults(Alkor1Export.this.pageSize);
				return q.list();
			}
			 
		 });
		
	}
	
	public List fetchEntities(final String entityName, final int startRow, final int pageSize) {
		return (List) getHibernateTemplate().execute(new HibernateCallback<List>() {

			public List doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery("from " + entityName);
				q.setFirstResult(startRow);
				q.setMaxResults(pageSize);
				return q.list();
			}
			 
		 });
		
	}
	
	public List fetchCountries() {
		return (List) getHibernateTemplate().execute(new HibernateCallback<List>() {
			
			public List doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery("from ArCountry");
				return q.list();
			}
		});
		
	}
	
	public List fetchCapacities() {
		return (List) getHibernateTemplate().execute(new HibernateCallback<List>() {
			public List doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery("from ArCapacity");
				return q.list();
			}
			
		});
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
