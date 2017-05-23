/**
 * Please don't redistribute!
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
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.ConfirmDialog;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoPanel;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.FAQMap;
import ee.agri.alkor.web.client.dto.FAQSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.validator.Validators;

/**
 * Korduma kipuvate küsimuste halduse vorm.
 *
 * @author viktorb
 */
public class ManageFAQForm extends Form {

   public static final String MANAGE_FORM = "manageForm";

   private FAQTable faqResultsTable;

   public static String getKey() {
      return "cmManageFAQForm";
   }

   /**
    * Vormi paigutuse loomine.
    */
   public ManageFAQForm() {
      super();
      setData(new FAQMap());
   }

   public Object getConstantsWithLookup() {
      return GWT.create(Messages.class);
   }

   public void init() {
      super.init();

      Label formTitle = new Label(getLabel("faqInputTitle"));
      formTitle.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(5);
      TextArea questionTArea = new TextArea();
      TextArea answerTArea = new TextArea();
      questionTArea.setSize("40em", "3em");
      answerTArea.setSize("40em", "12em");
      form.setText(0, 0, getLabel(FAQMap.QUESTION));
      form.setText(1, 0, getLabel(FAQMap.ANSWER));
      form.setWidget(0, 1, new Image("images/t2rn.gif"));
      form.setWidget(1, 1, new Image("images/t2rn.gif"));
      form.setWidget(0, 2, addFormField(MANAGE_FORM, FAQMap.QUESTION, questionTArea, null, null, Validators.REQUIRED));
      form.setWidget(1, 2, addFormField(MANAGE_FORM, FAQMap.ANSWER, answerTArea, null, null, Validators.REQUIRED));
      UIutils.setTableTextStyled(form);
      form.getFlexCellFormatter().setVerticalAlignment(1, 0, HasVerticalAlignment.ALIGN_TOP);
      form.getFlexCellFormatter().setVerticalAlignment(1, 1, HasVerticalAlignment.ALIGN_TOP);

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
      form.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);

      Label tableTitle = new Label(getLabel("faqTableTitle"));
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
      main.setWidget(5, 0, faqResultsTable = new FAQTable());
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.getFlexCellFormatter().setColSpan(3, 0, 2);
      initWidget(main);
      faqResultsTable.getData();
   }

   private class FAQTable extends ResultTable {

      public FAQTable() {
         super(new FAQSearchFilter());
         addColumn(new Column(getLabel("faqTableQuestion"), FAQMap.QUESTION, Column.styleNormal));
         addColumn(Column.getChangeInstance()); // "muuda"
         addColumn(Column.getDeleteInstance()); // "kustuta"
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
                  setData((FAQMap) row);
                  setFormFieldsFromData(MANAGE_FORM);
               }

            };
         } else if (ResultTable.DELETE.equals(listenerType)) {
            return new ClickListener() {

               public void onClick(Widget sender) {
                  new ConfirmDialog(getLabel("questionDelete"), new DeleteFaqListener(row));
               }

            };
         }
         return null;
      }

   }

   /**
    * Küsimuste kustutamise kuular.
    *
    * @author viktorb
    */
   private class DeleteFaqListener implements ClickListener, AsyncCallback {

      private Object row;

      public DeleteFaqListener(Object row) {
         this.row = row;
      }

      public void onClick(Widget sender) {
         setData((FAQMap) row);
         ServiceContext.getInstance().getRegistryService()
               .deleteFaq((Long) getData().getProperty(FAQMap.ID), this);
      }

      public void onFailure(Throwable caught) {
         setError(caught.toString());
      }

      public void onSuccess(Object result) {
         setInfo(getLabel("questionDeleted"));
         setData(new FAQMap());
         resetFormFields(MANAGE_FORM);
         faqResultsTable.getData();
      }

   }

   /**
    * KKK salvestamise kuular.
    *
    * @author viktorb
    */
   private class SaveListener implements ClickListener, AsyncCallback {

      public void onClick(Widget sender) {
         setDataFromFormFields(MANAGE_FORM);
         FAQMap faq = (FAQMap) cleanDataBeforeSave(getData());
         if (ManageFAQForm.this.getErrors() != null && !ManageFAQForm.this.getErrors().isEmpty()) {
            return;
         }
         ServiceContext.getInstance().getRegistryService().saveOrUpdate(faq, this);
      }

      public void onFailure(Throwable caught) {
         setError(caught.toString());
      }

      public void onSuccess(Object result) {
         setData(new FAQMap());
         ManageFAQForm.this.setInfo(getLabel("questionSaved"));
         resetFormFields(MANAGE_FORM);
         faqResultsTable.getData();
      }

   }

   /**
    * Väljade tühistamise kuular.
    *
    * @author viktorb
    */
   private class ClearFormListener implements ClickListener {

      public void onClick(Widget sender) {
         setData(new FAQMap());
         resetFormFields(MANAGE_FORM);
      }

   }

}
