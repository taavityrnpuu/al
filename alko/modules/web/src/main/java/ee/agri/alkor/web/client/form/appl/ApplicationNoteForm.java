/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Taotlusele märkuse lisamise vorm.
 * 
 * @author viktorb
 */
public class ApplicationNoteForm extends Form {

   private static final String FORM = "form";
   private boolean readOnly;

   public ApplicationNoteForm(Form parent) {
      this(parent, false);
   }

   public ApplicationNoteForm(Form parent, boolean readOnly) {
      super();
      this.parent = parent;
      this.readOnly = readOnly;
   }

   /**
    * Taotlusele märkuse lisamise vormi loomine.
    * 
    * @param parent
    *           vanem paneel.
    */
   public ApplicationNoteForm(Form parent, ApplicationMap data) {
      this(parent);
      setData(data);
   }

   @Override
   public void init() {
      super.init();

      Label title = new Label("Märkused");
      title.setStyleName("Title");

      final FlexTable form = new FlexTable();
      form.setStyleName("Form");

      formatOldNotes();
      final HTML html = new HTML((String) getData().getProperty(
            ApplicationMap.NOTES));
      html.setWidth("700px");
      form.setWidget(0, 0, html);


      final TextArea text = new TextArea();
      text.setSize("700px", "100px");

      Widget textArea = addFormField(FORM, ApplicationMap.ADD_NOTE, text);
      if (!readOnly) {
         form.setWidget(1, 0, UIutils.createSpacer(1, 25));
         Label subTitle = new Label("Märkuse lisamine taotlusele");
         subTitle.setStyleName("Label");
         form.setWidget(2, 0, subTitle);
         form.setWidget(3, 0, textArea);
      }

      HorizontalPanel buttons = new HorizontalPanel();

      Button back = new Button("Tagasi", new ReturnFormListener(this, parent) {
         @Override
         public void onReturn() {
         }
      }); // --back

      Button save = new Button("Salvesta", new ClickListener() {
         public void onClick(Widget w) {
        	 
        	 
        	 
            getData().put(
                  ApplicationMap.NOTES,
                  (String) getData().getProperty(ApplicationMap.NOTES)
                  + "<br/><b>"
                  + DateTimeFormat.getFormat("dd.MM.yyyy HH:mm:ss")
                  .format(new Date()) + " "
                  + Form.getUserInfo().getFirstName() + " " + Form.getUserInfo().getLastName() + ":</b><br/>"
                  + text.getText().replace("<", "&lt;").replace("\n", "<br/>") + "<br/>");
            ServiceContext
            .getInstance()
            .getRegistryService()
            .saveOrUpdateApplication(
                  (ApplicationMap) cleanDataBeforeSave((ApplicationMap) getData()),
                  new AsyncCallback() {
                     public void onFailure(Throwable error) {
                        setError(error.toString());
                     }

                     public void onSuccess(Object result) {
                        setData((ApplicationMap) result);
                        html.setHTML((String) getData().getProperty(
                              ApplicationMap.NOTES));
                        text.setText("");

                        if (parent instanceof ApplicationForm) {
                           ((ApplicationForm) parent).updateApplication((ApplicationMap) result);
                        } else if (parent instanceof XTeeForm) {
                           ((XTeeForm) parent).updateApplication((ApplicationMap) result);
                        }

                        setInfo("Salvestamine õnnestus");
                     }
                  });
         }
      }); // --save

      back.setWidth("9em");
      save.setWidth("9em");
      buttons.add(UIutils.createSpacer(
            UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
            UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
      buttons.add(back);
      if (!readOnly && UIutils
            .userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_EIT_GRP })) {
         buttons.add(UIutils.createSpacer(6, 1));
         buttons.add(save);
      }

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(800, 1));
      main.setWidget(2, 0, form);
      main.setWidget(3, 0, buttons);
      FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
      cellFormatter.setHorizontalAlignment(3, 0,
            HasHorizontalAlignment.ALIGN_LEFT);
      cellFormatter.setWidth(1, 1, "100%");
      cellFormatter.setColSpan(0, 0, 2);
      setFormFieldsFromData(FORM);
      initWidget(main);
   }

   /*
    * vanemate märkuste formaatimine (ajast, kui märkusi ei lisatud vaid asendati)
    */
   private void formatOldNotes() {
      if (getData().getProperty(ApplicationMap.NOTES) != null &&
            !((String) getData().getProperty(ApplicationMap.NOTES)).equals("") &&
            !((String) getData().getProperty(ApplicationMap.NOTES)).contains("<br/>")) {
         getData().put(ApplicationMap.NOTES, "<i><b>Varasemad märkused:</b><br/>" +
               (String) getData().getProperty(ApplicationMap.NOTES) + "</i><br/>");
      } else if (getData().getProperty(ApplicationMap.NOTES) == null) {
         getData().put(ApplicationMap.NOTES, ""); // et ei tekiks "null", naturally
      }
   }

}
