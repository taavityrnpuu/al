package ee.agri.alkor.xtee.impl;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.axis.message.Text;
import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ee.agri.alkor.service.SystemException;
import ee.agri.alkor.xtee.MTRLicense;
import ee.agri.alkor.xtee.MtrAndCustomsQueryResult;

/**
 * 
 * @author suisalu
 *
 */
public class MtrQueryImpl {
	private static Logger LOGGER = Logger.getLogger(MtrQueryImpl.class);

	private String serviceEndpointURL;

	private String queryingEnterpriseRegNr;

	private String queringPersonRegNr;

	private String viimane;
	
	private SimpleDateFormat regDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public void query(String regNr, MtrAndCustomsQueryResult queryResult) {
		SOAPMessage respMessage = null;
		viimane = "";
		try {
			viimane+= getServiceEndpointURL();
			respMessage = makeCall(
					createMessage(createHeader("mtr",
							getQueryingEnterpriseRegNr(),
							getQueringPersonRegNr(), "mtr.registreering.v1"),
							createRegistreerinBody(regNr, 10)),
					getServiceEndpointURL());
		} catch (Exception e) {
			LOGGER.error(e, e);
			throw new SystemException(e);
		}
		// XXX for logging response xml
		try {
		    if (respMessage != null) {
		        LOGGER.debug("MTR query response: " + respMessage.getSOAPBody());
		    }
		} catch (SOAPException e) {
		    LOGGER.error("", e);
		}
		// XXX end
		SOAPPart part = respMessage.getSOAPPart();
		org.w3c.dom.Node node = (Element) part.getElementsByTagName("kirjeid")
				.item(0);

		if(node != null  && node.getChildNodes() != null && node.getChildNodes().getLength() > 0) {
			//Text text = (Text) node.getChildNodes().item(0).getTextContent();
			String count = node.getChildNodes().item(0).getTextContent();
			if (Integer.parseInt(count) > 0) {
				queryResult.setEneterPriseRegistrationNr(regNr);
				NodeList nodes = part.getElementsByTagName("kirje");
				for (int i = 0; i < nodes.getLength(); i++) {
					Element elm = (Element) nodes.item(i);
					NodeList kanded = elm.getElementsByTagName("registrikanne");
					Element kanne = (Element) kanded.item(0);
					String regDateString = getElementValue(kanne,
							"registreerimisekp");
					Date regDate = null;
					try {
						regDate = regDateFormat.parse(regDateString);
					} catch (Exception e) {
						LOGGER.error("Ettevote: '" + regNr
								+ "' registreerimiskp. formaadi viga: ", e);
					}
					String regiNr = getElementValue(kanne, "regnr");
					String businessName = getElementValue(kanne, "tegevusala");
					MTRLicense license = new MTRLicense();
					license.setBusinessName(businessName);
					license.setNr(regiNr);
					license.setDate(regDate);

					queryResult.addLicense(license);
				}
			}
		}
	}

	private String getElementValue(Element parent, String tagName) {
		NodeList nodes = parent.getElementsByTagName(tagName);
		Element tagElm = (Element) nodes.item(0);
		return tagElm.getChildNodes().item(0).getTextContent();
		//Text text = (Text) tagElm.getChildNodes().item(0);
		//return text.getData();
	}

	private SOAPMessage makeCall(String reqMessage, String url)
			throws Exception {
		SOAPConnectionFactory conFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection con = conFactory.createConnection();
		MessageFactory factory = MessageFactory.newInstance();
		SOAPMessage requestMessage = factory.createMessage(new MimeHeaders(),
				new ByteArrayInputStream(reqMessage.getBytes("utf-8")));
		// XXX for logging request xml
		try {
		    if (requestMessage != null) {
		        LOGGER.debug("MTR query request: " + requestMessage.getSOAPBody());
		    }
		} catch (SOAPException e) {
		    LOGGER.error("", e);
		}
		// XXX end
		SOAPMessage message = con.call(requestMessage, new URL(url));
		LOGGER.debug("MTR respone xml: " +message.toString());
		viimane+="\n\r" + message.toString();
		return message;
	}

