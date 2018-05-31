/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.poifs.property.Parent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.MainPanel;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.ExcelFormPanel;
import ee.agri.alkor.web.client.common.FieldResetButton;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoDialog;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.SelectReturnListener;
import ee.agri.alkor.web.client.common.TextListBox;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.ProductSearchFilter;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.form.EnterpriseList;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Toodete vorm.
 * 
 * @author viktorb
 */
public class ProductsForm extends Form implements CacheListener {
	
	private static final String SEARCH_FORM = "searchForm";

	public static final String MANAGE_FORM = "productManageForm";

	private boolean isExtendProduct = false;

	private ProductsTable searchResultsTable;

	private boolean change = false;

	private Label manageTitle = null;

	private Button back;
	
	private Button saveBtn = new Button();

	private boolean isSaved;

	private int asked = 0;

	public static final String getKey() {
		return "ProductsForm";
	}

	/**
	 * Toodete vormi loomine.
	 */
	public ProductsForm() {
		this((Form) null, null);
	}

	@Override
	public Object getConstantsWithLookup() {
		return GWT.create(ProductsFormKeys.class);
	}

	/**
	 * Toodete vormi loomine.
	 * 
	 * @param parent
	 *            vanem paneel.
	 */
	public ProductsForm(Form parent) {
		this(parent, null);
	}

	public ProductsForm(Form parent, ProductMap map) {
		this.parent = parent;
		if (map == null) {
			setData(new ProductMap());
		} else {
			setData(map);
			isSaved = true;
		}
	}

	public ProductsForm(SelectReturnCallback callback) {
		this(callback, null);
	}

	public ProductsForm(SelectReturnCallback callback, ProductMap productMap) {
		super(callback);
		createResultTable();
		if (productMap == null) {
			setData(new ProductMap());
		} else {
			setData(productMap);
			isSaved = true;
		}
	}

	public ProductsForm(SelectReturnCallback callback, ProductMap productMap, boolean isExtendProductValue) {
		super(callback);
		createResultTable();
		if (productMap == null) {
			setData(new ProductMap());
		} else {
			setData(productMap);
			isSaved = true;
		}

		ProductsForm.this.isExtendProduct = isExtendProductValue;
		
	}
	
	private void createResultTable(){
		searchResultsTable = new ProductsTable();
	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable)
			Window.alert(value.toString());
		else if (key.equals(ServiceContext.COUNTRIES)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.ORIGINCOUNTRY_CODE, (List) value);
			makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.PRODUCER_COUNTRY_CODE, (List) value);
			makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.ORIGINCOUNTRY_CODE, (List) value);
		} else if (key.equals(ServiceContext.PRODUCT_TYPE)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.TYPE_CODE, (List) value);
			// } else if (key.equals(ServiceContext.PRODUCT_TYPE_OTSING)) {
			// makeClassSelectionList(SEARCH_FORM,
			// ProductSearchFilter.TYPE_CODE,
			// (List) value);
		} else if (key.equals(ServiceContext.PACKING_MATERIAL)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.PACKINGMATERIAL_CODE, (List) value);
		} else if (key.equals(ServiceContext.CORK_SHAPE)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.CORKSHAPE_CODE, (List) value);
		} else if (key.equals(ServiceContext.STOCKING_COLOR)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.STOCKINGCOLOR_CODE, (List) value);
		} else if (key.equals(ServiceContext.BOTTLE_COLOR)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.BOTTLECOLOR_CODE, (List) value);
		} else if (key.equals(ServiceContext.BOTTLE_SHAPE)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.BOTTLESHAPE_CODE, (List) value);
		} else if (key.equals(ServiceContext.CORK_COLOR)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.CORKCOLOR_CODE, (List) value);
		} else if (key.equals(ServiceContext.CORK_MATERIAL)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.CORKMATERIAL_CODE, (List) value);
		} else if (key.equals(ServiceContext.DECISION_REG_ENTRY)) {
			makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.DECISION_REG_ENTRY_CODE, (List) value);
		} else if (key.equals(ServiceContext.PRODUCT_VOLUME)) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.VOLUME_CODE, (List) value);
			makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.VOLUME_CODE, (List) value);
		} else {
			makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.TYPE_CODE, (List) value);
		}

		List klassifikaatorid = (List) ServiceContext.getInstance().getSingle(ServiceContext.PRODUCT_TYPE);

		makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.TYPE_CODE, (List) klassifikaatorid);
		/*
		 * küpsib ühe korra klassifikaatorid �le ja cacheb need ära
		 */
		// if(this.asked < 20){
		// askClassificators();
		// this.asked++;
		// }

	}

	/**
	 * Kasutaja liidese komponentide initsialiseerimine.
	 */
	@Override
	public void init() {

		super.init();
		GWT.log("ProductsForm");
		ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_TYPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PACKING_MATERIAL, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.CORK_SHAPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.STOCKING_COLOR, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.BOTTLE_COLOR, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.BOTTLE_SHAPE, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.CORK_COLOR, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.CORK_MATERIAL, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.DECISION_REG_ENTRY, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_VOLUME, this);

		createResultTable();

		manageTitle = new Label(getLabel("manageTableTitle"));// "Toote
																// lisamine/muutmine"
		manageTitle.setStyleName("Title");

		SimplePanel greenLine = new SimplePanel();
		greenLine.setStyleName("Left");
		greenLine.setHeight("15px");

		HorizontalPanel manageButtons = new HorizontalPanel();
		if (parent != null) { // kui on võimalik tagasi minna, lisatakse
								// "Tagasi" nupp
			OFButton back = new OFButton(getLabel("buttonBack"), parent);// "Tagasi"
			back.setWidth("9em");
			manageButtons.add(back);
			manageButtons.add(UIutils.createSpacer(6, 1));
		}

		FormButtonsListener formListener = new FormButtonsListener();

		// registri töötajatele mõeldud nupud

		// Nupp "Muuda kehtetuks"
		Button weak = UIutils.createButton(formListener, getLabel("buttonInvalidate"));
		weak.setTabIndex(29);
		weak.setEnabled(false);
		weak.setWidth("10em");

		// Nupp "Pikenda kannet"
		Button prolong = UIutils.createButton(formListener, getLabel("buttonProlong"));
		prolong.setTabIndex(30);
		prolong.setEnabled(false);
		prolong.setWidth("9em");

		// mingi nuppude enablemise loogika
		if (getData().getProperty(ProductMap.APPLICATION) != null
				&& ((ApplicationMap) getData().getProperty(ProductMap.APPLICATION))
						.getProperty(ApplicationMap.DECISION_REG_ENTRY_CODE) != null) {
			boolean applicationRegEntry = ((ApplicationMap) getData().getProperty(ProductMap.APPLICATION))
					.getText(ApplicationMap.DECISION_REG_ENTRY_CODE).equals(ServiceConstants.APPL_STATE_RGE);
			weak.setEnabled(applicationRegEntry);
			prolong.setEnabled(applicationRegEntry);
		}
		// -- mingi nuppude enablemise loogika

		getEnableDisableButtons().add(weak);
		getEnableDisableButtons().add(prolong);

		saveBtn.setText(getLabel("buttonSave"));
		saveBtn.addClickListener(new SaveListener());
