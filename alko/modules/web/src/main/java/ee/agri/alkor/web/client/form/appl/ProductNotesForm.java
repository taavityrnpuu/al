/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Tootele märkuse lisamise vorm.
 * 
 * @author viktorb
 */
public class ProductNotesForm extends Form {

	/**
	 * Tootele märkuse lisamise vormi loomine.
	 * 
	 * @param parent
	 *           vanem paneel.
	 */
	private TextArea text;

	private static final String FORM = "form";
	private boolean isReadOnly;
	private boolean canSave;

	public ProductNotesForm(Form parent) {
		super();
		this.parent = parent;
	}

	public ProductNotesForm(Form parent, boolean isReadOnly, boolean canSave) {
		this(parent);
		this.isReadOnly = isReadOnly;
		this.canSave = canSave;
	}

	public ProductNotesForm(Form parent, ABaseDTOMap data) {
		super();
		this.parent = parent;
		setData(data);
	}

	public Object getConstantsWithLookup() {
		return GWT.create(ProductsFormKeys.class);
	}

	public void init() {
		super.init();

		Label title = new Label(getLabel("productNoteTableTitle"));// Märkuse
																						// lisamine
																						// tootele");
		title.setStyleName("Title");

		final FlexTable form = new FlexTable();
		form.setStyleName("Form");

		text = new TextArea();
		text.setSize("700px", "100px");
		form.setWidget(0, 0, addFormField(FORM, ProductMap.NOTES, text));

		HorizontalPanel buttons = new HorizontalPanel();
		Button back = new Button(getLabel("buttonBack"), new ReturnFormListener(this, parent) {
			public void onReturn() {
			}
		});

		Button save = new Button(getLabel("buttonSave"), new ClickListener() {

			public void onClick(Widget w) {
				parent.getData().setProperty(ProductMap.NOTES, text.getText());
				ProductMap product = (ProductMap) parent.getData();
				if (canSave) {
					ServiceContext.getInstance().getRegistryService().
								saveOrUpdate((ProductMap) cleanDataBeforeSave(product), new AsyncCallback() {

									public void onFailure(Throwable error) {
										setError(error.toString());
									}

									public void onSuccess(Object result) {
										parent.setData((ProductMap) result);
										returnToProductsForm();
										updateApplicationForm();
									}
								});
				} else {
					returnToProductsForm();
				}
			}
		});
		back.setWidth("9em");
		save.setWidth("9em");
		buttons.add(UIutils.createSpacer(
					UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
					UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		buttons.add(back);
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })
					|| (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && !isReadOnly)) {
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(save);
		}

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(800, 1));
		main.setWidget(2, 0, form);
		main.setWidget(3, 0, buttons);
		FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setColSpan(0, 0, 2);
		setFormFieldsFromData(FORM);
		initWidget(main);
	}

	void returnToProductsForm() {
		if (parent instanceof ProductsForm) {
			SimplePanel main = (SimplePanel) getParent();
			main.clear();
			main.add(parent);
		}
	}

	void updateApplicationForm() {
		if (parent instanceof ProductsForm) {
			SelectReturnCallback rcb = ((ProductsForm) parent).getSelectReturnCallback();

			if (rcb.getReturnForm() instanceof ApplicationForm) {
				rcb.setSelection(getData());
			}

		}
	}

	// private class NoteSavingListener implements ClickListener {
	//
	// ProductsForm form;
	//
	// public NoteSavingListener(Form f) {
	// form = (ProductsForm)f;
	// }
	// public void onClick(Widget sender) {
	// String txt = text.getText();
	// Window.alert("salvestatud tekst: "+txt);
	// }
	// }
}
