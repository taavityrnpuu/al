package ee.agri.alkor.web.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface XteeQueryServiceAsync {

	void makeBusinessRegisterQuery(String name, 
			String registrationId,  AsyncCallback callback) ;

	void makeMTRAndCustomsQuery(String registrationId,  AsyncCallback callback) ;

}
