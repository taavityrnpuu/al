package ee.agri.alkor.web.client.form.xtee;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoDialog;
import ee.agri.alkor.web.client.common.InfoPanel;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.TextListBox;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ApplicationSearchFilter;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.form.appl.ApplicationDocumentsForm;
import ee.agri.alkor.web.client.form.appl.ApplicationNoteForm;
import ee.agri.alkor.web.client.form.appl.ProductsForm;
import ee.agri.alkor.web.service.ServiceConstants;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.CalendarUtil;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.MainPanel;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.TextListBox;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ApplicationSearchFilter;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.MtrLicenseMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.client.dto.UserManageMap;
import ee.agri.alkor.web.client.form.EnterpriseDetails;
import ee.agri.alkor.web.client.form.EnterpriseList;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.ServiceConstants;

import ee.agri.alkor.web.client.form.appl.ApplicationForm;

public class XTeeForm extends Form implements CacheListener {

	public static final String getKey() {
		return "XTeeForm";
	}

	private static final String CHANGE_FORM = "changeForm";
	private static final String SEARCH_FORM = "searchForm";

	public enum FormState {
		/** vormi avamine või kui on clearitud */
		EMPTY,
		/** Registrikande taotluse esitamine. */
		INSERTING_ADD,
		/**
		 * Registrikande taotluse muutmine. Võimalik ainult siis, kui staatus
		 * on "Vajab täpsustamist".
		 */
		INSERTING_MOD,
		/** Pikendamistaotluse esitamine. */
		EXTENDING_ADD,
		/**
		 * Pikendamistaotluse muutmine. Võimalik ainult siis, kui staatus on
		 * "Vajab täpsustamist".
		 */
		EXTENDING_MOD,
		/**
		 * Kui olek on "Esitatud menetlemiseks", "Kontrollimisel", "Menetluses"
		 * või "Registrisse kantud". Vorm mittemuudetav!
		 */
		SELECTING_RO
	}

	public enum FormButtonState {
		// TYHI
		TYHI,
		// TOODE ON VALITUD
		TOODE_VALITUD,
		// ESITAMATA
		ESITAMATA,
		// ESITATUD MENETLUSEKS
		ESITATUD,
		// KONTROLLIMISEL, MENETLUSES
		MENETLUSES,
		// VAJAB TAPSUSTAMIST
		TAPSUSTA,
		// REGISTRISSE KANTUD
		KANTUD,
		// TAGASI LÜKATUD
		TAGASI
	}

	/**
	 * Pikendamise riigilõivu suurus
	 */
	private static final String EXTEND_STATE_FEE_AMOUNT = "4";

	private FormState formState;
	private FormButtonState formButtonState;
	private boolean isSaved;
	private String registryCode;
	private ManageForm manageForm;
	private SearchForm searchForm;
	private ApplicationsTable searchResultsTable;
	private FlexTable main;
	private boolean straightToCtl;
	private boolean isPikTaotlus;
	private boolean isLilla;

	/**
	 * Taotluste vormi loomine.
	 */
	public XTeeForm() {
		this(new ApplicationMap());
	}

	public XTeeForm(ApplicationMap map) {
		this(map, null);
	}

	public XTeeForm(ApplicationMap map, Form parent) {
		super();
		setData(map);
		this.parent = parent;
	}

	@Override
	public Object getConstantsWithLookup() {
		return GWT.create(XTeeFormMessages.class);
	}

	@Override
	public void init() {
		super.init();
		// loome ülemise vormi
		manageForm = new ManageForm();

		// loome taotluste otsingu vormi
		searchForm = new SearchForm();

		// loome tulemuste tabeli osa
		Label nameListTitle = new Label(getLabel("listTableTitle")); // "Taotluste nimekiri";
		nameListTitle.setStyleName("Title");

		// tulemuste tabeli loomine
		searchResultsTable = new ApplicationsTable();

		// tulemuste järjestamise reeglid
		
		// sort kasutuste järjekord on vastupidine mapi lisamisega võrreldes
		searchResultsTable.getFilter().addSortItem("arrived", SearchFilter.DESCENDING, 3);
		searchResultsTable.getFilter().addSortItem("nr", SearchFilter.DESCENDING, 2);
		searchResultsTable.getFilter().addSortItem("state.orderNr", SearchFilter.ASCENDING, 1);
		
		//searchResultsTable.getFilter().addSortItem("registryEntry.nr", SearchFilter.DESCENDING);
		//searchResultsTable.getFilter().addSortItem("registryEntry.validFrom", SearchFilter.DESCENDING);
		
		
		// http://jira.loc.piksel.ee/browse/ALKOR-214
		// searchResultsTable.getFilter().addSortItem("state.orderNr",
		// SearchFilter.DESCENDING);
		// searchResultsTable.getFilter().addSortItem("arrived",
		// SearchFilter.DESCENDING);

		main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, manageForm.title);
		main.setWidget(1, 0, UIutils.createSpacer(800, 1));
		main.setWidget(2, 0, manageForm.createForm());
		main.setWidget(3, 0, manageForm.buttons);
		main.setWidget(4, 0, manageForm.greenLine);
		main.setWidget(5, 0, searchForm.title);
		main.setWidget(6, 0, searchForm.createForm());
		main.setWidget(7, 0, searchForm.buttons);
		main.setWidget(8, 0, nameListTitle);
		main.setWidget(9, 0, searchResultsTable);

		FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(12, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setColSpan(0, 0, 2);

		setState(FormState.EMPTY);
		setButtonState(FormButtonState.TYHI);
		initWidget(main);

		if (getData().getProperty(ApplicationMap.ID) != null) {
			setFormFieldsFromData(CHANGE_FORM);
			for (int i = 0; i < getEnableDisableButtons().size(); i++) {
				((Button) getEnableDisableButtons().get(i)).setEnabled(true);
			}
		}
		

		searchForm.search();
	}

	/**
	 * Seab paneeli uute olekusse
	 * 
	 * @param state
	 *            FormState
	 */
	private void setState(FormState state) {
		straightToCtl = false; // kui staatust muudetakse, võetakse lipp maha
		formState = state;
		if (state == FormState.INSERTING_MOD || state == FormState.EXTENDING_MOD) {
			isSaved = true;
		} else {
			isSaved = false;
		}
		updateStates(false);
	}
	
	/*
	 public static final String STATE_CODE_CANCELED = "VOID";
	    olek - esitatud 
	   public static final String STATE_CODE_PRESENTED = "ADD";
	    olek - pikendatud 
	   public static final String STATE_CODE_EXTENDED = "REXT";
	    olek - mitte pikendatud 
	   public static final String STATE_CODE_NOT_EXTENDED = "REXTN";
	    olek - esitamata 
	   public static final String STATE_CODE_ENTERED = "ENT";
	    olek - menetluses 
	   public static final String STATE_CODE_PROCESSING = "PRO";
	    olek - kontrollimisel 
	   public static final String STATE_CODE_CHECKING = "CTL";
	    olek - vajab täpsustamiset 
	   public static final String STATE_CODE_NEEDS_CLARIFICATION = "NMO";
	    olek - registrisse kantud 
	   public static final String STATE_CODE_ENTERED_TO_REGISTRY = "RGE";
	    olek - registrisse mittekantud 
	   public static final String STATE_CODE_NOT_ENTERED_TO_REGISTRY = "RGN";
	  */
	
	private void setIsPikTaotlus(boolean is) {
		isPikTaotlus = is;
	}

	private void setIsLilla(boolean is) {
		isLilla = is;
	}

	private void setButtonState(FormButtonState state) {
		straightToCtl = false; // kui staatust muudetakse, võetakse lipp maha
		formButtonState = state;
		updateButtonStates(false);
	}

	/**
	 * Uuendab nuppe jms vastavalt paneeli olekule ja sellele, kas kanne on
	 * salvestatud
	 * 
	 * @param saved
	 *            kas vormi salvestati just enne selle kutsumist või mitte?
	 *            <code>true</code> kui just salvestati, <code>false</code> kui
	 *            tehti muudatus
	 */
	private void updateStates(boolean saved) {
		// if (!isSaved) {
		// isSaved = saved;
		// }
		// updateStates();
	}

