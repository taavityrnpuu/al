/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.cm;


import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.client.common.DocumentsForm;
import ee.agri.alkor.web.client.ServiceContext;

/**
 * Avalike dokumentide halduse vorm.
 *
 * @author kristjan
 */
public class PublicDocuments extends DocumentsForm {

	public static String getKey() { return "PublicDocuments"; }

	public PublicDocuments() {
		super("Blanketid", true);
	}

	protected String getApplicationNr() {
		return null;
	}

	protected String getApplicationId() {
		return null;
	}

	protected String getDocumentType() {
		return ServiceConstants.DOC_TYPE_PUBLIC;
	}

	protected void findDocuments(AsyncCallback callBack) {
		ServiceContext.getInstance().getRegistryService().findPublicDocuments(callBack);
	}
	
	protected void findDocumentsPublic(AsyncCallback callBack) {
		ServiceContext.getInstance().getRegistryService().findPublicDocuments(callBack);
	}
	
	protected void findDocumentsArchived(AsyncCallback callBack) {
		ServiceContext.getInstance().getRegistryService().findPublicDocuments(callBack);
	}

	protected Long getProductId() {
		return null;
	}


}