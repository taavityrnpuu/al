package ee.agri.alkor.web.client;

import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.InfoPanel;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.client.form.AccessDeniedForm;
import ee.agri.alkor.web.client.form.BlanketForm;
import ee.agri.alkor.web.client.form.EnterpriseList;
import ee.agri.alkor.web.client.form.EnterpriseNotInRegistryErrorForm;
import ee.agri.alkor.web.client.form.EnterpriseReferenceFrom;
import ee.agri.alkor.web.client.form.FAQForm;
import ee.agri.alkor.web.client.form.EITEnterpriseForm;
import ee.agri.alkor.web.client.form.DeleteConfirmation;
import ee.agri.alkor.web.client.form.ConfigForm;
import ee.agri.alkor.web.client.form.IdErrorForm;
import ee.agri.alkor.web.client.form.LoginErrorForm;
import ee.agri.alkor.web.client.form.LoginForm;
import ee.agri.alkor.web.client.form.NewsForm;
import ee.agri.alkor.web.client.form.NoRoleForm;
import ee.agri.alkor.web.client.form.SearchForm;
import ee.agri.alkor.web.client.form.UserNameErrorForm;
import ee.agri.alkor.web.client.form.admin.AuthenticLog;
import ee.agri.alkor.web.client.form.admin.RolesManagement;
import ee.agri.alkor.web.client.form.admin.UsersManagementForm;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;
import ee.agri.alkor.web.client.form.appl.ProductsForm;
import ee.agri.alkor.web.client.form.clm.ClassificatorsManagement;
import ee.agri.alkor.web.client.form.cm.ManageFAQForm;
import ee.agri.alkor.web.client.form.cm.ManageNewsForm;
import ee.agri.alkor.web.client.form.cm.PublicDocuments;
import ee.agri.alkor.web.client.form.finance.IncomsForm;
import ee.agri.alkor.web.client.form.finance.StateFeeForm;
import ee.agri.alkor.web.client.form.quer.AlcoMovementForm;
import ee.agri.alkor.web.client.form.quer.InvalidAlcoForm;
import ee.agri.alkor.web.client.form.quer.RegisteredAlcoForm;
import ee.agri.alkor.web.client.form.quer.SubmittedReportsForm;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
import ee.agri.alkor.web.client.statics.ContactPage;
import ee.agri.alkor.web.client.statics.HomePage;
import ee.agri.alkor.web.client.statics.LegalForm;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.client.dto.EnterpriseMap;

import com.google.gwt.user.client.ui.Label;

import ee.agri.alkor.web.client.dto.ApplicationMap;

public class MainPanel extends Form implements ValueChangeHandler<String> {

	private static SimplePanel body = new SimplePanel();

	private final VerticalPanel closedMenuPanel;
	private final VerticalPanel openedMenuPanel;
	private final HorizontalPanel main;
	private static Element topSpan;
	private static HorizontalPanel upper;
	private Image hideMenuImage;
	private Image openMenuImage;
	private Image logo2;
	private final VerticalPanel right;
	private int left;

	private final ConstantsWithLookup messages;
	private Button estBtn;
	private Button engBtn;
	private Button entButton;
	private RequestBuilder logoutRequestBuilder;

	public Object getConstantsWithLookup() {
		if ("est".equals(ServiceContext.getInstance().getLanguage()))
			return GWT.create(LoginMessagesEst.class);
		else
			return GWT.create(LoginMessagesEng.class);
	}

	public static void scrollToTop() {
		scrollTo(0, 0);
	}

	public static void scrollToWidget(Widget widget) {
		int y = widget.getAbsoluteTop();
		int x = widget.getAbsoluteLeft();
		scrollTo(x, y);
	}

	/**
	 * Scroll the user to the top of the page
	 */
	private static native void scrollTo(int x, int y) /*-{
														$wnd.scroll(x,y);
														}-*/;

