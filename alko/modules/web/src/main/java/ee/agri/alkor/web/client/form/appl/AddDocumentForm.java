/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.UIutils;


/**
 * Taotlusega/tootega seotud dokummentide vorm.
 * 
 * @author viktorb
 */
public class AddDocumentForm extends Form {
   
   private FlexTable table = new FlexTable();

   private GetDocuments getDocuments = new GetDocuments();
   
   /**
    * Taotlusega/tootega seotud dokummentide vormi loomine.
    * 
    * @param parent
    *          vanem paneel.
    */
   public AddDocumentForm(Form parent) {
	   super();
	   this.parent = parent;
   }
   
   public void init() {
      Label title = new Label("Dokumendi lisamine taotlusele");
      title.setStyleName("Title");

      FlexTable form = new FlexTable();
      form.setStyleName("Form");
      form.setCellSpacing(1);
      form.setCellPadding(5);
      form.setText(0, 0, "Dokumendi lisamine:");
      form.setText(1, 0, "Dokumendi nimetus:");
      form.setWidget(0, 1, new Image("images/t2rn.gif"));
      form.setWidget(1, 1, new Image("images/t2rn.gif"));
      form.setWidget(0, 2, new FileUpload());
      form.setWidget(1, 2, new TextBox());
      form.setWidget(1, 3, new Button("Lisa dokument"));
      FlexCellFormatter cellFormatter = form.getFlexCellFormatter();
      cellFormatter.setStyleName(0, 0, "Label");
      cellFormatter.setStyleName(1, 0, "Label");
      form.getFlexCellFormatter().setColSpan(0, 2, 2);
      cellFormatter.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
      cellFormatter.setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
      
      Label results = new Label("Taotlusega seotud dokumendid");
      results.setStyleName("Title");

      table.setWidth("100%");
      table.setStyleName("Table");
      table.setCellSpacing(1);
      table.setCellPadding(5);
      table.getRowFormatter().setStyleName(0, "Header");
      table.setText(0, 0, "");
      table.setText(0, 1, "Nimetus");
      table.setText(0, 2, "Sisestatud");
      table.setText(0, 3, "");
      
      OFButton backButton = new OFButton("Tagasi", parent);
      backButton.setWidth("9em");
      
      HorizontalPanel buttons = new HorizontalPanel();
      buttons.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH, 
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
      buttons.add(backButton);

      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, UIutils.createSpacer(800, 1));
      main.setWidget(2, 0, form);
      main.setWidget(3, 0, table);
      main.setWidget(4, 0, UIutils.createSpacer(1, 20));
      main.setWidget(5, 0, buttons);
      cellFormatter = main.getFlexCellFormatter();
      cellFormatter.setWidth(1, 1, "100%");
      cellFormatter.setColSpan(0, 0, 2);
      cellFormatter.setHorizontalAlignment(5, 0, HasHorizontalAlignment.ALIGN_LEFT);
      initWidget(main);
      getDocuments.invoke();
   }
   
   /**
    * Serverilt dokumentide nimekirja küsimine.
    * 
    * @author kristjan
    */
   private class GetDocuments {

      public void invoke() {
         while (table.getRowCount() > 1) {
            table.removeRow(1);
         }

         table.getRowFormatter().setStyleName(1, "Odd");
         Label name = new Label("Etiketi näidis");
         name.setStyleName("Link");
         Label delete = new Label("kustuta");
         delete.setStyleName("Link");
         table.setText(1, 0, "1.");
         table.setWidget(1, 1, name);
         table.setText(1, 2, "12.12.2006");
         table.setWidget(1, 3, delete);
         table.getRowFormatter().setStyleName(2, "Even");
         name = new Label("Tollideklaratsioon");
         name.setStyleName("Link");
         delete = new Label("kustuta");
         delete.setStyleName("Link");
         table.setText(2, 0, "2.");
         table.setWidget(2, 1, name);
         table.setText(2, 2, "11.12.2006");
         table.setWidget(2, 3, delete);
         table.getRowFormatter().setStyleName(3, "Odd");
         name = new Label("Volitatud laborikatseprotokoll");
         name.setStyleName("Link");
         delete = new Label("kustuta");
         delete.setStyleName("Link");
         table.setText(3, 0, "3.");
         table.setWidget(3, 1, name);
         table.setText(3, 2, "12.12.2006");
         table.setWidget(3, 3, delete);
         table.getRowFormatter().setStyleName(4, "Even");
         name = new Label("Saateleht");
         name.setStyleName("Link");
         delete = new Label("kustuta");
         delete.setStyleName("Link");
         table.setText(4, 0, "4.");
         table.setWidget(4, 1, name);
         table.setText(4, 2, "10.12.2006");
         table.setWidget(4, 3, delete);
      }

   }

}
