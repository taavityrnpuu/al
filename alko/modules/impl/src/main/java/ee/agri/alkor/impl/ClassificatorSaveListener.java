package ee.agri.alkor.impl;

import org.hibernate.EntityMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.event.spi.SaveOrUpdateEventListener;

import ee.agri.alkor.model.IClassificatorAware;

public class ClassificatorSaveListener implements SaveOrUpdateEventListener {

	public void onSaveOrUpdate(SaveOrUpdateEvent event)
			throws HibernateException {
		try {
			if (event.getObject() instanceof IClassificatorAware) {
				Session eventSession = event.getSession().getSession();
				ClassificatorServiceImpl.linkClassificators(eventSession,
						(IClassificatorAware) event.getObject());
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new HibernateException(e);
		}
	}

}
