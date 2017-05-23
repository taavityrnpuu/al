package ee.agri.alkor.web.client.form.clm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.ExcelFormPanel;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.validator.Validators;

/**
 * Alamklassifikaatorite halduse vorm.
 *
 * @author kristjan
 *
 */
public class SubClassificators extends Form {

   public static final String getKey() {
      return "SubClassificators";
   }

   private static final String ADD_FORM = "addForm";
   private FlexTable table;
   private String classificatorDesc;
   private Form parentForm;
   private String className;

   public SubClassificators(String name,String className, Form parentForm) {
      setClassificatorDesc(name);
      this.className=className;
      this.parentForm=parentForm;
   }

   public void init() {
      Label title = new Label(getLabel("formTitle"));
      title.setStyleName("Title");
      HTML klassifikaator = new HTML("<br> <b>"+getLabel("classificator")+" </b>" + getClassificatorDesc());
      klassifikaator.setStyleName("Classificator");
      Map sortMap = new HashMap();

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(0);
      form.setWidth("92%");
      form.setWidget(0, 0, UIutils.createSpacer(3, 1));
      form.setText(0, 1, getLabel("code"));
      form.setText(0, 4, getLabel("name"));

      form.getFlexCellFormatter().setStyleName(0, 1, "Label");
      form.getFlexCellFormatter().setStyleName(0, 4, "Label");

      form.setWidget(0, 2, new Image("images/t2rn.gif"));
      form.setWidget(0, 3, addFormField(ADD_FORM, ClassItemMap.CODE, new TextBox(), null, null, Validators.REQUIRED));
      form.setWidget(0, 5, new Image("images/t2rn.gif"));
      form.setWidget(0, 6, addFormField(ADD_FORM, ClassItemMap.NAME, new TextBox(), null, null, Validators.REQUIRED));

      HorizontalPanel buttons = new HorizontalPanel();
      Button addButton = new Button(getLabel("add"));
      addButton.setSize("83px", "23px");
      addButton.addClickListener(new ClickListener() {
         public void onClick(Widget sender) {
            setDataFromFormFields(ADD_FORM);
            if (getErrors() != null && !getErrors().isEmpty()) {
               return;
            } else {
               addClass(null,null,null,null);
            }
         }
      });
      buttons.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
      buttons.add(addButton);
      form.setWidget(0, 7, UIutils.createSpacer(11, 1));
      form.setWidget(0, 8, buttons);
      table = new FlexTable();
      table.setWidth("100%");
      table.setStyleName("Table");
      table.setCellSpacing(1);
      table.setCellPadding(3);
      table.getRowFormatter().setStyleName(0, "Header");
      table.setText(0, 0, "");
      table.setText(0, 1, getLabel("code"));
      table.setText(0, 2, getLabel("name"));
      table.setText(0, 3, getLabel("active"));
      table.setText(0, 4, "");
      table.setText(0, 5, "");

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(580, 1));
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.setWidget(2, 0, klassifikaator);
      main.setWidget(3, 0, form);
      main.setWidget(4, 0, UIutils.createSpacer(1, 20));

      //create search filter for excell printing
      SearchFilter filter = new SearchFilter();
      filter.setObjectClass(className);
      Map queryParams = new HashMap();
      filter.setQueryParams(queryParams);
      filter.addColumn(ClassItemMap.CODE, "Kood");
      filter.addColumn(ClassItemMap.NAME, "Nimi");
      /**
       * Specify order parameter by className and put it into sortMap
       */
      if(className.equals("Month")){
			sortMap.put("id", "asc");
		}
		else{
			sortMap.put("name", "asc");
		}
      filter.setSortMap(sortMap);
      //end filter

      main.setWidget(5, 0, new ExcelFormPanel(filter));
      main.setWidget(6, 0, table);
      main.setWidget(7, 0, UIutils.createSpacer(1, 20));

      Button back = new Button(getLabel("back"), new ReturnFormListener(this, parentForm){
    	  public void onReturn(){}
      });
      back.setSize("104px", "23px");
      HorizontalPanel backpanel = new HorizontalPanel();
      backpanel.add(UIutils.createSpacer(473, 1));
      backpanel.add(back);

