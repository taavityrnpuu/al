
package ee.agri.alkor.xtee.impl;

import org.apache.axis.AxisFault;
import org.apache.axis.Constants;
import org.apache.axis.MessageContext;
import org.apache.axis.ConfigurationException;
import org.apache.axis.description.ServiceDesc;
import org.apache.axis.transport.http.AbstractQueryStringHandler;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.axis.utils.Messages;
import org.apache.axis.utils.XMLUtils;
import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import ee.agri.alkor.model.classes.BottleColor;
import ee.agri.alkor.model.classes.BottleShape;
import ee.agri.alkor.model.classes.Capacity;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.classes.CorkColor;
import ee.agri.alkor.model.classes.CorkMaterial;
import ee.agri.alkor.model.classes.CorkShape;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.PackingMaterial;
import ee.agri.alkor.model.classes.ProductType;
import ee.agri.alkor.model.classes.StockingColor;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.ServiceFactory;
import ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingImpl;

import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * The QSWSDLHandler class is a handler which provides an AXIS service's WSDL
 * document when the query string "wsdl" (ignoring case) is encountered in an
 * AXIS servlet invocation.
 * 
 * @author isuisalu
 * @author Original from Axis source.
 */
public class QSWSDLHandler extends AbstractQueryStringHandler {
	
	private static Logger log = Logger.getLogger(QSWSDLHandler.class);

	/**
	 * Performs the action associated with this particular query string handler.
	 *
	 * @param msgContext a MessageContext object containing message context
	 *                   information for this query string handler.
	 * @throws AxisFault if an error occurs
	 */
	public void invoke(MessageContext msgContext) throws AxisFault {
		//if(log.isDebugEnabled())
		//	log.debug("invoked");
		
		// Obtain objects relevant to the task at hand from the provided
		// MessageContext's bag.
		configureFromContext(msgContext);
		PrintWriter writer = (PrintWriter) msgContext
				.getProperty(HTTPConstants.PLUGIN_WRITER);
		HttpServletResponse response = (HttpServletResponse) msgContext
				.getProperty(HTTPConstants.MC_HTTP_SERVLETRESPONSE);
		String resourceName = (String) msgContext.getProperty("wsdlFile");
		if (resourceName == null) {
			log.debug("resourceName == null");

			resourceName = "alkor2.wsdl";

		}

		try {
			VelocityEngine velocityEngine =
				ee.agri.alkor.xtee.ServiceFactory.getVelcityEngine();
			
			List<Classificator> countries = ServiceFactory.getClassificatorService()
			.findClassItems(Country.class.getName());
			List<Classificator> productTypes = ServiceFactory.getClassificatorService()
					.findClassItems(ProductType.class.getName());
			List<Classificator> capacityTypes = ServiceFactory.getClassificatorService()
			.findClassItems(Capacity.class.getName());
			List<Classificator> packingMaterialTypes = ServiceFactory.getClassificatorService()
			.findClassItems(PackingMaterial.class.getName());
			List<Classificator> bottleColorTypes = ServiceFactory.getClassificatorService()
			.findClassItems(BottleColor.class.getName());
			List<Classificator> bottleShapeTypes = ServiceFactory.getClassificatorService()
			.findClassItems(BottleShape.class.getName());
			List<Classificator> corkMaterialTypes = ServiceFactory.getClassificatorService()
			.findClassItems(CorkMaterial.class.getName());
			List<Classificator> corkColorTypes = ServiceFactory.getClassificatorService()
			.findClassItems(CorkColor.class.getName());
			List<Classificator> corkShapeTypes = ServiceFactory.getClassificatorService()
			.findClassItems(CorkShape.class.getName());
			List<Classificator> stockingColorTypes = ServiceFactory.getClassificatorService()
			.findClassItems(StockingColor.class.getName());
			
			response.setContentType("text/xml; charset="
					+ XMLUtils.getEncoding().toLowerCase());
			
			VelocityContext args = new VelocityContext();
			args.put("countries", countries);
			args.put("productTypes", productTypes);
			args.put("capacityTypes", capacityTypes);
			args.put("packingMaterialTypes", packingMaterialTypes);
			args.put("bottleColorTypes", bottleColorTypes);
			args.put("bottleShapeTypes", bottleShapeTypes);
			args.put("corkMaterialTypes", corkMaterialTypes);
			args.put("corkColorTypes", corkColorTypes);
			args.put("corkShapeTypes", corkShapeTypes);
			args.put("capacityTypes", capacityTypes);
			args.put("stockingColorTypes", stockingColorTypes);
			
			velocityEngine.mergeTemplate(resourceName, "utf-8", args, writer);
		} catch (Exception e) {
			log.error(e, e);
			//then report under a 404 error
			response.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
		}
	}

	/**
	 * Report WSDL.
	 *
	 * @param doc
	 * @param writer
	 */
	public void reportWSDL(Document doc, PrintWriter writer) {
		XMLUtils.PrettyDocumentToWriter(doc, writer);
	}

