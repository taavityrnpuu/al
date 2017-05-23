package ee.agri.alkor.impl;

import org.apache.log4j.Logger;
import org.hibernate.EntityMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.event.FlushEntityEvent;
import org.hibernate.event.FlushEntityEventListener;

import ee.agri.alkor.model.IClassificatorAware;

public class ClassificatorFlushListener implements FlushEntityEventListener {
	private static Logger LOGGER = Logger
	.getLogger(ClassificatorFlushListener.class);

	public void onFlushEntity(FlushEntityEvent event) throws HibernateException {
		
		try {
			if (event.getEntity() instanceof IClassificatorAware) {
//				if(LOGGER.isDebugEnabled())
//					LOGGER.debug("onFlushEntity, entity: " + event.getEntity().getClass().getName());
			
				
				Session eventSession = event.getSession().getSession(
						EntityMode.POJO);
				ClassificatorServiceImpl.linkClassificators(eventSession,
						(IClassificatorAware) event.getEntity());

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new HibernateException(e);
		}
		
	}
}
