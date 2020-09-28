/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.common;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import ee.agri.alkor.web.client.dto.ApplicationMap;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.RegistryDocumentMap;
import ee.agri.alkor.web.client.form.cm.PublicDocuments;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
import ee.agri.alkor.web.client.form.xtee.XTeeForm.FormState;
import ee.agri.alkor.web.client.form.xtee.XTeeForm.FormButtonState;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Dokumentide haldamise baasvorm.
 * 
 * @author kristjan
 * @author ivar
 */
public abstract class DocumentsForm extends Form {
	private final boolean showOnlyPublic;
	/**
	 * Title of the form.
	 */
	private final String title;
	
	private final boolean isReadOnly;
	/**
	 * Does form contains document language selection listbox.
	 */
	private final boolean isLangSelect;
	
	private ListBox langSelectList;
	
	public DocumentsForm() {
		this(null, null, false, false);
	}
	
	public DocumentsForm(String title) {
		this(title, null, false, false);
	}
	
	public DocumentsForm(String title, boolean langSelect) {
		this(title, null, false, langSelect);
	}
	
	public DocumentsForm(String title, Form returnForm) {
		this(title, returnForm, false, false);
	}
	
	public DocumentsForm(String title, Form returnForm, boolean readOnly) {
		this(title, returnForm, readOnly, false);
	}
	
	public DocumentsForm(String title, Form returnForm, boolean readOnly, boolean langSelect) {
		super();
		this.title = title;
		this.parent = returnForm;
		this.isReadOnly = readOnly;
		this.isLangSelect = langSelect;
		
		if (langSelect) {
			this.showOnlyPublic = true;
		} else {
			this.showOnlyPublic = false;
		}
	}
	
	public DocumentsTable docsTable = null;
	public DocumentsTablePublic docsTablePublic = null;
	public DocumentsTableArchive docsTableArchive = null;
	
