package ee.agri.alkor.web.client.form.admin;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;

/**
 * Rollide halduse vorm.
 * 
 * @author martin
 * 
 */

public class PrivilegesForm extends Form {

   private Form parentForm;
   private String code;
   private String name;

   public PrivilegesForm(String code, String name, Form parentForm) {
      super();
      this.parentForm = parentForm;
      this.code = code;
      this.name = name;
   }

   public void init() {
      Label title = new Label("Rolli privileegid");
      title.setStyleName("Title");

      Label role = new Label("Roll:" + name);
      HorizontalPanel backpanel = new HorizontalPanel();
      backpanel.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH, 
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
//      backpanel.add(UIutils.createSpacer(480, 1));
      Button back = new Button("Tagasi", new ReturnFormListener(this, parentForm){
    	  public void onReturn(){}
      });
      back.setSize("114px", "23px");
      backpanel.add(back);

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(580, 1));
      main.getFlexCellFormatter().setWidth(1, 1, "100%");
      main.getFlexCellFormatter().setColSpan(0, 0, 2);
      main.setWidget(2, 0, role);
      main.setWidget(3, 0, backpanel);
      main.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
      initWidget(main);
   }

}
