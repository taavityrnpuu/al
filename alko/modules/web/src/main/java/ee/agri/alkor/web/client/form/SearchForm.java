package ee.agri.alkor.web.client.form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.LinkedHashMap;
import ee.agri.alkor.web.client.common.MultipleListBox;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.RangeSelectTextBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.common.YesNoRadioBox;
import ee.agri.alkor.web.client.common.widgets.FormOpenCloseButton;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ApplicationSearchFilter;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.SuperSearchFilter;
import ee.agri.alkor.web.client.dto.SuperSearchMap;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;
import ee.agri.alkor.web.client.form.appl.ProductsForm;

public class SearchForm extends Form implements CacheListener{

	private static final String VIEW_PRODUCT = "view_product";
	private static final String VIEW_APPLICATION = "view_application";

	private List defaultChecks; //default checkbox values

	private SearchResultTable resultTable;

	/*
	 * map of all the possible columns filled in addCheckBox
	 */
	private LinkedHashMap columnsMap;

	private static final String SEARCH_FORM = "searchForm";
	private SearchFormTable searchForm;
	private DetailedSearchFormTable detailedSearchForm;
	private ColumnsFormTable columnsForm;

	public static final String getKey() {
		return "searchForm";
	}

	public SearchForm() {
		columnsMap = new LinkedHashMap();
		defaultChecks = new ArrayList();
	}

	public Object getConstantsWithLookup() {
		return GWT.create(SearchFormMessages.class);

	}

	public CheckBox addCheckBox(String key, boolean initValue) {
		//CheckBoxListener listener = new ColumnSelectListener(key);
		ColumnSelectCheckBox cb = new ColumnSelectCheckBox(key, initValue);
		if(initValue) {
			defaultChecks.add(cb);
		}
		//put this column into the columnsMap
		columnsMap.put(key, cb);
		return cb;
	}

	public boolean isChecked(String key) {
		return ((CheckBox)columnsMap.get(key)).isChecked();
	}

	public LinkedHashMap getCheckBoxes() {
		return columnsMap;
	}

	public void init() {

		super.init();
		addCacheListeners();

	    Label searchTitle = new Label("Otsing");
	    searchTitle.setStyleName("Title");
	    searchForm = new SearchFormTable();

	    detailedSearchForm = new DetailedSearchFormTable();
	    HorizontalPanel detailedSearchTitlePanel = new HorizontalPanel();
	    Label detailedSearchTitle = new Label("Detailne otsing");
	    detailedSearchTitlePanel.add(new FormOpenCloseButton(detailedSearchForm));
	    detailedSearchTitlePanel.add(detailedSearchTitle);
	    detailedSearchTitlePanel.setStyleName("OpenCloseTitle");

	    columnsForm = new ColumnsFormTable();
	    HorizontalPanel columnsTitlePanel = new HorizontalPanel();
	    Label columnsTitle = new Label("Tulbad");
	    columnsTitlePanel.add(new FormOpenCloseButton(columnsForm));
	    columnsTitlePanel.add(columnsTitle);
	    columnsTitlePanel.setStyleName("OpenCloseTitle");

	    Label resultTableTitle = new Label("Otsingu tulemus");
	    resultTableTitle.setStyleName("Title");

	    SimplePanel greenLine = new SimplePanel();
	    greenLine.setStyleName("Left");
	    greenLine.setHeight("15px");

	    HorizontalPanel searchButtons = new HorizontalPanel();
	    Button clear = new Button(getLabel("buttonEmptyFilter"), new ClickListener() { // "TĆ¼hjenda filter"

            public void onClick(Widget sender) {
               resetSearchForm();
               resultTable.setSelectedRowIndex(-1);
            }
        });

	    Button search = new Button(getLabel("buttonSearch"));// "Otsi");
	    search.addClickListener(new ClickListener() {
	         public void onClick(Widget sender) {
	        	 ((TextBox) getFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_ETHANOL_RATE))
					.setText(comaToDot(((TextBox) getFormField(SEARCH_FORM,
							SuperSearchFilter.PRODUCT_ETHANOL_RATE)).getText()));
	        	 Map map = getFormFieldValues(SEARCH_FORM);
	        	 if(!hasErrors()) {
	        		 
	        		 //default sort items in specific order
	        		 String orderBy=SuperSearchFilter.APPLICATION_DECISION_DATE+" desc, s."+
	        		 	SuperSearchFilter.PRODUCT_TYPE_NAME+" asc, s."+
	        		 	SuperSearchFilter.APPLICATION_NR+" desc";
	        		 
	        		 resultTable.getFilter().setOrderBy(orderBy);
	        		 resultTable.getFilter().setQueryTextValues(getFormFieldValueTexts(SEARCH_FORM));
	        		//processor name input conversion into two different filters
	        		 
	        		 
	        		 
	        		 RangeSelectTextBox processorName = (RangeSelectTextBox)(getFormField(SEARCH_FORM, SuperSearchFilter.PROCESSOR));
	        		 System.out.println("name:"+processorName.getLow()+processorName.getHigh());
	        		 if(processorName.getLow() != null && processorName.getLow() != "")
	        			 map.put(SuperSearchFilter.PROCESSOR_FORNAME, processorName.getLow());
	        		 if(processorName.getHigh() != null && processorName.getHigh() != "")
	        			 map.put(SuperSearchFilter.PROCESSOR_LASTNAME, processorName.getHigh());
	        		 map.remove(SuperSearchFilter.PROCESSOR);
	        		 
	        		 resultTable.getData(map); 
	        	 }
	        	 jumpToTop();
	             
	         }
	    });

