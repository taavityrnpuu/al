package ee.agri.alkor.web.client.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Class for an Excel Form Panel. Handles the creation of the panel, setting form parameters,
 * as well as binding the associated ClickListener
 * @author sven
 *
 */
public class ExcelFormPanel extends FormPanel {

	/*
	 * number of items that should be printed into excel
	 */
	private int itemsCount;
	
	/*
	 * Search filter that is used to get the data for excel
	 */
	private SearchFilter searchFilter;
	
	/*
	 * Image icon of the excel exporting button
	 */
	private Image excelImage;
	
	/*
	 * Click listener used when the excel export button is pressed
	 */
	private ExcelFormClickListener clickListener;
	
	/*
	 * The form that contains the excel button
	 */
	private FlexTable bform;
	
	/*
	 * Custom click listener to implement before excel run
	 */
	private ClickListener customClickListener;

	/**
	 * Constructor for the ExcelFormPanel. Creates the formPanel and sets the required form parameters
	 * for HTTP-POST
	 */
	public ExcelFormPanel(SearchFilter filter) {
		this(filter, null);
	}
	
	public ExcelFormPanel(SearchFilter filter, ClickListener customClickListener) {
		super();
		this.searchFilter = filter;
		this.customClickListener = customClickListener;

		this.setAction(GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL);
		this.setMethod(FormPanel.METHOD_POST);
		this.setEncoding(FormPanel.ENCODING_URLENCODED);

		this.add(createExcelForm());

	}
	
	public ExcelFormPanel(SearchFilter filter, int itemCount) {
		this(filter);
		itemsCount = itemCount;
	}

	/**
	 * Creates a flexTable containing the excel export form (excel image)
	 * @return
	 */
	private FlexTable createExcelForm() {
		/* Excelisse ekspordi vormi parameetrite lisamine */
		bform = new FlexTable();
		bform.setWidget(0, 0, new Hidden(ServiceConstants.DOC_ACTION_PARM,
				ServiceConstants.DOC_ACTION_EXPORT_TO_EXCEL));
		bform.setWidget(0, 1, new Hidden(ServiceConstants.SEARCH_FILTER_OBJECT_CLASS,
				(searchFilter.isExcelPrimitive() ? searchFilter.getObjectClass()+"Primitive" : searchFilter.getObjectClass())
						));

		/* Excelisse ekspordi pildi lisamine ning sellele kuulari lisamine */
		this.excelImage = new Image("images/excel.gif");
		this.clickListener = new ExcelFormClickListener();
		if(customClickListener != null){
			excelImage.addClickListener(customClickListener);
		}
		else{
			excelImage.addClickListener(clickListener);
		}

		bform.setWidget(0, 4, excelImage);

		return bform;

	}

	/**
	 * Excel export click listener
	 * @author sven
	 *
	 */
	private class ExcelFormClickListener implements ClickListener {

		ExcelFormClickListener() {
		}

		public void onClick(Widget sender) {
			doExcelSubmit();
		}

	}
	
	public void doExcelSubmit(){
		if(getItemsCount() > 65534) {
			InfoDialog info = new InfoDialog("Viga!", "Exceli eksport ei tööta kui eksporditavaid kirjeid on rohkem kui 65534");
			info.hide();
			info.show();
		} else {
			bform.setWidget(0, 2, new Hidden(ServiceConstants.SEARCH_FILTER_QUERY_PARAMS,
					URL.encode(searchFilter.getQueryParameterString(searchFilter.isExcelPrimitive()))));
			bform.setWidget(0, 3, new Hidden(ServiceConstants.SEARCH_FILTER_COLUMN_LIST,
					URL.encode(searchFilter.getQueryColumnListString(searchFilter.isExcelPrimitive()))));
			bform.setWidget(0, 5, new Hidden(ServiceConstants.SEARCH_FILTER_SORT_MAP,
					URL.encode(searchFilter.getsortMapString(searchFilter.isExcelPrimitive()))));
			if(searchFilter.getOrderBy() != null && searchFilter.getOrderBy() != ""){
				bform.setWidget(0, 8, new Hidden(ServiceConstants.SEARCH_FILTER_ORDER_BY,
						URL.encode(searchFilter.getOrderBy(searchFilter.isExcelPrimitive()))));
			}
			if(searchFilter.isLimited()) {
				bform.setWidget(0, 8, new Hidden(ServiceConstants.LIMITED_SEARCH, "1"));
            }
			if(searchFilter.getObjectClass().equals("SearchViewPrimitive") || searchFilter.isExcelPrimitive()){
				bform.setWidget(0, 6, new Hidden(ServiceConstants.SEARCH_FILTER_TEXT_PARAMS, URL.encode(searchFilter.getQueryTextValuesString(searchFilter.isExcelPrimitive()))));
				bform.setWidget(0, 7, new Hidden(ServiceConstants.SEARCH_FILTER_QUERY_LABELS,URL.encode(searchFilter.getQueryTextLabelsString(searchFilter.isExcelPrimitive()))));
			}

			bform.setWidget(0, 8, new Hidden("isExcelPrimitive",(searchFilter.isExcelPrimitive() ? "1" : "0")));

			ExcelFormPanel.this.submit();
		}
	}

	public void setSearchFilter(SearchFilter filter) {
		if(this.searchFilter != null && this.searchFilter.isExcelPrimitive()){
			filter.setExcelPrimitive(true);
		}
		this.searchFilter = filter;
	}

	public int getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(int itemsCount) {
		this.itemsCount = itemsCount;
	}

	public ClickListener getCustomClickListener() {
		return customClickListener;
	}

	public void setCustomClickListener(ClickListener customClickListener) {
		this.customClickListener = customClickListener;
	}
	
	

}
