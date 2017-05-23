package ee.agri.alkor.web.client.form.admin;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ClassItemMap;

/**
 * Rollide halduse vorm.
 * 
 * @author kristjan
 * 
 */

public class RolesManagement extends Form {

   public static final String getKey() {
      return "RolesManagement";
   }

   private FlexTable table = new FlexTable();

   public RolesManagement() {
      super();
   }
   
   public void init(){
      Label title = new Label(getLabel("formTitle"));
      title.setStyleName("Title");

      Button addrole = new Button(getLabel("addRole"));
      addrole.setWidth("100px");

      table.setWidth("100%");
      table.setStyleName("Table");
      table.setCellSpacing(1);
      table.setCellPadding(3);
      table.getRowFormatter().setStyleName(0, "Header");
      table.setText(0, 0, "");
      table.setText(0, 1, "Rolli nimi");
//      table.setText(0, 2, "");
//      table.setText(0, 3, "");

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(580, 1));
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.setWidget(2, 0, UIutils.createSpacer(1, 40));
      main.setWidget(3, 0, table);
      main.setWidget(4, 0, UIutils.createSpacer(1, 80));
      //main.setWidget(5, 0, addrole); //TODO: Lisamine/muutmine/eemaldamine ei ole hetkel vajalik
      //main.getFlexCellFormatter().setHorizontalAlignment(5, 0, HasHorizontalAlignment.ALIGN_RIGHT);
      initWidget(main);
      setDataList();
   }
   
   private void setDataList(){
      ServiceContext.getInstance().getUserManagerService().findSystemGroups(new AsyncCallback(){
         public void onSuccess(Object result) {
            List resultList = (List)result;
            for(int i=0;i<resultList.size();i++){
               ClassItemMap group = (ClassItemMap)resultList.get(i);
               table.setWidget(i+1, 0, new Label(""+(i+1)));
               table.setWidget(i+1, 1, new Label(group.getText(ClassItemMap.NAME)));
//               Label delete = new Label("kustuta");
//               Label change = new Label("muuda");
//               Label privileges = new Label(getLabel("privileges"));
//               change.addClickListener(new ModifyListener(i+1, ModifyListener.CHANGE, group.getText(ClassItemMap.CODE)));
//               delete.addClickListener(new ModifyListener(i+1, ModifyListener.DELETE, group.getText(ClassItemMap.CODE)));
//               privileges.addClickListener(new OpenListener(group.getText(ClassItemMap.CODE),group.getText(ClassItemMap.NAME)));
//               delete.addStyleName(Column.styleUrl);
//               change.addStyleName(Column.styleUrl);
//               privileges.addStyleName(Column.styleUrl);
//               table.setWidget(i+1, 2, change);
//               table.setWidget(i+1, 3, delete);
//               table.setWidget(i+1, 2, privileges);
            }           
         }
         public void onFailure(Throwable caught) {
            setError(getLabel("rolesFailed"));
         }
      });
   }
   
   private void addClass(String name, String code){
      ClassItemMap data = new ClassItemMap();
      if(name==null){
         data = (ClassItemMap) getData();
      }else{
         data.setProperty(ClassItemMap.CODE, code);
         data.setProperty(ClassItemMap.NAME, name);
         data.setProperty(ClassItemMap.CLASS, "SystemGroup");
         data.setProperty(ClassItemMap.CATEGORY_NAME, "Rollid");
         
      }
      ServiceContext.getInstance().getClassificatorService().saveClass(
            data, new AsyncCallback() {
               public void onSuccess(Object result) {
                  setInfo(getLabel("saveSuccess"));
                  setDataList();
               }

               public void onFailure(Throwable caught) {
                  setError(getLabel("saveFailure"));
               }
            });    
   }
   
   private class OpenListener implements ClickListener{
      private String code;
      private String name;
      public OpenListener(String code,String name) {
         this.code=code;
         this.name=name;
      }
      public void onClick(Widget sender) {
         PrivilegesForm pForm = new PrivilegesForm(code,name,RolesManagement.this);
         openForm(pForm);
      }
   }
   
   private class ModifyListener implements ClickListener {

      private int row = 0;
      public static final int CHANGE = 0;
      public static final int DELETE = 1;
      public static final int SAVE = 2;
      public static final int CANCEL = 3;
      public static final int PRIVILEGES = 4;
      private int type;
      private String code;

      public void onClick(Widget sender) {
         switch (type) {
         case CHANGE:
            TextBox changeBox = new TextBox();
            changeBox.setText(((Label) table.getWidget(row, 1)).getText());
            Label save = new Label(getLabel("save"));
            Label cancel = new Label(getLabel("cancel"));
            save.addClickListener(new ModifyListener(row, ModifyListener.SAVE, code));
            cancel.addClickListener(new ModifyListener(row, ModifyListener.CANCEL, code));
            save.addStyleName(Column.styleUrl);
            cancel.addStyleName(Column.styleUrl);
            table.setWidget(row, 1, changeBox);
            table.setWidget(row, 2, save);
            table.setWidget(row, 3, cancel);
            break;
         case DELETE:
            ConfirmDialog dialog = new ConfirmDialog(getLabel("confirmDialog"),new DeleteListener(code));
            dialog.hide();
            dialog.show();
            break;
         case SAVE:
            addClass(((TextBox)table.getWidget(row, 1)).getText(),code);
            setDataList();
            break;
         case CANCEL:
            Label original = new Label(((TextBox)table.getWidget(row, 1)).getText());
            table.setWidget(row, 1, original);
            Label change = new Label(getLabel("change"));
            Label delete = new Label(getLabel("delete"));
            change.addClickListener(new ModifyListener(row, ModifyListener.CHANGE, code));
            delete.addClickListener(new ModifyListener(row, ModifyListener.DELETE, code));
            change.addStyleName(Column.styleUrl);
            delete.addStyleName(Column.styleUrl);
            table.setWidget(row, 2, change);
            table.setWidget(row, 3, delete);
            setDataList();
            break;
         }
      }
      public ModifyListener(int row, int type,String code) {
         this.row = row;
         this.type = type;
         this.code = code;
      }
   }
   
   private class DeleteListener implements ClickListener{
      String code;
      public DeleteListener(String code) {
         this.code=code;
      }
      
      public void onClick(Widget sender) {
    	  Long id = (Long)getData().get(ClassItemMap.ID);
    	  
         ServiceContext.getInstance().getClassificatorService().delete(id, new AsyncCallback(){
            public void onSuccess(Object result) {
               setInfo(getLabel("deleted"));
               setDataList();
            }
            public void onFailure(Throwable caught) {
               setError(getLabel("deleteFailure"));
            }
         });
      }
   }
   
   public Object getConstantsWithLookup() {
      return GWT.create(RolesManagementKeys.class);
   }
   
}