	    clear.setWidth("9em");
	    search.setWidth("9em");

	    searchButtons.add(UIutils.createSpacer(10,20));
	    searchButtons.add(clear);
	    searchButtons.add(UIutils.createSpacer(6, 1));
	    searchButtons.add(search);


	    FlexTable main = new FlexTable();

	    main.setCellPadding(0);
	    main.setCellSpacing(0);
	    main.setWidth("100%");
	    main.setWidget(0, 0, searchTitle);
	    main.setWidget(1, 0, greenLine);
	    main.setWidget(2, 0, searchForm);
	    main.setWidget(3, 0, detailedSearchTitlePanel);
	    main.setWidget(4, 0, greenLine);
	    main.setWidget(5, 0, detailedSearchForm);
	    main.setWidget(6, 0, columnsTitlePanel);
	    main.setWidget(7, 0, greenLine);
	    main.setWidget(8, 0, columnsForm);
	    main.setWidget(9, 0, searchButtons);
	    main.setWidget(10, 0, resultTableTitle);
	    main.setWidget(11, 0, greenLine);
	    main.setWidget(12, 0, resultTable = new SearchResultTable());

	    FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
	    cellFormatter.setWidth(1, 1, "100%");
	    cellFormatter.setHorizontalAlignment(9, 0, HasHorizontalAlignment.ALIGN_LEFT);
	    cellFormatter.setColSpan(0, 0, 2);
	    cellFormatter.setColSpan(1, 0, 2);
	    cellFormatter.setColSpan(3, 0, 2);
	    cellFormatter.setColSpan(4, 0, 2);
	    cellFormatter.setColSpan(6, 0, 2);
	    cellFormatter.setColSpan(7, 0, 2);
	    cellFormatter.setColSpan(10, 0, 2);
	    cellFormatter.setColSpan(11, 0, 2);
	    askClassificators();
	    
