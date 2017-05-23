package ee.agri.alkor.web.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AuthInfoServiceAsync {

	void getUserInfo(AsyncCallback callback) ;
   
   void invalidateSession(boolean keepUser, AsyncCallback callback);
   
   void isSessionValid(AsyncCallback callback);

}
