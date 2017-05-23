package ee.agri.alkor.web.client.form.admin;

import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.AuthLogMap;
import ee.agri.alkor.web.client.dto.LogSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserManageMap;

/**
 * Klassifikaatorite halduse vorm.
 *
 * @author kristjan
 *
 */
public class AuthenticLog extends Form {

   public static final String getKey() {
      return "AuthenticLog";
   }

   AuthentResultTable resultTable;
   private static final String SEARCH_FORM = "searchForm";


   public AuthenticLog() {
      super();
   }

   public void init() {

      Label title = new Label("Autentimise logi");
      title.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(5);
      form.setWidth("97%");
//      form.setText(0, 0, getLabel(LogSearchFilter.START_DATE)+":");
//      form.setText(1, 0, getLabel(LogSearchFilter.END_DATE)+":");
      form.setText(0, 0, getLabel(AuthLogKeys.DATE_BETWEEN) + ":");
      form.setText(1, 0, getLabel(LogSearchFilter.USER_NAME)+":");
      form.getFlexCellFormatter().setStyleName(0, 0, "Label");
      form.getFlexCellFormatter().setStyleName(1, 0, "Label");
//      form.getFlexCellFormatter().setStyleName(2, 0, "Label");
      CalendarBox start = new CalendarBox();
      CalendarBox end = new CalendarBox();
      RangeSelectBox rangeSelect = new RangeSelectBox(RangeSelectBox.CALENDAR,null,null);
      start.setWidth("8.6em");
      end.setWidth("8.6em");
//      form.setWidget(0, 1, addFormField(SEARCH_FORM, LogSearchFilter.START_DATE, new RangeSelectBox(RangeSelectBox.CALENDAR,null,null)));
//      form.setWidget(1, 1, addFormField(SEARCH_FORM, LogSearchFilter.END_DATE, end));
      form.setWidget(0, 1, addFormField(SEARCH_FORM, LogSearchFilter.USER_AUTH_TIME ,rangeSelect));
      form.setWidget(1, 1, addFormField(SEARCH_FORM, LogSearchFilter.USER_NAME, new ListBox()));


      ServiceContext.getInstance().getUserManagerService().findUsers(new AsyncCallback(){
         public void onSuccess(Object result) {
            List map = (List)result;
            ListBox widget = (ListBox)getFormField(SEARCH_FORM, LogSearchFilter.USER_NAME);
            widget.addItem("", "");
            for(int i=0;i<map.size();i++){
               UserManageMap mapUser = (UserManageMap)map.get(i);
               String fullName=mapUser.getText(UserManageMap.FIRST_NAME)+" "+mapUser.getText(UserManageMap.FAMILY_NAME);
               widget.addItem(fullName, fullName);
            }
         }
         public void onFailure(Throwable caught) {
            setError("Kasutajate nimekirja hankimine ebaõnnestus!");

         }
      });

      Button search = new Button("Otsi", new ClickListener(){
            public void onClick(Widget sender) {
               //Map map =
               //map.put(LogSearchFilter.END_DATE, SearchFilter.NOT_LESS_THAN_CURRENT_DATE);
               //map.put(LogSearchFilter.START_DATE, SearchFilter.LESS_THAN_CURRENT_DATE);
               setData(new ABaseDTOMap());
               setDataFromFormFields(SEARCH_FORM);
                  if ((getErrors() != null && !getErrors().isEmpty())) {
                     return;
                  }else{
                	  Map map = getFormFieldValues(SEARCH_FORM);
                	  if(!hasErrors())
                		  resultTable.getData(map);
               }
            }
         });
      search.setSize("114px", "23px");
      form.setWidget(2, 2, search);

      resultTable= new AuthentResultTable(new LogSearchFilter());

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
      main.setWidget(4, 0, resultTable);
      main.setWidget(5, 0, UIutils.createSpacer(1, 10));

      initWidget(main);
   }

      private class AuthentResultTable extends ResultTable{

         public AuthentResultTable(SearchFilter searchFilter) {
            super(searchFilter);
            addColumn(new Column("Kasutaja",AuthLogMap.USER_FULL_NAME,Column.styleNormal));
            addColumn(new Column("Isikukood",AuthLogMap.REGISTRY_CODE,Column.styleNormal));
            addColumn(new Column("Autentimise aeg",AuthLogMap.AUTH_TIME,Column.styleNormal));
            addColumn(new Column("Autentimise tüüp",AuthLogMap.AUTH_TYPE_NAME,Column.styleNormal));
            addColumn(new Column("IP aadress",AuthLogMap.IP,Column.styleNormal));
         }

         protected void getData(SearchFilter filter) {
        	 startSearching();
            ServiceContext.getInstance().getRegistryService().search(filter, this);
         }

         protected IRowListenerFactory getRowListenerFactory() {
            return null;
         }

         protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
            return null;
         }
      }

      public Object getConstantsWithLookup() {
         return GWT.create(AuthLogKeys.class);
      }
}