package ee.agri.alkor.web.client.form.admin;

import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static org.apache.commons.lang.StringUtils.leftPad;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.MainPanel;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.UserManageMap;
import ee.agri.alkor.web.client.validator.Validators;

/**
 * Kasutajate muutmise vorm.
 * 
 * @author kristjan
 */
public class UsersEditing extends Form {

	public static final String getKey() {
		return "UsersEditing";
	}

	Button delete = new Button(getLabel("eraseUser"), new PopupListener());
	Button roles = new Button("Rollid");
	
	
	
	
	private Object row;
	private static final String FORM_FIELDS = "FORM_FIELDS";
	private static PasswordTextBox password1;
	private static PasswordTextBox password2;
	private static TextBox passnew;

	public UsersEditing(Form parent, Object row) {
		super();
		this.parent = parent;
		this.row = row;
	}

	public UsersEditing(Form parent) {
		super();
		this.parent = parent;
	}

	public Object getConstantsWithLookup() {
		return GWT.create(UsersEditingKeys.class);
	}

	public void init() {
		Label title = new Label(getLabel("formTitle"));
		title.setStyleName("Title");
		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setCellSpacing(1);
		form.setCellPadding(5);
		form.setText(0, 0, getLabel("person_registrationId") + ":");
		form.setText(1, 0, getLabel("person_firstName") + ":");
		form.setText(2, 0, getLabel("person_lastName") + ":");
		form.setText(3, 0, getLabel("name") + ":");
		
		//	form.setText(4, 0, getLabel("password") + ":");
		//	form.setText(5, 0, getLabel("password2") + ":");
		
		form.setText(6, 0, getLabel("email") + ":");
		form.setText(7, 0, getLabel("active") + ":");
		if (row == null) {
			//form.setText(8, 0, "Genereeritud parool:");
		}

		form.getFlexCellFormatter().setStyleName(0, 0, "Label");
		form.getFlexCellFormatter().setStyleName(1, 0, "Label");
		form.getFlexCellFormatter().setStyleName(2, 0, "Label");
		form.getFlexCellFormatter().setStyleName(3, 0, "Label");
		
			form.getFlexCellFormatter().setStyleName(4, 0, "Label");
			form.getFlexCellFormatter().setStyleName(5, 0, "Label");
		
		form.getFlexCellFormatter().setStyleName(6, 0, "Label");
		form.getFlexCellFormatter().setStyleName(7, 0, "Label");
		if (row == null) {
			form.getFlexCellFormatter().setStyleName(8, 0, "Label");
		}

		form.setWidget(0, 1, new Image("images/t2rn.gif"));
		form.setWidget(1, 1, new Image("images/t2rn.gif"));
		form.setWidget(2, 1, new Image("images/t2rn.gif"));
		form.setWidget(3, 1, new Image("images/t2rn.gif"));
		form.setWidget(6, 1, new Image("images/t2rn.gif"));
	
			//form.setWidget(4, 1, new Image("images/t2rn.gif"));
			//form.setWidget(5, 1, new Image("images/t2rn.gif"));
		

		password1 = new PasswordTextBox();
		password1.setWidth("22em");
		password2 = new PasswordTextBox();
		password2.setWidth("22em");
		passnew = new PasswordTextBox();
		passnew.setWidth("22em");
		
		password1.setVisible(false);
		password2.setVisible(false);
		passnew.setVisible(false);
		
		
		String generated = "";

		form.setWidget(
				0,
				2,
				addFormField(FORM_FIELDS, UserManageMap.PERS_CODE,
						new TextBox(), "22em", null, Validators.REQUIRED));
		form.setWidget(
				1,
				2,
				addFormField(FORM_FIELDS, UserManageMap.FIRST_NAME,
						new TextBox(), "22em", null, Validators.REQUIRED));
		form.setWidget(
				2,
				2,
				addFormField(FORM_FIELDS, UserManageMap.FAMILY_NAME,
						new TextBox(), "22em", null, Validators.REQUIRED));
		form.setWidget(
				3,
				2,
				addFormField(FORM_FIELDS, UserManageMap.USER_NAME,
						new TextBox(), "22em", null, Validators.REQUIRED));
		
		/*
			form.setWidget(
					4,
					2,
					addFormField(FORM_FIELDS, UserManageMap.PASSWORD,
							password1, "22em", null, Validators.REQUIRED + ", "
									+ Validators.LENGTH + "[1,20]"));
		*/
		//form.setWidget(5, 2, password2);
		form.setWidget(
				6,
				2,
				addFormField(FORM_FIELDS, UserManageMap.E_MAIL, new TextBox(),
						"22em", null));
		form.setWidget(7, 2,
				addFormField(FORM_FIELDS, UserManageMap.ACTIVE, new CheckBox()));

		if (row == null) {
			form.setWidget(8, 2, passnew);
		}

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(580, 1));
		main.getFlexCellFormatter().setWidth(1, 1, "100%");
		main.getFlexCellFormatter().setColSpan(0, 0, 2);
		main.setWidget(2, 0, form);
		main.setWidget(3, 0, UIutils.createSpacer(1, 80));

