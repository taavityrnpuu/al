package ee.agri.alkor.web.client.form;

import com.google.gwt.user.client.History;

/**
 * Vale sisselogimise vorm, avatav puuduva kasutajanime puhul
 *
 * @author martin
 */
public class NoRoleForm extends LoginForm {

   public static String getKey() {
      return "LoginErrorPage5";
   }

   public NoRoleForm() {
      super(LoginForm.NO_ROLE);
      History.newItem(getKey());
   }

}
