/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;

/**
 * Registrikande pikandamise vorm.
 *
 * @author viktorb
 */
public class ProductExtendForm extends Form {

   private TextBox dateFrom = new TextBox();
   private TextBox dateTo = new TextBox();
	private CalendarBox newDateTo = new CalendarBox();

   private Form productExtendForm;

   private static final String CHANGE_FORM = "changeForm";

   /**
    * Registrikande pikandamise vormi loomine.
    *
    * @param parent
    *           vanem paneel.
    */
   public ProductExtendForm(Form parent, ProductMap data) {
	   super();
	   this.parent = parent;
	   this.setData(data);
	   productExtendForm = this;
   }

   public Object getConstantsWithLookup() {
	  return GWT.create(ProductsFormKeys.class);
   }

   public void init() {
	   super.init();
      Label title = new Label("Registrikande pikendamine");
      title.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setText(0, 0, getLabel(ProductMap.REGISTRY_ENTRY_VALID_FROM));//"Registrikande alguskuupäev:");
      form.setText(1, 0, getLabel(ProductMap.REGISTRY_ENTRY_VALID_UNTIL));//"Registrikande lõppkuupäev:");
      form.setText(2, 0, getLabel(ProductMap.REGISTRY_ENTRY_EXTENDED_UNTIL));//"Registrikande pikendatud kuupäev:");
      form.setWidget(2, 1, new Image("images/t2rn.gif"));
      form.setWidget(0, 2, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_VALID_FROM, dateFrom));
      form.setWidget(1, 2, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_VALID_UNTIL, dateTo));
      form.setWidget(2, 2, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_NEW_UNTIL, newDateTo));
      UIutils.setTableTextStyled(form);
      dateFrom.setEnabled(false);
      dateFrom.setStyleName("DisabledTextBox");
      dateTo.setEnabled(false);
      dateTo.setStyleName("DisabledTextBox");
      dateFrom.setWidth("100%");
      dateTo.setWidth("100%");

      HorizontalPanel buttons = new HorizontalPanel();
      Button back = UIutils.createButton(new ReturnFormListener(this, parent){
    	  public void onReturn() {
    		  ProductsForm prodForm = (ProductsForm) parent;
    		  prodForm.updateProduct(getData());
    	  }
      }, commonMessages.buttonBack());
      Button save = UIutils.createButton(new ClickListener(){

    	  public void onClick(Widget w) {
    		  setDataFromFormFields(CHANGE_FORM);
    		  getData().setProperty(ProductMap.REGISTRY_ENTRY_VALID_UNTIL, newDateTo.getText());
    		  ServiceContext.getInstance().getRegistryService()
				.saveOrUpdate((RegistryEntryMap)cleanDataBeforeSave((ABaseDTOMap)getData().getProperty(ProductMap.REGISTRY_ENTRY)), new AsyncCallback() {
				    public void onFailure(Throwable caught) {
				    	setError(caught.toString());
				     }

				     public void onSuccess(Object result) {
				    	  getData().setProperty(ProductMap.REGISTRY_ENTRY, result);
	    				  parent.setData(getData());
	    				  setInfo(commonMessages.saveSuccess());
	    				  SimplePanel main = (SimplePanel)productExtendForm.getParent();
	    				  main.clear();
	    				  main.add(parent);
				     }
				});

    	  }

      }, commonMessages.buttonSave());
//      back.setWidth("9em");
//      save.setWidth("9em");
      buttons.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
      buttons.add(back);
      buttons.add(UIutils.createSpacer(6, 1));
      buttons.add(save);

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(800, 1));
      main.setWidget(2, 0, form);
      main.setWidget(3, 0, buttons);
      FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
      cellFormatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
      cellFormatter.setWidth(1, 1, "100%");
      setFormFieldsFromData(CHANGE_FORM);
      if(((ProductMap)getData()).getProperty(ProductMap.REGISTRY_ENTRY) == null) {
    	  save.setEnabled(false);
      }
      initWidget(main);
   }

}
