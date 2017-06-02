package ee.agri.alkor.web.client.form;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
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

/**
 *
 * @author anybody
 *
 * @TODO address.country salvestub kui koodi väärtus.
 */
public class EnterpriseDetails extends Form implements CacheListener{

	private static final String CHANGE_FORM = "changeForm";

	private FlexTable main = new FlexTable();
	
	   List<String> codes = new ArrayList<String>(); 

	private FlexTable detailsTable = new FlexTable();
	//private FlexTable representativeTable = new FlexTable();
	private FlexTable addressTable = new FlexTable();

	private boolean change = false;

	/* --end enterprise details variables-- */

	public static final String getKey() {
		return "EnterpriseDetails";
	}

	public EnterpriseDetails() {
		super();
		setData(new EnterpriseMap());
	}

	/**
	 * Constructor
	 */
	public EnterpriseDetails(Form parent) {
		this();
		this.parent = parent;
	}

	public EnterpriseDetails(Form parent, EnterpriseMap data) {
		super();
		this.parent = parent;
		setData(data);
		if(!(parent instanceof StateFeeForm))
			change = true;
	}

	public EnterpriseDetails(SelectReturnCallback callback) {
		super(callback);
	}

	public EnterpriseDetails(SelectReturnCallback callback, EnterpriseMap map) {
		super(callback);
		if (map != null) {
			setData(map);
		} else {
			setData(new EnterpriseMap());
		}
	}

	public Object getConstantsWithLookup() {
		return GWT.create(EnterpriseDetailsMessages.class);
	}