//		saveBtn = new Button(getLabel("buttonSave"), new SaveListener());// "Salvesta"
		saveBtn.setTabIndex(32);
		saveBtn.setWidth("9em");

		manageButtons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));

		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
			manageButtons.add(weak);
			manageButtons.add(UIutils.createSpacer(6, 1));
			manageButtons.add(prolong);
			manageButtons.add(UIutils.createSpacer(6, 1));
			manageButtons.add(saveBtn);
		}
		// -- registri töötajatele mõeldud nupud

		// Nupp "Tagasi" / "Taotluse juurde"
		if (getSelectReturnCallback() != null) {
			back = UIutils.createButton(new ClickListener() {
				public void onClick(Widget sender) {
					// Window.alert("Toote nimi: " +
					// getData().getProperty(ProductMap.NAME));
					// Window.alert("Toote id: " +
					// getData().getProperty(ProductMap.ID));
					// if(getData().getProperty(ProductMap.ID) != null){
					getSelectReturnCallback().setDtoData(getData());
					// }
					getSelectReturnCallback().onReturn();
					SimplePanel main = MainPanel.getBody();
					main.clear();
					main.add(getSelectReturnCallback().getReturnForm());
				}
			}, getSelectReturnCallback().getReturnForm() instanceof XTeeForm ? getLabel("forward")
					: // "Taotluse juurde"
					getLabel("buttonBack")); // "Tagasi"

			back.setWidth("9em");
			manageButtons.add(UIutils.createSpacer(6, 1));
			manageButtons.add(back);

			/*
			 * esitamata, esitatud menetlemiseks, vajab täpsustamist.
			 */

			if (!UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
				// try{
				String state = Cookies.getCookie("selectedStateCode");
				// Window.alert(state);
				if (state == null || ApplicationMap.STATE_CODE_ENTERED.equals(state)
						|| ApplicationMap.STATE_CODE_PRESENTED.equals(state)
						|| ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION.equals(state)) {
					manageButtons.add(UIutils.createSpacer(6, 1));
					manageButtons.add(saveBtn);

				}
				// } catch (Exception ex){
				//
				// }
			}
		}
		// -- Nupp "Tagasi" / "Taotluse juurde"

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, manageTitle);
		main.setWidget(1, 0, UIutils.createSpacer(800, 1));
		main.setWidget(2, 0, createManageForm());

		main.setWidget(3, 0, manageButtons);

		// otsing kõigile peale kasutajate läbi EIT-i
		if (userHasSearchPermissions()) { // keelatud avalikule ja läbi EIT-i
											// tulnud kasutajale
			Label searchTitle = new Label(getLabel("searchTableTitle"));// "Toote
																		// otsing"
			searchTitle.setStyleName("Title");

			HorizontalPanel searchButtons = new HorizontalPanel();
			Button clear = new Button(getLabel("buttonEmptyFilter"), formListener); // Tühjenda
			// filter
			Button search = new Button(getLabel("buttonSearch"), formListener); // "Otsi"
			clear.setWidth("9em");
			search.setWidth("9em");
			searchButtons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
					UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
			searchButtons.add(clear);
			searchButtons.add(UIutils.createSpacer(6, 1));
			searchButtons.add(search);

			Label nameListTitle = new Label(getLabel("listTableTitle"));// "Toodete
																		// nimekiri"
			nameListTitle.setStyleName("Title");
			main.setWidget(4, 0, searchTitle);
			main.setWidget(5, 0, greenLine);
			main.setWidget(6, 0, createSearchForm());
			main.setWidget(7, 0, searchButtons);
			main.setWidget(8, 0, nameListTitle);
			main.setWidget(10, 0, searchResultsTable);
		}

		// -- otsing kõigile peale kasutajate läbi EIT-i

		askClassificators();

		// tabeli stiilimine
		FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setWidth(10, 0, "98%");
		cellFormatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setColSpan(0, 0, 2);

		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP })) {
			cellFormatter.setHorizontalAlignment(7, 0, HasHorizontalAlignment.ALIGN_LEFT);
			cellFormatter.setColSpan(4, 0, 2);
			cellFormatter.setColSpan(5, 0, 2);
			cellFormatter.setColSpan(8, 0, 2);
		}
		// -- tabeli stiilimine

		// klassifikaatoriteküsimine

		setFormFieldsFromData(MANAGE_FORM);
		initWidget(main);

	}

	public void updateInputStates(String state, String type) {
		if (type.equals(ApplicationMap.TYPE_CODE_ARE)) { // reg kandmine
			if (state.equals(ApplicationMap.STATE_CODE_CHECKING) || state.equals(ApplicationMap.STATE_CODE_PROCESSING)
					|| state.equals(ApplicationMap.STATE_CODE_ENTERED_TO_REGISTRY)
					|| state.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY)) {
				setInputsEnabled(false);
			} else {
				setInputsEnabled(true);
			}
		} else if (type.equals(ApplicationMap.TYPE_CODE_EXTEND)) { // pikendamine
			setInputsEnabled(false);
		}
	}

	private TextBox NAME;
	private TextBox GRADE;
	private ListBox VOLUME_CODE;
	private TextListBox TYPE_CODE;
	private TextBox CODE;
	private ListBox originCountryCodeListBox;
	private TextArea ta;
	private ListBox PACKINGMATERIAL_CODE;
	private TextBox NUMBEROFLABELS;
	private ListBox BOTTLECOLOR_CODE;
	private ListBox BOTTLESHAPE_CODE;
	private ListBox CORKCOLOR_CODE;
	private ListBox CORKMATERIAL_CODE;
	private ListBox CORKSHAPE_CODE;
	private ListBox STOCKINGCOLOR_CODE;
	private CheckBox HASSTOCKING;
	private CheckBox HASFRONTLABEL;
	private CheckBox HASREARLABEL;
	private CheckBox HASNECKLABEL;
	private CheckBox HASOTHERLABEL;
	private FieldResetButton removeProducer;
	private FieldResetButton removeImporter;
	private FieldResetButton removeMarketer;
	private FieldResetButton removePackager;
	private Button addProducer;
	private Button addImporter;
	private Button addMarketer;
	private Button addPackager;

	private void setInputsEnabled(boolean enabled) {
		NAME.setEnabled(enabled);
		GRADE.setEnabled(enabled);
		VOLUME_CODE.setEnabled(enabled);
		TYPE_CODE.setEnabled(enabled);
		CODE.setEnabled(enabled);
		originCountryCodeListBox.setEnabled(enabled);
		if (ta != null) {
			ta.setEnabled(enabled);
		}
		PACKINGMATERIAL_CODE.setEnabled(enabled);
		NUMBEROFLABELS.setEnabled(enabled);
		BOTTLECOLOR_CODE.setEnabled(enabled);
		BOTTLESHAPE_CODE.setEnabled(enabled);
		CORKCOLOR_CODE.setEnabled(enabled);
		CORKMATERIAL_CODE.setEnabled(enabled);
		CORKSHAPE_CODE.setEnabled(enabled);
		STOCKINGCOLOR_CODE.setEnabled(enabled);
		HASSTOCKING.setEnabled(enabled);
		HASFRONTLABEL.setEnabled(enabled);
		HASREARLABEL.setEnabled(enabled);
		HASNECKLABEL.setEnabled(enabled);
		HASOTHERLABEL.setEnabled(enabled);

		addProducer.setEnabled(enabled);
		addImporter.setEnabled(enabled);
		addMarketer.setEnabled(enabled);
		addPackager.setEnabled(enabled);

		removeProducer.setVisible(enabled);
		removeImporter.setVisible(enabled);
		removeMarketer.setVisible(enabled);
		removePackager.setVisible(enabled);
		
		saveBtn.setEnabled(enabled);
		saveBtn.setVisible(enabled);
	}

	public void askClassificators() {

		List countries = (List) ServiceContext.getInstance().getCached(ServiceContext.COUNTRIES);
		if (countries != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.ORIGINCOUNTRY_CODE, countries);

		List productTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_TYPE);
		if (productTypes != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.TYPE_CODE, productTypes);

		List packingMaterials = (List) ServiceContext.getInstance().getCached(ServiceContext.PACKING_MATERIAL);
		if (packingMaterials != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.PACKINGMATERIAL_CODE, packingMaterials);

		List corkShapes = (List) ServiceContext.getInstance().getCached(ServiceContext.CORK_SHAPE);
		if (corkShapes != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.CORKSHAPE_CODE, corkShapes);

		List stockingColors = (List) ServiceContext.getInstance().getCached(ServiceContext.STOCKING_COLOR);
		if (stockingColors != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.STOCKINGCOLOR_CODE, stockingColors);

		List bottleColors = (List) ServiceContext.getInstance().getCached(ServiceContext.BOTTLE_COLOR);
		if (bottleColors != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.BOTTLECOLOR_CODE, bottleColors);

		List bottleShapes = (List) ServiceContext.getInstance().getCached(ServiceContext.BOTTLE_SHAPE);
		if (bottleShapes != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.BOTTLESHAPE_CODE, bottleShapes);

		List corkColors = (List) ServiceContext.getInstance().getCached(ServiceContext.CORK_COLOR);
		if (corkColors != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.CORKCOLOR_CODE, corkColors);

		List corkMaterials = (List) ServiceContext.getInstance().getCached(ServiceContext.CORK_MATERIAL);
		if (corkMaterials != null)
			makeClassSelectionList(MANAGE_FORM, ProductMap.CORKMATERIAL_CODE, corkMaterials);

		List capacityTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.CAPACITY);
		if (capacityTypes != null) {
			makeClassSelectionList(MANAGE_FORM, ProductMap.VOLUME_CODE, capacityTypes);
		}

		if (userHasSearchPermissions()) { // tegevused, mis pole EITi kasutaja
											// jaoks

			List decisionType = (List) ServiceContext.getInstance().getCached(ServiceContext.DECISION_REG_ENTRY);
			if (decisionType != null)
				makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.DECISION_REG_ENTRY_CODE, decisionType);

			if (capacityTypes != null) {
				makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.VOLUME_CODE, capacityTypes);
			}

			List klassifikaatorid = (List) ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_TYPE);
			if (klassifikaatorid != null) {
				makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.TYPE_CODE, klassifikaatorid);
			}

			/*
			 * List klassifikaatorid = (List)
			 * ServiceContext.getInstance().getSingle(ServiceContext.
			 * PRODUCT_TYPE);
			 * 
			 * if (klassifikaatorid != null) {
			 * makeClassSelectionList(SEARCH_FORM,
			 * ProductSearchFilter.TYPE_CODE, klassifikaatorid); }
			 * 
			 */

			if (countries != null) {
				makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.ORIGINCOUNTRY_CODE, countries);
				makeClassSelectionList(SEARCH_FORM, ProductSearchFilter.PRODUCER_COUNTRY_CODE, countries);
			}
		}
	}

	/**
	 * Kas kasutajal on õigus näha otsinguvormi või mitte.
	 * 
	 * @return
	 */
	private boolean userHasSearchPermissions() {
		return !UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP, ServiceConstants.ROLE_PUBLIC })
				&& Form.getUserInfo().getRoles() != null;
	}

	/**
	 * Loob otsingu elementide gruppi osa.
	 */
	private FlexTable createSearchForm() {
		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setText(0, 0, getLabel(ProductSearchFilter.NAME));// "Nimi:"
		form.setText(1, 0, getLabel(ProductSearchFilter.PRODUCER_NAME));// "Tootja:"
		form.setText(2, 0, getLabel(ProductSearchFilter.IMPORTER_NAME));// "Importija:"
		form.setText(3, 0, getLabel(ProductSearchFilter.APPLICANT_NAME));// "Taotleja:"
		form.setText(4, 0, getLabel(ProductSearchFilter.APPLICATION_NR));// "Taotluse
		// nr:"
		form.setText(0, 3, getLabel(ProductSearchFilter.GRADE_S));// "Mahuprotsent:"
		form.setText(1, 3, getLabel(ProductSearchFilter.VOLUME));// "Maht:"
		form.setText(2, 3, getLabel(ProductSearchFilter.CODE));// "KN kood:"
		form.setText(0, 6, getLabel(ProductSearchFilter.TYPE_CODE));// "Toote
		// liik:"
		form.setText(1, 6, getLabel(ProductSearchFilter.ORIGINCOUNTRY_CODE));// "PĆ¤ritolumaa:"
		form.setText(2, 6, getLabel(ProductSearchFilter.PRODUCER_COUNTRY_CODE));// "Tootjariik:"
		form.setText(3, 6, getLabel(ProductSearchFilter.DECISION_REG_ENTRY_CODE));// "Otsuse
		// liik:"
		form.setText(4, 6, getLabel(ProductSearchFilter.REGISTRY_ENTRY_VALID_UNTIL));// "Kande
		// loppkuupaev
		form.setText(5, 6, getLabel(ProductSearchFilter.DECISION_DATE));
		form.setText(6, 6, getLabel(ProductSearchFilter.INVALID_PRODUCT)); // Kehtetud
																			// tooted
		form.setWidget(0, 2, UIutils.createSpacer(10, 1));
		form.setWidget(0, 5, UIutils.createSpacer(10, 1));
		form.setWidget(0, 1, addFormField(SEARCH_FORM, ProductSearchFilter.NAME, new TextBox()));
		form.setWidget(1, 1, addFormField(SEARCH_FORM, ProductSearchFilter.PRODUCER_NAME, new TextBox()));
		form.setWidget(2, 1, addFormField(SEARCH_FORM, ProductSearchFilter.IMPORTER_NAME, new TextBox()));
		form.setWidget(3, 1, addFormField(SEARCH_FORM, ProductSearchFilter.APPLICANT_NAME, new TextBox()));
		form.setWidget(4, 1, addFormField(SEARCH_FORM, ProductSearchFilter.APPLICATION_NR, new TextBox()));
		form.setWidget(0, 4, addFormField(SEARCH_FORM, ProductSearchFilter.GRADE, new TextBox(), "8.6em"));
		form.setWidget(1, 4, addFormField(SEARCH_FORM, ProductSearchFilter.VOLUME_CODE, new ListBox(), "8.6em"));
		form.setWidget(2, 4, addFormField(SEARCH_FORM, ProductSearchFilter.CODE, new TextBox(), "8.6em"));
		form.setWidget(0, 7,
				addFormField(SEARCH_FORM, ProductSearchFilter.TYPE_CODE, new TextListBox("3.5em", "18em"), "100%"));
		form.setWidget(1, 7, addFormField(SEARCH_FORM, ProductSearchFilter.ORIGINCOUNTRY_CODE, new ListBox(), "100%"));
		form.setWidget(2, 7,
				addFormField(SEARCH_FORM, ProductSearchFilter.PRODUCER_COUNTRY_CODE, new ListBox(), "100%"));
		form.setWidget(3, 7,
				addFormField(SEARCH_FORM, ProductSearchFilter.DECISION_REG_ENTRY_CODE, new ListBox(), "100%"));
		form.setWidget(4, 7, addFormField(SEARCH_FORM, ProductSearchFilter.REGISTRY_ENTRY_VALID_UNTIL,
				new RangeSelectBox(RangeSelectBox.CALENDAR, "45%", "45%")));
		form.setWidget(5, 7, addFormField(SEARCH_FORM, ProductSearchFilter.DECISION_DATE,
				new RangeSelectBox(RangeSelectBox.CALENDAR, "45%", "45%")));
		form.setWidget(6, 7,
				addFormField(SEARCH_FORM, ProductSearchFilter.INVALID_PRODUCT, makeExpiredExcludedListbox(), "100%"));
		UIutils.setTableTextStyled(form);
		return form;
	}

	/**
	 * Listbox which includes options for searching of excluded and expired
	 * products
	 * 
	 * @return
	 */
	public ListBox makeExpiredExcludedListbox() {
		ListBox listbox = new ListBox();
		listbox.addItem("");
		listbox.addItem(getLabel("invalidProduct_expired"), "expired");
		listbox.addItem(getLabel("invalidProduct_excluded"), "excluded");
		return listbox;
	}

	/**
	 * Loob lisamise/muutmise elementide gruppi osa.
	 */
	private FlexTable createManageForm() {

		String compulsoryHTML = "<span style='color:red'>*</span>";

		boolean eitGrp = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP });
		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setText(0, 0, getLabel(ProductMap.NAME));
		form.setText(1, 0, getLabel(ProductMap.GRADE_A));
		form.setText(2, 0, getLabel(ProductMap.TYPE_CODE));
		form.setText(3, 0, getLabel(ProductMap.CODE));
		form.setText(4, 0, getLabel(ProductMap.ORIGINCOUNTRY_CODE));
		form.setText(5, 0, getLabel(ProductMap.PRODUCER_NAME));
		form.setText(6, 0, getLabel(ProductMap.PRODUCER_COUNTRY_NAME));
		form.setText(7, 0, getLabel(ProductMap.IMPORTER_NAME));
		form.setText(8, 0, getLabel(ProductMap.MARKETER_NAME));
		form.setText(9, 0, getLabel(ProductMap.PACKAGER_NAME));
		if (change) {
			form.setText(10, 0, getLabel(ProductMap.CHANGE_REASON));
		}
		String volumeLabel = getLabel(ProductMap.VOLUME);
		form.setHTML(1, 3, volumeLabel + " " + compulsoryHTML);
		form.setText(1, 5, getLabel(ProductMap.VOLUME_UNIT));

		String packingMaterialLabel = getLabel(ProductMap.PACKINGMATERIAL_CODE);
		form.setHTML(1, 7, packingMaterialLabel + " " + compulsoryHTML);
		form.setText(2, 4, getLabel(ProductMap.NUMBEROFLABELS));
		form.setText(3, 4, getLabel(ProductMap.BOTTLECOLOR_CODE));
		form.setText(4, 4, getLabel(ProductMap.BOTTLESHAPE_CODE));
		form.setText(5, 5, getLabel(ProductMap.CORKCOLOR_CODE));
		form.setText(6, 4, getLabel(ProductMap.CORKMATERIAL_CODE));
		form.setText(7, 5, getLabel(ProductMap.CORKSHAPE_CODE));
		form.setText(8, 5, getLabel(ProductMap.STOCKINGCOLOR_CODE));
		form.setText(1, 10, getLabel(ProductMap.HASSTOCKING));
		form.setText(2, 7, getLabel(ProductMap.HASFRONTLABEL));
		form.setText(3, 7, getLabel(ProductMap.HASREARLABEL));
		form.setText(4, 7, getLabel(ProductMap.HASNECKLABEL));
		form.setText(5, 8, getLabel(ProductMap.HASOTHERLABEL));

		if (!eitGrp) {
			form.setText(6, 7, getLabel(ProductMap.EXAMPLES));
			form.setText(7, 8, getLabel(ProductMap.NOTESADD));
		} else {
			form.setText(7, 8, getLabel(ProductMap.NOTES) + ":");
		}
		form.setWidget(0, 1, new Image("images/t2rn.gif"));
		form.setWidget(1, 1, new Image("images/t2rn.gif"));
		form.setWidget(2, 1, new Image("images/t2rn.gif"));
		form.setWidget(3, 1, new Image("images/t2rn.gif"));
		form.setWidget(4, 1, new Image("images/t2rn.gif"));
		form.setWidget(1, 6, UIutils.createSpacer(15, 1));
		form.setWidget(1, 9, UIutils.createSpacer(15, 1));

		NAME = new TextBox();
		NAME.setTabIndex(1);
		form.setWidget(0, 2, addFormField(MANAGE_FORM, ProductMap.NAME, NAME, "100%", null, "required"));
		GRADE = new TextBox();
		GRADE.setTabIndex(2);
		form.setWidget(1, 2, addFormField(MANAGE_FORM, ProductMap.GRADE, GRADE, "4em", null, "required, number"));
		VOLUME_CODE = new ListBox();
		VOLUME_CODE.setTabIndex(3);
		form.setWidget(1, 4, addFormField(MANAGE_FORM, ProductMap.VOLUME_CODE, VOLUME_CODE, "15em", null, "required"));

		TYPE_CODE = new TextListBox("3.5em", "100%");
		TYPE_CODE.setListTabIndex(5);
		TYPE_CODE.setTextTabIndex(4);
		form.setWidget(2, 2, addFormField(MANAGE_FORM, ProductMap.TYPE_CODE, TYPE_CODE, "100%", null, "required"));
		CODE = new TextBox();
		CODE.setTabIndex(6);
		form.setWidget(3, 2,
				addFormField(MANAGE_FORM, ProductMap.CODE, CODE, "100%", null, "required, number, length[8,12]"));

		originCountryCodeListBox = new ListBox();
		originCountryCodeListBox.setWidth("5");
		originCountryCodeListBox.setTabIndex(7);
		form.setWidget(4, 2, addFormField(MANAGE_FORM, ProductMap.ORIGINCOUNTRY_CODE, originCountryCodeListBox, "100%",
				null, "required"));

		form.setWidget(5, 2,
				addFormField(MANAGE_FORM, ProductMap.PRODUCER_NAME, new TextBox(), "100%", "DisabledTextBox"));
		form.setWidget(6, 2,
				addFormField(MANAGE_FORM, ProductMap.PRODUCER_COUNTRY_NAME, new TextBox(), "100%", "DisabledTextBox"));
		form.setWidget(7, 2,
				addFormField(MANAGE_FORM, ProductMap.IMPORTER_NAME, new TextBox(), "100%", "DisabledTextBox"));
		form.setWidget(8, 2,
				addFormField(MANAGE_FORM, ProductMap.MARKETER_NAME, new TextBox(), "100%", "DisabledTextBox"));
		form.setWidget(9, 2,
				addFormField(MANAGE_FORM, ProductMap.PACKAGER_NAME, new TextBox(), "100%", "DisabledTextBox"));

		if (change) {
			ta = new TextArea();
			form.setWidget(10, 2, addFormField(MANAGE_FORM, ProductMap.CHANGE_REASON, ta, "100%"));
		}

		PACKINGMATERIAL_CODE = new ListBox();
		PACKINGMATERIAL_CODE.setTabIndex(14);
		form.setWidget(1, 8, addFormField(MANAGE_FORM, ProductMap.PACKINGMATERIAL_CODE, PACKINGMATERIAL_CODE, "100%",
				null, "required"));
		NUMBEROFLABELS = new TextBox();
		NUMBEROFLABELS.setTabIndex(15);
		form.setWidget(2, 5,
				addFormField(MANAGE_FORM, ProductMap.NUMBEROFLABELS, NUMBEROFLABELS, "10em", null, Validators.INTEGER));
		BOTTLECOLOR_CODE = new ListBox();
		BOTTLECOLOR_CODE.setTabIndex(16);
		form.setWidget(3, 5, addFormField(MANAGE_FORM, ProductMap.BOTTLECOLOR_CODE, BOTTLECOLOR_CODE, "100%"));
		BOTTLESHAPE_CODE = new ListBox();
		BOTTLESHAPE_CODE.setTabIndex(17);
		form.setWidget(4, 5, addFormField(MANAGE_FORM, ProductMap.BOTTLESHAPE_CODE, BOTTLESHAPE_CODE, "100%"));
		CORKCOLOR_CODE = new ListBox();
		CORKCOLOR_CODE.setTabIndex(18);
		form.setWidget(5, 6, addFormField(MANAGE_FORM, ProductMap.CORKCOLOR_CODE, CORKCOLOR_CODE, "100%"));
		CORKMATERIAL_CODE = new ListBox();
		CORKMATERIAL_CODE.setTabIndex(19);
		form.setWidget(6, 5, addFormField(MANAGE_FORM, ProductMap.CORKMATERIAL_CODE, CORKMATERIAL_CODE, "100%"));
		CORKSHAPE_CODE = new ListBox();
		CORKSHAPE_CODE.setTabIndex(20);
		form.setWidget(7, 6, addFormField(MANAGE_FORM, ProductMap.CORKSHAPE_CODE, CORKSHAPE_CODE, "100%"));
		STOCKINGCOLOR_CODE = new ListBox();
		STOCKINGCOLOR_CODE.setTabIndex(21);
		form.setWidget(8, 6, addFormField(MANAGE_FORM, ProductMap.STOCKINGCOLOR_CODE, STOCKINGCOLOR_CODE, "100%"));
		HASSTOCKING = new CheckBox();
		HASSTOCKING.setTabIndex(22);
		form.setWidget(1, 11, addFormField(MANAGE_FORM, ProductMap.HASSTOCKING, HASSTOCKING));
		HASFRONTLABEL = new CheckBox();
		HASFRONTLABEL.setTabIndex(23);
		form.setWidget(2, 8, addFormField(MANAGE_FORM, ProductMap.HASFRONTLABEL, HASFRONTLABEL));
		HASREARLABEL = new CheckBox();
		HASREARLABEL.setTabIndex(24);
		form.setWidget(3, 8, addFormField(MANAGE_FORM, ProductMap.HASREARLABEL, HASREARLABEL)); // TODO
																								// 2
		HASNECKLABEL = new CheckBox();
		HASNECKLABEL.setTabIndex(25);
		// HASNECKLABEL
		form.setWidget(4, 8, addFormField(MANAGE_FORM, ProductMap.HASNECKLABEL, HASNECKLABEL));
		HASOTHERLABEL = new CheckBox();
		HASOTHERLABEL.setTabIndex(26);
		form.setWidget(5, 9, addFormField(MANAGE_FORM, ProductMap.HASOTHERLABEL, HASOTHERLABEL));

		addProducer = UIutils
				.createOFButton(new EnterpriseList(new SelectReturnCallback(this, MANAGE_FORM, ProductMap.PRODUCER),
						(EnterpriseMap) getData().getProperty(ProductMap.PRODUCER), EnterpriseMap.PRO));
		addProducer.setTabIndex(8);
		form.setWidget(5, 3, addProducer);

		addImporter = UIutils
				.createOFButton(new EnterpriseList(new SelectReturnCallback(this, MANAGE_FORM, ProductMap.IMPORTER),
						(EnterpriseMap) getData().getProperty(ProductMap.IMPORTER), EnterpriseMap.IMP));
		addImporter.setTabIndex(10);
		form.setWidget(7, 3, addImporter);

		addMarketer = UIutils
				.createOFButton(new EnterpriseList(new SelectReturnCallback(this, MANAGE_FORM, ProductMap.MARKETER),
						(EnterpriseMap) getData().getProperty(ProductMap.MARKETER), EnterpriseMap.MAR));
		addMarketer.setTabIndex(12);
		form.setWidget(8, 3, addMarketer);
		addPackager = UIutils
				.createOFButton(new EnterpriseList(new SelectReturnCallback(this, MANAGE_FORM, ProductMap.PACKAGER),
						(EnterpriseMap) getData().getProperty(ProductMap.PACKAGER), EnterpriseMap.PAC));
		form.setWidget(9, 3, addPackager);

		// Reset buttons
		removeProducer = new FieldResetButton("X", this, MANAGE_FORM, ProductMap.PRODUCER);
		removeProducer.setTabIndex(9);
		form.setWidget(5, 4, removeProducer);

		removeImporter = new FieldResetButton("X", this, MANAGE_FORM, ProductMap.IMPORTER);
		removeImporter.setTabIndex(11);
		form.setWidget(7, 4, removeImporter);

		removeMarketer = new FieldResetButton("X", this, MANAGE_FORM, ProductMap.MARKETER);
		removeMarketer.setTabIndex(13);
		form.setWidget(8, 4, removeMarketer);
		removePackager = new FieldResetButton("X", this, MANAGE_FORM, ProductMap.PACKAGER);
		form.setWidget(9, 4, removePackager);
		Button butFiles = null;
		Button but = null;

		if (!eitGrp) {
			// Reset buttons end
			butFiles = UIutils.createButton(new FormButtonsListener(new ProductDocumentsForm(this)));
			butFiles.setTabIndex(27);

			// if the application has any documents then the documents button is
			// enabled
			butFiles.setEnabled(getData().getProperty(ProductMap.ID) != null);

			getEnableDisableButtons().add(butFiles);
			form.setWidget(6, 8, butFiles);
		}

		but = UIutils.createButton(new FormButtonsListener(new ProductNotesForm(this)));
		but.setTabIndex(28);
		but.setEnabled(true);

		form.setWidget(7, 9, but);

		UIutils.setTableTextStyled(form);
		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		cellFormatter.setHorizontalAlignment(1, 2, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(1, 5, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setColSpan(0, 2, 10);
		cellFormatter.setColSpan(2, 2, 4);
		cellFormatter.setColSpan(3, 2, 4);
		cellFormatter.setColSpan(4, 2, 4);
		cellFormatter.setColSpan(5, 2, 3);
		cellFormatter.setColSpan(6, 2, 4);
		cellFormatter.setColSpan(7, 2, 3);
		cellFormatter.setColSpan(8, 2, 3);
		cellFormatter.setColSpan(9, 2, 3);

		/*
		 * kui pole õiguseid näha või lihtsalt read-only, siis disabletakse
		 * väljad
		 */

		if (!getEditPermission() && !eitGrp) {
			GWT.log("Väljad keelatud!");
			UIutils.setElementsEnabled(form, false);
			but.setEnabled(true); // märkuste nupp peab ikkagi olema lubatud..
			butFiles.setVisible(true);
			butFiles.setEnabled(true);
//			saveBtn.setVisible(false);
		}

		return form;
	}

	private boolean getEditPermission() {
		Form parent = getSelectReturnCallback() == null ? null : getSelectReturnCallback().getReturnForm();
		return UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })
				|| (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP })
						&& !(parent != null && parent instanceof XTeeForm && // järgnevate
																				// olekutega
																				// toote
																				// andmete
																				// muutmine
																				// pole
																				// lubatud
		(((XTeeForm) parent).getButtonState().equals(XTeeForm.FormButtonState.MENETLUSES)
				|| ((XTeeForm) parent).getButtonState().equals(XTeeForm.FormButtonState.TAGASI)
				|| ((XTeeForm) parent).getIsPik()
				|| ((XTeeForm) parent).getButtonState().equals(XTeeForm.FormButtonState.KANTUD))));
	}

	public void updateProduct(ABaseDTOMap data) {
		setData(data);
		setFormFieldsFromData(MANAGE_FORM);
		searchResultsTable.updateDataRow(data);
	}

	private class ProductsTable extends ResultTable {

		public ProductsTable() {
			super(new ProductSearchFilter(), new ClickListener()  {

				public void onClick(Widget sender) {
					Map map = getFormFieldValues(SEARCH_FORM);
					String value = (String) map.get(ProductSearchFilter.INVALID_PRODUCT);
					if (value != "") {
						if (value == "expired") {
							map.put(ProductSearchFilter.REGISTRY_ENTRY_VALID_UNTIL,
									ProductSearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE);
							map.put(ProductSearchFilter.REGISTRY_ENTRY_CHANGE_REASON, ServiceConstants.EXPIRED_REASON);
						} else if (value == "excluded") {
							map.put(ProductSearchFilter.REGISTRY_ENTRY_VALID_UNTIL,
									ProductSearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE);
							map.put(ProductSearchFilter.REGISTRY_ENTRY_CHANGE_REASON_NOT_LIKE, ServiceConstants.EXPIRED_REASON);
						}
						map.remove(ProductSearchFilter.INVALID_PRODUCT);
					} else {
						map.remove(ProductSearchFilter.INVALID_PRODUCT);
					}
					searchResultsTable.getFilter().setQueryParams(map);
					searchResultsTable.getFilter().setQueryTextValues(getFormFieldValueTexts(SEARCH_FORM));
					searchResultsTable.getExcelFormPanel().doExcelSubmit();
				}

			}, true);
			
			boolean hasPriviledge = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });

			addColumn(new Column(getLabel("tableApplicatntName"), ProductMap.APPLICANT_NAME, null, Column.styleUrl,
					ResultTable.VIEW_DATA));
			addColumn(new Column(getLabel("tableRegistryNr"), ProductMap.REGISTRY_ENTRY_NR, Column.styleNormal));
			addColumn(new Column(getLabel("tableDecisionDate"), ProductMap.DECISION_DATE, Column.styleNormal));
			addColumn(new Column(getLabel("registryEntryApplication_registryEntry_validUntil_result"),
					ProductMap.REGISTRY_ENTRY_VALID_UNTIL, Column.styleNormal));
			addColumn(new Column(getLabel("tableProductName"), ProductMap.NAME, Column.styleNormal));
			addColumn(new Column(getLabel("tableProductGrade"), ProductMap.GRADE, Column.styleNormal));
			addColumn(new Column(getLabel("tableProductVolume"), ProductMap.VOLUME_NAME, Column.styleNormal));
			addColumn(new Column(getLabel("tableProducerName"), ProductMap.PRODUCER_NAME, Column.styleNormal));
			addColumn(
					new Column(getLabel("tableProducerCountry"), ProductMap.PRODUCER_COUNTRY_NAME, Column.styleNormal));
			addColumn(new Column(getLabel("tableProductType"), ProductMap.TYPE_NAME, Column.styleNormal));
			addColumn(new Column(getLabel(ProductMap.NOTES), ProductMap.NOTES, Column.styleNormal));

			if (hasPriviledge) {
				addColumn(Column.getSelectInstance()); // "vali"
				addColumn(Column.getChangeInstance()); // "muuda"
				addColumn(Column.getCopyInstance()); // "kopeeri"
				addColumn(Column.getDeleteInstance()); // "kustuta"
			} else {
				addColumn(Column.getViewInstance()); // "vaata"
			}
			
		}

		@Override
		public void getData(SearchFilter filter) {
			ServiceContext.getInstance().getRegistryService().search(filter, this);
		}

		@Override
		protected IRowListenerFactory getRowListenerFactory() {
			return new RowListenterFactory();
		}

		@Override
		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
			if (row.getProperty(ProductMap.APPLICATION) != null) {
				String stateCode = (String) ((ApplicationMap) row.getProperty(ProductMap.APPLICATION))
						.getProperty(ApplicationMap.STATE_CODE);
				if (ServiceConstants.APPL_STATE_RGE.equals(stateCode)) {
					String dateString = ((RegistryEntryMap) ((ApplicationMap) row.getProperty(ProductMap.APPLICATION))
							.getProperty(ApplicationMap.REGISTRY_ENTRY)).getText(RegistryEntryMap.VALID_UNTIL);
					if (dateString != null) {
						Date date = new Date();
						date.setYear(Integer.parseInt(dateString.substring(dateString.lastIndexOf(".") + 1)) - 1900);
						date.setMonth(Integer.parseInt(
								dateString.substring(dateString.indexOf(".") + 1, dateString.lastIndexOf("."))) - 1);
						date.setDate(Integer.parseInt(dateString.substring(0, dateString.indexOf("."))));
						long difference = date.getTime() - new Date().getTime();
						if (difference <= (1000L * 60L * 60L * 24L * 60L)) {
							return "Purple";
						}
					}
				}
			}

			return null;
		}

		@Override
		protected String getSpecialColumnText(Column col, ABaseDTOMap row) {

			if (col.getText().equals(Column.SELECT)) {
				if (row.getProperty(ProductMap.APPLICATION) == null
						|| (isExtendProduct && row.getProperty(ProductMap.APPLICATION) != null)) {
					return col.getText();
				} else {
					return null;
				}
			} else {
				return col.getText();
			}

		}

		@Override
		protected void renderRow(int row, ABaseDTOMap resultRow) {
			super.renderRow(row, resultRow);
			if (resultRow.getProperty(ProductMap.APPLICATION) != null) {

			}

			//
			// if(resultRow == null){
			// return;
			// }
			// String rowStyle = getRowStyleName(row, resultRow);
			// if(rowStyle == null)
			// rowStyle = getDefaultRowStyleName(row);
			//
			// resultTable.getRowFormatter().setStyleName(row, rowStyle);
			//
			// resultTable.setText(row, 0, Integer.toString(row
			// + searchFilter.getStartIndex()));
			// // Iterator set = resultRow.keySet().iterator();
			// // while(set.hasNext()){
			// // Object o = set.next();
			// // Window.alert("key on:"+o);
			// // Window.alert("objektid on:"+resultRow.get(o));
			// // }
			// for (int i = 1; i < columnList.size(); i++) {
			// Column col = (Column) columnList.get(i);
			// Label text = null;
			// if (col.getProperty() != null) {
			// //Window.alert("kĆ¼sime:"+col.getProperty());
			// String value = (String) resultRow.getText(col.getProperty());
			// text = new Label((value == null) ? "" : value);
			// } else {
			// text = new Label(getSpecialColumnText(col, resultRow));
			// }
			// text.addStyleName(getStyle(col, resultRow));
			//
			// if (col.getRowListenerType() != null) {
			// text.addClickListener(getRowListenerFactory().create(
			// col.getRowListenerType(), resultRow));
			// }
			// resultTable.setWidget(row, i, text);// esimene rida/veerg on
			// alati
			// // tĆ¤idetud
			// }
		}

	}

	private class RowListenterFactory implements IRowListenerFactory {

		public ClickListener create(String listenerType, final Object row) {

			if (ResultTable.SELECT.equals(listenerType)) {
				ProductsForm.this.change = true;
				return new SelectReturnListener(ProductsForm.this, (ProductMap) row);

			} else if (ResultTable.CHANGE.equals(listenerType)) {
				return new ClickListener() {

					public void onClick(Widget sender) {
						setData((ProductMap) row);
						isSaved = true;
						// checkGrade();
						setFormFieldsFromData(MANAGE_FORM);
						setButtonsEnabled(true);
						jumpToTop();

					}

				};
			} else if (ResultTable.DELETE.equals(listenerType)) {
				return new ClickListener() {

					public void onClick(Widget sender) {
						new ConfirmDialog(getLabel("deleteProductConfirmMsg"), new DeleteListener(row));
					}

				};
			} else if (ResultTable.VIEW.equals(listenerType)) {
				return new ClickListener() {

					public void onClick(Widget sender) {
						setData((ProductMap) row);
						// checkGrade();
						setFormFieldsFromData(MANAGE_FORM);
						setButtonsEnabled(true);
					}

				};
			} else if (listenerType.equals(ResultTable.COPY)) {
				return new ClickListener() {

					public void onClick(Widget sender) {
						setData((ProductMap) row);
						getData().setProperty(ProductMap.ID, null);
						// checkGrade();
						getData().setProperty(ProductMap.APPLICATION, null);
						getData().setProperty(ProductMap.CREATED, null);
						getData().setProperty(ProductMap.VERSION, null);
						setFormFieldsFromData(MANAGE_FORM);
						jumpToTop();
						setButtonsEnabled(false);

					}

				};
			} else if (listenerType.equals(ResultTable.VIEW_DATA)) {
				// click listener tahat enebles the user to view an application
				return new ClickListener() {

					public void onClick(Widget sender) {
						ABaseDTOMap appMap = (ABaseDTOMap) ((ProductMap) row).getProperty(ProductMap.APPLICATION);
						if (appMap != null) {
							openForm(new ApplicationForm((ApplicationMap) appMap));
						}
					}
				};
			}

			return null;
		}

	}

	/**
	 * Toodete kustutamise kuular.
	 * 
	 * @author viktorb
	 */
	private class DeleteListener implements ClickListener, AsyncCallback {

		private final Object row;

		public DeleteListener(Object row) {
			this.row = row;
		}

		public void onClick(Widget sender) {
			ServiceContext.getInstance().getRegistryService()
					.deleteProduct((Long) ((ProductMap) row).get(ProductMap.ID), this);
		}

		public void onFailure(Throwable caught) {
			setError(caught.toString());
		}

		public void onSuccess(Object result) {
			if (((Boolean) result).booleanValue() == true) {
				searchResultsTable.deleteDataRow((Long) result);
				setInfo(getLabel("deleteProductSucceeded"));
			} else {
				setError(getLabel("deleteProductUnsucceeded"));
			}
		}

	}

	private class SaveListener implements ClickListener {

		public void onClick(Widget sender) {
			saveBtn.setEnabled(false);
			saveProduct();
		}

		private void saveProduct() {
			// Change any commas into dots
			TextBox tb = (TextBox) getFormField(MANAGE_FORM, ProductMap.GRADE);
			tb.setText(comaToDot(tb.getText()));

			/*
			 * System.out.println("producer code in form:"+getFormFieldValue(
			 * MANAGE_FORM, ProductMap.PRODUCER_COUNTRY_CODE));
			 * System.out.println ("producer code in data:"
			 * +getData().getProperty( ProductMap.PRODUCER_COUNTRY_CODE));
			 * 
			 * System.out.println(" before - origin:"+( getData() != null ? (
			 * getData ().getProperty(ProductMap.ORIGINCOUNTRY_CODE)+" name:"
			 * +getData ().getProperty(ProductMap.ORIGINCOUNTRY_NAME) +
			 * " producer:"+getData
			 * ().getProperty(ProductMap.PRODUCER_COUNTRY_CODE )+" name:"
			 * +getData( ).getProperty(ProductMap.PRODUCER_COUNTRY_NAME) ) :
			 * "getData() is null" ));
			 */

			// Object oldProducerCountryValue =
			// getData().getProperty(ProductMap.PRODUCER_COUNTRY_CODE);

			setDataFromFormFields(MANAGE_FORM);

			// Object newOriginCountryValue =
			// getData().getProperty(ProductMap.ORIGINCOUNTRY_CODE);

			/*
			 * System.out.println(" getData().setProperty- origin:"+( getData()
			 * != null ? ( getData().getProperty(ProductMap.ORIGINCOUNTRY_CODE)+
			 * " name:" +getData().getProperty(ProductMap.ORIGINCOUNTRY_NAME) +
			 * " producer:"
			 * +getData().getProperty(ProductMap.PRODUCER_COUNTRY_CODE )+
			 * " name:"+ getData().getProperty(ProductMap.PRODUCER_COUNTRY_NAME)
			 * ) : "getData() is null" ));
			 */

			if (hasErrors()) {
				showErrors();
				saveBtn.setEnabled(true);
			} else {
				ServiceContext.getInstance().getRegistryService()
						.saveOrUpdateProduct((ProductMap) cleanDataBeforeSave(getData()), new AsyncCallback() {
							public void onFailure(Throwable caught) {
								setError(caught.toString());
								saveBtn.setEnabled(true);

							}

							public void onSuccess(Object result) {
								ProductsForm.this.setData((ProductMap) result);
								ProductsForm.this.setButtonsEnabled(true);
								ProductsForm.this.setInfo(getLabel("productSavedMsg"));
								isSaved = true;
								searchResultsTable.updateDataRow((ProductMap) result);
								back.setEnabled(true); // tekib NPE kui
														// kasutada
														// menüüpunkti
														// "Tooted"
								// searchResultsTable.getData();
								if (getSelectReturnCallback() != null
										&& !(getSelectReturnCallback().getReturnForm() instanceof XTeeForm)) {
									getSelectReturnCallback().returnToParentWithData((ProductMap) result,
											ProductsForm.this);
								} else {

								}
								saveBtn.setEnabled(true);
							}
						});
			}
		}
	}

	/**
	 * Vormi nuppude kuular.
	 * 
	 * @author viktorb
	 * 
	 */
	private class FormButtonsListener implements ClickListener, AsyncCallback {

		private Form form;

		public FormButtonsListener() {
		}

		public FormButtonsListener(Form form) {
			this.form = form;
		}

		public void onClick(Widget sender) {
			String text = ((Button) sender).getText();
			if (getLabel("buttonEmptyFilter").equals(text)) {
				isSaved = false;
				clearSearchFilter();
			} else if (getLabel("buttonSearch").equals(text)) {
				((TextBox) getFormField(SEARCH_FORM, ProductSearchFilter.GRADE))
						.setText(comaToDot(((TextBox) getFormField(SEARCH_FORM, ProductSearchFilter.GRADE)).getText()));
				searchProducts();
			} else if (getLabel("buttonInvalidate").equals(text)) {
				invalidateProduct();
			} else if (getLabel("buttonProlong").equals(text)) {
				prolongRegisty();
			} else if (getLabel("buttonEmpty").equals(text)) {
				clearManageForm();
			} else if (getLabel("buttonSave").equals(text)) {
				saveProduct();
			} else {
				if (form != null) {
					if (form instanceof ProductNotesForm) {
						form = new ProductNotesForm(ProductsForm.this, !getEditPermission(), isSaved);
					} else if (form instanceof ProductDocumentsForm) {
						form = new ProductDocumentsForm(ProductsForm.this);
					}
					form.setData(getData());
					openForm(form);
				}

			}

		}

		public void onFailure(Throwable caught) {
			setError(caught.toString());
		}

		public void onSuccess(Object result) {
			ProductsForm.this.setData((ProductMap) result);
			ProductsForm.this.setButtonsEnabled(true);
			ProductsForm.this.setInfo(getLabel("productSavedMsg"));
			searchResultsTable.updateDataRow((ProductMap) result);
			// searchResultsTable.getData();
			if (getSelectReturnCallback() != null) {
				returnToParentWithData();
			}
		}

		/**
		 * Toode salvestamine.
		 */
		private void saveProduct() {
			// System.out
			// .println(getFormFieldValue(MANAGE_FORM, ProductMap.VOLUME));
			setDataFromFormFields(MANAGE_FORM);
			// System.out.println((getData().getProperty(ProductMap.VOLUME)));
			ProductMap product = (ProductMap) cleanDataBeforeSave(getData());
			if (ProductsForm.this.getErrors() != null && !ProductsForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					ProductsForm.this.setError((String) getErrors().get(i));
				}
			} else {
				ServiceContext.getInstance().getRegistryService().saveOrUpdateProduct(product, this);
			}
		}

		/**
		 * Toode halduse vormi tĆ¼hjendamine.
		 */
		private void clearManageForm() {
			setData(new ProductMap());
			resetFormFields(MANAGE_FORM);
			setButtonsEnabled(false);
		}

		/**
		 * Kanne pikendamisse vormi avamine.
		 */
		private void prolongRegisty() {
			ProductExtendForm newForm = new ProductExtendForm(ProductsForm.this, (ProductMap) getData());
			openForm(newForm);
		}

		/**
		 * Toode kehtetuks muutmine.
		 */
		private void invalidateProduct() {
			ProductInvalidationForm newForm = new ProductInvalidationForm(ProductsForm.this, (ProductMap) getData());
			openForm(newForm);
		}

		/**
		 * Toodete otsing.
		 */
		private void searchProducts() {
			searchResultsTable.getFilter().setOrderBy(ProductMap.NAME);
			Map map = getFormFieldValues(SEARCH_FORM);
			String value = (String) map.get(ProductSearchFilter.INVALID_PRODUCT);
			if (value != "") {
				if (value == "expired") {
					map.put(ProductSearchFilter.REGISTRY_ENTRY_VALID_UNTIL,
							ProductSearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE);
					map.put(ProductSearchFilter.REGISTRY_ENTRY_CHANGE_REASON, ServiceConstants.EXPIRED_REASON);
				} else if (value == "excluded") {
					map.put(ProductSearchFilter.REGISTRY_ENTRY_VALID_UNTIL,
							ProductSearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE);
					map.put(ProductSearchFilter.REGISTRY_ENTRY_CHANGE_REASON_NOT_LIKE, ServiceConstants.EXPIRED_REASON);
				}
				map.remove(ProductSearchFilter.INVALID_PRODUCT);
			} else {
				map.remove(ProductSearchFilter.INVALID_PRODUCT);
			}
			if (!hasErrors())
				searchResultsTable.getData(map);
			jumpToTop();
		}

		/**
		 * Otsingu vormi (filtri) tĆ¼hjendamine.
		 */
		private void clearSearchFilter() {
			searchResultsTable.getFilter().reset();
			resetFormFields(SEARCH_FORM);
		}

	}

	public void checkGrade() {
		if (data.getProperty(ProductMap.GRADE) != null) {
			String valueString = data.getProperty(ProductMap.GRADE).toString();
			if (valueString.endsWith(".00")) {
				int endPoint = valueString.indexOf(".");
				String newValue = valueString.substring(0, endPoint);
				data.setProperty(ProductMap.GRADE, newValue);

			}
			return;
		}
	}

	public Form getParentForm() {
		return parent;
	}

}