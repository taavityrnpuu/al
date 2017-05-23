/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;

/**
 * <i>OFButton = OpenFormButton</i>. Erinupp, mis kasutatakse vormi avamiseks. Nuppu omaduseks on vormi laadimise teade väljastamine
 * peaaknale.
 *
 * @author viktorb
 */
public class OFButton extends Button {

   /**
    * Loob vormi avatava nuppu.
    *
    * @param title -
    *           nuppu tekst.
    * @param listener -
    *           nuppu kuular.
    *
    */
   public OFButton(String title, ClickListener listener) {
      super(title, listener);
   }

   /**
    * Loob vormi avatava nuppu.
    *
    * @param title -
    *           nuppu tekst.
    * @param form -
    *           avatav vorm.
    * uses OFButton(String, Clicklistener)
    */
   public OFButton(String title, Form form) {
      this(title, new OpenFormListener(form));
   }

   public void onBrowserEvent(Event event) {
      UIutils.setLoadMessageVisible(true);
      //release focus, otherwise method is called over and over and loadMessage will be made visible
      this.setFocus(false);
      super.onBrowserEvent(event);
   }
   
   

}
