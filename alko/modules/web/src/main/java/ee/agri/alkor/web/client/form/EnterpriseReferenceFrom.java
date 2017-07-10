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
import com.google.gwt.user.datepicker.client.DateBox;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.CalendarBox;
import ee.agri.alkor.web.client.common.CheckBoxList;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.ReturnFormListener;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.SelectReturnListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.EnterpriseReferenceMap;
import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.ObjectList;
import ee.agri.alkor.web.client.form.finance.StateFeeForm;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.ConstraintViolationException;

public class EnterpriseReferenceFrom extends Form {

	private FlexTable main = new FlexTable();

	public ReferenceTable referenceTable = null;

	final TextBox tbEesNimi = new TextBox();
	final TextBox tbPereNimi = new TextBox();
	final TextBox tbAmetikoht = new TextBox();
	final Hidden tbId = new Hidden();
	final TextBox tbIsikukood = new TextBox();
	final CalendarBox tbKehtibkuni = new CalendarBox();

	public static final String getKey() {
		return "EnterpriseReferenece";
	}

	public EnterpriseReferenceFrom() {
		super();
	}

	//
	// /**
	// * Form initialization method to load the form when invoked
	// */
	public void init() {
		super.init();

		Label title = new Label("Isikute volituste haldamine");
		title.setStyleName("Title");

		final FlexTable formPanelDelete = new FlexTable();
		final FormPanel formDelete = new FormPanel();

		formPanelDelete.setStyleName("FormFiles");
		formPanelDelete.setCellSpacing(1);
		formPanelDelete.setCellPadding(5);

		formPanelDelete.setText(1, 0, "Isiku eesnimi:");
		formPanelDelete.setText(2, 0, "Isiku perenimi:");
		formPanelDelete.setText(3, 0, "Isikukood:");
		formPanelDelete.setText(4, 0, "Isiku ametikoht:");
		formPanelDelete.setText(5, 0, "Kehtib kuni:");
		formPanelDelete.setWidget(1, 1, new Image("images/t2rn.gif"));
		formPanelDelete.setWidget(2, 1, new Image("images/t2rn.gif"));
		formPanelDelete.setWidget(3, 1, new Image("images/t2rn.gif"));
		formPanelDelete.setWidget(4, 1, new Image("images/t2rn.gif"));

		formPanelDelete.getFlexCellFormatter().setStyleName(1, 0, "Label");
		formPanelDelete.getFlexCellFormatter().setStyleName(2, 0, "Label");
		formPanelDelete.getFlexCellFormatter().setStyleName(3, 0, "Label");
		formPanelDelete.getFlexCellFormatter().setStyleName(4, 0, "Label");
		formPanelDelete.getFlexCellFormatter().setStyleName(5, 0, "Label");

		formPanelDelete.setWidget(1, 2, tbEesNimi);
		formPanelDelete.setWidget(2, 2, tbPereNimi);
		formPanelDelete.setWidget(3, 2, tbIsikukood);
		formPanelDelete.setWidget(4, 2, tbAmetikoht);
		formPanelDelete.setWidget(5, 2, tbKehtibkuni);

		formPanelDelete.getFlexCellFormatter().setColSpan(1, 2, 2);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(4, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(5, 0, HasHorizontalAlignment.ALIGN_RIGHT);

		formPanelDelete.setWidget(6, 2, new Button("Salvesta", new ClickListener() {
			public void onClick(Widget sender) {
				if(tbEesNimi.getValue().replaceAll(" ", "").length() == 0){
					setError("Eesnimi on kohustuslik!");
				}
				else if(tbEesNimi.getValue().replaceAll(" ", "").length() > 300){
					setError("Eesnimi on pikem kui 300 sümbolit!");
				}
				else if(tbPereNimi.getValue().replaceAll(" ", "").length() == 0){
					setError("Perenimi on kohustuslik!");
				}
				else if(tbPereNimi.getValue().replaceAll(" ", "").length() > 300){
					setError("Perenimi on pikem kui 300 sümbolit!");
				}
				else if(tbIsikukood.getValue().replaceAll(" ", "").length() == 0){
					setError("Isikukood on kohustuslik!");
				}
				else if (!checkIdCode(tbIsikukood.getValue())) {
					setError("Vigane isikukood!");
				}
				else if(tbAmetikoht.getValue().replaceAll(" ", "").length() == 0){
					setError("Isiku ametikoht on kohustuslik!");
				}
				else if(tbAmetikoht.getValue().replaceAll(" ", "").length() < 4){
					setError("Isiku ametikoht on lühem kui 4 sümbolit!");
				}
				else if(tbAmetikoht.getValue().replaceAll(" ", "").length() > 300){
					setError("Isiku ametikoht on pikem kui 300 sümbolit!");
				}
				else{
					final EnterpriseReferenceMap rm = new EnterpriseReferenceMap();
					rm.put(EnterpriseReferenceMap.FIRSTNAME, tbEesNimi.getValue());
					rm.put(EnterpriseReferenceMap.LASTNAME, tbPereNimi.getValue());
					rm.put(EnterpriseReferenceMap.OCCUPATION, tbAmetikoht.getValue());
					rm.put(EnterpriseReferenceMap.IDCODE, tbIsikukood.getValue());
					rm.put(EnterpriseReferenceMap.TODATE, tbKehtibkuni.getText());
					// insert
					ServiceContext
							.getInstance()
							.getRegistryService()
							.saveEnterpriseReference(tbEesNimi.getValue(), tbPereNimi.getValue(), tbIsikukood.getValue(), tbAmetikoht.getValue().replaceAll("\n", "").replaceAll("\r", ""), tbKehtibkuni.getText(), Form.getUserInfo().getRegCode(),
									new AsyncCallback() {

										public void onFailure(Throwable caught) {
											Window.alert(String.valueOf(caught.getMessage()));
										}

										public void onSuccess(Object result) {
											try {
												if (String.valueOf(result).equals("0")) {
													setError("Vigane kuupäev");
												} else if(String.valueOf(result).equals("-1")){
													setError("Kehtib kuni ei tohi olla minevikus");
												} else if(String.valueOf(result).equals("-2")){
													setError("Iseennast ei saa volitada");
												} else {
													tbEesNimi.setValue("");
													tbPereNimi.setValue("");
													tbIsikukood.setValue("");
													tbAmetikoht.setValue("");
													tbKehtibkuni.clear();
													rm.put(EnterpriseReferenceMap.ID, String.valueOf(result));
													referenceTable = new ReferenceTable();
													main.setWidget(3, 0, referenceTable);
													setInfo("Andmed salvestatud!");
												}
											} catch (Exception ex) {
												Window.alert(ex.getMessage());
											}

										}
									});
				}
			}
		}));

		formDelete.setWidget(formPanelDelete);

		referenceTable = new ReferenceTable();

		/* --MAIN TABLE-- */
		main.setCellSpacing(0);
		main.setCellPadding(0);
		main.setWidth("800px");

		main.setWidget(0, 0, title);
		main.setWidget(1, 0, UIutils.createSpacer(580, 1));
		main.setWidget(2, 0, formDelete);
		main.setWidget(3, 0, referenceTable);

		main.getFlexCellFormatter().addStyleName(0, 0, "enterpriseDetails");
		main.getFlexCellFormatter().setVerticalAlignment(0, 1, HasVerticalAlignment.ALIGN_TOP);
		main.getFlexCellFormatter().setColSpan(2, 0, 2);
		main.getFlexCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_LEFT);
		// Don't show before roles classificator is loaded
		initWidget(main);
		/* --END MAIN TABLE-- */

	}

