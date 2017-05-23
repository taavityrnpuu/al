/**
 *
 */
package ee.agri.alkor.web.client.form.cm;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoPanel;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.NewsMap;
import ee.agri.alkor.web.client.dto.NewsSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.validator.Validators;

/**
 * Uudiste halduse vorm.
 *
 * @author kristjan
 * @author viktorb
 */
public class ManageNewsForm extends Form {

   public static final String MANAGE_FORM = "manageForm";

   private NewsTable newsResultsTable;

   public static String getKey() {
      return "cmManageNewsForm";
   }

   /**
    * Vormi paigutuse loomine.
    */
   public ManageNewsForm() {
      super();
      setData(new NewsMap());
   }

   public Object getConstantsWithLookup() {
      return GWT.create(Messages.class);
   }

   public void init() {
      super.init();

      Label formTitle = new Label(getLabel("newsInputTitle"));
      formTitle.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(5);
      TextArea titleTArea = new TextArea();
      TextArea newsTArea = new TextArea();
      titleTArea.setSize("40em", "3em");
      newsTArea.setSize("40em", "12em");
      form.setText(0, 0, getLabel(NewsMap.DATE));
      form.setText(1, 0, getLabel(NewsMap.TITLE));
      form.setText(2, 0, getLabel(NewsMap.CONTENT));
      form.setWidget(0, 1, new Image("images/t2rn.gif"));
      form.setWidget(1, 1, new Image("images/t2rn.gif"));
      form.setWidget(2, 1, new Image("images/t2rn.gif"));
      form.setWidget(0, 2, addFormField(MANAGE_FORM, NewsMap.DATE, new CalendarBox(), "6.5em", null, Validators.REQUIRED));
      form.setWidget(1, 2, addFormField(MANAGE_FORM, NewsMap.TITLE, titleTArea, null, null, Validators.REQUIRED));
      form.setWidget(2, 2, addFormField(MANAGE_FORM, NewsMap.CONTENT, newsTArea, null, null, Validators.REQUIRED));
      UIutils.setTableTextStyled(form);
      form.getFlexCellFormatter().setHorizontalAlignment(0, 2, HasHorizontalAlignment.ALIGN_LEFT);
      form.getFlexCellFormatter().setVerticalAlignment(2, 0, HasVerticalAlignment.ALIGN_TOP);
      form.getFlexCellFormatter().setVerticalAlignment(2, 1, HasVerticalAlignment.ALIGN_TOP);

      HorizontalPanel buttons = new HorizontalPanel();
      Button cancel = new Button(getLabel("cancelButton"), new ClearFormListener());
      Button save = new Button(getLabel("saveButton"), new SaveListener());
      cancel.setWidth("6em");
      save.setWidth("6em");
      buttons.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
      buttons.add(cancel);
      buttons.add(UIutils.createSpacer(6, 1));
      buttons.add(save);
      form.setWidget(3, 0, buttons);
      form.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_RIGHT);

      Label tableTitle = new Label(getLabel("newsTableTitle"));
      tableTitle.setStyleName("Title");

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, formTitle);
      main.setWidget(1, 0, UIutils.createSpacer(700, 1));
      main.setWidget(2, 0, form);
      main.setWidget(3, 0, tableTitle);
      main.setWidget(4, 0, UIutils.createSpacer(1, 20));
      main.setWidget(5, 0, newsResultsTable = new NewsTable());
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.getFlexCellFormatter().setColSpan(3, 0, 2);
      initWidget(main);
      newsResultsTable.getData();
   }

   /**
    * Salvestatud uudiste tabel.
    *
    * @author viktorb
    */
   private class NewsTable extends ResultTable {

      public NewsTable() {
         super(new NewsSearchFilter());
         addColumn(new Column(getLabel("newsDate"), NewsMap.DATE, Column.styleNormal));
         addColumn(new Column(getLabel("newsTitle"), NewsMap.TITLE, Column.styleNormal));
         addColumn(new Column(null, null, "muuda", Column.styleUrl, ResultTable.CHANGE)); // "muuda"
         addColumn(new Column(null, null, "kustuta", Column.styleUrl, ResultTable.DELETE)); // "kustuta"
      }

      protected void getData(SearchFilter filter) {
    	  startSearching();
         ServiceContext.getInstance().getRegistryService().search(filter, this);
      }

      protected IRowListenerFactory getRowListenerFactory() {
         return new RowListenterFactory();
      }

      protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
         return null;
      }

   }

   /**
    * Tabeli ridade kuularite generaator.
    *
    * @author viktorb
    */
   private class RowListenterFactory implements IRowListenerFactory {

      public ClickListener create(final String listenerType, final Object row) {
         if (ResultTable.CHANGE.equals(listenerType)) {
            return new ClickListener() {

               public void onClick(Widget sender) {
                  setData((NewsMap) row);
                  setFormFieldsFromData(MANAGE_FORM);
               }

            };
         } else if (ResultTable.DELETE.equals(listenerType)) {
            return new ClickListener() {

               public void onClick(Widget sender) {
                  new ConfirmDialog(getLabel("newsDelete"), new DeleteNewsListener(row));
               }

            };
         }
         return null;
      }

   }

   /**
    * Uudiste kustutamise kuular.
    *
    * @author viktorb
    */
   private class DeleteNewsListener implements ClickListener, AsyncCallback {

      private Object row;

      public DeleteNewsListener(Object row) {
         this.row = row;
      }

      public void onClick(Widget sender) {
         setData((NewsMap) row);
         ServiceContext.getInstance().getRegistryService().deleteNews((Long) getData().getProperty(NewsMap.ID),
               this);
      }

      public void onFailure(Throwable caught) {
         setError(caught.toString());
      }

      public void onSuccess(Object result) {
         setInfo(getLabel("newsDeleted"));
         setData(new NewsMap());
         resetFormFields(MANAGE_FORM);
         newsResultsTable.getData();
      }

   }

   /**
    * Uudiste salvestamise kuular.
    *
    * @author viktorb
    */
   private class SaveListener implements ClickListener, AsyncCallback {

      public void onClick(Widget sender) {
         setDataFromFormFields(MANAGE_FORM);
         NewsMap news = (NewsMap) cleanDataBeforeSave(getData());
         if (ManageNewsForm.this.getErrors() != null && !ManageNewsForm.this.getErrors().isEmpty()) {
            return;
         }
         ServiceContext.getInstance().getRegistryService().saveOrUpdate(news, this);
      }

      public void onFailure(Throwable caught) {
         setError(caught.toString());
      }

      public void onSuccess(Object result) {
         setData(new NewsMap());
         ManageNewsForm.this.setInfo(getLabel("newsSaved"));
         resetFormFields(MANAGE_FORM);
         newsResultsTable.getData();
      }

   }

   /**
    * Väljade tühistamise kuular.
    *
    * @author viktorb
    */
   private class ClearFormListener implements ClickListener {

      public void onClick(Widget sender) {
         setData(new NewsMap());
         resetFormFields(MANAGE_FORM);
      }

   }

}