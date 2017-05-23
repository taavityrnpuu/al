/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import java.util.Date;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

/**
 * Kalendriga teksti kast.
 *
 * @author viktorb
 */
public class CalendarBox extends HorizontalPanel implements ClickListener, IResetable {

   private TextBox textBox;

   /**
    * Loob kalendriga tekstikasti.
    */
   public CalendarBox() {
      setSpacing(0);
      Image image = new Image("images/kalender.gif");
      image.addClickListener(this);
      textBox = new TextBox();
      setStyleName("CalendarBox");
      add(textBox);
      add(UIutils.createSpacer(3, 1));
      add(image);
      setCellVerticalAlignment(image, HasVerticalAlignment.ALIGN_MIDDLE);
   }

   public void setWidth(String width) {
      textBox.setWidth(width);
   }

   /**
    * Tagastab kalendri tekstikastis oleva teksti.
    */
   public String getText() {
      return textBox.getText();
   }

   public void clear() {
	   setText("");
   }

   /**
    * Sättib kalendri teksti kasti parameetris oleva teksti.
    *
    * @param text
    *           tekst.
    */
   public void setText(String text) {
      textBox.setText(text);
   }

   public void onClick(Widget sender) {
      int screenWidth = Window.getClientWidth() + UIutils.getScrollOffsetLeft();
      int screenHeigth = Window.getClientHeight() + UIutils.getScrollOffsetTop();
      int x = sender.getAbsoluteLeft();
      int y = sender.getAbsoluteTop();

      CalendarDialog dialog = new CalendarDialog();
      dialog.show();

      int newX = dialog.getOffsetWidth() - sender.getOffsetWidth();
      int newY = dialog.getOffsetHeight() - sender.getOffsetHeight();
      x -= ((screenWidth - dialog.getOffsetWidth()) > x) ? 0 : newX;
      y -= ((screenHeigth - dialog.getOffsetHeight()) > y) ? 0 : newY;

      dialog.setPopupPosition(x, y);
   }

   /**
    * Kalender dialog.
    *
    * @author viktorb
    */
   private class CalendarDialog extends PopupPanel implements ClickListener {

      private Date date;
      private String[] months = new String[] { "Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli",
            "August", "September", "Oktoober", "November", "Detsember" };

      private Label label;
      private Image leftArrow;
      private Image rightArrow;
      private DockPanel main;
      private FlexTable grid;

      /**
       * Loob kalendri dialog akna.
       */
      public CalendarDialog() {
         super(true);
         date = new Date();
         HorizontalPanel navbar = new HorizontalPanel();
         navbar.setStyleName("Navbar");
         navbar.add(leftArrow = new Image("images/kalender_vasakule.gif"));
         navbar.add(label = new Label(months[getMonth(date)] + " " + getYear(date)));
         navbar.add(rightArrow = new Image("images/kalender_paremale.gif"));
         label.setWidth("9.5em");
         leftArrow.addClickListener(this);
         rightArrow.addClickListener(this);
         navbar.setWidth("175px");
         navbar.setCellHorizontalAlignment(label, HasHorizontalAlignment.ALIGN_CENTER);

         main = new DockPanel();
         main.setStyleName("Calendar");
         main.add(navbar, DockPanel.NORTH);
         main.add(grid = createDaysTable(), DockPanel.CENTER);
         setWidget(main);
      }

      public void onClick(Widget sender) {
         if (sender == leftArrow) {
            setMonth(date, getMonth(date) - 1);
         } else if (sender == rightArrow) {
            setNextMonth(date);
         }
         label.setText(months[getMonth(date)] + " " + getYear(date));
         main.remove(grid);
         main.add(grid = createDaysTable(), DockPanel.CENTER);
      }

