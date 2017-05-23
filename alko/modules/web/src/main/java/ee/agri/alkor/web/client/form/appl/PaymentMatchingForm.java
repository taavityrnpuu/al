/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.Cookies;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.OpenFormListener;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.PaymentMatchingLogMap;
import ee.agri.alkor.web.client.form.EnterpriseDetails;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Laekumise sidumise taotlusega vorm.
 * 
 * @author viktorb, kparmas
 */
public class PaymentMatchingForm extends Form implements CacheListener {

	private ListBox tax;
	private Button save;

	private static final String CHANGE_FORM = "changeForm";

	/**
	 * Loob taotlusega laekumise sidumise vormi.
	 * 
	 * @param parent
	 *            vanem paneel.
	 */
	public PaymentMatchingForm(Form parent) {
		super();
		this.parent = parent;
	}

	public PaymentMatchingForm(Form parent, ApplicationMap map) {
		this(parent);
		refreshApplicant(map);
		setData(map);
	}

	public PaymentMatchingForm(SelectReturnCallback callback) {
		super(callback);
	}

	public Object getConstantsWithLookup() {
		return GWT.create(ApplicationFormMessages.class);
	}

	public void init() {
		super.init();
		Label title = new Label("Riigilõivu sidumine taotlusega");
		title.setStyleName("Title");
		ServiceContext.getInstance().addCacheListener(
				ServiceContext.REGISTRY_TAX, this);

		final LogTable resultTable = new LogTable();
		resultTable.resetRows();

		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setText(0, 0, getLabel(ApplicationMap.NR));
		form.setText(1, 0, getLabel(ApplicationMap.APPLICANT_NAME)); // "Taotleja:"
		form.setText(2, 0, getLabel(ApplicationMap.APPLICANT_BCODE));// "Äriregistrikood:"
		form.setText(3, 0, getLabel(ApplicationMap.APPLICANT_BALANCE));// Taotleja
		// saldo:
		form.setText(4, 0, getLabel(ApplicationMap.REGISTRY_TAX_RATE)); // "Riigilõivu
		// suurus:"
		form.setWidget(4, 1, new Image("images/t2rn.gif"));
		form.setText(
				5,
				0,
				"NB! Laekumise sidumise salvestamisel vähendatakse taotleja saldot riigilõivu määra võrra.");
		form.setText(3, 3, "EUR");
		List disabled = new ArrayList();

		TextBox box = new TextBox();
		disabled.add(box);
		form.setWidget(0, 2, addFormField(CHANGE_FORM, ApplicationMap.NR, box));
		box = new TextBox();
		disabled.add(box);
		form.setWidget(1, 2,
				addFormField(CHANGE_FORM, ApplicationMap.APPLICANT_NAME, box));
		box = new TextBox();
		disabled.add(box);
		form.setWidget(2, 2,
				addFormField(CHANGE_FORM, ApplicationMap.APPLICANT_BCODE, box));
		box = new TextBox();
		disabled.add(box);

		// if balance is null change balance to string::0
		if (getData().getProperty(ApplicationMap.APPLICANT_BALANCE) == null) {
			getData().setProperty(ApplicationMap.APPLICANT_BALANCE, "0");
		}
		form.setWidget(
				3,
				2,
				addFormField(CHANGE_FORM, ApplicationMap.APPLICANT_BALANCE, box));
		tax = new ListBox();
		tax.setWidth("100%");
		form.setWidget(
				4,
				2,
				addFormField(CHANGE_FORM,
						ApplicationMap.REGISTRY_TAX_RATE_CODE, tax, null, null,
						Validators.REQUIRED));
		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		for (int row = 0, col = 0; row <= 4; row++) {
			cellFormatter.setStyleName(row, col, "Label");
			cellFormatter.setHorizontalAlignment(row, col,
					HasHorizontalAlignment.ALIGN_RIGHT);
		}
		cellFormatter.setStyleName(3, 3, "Label");
		cellFormatter.setWidth(0, 4, "100%");
		cellFormatter.setColSpan(5, 0, 5);
		form.getCellFormatter().setVisible(4, 0, false);
		form.getCellFormatter().setVisible(4, 1, false);
		form.getCellFormatter().setVisible(4, 2, false);
		form.getCellFormatter().setVisible(4, 3, false);
		form.getCellFormatter().setVisible(5, 0, false);

		Label resultTableTitle = new Label("Riigilõivu logi");
		resultTableTitle.setStyleName("Title");

		SimplePanel greenLine = new SimplePanel();
		greenLine.setStyleName("Left");
		greenLine.setHeight("15px");

		// Buttons
		HorizontalPanel buttons = new HorizontalPanel();
		// back button
		Button back = new Button("Tagasi", new OpenFormListener(parent));

		// save button
		save = new Button("Salvesta");
		save.addClickListener(new ClickListener() {
			public void onClick(Widget arg0) {
				ApplicationMap map = (ApplicationMap) parent.getData();
				String rl = (String) map
						.getProperty(ApplicationMap.LATEST_PAYMENT);
				if (rl == null || rl == ""){
					
				} else {
					setError("Riigilõiv on juba korra maha võetud!");
					return;
				}
				String msg = Cookies.getCookie("RL");
				if (msg.toString() == "TRUE") {
					Cookies.setCookie("MyCookie", msg);
					setError("Riigilõiv on juba korra maha võetud!");
					return;
				}
				clearErrors();
				checkForErrors(
						ApplicationMap.REGISTRY_TAX_RATE_CODE,
						getFormField(CHANGE_FORM,
								ApplicationMap.REGISTRY_TAX_RATE_CODE));
				if (hasErrors()) {
					showErrors();
				} else {
					ServiceContext
							.getInstance()
							.getRegistryService()
							.processPaymentMatching(
									(ApplicationMap) cleanDataBeforeSave(getData()),
									tax.getItemText(tax.getSelectedIndex())
											.toString(), new AsyncCallback() {
										public void onSuccess(Object arg0) {
											Cookies.setCookie("RL", "TRUE");
											setData((ApplicationMap) arg0);
											setFormFieldsFromData(PaymentMatchingForm.this.CHANGE_FORM);
											parent.setData(getData());
											returnToParent();
										}

										public void onFailure(Throwable arg0) {
											setError("Viga riigilõivu mahaarvestamisel! Ettevõttel pole piisav saldo.");
										}
									});

				}
			}
		});
		back.setWidth("9em");
		save.setWidth("9em");
		buttons.add(UIutils.createSpacer(
				UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		buttons.add(back);
		buttons.add(UIutils.createSpacer(6, 1));
		//buttons.add(save);
		// Buttons end

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(800, 1));
		main.setWidget(2, 0, form);
		main.setWidget(3, 0, buttons);
		main.setWidget(4, 0, resultTableTitle);
		main.setWidget(5, 0, resultTable);

		cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setHorizontalAlignment(3, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setColSpan(0, 0, 2);
		setFormFieldsFromData(CHANGE_FORM);

		// disable the fields that cant be changed
		for (int i = 0; i < disabled.size(); i++) {
			((TextBox) disabled.get(i)).setEnabled(false);
		}
		askClassificators();
		setButtonsEnabled();
		initWidget(main);
	}

	private class LogTable extends FlexTable implements AsyncCallback {

		protected List rows = new ArrayList();

		public LogTable() {
			super();
			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, getLabel(PaymentMatchingLogMap.CREATED));
			this.setText(0, 2, getLabel(PaymentMatchingLogMap.CREATEDBY));
			this.setText(0, 3, getLabel(PaymentMatchingLogMap.AMOUNT));
			this.setText(0, 4, getLabel(PaymentMatchingLogMap.ENTERPRISE));
			this.setText(1, 1, "Sooritan otsingut...");

		}

		public void show() {

			while (this.getRowCount() > 1) {
				this.removeRow(1);
			}

			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				Object row = it.next();
				if (row != null)
					renderRow(i++, (PaymentMatchingLogMap) row);
			}
		}

		private void renderRow(final int row, final PaymentMatchingLogMap data) {

			if ((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");
			
			this.setText(row, 0, Integer.toString(row));
			this.setText(row, 1, data.getText(PaymentMatchingLogMap.CREATED));
			this.setText(row, 2, data.getText(PaymentMatchingLogMap.CREATEDBY));
			this.setText(row, 3, data.getText(PaymentMatchingLogMap.AMOUNT));
			//TODO --- See on enterprise ID praegu.
			//final EnterpriseMap enter = null;
			ServiceContext
			.getInstance()
			.getRegistryService()
			.findEnterprise(
					Long.parseLong(data.getText(PaymentMatchingLogMap.ENTERPRISE)),
					new AsyncCallback() {
						public void onFailure(
								Throwable arg0) {
							setError("Jama, ei saa ettevõte nimetust kätte");
						}

						public void onSuccess(
								Object arg0) {
							EnterpriseMap enter = (EnterpriseMap) arg0;
							String enterpriseName = enter.getText(EnterpriseMap.NAME);
							Cookies.setCookie("ENT", enterpriseName);
							LogTable.this.setText(row, 4, enterpriseName.toString());
						}
					});
			
			

		}

		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("Log table failure: " + caught);
		}

		public void onSuccess(Object result) {
			if (result == null) {
				return;
			}
			this.rows = (List) result;
			show();
		}

		public void resetRows() {
			findPaymentMatchingLogsByApplicationId(this);
		}

		public void removeRow(Object log) {
			this.rows.remove(log);
		}
	}

	/**
	 * Refreshes applicant object and if successful, updates data on form
	 * 
	 * @param map
	 */
	protected void refreshApplicant(final ApplicationMap map) {
		ServiceContext
				.getInstance()
				.getRegistryService()
				.findEnterprise(
						new Long(map.getProperty(ApplicationMap.APPLICANT_ID)
								.toString()), new AsyncCallback() {

							public void onFailure(Throwable arg0) {
								// TODO Auto-generated method stub

							}

							public void onSuccess(Object arg0) {
								map.setProperty(ApplicationMap.APPLICANT, arg0);
								setData(map);
								setFormFieldsFromData(CHANGE_FORM);
							}

						});
	}

	private void setButtonsEnabled() {
		System.out.println("setButtonsEnabled");
		System.out.println("state code:"
				+ getData().getProperty(ApplicationMap.STATE_CODE));
		save.setEnabled(!ApplicationMap.STATE_CODE_ENTERED.equals(getData()
				.getProperty(ApplicationMap.STATE_CODE)));
	}

	protected void findPaymentMatchingLogsByproduct(AsyncCallback asyncCallback) {
		ServiceContext
				.getInstance()
				.getRegistryService()
				.findPaymentMatchingLogsByproduct(this.getProductId(),
						asyncCallback);
	}

	protected void findPaymentMatchingLogsByApplicationId(
			AsyncCallback asyncCallback) {
		ServiceContext
				.getInstance()
				.getRegistryService()
				.findPaymentMatchingLogsByApplicationId(
						this.getApplicationId(), asyncCallback);
	}

	protected Long getProductId() {
		return new Long(Long.parseLong(getData().getProperty(
				ApplicationMap.PRODUCT_ID).toString()));
	}

	protected Long getApplicationId() {
		return new Long(Long.parseLong(getData().getProperty(ApplicationMap.ID)
				.toString()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ee.agri.alkor.web.client.CacheListener#avail(java.lang.String,
	 * java.lang.Object)
	 */
	public void avail(String key, Object value) {
		if (value instanceof Throwable)
			Window.alert(value.toString());
		else if (key.equals(ServiceContext.REGISTRY_TAX)) {
			makeClassSelectionList(CHANGE_FORM,
					ApplicationMap.REGISTRY_TAX_RATE_CODE, (List) value);
		}

	}

	public void askClassificators() {
		List taxes = (List) ServiceContext.getInstance().getCached(
				ServiceContext.REGISTRY_TAX);
		if (taxes != null) {
			makeClassSelectionList(CHANGE_FORM,
					ApplicationMap.REGISTRY_TAX_RATE_CODE, taxes);
		}
	}

}
