/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.quer;

import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.lowagie.text.Row;
import com.google.gwt.user.client.Window;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoDialog;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ProductSearchFilter;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.RegistryEntryViewMap;
import ee.agri.alkor.web.client.dto.RegistryEntryViewSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Registrise kantud alkohooli vorm.
 * 
 * @author martin
 * @author viktorb
 */
public class RegisteredAlcoForm extends Form implements ClickListener,
		CacheListener {

	public static String getKey() {
		return "querRegisteredAlcoForm";
	}

	// Otsingu parameetrite sisestus-vorm.
	private static final String SEARCH_FORM = "searchForm";

	private RegisteredAlcoTable searchResultsTable;

	private static final String VIEW_IMG = "view_img";

	/**
	 * Vormi loomine.
	 */
	public RegisteredAlcoForm() {
		super();
		setData(new RegistryEntryViewMap());
	}

	public Object getConstantsWithLookup() {
		return GWT.create(Messages.class);
	}

	public void init() {
		super.init();

		ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES,
				this);
		ServiceContext.getInstance().addCacheListener(
				ServiceContext.PRODUCT_TYPE, this);

		searchResultsTable = new RegisteredAlcoTable();

		Label title = new Label(getLabel("formTitleRegistered"));
		title.setStyleName("Title");

		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setCellSpacing(1);
		form.setCellPadding(4);
		form.setText(0, 0, getLabel("formProductName"));
		form.setText(1, 0, getLabel("formApplicant"));
		form.setText(2, 0, getLabel("formProducer"));
		form.setText(3, 0, getLabel("formProducerCounty"));
		form.setText(4, 0, getLabel("formOriginCounty"));
		form.setText(5, 0, getLabel("formProductType"));
		form.setText(6, 0, getLabel("formRegistryEntryNr"));
		form.setText(7, 0, getLabel("formRegistryEntryDate"));
		form.setWidget(
				0,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.PRODUCT_NAME,
						new TextBox(), "30em"));
		form.setWidget(
				1,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.APPLICANT_NAME,
						new TextBox(), "30em"));
		form.setWidget(
				2,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.PRODUCER_NAME,
						new TextBox(), "30em"));
		form.setWidget(
				3,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.PRODUCER_COUNTRY_CODE,
						new ListBox(), "30em"));
		form.setWidget(
				4,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.PRODUCT_COUNTRY_CODE,
						new ListBox(), "30em"));
		form.setWidget(
				5,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.PRODUCT_TYPE_CODE,
						new ListBox(), "30em"));
		form.setWidget(
				6,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.ENTRY_NR, new TextBox(),
						"30em"));
		form.setWidget(
				7,
				1,
				addFormField(SEARCH_FORM,
						RegistryEntryViewSearchFilter.DECISION_DATE,
						new RangeSelectBox(RangeSelectBox.CALENDAR, "45%",
								"45%")));
		form.getCellFormatter().setVisible(3, 0, false);
		form.getCellFormatter().setVisible(3, 1, false);
		UIutils.setTableTextStyled(form);

		HorizontalPanel buttons = new HorizontalPanel();
		Button clearBtn = new Button(getLabel("formButtonClear"), this);
		Button searchBtn = new Button(getLabel("formButtonSearch"), this);
		clearBtn.setWidth("8em");
		searchBtn.setWidth("8em");
		buttons.add(clearBtn);
		buttons.add(UIutils.createSpacer(6, 1));
		buttons.add(searchBtn);

		form.setWidget(9, 1, buttons);
		form.getFlexCellFormatter().setHorizontalAlignment(8, 1,
				HasHorizontalAlignment.ALIGN_LEFT);

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
		// searchResultsTable.getData();

	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable) {
			Window.alert(value.toString());
		} else if (key.equals(ServiceContext.COUNTRIES)) {
			makeClassSelectionList(SEARCH_FORM,
					RegistryEntryViewSearchFilter.PRODUCER_COUNTRY_CODE,
					(List) value);
			makeClassSelectionList(SEARCH_FORM,
					RegistryEntryViewSearchFilter.PRODUCT_COUNTRY_CODE,
					(List) value);
		} else if (key.equals(ServiceContext.PRODUCT_TYPE)) {
			makeClassSelectionList(SEARCH_FORM,
					RegistryEntryViewSearchFilter.PRODUCT_TYPE_CODE,
					(List) value);
		}
	}

	public void onClick(Widget sender) {
		String btnText = ((Button) sender).getText();
		if (getLabel("formButtonClear").equals(btnText)) {
			searchResultsTable.getFilter().reset();
			resetFormFields(SEARCH_FORM);
		} else if (getLabel("formButtonSearch").equals(btnText)) {
			Map searchParam = getFormFieldValues(SEARCH_FORM);
			// searchParam.put(RegistryEntryViewSearchFilter.ENTRY_VALID_UNTIL,
			// SearchFilter.NOT_LESS_THAN_CURRENT_DATE);
			if (!hasErrors())
				searchResultsTable.getData(searchParam);
		}
	}

	/**
	 * Täidab liidese valikuloendid serveri andmetega.
	 */
	private void fillListBoxes() {
		List countries = (List) ServiceContext.getInstance().getCached(
				ServiceContext.COUNTRIES);
		if (countries != null) {
			makeClassSelectionList(SEARCH_FORM,
					RegistryEntryViewSearchFilter.PRODUCER_COUNTRY_CODE,
					countries);
			makeClassSelectionList(SEARCH_FORM,
					RegistryEntryViewSearchFilter.PRODUCT_COUNTRY_CODE,
					countries);
		}
		List productTypes = (List) ServiceContext.getInstance().getCached(
				ServiceContext.PRODUCT_TYPE);
		if (productTypes != null) {
			makeClassSelectionList(SEARCH_FORM,
					RegistryEntryViewSearchFilter.PRODUCT_TYPE_CODE,
					productTypes);

		}
	}

	/**
	 * Otsingu tulemuste tabel.
	 * 
	 * @author viktorb
	 */
	private class RegisteredAlcoTable extends ResultTable {
		UserInfo uInfo = ServiceContext.getInstance().getUserInfo();

		public RegisteredAlcoTable() {
			super(new RegistryEntryViewSearchFilter(), true);

			HTML name = new HTML("<a href='test'>Siia test</a>");

			addColumn(new Column(getLabel("registryDate"),
					RegistryEntryViewMap.DECISION_DATE, Column.styleNormal));
			if (uInfo != null
					&& !"anonymousUser".equals(uInfo.getName())
					&& !UIutils
							.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }))
				addColumn(new Column(getLabel("registryNr"),
						RegistryEntryViewMap.ENTRY_NR, Column.styleNormal));
			addColumn(new Column(getLabel("productName"),
					RegistryEntryViewMap.PRODUCT_NAME, Column.styleNormal));			
			addColumn(new Column(getLabel("producerName"),
					RegistryEntryViewMap.PRODUCER_NAME, Column.styleNormal));
			addColumn(new Column(getLabel("applicantName"),
					RegistryEntryViewMap.APPLICANT_NAME, Column.styleNormal));
			//addColumn(new Column(getLabel("producerCountry"),
			//		RegistryEntryViewMap.PRODUCER_COUNTRY, Column.styleNormal));
			addColumn(new Column(getLabel("productOrigincounty"),
					RegistryEntryViewMap.PRODUCT_COUNTRY, Column.styleNormal));
			addColumn(new Column(getLabel("productType"),
					RegistryEntryViewMap.PRODUCT_TYPE, Column.styleNormal));
			addColumn(new Column(getLabel("productVolume"),
					RegistryEntryViewMap.PRODUCT_CAPACITY, Column.styleNormal));
			addColumn(new Column(getLabel("productGrade"),
					RegistryEntryViewMap.PRODUCT_ETHANOL_RATE,
					Column.styleNormal));
			addColumn(new Column(getLabel("productNotes"),
					RegistryEntryViewMap.PRODUCT_NOTES, Column.styleNormal));
			addColumn(new Column(getLabel("pictures"),
					RegistryEntryViewMap.PUBLIC_DOC_COUNT, null,
					Column.styleUrl, VIEW_IMG));

		}

		protected void getData(SearchFilter filter) {
			ServiceContext.getInstance().getRegistryService()
					.search(filter, this);
		}

		protected IRowListenerFactory getRowListenerFactory() {
			return new RowListenerFactory();
		}

		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
			return null;
		}

	}

	/**
	 * Tulemuste tabeli reade kuularite generaator.
	 * 
	 * @author viktorb
	 */
	private class RowListenerFactory implements IRowListenerFactory {

		public ClickListener create(String listenerType, final Object row) {
			if ("mark".equals(listenerType)) {
				return new ClickListener() {

					public void onClick(Widget sender) {
						setData((RegistryEntryViewMap) row);
						Object value = getData().getProperty(
								RegistryEntryViewMap.PRODUCT_NOTES);
						InfoDialog popup = new InfoDialog();
						popup.setTitleHTML(getLabel("productNotes"));
						popup.setInfo((String) value);
						popup.show();
					}

				};
			} else if (VIEW_IMG.equals(listenerType)) {
				return new ClickListener() {

					public void onClick(Widget arg0) {
						setData((RegistryEntryViewMap) row);
						Object value = getData().getProperty(
								RegistryEntryViewMap.ENTRY_NR);
						Object value2 = getData().getProperty(
								RegistryEntryViewMap.PUBLIC_DOC_COUNT);
						String[] vals = value.toString().split("/");
						if (!value2.toString().equals("0")) {
							Window.open(
									GWT.getHostPageBaseURL()+"showproduct?productid="
											+ vals[1], "_blank",
									"");
						}

					}

				};
			}
			return null;
		}

	}

}
