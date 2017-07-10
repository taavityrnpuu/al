package ee.agri.alkor.xtee;

import java.util.ArrayList;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.apache.axis.message.SOAPHeaderElement;
import org.springframework.beans.factory.InitializingBean;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.xtee.impl.EnterpriseRegisterQueryImpl;
import ee.agri.alkor.xtee.impl.CustomsQueryImpl;
import ee.agri.alkor.xtee.impl.MtrQueryImpl;

import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.StringHolder;
import java.util.UUID;
import eu.x_road.arireg.producer.AriregLocator;
import eu.x_road.arireg.producer.AriregXteeStub;
import ee.agri.alkor.service.SystemException;
import eu.x_road.xsd.identifiers.*;
import ee.agri.alkor.xtee.MTRLicense;
import ee.agri.alkor.service.ServiceFactory;

import org.apache.axis.message.*;
import javax.xml.soap.SOAPElement;
import ee.x_road.mtr.producer.*;
import ee.x_road.mtr.producer.holders.*;


import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.service.AuthenticationServiceDelegate;

/**
 * 
 * @author suisalu
 *
 */
public class XteeQueryService implements IXteeServices, InitializingBean {


	private String serviceEndpointURL1;
	private String serviceEndpointURL2;

	private String queryingEnterpriseRegNr;

	private String queringPersonRegNr;

	private EnterpriseRegisterQueryImpl erImpl = new EnterpriseRegisterQueryImpl();

	private CustomsQueryImpl esImpl = new CustomsQueryImpl();

	//private MtrQueryImpl mtrImpl = new MtrQueryImpl();

	public void afterPropertiesSet() throws Exception {
		erImpl.setServiceEndpointURL(serviceEndpointURL2);
		erImpl.setQueringPersonRegNr(queringPersonRegNr);
		erImpl.setQueryingEnterpriseRegNr(queryingEnterpriseRegNr);
		//mtrImpl.setServiceEndpointURL(serviceEndpointURL2);
		//mtrImpl.setQueringPersonRegNr(queringPersonRegNr);
		//mtrImpl.setQueryingEnterpriseRegNr(queryingEnterpriseRegNr);
		esImpl.setServiceEndpointURL(serviceEndpointURL2);
		esImpl.setQueringPersonRegNr(queringPersonRegNr);
		esImpl.setQueryingEnterpriseRegNr(queryingEnterpriseRegNr);
	}

	public Enterprise queryEnterprise(String regNr) {
		return erImpl.findEnterprise(regNr);
	}

	public MtrAndCustomsQueryResult queryMTRAndCustoms(String regNr) {
		MtrAndCustomsQueryResult result = new MtrAndCustomsQueryResult();
		
		String url = "";
		try {
			HashMap<String, String> rs = ServiceFactory.getRegistryService().getConfigFromDatabase();
			url = rs.get("XTEESERVICE_URL_MTR");
			
			System.out.println(url);
			
			MtrLocator service = new MtrLocator();
			Mtr_bindingStub port = null;
		
			port = (Mtr_bindingStub) service.getmtr_porttype(new URL(url));

			List<SOAPHeaderElement> elems = makeParingHeaders(getQueringPersonRegNr());
			for(SOAPHeaderElement elem : elems){
				port.setHeader(elem);
			}

			System.out.println("RegistreeringParing - regNumber:" + regNr);
			RegistreeringParing keha = new RegistreeringParing();

            keha.setKood(regNr);
            keha.setKirjetearv(SoovitudKirjeteArv.fromValue(new BigInteger("10")));
         
            RegistreeringParingHolder paringHolder = new RegistreeringParingHolder(keha);

            RegistriKanneVastus vastus = null; TegevuslubaVastusV2 vastus2 = null;
			try {
				vastus = port.registreering(paringHolder);
			} catch (Exception e) {
				throw new SystemException(e);
			}
			
			if (vastus != null) {

				result.setEneterPriseRegistrationNr(regNr);
				//result.setMtrRegstrationDate(paringHolder.getRegkp());
				//result.setExciseLicenseValidDate(???);
				
				for(RegistriKanneVastusKirjedKirje kirje : vastus.getKirjed()){
					MTRLicense license = new MTRLicense();
					RegistrikanneType kanne = kirje.getRegistrikanne();
					
					license.setBusinessName(kanne.getTegevusala());
					license.setNr(kanne.getRegnr());
					license.setDate(kanne.getRegistreerimisekp());

					result.addLicense(license);
				}
				
			}
			
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		//mtrImpl.query(enterpriseRegNr, result);
		return result;
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
		issue = rs.get("XTEE_ISSUE_MTR");
		xRoadInstance = rs.get("XTEE_XROADINSTANCE_MTR");
		memberClass = rs.get("XTEE_MEMBERCLASS_MTR");
		memberCode = rs.get("XTEE_MEMBERCODE_MTR");
		subsystemCode = rs.get("XTEE_SUBSYSTEMCODE_MTR");
		serviceCode = rs.get("XTEE_SERVICECODE_MTR");
		serviceVersion = rs.get("XTEE_SERVICEVERSION_MTR");
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
	
	public String getQueringPersonRegNr() {
		Object curUser = AuthenticationServiceDelegate.getCurrentUser();
		AlkoUserDetails userDetails = (AlkoUserDetails)curUser;       
	 	return userDetails.getIdCode();
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

	public String getServiceEndpointURL1() {
		return serviceEndpointURL1;
	}

	public String getServiceEndpointURL2() {
		return serviceEndpointURL2;
	}

	public void setServiceEndpointURL1(String serviceEndpointURL) {
		this.serviceEndpointURL1 = serviceEndpointURL;
	}

	public void setServiceEndpointURL2(String serviceEndpointURL) {
		this.serviceEndpointURL2 = serviceEndpointURL;
	}
}
