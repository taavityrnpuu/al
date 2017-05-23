package ee.agri.alkor.web.client.form.finance;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.MultipleListBox;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.RangeSelectTextBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.StateFeeFilter;
import ee.agri.alkor.web.client.dto.StateFeeMap;
import ee.agri.alkor.web.client.form.EnterpriseDetails;
import ee.agri.alkor.web.client.form.SearchForm;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;
import ee.agri.alkor.web.client.form.appl.ProductsForm;

public class StateFeeForm extends Form {
	
	private static final String VIEW_ENTERPRISE = "view_enterprise";
	private static final String VIEW_APPLICATION = "view_application";
	private static final String SEARCH_FORM = "searchForm";
	
	private FlexTable form = new FlexTable();
	private HorizontalPanel searchButtons;
	private StateFeeTable stateFeeTable;

	public void avail(String key, Object value) {
		// TODO Auto-generated method stub

	}
	
	public StateFeeForm(){
		super();
	}
	
	public StateFeeForm(Form form,EnterpriseMap enterprise){
		super();
		this.parent = form;
		StateFeeMap stateFeeMap = new StateFeeMap();
		stateFeeMap.setProperty(StateFeeMap.ENTERPRISE_ID, enterprise.getProperty(EnterpriseMap.ID));
		if(enterprise.getProperty(EnterpriseMap.NAME) != null)
			stateFeeMap.setProperty(StateFeeMap.ENTERPRISE_NAME, enterprise.getProperty(EnterpriseMap.NAME));
		if(enterprise.getProperty(EnterpriseMap.REG_ID) != null)
			stateFeeMap.setProperty(StateFeeMap.ENTERPRISE_REG_NR, enterprise.getProperty(EnterpriseMap.REG_ID));
		setData(stateFeeMap);
	}
	