	private String createMessage(String header, String body) {
		StringBuffer sbuf = new StringBuffer(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
						+ "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"\n"
						+ " xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n"
						+ " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
						+ " xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\"\n"
						+ " xmlns:ns4=\"http://x-road.ee/xsd/x-road.xsd\"\n"
						+ ">\n")
				.append(header).append(body).append("</SOAP-ENV:Envelope>");
		 LOGGER.debug("MTR query xml out: " + sbuf.toString());
		 viimane+= "\n\r" + sbuf.toString();
		return sbuf.toString();
	}

	private String createHeader(String andmekogu, String asutus,
			String isikukood, String meetodiNimi) {
		StringBuffer sbuf = new StringBuffer("<SOAP-ENV:Header>\n");
		sbuf
				.append("<ns4:producer xsi:type=\"xsd:string\">")
				.append(andmekogu)
				.append("</ns4:producer>")
				.append("<ns4:consumer xsi:type=\"xsd:string\">")
				.append(getQueryingEnterpriseRegNr())
				.append("</ns4:consumer>\n")
				.append("<ns4:userId xsi:type=\"xsd:string\">")
				.append(getQueringPersonRegNr())
				.append("</ns4:userId>\n")
				.append(
						"<ns4:id xsi:type=\"xsd:string\">").append(genNonce()).append("</ns4:id>\n")
				.append("<ns4:service xsi:type=\"xsd:string\">").append(
						meetodiNimi).append("</ns4:service>\n").append(
						"</SOAP-ENV:Header>\n");

		return sbuf.toString();
	}
	
	
	/*
	 * 	private String createHeader(String andmekogu, String asutus,
			String isikukood, String meetodiNimi) {
		StringBuffer sbuf = new StringBuffer("<SOAP-ENV:Header>\n");
		sbuf
				.append("<ns4:andmekogu xsi:type=\"xsd:string\">")
				.append(andmekogu)
				.append("</ns4:andmekogu>")
				.append("<ns4:asutus xsi:type=\"xsd:string\">")
				.append(getQueryingEnterpriseRegNr())
				.append("</ns4:asutus>\n")
				.append("<ns4:isikukood xsi:type=\"xsd:string\">")
				.append(getQueringPersonRegNr())
				.append("</ns4:isikukood>\n")
				.append(
						"<ns4:id xsi:type=\"xsd:string\">").append(genNonce()).append("</ns4:id>\n")
				.append("<ns4:nimi xsi:type=\"xsd:string\">").append(
						meetodiNimi).append("</ns4:nimi>\n").append(
						"</SOAP-ENV:Header>\n");

		return sbuf.toString();
	}
	 */

	private String createRegistreerinBody(String regNr, int maxResults) {
		StringBuffer sbuf = new StringBuffer("<SOAP-ENV:Body>\n").append(
				"<xt:registreering xmlns:xt=\"http://mtr.x-road.ee/producer/\">\n"
						+ "<request>\n" + "<kood>").append(regNr).append(
				"</kood>\n" + "<kirjetearv>").append(
				Integer.toString(maxResults)).append(
				"</kirjetearv>\n" + "</request>\n" + "</xt:registreering>\n"
						+ "</SOAP-ENV:Body>\n");
		return sbuf.toString();
	}

	/*
	private String createTegevusloadBody(String regNr, int maxResults) {
		StringBuffer sbuf = new StringBuffer("<SOAP-ENV:Body>\n").append(
				"<tegevusluba xmlns=\"http://producers.mtr.xtee.riik.ee/producer/mtr\">\n"
						+ "<keha>\n" + "<kood>").append(regNr).append(
				"</kood>\n" + "<kirjetearv>").append(
				Integer.toString(maxResults)).append(
				"</kirjetearv>\n" + "</keha>\n" + "</tegevusluba>\n"
						+ "</SOAP-ENV:Body>\n");
		return sbuf.toString();
	}
    */

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
		return queringPersonRegNr;
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

}
