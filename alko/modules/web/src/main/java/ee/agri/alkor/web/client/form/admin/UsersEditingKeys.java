package ee.agri.alkor.web.client.form.admin;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface UsersEditingKeys extends ConstantsWithLookup {

	/**
	 * Methods associated with string constants by gwt on runtime
	 * @return
	 */
	String person_registrationId();
	String person_firstName();
	String person_lastName();
	String name();
	String password();
   
   String formTitle();
   String password2();
   String email();
   String back();
   String save();
   String yes();
   String no();
   String eraseUser();

   String passwordsDiffer();
   String dataChanged();
   String dataAdded();
   String confirm();
   String deleted();
   String userExists();
   String active();
	
}
