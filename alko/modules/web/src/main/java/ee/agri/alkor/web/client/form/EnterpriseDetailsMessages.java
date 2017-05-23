package ee.agri.alkor.web.client.form;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface EnterpriseDetailsMessages extends ConstantsWithLookup {

	String name();
	String registrationId();
	String exciseStoreHouseNr();
	String acknowledgementNr();
	String acknowledgementDate();
	String MTRCode();
	String enterpriseRepresentative_name();
	String enterpriseRepresentative_registrationId();
	String enterpriseRepresentative_occupation();
	String address_country_code();
	String address_district();
	String address_orgUnit();
	String address_address();
	String address_postalIndex();
	String address_street();
	String address_town();
	String address_house();
	String address_appartmentNr();
	String buttonBack();
	String buttonBusRegQuery();
	String buttonMTRQuery();
	String buttonClear();
	String buttonSave();
	String enterpriseDetailsTableTitle();
	String enterpriseRepresentativeTableTitle();
	String enterpriseAddressTableTitle();
	String phone();
	String fax();
	String email();
	String changeReason();
	String emptyResult();
	String businessRegError();
	String mtrRegError();
	String enterpriseDataUpdated();
	String enterpriseDataInserted();
	String active();
}