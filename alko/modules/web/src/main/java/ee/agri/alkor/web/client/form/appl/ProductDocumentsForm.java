package ee.agri.alkor.web.client.form.appl;

import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.DocumentsForm;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.dto.ProductMap;
/**
 *
 * @author ivar
 *
 */
public class ProductDocumentsForm
	extends DocumentsForm {

	public ProductDocumentsForm(Form returnForm) {
		super("Tootega " +
				"",  returnForm, true);
	}

	protected String getApplicationNr() {
		return null;
	}

	protected String getApplicationId() {
		return null;
	}

	protected String getDocumentType() {
		// TODO Auto-generated method stub
		return null;
	}

	protected Long getProductId() {
		ProductMap product = (ProductMap)getData();
		return (Long)product.get(ProductMap.ID);
	}

	protected void findDocuments(AsyncCallback callBack) {
		if(getProductId() != null)
		ServiceContext.getInstance().getRegistryService().findProductDocuments(
				this.getProductId(), callBack);
	}
	
	protected void findDocumentsPublic(AsyncCallback callBack) {
		if(getProductId() != null)
		ServiceContext.getInstance().getRegistryService().findProductDocumentsPublic(
				this.getProductId(), callBack);
	}
	
	protected void findDocumentsArchived(AsyncCallback callBack) {
		if(getProductId() != null)
		ServiceContext.getInstance().getRegistryService().findProductDocumentsArchived(
				this.getProductId(), callBack);
	}

}
