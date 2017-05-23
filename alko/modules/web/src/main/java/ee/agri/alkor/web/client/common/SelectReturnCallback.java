package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.SimplePanel;

import ee.agri.alkor.web.client.dto.ABaseDTOMap;
/**
 * Callback class for returning to
 * inital form with data.
 *
 * @author suisalu
 *
 */
public class SelectReturnCallback {

	private final Form returnForm;
	/**
	 * Subform name from where we came
	 * and wanted to change data.
	 */
	private final String subFormName;
	/**
	 * Model data property name.
	 */
	private final String selectionProperty;

	private ABaseDTOMap dtoData;

	public SelectReturnCallback(Form returnForm, String subFormName, String selectionProperty) {
		super();
		this.returnForm = returnForm;
		this.subFormName = subFormName;
		this.selectionProperty = selectionProperty;
	}

	public void setSelection(ABaseDTOMap data) {
	   System.out.println("#################");
	   System.out.println(data);
	   System.out.println("#################");
		this.returnForm.getData().setProperty(selectionProperty, data);
		this.returnForm.setFormFieldsFromData(this.subFormName);
	}

	public Form getReturnForm() { return this.returnForm; }

	public String getSubForm() {
		return subFormName;
	}

	public String getSelectionProperty() {
		return selectionProperty;
	}

	public void onReturn(){

	}

	public void returnToParentWithData(ABaseDTOMap data, Form openForm) {
		setDtoData(data);
		setSelection(data);
		SimplePanel main = (SimplePanel) openForm.getParent();
		main.clear();
		returnForm.clearInfo();
		main.add(returnForm);
		onReturn();
	}

	public void setDtoData(ABaseDTOMap data) {
		this.dtoData = data;
	}

	public ABaseDTOMap getDtoData() {
		return dtoData;
	}

}
