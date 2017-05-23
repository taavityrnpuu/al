/**
 * Please don't redistribute!
 */
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
import ee.agri.alkor.web.client.dto.FAQMap;
import ee.agri.alkor.web.client.dto.FAQSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;


/**
 * Korduma kipuvate küsimuste vorm.
 *
 * @author viktorb
 */
public class FAQForm extends Form implements AsyncCallback {

   private VerticalPanel panel;

   public static final String getKey() {
      return "FAQForm";
   }

   public Object getConstantsWithLookup() {
      return GWT.create(Messages.class);
   }

   public void init() {
      Label title = new Label(getLabel("faqFormTitle"));
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
      // Serverilt kkk küsimine
      FAQSearchFilter filter= new FAQSearchFilter();
      filter.addSortItem(FAQSearchFilter.CREATED, FAQSearchFilter.DESCENDING);
      ServiceContext.getInstance().getRegistryService().search(filter, this);
   }

   public void onFailure(Throwable caught) {
      Window.alert("FAQTable failure: " + caught);
   }

   public void onSuccess(Object result) {
      if (result != null) {
         SearchFilter searchFilter = (SearchFilter) result;
         Iterator iter = searchFilter.getResultsList().iterator();
         while (iter.hasNext()) {
            FAQMap map = (FAQMap) iter.next();
            String question = map.getText(FAQMap.QUESTION);
            String answer = map.getText(FAQMap.ANSWER);
            HTML questionHtml = UIutils.getHTML(question, 75);
            HTML answerHtml = UIutils.getHTML(answer, 90);
            questionHtml.setStyleName("SubTitle");
            answerHtml.setStyleName("News");
            panel.add(questionHtml);
            panel.add(UIutils.createSpacer(1, 5));
            panel.add(answerHtml);
            panel.add(UIutils.createSpacer(1, 25));
         }
      }
   }

}
