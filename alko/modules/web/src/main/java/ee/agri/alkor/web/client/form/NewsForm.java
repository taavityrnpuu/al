package ee.agri.alkor.web.client.form;

import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.NewsMap;
import ee.agri.alkor.web.client.dto.NewsSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;

/**
 * Uudiste vorm.
 * 
 * @author martin
 * @author viktorb
 */
public class NewsForm extends Form implements AsyncCallback {

   private VerticalPanel panel;

   public static final String getKey() {
      return "NewsForm";
   }

   public Object getConstantsWithLookup() {
      return GWT.create(Messages.class);
   }

   public void init() {
      Label title = new Label(getLabel("newsFormTitle"));
      title.setStyleName("Title");
      FlexTable main = new FlexTable();
      main.setCellPadding(0);
      main.setCellSpacing(0);
      main.setWidth("100%");
      main.setWidget(0, 0, title);
      main.setWidget(1, 0, panel = new VerticalPanel());
      panel.setStyleName("Form");
      panel.setSpacing(0);
      initWidget(main);
      // Serverilt uudiste küsimine
      ServiceContext.getInstance().getRegistryService().search(new NewsSearchFilter(), this);
   }

   public void onFailure(Throwable caught) {
      Window.alert("NewsTable failure: " + caught);
   }

   public void onSuccess(Object result) {
      if (result != null) {
         SearchFilter searchFilter = (SearchFilter) result;
         Iterator iter = searchFilter.getResultsList().iterator();
         while (iter.hasNext()) {
            NewsMap map = (NewsMap) iter.next();
            String title = map.getText(NewsMap.DATE) + " " + map.getText(NewsMap.TITLE);
            String content = map.getText(NewsMap.CONTENT);
            HTML titelHtml = UIutils.getHTML(title, 75);
            HTML contentHtml = UIutils.getHTML(content, 90);
            titelHtml.setStyleName("SubTitle");
            contentHtml.setStyleName("News");
            panel.add(titelHtml);
            panel.add(UIutils.createSpacer(1, 5));
            panel.add(contentHtml);
            panel.add(UIutils.createSpacer(1, 25));
         }
      }
   }

}