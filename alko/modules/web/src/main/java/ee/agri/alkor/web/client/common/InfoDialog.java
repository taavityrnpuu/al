/**
 * Please don't redistribute.
 */
package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PopupPanel;

/**
 * Info dialogi aken.
 * 
 * @author viktorb
 */
public class InfoDialog extends PopupPanel {

   private HTML titleHtml = new HTML();
   private HTML infoHtml = new HTML();

   /**
    * Info dialogi loomine.
    */
   public InfoDialog() {
      this(null, null);
   }

   /**
    * Info dialogi loomine.
    * 
    * @param title -
    *            info pealkiri.
    */
   public InfoDialog(String title) {
      this(title, null);
   }

   /**
    * Info dialogi loomine.
    * 
    * @param title -
    *            info pealkiri.
    * @param info -
    *            info.
    */
   public InfoDialog(String title, String info) {
      super(true);
      if (title != null) {
         setTitle(title);
      }
      if (info != null) {
         setInfo(info);
      }
      init();
   }

   /**
    * Sättib info pealkirja.
    * 
    * @param title -
    *            pealkiri.
    */
   public void setTitleHTML(String title) {
      titleHtml.setHTML("<pre>" + "> " + title + "</pre>");
   }

   /**
    * Sättib infot.
    * 
    * @param info -
    *            info.
    */
   public void setInfo(String info) {
      infoHtml.setText(info);
   }

   /**
    * Sätib info HTML-kujul.
    * 
    * @param info
    */
   public void setInfoHTML(String html) {
      infoHtml.setHTML(html);
   }

   /**
    * Info dialogi initsialiseerimine.
    */
   private void init() {
      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(10);
      main.setWidget(0, 0, titleHtml);
      main.setWidget(1, 0, infoHtml);
      main.setWidth("19em");
      setWidget(main);
      setStyleName("Dialog");
      titleHtml.setStyleName("DialogTitle");
      show();
      int screenWidth = Window.getClientWidth();
      int screenHeigth = Window.getClientHeight();
      int x = screenWidth / 2 + UIutils.getScrollOffsetLeft() - this.getOffsetWidth() / 2;
      int y = screenHeigth / 2 + UIutils.getScrollOffsetTop() - this.getOffsetHeight() / 2;
      hide();
      setPopupPosition(x, y);
   }

}
