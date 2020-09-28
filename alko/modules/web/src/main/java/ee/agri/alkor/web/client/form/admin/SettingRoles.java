package ee.agri.alkor.web.client.form.admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.UserManageMap;

/**
 * Kasutajale rollide määramise vorm.
 * 
 * @author kristjan
 */

public class SettingRoles extends Form {
	ListBox unChosenRoles = new ListBox();
	ListBox chosenRole = new ListBox();
	
	private static final int ADD=0;
	private static final int REMOVE=1;
	
	public static final String getKey() {
		return "SettingRoles";
	}
	
	private static final String ROLESFORM= "ROLESFORM";
	
	public SettingRoles(Form parent, Object row) {
		this.parent = parent;
		
		Label title = new Label("Kasutajale rollide määramine");
		title.setStyleName("Title");
		
		FlexTable form = new FlexTable();
		form.setStyleName("Form");
		form.setCellSpacing(1);
		form.setCellPadding(5);
		
		form.setWidget(0,0, new Label("Eesnimi:"));
		form.setWidget(1,0, new Label("Perenimi:"));
		form.setWidget(2,0, new Label("Isikukood:"));
		form.setWidget(3,0, new Label("Kasutaja:"));
		
		form.setWidget(0, 1, addFormField(ROLESFORM, UserManageMap.FIRST_NAME, new TextBox(), null, "DisabledTextBox"));
		form.setWidget(1, 1, addFormField(ROLESFORM, UserManageMap.FAMILY_NAME, new TextBox(), null, "DisabledTextBox"));
		form.setWidget(2, 1, addFormField(ROLESFORM, UserManageMap.PERS_CODE, new TextBox(), null, "DisabledTextBox"));
		form.setWidget(3, 1, addFormField(ROLESFORM, UserManageMap.USER_NAME, new TextBox(), null, "DisabledTextBox"));
		
		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(580, 1));
		main.getFlexCellFormatter().setWidth(1, 1, "100%");
		main.getFlexCellFormatter().setColSpan(0, 0, 2);
		main.setWidget(2, 0, form);
		main.setWidget(3, 0, UIutils.createSpacer(1, 6));
		
		Label croles = new Label("Kasutajale valitud rollid");
		Label uncroles = new Label("Valimata rollid");
		
		chosenRole.setVisibleItemCount(5);
		chosenRole.setHeight("182px");
		
		unChosenRoles.setSize("156px", "182px");
		unChosenRoles.setVisibleItemCount(5);
		
		VerticalPanel chosenroles = new VerticalPanel();      
		chosenroles.add(croles);
		chosenroles.add(UIutils.createSpacer(1, 9));
		chosenroles.add(addFormField(ROLESFORM, UserManageMap.USER_ROLES_CODE, chosenRole,"156px"));
		
		VerticalPanel buttons = new VerticalPanel();
		
		Button toleft = new Button("&lt;", new ChangeListener(ADD, chosenRole, unChosenRoles));
		Button toright = new Button("&gt;", new ChangeListener(REMOVE, chosenRole, unChosenRoles));
		toleft.setPixelSize(21, 22);
		toright.setPixelSize(21, 22);
		buttons.add(UIutils.createSpacer(1, 25));
		buttons.add(UIutils.createSpacer(1, 10));
		buttons.add(toleft);
		buttons.add(toright);
		
		VerticalPanel unchosenroles = new VerticalPanel();
		unchosenroles.add(uncroles);
		unchosenroles.add(UIutils.createSpacer(1, 9));
		unchosenroles.add(unChosenRoles);
		
		HorizontalPanel roles = new HorizontalPanel();
		roles.add(UIutils.createSpacer(67, 1));
		roles.add(chosenroles);
		roles.add(UIutils.createSpacer(26, 1));
		roles.add(buttons);
		roles.add(UIutils.createSpacer(50, 1));
		roles.add(unchosenroles);
		
		main.setWidget(4, 0, roles);
		
		HorizontalPanel actions = new HorizontalPanel();
		Button save = new Button("Salvesta", new ClickHandler() {
			public void onClick(ClickEvent sender) {
				updateUserData();
				getUserWithRoles();
			}
		});
		save.setSize("104px", "23px");
		
