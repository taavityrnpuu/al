package ee.agri.alkor.xtee.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.StringHolder;
import javax.xml.soap.SOAPElement;

import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

import com.google.gwt.user.client.Window;

import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.ContactInfo;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.service.SystemException;
import ee.riik.xtee.arireg.producers.producer.arireg.AriregPort;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_evaadress;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring_koodiga;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring_nimega;
import ee.riik.xtee.arireg.producers.producer.arireg.holders.Paringliht_v4_paringHolder;
import ee.riik.xtee.arireg.producers.producer.arireg.holders.Paringliht_v4_vastusHolder;

import java.sql.ResultSet;
import java.util.UUID;
import eu.x_road.arireg.producer.AriregLocator;
import eu.x_road.arireg.producer.AriregXteeStub;
import ee.agri.alkor.service.SystemException;
import eu.x_road.arireg.producer.*;
import eu.x_road.arireg.producer.holders.*;
import eu.x_road.xsd.identifiers.*;
import ee.agri.alkor.service.ServiceFactory;

import org.apache.axis.message.*;
import javax.xml.soap.SOAPElement;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.service.AuthenticationServiceDelegate;

/**
 * 
 * @author suisalu
 *
 */
public class EnterpriseRegisterQueryImpl {
	
	private static long ENTERPRISE_LIMIT = 100L;
	
	/*
	 * Lubatud on est ja eng
	 */
	private static final String ESTONIAN = "est";
	
	private static Logger LOGGER = Logger
			.getLogger(EnterpriseRegisterQueryImpl.class);

	private String serviceEndpointURL;

	private String queryingEnterpriseRegNr;

	private String queringPersonRegNr;

	public Enterprise findEnterprise(String name, String regNr) {
		
		String url = "";
		try {
			HashMap<String, String> rs = ServiceFactory.getRegistryService().getConfigFromDatabase();
			url = rs.get("XTEESERVICE_URL");

			LOGGER.debug("arireg xtee findEnterprise: name: '"+ name + "', regNr: '"+ regNr + "'");
			
			AriregLocator service = new AriregLocator();
			AriregXteeStub port = null;
		
			port = (AriregXteeStub) service.getAriregXtee(new URL(url));
			
			List<SOAPHeaderElement> elems = makeParingHeaders(getQueringPersonRegNr());
			for(SOAPHeaderElement elem : elems){
				port.setHeader(elem);
			}
	
			if(name != null) {
				name = name.trim();
			}
			if(regNr != null) {
				regNr = regNr.trim();
			}

			Detailandmed_v5_Query keha = new Detailandmed_v5_Query();
			if(regNr != null && regNr.length() > 0){
				BigInteger regNumber = new BigInteger(regNr);
	            keha.setAriregistri_kood(regNumber);
			}
			if(name != null && name.length() > 0) {
	            keha.setArinimi(name);
			}
            keha.setYandmed(true);
            keha.setIandmed(false);
            keha.setKandmed(false);
            keha.setDandmed(false);
            keha.setMaarused(false);
         
            Detailandmed_v5_VastusHolder result = new Detailandmed_v5_VastusHolder();
			Detailandmed_v5_QueryHolder paringHolder = new Detailandmed_v5_QueryHolder();
	
			try {
				port.detailandmed_v1(keha, paringHolder, result);
			} catch (Exception e) {
				throw new SystemException(e);
			}
			int evsize = result.value.getEttevotjad().length;
			if (LOGGER.isDebugEnabled())
				LOGGER.debug("Enterprise query for name: '"+ name + "', regNr: '"+ regNr + "' result size=" + evsize);
			if (evsize > 0) {
				return convertNew(result.value.getEttevotjad()[0]);
			}
		} catch (Exception x) {
			x.printStackTrace();
		}
		return null;
	}
	
