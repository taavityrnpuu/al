/**
 *
 */
package ee.agri.alkor.web.client.form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.dto.NewsSearchFilter;
import ee.agri.alkor.web.client.dto.RegistryDocumentMap;
import ee.agri.alkor.web.client.form.cm.PublicDocuments;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Page that contains blank application forms
 *
 * @author kaupo
 *
 */
public class BlanketForm extends Form {

	private final String LOADERROR = "loadError";

	FlexTable table = new FlexTable();

	public static String getKey() {
		return "BlanketForm";
	}

	public Object getConstantsWithLookup() {
		if ("est".equals(ServiceContext.getInstance().getLanguage()))
			return GWT.create(BlanketMessagesEst.class);
		else
			return GWT.create(BlanketMessagesEng.class);
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.web.client.common.Form#init()
     */
	public void init() {
		super.init();
		System.out.println("init");
		Label title = new Label(getLabel("formTitle"));
		title.setStyleName("Title");

		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		table.setStyleName("Form");
		main.setWidget(0, 0, title);
		main.setWidget(1, 0, table);
		createDocumentsTable();
		System.out.println("init2");
		initWidget(main);
	}

	public void createDocumentsTable() {
		String language = ServiceContext.getInstance().getLanguage();
		String langCode = ("est".equals(language) ? "ET" : "EN");

		ee.agri.alkor.web.client.ServiceContext.getInstance()
				.getRegistryService().findPublicDocuments(langCode,
						new AsyncCallback() {
							/*
                             * (non-Javadoc)
                             *
                             * @see com.google.gwt.user.client.rpc.AsyncCallback#onFailure(java.lang.Throwable)
                             */
							public void onFailure(Throwable arg0) {
								setError(getLabel(LOADERROR));
							}

							/*
                             * (non-Javadoc)
                             *
                             * @see com.google.gwt.user.client.rpc.AsyncCallback#onSuccess(java.lang.Object)
                             */
							public void onSuccess(Object arg0) {
								List documents = (List) arg0;
								for (int i = 0; i < documents.size(); i++) {
									Object o = documents.get(i);
									try {
										RegistryDocumentMap doc = (RegistryDocumentMap) o;
										HTML link = new HTML();
										setDocumentLink(link, doc);
										table.setWidget(i, 0, link);
									} catch (Exception e) {
										setError(getLabel(LOADERROR));
									}
								}
							}
						});
	}

	private HTML setDocumentLink(HTML link, RegistryDocumentMap document) {
		 link.setHTML("<font size=4> <a href='" + GWT.getModuleBaseURL()
				+ ServiceConstants.DOC_SERVICE_URL + "?"
				+ ServiceConstants.DOC_ACTION_PARM + "="
				+ ServiceConstants.DOC_ACTION_SAVE + "&"
				+ ServiceConstants.DOCUMENT_ID + "="
				+ document.getProperty(RegistryDocumentMap.ID)
				+ "'>"
				+ createLinkSpecialChars((String)document.getProperty(RegistryDocumentMap.NAME)) + "</a></font>");
		 return link;
	}

	/**
	 * Will change characters such as äöüõÄÖÜÕžŽšŠ& into the appropriate html
	 * @return
	 */
	private String createLinkSpecialChars(String link) {

		StringBuffer result = new StringBuffer();
		for(int i=0; i < link.length(); i++) {
			result.append(findReplacement(Character.toString(link.charAt(i))));
		}
		return result.toString();
	}

	private String findReplacement(String toReplace) {
		if(toReplace == null) {
			return "";
		} else if(toReplace.length() > 1) {
			throw new RuntimeException("String must be of length 1");
		}
		String [][] replace = new String [][] {
				{"ä","ö","ü","õ","ž","š","Ä","Ö","Ü","Õ","Ž","Š","&"},
				{"&#228;","&#246;","&#252;","&#245;","&#382;","&#353;",
					"&Auml;", "&Ouml;", "&Uuml;", "&Otilde;", "&#381;", "&#352;", "&#38;"}
		};
		for(int i=0; i < replace[0].length; i++) {
			if(toReplace.equals(replace[0][i])) {
				return replace[1][i];
			}
		}
		return toReplace;

	}

}