	public MainPanel(boolean canEditEnterprise) {
		messages = (ConstantsWithLookup) getConstantsWithLookup();
		OpenHideMenuListener openHideMenuListener = new OpenHideMenuListener();

		openedMenuPanel = new VerticalPanel();
		openedMenuPanel.setStyleName("Left");
		openedMenuPanel.setSize("100%", "100%");
		// openedMenuPanel.add(new Image("images/logo.gif"));
		openedMenuPanel.add(hideMenuImage = new Image("images/close_menu.gif"));
		hideMenuImage.addClickListener(openHideMenuListener);
		hideMenuImage.setStyleName("MenuOpenHide");
		openedMenuPanel.setCellHorizontalAlignment(hideMenuImage, HasHorizontalAlignment.ALIGN_RIGHT);
		
		MenuPanel menu = new MenuPanel(HomePage.getKey(), canEditEnterprise);
	
		
		openedMenuPanel.add(menu);
		openedMenuPanel.setCellHeight(menu, "100%");
		DOM.setAttribute(DOM.getParent(menu.getElement()), "className", "Menu");

		closedMenuPanel = new VerticalPanel();
		closedMenuPanel.setStyleName("Left");
		closedMenuPanel.setSize("45px", "100%");
		Image image = new Image("images/paneel.gif");
		image.setSize("45px", "89px");
		closedMenuPanel.add(image);
		closedMenuPanel.add(openMenuImage = new Image("images/open_menu.gif"));
		openMenuImage.addClickListener(openHideMenuListener);
		openMenuImage.setStyleName("MenuOpenHide");
		closedMenuPanel.setCellHorizontalAlignment(openMenuImage, HasHorizontalAlignment.ALIGN_RIGHT);
		closedMenuPanel.setCellHeight(openMenuImage, "100%");
		closedMenuPanel.setVisible(false);

		right = new VerticalPanel();
		upper = createUpperMenu();

		right.setSize("100%", "100%");
		right.add(upper);
		right.add(InfoPanel.getLabel());
		right.add(body);
		right.setCellHeight(body, "100%");
		body.setSize("100%", "100%");

		DOM.setStyleAttribute(InfoPanel.loadLabel.getElement(), "position", "absolute");
		left = body.getAbsoluteLeft() + 220;
		int top = upper.getAbsoluteTop() + 80;
		DOM.setStyleAttribute(InfoPanel.loadLabel.getElement(), "left", left + "px");
		DOM.setStyleAttribute(InfoPanel.loadLabel.getElement(), "top", top + "px");
		RootPanel.get().add(InfoPanel.loadLabel);
		topSpan = DOM.createSpan();
		DOM.setStyleAttribute(topSpan, "top", "0px");

		main = new HorizontalPanel();
		main.setSize("100%", "100%");
		main.add(closedMenuPanel);
		main.setCellHeight(closedMenuPanel, "100%");
		main.add(openedMenuPanel);
		main.setCellWidth(openedMenuPanel, "10%");
		main.setCellHeight(openedMenuPanel, "100%");
		main.add(right);
		main.setCellWidth(right, "90%");
		RootPanel.get().add(main);
		History.addValueChangeHandler(this);
		
		//if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && "".equals(History.getToken())) {
		//	History.newItem(XTeeForm.getKey()); // kasutaja suunatakse taotluste
												// esitamise ja jälgimise
												// vormile
		//} else {
			onHistoryChanged(History.getToken());
		//}
		this.initWidget(main);
	}

	public static SimplePanel getBody() {
		return body;
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		onHistoryChanged(event.getValue());
		MenuPanel.refreshMenus();
	}