		final HorizontalPanel actions = new HorizontalPanel();
		actions.setStyleName("Form");

		Button back = new Button(getLabel("back"), new ReturnFormListener(this,
				parent) {
			public void onReturn() {
				((UsersManagementForm) parent).refreshUsersTable();

			}
		});
		back.setSize("114px", "23px");
		delete.setSize("135px", "23px");
		roles.setSize("135px", "23px");
		//forgot.setSize("135px", "23px");

		if (row != null) {
			roles = new Button("Rollid", new RoleChangeListener(this, row));
			roles.setSize("135px", "23px");
			delete.setVisible(true);
			roles.setVisible(true);
			//forgot.setVisible(true);
		} else {
			delete.setVisible(false);
			roles.setVisible(false);
			//forgot.setVisible(true);
			
		}

		if (row == null) {
			/*
			 * Uus kasutaja, random parool
			 */
			String pw = gen(8);
			
			generated = pw;

			password1.setText(pw);
			password2.setText(pw);	
			password1.setEnabled(false);
			password2.setEnabled(false);
			
			passnew.setText(pw);
			passnew.setEnabled(false);

		}

		Button save = new Button(getLabel("save"), new ClickListener() {
			public void onClick(Widget sender) {
				setDataFromFormFields(FORM_FIELDS);
				if ((getErrors() != null && !getErrors().isEmpty())
						) {
					
						return;
				
				} else {
					ServiceContext
							.getInstance()
							.getUserManagerService()
							.saveUser(
									(UserManageMap) cleanDataBeforeSave(getData()),
									new AsyncCallback() {
										public void onFailure(Throwable caught) {
											System.out.println("error:"
													+ caught.getMessage());
											caught.printStackTrace();
											setError(getLabel("userExists"));
										}

										public void onSuccess(Object result) {
											setData((UserManageMap) result);
											setDeleteButton(true);
											if (row != null) {
												setInfo(getLabel("dataChanged"));
											} else {
												setInfo(getLabel("dataAdded"));

												actions.remove(0);
												roles = new Button(
														"Rollid",
														new RoleChangeListener(
																UsersEditing.this,
																result));
												roles.setSize("135px", "23px");
												roles.setVisible(true);
												actions.insert(roles, 0);
											}
										}
									});
				}
			}
		});
		
		Button forgot = new Button("Saada aktiveerimise link uuesti", new ClickListener() {
			public void onClick(Widget sender) {
				setDataFromFormFields(FORM_FIELDS);
				getData().put(UserManageMap.PASSWORD, gen(8));
			
				if ((getErrors() != null && !getErrors().isEmpty())
						) {
					
						return;
				
				} else {
					ServiceContext
							.getInstance()
							.getUserManagerService()
							.saveUser2(
									(UserManageMap) cleanDataBeforeSave(getData()),
									new AsyncCallback() {
										public void onFailure(Throwable caught) {
											System.out.println("error:"
													+ caught.getMessage());
											caught.printStackTrace();
											setError(getLabel("userExists"));
										}

										public void onSuccess(Object result) {
											setData((UserManageMap) result);
											setDeleteButton(true);
											
											if (row != null) {
												setInfo(getLabel("dataChanged"));
											} else {
												setInfo(getLabel("dataAdded"));

												actions.remove(0);
												roles = new Button(
														"Rollid",
														new RoleChangeListener(
																UsersEditing.this,
																result));
												roles.setSize("135px", "23px");
												roles.setVisible(true);
												actions.insert(roles, 0);
											}
										}
									});
				}
			}
		});
		save.setSize("115px", "23px");
		forgot.setSize("270px", "23px");
		actions.add(UIutils.createSpacer(
				UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		actions.add(roles);
		actions.add(UIutils.createSpacer(6, 1));
		actions.add(delete);
		actions.add(UIutils.createSpacer(6, 1));
		actions.add(save);
		actions.add(UIutils.createSpacer(6, 1));
		actions.add(forgot);
		actions.add(UIutils.createSpacer(6, 1));
		actions.add(back);
		main.setWidget(6, 0, actions);
		main.getFlexCellFormatter().setHorizontalAlignment(6, 0,
				HasHorizontalAlignment.ALIGN_LEFT);

		if (row != null) {
			setDeleteButton(true);
			setRolesButton(true);
			setData((ABaseDTOMap) row);
			password2.setText(getData().getText(UserManageMap.PASSWORD));
			forgot.setVisible(true);
		} else {
			setData(new UserManageMap());
			getData().put(UserManageMap.ACTIVE, "true"); 
			getData().put(UserManageMap.PASSWORD, generated);
			forgot.setVisible(false);
		}
		setFormFieldsFromData(FORM_FIELDS);
		initWidget(main);
	}

	public String gen(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = length; i > 0; i -= 12) {
			int n = min(12, abs(i));
			sb.append(leftPad(Long.toString(round(random() * pow(36, n)), 36),
					n, '0'));
		}
		return sb.toString();
	}

