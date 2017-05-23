package ee.agri.alkor.web.client.common;

import java.util.Iterator;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.dto.UserInfo;

/**
 * UI utils methods.
 *
 * @author viktorb
 * @author ivar
 *
 */
public class UIutils {

   public static final int SPACER_BEFORE_BUTTON_PANEL_WIDTH = 10;
   public static final int SPACER_BEFORE_BUTTON_PANEL_HEIGHT = 20;

   public static Widget createSpacer(int width, int height) {
      Image spacer = new Image("images/spacer.gif");
      spacer.setSize(width + "px", height + "px");
      return spacer;
   }

   /**
    * Loob nuppu tekstiga "...".
    *
    * @param listener -
    *           nuppu kuular.
    */
   public static Button createButton(ClickListener listener) {
      if (listener == null) {
         listener = new ClickListener() {

            public void onClick(Widget w) {

            }
         };
      }
      OFButton button = new OFButton("...", listener);
      button.setStyleName("SelectButton");
      button.setSize("1.46em", "1.46em");
      return button;
   }

   public static Button createButton(ClickListener listener, String label) {
      Button button = new OFButton(label, listener);
      button.setWidth("9em");
      return button;
   }

   /**
    * Loob vormi avamise nuppu tekstiga "...".
    *
    * @param form -
    *           avatav vorm.
    */
   public static Button createOFButton(Form form) {
      OFButton button = new OFButton("...", form);
      button.setStyleName("SelectButton");
      button.setSize("1.46em", "1.46em");
      return button;
   }

   /**
    * Sättib stiili ja vasaku horisontaalse asendi tabeli tekstitele.
    *
    * @param table
    *           tabel.
    */
   public static void setTableTextStyled(FlexTable table) {
      for (int row = 0; row < table.getRowCount(); row++) {
         for (int col = 0; col < table.getCellCount(row); col++) {
            try {
               table.getText(row, col); // Kui lahtris pole tekst, siis viisatakse viga
               table.getFlexCellFormatter().setStyleName(row, col, "Label");
               table.getFlexCellFormatter().setHorizontalAlignment(row, col, HasHorizontalAlignment.ALIGN_RIGHT);
            } catch (IndexOutOfBoundsException ex) {
               // Kui lahtris pole teksti element, siis stiili ei rakendata
            }
         }
      }
   }

   /**
    * Deaktiveerib tekstikastid parameetris antud tabelis.
    *
    * @param table
    *           tabel.
    * @param enable
    *           tõeväärtus, kas tekstikastid aktiveeritakse või deaktiveeritakse.
    */
   public static void setTextBoxesEnabled(FlexTable table, boolean enable) {
      for (int row = 0; row < table.getRowCount(); row++) {
         for (int col = 0; col < table.getCellCount(row); col++) {
            try {
               Widget widget = table.getWidget(row, col); // Kui lahtris pole Widget, siis viisatakse viga
               if (widget instanceof TextBox) {
                  if (enable) {
                     ((TextBox) widget).removeStyleName("DisabledTextBox");
                  } else {
                     ((TextBox) widget).setStyleName("DisabledTextBox");
                  }
                  ((TextBox) widget).setEnabled(enable);
               }
            } catch (IndexOutOfBoundsException ex) {
               // Kui lahtris pole tekstikasti element, siis stiili ei rakendata
            }
         }
      }
   }

   /**
    * Aktiveerib/deaktiveerib tekstikastid, valikulistid ja märknuppud parameetrites antud
    * tabelis.
    *
    * @param table -
    *           tabel.
    * @param enabled -
    *           tõeväärtus, kas tekstikastid aktiveeritakse või deaktiveeritakse.
    */
   public static void setElementsEnabled(FlexTable table, boolean enabled) {
      for (int row = 0; row < table.getRowCount(); row++) {
         for (int col = 0; col < table.getCellCount(row); col++) {
            try {
               Widget widget = table.getWidget(row, col); // Kui lahtris pole Widget, siis viisatakse viga
               if (widget instanceof FocusWidget) {
                  ((FocusWidget) widget).setEnabled(enabled);
               } else if (widget instanceof TextListBox) {
                  ((TextListBox) widget).setEnabled(enabled);
               } else if (widget instanceof RadioButtonList) {
                  ((RadioButtonList) widget).setEnabled(enabled);
               }
            } catch (IndexOutOfBoundsException ex) {
               // Kui lahtris pole tekstikasti element, siis stiili ei rakendata
            }
         }
      }
   }