      main.setWidget(7, 0, backpanel);
      initWidget(main);
      setData(new ClassItemMap());
      setDataList(className);
   }

   private void setDataList(String className) {
      ServiceContext.getInstance().getClassificatorService().findAllClassItems(className, new AsyncCallback() {
         public void onSuccess(Object result) {
            fillTable(result);
         }
         public void onFailure(Throwable caught) {
            setError(getLabel("listFailed"));
         }
      });
   }

   private void addClass(String name, String code, Boolean check, ClassItemMap map){
      ClassItemMap data = new ClassItemMap();
      if(name==null){
         data = (ClassItemMap) getData();
         data.setProperty(ClassItemMap.CLASS, className);
         data.setProperty(ClassItemMap.CATEGORY_NAME, getClassificatorDesc());
      }else{
         data = map;
         data.setProperty(ClassItemMap.CODE, code);
         data.setProperty(ClassItemMap.NAME, name);
         data.setProperty(ClassItemMap.CLASS, className);
         data.setProperty(ClassItemMap.ACTIVE, check);
         data.setProperty(ClassItemMap.CATEGORY_NAME, getClassificatorDesc());
         data.setProperty(ClassItemMap.VERSION, map.getText(ClassItemMap.VERSION));
      }
      ServiceContext.getInstance().getClassificatorService().saveClass(
            data, new AsyncCallback() {
               public void onSuccess(Object result) {
                  setInfo(getLabel("saveSuccess"));
                  setDataList(className);
               }

               public void onFailure(Throwable caught) {
                  setError(getLabel("saveFailed"));
               }
            });
   }

   private void fillTable(Object result) {
      while (table.getRowCount() > 1) {
         table.removeRow(1);
      }
      ArrayList list = (ArrayList) result;
      for (int i = 0; i < list.size(); i++) {
         if (((i+1) % 2) == 1)
            table.getRowFormatter().setStyleName(i+1, "Odd");
         else
            table.getRowFormatter().setStyleName(i+1, "Even");
         ClassItemMap map = (ClassItemMap) list.get(i);
         Iterator it = map.keySet().iterator();
         while(it.hasNext()){
            Object o = it.next();
         }
         table.setWidget(i+1, 0, new Label((i+1) + ""));
         table.setWidget(i+1, 1, new Label(map.getText(ClassItemMap.CODE)));
         table.setWidget(i+1, 2, new Label(map.getText(ClassItemMap.NAME)));
         CheckBox check = new CheckBox();
         check.setChecked(map.get(ClassItemMap.ACTIVE) != null ? ((Boolean)map.get(ClassItemMap.ACTIVE)).booleanValue() : false);
         check.setEnabled(false);
         table.setWidget(i+1, 3, check);
         Label delete = new Label(getLabel("delete"));
         Label change = new Label(getLabel("change"));
         change.addClickListener(new ModifyListener(i+1, ModifyListener.CHANGE,map));
         delete.addClickListener(new ModifyListener(i+1, ModifyListener.DELETE,map));
         delete.addStyleName(Column.styleUrl);
         change.addStyleName(Column.styleUrl);
         table.setWidget(i+1, 4, change);
         table.setWidget(i+1, 5, delete);
      }

   }

   private class ModifyListener implements ClickListener {

      private int row = 0;
      public static final int CHANGE = 0;
      public static final int DELETE = 1;
      public static final int SAVE = 2;
      public static final int CANCEL = 3;
      private int type;
      private ClassItemMap map;

      public void onClick(Widget sender) {
         switch (type) {
         case CHANGE:
            TextBox changeBox = new TextBox();
            changeBox.setText(((Label) table.getWidget(row, 2)).getText());
            Label save = new Label(getLabel("save"));
            Label cancel = new Label(getLabel("cancel"));
            ((CheckBox)table.getWidget(row, 3)).setEnabled(true);
            save.addClickListener(new ModifyListener(row, ModifyListener.SAVE,map));
            cancel.addClickListener(new ModifyListener(row, ModifyListener.CANCEL));
            save.addStyleName(Column.styleUrl);
            cancel.addStyleName(Column.styleUrl);
            table.setWidget(row, 2, changeBox);
            table.setWidget(row, 4, save);
            table.setWidget(row, 5, cancel);
            break;
         case DELETE:
            ConfirmDialog dialog = new ConfirmDialog(getLabel("confirm"),new DeleteListener((Long)map.get(ClassItemMap.ID)));
            dialog.hide();
            dialog.show();
            jumpToTop();
            break;
         case SAVE:
            addClass(((TextBox)table.getWidget(row, 2)).getText(),((Label)table.getWidget(row, 1)).getText(),new Boolean(((CheckBox)table.getWidget(row, 3)).isChecked()),map);
            setDataList(className);
            jumpToTop();
            break;
         case CANCEL:
            Label original = new Label(((TextBox)table.getWidget(row, 2)).getText());
            //Boolean checked = ((CheckBox)table.getWidget(row, 3)).isChecked();
            table.setWidget(row, 2, original);
            Label delete = new Label(getLabel("delete"));
            Label change = new Label(getLabel("change"));
            ((CheckBox)table.getWidget(row, 3)).setEnabled(false);
            change.addClickListener(new ModifyListener(row, ModifyListener.CHANGE));
            delete.addClickListener(new ModifyListener(row, ModifyListener.DELETE,map));
            change.addStyleName(Column.styleUrl);
            delete.addStyleName(Column.styleUrl);
            table.setWidget(row, 4, change);
            table.setWidget(row, 5, delete);
            setDataList(className);
            break;
         }
      }

      public ModifyListener(int row, int type) {
         this.row = row;
         this.type = type;
      }

      public ModifyListener(int row, int type, ClassItemMap map) {
         this.row = row;
         this.type = type;
         this.map = map;
      }
   }

   private class DeleteListener implements ClickListener{
      Long id;
      public DeleteListener(Long id) {
         this.id=id;
      }

      public void onClick(Widget sender) {
         ServiceContext.getInstance().getClassificatorService().delete(id, new AsyncCallback(){
            public void onSuccess(Object result) {
               setInfo(getLabel("deleteSuccess"));
               setDataList(className);
            }
            public void onFailure(Throwable caught) {
               setError(getLabel("deleteFailed"));
            }
         });
      }
   }

   public String getClassificatorDesc() {
      return classificatorDesc;
   }

   public void setClassificatorDesc(String classificatorDesc) {
      this.classificatorDesc = classificatorDesc;
   }

   public Object getConstantsWithLookup() {
      return GWT.create(SubClassKeys.class);
   }

}