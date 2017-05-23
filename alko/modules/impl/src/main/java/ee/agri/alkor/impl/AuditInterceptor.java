package ee.agri.alkor.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.CallbackException;
import org.hibernate.EntityMode;
import org.hibernate.Interceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.history.IHistoryEntity;
import ee.agri.alkor.service.AuthenticationServiceDelegate;

/**
 *  Hibernate Interceptor for auditing.
 *
 * @author suisalu
 *
 */

public class AuditInterceptor
	implements  Interceptor, Serializable {


	private static final long serialVersionUID = 1L;


	public AuditInterceptor() {
		super();
	}


	  /**
	   *
	   * @param entity
	   * @param id
	   * @param currentState
	   * @param previousState
	   * @param propertyNames
	   * @param types
	   *
	   * @return boolean
	   *
	   * @throws CallbackException
	   */
	  public boolean onFlushDirty(Object entity, java.io.Serializable id, Object[] currentState, Object[] previousState,
	    String[] propertyNames, Type[] types) throws CallbackException {
	    boolean callback = false;

	    if (entity instanceof ABaseBean && !(entity instanceof IHistoryEntity)) {
	      for (int i = 0; i < propertyNames.length; i++) {
	        if (ABaseBean.MODIFIED.equals(propertyNames[i])) {
	          currentState[i] = new Date();
	          callback = true;
	        }

	        if (ABaseBean.MODIFIED_BY.equals(propertyNames[i])) {
	          currentState[i] = AuthenticationServiceDelegate
	          	.getCurrentUserName();
	          callback = true;
	        }
	      }
	    }

	    return callback;
	  }
	  /**
	   * TODO -
	   *
	   * @param entity
	   * @param id
	   * @param state
	   * @param propertyNames
	   * @param types
	   *
	   * @return
	   *
	   * @throws CallbackException
	   */
	  public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types)
	    throws CallbackException {
	    boolean callback = false;

	    if (entity instanceof ABaseBean && !(entity instanceof IHistoryEntity)) {
	      for (int i = 0; i < propertyNames.length; i++) {
	        if (ABaseBean.CREATED.equals(propertyNames[i])) {
	          state[i] = new java.util.Date();
	          callback = true;
	        }
	        // Kui kirje looja pole ette antud
	        if (ABaseBean.CREATED_BY.equals(propertyNames[i])
	        		&& (state[i] == null)) {
	          state[i] = AuthenticationServiceDelegate
	          	.getCurrentUserName();
	          callback = true;
	        }
	      }
	    }

	    return callback;
	  }
		public void onDelete(
				Object entity,
				Serializable id,
				Object[] state,
				String[] propertyNames,
				Type[] types) {
		    if (entity instanceof ABaseBean && !(entity instanceof IHistoryEntity)) {
			      ((ABaseBean)entity).setDeleted(new Date());
			      ((ABaseBean)entity).setDeletedBy(AuthenticationServiceDelegate
				          	.getCurrentUserName());
			}
		}


		public boolean onLoad(
				Object entity,
				Serializable id,
				Object[] state,
				String[] propertyNames,
				Type[] types) {
			return false;
		}


		public void postFlush(Iterator entities) {}
		public void preFlush(Iterator entities) {}

		public Boolean isTransient(Object entity) {
			return null;
		}

		public Object instantiate(String entityName, EntityMode entityMode, Serializable id) {
			return null;
		}

		public int[] findDirty(Object entity,
				Serializable id,
				Object[] currentState,
				Object[] previousState,
				String[] propertyNames,
				Type[] types) {
			return null;
		}

		public String getEntityName(Object object) {
			return null;
		}

		public Object getEntity(String entityName, Serializable id) {
			return null;
		}

		public void afterTransactionBegin(Transaction tx) {}
		public void afterTransactionCompletion(Transaction tx) {}
		public void beforeTransactionCompletion(Transaction tx) {}

		public String onPrepareStatement(String sql) {
			return sql;
		}

		public void onCollectionRemove(Object collection, Serializable key) throws CallbackException {}

		public void onCollectionRecreate(Object collection, Serializable key) throws CallbackException {}

		public void onCollectionUpdate(Object collection, Serializable key) throws CallbackException {}


}
