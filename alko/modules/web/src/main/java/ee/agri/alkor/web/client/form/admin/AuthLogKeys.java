package ee.agri.alkor.web.client.form.admin;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface AuthLogKeys extends ConstantsWithLookup {

	/**
	 * Methods associated with string constants by gwt on runtime
	 * @return
	 */

	public static final String DATE_BETWEEN = "dateBetween";

	String start_date();
	String end_date();
	String userFullName();
	String dateBetween();
}
