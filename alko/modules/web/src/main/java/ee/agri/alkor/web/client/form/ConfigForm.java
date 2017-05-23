package ee.agri.alkor.web.client.form;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import ee.agri.alkor.web.client.dto.ConfigMap;

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

public class ConfigForm extends Form {

	private FlexTable main = new FlexTable();

	public ConfigTabel configTabel = null;

	final TextBox tbKey = new TextBox();
	final TextBox tbValue = new TextBox();

	final Button tyhista = new Button();

	public static final String getKey() {
		return "ConfigForm";
	}

	public ConfigForm() {
		super();
	}

	//
	// /**
	// * Form initialization method to load the form when invoked
	// */
	public void init() {
		super.init();

		Label title = new Label("Süsteemi konfiguratsiooni muudetavad andmed");
		title.setStyleName("Title");

		Label warning = new Label(
				"NB! Enne andmete muutmist veenduda nende täpsuses, muutes konfiguratsiooni andmeid teadmatult võib muuta süsteemi käitumise ebastabiilseks.");
		warning.setStyleName("ErrorStyle");

		final FlexTable formPanelDelete = new FlexTable();
		final FormPanel formDelete = new FormPanel();

		formPanelDelete.setStyleName("FormFiles");
		formPanelDelete.setCellSpacing(1);
		formPanelDelete.setCellPadding(5);

		formPanelDelete.setText(1, 0, "Võti:");
		formPanelDelete.setText(2, 0, "Väärtus:");
		formPanelDelete.setWidget(2, 1, new Image("images/t2rn.gif"));
		formPanelDelete.getFlexCellFormatter().setStyleName(0, 0, "Label");
		formPanelDelete.getFlexCellFormatter().setStyleName(1, 0, "Label");
		formPanelDelete.setWidget(2, 2, tbValue);
		formPanelDelete.getFlexCellFormatter().setColSpan(1, 2, 2);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		formPanelDelete.getFlexCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);

		// Create a TextBox, giving it a name so that it will be submitted.

		tbKey.setName("key");
		tbKey.setEnabled(false);
		formPanelDelete.setWidget(1, 2, tbKey);

		formPanelDelete.setWidget(3, 2, new Button("Salvesta", new ClickListener() {
			public void onClick(Widget sender) {
				if (tbValue.getValue().replaceAll(" ", "").length() > 0
						&& tbKey.getValue().replaceAll(" ", "").length() > 0) {

					ServiceContext.getInstance().getRegistryService().saveConfigValue(tbKey.getValue(),
							tbValue.getValue(), new AsyncCallback() {

						public void onFailure(Throwable caught) {
							Window.alert(String.valueOf(caught.getMessage()));
						}

						public void onSuccess(Object result) {
							try {
								configTabel = new ConfigTabel();	
								main.setWidget(4, 0, configTabel);
								setInfo("Andmed salvestatud!");
							} catch (Exception ex) {
								Window.alert(ex.getMessage());
							}

						}
					});
				}
			}
		}));

		tyhista.setText("Tühista");

		tyhista.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
				// TODO Auto-generated method stub
				tbValue.setValue(null);
				tbKey.setValue(null);
				tyhista.setVisible(false);
			}
		});

		tyhista.setVisible(false);

		formPanelDelete.setWidget(4, 2, tyhista);

		formDelete.setWidget(formPanelDelete);

		configTabel = new ConfigTabel();

		/* --MAIN TABLE-- */
		main.setCellSpacing(0);
		main.setCellPadding(0);
		main.setWidth("800px");

		main.setWidget(0, 0, title);
		main.setWidget(1, 0, warning);
		main.setWidget(2, 0, UIutils.createSpacer(580, 1));
		main.setWidget(3, 0, formDelete);
		main.setWidget(4, 0, configTabel);

		main.getFlexCellFormatter().addStyleName(0, 0, "enterpriseDetails");
		main.getFlexCellFormatter().setVerticalAlignment(2, 1, HasVerticalAlignment.ALIGN_TOP);
		main.getFlexCellFormatter().setColSpan(3, 0, 2);
		main.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);
		// Don't show before roles classificator is loaded
		initWidget(main);
		/* --END MAIN TABLE-- */

	}

	private class ConfigTabel extends FlexTable implements AsyncCallback {

		protected List rows = new ArrayList();

		int count = 0;

		public ConfigTabel() {
			super();

			this.setWidth("100%");
			this.setStyleName("Table");
			this.setCellSpacing(1);
			this.setCellPadding(5);
			this.getRowFormatter().setStyleName(0, "Header");
			this.setText(0, 0, "");
			this.setText(0, 1, "Võti");
			this.setText(0, 2, "Väärtus");
			this.setText(0, 3, "Kirjeldus");
			this.setText(0, 4, "");

			ServiceContext.getInstance().getRegistryService().getAllConfigValues(new AsyncCallback() {

				public void onFailure(Throwable caught) {
					Window.alert(String.valueOf(caught.getMessage()));
				}

				public void onSuccess(Object result) {
					List<String[]> data = (ArrayList<String[]>) result;
					count = data.size();
					for (int i = 0; i < data.size(); i++) {
						ConfigMap rm = new ConfigMap();

						rm.put(ConfigMap.KEY, data.get(i)[0]);
						rm.put(ConfigMap.VALUE, data.get(i)[1]);
						rm.put(ConfigMap.DESCRIPTION, data.get(i)[2]);

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

		public void changeRow(ConfigMap map) {
			int i = 1;
			for (Iterator it = this.rows.iterator(); it.hasNext();) {
				ConfigMap row = (ConfigMap) it.next();
				if (row.get(ConfigMap.KEY) == map.get(ConfigMap.KEY)) {
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
					ConfigMap rm = (ConfigMap) row;

					renderRow(i++, (ConfigMap) row);

				}
			}
		}

		private void renderRow(int row, final ConfigMap data) {
			final String value = data.getText(ConfigMap.VALUE);
			final String description = data.getText(ConfigMap.DESCRIPTION);
			final String key = data.get(ConfigMap.KEY).toString();

			if ((row % 2) == 1)
				this.getRowFormatter().setStyleName(row, "Odd");
			else
				this.getRowFormatter().setStyleName(row, "Even");

			this.setText(row, 0, Integer.toString(row));
			this.setText(row, 1, key);
			this.setText(row, 2, value);
			this.setText(row, 3, description);

			Label edit = new Label("muuda");

			edit.setStyleName("Link");
			this.setWidget(row, 4, edit);

			edit.addClickListener(new ClickListener() {

				@Override
				@Deprecated
				public void onClick(Widget arg0) {
					tbKey.setValue(key);
					tbValue.setValue(value);
					tyhista.setVisible(true);
				}
			});
		}

		public void onFailure(Throwable caught) {
			caught.printStackTrace();
			setError("ConfigTable. Failure: " + caught);
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

	}

	private String[] parseResponse(String response) {
		GWT.log("Response:" + response);
		if (response == null)
			return new String[2];
		return response.replaceAll("\\<.*?>", " ").trim().split(";");
	}

}