	private Enterprise convertNew(Detailandmed_v5_ettevotja resultItem) {
		String regnr = String.valueOf(resultItem.getAriregistri_kood());
		
		Enterprise ent = ServiceFactory.getRegistryService().getEnterprise(regnr);
		if(ent == null){
			ent = new Enterprise();
		}

		Detailandmed_v5_yldandmed yandmed = resultItem.getYldandmed();

		ent.setName(resultItem.getNimi());
		ent.setRegistrationId(regnr);
		
		Detailandmed_v5_aadress[] aadressid = yandmed.getAadressid();
		if(aadressid.length > 0){
			for(Detailandmed_v5_aadress aadress : aadressid){
				if(aadress.getLopp_kpv() == null || aadress.getLopp_kpv().equals("")){
					Address adr = new Address();
					
					Country c = (Country)ServiceFactory.getClassificatorService().find("Country", "EE");
					adr.setCountry(c);
					adr.setPostalIndex(aadress.getPostiindeks());
					
					try{
						adr.setDistrict(aadress.getEhak_nimetus().split(",")[1]);
					} catch(Exception x){
						x.printStackTrace();
					}
					
					try{
						adr.setOrgUnit(aadress.getEhak_nimetus().split(",")[0]);
						adr.setTown(aadress.getEhak_nimetus().split(",")[0]);
					} catch(Exception x){
						x.printStackTrace();
					}
					
					try{
						String[] sp = aadress.getTanav_maja_korter().split(" ");

						if(sp.length > 0) {
							String[] street = new String[sp.length-1];
							for(int i = 0; i < sp.length-1 ;i++){
								street[i] = sp[i];
							}
							adr.setStreet(String.join(" ", street));
						}
						
						if(sp[sp.length-1].contains("-")){
							String[] apartment = sp[sp.length-1].split("-");
							adr.setHouse(apartment[0]);
							adr.setAppartmentNr(apartment[1]);
						}
						else{
							adr.setHouse(sp[sp.length-1]);
						}
					} catch(Exception x){
						x.printStackTrace();
					}
					
					ent.setAddress(adr);
				}
			}
		}
		
		Detailandmed_v5_sidevahend[] sided = yandmed.getSidevahendid();
		if(sided.length > 0){
			ContactInfo cti = new ContactInfo();
			for(Detailandmed_v5_sidevahend side : sided){
				if(side.getLopp_kpv() == null || side.getLopp_kpv().equals("")){
					
					if(side.getLiik().equals("MOB")){
						cti.setPhone(side.getSisu());
					}
					else if(side.getLiik().equals("EMAIL")){
						cti.setEmail(side.getSisu());
					}
					else if(side.getLiik().equals("TEL") && (cti.getPhone() == null || cti.getPhone().equals(""))){
						cti.setPhone(side.getSisu());
					}
					else if(side.getLiik().equals("FAX")){
						cti.setFax(side.getSisu());
					}
					else{
						System.out.println("- - - - - - - - - - TUNDMATU LIIK: "+side.getLiik());
					}
					
					ent.setContactInfo(cti);
				}
			}
		}
		
		/*
		Address address = new Address();
		Paringliht_v5_evaadress resultAddress =	resultItem.getEvaadressid();
		
		if (resultAddress != null) {
			splitAddress(resultAddress.getAsukoht_ettevotja_aadressis(),
					address);
			address.setPostalIndex(resultAddress
					.getIndeks_ettevotja_aadressis());
			if ("0".equals(resultAddress.getAsukoha_ehak_kood())) {
				address.setDistrict(resultAddress.getAsukoha_ehak_tekstina());
			} else {
				address.setOrgUnit(resultAddress.getAsukoha_ehak_tekstina());
			}
		}
		ent.setAddress(address);
		*/

		return ent;
	}

	
	private List<SOAPHeaderElement> makeParingHeaders(String ik){
		List<SOAPHeaderElement> elems = new ArrayList<SOAPHeaderElement>();
		
		String XROAD_NS = "http://x-road.eu/xsd/xroad.xsd";
		String IDENT_NS = "http://x-road.eu/xsd/identifiers";
		
		
		String protocolVersion = "";
		String userId = ik;
		String id = UUID.randomUUID().toString();
		String issue = "";
		
		String xRoadInstance = "";
		String memberClass = "";
		String memberCode = "";
		String subsystemCode = "";
		String serviceCode = "";
		String serviceVersion = "";
		
		String sender_xRoadInstance = "";
		String sender_memberClass = "";
		String sender_memberCode = "";
		String sender_subsystemCode = "";

		HashMap<String, String> rs = ServiceFactory.getRegistryService().getConfigFromDatabase();

		protocolVersion = rs.get("XTEE_PROTOCOL_VERSION");
		issue = rs.get("XTEE_ISSUE_DETAIL");
		xRoadInstance = rs.get("XTEE_XROADINSTANCE");
		memberClass = rs.get("XTEE_MEMBERCLASS");
		memberCode = rs.get("XTEE_MEMBERCODE");
		subsystemCode = rs.get("XTEE_SUBSYSTEMCODE");
		serviceCode = rs.get("XTEE_SERVICECODE_DETAIL");
		serviceVersion = rs.get("XTEE_SERVICEVERSION_DETAIL");
		sender_xRoadInstance = rs.get("XTEE_SENDER_XROADINSTANCE");
		sender_memberClass = rs.get("XTEE_SENDER_MEMBERCLASS");
		sender_memberCode = rs.get("XTEE_SENDER_MEMBERCODE");
		sender_subsystemCode = rs.get("XTEE_SENDER_SUBSYSTEMCODE");
	
		try {
			elems.add(new SOAPHeaderElement(XROAD_NS, "protocolVersion", protocolVersion));
			elems.add(new SOAPHeaderElement(XROAD_NS, "userId", userId));
			elems.add(new SOAPHeaderElement(XROAD_NS, "id", id));
			elems.add(new SOAPHeaderElement(XROAD_NS,"issue", issue));
			

			SOAPHeaderElement header1 = new SOAPHeaderElement(XROAD_NS, "service");
			header1.setAttribute(IDENT_NS, "objectType", "SERVICE");
			header1.addNamespaceDeclaration("iden", IDENT_NS);
			
			SOAPElement node = header1.addChildElement("xRoadInstance", "iden");
			node.addTextNode(xRoadInstance);
			node.setPrefix("iden");
			
			SOAPElement node2 = header1.addChildElement("memberClass", "iden");
			node2.addTextNode(memberClass);
			
			SOAPElement node3 = header1.addChildElement("memberCode", "iden");
			node3.addTextNode(memberCode);
			
			SOAPElement node4 = header1.addChildElement("subsystemCode", "iden");
			node4.addTextNode(subsystemCode);
			
			SOAPElement node5 = header1.addChildElement("serviceCode", "iden");
			node5.addTextNode(serviceCode);
			
			SOAPElement node6 = header1.addChildElement("serviceVersion", "iden");
			node6.addTextNode(serviceVersion);
			
			elems.add(header1);

			SOAPHeaderElement header2 = new SOAPHeaderElement(XROAD_NS, "client");
			header2.setAttribute(IDENT_NS, "objectType", "SUBSYSTEM");
			header2.addNamespaceDeclaration("iden", IDENT_NS);
			
			SOAPElement node7 = header2.addChildElement("xRoadInstance", "iden");
			node7.addTextNode(sender_xRoadInstance);
			
			SOAPElement node8 = header2.addChildElement("memberClass", "iden");
			node8.addTextNode(sender_memberClass);
			
			SOAPElement node9 = header2.addChildElement("memberCode", "iden");
			node9.addTextNode(sender_memberCode);
			
			SOAPElement node10 = header2.addChildElement("subsystemCode", "iden");
			node10.addTextNode(sender_subsystemCode);

			elems.add(header2);
			
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		return elems;
	}
	
	/*public ArrayList<Enterprise> findEnterprise(String name, String regNr) {
		AriregLocator service = new AriregLocator();
		AriregPort port = null;
		LOGGER.info("Connecting : " + getServiceEndpointURL());
		try {
			port = service.getAriregPort(new URL(getServiceEndpointURL()));
		} catch (Exception e) {
			throw new SystemException(e);
		}
		((Stub) port)._setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);

		BigInteger entLimit = BigInteger.valueOf(ENTERPRISE_LIMIT);
		BigInteger regNumber = null;
		if (name != null) {
		   name = name.toLowerCase();
		}
		
		if (regNr != null) {
			regNumber = new BigInteger(regNr);
			entLimit = BigInteger.valueOf(0L);
		}
		LOGGER.debug("Paringliht_v4_paring - name:" + name
				+ " regNumber:" + regNumber
				+ " entLimit:" + entLimit);
		Paringliht_v4_paring keha = null;

      if (name != null && regNr == null)
      {
         keha = new Paringliht_v4_paring_nimega(name, entLimit, ESTONIAN);
      }
      else if (name == null && regNr != null)
      {
         keha = new Paringliht_v4_paring_koodiga(regNumber, entLimit, ESTONIAN);
      }
      else
      {
         if(name == null)
         {
            throw new SystemException("Päringu sooritamiseks tuleb määrata nimi");
         }
         else
         {
            keha = new Paringliht_v4_paring(name, entLimit, ESTONIAN);
         }
      }
		Paringliht_v4_vastusHolder result = new Paringliht_v4_vastusHolder();
		Paringliht_v4_paringHolder paringHolder = new Paringliht_v4_paringHolder();
		StringHolder andmekogu = new StringHolder("arireg");
		StringHolder asutus = new StringHolder(getQueryingEnterpriseRegNr());
		StringHolder isikukood = new StringHolder(getQueringPersonRegNr());
		StringHolder nimi = new StringHolder("arireg.paringliht_v4.v1");
		StringHolder id = new StringHolder(genNonce());
		StringHolder toimik = new StringHolder("");
		try {
			port.paringliht_v4(keha, asutus, andmekogu, isikukood, id, nimi, toimik , paringHolder, result);
		} catch (Exception e) {
			throw new SystemException(e);
		}
		int evsize = result.value.getEttevotjad().length;
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("Enterprise query for name: ' +" + name + "' regNr: '"
					+ regNr + "' result size=" + evsize);
		if (evsize > 0) {
			ArrayList<Enterprise> enterprises = new ArrayList<Enterprise>();
			for (int i = 0; i < evsize; i++) {
				Enterprise enterprise = convertNew(result.value.getEttevotjad()[i]);
				enterprises.add(enterprise);
			}
			return enterprises;
		}
		return null;
	}*/

	private static String genNonce() {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[40];
		random.nextBytes(bytes);
		StringBuffer nonce = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			int b = bytes[i] & 0xFF;
			if (b < 0x10)
				nonce.append('0');
			nonce.append(Integer.toHexString(b));
		}
		return nonce.toString();
	}

