package ee.agri.alkor.web.client.form.appl;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
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

/**
 * Registry application form.
 * 
 * @author viktorb
 * @author ivars
 */
public class ApplicationForm extends Form implements CacheListener {

	public static final String getKey() {
		return "ApplicationForm";
	}

	/**
	 * Input form names.
	 */
	private static final String SEARCH_FORM = "searchForm";

	private static final String CHANGE_FORM = "changeForm";

	/**
	 * Pikendamise riigilõivu suurus
	 */
	private static final String EXTEND_STATE_FEE_AMOUNT = "4";

	private boolean isExtendApplication = false;

	private ApplicationsTable searchResultsTable;

	private HTML printLink;

	private FlexTable main;

	private Button documentsBtn;

	private Button applNoteBtn;

	private Button feeBtn;

	/**
	 * Otsusta
	 */
	private Button treat;

	private Button specify;

	private Button examplesButton;

	private Button productForm;

	private Button extendProductForm;

	private Button linkToApplication;

	private Button save;

	/**
	 * Pikendamise nupud
	 */

	private Button saveExtendApplication;

	private Button treatExtend;

	private final Form parent;

	/**
	 * Taotluste vormi loomine.
	 */
	public ApplicationForm() {
		this(new ApplicationMap());
	}

	public ApplicationForm(ApplicationMap map) {
		this(map, null);
	}

	public ApplicationForm(ApplicationMap map, Form parent) {
		super();
		setData(map);
		this.parent = parent;
	}

	@Override
	public Object getConstantsWithLookup() {
		return GWT.create(ApplicationFormMessages.class);
	}

