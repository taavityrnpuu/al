package ee.agri.alkor.web.client.form.appl;


import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.DocumentsForm;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
/**
 *
 * @author ivar
 *
 */
public class ApplicationDocumentsForm
extends DocumentsForm {


   public ApplicationDocumentsForm(Form returnForm) {
      super("Dokumendi lisamine taotlusele",  returnForm);
   }

   public ApplicationDocumentsForm(Form returnForm, boolean readOnly) {
      super("Dokumendi lisamine taotlusele",  returnForm, readOnly);
   }

   @Override
   protected String getApplicationNr() {
      ApplicationMap appl = (ApplicationMap)getData();
      return appl.getText(ApplicationMap.NR);
   }

   @Override
   protected String getApplicationId() {
      return getData().getText(ApplicationMap.ID);
   }

   @Override
   protected String getDocumentType() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   protected void findDocuments(AsyncCallback callBack) {
      try {
//         if (parent != null && parent instanceof XTeeForm) {
//            ServiceContext.getInstance().getRegistryService().findApplicationDocumentsFromUser(
//                  new Long(getApplicationId()), callBack);
//         } else {
            ServiceContext.getInstance().getRegistryService().findApplicationDocuments(
                  new Long(getApplicationId()), callBack);
//         }
      } catch (NumberFormatException nfe) {
        //setError("Süsteemi viga!");
      }
   }
   
   protected void findDocumentsPublic(AsyncCallback callBack) {
	      try {
//	         if (parent != null && parent instanceof XTeeForm) {
//	            ServiceContext.getInstance().getRegistryService().findApplicationDocumentsFromUser(
//	                  new Long(getApplicationId()), callBack);
//	         } else {
	            ServiceContext.getInstance().getRegistryService().findApplicationDocumentsPublic(
	                  new Long(getApplicationId()), callBack);
//	         }
	      } catch (NumberFormatException nfe) {
	         //setError("Süsteemi viga!");
	      }
	   }
   
   protected void findDocumentsArchived(AsyncCallback callBack) {
	      try {
//	         if (parent != null && parent instanceof XTeeForm) {
//	            ServiceContext.getInstance().getRegistryService().findApplicationDocumentsFromUser(
//	                  new Long(getApplicationId()), callBack);
//	         } else {
	            ServiceContext.getInstance().getRegistryService().findApplicationDocumentsArchived(
	                  new Long(getApplicationId()), callBack);
//	         }
	      } catch (NumberFormatException nfe) {
	         //setError("Süsteemi viga!");
	      }
	   }

   @Override
   protected Long getProductId() {
      return null;
   }


}
