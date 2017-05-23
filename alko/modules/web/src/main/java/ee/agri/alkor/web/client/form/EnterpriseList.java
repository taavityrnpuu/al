package ee.agri.alkor.web.client.form;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.CacheListener;
import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.OFButton;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.SelectReturnCallback;
import ee.agri.alkor.web.client.common.SelectReturnListener;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.common.YesNoRadioBox;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.EnterpriseSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;
import ee.agri.alkor.web.client.form.finance.StateFeeForm;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
import ee.agri.alkor.web.service.ServiceConstants;

/**
 * Ettevotete halduse vorm
 *
 * @author Sven
 */
public class EnterpriseList extends Form implements CacheListener {

	private final FlexTable main = new FlexTable();

	private static final String SEARCH_FORM = "enterpriseSearchForm";

	private static final String VIEW_STATE_FEE = "view_state_fee";

	private final EnterpriseListTable resultsTable = new EnterpriseListTable();

	private Button searchButton;

	private String selectionProperty;

	private String selectedRoleCode;

	private String text;

	public static final String getKey() {
		return "EnterpriseList";
	}

	public EnterpriseList() {
		super();
		setData(new EnterpriseMap());
	}

	public EnterpriseList(EnterpriseMap map, SelectReturnCallback callback) {
		super(callback);
		setData(map);
	}

	/**
	 *
	 * @param returnForm
	 */
	public EnterpriseList(Form returnForm) {
		super();
	}

	public EnterpriseList(SelectReturnCallback callback, EnterpriseMap map, String defaultSelected) {
		this(callback, map);
		selectedRoleCode = defaultSelected;
	}

	public EnterpriseList(SelectReturnCallback callback, EnterpriseMap map) {
		super(callback);
		setData(map);
		this.selectionProperty = callback.getSelectionProperty();
		if (selectionProperty.equals(EnterpriseMap.APPLICANT)) {
			selectedRoleCode = EnterpriseMap.APL;
		} else if (selectionProperty.equals(EnterpriseMap.PRODUCER)) {
			selectedRoleCode = EnterpriseMap.PRO;
		} else if (selectionProperty.equals(EnterpriseMap.IMPORTER)) {
			selectedRoleCode = EnterpriseMap.IMP;
		} else if (selectionProperty.equals(EnterpriseMap.MARKETER)) {
			selectedRoleCode = EnterpriseMap.MAR;
		} else if (selectionProperty.equals(EnterpriseMap.PACKAGER)) {
			selectedRoleCode = EnterpriseMap.PAC;
		}

		resetResultTable();
	}

	public void resetResultTable() {
		// if the page has already result, the result are cleared
		if (resultsTable != null && resultsTable.getFilter() != null
				&& resultsTable.getFilter().getResultsList() != null) {

			resultsTable.getFilter().getResultsList().clear();
			resultsTable.getFilter().setTotal(0);
			resultsTable.show();
		}
	}

	@Override
	public Object getConstantsWithLookup() {
		return GWT.create(EnterpriseListMessages.class);
	}