	/**
	 * Siseliidese rakenduse veebilehitseja ajaloo asukoha muutusele
	 * reageerimine.
	 */
	public void onHistoryChanged(String historyToken) {

		GWT.log("ajaloo muutus >" + historyToken);

		body.clear();
		InfoPanel.clear();
		Form openForm = null;

		UserInfo uInfo = ServiceContext.getInstance().getUserInfo();

		if (!UIutils.userHasPriviledge(MenuConfig.getMenuItemViewRoles(historyToken), true)) {
			openForm = new LoginForm(); // kui kasutaja pole autoriseeritud
										// (sessioon aegunud või üritab
										// niisama kuskile pääseda, kuhu pole
										// vaja)
		} else if (historyToken == null || ((historyToken != null) && (historyToken.trim().length() == 0)) || HomePage.getKey().equals(historyToken)) {
			openForm = new HomePage();
		} else if (RegisteredAlcoForm.getKey().equals(historyToken)) {
			openForm = new RegisteredAlcoForm();
		} else if (LegalForm.getKey().equals(historyToken)) {
			openForm = new LegalForm();
		} else if (InvalidAlcoForm.getKey().equals(historyToken)) {
			openForm = new InvalidAlcoForm();
		} else if (AlcoMovementForm.getKey().equals(historyToken)) {
			openForm = new AlcoMovementForm();
		} else if (SubmittedReportsForm.getKey().equals(historyToken)) {
			openForm = new SubmittedReportsForm();
		} else if (ApplicationForm.getKey().equals(historyToken)) {
			openForm = new ApplicationForm();
		} else if (ProductsForm.getKey().equals(historyToken)) {
			openForm = new ProductsForm();
		} else if (EnterpriseList.getKey().equals(historyToken)) {
			openForm = new EnterpriseList();
		} else if (IncomsForm.getKey().equals(historyToken)) {
			openForm = new IncomsForm();
		} else if (ClassificatorsManagement.getKey().equals(historyToken)) {
			openForm = new ClassificatorsManagement();
		} else if (UsersManagementForm.getKey().equals(historyToken)) {
			openForm = new UsersManagementForm();
		} else if (RolesManagement.getKey().equals(historyToken)) {
			openForm = new RolesManagement();
		} else if (AuthenticLog.getKey().equals(historyToken)) {
			openForm = new AuthenticLog();
		} else if (PublicDocuments.getKey().equals(historyToken)) {
			openForm = new PublicDocuments();
		} else if (ManageNewsForm.getKey().equals(historyToken)) {
			openForm = new ManageNewsForm();
		} else if (EITEnterpriseForm.getKey().equals(historyToken)) {
			openForm = new EITEnterpriseForm();
		} else if (EnterpriseReferenceFrom.getKey().equals(historyToken)) {
			openForm = new EnterpriseReferenceFrom();
		} else if (DeleteConfirmation.getKey().equals(historyToken)) {
			openForm = new DeleteConfirmation();
		} else if (ConfigForm.getKey().equals(historyToken)) {
			openForm = new ConfigForm();
		} else if (ManageFAQForm.getKey().equals(historyToken)) {
			openForm = new ManageFAQForm();
		} else if (NewsForm.getKey().equals(historyToken)) {
			openForm = new NewsForm();
		} else if (FAQForm.getKey().equals(historyToken)) {
			openForm = new FAQForm();
		} else if (ContactPage.getKey().equals(historyToken)) {
			openForm = new ContactPage();
		} else if (BlanketForm.getKey().equals(historyToken)) {
			openForm = new BlanketForm();
		} else if (LoginForm.getKey().equals(historyToken)) {
			openForm = new LoginForm();
		} else if (LoginErrorForm.getKey().equals(historyToken)) {
			openForm = new LoginErrorForm();
		} else if (XTeeForm.getKey().equals(historyToken)) {
			Cookies.setCookie("selectedStateCode", "");
			Cookies.removeCookie("selectedStateCode");
			openForm = new XTeeForm();
		} else if (UserNameErrorForm.getKey().equals(historyToken)) {
			openForm = new UserNameErrorForm();
		} else if (IdErrorForm.getKey().equals(historyToken)) {
			openForm = new IdErrorForm();
		} else if (NoRoleForm.getKey().equals(historyToken)) {
			openForm = new NoRoleForm();
		} else if (AccessDeniedForm.getKey().equals(historyToken)) {
			openForm = new AccessDeniedForm();
		} else if (SearchForm.getKey().equals(historyToken)) {
			openForm = new SearchForm();
		} else if (StateFeeForm.getKey().equals(historyToken)) {
			openForm = new StateFeeForm();
		} else if (EnterpriseNotInRegistryErrorForm.getKey().equals(historyToken)) {
			openForm = new EnterpriseNotInRegistryErrorForm();
		} else if (SubmittedReportsForm.getKeyEIT().equals(historyToken)) {
			openForm = new SubmittedReportsForm();
		}

		try {
			if (!openForm.isInitialised())
				openForm.init();
		} catch (Exception e) {
			e.printStackTrace();
			Window.alert(e.toString());
		}
		body.setWidget(openForm);
	}