		@SuppressWarnings("deprecation")
		Button back = new Button("Tagasi", new ReturnFormListener(this, parent) {
			public void onReturn() {
				final Form vorm = this.getOpenForm();
				
				ServiceContext.getInstance().getUserManagerService().findUserWithGroups((String) data.getProperty(UserManageMap.USER_NAME), new AsyncCallback<Object>() {
					public void onFailure(Throwable caught) {
						setError(caught.toString());
						caught.printStackTrace();
					}
					
					public void onSuccess(Object result) {
						if(vorm instanceof UsersEditing) {
							((UsersEditing)vorm).setData((UserManageMap) result);
						}
					}
				});
			}
		});
		back.setSize("104px", "23px");
		
		actions.add(UIutils.createSpacer(
		UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH, 
		UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		actions.add(save);
		actions.add(UIutils.createSpacer(9, 1));
		actions.add(back);
		main.setWidget(5, 0, UIutils.createSpacer(1, 30));
		main.setWidget(6, 0, actions);
		
		if(row !=null) {
			setData((ABaseDTOMap)row);
			try {
				getUserWithRoles();
			} catch (Exception e) {
				e.printStackTrace();
			}       
		}
		initWidget(main);
	}
	
	private void getUserWithRoles() {
		ServiceContext.getInstance().getUserManagerService().findUserWithGroups((String) data.getProperty(UserManageMap.USER_NAME), new AsyncCallback<Object>() {
			public void onFailure(Throwable caught) {
				setError(caught.toString());
				caught.printStackTrace();
			}
			
			public void onSuccess(Object result) {
				chosenRole.clear();
				unChosenRoles.clear();
				setData((ABaseDTOMap) result);                  
				setFormFieldsFromData(ROLESFORM);
				getRoles();
			}
		});
	}
	
	private void getRoles() {
		ServiceContext.getInstance().getUserManagerService().findSystemGroups(new AsyncCallback<Object>() {
			public void onFailure(Throwable caught) {
				setError(caught.toString());
				caught.printStackTrace();
			}
			
			public void onSuccess(Object result) {
				Iterator rolesList = ((List)result).iterator();
				while(rolesList.hasNext()) {
					ClassItemMap o = (ClassItemMap)rolesList.next();
					if(!contains(o.getText(ClassItemMap.CODE))) {
						unChosenRoles.addItem(o.getText(ClassItemMap.NAME),o.getText(ClassItemMap.CODE));
					}
				}
			}
		});
	}
	
	private void updateUserData() {
		ArrayList<ClassItemMap> roles = new ArrayList<ClassItemMap>();
		for(int i = 0; i < chosenRole.getItemCount(); i++) {
			ClassItemMap map = new ClassItemMap();
			map.setProperty(ClassItemMap.CODE, chosenRole.getValue(i));
			roles.add(map);
		}
		
		getData().setProperty(UserManageMap.USER_ROLES,roles);
		ServiceContext.getInstance().getUserManagerService().saveUser((UserManageMap)cleanDataBeforeSave(getData()), new AsyncCallback<Object>() {
			public void onFailure(Throwable caught) {
				setError(caught.toString());
				caught.printStackTrace();
			}
			public void onSuccess(Object result) {
				getUserWithRoles();
			}
		});
	}   
	
	private boolean contains(String k) {
		for(int i = 0; i < chosenRole.getItemCount(); i++) {
			if(chosenRole.getValue(i).equals(k)) {
				return true;
			}
		}
		return false;
	}
	
	private class ChangeListener implements ClickHandler {
		private int action;
		private ListBox croles;
		private ListBox uroles;
		
		public ChangeListener(int action, ListBox croles, ListBox uroles) {
			this.action = action;
			this.croles = croles;
			this.uroles = uroles;
		}
		
		public void onClick(ClickEvent sender) {
			if(action==REMOVE && croles.getSelectedIndex()!=-1) {
				int index = croles.getSelectedIndex();
				uroles.addItem(croles.getItemText(index), croles.getValue(index));
				croles.removeItem(index);
			}
			if(action==ADD && uroles.getSelectedIndex()!=-1) {
				int index = uroles.getSelectedIndex();
				croles.addItem(uroles.getItemText(index), uroles.getValue(index));
				uroles.removeItem(index);
			}
		}
	}
}
