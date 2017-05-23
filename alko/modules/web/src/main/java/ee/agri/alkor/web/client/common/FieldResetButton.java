/**
 *
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;

/**
 * Resets the field that is given in the constructor
 * @author kaupo
 *
 */
public class FieldResetButton extends Button {

	/**
	 *
	 */
	private FieldResetButton() {
	}

	/**
	 * @param name name that will be put on the button
	 * @param form the form whose data will be altered
	 * @param formName the form name which will be refreshed
	 * @param fieldName the field that will be cleared
	 */
	public FieldResetButton(String name, final Form form, final String formName, final String fieldName) {
		super(name);
		this.addClickListener(new ClickListener() {
			public void onClick(Widget arg0) {
				form.setDataFromFormFields(formName);
				form.getData().setProperty(fieldName, null);
				form.setFormFieldsFromData(formName);
			}
		});
	}


}
