/**
 * TreasuryCustomerBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.activation.DataHandler;
import javax.xml.soap.SOAPElement;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.attachments.Attachments;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeader;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.RegistryPaymentLog;
import ee.agri.alkor.service.AuthenticationServiceDelegate;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.xtee.impl.XteeHeaderMap;
import ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingImpl;

public class TreasuryCustomerBindingImpl implements eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType {

	private static Logger LOGGER = Logger.getLogger(TreasuryCustomerBindingImpl.class);
	
	private final IRegistryService registryService;
	private final DecimalFormat ethanolRateFormat;

	private static SimpleDateFormat MOKA_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

	public TreasuryCustomerBindingImpl() {
		super();

		ethanolRateFormat = new DecimalFormat();
		ethanolRateFormat.setDecimalSeparatorAlwaysShown(false);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.'); // EI TOHI OLLA KOMA, PUNKT-PUNKT-PUNKT
										// !!!
		ethanolRateFormat.setDecimalFormatSymbols(dfs);

		registryService = ServiceFactory.getRegistryService();
	}

	public eu.x_road.rm_v6.treasury.customer.RkSendTransactionStatementResponse rkSendTransactionStatement(
			eu.x_road.rm_v6.treasury.customer.RkSendTransactionStatement keha) throws java.rmi.RemoteException {
		final String PAYMENT_REF_NUMBER = "2900078305";
		final String PAYMENT_REF_NUMBER_2 = "2900082249";
		final String CREDIT_MESSAGE = "c";
		final String DEBIT_MESSAGE = "d";

		String resultText = "";
		int rc = 0;

		if (keha != null) {

			eu.x_road.rm_v6.treasury.customer.MokaQueryType mokaQuery = keha.getMokaQuery();

			if (mokaQuery != null) {

				MokaType moka = mokaQuery.getMoka();

				if (moka != null) {

					StringBuilder sb = new StringBuilder();
					sb.append("MokaQuery {\n");

					if (moka.getPayer() != null) {
						sb.append("\tPayer.AccountNum=" + moka.getPayer().getAccountNum() + "\n");
						sb.append("\tPayer.Name=" + moka.getPayer().getName() + "\n");
						sb.append("\tPayer.RefNum=" + moka.getPayer().getRefNum() + "\n");
						sb.append("\tPayer.RegNum=" + moka.getPayer().getRegNum() + "\n");
						sb.append("\tPayer.TransmissionDate=" + moka.getPayer().getTransmissionDate() + "\n");
						sb.append("\n");
					}

					sb.append("\tPayment.PaymentDesc=" + moka.getPaymentDesc() + "\n");
					if (moka.getPayment() != null) {
						sb.append("\tPayment.Currency=" + moka.getPayment().getCurrency() + "\n");
						sb.append("\tPayment.Type=" + moka.getPayment().getType() + "\n");
						sb.append("\tPayment.Amount=" + moka.getPayment().getAmount() + "\n");
						sb.append("\tPayment.BaseCurrencyAmount=" + moka.getPayment().getBaseCurrencyAmount() + "\n");
						sb.append("\n");
					}

					if (moka.getReceiver() != null) {
						sb.append("\tReceiver.AccountNum=" + moka.getReceiver().getAccountNum() + "\n");
						sb.append("\tReceiver.Name=" + moka.getReceiver().getName() + "\n");
						sb.append("\tReceiver.ReceptionDate=" + moka.getReceiver().getReceptionDate() + "\n");
						sb.append("\tReceiver.RefNum=" + moka.getReceiver().getRefNum() + "\n");
						sb.append("\tReceiver.RegNum=" + moka.getReceiver().getRegNum() + "\n");
						sb.append("\n");
					}

					sb.append("\tTreasury.TreasuryClassif=" + moka.getTreasuryClassif() + "\n");
					if (moka.getTreasury() != null) {
						sb.append("\tTreasury.BankRef=" + moka.getTreasury().getBankRef() + "\n");
						sb.append("\tTreasury.DocumentNum=" + moka.getTreasury().getDocumentNum() + "\n");
						sb.append("\tTreasury.OrderNum=" + moka.getTreasury().getOrderNum() + "\n");
						sb.append("\n");
					}
					sb.append("} // end of MokaQuery\n");
					//LOGGER.debug(sb.toString());

					XteeHeaderMap header = null;
					try {
						header = getXteeHeader();
						putHeader(header);
					} catch (Exception e) {

					}

					if (registryService.isPaymentUnique(moka.getTreasury().getOrderNum())) {

						RegistryPayment payment = new RegistryPayment();
						payment.setPayerRegistrationNr(moka.getPayer().getRegNum());
						payment.setPayerName(moka.getPayer().getName());
						payment.setPayingAccNo(moka.getPayer().getAccountNum());
						payment.setOrderNumber(moka.getTreasury().getOrderNum());
						payment.setPaymentDesc(moka.getPaymentDesc()); // hiljem
																		// lisatud

						// XXX: porn warning
						/*
						 * riigiametite perversus: kui on sisemine makse, siis
						 * viitenumber voib olla tuhi ja tegelik viitenumber
						 * asub saaja kontonumbri all
						 */
						String type = moka.getPayment().getType() == null ? "" : moka.getPayment().getType();

						if (DEBIT_MESSAGE.equals(type.toLowerCase())) {
							String refNum = moka.getReceiver().getRefNum();
							if (refNum == null || "".equals(refNum)) {
								refNum = moka.getReceiver().getAccountNum();
							}
							payment.setAmount(moka.getPayment().getAmount());
							payment.setReferenceNr(refNum);
						} else if (CREDIT_MESSAGE.equals(type.toLowerCase())) {
							payment.setReferenceNr(moka.getPayer().getAccountNum());
							payment.setAmount(moka.getPayment().getAmount() == null ? null
									: moka.getPayment().getAmount().negate());
						} else {
							resultText = "Not supported payment type:" + type;
							rc = 1; // TODO what is correct failure code ?

						}

						Date paymentDate = null;
						String mokaDate = moka.getReceiver().getReceptionDate();
						if ((mokaDate != null) && (mokaDate.trim().length() > 0)) {
							try {
								paymentDate = MOKA_DATE_FORMAT.parse(mokaDate);
								payment.setPaymentDate(paymentDate);
							} catch (Exception e) {
								resultText = "Payment date format error: " + mokaDate;
								rc = 1; // What ever

							}
						}
						try {
							// check the reference number
							if (!PAYMENT_REF_NUMBER.equals(payment.getReferenceNr())
									&& !PAYMENT_REF_NUMBER_2.equals(payment.getReferenceNr())) {
								// LOGGER.warn("payment has an incorrect
								// reference
								// number
								// (refNum="
								// + payment.getReferenceNr() + ") ADDING ANYWAY
								// !!!");
							}
							
							Enterprise enterprise = registryService.getEnterpriseByActivity(payment.getPayerRegistrationNr());
						
							RegistryPayment payment2 = (RegistryPayment) registryService.saveOrUpdate(payment);

							// proovime siduda automaatselt, see võib ka ebaõnnestuda
							if(enterprise != null){
								try{
									payment2.setBoundEnterprise(enterprise);
									registryService.bindPaymentToEnterpise(payment2);
								}catch(Exception x){
									x.printStackTrace();
								}
							}
						
							// try to automatically bind an enterprise to a
							// payment
							// by
							// enterprise registration nr
							
							/*
							Enterprise enterprise = registryService.getEnterpriseByActivity(payment.getPayerRegistrationNr());
							if (enterprise != null) {
								registryService.bindPaymentToEnterpriseById(enterprise.getId(), payment2.getId());
							} else {

							}
							*/
							
							LOGGER.debug("--- payment: "+(payment2 != null ? payment2.getId() : "NULL")+" , enterprise: "+(enterprise != null ? enterprise.getId() : "NULL")+" (reg_nr: "+payment.getPayerRegistrationNr()+")");
							
						} catch (Exception e) {
							resultText = "Exception when saving transaction: " + e.getMessage();
							rc = 2;
						}
					} else {
						resultText = "Order number is not unique";
						rc = 1;
					}
				} else {
					resultText = "Missing moka element from request";
					rc = 1;
				}
			} else {
				resultText = "Missing mokaQuery element from request";
				rc = 1;
			}
		} else {
			resultText = "Missing request body";
			rc = 1;
		}

		RkSendTransactionStatementResponse response = new RkSendTransactionStatementResponse();
		response.setCode(rc);
		response.setMessage(resultText);

		return response;
	}

	private XteeHeaderMap getXteeHeader() throws AxisFault {
		XteeHeaderMap xteeHeader = new XteeHeaderMap();
		MessageContext msgContext = MessageContext.getCurrentContext();
		Message reqMsg = msgContext.getRequestMessage();
		// Get SOAP envelope of request
		SOAPEnvelope env = reqMsg.getSOAPEnvelope();
		String subsystemCode = "";
		String serviceCode = "";
		String serviceVersion = "";
		try {
			for (Iterator<SOAPHeaderElement> i = env.getHeader().getChildElements(); i.hasNext();) {
				SOAPHeaderElement elem = i.next();

				if (elem.getName().equals("protocolVersion")) {
					System.out.println("elem: " + elem.getName() + " " + elem.getValue());
				}
				if (elem.getName().equals("issue")) {
					System.out.println("elem: " + elem.getName() + " " + elem.getValue());
					xteeHeader.put("toimik", elem.getValue());
				}
				if (elem.getName().equals("id")) {
					System.out.println("elem: " + elem.getName() + " " + elem.getValue());
					xteeHeader.put("id", elem.getValue());
				}
				if (elem.getName().equals("userId")) {
					System.out.println("elem: " + elem.getName() + " " + elem.getValue().substring(2));

					xteeHeader.put("isikukood", elem.getValue().substring(2));
				}

				if (elem.getName().equals("service")) {
					System.out.println("elem: " + elem.getName());
					for (Iterator<SOAPElement> ix = elem.getChildElements(); ix.hasNext();) {
						SOAPElement subElem = ix.next();
						System.out.println("elem: " + subElem.getLocalName() + " " + subElem.getValue());

						if (subElem.getLocalName().equals("subsystemCode")) {
							xteeHeader.put("andmekogu", subElem.getValue());
							subsystemCode = subElem.getValue();
						}

						if (subElem.getLocalName().equals("serviceCode")) {
							serviceCode = subElem.getValue();
						}

						if (subElem.getLocalName().equals("serviceVersion")) {
							serviceVersion = subElem.getValue();
						}

					}

					xteeHeader.put("nimi", subsystemCode + "." + serviceCode + "." + serviceVersion);
				}

				if (elem.getName().equals("client")) {
					System.out.println("elem: " + elem.getName());
					for (Iterator<SOAPElement> ix = elem.getChildElements(); ix.hasNext();) {

						SOAPElement subElem = ix.next();
						System.out.println("elem: " + subElem.getLocalName() + " " + subElem.getValue());

						if (subElem.getLocalName().equals("memberCode")) {
							xteeHeader.put("asutus", subElem.getValue());
						}
					}
				}

				if (elem.getName().equals("representedParty")) {
					System.out.println("elem: " + elem.getName());
					for (Iterator<SOAPElement> ix = elem.getChildElements(); ix.hasNext();) {
						SOAPElement subElem = ix.next();
						System.out.println("elem: " + subElem.getLocalName() + " " + subElem.getValue());
						if (subElem.getLocalName().equals("partyCode")) {
							xteeHeader.put("allasutus", subElem.getValue());
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("err: " + e);
		}

		for (Iterator it = xteeHeader.keySet().iterator(); it.hasNext();) {
			String headerName = (String) it.next();
			System.out.println("hdr: " + headerName + " " + xteeHeader.get(headerName));
		}

		return xteeHeader;

	}

	private void respondAttachment(String content) throws AxisFault {
		MessageContext msgContext = MessageContext.getCurrentContext();
		Message repMsg = msgContext.getResponseMessage();

		repMsg.getAttachmentsImpl().setSendType(Attachments.SEND_TYPE_MIME);

		DataHandler dh = new DataHandler(content, "text/plain");
		// DataHandler dh = new DataHandler(new FileDataSource(f));

		org.apache.axis.attachments.AttachmentPart attachment = new org.apache.axis.attachments.AttachmentPart(dh);
		attachment.setMimeHeader("Content-Transfer-Encoding", "8bit");
		repMsg.addAttachmentPart(attachment);

		// javax.xml.soap.AttachmentPart part = repMsg
		// .createAttachmentPart(aruanne);
		// repMsg.addAttachmentPart(part);
	}

	private void putHeader(XteeHeaderMap header) throws AxisFault {
		MessageContext msgContext = MessageContext.getCurrentContext();
		Message repMsg = msgContext.getResponseMessage();
		// Get SOAP envelope of request
		SOAPEnvelope env = repMsg.getSOAPEnvelope();
		try {

			SOAPHeader hdr = (SOAPHeader) msgContext.getRequestMessage().getSOAPEnvelope().getHeader();

			for (Iterator i = hdr.getChildElements(); i.hasNext();) {
				env.addHeader((SOAPHeaderElement) i.next());
			}

		} catch (Exception e) {

		}
		/*
		 * for (Iterator it = header.keySet().iterator(); it.hasNext();) {
		 * String headerName = (String) it.next(); SOAPHeaderElement
		 * soapHeaderElement = new SOAPHeaderElement(
		 * "http://x-tee.riik.ee/xsd/xtee.xsd", headerName,
		 * header.get(headerName)); env.addHeader(soapHeaderElement); }
		 */

	}

}