	public static String leftPad(String string, int length, char c) {
		if (string == null) {
			throw new IllegalArgumentException("Non-null string expected.");
		}

		if (string.length() >= length) {
			return string;
		}

		StringBuilder b = new StringBuilder(length);

		int padding = length - string.length();
		for (int i = 0; i < padding; i++) {
			b.append(c);
		}

		b.append(string);

		return b.toString();
	}

	private boolean checkPassword() {
		String pass = password2.getText();
		if (pass != null && pass.length() != 0
				&& getData().getProperty(UserManageMap.PASSWORD).equals(pass)) {
			return false;
		}
		setError(getLabel("passwordsDiffer"));
		return true;
	}

	private void setDeleteButton(boolean b) {
		delete.setVisible(b);
	}

	private void setRolesButton(boolean b) {
		roles.setVisible(b);
	}

	private class RoleChangeListener implements ClickListener {
		Object row;
		Form form;

		public RoleChangeListener(Form form, Object row) {
			this.row = row;
			this.form = form;
		}

		public void onClick(Widget sender) {
			SimplePanel body = MainPanel.getBody();
			body.clear();
			SettingRoles roles = new SettingRoles(form, row);
			roles.init();
			body.add(roles);
		}
	}

	private class PopupListener extends PopupPanel implements ClickListener {

		private void init() {
			VerticalPanel popup = new VerticalPanel();
			HTML html = new HTML(getLabel("confirm"));
			html.setWidth("100%");
			HorizontalPanel buttons = new HorizontalPanel();
			Button yes = new Button(getLabel("yes"), this);
			yes.addClickListener(new ClickListener() {
				public void onClick(Widget sender) {
					ServiceContext
							.getInstance()
							.getUserManagerService()
							.deleteUser(
									(Long) getData().getProperty(
											UserManageMap.ID),
									new AsyncCallback() {
										public void onFailure(Throwable caught) {
											setError(caught.toString());
										}

										public void onSuccess(Object result) {
											setInfo(getLabel("deleted"));
											setData((UserManageMap) result);
											UsersEditing.this
													.setButtonsEnabled(false);
										}
									});
				}
			});
			Button no = new Button(getLabel("no"), this);
			buttons.add(yes);
			buttons.add(UIutils.createSpacer(6, 1));
			buttons.add(no);
			popup.add(UIutils.createSpacer(1, 15));
			popup.add(html);
			popup.add(UIutils.createSpacer(1, 20));
			popup.add(buttons);
			popup.setCellHorizontalAlignment(html,
					HasHorizontalAlignment.ALIGN_CENTER);
			popup.setCellHorizontalAlignment(buttons,
					HasHorizontalAlignment.ALIGN_CENTER);

			setPopupPosition(350, 175);
			setSize("300px", "100px");
			this.setStyleName("Dialog");
			setWidget(popup);
		}

		public void onClick(Widget sender) {
			if (sender instanceof Button) {
				String buttonText = ((Button) sender).getText();
				if (getLabel("eraseUser").equals(buttonText)) {
					init();
					show();
				} else if (getLabel("yes").equals(buttonText)) {
					hide();
				} else if (getLabel("no").equals(buttonText)) {
					hide();
				}
			}
		}
	}

}