      /**
       * Loob päevade tabeli.
       */
      private FlexTable createDaysTable() {
         FlexTable table = new FlexTable();
         table.setStyleName("Days");
         table.setCellSpacing(1);
         table.setWidth("100%");
         table.getRowFormatter().setStyleName(0, "Header");
         table.addTableListener(new SelectDateListener());
         String[] weekDays = new String[] { "E", "T", "K", "N", "R", "L", "P" };
         for (int i = 0; i < weekDays.length; i++) {
            table.setText(0, i, weekDays[i]);
         }
         FlexCellFormatter cellFormatter = table.getFlexCellFormatter();
         Date helper = (Date) date.clone();
         setDate(helper, 1);
         int weekDay = (getDay(helper) == 0) ? 6 : getDay(helper) - 1;
         setMonth(helper, getMonth(helper) - 1);
         int day = 1, next = 1, prev = getMonthLength(helper);
         Date now = new Date();
         U: for (int row = 1; row <= 6; row++) {
            for (int col = 0; col < 7; col++) {
               if ((col >= weekDay || row > 1) && day <= getMonthLength(date)) {
                  table.setText(row, col, "" + day++);
                  String style = (col > 4) ? "Weekends" : "Weekdays";
                  cellFormatter.setStyleName(row, col, style);
               } else {
                  String text = "" + (prev - (weekDay - col - 1));
                  text = (day > getMonthLength(date)) ? "" + next++ : text;
                  table.setText(row, col, text);
                  String style = (col > 4) ? "OWeekends" : "OWeekdays";
                  cellFormatter.setStyleName(row, col, style);
               }
               if (getDate(now) == (day - 1) && getYear(now) == getYear(date) && getMonth(now) == getMonth(date)) {
                  cellFormatter.setStyleName(row, col, "Today");
                  if (day > getMonthLength(date)) {
                     day++;
                  }
               }
               if (day > getMonthLength(date) && col == 6) {
                  break U;
               }
            }
         }
         return table;
      }

      /**
       * Tagastab jooksva kuu päevade arvu.
       */
      private int getMonthLength(Date date) {
         switch (getMonth(date)) {
         case 1:
            int year = getYear(date);
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
               return 29; // lisapäev
            else
               return 28;
         case 3:
            return 30;
         case 5:
            return 30;
         case 8:
            return 30;
         case 10:
            return 30;
         default:
            return 31;
         }
      }

      /**
       * Tagastab aasta.
       */
      private int getYear(Date date) {
         return date.getYear() + 1900;
      }

      /**
       * Tagastab kuu.
       */
      private int getMonth(Date date) {
         return date.getMonth();
      }

      /**
       * Tagastab kuu päeva.
       */
      private int getDate(Date date) {
         return date.getDate();
      }

      /**
       * Tagastab nädala päeva.
       */
      private int getDay(Date date) {
         return date.getDay();
      }

      /**
       * Sättib kuu.
       */
      private void setMonth(Date date, int month) {
         date.setMonth(month);
      }

      /**
       * Sättib kuu päeva.
       */
      private void setDate(Date date, int day) {
         date.setDate(day);
      }

      /**
       * Sättib järgmise kuu. (Meetod on vajalik seoses, java.util.Date bugg'ise omadustega)
       *
       * @param date
       *           kuupäev.
       */
      private void setNextMonth(Date date) {
         int mon = date.getMonth();
         date.setMonth(date.getMonth()+1);
         if (date.getMonth() > (mon + 1)) {
            date.setMonth(date.getMonth()-1);
         }
      }

      /**
       * Kuupäeva valimise kuular.
       *
       * @author viktorb
       */
      private class SelectDateListener implements TableListener {

         public void onCellClicked(SourcesTableEvents sender, int row, int col) {
            FlexTable table = (FlexTable) sender;
            String style = table.getFlexCellFormatter().getStyleName(row, col);
            if ("Weekends".equals(style) || "Weekdays".equals(style) || "Today".equals(style)) {
               String dateStr = table.getText(row, col);
               dateStr = (dateStr.length() == 1) ? "0" + dateStr : dateStr;
               String monthStr = "" + (getMonth(date) + 1);
               monthStr = (monthStr.length() == 1) ? "0" + monthStr : monthStr;

               String text = dateStr + "." + monthStr + "." + getYear(date);
               textBox.setText(text);
               CalendarDialog.this.hide();
            }
         }

      }

   }

}