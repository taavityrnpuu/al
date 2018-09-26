package ee.agri.alkor.xtee.impl;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPPart;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.RPCParam;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * Replaces "keha" elements with "item" elements in listMethods response SOAP
 * message.
 * 
 * @author suisalu
 * 
 */
public class SoapArrayHandler extends BasicHandler {


   private DocumentBuilderFactory dbf;

   public SoapArrayHandler() {
      super();
      dbf = DocumentBuilderFactory.newInstance();
      dbf.setNamespaceAware(true);
   }

   public void invoke(MessageContext msgContext) throws AxisFault {
      try {

         Message msg = msgContext.getResponseMessage();
         String sisu = msg.getSOAPEnvelope().getAsString();

         SOAPPart part = msg.getSOAPPart();
         SOAPElement elm = (SOAPElement) part.getElementsByTagName(
               "applyedApplicationsResponse").item(0);

         if (elm != null) {
            Map<String, String> args = new HashMap<String, String>();
            /*
				List apps = (List)msgContext.getProperty("apps");
				args.put("apps", apps);*/
            makeResponse(msgContext, "applyedApplications.vm", args);
         }

      } catch (Exception e) {
         e.printStackTrace();
         throw AxisFault.makeFault(e);
      }

   }

   private void makeResponse(MessageContext msgContext, String resourceName, Map<String, String> args) throws Exception {
      VelocityEngine velocityEngine =
            ee.agri.alkor.xtee.ServiceFactory.getVelcityEngine();
      StringWriter writer = new StringWriter();
      
      VelocityContext velocityContext = new VelocityContext();
      for (Map.Entry<String, String> entry : args.entrySet()) {
    	  velocityContext.put(entry.getKey(), entry.getValue());
      }
      velocityEngine.mergeTemplate(resourceName, "utf-8", velocityContext, writer);
      msgContext.setMessage(new Message(writer.toString()));

   }

   private void listMethodsResponse(SOAPElement elm) throws Exception {
      NodeList items = elm.getChildNodes();
      RPCParam keha = (RPCParam) items.item(0);
      elm.removeChild(keha);
      String kehaString = keha.getAsString();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new InputSource(new StringReader(
            kehaString)));
      Element rootElm = doc.getDocumentElement();
      System.out.println("root name: " + rootElm.getLocalName());
      SOAPFactory factory = SOAPFactory.newInstance();
      Name rootName = factory.createName(rootElm.getLocalName(),
            rootElm.getNamespaceURI(), rootElm.getPrefix());

      SOAPElement newKeha = factory.createElement(rootName);
      elm.addChildElement(newKeha);
      NodeList childs = rootElm.getChildNodes();
      for (int k = 0; k < childs.getLength(); k++) {
         Element child = (Element) childs.item(k);
         System.out.println("name: " + child.getLocalName());
         SOAPElement newItem = factory.createElement("item", child
               .getNamespaceURI(), child.getPrefix());
         newKeha.addChildElement(newItem);
         NamedNodeMap attrs = child.getAttributes();
         for (int j = 0; j < attrs.getLength(); j++) {
            Node attr = (Node) attrs.item(j);
            newItem.addAttribute(factory.createName(attr
                  .getLocalName()), attr.getNodeValue());
            System.out.println("attr: name=" + attr.getLocalName()
                  + " value=" + attr.getNodeValue());
         }
         //System.out.println("value: " + child.getTextContent());
         //newItem.setTextContent(child.getTextContent());
      }

   }

}
