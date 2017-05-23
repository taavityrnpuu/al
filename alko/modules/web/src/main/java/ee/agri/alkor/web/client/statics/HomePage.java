/**
 *
 */
package ee.agri.alkor.web.client.statics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;

/**
 * @author kaupo
 *
 */
public class HomePage extends Form {

	public static final String getKey() {
		return "HomePage";
	}

	public Object getConstantsWithLookup() {
      if ("est".equals(ServiceContext.getInstance().getLanguage()))
         return GWT.create(HomePageMessages.class);
      else
         return GWT.create(HomePageMessagesEng.class);
	}

	/**
	 *
	 */
	public HomePage() {
		super();
	}

	public void init() {
		super.init();
		HTML html = new HTML();
		html.setHTML(getLabel(HomePageMessages.CONTENT));
		initWidget(html);
	}

}
