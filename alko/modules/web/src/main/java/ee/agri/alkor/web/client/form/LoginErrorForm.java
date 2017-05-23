package ee.agri.alkor.web.client.form;

import com.google.gwt.user.client.History;

/**
 * Vale sisselogimise vorm, avatav sisestatud vale
 * kasutajanimi/parooli/sertifikaadi puhul.
 *
 * @author viktorb
 */
public class LoginErrorForm extends LoginForm {

   public static String getKey() {
      return "LoginErrorPage";
   }

   public LoginErrorForm() {
      super(LoginForm.BAD_CREDS);
      History.newItem(getKey());
   }

}
