package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class InfoPanel {

   private static FlexTable msgTable = new FlexTable();
   public static Label loadLabel = new Label("");
   public static boolean hasInfo = false;

   public static final String styleError = "ErrorStyle";
   public static final String styleInfo = "InfoStyle";
   public static final String styleLoading = "InfoStyle";
   
   private static Image errorImage = new Image("images/viga.gif");
   private static Image infoImage = new Image("images/info.gif");
   
   public static void setErrorHtml(String error) {
      msgTable.setVisible(true);
      HTML html = new HTML(error);
      html.setStyleName(styleError);
      int row = msgTable.getRowCount();
      msgTable.getElement().getStyle().setProperty("vertical-align", "top");
      msgTable.setWidget(row, 0, errorImage);
      msgTable.setWidget(row, 1, html);
      hasInfo=true;
   }

   public static void setError(String error) {
      msgTable.setVisible(true);
      Label errorLabel = new Label(error);      
      errorLabel.setStyleName(styleError);
      int row = msgTable.getRowCount();
      msgTable.setWidget(row, 0, errorImage);
      msgTable.setWidget(row, 1, errorLabel);
      hasInfo=true;
   }

   public static void setInfo(String info) {
      msgTable.setVisible(true);
      Label infoLabel = new Label(info);
      infoLabel.setStyleName(styleInfo);
      int row = msgTable.getRowCount();
      msgTable.setWidget(row, 0, infoImage);
      msgTable.setWidget(row, 1, infoLabel);
      hasInfo=true;
   }
   
   public static void setLoadingMessage(String message) {
      loadLabel.setStyleName(styleLoading);
      loadLabel.setText(message);
   }
   
   public static void clear(){
      hasInfo=false;
      msgTable.clear();
      while(msgTable.getRowCount()>0)
         msgTable.removeRow(0);
      msgTable.setVisible(false);
   }
   
   public static FlexTable getLabel(){
      return msgTable;
   }

}