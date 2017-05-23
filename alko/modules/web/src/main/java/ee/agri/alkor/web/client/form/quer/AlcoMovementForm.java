/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.quer;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlowPanel;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.OpenFormListener;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.AMSFilter;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.ReportListViewMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.form.appl.ProductsForm;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Alkoholi liikumise päringu vorm.
 * 
 * @author viktorb
 */
public class AlcoMovementForm extends Form implements ClickListener, CacheListener {
	
	public final TextBox tb_reg_nr = new TextBox();
	public final TextBox tb_report_id = new TextBox();
	public final Label label_report_id = new Label();

	public final boolean isEIT() {
		return UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP });
	}

	public static final String getKey() {
		return "querAlcoMovementForm";
	}

	// Otsingu parameetrite sisestus-vorm.
	private static final String SEARCH_FORM = "searchForm";

	private AlcoMovementTable searchResultsTable;

	/**
	 * Vormi loomine.
	 */
	public AlcoMovementForm() {
		super();
		setData(new ReportListViewMap());
	}

	public AlcoMovementForm(Form parent) {
		super(parent);
	}

	public Object getConstantsWithLookup() {
		return GWT.create(Messages.class);
	}

	public void init() {
		super.init();

		ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_TYPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.MONTH, this);

		searchResultsTable = new AlcoMovementTable();

		Label title = new Label(getLabel("alcoMovementFormTitle"));
		title.setStyleName("Title");

		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setCellSpacing(1);
		form.setCellPadding(2);

		label_report_id.setText("Aruande id:");
		form.setWidget(0, 0, label_report_id);
		form.setText(1, 0, getLabel("formRegNr"));
		form.setText(2, 0, getLabel("formProductName"));
		form.setText(3, 0, getLabel("formProductType2"));
		form.setText(4, 0, getLabel("formProducerCounty"));
		form.setText(5, 0, getLabel("formOriginCounty"));
		if (!isEIT()) {
			form.setText(6, 0, getLabel("formProducerName"));
			form.setText(7, 0, getLabel("formSenderBCode"));
			form.setText(8, 0, getLabel("formReportSenderName"));
		}
		form.setText(9, 0, getLabel("formReceiverName"));
		form.setText(10, 0, getLabel("formStageName"));
		form.setText(11, 0, getLabel("formStageCounty"));
		form.setText(12, 0, getLabel("formStageCity"));
		form.setText(13, 0, getLabel("formStageStreet"));
		form.setText(14, 0, getLabel("formPartyNr"));
		form.setText(15, 0, getLabel("formCustPackNum"));
		form.setText(16, 0, getLabel("formInsertedFrom"));
		form.setText(17, 0, getLabel("formInsertedTill"));
		form.setText(18, 0, getLabel("formReportPeriod"));
		
		tb_report_id.setEnabled(false);
		form.setWidget(0, 1, addFormField(SEARCH_FORM, AMSFilter.REPORT_ID, tb_report_id, "25em"));
		form.setWidget(1, 1, addFormField(SEARCH_FORM, AMSFilter.REG_NR, tb_reg_nr, "25em"));
		form.setWidget(2, 1, addFormField(SEARCH_FORM, AMSFilter.PRODUCT_NAME, new TextBox(), "25em"));
		form.setWidget(3, 1, addFormField(SEARCH_FORM, AMSFilter.PRODUCT_TYPE_CODE, new ListBox(), "25em"));
		form.setWidget(4, 1, addFormField(SEARCH_FORM, AMSFilter.PRODUCER_COUNTRY_CODE, new ListBox(), "25em"));
		form.setWidget(5, 1, addFormField(SEARCH_FORM, AMSFilter.PRODUCT_ORIGINCOUNTRY_CODE, new ListBox(), "25em"));
		if (!isEIT()) {
			form.setWidget(6, 1, addFormField(SEARCH_FORM, AMSFilter.PRODUCER_NAME, new TextBox(), "25em"));
			form.setWidget(7, 1, addFormField(SEARCH_FORM, AMSFilter.APPLICANT_BCODE, new TextBox(), "25em"));
			form.setWidget(8, 1, addFormField(SEARCH_FORM, AMSFilter.APPLICANT_NAME, new TextBox(), "25em"));
		}
		form.setWidget(9, 1, addFormField(SEARCH_FORM, AMSFilter.RECEIVER_NAME, new TextBox(), "25em"));
		form.setWidget(10, 1, addFormField(SEARCH_FORM, AMSFilter.MPLACE_NAME, new TextBox(), "25em"));
		form.setWidget(11, 1, addFormField(SEARCH_FORM, AMSFilter.MPLACE_DISTRICT, new TextBox(), "25em"));
		form.setWidget(12, 1, addFormField(SEARCH_FORM, AMSFilter.MPLACE_CITY, new TextBox(), "25em"));
		form.setWidget(13, 1, addFormField(SEARCH_FORM, AMSFilter.MPLACE_STREET, new TextBox(), "25em"));
		form.setWidget(14, 1, addFormField(SEARCH_FORM, AMSFilter.PARTI_NR, new TextBox(), "25em"));
		form.setWidget(15, 1, addFormField(SEARCH_FORM, AMSFilter.AMOUNT, new TextBox(), "25em"));
		form.setWidget(16, 1, addFormField(SEARCH_FORM, AMSFilter.START_DATE, new CalendarBox(), "10em"));
		form.setWidget(17, 1, addFormField(SEARCH_FORM, AMSFilter.END_DATE, new CalendarBox(), "10em"));
		
		Widget w1 = addFormField(SEARCH_FORM, AMSFilter.REPORT_PERIOD_YEAR, new TextBox(), "12.5em");
		Widget w2 = addFormField(SEARCH_FORM, AMSFilter.REPORT_PERIOD_MONTH, new ListBox(), "12.5em");
		FlowPanel panel = new FlowPanel();
		panel.add(w1);
		panel.add(w2);
		
		form.setWidget(18, 1, panel);
		form.setWidget(19, 1, UIutils.createSpacer(1, 7));
		UIutils.setTableTextStyled(form);
		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		for (int i = 0; i < 20; i += (i == 15) ? 3 : 1) {	
				cellFormatter.setColSpan(i, 1, 2);			
		}
		for (int i = 0; i < 20; i++) {
			cellFormatter.setHorizontalAlignment(i, 1, HasHorizontalAlignment.ALIGN_LEFT);
		}

		cellFormatter.setColSpan(18,1,2);
		
		HorizontalPanel buttons = new HorizontalPanel();
		Button clearBtn = new Button(getLabel("formButtonClear"), this);
		Button searchBtn = new Button(getLabel("formButtonSearch"), this);
		clearBtn.setWidth("8em");
		searchBtn.setWidth("8em");
		buttons.add(clearBtn);
		buttons.add(UIutils.createSpacer(6, 1));
		buttons.add(searchBtn);
		if (parent != null) {
			Button backToParent = UIutils.createButton(new OpenFormListener(parent), "Tagasi");
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(backToParent);
		}
		form.setWidget(20, 1, buttons);
		cellFormatter.setHorizontalAlignment(20, 1, HasHorizontalAlignment.ALIGN_LEFT);

		Label tableTitle = new Label(getLabel("formTable"));
		tableTitle.setStyleName("Title");

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(700, 1));
		main.setWidget(2, 0, form);
		main.setWidget(3, 0, tableTitle);
		main.setWidget(4, 0, UIutils.createSpacer(1, 20));
		main.setWidget(5, 0, searchResultsTable);
		main.getFlexCellFormatter().setWidth(1, 1, "100%");
		main.getFlexCellFormatter().setWidth(5, 0, "98%");
		main.getFlexCellFormatter().setColSpan(0, 0, 2);
		main.getFlexCellFormatter().setColSpan(3, 0, 2);
		fillListBoxes();
		initWidget(main);
	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable) {
			Window.alert(value.toString());
		} else if (key.equals(ServiceContext.COUNTRIES)) {
			makeClassSelectionList(SEARCH_FORM, AMSFilter.PRODUCER_COUNTRY_CODE, (List) value);
			makeClassSelectionList(SEARCH_FORM, AMSFilter.PRODUCT_ORIGINCOUNTRY_CODE, (List) value);
		} else if (key.equals(ServiceContext.PRODUCT_TYPE)) {
			makeClassSelectionList(SEARCH_FORM, AMSFilter.PRODUCT_TYPE_CODE, (List) value);
		} else if (key.equals(ServiceContext.MONTH)) {
			makeClassSelectionList(SEARCH_FORM, AMSFilter.REPORT_PERIOD_MONTH, (List) value);
		}
	}

	public void onClick(Widget sender) {
		String btnText = ((Button) sender).getText();
		if (getLabel("formButtonClear").equals(btnText)) {
			searchResultsTable.getFilter().reset();
			resetFormFields(SEARCH_FORM);
		} else if (getLabel("formButtonSearch").equals(btnText)) {
			Map searchParam = getFormFieldValues(SEARCH_FORM);
			Object end = searchParam.get(AMSFilter.END_DATE);
			Object start = searchParam.get(AMSFilter.START_DATE);
			if (end != null && start != null) {
				Date endDate = new Date();
				Date startDate = new Date();
				startDate.setDate(Integer.parseInt(((String) start).substring(0, 2)));
				// java.util.Date.before() counts months from 0 to 11
				startDate.setMonth(Integer.parseInt(((String) start).substring(3, 5).equals("12") ? "11" : ((String) start).substring(3, 5)));
				startDate.setYear(Integer.parseInt(((String) start).substring(6)));
				endDate.setDate(Integer.parseInt(((String) end).substring(0, 2)));
				endDate.setMonth(Integer.parseInt(((String) end).substring(3, 5).equals("12") ? "11" : ((String) end).substring(3, 5)));
				endDate.setYear(Integer.parseInt(((String) end).substring(6)));
				deleteError(getLabel("dateBeforeError"));
				if (endDate.before(startDate)) {
					setError(getLabel("dateBeforeError"));
					jumpToTop();
					return;
				}
			}
			
			if(searchParam.get(AMSFilter.AMOUNT) != null && !searchParam.get(AMSFilter.AMOUNT).equals("")){
				Integer amount = null;
				try{
					amount = Integer.valueOf(String.valueOf(searchParam.get(AMSFilter.AMOUNT)));
				} catch(Exception x){
					setError("Sisestatud kogus peab olema number");
					jumpToTop();
					return;
				}
				searchParam.put(AMSFilter.AMOUNT, amount);
			}
			
			if(isEIT()){
				searchParam.put("reportingEntRegId", Form.getUserInfo().getRegCode());
			}
			if (!hasErrors()) {
				searchResultsTable.getData(searchParam);
				searchResultsTable.getFilter().setQueryParams(searchParam);

			}
			jumpToTop();
		}
	}

	public void searchRecords(Long reportId) {
		Map params = new HashMap();
		params.put(AMSFilter.REPORT_ID, reportId);
		
		if(reportId == null){
			tb_report_id.setVisible(false);
			label_report_id.setVisible(false);
		}
		else{
			tb_report_id.setVisible(true);
			label_report_id.setVisible(true);
		}
		tb_report_id.setText(String.valueOf(reportId));
		
		if(isEIT()){
			params.put("reportingEntRegId", Form.getUserInfo().getRegCode());
		}
		
		searchResultsTable.getData(params);
		searchResultsTable.getFilter().setQueryParams(params);
	}

	/**
	 * Täidab liidese valikuloendid serveri andmetega.
	 */
	private void fillListBoxes() {
		List countries = (List) ServiceContext.getInstance().getCached(ServiceContext.COUNTRIES);
		if (countries != null) {
			makeClassSelectionList(SEARCH_FORM, AMSFilter.PRODUCER_COUNTRY_CODE, countries);
			makeClassSelectionList(SEARCH_FORM, AMSFilter.PRODUCT_ORIGINCOUNTRY_CODE, countries);
		}
		List productTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_TYPE);
		if (productTypes != null) {
			makeClassSelectionList(SEARCH_FORM, AMSFilter.PRODUCT_TYPE_CODE, productTypes);
		}
		List months = (List) ServiceContext.getInstance().getCached(ServiceContext.MONTH);
		if (months != null) {
			makeClassSelectionList(SEARCH_FORM, AMSFilter.REPORT_PERIOD_MONTH, (List) months);
		}
	}

	/**
	 * Alkoholi liikkumise otsingu tulemuste tabel.
	 * 
	 * @author viktorb
	 */
	private class AlcoMovementTable extends ResultTable {

		public AlcoMovementTable() {
			super(new AMSFilter(), true);
			if (!isEIT()) {
				addColumn(new Column(getLabel("registryNr"), ReportListViewMap.REG_NR, null, Column.styleUrl, "select"));
			} else {
				addColumn(new Column(getLabel("registryNr"), ReportListViewMap.REG_NR, Column.styleNormal));
			}
			addColumn(new Column(getLabel("receiverName"), ReportListViewMap.RECEIVER, Column.styleNormal));
			addColumn(new Column(getLabel("stageName"), ReportListViewMap.MARKETPLACE, Column.styleNormal));
			addColumn(new Column(getLabel("stageCounty"), ReportListViewMap.MARKETPLACE_DIST, Column.styleNormal));
			addColumn(new Column(getLabel("stageCity"), ReportListViewMap.MARKETPLACE_CITY, Column.styleNormal));
			addColumn(new Column(getLabel("stageStreet"), ReportListViewMap.MARKETPLACE_STREET, Column.styleNormal));
			addColumn(new Column(getLabel("partyNr"), ReportListViewMap.PARTI_NR, Column.styleNormal));
			addColumn(new Column(getLabel("custPackNum"), ReportListViewMap.AMOUNT, Column.styleNormal));

		}

		protected void getData(SearchFilter filter) {
			ServiceContext.getInstance().getRegistryService().search(filter, this);
		}

		protected IRowListenerFactory getRowListenerFactory() {
			return new RowListenerFactory();
		}

		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
			return null;
		}

	}

	/**
	 * Reade elementide kuularite generaator.
	 * 
	 * @author viktor
	 */
	private class RowListenerFactory implements IRowListenerFactory {

		public ClickListener create(String listenerType, final Object row) {
			if (ResultTable.SELECT.equals(listenerType)) {

				return new ClickListener() {

					public void onClick(Widget sender) {
						setData((ReportListViewMap) row);
						Long productId = (Long) getData().getProperty(ReportListViewMap.PRODUCT_ID);
						ServiceContext.getInstance().getRegistryService().findProduct(productId, new AsyncCallback() {

							public void onFailure(Throwable caught) {
								setError(caught.toString());
								caught.printStackTrace();
							}

							public void onSuccess(Object result) {
								ProductsForm productsForm = new ProductsForm(AlcoMovementForm.this);
								productsForm.setData((ProductMap) result);
								openForm(productsForm);
								productsForm.setFormFieldsFromData(ProductsForm.MANAGE_FORM);
								productsForm.setButtonsEnabled(true);
							}

						});
					}

				};

			}
			return null;
		}

	}

}
