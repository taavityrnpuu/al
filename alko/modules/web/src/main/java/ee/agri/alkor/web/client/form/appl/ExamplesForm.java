/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
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
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.service.ServiceConstants;


/**
 * Tootenäidise registreerimise vorm.
 *
 * @author viktorb
 */
public class ExamplesForm extends Form {

   private CalendarBox inDate = new CalendarBox();
   private CalendarBox outDate = new CalendarBox();
   private CalendarBox destroyDate = new CalendarBox();
   private TextBox examplesNum = new TextBox();

   private static final String FORM = "form";
   /**
    * Tootenäidise registreerimise vormi loomine.
    *
    * @param parent
    *           vanem paneel.
    */
   public ExamplesForm(Form returnForm) {
	   super();
	   this.parent = returnForm;
	   setData(data);
   }

   public void init() {
      Label title = new Label("Tootenäidise registreerimine");
      title.setStyleName("Title");

      inDate.setWidth("8em");
      outDate.setWidth("8em");
      destroyDate.setWidth("8em");

      final FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setText(0, 0, "Tootenäidise vastuvõtmise kuupäev:");
      form.setText(1, 0, "Tootenäidise tagastamise kuupäev:");
      form.setText(2, 0, "Tootenäidise hävitamise kuupäev:");
      form.setText(3, 0, "Säilitatavate näidiste arv:");
      form.setWidget(0, 1, addFormField(FORM, ApplicationMap.PRODUCT_EXAMPLES_RECEPTION_DATE, inDate));
      form.setWidget(1, 1, addFormField(FORM, ApplicationMap.PRODUCT_EXAMPLES_RETURN_DATE, outDate));
      form.setWidget(2, 1, addFormField(FORM, ApplicationMap.PRODUCT_EXAMPLES_DESTROY_DATE, destroyDate));
      form.setWidget(3, 1, addFormField(FORM, ApplicationMap.PRODUCT_EXAMPLES_COUNT, examplesNum));
      UIutils.setTableTextStyled(form);
      examplesNum.setWidth("100%");
      //form.getFlexCellFormatter().setColSpan(2, 1, 2);

      HorizontalPanel buttons = new HorizontalPanel();
      Button back = new Button("Tagasi", new ReturnFormListener(this, parent){
    	  public void onReturn() {
    		  ApplicationForm applForm = (ApplicationForm) parent;
    		  applForm.updateApplication(getData());
    	  }
      });
      Button save = new Button("Salvesta");
      save.addClickListener(new ClickListener() {
    	  public void onClick(Widget w) {
    		  setDataFromFormFields(FORM);
    		  ServiceContext.getInstance().getRegistryService()
    		  .saveOrUpdateApplication((ApplicationMap)cleanDataBeforeSave(getData()), new AsyncCallback() {
    			  public void onFailure(Throwable error) {
    				  setError(error.toString());
    			  }

    			  public void onSuccess(Object result) {
    				  ApplicationForm applForm = (ApplicationForm) parent;
    				  setData((ApplicationMap) result);
    				  applForm.updateApplication((ApplicationMap)result);
    				  SimplePanel main = (SimplePanel)ExamplesForm.this.getParent();
    				  main.clear();
    				  main.add(parent);

    				  setInfo("Salvestamine õnnestus");
    			  }
    		  });

    	  }
      });
      save.setEnabled(UIutils.userHasPriviledge(new String[] {ServiceConstants.ROLE_REG_WRK}));
      back.setWidth("9em");
      save.setWidth("9em");
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
      cellFormatter.setColSpan(0, 0, 2);
      setFormFieldsFromData(FORM);
      initWidget(main);
   }

}