	public void init(){
		super.init();
		
		Label title = new Label("Riigilõivu väljavõte");
		title.setStyleName("Title");
		
		SimplePanel greenLine = new SimplePanel();
	    greenLine.setStyleName("Left");
	    greenLine.setHeight("15px");
		
		FlexTable main = new FlexTable();
		
		searchButtons = new HorizontalPanel();
		
		if(parent != null){
			Button back = new OFButton("Tagasi",parent);
			back.setWidth("9em");
			searchButtons.add(back);
		}
		
		Button clear = new Button(getLabel("buttonEmptyFilter"),
			new ClickListener() { // "Tühjenda filter"

				public void onClick(Widget sender) {
					resetSearchForm();
					stateFeeTable.setSelectedRowIndex(-1);
				}
			});
		
		

		Button search = new Button(getLabel("buttonSearch"));// "Otsi");

		search.addClickListener(new ClickListener() {

		public void onClick(Widget sender) {
			System.out.println("Button clink!");
			Map map = getFormFieldValues(SEARCH_FORM);
			if(!hasErrors())
				stateFeeTable.getData(map);
			else
				System.out.println("error:"+getErrors().get(0));
		}
		});

		clear.setWidth("9em");
		search.setWidth("9em");
		searchButtons.add(UIutils.createSpacer(
				UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		searchButtons.add(clear);
		searchButtons.add(UIutils.createSpacer(6, 1));
		searchButtons.add(search);
		
		stateFeeTable = new StateFeeTable();
		if(parent != null){
			stateFeeTable.getData(getData());
		}
		
		
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(2, 0, UIutils.createSpacer(800, 1));
	    main.setWidget(3, 0, UIutils.createSpacer(1, 45));
	    main.setWidget(4, 0, createSearchForm());
	    main.setWidget(5, 0, UIutils.createSpacer(800, 20));
	    main.setWidget(6, 0, searchButtons);
	    main.setWidget(7, 0, UIutils.createSpacer(800, 50));
	    main.setWidget(8, 0, stateFeeTable);
		
		initWidget(main);
		if(getData() != null && getData().getProperty(StateFeeMap.ENTERPRISE_ID) != null)
			setFormFieldsFromData(SEARCH_FORM);
		
	}
	
	private FlexTable createSearchForm(){
			
		form.setStyleName("form");
		
		
	
		form.setText(0, 0, getLabel(StateFeeFilter.PAYMENT_DATE));
		form.setText(1, 0, getLabel(StateFeeFilter.AMOUNT));
		form.setText(2, 0, getLabel(StateFeeFilter.TYPE));
		form.setText(3, 0, getLabel(StateFeeFilter.ENTERPRISE_NAME));
		form.setText(4, 0, getLabel(StateFeeFilter.ENTERPRISE_REG_NR));
		
		RangeSelectBox dateRange = new RangeSelectBox(RangeSelectBox.CALENDAR,"45%","45%");
		Date now = new Date(System.currentTimeMillis());
		
		//parse default range from beginning of last month to current day, and set it as string
		if(parent == null){ // no default range while coming from another form
			dateRange.setEnd( (now.getDate() > 9 ? new Integer(now.getDate()).toString() : "0"+now.getDate() ) +"."+( (now.getMonth()+1) > 9 ? (new Integer(now.getMonth()+1)).toString() :"0"+(now.getMonth()+1) )+"."+(now.getYear()+1900) );
			dateRange.setStart("01."+ (now.getMonth() == 0  ? "12" : ( (now.getMonth()) > 9 ? (new Integer(now.getMonth())).toString() :"0"+now.getMonth() ) )+"."+(now.getYear() + (now.getMonth() == 0 ? 1899 : 1900)));
		}
		form.setWidget(0, 1, addFormField(SEARCH_FORM, StateFeeFilter.PAYMENT_DATE, dateRange));
		
		form.setWidget(1, 1, addFormField(SEARCH_FORM, StateFeeFilter.AMOUNT, new RangeSelectTextBox(RangeSelectTextBox.NUMERIC,"45%","45%"),"100%"));
		form.setWidget(2, 1, addFormField(SEARCH_FORM, StateFeeFilter.TYPE, getSelectionList(),"50%"));
		form.setWidget(3, 1, addFormField(SEARCH_FORM, StateFeeFilter.ENTERPRISE_NAME, new TextBox(),"50%"));
		form.setWidget(4, 1, addFormField(SEARCH_FORM, StateFeeFilter.ENTERPRISE_REG_NR, new TextBox(),"50%"));
		
		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		cellFormatter.setHorizontalAlignment(3, 1, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(4, 1, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setColSpan(3, 1, 2);
		cellFormatter.setColSpan(4, 1, 2);
		
		return form;
	}
	
	private class StateFeeTable extends ResultTable{
		public StateFeeTable(){
			super(new StateFeeFilter());
			
			 this.addColumn(new Column(getLabel(StateFeeFilter.ENTERPRISE_NAME),
		    		 StateFeeFilter.ENTERPRISE_NAME, null, Column.styleUrl, VIEW_ENTERPRISE));
			 this.addColumn(new Column(getLabel(StateFeeFilter.ENTERPRISE_REG_NR),
		    		 StateFeeFilter.ENTERPRISE_REG_NR, null, Column.styleNormal, null));
			 this.addColumn(new Column(getLabel(StateFeeFilter.TYPE),
		    		 StateFeeFilter.TYPE, null, Column.styleNormal, null));
			 this.addColumn(new Column(getLabel(StateFeeFilter.APPLICATION_NR),
		    		 StateFeeFilter.APPLICATION_NR, null, Column.styleUrl, VIEW_APPLICATION));
			 this.addColumn(new Column(getLabel(StateFeeFilter.PAYMENT_DATE),
		    		 StateFeeFilter.PAYMENT_DATE, null, Column.styleNormal, null));
			 this.addColumn(new Column(getLabel(StateFeeFilter.AMOUNT),
		    		 StateFeeFilter.AMOUNT, null, Column.styleNormal, null));
			 this.addColumn(new Column(getLabel(StateFeeFilter.PAYER_NAME),
		    		 StateFeeFilter.PAYER_NAME, null, Column.styleNormal, null));
			 
			
		}
		
		protected void getData(SearchFilter filter) {
		  startSearching();
		  ServiceContext.getInstance().getRegistryService().search(filter, this);
		}
		
		protected IRowListenerFactory getRowListenerFactory() {
			return new RowListenterFactory();
		}
		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
			// TODO Auto-generated method stub
			return null;
		}
		
			public void onSuccess(Object result) {
				 if (result != null) {
					 SearchFilter searchFilter = (SearchFilter) result;
					 for(Iterator it = searchFilter.getResultsList().iterator(); it.hasNext();) {
						 StateFeeMap statefee = ((StateFeeMap)it.next());
						 
						 if(StateFeeFilter.TYPE_PAYMENT_CODE.equals(statefee.getProperty(StateFeeFilter.TYPE)))
							 statefee.setProperty(StateFeeFilter.TYPE, getLabel(StateFeeFilter.TYPE_PAYMENT));
						 else if(StateFeeFilter.TYPE_REGISTRY_CODE.equals(statefee.getProperty(StateFeeFilter.TYPE)))
							 statefee.setProperty(StateFeeFilter.TYPE, getLabel(StateFeeFilter.TYPE_REGISTRY));
						 else
							 statefee.setProperty(StateFeeFilter.TYPE, getLabel(StateFeeFilter.TYPE_EXTEND));
					 }
					super.onSuccess(result);
				 }
			  }
		}
	
	 private class RowListenterFactory implements IRowListenerFactory {

		  public RowListenterFactory() {
		     super();
		  }
		  
		  public ClickListener create(String listenerType, final Object row) {
			  if(listenerType.equals(VIEW_APPLICATION)){
				  return new ClickListener(){

					public void onClick(Widget arg0) {
						StateFeeMap rowMap = (StateFeeMap) row;
						String id = (String) rowMap.getProperty(StateFeeMap.APPLICATION_ID);
						getRegistryService().findApplication(Long.valueOf(id), new AsyncCallback() {
							public void onSuccess(Object result) {
								openForm(new ApplicationForm((ApplicationMap)result,StateFeeForm.this));
							}
							public void onFailure(Throwable t) {

							}
						});
					}
					  
				  };
			  }
			  if(listenerType.equals(VIEW_ENTERPRISE)){
				  return new ClickListener(){

					public void onClick(Widget arg0) {
						StateFeeMap rowMap = (StateFeeMap) row;
						String id = (String) rowMap.getProperty(StateFeeMap.ENTERPRISE_ID);
						getRegistryService().findEnterprise(Long.valueOf(id), new AsyncCallback() {
							public void onSuccess(Object result) {
								openForm(new EnterpriseDetails(StateFeeForm.this,(EnterpriseMap)result));
							}
							public void onFailure(Throwable t) {

							}
						});
					}
					  
				  };
			  }
			  return null;
		  }
	 }
	
	private void resetSearchForm() {
		setData(new ApplicationMap());
		stateFeeTable.getFilter().reset();
		resetFormFields(SEARCH_FORM);
	}
	
	public MultipleListBox getSelectionList(){
		MultipleListBox types = new MultipleListBox();
		types.getListBox().addItem("");
		types.getListBox().addItem(getLabel(StateFeeFilter.TYPE_PAYMENT), StateFeeFilter.TYPE_PAYMENT_CODE);
		types.getListBox().addItem(getLabel(StateFeeFilter.TYPE_REGISTRY),StateFeeFilter.TYPE_REGISTRY_CODE);
		types.getListBox().addItem(getLabel(StateFeeFilter.TYPE_EXTEND),StateFeeFilter.TYPE_EXTEND_CODE);
		
		return types;
	}
	
	public Object getConstantsWithLookup() {
		return GWT.create(StateFeeFormMessages.class);

	}
	
	public static final String getKey(){
		return "stateFeeForm";
	}

}
