/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.MainPanel;

/**
 * Vormi avamise kuular.
 *
 * @author viktorb
 *
 * why deprecated?? what to use instead?
 */
public class OpenFormListener implements ClickListener {

   private Form openForm;

   /**
    * Loob vormi avamise kuulari.
    *
    * @param currForm
    *           praegune avatud vorm.
    * @param openForm
    *           avatav vorm.
    */
   public OpenFormListener(Form openForm) {
      this.openForm = openForm;
   }

   public void onClick(Widget sender) {
      SimplePanel body = MainPanel.getBody();
      Form form = (Form) body.getWidget();
      body.clear();
      if (!openForm.isInitialised()) {
    	  try {
        	  openForm.init();
          } catch(Exception e) {
        	  e.printStackTrace();
        	  form.setError(e.toString());
          }
      }
      openForm.clearErrors();

      body.add(openForm);
   }

}
