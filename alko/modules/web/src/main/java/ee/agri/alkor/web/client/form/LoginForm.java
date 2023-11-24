package ee.agri.alkor.web.client.form;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.LoginMessagesEng;
import ee.agri.alkor.web.client.LoginMessagesEst;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.InfoPanel;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.statics.HomePageMessages;

/**
 * Login vorm ja enda avamise kuular.
 * 
 * @author viktorb
 */
public class LoginForm extends Form {
	public static final String BAD_CREDS = "badcreds";
	public static final String ACCESS_DENIED = "access_denied";
	public static final String NO_USER = "user_missing";
	public static final String NO_ID = "id_missing";
	public static final String NO_ROLE = "no_roles";
	public static final String NO_ENTERPRISE = "no_enteprise";
	
	private final TextBox user = new TextBox();
	private final PasswordTextBox pass = new PasswordTextBox();
	
	private String error;
	FormPanel loginFormPanel;
	
	public static String getKey() {
		return "LoginPage";
	}
	
	public LoginForm() {
		super();
		History.newItem(getKey());
	}
	
	public LoginForm(String error) {
		super();
		this.error = error;
	}
	
	@Override
	public Object getConstantsWithLookup() {
		if ("est".equals(ServiceContext.getInstance().getLanguage()))
			return GWT.create(LoginMessagesEst.class);
		else
			return GWT.create(LoginMessagesEng.class);
	}
	