	    initWidget(main);

	}

	private class SearchFormTable extends FlexTable {
		public SearchFormTable() {
			super();

			/* LABELS */
			/* column1 */
			this.setText(0, 0, getLabel(SuperSearchFilter.APPLICANT_NAME));//"Taotleja nimi");
			this.setText(1, 0, getLabel(SuperSearchFilter.APPLICANT_REG_NR));//"Taotleja Ć¤riregistrikood");
			this.setText(2, 0, getLabel(SuperSearchFilter.PRODUCT_NAME));//"Toote nimi";
			this.setText(3, 0, getLabel(SuperSearchFilter.PRODUCT_TYPE));//"Toote liik";

			/* column2 */
			this.setText(0, 2, getLabel(SuperSearchFilter.PRODUCT_ETHANOL_RATE));//"Etanoolisisaldus %vol"
			this.setText(1, 2, getLabel(SuperSearchFilter.PRODUCT_VOLUME));//"Maht"
			this.setText(2, 2, getLabel(SuperSearchFilter.PRODUCER_NAME));//"Tootja nimi"
			this.setText(3, 2, getLabel(SuperSearchFilter.PRODUCER_COUNTRY));//"Tootja riik"

			/* column3 */
			this.setText(0, 4, getLabel(SuperSearchFilter.REGISTRY_ENTRY_NR));//"Registrikande number";
			this.setText(1, 4, getLabel(SuperSearchFilter.REGISTRY_ENTRY_VALID_FROM));//"Registrikande otsuse tegemise kuupļæ½ev"
			this.setText(2, 4, getLabel(SuperSearchFilter.MARKETER_NAME));//"EĆ�->EE toimetaja nimi"
			this.setText(3, 4, getLabel(SuperSearchFilter.PROCESSOR)); //Menetleja

			/* INPUT */
			/* column1 */
			this.setWidget(0, 1, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICANT_NAME, new TextBox()));
			this.setWidget(1, 1, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICANT_REG_NR, new TextBox()));
			this.setWidget(2, 1, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_NAME, new TextBox()));
			this.setWidget(3, 1, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_TYPE, new MultipleListBox(),"20em"));

			/* column2 */
			this.setWidget(0, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_ETHANOL_RATE, new TextBox()));
			this.setWidget(1, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_VOLUME_CODE, new ListBox()));
			this.setWidget(2, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCER_NAME, new TextBox()));
			this.setWidget(3, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCER_COUNTRY, new MultipleListBox(),"16em"));

			/* column3 */
			this.setWidget(0, 5, addFormField(SEARCH_FORM, SuperSearchFilter.REGISTRY_ENTRY_NR, new TextBox()));
			this.setWidget(1, 5, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICATION_DECISION_DATE,
					new RangeSelectBox(RangeSelectBox.CALENDAR, "5em", "5em")));
			this.setWidget(2, 5, addFormField(SEARCH_FORM, SuperSearchFilter.MARKETER_NAME, new TextBox()));
			this.setWidget(3, 5, addFormField(SEARCH_FORM,SuperSearchFilter.PROCESSOR,
					new RangeSelectTextBox(RangeSelectTextBox.TEXTBOX,"45%","45%"),"100%"));
			
		}
	}

	private class DetailedSearchFormTable extends FlexTable {
		public DetailedSearchFormTable() {
			super();

			/* LABELS */
			/* column1 */
			this.setText(0, 0, getLabel(SuperSearchFilter.APPLICANT_MTR_CODE)); //"Majandustegevuse registri registreeringu number"
			this.setText(1, 0, getLabel(SuperSearchFilter.REGISTRY_ENTRY_VALID_UNTIL)); //"Registrikande kehtivuse lĆµppkuupĆ¤ev"
			this.setText(2, 0, getLabel(SuperSearchFilter.IMPORTER_NAME)); //"Importija nimi"
			this.setText(3, 0, getLabel(SuperSearchFilter.PACKAGER_NAME)); //"Importija nimi"
			this.setText(4, 0, getLabel(SuperSearchFilter.PRODUCT_ORIGIN_COUNTRY)); //"PĆ¤ritolumaa"
			this.setText(5, 0, getLabel(SuperSearchFilter.PRODUCT_EXAMPLES_COUNT)); //"SĆ¤ilitatavad nĆ¤idised"
			this.setText(6, 0, getLabel(SuperSearchFilter.PRODUCT_NOTES));// "Toote mĆ¤rkus"
			
			/* column2 */
			this.setText(0, 2, getLabel(SuperSearchFilter.PRODUCT_KN_CODE)); //"KN Kood"
			this.setText(1, 2, getLabel(SuperSearchFilter.APPLICATION_NR)); //"Taotluse number"
			this.setText(2, 2, getLabel(SuperSearchFilter.PRODUCT_HAS_STOCKING)); //"Suka olemasolu" //XXX:true false vĆ¤Ć¤rtuste jĆ¤rgi ei saa search filtri abil otsida
			this.setText(4, 2, getLabel(SuperSearchFilter.PRODUCT_PACKING_MATERIAL)); //"Tarbijapakendi vĆµi pakendi materjal"
			this.setText(5, 2, getLabel(SuperSearchFilter.PRODUCT_BOTTLE_SHAPE)); //"Pudeli kuju"

			/* column3 */
			this.setText(0, 4, getLabel(SuperSearchFilter.APPLICANT_EXCISE_STORE_HOUSE_NR)); //"Taotleja aktsiislao tegevusloa number"
			this.setText(1, 4, getLabel(SuperSearchFilter.APPLICANT_ACKNOWLEDGEMENT_NR)); //"Taotleja aktsiislao tegevusloa number"
			this.setText(2, 4, getLabel(SuperSearchFilter.APPLICATION_ARRIVED)); //"Taotluse registreerimise aeg"
			this.setText(4, 4, getLabel(SuperSearchFilter.APPLICATION_STATE)); //"Taotluse staatus"
			this.setText(5, 4, getLabel(SuperSearchFilter.APPLICATION_DECISION_TYPE)); //"Otsuse liik"

			/* INPUT */
			/* column1 */
			this.setWidget(0, 1, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICANT_MTR_CODE, new TextBox()));
			this.setWidget(1, 1, addFormField(SEARCH_FORM, SuperSearchFilter.REGISTRY_ENTRY_VALID_UNTIL,
					new RangeSelectBox(RangeSelectBox.CALENDAR, "5em", "5em")));
			this.setWidget(2, 1, addFormField(SEARCH_FORM, SuperSearchFilter.IMPORTER_NAME, new TextBox()));
			this.setWidget(3, 1, addFormField(SEARCH_FORM, SuperSearchFilter.PACKAGER_NAME, new TextBox()));
			this.setWidget(4, 1, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_ORIGIN_COUNTRY, new MultipleListBox()));
			this.setWidget(5, 1, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_EXAMPLES_COUNT, new YesNoRadioBox()));  //"SĆ¤ilitatavad nĆ¤idised" 
			this.setWidget(6, 1, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_NOTES, new TextBox()));
			
			/* column2 */
			this.setWidget(0, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_KN_CODE, new TextBox()));
			this.setWidget(1, 3, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICATION_NR, new TextBox()));
			this.setWidget(2, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_HAS_STOCKING, new YesNoRadioBox())); //XXX:searchfilter ei vĆµimalda tegelikult true false vĆ¤Ć¤rtuste jĆ¤rgi otsida
			this.setWidget(4, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_PACKING_MATERIAL, new MultipleListBox()));
			this.setWidget(5, 3, addFormField(SEARCH_FORM, SuperSearchFilter.PRODUCT_BOTTLE_SHAPE, new MultipleListBox()));

			/* column3 */
			this.setWidget(0, 5, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICANT_EXCISE_STORE_HOUSE_NR, new TextBox()));
			this.setWidget(1, 5, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICANT_ACKNOWLEDGEMENT_NR, new TextBox()));
			this.setWidget(2, 5, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICATION_ARRIVED,
					new RangeSelectBox(RangeSelectBox.CALENDAR, "5em", "5em")));
			this.setWidget(4, 5, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICATION_STATE, new MultipleListBox(),"14em"));
			this.setWidget(5, 5, addFormField(SEARCH_FORM, SuperSearchFilter.APPLICATION_DECISION_TYPE, new MultipleListBox(),"14em"));

			this.setVisible(false);		//Hide on load..

		}
	}

	private class ColumnsFormTable extends FlexTable {

		public ColumnsFormTable() {
			super();

			this.setStyleName("Form");

			Label selectAllLabel = new Label("Märgi kõik");
			selectAllLabel.setStyleName("BoldText");

			/* LABELS */
			this.setWidget(0, 1, selectAllLabel);
			this.setWidget(1, 0, UIutils.createSpacer(1, 15));

			/* column1 */
			this.setText(2, 1, getLabel(SuperSearchFilter.APPLICANT_NAME));//"Taotleja nimi");
			this.setText(3, 1, getLabel(SuperSearchFilter.APPLICANT_REG_NR));//"Taotleja Ć¤riregistrikood");
			this.setText(4, 1, getLabel(SuperSearchFilter.APPLICANT_MTR_CODE));//"Majandustegevuse registri registreeringu number");
			this.setText(5, 1, getLabel(SuperSearchFilter.PRODUCT_TYPE));//"Toote liik");
			this.setText(6, 1, getLabel(SuperSearchFilter.PRODUCT_NAME));//"Toote nimi");
			this.setText(7, 1, getLabel(SuperSearchFilter.REGISTRY_ENTRY_NR));//"Registrikande number");
			this.setText(8, 1, getLabel(SuperSearchFilter.APPLICATION_DECISION_DATE));//"Registrikande otsuse tegemise kuupĆ¤ev");
			this.setText(9, 1, getLabel(SuperSearchFilter.REGISTRY_ENTRY_VALID_UNTIL));//"Registrikande kehtivuse lĆµppkuupĆ¤ev");
			this.setText(10, 1, getLabel(SuperSearchFilter.PRODUCT_ETHANOL_RATE));//"Etanoolisisaldus %vol");
			this.setText(11, 1, getLabel(SuperSearchFilter.PRODUCT_VOLUME));//"Maht");

			/* column2 */
			this.setText(2, 3, getLabel(SuperSearchFilter.PRODUCER_NAME));//"Tootja nimi");
			this.setText(3, 3, getLabel(SuperSearchFilter.PRODUCER_COUNTRY));//"Tootja riik");
			this.setText(4, 3, getLabel(SuperSearchFilter.PRODUCT_ORIGIN_COUNTRY));//"PĆ¤ritolumaa");
			this.setText(5, 3, getLabel(SuperSearchFilter.IMPORTER_NAME));//"Importija nimi");
			this.setText(6, 3, getLabel(SuperSearchFilter.PACKAGER_NAME));//"Importija nimi");
			this.setText(7, 3, getLabel(SuperSearchFilter.MARKETER_NAME));//"EĆ�->EE toimetaja nimi");
			this.setText(8, 3, getLabel(SuperSearchFilter.PRODUCT_KN_CODE));//"KN Kood");
			this.setText(9, 3, getLabel(SuperSearchFilter.PRODUCT_PACKING_MATERIAL));//"Tarbijapakendi vĆµi pakendi materjal");
			this.setText(10, 3, getLabel(SuperSearchFilter.PROCESSOR_FORNAME)); // Menetleja eesnimi
			this.setText(11, 3, getLabel(SuperSearchFilter.PROCESSOR_LASTNAME)); // Menetleja perekonnanimi
			

			/* column3 */
			this.setText(2, 5, getLabel(SuperSearchFilter.PRODUCT_BOTTLE_COLOR_NAME));//"Pudeli vĆ¤rvus");
			this.setText(3, 5, getLabel(SuperSearchFilter.PRODUCT_BOTTLE_SHAPE_NAME));//"Pudeli kuju");
			this.setText(4, 5, getLabel(SuperSearchFilter.PRODUCT_CORK_MATERIAL_NAME));//"Korgi materjal");
			this.setText(5, 5, getLabel(SuperSearchFilter.PRODUCT_CORK_COLOR_NAME));//"Korgi vĆ¤rvus");
			this.setText(6, 5, getLabel(SuperSearchFilter.PRODUCT_CORK_SHAPE_NAME));//"Korgi kuju");
			this.setText(7, 5, getLabel(SuperSearchFilter.PRODUCT_HAS_STOCKING));//"Suka olemasolu (jah/ei)");
			this.setText(8, 5, getLabel(SuperSearchFilter.PRODUCT_STOCKING_COLOR_NAME));//"Suka vĆ¤rvus (jah/ei)");
			this.setText(9, 5, getLabel(SuperSearchFilter.PRODUCT_HAS_FRONT_LABEL));//"Esietiketi olemasolu (jah/ei)");
			this.setText(10, 5, getLabel(SuperSearchFilter.PRODUCT_HAS_REAR_LABEL));//"Tagaetiketi olemasolu (jah/ei)");
			this.setText(11, 5, getLabel(SuperSearchFilter.PRODUCT_NOTES));//"Toote mĆ¤rkus"
			
			/* column4 */
			this.setText(2, 7, getLabel(SuperSearchFilter.PRODUCT_HAS_NECK_LABEL));//"Kaelaetiketi olemasolu (jah/ei)");
			this.setText(3, 7, getLabel(SuperSearchFilter.PRODUCT_HAS_OTHER_LABEL));//"Muu etiketi olemasolu (jah/ei)");
			this.setText(4, 7, getLabel(SuperSearchFilter.APPLICATION_NR));//"Taotluse number");
			this.setText(5, 7, getLabel(SuperSearchFilter.APPLICANT_EXCISE_STORE_HOUSE_NR));//"Taotleja aktsiislao tegevusloa number");
			this.setText(6, 7, getLabel(SuperSearchFilter.APPLICANT_ACKNOWLEDGEMENT_NR));//"KĆ¤itlemisettevĆµtte tunnustamise otsuse kuupĆ¤ev");
			this.setText(7, 7, getLabel(SuperSearchFilter.APPLICATION_ARRIVED));//"Taotluse registreerimise aeg");
			this.setText(8, 7, getLabel(SuperSearchFilter.APPLICATION_STATE));//"Taotluse staatus");
			this.setText(9, 7, getLabel(SuperSearchFilter.APPLICATION_DECISION_TYPE));//"Otsuse liik");
			this.setText(10, 7, getLabel(SuperSearchFilter.DEREGISTER_DECISION));//"VĆ¤ljakandmise otsus");
			this.setText(11, 7, getLabel(SuperSearchFilter.PRODUCT_EXAMPLES_COUNT));//"SĆ¤ilitatavad nĆ¤idised");


			/* INPUT */
			CheckBox selectAllCheckBox = new CheckBox();
			selectAllCheckBox.addClickListener(new ClickListener() {
				public void onClick(Widget sender) {
					CheckBox cb = (CheckBox) sender;
					boolean enable= cb.isChecked();
					Iterator it = columnsMap.keyList().iterator();
					while (it.hasNext()) {
						ColumnSelectCheckBox c = (ColumnSelectCheckBox) columnsMap.get(it.next());
						if (enable) {
							c.enable();
						} else {
							c.disable();
						}
					}
					if(!enable) {
						resetDefaultChecks();
					}
					resultTable.show();
				}
			});
			this.setWidget(0, 0, selectAllCheckBox);

			/* column1 */
			this.setWidget(2, 0, addCheckBox(SuperSearchFilter.APPLICANT_NAME, true));
			this.setWidget(3, 0, addCheckBox(SuperSearchFilter.APPLICANT_REG_NR, true));
			this.setWidget(4, 0, addCheckBox(SuperSearchFilter.APPLICANT_MTR_CODE, false));
			this.setWidget(5, 0, addCheckBox(SuperSearchFilter.PRODUCT_TYPE_NAME, true)); //specify name in order to get correct sorting results
			this.setWidget(6, 0, addCheckBox(SuperSearchFilter.PRODUCT_NAME, true));
			this.setWidget(7, 0, addCheckBox(SuperSearchFilter.REGISTRY_ENTRY_NR, true));
			this.setWidget(8, 0, addCheckBox(SuperSearchFilter.APPLICATION_DECISION_DATE, true));
			this.setWidget(9, 0, addCheckBox(SuperSearchFilter.REGISTRY_ENTRY_VALID_UNTIL, false));
			this.setWidget(10, 0, addCheckBox(SuperSearchFilter.PRODUCT_ETHANOL_RATE, true));
			this.setWidget(11, 0, addCheckBox(SuperSearchFilter.PRODUCT_VOLUME_NAME, true));

			/* column2 */
			this.setWidget(2, 2, addCheckBox(SuperSearchFilter.PRODUCER_NAME, true));
			this.setWidget(3, 2, addCheckBox(SuperSearchFilter.PRODUCER_COUNTRY_NAME, true));
			this.setWidget(4, 2, addCheckBox(SuperSearchFilter.PRODUCT_ORIGIN_COUNTRY_NAME, false));
			this.setWidget(5, 2, addCheckBox(SuperSearchFilter.IMPORTER_NAME, false));
			this.setWidget(6, 2, addCheckBox(SuperSearchFilter.PACKAGER_NAME, false));
			this.setWidget(7, 2, addCheckBox(SuperSearchFilter.MARKETER_NAME, false));
			this.setWidget(8, 2, addCheckBox(SuperSearchFilter.PRODUCT_KN_CODE, false));
			this.setWidget(9, 2, addCheckBox(SuperSearchFilter.PRODUCT_PACKING_MATERIAL_NAME, false));
			this.setWidget(10, 2, addCheckBox(SuperSearchFilter.PROCESSOR_FORNAME, false));
			this.setWidget(11, 2, addCheckBox(SuperSearchFilter.PROCESSOR_LASTNAME, false));
			

			/* column3 */
			this.setWidget(2, 4, addCheckBox(SuperSearchFilter.PRODUCT_BOTTLE_COLOR_NAME, false));
			this.setWidget(3, 4, addCheckBox(SuperSearchFilter.PRODUCT_BOTTLE_SHAPE_NAME, false));
			this.setWidget(4, 4, addCheckBox(SuperSearchFilter.PRODUCT_CORK_MATERIAL_NAME, false));
			this.setWidget(5, 4, addCheckBox(SuperSearchFilter.PRODUCT_CORK_COLOR_NAME, false));
			this.setWidget(6, 4, addCheckBox(SuperSearchFilter.PRODUCT_CORK_SHAPE_NAME, false));
			this.setWidget(7, 4, addCheckBox(SuperSearchFilter.PRODUCT_HAS_STOCKING, false));
			this.setWidget(8, 4, addCheckBox(SuperSearchFilter.PRODUCT_STOCKING_COLOR_NAME, false));
			this.setWidget(9, 4, addCheckBox(SuperSearchFilter.PRODUCT_HAS_FRONT_LABEL, false));
			this.setWidget(10, 4, addCheckBox(SuperSearchFilter.PRODUCT_HAS_REAR_LABEL, false));
			this.setWidget(11, 4, addCheckBox(SuperSearchFilter.PRODUCT_NOTES, false));
			
			/* column4 */
			this.setWidget(2, 6, addCheckBox(SuperSearchFilter.PRODUCT_HAS_NECK_LABEL, false));
			this.setWidget(3, 6, addCheckBox(SuperSearchFilter.PRODUCT_HAS_OTHER_LABEL, false));
			this.setWidget(4, 6, addCheckBox(SuperSearchFilter.APPLICATION_NR, false));
			this.setWidget(5, 6, addCheckBox(SuperSearchFilter.APPLICANT_EXCISE_STORE_HOUSE_NR, false));
			this.setWidget(6, 6, addCheckBox(SuperSearchFilter.APPLICANT_ACKNOWLEDGEMENT_NR, false));
			this.setWidget(7, 6, addCheckBox(SuperSearchFilter.APPLICATION_ARRIVED, false));
			this.setWidget(8, 6, addCheckBox(SuperSearchFilter.APPLICATION_STATE, false));
			this.setWidget(9, 6, addCheckBox(SuperSearchFilter.APPLICATION_DECISION_TYPE, false));
			this.setWidget(10, 6, addCheckBox(SuperSearchFilter.DEREGISTER_DECISION, false));
			this.setWidget(11, 6, addCheckBox(SuperSearchFilter.PRODUCT_EXAMPLES_COUNT, false));

			this.setVisible(false);		//Hides on load
		}

	}

	private void resetSearchForm() {
		resultTable.getFilter().reset();
		resetFormFields(SEARCH_FORM);
	}

	private void resetDefaultChecks() {
		for(int i = 0; i  < defaultChecks.size(); i++) {
			((ColumnSelectCheckBox)defaultChecks.get(i)).enable();
		}
		//resultTable.show();
	}

	private class SearchResultTable extends ResultTable {

		public void addColumn(String checkBoxKey) {
			//System.out.println("SearchForm adding column:" + checkBoxKey);
			if(isChecked(checkBoxKey)) {
				//System.out.println("isChecked");
				if (checkBoxKey.equals(SuperSearchFilter.APPLICATION_NR)) {
					this.addColumn(new Column(getLabel(checkBoxKey), checkBoxKey, null, Column.styleUrl, VIEW_APPLICATION));
				} else if (checkBoxKey.equals(SuperSearchFilter.PRODUCT_NAME)) {
					this.addColumn(new Column(getLabel(checkBoxKey), checkBoxKey, null, Column.styleUrl, VIEW_PRODUCT));
				} else {
					this.addColumn(new Column(getLabel(checkBoxKey), checkBoxKey, null, Column.styleNormal, null));
				}
			}
		}

		public SearchResultTable() {
			super(new SuperSearchFilter());
			for (Iterator i = columnsMap.keyList().iterator(); i.hasNext();) {
				addColumn((String)i.next());
			}
			
		}
		
		
		protected void renderRow(int row, ABaseDTOMap resultRow) {
			SuperSearchMap rRow = (SuperSearchMap)resultRow;
			if("true".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_FRONT_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_FRONT_LABEL,"Jah");
			} else if ("false".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_FRONT_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_FRONT_LABEL,"Ei");
			}

			if("true".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_NECK_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_NECK_LABEL,"Jah");
			} else if ("false".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_NECK_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_NECK_LABEL,"Ei");
			}

			if("true".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_OTHER_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_OTHER_LABEL,"Jah");
			} else if ("false".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_OTHER_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_OTHER_LABEL,"Ei");
			}

			if("true".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_REAR_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_REAR_LABEL,"Jah");
			} else if ("false".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_REAR_LABEL))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_REAR_LABEL,"Ei");
			}

			if("true".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_STOCKING))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_STOCKING,"Jah");
			} else if ("false".equals(rRow.getProperty(SuperSearchMap.PRODUCT_HAS_STOCKING))) {
				rRow.setProperty(SuperSearchMap.PRODUCT_HAS_STOCKING,"Ei");
			}
			
			if(rRow.getProperty(SuperSearchMap.PRODUCT_EXAMPLES_COUNT) == null ||
					(((Long)rRow.getProperty(SuperSearchMap.PRODUCT_EXAMPLES_COUNT))) == (new Long(0)) ) {
				rRow.setProperty(SuperSearchMap.PRODUCT_EXAMPLES_COUNT,"Ei");
			} else {
				rRow.setProperty(SuperSearchMap.PRODUCT_EXAMPLES_COUNT,"Jah");
			}

			super.renderRow(row, resultRow);
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

	private class RowListenerFactory implements IRowListenerFactory{
		public ClickListener create(String listenerType, final Object row) {
			if (listenerType.equals(VIEW_APPLICATION)) {
				return new ClickListener() {
					public void onClick(Widget sender) {
						SuperSearchMap rowMap = (SuperSearchMap) row;
						ApplicationSearchFilter filter = new ApplicationSearchFilter();
						HashMap queryParams = new HashMap();
						queryParams.put(ApplicationSearchFilter.NR, rowMap.getProperty(SuperSearchMap.APPLICATION_NR));
						filter.setQueryParams(queryParams);
						getRegistryService().search(filter, new AsyncCallback() {
							public void onSuccess(Object result) {
								SearchFilter resultFilter = (SearchFilter)result;
								ApplicationMap resultMap = (ApplicationMap)resultFilter.getResultsList().get(0);
								openForm(new ApplicationForm(resultMap,SearchForm.this));
							}
							public void onFailure(Throwable t) {

							}
						});
					}
				};
			} else if (listenerType.equals(VIEW_PRODUCT)) {
				return new ClickListener() {
					public void onClick(Widget sender) {
						SuperSearchMap rowMap = (SuperSearchMap) row;
						String id = (String) rowMap.getProperty(SuperSearchMap.PRODUCT_ID);
						getRegistryService().findProduct(Long.valueOf(id), new AsyncCallback() {
							public void onSuccess(Object result) {
								openForm(new ProductsForm(SearchForm.this, (ProductMap)result));
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

//	interface CheckBoxListener {
//		public void enable();
//		public void disable();
//	}
//
//	class ColumnSelectListener implements CheckBoxListener {
//
//		private String name;
//
//		public ColumnSelectListener(String name) {
//			this.name = name;
//		}
//
//		public void enable() {
//			resultTable.addColumn(name);
//			//resultTable.show();
//		}
//
//		public void disable() {
//			resultTable.removeColumn(name);
//			//resultTable.show();
//		}
//
//	}

	class ColumnSelectCheckBox extends CheckBox {

		private String columnName;
		private boolean wasEnabled;
		//private CheckBoxListener listener;

		public ColumnSelectCheckBox() {
			super();
		}

		public ColumnSelectCheckBox(String colName, boolean checked) {
			this();
			columnName = colName;
			this.setChecked(checked);
			wasEnabled = checked;
			this.addClickListener(new CheckBoxClickListener());
		}

		public void enable() {
			if (!wasEnabled) {
				this.setChecked(true);
				resultTable.addColumn(columnName);
				wasEnabled = true;
			}
		}

		public void disable() {
			if (wasEnabled) {
				this.setChecked(false);
				resultTable.removeColumn(columnName);
				wasEnabled = false;
			}
		}
		
		public void enableAndRefreshResults() {
			enable();
			resultTable.show();
		}
		
		public void disableAndRefreshResults() {
			disable();
			resultTable.show();
		}

		private class CheckBoxClickListener implements ClickListener {
			public void onClick(Widget w) {
				ColumnSelectCheckBox cb = (ColumnSelectCheckBox)w;
				if (cb.isChecked()) {
					cb.enableAndRefreshResults();
				} else if (!cb.isChecked()) {
					cb.disableAndRefreshResults();
				}
			}
		}

	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable) {
	        Window.alert(value.toString());
		} else if (key.equals(ServiceContext.COUNTRIES)) {
	        makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_ORIGIN_COUNTRY, (List) value);
	        makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCER_COUNTRY, (List) value);
	    } else if (key.equals(ServiceContext.PRODUCT_TYPE)) {
	    	makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_TYPE, (List) value);
	    } else if (key.equals(ServiceContext.PACKING_MATERIAL)) {
	    	makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_PACKING_MATERIAL, (List) value);
	    } else if (key.equals(ServiceContext.BOTTLE_SHAPE)) {
	    	makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_BOTTLE_SHAPE, (List) value);
	    } else if (key.equals(ServiceContext.APPLICATION_STATE)) {
	    	makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.APPLICATION_STATE, (List) value);
	    } else if (key.equals(ServiceContext.REGISTRY_ENTRY_DECISION_TYPE)) {
	    	makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.APPLICATION_DECISION_TYPE, (List) value);
	    } else if (key.equals(ServiceContext.PRODUCT_VOLUME)) {
	    	makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_VOLUME_CODE, (List)value);
	    }

	}

	private void addCacheListeners() {
		ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_TYPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PACKING_MATERIAL, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.BOTTLE_SHAPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.APPLICATION_STATE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.REGISTRY_ENTRY_DECISION_TYPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_VOLUME, this);
	}

	private void askClassificators() {
	      List countries = (List) ServiceContext.getInstance().getCached(ServiceContext.COUNTRIES);
	      if (countries != null) {
	         makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_ORIGIN_COUNTRY, countries);
	         makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCER_COUNTRY, countries);
	      }

	      List productTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_TYPE);
	      if (productTypes != null) {
	    	  makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_TYPE, productTypes);
	      }

	      List packingMaterials = (List) ServiceContext.getInstance().getCached(ServiceContext.PACKING_MATERIAL);
	      if (packingMaterials != null) {
	    	  makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_PACKING_MATERIAL, packingMaterials);
	      }

	      List bottleShapes = (List) ServiceContext.getInstance().getCached(ServiceContext.BOTTLE_SHAPE);
	      if (bottleShapes != null) {
	    	  makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_BOTTLE_SHAPE, bottleShapes);
	      }

	      List applicationStates = (List) ServiceContext.getInstance().getCached(ServiceContext.APPLICATION_STATE);
	      if(applicationStates != null) {
	    	  makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.APPLICATION_STATE, applicationStates);
	      }

	      List decisionTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.REGISTRY_ENTRY_DECISION_TYPE);
	      if(decisionTypes != null) {
	    	  makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.APPLICATION_DECISION_TYPE, decisionTypes);
	      }
	      List productVolumeTypes = (List)ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_VOLUME);
	      if(productVolumeTypes != null) {
	    	  makeClassSelectionList(SEARCH_FORM, SuperSearchFilter.PRODUCT_VOLUME_CODE, productVolumeTypes);
	      }
	}

}