	//
	// /**
	// * Form initialization method to load the form when invoked
	// */
	public void init() {
		
		super.init();
		ServiceContext.getInstance().addCacheListener(
				ServiceContext.ENTERPRISE_ROLES, this);
		ServiceContext.getInstance().addCacheListener(ServiceContext.COUNTRIES,
				this);

		/* --ENTERPRISE DETAILS TABLE-- */
		detailsTable.setCellSpacing(1);
		detailsTable.setCellPadding(5);
		detailsTable.setWidth("350px");
		detailsTable.setStyleName("Form");

		detailsTable.setText(1, 0, getLabel(EnterpriseMap.NAME));//"Nimi:");
		detailsTable.setText(2, 0, getLabel(EnterpriseMap.REG_ID));//"Äriregistrikood:");
		detailsTable.setText(3, 0, getLabel(EnterpriseMap.EXCISE_STORE_NR));//"Aktsiisilao tegevusloa nr:");
		detailsTable.setText(4, 0, getLabel(EnterpriseMap.ACK_NR));//"Tunnustamise otsus:");
		detailsTable.setText(5, 0, getLabel(EnterpriseMap.ACK_DATE));//"Tunnustamise kpv:");
		detailsTable.setText(6, 0, getLabel(EnterpriseMap.MTR_CODE));//"Registreerimise nr. MTR-is:");
		detailsTable.setText(7, 0, getLabel(EnterpriseMap.ISACTIVE));//"Aktiivne");
		if(change) {
			detailsTable.setText(9, 0, getLabel(EnterpriseMap.CHANGE_REASON));//Muutmise põhjus
		}

		detailsTable.setWidget(1, 1, new Image("images/t2rn.gif"));
		TextBox nameBox = new TextBox();
		//nameBox.setEnabled(false);
		detailsTable.setWidget(1, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.NAME, nameBox, "240px", null, Validators.REQUIRED));
		TextBox td_reg_id = new TextBox();
		//td_reg_id.setEnabled(false);
		detailsTable.setWidget(2, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.REG_ID, td_reg_id));
		detailsTable.setWidget(3, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.EXCISE_STORE_NR, new TextBox()));
		detailsTable.setWidget(4, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ACK_NR, new TextBox()));
		detailsTable.setWidget(5, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ACK_DATE, new CalendarBox(), null, "105px"));
		detailsTable.setWidget(6, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.MTR_CODE, new TextBox()));
		detailsTable.setWidget(7,2,addFormField(CHANGE_FORM,
				EnterpriseMap.ISACTIVE, new CheckBox()));
		detailsTable.setWidget(8, 0, addFormField(CHANGE_FORM,
				EnterpriseMap.ENTERPRISE_ROLES, new CheckBoxList()));
		detailsTable.getFlexCellFormatter().setColSpan(8, 0, 2);
		if(change) {
			TextArea ta = new TextArea();
			detailsTable.setWidget(9, 2, addFormField(CHANGE_FORM, EnterpriseMap.CHANGE_REASON, ta));
		}
		UIutils.setTableTextStyled(detailsTable);
		
		/* --REPRESENTATIVE TABLE-- */
		/*
		representativeTable.setCellSpacing(1);
		representativeTable.setCellPadding(5);
		representativeTable.setStyleName("Form");

		representativeTable.setText(0, 0,
				getLabel(EnterpriseMap.REPRESENTATIVE_NAME));//"Nimi:");
		representativeTable.setText(1, 0,
				getLabel(EnterpriseMap.REPRESENTATIVE_REG_ID));//"Isikukood:");
		representativeTable.setText(2, 0,
				getLabel(EnterpriseMap.REPRESENTATIVE_OCCUPATION));//"Amet:");
		representativeTable.setWidget(0, 1, addFormField(CHANGE_FORM,
				EnterpriseMap.REPRESENTATIVE_NAME, new TextBox()));
		representativeTable.setWidget(1, 1, addFormField(CHANGE_FORM,
				EnterpriseMap.REPRESENTATIVE_REG_ID, new TextBox(), null, null, "length[0,16]"));
		representativeTable.setWidget(2, 1, addFormField(CHANGE_FORM,
				EnterpriseMap.REPRESENTATIVE_OCCUPATION, new TextBox()));
		UIutils.setTableTextStyled(representativeTable);
*/
		
		/* --ADDRESS TABLE-- */
		addressTable.setCellSpacing(1);
		addressTable.setCellPadding(5);
		addressTable.setStyleName("Form");

		addressTable
				.setText(1, 0, getLabel(EnterpriseMap.ADDRESS_COUNTRY_CODE));//"Riik:");
		addressTable.setWidget(1, 1, new Image("images/t2rn.gif"));
		addressTable.setText(2, 0, getLabel(EnterpriseMap.ADDRESS_DISTRICT));//"Maakond:");
		addressTable.setText(3, 0, getLabel(EnterpriseMap.ADDRESS_ORG_UNIT));//"Linn:");
		//addressTable.setText(4, 0, getLabel(EnterpriseMap.ADDRESS_ADDRESS));//"Aadress:");
		addressTable.setText(4, 0, getLabel(EnterpriseMap.ADDRESS_TOWN));
		addressTable.setText(5, 0, getLabel(EnterpriseMap.ADDRESS_STREET));
		addressTable.setText(6, 0, getLabel(EnterpriseMap.ADDRESS_HOUSE));
		addressTable.setText(7, 0, getLabel(EnterpriseMap.ADDRESS_APPARTMENT_NR));
		addressTable
				.setText(8, 0, getLabel(EnterpriseMap.ADDRESS_POSTAL_INDEX));//"Indeks:");
		addressTable.setText(9, 0, getLabel(EnterpriseMap.PHONE));//"Telefon:
		addressTable.setText(10, 0, getLabel(EnterpriseMap.FAX));//"Faks:
		addressTable.setText(11, 0, getLabel(EnterpriseMap.EMAIL));//"Email:


		ListBox addressListBox = new ListBox();
		addressListBox.setWidth("11em");
		addressTable.setWidget(1, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_COUNTRY_CODE, addressListBox, null, null, Validators.REQUIRED));
		addressTable.setWidget(2, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_DISTRICT, new TextBox()));
		addressTable.setWidget(3, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_ORG_UNIT, new TextBox()));
		TextBox townBox = new TextBox();
		townBox.setMaxLength(50);
		addressTable.setWidget(4, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_TOWN, townBox));
		TextBox streetBox = new TextBox();
		streetBox.setMaxLength(50);
		addressTable.setWidget(5, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_STREET, streetBox));
		TextBox houseBox = new TextBox();
		houseBox.setMaxLength(10);
		addressTable.setWidget(6, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_HOUSE, houseBox));
		TextBox appNrBox = new TextBox();
		appNrBox.setMaxLength(10);
		addressTable.setWidget(7, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_APPARTMENT_NR, appNrBox));
		addressTable.setWidget(8, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.ADDRESS_POSTAL_INDEX, new TextBox()));
		addressTable.setWidget(9, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.CONTACT_PHONE, new TextBox()));
		addressTable.setWidget(10, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.CONTACT_FAX, new TextBox()));
		TextBox email = new TextBox();
		email.setMaxLength(320);
		addressTable.setWidget(11, 2, addFormField(CHANGE_FORM,
				EnterpriseMap.CONTACT_EMAIL, email));


		UIutils.setTableTextStyled(addressTable);

		/* --BUTTON PANEL-- */
		HorizontalPanel buttonPanel = new HorizontalPanel();

      //add the back
      if(getSelectReturnCallback() != null) {
    	  ABaseDTOMap newmap = (ABaseDTOMap)getData();
    	  Button back = UIutils.createButton(new SelectReturnListener(this,newmap), getLabel("buttonBack"));
    	  buttonPanel.add(back);
      } else {
    	  if(parent != null && parent instanceof StateFeeForm){
    		  	Button back = new OFButton("Tagasi", parent);
  				buttonPanel.add(back);
    	  }else{
	    	  buttonPanel.add(new Button(getLabel("buttonBack"), new ReturnListener(this, parent){
	    		  public void onReturn() {
	    			  EnterpriseList entForm = (EnterpriseList) parent;
	    			  entForm.updateEnterprise();
	    		  }
	    	  })); // "Tagasi"
    	  }
      }
		buttonPanel.add(UIutils.createSpacer(6, 1));
		buttonPanel.add(new Button(getLabel("buttonBusRegQuery"),
				new BusinessRegistryListener())); //"Äriregistri päring"
		buttonPanel.add(UIutils.createSpacer(6, 1));
		buttonPanel.add(new Button(getLabel("buttonMTRQuery"),
				new MTRListener())); //"MTR päring"
		buttonPanel.add(UIutils.createSpacer(6, 1));
		buttonPanel.add(new Button(getLabel("buttonClear"),
				new ClearButtonListener()));
      if (UIutils.userHasPriviledge(new String[] { ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_EIT_GRP })) {
         buttonPanel.add(UIutils.createSpacer(6, 1));
		   buttonPanel.add(new Button(getLabel("buttonSave"), new  SaveListener()));//"Salvesta"
      }


		/* --END BUTTON PANEL-- */

		FlexTable details = new FlexTable();
		details.setCellSpacing(0);
		details.setCellPadding(0);
		details.setWidth("400px");

		Label detailsTitleLabel = new Label(
				getLabel("enterpriseDetailsTableTitle"));//"Ettevõtte andmed");
		detailsTitleLabel.setStyleName("Title");
		details.setWidget(0, 0, detailsTitleLabel);
		details.setWidget(1, 0, UIutils.createSpacer(400, 1));
		details.setWidget(2, 0, detailsTable);
		details.getFlexCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);

		FlexTable representative = new FlexTable();
		representative.setCellSpacing(0);
		representative.setCellPadding(0);

		/*Label representativeTitleLabel = new Label(
				getLabel("enterpriseRepresentativeTableTitle"));//"Ettevõtte esindaja");
		representativeTitleLabel.setStyleName("Title");
		representative.setWidget(0, 0, representativeTitleLabel);
		representative.setWidget(1, 0, UIutils.createSpacer(400, 1));
		representative.setWidget(2, 0, representativeTable);
		representative.getFlexCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);*/

		FlexTable address = new FlexTable();
		address.setCellSpacing(0);
		address.setCellPadding(0);
		address.setWidth("400px");

		Label addressTitleLabel = new Label(
				getLabel("enterpriseAddressTableTitle"));//"Ettevõtte konktaktaadress");
		addressTitleLabel.setStyleName("Title");
		address.setWidget(0, 0, addressTitleLabel);
		address.setWidget(1, 0, UIutils.createSpacer(400, 1));
		address.setWidget(2, 0, addressTable);
		address.getFlexCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);

		/* --MAIN TABLE-- */
		main.setCellSpacing(0);
		main.setCellPadding(0);
		main.setWidth("800px");

		main.setWidget(0, 0, details);
		main.setWidget(1, 0, representative);
		main.setWidget(0, 1, address);
		main.getFlexCellFormatter().addStyleName(0, 0, "enterpriseDetails");
		main.getFlexCellFormatter().setVerticalAlignment(0, 1,
				HasVerticalAlignment.ALIGN_TOP);
		main.setWidget(2, 0, buttonPanel);
		main.getFlexCellFormatter().setColSpan(2, 0, 2);
		main.getFlexCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		// Don't show before roles classificator is loaded

		askClassificators();
		initWidget(main);

		/* --END MAIN TABLE-- */

	}

	private void makeEnterpriseRolesCheckBoxes(List roles) {
		CheckBoxList checks = (CheckBoxList) getFormField(CHANGE_FORM,
				EnterpriseMap.ENTERPRISE_ROLES);

		for (Iterator it = roles.iterator(); it.hasNext();) {

			ClassItemMap item = (ClassItemMap) it.next();
			
			String code = item.getText(ClassItemMap.CODE);
			
			if(!codes.contains((code))){
			checks.addItem(item.getText(ClassItemMap.NAME), item
					.getText(ClassItemMap.CODE));
			codes.add(code);
			}
			}
	}

	/**
	 * CacheListener method.
	 */
	public void avail(String key, Object value) {
		if (value instanceof Throwable)
			setError(value.toString());
		else if (key.equals(ServiceContext.ENTERPRISE_ROLES)) {
			makeEnterpriseRolesCheckBoxes((List) value);
		} else if (key.equals(ServiceContext.COUNTRIES)) {
			makeClassSelectionList(CHANGE_FORM,
					EnterpriseMap.ADDRESS_COUNTRY_CODE, (List) value);
			setFromFormFieldsEnterpriseData();
			setDefaultCountryIfEnterpriseIdIsNull();
		}
	}

	private void setDefaultCountryIfEnterpriseIdIsNull(){
		if(getData() != null && getData().getProperty(EnterpriseMap.ID) == null) {
			setListBoxSelectedIndexByValue(CHANGE_FORM, EnterpriseMap.ADDRESS_COUNTRY_CODE, "EE");
		}
	}

	private void askClassificators() {
		List roles = (List) ServiceContext.getInstance().getCached(
				ServiceContext.ENTERPRISE_ROLES);
		if (roles != null) {
			makeEnterpriseRolesCheckBoxes(roles);
		}
		List countries = (List) ServiceContext.getInstance().getCached(
				ServiceContext.COUNTRIES);
		if (countries != null) {
			makeClassSelectionList(CHANGE_FORM,
					EnterpriseMap.ADDRESS_COUNTRY_CODE, countries);
			setFromFormFieldsEnterpriseData();
			setDefaultCountryIfEnterpriseIdIsNull();
		}
	}

	protected void setEnterpriseDataFromFormFields() {
		super.setDataFromFormFields(CHANGE_FORM);
		String name = (String) getData().getProperty(
				EnterpriseMap.REPRESENTATIVE_NAME);

		if (checkIfNull(name) != null) {
			String[] names = name.split(" ");
			getData().setProperty(EnterpriseMap.REPRESENTATIVE_FIRSTNAME,
					names[0]);
			if (names.length > 1 && names[1] != null)
				getData().setProperty(EnterpriseMap.REPRESENTATIVE_LASTNAME,
						names[1]);
		}
	}

	private void setFromFormFieldsEnterpriseData() {

		String firstName = (String) getData().getProperty(
				EnterpriseMap.REPRESENTATIVE_FIRSTNAME);
		String lastName = (String) getData().getProperty(
				EnterpriseMap.REPRESENTATIVE_LASTNAME);

		StringBuffer sbuf = new StringBuffer();
		if (firstName != null)
			sbuf.append(firstName);
		if (firstName != null && lastName != null)
			sbuf.append(" ");
		if (lastName != null)
			sbuf.append(lastName);

		getData().setProperty(EnterpriseMap.REPRESENTATIVE_NAME,
				sbuf.toString());
		super.setFormFieldsFromData(CHANGE_FORM);
	}

	private EnterpriseMap getDataFromFormFields() {
		setDataFromFormFields(CHANGE_FORM);
		return (EnterpriseMap) getData();
	}

	public void updateFormData(EnterpriseMap data) {
		EnterpriseMap oldData = getDataFromFormFields();
		Object oldRegId = oldData.getProperty(EnterpriseMap.REG_ID);
		Object regId = data.getProperty(EnterpriseMap.REG_ID);
		if (regId != null && oldRegId != null && regId.equals(oldRegId)) {
			EnterpriseMap mergedData = data.mergeWithOldData(oldData);
			setData(mergedData);
		} else {
			setData(data);
		}
		setFormFieldsFromData(Form.CHANGE_FORM);
		Object countryCode = data.getProperty(EnterpriseMap.ADDRESS_COUNTRY_CODE);
		if (countryCode == null) {
			setListBoxSelectedIndexByValue(CHANGE_FORM, EnterpriseMap.ADDRESS_COUNTRY_CODE, "EE");
		}
		clearErrors();
	}

	private class ClearButtonListener implements ClickListener {

		public void onClick(Widget arg0) {
			EnterpriseMap cleanEnterprise = new EnterpriseMap();
			EnterpriseDetails.this.setData(cleanEnterprise);
			EnterpriseDetails.this.setFormFieldsFromData(Form.CHANGE_FORM);
			jumpToTop();
		}
	}

	private class BusinessRegistryListener implements ClickListener {

		public void onClick(Widget sender) {

			final String entName = (String)
				EnterpriseDetails.this.getFormFieldValue(CHANGE_FORM, EnterpriseMap.NAME);
			final String entRegNr = (String)
			EnterpriseDetails.this.getFormFieldValue(CHANGE_FORM, EnterpriseMap.REG_ID);

			EnterpriseDetails.this.clearErrors();
			
			ServiceContext.getInstance().getExternalService()
				.makeBusinessRegisterQuery(entName, entRegNr, new AsyncCallback() {

					public void onFailure(Throwable caught) {
						EnterpriseDetails.this.setError(getLabel("businessRegError"));
						jumpToTop();
					}

					public void onSuccess(Object result) {
						if (result != null) {
							ObjectList entList = (ObjectList)result;
							if (entList.size() > 0) {
								EnterpriseMap enterprise = (EnterpriseMap)entList.get(0);
								if (enterprise != null && enterprise.containsKey(EnterpriseMap.NAME)) {
									if (entList.size() == 1) {
										EnterpriseDetails.this.updateFormData(enterprise);
									} else {
										EnterpriseSelection selection = new EnterpriseSelection(EnterpriseDetails.this, entList);
										selection.setPopupPosition(424, 148);
										selection.show();
									}
								}
							} else {
								EnterpriseDetails.this.setError(getLabel("emptyResult"));
							}
						}
						jumpToTop();
					}
				});
		}
	}
	
	private class MTRListener implements ClickListener {

		public void onClick(Widget sender) {			
			EnterpriseDetails.this.clearErrors();
			EnterpriseDetails.this.setEnterpriseDataFromFormFields();		
			EnterpriseDetails.this.clearErrors();		
			
			final String entRegNr = (String)EnterpriseDetails.this.getData().getProperty(EnterpriseMap.REG_ID);
			if(entRegNr == null)return;
			
			ServiceContext.getInstance().getExternalService()
				.makeMTRAndCustomsQuery(entRegNr, new AsyncCallback() {

					public void onFailure(Throwable caught) {
						EnterpriseDetails.this.setError(getLabel("mtrRegError"));
						jumpToTop();
					}

					public void onSuccess(Object result) {
						if (result != null) {
							MtrAndCustomsQueryResultMap resultMap = (MtrAndCustomsQueryResultMap) result;
							List licenseList = (List) resultMap.getProperty(MtrAndCustomsQueryResultMap.MTR_LICENSES);
							if (licenseList != null && licenseList.size() > 0) {
								MTRLicenseSelection selection = new MTRLicenseSelection(EnterpriseDetails.this, resultMap);
								selection.setPopupPosition(424, 148);
								selection.show();
							} else {
								EnterpriseDetails.this.setError(getLabel("emptyResult"));
							}
						}
						jumpToTop();
					}
				});
		}

	}

   /**
    * Salvestamise kuular.
    *
    * @author viktorb
    */
	private class SaveListener implements ClickListener, AsyncCallback {

		private String text="";
		
      public void onClick(Widget sender) {
         setEnterpriseDataFromFormFields();
         if (EnterpriseDetails.this.getErrors() != null && !EnterpriseDetails.this.getErrors().isEmpty()) {
            for(int i = 0; i < getErrors().size(); i++) {
            	EnterpriseDetails.this.setError((String)getErrors().get(i));
            }
         } else {
        	 if(getData().getProperty(EnterpriseMap.BALANCE) == null) {
        		 getData().setProperty(EnterpriseMap.BALANCE, "0");
        	 }
        	 if(getData().getProperty(EnterpriseMap.ID) != null && getData().getProperty(EnterpriseMap.ID).toString().trim().length()!=0) {
        		 text = getLabel("enterpriseDataUpdated");
        	 } else {
        		 text = getLabel("enterpriseDataInserted");
        	 }
        	 ServiceContext.getInstance().getRegistryService().saveOrUpdate(
        			 (EnterpriseMap) cleanDataBeforeSave(getData()), this);
         }
      }

      public void onFailure(Throwable caught) {
         setError(caught.toString());
         jumpToTop();
      }

      public void onSuccess(Object result) {
         setData((EnterpriseMap) result);
         EnterpriseDetails.this.setButtonsEnabled(true);
    	 EnterpriseDetails.this.setInfo(text);
    	 if(getSelectReturnCallback() != null) {
    		 returnToParentWithData();
    		 jumpToTop();
    		 
    	 }
      }

   }

	private abstract class ReturnListener extends ReturnFormListener {

		ReturnListener(Form currForm, Form openForm) {
			super(currForm, openForm);
		}

		public void onClick(Widget sender) {
			EnterpriseDetails.this.setData(new EnterpriseMap());
			EnterpriseDetails.this.resetFormFields(CHANGE_FORM);
			super.onClick(sender);
		}

	}

}
