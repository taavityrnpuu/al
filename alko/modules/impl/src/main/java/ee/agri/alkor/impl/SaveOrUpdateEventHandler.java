/**
 *
 */
package ee.agri.alkor.impl;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;

import ee.agri.alkor.impl.util.HistoryUtil;
import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.history.IHistorical;
import ee.agri.alkor.model.history.IHistoryEntity;
import ee.agri.alkor.service.AuthenticationServiceDelegate;

/**
 * @author Kaupo Parmas
 *
 */
public class SaveOrUpdateEventHandler implements PostUpdateEventListener, PostInsertEventListener, PreUpdateEventListener, PreInsertEventListener {

	/**
	 *
	 */
	private static final long serialVersionUID = -1072482074396471505L;
	private static Logger LOGGER = Logger
	.getLogger(SaveOrUpdateEventHandler.class);

	/* (non-Javadoc)
	 * @see org.hibernate.event.PostUpdateEventListener#onPostUpdate(org.hibernate.event.PostUpdateEvent)
	 */
	public void onPostUpdate(PostUpdateEvent arg0) {
		//LOGGER.debug(": onPostUpdate: " + arg0.getEntity());
		Object entity = arg0.getEntity();
		if (entity instanceof IHistorical) {
			HistoryUtil.doHistory(entity, arg0.getSession());
		}

	}

	/* (non-Javadoc)
	 * @see org.hibernate.event.PostInsertEventListener#onPostInsert(org.hibernate.event.PostInsertEvent)
	 */
	public void onPostInsert(PostInsertEvent arg0) {
		//LOGGER.debug(": onPostInsert: " + arg0.getEntity());
		Object entity = arg0.getEntity();
		if (entity instanceof IHistorical) {
			HistoryUtil.doHistory(entity, arg0.getSession());
		}

	}

	/* (non-Javadoc)
	 * @see org.hibernate.event.PreUpdateEventListener#onPreUpdate(org.hibernate.event.PreUpdateEvent)
	 */
	public boolean onPreUpdate(PreUpdateEvent arg0) {
		if (arg0.getEntity() instanceof ABaseBean && !(arg0.getEntity() instanceof IHistoryEntity)) {
			if(!Arrays.equals(arg0.getOldState(), arg0.getState())) {
				//LOGGER.debug(" :onPreUpdate: Add modified and modified by values");
			    ABaseBean bean = (ABaseBean)arg0.getEntity();
			    bean.setModified(new java.util.Date());
			    bean.setModifiedBy(AuthenticationServiceDelegate.getCurrentUserName());
			    return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.hibernate.event.PreInsertEventListener#onPreInsert(org.hibernate.event.PreInsertEvent)
	 */
	public boolean onPreInsert(PreInsertEvent arg0) {
		if (arg0.getEntity() instanceof ABaseBean && !(arg0.getEntity() instanceof IHistoryEntity)) {
		    //LOGGER.debug(" :onPreInsert: Add created and created by values");
		    ABaseBean bean = (ABaseBean)arg0.getEntity();
		    bean.setCreated(new java.util.Date());
		    bean.setCreatedBy(AuthenticationServiceDelegate.getCurrentUserName());
		    return true;
		}
		return false;
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}