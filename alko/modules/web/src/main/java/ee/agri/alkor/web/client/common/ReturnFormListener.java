/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Return to previous form listener.
 *
 * @author suisalu
 */
public abstract class ReturnFormListener implements ClickListener {

	private Form currForm;

	private Form openForm;

	/**
	 *
	 * @param currForm
	 *            praegune avatud vorm.
	 * @param openForm
	 *            avatav vorm.
	 */
	public ReturnFormListener(Form currForm, Form openForm) {
		this.currForm = currForm;
		this.openForm = openForm;
	}

	public void onClick(Widget sender) {
		onReturn();
		SimplePanel main = (SimplePanel) currForm.getParent();
		main.clear();
		openForm.clearInfo();
		main.add(openForm);
		// openForm.onReturn();
	}

	public abstract void onReturn();

	public Form getCurrForm() {
		return currForm;
	}

	public void setCurrForm(Form currForm) {
		this.currForm = currForm;
	}

	public Form getOpenForm() {
		return openForm;
	}

	public void setOpenForm(Form openForm) {
		this.openForm = openForm;
	}

}
