/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.quer;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.CommonMessages;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.InfoDialog;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.AMSFilter;
import ee.agri.alkor.web.client.dto.RegSearchFilter;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Kehtetuks tunnistatud kanded.
 *
 * @author martin
 * @author viktorb
 */
public class InvalidAlcoForm extends Form implements ClickListener, CacheListener {

   public static final String getKey() {
      return "querInvalidAlcoForm";
   }

   // Otsingu parameetrite sisestus-vorm.
   private static final String SEARCH_FORM = "searchForm";

   private InvalidAlcoTable searchResultsTable;

   /**
    * Vormi loomine.
    */
   public InvalidAlcoForm() {
      super();
      setData(new RegistryEntryMap());
   }

   public Object getConstantsWithLookup() {
      return GWT.create(Messages.class);
   }

   public void init() {
      ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES, this);
      ServiceContext.getInstance().addCacheListener(ServiceContext.PRODUCT_TYPE, this);

      searchResultsTable = new InvalidAlcoTable();

      Label title = new Label(getLabel("formTitleInvalid"));
      title.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(4);
      form.setText(0, 0, getLabel("formProductName"));
      form.setText(1, 0, getLabel("formApplicant"));
      form.setText(2, 0, getLabel("formProducer"));
      form.setText(3, 0, getLabel("formProducerCounty"));
      form.setText(4, 0, getLabel("formOriginCounty"));
      form.setText(5, 0, getLabel("formProductType"));
      form.setText(6, 0, getLabel("formRegistryCode"));
      form.setWidget(0, 1, addFormField(SEARCH_FORM, RegSearchFilter.PRODUCT_NAME, new TextBox(), "30em"));
      form.setWidget(1, 1, addFormField(SEARCH_FORM, RegSearchFilter.APPLICANT_NAME, new TextBox(), "30em"));
      form.setWidget(2, 1, addFormField(SEARCH_FORM, RegSearchFilter.PRODUCER_NAME, new TextBox(), "30em"));
      form.setWidget(3, 1, addFormField(SEARCH_FORM, RegSearchFilter.PRODUCER_COUNTRY, new ListBox(), "30em"));
      form.setWidget(4, 1, addFormField(SEARCH_FORM, RegSearchFilter.ORIGIN_COUNTRY, new ListBox(), "30em"));
      form.setWidget(5, 1, addFormField(SEARCH_FORM, RegSearchFilter.PRODUCT_TYPE, new ListBox(), "30em"));
      form.setWidget(6, 1, addFormField(SEARCH_FORM, RegSearchFilter.REGISTRY_ENTRY_NR, new TextBox(), "30em"));
      form.getCellFormatter().setVisible(3, 0, false);
		form.getCellFormatter().setVisible(3, 1, false);
      UIutils.setTableTextStyled(form);
      

      HorizontalPanel buttons = new HorizontalPanel();
      Button clearBtn = new Button(getLabel("formButtonClear"), this);
      Button searchBtn = new Button(getLabel("formButtonSearch"), this);
      clearBtn.setWidth("8em");
      searchBtn.setWidth("8em");
      buttons.add(clearBtn);
      buttons.add(UIutils.createSpacer(6, 1));
      buttons.add(searchBtn);
      form.setWidget(8, 1, buttons);
      form.getFlexCellFormatter().setHorizontalAlignment(7, 1, HasHorizontalAlignment.ALIGN_LEFT);