	/**
	 * Vormi paigutuse loomine.
	 */
	@Override
	public void init() {
		super.init();
		
		docsTable = new DocumentsTable();
		docsTablePublic = new DocumentsTablePublic();
		docsTableArchive = new DocumentsTableArchive();
		
		final FormPanel form = new FormPanel();
		final FormPanel formPublic = new FormPanel();
		
		boolean hasPriv = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_EIT_GRP })
			|| (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_USR_ADM }) && this instanceof PublicDocuments);
		
		if (!this.isReadOnly && hasPriv) {
			form.setAction(GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL_2);
			formPublic.setAction(GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL_2);
			
			form.setEncoding(FormPanel.ENCODING_MULTIPART);
			form.setMethod(FormPanel.METHOD_POST);
			
			formPublic.setEncoding(FormPanel.ENCODING_MULTIPART);
			formPublic.setMethod(FormPanel.METHOD_POST);
			
			final FileUpload upload = new FileUpload();
			upload.setName("uploadFormElement");
			
			final FileUpload uploadPublic = new FileUpload();
			uploadPublic.setName("uploadFormElement2");
			
			// Create a panel to hold all of the form widgets.
			final FlexTable formPanel = new FlexTable();
			formPanel.setStyleName("FormFiles");
			formPanel.setCellSpacing(1);
			formPanel.setCellPadding(5);
			if (this.isLangSelect) {
				formPanel.setText(0, 0, "Keel:");
				langSelectList = new ListBox();
				formPanel.setWidget(0, 1, langSelectList);
				askClassificators();
			}
			formPanel.setText(1, 0, "Dokument:");
			formPanel.setText(2, 0, "Dokumendi nimetus:");
			formPanel.setWidget(1, 1, new Image("images/t2rn.gif"));
			formPanel.setWidget(2, 1, new Image("images/t2rn.gif"));
			formPanel.getFlexCellFormatter().setStyleName(0, 0, "Label");
			formPanel.getFlexCellFormatter().setStyleName(1, 0, "Label");
			formPanel.setWidget(1, 2, upload);
			formPanel.getFlexCellFormatter().setColSpan(1, 2, 2);
			formPanel.getFlexCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
			formPanel.getFlexCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
			formPanel.getFlexCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);
			
			// Create a TextBox, giving it a name so that it will be submitted.
			final TextBox tb = new TextBox();
			tb.setName(ServiceConstants.DOC_NAME_PARM);
			formPanel.setWidget(2, 2, tb);
			formPanel.setWidget(2, 3, new Button("Lisa dokument", new ClickHandler() {
				public void onClick(ClickEvent sender) {
					upload.setName(com.google.gwt.http.client.URL.encode(upload.getName()));
					GWT.log("konfidentsiaalse faili nimi:" + upload.getFilename());
					if (upload.getFilename().replace(" ", "").length() == 0) {
						setError("Dokumendi valimine on vajalik.");
						return;
					} else if (tb.getText().replace(" ", "").length() == 0) {
						setError("Dokumendi nimi on kohustuslik!");
						return;
					}

					String docType = getDocumentType();
					if (docType != null)
						formPanel.setWidget(3, 0, new Hidden(ServiceConstants.DOC_TYPE_PARM, docType));
					String applicationId = getApplicationId();
					if (applicationId != null)
						formPanel.setWidget(4, 0, new Hidden(ServiceConstants.DOC_APPID_PARM, applicationId));
					if (langSelectList != null) {
						String langCode = langSelectList.getValue(langSelectList.getSelectedIndex());
						formPanel.setWidget(5, 0, new Hidden(ServiceConstants.DOC_LANG_PARM, langCode));
					}
					formPanel.setWidget(5, 0, new Hidden(ServiceConstants.PUB, "0"));
					tb.setText(com.google.gwt.http.client.URL.encode(tb.getText()));
					form.submit();
				}
			}));
			
			// Add an event handler to the form.
			form.addSubmitHandler(new SubmitHandler() {
				public void onSubmit(SubmitEvent paramSubmitEvent) {
					clearErrors();
				}
			});
			
			form.addSubmitCompleteHandler(new SubmitCompleteHandler() {
				@SuppressWarnings("unchecked")
				public void onSubmitComplete(SubmitCompleteEvent paramSubmitCompleteEvent) {
					RegistryDocumentMap newDoc = new RegistryDocumentMap();

					String docIdString = null;
					String docCreated = null;
					Long docId = null;

					if (paramSubmitCompleteEvent.getResults().indexOf("Exception") < 0) {
						try {
							String[] results = parseResponse(paramSubmitCompleteEvent.getResults());
							docIdString = results[0];
							docCreated = results[1];
							docId = new Long(docIdString);
							GWT.log("len:" + results.length);
							GWT.log("docIdString:" + docIdString);
							GWT.log("docCreated:" + docCreated);
						} catch (Exception e) {
							e.printStackTrace();
							setError("Rakenduse viga");
						}
					}

					if (docId != null) {
						newDoc.put(RegistryDocumentMap.ID, docId);
						newDoc.put(RegistryDocumentMap.CREATED, docCreated);
						newDoc.put(RegistryDocumentMap.NAME, com.google.gwt.http.client.URL.decode(tb.getText()));
						docsTable.addRow(newDoc);
						tb.setText(com.google.gwt.http.client.URL.decode(tb.getText()));
						docsTable.show();
					} else {
						setError("Laadimise viga");
					}
				}
			});
			
			if (!(UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && parent != null && parent instanceof XTeeForm && ((XTeeForm) parent)
					.getState().equals(FormState.SELECTING_RO))) {
				form.setWidget(formPanel);
			}
			
			// //////////
			// //////////
			// //////////
			final FlexTable formPanelPublic = new FlexTable();
			formPanelPublic.setStyleName("FormFiles");
			formPanelPublic.setCellSpacing(1);
			formPanelPublic.setCellPadding(5);
			if (this.isLangSelect) {
				formPanelPublic.setText(0, 0, "Keel:");
				langSelectList = new ListBox();
				formPanelPublic.setWidget(0, 1, langSelectList);
				askClassificators();
			}
			formPanelPublic.setText(1, 0, "Dokument:");
			formPanelPublic.setText(2, 0, "Dokumendi nimetus:");
			formPanelPublic.setWidget(1, 1, new Image("images/t2rn.gif"));
			formPanelPublic.setWidget(2, 1, new Image("images/t2rn.gif"));
			formPanelPublic.getFlexCellFormatter().setStyleName(0, 0, "Label");
			formPanelPublic.getFlexCellFormatter().setStyleName(1, 0, "Label");
			formPanelPublic.setWidget(1, 2, uploadPublic);
			formPanelPublic.getFlexCellFormatter().setColSpan(1, 2, 2);
			formPanelPublic.getFlexCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
			formPanelPublic.getFlexCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
			formPanelPublic.getFlexCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);
			
			// Create a TextBox, giving it a name so that it will be submitted.
			final TextBox tbPublic = new TextBox();
			tbPublic.setName(ServiceConstants.DOC_NAME_PARM);
			formPanelPublic.setWidget(2, 2, tbPublic);
			formPanelPublic.setWidget(2, 3, new Button("Lisa dokument", new ClickHandler() {
				public void onClick(ClickEvent sender) {
					uploadPublic.setName(com.google.gwt.http.client.URL.encode(uploadPublic.getName()));
					GWT.log("faili nimi:" + uploadPublic.getFilename());
					if (uploadPublic.getFilename().replace(" ", "").length() == 0) {
						setError("Dokumendi valimine on vajalik.");
						return;
					} else if (tbPublic.getText().replace(" ", "").length() == 0) {
						setError("Dokumendi nimi on kohustuslik!");
						return;
					}
					
					String docType = getDocumentType();
					if (docType != null)
						formPanelPublic.setWidget(3, 0, new Hidden(ServiceConstants.DOC_TYPE_PARM, docType));
					String applicationId = getApplicationId();
					if (applicationId != null)
						formPanelPublic.setWidget(4, 0, new Hidden(ServiceConstants.DOC_APPID_PARM, applicationId));
					if (langSelectList != null) {
						String langCode = langSelectList.getValue(langSelectList.getSelectedIndex());
						formPanelPublic.setWidget(5, 0, new Hidden(ServiceConstants.DOC_LANG_PARM, langCode));
					}
					formPanelPublic.setWidget(6, 0, new Hidden(ServiceConstants.PUB, "1"));
					tbPublic.setText(com.google.gwt.http.client.URL.encode(tbPublic.getText()));
					formPublic.submit();
				}
			}));
			
			// Add an event handler to the form.
			formPublic.addSubmitHandler(new SubmitHandler() {
				public void onSubmit(SubmitEvent paramSubmitEvent) {
					clearErrors();
				}
			});
			
			formPublic.addSubmitCompleteHandler(new SubmitCompleteHandler() {
				@SuppressWarnings("unchecked")
				public void onSubmitComplete(SubmitCompleteEvent event) {
					RegistryDocumentMap newDoc = new RegistryDocumentMap();

					String docIdString = null;
					String docCreated = null;
					Long docId = null;

					if (event.getResults().indexOf("Exception") < 0) {
						try {
							String[] results = parseResponse(event.getResults());
							docIdString = results[0];
							docCreated = results[1];
							docId = new Long(docIdString);
							GWT.log("len:" + results.length);
							GWT.log("docIdString:" + docIdString);
							GWT.log("docCreated:" + docCreated);
						} catch (Exception e) {
							e.printStackTrace();
							setError("Rakenduse viga");
						}
					}

					if (docId != null) {
						newDoc.put(RegistryDocumentMap.ID, docId);
						newDoc.put(RegistryDocumentMap.CREATED, docCreated);
						newDoc.put(RegistryDocumentMap.NAME, com.google.gwt.http.client.URL.decode(tbPublic.getText()));
						docsTablePublic.addRow(newDoc);
						tbPublic.setText(com.google.gwt.http.client.URL.decode(tbPublic.getText()));
						docsTablePublic.show();
					} else {
						setError("Laadimise viga");
					}
				}
			});
			
			if (!(UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && parent != null && parent instanceof XTeeForm && ((XTeeForm) parent)
					.getState().equals(FormState.SELECTING_RO))) {
				formPublic.setWidget(formPanelPublic);
			}
			// ///////////
			// ////////////
			// ///////////
		}
		
		Label title = new Label("Konfidentsiaalsed failid");
		title.setStyleName("Title");
		
		Label titleArchive = new Label("Arhiveeritud failid");
		titleArchive.setStyleName("Title");
		
		Label titlePublic = new Label("Avalikud failid");
		titlePublic.setStyleName("Title");
		
		Label avalikDo = null;
		
		String text3Str = "";
		if (!(UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && parent != null && parent instanceof XTeeForm && ((XTeeForm) parent)
			.getState().equals(FormState.SELECTING_RO)) || !isReadOnly) {
			avalikDo = new HTML("Siia lisada selgelt loetava märgistusega tarbijapakendi etikettide näidised või värvifotod.<br>"
					+ "Lubatud on JPG, PNG, PDF formaadid. Ühe faili mahupiiranguks on 25 MB.<br>"
					+ "Registrisse kantud toodete kohta avaldatakse siia lisatud failid alkoholiregistri veebilehel.");
		}
		
		if (!(UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP }) && parent != null && parent instanceof XTeeForm && ((XTeeForm) parent)
				.getState().equals(FormState.SELECTING_RO)) || !isReadOnly) {
			text3Str = "Siia lisada muud taotlusega esitatavad dokumendid (saatedokument, katseprotokoll jm).";
		}
		
		Label text3 = new Label(text3Str);
		text3.setText(text3.getText()+" (asice) lõpuga failid - see on uus Euroopa allkirjastatud failide laiend, täpsemalt saab lugeda http://www.id.ee/?id=37026 .");
		
		FlexTable main = new FlexTable();
		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("700px");

		main.setWidget(0, 0, titlePublic);
		main.setWidget(1, 0, avalikDo);
		main.setWidget(4, 0, formPublic);
		main.setWidget(5, 0, docsTablePublic);
		main.setWidget(6, 0, UIutils.createSpacer(700, 1));
		
		boolean hasPrivsArchive = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
		
		if (!showOnlyPublic) {
			main.setWidget(7, 0, UIutils.createSpacer(700, 10));
			main.setWidget(8, 0, title);
			main.setWidget(9, 0, text3);
			main.setWidget(10, 0, form);
			main.setWidget(11, 0, docsTable);		
			if (hasPrivsArchive) {
				main.setWidget(12, 0, UIutils.createSpacer(700, 1));
				main.setWidget(13, 0, UIutils.createSpacer(700, 10));
				main.setWidget(14, 0, titleArchive);
				main.setWidget(15, 0, docsTableArchive);
			}
			
			main.getFlexCellFormatter().setColSpan(0, 0, 2);
			main.getFlexCellFormatter().setColSpan(6, 0, 2);
			if (hasPrivsArchive) {
				main.getFlexCellFormatter().setColSpan(14, 0, 2);
			}
			
			if (this.parent != null) {
				@SuppressWarnings("deprecation")
				Button backButton = new Button("Tagasi", new ReturnFormListener(this, parent) {
					@Override
					public void onReturn() {
						/* vana vorm tuleb siin ära hävitada */
					}
				});
				
				if(hasPrivsArchive) {
					main.setWidget(16, 0, UIutils.createSpacer(1, 20));
					main.setWidget(17, 0, backButton);
					
					main.getFlexCellFormatter().setHorizontalAlignment(17, 0, HasHorizontalAlignment.ALIGN_RIGHT);
				} else {
					main.setWidget(12, 0, UIutils.createSpacer(1, 20));
					main.setWidget(13, 0, backButton);
					
					main.getFlexCellFormatter().setHorizontalAlignment(13, 0, HasHorizontalAlignment.ALIGN_RIGHT);
				}
			}
		}
		initWidget(main);
	}
	
	private String[] parseResponse(String response) {
		GWT.log("Response:" + response);
		if (response == null)
			return new String[2];
		
		return response.replaceAll("\\<.*?>", " ").trim().split(";");
	}
	
	/**
	 * Subclasses should override these methdos if needed.
	 * 
	 * @return String
	 */
	protected abstract String getDocumentType();
	
	protected abstract Long getProductId();
	
	protected abstract String getApplicationNr();
	
	protected abstract String getApplicationId();
	
	protected abstract void findDocuments(AsyncCallback callBack);
	
	protected abstract void findDocumentsPublic(AsyncCallback callBack);
	
	protected abstract void findDocumentsArchived(AsyncCallback callBack);
	
	/**
	 * Dokumentide tabeli UI esitus.
	 * 
	 * @author ivar
	 * 
	 */
	private class DocumentsTable extends FlexTable implements AsyncCallback {
		protected List rows = new ArrayList<Object>();
		
		public DocumentsTable() {
			super();
			
			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, "Nimetus");
			this.setText(0, 2, "Sisestatud");
			this.setText(0, 3, "");
			resetRows();
		}
		
		public void resetRows() {
			DocumentsForm.this.findDocuments(this);
		}
		
		public void addRow(Object doc) {
			this.rows.add(doc);
		}
		
		@SuppressWarnings("unused")
		public void removeRow(Object doc) {
			this.rows.remove(doc);
		}
		
		public void show() {
			while (this.getRowCount() > 1) {
				this.removeRow(1);
			}
			
			int i = 1;
			for(Iterator it = this.rows.iterator(); it.hasNext();) {
				Object row = it.next();
				if (row != null) {
					RegistryDocumentMap data = (RegistryDocumentMap) row;
					
					String docName = data.getText(RegistryDocumentMap.NAME);
					try {
						if(docName.startsWith("Ärakiri nr.") || docName.startsWith("Pikendamise ärakiri nr.")) {
							continue;
						}
						
						/**
						 * See IF rakendub ainult ettevõtjale.
						 */
						if(UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP })
							&& parent != null
							&& parent.getClass() == XTeeForm.class
						) {
							String state = parent.getData().getProperty(ApplicationMap.STATE_CODE).toString();
							
							if(state.equals(ApplicationMap.STATE_CODE_EXTENDED) || state.equals(ApplicationMap.STATE_CODE_ENTERED_TO_REGISTRY)) {
								if(docName.startsWith("Pikendamise otsus nr.") || docName.startsWith("Otsus nr.")){
									continue;
								} else if((docName.startsWith("Õiend nr.") || docName.startsWith("Pikendamise õiend nr.")) && !docName.substring(docName.length() - 7).equals("(asice)")) {
									continue;
								} 
							} else if(state.equals(ApplicationMap.STATE_CODE_NOT_EXTENDED) || state.equals(ApplicationMap.STATE_CODE_NOT_ENTERED_TO_REGISTRY)) {
								if(docName.startsWith("Pikendamise õiend nr.") || docName.startsWith("Õiend nr.")){
									continue;
								} else if((docName.startsWith("Otsus nr.") || docName.startsWith("Pikendamise otsus nr.")) && !docName.substring(docName.length() - 7).equals("(asice)")) {
									continue;
								} 
							}
						}
					} catch (Exception ex) {}
					
					renderRow(i++, data);
				}
			}
		}
		
		private void renderRow(int row, final RegistryDocumentMap data) {
			String docName = data.getText(RegistryDocumentMap.NAME);
			
			if((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");
			
			this.setText(row, 0, Integer.toString(row));
			
			final Long id = (Long) data.get(RegistryDocumentMap.ID);
			
			HTML name = new HTML("<a href='" + GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL + "?" + ServiceConstants.DOC_ACTION_PARM + "="
					+ ServiceConstants.DOC_ACTION_SAVE + "&" + ServiceConstants.DOCUMENT_ID + "=" + id + "'>" + docName + "</a>");
			
			boolean onOtsusOiend = false;
			
			if(docName.toLowerCase().contains("otsus") || docName.toLowerCase().contains("iend")) {
				onOtsusOiend = true;
			}
			
			this.setWidget(row, 1, name);
			if(data.getText(RegistryDocumentMap.CREATED) != null)
				this.setText(row, 2, data.getText(RegistryDocumentMap.CREATED));
			
			boolean hasPrivs = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })
				|| (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP })
					&& parent != null && parent instanceof XTeeForm
					&& (((XTeeForm) parent).getButtonState().equals(FormButtonState.ESITAMATA)
						|| ((XTeeForm) parent).getButtonState().equals(FormButtonState.ESITATUD)
						|| ((XTeeForm) parent).getButtonState().equals(FormButtonState.TAPSUSTA)));
			
			if (!DocumentsForm.this.isReadOnly && hasPrivs) {
				Label delete = new Label("kustuta");
				delete.setStyleName("Link");
				this.setWidget(row, 3, delete);
				delete.addClickListener(new PopupListener(id, row));
			}
			
			if (!DocumentsForm.this.isReadOnly && hasPrivs && onOtsusOiend) {
				Label delete = new Label("kustuta");
				delete.setStyleName("Link");
				this.setWidget(row, 3, delete);
				delete.addClickListener(new DeleteListener(docName, id, row));
			}
		}
		
		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("DocumentsTable. Failure: " + caught);
		}
		
		public void onSuccess(Object result) {
			if (result == null) {
				return;
			}
			if (result != this.rows) {
				this.rows = (List)result;
			}
			show();
		}
		
		private List getRows() {
			return this.rows;
		}
		
		private class DeleteListener extends PopupPanel implements ClickListener {
			public Long id;
			public int row;
			public String docName;
			final TextArea tbPohjendus = new TextArea();
			final ListBox lb = new ListBox();
			
			public DeleteListener(String docName, Long id, int row) {
				this.id = id;
				this.row = row;
				this.docName = docName;
			}
			
			private void init() {
				HTML html = null;
				final VerticalPanel sisu = new VerticalPanel();
				if (docName.toLowerCase().contains("otsus")) {
					if (docName.contains("asice")) {
						html = new HTML("<b>Hoiatus: Allkirjastatud otsuse kustutamine");
					} else {
						html = new HTML("<b>Hoiatus: Otsuse kustutamine</b><br>Allkirjastatud otsuse olemasolul kustub ka allkirjastatud fail");
					}
				} else {
					if (docName.contains("asice")) {
						html = new HTML("<b>Hoiatus: Allkirjastatud õiendi kustutamine");
					} else {
						html = new HTML("<b>Hoiatus: Õiendi kustutamine</b><br>Allkirjastatud õiendi olemasolul kustub ka allkirjastatud fail");
					}
				}
				HTML html2 = new HTML("Seaduslikud alused");
				HTML html3 = new HTML("Põhjendus");
				html.setWidth("100%");
				html2.setWidth("100%");
				html3.setWidth("100%");
				
				HorizontalPanel buttons = new HorizontalPanel();
				Button yes = new Button("Salvesta ja jätka", this);
				yes.addClickListener(new ClickListener() {
					public void onClick(Widget sender) {
						
						ServiceContext.getInstance().getRegistryService().deleteDocumentWithReason(id, tbPohjendus.getText(), new AsyncCallback<Object>() {
							
							@Override
							public void onFailure(Throwable arg0) {
								// TODO Auto-generated method
								// stub
								Window.alert("Viga dokumendi eemaldamisel!");
							}
							
							@Override
							public void onSuccess(Object arg0) {
								DocumentsTable.this.show();
								docsTable.resetRows();
								docsTable.show();
								
								boolean hasPrivsArchive = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
								if (hasPrivsArchive) {
									docsTableArchive.resetRows();
									docsTableArchive.show();
								}
								hide();
							}
						});
					}
				});
				
				lb.addChangeHandler((new ChangeHandler() {
					@Override
					public void onChange(ChangeEvent arg0) {
						// TODO Auto-generated method stub
						tbPohjendus.setText(lb.getValue(lb.getSelectedIndex()));
					}
				}));
				
				ServiceContext.getInstance().getRegistryService().getAllDeleteConfirmations(new AsyncCallback() {

					public void onFailure(Throwable caught) {
						Window.alert(String.valueOf(caught.getMessage()));
					}

					public void onSuccess(Object result) {
						List<String[]> data = (ArrayList<String[]>) result;

						for (int i = 0; i < data.size(); i++) {
							lb.addItem(data.get(i)[1], data.get(i)[2]);
						}
						if (lb.getItemCount() > 0) {
							tbPohjendus.setText(lb.getValue(0));
						}
					}
				});

				Button no = new Button("Loobu", new ClickListener() {
					@Override
					@Deprecated
					public void onClick(Widget arg0) {
						// TODO Auto-generated method stub
						hide();
					}
				});
				
				buttons.add(yes);
				buttons.add(UIutils.createSpacer(6, 1));
				buttons.add(no);
				sisu.add(UIutils.createSpacer(1, 15));
				sisu.add(html);
				sisu.add(UIutils.createSpacer(1, 15));
				sisu.add(html2);
				sisu.add(UIutils.createSpacer(1, 15));
				sisu.add(lb);
				sisu.add(UIutils.createSpacer(1, 15));
				sisu.add(html3);
				sisu.add(UIutils.createSpacer(1, 15));
				sisu.add(tbPohjendus);
				sisu.add(UIutils.createSpacer(1, 20));
				sisu.add(buttons);
				sisu.add(UIutils.createSpacer(1, 20));

				sisu.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
				sisu.setCellHorizontalAlignment(html2, HasHorizontalAlignment.ALIGN_CENTER);
				sisu.setCellHorizontalAlignment(lb, HasHorizontalAlignment.ALIGN_CENTER);
				sisu.setCellHorizontalAlignment(html3, HasHorizontalAlignment.ALIGN_CENTER);
				sisu.setCellHorizontalAlignment(tbPohjendus, HasHorizontalAlignment.ALIGN_CENTER);
				sisu.setCellHorizontalAlignment(buttons, HasHorizontalAlignment.ALIGN_CENTER);

				setPopupPosition(350, 175);
				setSize("600px", "200px");
				this.setStyleName("Dialog");
				setWidget(sisu);
				this.show();
			}

			public void onClick(Widget sender) {
				if (sender instanceof Label) {
					String buttonText = ((Label) sender).getText();
					if ("kustuta".equals(buttonText)) {
						init();
						super.show();
					}
				}
				if (sender instanceof Button) {
					String buttonText = ((Button) sender).getText();
					if ("Jah".equals(buttonText) || "Ei".equals(buttonText)) {
						hide();
					}
				}
			}
		}

		private class PopupListener extends PopupPanel implements ClickListener {

			public Long id;
			public int row;

			public PopupListener(Long id, int row) {
				this.id = id;
				this.row = row;
			}

			private void init() {
				VerticalPanel popup = new VerticalPanel();
				HTML html = new HTML("Kas olete kindel, et soovite dokumenti kustutada?");
				html.setWidth("100%");
				HorizontalPanel buttons = new HorizontalPanel();
				Button yes = new Button("Jah", this);
				yes.addClickListener(new ClickListener() {
					public void onClick(Widget sender) {
						
						getRows().remove(row - 1);
						DocumentsTable.this.show();
						
						ServiceContext.getInstance().getRegistryService().deleteDocument(id, new AsyncCallback(){
							
							public void onFailure(Throwable caught) {
								caught.printStackTrace();
								setError("DocumentsTable. Failure: " + caught);
							}

							public void onSuccess(Object result) {
								boolean hasPrivsArchive = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
								if (hasPrivsArchive) {
									docsTableArchive.resetRows();
									docsTableArchive.show();
								}
							}
							
						});
					}
				});

				Button no = new Button("Ei", this);
				buttons.add(yes);
				buttons.add(UIutils.createSpacer(6, 1));
				buttons.add(no);
				popup.add(UIutils.createSpacer(1, 15));
				popup.add(html);
				popup.add(UIutils.createSpacer(1, 20));
				popup.add(buttons);
				popup.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
				popup.setCellHorizontalAlignment(buttons, HasHorizontalAlignment.ALIGN_CENTER);

				setPopupPosition(350, 175);
				setSize("300px", "100px");
				this.setStyleName("Dialog");
				setWidget(popup);
			}

			public void onClick(Widget sender) {
				if (sender instanceof Label) {
					String buttonText = ((Label) sender).getText();
					if ((new String("kustuta")).equals(buttonText)) {
						init();
						super.show();
					}
				}
				if (sender instanceof Button) {
					String buttonText = ((Button) sender).getText();
					if ("Jah".equals(buttonText) || "Ei".equals(buttonText)) {
						hide();
					}
				}
			}
		}
	}
	
	private class DocumentsTablePublic extends FlexTable implements AsyncCallback {
		protected List rows = new ArrayList();
		
		public DocumentsTablePublic() {
			super();

			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, "Nimetus");
			this.setText(0, 2, "Sisestatud");
			this.setText(0, 3, "");
			resetRows();
		}

		public void resetRows() {
			DocumentsForm.this.findDocumentsPublic(this);
		}

		public void addRow(Object doc) {
			this.rows.add(doc);
		}

		public void removeRow(Object doc) {
			this.rows.remove(doc);
		}

		public void show() {

			while (this.getRowCount() > 1) {
				this.removeRow(1);
			}

			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				Object row = it.next();

				if (row != null) {
					renderRow(i++, (RegistryDocumentMap) row);
				}
			}
		}

		private void renderRow(int row, final RegistryDocumentMap data) {
			if ((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");
			
			this.setText(row, 0, Integer.toString(row));
			
			final Long id = (Long) data.get(RegistryDocumentMap.ID);
			String docName = data.getText(RegistryDocumentMap.NAME);
			
			HTML name = new HTML("<a href='" + GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL + "?" + ServiceConstants.DOC_ACTION_PARM + "="
				+ ServiceConstants.DOC_ACTION_SAVE + "&" + ServiceConstants.DOCUMENT_ID + "=" + id + "'>" + docName + "</a>");
			
			this.setWidget(row, 1, name);
			if (data.getText(RegistryDocumentMap.CREATED) != null)
				this.setText(row, 2, data.getText(RegistryDocumentMap.CREATED));
			
			boolean hasPrivs = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK })
				|| (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP })
				&& parent != null && parent instanceof XTeeForm
				&& (((XTeeForm) parent).getButtonState().equals(FormButtonState.ESITAMATA)
					|| ((XTeeForm) parent).getButtonState().equals(FormButtonState.ESITATUD)
					|| ((XTeeForm) parent).getButtonState().equals(FormButtonState.TAPSUSTA)));
			
			if (!DocumentsForm.this.isReadOnly && hasPrivs) {
				Label delete = new Label("kustuta");
				delete.setStyleName("Link");
				this.setWidget(row, 3, delete);
				delete.addClickListener(new PopupListener(id, row));
			}

		}

		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("DocumentsTable. Failure: " + caught);
		}

		public void onSuccess(Object result) {

			if (result == null) {
				return;
			}
			if (result != this.rows)
				this.rows = (List) result;

			show();
		}

		private List getRows() {
			return this.rows;
		}

		private class PopupListener extends PopupPanel implements ClickListener {

			public Long id;
			public int row;

			public PopupListener(Long id, int row) {
				this.id = id;
				this.row = row;
			}

			private void init() {
				VerticalPanel popup = new VerticalPanel();
				HTML html = new HTML("Kas olete kindel, et soovite dokumenti kustutada?");
				html.setWidth("100%");
				HorizontalPanel buttons = new HorizontalPanel();
				Button yes = new Button("Jah", this);
				yes.addClickListener(new ClickListener() {
					public void onClick(Widget sender) {
						getRows().remove(row - 1);
						DocumentsTablePublic.this.show();
						
						ServiceContext.getInstance().getRegistryService().deleteDocument(id, new AsyncCallback(){
							public void onFailure(Throwable caught) {
								caught.printStackTrace();
								setError("DocumentsTable. Failure: " + caught);
							}
							
							public void onSuccess(Object result) {
								boolean hasPrivsArchive = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
								if (hasPrivsArchive) {
									docsTableArchive.resetRows();
									docsTableArchive.show();
								}
							}
						});
						
						getRows().remove(row - 1);
					}
				});
				
				Button no = new Button("Ei", this);
				buttons.add(yes);
				buttons.add(UIutils.createSpacer(6, 1));
				buttons.add(no);
				popup.add(UIutils.createSpacer(1, 15));
				popup.add(html);
				popup.add(UIutils.createSpacer(1, 20));
				popup.add(buttons);
				popup.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
				popup.setCellHorizontalAlignment(buttons, HasHorizontalAlignment.ALIGN_CENTER);
				
				setPopupPosition(350, 175);
				setSize("300px", "100px");
				this.setStyleName("Dialog");
				setWidget(popup);
			}
			
			public void onClick(Widget sender) {
				if (sender instanceof Label) {
					String buttonText = ((Label) sender).getText();
					if ("kustuta".equals(buttonText)) {
						init();
						super.show();
					}
				}
				if (sender instanceof Button) {
					String buttonText = ((Button) sender).getText();
					if ("Jah".equals(buttonText) || "Ei".equals(buttonText)) {
						hide();
					}
				}
			}
		}
	}
	
	private class DocumentsTableArchive extends FlexTable implements AsyncCallback {
		protected List rows = new ArrayList();
		
		public DocumentsTableArchive() {
			super();
			
			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, "Nimetus");
			this.setText(0, 2, "Kustutamise põhjendus");
			resetRows();
		}
		
		public void resetRows() {
			DocumentsForm.this.findDocumentsArchived(this);
		}
		
		public void addRow(Object doc) {
			this.rows.add(doc);
		}
		
		public void removeRow(Object doc) {
			this.rows.remove(doc);
		}
		
		public void show() {
			while (this.getRowCount() > 1) {
				this.removeRow(1);
			}
			
			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				Object row = it.next();
				
				if (row != null) {
					renderRow(i++, (RegistryDocumentMap) row);
				}
			}
		}
		
		private void renderRow(int row, final RegistryDocumentMap data) {
			if ((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");
			
			this.setText(row, 0, Integer.toString(row));
			
			final Long id = (Long) data.get(RegistryDocumentMap.ID);
			String docName = data.getText(RegistryDocumentMap.NAME);
			HTML name = new HTML("<a href='" + GWT.getModuleBaseURL() + ServiceConstants.DOC_SERVICE_URL + "?" + ServiceConstants.DOC_ACTION_PARM + "="
				+ ServiceConstants.DOC_ACTION_SAVE + "&" + ServiceConstants.DOCUMENT_ID + "=" + id + "'>" + docName + " - "
				+ data.getText(RegistryDocumentMap.CREATED) + "</a>");
			
			this.setWidget(row, 1, name);
			this.setText(row, 2, data.getText(RegistryDocumentMap.REASON));
		}
		
		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("DocumentsTable. Failure: " + caught);
		}
		
		public void onSuccess(Object result) {
			if (result == null) {
				return;
			}
			if (result != this.rows)
				this.rows = (List) result;
			
			show();
		}
		
		private List getRows() {
			return this.rows;
		}
		
		private class PopupListener extends PopupPanel implements ClickListener {
			public Long id;
			public int row;
			
			public PopupListener(Long id, int row) {
				this.id = id;
				this.row = row;
			}
			
			private void init() {
				VerticalPanel popup = new VerticalPanel();
				HTML html = new HTML("Kas olete kindel, et soovite dokumenti kustutada?");
				html.setWidth("100%");
				
				HorizontalPanel buttons = new HorizontalPanel();
				Button yes = new Button("Jah", this);
				yes.addClickListener(new ClickListener() {
					public void onClick(Widget sender) {
						ServiceContext.getInstance().getRegistryService().deleteDocument(id, DocumentsTableArchive.this);
						getRows().remove(row - 1);
						
						boolean hasPrivsArchive = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
						if (hasPrivsArchive) {
							docsTableArchive.resetRows();
							docsTableArchive.show();
						}
					}
				});
				
				Button no = new Button("Ei", this);
				buttons.add(yes);
				buttons.add(UIutils.createSpacer(6, 1));
				buttons.add(no);
				popup.add(UIutils.createSpacer(1, 15));
				popup.add(html);
				popup.add(UIutils.createSpacer(1, 20));
				popup.add(buttons);
				popup.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
				popup.setCellHorizontalAlignment(buttons, HasHorizontalAlignment.ALIGN_CENTER);
				
				setPopupPosition(350, 175);
				setSize("300px", "100px");
				this.setStyleName("Dialog");
				setWidget(popup);
			}
			
			public void onClick(Widget sender) {
				if (sender instanceof Label) {
					String buttonText = ((Label) sender).getText();
					if("kustuta".equals(buttonText)) {
						init();
						super.show();
					}
				}
				if (sender instanceof Button) {
					String buttonText = ((Button) sender).getText();
					if ("Jah".equals(buttonText) || "Ei".equals(buttonText)) {
						hide();
					}
				}
			}
		}
	}
	
	private void askClassificators() {
		List languages = (List)ServiceContext.getInstance().getCached(ServiceContext.LANGUAGES);
		if (languages != null) {
			makeLangSelectionList(languages);
		}
	}
	
	public void avail(String key, Object value) {
		if(value instanceof Throwable)
			setError(value.toString());
		else if (key.equals(ServiceContext.LANGUAGES))
			makeLangSelectionList((List)value);
	}
	
	private void makeLangSelectionList(List langClassList) {
		langSelectList.clear();
		for(Iterator it = langClassList.iterator(); it.hasNext();) {
			ClassItemMap item = (ClassItemMap) it.next();
			
			langSelectList.addItem(item.getText(ClassItemMap.NAME), item.getText(ClassItemMap.CODE));
		}
	}
}