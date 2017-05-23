package ee.agri.alkor.web.client.form;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import ee.agri.alkor.web.client.dto.ReasonMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
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

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.CheckBoxList;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.SelectReturnListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.ObjectList;
import ee.agri.alkor.web.client.form.finance.StateFeeForm;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.ConstraintViolationException;

public class DeleteConfirmation extends Form {

	private FlexTable main = new FlexTable();

	public ReasonTable reasonTable = null;

	final TextBox tbNote = new TextBox();
	final Hidden tbId = new Hidden();
	final TextArea tbPohjendus = new TextArea();
	
	final Button tyhista = new Button();

	public static final String getKey() {
		return "DeleteConfirmation";
	}

	public DeleteConfirmation() {
		super();
	}

	//
	// /**
	// * Form initialization method to load the form when invoked
	// */
	public void init() {
		super.init();

		Label title = new Label("Dokumentide kustutamise seaduslikud alused");
		title.setStyleName("Title");

		final FlexTable formPanelDelete = new FlexTable();
		final FormPanel formDelete = new FormPanel();

		formPanelDelete.setStyleName("FormFiles");
		formPanelDelete.setCellSpacing(1);
		formPanelDelete.setCellPadding(5);

		formPanelDelete.setText(1, 0, "Pealkiri:");
		formPanelDelete.setText(2, 0, "Põhjendus:");
		formPanelDelete.setWidget(1, 1, new Image("images/t2rn.gif"));
		formPanelDelete.setWidget(2, 1, new Image("images/t2rn.gif"));
		formPanelDelete.getFlexCellFormatter().setStyleName(0, 0, "Label");
		formPanelDelete.getFlexCellFormatter().setStyleName(1, 0, "Label");
		formPanelDelete.setWidget(2, 2, tbPohjendus);
		formPanelDelete.getFlexCellFormatter().setColSpan(1, 2, 2);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(0, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(1, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);

		// Create a TextBox, giving it a name so that it will be submitted.

		tbNote.setName("note");
		formPanelDelete.setWidget(1, 2, tbNote);
		
		formPanelDelete.setWidget(3, 2, new Button("Salvesta",
				new ClickListener() {
					public void onClick(Widget sender) {
						if (tbPohjendus.getValue().replaceAll(" ", "").length() > 1
								&& tbNote.getValue().replaceAll(" ", "")
										.length() > 1) {

							if (tbId.getValue() == null
									|| tbId.getValue().equals("")) {
								final ReasonMap rm = new ReasonMap();
								rm.put(ReasonMap.TITLE, tbNote.getValue());
								rm.put(ReasonMap.NOTE, tbPohjendus.getValue());
								// insert
								ServiceContext
										.getInstance()
										.getRegistryService()
										.saveDeleteConfirmation(
												tbNote.getValue(),
												tbPohjendus.getValue(), null,
												1, new AsyncCallback() {

													public void onFailure(
															Throwable caught) {
														Window.alert(String.valueOf(caught
																.getMessage()));
													}

													public void onSuccess(
															Object result) {
														try {
															rm.put(ReasonMap.ID,
																	String.valueOf(result));

															reasonTable
																	.addRow(rm);
															reasonTable.show();
															reasonTable = new ReasonTable();											
															main.setWidget(3, 0, reasonTable);
															setInfo("Andmed salvestatud!");
														} catch (Exception ex) {
															Window.alert(ex
																	.getMessage());
														}

													}
												});
							} else {
								final ReasonMap rm = new ReasonMap();
								rm.put(ReasonMap.ID, tbId.getValue());
								rm.put(ReasonMap.TITLE, tbNote.getValue());
								rm.put(ReasonMap.NOTE, tbPohjendus.getValue());
								// update
								ServiceContext
										.getInstance()
										.getRegistryService()
										.saveDeleteConfirmation(
												tbNote.getValue(),
												tbPohjendus.getValue(),
												tbId.getValue(), 2,
												new AsyncCallback() {

													public void onFailure(
															Throwable caught) {
														Window.alert(String.valueOf(caught
																.getMessage()));
													}

													public void onSuccess(
															Object result) {
														reasonTable
																.changeRow(rm);
														reasonTable.show();
														tbId.setValue("");
														tbNote.setValue("");
														tbPohjendus
																.setValue("");
														reasonTable = new ReasonTable();											
														main.setWidget(3, 0, reasonTable);
														setInfo("Andmed salvestatud!");
													}
												});
							}
						} else {
							setError("Pealkiri ja põhjus on kohustuslikud!");
						}
					}
				}));
		
		tyhista.setText("Tühista");
		
		tyhista.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent arg0) {
				// TODO Auto-generated method stub
				tbId.setValue(null);
				tbPohjendus.setValue(null);
				tbNote.setValue(null);
				tyhista.setVisible(false);
			}
		});
		
		tyhista.setVisible(false);
		
		formPanelDelete.setWidget(4, 2, tyhista);

		formDelete.setWidget(formPanelDelete);

		reasonTable = new ReasonTable();

		/* --MAIN TABLE-- */
		main.setCellSpacing(0);
		main.setCellPadding(0);
		main.setWidth("800px");

		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(580, 1));
		main.setWidget(2, 0, formDelete);
		main.setWidget(3, 0, reasonTable);

		main.getFlexCellFormatter().addStyleName(0, 0, "enterpriseDetails");
		main.getFlexCellFormatter().setVerticalAlignment(0, 1,
				HasVerticalAlignment.ALIGN_TOP);
		main.getFlexCellFormatter().setColSpan(2, 0, 2);
		main.getFlexCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		// Don't show before roles classificator is loaded
		initWidget(main);
		/* --END MAIN TABLE-- */

	}

	private class ReasonTable extends FlexTable implements AsyncCallback {

		protected List rows = new ArrayList();
		
		int count = 0;

		public ReasonTable() {
			super();

			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, "Pealkiri");
			this.setText(0, 2, "Põhjendus");
			this.setText(0, 3, "");
			this.setText(0, 4, "");

			ServiceContext.getInstance().getRegistryService()
					.getAllDeleteConfirmations(new AsyncCallback() {

						public void onFailure(Throwable caught) {
							Window.alert(String.valueOf(caught.getMessage()));
						}

						public void onSuccess(Object result) {
							List<String[]> data = (ArrayList<String[]>) result;
							count = data.size();
							for (int i = 0; i < data.size(); i++) {
								ReasonMap rm = new ReasonMap();

								rm.put(ReasonMap.ID, data.get(i)[0]);
								rm.put(ReasonMap.TITLE, data.get(i)[1]);
								rm.put(ReasonMap.NOTE, data.get(i)[2]);

								addRow(rm);
							}
							show();
						}
					});

		}

		public void addRow(Object doc) {
			this.rows.add(doc);
		}

		public void removeRow(Object doc) {
			this.rows.remove(doc);
		}

		public void changeRow(ReasonMap map) {
			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				ReasonMap row = (ReasonMap) it.next();
				if (row.get(ReasonMap.ID) == map.get(ReasonMap.ID)) {
					removeRow(row);
					addRow(map);
					show();
					break;
				}
			}
		}

		public void show() {
			while (this.getRowCount() > 1) {
				this.removeRow(1);
			}

			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				Object row = it.next();
				if (row != null) {
					ReasonMap rm = (ReasonMap) row;

					renderRow(i++, (ReasonMap) row);

				}
			}
		}

		private void renderRow(int row, final ReasonMap data) {
			final String title = data.getText(ReasonMap.TITLE);
			final String note = data.getText(ReasonMap.NOTE);

			if ((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");

			this.setText(row, 0, Integer.toString(row));

			final Long id = Long.valueOf(data.get(ReasonMap.ID).toString());

			this.setText(row, 1, title);
			if (note.length() > 80) {
				this.setText(row, 2, note.substring(0, 80) + "...");
			} else {
				this.setText(row, 2, note);
			}

			Label edit = new Label("muuda");
			Label delete = new Label("kustuta");

			edit.setStyleName("Link");
			delete.setStyleName("Link");
			this.setWidget(row, 3, edit);

			if(count > 1){
				this.setWidget(row, 4, delete);
			}
			delete.addClickListener(new PopupListener(id, row));
			edit.addClickListener(new ClickListener() {

				@Override
				@Deprecated
				public void onClick(Widget arg0) {
					tbId.setValue(String.valueOf(id));
					tbNote.setValue(title);
					tbPohjendus.setValue(note);	
					tyhista.setVisible(true);
				}
			});
		}

		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("ReasonTable. Failure: " + caught);
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
				HTML html = new HTML(
						"Kas olete kindel, et soovite dokumenti kustutada?");
				html.setWidth("100%");
				HorizontalPanel buttons = new HorizontalPanel();
				Button yes = new Button("Jah", this);
				yes.addClickListener(new ClickListener() {
					public void onClick(Widget sender) {
						ServiceContext
								.getInstance()
								.getRegistryService()
								.saveDeleteConfirmation(null, null,
										String.valueOf(id), 3,
										new AsyncCallback() {

											public void onFailure(
													Throwable caught) {
												Window.alert(String
														.valueOf(caught
																.getMessage()));
											}

											public void onSuccess(Object result) {
												getRows().remove(row - 1);
												ReasonTable.this.show();
												reasonTable = new ReasonTable();											
												main.setWidget(3, 0, reasonTable);
												setInfo("Andmed salvestatud!");
												
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
				popup.setCellHorizontalAlignment(html,
						HasHorizontalAlignment.ALIGN_CENTER);
				popup.setCellHorizontalAlignment(buttons,
						HasHorizontalAlignment.ALIGN_CENTER);

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
						show();
					}
				}
				if (sender instanceof Button) {
					String buttonText = ((Button) sender).getText();
					if ("Jah".equals(buttonText)) {
						hide();
					} else if ("Ei".equals(buttonText)) {
						hide();
					}
				}
			}
		}

	}

	private String[] parseResponse(String response) {
		GWT.log("Response:" + response);
		if (response == null)
			return new String[2];
		return response.replaceAll("\\<.*?>", " ").trim().split(";");
	}

}