      Label tableTitle = new Label(getLabel("formTable"));
      tableTitle.setStyleName("Title");

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(700, 1));
      main.setWidget(2, 0, form);
      main.setWidget(3, 0, tableTitle);
      main.setWidget(4, 0, UIutils.createSpacer(1, 20));
      main.setWidget(5, 0, searchResultsTable);
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setWidth(5, 0, "98%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.getFlexCellFormatter().setColSpan(3, 0, 2);
      fillListBoxes();
      initWidget(main);
   }

   public void avail(String key, Object value) {
      if (value instanceof Throwable) {
         Window.alert(value.toString());
      } else if (key.equals(ServiceContext.COUNTRIES)) {
         makeClassSelectionList(SEARCH_FORM, RegSearchFilter.PRODUCER_COUNTRY, (List) value);
         makeClassSelectionList(SEARCH_FORM, RegSearchFilter.ORIGIN_COUNTRY, (List) value);
      } else if (key.equals(ServiceContext.PRODUCT_TYPE)) {
         makeClassSelectionList(SEARCH_FORM, RegSearchFilter.PRODUCT_TYPE, (List) value);
      }
   }

   public void onClick(Widget sender) {
      String btnText = ((Button) sender).getText();
      if (getLabel("formButtonClear").equals(btnText)) {
         searchResultsTable.getFilter().reset();
         resetFormFields(SEARCH_FORM);
      } else if (getLabel("formButtonSearch").equals(btnText)) {
    	  Map searchParam=getFormFieldValues(SEARCH_FORM);
    	  searchParam.put(RegSearchFilter.REGISTRY_ENTRY_VALID_UNTIL, SearchFilter.LESS_THAN_CURRENT_DATE);
    	  if(!hasErrors())
		  searchResultsTable.getData(searchParam);
      }
   }

   /**
    * Täidab liidese valikuloendid serveri andmetega.
    */
   private void fillListBoxes() {
      List countries = (List) ServiceContext.getInstance().getCached(ServiceContext.COUNTRIES);
      if (countries != null) {
         makeClassSelectionList(SEARCH_FORM, RegSearchFilter.PRODUCER_COUNTRY, countries);
         makeClassSelectionList(SEARCH_FORM, RegSearchFilter.ORIGIN_COUNTRY, countries);
      }
      List productTypes = (List) ServiceContext.getInstance().getCached(ServiceContext.PRODUCT_TYPE);
      if (productTypes != null) {
         makeClassSelectionList(SEARCH_FORM, RegSearchFilter.PRODUCT_TYPE, productTypes);
      }
   }

   /**
    * Otsingu tulemuste tabel.
    *
    * @author viktorb
    */
   private class InvalidAlcoTable extends ResultTable {
      UserInfo uInfo = ServiceContext.getInstance().getUserInfo();

      public InvalidAlcoTable() {
         super(new RegSearchFilter());
         addColumn(new Column(getLabel("registryDate"), RegistryEntryMap.APPLICATION_DECISION_DATE, Column.styleNormal));
         if(uInfo != null && !"anonymousUser".equals(uInfo.getName()) && !UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }))
            addColumn(new Column(getLabel("registryNr"), RegistryEntryMap.NR, Column.styleNormal));
         addColumn(new Column(getLabel("productName"), RegistryEntryMap.PRODUCT_NAME, Column.styleNormal));
         addColumn(new Column(getLabel("producerName"), RegistryEntryMap.PRODUCER_NAME, Column.styleNormal));
         addColumn(new Column(getLabel("applicantName"), RegistryEntryMap.APPLICANT_NAME, Column.styleNormal));
        // addColumn(new Column(getLabel("producerCountry"), RegistryEntryMap.PRODUCER_COUNTRY, Column.styleNormal));
         addColumn(new Column(getLabel("productOrigincounty"), RegistryEntryMap.ORIGIN_COUNTRY, Column.styleNormal));
         addColumn(new Column(getLabel("productType"), RegistryEntryMap.PRODUCT_TYPE, Column.styleNormal));
         addColumn(new Column(getLabel("productVolume"), RegistryEntryMap.PRODUCT_VOLUME, Column.styleNormal));
         addColumn(new Column(getLabel("productGrade"), RegistryEntryMap.PRODUCT_GRADE, Column.styleNormal));
         addColumn(new Column(getLabel("registryUntil"), RegistryEntryMap.VALID_UNTIL, null, Column.styleUrl, "end"));
         addColumn(new Column(getLabel("productNotes"), RegistryEntryMap.PRODUCT_NOTES, Column.styleNormal));
      }

      protected void getData(SearchFilter filter) {
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
    * Reade elementide kuularite generaator.
    *
    * @author viktor
    */
   private class RowListenterFactory implements IRowListenerFactory {

      public RowListenterFactory() {
         super();
      }

      public ClickListener create(String listenerType, final Object row) {
         ClickListener listener = null;
         if ("product".equals(listenerType)) {
            listener = new ClickListener() {

               public void onClick(Widget sender) {
                  setData((RegistryEntryMap) row);
                  Object value = getData().getProperty(RegistryEntryMap.PRODUCT_NOTES);
                  InfoDialog popup = new InfoDialog();
                  popup.setTitleHTML(getLabel("productNotes"));
                  popup.setInfo((String) value);
                  popup.show();
               }

            };
         } else if ("end".equals(listenerType)) {
            listener = new ClickListener() {

               public void onClick(Widget sender) {
                  setData((RegistryEntryMap) row);
                  Object value = getData().getProperty(RegistryEntryMap.CHANGE_REASON);
                  InfoDialog popup = new InfoDialog();
                  popup.setTitleHTML(getLabel("dialogInvalidTitle"));
                  popup.setInfo((String) value);
                  popup.show();
               }

            };
         }
         return listener;
      }

   }



}
