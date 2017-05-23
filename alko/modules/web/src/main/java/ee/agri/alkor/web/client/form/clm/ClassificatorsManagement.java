package ee.agri.alkor.web.client.form.clm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.LinkedHashMap;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.form.LoginForm;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Klassifikaatorite halduse vorm.
 *
 * @author kristjan
 *
 */
public class ClassificatorsManagement extends Form {

   public static final String getKey() {
      return "ClassificatorsManagement";
   }

   FlexTable resultTable = new FlexTable();
   TextBox code = new TextBox();
   private Form parentForm;

   public ClassificatorsManagement() {
      super();
   }

   public ClassificatorsManagement(Form parentForm) {
      this();
      this.parentForm=parentForm;
   }

   public void init() {
      
      Label title = new Label("Klassifikaatorite haldus");
      title.setStyleName("Title");

      resultTable.setWidth("100%");
      resultTable.setStyleName("Table");
      resultTable.setCellSpacing(1);
      resultTable.setCellPadding(5);
      resultTable.getRowFormatter().setStyleName(0, "Header");
      resultTable.setWidget(0, 0, new Label(""));
      resultTable.setWidget(0, 1, new Label("Kategooria"));

      //FlexTable form = new FlexTable();
      //form.setStyleName("Form");
      //form.setCellSpacing(1);
      //form.setCellPadding(5);
      //form.setWidth("97%");
      //main.setWidget(1, 0, form);
      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.setWidget(1, 0, UIutils.createSpacer(580, 1));
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.setWidget(2, 0, UIutils.createSpacer(1, 20));
      main.setWidget(3, 0, resultTable);
      main.setWidget(4, 0, UIutils.createSpacer(1, 10));

      HorizontalPanel backpanel = new HorizontalPanel();
      backpanel.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH, 
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
//      backpanel.add(UIutils.createSpacer(480, 1));
      if(parentForm!=null){
         Button back = new Button("Tagasi", new ReturnFormListener(this,parentForm){
        	 public void onReturn(){}
         });
         back.setSize("114px", "23px");
         backpanel.add(back);
      }

      main.setWidget(5, 0, backpanel);


      if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_USR_ADM }, false)) { // ainult administraatoritele!
         ServiceContext.getInstance().getClassificatorService().findCategories(code.getText(), new AsyncCallback(){
             public void onSuccess(Object result) {
                setDataList(result);
             }
             public void onFailure(Throwable caught) {
             }
         });
      }

      initWidget(main);
   }

   private void setDataList(Object o){
      while(resultTable.getRowCount()>1){
         resultTable.removeRow(1);
      }
      LinkedHashMap resultList = (LinkedHashMap)o;
      List keys = resultList.keyList();
      //Iterator keyList = resultList.keyList().iterator();
      //int i = 1;

      //helper class
      class Container{
    	  final String key;
    	  final String value;

    	  public Container(String key, String value) {
    		  this.key=key;
    		  this.value=value;
    	  }

    	  public String toString() {
    		  return key + " - " + value;
    	  }
      }

      //Map the data into the container and into a big list
      List datalist = new ArrayList();
      for(int i = 0; i < keys.size(); i++) {
    	  String key = (String)keys.get(i);
    	  String value = (String) resultList.get(keys.get(i));
    	  if (value != null) {
    		  datalist.add(new Container(key, value));
    	  }
      }

      //Custom comparator to compare Container classes
      Comparator comp = new Comparator(){
    	public int compare(Object o1, Object o2) {
    		if(o1 instanceof Container && o2 instanceof Container) {
    			return ((Container)o1).value.compareTo(((Container)o2).value);
    		} else {
    			return 0;
    		}
    	}
      };
      //sort the collection
      Collections.sort(datalist, comp);

      for(int i = 0; i < datalist.size(); i++){
          if ((i % 2) != 0)
             resultTable.getRowFormatter().setStyleName(i, "Odd");
          else
             resultTable.getRowFormatter().setStyleName(i, "Even");
          Object key=((Container)datalist.get(i)).key;
          resultTable.setWidget(i+1, 0, new Label((i+1)+""));
          Label data = new Label(""+resultList.get(key));
          data.addStyleName(Column.styleUrl);
          data.addClickListener(new OpenListener(resultList.get(key).toString(),key.toString()));
          resultTable.setWidget(i+1, 1, data);
       }
   }

   private class OpenListener implements ClickListener {

      private String name;
      private String code;

      public OpenListener(String name, String code) {
         this.name = name;
         this.code = code;
      }

      public void onClick(Widget sender) {
         SubClassificators form = new SubClassificators(name, code, ClassificatorsManagement.this);
         openForm(form);
      }

   }
}