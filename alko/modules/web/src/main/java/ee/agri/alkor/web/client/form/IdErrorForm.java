package ee.agri.alkor.web.client.form;

import com.google.gwt.user.client.History;

/**
 * Vale sisselogimise vorm, avatav puuduva kasutajanime puhul
 *
 * @author martin
 */
public class IdErrorForm extends LoginForm {

   public static String getKey() {
      return "LoginErrorPage4";
   }

   public IdErrorForm() {
      super(LoginForm.NO_ID);
      History.newItem(getKey());
   }

}
