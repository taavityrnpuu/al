/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
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

/**
 * Registrikande kehtetuks muutmise vorm.
 *
 * @author viktorb
 */
public class ProductInvalidationForm extends Form {

	private TextBox dateFrom = new TextBox();
	private TextBox dateTo = new TextBox();
	private CalendarBox newDateTo = new CalendarBox();

   private TextArea text = new TextArea();

   private Form invalidationForm;

   private static final String CHANGE_FORM = "changeForm";

   /**
    * Registrikande kehtetuks muutmise vormi loomine.
    *
    * @param parent
    *           vanem paneel.
    */
   public ProductInvalidationForm(Form returnForm, ProductMap data) {
	   super();
	   this.parent = returnForm;
	   this.setData(data);
	   invalidationForm = this;
   }

   public Object getConstantsWithLookup() {
	  return GWT.create(ProductsFormKeys.class);
   }

   public static final String getKey() {
	  return "ProductsForm";
   }

   public void init() {
      Label title = new Label("Registrikande kehtetuks muutmine");
      title.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setText(0, 0, getLabel(ProductMap.REGISTRY_ENTRY_VALID_FROM));//"Registrikande alguskuupäev:");
      form.setText(1, 0, getLabel(ProductMap.REGISTRY_ENTRY_VALID_UNTIL));//"Registrikande lõppkuupäev:");
      form.setText(2, 0, getLabel(ProductMap.REGISTRY_ENTRY_NEW_UNTIL));//"Registrikande kehtetuks muutmise kuupäev:");
      form.setWidget(2, 1, new Image("images/t2rn.gif"));
      form.setWidget(0, 2, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_VALID_FROM, dateFrom));
      form.setWidget(1, 2, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_VALID_UNTIL, dateTo));
      form.setWidget(2, 2, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_NEW_UNTIL, newDateTo));
      UIutils.setTableTextStyled(form);
      dateFrom.setEnabled(false);
      dateFrom.setStyleName("DisabledTextBox");
      dateFrom.setWidth("100%");
      dateTo.setEnabled(false);
      dateTo.setStyleName("DisabledTextBox");
      dateTo.setWidth("100%");

      FlexTable textForm = new FlexTable();
      textForm.setStyleName("Form");
      textForm.setWidth("100%");
      textForm.setText(0, 0, getLabel(ProductMap.REGISTRY_ENTRY_CHANGE_REASON));//"Väljakandmise alus:");
      form.setWidget(0, 1, new Image("images/t2rn.gif"));
      textForm.setWidget(1, 0, addFormField(CHANGE_FORM, ProductMap.REGISTRY_ENTRY_CHANGE_REASON, text,"100%",null,"required"));
      textForm.getFlexCellFormatter().setStyleName(0, 0, "Label");
      
      text.setSize("700px", "125px");
      text.setCharacterWidth(85);

      HorizontalPanel buttons = new HorizontalPanel();
      Button back = UIutils.createButton(new ReturnFormListener(this, parent) {
    	  public void onReturn() {
    		  ProductsForm prodForm = (ProductsForm) parent;
    		  prodForm.updateProduct(getData());
    	  }
      }, commonMessages.buttonBack());
      Button save = UIutils.createButton(new ClickListener(){

    	  public void onClick(Widget w) {
    		  try {
    			  
    			  //parse date
	    		  Date newDateTODateValue = new Date();
	    		  newDateTODateValue.setYear(Integer.parseInt(newDateTo.getText().substring(6)) - 1900);
	    		  newDateTODateValue.setMonth(Integer.parseInt(newDateTo.getText().substring(3, 5)) - 1);
	    		  newDateTODateValue.setDate(Integer.parseInt(newDateTo.getText().substring(0, 2)));
	    		  newDateTODateValue.setHours(0);
	    		  newDateTODateValue.setMinutes(0);
	    		  newDateTODateValue.setSeconds(0);
					
	    		  Date now = new Date(System.currentTimeMillis());
					
					if(newDateTODateValue.compareTo(now) > 0){
						setError("Registrikande kehtetuks muutmise kuupäev ei saa olla hilisem tänasest kuupäevast!");
						UIutils.setLoadMessageVisible(false);
						return;
					}
					setDataFromFormFields(CHANGE_FORM);	
					
	    		  getData().setProperty(ProductMap.REGISTRY_ENTRY_VALID_UNTIL, newDateTo.getText());
				
			} catch (Exception e) {
				setError("Viga:"+e.getMessage());
				UIutils.setLoadMessageVisible(false);
				return;
			}
				if (ProductInvalidationForm.this.getErrors() != null
						&& !ProductInvalidationForm.this.getErrors().isEmpty()) {
					for (int i = 0; i < getErrors().size(); i++) {
						ProductInvalidationForm.this.setError((String) getErrors().get(i));
					}
				}else{
					ServiceContext.getInstance().getRegistryService()
						.excludeProductFromregistry((ProductMap)cleanDataBeforeSave((ABaseDTOMap)getData()), new AsyncCallback() {
						    public void onFailure(Throwable caught) {
						    	setError(caught.toString());
						    	UIutils.setLoadMessageVisible(false);
						     }
		
						     public void onSuccess(Object result) {
						    	
					    	  getData().setProperty(ProductMap.REGISTRY_ENTRY, ((ProductMap)result).getProperty(ProductMap.REGISTRY_ENTRY));
					    	  getData().setProperty(ProductMap.APPLICATION, ((ProductMap)result).getProperty(ProductMap.APPLICATION));
					    	  
					    	  parent.setData((ProductMap)getData());
		    				  setInfo(commonMessages.saveSuccess());
		    				  SimplePanel main = (SimplePanel)invalidationForm.getParent();
		    				  main.clear();
		    				  main.add(parent);
						     }
						});
				}

    	  }

      }, commonMessages.buttonSave());//"Salvesta");
      //back.setWidth("9em");
      //save.setWidth("9em");
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
      main.setWidget(1, 0, form);
      main.setWidget(2, 0, textForm);
      main.setWidget(3, 0, buttons);
      FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
      cellFormatter.setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
      cellFormatter.setWidth(1, 1, "100%");
      initWidget(main);
      if(((ProductMap)getData()).getProperty(ProductMap.REGISTRY_ENTRY) == null) {
    	  save.setEnabled(false);
      }
      setFormFieldsFromData(CHANGE_FORM);
   }

}
