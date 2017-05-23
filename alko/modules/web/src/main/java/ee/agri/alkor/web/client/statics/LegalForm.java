package ee.agri.alkor.web.client.statics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;

/**
 * Õigusaktide sirvimine, sisaldab html'i
 *
 * @author martin
 *
 */
public class LegalForm extends Form {

	public static final String getKey() {
		return "LegalForm";
	}

	public LegalForm() {

	}

	public Object getConstantsWithLookup() {
		//if ("est".equals(ServiceContext.getInstance().getLanguage()))
			return GWT.create(LegalFormMessages.class);
		//else return null;
	}

	public void init() {
		super.init();
		HTML html = new HTML();
		html.setHTML(getLabel(LegalFormMessages.CONTENT));
		initWidget(html);
	}

}