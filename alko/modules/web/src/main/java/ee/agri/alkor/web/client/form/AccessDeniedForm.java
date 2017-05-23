package ee.agri.alkor.web.client.form;

import com.google.gwt.user.client.History;

/**
 * Vale sisselogimise vorm, avatav sisestatud vale kasutajanimi/parooli puhul.
 * 
 * @author viktorb
 */
public class AccessDeniedForm extends LoginForm {
   
   public static String getKey() {
      return "AccessDeniedPage";
   }
   
   public AccessDeniedForm() {
      super(LoginForm.ACCESS_DENIED);
      History.newItem(getKey());
   }

}
