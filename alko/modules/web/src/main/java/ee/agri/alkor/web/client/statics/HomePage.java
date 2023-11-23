/**
 *
 */
package ee.agri.alkor.web.client.statics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
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
		final HTML html = new HTML();

		html.setHTML(getLabel(HomePageMessages.CONTENT));
		
		ServiceContext.getInstance().getRegistryService().getMainInfoText(new AsyncCallback() {

			public void onFailure(Throwable caught) {
				html.setHTML(getLabel(HomePageMessages.CONTENT));
				initWidget(html);
			}

			public void onSuccess(Object result) {
				String main_info = result.toString();
				
				if(main_info.length() > 0) {
					main_info = main_info.replaceAll("(\r\n|\n)", "<br/>") + "<br/>";
				}
				html.setHTML(main_info + getLabel(HomePageMessages.CONTENT));
			}

		});
		
		initWidget(html);
	}

}