	private void updateButtonStates(boolean saved) {
		if (!isSaved) {
			isSaved = saved;
		}
		updateButtonStates();
	}
	
	private void checkCanExtend(){
		
		ApplicationMap map = (ApplicationMap) getData();
		
		if(map != null){
			ServiceContext.getInstance().getRegistryService().checkCanExtend((Long)map.getProperty(ApplicationMap.ID), new AsyncCallback() {

				public void onFailure(Throwable caught) {
					manageForm.saveExtendBtn.setEnabled(false);
					manageForm.saveExtendBtn.setVisible(false);
				}

				public void onSuccess(Object result) {
					manageForm.saveExtendBtn.setEnabled(true);
					manageForm.saveExtendBtn.setVisible(true);
				}
			});
		}
		else{
			manageForm.saveExtendBtn.setEnabled(true);
			manageForm.saveExtendBtn.setVisible(true);
		}

	
	}

	/**
	 * Uuendab nuppe jms vastavalt paneeli olekule ja sellele, kas kanne on
	 * salvestatud
	 */
	private void updateStates() {
		String stateCode = (String) getData().getProperty(ApplicationMap.STATE_CODE);

		GWT.log("LOGI: " + stateCode);

		boolean needsClarification = ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION.equals(stateCode);
		boolean notPresented = ApplicationMap.STATE_CODE_ENTERED.equals(stateCode);
		
		switch (formState) {
		case EMPTY:
			manageForm.saveBtn.setEnabled(true);
			manageForm.saveBtn.setVisible(true);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			if (formState == FormState.EMPTY) {
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
			}
			manageForm.noteBtn.setEnabled(true);
			manageForm.noteBtn.setVisible(true);
			manageForm.documentsBtn.setEnabled(true);
			manageForm.documentsBtn.setVisible(true);
			manageForm.setPrintLink(true);
			break;

		case INSERTING_ADD:
			if (isSaved) {
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(false);
				manageForm.documentsBtn.setVisible(false);
			}
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.saveBtn.setEnabled(true);
			manageForm.saveBtn.setVisible(true);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			break;

		case INSERTING_MOD:
			if (needsClarification || notPresented) {
				// manageForm.saveBtn.setEnabled(true);
				// manageForm.saveBtn.setVisible(true);
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				// manageForm.saveBtn.setEnabled(true);
				// manageForm.saveBtn.setVisible(true);
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			}
			// manageForm.saveBtn.setEnabled(true);
			// manageForm.saveBtn.setVisible(true);
			manageForm.treatBtn.setEnabled(true);
			manageForm.treatBtn.setVisible(true);
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			break;

		case EXTENDING_ADD:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			checkCanExtend();
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			if (isSaved) {
				// manageForm.treatBtn.setEnabled(true);
				// manageForm.treatBtn.setVisible(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
				manageForm.setPrintLink(true);
			} else {
				// manageForm.treatBtn.setEnabled(false);
				// manageForm.treatBtn.setVisible(false);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
				manageForm.setPrintLink(true);
			}
			break;

		case EXTENDING_MOD:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			checkCanExtend();
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);			
			if (needsClarification || notPresented) {
				//manageForm.treatBtn.setEnabled(true);
				//manageForm.treatBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				// manageForm.treatBtn.setEnabled(false);
				// manageForm.treatBtn.setVisible(false);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			}
			break;

		case SELECTING_RO:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			checkCanExtend();
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.setPrintLink(true);
			manageForm.noteBtn.setEnabled(true);
			manageForm.noteBtn.setVisible(true);
			manageForm.documentsBtn.setEnabled(true);
			manageForm.documentsBtn.setVisible(true);
	
			break;

		default:
			break;
		}

		if (ApplicationMap.STATE_CODE_PRESENTED.equals(stateCode) || ApplicationMap.STATE_CODE_CHECKING.equals(stateCode)
				|| ApplicationMap.STATE_CODE_PROCESSING.equals(stateCode) || ApplicationMap.STATE_CODE_ENTERED_TO_REGISTRY.equals(stateCode)) {
			manageForm.saveBtn.setEnabled(true);
			manageForm.saveBtn.setVisible(true);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
		}
		GWT.log("state:" + formState + " isSaved:" + isSaved);
	}

	private void updateButtonStates() {

		switch (formButtonState) {
		case TYHI:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.setPrintLink(false);
			manageForm.noteBtn.setEnabled(false);
			manageForm.noteBtn.setVisible(false);
			manageForm.documentsBtn.setEnabled(false);
			manageForm.documentsBtn.setVisible(false);
			break;
		case TOODE_VALITUD:
			manageForm.saveBtn.setEnabled(true);
			manageForm.saveBtn.setVisible(true);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.setPrintLink(false);
			manageForm.noteBtn.setEnabled(false);
			manageForm.noteBtn.setVisible(false);
			manageForm.documentsBtn.setEnabled(false);
			manageForm.documentsBtn.setVisible(false);
			break;
		case ESITAMATA:
			if (isPikTaotlus) {
				manageForm.saveBtn.setEnabled(false);
				manageForm.saveBtn.setVisible(false);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				manageForm.saveBtn.setEnabled(true);
				manageForm.saveBtn.setVisible(true);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			}
			break;
		case ESITATUD:
			if (isPikTaotlus) {
				manageForm.saveBtn.setEnabled(false);
				manageForm.saveBtn.setVisible(false);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(false);
				manageForm.treatBtn.setVisible(false);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				manageForm.saveBtn.setEnabled(true);
				manageForm.saveBtn.setVisible(true);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(false);
				manageForm.treatBtn.setVisible(false);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			}
			break;
		case MENETLUSES:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.setPrintLink(true);
			manageForm.noteBtn.setEnabled(true);
			manageForm.noteBtn.setVisible(true);
			manageForm.documentsBtn.setEnabled(true);
			manageForm.documentsBtn.setVisible(true);
			break;
		case TAPSUSTA:
			if (isPikTaotlus) {
				manageForm.saveBtn.setEnabled(false);
				manageForm.saveBtn.setVisible(false);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(true);
				manageForm.treatBtn.setVisible(true);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				manageForm.saveBtn.setEnabled(true);
				manageForm.saveBtn.setVisible(true);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(false);
				manageForm.treatBtn.setVisible(false);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			}
			break;
		case KANTUD:
			if (isLilla) {
				manageForm.saveBtn.setEnabled(false);
				manageForm.saveBtn.setVisible(false);
				checkCanExtend();
				manageForm.treatBtn.setEnabled(false);
				manageForm.treatBtn.setVisible(false);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			} else {
				manageForm.saveBtn.setEnabled(false);
				manageForm.saveBtn.setVisible(false);
				manageForm.saveExtendBtn.setEnabled(false);
				manageForm.saveExtendBtn.setVisible(false);
				manageForm.treatBtn.setEnabled(false);
				manageForm.treatBtn.setVisible(false);
				manageForm.productBtn.setEnabled(true);
				manageForm.productBtn.setVisible(true);
				manageForm.setPrintLink(true);
				manageForm.noteBtn.setEnabled(true);
				manageForm.noteBtn.setVisible(true);
				manageForm.documentsBtn.setEnabled(true);
				manageForm.documentsBtn.setVisible(true);
			}
			break;
		case TAGASI:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			manageForm.productBtn.setEnabled(true);
			manageForm.productBtn.setVisible(true);
			manageForm.setPrintLink(true);
			manageForm.noteBtn.setEnabled(true);
			manageForm.noteBtn.setVisible(true);
			manageForm.documentsBtn.setEnabled(true);
			manageForm.documentsBtn.setVisible(true);
			break;
		default:
			manageForm.saveBtn.setEnabled(false);
			manageForm.saveBtn.setVisible(false);
			manageForm.saveExtendBtn.setEnabled(false);
			manageForm.saveExtendBtn.setVisible(false);
			manageForm.treatBtn.setEnabled(false);
			manageForm.treatBtn.setVisible(false);
			manageForm.productBtn.setEnabled(false);
			manageForm.productBtn.setVisible(false);
			manageForm.setPrintLink(true);
			manageForm.noteBtn.setEnabled(true);
			manageForm.noteBtn.setVisible(true);
			manageForm.documentsBtn.setEnabled(true);
			manageForm.documentsBtn.setVisible(true);
			break;
		}
	}