	@Override
	public void init() {
		super.init();

		ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES, this);

		ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_TYPE, this);

		ServiceContext.getInstance().addCacheListener(ServiceContext.APPLICATION_STATE, this);

		searchResultsTable = new ApplicationsTable();
		searchResultsTable.getData(); // automaatne otsing

		Label searchTitle = new Label(getLabel("searchTableTitle"));// "Taotluse
		// otsing");
		searchTitle.setStyleName("Title");

		HorizontalPanel searchButtons = new HorizontalPanel();
		Button clear = new Button(getLabel("buttonEmptyFilter"), new ClickListener() { // "Tühjenda
																						// filter"

			public void onClick(Widget sender) {
				resetSearchForm();
				searchResultsTable.setSelectedRowIndex(-1);
			}
		});

		Button search = new Button(getLabel("buttonSearch"));// "Otsi");

		search.addClickListener(new ClickListener() {

			public void onClick(Widget sender) {
				Map map = getFormFieldValues(SEARCH_FORM);
				if (map.containsKey(ApplicationSearchFilter.IS_XTEE_FORM)) { // sorri,
																				// poisid,
																				// häkk
					if ("false".equals(map.get(ApplicationSearchFilter.IS_XTEE_FORM))) {
						map.remove(ApplicationSearchFilter.IS_XTEE_FORM);
					}
				}
				if (!hasErrors())
					searchResultsTable.getData(map);
				jumpToTop();
			}
		});

		clear.setWidth("9em");
		search.setWidth("9em");
		searchButtons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		searchButtons.add(clear);
		searchButtons.add(UIutils.createSpacer(6, 1));
		searchButtons.add(search);

		Label manageTitle = new Label(getLabel("addApplicationTableTitle"));// "Taotluse
		// lisamine/menetlemine");
		manageTitle.setStyleName("Title");

		SimplePanel greenLine = new SimplePanel();
		greenLine.setStyleName("Left");
		greenLine.setHeight("15px");

		HorizontalPanel manageButtons = new HorizontalPanel();
		Button cancel = new Button(getLabel("buttonEmpty"), new ClickListener() { // "Tühjenda"

			public void onClick(Widget sender) {
				clearErrors();
				// getData().reset();// <- Stack overflow
				setData(new ApplicationMap());
				setFormFieldsFromData(CHANGE_FORM); // <- ei tööta kui
				// map on tühi
				clearPrintLink();
				resetFormFields(CHANGE_FORM);
				applNoteBtn.setEnabled(true);
				((Label) main.getWidget(0, 0)).setText(getLabel(ApplicationFormMessages.ADD_APPLICATION_TABLE_TITLE));
			}
		});
		save = new Button(getLabel("buttonSave"), new ClickListener() {
			public void onClick(Widget sender) {
				if (((TextBox) getFormField(CHANGE_FORM, ApplicationMap.NR)).getText() != null
						&& ((TextBox) getFormField(CHANGE_FORM, ApplicationMap.NR)).getText().length() != 0) {
					ConfirmDialog conf = new ConfirmDialog("Kas olete kindel, et tahate andmeid muuta?",
							new SaveListener());
					conf.hide();
					conf.show();
				} else {
					new SaveListener().onClick(sender);
				}
			}
		});
		specify = new Button(getLabel("buttonRequiresInfo"), new ClarificationListener());
		specify.setWidth("9em");
		specify.setEnabled(getData().getProperty(ApplicationMap.STATE) != null
				&& getData().getProperty(ApplicationMap.STATE_CODE).equals(ApplicationMap.STATE_CODE_CHECKING));
		treat = new Button(getLabel("buttonProcess"), new DecisionListener());
		cancel.setWidth("11em");
		save.setWidth("11em");
		specify.setWidth("11em");
		treat.setWidth("11em");
		manageButtons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
			manageButtons.add(cancel);
			manageButtons.add(UIutils.createSpacer(6, 1));
			manageButtons.add(save);
			manageButtons.add(UIutils.createSpacer(6, 1));
			manageButtons.add(specify);
			manageButtons.add(UIutils.createSpacer(6, 1));
		}
		manageButtons.add(treat);

		saveExtendApplication = new Button(getLabel("buttonSaveExtendApplication"),
				new SaveExtendApplicationListener());
		saveExtendApplication.setWidth("11em");
		manageButtons.add(UIutils.createSpacer(6, 1));
		manageButtons.add(saveExtendApplication);
		saveExtendApplication.setVisible(false);

		// when visible?
		treatExtend = new Button(getLabel("treatExtend"), new ExtendDecisionListener());
		treatExtend.setWidth("11em");
		manageButtons.add(UIutils.createSpacer(6, 1));
		manageButtons.add(treatExtend);
		treatExtend.setVisible(false);

		manageButtons.add(UIutils.createSpacer(6, 1));
		if (parent != null) {
			// back button than will take the user back to the parent form
			manageButtons.add(UIutils.createSpacer(6, 1));
			Button back = new OFButton("Tagasi", parent);
			manageButtons.add(back);
		}

		Label nameListTitle = new Label(getLabel("listTableTitle")); // "Taotluste
		// nimekiri");
		nameListTitle.setStyleName("Title");

		Label extendTitle = new Label(getLabel("extendTitle")); // Pikendamise
																// taotlus
		extendTitle.setStyleName("Title");

		main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, manageTitle);
		main.setWidget(1, 0, UIutils.createSpacer(800, 1));
		main.setWidget(2, 0, createMangageForm());
		main.setWidget(3, 0, manageButtons);

		main.setWidget(4, 0, UIutils.createSpacer(800, 30));
		main.setWidget(5, 0, extendTitle);
		main.setWidget(6, 0, UIutils.createSpacer(800, 1));
		main.setWidget(7, 0, UIutils.createSpacer(800, 20));
		main.setWidget(8, 0, createExtendForm());

		main.setWidget(9, 0, searchTitle);
		main.setWidget(10, 0, greenLine);
		main.setWidget(11, 0, createSearchForm());
		main.setWidget(12, 0, searchButtons);
		main.setWidget(13, 0, nameListTitle);
		main.setWidget(14, 0, searchResultsTable);
		FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(12, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setColSpan(0, 0, 2);
		cellFormatter.setColSpan(9, 0, 2);
		cellFormatter.setColSpan(10, 0, 2);
		cellFormatter.setColSpan(13, 0, 2);
		askClassificators();
		initWidget(main);
		if (getData().getProperty(ApplicationMap.ID) != null) {
			setFormFieldsFromData(CHANGE_FORM);
			setPrintLink();
			for (int i = 0; i < getEnableDisableButtons().size(); i++) {
				((Button) getEnableDisableButtons().get(i)).setEnabled(true);
			}
			// disable statefee button for anyone not from listed group(s)
			if (!UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
				// ((Button) ((FlexTable) main.getWidget(2, 0)).getWidget(4, 1))
				// .setEnabled(false);
				productForm.setEnabled(true);
			}

		}
	}

	/**
	 * Loob otsingu elementide gruppi osa.
	 */
	private FlexTable createSearchForm() {
		FlexTable searchForm = new FlexTable();
		searchForm.setStyleName("Form");
		FlexCellFormatter cellFormatter = searchForm.getFlexCellFormatter();
		searchForm.setText(0, 0, getLabel(ApplicationSearchFilter.NR) + ":");// "Taotluse
		// nr:");
		searchForm.setText(1, 0, getLabel(ApplicationSearchFilter.PRODUCER_NAME) + ":");// /"Tootja:");
		searchForm.setText(2, 0, getLabel(ApplicationSearchFilter.PRODUCT_NAME) + ":");// "Toode:");
		Label onXTeeLabel = new Label("Sisestatud iseteeninduses" + ":");
		//onXTeeLabel.setVisible(false);
		searchForm.setWidget(3, 0, onXTeeLabel);// "Eesti.ee kaudu:");
		
		searchForm.setText(0, 3, getLabel(ApplicationSearchFilter.APPLICANT_NAME) + ":");// "Taotleja:");
		searchForm.setText(1, 3, getLabel(ApplicationSearchFilter.STATE_CODE) + ":");// "Staatus:");
		searchForm.setText(2, 3, getLabel(ApplicationSearchFilter.ARRIVED) + ":");// "Esitamise
																					// kpv:");
		searchForm.setText(0, 5, getLabel(ApplicationSearchFilter.PRODUCT_TYPE_CODE) + ":");
		searchForm.setText(1, 5, getLabel(ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY) + ":");
		searchForm.setText(2, 5, getLabel(ApplicationSearchFilter.PRODUCT_ORIGINCOUNTRY_CODE) + ":");
		searchForm.setText(3, 5, getLabel(ApplicationSearchFilter.TYPE_NAME) + ":");
		searchForm.setText(3, 3, getLabel(ApplicationSearchFilter.DECISION_DATE) + ":");// "Otsuse
		// kpv:");
		searchForm.setWidget(0, 2, UIutils.createSpacer(20, 1));
		searchForm.setWidget(1, 2, UIutils.createSpacer(20, 1));
		searchForm.setWidget(2, 2, UIutils.createSpacer(20, 1));
		searchForm.setWidget(0, 1, addFormField(SEARCH_FORM, ApplicationSearchFilter.NR, new TextBox()));
		searchForm.setWidget(1, 1, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCER_NAME, new TextBox()));
		searchForm.setWidget(2, 1, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_NAME, new TextBox()));
		CheckBox cbxtee = new CheckBox();
		//cbxtee.setVisible(false);
		searchForm.setWidget(3, 1, addFormField(SEARCH_FORM, ApplicationSearchFilter.IS_XTEE_FORM, cbxtee));
		searchForm.setWidget(0, 4,
				addFormField(SEARCH_FORM, ApplicationSearchFilter.APPLICANT_NAME, new TextBox(), "100%"));
		ListBox lb = new ListBox();
		searchForm.setWidget(1, 4, addFormField(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE, lb, "100%"));
		CalendarBox cb = new CalendarBox();
		cb.setWidth("8.6em");

		cb = new CalendarBox();
		cb.setWidth("8em");
		searchForm.setWidget(0, 6,
				addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_TYPE_CODE, new TextListBox("40px", "120px")));
		searchForm.setWidget(1, 6, addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE,
				new ListBox(), "100%"));
		searchForm.setWidget(2, 6,
				addFormField(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_ORIGINCOUNTRY_CODE, new ListBox(), "100%"));

		searchForm.setWidget(2, 4, addFormField(SEARCH_FORM, ApplicationSearchFilter.ARRIVED,
				new RangeSelectBox(RangeSelectBox.CALENDAR, "45%", "45%")));
		searchForm.setWidget(3, 6, addFormField(SEARCH_FORM, ApplicationSearchFilter.TYPE_CODE, new ListBox(), "100%"));
		searchForm.setWidget(3, 4, addFormField(SEARCH_FORM, ApplicationSearchFilter.DECISION_DATE,
				new RangeSelectBox(RangeSelectBox.CALENDAR, "45%", "45%")));
		UIutils.setTableTextStyled(searchForm);
		return searchForm;
	}

	private FlexTable createExtendForm() {
		FlexTable extendform = new FlexTable();
		extendform.setText(0, 0, getLabel("extendable_product") + ":");// "Pikendatav
																		// toode");
		extendProductForm = UIutils.createButton(new ClickListener() {
			public void onClick(Widget sender) {
				Date now = new Date(System.currentTimeMillis());
				Object insertedDate = getFormFieldValue(CHANGE_FORM, ApplicationMap.ARRIVED);
				if (insertedDate != null || "".equals(insertedDate))
					getData().setProperty(ApplicationMap.ARRIVED, insertedDate);
				else
					getData().setProperty(ApplicationMap.ARRIVED,
							(now.getDate() > 9 ? new Integer(now.getDate()).toString() : "0" + now.getDate()) + "."
									+ ((now.getMonth() + 1) > 9 ? (new Integer(now.getMonth() + 1)).toString()
											: "0" + (now.getMonth() + 1))
									+ "." + (now.getYear() + 1900));
				System.out.println("arrived:" + insertedDate + " " + getData().getProperty(ApplicationMap.ARRIVED));
				ProductsForm productsForm = new ProductsForm(
						new SelectReturnCallback(ApplicationForm.this, CHANGE_FORM, ApplicationMap.PRODUCT) {
					@Override
					public void onReturn() {

						getData().setProperty(ApplicationMap.APPLICANT,
								getData().getProperty(ApplicationMap.PRODUCT_APPLICATION_APPLICANT));
						setFormFieldsFromData(CHANGE_FORM);

						// if extendable product is chosen and old
						// registry application
						// is still on form, disable extend decision
						// button and mode
						if (((ApplicationMap) getData()).getProperty(ApplicationMap.ID) == null
								|| ((ApplicationMap) getData()).getProperty(ApplicationMap.NR) == null) {
							isExtendApplication = true;
							setButtonsByApplicationType(ApplicationMap.TYPE_CODE_EXTEND,
									ApplicationMap.STATE_CODE_ENTERED);
						}
						save.setVisible(false);
						
						jumpToTop();
						
						checkCanExtend();
					}
				}, getData().getProperty(ApplicationMap.PRODUCT) instanceof ProductMap
						? (ProductMap) getData().getProperty(ApplicationMap.PRODUCT) : null, true);

				openForm(productsForm);
			}
		});
		extendProductForm.setEnabled(true);
		extendform.setWidget(0, 1, extendProductForm);
		return extendform;
	}

	/**
	 * Loob lisamise/menetlemise elementide gruppi osa.
	 */
	private FlexTable createMangageForm() {

		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setText(0, 0, getLabel(ApplicationMap.NR) + ":");// "Taotluse
		// nr:");

		form.setText(1, 0, getLabel(ApplicationMap.APPLICANT_NAME) + ":");// "Taotleja:");
		form.setText(2, 0, getLabel(ApplicationMap.ARRIVED) + ":");// "Esitamise
																	// kpv:");
		form.setText(3, 0, getLabel(ApplicationMap.DOCUMENTS) + ":");// "Seotud
		// dokumendid:");
		// form.setText(4, 0, getLabel(ApplicationMap.STATE_FEE) + ":");//
		// "Riigilõiv:");

		form.setText(0, 4, getLabel(ApplicationMap.PRODUCT_NAME) + ":");// "Toode:");
		form.setText(1, 5, getLabel(ApplicationMap.PRODUCT_TYPE_NAME) + ":");// "Liik:");
		form.setText(2, 4, getLabel(ApplicationMap.PRODUCT_GRADE) + ":");// "Etanolisis.%:");
		form.setText(3, 3, getLabel(ApplicationMap.PRODUCT_VOLUME_NAME) + ":");// "Maht:");
		form.setText(4, 3, getLabel(ApplicationMap.PRODUCT_EXAMPLES_COUNT) + ":");// "Näidised:");
		form.setText(1, 9, getLabel(ApplicationMap.PRODUCT_EXAMPLES) + ":");// "Toote
		// näidis:");
		form.setText(2, 8, getLabel(ApplicationMap.NOTES) + ":");// "Märkused:");
		form.setText(3, 7, getLabel(ApplicationMap.MTRCHECK) + ":");// "MTR
		// päring:");
		form.setText(4, 7, getLabel(ApplicationMap.PRINT) + ":");// "Prindi
		// taotlus:");
		form.setWidget(0, 3, UIutils.createSpacer(10, 1));
		form.setWidget(1, 8, UIutils.createSpacer(30, 1));
		form.setWidget(1, 1, new Image("images/t2rn.gif"));
		form.setWidget(2, 1, new Image("images/t2rn.gif"));
		form.setWidget(0, 5, new Image("images/t2rn.gif"));
		printLink = new HTML();
		form.setWidget(4, 8, printLink);
		form.setWidget(0, 2, addFormField(CHANGE_FORM, ApplicationMap.NR, new TextBox(), "100%"));

		linkToApplication = new Button("+");
		linkToApplication.addClickListener(new ClickListener() {
			public void onClick(Widget arg0) {
				EnterpriseDetails entDet = new EnterpriseDetails(
						new SelectReturnCallback(ApplicationForm.this, CHANGE_FORM, ApplicationMap.APPLICANT) {

					@Override
					public void onReturn() {
						if (isExtendApplication) {

							ApplicationForm.this.treatExtend.setVisible(true);
							saveExtendApplication.setVisible(true);
							ApplicationForm.this.treat.setVisible(false);
							save.setVisible(false);
						}

					}
				}, getData().getProperty(ApplicationMap.APPLICANT) instanceof EnterpriseMap
						? (EnterpriseMap) getData().getProperty(ApplicationMap.APPLICANT) : null);
				openForm(entDet);
			}
		});
		form.setWidget(1, 4, linkToApplication);
		form.setWidget(1, 2, addFormField(CHANGE_FORM, ApplicationMap.APPLICANT_NAME, new TextBox(), null, null,
				Validators.REQUIRED));
		form.setWidget(2, 2, addFormField(CHANGE_FORM, ApplicationMap.ARRIVED, new CalendarBox(), "12em", null,
				Validators.REQUIRED));

		form.setWidget(0, 6, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_NAME, new TextBox(), "100%", null,
				Validators.REQUIRED));
		form.setWidget(1, 7, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_TYPE_NAME, new TextBox()));
		form.setWidget(2, 6, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_GRADE, new TextBox()));
		form.setWidget(3, 5, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_VOLUME_NAME, new TextBox()));
		form.setWidget(4, 5, addFormField(CHANGE_FORM, ApplicationMap.PRODUCT_EXAMPLES_COUNT, new TextBox()));

		ApplicationForm returnForm = this;
		final EnterpriseList openForm = new EnterpriseList(
				new SelectReturnCallback(returnForm, CHANGE_FORM, ApplicationMap.APPLICANT) {
					@Override
					public void onReturn() {
						if ("Jah".equals(getData().getProperty(ApplicationMap.APPLICANT_ISACTIVE))) {
							getData().setProperty(ApplicationMap.APPLICANT_ISACTIVE, "true");
						} else if ("Ei".equals(getData().getProperty(ApplicationMap.APPLICANT_ISACTIVE))) {
							getData().setProperty(ApplicationMap.APPLICANT_ISACTIVE, "false");
						}

						if (isExtendApplication) {

							ApplicationForm.this.treatExtend.setVisible(true);
							saveExtendApplication.setVisible(true);
							ApplicationForm.this.treat.setVisible(false);
							save.setVisible(false);
						}

					}

				}, (EnterpriseMap) getData().getProperty(ApplicationMap.APPLICANT));
		Button applicantButton = UIutils.createButton(new ClickListener() {

			public void onClick(Widget sender) {
				openFormAndResetResult();
			}

			private void openFormAndResetResult() {
				SimplePanel body = MainPanel.getBody();
				Form form = (Form) body.getWidget();
				EnterpriseMap map = getData() != null
						? getData().getProperty(ApplicationMap.APPLICANT) instanceof EnterpriseMap
								? (EnterpriseMap) getData().getProperty(ApplicationMap.APPLICANT) : null
						: null;
				body.clear();
				if (map != null) {
					openForm.setData(map);
				}
				if (!openForm.isInitialised()) {
					try {
						openForm.init();
					} catch (Exception e) {
						e.printStackTrace();
						form.setError(e.toString());
					}
				}
				openForm.clearErrors();
				openForm.resetResultTable();
				body.add(openForm);

			}
		});
		form.setWidget(1, 3, applicantButton);
		documentsBtn = UIutils.createButton(new ClickListener() {

			public void onClick(Widget sender) {
				ApplicationDocumentsForm newForm = new ApplicationDocumentsForm(ApplicationForm.this);
				newForm.setData(getData());
				openForm(newForm);
			}
		});
		documentsBtn.setEnabled(false);
		getEnableDisableButtons().add(documentsBtn);
		form.setWidget(3, 1, documentsBtn);
		feeBtn = UIutils.createButton(new ClickListener() {
			public void onClick(Widget arg0) {
				PaymentMatchingForm payment = new PaymentMatchingForm(ApplicationForm.this, (ApplicationMap) getData());
				openForm(payment);
			}
		}, "...");
		feeBtn.setStyleName("SelectButton");
		feeBtn.setSize("1.46em", "1.46em");
		feeBtn.setEnabled(false);
		// form.setWidget(4, 1, feeBtn);
		getEnableDisableButtons().add(feeBtn);

		productForm = UIutils.createButton(new ClickListener() {
			public void onClick(Widget sender) {
				Object insertedDate = getFormFieldValue(CHANGE_FORM, ApplicationMap.ARRIVED);
				if (insertedDate != null)
					getData().put(ApplicationMap.ARRIVED, insertedDate);
				ProductsForm productsForm = new ProductsForm(
						new SelectReturnCallback(ApplicationForm.this, CHANGE_FORM, ApplicationMap.PRODUCT) {
					@Override
					public void onReturn() {

						if (isExtendApplication) {
							ApplicationForm.this.treatExtend.setVisible(true);
							saveExtendApplication.setVisible(true);
							ApplicationForm.this.treat.setVisible(false);
							save.setVisible(false);
						}

						/*
						 * ABaseDTOMap returnedData = getDtoData();
						 * ApplicationMap application = (ApplicationMap)
						 * returnedData .getProperty(ProductMap.APPLICATION); if
						 * (application != null) {
						 * updateApplication(application); } else { }
						 */
					}
				}, getData().getProperty(ApplicationMap.PRODUCT) instanceof ProductMap
						? (ProductMap) getData().getProperty(ApplicationMap.PRODUCT) : null);
				openForm(productsForm);
			}
		});
		productForm.setEnabled(true);
		form.setWidget(0, 7, productForm);

		// form.setWidget(0, 7, UIutils.createOFButton(new ProductsForm(new
		// SelectReturnCallback(this,
		// CHANGE_FORM, ApplicationMap.PRODUCT),
		// (ProductMap)getData().getProperty(ApplicationMap.PRODUCT))));
		examplesButton = UIutils.createButton(new ClickListener() {

			public void onClick(Widget sender) {
				ExamplesForm newForm = new ExamplesForm(ApplicationForm.this);
				newForm.setData(getData());
				openForm(newForm);
			}
		});
		examplesButton.setEnabled(false);
		form.setWidget(1, 10, examplesButton);
		// We have to disable those buttons before the application
		// application has saved.
		getEnableDisableButtons().add(examplesButton);

		applNoteBtn = UIutils.createButton(new ClickListener() {
			public void onClick(Widget sender) {
				ApplicationNoteForm noteForm = new ApplicationNoteForm(ApplicationForm.this);
				noteForm.setData(getData());
				openForm(noteForm);
			}
		});
		applNoteBtn.setEnabled(true);
		form.setWidget(2, 9, applNoteBtn);
		getEnableDisableButtons().add(applNoteBtn);
		// getEnableDisableButtons().add(applNoteBtn);
		/* -- MTP päring button-- */
		Button mtrBut = UIutils.createButton(new ClickListener() {
			/**
			 * Mtr päring ja info kuvamine popup aknas
			 */
			public void onClick(Widget arg0) {
				if (getData().getProperty(ApplicationMap.APPLICANT) instanceof EnterpriseMap) {
					ServiceContext.getInstance().getExternalService()
							.makeMTRAndCustomsQuery(((EnterpriseMap) getData().getProperty(ApplicationMap.APPLICANT))
									.getText(EnterpriseMap.REG_ID), new AsyncCallback() {
						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onSuccess(java.lang.Object)
						 */
						public void onSuccess(Object arg0) {
							// TODO Auto-generated method stub
							MtrAndCustomsQueryResultMap resultMap = (MtrAndCustomsQueryResultMap) arg0;
							popupWindow(
									((EnterpriseMap) (getData().getProperty((ApplicationMap.APPLICANT))))
											.getProperty(EnterpriseMap.ID).toString(),
									makeMtrHTML((ApplicationMap) getData(), resultMap));
							UIutils.setLoadMessageVisible(false);
						}

						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onFailure(java.lang.Throwable)
						 */
						public void onFailure(Throwable arg0) {
							setError(arg0.getMessage());
							UIutils.setLoadMessageVisible(false);
						}

					});
				} else {
					setError("Ettevõtte andmed puuduvad!");
					UIutils.setLoadMessageVisible(false);
				}
			}
		});
		mtrBut.setEnabled(true);
		form.setWidget(3, 8, mtrBut);

		/* -- MTP päring button END-- */

		UIutils.setTableTextStyled(form);
		UIutils.setTextBoxesEnabled(form, false);
		this.getFormField(CHANGE_FORM, ApplicationMap.ARRIVED).removeStyleName("DisabledTextBox");
		// ((CalendarBox) this.getFormField(CHANGE_FORM,
		// ApplicationMap.ARRIVED)).setEnabled(true);

		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		cellFormatter.setColSpan(3, 0, 3);
		cellFormatter.setColSpan(4, 0, 3);
		cellFormatter.setColSpan(0, 2, 2);
		cellFormatter.setColSpan(2, 2, 2);
		cellFormatter.setColSpan(0, 6, 3);
		ServiceContext.getInstance().getRegistryService().toDay(new AsyncCallback() {

			public void onFailure(Throwable caught) {
				setError(caught.toString());
			}

			public void onSuccess(Object result) {
				if (getData().getProperty(ApplicationMap.ARRIVED) == null) {
					getData().put(ApplicationMap.ARRIVED, result);
					ApplicationForm.this.setFormFieldFromData(CHANGE_FORM, ApplicationMap.ARRIVED);
				}
			}

		});

		if (!UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
			UIutils.setElementsEnabled(form, false);
			cellFormatter.setVisible(4, 7, false);
		}

		return form;
	}

	private static native void popupWindow(String mtrCode, String data) /*-{
																		window.open("", mtrCode, "height=400, width=200,toolbar=no,scrollbars=1,menubar=no, resizable=1").document.write(data)
																		}-*/;

	private String makeMtrHTML(ApplicationMap map, MtrAndCustomsQueryResultMap mtrMap) {
		List list = (List) mtrMap.getProperty(MtrAndCustomsQueryResultMap.MTR_LICENSES);
		StringBuffer listBuffer = new StringBuffer();
		String onLubasid = "Ei";
		String onAktsiis = "Ei";
		for (int i = 0; i < list.size(); i++) {
			MtrLicenseMap mtrLicMap = (MtrLicenseMap) list.get(i);
			listBuffer.append("<p><b>Reg nr: " + mtrLicMap.getProperty(MtrLicenseMap.NR) + "<b/><br/>\n"
					+ "Reg kpv: <br/>\n" + "Tegevusloa andmise kpv: " + mtrLicMap.getProperty(MtrLicenseMap.DATE)
					+ "<br/>\n" + "Tegevusala: " + mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME) + "</p>\n");
			onLubasid = "Jah";
			if(mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME) != null 
					&& (mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME).equals("Hulgikaubandus")
					|| mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME).equals("Jaekaubandus")
					|| mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME).equals("Toitlustamine")
					|| mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME).equals("Hulgimüük")
					|| mtrLicMap.getProperty(MtrLicenseMap.BUSINESS_NAME).equals("Jaemüük")
							)){
				onAktsiis = "Jah";
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
				+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
				+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" + "<head>\n"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"
				+ "<meta http-equiv=\"Expires\" content=\"0\"/>\n"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"alkor.css\"  />\n" + "</head>\n"
				+ "<body style=\"height: 100%; margin: 0px;\">\n" + "<h2>MTR päring</h2>\n"
				+ "<p><b>Taotleja äriregistrikood: </b>"
				+ ((EnterpriseMap) map.getProperty(ApplicationMap.APPLICANT)).getProperty(EnterpriseMap.REG_ID)
				+ "</p>\n" + "<p><b>Ettevõtte registreeringu kehtivus MTR-is: "
				//+ mtrMap.getProperty(MtrAndCustomsQueryResultMap.MTR_REGISTRATION_DATE) + "</p>\n"
				+ onLubasid + "</p>\n"
				+ "<p><b>Aktsiisiloa kehtivus: "
				//+ mtrMap.getProperty(MtrAndCustomsQueryResultMap.EXCISE_LICENSE_VALID_DATE) + "</p>\n"
				+ onAktsiis + "</p>\n"
				+ "<p><b>Tegevusload MTR-is:</b><br/>\n" + listBuffer.toString() + "</p>\n" + "</body>\n"
				+ "</html>\n");
		return sb.toString();
	}

	@Override
	public void onDataEvent(DataChangeEvent event) {
		if (event.getType() == DataChangeEvent.DATA_MODIFIED) {
			setData(event.getData());
			setFormFieldsFromData(CHANGE_FORM);
			searchResultsTable.updateDataRow(event.getData());
		}
		// searchResultsTable.onDataEvent(event);
	}

	private void setPrintLink() {
		String appId = getData().getProperty(ApplicationMap.ID) != null
				? getData().getProperty(ApplicationMap.ID).toString() : null;
		if (appId != null) {
			printLink.setHTML("<a href='" + GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL + "?"
					+ ServiceConstants.DOC_ACTION_PARM + "=" + ServiceConstants.DOC_ACTION_GENERATE + "&"
					+ ServiceConstants.DOC_APPID_PARM + "=" + appId
					+ "' target='_blank'><img src='images/print.gif'/></a>");
		}
	}

	private void clearPrintLink() {
		printLink.setHTML("");
	}

	private void resetSearchForm() {
		setData(new ApplicationMap());
		searchResultsTable.getFilter().reset();
		resetFormFields(SEARCH_FORM);
	}

	public void updateApplication(ABaseDTOMap data) {
		setData(data);
		setFormFieldsFromData(CHANGE_FORM);
		searchResultsTable.updateDataRow(data);

	}

	public void askClassificators() {
		List countries = (List) ServiceContext.getInstance().getCached(ServiceContext.COUNTRIES);
		if (countries != null) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_ORIGINCOUNTRY_CODE, countries);
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE, countries);
		}
		List productTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_TYPE);
		if (productTypes != null) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_TYPE_CODE, productTypes);
		}
		List applicationStates = (List) ServiceContext.getInstance().getCached(ServiceContext.APPLICATION_STATE);
		if (applicationStates != null) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE, applicationStates);
		}
		List applicationTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.APPLICATION_TYPE);
		if (applicationTypes != null) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.TYPE_CODE, applicationTypes);
		}
	}

	private class ApplicationsTable extends ResultTable {

		public ApplicationsTable() {
			super(new ApplicationSearchFilter());
			this.addColumn(new Column(getLabel(ApplicationMap.ARRIVED), ApplicationMap.ARRIVED, null,
					Column.styleNormal, null)); // "Esitamise
			// kpv"
			this.addColumn(new Column(getLabel(ApplicationMap.DECISION_DATE), ApplicationMap.DECISION_DATE, null,
					Column.styleNormal, null));
			// registrikande lõppkuupäev
			this.addColumn(new Column(getLabel(ApplicationMap.REGISTRYENTRY_VALID_UNTIL),
					ApplicationMap.REGISTRYENTRY_VALID_UNTIL, null, Column.styleNormal, null));
			this.addColumn(new Column(getLabel(ApplicationMap.NR), ApplicationMap.NR, null, Column.styleNormal, null)); // "Taotluse
			// nr"
			this.addColumn(new Column(getLabel(ApplicationMap.APPLICANT_NAME), ApplicationMap.APPLICANT_NAME, null,
					Column.styleNormal, null)); // "Taotleja nimi"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_PRODUCER_NAME),
					ApplicationMap.PRODUCT_PRODUCER_NAME, null, Column.styleNormal, null)); // "Tootja
																							// nimi"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_PRODUCER_COUNTRY),
					ApplicationMap.PRODUCT_PRODUCER_COUNTRY_NAME, null, Column.styleNormal, null)); // "Tootjamaa"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_NAME), ApplicationMap.PRODUCT_NAME, null,
					Column.styleNormal, null)); // "Toote nimetus"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_VOLUME_NAME), ApplicationMap.PRODUCT_VOLUME_NAME,
					null, Column.styleNormal, null));
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_TYPE_CODE), ApplicationMap.PRODUCT_TYPE_NAME,
					null, Column.styleNormal, null));
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_ORIGINCOUNTRY_CODE),
					ApplicationMap.PRODUCT_ORIGINCOUNTRY_NAME, null, Column.styleNormal, null));
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_CODE), ApplicationMap.PRODUCT_CODE, null,
					Column.styleNormal, null)); // "KN kood"
			this.addColumn(new Column(getLabel(ApplicationMap.PRODUCT_GRADE), ApplicationMap.PRODUCT_GRADE, null,
					Column.styleNormal, null)); // "Etanoolisisaldus,vol%"
			this.addColumn(new Column(getLabel(ApplicationMap.STATE_NAME), ApplicationMap.STATE_NAME, null,
					Column.styleNormal, null)); // "Staatus"
			this.addColumn(new Column(getLabel(ApplicationMap.TYPE_NAME), ApplicationMap.TYPE_NAME, null,
					Column.styleNormal, null)); // "TĆ¼Ć¼p"
			this.addColumn(new Column(getLabel(ApplicationMap.STATE_FEE), ApplicationMap.LATEST_PAYMENT, null,
					Column.styleNormal, null)); // Riigilõiv
			this.addColumn(new Column(null, null, getLabel(ResultTable.SELECT), Column.styleUrl, ResultTable.SELECT));
			if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
				this.addColumn(Column.getCopyInstance()); // "kopeeri"
				this.addColumn(
						new Column(null, null, getLabel(ResultTable.CANCEL), Column.styleUrl, ResultTable.CANCEL));

			}

		}

		@Override
		protected void getData(SearchFilter filter) {
			if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_AUDIT, ServiceConstants.ROLE_REG_WRK,
					ServiceConstants.ROLE_USR_ADM })) { // turva
				ServiceContext.getInstance().getRegistryService().search(filter, this);
			}
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

		@Override
		protected String getSpecialColumnText(Column col, ABaseDTOMap row) {

			if (col.getText().equals(getLabel(ResultTable.CANCEL))) {
				if (row.getProperty(ApplicationMap.STATE_CODE).equals(ApplicationMap.STATE_CODE_PRESENTED)) {
					return col.getText();
				} else if (row.getProperty(ApplicationMap.STATE_CODE)
						.equals(ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION)) {
					return col.getText();
				} else if (row.getProperty(ApplicationMap.STATE_CODE).equals(ApplicationMap.STATE_CODE_CHECKING)) {
					return col.getText();
				} else {
					return null;
				}
			} else if (col.getText().equals(getLabel(ResultTable.SELECT))) {
				return col.getText();
			} else if (col.getText().equals(getLabel(ResultTable.COPY))) {
				return col.getText();
			} else {
				return col.getText();
			}

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
				if (ServiceConstants.APPL_STATE_RGE.equals(stateCode)
						|| ServiceConstants.APPL_STATE_REXT.equals(stateCode)) {
					// String dateString = ((RegistryEntryMap) row
					// .getProperty(ApplicationMap.REGISTRY_ENTRY))
					// .getText(RegistryEntryMap.VALID_UNTIL);
					String dateString = null;
					Object dateObj = ((RegistryEntryMap) row.getProperty(ApplicationMap.REGISTRY_ENTRY)) != null
							? ((RegistryEntryMap) row.getProperty(ApplicationMap.REGISTRY_ENTRY))
									.getProperty(RegistryEntryMap.VALID_UNTIL)
							: null;
					if (dateObj != null) {
						dateString = dateObj.toString();
						Date date = new Date();
						date.setYear(Integer.parseInt(dateString.substring(dateString.lastIndexOf(".") + 1)) - 1900);
						date.setMonth(Integer.parseInt(
								dateString.substring(dateString.indexOf(".") + 1, dateString.lastIndexOf("."))) - 1);
						date.setDate(Integer.parseInt(dateString.substring(0, dateString.indexOf("."))));
						long difference = (date.getTime() - new Date().getTime()) / 1000;
						if (difference <= (60L * 60L * 24L * 60L)) {
							styleName = "Purple";
						} else {
							if (ServiceConstants.APPL_STATE_RGE.equals(stateCode))
								styleName = "Green";
							else if (ServiceConstants.APPL_STATE_REXT.equals(stateCode))
								styleName = "lightGreen";
						}
					}
				} else if (ServiceConstants.APPL_STATE_RGN.equals(stateCode)
						|| ServiceConstants.APPL_STATE_CAN.equals(stateCode)
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
				if (((ApplicationMap) row).getProperty(ApplicationMap.ID)
						.equals(listItem.getProperty(ApplicationMap.ID)))
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
							Cookies.setCookie("RL", "FALSE");
							setButtonsByApplicationType(
									(String) (((ApplicationMap) row).getProperty(ApplicationMap.TYPE_CODE)),
									(String) ((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE));
							if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
								if (((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE)
										.equals(ApplicationMap.STATE_CODE_CHECKING)
										|| ((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE)
												.equals(ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION)
										|| ((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE)
												.equals(ApplicationMap.STATE_CODE_PROCESSING)
												&& ((!(ApplicationMap.MODIFIED_BY).equals(
														((ApplicationMap) row).getProperty(getUserInfo().getName()))
														&& ((ApplicationMap) row)
																.getProperty(ApplicationMap.MODIFIED_BY) != null)
														|| !ApplicationMap.CREATED_BY.equals(((ApplicationMap) row)
																.getProperty(getUserInfo().getName())))) {
									UserInfo userInfo = getUserInfo();
									// if current proccessor is different from
									// logged user, show ConfirmDialog
									if (!userInfo.getFirstName()
											.equals(((ApplicationMap) row)
													.getProperty(ApplicationMap.PROCESSOR_FIRSTNAME))
											&& !userInfo.getLastName().equals(((ApplicationMap) row)
													.getProperty(ApplicationMap.PROCESSOR_LASTNAME))) {
										ConfirmDialog confirmDialog = new ConfirmDialog(
												"Taotlus on antud hetkel menetluses kasutaja \""
														+ ((ApplicationMap) row)
																.getProperty(ApplicationMap.PROCESSOR_FIRSTNAME)
														+ " "
														+ ((ApplicationMap) row)
																.getProperty(ApplicationMap.PROCESSOR_LASTNAME)
														+ "\" poolt.\n" + "Kas soovite taotluse haldamise üle võtta?",
												new TakeOverProcessingListener((ABaseDTOMap) row));
										confirmDialog.hide();
										confirmDialog.show();
									} else {
										updateApplication((ApplicationMap) row);

										setPrintLink();
										ApplicationForm.this.setButtonsEnabled(true);
										((Label) main.getWidget(0, 0)).setText(
												getLabel(ApplicationFormMessages.PROCESS_APPLICATION_TABLE_TITLE));
										specify.setEnabled(((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE)
												.equals(ApplicationMap.STATE_CODE_CHECKING));
										ApplicationForm.this.clearInfo();
										jumpToTop();
									}
								} else if (((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE)
										.equals(ApplicationMap.STATE_CODE_PRESENTED)) {
									ConfirmDialog confirmDialog = new ConfirmDialog(
											"Kas soovite võtta taotlust kontrollimisele?",
											new ProcessListener((ABaseDTOMap) row));
									confirmDialog.hide();
									confirmDialog.show();
								} else {
									ApplicationForm.this.searchResultsTable.setSelectedRow(row);
									ApplicationForm.this.setData((ApplicationMap) row);
									setPrintLink();
									setFormFieldsFromData(CHANGE_FORM);
									// Change the page title
									((Label) main.getWidget(0, 0))
											.setText(getLabel(ApplicationFormMessages.PROCESS_APPLICATION_TABLE_TITLE));

									if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
										ApplicationForm.this.setButtonsEnabled(true);
										specify.setEnabled(((ApplicationMap) row).getProperty(ApplicationMap.STATE_CODE)
												.equals(ApplicationMap.STATE_CODE_CHECKING));
									} else {
										applNoteBtn.setEnabled(true);
										documentsBtn.setEnabled(true);
										clearPrintLink();
									}

									jumpToTop();
								}

								applicationSelectedAction(false);

							} else if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_AUDIT })) {
								ApplicationForm.this.searchResultsTable.setSelectedRow(row);
								ApplicationForm.this.setData((ApplicationMap) row);
								// setPrintLink();
								setFormFieldsFromData(CHANGE_FORM);
								examplesButton.setEnabled(true);
								documentsBtn.setEnabled(true);
								applNoteBtn.setEnabled(true);
								productForm.setEnabled(true);
								linkToApplication.setEnabled(true);
								jumpToTop();
							}
						}

					};
				} else if (ResultTable.CANCEL.equals(listenerType)) {
					listener = new ClickListener() {

						public void onClick(Widget sender) {
							ConfirmDialog confirmDialog = new ConfirmDialog(
									"Kas olete kindel et soovite antud kirjet kustutada?",
									new CancelListener((ABaseDTOMap) row));
							confirmDialog.hide();
							confirmDialog.show();
						}

					};
				} else if (ResultTable.COPY.equals(listenerType)) {
					listener = new ClickListener() {
						public void onClick(Widget arg0) {
							// Copy process
							ApplicationMap copy = ((ApplicationMap) row);
							copy.setProperty(ApplicationMap.CREATED, null);
							copy.setProperty(ApplicationMap.ID, null);
							copy.setProperty(ApplicationMap.NR, null);
							copy.setProperty(ApplicationMap.NOTES, null);
							copy.setProperty(ApplicationMap.DOCUMENTS, null);
							copy.setProperty(ApplicationMap.PROCESSOR, null);
							copy.setProperty(ApplicationMap.TYPE, null);
							copy.setProperty(ApplicationMap.STATE, null);
							copy.setProperty(ApplicationMap.DECISION, null);
							copy.setProperty(ApplicationMap.REGISTRY_ENTRY, null);
							copy.setProperty(ApplicationMap.PRODUCT_ID, null);
							copy.setProperty(ApplicationMap.PRODUCT_APPLICATION, null);
							copy.setProperty(ApplicationMap.PRODUCT_CREATED, null);
							copy.setProperty(ApplicationMap.PRODUCT_VERSION, null);
							copy.setProperty(ApplicationMap.VERSION, null);
							setData(copy);

							ProductsForm productsForm = new ProductsForm(new SelectReturnCallback(ApplicationForm.this,
									CHANGE_FORM, ApplicationMap.PRODUCT) {
								@Override
								public void onReturn() {

									/*
									 * ABaseDTOMap returnedData = getDtoData();
									 * ApplicationMap application =
									 * (ApplicationMap) returnedData
									 * .getProperty(ProductMap .APPLICATION); if
									 * (application != null) {
									 * updateApplication(application); } else {
									 * 
									 * }
									 */
								}
							}, getData().getProperty(ApplicationMap.PRODUCT) != null
									? (ProductMap) getData().getProperty(ApplicationMap.PRODUCT) : null);
							openForm(productsForm);
						}
					};
				} else
					;
			} catch (Exception e) {
				GWT.log("clickListener:" + e.getMessage(), e);
				System.out.println("clickListener out :" + e.getMessage());
				e.printStackTrace();
			}
			return listener;
		}

		/**
		 * Keelab riigilõivu nupu kui taotlusel puudub number
		 */
		private void applicationSelectedAction(boolean forceHide) {
			if (getData() != null) {
				if ((getData().getProperty(ApplicationMap.NR) == null
						|| "".equals(getData().getProperty(ApplicationMap.NR)))) {
					GWT.log("STATE:NONUMBER");
					feeBtn.setEnabled(false); // riigilõivunupu keelamine kui
												// pole taotluse numbrit
				}
				if (forceHide
						|| ApplicationMap.STATE_CODE_ENTERED.equals(getData().getProperty(ApplicationMap.STATE_CODE))) {
					GWT.log("STATE:ENTERED");
					feeBtn.setEnabled(false); // riigilõivunupu peitmine
					save.setVisible(false);
					saveExtendApplication.setVisible(false);
				}
				if (ApplicationMap.STATE_CODE_ENTERED.equals(getData().getProperty(ApplicationMap.STATE_CODE))) {
					specify.setVisible(false); // esitamata taotluse puhul
												// peidab muud nupud ka ära
					treat.setVisible(false);
					treatExtend.setVisible(false);
				}
			}
		}

		public class ProcessListener implements ClickListener {

			private final ABaseDTOMap dtoMap;

			public ProcessListener(ABaseDTOMap dtoMap) {
				this.dtoMap = dtoMap;
			}

			public void onClick(Widget sender) {

				final boolean feeBtnHidden = ApplicationMap.STATE_CODE_PRESENTED
						.equals(dtoMap.getProperty(ApplicationMap.STATE_CODE))
						&& ApplicationMap.TYPE_CODE_ARE.equals(dtoMap.getProperty(ApplicationMap.TYPE_CODE));
				GWT.log("state:" + dtoMap.getProperty(ApplicationMap.STATE_CODE) + " type:"
						+ dtoMap.getProperty(ApplicationMap.TYPE_CODE) + " bool:" + feeBtnHidden);
				dtoMap.setProperty(ApplicationMap.PROCESSOR,
						Form.getUserInfo().getUserManageMap().get(UserManageMap.PERSON));
				dtoMap.setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_CHECKING);
				ServiceContext.getInstance().getRegistryService().saveOrUpdateApplication((ApplicationMap) dtoMap,
						new AsyncCallback() {

							public void onFailure(Throwable caught) {
								setError(caught.toString());
							}

							public void onSuccess(Object result) {
								ApplicationForm.this.setData((ApplicationMap) result);
								setPrintLink();

								setFormFieldsFromData(CHANGE_FORM);
								ApplicationForm.this.setButtonsEnabled(true);

								applicationSelectedAction(feeBtnHidden); // riigilõivu
																			// nupu
																			// keelamine

								((Label) main.getWidget(0, 0))
										.setText(getLabel(ApplicationFormMessages.PROCESS_APPLICATION_TABLE_TITLE));
								ApplicationForm.this.updateApplication((ABaseDTOMap) result);
								specify.setEnabled(((ApplicationMap) result).getProperty(ApplicationMap.STATE_CODE)
										.equals(ApplicationMap.STATE_CODE_CHECKING));
								jumpToTop();
							}

						});

			}

		}

		public class CancelListener implements ClickListener {

			private final ABaseDTOMap dtoMap;

			public CancelListener(ABaseDTOMap dtoMap) {
				this.dtoMap = dtoMap;
			}

			public void onClick(Widget sender) {

				dtoMap.setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_CANCELED);
				ServiceContext.getInstance().getRegistryService().saveOrUpdateApplication((ApplicationMap) dtoMap,
						new AsyncCallback() {

							public void onFailure(Throwable caught) {
								setError(caught.toString());
							}

							public void onSuccess(Object result) {
								setData((ApplicationMap) result);
								searchResultsTable.updateDataRow((ApplicationMap) result);

								// searchResultsTable.getData(getFormFieldValues(SEARCH_FORM));
							}

						});

			}

		}

		private class TakeOverProcessingListener implements ClickListener {

			private final ABaseDTOMap dtoMap;

			public TakeOverProcessingListener(ABaseDTOMap dtoMap) {
				this.dtoMap = dtoMap;
			}

			public void onClick(Widget sender) {
				dtoMap.setProperty(ApplicationMap.PROCESSOR,
						Form.getUserInfo().getUserManageMap().get(UserManageMap.PERSON));
				treat.setEnabled(false);
				ServiceContext.getInstance().getRegistryService().saveOrUpdateApplication((ApplicationMap) dtoMap,
						new AsyncCallback() {

							public void onFailure(Throwable caught) {
								setError(caught.toString());
							}

							public void onSuccess(Object result) {
								updateApplication((ApplicationMap) result);
								treat.setEnabled(true);

								setPrintLink();
								ApplicationForm.this.setButtonsEnabled(true);
								((Label) main.getWidget(0, 0))
										.setText(getLabel(ApplicationFormMessages.PROCESS_APPLICATION_TABLE_TITLE));
								specify.setEnabled(((ApplicationMap) result).getProperty(ApplicationMap.STATE_CODE)
										.equals(ApplicationMap.STATE_CODE_CHECKING));
								ApplicationForm.this.clearInfo();
								// searchResultsTable.getData();
								jumpToTop();
							}

						});

			}

		}

	}

	private class SaveListener implements ClickListener {
		// "Salvesta"

		public void onClick(Widget sender) {
			// check if the application nr is filled or not
			setDataFromFormFields(CHANGE_FORM);
			getData().setProperty(ApplicationMap.PROCESSOR,
					Form.getUserInfo().getUserManageMap().get(UserManageMap.PERSON));

			if (ApplicationForm.this.getErrors() != null && !ApplicationForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					ApplicationForm.this.setError((String) getErrors().get(i));
				}
			} else {
				final String applicationStatus = getData().getProperty(ApplicationMap.STATE) != null
						? getData().getText(ApplicationMap.STATE_CODE) : "";
				if (applicationStatus.equals(ApplicationMap.STATE_CODE_CHECKING)) {
					getData().setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_PROCESSING);
				}
				ServiceContext.getInstance().getRegistryService()
						.saveOrUpdateApplication((ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {

							public void onFailure(Throwable caught) {
								/*
								 * KONTROLL KAS CAUGHT ON 666
								 */
								String c = caught != null ? caught.toString() : "";

								if (c.contains("666")) {
									if (!UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_CLASS_ADM })) {
										setError("Ettevõtte saldo pole piisav");
										return;
									}
									ConfirmDialog conf = new ConfirmDialog(
											"Ettevõttel ei ole riigilõiv tasutud (Pole piisav saldo). Jätkan?",
											new ClickListener() {
										public void onClick(Widget arg0) {
											ServiceContext.getInstance().getRegistryService().saveOrUpdateApplicationA(
													(ApplicationMap) cleanDataBeforeSave(getData()),
													new AsyncCallback() {

												public void onFailure(Throwable caught) {

													setError(caught.toString());
													if (applicationStatus.equals(ApplicationMap.STATE_CODE_CHECKING)) {
														ApplicationForm.this.getData().setProperty(
																ApplicationMap.STATE_CODE, applicationStatus);
													}

												}

												public void onSuccess(final Object result) {
													// ApplicationForm.this
													// .setInfo("Taotlus
													// salvestatud!");
													updateApplication((ApplicationMap) result);
													// kui
													// taotluse
													// tüüp
													// on
													// 'Taotlus
													// registrikande
													// pikendamiseks'
													// ja
													// staatus
													// oli
													// 'Kontrollimisel'
													// tuleb
													// maha
													// võtta
													// riigilõiv
													/*
													 * if ( ApplicationMap .
													 * STATE_CODE_CHECKING .
													 * equals (
													 * applicationStatus ) &&
													 * ApplicationMap .
													 * TYPE_CODE_EXTEND . equals
													 * ( getData ( ) .
													 * getProperty (
													 * ApplicationMap .
													 * TYPE_CODE ) ) ) {
													 * ServiceContext .
													 * getInstance ( ) .
													 * getRegistryService ( ) .
													 * processPaymentMatching (
													 * ( ( ApplicationMap )
													 * getData ( ) ) ,
													 * EXTEND_STATE_FEE_AMOUNT ,
													 * new AsyncCallback ( ) {
													 * 
													 * public void onFailure (
													 * Throwable caught ) {
													 * ApplicationForm . this .
													 * setInfo (
													 * "Taotlus salvestatud!" )
													 * ;
													 * 
													 * }
													 * 
													 * public void onSuccess (
													 * Object result1 ) {
													 * ApplicationForm . this .
													 * setInfo (
													 * "Taotlus salvestatud!" )
													 * ; / / hack - / /
													 * parameters / / are lost /
													 * / in / /
													 * processPaymentMatching (
													 * ) - fix / / it ! ( (
													 * ApplicationMap ) result1
													 * ) . setProperty (
													 * ApplicationMap .
													 * PRODUCT_TYPE_NAME ,
													 * getData ( ) . getProperty
													 * ( ApplicationMap .
													 * PRODUCT_TYPE_NAME ) ) ; (
													 * ( ApplicationMap )
													 * result1 ) . setProperty (
													 * ApplicationMap .
													 * PRODUCT_VOLUME_NAME ,
													 * getData ( ) . getProperty
													 * ( ApplicationMap .
													 * PRODUCT_VOLUME_NAME ) ) ;
													 * updateApplication ( (
													 * ApplicationMap ) result1
													 * ) ; ApplicationForm .
													 * this . setInfo (
													 * "Taotlus salvestatud!" )
													 * ; } } ) ; }
													 */
													setPrintLink();
													ApplicationForm.this.setButtonsEnabled(true);
													ApplicationForm.this.setInfo(getLabel("applicationSaved"));
													Cookies.setCookie("RL", "FALSE");
													ApplicationForm.this.setInfo("Taotlus salvestatud!");
													((Label) main.getWidget(0, 0)).setText(getLabel(
															ApplicationFormMessages.PROCESS_APPLICATION_TABLE_TITLE));
												}
											});

										};
									});
									conf.hide();
									conf.show();
								} else {
									setError(caught.toString());
									if (applicationStatus.equals(ApplicationMap.STATE_CODE_CHECKING)) {
										ApplicationForm.this.getData().setProperty(ApplicationMap.STATE_CODE,
												applicationStatus);
									}
								}
							}

							public void onSuccess(final Object result) {
								// ApplicationForm.this
								// .setInfo("Taotlus salvestatud!");
								updateApplication((ApplicationMap) result);
								// kui taotluse tüüp on 'Taotlus
								// registrikande pikendamiseks' ja
								// staatus oli 'Kontrollimisel'
								// tuleb maha võtta riigilõiv
								/*
								 * if (ApplicationMap.STATE_CODE_CHECKING
								 * .equals(applicationStatus) &&
								 * ApplicationMap.TYPE_CODE_EXTEND
								 * .equals(getData() .getProperty(
								 * ApplicationMap.TYPE_CODE))) { ServiceContext
								 * .getInstance() .getRegistryService()
								 * .processPaymentMatching( ((ApplicationMap)
								 * getData()), EXTEND_STATE_FEE_AMOUNT, new
								 * AsyncCallback() {
								 * 
								 * public void onFailure( Throwable caught) {
								 * ApplicationForm.this .setInfo(
								 * "Taotlus salvestatud!");
								 * 
								 * }
								 * 
								 * public void onSuccess( Object result1) {
								 * ApplicationForm.this .setInfo(
								 * "Taotlus salvestatud!"); // hack - //
								 * parameters // are lost // in //
								 * processPaymentMatching()-fix // it!
								 * ((ApplicationMap) result1) .setProperty(
								 * ApplicationMap.PRODUCT_TYPE_NAME, getData()
								 * .getProperty(
								 * ApplicationMap.PRODUCT_TYPE_NAME));
								 * ((ApplicationMap) result1) .setProperty(
								 * ApplicationMap.PRODUCT_VOLUME_NAME, getData()
								 * .getProperty(
								 * ApplicationMap.PRODUCT_VOLUME_NAME));
								 * updateApplication((ApplicationMap) result1);
								 * ApplicationForm.this .setInfo(
								 * "Taotlus salvestatud!"); } }); }
								 */
								setPrintLink();
								ApplicationForm.this.setButtonsEnabled(true);
								ApplicationForm.this.setInfo(getLabel("applicationSaved"));
								Cookies.setCookie("RL", "FALSE");
								ApplicationForm.this.setInfo("Taotlus salvestatud!");
								((Label) main.getWidget(0, 0))
										.setText(getLabel(ApplicationFormMessages.PROCESS_APPLICATION_TABLE_TITLE));
							}
						});
			}
			ApplicationForm.this.feeBtn.setEnabled(true);
			ApplicationForm.this.documentsBtn.setEnabled(true);
			// ApplicationForm.this
			// .setInfo("Taotlus salvestatud!");
		}
	}

	public void checkCanExtend() {

		ProductMap map = (ProductMap) getData().getProperty(ApplicationMap.PRODUCT);
		
		if (map != null) {
			ServiceContext.getInstance().getRegistryService().checkCanExtendByProduct((Long) map.getProperty(ProductMap.ID),
					new AsyncCallback() {

						public void onFailure(Throwable caught) {
							saveExtendApplication.setEnabled(false);
							saveExtendApplication.setVisible(false);
						}

						public void onSuccess(Object result) {
							saveExtendApplication.setEnabled(true);
							saveExtendApplication.setVisible(true);
						}
					});
		} else {
			saveExtendApplication.setEnabled(true);
			saveExtendApplication.setVisible(true);
		}

	}

	private class SaveExtendApplicationListener implements ClickListener { // "Salvesta"

		public void onClick(Widget sender) {
			// check if the application nr is filled or not

			if (((ApplicationMap) getData()).getProperty(ApplicationMap.ID) != null
					|| ((ApplicationMap) getData()).getProperty(ApplicationMap.NR) != null) {
				setError(
						"Uue pikendamise taotluse lisamiseks tühjenda taotluse lisamise vorm ja lisa pikendatav toode uuesti");
				save.setVisible(true);
				saveExtendApplication.setVisible(false);
				return;
			}

			setDataFromFormFields(CHANGE_FORM);
			getData().setProperty(ApplicationMap.PROCESSOR,
					Form.getUserInfo().getUserManageMap().get(UserManageMap.PERSON));

			if (ApplicationForm.this.getErrors() != null && !ApplicationForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					ApplicationForm.this.setError((String) getErrors().get(i));
				}
			} else {

				ApplicationMap newApplication = new ApplicationMap();
				newApplication.setProperty(ApplicationMap.ARRIVED, getData().getProperty(ApplicationMap.ARRIVED));
				newApplication.setProperty(ApplicationMap.REGISTRY_ENTRY,
						getData().getProperty(ApplicationMap.PRODUCT_APPLICATION_REG_ENTRY));
				newApplication.setProperty(ApplicationMap.PRODUCT, getData().getProperty(ApplicationMap.PRODUCT));
				newApplication.setProperty(ApplicationMap.ARRIVED, getData().getProperty(ApplicationMap.ARRIVED));
				if (getData().getProperty(ApplicationMap.APPLICANT) != null)
					newApplication.setProperty(ApplicationMap.APPLICANT,
							getData().getProperty(ApplicationMap.APPLICANT));
				else
					newApplication.setProperty(ApplicationMap.APPLICANT,
							getData().getProperty(ApplicationMap.PRODUCT_APPLICATION_APPLICANT));
				newApplication.setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_PROCESSING);
				newApplication.setProperty(ApplicationMap.TYPE_CODE, ApplicationMap.TYPE_CODE_EXTEND);
				newApplication.setProperty(ApplicationMap.PROCESSOR, getData().getProperty(ApplicationMap.PROCESSOR));

				ServiceContext.getInstance().getRegistryService().saveNewExtendApplication(
						(ApplicationMap) cleanDataBeforeSave(newApplication), new AsyncCallback() {

							public void onFailure(Throwable caught) {
								setError(
										"Taotluse salvestamine ebaõnnestus! Registrikanne on kehtetu, taotluse esitamise tähtaeg on möödunud, taotlus on salvestatud (esitamata) või juba esitatud.");
							}

							public void onSuccess(Object result) {
								updateApplication((ApplicationMap) result);

								setPrintLink();
								ApplicationForm.this.setButtonsEnabled(true);
								save.setVisible(true);
								saveExtendApplication.setVisible(false);
								isExtendApplication = false;
							}
						});
			}

		}
	}

	private class ClarificationListener implements ClickListener {

		public void onClick(Widget sender) {

			setDataFromFormFields(CHANGE_FORM);
			getData().setProperty(ApplicationMap.STATE_CODE, ApplicationMap.STATE_CODE_NEEDS_CLARIFICATION);
			ServiceContext.getInstance().getRegistryService()
					.saveOrUpdateApplication((ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {

						public void onFailure(Throwable caught) {
							setError(caught.toString());
						}

						public void onSuccess(Object result) {
							setData((ApplicationMap) result);
							setFormFieldsFromData(CHANGE_FORM);
							ApplicationForm.this.setInfo("Toiming õnnestus!");
							searchResultsTable.updateDataRow((ApplicationMap) result);
							// searchResultsTable.getData();
						}

					});

		}

	}

	private class ExtendApplicationListener implements ClickListener {

		public void onClick(Widget sender) {
			setDataFromFormFields(CHANGE_FORM);
			getData().setProperty(ApplicationMap.STATE_CODE, ServiceConstants.APPL_STATE_REXT);
			ServiceContext.getInstance().getRegistryService()
					.saveOrUpdateApplication((ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {

						public void onFailure(Throwable caught) {
							setError(caught.toString());
							UIutils.setLoadMessageVisible(false);
						}

						public void onSuccess(Object result) {
							UIutils.setLoadMessageVisible(false);
							setData((ApplicationMap) result);
							setFormFieldsFromData(CHANGE_FORM);
							ApplicationForm.this.setInfo("Toiming õnnestus!");
							searchResultsTable.updateDataRow((ApplicationMap) result);

						}

					});
		}

	}

	private class DecisionListener implements ClickListener { // "Otsusta"

		public void onClick(Widget sender) {

			if (getData().getProperty(ApplicationMap.ID) == null) {
				setError("Salvesta taotlus enne otsustamist");
			} else if (getData().getProperty(ApplicationMap.NR) == null) {
				setError("Taotlusel peab olema number");
			} else if (ServiceConstants.APPL_STATE_REXT.equals(getData().getProperty(ApplicationMap.STATE_CODE))
					|| ServiceConstants.APPL_TYPE_ARP.equals(getData().getProperty(ApplicationMap.TYPE_CODE))) {
				setError("Pikendamise taotlusele ei saa otsust lisada");
			} else {
				/*
				 * Muu on korras, kontrollime riigilõivu
				 */
				// ApplicationMap map = (ApplicationMap) getData();

				// String rl = (String) map
				// .getProperty(ApplicationMap.LATEST_PAYMENT);

				// if ((rl == null || rl == "") &&
				// !UIutils.userHasPriviledge(new
				// String[]{ServiceConstants.ROLE_CLASS_ADM})) {
				// setError("Riigilõiv sidumata!");
				// } else {
				// Double summa = new Double(rl);
				// if(summa == 0){
				// / setError("Riigilõiv sidumata (summa olemas)!");
				// return;
				// }

				DecisionForm newForm = new DecisionForm(ApplicationForm.this, (ApplicationMap) getData());
				openForm(newForm);
				// }
			}
		}
	}

	private class ExtendDecisionListener implements ClickListener { // "Otsusta"

		public void onClick(Widget sender) {
			if (getData().getProperty(ApplicationMap.ID) == null) {
				setError("Salvesta taotlus enne otsustamist");
			} else if (getData().getProperty(ApplicationMap.NR) == null) {

				setError("Taotlusel peab olema number");
			} else {
				/*
				 * Muu on korras, kontrollime riigilõivu
				 */
				// ApplicationMap map = (ApplicationMap) getData();

				// String rl = (String) map
				// .getProperty(ApplicationMap.LATEST_PAYMENT);

				// if ((rl == null || rl == "") &&
				// !UIutils.userHasPriviledge(new
				// String[]{ServiceConstants.ROLE_CLASS_ADM})) {
				// setError("Riigilõiv sidumata!");
				// } else {
				ExtendDecisionForm newForm = new ExtendDecisionForm(ApplicationForm.this, (ApplicationMap) getData());
				openForm(newForm);
				// }
			}

		}
	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable)
			Window.alert(value.toString());
		else if (key.equals(ServiceContext.COUNTRIES)) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_ORIGINCOUNTRY_CODE, (List) value);
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_PRODUCER_COUNTRY_CODE, (List) value);
		} else if (key.equals(ServiceContext.PRODUCT_TYPE)) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.PRODUCT_TYPE_CODE, (List) value);
		} else if (key.equals(ServiceContext.APPLICATION_STATE)) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.STATE_CODE, (List) value);
		} else if (key.equals(ServiceContext.APPLICATION_TYPE)) {
			makeClassSelectionList(SEARCH_FORM, ApplicationSearchFilter.TYPE_CODE, (List) value);
		}

	}

	//
	// public void onReturn() {
	// searchResultsTable.getData();
	// }

	private boolean isExtendable(ABaseDTOMap map) {
		return map != null && UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })
				&& map.getProperty(ApplicationMap.ID) != null && map.getProperty(ApplicationMap.NR) != null
				&& !ServiceConstants.APPL_STATE_REXT.equals(map.getProperty(ApplicationMap.STATE_CODE))
				&& ServiceConstants.APPL_TYPE_ARP.equals(map.getProperty(ApplicationMap.TYPE_CODE));
	}

	private void setButtonsByApplicationType(String type, String state) {
		// EIT'ist tulnud taotlused?
		if (ApplicationMap.TYPE_CODE_EXTEND.equals(type)) {
			treatExtend.setVisible(!ApplicationMap.STATE_CODE_ENTERED.equals(state));
			treat.setVisible(false);
			specify.setEnabled(getData().getProperty(ApplicationMap.STATE) != null
					&& getData().getProperty(ApplicationMap.STATE_CODE).equals(ApplicationMap.STATE_CODE_CHECKING));
		} else {
			treatExtend.setVisible(false);
			treat.setVisible(true);
			save.setVisible(true);
			specify.setEnabled(getData().getProperty(ApplicationMap.STATE) != null
					&& getData().getProperty(ApplicationMap.STATE_CODE).equals(ApplicationMap.STATE_CODE_CHECKING));
		}
	}

	@Override
	public void setFormFieldsFromData(String formName) {
		super.setFormFieldsFromData(formName);
		if (getData() != null) {
			setButtonsByApplicationType((String) getData().getProperty(ApplicationMap.TYPE_CODE),
					(String) getData().getProperty(ApplicationMap.STATE_CODE));
		} else {
			setButtonsByApplicationType(null, null);
		}
	}

}
