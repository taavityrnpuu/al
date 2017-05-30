package ee.agri.alkor.web.client.form;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.LoginMessagesEng;
import ee.agri.alkor.web.client.LoginMessagesEst;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.InfoPanel;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.form.appl.ProductsForm;

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
		loginFormPanel.setAction(GWT.getModuleBaseURL() + "j_acegi_security_check");
		// loginFormPanel.setAction("j_acegi_security_check");
		loginFormPanel.setMethod(FormPanel.METHOD_POST);
		loginFormPanel.setEncoding(FormPanel.ENCODING_URLENCODED);

		user.setName("j_username");
		pass.setName("j_password");
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
		form.setWidget(1, 2, new Button(getLabel("formLogin"), new ClickListener() {

			public void onClick(Widget sender) {
				loginFormPanel.submit();
			}

		}));

		loginFormPanel.addFormHandler(new FormHandler() {

			public void onSubmit(FormSubmitEvent event) {
				if (user.getText().length() == 0) {
					Window.alert(getLabel("formUserRequired"));
					event.setCancelled(true);
				}
				user.setText(URL.encode(user.getText()));
				pass.setText(URL.encode(pass.getText()));

			}

			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				// System.out.println("UserLogin, complete: " + event);

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
					+ "<br/><br/><a href='http://www.vet.agri.ee/?arc=&op=body&LaID=1&id=472&setlang=est'>" + linkTitle
					+ "</a></div>");
			main.setWidget(1, 0, errorHtml);
		}
		 main.setWidget(2, 0, UIutils.createSpacer(1, 15));
		 main.setWidget(3, 0, idLoginFormPanel);
		 
		
		 
		 final Button ametnikule = new Button("Ametnikule", new ClickListener(){

			@Override
			public void onClick(Widget btn) {
				btn.setVisible(false);
				loginFormPanel.setVisible(true);
			}
			 
		 });
		 ametnikule.setStyleName("gwt-Button");
		 ametnikule.getElement().getStyle().setProperty("margin-left", "40px");
		 
		 main.setWidget(4, 0, UIutils.createSpacer(700, 1));
		 main.setWidget(5, 0, loginFormPanel);
		 

		 main.setWidget(4, 0, ametnikule);

		 main.setWidget(5, 0, UIutils.createSpacer(700, 1));
		 main.setWidget(6, 0, loginFormPanel);
		 
		 idLoginFormPanel.setVisible(false);
		 loginFormPanel.setVisible(false);

		 final FlexTable idForm = new FlexTable();
		 idForm.setHeight("180px");
		idForm.setStyleName("Form");
		/*idForm.setText(0, 0, getLabel("formIDlogin"));
		Image idImage = new Image("images/auth_id.gif");
		idImage.addClickListener(new ClickListener() {

			public void onClick(Widget sender) {
				idLoginFormPanel.submit();
			}

		});
		idForm.setWidget(1, 0, idImage);

		idLoginFormPanel.addFormHandler(new FormHandler() {

			public void onSubmit(FormSubmitEvent event) {
			}

			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				// TODO Auto-generated method stub
				// System.out.println("idLogin, complete: " + event);
			}

		});*/
		idLoginFormPanel.setWidget(idForm);
		idForm.setHTML(0, 0, "");

		ServiceContext.getInstance().getRegistryService().getLoginBackURL(
			new AsyncCallback() {
		
				public void onSuccess(Object result) {
					String[] urls = (String[]) result;
					
					String baseiframe = ""
						+ "<div id='login-iframe'>"
							+ "<iframe "
								+ "ng-src='"+urls[0]+"&amp;service="+urls[1]+"' "
								+ "frameborder='0' width='100%' height='180' title='Sisselogimise vorm' scrolling='no' "
								+ "src='"+urls[0]+"&amp;service="+urls[1]+"' "
								+ "id='iFrameResizer0' style='overflow: hidden; height: 180px;'>"
							+ "</iframe>"
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