	private String getLabel2(String key) {
		String parsed = key.replace('.', '_');
		try {
			return messages.getString(parsed);
		} catch (Exception e) {
			return "[NO_MESSAGE]";
		}
	}

	/**
	 * Loob üleva menüü rea (keele valiku ja sisse logimise/välja logimise
	 * menüü riba).
	 * 
	 * @return
	 */
	private HorizontalPanel createUpperMenu() {
		final HorizontalPanel upper = new HorizontalPanel();
		upper.add(logo2 = new Image("images/logo.gif"));
		logo2.setSize("154px", "45px");
		logo2.setVisible(false);
		ChangeLanguageListener langListener = new ChangeLanguageListener();
		estBtn = new Button(getLabel2("formEst"), langListener);
		
		engBtn = new Button(getLabel2("formEng"), langListener);

		// HTML helpBtn = new HTML();
		// helpBtn.setHTML("<img src='images/helpBtn.gif'>");
		Button helpBtn = new Button(getLabel2("formHelpBtn"), new HelpButtonListener());
		helpBtn.setStyleName("helpButton");

		if ("est".equals(ServiceContext.getInstance().getLanguage())) {
			estBtn.setStyleName("estButtonSelected");
			engBtn.setStyleName("engButton");
		} else {
			estBtn.setStyleName("estButton");
			engBtn.setStyleName("engButtonSelected");
		}
		estBtn.setSize("4em", "1.5em");
		engBtn.setSize("4em", "1.5em");
		helpBtn.setSize("4em", "1.5em");
		
		final UserInfo uInfo = ServiceContext.getInstance().getUserInfo();
		
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && uInfo != null && !"anonymousUser".equals(uInfo.getName())) {
			
			entButton = new Button("", 
					new ClickListener(){
						public void onClick(Widget sender) {
					
						}
					});
			entButton.setStyleName("loginButton");
			entButton.setSize("14em", "1.5em");
			
			if(entButton != null){
				upper.add(entButton);
				upper.setCellVerticalAlignment(entButton, HasVerticalAlignment.ALIGN_BOTTOM);
			}
			
			
			ServiceContext.getInstance().getRegistryService().findEnterpriseByRegNr(Form.getUserInfo().getRegCode(),
					new AsyncCallback() {
	            public void onFailure(Throwable error) {
	               setError(error.toString());
	            }
	            	
	            public void onSuccess(Object result) {	            	
	            	if(result != null){	           
	            		entButton.setText((String) ((EnterpriseMap)result).getProperty(EnterpriseMap.NAME));	            		
	            	}
	            }
	         });
		}
		
		if(uInfo != null && !"anonymousUser".equals(uInfo.getName())){
			final Button changeRole = new Button("Vaheta rolli", 
					new ClickListener(){
						public void onClick(Widget sender) {
	
							ServiceContext.getInstance().getAuthService().invalidateSession(true, new AsyncCallback() {
	
								public void onFailure(Throwable caught) {
									
								}
	
								public void onSuccess(Object result) {
									Window.Location.replace(GWT.getHostPageBaseURL()+"loginservice");
								}
							});
						}
					});
			changeRole.setStyleName("loginButton");
			changeRole.setSize("14em", "1.5em");
			upper.add(changeRole);
			upper.setCellVerticalAlignment(changeRole, HasVerticalAlignment.ALIGN_BOTTOM);
		}
		
		if (uInfo != null && "anonymousUser".equals(uInfo.getName())) {
			upper.add(estBtn);
			upper.add(engBtn);			
		} else if (uInfo != null && !"anonymousUser".equals(uInfo.getName())) {

		}
		