	/**
	 * Report that we have no WSDL.
	 *
	 * @param res
	 * @param writer
	 * @param moreDetailCode optional name of a message to provide more detail
	 * @param axisFault      optional fault string, for extra info at debug time only
	 */
	public void reportNoWSDL(HttpServletResponse res, PrintWriter writer,
			String moreDetailCode, AxisFault axisFault) {
		res.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
		res.setContentType("text/html");
		writer.println("<h2>" + Messages.getMessage("error00") + "</h2>");
		writer.println("<p>" + Messages.getMessage("noWSDL00") + "</p>");
		if (moreDetailCode != null) {
			writer
					.println("<p>" + Messages.getMessage(moreDetailCode)
							+ "</p>");
		}
		if (axisFault != null ) {
			//only dev systems give fault dumps
			writeFault(writer, axisFault);
		}
	}

	/**
	 * Updates the soap:address locations for all ports in the WSDL using the URL from the request as
	 * the base portion for the updated locations, ensuring the WSDL returned to the client contains
	 * the correct location URL.
	 *
	 * @param wsdlDoc    the WSDL as a DOM document
	 * @param msgContext the current Axis JAX-RPC message context
	 * @throws AxisFault if we fail to obtain the list of deployed service names from the server config
	 */
	protected void updateSoapAddressLocationURLs(Document wsdlDoc,
			MessageContext msgContext) throws AxisFault {
		Set deployedServiceNames;
		try {
			deployedServiceNames = getDeployedServiceNames(msgContext);
		} catch (ConfigurationException ce) {
			throw new AxisFault("Failed to determine deployed service names.",
					ce);
		}
		NodeList wsdlPorts = wsdlDoc.getDocumentElement()
				.getElementsByTagNameNS(Constants.NS_URI_WSDL11, "port");
		if (wsdlPorts != null) {
			String endpointURL = getEndpointURL(msgContext);
			String baseEndpointURL = endpointURL.substring(0, endpointURL
					.lastIndexOf("/") + 1);
			for (int i = 0; i < wsdlPorts.getLength(); i++) {
				Element portElem = (Element) wsdlPorts.item(i);
				Node portNameAttrib = portElem.getAttributes().getNamedItem(
						"name");
				if (portNameAttrib == null) {
					continue;
				}
				String portName = portNameAttrib.getNodeValue();
				NodeList soapAddresses = portElem.getElementsByTagNameNS(
						Constants.URI_WSDL11_SOAP, "address");
				if (soapAddresses == null || soapAddresses.getLength() == 0) {
					soapAddresses = portElem.getElementsByTagNameNS(
							Constants.URI_WSDL12_SOAP, "address");
				}
				if (soapAddresses != null) {
					for (int j = 0; j < soapAddresses.getLength(); j++) {
						Element addressElem = (Element) soapAddresses.item(j);
						Node addressLocationAttrib = addressElem
								.getAttributes().getNamedItem("location");
						if (addressLocationAttrib == null) {
							continue;
						}
						String addressLocation = addressLocationAttrib
								.getNodeValue();
						String addressServiceName = addressLocation
								.substring(addressLocation.lastIndexOf("/") + 1);
						String newServiceName = getNewServiceName(
								deployedServiceNames, addressServiceName,
								portName);
						if (newServiceName != null) {
							String newAddressLocation = baseEndpointURL
									+ newServiceName;
							addressLocationAttrib
									.setNodeValue(newAddressLocation);
							log
									.debug("Setting soap:address location values in WSDL for port "
											+ portName
											+ " to: "
											+ newAddressLocation);
						} else {
							log
									.debug("For WSDL port: "
											+ portName
											+ ", unable to match port name or the last component of "
											+ "the SOAP address url with a "
											+ "service name deployed in server-config.wsdd.  Leaving SOAP address: "
											+ addressLocation + " unmodified.");
						}
					}
				}
			}
		}
	}

	private String getNewServiceName(Set deployedServiceNames,
			String currentServiceEndpointName, String portName) {
		String endpointName = null;
		if (deployedServiceNames.contains(currentServiceEndpointName)) {
			endpointName = currentServiceEndpointName;
		} else if (deployedServiceNames.contains(portName)) {
			endpointName = portName;
		}
		return endpointName;
	}

	private Set getDeployedServiceNames(MessageContext msgContext)
			throws ConfigurationException {
		Set serviceNames = new HashSet();
		Iterator deployedServicesIter = msgContext.getAxisEngine().getConfig()
				.getDeployedServices();
		while (deployedServicesIter.hasNext()) {
			ServiceDesc serviceDesc = (ServiceDesc) deployedServicesIter.next();
			serviceNames.add(serviceDesc.getName());
		}
		return serviceNames;
	}

	/**
	 * Returns the endpoint URL that should be used in the returned WSDL.
	 *
	 * @param msgContext the current Axis JAX-RPC message context
	 * @return the endpoint URL that should be used in the returned WSDL
	 * @throws AxisFault if we fail to obtain the {@link org.apache.axis.description.ServiceDesc} for this service
	 */
	protected String getEndpointURL(MessageContext msgContext) throws AxisFault {
		// First see if a location URL is explicitly set in the MC.
		String locationUrl = msgContext
				.getStrProp(MessageContext.WSDLGEN_SERV_LOC_URL);
		if (locationUrl == null) {
			// If nothing, try what's explicitly set in the ServiceDesc.
			locationUrl = msgContext.getService().getInitializedServiceDesc(
					msgContext).getEndpointURL();
		}
		if (locationUrl == null) {
			// If nothing, use the actual transport URL.
			locationUrl = msgContext.getStrProp(MessageContext.TRANS_URL);
		}
		return locationUrl;
	}
}
