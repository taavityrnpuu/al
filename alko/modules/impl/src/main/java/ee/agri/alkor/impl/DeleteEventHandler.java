/**
 *
 */
package ee.agri.alkor.impl;

import org.apache.log4j.Logger;
import org.hibernate.event.spi.PostDeleteEvent;
import org.hibernate.event.spi.PostDeleteEventListener;
import org.hibernate.event.spi.PreDeleteEvent;
import org.hibernate.event.spi.PreDeleteEventListener;
import org.hibernate.persister.entity.EntityPersister;

import ee.agri.alkor.impl.util.HistoryUtil;
import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.history.IHistorical;
import ee.agri.alkor.model.history.IHistoryEntity;
import ee.agri.alkor.service.AuthenticationServiceDelegate;

/**
 * Hibernate DeleteEventHandler used to handle Delete and PostDelete events
 * During a delete event the deleted and deleted_by fields of the deleted entity will get values. <br/>
 * During a postDelete event the deleted entity will be saved in its corresponding history table.
 * @author Kaupo Parmas
 *
 */
public class DeleteEventHandler implements PostDeleteEventListener, PreDeleteEventListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static Logger LOGGER = Logger
	.getLogger(DeleteEventHandler.class);


	/**
	 * Adds the deleted class into history
	 * @see org.hibernate.event.PostDeleteEventListener#onPostDelete(org.hibernate.event.PostDeleteEvent)
	 */
	public void onPostDelete(PostDeleteEvent arg0) {
		LOGGER.debug(": onPostDelete: " + arg0.getEntity());
		Object entity = arg0.getEntity();
		if (entity instanceof IHistorical) {
			HistoryUtil.doHistory(entity, arg0.getSession());
		}
	}

	/* (non-Javadoc)
	 * @see org.hibernate.event.PreDeleteEventListener#onPreDelete(org.hibernate.event.PreDeleteEvent)
	 */
	public boolean onPreDelete(PreDeleteEvent arg0) {
		if (arg0.getEntity() instanceof ABaseBean && !(arg0.getEntity() instanceof IHistoryEntity)) {
			LOGGER.debug(" :onDelete: Add deleted and deleted by values");
		    ABaseBean bean = (ABaseBean)arg0.getEntity();
		    bean.setDeleted(new java.util.Date());
		    bean.setDeletedBy(AuthenticationServiceDelegate.getCurrentUserName());
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