		upper.add(helpBtn);
		Button loginBtn = new Button(getLabel2("formLogin"), /*new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
				if (uInfo != null && !"anonymousUser".equals(uInfo.getName())) {
					Cookies.removeCookie("JSESSIONID");
					Window.Location.assign(GWT.getModuleBaseURL());
				} else {
					Window.Location.assign("/caslogin");
				}
				
				
				
				String text = ((Button) sender).getText();
		         if (getLabel("formLogin").equals(text)) {
		            onHistoryChanged(LoginForm.getKey());
		         } else if (getLabel("formLogout").equals(text)) {

		            ServiceContext.getInstance().getAuthService().invalidateSession(new AsyncCallback() {

		               public void onFailure(Throwable caught) {
		               }

		               public void onSuccess(Object result) {
		                  ServiceContext.getInstance().setUserInfo((UserInfo) result);
		                  History.newItem(HomePage.getKey());
		                  RootPanel.get().clear();
		                  RootPanel.get().add(new MainPanel());
		               }

		            });
		         }
			}
		}*/ new LoginLogoutListener());
		loginBtn.setStyleName("loginButton");
		loginBtn.setSize("7em", "1.5em");
		if (uInfo != null && !"anonymousUser".equals(uInfo.getName())) {
			loginBtn.setText(getLabel2("formLogout"));
		}
		// logoutRequestBuilder = new RequestBuilder(RequestBuilder.POST,
		// GWT.getModuleBaseURL() + "j_spring_logout");
		upper.add(loginBtn);
		upper.setStyleName("RightLine");
		upper.setCellWidth(logo2, "100%");
		upper.setCellVerticalAlignment(estBtn, HasVerticalAlignment.ALIGN_BOTTOM);
		upper.setCellVerticalAlignment(engBtn, HasVerticalAlignment.ALIGN_BOTTOM);
		