	//
	@Override
	public void init() {

		super.init();

		ServiceContext.getInstance().addCacheListener(ServiceContext.ENTERPRISE_ROLES, this);

		FlexTable searchForm = new FlexTable();
		searchForm.setStyleName("Form");
		searchForm.setCellSpacing(1);
		searchForm.setCellPadding(5);
		searchForm.setText(0, 0, getLabel(EnterpriseSearchFilter.NAME));// "Nimi:");
		searchForm.setText(1, 0, getLabel(EnterpriseSearchFilter.REG_NR));// "Reg.
																			// nr:");
		searchForm.setText(0, 2, getLabel(EnterpriseSearchFilter.ENTERPRISE_ROLE));// "Tüüp:");
		searchForm.setWidget(0, 1, addFormField(SEARCH_FORM, EnterpriseSearchFilter.NAME, new TextBox()));
		searchForm.setWidget(1, 1, addFormField(SEARCH_FORM, EnterpriseSearchFilter.REG_NR, new TextBox()));
		searchForm.setWidget(0, 3, addFormField(SEARCH_FORM, EnterpriseSearchFilter.ENTERPRISE_ROLE, new ListBox()));

		YesNoRadioBox yesNoRadioBox = new YesNoRadioBox();
		yesNoRadioBox.setDefaultValue(true); // default value is true
		yesNoRadioBox = (YesNoRadioBox) addFormField(SEARCH_FORM, EnterpriseSearchFilter.ISACTIVE, yesNoRadioBox);

		// kuvame, kui on sisekasutaja
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_USR_ADM })) {
			searchForm.setText(2, 0, getLabel(EnterpriseSearchFilter.ISACTIVE));// "Aktiivne:");
			searchForm.setWidget(2, 1, yesNoRadioBox);
		}

		/* --layout, adding components end-- */

		/* --SEARCH FORM END-- */

		/* --LIST FORM-- */

		/* Search button component */
		searchButton = new Button(getLabel("buttonSearch"));// "Otsi");
		searchButton.addClickListener(new ClickListener() {

			public void onClick(Widget sender) {
				resultsTable.getData(getFormFieldValues(SEARCH_FORM));
				jumpToTop();
			}
		});
		searchButton.setWidth("9em");

		HorizontalPanel searchButtonPanel = new HorizontalPanel();
		searchButtonPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		searchButtonPanel.add(UIutils.createSpacer(10, 20));
		searchButtonPanel.add(searchButton);

		/* -- Back button -- */
		if (getSelectReturnCallback() != null) {
			searchButtonPanel.add(UIutils.createSpacer(10, 20));
			Button back;

			back = UIutils.createButton(new SelectReturnListener(this, getData()) {
				@Override
				public void onClick(Widget sender) {
					setData(getData());
					super.onClickWithoutClear(sender);
				}
			}, getLabel("buttonBack"));
			searchButtonPanel.add(back);
		}

		// lisateade EITi kasutajatele
		if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP })) {
			searchButtonPanel.add(UIutils.createSpacer(10, 20));
			searchButtonPanel.add(new HTML("<b>" + getLabel("message") + "</b>"));
		}

		/* -- Back button END-- */

		/* --LIST FORM END-- */

		HorizontalPanel listButtonPanel = new HorizontalPanel();
		listButtonPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		listButtonPanel.add(UIutils.createSpacer(10, 20));
		Button but = UIutils.createButton(new ClickListener() {
			public void onClick(Widget sender) {
				EnterpriseDetails noteForm = null;
				if (getSelectReturnCallback() != null) {
					noteForm = new EnterpriseDetails(getSelectReturnCallback());
				} else {
					noteForm = new EnterpriseDetails(EnterpriseList.this);
				}
				noteForm.setData(new EnterpriseMap());
				openForm(noteForm);
			}
		}, getLabel("buttonAddEnterprise"));
		listButtonPanel.add(but);// "Lisa ettevõte"
		boolean visible = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
		listButtonPanel.setVisible(visible);
		listButtonPanel.add(UIutils.createSpacer(1, 20));
		if (this.parent != null)
			listButtonPanel.add(new OFButton(getLabel("buttonBack"), parent));// "Tagasi"

		/* --SEARCH TABLE -- */

		FlexTable searchTable = new FlexTable();

		Label searchTitle = new Label(getLabel("searchTableTitle"));// "Ettevõtte
																	// otsing");
		searchTitle.setStyleName("Title");
		searchTable.setWidth("100%");
		searchTable.setCellSpacing(1);
		searchTable.setCellPadding(5);
		searchTable.setWidget(0, 0, searchTitle);
		searchTable.setWidget(1, 0, UIutils.createSpacer(700, 1));
		searchTable.setWidget(2, 0, searchForm);
		searchTable.setWidget(3, 0, searchButtonPanel);
		searchTable.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);

		/* --SEARCH TABLE END-- */

		/* --LIST TABLE-- */

		FlexTable listTable = new FlexTable();
		listTable.setWidth("100%");
		listTable.setCellSpacing(1);
		listTable.setCellPadding(5);

		Label listTitle = new Label(getLabel("listTableTitle"));// "Ettevõtete
																// nimekiri");
		listTitle.setStyleName("Title");

		listTable.setWidget(0, 0, listTitle);
		listTable.setWidget(1, 0, UIutils.createSpacer(700, 1));

		listTable.setWidget(2, 0, resultsTable);
		listTable.setWidget(3, 0, listButtonPanel);
		listTable.getFlexCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_LEFT);

		main.setCellPadding(0);
		main.setCellSpacing(0);
		main.setWidth("100%");
		main.setWidget(0, 0, searchTable);
		main.setWidget(1, 0, listTable);

		/* --MAIN TABLE END-- */
		askClassificators();
		initWidget(main);

	}

	public void avail(String key, Object value) {
		if (value instanceof Throwable)
			Window.alert(value.toString());
		else if (key.equals(ServiceContext.ENTERPRISE_ROLES)) {
			makeClassSelectionList(SEARCH_FORM, EnterpriseSearchFilter.ENTERPRISE_ROLE, (List) value);
		}
		Widget field = this.getFormField(SEARCH_FORM, EnterpriseSearchFilter.ENTERPRISE_ROLE);
		ListBox listBox = (ListBox) field;
		for (int i = 0; i < listBox.getItemCount(); i++) {
			if (XTeeForm.getKey().equals(History.getToken()) && EnterpriseMap.APL.equals(listBox.getValue(i))) {
				listBox.removeItem(i);
				continue;
			}
			
			if (listBox.getValue(i).equals(selectedRoleCode)) {
				listBox.setSelectedIndex(i);
			}
		}
	}

	private void askClassificators() {
		List enterpriseRoles = (List) ServiceContext.getInstance().getCached(ServiceContext.ENTERPRISE_ROLES);

		if (enterpriseRoles != null) {
			makeClassSelectionList(SEARCH_FORM, EnterpriseSearchFilter.ENTERPRISE_ROLE, enterpriseRoles);
		}
		Widget field = this.getFormField(SEARCH_FORM, EnterpriseSearchFilter.ENTERPRISE_ROLE);
		ListBox listBox = (ListBox) field;
		int selectedIndex = 0; int indexes = 0;

		for (int i = 0; i < listBox.getItemCount(); i++) {
			
			if (XTeeForm.getKey().equals(History.getToken()) && EnterpriseMap.APL.equals(listBox.getValue(i))) {
				listBox.removeItem(i);
				i--;
			} else if (listBox.getValue(i).equals(selectedRoleCode)) {
				selectedIndex = i;
			}
		}
		
		listBox.setSelectedIndex(selectedIndex);
	}

	public void updateEnterprise() {
		resultsTable.getData(getFormFieldValues(SEARCH_FORM));
	}

	private class EnterpriseListTable extends ResultTable {

		public EnterpriseListTable() {
			super(new EnterpriseSearchFilter());
			boolean hasPriviledge = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK });
			boolean hasChoosePriviledge = UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_EIT_GRP });
			if (hasChoosePriviledge) {
				// addColumn(new Column(getLabel(EnterpriseMap.NAME),
				// EnterpriseMap.NAME, null, Column.styleUrl, "change"));
				addColumn(new Column(getLabel(EnterpriseMap.NAME), EnterpriseMap.NAME, Column.styleNormal)); // "Nimi"
			} else {
				addColumn(
						new Column(getLabel(EnterpriseMap.NAME), EnterpriseMap.NAME, null, Column.styleUrl, "change")); // "Nimi"
			}
			addColumn(new Column(getLabel(EnterpriseMap.BUS_REG_CODE), EnterpriseMap.REG_ID, Column.styleNormal)); // "Äriregistrikood"

			// addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_ADDRESS),
			// EnterpriseMap.ADDRESS_ADDRESS, Column.styleNormal));
			addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_COUNTRY_CODE), EnterpriseMap.ADDRESS_COUNTRY_NAME,
					Column.styleNormal));
			addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_DISTRICT), EnterpriseMap.ADDRESS_DISTRICT,
					Column.styleNormal));
			addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_TOWN), EnterpriseMap.ADDRESS_TOWN, Column.styleNormal));
			addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_ORG_UNIT), EnterpriseMap.ADDRESS_ORG_UNIT,
					Column.styleNormal));
			addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_STREET), EnterpriseMap.ADDRESS_STREET,
					Column.styleNormal));
			addColumn(
					new Column(getLabel(EnterpriseMap.ADDRESS_HOUSE), EnterpriseMap.ADDRESS_HOUSE, Column.styleNormal));
			addColumn(new Column(getLabel(EnterpriseMap.ADDRESS_APPARTMENT_NR), EnterpriseMap.ADDRESS_APPARTMENT_NR,
					Column.styleNormal));
			if (!hasChoosePriviledge)
				addColumn(new Column(getLabel(EnterpriseMap.BALANCE), EnterpriseMap.BALANCE, null, Column.styleUrl,
						VIEW_STATE_FEE));
			addColumn(new Column(getLabel(EnterpriseMap.ISACTIVE), EnterpriseMap.ISACTIVE, Column.styleNormal));

			if (hasPriviledge || hasChoosePriviledge)
				addColumn(Column.getSelectInstance()); // "vali"
			if (hasPriviledge)
				addColumn(Column.getDeleteInstance()); // "kustuta"

		}

		@Override
		protected void getData(SearchFilter filter) {
			ServiceContext.getInstance().getRegistryService().search(filter, this);
		}

		@Override
		protected IRowListenerFactory getRowListenerFactory() {
			return new RowListenterFactory();
		}

		@Override
		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
			// TODO Auto-generated method stub
			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ee.agri.alkor.web.client.common.ResultTable#renderRow(int,
		 * ee.agri.alkor.web.client.dto.ABaseDTOMap)
		 */

		@Override
		protected void renderRow(int row, ABaseDTOMap resultRow) {
			if (resultRow.getProperty(EnterpriseMap.NAME) == null
					|| resultRow.getProperty(EnterpriseMap.NAME).toString().trim().length() == 0) {
				resultRow.setProperty(EnterpriseMap.NAME, "-");
			}
			if ("true".equals(resultRow.getProperty(EnterpriseMap.ISACTIVE))) {
				resultRow.setProperty(EnterpriseMap.ISACTIVE, "Jah");
			}
			if ("false".equals(resultRow.getProperty(EnterpriseMap.ISACTIVE))) {
				resultRow.setProperty(EnterpriseMap.ISACTIVE, "Ei");
			}
			super.renderRow(row, resultRow);
		}

	}

	private class RowListenterFactory implements IRowListenerFactory {

		public RowListenterFactory() {
			super();
		}

		public ClickListener create(String listenerType, final Object row) {
			ClickListener listener = null;

			if (ResultTable.CHANGE.equals(listenerType)) {
				listener = new ClickListener() {

					public void onClick(Widget sender) {
						if ("Jah".equals(((EnterpriseMap) row).getProperty(EnterpriseMap.ISACTIVE))) {
							((EnterpriseMap) row).setProperty(EnterpriseMap.ISACTIVE, "true");
						} else if ("Ei".equals(((EnterpriseMap) row).getProperty(EnterpriseMap.ISACTIVE))) {
							((EnterpriseMap) row).setProperty(EnterpriseMap.ISACTIVE, "false");
						}

						if (((EnterpriseMap) row).getText(EnterpriseMap.NAME).equals("-")) {
							((EnterpriseMap) row).setProperty(EnterpriseMap.NAME, null);
						}
						EnterpriseDetails newForm = new EnterpriseDetails(EnterpriseList.this, (EnterpriseMap) row);
						openForm(newForm);
					}
				};
			} else if (ResultTable.SELECT.equals(listenerType)) {
				if ("Jah".equals(((EnterpriseMap) row).getProperty(EnterpriseMap.ISACTIVE))) {
					((EnterpriseMap) row).setProperty(EnterpriseMap.ISACTIVE, "true");
				} else if ("Ei".equals(((EnterpriseMap) row).getProperty(EnterpriseMap.ISACTIVE))) {
					((EnterpriseMap) row).setProperty(EnterpriseMap.ISACTIVE, "false");
				}
				listener = new SelectReturnListener(EnterpriseList.this, (EnterpriseMap) row);
			} else if (VIEW_STATE_FEE.equals(listenerType)) {
				listener = new ClickListener() {

					public void onClick(Widget arg0) {
						if ("Jah".equals(((EnterpriseMap) row).getProperty(EnterpriseMap.ISACTIVE))) {
							((EnterpriseMap) row).setProperty(EnterpriseMap.ISACTIVE, "true");
						} else if ("Ei".equals(((EnterpriseMap) row).getProperty(EnterpriseMap.ISACTIVE))) {
							((EnterpriseMap) row).setProperty(EnterpriseMap.ISACTIVE, "false");
						}
						openForm(new StateFeeForm(EnterpriseList.this, ((EnterpriseMap) row)));
					}

				};
			} else if (ResultTable.DELETE.equals(listenerType)) {
				listener = new ClickListener() {

					public void onClick(Widget sender) {
						ServiceContext.getInstance().getRegistryService().deleteEnterprise(
								(Long) ((EnterpriseMap) row).get(EnterpriseMap.ID), new AsyncCallback() {

							public void onFailure(Throwable caught) {
								setError(caught.toString());
							}

							public void onSuccess(Object result) {
								String resultmessage = (String) result;
								if ("ConstraintViolationException".equals(resultmessage)) {
									setError("Ettevõte on seotud taotluse/tootega!");
								} else {

									setInfo("Toiming õnnestus");
									resultsTable.deleteDataRow((Long) result);
								}
							}

						});
					}
				};

			} else if (ResultTable.ACCOUNT.equals(listenerType)) {

			}
			return listener;
		}

	}

	public void onReturn() {
		resultsTable.getData();
	}

}
