/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.quer;

import java.util.Date;
import java.util.List;
import java.util.Map;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.XMLParser;
import ee.agri.alkor.web.client.dto.ApplicationMap;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoDialog;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.AMSFilter;
import ee.agri.alkor.web.client.dto.ReportViewMap;
import ee.agri.alkor.web.client.dto.SRSFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Esitatud aruannete vorm.
 * 
 * @author viktorb
 */
public class SubmittedReportsForm extends Form implements ClickListener, CacheListener {

	public final boolean isEIT() {
		return UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP });
	}

	public static final String getKey() {
		return "querSubmitedReportsForm";
	}

	public static final String getKeyEIT() {
		return "querSubmitedReportsFormEIT";
	}

	// Otsingu parameetrite sisestus-vorm.
	private static final String SEARCH_FORM = "searchForm";
	private static final String UPLOAD_FORM = "uploadForm";
	private final TextBox rRegId = new TextBox();

	private SubmittedReportsTable searchResultsTable;

	/**
	 * Vormi loomine.
	 */
	public SubmittedReportsForm() {
		super();
		setData(new ReportViewMap());
	}

	public Object getConstantsWithLookup() {
		return GWT.create(Messages.class);
	}

	public void init() {
		super.init();

		ServiceContext.getInstance().addCacheListener(ServiceContext.MONTH, this);

		searchResultsTable = new SubmittedReportsTable();

		Label title = new Label((isEIT() ? "Minu aruanded" : "Esitatud aruanded"));
		title.setStyleName("Title");
		
		Label title2 = new Label("Laadi uus aruanne");
		title2.setStyleName("Title");
		
		///////////////////////////
		
		final FormPanel form2 = new FormPanel();
		form2.setAction(GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL);
		form2.setEncoding(FormPanel.ENCODING_MULTIPART);
		form2.setMethod(FormPanel.METHOD_POST);
		
		final FileUpload upload = new FileUpload();
		upload.setName("uploadFormElement");
		
		final ListBox periodMonth = new ListBox();
		periodMonth.setWidth("12.5em");
		periodMonth.setName("uploadPeriodMonth");
		
		periodMonth.addItem("Jaanuar", "1");
		periodMonth.addItem("Veebruar", "2");
		periodMonth.addItem("Märts", "3");
		periodMonth.addItem("Aprill", "4");
		periodMonth.addItem("Mai", "5");
		periodMonth.addItem("Juuni", "6");
		periodMonth.addItem("Juuli", "7");
		periodMonth.addItem("August", "8");
		periodMonth.addItem("September", "9");
		periodMonth.addItem("Oktoober", "10");
		periodMonth.addItem("November", "11");
		periodMonth.addItem("Detsember", "12");
		
		final Hidden hidden = new Hidden();
		hidden.setName("reg_nr");
		hidden.setValue(Form.getUserInfo().getRegCode());
		
		final TextBox reg_nr_vta = new TextBox();
		reg_nr_vta.setName("reg_nr_vta");
		
		final ListBox periodYear = new ListBox();
		periodYear.setName("uploadPeriodYear");
		periodYear.setWidth("5em");
		periodYear.addItem("2014");
		periodYear.addItem("2015");
		periodYear.addItem("2016");
		periodYear.addItem("2017");
		periodYear.addItem("2018");
		periodYear.addItem("2019");
		periodYear.addItem("2020");
		periodYear.addItem("2021");
		periodYear.addItem("2022");
		periodYear.addItem("2023");
		periodYear.addItem("2024");
		periodYear.addItem("2025");
		
		final Date kuupaev = new Date(); // gwt ei saa kasutada Calendar'i
		CalendarUtil.addMonthsToDate(kuupaev, -1);
		
		String aasta = DateTimeFormat.getFormat("yyyy").format(kuupaev);
		int kuu = Integer.parseInt(DateTimeFormat.getFormat("MM").format(kuupaev))-1;
		
		for(int i = 0; i < periodYear.getItemCount(); i++){
			if(periodYear.getItemText(i).equals(aasta)){
				periodYear.setItemSelected(i, true);
			}
		}
		periodMonth.setItemSelected(kuu, true);
		
		final FlexTable formPanel = new FlexTable();
		formPanel.setStyleName("FormFiles");
		formPanel.setCellSpacing(1);
		formPanel.setCellPadding(5);		
		formPanel.setText(1, 0, "Aruanne:");
		formPanel.setText(2, 0, "Periood (aasta ja kuu):");
		if(!isEIT()){ // VTA
			formPanel.setText(3, 0, "Esitaja äriregistrikood:");
		}
		formPanel.setWidget(1, 1, new Image("images/t2rn.gif"));
		formPanel.setWidget(2, 1, new Image("images/t2rn.gif"));
		if(!isEIT()){ // VTA
			formPanel.setWidget(3, 1, new Image("images/t2rn.gif"));
		}
		formPanel.getFlexCellFormatter().setStyleName(0, 0, "Label");
		formPanel.getFlexCellFormatter().setStyleName(1, 0, "Label");
		formPanel.getFlexCellFormatter().setStyleName(2, 0, "Label");
		formPanel.setWidget(1, 2, upload);
		formPanel.setWidget(2, 2, periodYear);
		formPanel.setWidget(2, 3, periodMonth);
		
		if(!isEIT()){ // VTA
			formPanel.setWidget(3, 2, reg_nr_vta);
			formPanel.setWidget(4, 0, hidden);
		}
		else{
			formPanel.setWidget(3, 0, hidden);
		}
		
		formPanel.getFlexCellFormatter().setColSpan(1, 2, 2);
		formPanel.getFlexCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanel.getFlexCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanel.getFlexCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		
		ClickListener listener = new ClickListener() {
			public void onClick(Widget sender) {				
				upload.setName(com.google.gwt.http.client.URL.encode(upload.getName()));
			
				if (upload.getFilename().replace(" ", "").length() == 0) {
					setError("Dokumendi valimine on vajalik.");
					return;
				}		
				
				if(!isEIT() && (reg_nr_vta.getValue() == null || reg_nr_vta.getValue().replaceAll(" ", "").length() != 8)){
					setError("Esitaja äriregistrikood on kohustuslik ja peab olema 8 kohaline");
					return;
				}
				
				String str = (upload.getFilename().replace(" ", ""));
				
				String last3 = str == null || str.length() < 3 ?  str : str.substring(str.length() - 3);
				if(last3.equals("csv") || last3.equals("CSV")){
					form2.submit();				
				} else {
					setError("Dokumendi formaat peab olema CSV.");
					return;
				}
			}
		};
		
		final Button submit = new Button("Lisa Aruanne", listener);		
		

		if(!isEIT()){ // VTA
			formPanel.setWidget(4, 2, submit);
		} else{
			formPanel.setWidget(3, 2, submit);
		}
		
		// Add an event handler to the form.
		
		final WaitPopup waitPopup = new WaitPopup();
		waitPopup.init();
		waitPopup.hide();
		
		form2.addFormHandler(new FormHandler() {
			public void onSubmitComplete(FormSubmitCompleteEvent event) {	
				submit.setEnabled(true);
				
				if(event.getResults().length() < 10){
					setInfo("Aruanne laaditud! Andmete uuendamiseks vajutage nupule 'Otsi'");
					
					form2.reset();
					
					String aasta = DateTimeFormat.getFormat("yyyy").format(kuupaev);
					int kuu = Integer.parseInt(DateTimeFormat.getFormat("MM").format(kuupaev))-1;
					
					for(int i = 0; i < periodYear.getItemCount(); i++){
						if(periodYear.getItemText(i).equals(aasta)){
							periodYear.setItemSelected(i, true);
						}
					}
					periodMonth.setItemSelected(kuu, true);
					//searchResultsTable.getData(getFormFieldValues(SEARCH_FORM));
				} else {
					setErrorHtml(event.getResults(), true);
				}
				
				waitPopup.hide();
			}

			public void onSubmit(FormSubmitEvent event) {
				clearErrors();
				submit.setEnabled(false);
				//setInfo("Palun oota, aruannet laaditakse...");
				waitPopup.center();
				waitPopup.show();
			}
		});


		form2.setWidget(formPanel);
		
		
		
		/////////////////////////
		
		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setCellSpacing(1);
		form.setCellPadding(2);
		form.setText(0, 0, getLabel("formInsertedFrom"));
		form.setText(1, 0, getLabel("formInsertedTill"));
		form.setText(2, 0, getLabel("formReportPeriod"));
		if (!isEIT()) {
			form.setText(3, 0, getLabel("formSenderName"));
		}
		form.setText(4, 0, getLabel("formSenderBCode"));
		form.setWidget(0, 1, addFormField(SEARCH_FORM, SRSFilter.START_DATE, new CalendarBox(), "10em"));
		form.setWidget(1, 1, addFormField(SEARCH_FORM, SRSFilter.END_DATE, new CalendarBox(), "10em"));
		form.setWidget(2, 1, addFormField(SEARCH_FORM, SRSFilter.PERIOD_YEAR, new TextBox(), "100%"));
		form.setWidget(2, 2, addFormField(SEARCH_FORM, SRSFilter.PERIOD_MONTH, new ListBox(), "12.4em"));

		if (isEIT()) {
			// TextBox rName = new TextBox();

			// rName.setEnabled(false);
			rRegId.setEnabled(false);

			// rName.setValue(Form.getUserInfo().getName());
			rRegId.setValue(Form.getUserInfo().getRegCode());

			// form.setWidget(3, 1, addFormField(SEARCH_FORM,
			// SRSFilter.REPORTER_NAME, rName, "25em"));
			form.setWidget(4, 1, addFormField(SEARCH_FORM, SRSFilter.REPORTER_REG_ID, rRegId, "25em"));

		} else {
			form.setWidget(3, 1, addFormField(SEARCH_FORM, SRSFilter.REPORTER_NAME, new TextBox(), "25em"));
			form.setWidget(4, 1, addFormField(SEARCH_FORM, SRSFilter.REPORTER_REG_ID, new TextBox(), "25em"));
		}

		form.setWidget(5, 1, UIutils.createSpacer(1, 7));
		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		cellFormatter.setColSpan(3, 1, 3);
		cellFormatter.setColSpan(4, 1, 3);
		cellFormatter.setColSpan(6, 1, 3);
		UIutils.setTableTextStyled(form);
		cellFormatter.setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(2, 1, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(2, 2, HasHorizontalAlignment.ALIGN_RIGHT);
		cellFormatter.setHorizontalAlignment(3, 1, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(4, 1, HasHorizontalAlignment.ALIGN_LEFT);

		HorizontalPanel buttons = new HorizontalPanel();
		Button clearBtn = new Button(getLabel("formButtonClear"), this);
		Button searchBtn = new Button(getLabel("formButtonSearch"), this);
		clearBtn.setWidth("8em");
		searchBtn.setWidth("8em");
		buttons.add(clearBtn);
		buttons.add(UIutils.createSpacer(6, 1));
		buttons.add(searchBtn);
		form.setWidget(6, 1, buttons);
		cellFormatter.setHorizontalAlignment(6, 1, HasHorizontalAlignment.ALIGN_LEFT);

		Label tableTitle = new Label(getLabel("formTable"));
		tableTitle.setStyleName("Title");

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		/*if (!isEIT()) {
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
		} else {*/
			main.setWidget(0, 0, title2);
			
			Label hlpText = new Label("Aruande vormi kohta leiab täpsustuse lehe ülevalt paremalt nurgas oleva 'Abi?' nupu alt");
			hlpText.getElement().getStyle().setProperty("margin-left", "40px");
			main.setWidget(1, 0, hlpText);
			main.setWidget(2, 0, UIutils.createSpacer(700, 1));
			main.setWidget(3, 0, form2);
			main.setWidget(4, 0, title);
			main.setWidget(5, 0, UIutils.createSpacer(700, 1));
			main.setWidget(6, 0, form);
			main.setWidget(7, 0, tableTitle);
			main.setWidget(8, 0, UIutils.createSpacer(1, 20));
			main.setWidget(9, 0, searchResultsTable);
			main.getFlexCellFormatter().setWidth(2, 1, "100%");
			main.getFlexCellFormatter().setWidth(9, 0, "98%");
			main.getFlexCellFormatter().setColSpan(1, 0, 2);
			main.getFlexCellFormatter().setColSpan(4, 0, 2);
			main.getFlexCellFormatter().setColSpan(7, 0, 2);
		//}
		
		
		fillListBoxes();
		initWidget(main);
		//searchResultsTable.getData(getFormFieldValues(SEARCH_FORM)); // automaatne otsing
	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable) {
			//Window.alert(value.toString());
		} else if (key.equals(ServiceContext.MONTH)) {
			makeClassSelectionList(SEARCH_FORM, SRSFilter.PERIOD_MONTH, (List) value);
		}
	}

	public void onClick(Widget sender) {
		String btnText = ((Button) sender).getText();
		if (getLabel("formButtonClear").equals(btnText)) {
			searchResultsTable.getFilter().reset();
			resetFormFields(SEARCH_FORM);

			if (isEIT()) {
				rRegId.setValue(Form.getUserInfo().getRegCode());
			}

		} else if (getLabel("formButtonSearch").equals(btnText)) {
			Map searchParam = getFormFieldValues(SEARCH_FORM);
			Object end = searchParam.get(AMSFilter.END_DATE);
			Object start = searchParam.get(AMSFilter.START_DATE);
			if (end != null && start != null) {
				Date endDate = new Date();
				Date startDate = new Date();
				endDate.setDate(Integer.parseInt(((String) end).substring(0, 2)));
				// java.util.Date.before() counts months from 0 to 11
				endDate.setMonth(Integer.parseInt(((String) end).substring(3, 5).equals("12") ? "11" : ((String) end).substring(3, 5)));
				endDate.setYear(Integer.parseInt(((String) end).substring(6)));
				startDate.setDate(Integer.parseInt(((String) start).substring(0, 2)));
				startDate.setMonth(Integer.parseInt(((String) start).substring(3, 5).equals("12") ? "11" : ((String) start).substring(3, 5)));
				startDate.setYear(Integer.parseInt(((String) start).substring(6)));
				deleteError(getLabel("dateBeforeError"));
				if (endDate.before(startDate)) {
					setError(getLabel("dateBeforeError"));
					return;
				}
			}
			if (!hasErrors())
				searchResultsTable.getData(getFormFieldValues(SEARCH_FORM));
			jumpToTop();
		}
	}

	/**
	 * Täidab liidese valikuloendid serveri andmetega.
	 */
	private void fillListBoxes() {
		List months = (List) ServiceContext.getInstance().getCached(ServiceContext.MONTH);
		if (months != null) {
			makeClassSelectionList(SEARCH_FORM, SRSFilter.PERIOD_MONTH, (List) months);
		}
	}

	/**
	 * Esitatud aruannete otsingu tulemuste tabel.
	 * 
	 * @author viktorb
	 */
	private class SubmittedReportsTable extends ResultTable {

		public SubmittedReportsTable() {
			super(new SRSFilter(), true);
			addColumn(new Column(getLabel("formSenderName"), ReportViewMap.NAME, Column.styleNormal));
			addColumn(new Column(getLabel("regCode"), ReportViewMap.REG_ID, Column.styleNormal));
			addColumn(new Column(getLabel("contacts"), ReportViewMap.CONTACTS, Column.styleNormal));
			addColumn(new Column(getLabel("insertDate"), ReportViewMap.CREATED, Column.styleNormal));
			addColumn(new Column(getLabel("period"), ReportViewMap.PERIOD, Column.styleNormal));
			addColumn(new Column(getLabel("entererPerCode"), ReportViewMap.LOADING_PERSON_ID, Column.styleNormal));
			addColumn(new Column(getLabel("rowsNum"), ReportViewMap.TOTAL, Column.styleNormal));
			if (isEIT()) {
				addColumn(Column.getViewEITInstance()); // EIT ei saagi vaadata
			}
			else{
				addColumn(Column.getViewInstance());
			}

		}

		protected void getData(SearchFilter filter) {
			if(filter.getSortMap().size() == 0){
				filter.addSortItem("created", SearchFilter.DESCENDING);
			}
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
	 * Tulemuste tabeli reade kuularite generaator.
	 * 
	 * @author viktorb
	 */
	private class RowListenerFactory implements IRowListenerFactory {

		public ClickListener create(String listenerType, final Object row) {
			if (ResultTable.VIEW.equals(listenerType)) {
				return new ClickListener() {

					public void onClick(Widget sender) {
						setData((ReportViewMap) row);
						AlcoMovementForm form = new AlcoMovementForm(SubmittedReportsForm.this);
						Long reportId = (Long) getData().getProperty(ReportViewMap.ID);
						openForm(form);
						form.searchRecords(reportId);
					}

				};
			} else if (ResultTable.VIEWEIT.equals(listenerType)) {
				return new ClickListener() {
					public void onClick(Widget sender) {
						setData((ReportViewMap) row);
						String converted = GWT.getModuleBaseURL();
						Window.open(converted + "down" + "?" + "type" + "=" + "report" + "&" + "id" + "=" + getData().getProperty(ReportViewMap.ID), "aruanne",
								"");
					}
				};
			}
			return null;
		}

	}
	
	
	private class WaitPopup extends PopupPanel {

		public WaitPopup() {
			super();
		}

		private void init() {
			VerticalPanel popup = new VerticalPanel();
			
			HTML html = new HTML("Palun oota, aruannet laaditakse...");
			html.setWidth("100%");

			popup.add(UIutils.createSpacer(1, 15));
			popup.add(html);
			popup.add(UIutils.createSpacer(1, 20));
			popup.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
			
			setSize("300px", "100px");
			this.setStyleName("Dialog");
			setWidget(popup);
			
			this.setModal(true);
			this.setGlassEnabled(true);
		    this.setGlassStyleName("popBackground");
			this.center();
		}
	}

}