	private class ReferenceTable extends FlexTable implements AsyncCallback {

		protected List rows = new ArrayList();

		int count = 0;

		public ReferenceTable() {
			super();

			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, "Nimi");
			this.setText(0, 2, "Isikukood");
			this.setText(0, 3, "Ametikoht");
			this.setText(0, 4, "Kehtib alates");
			this.setText(0, 5, "Kehtib kuni");
			this.setText(0, 6, "Kehtib praegu");
			this.setText(0, 7, "");

			ServiceContext.getInstance().getRegistryService().getAllEnterpriseReferences(Form.getUserInfo().getRegCode(), new AsyncCallback() {

				public void onFailure(Throwable caught) {
					Window.alert(String.valueOf(caught.getMessage()));
				}

				public void onSuccess(Object result) {
					List<String[]> data = (ArrayList<String[]>) result;
					count = data.size();
					for (int i = 0; i < data.size(); i++) {
						EnterpriseReferenceMap rm = new EnterpriseReferenceMap();

						rm.put(EnterpriseReferenceMap.ID, data.get(i)[0]);
						rm.put(EnterpriseReferenceMap.FIRSTNAME, data.get(i)[1]);
						rm.put(EnterpriseReferenceMap.LASTNAME, data.get(i)[2]);
						rm.put(EnterpriseReferenceMap.IDCODE, data.get(i)[3]);
						rm.put(EnterpriseReferenceMap.OCCUPATION, data.get(i)[4]);
						rm.put(EnterpriseReferenceMap.FROMDATE, data.get(i)[5]);
						rm.put(EnterpriseReferenceMap.TODATE, data.get(i)[6]);
						rm.put(EnterpriseReferenceMap.IS_VALID, data.get(i)[7]);
						rm.put(EnterpriseReferenceMap.REVOKED_TIME, data.get(i)[8]);

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

		public void changeRow(EnterpriseReferenceMap map) {
			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				EnterpriseReferenceMap row = (EnterpriseReferenceMap) it.next();
				if (row.get(EnterpriseReferenceMap.ID) == map.get(EnterpriseReferenceMap.ID)) {
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
					EnterpriseReferenceMap rm = (EnterpriseReferenceMap) row;

					renderRow(i++, (EnterpriseReferenceMap) row);

				}
			}
		}

		private void renderRow(int row, final EnterpriseReferenceMap data) {
			final String name = data.getText(EnterpriseReferenceMap.FIRSTNAME) + " " + data.getText(EnterpriseReferenceMap.LASTNAME);
			final String idCode = data.getText(EnterpriseReferenceMap.IDCODE);
			final String occupation = data.getText(EnterpriseReferenceMap.OCCUPATION);
			final String toDate = data.getText(EnterpriseReferenceMap.TODATE);
			final String fromDate = data.getText(EnterpriseReferenceMap.FROMDATE);
			final String isValid = data.getText(EnterpriseReferenceMap.IS_VALID);
			final String revokedTime = data.getText(EnterpriseReferenceMap.REVOKED_TIME);

			if ((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");

			this.setText(row, 0, Integer.toString(row));

			final Long id = Long.valueOf(data.get(EnterpriseReferenceMap.ID).toString());

			this.setText(row, 1, name);
			this.setText(row, 2, idCode);
			this.setText(row, 3, occupation);
			this.setText(row, 4, fromDate);
			this.setText(row, 5, toDate);
			this.setText(row, 6, "Ei (Tühistatud "+revokedTime+")");

			if (isValid.equals("1")) {
				this.setText(row, 6, "Jah");
				
				Label delete = new Label("Tühista");
				delete.setStyleName("Link");
				this.setWidget(row, 7, delete);
				delete.addClickListener(new PopupListener(id, row));
			}
		}

		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("ReferenceTable. Failure: " + caught);
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
				HTML html = new HTML("Kas olete kindel, et soovite volitust tühistada?");
				html.setWidth("100%");
				HorizontalPanel buttons = new HorizontalPanel();
				Button yes = new Button("Jah", this);
				yes.addClickListener(new ClickListener() {
					public void onClick(Widget sender) {
						ServiceContext.getInstance().getRegistryService().deleteEnterpriseReference(String.valueOf(id), new AsyncCallback() {

							public void onFailure(Throwable caught) {
								Window.alert(String.valueOf(caught.getMessage()));
							}

							public void onSuccess(Object result) {
								getRows().remove(row - 1);
								ReferenceTable.this.show();
								referenceTable = new ReferenceTable();
								main.setWidget(3, 0, referenceTable);
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
				popup.setCellHorizontalAlignment(html, HasHorizontalAlignment.ALIGN_CENTER);
				popup.setCellHorizontalAlignment(buttons, HasHorizontalAlignment.ALIGN_CENTER);

				setPopupPosition(350, 175);
				setSize("300px", "100px");
				this.setStyleName("Dialog");
				setWidget(popup);
			}

			public void onClick(Widget sender) {
				if (sender instanceof Label) {

					init();
					show();

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

	public boolean checkIdCode(String id) {

		id = id.trim();

		try {
			String[] pcs = new String[11];
			String last = id.substring(id.length() - 1, id.length());

			int j = 0;
			for (String s : id.split("")) {
				if (s.equals("")) {
					continue;
				}
				pcs[j] = s;
				j++;
			}

			int checkSum = 0;
			int sum = 0;

			for (int i = 1; i <= 10; i++) {
				int mpl = i;
				if (i == 10) {
					mpl = 1;
				}
				sum += mpl * Integer.parseInt(pcs[i - 1]);
			}

			checkSum = sum % 11;

			if (checkSum == 10) {
				int i = 3;
				sum = 0;
				for (int y = 1; y <= 10; y++, i++) {
					if (i == 10) {
						i = 1;
					}
					int mpl = i;
					
					sum += mpl * Integer.parseInt(pcs[y - 1]);
				}

				checkSum = sum % 11;

				if (checkSum == 10) {
					checkSum = 0;
				}
			}

			if (checkSum == Integer.parseInt(last)) {
				return true;
			}

			return false;
		} catch (Exception x) {
			x.printStackTrace();
			return false;
		}
	}

}