	/**
	 * Väljastpoolt(alampaneelidelt siis peamiselt) paneeli oleku pärimiseks
	 * 
	 * @return FormState olek
	 */
	public FormState getState() {
		return formState;
	}

	public FormButtonState getButtonState() {
		return formButtonState;
	}

	public boolean getIsPik() {
		return isPikTaotlus;
	}

	/**
	 * Kapseldan koodi korrastuse eesmärgil ülemise vormi siia klassi
	 * 
	 * @author raido.kalbre
	 */
	private class ManageForm {

		public Label title;
		private SimplePanel greenLine;
		private HorizontalPanel buttons;
		private Button clearBtn;
		private Button saveBtn;
		private Button saveExtendBtn;
		private Button treatBtn;
		private Button productBtn;
		private Button noteBtn;
		private Button documentsBtn;
		private HTML printLink;

		private ManageForm() {			
			title = new Label(getLabel("title")); // "Taotluse esitamine/muutmine"
			title.setStyleName("Title");

			greenLine = new SimplePanel();
			greenLine.setStyleName("Left");
			greenLine.setHeight("15px");

			// nupud
			clearBtn = new Button(getLabel("clear"), new ClearButtonHandler()); // nupp
																				// "Tühjenda"
			clearBtn.setWidth("11em");
			saveBtn = new Button(getLabel("save"), new SaveButtonConfirmationHandler()); // nupp
																							// "Salvesta"
			saveBtn.setWidth("11em");
			saveExtendBtn = new Button(getLabel("saveExtend"), new SaveExtendApplicationHandler());
			saveExtendBtn.setWidth("11em");
			treatBtn = new Button(getLabel("submit"), new DecisionListener()); // nupp
																				// "Esita"
			treatBtn.setWidth("11em");

			// nupuriba
			buttons = new HorizontalPanel();
			buttons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH, UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
			buttons.add(clearBtn);
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(saveBtn);
			buttons.add(saveExtendBtn);
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(treatBtn);

			// ManageForm returnForm = this;

			final EnterpriseList openForm = new EnterpriseList(new SelectReturnCallback(new ApplicationForm(), CHANGE_FORM, ApplicationMap.APPLICANT) {
				@Override
				public void onReturn() {
					if ("Jah".equals(getData().getProperty(ApplicationMap.APPLICANT_ISACTIVE))) {
						getData().setProperty(ApplicationMap.APPLICANT_ISACTIVE, "true");
					} else if ("Ei".equals(getData().getProperty(ApplicationMap.APPLICANT_ISACTIVE))) {
						getData().setProperty(ApplicationMap.APPLICANT_ISACTIVE, "false");
					}

				}

			}, (EnterpriseMap) getData().getProperty(ApplicationMap.APPLICANT));
			/*
			 * Button applicantButton = UIutils.createButton(new ClickListener()
			 * {
			 * 
			 * public void onClick(Widget sender) { openFormAndResetResult(); }
			 * 
			 * private void openFormAndResetResult() { SimplePanel body =
			 * MainPanel.getBody(); Form form = (Form) body.getWidget();
			 * EnterpriseMap map = getData() != null ? getData().getProperty(
			 * ApplicationMap.APPLICANT) instanceof EnterpriseMap ?
			 * (EnterpriseMap) getData() .getProperty(ApplicationMap.APPLICANT)
			 * : null : null; body.clear(); if (map != null) {
			 * openForm.setData(map); } if (!openForm.isInitialised()) { try {
			 * openForm.init(); } catch (Exception e) { e.printStackTrace();
			 * form.setError(e.toString()); } } openForm.clearErrors();
			 * openForm.resetResultTable(); body.add(openForm);
			 * 
			 * } });
			 */

			// applicantButton.setWidth("11em");
			// buttons.add(UIutils.createSpacer(6, 1));
			// buttons.add(applicantButton);

			printLink = new HTML();
		}

		private FlexTable createForm() {
			FlexTable form = new FlexTable();
			form.setStyleName("Form");
			form.setText(0, 0, getLabel(ApplicationMap.APPLICANT_NAME) + ":");// "Taotleja:");
			form.setWidget(0, 1, new Image("images/t2rn.gif"));
			form.setWidget(0, 2, addFormField(CHANGE_FORM, ApplicationMap.APPLICANT_NAME, new TextBox()));

			form.setText(0, 3, getLabel("productLink") + ":");// "Toote sisestamine:");
			form.setWidget(0, 4, new Image("images/t2rn.gif"));
			TextBox prodNameBox = new TextBox();
			prodNameBox.setWidth("100%");
			form.setWidget(0, 5, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_NAME, prodNameBox));

			productBtn = UIutils.createButton(new ClickListener() { // Toote
						// lisamise/muutmise
						// nupp

						public void onClick(Widget sender) {
							Object insertedDate = getFormFieldValue(CHANGE_FORM, ApplicationMap.ARRIVED);
							if (insertedDate != null)
								getData().put(ApplicationMap.ARRIVED, insertedDate);
							ProductMap productMap = null;
							if (getData().getProperty(ApplicationMap.PRODUCT_ID) != null) {
								productMap = (ProductMap) getData().getProperty(ApplicationMap.PRODUCT);
							}
							ProductsForm productsForm = new ProductsForm(new SelectReturnCallback(XTeeForm.this, CHANGE_FORM, ApplicationMap.PRODUCT) {
								@Override
								public void onReturn() {
									((ApplicationMap) getData()).setProperty(ApplicationMap.PRODUCT, this.getDtoData());
									// print(getData());
									if (getData().getProperty(ApplicationMap.PRODUCT_ID) != null) {
										Object productName = getData().getProperty(ApplicationMap.PRODUCT_NAME);
										if (productName != null && !"".equals(productName)) { // kui
																								// tootel
																								// nime
																								// pole
																								// e
																								// toode
																								// pole
																								// sisestatud,
																								// ei
																								// ole
																								// mõtet
																								// edasi
																								// minna
											setFormFieldsFromData(CHANGE_FORM);
											if (formButtonState == FormButtonState.TYHI) {
												setButtonState(FormButtonState.TOODE_VALITUD);
											}
										}
									} 
								}
							}, productMap);
							try {
								openForm(productsForm);
							} catch (Exception ex) {
								Object[] stackTrace = ex.getStackTrace();
								if (stackTrace != null) {
									StringBuilder output = new StringBuilder();
									for (Object line : stackTrace) {
										output.append(line);
										output.append("\n");
									}
									Window.alert(output.toString());
								} else {
									Window.alert("No trace");
								}

							}
							
							if(UIutils.userHasPriviledge(new String[] {ServiceConstants.ROLE_EIT_GRP})){ // kui on EIT, siis peidame väljad teatud juhul
								productsForm.updateInputStates((String)getData().getProperty(ApplicationMap.STATE_CODE), (String)getData().getProperty(ApplicationMap.TYPE_CODE));
							}
						}
					});
			form.setWidget(0, 6, productBtn);

			form.setText(1, 0, getLabel(ApplicationMap.ARRIVED) + ":");// Esitamise
																		// kuupäev
			form.setWidget(1, 1, new Image("images/t2rn.gif"));
			form.setWidget(1, 2, addFormField(CHANGE_FORM, ApplicationMap.ARRIVED, new TextBox()));

			form.setText(1, 3, getLabel(ApplicationMap.PRODUCT_TYPE_NAME) + ":");// Toote
																					// liik
			form.setWidget(1, 4, UIutils.createSpacer(10, 1));
			form.setWidget(1, 5, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_TYPE_NAME, new TextBox()));

