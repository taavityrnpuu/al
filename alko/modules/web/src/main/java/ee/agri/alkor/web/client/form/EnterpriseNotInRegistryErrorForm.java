package ee.agri.alkor.web.client.form;

import com.google.gwt.user.client.History;

/**
 * Ettevõtte registrist puudumisel kuvatav vea leht
 * @author rolandv
 *
 */
public class EnterpriseNotInRegistryErrorForm extends LoginForm 
{
	
	public static String getKey() 
	{
		return "LoginErrorPage6";
	}

   public EnterpriseNotInRegistryErrorForm() 
   {
      super(LoginForm.NO_ENTERPRISE);
      History.newItem(getKey());
   }
}
