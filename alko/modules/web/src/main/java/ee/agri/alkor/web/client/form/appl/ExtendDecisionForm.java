package ee.agri.alkor.web.client.form.appl;


import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.RadioButtonList;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.DecisionMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.ServiceConstants;

public class ExtendDecisionForm extends Form implements CacheListener {

	private static final String FORM_NAME = "ExtendDecisionForm";

	private TextBox arrived = new TextBox();
	private TextBox grade = new TextBox();
	private TextBox decisionNr = new TextBox();
	private TextBox decisionDate = new TextBox();
	private TextArea comment = new TextArea();

	private TextArea extendUntilComment = new TextArea();

	// new print links
	private Button decisionPrintLink;
	private Button correctionPrintLink;
	private Button declinePrintLink;
	private Button decisionSignLink;
	private Button correctionSignLink;

	private Button feeBtn;

	private Button save;

	/**
	 * Otsuste vormi loomine.
	 * 
	 * @param parent
	 *            - praegusele vormile viidav vorm.
	 */
	public ExtendDecisionForm(Form parent) {
		super();
		super.init();
		this.parent = parent;
	}

	/**
	 * Otsuste vormi loomine.
	 * 
	 * @param parent
	 *            - praegusele vormile viidav vorm.
	 * @param applicationMapping
	 *            - taotluse <b><i>hibernate</i></b> klassidele viidav tähistik.
	 */
	public ExtendDecisionForm(Form parent, ApplicationMap applicationMapping) {
		this(parent);
		if (applicationMapping != null)
			System.out.println("info ExtendDecisionForm:"
					+ applicationMapping.getProperty(ApplicationMap.NR)
					+ "/"
					+ applicationMapping
							.getProperty(ApplicationMap.PRODUCT_NAME));
		else
			System.out.println("data is null on init");
		setData(applicationMapping);
		if (applicationMapping.getProperty(ApplicationMap.DECISION) == null) {
			applicationMapping.setProperty(ApplicationMap.DECISION,
					new DecisionMap());
		}

	}

	public static final String getKey() {
		return "ExtendDecisionForm";
	}

	public Object getConstantsWithLookup() {
		return GWT.create(ApplicationFormMessages.class);
	}

