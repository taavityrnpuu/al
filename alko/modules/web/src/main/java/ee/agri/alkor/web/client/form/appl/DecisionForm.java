/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.Cookies;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.RadioButtonList;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.DecisionMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.UserManageMap;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Taotluse otsuste lisamise vorm.
 * 
 * @author viktorb
 * @author kaupop
 */
public class DecisionForm extends Form implements CacheListener {

	private static final String FORM_NAME = "decisionForm";

	private TextBox arrived = new TextBox();
	private TextBox grade = new TextBox();
	private TextBox decisionNr = new TextBox();
	private TextBox decisionDate = new TextBox();
	private TextArea comment = new TextArea();

	// new print links
	private Button decisionPrintLink;
	private Button correctionPrintLink;
	private Button decisionSignLink;
	private Button correctionSignLink;
	private Button declinePrintLink;

	private Button save;
	private Button reprocess;
	private Button feeBtn;

	private Button save2;
	private Button reprocess2;

	List<String> codes = new ArrayList<String>();

	/**
	 * Otsuste vormi loomine.
	 * 
	 * @param parent
	 *            - praegusele vormile viidav vorm.
	 */
	public DecisionForm(Form parent) {
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
	public DecisionForm(Form parent, ApplicationMap applicationMapping) {
		this(parent);
		setData(applicationMapping);
		if (applicationMapping.getProperty(ApplicationMap.DECISION) == null) {
			applicationMapping.setProperty(ApplicationMap.DECISION, new DecisionMap());
		}

	}

	public static final String getKey() {
		return "DecisionForm";
	}

	public Object getConstantsWithLookup() {
		return GWT.create(ApplicationFormMessages.class);
	}

	public void init() {
		super.init();
		ServiceContext.getInstance().addCacheListener(ServiceContext.DECISION_REG_ENTRY, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.DECISION_EXAMPLES, this);

		Label title = new Label("Otsuse lisamine taotlusele");
		title.setStyleName("Title");

		HorizontalPanel buttons = new HorizontalPanel();
		ChangeSaveListener changeSaveListener = new ChangeSaveListener();
		Button back = new Button("Tagasi", new ReturnFormListener(this, parent) {
			public void onReturn() {
				ApplicationForm applForm = (ApplicationForm) parent;
				applForm.updateApplication(getData());
			}
		});
		Button back2 = new Button("Tagasi", new ReturnFormListener(this, parent) {
			public void onReturn() {
				ApplicationForm applForm = (ApplicationForm) parent;
				applForm.updateApplication(getData());
			}
		});

		save = new Button("Salvesta", changeSaveListener);
		reprocess = new Button("Võta tagasi menetlusse", new newReprocessListener());
		back.setWidth("9em");

		save.setWidth("9em");
		reprocess.setWidth("13em");

		save2 = new Button("Salvesta", changeSaveListener);
		reprocess2 = new Button("Võta tagasi menetlusse", new newReprocessListener());
		back2.setWidth("9em");

		save2.setWidth("9em");
		reprocess2.setWidth("13em");

		buttons.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
			buttons.add(reprocess);
			buttons.add(save);
			buttons.add(UIutils.createSpacer(6, 1));
		}
		buttons.add(back);
		// DOM.setStyleAttribute(buttons.getElement(), "margin", "0px 40px");

		// If decision alradey exists we don't allow to save.
		boolean visible = getData().getProperty(ApplicationMap.DECISION_NR) == null;
		save.setVisible(visible);
		reprocess.setVisible(!visible);

		boolean visible2 = getData().getProperty(ApplicationMap.DECISION_NR) == null;
		save2.setVisible(visible2);
		reprocess2.setVisible(!visible2);

		HorizontalPanel buttons2 = new HorizontalPanel();
		buttons2.add(UIutils.createSpacer(UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })) {
			buttons2.add(reprocess2);
			buttons2.add(save2);
			buttons2.add(UIutils.createSpacer(6, 1));
		}
		buttons2.add(back2);

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, createForm(buttons2));
		main.setWidget(2, 0, buttons);
		FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
		cellFormatter.setWidth(1, 1, "100%");
		cellFormatter.setColSpan(0, 0, 2);
		cellFormatter.setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_LEFT);
		askClassificators();
		initWidget(main);
	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable)
			setError(value.toString());
		else if (ServiceContext.DECISION_REG_ENTRY.equals(key))
			makeDecisionRadios(ApplicationMap.DECISION_REG_ENTRY_CODE, (List) value);
		else if (ServiceContext.DECISION_EXAMPLES.equals(key)) {
			makeDecisionRadios(ApplicationMap.DECISION_EXAMPLES_CODE, (List) value);
			setFormFieldsFromData(FORM_NAME);
		}
		setDecisionRadioDefaults();
	}

	/**
	 * Loob vormi elemendid.
	 */
	private FlexTable createForm(HorizontalPanel buttons) {

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
		// form.setText(5, 6, "Prindi ärakiri:");
		form.setText(5, 6, "Riigilõiv:");

		form.setWidget(0, 1, addFormField(FORM_NAME, ApplicationMap.NR, new TextBox(), "10em"));
		form.setWidget(1, 1, addFormField(FORM_NAME, ApplicationMap.ARRIVED, arrived, "10em")); // arrived
		form.setWidget(2, 1, addFormField(FORM_NAME, ApplicationMap.PRODUCT_NAME, new TextBox(), "10em")); // product
		form.setWidget(3, 1, addFormField(FORM_NAME, ApplicationMap.PRODUCT_GRADE, grade, "10em"));// grade
		form.setWidget(4, 1, addFormField(FORM_NAME, ApplicationMap.PRODUCT_VOLUME_NAME, new TextBox(), "10em"));// volume
		form.setWidget(5, 1, addFormField(FORM_NAME, ApplicationMap.PRODUCT_TYPE_NAME, new TextBox(), "10em")); // type
		form.setWidget(6, 1, addFormField(FORM_NAME, ApplicationMap.APPLICANT_NAME, new TextBox(), "10em"));// applicant
		form.setWidget(0, 4, addFormField(FORM_NAME, ApplicationMap.DECISION_NR, decisionNr, "10em"));// decisionNr
		form.setWidget(2, 4, addFormField(FORM_NAME, ApplicationMap.PRODUCT_PRODUCER_NAME, new TextBox(), "10em"));// manufacturer
		form.setWidget(3, 4,
				addFormField(FORM_NAME, ApplicationMap.PRODUCT_PRODUCER_COUNTRY_NAME, new TextBox(), "10em"));// motherland
		form.setWidget(1, 4, addFormField(FORM_NAME, ApplicationMap.DECISION_DATE, decisionDate, "10em"));// decision
																											// date
		form.setWidget(0, 7, addFormField(FORM_NAME, ApplicationMap.REGISTRYENTRY_NR, new TextBox(), "10em"));// regNr

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
		ServiceContext.getInstance().getRegistryService().isSigned(
				Integer.valueOf(getData().getText(ApplicationMap.ID)),
				ServiceConstants.DECISION_DOC_NAME + getData().getText(ApplicationMap.DECISION_NR) + " (asice)",
				new AsyncCallback() {

					public void onFailure(Throwable caught) {
						Window.alert(String.valueOf(caught.getMessage()));
					}

					public void onSuccess(Object result) {
						try {
							boolean res = ((Boolean) result).booleanValue();

							boolean enabled = getData().getProperty(ApplicationMap.DECISION_NR) != null;

							if (!res && enabled) {
								decisionSignLink.setVisible(true);
							}
						} catch (Exception ex) {

						}

					}
				});

		ServiceContext.getInstance().getRegistryService().isSigned(
				Integer.valueOf(getData().getText(ApplicationMap.ID)),
				ServiceConstants.COR_DOC_NAME + getData().getText(ApplicationMap.DECISION_NR) + " (asice)",
				new AsyncCallback() {

					public void onFailure(Throwable caught) {
						Window.alert(String.valueOf(caught.getMessage()));
					}

					public void onSuccess(Object result) {

						try {
							boolean res = ((Boolean) result).booleanValue();

							boolean enabled = getData().getProperty(ApplicationMap.DECISION_NR) != null;

							boolean oiendKeelatud = ((String) getData().getProperty(ApplicationMap.STATE_CODE))
									.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

							if (!res && enabled && !oiendKeelatud) {
								correctionSignLink.setVisible(true);
							}
						} catch (Exception ex) {

						}

					}
				});

		form.setWidget(1, 7, decisionPrintLink);
		// kui õiend pole allkirjastatud
		form.setWidget(2, 7, decisionSignLink);
		correctionPrintLink = new CorrectionPrintButton();
		correctionSignLink = new CorrectionSignButton();
		form.setWidget(3, 7, correctionPrintLink);
		form.setWidget(4, 7, correctionSignLink);
		declinePrintLink = new DeclinePrintButton();
		// form.setWidget(5, 7, declinePrintLink);
		cellFormatter.setHorizontalAlignment(1, 7, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(2, 7, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(3, 7, HasHorizontalAlignment.ALIGN_LEFT);
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK }))
			setPrintLinks();
		form.setText(8, 0, "Otsus:");
		cellFormatter.setColSpan(8, 0, 2);

		form.setText(8, 2, "Tagastamise otsus:");
		cellFormatter.setColSpan(8, 2, 2);
		/*
		 * @Martin VT BUG 3250
		 */
		form.setWidget(12, 0, buttons);
		cellFormatter.setColSpan(12, 0, 2);

		form.setText(13, 0, "Mittekandmise otsuse selgitus:");

		form.setWidget(9, 0, addFormField(FORM_NAME, ApplicationMap.DECISION_REG_ENTRY_CODE,
				new RadioButtonList(ApplicationMap.DECISION_REG_ENTRY)));
		cellFormatter.setColSpan(9, 0, 2);

		form.setWidget(9, 2, addFormField(FORM_NAME, ApplicationMap.DECISION_EXAMPLES_CODE,
				new RadioButtonList(ApplicationMap.DECISION_EXAMPLES)));
		cellFormatter.setColSpan(9, 2, 2);

		form.setWidget(14, 0, addFormField(FORM_NAME, ApplicationMap.DECISION_EXPLANATION, comment));// comment
		comment.setSize("100%", "100%");
		comment.setVisibleLines(50);
		cellFormatter.setHeight(14, 20, "100%");
		cellFormatter.setColSpan(14, 0, 10);
		cellFormatter.setRowSpan(14, 4, 2);

		feeBtn = UIutils.createButton(new ClickListener() {
			public void onClick(Widget arg0) {
				PaymentMatchingForm payment = new PaymentMatchingForm(DecisionForm.this, (ApplicationMap) getData());
				openForm(payment);
			}
		}, "...");
		feeBtn.setStyleName("SelectButton");
		feeBtn.setSize("1.46em", "1.46em");
		feeBtn.setEnabled(true);
		form.setWidget(5, 7, feeBtn);

		UIutils.setTableTextStyled(form);
		UIutils.setTextBoxesEnabled(form, false);

		cellFormatter.setHorizontalAlignment(8, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(8, 2, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(8, 4, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(9, 0, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(9, 2, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(9, 4, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setVerticalAlignment(9, 4, HasVerticalAlignment.ALIGN_TOP);

		cellFormatter.setHorizontalAlignment(2, 8, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(3, 8, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(4, 8, HasHorizontalAlignment.ALIGN_LEFT);
		cellFormatter.setHorizontalAlignment(12, 0, HasHorizontalAlignment.ALIGN_LEFT);

		if (!UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK }))
			UIutils.setElementsEnabled(form, false);

		return form;
	}

	/**
	 * Sets printing links when application has decision has number.
	 * 
	 */
	private void setPrintLinks() {
		boolean enabled = getData().getProperty(ApplicationMap.DECISION_NR) != null;
		if (enabled) {
			decisionPrintLink.setVisible(true);
			decisionSignLink.setVisible(false);
			if (getData().getProperty(ApplicationMap.DECISION_REG_ENTRY_CODE).equals(ServiceConstants.APPL_STATE_RGE)) {
				correctionPrintLink.setVisible(true);
				correctionSignLink.setVisible(false);
			} else {
				declinePrintLink.setVisible(true);
			}
		}
	}

	private void askClassificators() {
		List classList = (List) ServiceContext.getInstance().getCached(ServiceContext.DECISION_REG_ENTRY);
		if (classList != null) {
			makeDecisionRadios(ApplicationMap.DECISION_REG_ENTRY_CODE, classList);
		}
		classList = (List) ServiceContext.getInstance().getCached(ServiceContext.DECISION_EXAMPLES);
		if (classList != null) {
			makeDecisionRadios(ApplicationMap.DECISION_EXAMPLES_CODE, classList);
			setFormFieldsFromData(FORM_NAME);
		}
		setDecisionRadioDefaults();
	}

	private void makeDecisionRadios(String fieldName, List decisions) {
		RadioButtonList checks = (RadioButtonList) getFormField(FORM_NAME, fieldName);
		String firstCode = null;

		for (Iterator it = decisions.iterator(); it.hasNext();) {

			ClassItemMap item = (ClassItemMap) it.next();
			String code = item.getText(ClassItemMap.CODE);
			if (firstCode == null)
				firstCode = code;
			// extend decision codes are not added
			if (!code.equals(ServiceConstants.REGENTRY_DECISION_EXTENDED)
					&& !code.equals(ServiceConstants.REGENTRY_DECISION_NOT_EXTENDED)) {
				if (!codes.contains(code)) {
					checks.addItem(item.getText(ClassItemMap.NAME), code);
					codes.add(code);
				}
			}
		}

		// checks.setChecked(firstCode, true);
	}

	private void setDecisionRadioDefaults() {
		if (getData().getProperty(ApplicationMap.DECISION_NR) == null) {
			((RadioButtonList) getFormField(FORM_NAME, ApplicationMap.DECISION_REG_ENTRY_CODE))
					.setValue(ServiceConstants.APPL_STATE_RGE);
			((RadioButtonList) getFormField(FORM_NAME, ApplicationMap.DECISION_EXAMPLES_CODE))
					.setValue(ServiceConstants.APPL_PROD_EXMP_PEN);
		}
	}

	/**
	 * Väljade muutmise/salvestamise kuular.
	 * 
	 * @author viktorb
	 */
	private class ChangeSaveListener implements ClickListener {

		public void onClick(Widget sender) {
			setDataFromFormFields(FORM_NAME);
			save.setVisible(false);
			sender.setVisible(false);

			final Widget mainSender = sender;

			// check if the form has any validation errors
			if (DecisionForm.this.getErrors() != null && !DecisionForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					DecisionForm.this.setError((String) getErrors().get(i));
					save.setVisible(true);
					sender.setVisible(true);
				}
			} else {
				/*
				 * Siia ka kontroll
				 */
				/*
				 * Mingi asi on RGN
				 */
				Cookies.setCookie("TEST", (String) DecisionForm.this.getData().toString());
				if ((String) DecisionForm.this.getData().getProperty(ApplicationMap.DECISION_REG_ENTRY_CODE) != "RGN") {

					ApplicationMap map = (ApplicationMap) getData();

					Cookies.setCookie("TEST", map.toString());

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

					ServiceContext.getInstance().getRegistryService().processPaymentMatching(
							(ApplicationMap) cleanDataBeforeSave(getData()), "10", new AsyncCallback() {
								public void onSuccess(Object arg0) {
									// Korras
									// Cookies.setCookie("RL", "TRUE");
									// setData((ApplicationMap) arg0);
									// setFormFieldsFromData(PaymentMatchingForm.this.CHANGE_FORM);
									// parent.setData(getData());
									// returnToParent();
									ServiceContext.getInstance().getRegistryService().saveApplicationDecision(
											(ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {

										public void onFailure(Throwable caught) {
											ServiceContext.getInstance().getRegistryService().takeBackPaymentMatching(
													(ApplicationMap) cleanDataBeforeSave(getData()), "10",
													new AsyncCallback() {

												public void onFailure(Throwable caught) {
												}

												public void onSuccess(Object result) {

												}
											});

											setError(caught.toString());
										}

										public void onSuccess(Object result) {
											DecisionForm.this.setData((ApplicationMap) result);
											DecisionForm.this.parent.onDataEvent(new DataChangeEvent(
													DataChangeEvent.DATA_MODIFIED, (ApplicationMap) result));
											setFormFieldsFromData(FORM_NAME);
											// DecisionForm.this.returnToParent();
											DecisionForm.this.setButtonsEnabled(true);
											setPrintLinks();
											setInfo("Salvestamine õnnestus");
											Cookies.setCookie("RL", "TRUE");
											DecisionForm.this.save.setVisible(false);
											DecisionForm.this.reprocess.setVisible(true);
											// switchButtons(save,
											// reprocess);
											ServiceContext.getInstance().getRegistryService().isSigned(
													Integer.valueOf(getData().getText(ApplicationMap.ID)),
													ServiceConstants.DECISION_DOC_NAME
															+ getData().getText(ApplicationMap.DECISION_NR)
															+ " (asice)",
													new AsyncCallback() {

												public void onFailure(Throwable caught) {
													Window.alert(String.valueOf(caught.getMessage()));
												}

												public void onSuccess(Object result) {
													try {
														boolean res = ((Boolean) result).booleanValue();

														boolean enabled = getData()
																.getProperty(ApplicationMap.DECISION_NR) != null;

														if (!res && enabled) {
															decisionSignLink.setVisible(true);
														}
													} catch (Exception ex) {

													}

												}
											});

											ServiceContext.getInstance().getRegistryService().isSigned(
													Integer.valueOf(getData().getText(ApplicationMap.ID)),
													ServiceConstants.COR_DOC_NAME
															+ getData().getText(ApplicationMap.DECISION_NR)
															+ " (asice)",
													new AsyncCallback() {

												public void onFailure(Throwable caught) {
													Window.alert(String.valueOf(caught.getMessage()));
												}

												public void onSuccess(Object result) {

													try {
														boolean res = ((Boolean) result).booleanValue();
														boolean enabled = getData()
																.getProperty(ApplicationMap.DECISION_NR) != null;
														boolean oiendKeelatud = ((String) getData()
																.getProperty(ApplicationMap.STATE_CODE)).equals(
																		ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

														if (!res && enabled && !oiendKeelatud) {
															correctionSignLink.setVisible(true);
														}
													} catch (Exception ex) {

													}

												}
											});
										}
									});
								}

								public void onFailure(Throwable arg0) {
									if (!UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_CLASS_ADM })) {
										setError("Ettevõtte saldo pole piisav");
										save.setVisible(true);
										mainSender.setVisible(true);
										return;
									}

									ConfirmDialog conf = new ConfirmDialog(
											"Ettevõttel ei ole riigilõiv tasutud (Pole piisav saldo). Jätkan?",
											new ClickListener() {
										public void onClick(Widget arg0) {
											ServiceContext.getInstance().getRegistryService().processPaymentMatching2(
													(ApplicationMap) cleanDataBeforeSave(getData()), "10",
													new AsyncCallback() {
												public void onSuccess(Object arg0) {
													ServiceContext.getInstance().getRegistryService()
															.saveApplicationDecision(
																	(ApplicationMap) cleanDataBeforeSave(getData()),
																	new AsyncCallback() {

														public void onFailure(Throwable caught) {

															ServiceContext.getInstance().getRegistryService()
																	.takeBackPaymentMatching(
																			(ApplicationMap) cleanDataBeforeSave(
																					getData()),
																			"10", new AsyncCallback() {

																public void onFailure(Throwable caught) {
																}

																public void onSuccess(Object result) {

																}
															});

															setError(caught.toString());
															mainSender.setVisible(true);
														}

														public void onSuccess(Object result) {
															DecisionForm.this.setData((ApplicationMap) result);
															DecisionForm.this.parent.onDataEvent(
																	new DataChangeEvent(DataChangeEvent.DATA_MODIFIED,
																			(ApplicationMap) result));
															setFormFieldsFromData(FORM_NAME);
															// DecisionForm.this.returnToParent();
															DecisionForm.this.setButtonsEnabled(true);
															setPrintLinks();
															setInfo("Salvestamine õnnestus");
															Cookies.setCookie("RL", "TRUE");
															DecisionForm.this.save.setVisible(false);
															DecisionForm.this.reprocess.setVisible(true);
															// switchButtons(save,
															// reprocess);
															ServiceContext.getInstance().getRegistryService().isSigned(
																	Integer.valueOf(
																			getData().getText(ApplicationMap.ID)),
																	ServiceConstants.DECISION_DOC_NAME
																			+ getData()
																					.getText(ApplicationMap.DECISION_NR)
																			+ " (asice)",
																	new AsyncCallback() {

																public void onFailure(Throwable caught) {
																	Window.alert(String.valueOf(caught.getMessage()));
																}

																public void onSuccess(Object result) {
																	try {
																		boolean res = ((Boolean) result).booleanValue();
																		boolean enabled = getData().getProperty(
																				ApplicationMap.DECISION_NR) != null;
																		if (!res && enabled) {

																			decisionSignLink.setVisible(true);
																		}
																	} catch (Exception ex) {

																	}

																}
															});

															ServiceContext.getInstance().getRegistryService().isSigned(
																	Integer.valueOf(
																			getData().getText(ApplicationMap.ID)),
																	ServiceConstants.COR_DOC_NAME
																			+ getData()
																					.getText(ApplicationMap.DECISION_NR)
																			+ " (asice)",
																	new AsyncCallback() {

																public void onFailure(Throwable caught) {
																	Window.alert(String.valueOf(caught.getMessage()));
																}

																public void onSuccess(Object result) {

																	try {
																		boolean res = ((Boolean) result).booleanValue();
																		boolean enabled = getData().getProperty(
																				ApplicationMap.DECISION_NR) != null;
																		boolean oiendKeelatud = ((String) getData()
																				.getProperty(ApplicationMap.STATE_CODE))
																						.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

																		if (!res && enabled && !oiendKeelatud) {
																			correctionSignLink.setVisible(true);
																		}
																	} catch (Exception ex) {

																	}

																}
															});
														}
													});
												}

												public void onFailure(Throwable caught) {

													setError(caught.toString());
													save.setVisible(true);
													mainSender.setVisible(true);
												}
											});

										};
									});
									conf.hide();
									conf.show();
								}
							});
				} else {
					// Ei valitud otsuse tegemist.
					ServiceContext.getInstance().getRegistryService().saveApplicationDecision(
							(ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {

								public void onFailure(Throwable caught) {
									setError(caught.toString());
									save.setVisible(true);
									mainSender.setVisible(true);
								}

								public void onSuccess(Object result) {
									DecisionForm.this.setData((ApplicationMap) result);
									DecisionForm.this.parent.onDataEvent(new DataChangeEvent(
											DataChangeEvent.DATA_MODIFIED, (ApplicationMap) result));
									setFormFieldsFromData(FORM_NAME);
									// DecisionForm.this.returnToParent();
									DecisionForm.this.setButtonsEnabled(true);
									setPrintLinks();
									setInfo("Salvestamine õnnestus");
									Cookies.setCookie("RL", "TRUE");
									DecisionForm.this.save.setVisible(false);
									DecisionForm.this.reprocess.setVisible(true);

									ServiceContext.getInstance().getRegistryService().isSigned(
											Integer.valueOf(getData().getText(ApplicationMap.ID)),
											ServiceConstants.DECISION_DOC_NAME
													+ getData().getText(ApplicationMap.DECISION_NR) + " (asice)",
											new AsyncCallback() {

										public void onFailure(Throwable caught) {
											Window.alert(String.valueOf(caught.getMessage()));
										}

										public void onSuccess(Object result) {
											try {
												boolean res = ((Boolean) result).booleanValue();
												boolean enabled = getData()
														.getProperty(ApplicationMap.DECISION_NR) != null;
												if (!res && enabled) {

													decisionSignLink.setVisible(true);
												}
											} catch (Exception ex) {

											}

										}
									});

									ServiceContext.getInstance().getRegistryService().isSigned(
											Integer.valueOf(getData().getText(ApplicationMap.ID)),
											ServiceConstants.COR_DOC_NAME
													+ getData().getText(ApplicationMap.DECISION_NR) + " (asice)",
											new AsyncCallback() {

										public void onFailure(Throwable caught) {
											Window.alert(String.valueOf(caught.getMessage()));
										}

										public void onSuccess(Object result) {

											try {
												boolean res = ((Boolean) result).booleanValue();
												boolean enabled = getData()
														.getProperty(ApplicationMap.DECISION_NR) != null;
												boolean oiendKeelatud = ((String) getData()
														.getProperty(ApplicationMap.STATE_CODE)).equals(
																ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

												if (!res && enabled && !oiendKeelatud) {
													correctionSignLink.setVisible(true);
												}
											} catch (Exception ex) {

											}

										}
									});

									// switchButtons(save,
									// reprocess);
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
			if (DecisionForm.this.getErrors() != null && !DecisionForm.this.getErrors().isEmpty()) {
				for (int i = 0; i < getErrors().size(); i++) {
					DecisionForm.this.setError((String) getErrors().get(i));
				}
			} else {
				ServiceContext.getInstance().getRegistryService()
						.updateRegistryEntryNr((ApplicationMap) cleanDataBeforeSave(getData()), new AsyncCallback() {

							public void onFailure(Throwable arg0) {
								setError(arg0.toString());
							}

							public void onSuccess(Object arg0) {
								setInfo("Registrikande number on uuendatud!");
								getData().setProperty(ApplicationMap.REGISTRY_ENTRY, arg0);
								System.out.println("data:" + getData().getProperty(ApplicationMap.REGISTRYENTRY_NR));
								System.out.println("return:" + ((RegistryEntryMap) arg0).getText(RegistryEntryMap.NR));
								DecisionForm.this.parent.onDataEvent(
										new DataChangeEvent(DataChangeEvent.DATA_MODIFIED, (ApplicationMap) getData()));
								setFormFieldsFromData(FORM_NAME);

							}

						});
			}

		}

	}

	private class newReprocessListener extends PopupPanel implements ClickListener {
		final TextArea tbPohjendus = new TextArea();
		final ListBox lb = new ListBox();

		private void init() {
			HTML html = null;

			final VerticalPanel sisu = new VerticalPanel();

			html = new HTML(
					"<b>Hoiatus: PDF faili(de) kustutamine</b><br>Märkus: PDF faili kustutamisel allkirjastatud otsuse olemasolul kustub ka allkirjastatud fail.");

			HTML html2 = new HTML("Seaduslikud alused");
			HTML html3 = new HTML("Põhjendus");
			html.setWidth("100%");
			html2.setWidth("100%");
			html3.setWidth("100%");

			HorizontalPanel buttons = new HorizontalPanel();
			Button yes = new Button("Salvesta ja jätka", this);
			yes.addClickListener(new ClickListener() {
				public void onClick(Widget sender) {

					ServiceContext.getInstance().getRegistryService().reprocessApplication(
							(ApplicationMap) cleanDataBeforeSave(getData()), tbPohjendus.getText(),
							new AsyncCallback() {
						public void onFailure(Throwable caught) {
							setError(caught.toString());
						}

						public void onSuccess(Object result) {
							DecisionForm.this.setData((ApplicationMap) result);
							DecisionForm.this.parent.onDataEvent(
									new DataChangeEvent(DataChangeEvent.DATA_MODIFIED, (ApplicationMap) result));
							switchButtons(reprocess, save);
							hide();
							DecisionForm.this.returnToParent();
						}

					});
				}
			});

			lb.addChangeHandler((new ChangeHandler() {

				@Override
				public void onChange(ChangeEvent arg0) {
					// TODO Auto-generated method stub
					tbPohjendus.setText(lb.getValue(lb.getSelectedIndex()));
				}
			}));

			ServiceContext.getInstance().getRegistryService().getAllDeleteConfirmations(new AsyncCallback() {

				public void onFailure(Throwable caught) {
					Window.alert(String.valueOf(caught.getMessage()));
				}

				public void onSuccess(Object result) {
					List<String[]> data = (ArrayList<String[]>) result;

					for (int i = 0; i < data.size(); i++) {
						lb.addItem(data.get(i)[1], data.get(i)[2]);
					}
					if (lb.getItemCount() > 0) {
						tbPohjendus.setText(lb.getValue(0));
					}
				}
			});

			Button no = new Button("Loobu", new ClickListener() {

				@Override
				@Deprecated
				public void onClick(Widget arg0) {
					// TODO Auto-generated method stub
					hide();
				}
			});
			buttons.add(yes);
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(no);
			sisu.add(UIutils.createSpacer(1, 15));
			sisu.add(html);
			sisu.add(UIutils.createSpacer(1, 15));
			sisu.add(html2);
			sisu.add(UIutils.createSpacer(1, 15));
			sisu.add(lb);
			sisu.add(UIutils.createSpacer(1, 15));
			sisu.add(html3);
			sisu.add(UIutils.createSpacer(1, 15));
			sisu.add(tbPohjendus);
			sisu.add(UIutils.createSpacer(1, 20));
			sisu.add(buttons);
			sisu.add(UIutils.createSpacer(1, 20));

			sisu.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
			sisu.setCellHorizontalAlignment(html2, HasHorizontalAlignment.ALIGN_CENTER);
			sisu.setCellHorizontalAlignment(lb, HasHorizontalAlignment.ALIGN_CENTER);
			sisu.setCellHorizontalAlignment(html3, HasHorizontalAlignment.ALIGN_CENTER);
			sisu.setCellHorizontalAlignment(tbPohjendus, HasHorizontalAlignment.ALIGN_CENTER);
			sisu.setCellHorizontalAlignment(buttons, HasHorizontalAlignment.ALIGN_CENTER);

			setPopupPosition(350, 175);
			setSize("600px", "200px");
			this.setStyleName("Dialog");
			setWidget(sisu);
			this.show();
		}

		public void onClick(Widget sender) {
			init();
			show();
		}

	}

	// private class ReprocessListener implements ClickListener {
	// public void onClick(Widget sender) {
	// ServiceContext
	// .getInstance()
	// .getRegistryService()
	// .reprocessApplication(
	// (ApplicationMap) cleanDataBeforeSave(getData()),
	// new AsyncCallback() {
	// public void onFailure(Throwable caught) {
	// setError(caught.toString());
	// }
	//
	// public void onSuccess(Object result) {
	// DecisionForm.this
	// .setData((ApplicationMap) result);
	// DecisionForm.this.parent
	// .onDataEvent(new DataChangeEvent(
	// DataChangeEvent.DATA_MODIFIED,
	// (ApplicationMap) result));
	// switchButtons(reprocess, save);
	// DecisionForm.this.returnToParent();
	// }
	//
	// });
	// }
	// }

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
					ServiceContext.getInstance().getRegistryService()
							.isDecisionDocumentPresent(getData().getText(ApplicationMap.NR), new AsyncCallback() {
						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onFailure(java.lang.Throwable)
						 */
						public void onFailure(Throwable arg0) {
							setError("Dokumendi olemasolu kontroll ebaõnnestus: " + arg0.getMessage());
						}

						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onSuccess(java.lang.Object)
						 */
						public void onSuccess(Object arg0) {
							if (((Boolean) arg0).booleanValue()) {
								String converted = GWT.getModuleBaseURL();
								Window.open(
										converted + ServiceConstants.DOC_SERVICE_URL + "?"
												+ ServiceConstants.DOC_ACTION_PARM + "="
												+ ServiceConstants.DOC_ACTION_OPEN + "&"
												+ ServiceConstants.DOC_APPID_PARM + "="
												+ getData().getText(ApplicationMap.ID) + "&"
												+ ServiceConstants.DOC_FILE_PARM + "="
												+ URL.encode(ServiceConstants.DECISION_DOC_NAME
														+ getData().getText(ApplicationMap.DECISION_NR))
												+ ".pdf",
										"Otsus", "");
							} else {
								// if the document doesn't exist
								// then ask to creata a new one.
								ConfirmDialog confirm = new ConfirmDialog("Kas lisan uue otsuse?", new ClickListener() {

									public void onClick(Widget arg0) {
										ServiceContext.getInstance().getRegistryService().createNewDecisionDocument(
												getData().getText(ApplicationMap.NR), new AsyncCallback() {
											public void onFailure(Throwable arg0) {
												setError("Dokumendi lisamine ebaõnnestus: " + arg0.getMessage());
											}

											public void onSuccess(Object arg0) {
												if (((Boolean) arg0).booleanValue()) {
													setInfo("Uus otsus loodud!");
												}
											}
										});

										ServiceContext.getInstance().getRegistryService().isSigned(
												Integer.valueOf(getData().getText(ApplicationMap.ID)),
												ServiceConstants.DECISION_DOC_NAME
														+ getData().getText(ApplicationMap.DECISION_NR) + " (asice)",
												new AsyncCallback() {

											public void onFailure(Throwable caught) {
												Window.alert(String.valueOf(caught.getMessage()));
											}

											public void onSuccess(Object result) {
												try {
													boolean res = ((Boolean) result).booleanValue();

													boolean enabled = getData()
															.getProperty(ApplicationMap.DECISION_NR) != null;

													if (!res && enabled) {
														decisionSignLink.setVisible(true);
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

	class DecisionSignButton extends Button {

		/**
		 * The button is not visible by default
		 */
		DecisionSignButton() {
			this.setSize("18", "18");
			this.setStyleName("DecisionPrintButton signButtonOtsus");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the decision document still exists. If yes
				 * then show the document in a new window If no then ask the
				 * user if a new one should be created. If the user answers yes
				 * then the system creates a new document and displays it in a
				 * new window If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {
					String converted = GWT.getHostPageBaseURL();
					Window.open(converted + "signing" + "?" + "appid=" + getData().getText(ApplicationMap.ID) + "&"
							+ "docname" + "="
							+ URL.encode(ServiceConstants.DECISION_DOC_NAME + getData().getText(ApplicationMap.DECISION_NR))
							+ ".pdf", "Otsus", "");

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
			this.setStyleName("DecisionPrintButton signButtonOiend");
			this.addClickListener(new ClickListener() {

				/*
				 * First check if the decision document still exists. If yes
				 * then show the document in a new window If no then ask the
				 * user if a new one should be created. If the user answers yes
				 * then the system creates a new document and displays it in a
				 * new window If the user answers no we do nothing
				 */
				public void onClick(Widget arg0) {
					String converted = GWT.getHostPageBaseURL();
					Window.open(converted + "signing" + "?" + "appid=" + getData().getText(ApplicationMap.ID) + "&"
							+ "docname" + "="
							+ URL.encode(ServiceConstants.COR_DOC_NAME + getData().getText(ApplicationMap.DECISION_NR))
							+ ".pdf", "Õiend", "");

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
					ServiceContext.getInstance().getRegistryService()
							.isDeclineDocumentPresent(getData().getText(ApplicationMap.NR), new AsyncCallback() {
						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onFailure(java.lang.Throwable)
						 */
						public void onFailure(Throwable arg0) {
							setError("Dokumendi olemasolu kontroll ebaõnnestus: " + arg0.getMessage());
						}

						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onSuccess(java.lang.Object)
						 */
						public void onSuccess(Object arg0) {
							if (((Boolean) arg0).booleanValue()) {
								String converted = GWT.getModuleBaseURL();
								Window.open(
										converted + ServiceConstants.DOC_SERVICE_URL + "?"
												+ ServiceConstants.DOC_ACTION_PARM + "="
												+ ServiceConstants.DOC_ACTION_OPEN + "&"
												+ ServiceConstants.DOC_APPID_PARM + "="
												+ getData().getText(ApplicationMap.ID) + "&"
												+ ServiceConstants.DOC_FILE_PARM + "="
												+ URL.encode(ServiceConstants.NDEC_DOC_NAME
														+ getData().getText(ApplicationMap.DECISION_NR))
												+ ".pdf",
										"Ärakiri", "");
							} else {
								// if the document doesn't exist
								// then ask to creata a new one.
								ConfirmDialog confirm = new ConfirmDialog("Kas lisan uue ärakirja?",
										new ClickListener() {

									public void onClick(Widget arg0) {
										ServiceContext.getInstance().getRegistryService().createNewDeclineDocument(
												getData().getText(ApplicationMap.NR), new AsyncCallback() {
											public void onFailure(Throwable arg0) {
												setError("Dokumendi lisamine ebaõnnestus: " + arg0.getMessage());
											}

											public void onSuccess(Object arg0) {
												if (((Boolean) arg0).booleanValue()) {
													setInfo("Uus ärakiri loodud!");
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
					if (!getData().getProperty(ApplicationMap.DECISION_REG_ENTRY_CODE)
							.equals(ServiceConstants.APPL_STATE_RGE)) {
						return;
					}
					ServiceContext.getInstance().getRegistryService()
							.isCorrectionDocumentPresent(getData().getText(ApplicationMap.NR), new AsyncCallback() {
						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onFailure(java.lang.Throwable)
						 */
						public void onFailure(Throwable arg0) {
							setError("Dokumendi olemasolu kontroll ebaõnnestus: " + arg0.getMessage());
						}

						/*
						 * (non-Javadoc)
						 * 
						 * @see com.google.gwt.user.client.rpc. AsyncCallback
						 * #onSuccess(java.lang.Object)
						 */
						public void onSuccess(Object arg0) {
							if (((Boolean) arg0).booleanValue()) {
								String converted = GWT.getModuleBaseURL();
								Window.open(
										converted + ServiceConstants.DOC_SERVICE_URL + "?"
												+ ServiceConstants.DOC_ACTION_PARM + "="
												+ ServiceConstants.DOC_ACTION_OPEN + "&"
												+ ServiceConstants.DOC_APPID_PARM + "="
												+ getData().getText(ApplicationMap.ID) + "&"
												+ ServiceConstants.DOC_FILE_PARM + "="
												+ URL.encode(ServiceConstants.COR_DOC_NAME
														+ getData().getText(ApplicationMap.DECISION_NR))
												+ ".pdf",
										"Õiend", "");
							} else {
								// if the document doesn't exist
								// then ask to creata a new one.
								ConfirmDialog confirm = new ConfirmDialog("Kas lisan uue õiendi?", new ClickListener() {

									public void onClick(Widget arg0) {
										ServiceContext.getInstance().getRegistryService().createNewCorrectionDocument(
												getData().getText(ApplicationMap.NR), new AsyncCallback() {
											public void onFailure(Throwable arg0) {
												setError("Dokumendi lisamine ebaõnnestus: " + arg0.getMessage());
											}

											public void onSuccess(Object arg0) {
												if (((Boolean) arg0).booleanValue()) {
													setInfo("Uus õiend loodud!");
												}
											}
										});

										ServiceContext.getInstance().getRegistryService().isSigned(
												Integer.valueOf(getData().getText(ApplicationMap.ID)),
												ServiceConstants.COR_DOC_NAME
														+ getData().getText(ApplicationMap.DECISION_NR) + " (asice)",
												new AsyncCallback() {

											public void onFailure(Throwable caught) {
												Window.alert(String.valueOf(caught.getMessage()));
											}

											public void onSuccess(Object result) {

												try {
													boolean res = ((Boolean) result).booleanValue();

													boolean enabled = getData()
															.getProperty(ApplicationMap.DECISION_NR) != null;

													boolean oiendKeelatud = ((String) getData()
															.getProperty(ApplicationMap.STATE_CODE)).equals(
																	ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY);

													if (!res && enabled && !oiendKeelatud) {
														correctionSignLink.setVisible(true);
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

}