	@Override
	public void init() {
		super.init();
		loginFormPanel = new FormPanel("");
		loginFormPanel.setAction(GWT.getModuleBaseURL() + "login");
		loginFormPanel.setMethod(FormPanel.METHOD_POST);
		loginFormPanel.setEncoding(FormPanel.ENCODING_URLENCODED);
		
		user.setName("username");
		pass.setName("password");
		pass.setWidth("100%");
		EnterPressHandler enterPressHandler = new EnterPressHandler();
		user.addKeyPressHandler(enterPressHandler);
		pass.addKeyPressHandler(enterPressHandler);
		
		final Label title = new Label("Laen sisselogimise võimalusi, palun oota...");
		title.setStyleName(InfoPanel.styleLoading);
		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setCellSpacing(1);
		form.setCellPadding(4);
		form.setText(0, 0, getLabel("formUser"));
		form.setText(1, 0, getLabel("formPass"));
		form.setWidget(0, 1, user);
		form.setWidget(1, 1, pass);
		form.setWidget(1, 2, new Button(getLabel("formLogin"), new ClickHandler() {
			public void onClick(ClickEvent sender) {
				loginFormPanel.submit();
			}
		}));
		
		loginFormPanel.addSubmitHandler(new SubmitHandler() {
			public void onSubmit(SubmitEvent event) {
				if (user.getText().length() == 0) {
					Window.alert(getLabel("formUserRequired"));
					event.cancel();
				}
				user.setText(URL.encode(user.getText()));
				pass.setText(URL.encode(pass.getText()));
			}
		});
		
		UIutils.setTableTextStyled(form);
		FlexCellFormatter formatter = form.getFlexCellFormatter();
		formatter.setColSpan(3, 0, 2);
		formatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
		formatter.setHorizontalAlignment(4, 0, HasHorizontalAlignment.ALIGN_LEFT);
		loginFormPanel.setWidget(form);

		final FormPanel idLoginFormPanel = new FormPanel("");
		idLoginFormPanel.setAction(GWT.getModuleBaseURL() + "id");
		idLoginFormPanel.setMethod(FormPanel.METHOD_POST);
		idLoginFormPanel.setEncoding(FormPanel.ENCODING_URLENCODED);

		final FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		String loginFailed = getLabel("formLoginFailedMsg");
		String reason = getLabel("formLoginFailedReason");
		String reason2 = getLabel("formLoginFailedReason2");
		String reason3 = getLabel("formLoginFailedReason3");
		String reason4 = getLabel("formLoginFailedReason4");
		String reason5 = getLabel("formLoginFailedReason5");
		String reason6 = getLabel("formLoginFailedReason6");
		String linkTitle = getLabel("linkTitle");
		if (error != null && BAD_CREDS.equals(error)) {
			HTML errorHtml = new HTML("<div style='color:red;margin-top:20px;margin-left:40px;font-size:12px'>"
					+ loginFailed + "<br/><br/>" + reason + "</div>");
			main.setWidget(1, 0, errorHtml);
		} else if (error != null && ACCESS_DENIED.equals(error)) {
			HTML errorHtml = new HTML("<div style='color:red;margin-top:20px;margin-left:40px;font-size:12px'>"
					+ loginFailed + "<br/><br/>" + reason2 + "</div>");
			main.setWidget(1, 0, errorHtml);
		} else if (error != null && NO_USER.equals(error)) {
			HTML errorHtml = new HTML("<div style='color:red;margin-top:20px;margin-left:40px;font-size:12px'>"
					+ loginFailed + "<br/><br/>" + reason3 + "</div>");
			main.setWidget(1, 0, errorHtml);
		} else if (error != null && NO_ID.equals(error)) {
			HTML errorHtml = new HTML("<div style='color:red;margin-top:20px;margin-left:40px;font-size:12px'>"
					+ loginFailed + "<br/><br/>" + reason4 + "</div>");
			main.setWidget(1, 0, errorHtml);
		} else if (error != null && NO_ROLE.equals(error)) {
			HTML errorHtml = new HTML("<div style='color:red;margin-top:20px;margin-left:40px;font-size:12px'>"
					+ loginFailed + "<br/><br/>" + reason5 + "</div>");
			main.setWidget(1, 0, errorHtml);
		} else if (error != null && NO_ENTERPRISE.equals(error)) {
			HTML errorHtml = new HTML("<div style='color:red;margin-top:20px;margin-left:40px;font-size:12px'>"
					+ loginFailed + "<br/><br/>" + reason6
					+ "<br/><br/><a href='http://pta.agri.ee'>" + linkTitle
					+ "</a></div>");
			main.setWidget(1, 0, errorHtml);
		}
		main.setWidget(2, 0, UIutils.createSpacer(1, 15));
		
		final HTML main_info_div = new HTML();
		main.setWidget(3, 0, main_info_div);
		ServiceContext.getInstance().getRegistryService().getMainInfoText(
			new AsyncCallback() {

				public void onFailure(Throwable caught) {
					
				}

				public void onSuccess(Object result) {
					String main_info = result.toString();
					
					if(main_info.length() > 0) {
						main_info = main_info.replaceAll("(\r\n|\n)", "<br/>") + "<br/>";
					}
					main_info_div.setHTML(main_info);
				}
			}
		);
		
		main.setWidget(4, 0, idLoginFormPanel);
		
		final Button ametnikule = new Button("Ametnikule");
		ametnikule.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent sender) {
				ametnikule.setVisible(false);
				loginFormPanel.setVisible(true);
			}
		});
		
		ametnikule.setStyleName("gwt-Button");
		ametnikule.getElement().getStyle().setProperty("margin-left", "40px");
		
		main.setWidget(5, 0, ametnikule);
		main.setWidget(6, 0, UIutils.createSpacer(700, 1));
		main.setWidget(7, 0, loginFormPanel);
		
		idLoginFormPanel.setVisible(false);
		loginFormPanel.setVisible(false);
		
		final FlexTable idForm = new FlexTable();
		idForm.setHeight("40px");
		idForm.setStyleName("Form");
		idLoginFormPanel.setWidget(idForm);
		idForm.setHTML(0, 0, "");
		
		
		ServiceContext.getInstance().getRegistryService().getLoginBackURL(
			new AsyncCallback() {
				public void onSuccess(Object result) {
					String[] urls = (String[]) result;
					String baseiframe = ""
						+ "<div id='login-iframe'>"
                      		+ "<a href='"+urls[0]+"?service="+urls[1]+"&cancellationUri="+urls[3]+"' class='login-cas'>Sisene Alkoholiregistrisse</a>"
						+ "</div>";
					
					idForm.setHTML(0, 0, baseiframe);
					
					idLoginFormPanel.setVisible(true);
					ametnikule.setVisible(true);
					title.setText(getLabel("formTitle"));
					title.setStyleName("Title");
				}
				
				public void onFailure(Throwable arg0) {
					idLoginFormPanel.setVisible(true);
					ametnikule.setVisible(true);
					title.setText(getLabel("formTitle"));
					title.setStyleName("Title");
				}
			}
		);
		
		initWidget(main);
	}
	
	@Override
	protected void onLoad() {
		super.onLoad();
		user.setFocus(true);
	}
	
	private class EnterPressHandler implements KeyPressHandler {
		public void onKeyPress(KeyPressEvent event) {
			if (event.getCharCode() == KeyCodes.KEY_ENTER) {
				loginFormPanel.submit();
			}
		}
	}
}