	public void init() {
		super.init();

		Label title = new Label("Pikendamise otsuse lisamine taotlusele");
		title.setStyleName("Title");

		HorizontalPanel buttons = new HorizontalPanel();
		SaveExtendDecisionListener saveExtendDecisionListener = new SaveExtendDecisionListener();
		Button back = new Button("Tagasi",
				new ReturnFormListener(this, parent) {
					public void onReturn() {
						ApplicationForm applForm = (ApplicationForm) parent;
						applForm.updateApplication(getData());
					}
				});
		save = new Button("Salvesta", saveExtendDecisionListener);

		back.setWidth("9em");
		save.setWidth("9em");

		buttons.add(UIutils.createSpacer(
				UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		if (UIutils
				.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {

			buttons.add(save);
			buttons.add(UIutils.createSpacer(6, 1));
		}
		buttons.add(back);
		// DOM.setStyleAttribute(buttons.getElement(), "margin", "0px 40px");

		// If decision alradey exists we don't allow to save.
		boolean visible = getData().getProperty(ApplicationMap.DECISION_NR) == null;
		save.setVisible(visible);

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, createForm());
		main.setWidget(2, 0, buttons);
		FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setColSpan(0, 0, 2);
		cellFormatter.setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		askClassificators();
		initWidget(main);
	}

	public void avail(String key, Object value) {
		System.out.println("avail");
		if (value instanceof Throwable)
			setError(value.toString());
		makeDecisionRadioList();
		setFormFieldsFromData(FORM_NAME);

	}

	/**
	 * Loob vormi elemendid.
	 */
	private FlexTable createForm() {

		FlexTable form = new FlexTable();
		FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
		// form.setBorderWidth(1);
		form.setStyleName("Form");
		// First column
		form.setText(0, 0, "Taotluse nr:");
		form.setText(1, 0, "Esitamise kuupäev:");
		form.setText(2, 0, "Toode:");
		form.setText(3, 0, "% vol:");
		form.setText(4, 0, "Maht:");
		form.setText(5, 0, "Liik:");
		form.setText(6, 0, "Taotleja:");

		// Second column
		form.setText(0, 3, "Otsuse nr:");
		form.setText(1, 3, "Kpv:");
		form.setText(2, 3, "Tootja:");
		form.setText(3, 3, "Tootjamaa:");

		form.setText(0, 6, "Registrikande nr:");
		form.setText(1, 6, "Prindi otsus:");
		form.setText(2, 6, "Allkirjasta otsus:");
		form.setText(3, 6, "Prindi õiend:");
		form.setText(4, 6, "Allkirjasta õiend:");
		//form.setText(5, 6, "Prindi ärakiri:");
		form.setText(5, 6, "Riigilõiv:");

		form.setWidget(
				0,
				1,
				addFormField(FORM_NAME, ApplicationMap.NR, new TextBox(),
						"10em"));
		form.setWidget(
				1,
				1,
				addFormField(FORM_NAME, ApplicationMap.ARRIVED, arrived, "10em")); // arrived
		form.setWidget(
				2,
				1,
				addFormField(FORM_NAME, ApplicationMap.PRODUCT_NAME,
						new TextBox(), "10em")); // product
		form.setWidget(
				3,
				1,
				addFormField(FORM_NAME, ApplicationMap.PRODUCT_GRADE, grade,
						"10em"));// grade
		form.setWidget(
				4,
				1,
				addFormField(FORM_NAME, ApplicationMap.PRODUCT_VOLUME_NAME,
						new TextBox(), "10em"));// volume
		form.setWidget(
				5,
				1,
				addFormField(FORM_NAME, ApplicationMap.PRODUCT_TYPE_NAME,
						new TextBox(), "10em")); // type
		form.setWidget(
				6,
				1,
				addFormField(FORM_NAME, ApplicationMap.APPLICANT_NAME,
						new TextBox(), "10em"));// applicant
		form.setWidget(
				0,
				4,
				addFormField(FORM_NAME, ApplicationMap.DECISION_NR, decisionNr,
						"10em"));// decisionNr
		form.setWidget(
				2,
				4,
				addFormField(FORM_NAME, ApplicationMap.PRODUCT_PRODUCER_NAME,
						new TextBox(), "10em"));// manufacturer
		form.setWidget(
				3,
				4,
				addFormField(FORM_NAME,
						ApplicationMap.PRODUCT_PRODUCER_COUNTRY_NAME,
						new TextBox(), "10em"));// motherland
		form.setWidget(
				1,
				4,
				addFormField(FORM_NAME, ApplicationMap.DECISION_DATE,
						decisionDate, "10em"));// decision date
		form.setWidget(
				0,
				7,
				addFormField(FORM_NAME, ApplicationMap.REGISTRYENTRY_NR,
						new TextBox(), "10em"));// regNr

		boolean visible = getData().getProperty(ApplicationMap.DECISION_NR) == null;

		UpdateRegistryNrListener updateRegistryNrListener = new UpdateRegistryNrListener();
		Button updateRegistryNr = new Button("Uuenda", updateRegistryNrListener);
		updateRegistryNr.setWidth("9em");
		updateRegistryNr.setVisible(!visible);
		form.setWidget(0, 8, updateRegistryNr);

		form.setWidget(0, 2, UIutils.createSpacer(15, 1));
		form.setWidget(0, 5, UIutils.createSpacer(15, 1));
		form.setWidget(7, 0, UIutils.createSpacer(1, 20));
		form.setWidget(10, 0, UIutils.createSpacer(1, 40));
		decisionPrintLink = new DecisionPrintButton();
		decisionSignLink = new DecisionSignButton();
		
		// kui otsus pole allkirjastatud
				ServiceContext
						.getInstance()
						.getRegistryService()
						.isSigned(
								Integer.valueOf(getData().getText(ApplicationMap.ID)),
								ServiceConstants.EX_DECISION_DOC_NAME
										+ getData().getText(ApplicationMap.DECISION_NR)
										+ " (asice)", new AsyncCallback() {

									public void onFailure(Throwable caught) {
										Window.alert(String.valueOf(caught.getMessage()));
									}

									public void onSuccess(Object result) {
										try {
											boolean res = ((Boolean) result)
													.booleanValue();

											boolean enabled = getData().getProperty(
													ApplicationMap.DECISION_NR) != null;

											if (!res && enabled) {
												decisionSignLink.setVisible(true);
											}
										} catch (Exception ex) {

										}

									}
								});

				ServiceContext
						.getInstance()
						.getRegistryService()
						.isSigned(
								Integer.valueOf(getData().getText(ApplicationMap.ID)),
								ServiceConstants.EX_COR_DOC_NAME
										+ getData().getText(ApplicationMap.DECISION_NR)
										+ " (asice)", new AsyncCallback() {

									public void onFailure(Throwable caught) {
										Window.alert(String.valueOf(caught.getMessage()));
									}

									public void onSuccess(Object result) {

										try {
											boolean res = ((Boolean) result)
													.booleanValue();

											boolean enabled = getData().getProperty(
													ApplicationMap.DECISION_NR) != null;

											boolean oiendKeelatud = ((String) getData()
													.getProperty(
															ApplicationMap.STATE_CODE))
													.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

											if (!res && enabled && !oiendKeelatud) {
												correctionSignLink.setVisible(true);
											}
										} catch (Exception ex) {

										}

									}
								});
		
		form.setWidget(1, 7, decisionPrintLink);
		form.setWidget(2, 7, decisionSignLink);
		correctionPrintLink = new CorrectionPrintButton();
		correctionSignLink = new CorrectionSignButton();		
		form.setWidget(3, 7, correctionPrintLink);
		form.setWidget(4, 7, correctionSignLink);
		declinePrintLink = new DeclinePrintButton();
		//form.setWidget(5, 7, declinePrintLink);
		cellFormatter.setHorizontalAlignment(1, 7,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(2, 7,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(3, 7,
				HasHorizontalAlignment.ALIGN_LEFT);

		feeBtn = UIutils.createButton(new ClickListener() {
			public void onClick(Widget arg0) {
				PaymentMatchingForm payment = new PaymentMatchingForm(
						ExtendDecisionForm.this, (ApplicationMap) getData());
				openForm(payment);
			}
		}, "...");
		feeBtn.setStyleName("SelectButton");
		feeBtn.setSize("1.46em", "1.46em");
		feeBtn.setEnabled(true);
		form.setWidget(5, 7, feeBtn);

		if (UIutils
				.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK }))
			setPrintLinks();

		form.setText(8, 0, "Otsus:");
		cellFormatter.setColSpan(8, 0, 2);

		form.setText(8, 2, "Mittepikendamise otsuse selgitus:");
		cellFormatter.setColSpan(8, 2, 2);

		form.setText(11, 3, "Menetluses kuni selgitus:");
		cellFormatter.setColSpan(11, 3, 2);

		form.setWidget(
				9,
				0,
				addFormField(FORM_NAME,
						ApplicationMap.DECISION_EXTEND_REG_ENTRY,
						new RadioButtonList(
								ApplicationMap.DECISION_EXTEND_REG_ENTRY)));
		cellFormatter.setColSpan(9, 0, 1);

		form.setWidget(
				9,
				1,
				addFormField(FORM_NAME,
						ApplicationMap.EXTEND_UNTIL_DECISION_DATE,
						new CalendarBox(), "10em", null, Validators.DATE));
		cellFormatter.setColSpan(9, 1, 1);

		cellFormatter.setVerticalAlignment(9, 1,
				HasVerticalAlignment.ALIGN_BOTTOM);
		cellFormatter.setHorizontalAlignment(9, 1,
				HasHorizontalAlignment.ALIGN_LEFT);

		form.setWidget(
				9,
				3,
				addFormField(FORM_NAME, ApplicationMap.DECISION_EXPLANATION,
						comment));// comment
		comment.setSize("100%", "100%");
		comment.setVisibleLines(4);
		cellFormatter.setHeight(9, 3, "100%");
		cellFormatter.setColSpan(9, 3, 3);
		cellFormatter.setRowSpan(9, 3, 2);

		form.setWidget(
				12,
				3,
				addFormField(FORM_NAME,
						ApplicationMap.DECISION_EXTEND_UNTIL_EXPLANATION,
						extendUntilComment));// comment
		extendUntilComment.setSize("100%", "100%");
		extendUntilComment.setVisibleLines(4);
		cellFormatter.setHeight(12, 3, "100%");
		cellFormatter.setColSpan(12, 3, 3);
		cellFormatter.setRowSpan(12, 3, 2);

		UIutils.setTableTextStyled(form);
		UIutils.setTextBoxesEnabled(form, false);

		cellFormatter.setHorizontalAlignment(8, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(8, 2,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(9, 3,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(11, 3,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(9, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(12, 3,
				HasHorizontalAlignment.ALIGN_LEFT);

		cellFormatter.setHorizontalAlignment(9, 3,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter
				.setVerticalAlignment(9, 3, HasVerticalAlignment.ALIGN_TOP);

		cellFormatter.setHorizontalAlignment(12, 3,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setVerticalAlignment(12, 3,
				HasVerticalAlignment.ALIGN_TOP);

		cellFormatter.setHorizontalAlignment(2, 8,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(3, 8,
				HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(4, 8,
				HasHorizontalAlignment.ALIGN_LEFT);

		if (!UIutils
				.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK }))
			UIutils.setElementsEnabled(form, false);

		return form;
	}

	/**
	 * Sets printing links when application has decision has number.
	 * 
	 */
	private void setPrintLinks() {
		boolean enabled = getData().getProperty(ApplicationMap.DECISION_NR) != null
				|| getData().getProperty(ApplicationMap.DECISION_DATE) != null;
		if (enabled) {
			decisionPrintLink.setVisible(true);
			decisionSignLink.setVisible(false);
			if (getData().getProperty(ApplicationMap.STATE_CODE).equals(
					ServiceConstants.APPL_STATE_REXT)) {
				correctionPrintLink.setVisible(true);
				correctionSignLink.setVisible(false);
			} else {
				declinePrintLink.setVisible(true);
			}
		}
	}
	
	class DecisionSignButton extends Button {

		/**
		 * The button is not visible by default
		 */
		DecisionSignButton() {
			this.setSize("18", "18");
			this.setStyleName("DecisionPrintButton");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the decision document still exists. If yes
				 * then show the document in a new window If no then ask the
				 * user if a new one should be created. If the user answers yes
				 * then the system creates a new document and displays it in a
				 * new window If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {	
				String converted = GWT
						.getHostPageBaseURL();
				Window.open(
						converted
								+ "signing"
								+ "?"
								+ "appid="
								+ getData().getText(ApplicationMap.ID)
								+ "&"
								+ "docname"
								+ "="
								+ URL.encode(ServiceConstants.EX_DECISION_DOC_NAME
										+ getData()
												.getText(
														ApplicationMap.DECISION_NR)).replace('/', '_')
								+ ".pdf",
						"Otsus", "");
											

				}
			});
			this.setVisible(false);
		}

	}
	
	class CorrectionSignButton extends Button {

		/**
		 * The button is not visible by default
		 */
		CorrectionSignButton() {
			this.setSize("18", "18");
			this.setStyleName("DecisionPrintButton");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the decision document still exists. If yes
				 * then show the document in a new window If no then ask the
				 * user if a new one should be created. If the user answers yes
				 * then the system creates a new document and displays it in a
				 * new window If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {	
				String converted = GWT
						.getHostPageBaseURL();
				Window.open(
						converted
								+ "signing"
								+ "?"
								+ "appid="
								+ getData().getText(ApplicationMap.ID)
								+ "&"
								+ "docname"
								+ "="
								+ URL.encode(ServiceConstants.EX_COR_DOC_NAME
										+ getData()
												.getText(
														ApplicationMap.DECISION_NR)).replace('/', '_')
								+ ".pdf",
						"Otsus", "");
											

				}
			});
			this.setVisible(false);
		}

	}

	private void askClassificators() {
		makeDecisionRadioList();
		setFormFieldsFromData(FORM_NAME);
	}

	private void makeDecisionRadioList() {
		RadioButtonList decisions = (RadioButtonList) getFormField(FORM_NAME,
				ApplicationMap.DECISION_EXTEND_REG_ENTRY);

		decisions.addItem("Pikendatud", ServiceConstants.EXTEND_DECISION);
		decisions.addItem("Mitte pikendatud",
				ServiceConstants.NOTEXTENDED_DECISION);
		decisions.addItem("Menetluses kuni", ServiceConstants.EXTENDED_UNTIL);

	}

	/**
	 * Registrikande pikendamise otsuse salvestamine
	 * 
	 * 
	 */
	private class SaveExtendDecisionListener implements ClickListener {

		public void onClick(Widget sender) {
			setDataFromFormFields(FORM_NAME);
			final Widget mainSender = sender;
			mainSender.setVisible(false);
			

			ApplicationMap extendApplication = (ApplicationMap) getData();

			if ((String) extendApplication
					.getProperty(ApplicationMap.DECISION_EXTEND_REG_ENTRY) != ServiceConstants.NOTEXTENDED_DECISION) {

				String rl = (String) extendApplication
						.getProperty(ApplicationMap.LATEST_PAYMENT);
				if ((rl == null || rl == "")
						&& !UIutils
								.userHasPriviledge(new String[] { ServiceConstants.ROLE_CLASS_ADM })) {
					if (!UIutils
							.userHasPriviledge(new String[] { ServiceConstants.ROLE_CLASS_ADM })) {
						String msg = Cookies.getCookie("RL");
						if (msg.toString() != "TRUE") {
							//Cookies.setCookie("MyCookie", msg);
							//ExtendDecisionForm.this
							//		.setError("Riigilõiv sidumata!");
							//return;
						}
						Cookies.setCookie("RL", "FALSE");
					}
				}
			}
			String extendedUntilValue = (String) getFormFieldValue(FORM_NAME,
					ApplicationMap.EXTEND_UNTIL_DECISION_DATE);

			if (ServiceConstants.EXTENDED_UNTIL.equals(extendApplication
					.getProperty(ApplicationMap.DECISION_EXTEND_REG_ENTRY))
					&& (extendedUntilValue == null || extendedUntilValue == "")) {
				ExtendDecisionForm.this.getErrors().add(
						"Pikendatud kuni kuupäev määramata");
				mainSender.setVisible(true);
			}

			// check if the form has any validation errors
			if (ExtendDecisionForm.this.getErrors() != null
					&& !ExtendDecisionForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					ExtendDecisionForm.this.setError((String) getErrors()
							.get(i));
				}
				/*
				 * Siia ka kontroll
				 */

			} else {
				/*
				ServiceContext
						.getInstance()
						.getRegistryService()
						.saveExtendApplicationDecision(
								(ApplicationMap) cleanDataBeforeSave(getData()),
								new AsyncCallback() {

									public void onFailure(Throwable caught) {
										setError(caught.toString());
									}

									public void onSuccess(Object result) {
										ExtendDecisionForm.this
												.setData((ApplicationMap) result);
										ExtendDecisionForm.this.parent
												.onDataEvent(new DataChangeEvent(
														DataChangeEvent.DATA_MODIFIED,
														(ApplicationMap) result));
										setFormFieldsFromData(FORM_NAME);
										ExtendDecisionForm.this
												.setButtonsEnabled(true);
										setPrintLinks();
										setInfo("Salvestamine õnnestus");
										save.setVisible(false);
									}
								});
				*/
				
				
				
				
				
				
				
				
				
				if (!ServiceConstants.NOTEXTENDED_DECISION.equals(extendApplication
						.getProperty(ApplicationMap.DECISION_EXTEND_REG_ENTRY))) {

					ApplicationMap map = (ApplicationMap) getData();
					
					Cookies.setCookie(
							"TEST",
							map.toString());
					
					
					/**
					 * String rl = (String) map
					 * .getProperty(ApplicationMap.LATEST_PAYMENT); if ((rl ==
					 * null || rl == "") && !UIutils .userHasPriviledge(new
					 * String[] { ServiceConstants.ROLE_CLASS_ADM })) { if
					 * (!UIutils .userHasPriviledge(new String[] {
					 * ServiceConstants.ROLE_CLASS_ADM })) { String msg =
					 * Cookies.getCookie("RL"); if (msg.toString() != "TRUE") {
					 * Cookies.setCookie("RL", msg); DecisionForm.this
					 * .setError("Riigilõiv sidumata!"); return; }
					 * Cookies.setCookie("RL", "FALSE"); } // } }
					 **/

					/**
					 * Uus loogika 25.06.15
					 * 
					 */

					ServiceContext
							.getInstance()
							.getRegistryService()
							.processPaymentMatching(
									(ApplicationMap) cleanDataBeforeSave(getData()),
									"4", new AsyncCallback() {
										public void onSuccess(Object arg0) {
											// Korras
											// Cookies.setCookie("RL", "TRUE");
											// setData((ApplicationMap) arg0);
											// setFormFieldsFromData(PaymentMatchingForm.this.CHANGE_FORM);
											// parent.setData(getData());
											// returnToParent();
											ServiceContext
											.getInstance()
											.getRegistryService()
											.saveExtendApplicationDecision(
													(ApplicationMap) cleanDataBeforeSave(getData()),
													new AsyncCallback() {

														public void onFailure(Throwable caught) {
															setError(caught.toString());
															mainSender.setVisible(true);
														}

														public void onSuccess(Object result) {
															ExtendDecisionForm.this
																	.setData((ApplicationMap) result);
															ExtendDecisionForm.this.parent
																	.onDataEvent(new DataChangeEvent(
																			DataChangeEvent.DATA_MODIFIED,
																			(ApplicationMap) result));
															setFormFieldsFromData(FORM_NAME);
															ExtendDecisionForm.this
																	.setButtonsEnabled(true);
															setPrintLinks();
															setInfo("Salvestamine õnnestus");
															save.setVisible(false);
															
															ServiceContext
															.getInstance()
															.getRegistryService()
															.isSigned(
																	Integer.valueOf(getData()
																			.getText(
																					ApplicationMap.ID)),
																	ServiceConstants.EX_DECISION_DOC_NAME
																			+ getData()
																					.getText(
																							ApplicationMap.DECISION_NR)
																			+ " (asice)",
																	new AsyncCallback() {

																		public void onFailure(
																				Throwable caught) {
																			Window.alert(String
																					.valueOf(caught
																							.getMessage()));
																		}

																		public void onSuccess(
																				Object result) {
																			try {
																				boolean res = ((Boolean) result)
																						.booleanValue();

																				boolean enabled = getData()
																						.getProperty(
																								ApplicationMap.DECISION_NR) != null;

																				if (!res
																						&& enabled) {
																					decisionSignLink
																							.setVisible(true);
																				}
																			} catch (Exception ex) {

																			}

																		}
																	});

													ServiceContext
															.getInstance()
															.getRegistryService()
															.isSigned(
																	Integer.valueOf(getData()
																			.getText(
																					ApplicationMap.ID)),
																	ServiceConstants.EX_COR_DOC_NAME
																			+ getData()
																					.getText(
																							ApplicationMap.DECISION_NR)
																			+ " (asice)",
																	new AsyncCallback() {

																		public void onFailure(
																				Throwable caught) {
																			Window.alert(String
																					.valueOf(caught
																							.getMessage()));
																		}

																		public void onSuccess(
																				Object result) {

																			try {
																				boolean res = ((Boolean) result)
																						.booleanValue();
																				boolean enabled = getData()
																						.getProperty(
																								ApplicationMap.DECISION_NR) != null;
																				boolean oiendKeelatud = ((String) getData()
																						.getProperty(
																								ApplicationMap.STATE_CODE))
																						.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

																				if (!res
																						&& enabled
																						&& !oiendKeelatud) {
																					correctionSignLink
																							.setVisible(true);
																				}
																			} catch (Exception ex) {

																			}

																		}
																	});
														}
													});
										}

										public void onFailure(Throwable arg0) {
											if (!UIutils
													.userHasPriviledge(new String[] { ServiceConstants.ROLE_CLASS_ADM })) {
												setError("Ettevõtte saldo pole piisav");
												mainSender.setVisible(true);
												return;
											}

											ConfirmDialog conf = new ConfirmDialog(
													"Ettevõttel ei ole riigilõiv tasutud (Pole piisav saldo). Jätkan?", new ClickListener() {
														public void onClick(
																Widget arg0) {
															ServiceContext
															.getInstance()
															.getRegistryService()
															.processPaymentMatching2(
																	(ApplicationMap) cleanDataBeforeSave(getData()),
																	"4", new AsyncCallback() {
																		public void onSuccess(Object arg0) {
															ServiceContext
															.getInstance()
															.getRegistryService()
															.saveExtendApplicationDecision(
																	(ApplicationMap) cleanDataBeforeSave(getData()),
																	new AsyncCallback() {

																		public void onFailure(Throwable caught) {
																			setError(caught.toString());
																			mainSender.setVisible(true);
																		}

																		public void onSuccess(Object result) {
																			ExtendDecisionForm.this
																					.setData((ApplicationMap) result);
																			ExtendDecisionForm.this.parent
																					.onDataEvent(new DataChangeEvent(
																							DataChangeEvent.DATA_MODIFIED,
																							(ApplicationMap) result));
																			setFormFieldsFromData(FORM_NAME);
																			ExtendDecisionForm.this
																					.setButtonsEnabled(true);
																			setPrintLinks();
																			setInfo("Salvestamine õnnestus");
																			save.setVisible(false);
																			
																			ServiceContext
																			.getInstance()
																			.getRegistryService()
																			.isSigned(
																					Integer.valueOf(getData()
																							.getText(
																									ApplicationMap.ID)),
																					ServiceConstants.EX_DECISION_DOC_NAME
																							+ getData()
																									.getText(
																											ApplicationMap.DECISION_NR)
																							+ " (asice)",
																					new AsyncCallback() {

																						public void onFailure(
																								Throwable caught) {
																							Window.alert(String
																									.valueOf(caught
																											.getMessage()));
																						}

																						public void onSuccess(
																								Object result) {
																							try {
																								boolean res = ((Boolean) result)
																										.booleanValue();
																								boolean enabled = getData()
																										.getProperty(
																												ApplicationMap.DECISION_NR) != null;
																								if (!res
																										&& enabled) {

																									decisionSignLink
																											.setVisible(true);
																								}
																							} catch (Exception ex) {

																							}

																						}
																					});

																	ServiceContext
																			.getInstance()
																			.getRegistryService()
																			.isSigned(
																					Integer.valueOf(getData()
																							.getText(
																									ApplicationMap.ID)),
																					ServiceConstants.EX_COR_DOC_NAME
																							+ getData()
																									.getText(
																											ApplicationMap.DECISION_NR)
																							+ " (asice)",
																					new AsyncCallback() {

																						public void onFailure(
																								Throwable caught) {
																							Window.alert(String
																									.valueOf(caught
																											.getMessage()));
																						}

																						public void onSuccess(
																								Object result) {

																							try {
																								boolean res = ((Boolean) result)
																										.booleanValue();
																								boolean enabled = getData()
																										.getProperty(
																												ApplicationMap.DECISION_NR) != null;
																								boolean oiendKeelatud = ((String) getData()
																										.getProperty(
																												ApplicationMap.STATE_CODE))
																										.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

																								if (!res
																										&& enabled
																										&& !oiendKeelatud) {
																									correctionSignLink
																											.setVisible(true);
																								}
																							} catch (Exception ex) {

																							}

																						}
																					});
																		}
																	});	
																		}
																		
																		public void onFailure(Throwable arg0) {mainSender.setVisible(true);};
																		
																	});
															
														};
													});
											conf.hide();
											conf.show();
										}
									});
				} else {
					// Ei valitud otsuse tegemist.
					ServiceContext
					.getInstance()
					.getRegistryService()
					.saveExtendApplicationDecision(
							(ApplicationMap) cleanDataBeforeSave(getData()),
							new AsyncCallback() {

								public void onFailure(Throwable caught) {
									setError(caught.toString());
									mainSender.setVisible(true);
								}

								public void onSuccess(Object result) {
									ExtendDecisionForm.this
											.setData((ApplicationMap) result);
									ExtendDecisionForm.this.parent
											.onDataEvent(new DataChangeEvent(
													DataChangeEvent.DATA_MODIFIED,
													(ApplicationMap) result));
									setFormFieldsFromData(FORM_NAME);
									ExtendDecisionForm.this
											.setButtonsEnabled(true);
									setPrintLinks();
									setInfo("Salvestamine õnnestus");
									save.setVisible(false);
									
									ServiceContext
									.getInstance()
									.getRegistryService()
									.isSigned(
											Integer.valueOf(getData()
													.getText(
															ApplicationMap.ID)),
											ServiceConstants.EX_DECISION_DOC_NAME
													+ getData()
															.getText(
																	ApplicationMap.DECISION_NR)
													+ " (asice)",
											new AsyncCallback() {

												public void onFailure(
														Throwable caught) {
													Window.alert(String
															.valueOf(caught
																	.getMessage()));
												}

												public void onSuccess(
														Object result) {
													try {
														boolean res = ((Boolean) result)
																.booleanValue();
														boolean enabled = getData()
																.getProperty(
																		ApplicationMap.DECISION_NR) != null;
														if (!res
																&& enabled) {

															decisionSignLink
																	.setVisible(true);
														}
													} catch (Exception ex) {

													}

												}
											});

							ServiceContext
									.getInstance()
									.getRegistryService()
									.isSigned(
											Integer.valueOf(getData()
													.getText(
															ApplicationMap.ID)),
											ServiceConstants.EX_COR_DOC_NAME
													+ getData()
															.getText(
																	ApplicationMap.DECISION_NR)
													+ " (asice)",
											new AsyncCallback() {

												public void onFailure(
														Throwable caught) {
													Window.alert(String
															.valueOf(caught
																	.getMessage()));
												}

												public void onSuccess(
														Object result) {

													try {
														boolean res = ((Boolean) result)
																.booleanValue();
														boolean enabled = getData()
																.getProperty(
																		ApplicationMap.DECISION_NR) != null;
														boolean oiendKeelatud = ((String) getData()
																.getProperty(
																		ApplicationMap.STATE_CODE))
																.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

														if (!res
																&& enabled
																&& !oiendKeelatud) {
															correctionSignLink
																	.setVisible(true);
														}
													} catch (Exception ex) {

													}

												}
											});
								}
							});
				}
				
				
				
				
				
				
				
			}
		}
	}

	private class UpdateRegistryNrListener implements ClickListener {

		public void onClick(Widget arg0) {

			setDataFromFormFields(FORM_NAME);
			// check if the form has any validation errors
			if (ExtendDecisionForm.this.getErrors() != null
					&& !ExtendDecisionForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					ExtendDecisionForm.this.setError((String) getErrors()
							.get(i));
				}
			} else {
				ServiceContext
						.getInstance()
						.getRegistryService()
						.updateRegistryEntryNr(
								(ApplicationMap) cleanDataBeforeSave(getData()),
								new AsyncCallback() {

									public void onFailure(Throwable arg0) {
										setError(arg0.toString());
									}

									public void onSuccess(Object arg0) {
										setInfo("Registrikande number on uuendatud!");
										getData().setProperty(
												ApplicationMap.REGISTRY_ENTRY,
												arg0);
										System.out
												.println("data:"
														+ getData()
																.getProperty(
																		ApplicationMap.REGISTRYENTRY_NR));
										System.out.println("return:"
												+ ((RegistryEntryMap) arg0)
														.getText(RegistryEntryMap.NR));
										ExtendDecisionForm.this.parent
												.onDataEvent(new DataChangeEvent(
														DataChangeEvent.DATA_MODIFIED,
														(ApplicationMap) getData()));
										setFormFieldsFromData(FORM_NAME);

									}

								});
			}

		}

	}

	public void switchButtons(Button button1, Button button2) {
		button1.setVisible(false);
		button2.setVisible(true);
	}

	class DecisionPrintButton extends Button {

		/**
		 * The button is not visible by default
		 */
		DecisionPrintButton() {
			this.setSize("18", "18");
			this.setStyleName("DecisionPrintButton");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the decision document still exists. If yes
				 * then show the document in a new window If no then ask the
				 * user if a new one should be created. If the user answers yes
				 * then the system creates a new document and displays it in a
				 * new window If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {
					ServiceContext
							.getInstance()
							.getRegistryService()
							.isExtendDocumentPresent(
									getData().getText(ApplicationMap.NR),
									ServiceConstants.DOC_TYPE_EX_DEC,
									new AsyncCallback() {
										/*
										 * (non-Javadoc)
										 * 
										 * @see com.google.gwt.user.client.rpc.
										 * AsyncCallback
										 * #onFailure(java.lang.Throwable)
										 */
										public void onFailure(Throwable arg0) {
											setError("Dokumendi olemasolu kontroll ebaõnnestus: "
													+ arg0.getMessage());
										}

										/*
										 * (non-Javadoc)
										 * 
										 * @see com.google.gwt.user.client.rpc.
										 * AsyncCallback
										 * #onSuccess(java.lang.Object)
										 */
										public void onSuccess(Object arg0) {
											if (((Boolean) arg0).booleanValue()) {
												String converted = GWT
														.getModuleBaseURL();
												Window.open(
														converted
																+ ServiceConstants.DOC_SERVICE_URL
																+ "?"
																+ ServiceConstants.DOC_ACTION_PARM
																+ "="
																+ ServiceConstants.DOC_ACTION_OPEN
																+ "&"
																+ ServiceConstants.DOC_APPID_PARM
																+ "="
																+ getData()
																		.getText(
																				ApplicationMap.ID)
																+ "&"
																+ ServiceConstants.DOC_FILE_PARM
																+ "="
																+ URL.encode(

																getData()
																		.getText(
																				ApplicationMap.DECISION_NR) != null ? ServiceConstants.EX_DECISION_DOC_NAME
																		+ getData()
																				.getText(
																						ApplicationMap.DECISION_NR)
																				.replace(
																						'/',
																						'_')
																		: ServiceConstants.EX_DECISION_DOC_NAME_NULL)
																+ ".pdf",
														"Pikendamise_otsus", "");
											} else {

												ConfirmDialog confirm = new ConfirmDialog(
														"Kas lisan uue pikendamise otsuse?",
														new ClickListener() {

															public void onClick(
																	Widget arg0) {
																ServiceContext
																		.getInstance()
																		.getRegistryService()
																		.createNewExtendDocument(
																				getData()
																						.getText(
																								ApplicationMap.NR),
																				ServiceConstants.DOC_TYPE_EX_DEC,
																				new AsyncCallback() {
																					public void onFailure(
																							Throwable arg0) {
																						setError("Dokumendi lisamine ebaõnnestus: "
																								+ arg0.getMessage());
																					}

																					public void onSuccess(
																							Object arg0) {
																						if (((Boolean) arg0)
																								.booleanValue()) {
																							setInfo("Uus pikendamise otsus loodud!");
																						}
																					}
																				});

															}

														});
												confirm.hide();
												confirm.show();
											}
										}
									});

				}
			});
			this.setVisible(false);
		}

	}

	class DeclinePrintButton extends Button {

		/**
		 * The button is not visible by default
		 */
		DeclinePrintButton() {
			this.setSize("18", "18");
			this.setStyleName("DecisionPrintButton");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the decline document still exists. If yes then
				 * show the document in a new window If no then ask the user if
				 * a new one should be created. If the user answers yes then the
				 * system creates a new document and displays it in a new window
				 * If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {
					ServiceContext
							.getInstance()
							.getRegistryService()
							.isExtendDocumentPresent(
									getData().getText(ApplicationMap.NR),
									ServiceConstants.DOC_TYPE_EX_NDEC,
									new AsyncCallback() {
										/*
										 * (non-Javadoc)
										 * 
										 * @see com.google.gwt.user.client.rpc.
										 * AsyncCallback
										 * #onFailure(java.lang.Throwable)
										 */
										public void onFailure(Throwable arg0) {
											setError("Dokumendi olemasolu kontroll ebaõnnestus: "
													+ arg0.getMessage());
										}

										/*
										 * (non-Javadoc)
										 * 
										 * @see com.google.gwt.user.client.rpc.
										 * AsyncCallback
										 * #onSuccess(java.lang.Object)
										 */
										public void onSuccess(Object arg0) {
											if (((Boolean) arg0).booleanValue()) {
												String converted = GWT
														.getModuleBaseURL();
												Window.open(
														converted
																+ ServiceConstants.DOC_SERVICE_URL
																+ "?"
																+ ServiceConstants.DOC_ACTION_PARM
																+ "="
																+ ServiceConstants.DOC_ACTION_OPEN
																+ "&"
																+ ServiceConstants.DOC_APPID_PARM
																+ "="
																+ getData()
																		.getText(
																				ApplicationMap.ID)
																+ "&"
																+ ServiceConstants.DOC_FILE_PARM
																+ "="
																+ URL.encode(getData()
																		.getText(
																				ApplicationMap.DECISION_NR) != null ? ServiceConstants.EX_NDEC_DOC_NAME
																		+ getData()
																				.getText(
																						ApplicationMap.DECISION_NR)
																				.replace(
																						'/',
																						'_')
																		: ServiceConstants.EX_NDEC_DOC_NAME_NULL)
																+ ".pdf",
														"Pikendamise_ärakiri",
														""

												);
											} else {
												// if the document doesn't exist
												// then ask to creata a new one.
												ConfirmDialog confirm = new ConfirmDialog(
														"Kas lisan uue pikendamise ärakirja?",
														new ClickListener() {

															public void onClick(
																	Widget arg0) {
																ServiceContext
																		.getInstance()
																		.getRegistryService()
																		.createNewExtendDocument(
																				getData()
																						.getText(
																								ApplicationMap.NR),
																				ServiceConstants.DOC_TYPE_EX_NDEC,
																				new AsyncCallback() {
																					public void onFailure(
																							Throwable arg0) {
																						setError("Dokumendi lisamine ebaõnnestus: "
																								+ arg0.getMessage());
																					}

																					public void onSuccess(
																							Object arg0) {
																						if (((Boolean) arg0)
																								.booleanValue()) {
																							setInfo("Uus pikendamise ärakiri loodud!");
																						}
																					}
																				});

															}

														});
												confirm.hide();
												confirm.show();
											}
										}
									});

				}
			});
			this.setVisible(false);
		}

	}

	class CorrectionPrintButton extends Button {

		/**
		 * The button is not visible by default
		 */
		public CorrectionPrintButton() {
			this.setStyleName("CorrectionPrintButton");
			this.setSize("18", "18");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the correction document still exists. If yes
				 * then show the document in a new window If no then ask the
				 * user if a new one should be created. If the user answers yes
				 * then the system creates a new document and displays it in a
				 * new window If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {
					// if the decision is not entered into the registry then we
					// can't display a correction document
					if (!getData().getProperty(ApplicationMap.STATE_CODE)
							.equals(ServiceConstants.APPL_STATE_REXT)) {
						return;
					}
					ServiceContext
							.getInstance()
							.getRegistryService()
							.isExtendDocumentPresent(
									getData().getText(ApplicationMap.NR),
									ServiceConstants.DOC_TYPE_EX_COR,
									new AsyncCallback() {
										/*
										 * (non-Javadoc)
										 * 
										 * @see com.google.gwt.user.client.rpc.
										 * AsyncCallback
										 * #onFailure(java.lang.Throwable)
										 */
										public void onFailure(Throwable arg0) {
											setError("Dokumendi olemasolu kontroll ebaõnnestus: "
													+ arg0.getMessage());
										}

										/*
										 * (non-Javadoc)
										 * 
										 * @see com.google.gwt.user.client.rpc.
										 * AsyncCallback
										 * #onSuccess(java.lang.Object)
										 */
										public void onSuccess(Object arg0) {
											if (((Boolean) arg0).booleanValue()) {
												String converted = GWT
														.getModuleBaseURL();
												Window.open(
														converted
																+ ServiceConstants.DOC_SERVICE_URL
																+ "?"
																+ ServiceConstants.DOC_ACTION_PARM
																+ "="
																+ ServiceConstants.DOC_ACTION_OPEN
																+ "&"
																+ ServiceConstants.DOC_APPID_PARM
																+ "="
																+ getData()
																		.getText(
																				ApplicationMap.ID)
																+ "&"
																+ ServiceConstants.DOC_FILE_PARM
																+ "="
																+ URL.encode(getData()
																		.getText(
																				ApplicationMap.DECISION_NR) != null ? ServiceConstants.EX_COR_DOC_NAME
																		+ getData()
																				.getText(
																						ApplicationMap.DECISION_NR)
																				.replace(
																						'/',
																						'_')
																		: ServiceConstants.EX_DECISION_DOC_NAME_NULL)
																+ ".pdf",
														"Pikendamise_õiend", "");
											} else {

												ConfirmDialog confirm = new ConfirmDialog(
														"Kas lisan uue pikendamise õiendi?",
														new ClickListener() {

															public void onClick(
																	Widget arg0) {
																ServiceContext
																		.getInstance()
																		.getRegistryService()
																		.createNewExtendDocument(
																				getData()
																						.getText(
																								ApplicationMap.NR),
																				ServiceConstants.DOC_TYPE_EX_COR,
																				new AsyncCallback() {
																					public void onFailure(
																							Throwable arg0) {
																						setError("Dokumendi lisamine ebaõnnestus: "
																								+ arg0.getMessage());
																					}

																					public void onSuccess(
																							Object arg0) {
																						if (((Boolean) arg0)
																								.booleanValue()) {
																							setInfo("Uus pikendamise õiend loodud!");
																						}
																					}
																				});
																
																ServiceContext
																.getInstance()
																.getRegistryService()
																.isSigned(
																		Integer.valueOf(getData()
																				.getText(
																						ApplicationMap.ID)),
																		ServiceConstants.EX_COR_DOC_NAME
																				+ getData()
																						.getText(
																								ApplicationMap.DECISION_NR)
																				+ " (asice)",
																		new AsyncCallback() {

																			public void onFailure(
																					Throwable caught) {
																				Window.alert(String
																						.valueOf(caught
																								.getMessage()));
																			}

																			public void onSuccess(
																					Object result) {

																				try {
																					boolean res = ((Boolean) result)
																							.booleanValue();

																					boolean enabled = getData()
																							.getProperty(
																									ApplicationMap.DECISION_NR) != null;

																					boolean oiendKeelatud = ((String) getData()
																							.getProperty(
																									ApplicationMap.STATE_CODE))
																							.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

																					if (!res
																							&& enabled
																							&& !oiendKeelatud) {
																						correctionSignLink
																								.setVisible(true);
																					}
																				} catch (Exception ex) {

																				}

																			}
																		});

															}

														});
												confirm.hide();
												confirm.show();
											}
										}
									});

				}
			});
			this.setVisible(false);
		}

	}

	public void setFormFieldsFromData(String formName) {

		ApplicationMap applicationData = (ApplicationMap) getData();
		if (applicationData != null) {
			System.out
					.println("info:"
							+ applicationData
									.getProperty(ApplicationMap.STATE_CODE)
							+ " "
							+ applicationData
									.getProperty(ApplicationMap.EXTEND_UNTIL_DECISION_DATE));
			if (ServiceConstants.APPL_STATE_REXT_NOT.equals(applicationData
					.getProperty(ApplicationMap.STATE_CODE)))
				((ApplicationMap) getData()).setProperty(
						ApplicationMap.DECISION_EXTEND_REG_ENTRY,
						ServiceConstants.NOTEXTENDED_DECISION);
			else if (applicationData
					.getProperty(ApplicationMap.EXTEND_UNTIL_DECISION_DATE) != null)
				((ApplicationMap) getData()).setProperty(
						ApplicationMap.DECISION_EXTEND_REG_ENTRY,
						ServiceConstants.EXTENDED_UNTIL);
			else
				((ApplicationMap) getData()).setProperty(
						ApplicationMap.DECISION_EXTEND_REG_ENTRY,
						ServiceConstants.EXTEND_DECISION);
		}

		super.setFormFieldsFromData(formName);

	}

	protected void checkForErrors(String key, Widget widget) {

		// signer is not relevant on extend until decision
		if (!(key.equals(ApplicationMap.DECISION_SIGNER_ID) && ((ApplicationMap) getData())
				.getProperty(ApplicationMap.DECISION_EXTEND_REG_ENTRY).equals(
						ServiceConstants.EXTENDED_UNTIL)))
			super.checkForErrors(key, widget);
	}

}
