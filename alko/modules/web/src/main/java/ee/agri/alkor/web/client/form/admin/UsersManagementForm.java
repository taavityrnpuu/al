package ee.agri.alkor.web.client.form.admin;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.MainPanel;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.common.YesNoRadioBox;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.SuperSearchMap;
import ee.agri.alkor.web.client.dto.UserManageMap;
import ee.agri.alkor.web.client.dto.UserManageSearchFilter;

/**
 * Kasutajate haldamise vorm.
 *
 * @author kristjan
 */

public class UsersManagementForm extends Form {

   final UsersManagementForm thisform;

   public static final String getKey() {
      return "UsersManagementForm";
   }

   private static final String SEARCH_FORM = "searchForm";
   private UserManageList userManageList;

   public UsersManagementForm() {
      super();
      thisform = this;
   }
   



   public void init(){
      Label title = new Label("Kasutajate haldus");
      title.setStyleName("Title");
      userManageList=new UserManageList(this);
      OFButton adduser = new OFButton("Lisa kasutaja", new ClickListener(){
         public void onClick(Widget sender) {
        	userManageList.getData(getFormFieldValues(SEARCH_FORM));
            UsersEditing form = new UsersEditing(thisform);
            openForm(form);
         }
      });
      adduser.setSize("100px", "23px");
      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(5);
      form.setText(0, 0, "Eesnimi:");
      form.setText(0, 3, "Perekonnanimi:");
      form.setText(1, 0, "Aktiivne:");
      form.getFlexCellFormatter().setStyleName(0, 0, "Label");
      form.getFlexCellFormatter().setStyleName(0, 3, "Label");
      form.getFlexCellFormatter().setStyleName(1, 0, "Label");
      form.setWidget(0, 2, addFormField(SEARCH_FORM,UserManageSearchFilter.FIRST_NAME, new TextBox()));
      form.setWidget(0, 5, addFormField(SEARCH_FORM,UserManageSearchFilter.FAMILY_NAME, new TextBox()));
      form.setWidget(1, 2, addFormField(SEARCH_FORM, UserManageSearchFilter.ACTIVE, new YesNoRadioBox()));
      Button search = new Button("otsi");
      search.addClickListener(new ClickListener() {
         public void onClick(Widget sender) {
            userManageList.getData(getFormFieldValues(SEARCH_FORM));
         }
      });
      search.setSize("86px", "23px");
      form.setWidget(0, 6, UIutils.createSpacer(20, 1));
      form.setWidget(0, 7, search);

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(580, 1));
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.setWidget(2, 0, form);
      main.setWidget(3, 0, UIutils.createSpacer(1, 20));
      main.setWidget(4, 0, userManageList);
      main.setWidget(5, 0, UIutils.createSpacer(1, 35));
      main.setWidget(6, 0, UIutils.createSpacer(1, 35));

      HorizontalPanel adduserpanel = new HorizontalPanel();
//      adduserpanel.add(UIutils.createSpacer(523, 1));
      adduserpanel.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
      adduserpanel.add(adduser);

      main.setWidget(7, 0, adduserpanel);

      initWidget(main);
   }
   
   /**
    * Serveri tabel.
    *
    * @author martin
    */
   private class UserManageList extends ResultTable {
      UsersManagementForm form;

      public UserManageList(UsersManagementForm form) {
         super(new UserManageSearchFilter());
         addColumn(new Column("Eesnimi", UserManageMap.FIRST_NAME, Column.styleNormal));
         addColumn(new Column("Perenimi", UserManageMap.FAMILY_NAME, Column.styleNormal));
         addColumn(new Column("Kasutajanimi", UserManageMap.USER_NAME, Column.styleNormal));
         addColumn(new Column("Aktiivne", UserManageMap.ACTIVE, Column.styleNormal));
         addColumn(new Column(null, null, "muuda", Column.styleUrl, ResultTable.CHANGE));
         addColumn(new Column(null, null, "rollid", Column.styleUrl, "roles"));
         this.form=form;
      }

      protected void getData(SearchFilter filter) {
    	  startSearching();
         ServiceContext.getInstance().getUserManagerService().search(filter, this);
      }

      protected IRowListenerFactory getRowListenerFactory() {
         return new UserRowListener(form);
      }
	  protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
		return null;
	  }
		
      protected void renderRow(int row, ABaseDTOMap resultRow) {
    	  if(!"EIT".equals(resultRow.getProperty(UserManageMap.USER_NAME))){ // EITi ei näita välja, see on peidetud ettevõtja kasutaja 
	    	  if("true".equals(resultRow.getProperty(UserManageMap.ACTIVE))) {
	    		  resultRow.setProperty(UserManageMap.ACTIVE,"Jah");
				} else if ("false".equals(resultRow.getProperty(UserManageMap.ACTIVE))) {
					resultRow.setProperty(UserManageMap.ACTIVE,"Ei");
				}
	    	  super.renderRow(row, resultRow);
    	  }
      }
   }

   private class UserRowListener implements IRowListenerFactory{
      UsersManagementForm form;
      public UserRowListener(UsersManagementForm form){
         super();
         this.form=form;

      }
      public ClickListener create(String listenerType, Object row) {
         if(listenerType.equals(ResultTable.CHANGE)){
            return new ChangeListener(form,row);
         }
         if(listenerType.equals("roles")){
            return new RoleChangeListener(form,row);
         }
         return null;
      }
   }

   private class ChangeListener implements ClickListener {
      Object row;
      UsersManagementForm form;

      public ChangeListener(UsersManagementForm form, Object row) {
         this.row = row;
         this.form = form;
      }

      public void onClick(Widget sender) {
         SimplePanel body = MainPanel.getBody();
         body.clear();
         if("Jah".equals(((UserManageMap)row).getProperty(UserManageMap.ACTIVE))) {
        	 ((UserManageMap)row).setProperty(UserManageMap.ACTIVE,"true");
			} else if ("Ei".equals(((UserManageMap)row).getProperty(UserManageMap.ACTIVE))) {
				((UserManageMap)row).setProperty(UserManageMap.ACTIVE,"false");
			}
         UsersEditing edit = new UsersEditing(form, row);
         edit.init();
         body.add(edit);
      }
   }

   private class RoleChangeListener implements ClickListener {
      Object row;
      UsersManagementForm form;

      public RoleChangeListener(UsersManagementForm form, Object row) {
         this.row = row;
         this.form = form;
      }

      public void onClick(Widget sender) {
         SimplePanel body = MainPanel.getBody();
         body.clear();
         SettingRoles roles = new SettingRoles(form,row);
         roles.init();
         body.add(roles);
      }
   }

   public void onReturn(){
      userManageList.getData();
   }
   
   public void refreshUsersTable() {
	   userManageList.getData();
   }
}