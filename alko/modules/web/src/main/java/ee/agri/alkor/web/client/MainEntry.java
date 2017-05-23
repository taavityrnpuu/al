package ee.agri.alkor.web.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventPreview;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

import ee.agri.alkor.web.client.dto.UserInfo;

public class MainEntry implements EntryPoint,EventPreview {

   public void onModuleLoad() {
	   ServiceContext.getInstance().fillAllCacheValues();
	   System.out.println("onModuleLoad");
	   DOM.addEventPreview(this);
      ServiceContext.getInstance().getAuthService().getUserInfo(new AsyncCallback() {
         public void onFailure(Throwable caught) {
         }

         public void onSuccess(Object result) {
            ServiceContext.getInstance().setUserInfo((UserInfo) result);
            ServiceContext.getInstance().getRegistryService().getCanEditEnterprise(new AsyncCallback() {

	     			public void onFailure(Throwable caught) {

	     			}

	     			public void onSuccess(Object result) {
	     				String val = String.valueOf(result);			
	     				boolean canEditEnterprise = ((Boolean) result)
	     						.booleanValue();
	     				RootPanel.get().add(new MainPanel(canEditEnterprise));
	     				
	     				
	     			}
	     		});
         }
      });
   }

   /**
    * If user is authenticated, checks session validity
    * If session is expired, event is cancelled
    */
	public boolean onEventPreview(Event arg0) {
		 UserInfo uInfo = ServiceContext.getInstance().getUserInfo();
		   if (uInfo != null && "anonymousUser".equals(uInfo.getName())){
			   return true;
		   }
		switch(DOM.eventGetType(arg0)){
		case Event.ONCLICK:
			isSessionValid();
			uInfo = ServiceContext.getInstance().getUserInfo();
			if (uInfo == null || "anonymousUser".equals(uInfo.getName())){
				   return false;
			}

		}
		return true;
	}

	/**
	 * Calls session validity check and if found expired, returns user to homepage
	 */
	public void isSessionValid(){

		ServiceContext.getInstance().getAuthService().isSessionValid(new AsyncCallback() {

	         public void onFailure(Throwable caught) {
	         }

	         public void onSuccess(Object result) {
   	        	if(result == null){
   
   	        		ServiceContext.getInstance().setUserInfo((UserInfo) result);
   	        		RootPanel.get().clear();
   	        		ServiceContext.getInstance().getRegistryService().getCanEditEnterprise(new AsyncCallback() {

   	     			public void onFailure(Throwable caught) {

   	     			}

   	     			public void onSuccess(Object result) {
   	     				String val = String.valueOf(result);			
   	     				boolean canEditEnterprise = ((Boolean) result)
   	     						.booleanValue();
   	     				RootPanel.get().add(new MainPanel(canEditEnterprise));
   	     				
   	     				
   	     			}
   	     		});
   	        		
   	        	}
	         }

	      });
	}



}