	public String getServiceEndpointURL() {
		return serviceEndpointURL;
	}

	public void setServiceEndpointURL(String serviceEndpointURL) {
		this.serviceEndpointURL = serviceEndpointURL;
	}

	public String getQueringPersonRegNr() {
		if(queringPersonRegNr != null && !queringPersonRegNr.equals("")){
			return queringPersonRegNr;
		}
		else{
			Object curUser = AuthenticationServiceDelegate.getCurrentUser();
		    AlkoUserDetails userDetails = (AlkoUserDetails)curUser;       
		    return userDetails.getIdCode();
		}
	}

	public void setQueringPersonRegNr(String queringPersonRegNr) {
		this.queringPersonRegNr = queringPersonRegNr;
	}

	public String getQueryingEnterpriseRegNr() {
		return queryingEnterpriseRegNr;
	}

	public void setQueryingEnterpriseRegNr(String queryingEnterpriseRegNr) {
		this.queryingEnterpriseRegNr = queryingEnterpriseRegNr;
	}
	
	/**
	 * Leiab loodetavasti tänava maja aadressi stringist.
	 * 
	 * @param address
	 * @param address
	 */
	private void splitAddress(String addressString, Address address) {
		if (addressString == null)
			return;
		String parts[] = addressString.split(" ");
		StringBuffer sb = new StringBuffer(parts[0]);
		for (int i = 1; i < (parts.length - 1); i++)
			sb.append(" ").append(parts[i]);

		address.setStreet(sb.toString());
		if (parts.length > 1) {
			String[] parts2 = parts[parts.length - 1].split("[-/]");
			address.setHouse(parts2[0]);
			if (parts2.length > 1)
				address.setAppartmentNr(parts2[1]);
		}
	}
}