   /**
    * Tagastab pikslite arvu, mille peale peaakna horisontaalne "scrollbar" oli nihutatud.
    */
   public static native int getScrollOffsetLeft() /*-{
    var ret = 0;
    if ($wnd.pageXOffset) {
    ret = $wnd.pageXOffset;
    } else if ($doc.documentElement && $doc.documentElement.scrollLeft) {
    ret = $doc.documentElement.scrollLeft;
    } else if ($doc.body) {
    ret = $doc.body.scrollLeft;
    }
    return ret;

    }-*/;

   /**
    * Tagastab pikslite arvu, mille peale peaakna vertikaalne "scrollbar" oli nihutatud.
    */
   public static native int getScrollOffsetTop() /*-{
    var ret = 0;
    if ($wnd.pageYOffset) {
    ret = $wnd.pageYOffset;
    } else if ($doc.documentElement && $doc.documentElement.scrollTop) {
    ret = $doc.documentElement.scrollTop;
    } else if ($doc.body) {
    ret = $doc.body.scrollTop;
    }
    return ret;

    }-*/;

   /**
    * Määrab andmete laadimise info-teade nähtavust.
    *
    * @param visible
    *           nähtavuse määraja.
    */
   public static void setLoadMessageVisible(boolean visible) {
      boolean isEstLang = "est".equals(ServiceContext.getInstance().getLanguage());
      String msg = (isEstLang) ? "Andmeid laetakse..." : "Loading data...";
      String message = (visible) ? msg : "";
      InfoPanel.setLoadingMessage(message);
   }

   /**
    * Tagastab readeks jägatud HTML teksti.
    *
    * @param text -
    *           html'i tekst.
    * @param maxCharactersPerLine -
    *           maksimaalne sümbolite arv real.
    */
   public static HTML getHTML(String text, int maxCharactersPerLine) {
      StringBuffer buffer = new StringBuffer();
      for (int i = 0; i <= text.length();) {
         int inc = maxCharactersPerLine;
         int step = ((i + inc) < text.length()) ? (i + inc) : text.length();
         String sub = text.substring(i, step);
         int index = sub.lastIndexOf("\n");
         if (index > -1) {
            buffer.append(sub.substring(0, index) + "\n");
            i += (index + "\n".length());
            continue;
         }
         while (step < text.length() && text.charAt(step) != ' ') {
            step++;
            inc++;
         }
         if (step < text.length()) {
            step++;
            inc++;
            buffer.append(text.substring(i, step) + "\n");
         } else {
            buffer.append(text.substring(i, step));
         }
         i += inc;
      }
      return new HTML("<pre>" + buffer.toString() + "</pre>");
   }

   /**
    * Kontrollib kasutaja õigusi.
    *
    * @param roles -
    *           rollid privileegidena.
    */
   public static boolean userHasPriviledge(String[] roles) {
      return userHasPriviledge(roles, true);
   }
   
   public static boolean userHasPriviledge(String[] roles, boolean noRolesReturns) {
      //Kui rollid pole määratud, siis see on avalik kõigile.
      if (roles == null)
         return noRolesReturns;

      UserInfo userInfo = Form.getUserInfo();
      if (userInfo == null)
         return false;
      if (userInfo.getRoles() == null)
         return false;
      Iterator iter = userInfo.getRoles().iterator();
      while (iter.hasNext()) {
         String role = (String) iter.next();
         for (int j = 0; j < roles.length; j++) {
            if (role.equals(roles[j])) {
               return true;
            }
         }
      }
      return false;
   }

}