		// upper.setCellVerticalAlignment(logoutForm,
		// HasVerticalAlignment.ALIGN_BOTTOM);
		upper.setCellVerticalAlignment(helpBtn, HasVerticalAlignment.ALIGN_BOTTOM);
		upper.setCellVerticalAlignment(loginBtn, HasVerticalAlignment.ALIGN_BOTTOM);
		upper.setSize("100%", "45px");
		return upper;
	}

	/**
	 * Menu paneeli peidetuks ja nähtavaks tegija-kuular.
	 * 
	 * @author viktorb
	 */
	private class OpenHideMenuListener implements ClickListener {

		public void onClick(Widget sender) {
			openedMenuPanel.setVisible(!openedMenuPanel.isVisible());
			closedMenuPanel.setVisible(!closedMenuPanel.isVisible());
			logo2.setVisible(!logo2.isVisible());

			main.setCellWidth(openedMenuPanel, (sender == openMenuImage) ? "10%" : null);
			main.setCellWidth(closedMenuPanel, (sender == hideMenuImage) ? "2%" : null);
			main.setCellWidth(right, (sender == openMenuImage) ? "90%" : "98%");
			left += (sender == hideMenuImage) ? -155 : 155;
			DOM.setStyleAttribute(InfoPanel.loadLabel.getElement(), "left", left + "px");
		}

	}

	/**
	 * Sisse logimise lehe avamise ja välja logimise kuular.
	 * 
	 * @author viktorb
	 */
	private class LoginLogoutListener implements ClickListener {

		public void onClick(Widget sender) {
			String text = ((Button) sender).getText();
			if (getLabel2("formLogin").equals(text)) {
				onHistoryChanged(LoginForm.getKey());
			} else if (getLabel2("formLogout").equals(text)) {

				ServiceContext.getInstance().getAuthService().invalidateSession(false, new AsyncCallback() {

					public void onFailure(Throwable caught) {
					}

					public void onSuccess(Object result) {
						
						ServiceContext.getInstance().getRegistryService().getLoginBackURL(
								new AsyncCallback() {
							
									public void onSuccess(Object result) {
										String[] urls = (String[]) result;
										Window.Location.replace(urls[2]+"?service="+urls[1].replace("caslogin", ""));
										
										/*
										try{
											RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, urls[2]+"?service="+urls[1].replace("caslogin", ""));
											rb.setCallback(new RequestCallback() {
												
												@Override
												public void onResponseReceived(Request arg0, Response arg1) {

													
												}
												
												@Override
												public void onError(Request arg0, Throwable arg1) {
													Window.alert(arg1.getMessage());
													
												}
											});
											rb.send();
										} catch(Exception x){
											Window.alert(x.getMessage());
										}*/
									}
							
									public void onFailure(Throwable arg0) {
										Window.alert(arg0.getMessage());
									}
							
								}
							);
					
						
						ServiceContext.getInstance().setUserInfo((UserInfo) result);
						History.newItem(HomePage.getKey());
						RootPanel.get().clear();
						ServiceContext.getInstance().getRegistryService().getCanEditEnterprise(new AsyncCallback() {

							public void onFailure(Throwable caught) {
								Window.alert(String.valueOf(caught.getMessage()));
							}

							public void onSuccess(Object result) {
								String val = String.valueOf(result);			
								boolean canEditEnterprise = ((Boolean) result)
										.booleanValue();
								RootPanel.get().add(new MainPanel(canEditEnterprise));
								
								
							}
						});
						
					}

				});
			}
		}

	}

	private class ChangeLanguageListener implements ClickListener {

		public void onClick(Widget sender) {
			Button btn = (Button) sender;
			String style = btn.getStyleName();

			if ("estButtonSelected".equals(style) || "engButtonSelected".equals(style))
				return;

			String estStyle = estBtn.getStyleName();
			String engStyle = engBtn.getStyleName();
			estBtn.setStyleName(estStyle.equals("estButton") ? "estButtonSelected" : "estButton");
			engBtn.setStyleName(engStyle.equals("engButton") ? "engButtonSelected" : "engButton");

			String language = ServiceContext.getInstance().getLanguage();
			ServiceContext.getInstance().setLanguage("est".equals(language) ? "eng" : "est");

			RootPanel.get().clear();
			
			ServiceContext.getInstance().getRegistryService().getCanEditEnterprise(new AsyncCallback() {

				public void onFailure(Throwable caught) {
					Window.alert(String.valueOf(caught.getMessage()));
				}

				public void onSuccess(Object result) {
					String val = String.valueOf(result);			
					boolean canEditEnterprise = ((Boolean) result)
							.booleanValue();
					RootPanel.get().add(new MainPanel(canEditEnterprise));
					
					
				}
			});
			
			
		}

	}

	private class HelpButtonListener implements ClickListener {

		public void onClick(Widget sender) {

			UserInfo uInfo = ServiceContext.getInstance().getUserInfo();
			if (uInfo != null) {
				if ("anonymousUser".equals(uInfo.getName())) {
					Window.open("Alko_juhend_vk.pdf", "_blank", "");
				} else if ("EIT".equals(uInfo.getName())) {
					Window.open("Kasutusjuhend.pdf", "_blank", "");
				} else if (!"anonymousUser".equals(uInfo.getName())) {
					Window.open("Alko_juhend_sisekasutaja.pdf", "_blank", "");
				}
			} else {
				// ...
			}

		}

	}

	/**
	 * Determines by key, whether page is for public access, or not. All current
	 * public pages are listed
	 * 
	 * @param key
	 * @return
	 */
	public boolean isPublicPage(String key) {

		if (HomePage.getKey().equals(key) || LoginForm.getKey().equals(key) || RegisteredAlcoForm.getKey().equals(key) || InvalidAlcoForm.getKey().equals(key)
				|| BlanketForm.getKey().equals(key) || LegalForm.getKey().equals(key) || ContactPage.getKey().equals(key) || NewsForm.getKey().equals(key)
				|| FAQForm.getKey().equals(key) || EITEnterpriseForm.getKey().equals(key) || DeleteConfirmation.getKey().equals(key)
				|| LoginErrorForm.getKey().equals(key) || UserNameErrorForm.getKey().equals(key) || IdErrorForm.getKey().equals(key)
				|| NoRoleForm.getKey().equals(key) || AccessDeniedForm.getKey().equals(key) || XTeeForm.getKey().equals(key)
				|| EnterpriseNotInRegistryErrorForm.getKey().equals(key))
			return true;
		else
			return false;

	}

	/**
	 * Get page url
	 * 
	 * @return
	 */
	public static native String getParamString() /*-{

													return $wnd.location.toString();

													}-*/;

}