			form.setWidget(1, 6, UIutils.createSpacer(30, 1));
			form.setText(1, 7, getLabel(ApplicationMap.NOTES) + ":"); // Märkused
			noteBtn = UIutils.createButton(new ClickListener() {
				public void onClick(Widget sender) {
					boolean readOnly = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP, ServiceConstants.ROLE_USR_ADM })
							&& !((FormButtonState.ESITAMATA.equals(formButtonState)) || (FormButtonState.ESITATUD.equals(formButtonState)) || FormButtonState.TAPSUSTA
									.equals(formButtonState));
					ApplicationNoteForm noteForm = new ApplicationNoteForm(XTeeForm.this, readOnly);
					noteForm.setData(getData());
					updateStates(false);
					openForm(noteForm);
				}
			});
			form.setWidget(1, 8, noteBtn);

			form.setText(2, 0, getLabel(ApplicationMap.DOCUMENTS) + ":");// Lisa
																			// dokumendid

			documentsBtn = UIutils.createButton(new ClickListener() {
				public void onClick(Widget sender) {
					boolean needsClarification = ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION.equals(getData().getProperty(ApplicationMap.STATE_CODE));
					boolean notPresented = ApplicationMap.STATE_CODE_ENTERED.equals(getData().getProperty(ApplicationMap.STATE_CODE));
					boolean readOnly = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP, ServiceConstants.ROLE_USR_ADM })
							&& !((FormButtonState.ESITAMATA.equals(formButtonState)) || (FormButtonState.ESITATUD.equals(formButtonState)) || FormButtonState.TAPSUSTA
									.equals(formButtonState));
					ApplicationDocumentsForm docForm = new ApplicationDocumentsForm(XTeeForm.this, readOnly);
					docForm.setData(getData());
					updateStates(false);
					openForm(docForm);
				}
			});
			form.setWidget(2, 1, documentsBtn);

			form.setText(3, 0, getLabel(ApplicationMap.PRINT) + ":");// Prindi
																		// taotlus
			form.setWidget(3, 1, printLink);

			form.setText(2, 2, getLabel(ApplicationMap.PRODUCT_GRADE) + ":");// Etanool
																				// %vol
			form.setWidget(2, 3, UIutils.createSpacer(10, 1));
			form.setWidget(2, 4, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_GRADE, new TextBox()));
			form.setText(3, 2, getLabel(ApplicationMap.PRODUCT_VOLUME_NAME) + ":");// Maht
			form.setWidget(3, 3, UIutils.createSpacer(10, 1));
			form.setWidget(3, 4, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_VOLUME_NAME, new TextBox()));

			FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
			cellFormatter.setColSpan(0, 2, 2);
			cellFormatter.setColSpan(0, 5, 3);
			cellFormatter.setColSpan(1, 2, 2);
			cellFormatter.setColSpan(2, 0, 3);
			cellFormatter.setColSpan(3, 0, 3);

			UIutils.setTableTextStyled(form);
			UIutils.setTextBoxesEnabled(form, false);
			initData();
			return form;
		}

		private void setPrintLink(boolean enabled) { // " Prindi taotlus"
			String appNr = getData().getProperty(ApplicationMap.ID) != null ? getData().getProperty(ApplicationMap.ID).toString() : null;
			if (enabled && appNr != null) {
				printLink.setHTML("<a href='" + GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL + "?" + ServiceConstants.DOC_ACTION_PARM + "="
						+ ServiceConstants.DOC_ACTION_GENERATE + "&" + ServiceConstants.DOC_APPID_PARM + "=" + appNr
						+ "' target='_blank'><img src='images/print.gif'/></a>");
			} else {
				printLink.setHTML("");
			}
		}

		private void initData() {
			registryCode = Form.getUserInfo().getRegCode() == null ? "0" : Form.getUserInfo().getRegCode(); // testimiseks
																											// nt
																											// "10160756";
			GWT.log("Registrikood:" + registryCode);
			ServiceContext.getInstance().getRegistryService().getEnterpriseByActivity(registryCode, new AsyncCallback() {
				public void onFailure(Throwable caught) {
					setError(caught.toString());
				}

				public void onSuccess(Object result) {
					((ApplicationMap) getData()).setProperty(ApplicationMap.APPLICANT, result);
					setText(ApplicationMap.APPLICANT_NAME, (String) getData().getProperty(ApplicationMap.APPLICANT_NAME));
				}
			});

			ServiceContext.getInstance().getRegistryService().toDay(new AsyncCallback() {
				public void onFailure(Throwable caught) {
					setError(caught.toString());
					caught.printStackTrace();
				}

				public void onSuccess(Object result) {
					if (getData().getProperty(ApplicationMap.ARRIVED) == null) {
						getData().put(ApplicationMap.ARRIVED, result);
						XTeeForm.this.setFormFieldFromData(CHANGE_FORM, ApplicationMap.ARRIVED);
					}
				}
			});
		}

		/**
		 * Olekust "Vajab täpsustamist" peab kanne esitamisel liikuma olekusse
		 * "Kontrollimisel". See meetod kontrollib eeldust. Tuleb välja kutsuda
		 * igal salvestamisel.
		 */
		private void straightToCtlSaveCheck() {
			if (ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION.equals(getData().getProperty(ApplicationMap.STATE_CODE))) {
				straightToCtl = true;
			}
			getData().setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_ENTERED); // salvestamisel
																									// läheb
																									// alati
																									// olekusse
																									// "Esitamata"
		}

		/**
		 * Olekust "Vajab täpsustamist" peab kanne esitamisel liikuma olekusse
		 * "Kontrollimisel". See meetod viib muudatuse sisse kui eeldus on
		 * täidetud. Tuleb välja kutsuda esitamistel.
		 */
		private void straightToCtlDecide() {
			if (straightToCtl || ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION.equals(getData().getProperty(ApplicationMap.STATE_CODE))) {
				getData().setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_CHECKING);
			} else {
				getData().setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_PRESENTED);
			}
		}

		private void setFromXTeeFlag(ApplicationMap data) {
			// if (FormState.INSERTING_ADD == formState
			// || FormState.EXTENDING_ADD == formState) {
			data.setProperty(ApplicationMap.FROM_XTEE, "true");
			// }
		}

		// ManageFormi handlerid

		private class ClearButtonHandler implements ClickHandler {
			public void onClick(ClickEvent arg0) {
				Cookies.setCookie("selectedStateCode", "");
				Cookies.removeCookie("selectedStateCode");
				InfoPanel.clear();
				setData(new ApplicationMap());
				resetFormFields(CHANGE_FORM);
				// setState(FormState.EMPTY);
				setButtonState(FormButtonState.TYHI);
				updateButtonStates();
				initData();
			}
		}

		private class SaveButtonConfirmationHandler implements ClickHandler {
			public void onClick(ClickEvent arg0) {
				SaveListener saveListener = new SaveListener();
				if (!isSaved) {
					saveListener.onClick(getWidget());
				} else {
					ConfirmDialog conf = new ConfirmDialog("Kas olete kindel, et tahate andmeid muuta?", saveListener);
					conf.hide();
					conf.show();
				}
			}
		}

		// Salvesta koht
		private class SaveListener implements ClickListener { // "Salvesta"
			public void onClick(Widget sender) {

				clearInfo();
				setDataFromFormFields(CHANGE_FORM);

				if (XTeeForm.this.getErrors() != null && !XTeeForm.this.getErrors().isEmpty()) {
					for (int i = 0; i < getErrors().size(); i++) {
						XTeeForm.this.setError((String) getErrors().get(i));
					}
				} else {
					straightToCtlSaveCheck();
					setFromXTeeFlag((ApplicationMap) getData());
					getData().setProperty(ApplicationMap.TYPE_CODE, ApplicationMap.TYPE_CODE_ARE);
					ServiceContext.getInstance().getRegistryService().saveOrUpdate((ApplicationMap) cleanDataBeforeSave(getData()), false, new AsyncCallback() {
						public void onFailure(Throwable caught) {
							setError("Taotluse salvestamine ebaõnnestus! Proovige hiljem uuesti.");
						}

						public void onSuccess(Object result) {
							searchForm.askClassificators(); // uuendame
															// listboxide
															// sisu
							updateApplication((ApplicationMap) result);
							XTeeForm.this.setButtonsEnabled(true);
							XTeeForm.this.setInfo("Taotlus on salvestatud!");
							setButtonState(FormButtonState.ESITAMATA);
							updateButtonStates();
							updateStates(true);
						}
					});
				}
			}
		}

		// Salvesta pik. taotlus
		private class SaveExtendApplicationHandler implements ClickHandler {
			public void onClick(ClickEvent arg0) {

				clearInfo();
				setDataFromFormFields(CHANGE_FORM);

				if (XTeeForm.this.getErrors() != null && !XTeeForm.this.getErrors().isEmpty()) {
					for (int i = 0; i < getErrors().size(); i++) {
						XTeeForm.this.setError((String) getErrors().get(i));
					}
				} else {

					straightToCtlSaveCheck();

					ApplicationMap newApplication = new ApplicationMap();
					setFromXTeeFlag(newApplication);
					// if (formState == FormState.EXTENDING_ADD && !isSaved) {
					newApplication.setProperty(ApplicationMap.ARRIVED, DateTimeFormat.getFormat("dd.MM.yyyy").format(new Date()));
					newApplication.setProperty(ApplicationMap.REGISTRY_ENTRY, getData().getProperty(ApplicationMap.PRODUCT_APPLICATION_REG_ENTRY));
					newApplication.setProperty(ApplicationMap.PRODUCT, getData().getProperty(ApplicationMap.PRODUCT));
					if (getData().getProperty(ApplicationMap.APPLICANT) != null) {
						newApplication.setProperty(ApplicationMap.APPLICANT, getData().getProperty(ApplicationMap.APPLICANT));
					} else {
						newApplication.setProperty(ApplicationMap.APPLICANT, getData().getProperty(ApplicationMap.PRODUCT_APPLICATION_APPLICANT));
					}
					newApplication.setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_ENTERED);
					newApplication.setProperty(ApplicationMap.TYPE_CODE, ApplicationMap.TYPE_CODE_EXTEND);
					newApplication.setProperty(ApplicationMap.NR, getData().getProperty(ApplicationMap.NR));

					// ApplicationType type = new ApplicationType();
					// type.setCode(IClassificatorService.APPL_TYPE_ARP);
					// registryApplication.setType(type);
					// } else {
					// newApplication = (ApplicationMap) getData();
					// }

					ServiceContext.getInstance().getRegistryService()
							.saveNewExtendApplication((ApplicationMap) cleanDataBeforeSave(newApplication), new AsyncCallback() {

								public void onFailure(Throwable caught) {
									setError("Taotluse salvestamine ebaõnnestus! Registrikanne on kehtetu, taotluse esitamise tähtaeg on möödunud, taotlus on salvestatud (esitamata) või juba esitatud.");
								}

								public void onSuccess(Object result) {
									manageForm.treatBtn.setEnabled(true);
									manageForm.treatBtn.setVisible(true);

									searchForm.askClassificators(); // uuendame
																	// listboxide
																	// sisu
									updateApplication((ApplicationMap) result);
									//setInfo("Taotlus on salvestatud!");

									setButtonState(FormButtonState.ESITAMATA);
									setIsPikTaotlus(true);
									updateButtonStates();

									// updateStates(true);
									
									searchForm.search();
									setInfo("Taotlus on salvestatud!");
								}
							});
				}
			}
		}

		private class DecisionListener implements ClickHandler {

			public void onClick(ClickEvent arg0) {
				clearInfo();
				if (getData().getProperty(ApplicationMap.ID) == null) {
					setError("Salvesta taotlus enne esitamist.");
				} else {
					straightToCtlDecide();
					getData().setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_PRESENTED);

					ServiceContext.getInstance().getRegistryService()
							.saveOrUpdateJustApplication((ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {
								public void onFailure(Throwable caught) {
									setError("Taotluse esitamine ebaõnnestus! Proovige hiljem uuesti.");
								}

								public void onSuccess(Object result) {
									updateApplication((ApplicationMap) result);
									XTeeForm.this.setInfo("Taotlus on esitatud!");
									/*
									 * manageForm.saveBtn .setEnabled(false);
									 * manageForm.saveBtn .setVisible(false);
									 * manageForm.saveExtendBtn
									 * .setEnabled(false);
									 * manageForm.saveExtendBtn
									 * .setVisible(false); manageForm.treatBtn
									 * .setEnabled(false); manageForm.treatBtn
									 * .setVisible(false);
									 */
									setButtonState(FormButtonState.ESITATUD);
									updateButtonStates();
									// setState(FormState.SELECTING_RO);
									// // read_only taotluse esitamise
									// järel saab ikka veel muuta
									// 29.01.2015
								}
							});
				}
			}
		}
	} // -- ManageForm

	/**
	 * Kapseldan koodi korrastuse eesmärgil ka otsinguvormi eraldi klassi
	 * 
	 * @author raido.kalbre
	 */
	private class SearchForm {

		private Label title;
		private HorizontalPanel buttons;
		private final Button searchBtn;

		private SearchForm() {
			title = new Label(getLabel("searchTableTitle")); // "Taotluse otsing";
			title.setStyleName("Title");

			Button clear = new Button(getLabel("buttonEmptyFilter"), new ClearButtonHandler());
			clear.setWidth("9em");
			searchBtn = new Button(getLabel("buttonSearch"), new SearchButtonHandler());
			searchBtn.setWidth("9em");

			buttons = new HorizontalPanel();
			buttons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH, UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
			buttons.add(clear);
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(searchBtn);
		}

		private FlexTable createForm() {
			FlexTable searchForm = new FlexTable();
			searchForm.setStyleName("Form");

			// tulp 1
			searchForm.setText(0, 0, getLabel(ApplicationSearchFilter.REGISTRYENTRY_NR) + ":");// "Regkande nr:");
			searchForm.setWidget(0, 1, addFormField(SEARCH_FORM, ApplicationSearchFilter.REGISTRYENTRY_NR, new TextBox()));

			searchForm.setText(1, 0, getLabel(ApplicationSearchFilter.VALID_FROM) + ":");// "Regkande kehtivuse algus:");
			searchForm
					.setWidget(1, 1, addFormField(SEARCH_FORM, ApplicationSearchFilter.VALID_FROM, new RangeSelectBox(RangeSelectBox.CALENDAR, "45%", "45%")));

			searchForm.setText(2, 0, getLabel(ApplicationSearchFilter.VALID_UNTIL) + ":");// "Regkande kehtivuse lõpp:");
			searchForm.setWidget(2, 1,
					addFormField(SEARCH_FORM, ApplicationSearchFilter.VALID_UNTIL, new RangeSelectBox(RangeSelectBox.CALENDAR, "45%", "45%")));

			// tulp 2
			searchForm.setText(0, 2, getLabel(ApplicationSearchFilter.STATE_CODE) + ":");// "Toote olek:");
			searchForm.setWidget(0, 3, addFormField(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE, new ListBox(), "100%"));

			searchForm.setText(1, 2, getLabel(ApplicationSearchFilter.PRODUCT_NAME) + ":");// "Toote nimi:");
			TextBox tb = new TextBox();
			tb.setWidth("97%");
			searchForm.setWidget(1, 3, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_NAME, tb));

			searchForm.setText(2, 2, getLabel(ApplicationSearchFilter.PRODUCT_TYPE_NAME) + ":");// "Toote liik:");
			searchForm.setWidget(2, 3, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_TYPE_CODE, new TextListBox("40px", "120px")));

			searchForm.setText(3, 2, getLabel(ApplicationSearchFilter.EXTEND) + ":");// "Vajab pikendamist:");
			searchForm.setWidget(3, 3, addFormField(SEARCH_FORM, ApplicationSearchFilter.EXTEND, new CheckBox()));

			// tulp 3
			searchForm.setText(0, 5, getLabel(ApplicationSearchFilter.PRODUCT_VOLUME_NAME) + ":");// "Maht:");
			searchForm.setWidget(0, 6, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_VOLUME_CODE, new ListBox(), "100%"));

			searchForm.setText(1, 5, getLabel(ApplicationSearchFilter.GRADE) + ":");// "Etanool %vol:");
			Grid eth = new Grid(1, 5);
			eth.setWidget(0, 0, addFormField(SEARCH_FORM, ApplicationSearchFilter.GRADE_FROM, new TextBox(), "50px"));
			eth.setText(0, 1, "");
			eth.setText(0, 2, getLabel("until"));
			eth.setText(0, 3, "");
			eth.setWidget(0, 4, addFormField(SEARCH_FORM, ApplicationSearchFilter.GRADE_TO, new TextBox(), "50px"));
			eth.getCellFormatter().setVerticalAlignment(0, 2, HasVerticalAlignment.ALIGN_MIDDLE);
			searchForm.setWidget(1, 6, eth);

			searchForm.setText(2, 5, getLabel(ApplicationSearchFilter.PRODUCER_NAME) + ":");// /"Tootja:");
			tb = new TextBox();
			tb.setWidth("97%");
			searchForm.setWidget(2, 6, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCER_NAME, tb));

			searchForm.setText(3, 5, getLabel(ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY) + ":"); // "Tootjariik"
			searchForm.setWidget(3, 6, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE, new ListBox(), "100%"));

			// RK: marker ja ka registrikoodi päässija, vormile ei kuvatagi
			addFormField(SEARCH_FORM, ApplicationSearchFilter.IS_XTEE_FORM, new Hidden("regId", registryCode));

			UIutils.setTableTextStyled(searchForm);
			searchForm.getFlexCellFormatter().setHorizontalAlignment(3, 3, HasHorizontalAlignment.ALIGN_LEFT);
			searchForm.getFlexCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_LEFT);
			searchForm.getFlexCellFormatter().setHorizontalAlignment(1, 6, HasHorizontalAlignment.ALIGN_LEFT);

			askClassificators();

			return searchForm;
		}

		/**
		 * Tühjendab otsinguvormi ja teeb uue(tühja) filtri
		 */
		private void resetSearchForm() {
			ApplicationMap map = new ApplicationMap();
			
			Object applicant = getData().getProperty(ApplicationMap.APPLICANT);
			map.setProperty(ApplicationMap.APPLICANT, applicant);
			
			setData(map);
			searchResultsTable.getFilter().reset();
			resetFormFields(SEARCH_FORM);
		}

		/**
		 * Hangib ja teeb muud vajalikku otsinguvormi ListBoxide
		 * klassifikaatoritega, kutumiseks esmasel vormi avamisel!
		 */
		private void askClassificators() {

			ServiceContext.getInstance().getEnterpriseSpecificClassificators(ServiceContext.COUNTRIES, registryCode, new EnterpriseClassifCallback() {
				@Override
				public void successAction(List<ClassItemMap> result) {
					ListBox lb = (ListBox) getFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE);
					String val = lb.getSelectedIndex() >= 0 ? lb.getValue(lb.getSelectedIndex()) : "";
					makeClassSelectionList(XTeeForm.SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE, result);
					setListBoxSelectedIndexByValue(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE, val);
				}
			});

			ServiceContext.getInstance().getEnterpriseSpecificClassificators(ServiceContext.PRODUCT_TYPE, registryCode, new EnterpriseClassifCallback() {
				@Override
				public void successAction(List<ClassItemMap> result) {
					TextListBox lb = (TextListBox) getFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_TYPE_CODE);
					String val = lb.getText();
					makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_TYPE_CODE, result);
					lb.setText(val);
				}
			});

			ServiceContext.getInstance().getEnterpriseSpecificClassificators(ServiceContext.PRODUCT_VOLUME, registryCode, new EnterpriseClassifCallback() {
				@Override
				public void successAction(List<ClassItemMap> result) {
					ListBox lb = (ListBox) getFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_VOLUME_CODE);
					String val = lb.getSelectedIndex() >= 0 ? lb.getValue(lb.getSelectedIndex()) : "";
					makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_VOLUME_CODE, result);
					setListBoxSelectedIndexByValue(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_VOLUME_CODE, val);
				}
			});

			List applicationStates = (List) ServiceContext.getInstance().getCached(ServiceContext.APPLICATION_STATE2); // baasis
																														// uus
																														// grupp
																														// klassifikaatoreid
			if (applicationStates != null) {
				ListBox lb = (ListBox) getFormField(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE);
				String val = lb.getSelectedIndex() >= 0 ? lb.getValue(lb.getSelectedIndex()) : "ADDCTLNMOPRO";
				makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE, applicationStates);
				// http://jira.loc.piksel.ee/browse/ALKOR-214
				// setListBoxSelectedIndexByValue(SEARCH_FORM,
				// ApplicationSearchFilter.STATE_CODE, val);
				//search(); // otsing vormi avamisel
			}
		}

		/**
		 * Abiklass ettevõtjale spetsiifiliste klassifikaatorite hankimiseks.
		 */
		protected abstract class EnterpriseClassifCallback implements AsyncCallback<List<ClassItemMap>> {

			public void onFailure(Throwable caught) {
				GWT.log("EnterpriseClassifCallback failure: " + caught.getMessage());
			}

			public void onSuccess(List<ClassItemMap> result) {
				if (result != null) {
					successAction(result);
				}
			}

			public abstract void successAction(List<ClassItemMap> result);
		}

		// SearchFormi handlerid

		private class ClearButtonHandler implements ClickHandler {
			public void onClick(ClickEvent arg0) {
				resetSearchForm();
				searchResultsTable.setSelectedRowIndex(-1);
			}
		}

		private class SearchButtonHandler implements ClickHandler {
			public void onClick(ClickEvent arg0) {
				search();
			}
		}

		private void search() {
			if ("0".equals(registryCode)) {
				setError("Taotleja info puudub. Ehk on sessioon aegunud?");
			} else {
				// kooomad punktideks
				((TextBox) getFormField(SEARCH_FORM, ApplicationSearchFilter.GRADE_FROM)).setText(comaToDot(((TextBox) getFormField(SEARCH_FORM,
						ApplicationSearchFilter.GRADE_FROM)).getText()));
				((TextBox) getFormField(SEARCH_FORM, ApplicationSearchFilter.GRADE_TO)).setText(comaToDot(((TextBox) getFormField(SEARCH_FORM,
						ApplicationSearchFilter.GRADE_TO)).getText()));

				// mäpi saamine jne
				Map map = getFormFieldValues(SEARCH_FORM);
				if (!hasErrors())
					searchResultsTable.getData(map);
				jumpToTop();
			}
		}

	} // -- SearchForm

	@Override
	public void onDataEvent(DataChangeEvent event) {
		if (event.getType() == DataChangeEvent.DATA_MODIFIED) {
			setData(event.getData());
			setFormFieldsFromData(CHANGE_FORM);
			searchResultsTable.updateDataRow(event.getData());
		}
	}

	public void updateApplication(ABaseDTOMap data) {
		setData(data);
		setFormFieldsFromData(CHANGE_FORM);
		searchResultsTable.updateDataRow(data);
	}

	@Override
	public void setFormFieldsFromData(String formName) {
		super.setFormFieldsFromData(formName);
	}

	private void print(HashMap dto) {
		Set keys = dto.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			GWT.log(" >>> key:" + key + "," + dto.get(key) + ";");
		}
	}

	private void setText(String label, String text) {
		((TextBox) getFormField(CHANGE_FORM, label)).setText(text);
	}

	public void avail(String key, Object value) {
		if (key.equals(ApplicationSearchFilter.STATE_CODE)) {
			setListBoxSelectedIndexByValue(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE, "ADDCTLNMOPRO"); // vaikimise
																												// valitud
																												// "Toote olek"
		}
	}

	// APPLICATIONTABLE

	private class ApplicationsTable extends ResultTable {

		public ApplicationsTable() {
			super(new ApplicationSearchFilter());
			getFilter().setLimited(true);
			GWT.log("LIMTIED:" + getFilter().isLimited());
			this.addColumn(new Column(getLabel(ApplicationMap.REGISTRYENTRY_NR), ApplicationMap.REGISTRYENTRY_NR, null, Column.styleNormal, null)); // "Regkande nr"
			this.addColumn(new Column(getLabel(ApplicationMap.REGISTRYENTRY_VALID_FROM), ApplicationMap.REGISTRYENTRY_VALID_FROM, null, Column.styleNormal,
					null)); // "Regkande kehtivuse algus"
			this.addColumn(new Column(getLabel(ApplicationMap.REGISTRYENTRY_VALID_UNTIL), ApplicationMap.REGISTRYENTRY_VALID_UNTIL, null, Column.styleNormal,
					null)); // "Regkande kehtivuse lõpp"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_NAME), ApplicationMap.PRODUCT_NAME, null, Column.styleNormal, null)); // "Toote nimi"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_TYPE_NAME), ApplicationMap.PRODUCT_TYPE_NAME, null, Column.styleNormal, null)); // "Toote liik"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_VOLUME_NAME), ApplicationMap.PRODUCT_VOLUME_NAME, null, Column.styleNormal, null)); // "Maht"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_GRADE), ApplicationMap.PRODUCT_GRADE, null, Column.styleNormal, null)); // "Etanoolisisaldus,vol%"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_PRODUCER_NAME), ApplicationMap.PRODUCT_PRODUCER_NAME, null, Column.styleNormal, null)); // "Tootja nimi"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_PRODUCER_COUNTRY), ApplicationMap.PRODUCT_PRODUCER_COUNTRY_NAME, null,
					Column.styleNormal, null)); // "Tootja riik"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_ORIGINCOUNTRY_NAME), ApplicationMap.PRODUCT_ORIGINCOUNTRY_NAME, null, Column.styleNormal,
					null)); // "Päritolumaa"
			this.addColumn(new Column(getLabel(ApplicationMap.STATE_NAME), ApplicationMap.STATE_NAME, null, Column.styleNormal, null)); // "Staatus"
			this.addColumn(new Column(getLabel(ApplicationMap.APPLICATION_TYPE), ApplicationMap.TYPE, null, Column.styleNormal, null)); // "Taotluse tüüp"

			if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP, ServiceConstants.ROLE_REG_WRK })) {
				this.addColumn(new Column(getLabel(ApplicationMap.NOTES), ApplicationMap.NOTES, "", Column.styleUrl, ResultTable.NOTE));
				this.addColumn(new Column(null, null, getLabel(ResultTable.SELECT), Column.styleUrl, ResultTable.SELECT));

			}

		}

		@Override
		protected void getData(SearchFilter filter) {
			ServiceContext.getInstance().getRegistryService().searchApplications(registryCode, filter, this);
		}

		protected void onDataEvent(DataChangeEvent event) {
			if (event.getType() == DataChangeEvent.DATA_MODIFIED) {
				if (this.getSelectedRowIndex() >= 0) {
					int row = this.getSelectedRowIndex();
					this.getFilter().getResultsList().set(row, event.getData());
					this.renderRow(row + 1, event.getData());
				} else if (event.getType() == DataChangeEvent.DATA_ADDED) {
					this.getFilter().getResultsList().add(0, event.getData());
					this.show();
				}
			}
		}

		public boolean updateDataRow(ABaseDTOMap newData) {
			Long newId = (Long) newData.getProperty(ABaseDTOMap.ID);
			List resultsList = getFilter().getResultsList();
			if (resultsList == null)
				return false;
			GWT.log(" -> newId:" + newId + " resSize:" + resultsList.size());
			for (int i = 0; i < resultsList.size(); i++) {
				ABaseDTOMap row = (ABaseDTOMap) resultsList.get(i);
				if (row.getProperty(ABaseDTOMap.ID) != null && row.getProperty(ABaseDTOMap.ID).equals(newId)) {
					resultsList.remove(i);
					resultsList.add(i, newData);
					show();
					return true;
				}
			}

			if (resultsList.size() > 0 && (RegistryEntryMap) newData.getProperty(ApplicationMap.REGISTRY_ENTRY) != null) {
				Long entryId = (Long) ((RegistryEntryMap) newData.getProperty(ApplicationMap.REGISTRY_ENTRY)).get(RegistryEntryMap.ID);
				for (int i = 0; i < resultsList.size(); i++) {
					ABaseDTOMap row = (ABaseDTOMap) resultsList.get(i);
					if (row.getProperty(ABaseDTOMap.ID) != null
							&& ((RegistryEntryMap) row.getProperty(ApplicationMap.REGISTRY_ENTRY)).get(RegistryEntryMap.ID).equals(entryId)) {
						resultsList.remove(i);
						resultsList.add(i, newData);
						show();
						return true;
					}
				}
				resultsList.remove(resultsList.size() - 1);
				resultsList.add(0, newData);
			}

			show();
			return true;
		}

		@Override
		protected String getText(ABaseDTOMap row, Column col) {
			if (ApplicationMap.NOTES.equals(col.getProperty())) {
				return getNotesPlainText(row);
			} else {
				return super.getText(row, col);
			}
		}

		@Override
		protected String getSpecialColumnText(Column col, ABaseDTOMap row) {
			return col.getText();
		}

		private String getNotesPlainText(ABaseDTOMap row) {
			String notes = ((String) ((ApplicationMap) row).getProperty(ApplicationMap.NOTES));
			if (notes != null) {
				notes = notes.replaceAll("<b>.*?</b>", "").replaceAll("\\<.*?>", " ").replaceAll("&lt;.*?>", " ").trim();
				if (notes != null && notes.length() > 50) {
					char[] firstFifty = new char[50];
					notes.getChars(0, 50, firstFifty, 0);
					notes = new String(firstFifty);
					notes += "...";
				}
			}
			return notes;
		}

		@Override
		protected IRowListenerFactory getRowListenerFactory() {
			return new RowListenterFactory();
		}

		@Override
		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {

			String styleName = null;
			String stateCode = (String) row.getProperty(ApplicationMap.STATE_CODE);
			if (stateCode != null) {
				if (ServiceConstants.APPL_STATE_RGE.equals(stateCode) || ServiceConstants.APPL_STATE_REXT.equals(stateCode)) {
					// String dateString = ((RegistryEntryMap) row
					// .getProperty(ApplicationMap.REGISTRY_ENTRY))
					// .getText(RegistryEntryMap.VALID_UNTIL);
					String dateString = null;
					Object dateObj = ((RegistryEntryMap) row.getProperty(ApplicationMap.REGISTRY_ENTRY)) != null ? ((RegistryEntryMap) row
							.getProperty(ApplicationMap.REGISTRY_ENTRY)).getProperty(RegistryEntryMap.VALID_UNTIL) : null;
					if (dateObj != null) {
						dateString = dateObj.toString();
						Date date = new Date();
						date.setYear(Integer.parseInt(dateString.substring(dateString.lastIndexOf(".") + 1)) - 1900);
						date.setMonth(Integer.parseInt(dateString.substring(dateString.indexOf(".") + 1, dateString.lastIndexOf("."))) - 1);
						date.setDate(Integer.parseInt(dateString.substring(0, dateString.indexOf("."))));
						long difference = (date.getTime() - new Date().getTime()) / 1000;
						if (difference <= (60L * 60L * 24L * 60L)) {
							styleName = "Purple";
							if (ApplicationMap.TYPE_CODE_ARE.equals(((ApplicationMap) row).getProperty(ApplicationMap.TYPE_CODE))
									&& difference >= (1000L * 60L * 60L * 24L * 25L)) { // pikendatav
																						// on
																						// ainult
																						// registrisse
																						// kandmise
																						// taotlus
																						// !
								((ApplicationMap) row).setProperty("NEEDS_RENEWAL", true);
							}
						} else {
							if (ServiceConstants.APPL_STATE_RGE.equals(stateCode))
								styleName = "Green";
							else if (ServiceConstants.APPL_STATE_REXT.equals(stateCode))
								styleName = "lightGreen";
						}
					}
				} else if (ServiceConstants.APPL_STATE_RGN.equals(stateCode) || ServiceConstants.APPL_STATE_CAN.equals(stateCode)
						|| ServiceConstants.APPL_STATE_REXT_NOT.equals(stateCode))
					styleName = "Red";
				else
					styleName = "Blue";
			} else
				return null;
			return styleName;
		}

		/**
		 * Determine selected application's position in resultList by it's id
		 */
		@Override
		public void setSelectedRow(Object row) {
			// System.out.println("start:"+System.currentTimeMillis());
			int rowIndex = 0;
			for (rowIndex = 0; rowIndex < getFilter().getResultsList().size(); rowIndex++) {
				ApplicationMap listItem = (ApplicationMap) getFilter().getResultsList().get(rowIndex);
				if (((ApplicationMap) row).getProperty(ApplicationMap.ID).equals(listItem.getProperty(ApplicationMap.ID)))
					break;
				rowIndex++;
			}
			// System.out.println("info:"+System.currentTimeMillis()+","
			// +getFilter().getResultsList().size()+" "+rowIndex);
			if (rowIndex < getFilter().getResultsList().size())
				setSelectedRowIndex(rowIndex);

		}
	}

	private class RowListenterFactory implements IRowListenerFactory {

		public RowListenterFactory() {
			super();
		}

		public ClickListener create(String listenerType, final Object row) {
			ClickListener listener = null;
			try {
				if (ResultTable.SELECT.equals(listenerType)) {
					listener = new ClickListener() {

						public void onClick(Widget sender) {
							clearInfo();
							if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP, ServiceConstants.ROLE_REG_WRK })) { // FIXME
																																			// ainult
																																			// EIT
								setButtonState(FormButtonState.TYHI);
								updateButtonStates();
								setIsLilla(false);
								setIsPikTaotlus(false);

								XTeeForm.this.searchResultsTable.setSelectedRow(row);

								// hack: versioonierinevuse konflikti
								// vältimiseks jätame ettevõtja muutmata
								Object applicant = getData().getProperty(ApplicationMap.APPLICANT);

								setData(((ApplicationMap) row));

								getData().setProperty(ApplicationMap.APPLICANT, applicant);
								setFormFieldsFromData(CHANGE_FORM);
								/*
								 * UUS LOOGIKA PXL
								 */
								// kontrollime kas on pik. taotlus
								if (ApplicationMap.TYPE_CODE_ARE.equals(getData().getProperty(ApplicationMap.TYPE_CODE))) {
									setIsPikTaotlus(false);
								} else if (ApplicationMap.TYPE_CODE_EXTEND.equals(getData().getProperty(ApplicationMap.TYPE_CODE))) {
									setIsPikTaotlus(true);
								}

								String kehtibKuni = (String) getData().getProperty(ApplicationMap.REGISTRYENTRY_VALID_UNTIL);
								if (kehtibKuni != null) {
									/*
									 * Kuupäev on formaadis 19.04.2015
									 * (dd.mm.yyyy)
									 */
									Date date = DateTimeFormat.getFormat("dd.MM.yyyy").parse(kehtibKuni);

									Date today = new Date();

									int vahe = CalendarUtil.getDaysBetween(today, date);

									// setError("Vahe " + vahe);

									// MARTIN123
									if (vahe <= 60) {
										setIsLilla(true);
									} else {
										setIsLilla(false);
									}

								} else {
									setIsLilla(false);
								}

								/*
								 * if (onLilla != null) {
								 * 
								 * setIsLilla(true); } else { setIsLilla(false);
								 * }
								 */
								/*
								 * Vaatab kas taotlus on lilla
								 */
								String renew = (String) getData().getProperty(ApplicationMap.PRODUCT_APPLICATION_NEEDS_RENEWENING);

								/*
								 * Olekute kontroll
								 */
								String state = (String) getData().getProperty(ApplicationMap.STATE_CODE);

								Cookies.setCookie("selectedStateCode", state);

								// ESITAMATA
								if (ApplicationMap.STATE_CODE_ENTERED.equals(state)) {
									setButtonState(FormButtonState.ESITAMATA);
								} else if (ApplicationMap.STATE_CODE_PRESENTED.equals(state)) {
									setButtonState(FormButtonState.ESITATUD);
								} else if (ApplicationMap.STATE_CODE_PROCESSING.equals(state) || ApplicationMap.STATE_CODE_CHECKING.equals(state)) {
									setButtonState(FormButtonState.MENETLUSES);
								} else if (ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION.equals(state)) {
									setButtonState(FormButtonState.TAPSUSTA);
									
								} else if (ApplicationMap.STATE_CODE_ENTERED_TO_REGISTRY.equals(state) || ApplicationMap.STATE_CODE_EXTENDED.equals(state)) {
									setButtonState(FormButtonState.KANTUD);
								} else if (ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY.equals(state) || ApplicationMap.STATE_CODE_NOT_EXTENDED.equals(state)) {
									setButtonState(FormButtonState.TAGASI);
								} else if (ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY.equals(state)) {
									setButtonState(FormButtonState.TAGASI);
								}
								
								/*
								 * 
								 * String state = (String)
								 * getData().getProperty(
								 * ApplicationMap.STATE_CODE); if
								 * (ApplicationMap
								 * .TYPE_CODE_ARE.equals(((ApplicationMap)
								 * row).getProperty(ApplicationMap.TYPE_CODE))
								 * && ((ApplicationMap)
								 * row).getProperty("NEEDS_RENEWAL") != null) {
								 * 
								 * getRegistryService().isExtendingAllowed((String
								 * ) getData().getProperty(ApplicationMap.NR),
								 * new AsyncCallback<Boolean>() {
								 * 
								 * public void onFailure(Throwable caught) {
								 * setError(
								 * "Pikendamise taotluse olemasolu kontroll ebaõnnestus."
								 * ); GWT.log(
								 * "Pikendamise taotluse olemasolu kontroll ebaõnnestus:"
								 * + caught.getMessage()); }
								 * 
								 * public void onSuccess(Boolean result) { if
								 * (result) { setState(FormState.EXTENDING_ADD);
								 * // kui tagastati true, refreshitakse nuppe ja
								 * salvestamise nupp kuvatakse
								 * //manageForm.saveExtendBtn.setVisible(true);
								 * //manageForm.saveExtendBtn.setEnabled(true);
								 * //uitmõte //formState =
								 * FormState.EXTENDING_ADD; } else { setError(
								 * "Sellele taotlusele on pikendamise taotlus juba esitatud!"
								 * ); } } }); setState(FormState.SELECTING_RO);
								 * 
								 * 
								 * } else if
								 * (ApplicationMap.STATE_CODE_PRESENTED
								 * .equals(state) ||
								 * ApplicationMap.STATE_CODE_CANCELED
								 * .equals(state) ||
								 * ApplicationMap.STATE_CODE_CHECKING
								 * .equals(state) ||
								 * ApplicationMap.STATE_CODE_PROCESSING
								 * .equals(state) ||
								 * ApplicationMap.STATE_CODE_ENTERED_TO_REGISTRY
								 * .equals(state) ||
								 * ApplicationMap.STATE_CODE_EXTENDED
								 * .equals(state) ||
								 * ApplicationMap.STATE_CODE_NOT_EXTENDED
								 * .equals(state)) {
								 * 
								 * setState(FormState.SELECTING_RO);
								 * 
								 * } else if
								 * (ApplicationMap.TYPE_CODE_ARE.equals
								 * (getData()
								 * .getProperty(ApplicationMap.TYPE_CODE))) {
								 * setState(FormState.INSERTING_MOD); } else if
								 * (
								 * ApplicationMap.TYPE_CODE_EXTEND.equals(getData
								 * ().getProperty(ApplicationMap.TYPE_CODE))) {
								 * 
								 * setState(FormState.EXTENDING_MOD); }else if
								 * (ApplicationMap
								 * .STATE_CODE_PRESENTED.equals(state)) {
								 * setState(FormState.INSERTING_ADD);
								 * 
								 * } else {
								 * GWT.log("MUU || type:"+getData().getProperty
								 * (ApplicationMap.TYPE_CODE)+
								 * " || state:"+getData
								 * ().getProperty(ApplicationMap.STATE_CODE)); }
								 */
								jumpToTop();
							}
						}
					};

				} else if (ResultTable.NOTE.equals(listenerType)) {
					listener = new ClickListener() {

						public void onClick(Widget sender) {
							if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP, ServiceConstants.ROLE_REG_WRK })) {
								InfoDialog popup = new InfoDialog();
								popup.setTitleHTML(getLabel(ApplicationMap.NOTES));
								popup.setInfoHTML((String) ((ApplicationMap) row).getProperty(ApplicationMap.NOTES));
								popup.show();
							}
						}

					};
				}

			} catch (Exception e) {
				GWT.log("clickListener out:" + e.getMessage(), e);
				e.printStackTrace();
			}

			return listener;
		}
	}
}
