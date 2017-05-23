/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

/**
 * Toimingu kinnitamise dialog. Kasutamise põhimõtte:
 * tehakse uus dialogi aken ja antakse kuulari kaasa,
 * kuular määrab toimingu, mis toimub
 * kinnitamise puhul. (Selline klassi käitumine on tingitud
 * GWT asünkroonse töö printsiibiga).
 *
 * @author viktorb
 */
public class ConfirmDialog extends PopupPanel implements ClickListener {

   private Button confirm = new Button("Jah", this);
   private Button cancel = new Button("Ei", this);
   private Label messageLbl = new Label();

   /**
    * Toimingu kinnitamise dialogi loomine.
    */
   public ConfirmDialog() {
      this(null, null);
   }

   /**
    * Toimingu kinnitamise dialogi loomine.
    *
    * @param message
    *           dialogi teade.
    */
   public ConfirmDialog(String message) {
      this(message, null);
   }

   /**
    * Toimingu kinnitamise dialogi loomine.
    *
    * @param listener
    *           dialogi nuppude kuular.
    */
   public ConfirmDialog(ClickListener listener) {
      this(null, listener);
   }

   /**
    * Toimingu kinnitamise dialogi loomine.
    *
    * @param message
    *           dialogi teade.
    * @param listener
    *           dialogi nuppude kuular.
    */
   public ConfirmDialog(String message, ClickListener listener) {
      if (message != null) {
         setMessage(message);
      }
      if (listener != null) {
         addActionListener(listener);
      }
      this.setModal(true);
      this.setGlassEnabled(true);
      this.setGlassStyleName("popBackground");
      this.center();
      init();
   }

   /**
    * Sättib dialogi teade.
    *
    * @param message
    *           dialogi teade.
    */
   public void setMessage(String message) {
      messageLbl.setText(message);
   }

   /**
    * Lisab dialog akna kinnitamise nuppule vajutamis kuulari.
    *
    * @param listener
    *           kuular.
    */
   public void addActionListener(ClickListener listener) {
      confirm.addClickListener(listener);
   }

   /**
    * Tagastab kinnitamise tõestava nuppu.
    */
   public Button getOkButton() {
      return confirm;
   }

   /**
    * Tagastab kinnitamisest loobuva nuppu.
    */
   public Button getCancelButton() {
      return cancel;
   }

   public void onClick(Widget sender) {
      hide();
   }

	/**
    * Kinnitamise dialogi initsialiseerimine.
    */
   private void init() {
      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(10);
      confirm.setWidth("3em");
      cancel.setWidth("3em");
      main.setWidget(0, 0, messageLbl);
      main.setWidget(1, 0, confirm);
      main.setWidget(1, 1, cancel);
      FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
      cellFormatter.setColSpan(0, 0, 2);
      cellFormatter.setWidth(1, 0, "50%");
      cellFormatter.setWidth(1, 1, "50%");
      cellFormatter.setWordWrap(0, 0, true);
      cellFormatter.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
      cellFormatter.setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
      cellFormatter.setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_LEFT);
      main.setSize("19em", "6.5em");
      setWidget(main);
      setStyleName("Dialog");
      show();
      int screenWidth = Window.getClientWidth();
      int screenHeigth = Window.getClientHeight();
      int x = screenWidth / 2 + UIutils.getScrollOffsetLeft() - this.getOffsetWidth() / 2;
      int y = screenHeigth / 2 + UIutils.getScrollOffsetTop() - this.getOffsetHeight() / 2;
      hide();
      setPopupPosition(x, y);
      show();
   }

}
