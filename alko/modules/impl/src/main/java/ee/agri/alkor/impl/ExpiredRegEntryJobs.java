package ee.agri.alkor.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ee.agri.alkor.model.RegistryEntry;

public class ExpiredRegEntryJobs extends HibernateDaoSupport {
	
	private static Logger LOGGER = Logger.getLogger(ExpiredRegEntryJobs.class);
	
	private String changeReason;
	
	public void processExpiredRegEntries(){
		LOGGER.info("Ececuting processExpiredRegEntries()");
		getHibernateTemplate().execute(new HibernateCallback ()
		{
			
			public Object doInHibernate(Session session){
				try {
					org.hibernate.Query query = session
							.createQuery("from RegistryEntry e " +
									"where e.validUntil < current_date " +
									"and e.changeReason is null ");
					List expriedEntries = query.list();
					LOGGER.info("found " + expriedEntries.size()
							+ " expired entries");
					for (java.util.Iterator it = expriedEntries.iterator(); it
							.hasNext();) {

						RegistryEntry entry = (RegistryEntry) it.next();
						entry.setChangeReason(getChangeReason());

					}
					session.flush();
					LOGGER.info("processExpiredRegEntries() finished successfully");
				} catch (Exception e) {
					LOGGER.error("processExpiredRegEntries() execution failed!");
					e.printStackTrace();
					return null;
				}
				return null;
			
			}
		});
			
		
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

}
