/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;

/**
 * Return listener after data selection.
 * Executes callback method on return form
 * and shows it.
 *
 * @author suisalu
 *
 */
public class SelectReturnListener implements ClickListener {

	private final Form currForm;

	private final SelectReturnCallback callback;

	private ABaseDTOMap data;
	
	public void onClickWithoutClear(Widget sender) {
		if(callback == null) return;
		callback.getReturnForm().setLockDataFromFormFields(callback.getSubForm());
		//callback.setSelection(data);
		if(callback.getReturnForm() instanceof ApplicationForm){
			this.callback.onReturn();
		}

		SimplePanel main = (SimplePanel) currForm.getParent();
		main.clear();
		main.add(callback.getReturnForm());
	}

	public void onClick(Widget sender) {
		if(callback == null) return;
		callback.getReturnForm().setLockDataFromFormFields(callback.getSubForm());
		callback.setSelection(data);
		if(callback.getReturnForm() instanceof ApplicationForm){
			this.callback.onReturn();
		}

		SimplePanel main = (SimplePanel) currForm.getParent();
		main.clear();
		main.add(callback.getReturnForm());
	}

	public SelectReturnListener(Form currForm,
			ABaseDTOMap data) {
		super();
		this.currForm = currForm;
		this.callback = currForm.getSelectReturnCallback();
		this.data = data;
	}
	
	public void setData(ABaseDTOMap data)
	{
		this.data = data;
	}

}
