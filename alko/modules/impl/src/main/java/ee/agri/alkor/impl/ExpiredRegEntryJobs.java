package ee.agri.alkor.impl;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import ee.agri.alkor.model.RegistryEntry;

public class ExpiredRegEntryJobs extends HibernateDaoSupport {
	private static Logger LOGGER = Logger.getLogger(ExpiredRegEntryJobs.class);
	
	private String changeReason;
	
	public void processExpiredRegEntries(){
		LOGGER.info("Executing processExpiredRegEntries()");
		getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session){
				try {
					org.hibernate.Query query = session.createQuery(
						"from RegistryEntry e " +
						"where e.validUntil < current_date " +
						"and e.changeReason is null "
					);
					List expiredEntries = query.list();
					
					LOGGER.info("found " + expiredEntries.size()	+ " expired entries");
					
					for(Iterator it = expiredEntries.iterator(); it.hasNext();) {
						RegistryEntry entry = (RegistryEntry)it.next();
						entry.setChangeReason(getChangeReason());
					}
					
					if(!expiredEntries.isEmpty()) {
						if(!session.getTransaction().isActive()) {
							session.beginTransaction();
						}
						session.flush();
					}
					LOGGER.info("processExpiredRegEntries() finished successfully");
				} catch (Exception e) {
					LOGGER.info("processExpiredRegEntries() execution failed!");
					e.printStackTrace();
					return null;
				}
				
				return null;
			}
		});
		System.out.println("Active: " + java.lang.Thread.activeCount());
		LOGGER.info("done ExpiredRegEntryJobs");
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

}
