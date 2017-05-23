package ee.agri.alkor.web.client.form;

import com.google.gwt.user.client.History;

/**
 * Vale sisselogimise vorm, avatav puuduva kasutajanime puhul
 *
 * @author martin
 */
public class UserNameErrorForm extends LoginForm {

   public static String getKey() {
      return "LoginErrorPage3";
   }

   public UserNameErrorForm() {
      super(LoginForm.NO_USER);
      History.newItem(getKey());
   }

}
