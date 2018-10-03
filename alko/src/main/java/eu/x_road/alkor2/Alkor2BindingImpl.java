/**
 * Alkor2BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;
import javax.xml.soap.SOAPElement;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.attachments.AttachmentPart;
import org.apache.axis.attachments.Attachments;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeader;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.types.URI;
import org.apache.jk.core.MsgContext;

import com.lowagie.text.pdf.codec.Base64;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductMoveReportView;
import ee.agri.alkor.model.ProductMovementReport;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.XTeeId;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.xtee.Messages;
import ee.agri.alkor.xtee.impl.XteeHeaderMap;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder;

import eu.x_road.alkor2.types.AretolaadibResponse;
import eu.x_road.alkor2.types.Aruandeparing_vastuserida;
import eu.x_road.alkor2.types.Aruandeperiood;
import eu.x_road.alkor2.types.EitlaadibResponse;
import eu.x_road.alkor2.types.Item;
import eu.x_road.alkor2.types.Kalendrikuu;
import eu.x_road.alkor2.types.Legacy1Response;
import eu.x_road.alkor2.types.Liikumine;
import eu.x_road.alkor2.types.Reaviga;
import eu.x_road.alkor2.types.Status_t;
import eu.x_road.alkor2.types.Tooteparing_vastuserida;

public class Alkor2BindingImpl implements eu.x_road.alkor2.Alkor2Port {
	private final IRegistryService registryService;
	private final DecimalFormat ethanolRateFormat;

	public Alkor2BindingImpl() {
		super();

		ethanolRateFormat = new DecimalFormat();
		ethanolRateFormat.setDecimalSeparatorAlwaysShown(false);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.'); // EI TOHI OLLA KOMA, PUNKT-PUNKT-PUNKT
										// !!!
		ethanolRateFormat.setDecimalFormatSymbols(dfs);

		registryService = ServiceFactory.getRegistryService();
	}

	public java.lang.Object testSystem(java.lang.Object body)
			throws java.rmi.RemoteException {
		return null;
	}

	public eu.x_road.alkor2.types.TransactionStatementResponse transactionStatement(
			eu.x_road.alkor2.types.MokaType moka)
			throws java.rmi.RemoteException {

		final String PAYMENT_REF_NUMBER = "2900078305";
		final String PAYMENT_REF_NUMBER_2 = "2900082249";
		final String CREDIT_MESSAGE = "c";
		final String DEBIT_MESSAGE = "d";

		if (moka != null) {
			if (moka != null) {
				StringBuilder sb = new StringBuilder();
				sb.append("MokaQuery {\n");

				if (moka.getPayer() != null) {
					sb.append("\tPayer.AccountNum="
							+ moka.getPayer().getAccountNum() + "\n");
					sb.append("\tPayer.Name=" + moka.getPayer().getName()
							+ "\n");
					sb.append("\tPayer.RefNum=" + moka.getPayer().getRefNum()
							+ "\n");
					sb.append("\tPayer.RegNum=" + moka.getPayer().getRegNum()
							+ "\n");
					sb.append("\tPayer.TransmissionDate="
							+ moka.getPayer().getTransmissionDate() + "\n");
					sb.append("\n");
				}

				sb.append("\tPayment.PaymentDesc=" + moka.getPaymentDesc()
						+ "\n");
				if (moka.getPayment() != null) {
					sb.append("\tPayment.Currency="
							+ moka.getPayment().getCurrency() + "\n");
					sb.append("\tPayment.Type=" + moka.getPayment().getType()
							+ "\n");
					sb.append("\tPayment.Amount="
							+ moka.getPayment().getAmount() + "\n");
					sb.append("\tPayment.BaseCurrencyAmount="
							+ moka.getPayment().getBaseCurrencyAmount() + "\n");
					sb.append("\n");
				}

				if (moka.getReceiver() != null) {
					sb.append("\tReceiver.AccountNum="
							+ moka.getReceiver().getAccountNum() + "\n");
					sb.append("\tReceiver.Name=" + moka.getReceiver().getName()
							+ "\n");
					sb.append("\tReceiver.ReceptionDate="
							+ moka.getReceiver().getReceptionDate() + "\n");
					sb.append("\tReceiver.RefNum="
							+ moka.getReceiver().getRefNum() + "\n");
					sb.append("\tReceiver.RegNum="
							+ moka.getReceiver().getRegNum() + "\n");
					sb.append("\n");
				}

				sb.append("\tTreasury.TreasuryClassif="
						+ moka.getTreasuryClassif() + "\n");
				if (moka.getTreasury() != null) {
					sb.append("\tTreasury.BankRef="
							+ moka.getTreasury().getBankRef() + "\n");
					sb.append("\tTreasury.DocumentNum="
							+ moka.getTreasury().getDocumentNum() + "\n");
					sb.append("\tTreasury.OrderNum="
							+ moka.getTreasury().getOrderNum() + "\n");
					sb.append("\n");
				}
				sb.append("} // end of MokaQuery\n");
				// LOGGER.debug(sb.toString());
			}
		}

		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();
			putHeader(header);
		} catch (Exception e) {

		}

		String resultText = "OK";
		int rc = 0;

		if (registryService.isPaymentUnique(moka.getTreasury().getOrderNum())) {

			RegistryPayment payment = new RegistryPayment();
			payment.setPayerRegistrationNr(moka.getPayer().getRegNum());
			payment.setPayerName(moka.getPayer().getName());
			payment.setPayingAccNo(moka.getPayer().getAccountNum());
			payment.setOrderNumber(moka.getTreasury().getOrderNum());
			payment.setPaymentDesc(moka.getPaymentDesc()); // hiljem lisatud

			// XXX: porn warning
			/*
			 * riigiametite perversus: kui on sisemine makse, siis viitenumber
			 * voib olla tuhi ja tegelik viitenumber asub saaja kontonumbri all
			 */
			String type = moka.getPayment().getType() == null ? "" : moka
					.getPayment().getType();

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
						&& !PAYMENT_REF_NUMBER_2.equals(payment
								.getReferenceNr())) {
					// LOGGER.warn("payment has an incorrect reference number (refNum="
					// + payment.getReferenceNr() + ") ADDING ANYWAY !!!");
				}
				RegistryPayment payment2 = (RegistryPayment) registryService
						.saveOrUpdate(payment);
				// try to automatically bind an enterprise to a payment by
				// enterprise registration nr
				Enterprise enterprise = registryService
						.getEnterpriseByActivity(payment
								.getPayerRegistrationNr());
				if (enterprise != null) {
					registryService.bindPaymentToEnterpriseById(
							enterprise.getId(), payment2.getId());
				} else {
				}
			} catch (Exception e) {
				resultText = "Exception when saving transaction";
				rc = 2; // What ever

			}
		} else {

		}
		return null;
	}

	public void aruandeparing(
			java.util.Date l_date_from,
			java.util.Date l_date_to,
			eu.x_road.alkor2.types.Aruandeperiood periodStart,
			eu.x_road.alkor2.types.Aruandeperiood periodEnd,
			boolean resp_attach,
			javax.xml.rpc.holders.StringHolder teade,
			eu.x_road.alkor2.types.holders.AruandeparingResponseAruandedHolder aruanded,
			javax.xml.rpc.holders.StringHolder aruanded_csv)
			throws java.rmi.RemoteException {
		teade.value = new java.lang.String();
		aruanded.value = new eu.x_road.alkor2.types.Aruandeparing_vastuserida[0];
		aruanded_csv.value = new java.lang.String();

		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();
		} catch (Exception e) {
			teade.value = e.toString();
			return;
		}
		SearchFilter filter = new SearchFilter();
		filter.setObjectClass("ProductMoveReportView");
		Map searchParams = new HashMap();

		String reportingEntRegrNr = (header.getSubEnterpriseRegNr() != null) ? header
				.getSubEnterpriseRegNr() : header.getEnterpriseRegNr();
		searchParams.put("regId", reportingEntRegrNr);

		searchParams.put("loadEnterpriseId",
				new StringBuilder(header.getEnterpriseRegNr()));

		if (l_date_from != null)
			searchParams.put("start_date", l_date_from);
		if (l_date_to != null) {
			Date endDate = l_date_to;
			Calendar cal = Calendar.getInstance();
			cal.setTime(endDate);
			cal.add(Calendar.DAY_OF_YEAR, 1);
			searchParams.put("end_date", cal.getTime());
		}
		if (periodStart != null) {
			Kalendrikuu month = periodStart.getRep_month();

			if (periodStart.getRep_year() != null) {
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.DAY_OF_MONTH, 1);
				cal.set(Calendar.MONTH, 0);
				try {
					Integer repYear = Integer.parseInt(periodStart
							.getRep_year());
					cal.set(Calendar.YEAR, repYear);
					if (month != null)
						cal.set(Calendar.MONTH,
								Integer.parseInt(month.getValue()) - 1);
					searchParams.put("reportPeriodStart", cal.getTime());

				} catch (Exception e) {

				}
			} else {
				if (month != null) {
					searchParams.put("reportPeriodMonthStart",
							Integer.parseInt(month.getValue()));
				}
			}
		}

		if (periodEnd != null) {
			Kalendrikuu month = periodEnd.getRep_month();

			if (periodEnd.getRep_year() != null) {
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.DAY_OF_MONTH, 1);
				cal.set(Calendar.MONTH, 0);
				try {
					Integer repYear = Integer.parseInt(periodEnd.getRep_year());
					cal.set(Calendar.YEAR, repYear);
					if (month != null)
						cal.set(Calendar.MONTH,
								Integer.parseInt(month.getValue()) - 1);
					searchParams.put("reportPeriodEnd", cal.getTime());

				} catch (Exception e) {

				}
			} else {
				if (month != null) {
					searchParams.put("reportPeriodMonthEnd",
							Integer.parseInt(month.getValue()));
				}
			}
		}
		Map sort = new HashMap<String, String>();
		sort.put("repDate", "desc");
		filter.setSortMap(sort);
		filter.setQueryParams(searchParams);
		List resultList = new ArrayList();
		String message = null;
		try {
			while (true) {
				// LOGGER.debug("aruandeparingn");
				registryService.search(filter);
				if (filter.getResultsList().size() == 0)
					break;
				// int i=0;
				// LOGGER.debug("XX");
				for (Iterator it = filter.getResultsList().iterator(); it
						.hasNext();) {
					// LOGGER.debug(i);
					// i++;
					ProductMoveReportView report = (ProductMoveReportView) it
							.next();
					Aruandeparing_vastuserida row = new Aruandeparing_vastuserida();
					row.setLoad_date(report.getCreated());
					row.setLoad_user(report.getLoadPersonId());
					if (report.getLoadEnterpriseId() != null) {
						row.setEnt_reg_nr(report.getRegId());
						row.setEnt_name(report.getName());
						row.setEnt_contact(report.getContacts());
					}
					Aruandeperiood period = new Aruandeperiood();
					if (report.getRepDate() != null) {
						Calendar cal = Calendar.getInstance();
						cal.setTime(report.getRepDate());
						period.setRep_year(cal.get(Calendar.YEAR) + "");

						period.setRep_month(new Kalendrikuu((cal
								.get(Calendar.MONTH) + 1) + ""));
					}
					row.setPeriod(period);
					row.setReport_id(report.getId().intValue());
					row.setRcd_count(Long.toString(report.getTotal()));
					resultList.add(row);
				}
				filter.setStartIndex(filter.getStartIndex()
						+ filter.getResultsList().size());
			}
			message = Messages.getMessage("info.searchResults", new Integer(
					resultList.size()));
		} catch (Exception e) {

			message = e.toString();
		}
		// LOGGER.debug("aruandeparing pool");
		Aruandeparing_vastuserida[] rows = null;
		StringBuilder csvReport = new StringBuilder();

		if (resp_attach) {
			rows = new Aruandeparing_vastuserida[0];
			try {
				/**
				 * File f = File.createTempFile("alkor2" + header.getId(),
				 * ".csv"); PrintWriter out = new PrintWriter(f);
				 */
				for (Iterator it = resultList.iterator(); it.hasNext();) {
					Aruandeparing_vastuserida row = (Aruandeparing_vastuserida) it
							.next();
					StringBuilder sb = new StringBuilder();
					sb.append(row.getReport_id()).append(";")
							.append(row.getEnt_name()).append(";")
							.append(row.getEnt_reg_nr()).append(";")
							.append(row.getLoad_date()).append(";");
					if (row.getPeriod() != null) {
						sb.append(row.getPeriod().getRep_year());
						if (row.getPeriod().getRep_month() != null)
							sb.append("-").append(
									row.getPeriod().getRep_month().getValue());
					}
					sb.append(";");
					sb.append(row.getLoad_user());
					sb.append(";");
					sb.append(row.getRcd_count()).append("\n");

					// out.println(sb.toString());
					csvReport.append(sb);
				}
				// out.close();

				respondAttachment(csvReport.toString());
				// f.delete();
			} catch (Exception e) {

				message = e.toString();
			}

		} else {
			rows = new Aruandeparing_vastuserida[resultList.size()];
			int i = 0;
			for (Iterator it = resultList.iterator(); it.hasNext(); i++) {
				rows[i] = (Aruandeparing_vastuserida) it.next();
			}
		}

		teade.value = message;
		aruanded.value = rows;
		aruanded_csv.value = csvReport.toString();

		putHeader(header);
	}

	public void eitlaadib(eu.x_road.alkor2.types.AruandeperioodReq period,
			byte[] aruanne, javax.xml.rpc.holders.StringHolder teade,
			eu.x_road.alkor2.types.holders.EitlaadibResponseVeadHolder vead)
			throws java.rmi.RemoteException {
		teade.value = new java.lang.String();
		vead.value = new eu.x_road.alkor2.types.Reaviga[0];

		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();
		} catch (Exception e) {

			throw new RemoteException(e.getMessage());
		}
		String reportingEnterriseRegNr = null;
		if ((header.getSubEnterpriseRegNr() != null)
				&& (header.getSubEnterpriseRegNr().trim().length() > 0)) {
			reportingEnterriseRegNr = header.getSubEnterpriseRegNr().trim();

		} else {

			String message = Messages
					.getMessage("error.reporting.enterprise.noSubenterprise");

			teade.value = message;
			aruanne = null;
			throw new RemoteException(message);
		}

		Enterprise reportingEnt = null;
		try {
			if ((reportingEnt = registryService
					.getEnterpriseByActivity(reportingEnterriseRegNr)) == null) {

				String message = Messages.getMessage(
						"error.reporting.enterprise.NotRegistered",
						reportingEnterriseRegNr);

				teade.value = message;
				aruanne = null;
			}

			else if (period == null || period.getRep_month() == null
					|| period.getRep_month().getValue() == null) {
				String message = Messages
						.getMessage("error.reporting.month.missing");

				teade.value = message;
				aruanne = null;
			} else if (period.getRep_year() == null) {
				String message = Messages
						.getMessage("error.reporting.year.missing");

				teade.value = message;
				aruanne = null;
			} else {
				EitlaadibResponse rsp = processUploadedReportEIT(header,
						reportingEnt, period);
				teade.value = rsp.getTeade();
				vead.value = rsp.getVead();
			}

		} catch (Exception e) {

			throw new RemoteException(e.getMessage());
		}
		putHeader(header);
	}

	public void aretolaadib(
			eu.x_road.alkor2.types.Aruandjakoodigaareto aruandja,
			eu.x_road.alkor2.types.AruandeperioodReq period, byte[] aruanne,
			javax.xml.rpc.holders.StringHolder teade,
			eu.x_road.alkor2.types.holders.AretolaadibResponseVeadHolder vead)
			throws java.rmi.RemoteException {
		teade.value = new java.lang.String();
		vead.value = new eu.x_road.alkor2.types.Reaviga[0];

		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();

			String reportingEnterriseRegNr = null;
			if ((header.getSubEnterpriseRegNr() != null)
					&& (header.getSubEnterpriseRegNr().trim().length() > 0))
				reportingEnterriseRegNr = header.getSubEnterpriseRegNr().trim();
			else
				reportingEnterriseRegNr = header.getEnterpriseRegNr().trim();

			Enterprise reportingEnt = null;
			if ((reportingEnt = registryService
					.getEnterpriseByActivity(aruandja.getReg_nr())) == null) {
				String message = Messages.getMessage(
						"error.reporting.enterprise.NotRegistered",
						aruandja.getReg_nr());

				teade.value = message;
				aruanne = null;
			}
			if (period == null || period.getRep_month() == null
					|| period.getRep_month().getValue() == null) {
				String message = Messages
						.getMessage("error.reporting.month.missing");

				teade.value = message;
				aruanne = null;
			} else if (period.getRep_year() == null) {
				String message = Messages
						.getMessage("error.reporting.year.missing");

				teade.value = message;
				aruanne = null;
			} else {
				AretolaadibResponse rsp = processUploadedReport(header,
						reportingEnt, period);
				teade.value = rsp.getTeade();
				vead.value = rsp.getVead();

			}
		} catch (Exception e) {

			throw new RemoteException(e.getMessage());
		}
		putHeader(header);
	}

	public void kammparing(java.lang.String reg_book_nr,
			java.util.Date reg_date,
			eu.x_road.alkor2.types.holders.Status_tHolder status,
			eu.x_road.alkor2.types.holders.ItemHolder item)
			throws java.rmi.RemoteException {
		status.value = eu.x_road.alkor2.types.Status_t.OK;
		item.value = new eu.x_road.alkor2.types.Item();

		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();
		} catch (Exception e) {

			throw new RemoteException(e.toString());
		}
		// query has date precision, minute precision is needed
		// for applications added current date
		Date compDate = reg_date;
		Date now = new Date(System.currentTimeMillis());
		compDate.setHours(now.getHours());
		compDate.setMinutes(now.getMinutes());

		Item item2 = new Item();
		item.value = item2;

		try {
			RegistryEntry regEntry = registryService
					.findRegistryEntry(reg_book_nr.trim().toLowerCase());
			if (regEntry == null)
				status.value = new Status_t("NOK");
			else if (compDate != null
					&& (regEntry.getValidFrom() != null)
					&& (compDate.before(regEntry.getValidFrom()))
					|| (((regEntry.getValidUntil() != null) && (compDate
							.after(regEntry.getValidUntil()))))) {

				status.value = new Status_t("NOK");
			} else {
				RegistryApplication a = regEntry.getApplication();
				Product p = regEntry.getApplication().getProduct();
				item2.setItem_name(p.getName());
				item2.setCn_code(p.getCode());
				item2.setProducttype(p.getType().getName());
				item2.setApp_reg_nr(regEntry.getNr());
				item2.setReg_date(regEntry.getCreated());
				item2.setCapacity(p.getPackingVolume().getName());
				item2.setVolume(ethanolRateFormat.format(p.getEthanolRate()
						.doubleValue()));
				if (a.getApplicant() != null) {
					item2.setApp_actor_name(a.getApplicant().getName());
				}
				if (p.getProducer() != null) {
					item2.setMan_actor_name(p.getProducer().getName()); // selgub,
																		// et
																		// kõigil
																		// toodetel
																		// siiski
																		// pole
																		// tootjat
																		// ja
																		// tekib
																		// NPE,
																		// seega
																		// wrapime
																		// nullchecki
																		// sisse
					if (p.getProducer().getAddress() != null)
						item2.setCountry(p.getProducer().getAddress()
								.getCountry().getName());
				} else {

				}
				item.value = item2;
				status.value = new Status_t("OK");
			}
		} catch (Exception e) {

			status.value = new Status_t("NOK");
		}
		putHeader(header);
	}

	public void tooteparing(
			java.lang.String reg_book_nr,
			java.util.Date date_fromS,
			java.util.Date date_toS,
			java.util.Date date_fromE,
			java.util.Date date_toE,
			java.lang.String item_name,
			eu.x_road.alkor2.types.Tooteliik producttype,
			java.lang.String man_actor_name,
			eu.x_road.alkor2.types.CountryType country,
			eu.x_road.alkor2.types.CapacityType volume,
			java.lang.String ethanol_vol,
			java.lang.String desc,
			java.lang.Boolean status1,
			java.lang.Boolean status2,
			boolean resp_attach,
			javax.xml.rpc.holders.StringHolder teade,
			eu.x_road.alkor2.types.holders.TooteparingResponseTootedHolder tooted,
			javax.xml.rpc.holders.StringHolder tooted_csv)
			throws java.rmi.RemoteException {
		teade.value = new java.lang.String();
		tooted.value = new eu.x_road.alkor2.types.Tooteparing_vastuserida[0];
		tooted_csv.value = new java.lang.String();

		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();
			putHeader(header);
		} catch (Exception e) {
			teade.value = e.toString();
			return;
		}
		String message = null;
		String requestEntRegNr = header.getRequestEnterprise();
		SearchFilter filter = new SearchFilter();
		filter.setObjectClass("RegistryApplication");
		Map searchParams = new HashMap();
		searchParams.put("applicant.registrationId", requestEntRegNr);
		searchParams.put("type.code", IClassificatorService.APPL_TYPE_ARE);

		if (reg_book_nr != null)
			searchParams.put("registryEntry.nr", reg_book_nr);
		if (country != null)
			searchParams.put("product.producer.address.country.code",
					country.getValue());
		if (item_name != null)
			searchParams.put("product.name", item_name);
		if (producttype != null)
			searchParams.put("product.type.code", producttype.getValue());
		if (man_actor_name != null)
			searchParams.put("product.producer.name", man_actor_name);
		if (ethanol_vol != null)
			searchParams
					.put("product.ethanolRate", new BigDecimal(ethanol_vol));
		if (volume != null)
			searchParams.put("product.packingVolume.code", volume.getValue());

		if ((status1 != null && status1.booleanValue())
				&& (status2 != null && status2.booleanValue())) {
			// do nothing, if both options are checked
		} else if (status1 != null && status1.booleanValue()) {
			searchParams.put("registryEntry.validUntil",
					SearchFilter.NOT_LESS_THAN_CURRENT_DATE);
		} else if (status2 != null && status2.booleanValue()) {
			searchParams.put("registryEntry.validUntil",
					SearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE);
		}

		Map sort = new HashMap<String, String>();
		sort.put("created", "desc");
		filter.setSortMap(sort);
		filter.setQueryParams(searchParams);
		List resultList = new ArrayList();
		try {
			while (true) {
				registryService.search(filter);
				if (filter.getResultsList().size() == 0)
					break;
				for (Iterator it = filter.getResultsList().iterator(); it
						.hasNext();) {
					// s.applicant.registrationId
					RegistryApplication a = (RegistryApplication) it.next();
					Tooteparing_vastuserida row = new Tooteparing_vastuserida();
					if (a.getRegistryEntry() != null) {
						row.setReg_book_nr(a.getRegistryEntry().getNr());
						if (a.getRegistryEntry().getValidFrom() != null) {
							if (date_fromS != null) {
								if (a.getRegistryEntry().getValidFrom()
										.before(date_fromS)) {
									continue;
								}
							}
							if (date_toS != null) {
								if (a.getRegistryEntry().getValidFrom()
										.after(date_toS)) {
									continue;
								}
							}
						}
						if (a.getRegistryEntry().getValidUntil() != null) {
							if (date_fromE != null) {
								if (a.getRegistryEntry().getValidUntil()
										.before(date_fromE)) {
									continue;
								}
							}
							if (date_toE != null) {
								if (a.getRegistryEntry().getValidUntil()
										.after(date_toE)) {
									continue;
								}
							}
						}
						row.setReg_start(a.getRegistryEntry().getValidFrom());
						row.setReg_end(a.getRegistryEntry().getValidUntil());
					} else
						continue;
					Product p = a.getProduct();
					row.setItem_name(p.getName());
					row.setProducttype(p.getType().getName());
					row.setVolume(ethanolRateFormat.format(p.getEthanolRate()
							.doubleValue()));
					row.setComment(p.getNotes());
					row.setState(a.getState().getName());
					if (p.getPackingVolume() != null)
						row.setCapacity(p.getPackingVolume().getName());
					if (p.getProducer() != null) {
						row.setMan_actor_name(p.getProducer().getName());
						if ((p.getProducer().getAddress() != null)
								&& (p.getProducer().getAddress().getCountry() != null))
							row.setCountry(p.getProducer().getAddress()
									.getCountry().getName());
					}
					if (p.getOriginCountry() != null)
						row.setCreatcountry(p.getOriginCountry().getName());

					resultList.add(row);
				}
				filter.setStartIndex(filter.getStartIndex()
						+ filter.getResultsList().size());
			}
			message = Messages.getMessage("info.searchResults", new Integer(
					resultList.size()));
			Tooteparing_vastuserida[] rows = null;
			String csvReport = "";
			if (resp_attach) {// paneme kokku faili
				StringBuilder csvReportBuf = new StringBuilder();
				rows = new Tooteparing_vastuserida[0];
				try {
					for (Iterator it = resultList.iterator(); it.hasNext();) {
						Tooteparing_vastuserida row = (Tooteparing_vastuserida) it
								.next();
						if (row.getReg_book_nr() != null)
							csvReportBuf.append(row.getReg_book_nr());
						csvReportBuf.append(",");
						if (row.getReg_start() != null)
							csvReportBuf.append(KAMM_DATE_FORMAT.format(row
									.getReg_start()));
						csvReportBuf.append(",");
						if (row.getReg_end() != null)
							csvReportBuf.append(KAMM_DATE_FORMAT.format(row
									.getReg_end()));
						csvReportBuf.append(",");
						csvReportBuf.append(row.getItem_name()).append(",");
						csvReportBuf.append(row.getMan_actor_name())
								.append(",");
						csvReportBuf.append(row.getCountry()).append(",");
						csvReportBuf.append(row.getCreatcountry()).append(",");
						csvReportBuf.append(row.getProducttype()).append(",");
						csvReportBuf.append(row.getCapacity()).append(",");
						csvReportBuf.append(row.getVolume());
						csvReportBuf.append("\r\n");
					}
					csvReport = csvReportBuf.toString();
					respondAttachment(csvReport);
				} catch (Exception e) {
					message = e.toString();
				}
			} else {
				rows = new Tooteparing_vastuserida[resultList.size()];
				int i = 0;
				for (Iterator it = resultList.iterator(); it.hasNext();) {
					rows[i++] = (Tooteparing_vastuserida) it.next();
				}
			}
			teade.value = message;
			tooted.value = rows;
			tooted_csv.value = csvReport;
		} catch (Exception e) {
			teade.value = e.toString();
		}
	}

	public void liikumineParing(
			java.lang.String reg_book_nr,
			java.lang.String ent_reg_nr,
			java.lang.String ent_name,
			java.lang.String receiver,
			java.lang.String market,
			java.lang.String addr_county,
			java.lang.String addr_town,
			java.lang.String addr_str,
			java.lang.String p_nr,
			java.lang.String p_cnt,
			java.util.Date l_date_from,
			java.util.Date l_date_to,
			eu.x_road.alkor2.types.Aruandeperiood period,
			java.lang.Integer report_id,
			java.lang.Boolean resp_attach,
			javax.xml.rpc.holders.StringHolder teade,
			eu.x_road.alkor2.types.holders.LiikumineParingResponseLiikumisedHolder liikumised,
			javax.xml.rpc.holders.StringHolder liikumised_csv)
			throws java.rmi.RemoteException {
		teade.value = new java.lang.String();
		liikumised.value = new eu.x_road.alkor2.types.Liikumine[0];
		liikumised_csv.value = new java.lang.String();

		XteeHeaderMap header = null;

		try {
			header = getXteeHeader();
		} catch (Exception e) {

			throw new RemoteException(e.getMessage());
		}

		SearchFilter search = new SearchFilter();
		search.setObjectClass("ProductMovementReportRecord");
		Map searchParams = new HashMap();

		if (reg_book_nr != null)
			searchParams.put("registryEntry.nr", reg_book_nr);
		if (ent_name != null)
			searchParams.put("report.reportingEnterprise.name", ent_name);
		if (ent_reg_nr != null)
			searchParams.put("report.reportingEnterprise.registrationId",
					ent_reg_nr);
		if (receiver != null)
			searchParams.put("receiverName", receiver);
		if (market != null)
			searchParams.put("marketingPlaceName", market);
		if (addr_str != null)
			searchParams.put("marketingPlaceAddress", addr_str);
		if (addr_town != null)
			searchParams.put("marketingPlaceOrgUnit", addr_town);
		if (addr_county != null)
			searchParams.put("marketingPlaceDistrict", addr_county);
		if (p_nr != null)
			searchParams.put("partyNr", p_nr);
		if (p_cnt != null)
			searchParams.put("amount", p_cnt);

		if (report_id != null)
			searchParams.put("report.id", report_id.longValue());

		if (l_date_from != null)
			searchParams.put("start_date", l_date_from);
		if (l_date_to != null)
			searchParams.put("end_date", l_date_to);

		if (period != null) {
			Kalendrikuu month = period.getRep_month();
			if (month != null) {
				String repMonth = period.getRep_month().getValue();
				searchParams.put("report.reportPeriodMonth.code", repMonth);
			}
			if (period.getRep_year() != null) {
				try {
					Integer repYear = Integer.parseInt(period.getRep_year());
					searchParams.put("report.reportPeriodYear", repYear);
				} catch (Exception e) {

				}

			}
		}
		search.setQueryParams(searchParams);
		search.setPageSize(1000);
		Map sort = new HashMap<String, String>();
		sort.put("created", "desc");
		search.setSortMap(sort);
		List resultList = new ArrayList();
		String message = null;
		try {
			while (true) {
				registryService.search(search);
				if (search.getResultsList().size() == 0)
					break;
				for (Iterator it = search.getResultsList().iterator(); it
						.hasNext();) {
					ProductMovementReportRecord reportRecord = (ProductMovementReportRecord) it
							.next();
					Liikumine prodMovement = new Liikumine();
					prodMovement.setReg_book_nr(reportRecord.getRegistryEntry()
							.getNr());
					prodMovement.setEnt_name(reportRecord.getReport()
							.getReportingEnterprise().getName());
					prodMovement.setReceiver(reportRecord.getReceiverName());
					prodMovement
							.setMarket(reportRecord.getMarketingPlaceName());
					prodMovement.setAddr_county(reportRecord
							.getMarketingPlaceDistrict());
					prodMovement.setAddr_town(reportRecord
							.getMarketingPlaceOrgUnit());
					prodMovement.setAddr_str(reportRecord
							.getMarketingPlaceAddress());
					prodMovement.setP_nr(reportRecord.getPartyNr());
					prodMovement.setP_cnt(reportRecord.getAmount().toString());
					prodMovement.setReport_id(reportRecord.getReport().getId()
							.toString());
					resultList.add(prodMovement);
				}
				search.setStartIndex(search.getStartIndex()
						+ search.getResultsList().size());
			}
			message = Messages.getMessage("info.searchResults", new Integer(
					resultList.size()));
		} catch (Exception e) {
			message = e.toString();
		}
		Liikumine[] moves = null;
		StringBuilder csvReport = new StringBuilder();

		if ((resp_attach != null) && resp_attach.booleanValue()) {
			moves = new Liikumine[0];
			try {
				/*
				 * File f = File.createTempFile("alkor2" + header.getId(),
				 * ".csv"); PrintWriter out = new PrintWriter(f);
				 */
				for (Iterator it = resultList.iterator(); it.hasNext();) {
					Liikumine move = (Liikumine) it.next();
					StringBuilder sb = new StringBuilder();
					sb.append(move.getReg_book_nr()).append(";")
							.append(move.getEnt_name()).append(";")
							.append(move.getMarket()).append(";")
							.append(move.getReceiver()).append(";")
							.append(move.getAddr_county()).append(";")
							.append(move.getAddr_town()).append(";")
							.append(move.getAddr_str()).append(";")
							.append(move.getP_nr()).append(";")
							.append(move.getReport_id()).append(";")
							.append(move.getP_cnt()).append("\n");

					// out.println(sb.toString());
					csvReport.append(sb);
				}
				// out.close();

				respondAttachment(csvReport.toString());
				// f.delete();
			} catch (Exception e) {
				message = e.toString();
			}
		} else {
			moves = new Liikumine[resultList.size()];
			int i = 0;
			for (Iterator it = resultList.iterator(); it.hasNext(); i++) {
				moves[i] = (Liikumine) it.next();
			}
		}

		teade.value = message;
		liikumised.value = moves;
		liikumised_csv.value = csvReport.toString();

		putHeader(header);
	}

	/*
	 * public void legacy1(eu.x_road.alkor2.types.ArrayOfString item,
	 * javax.xml.rpc.holders.StringHolder teade,
	 * org.apache.axis.holders.URIHolder url) throws java.rmi.RemoteException {
	 * teade.value = new java.lang.String(); try { url.value = new
	 * org.apache.axis.types.URI("urn:testing"); } catch (Exception e) { } }
	 */

	/*
	 * public void legacy1(java.lang.String[] item,
	 * javax.xml.rpc.holders.StringHolder teade,
	 * org.apache.axis.holders.URIHolder url) throws java.rmi.RemoteException {
	 * teade.value = new java.lang.String(); try { url.value = new
	 * org.apache.axis.types.URI("urn:testing"); } catch (Exception e) { } }
	 */

	public void legacy1(java.lang.String[] item,
			javax.xml.rpc.holders.StringHolder teade,
			org.apache.axis.holders.URIHolder url)
			throws java.rmi.RemoteException {
		teade.value = new java.lang.String();
		try {
			url.value = new org.apache.axis.types.URI("urn:testing");
		} catch (Exception e) {

		}

		Legacy1Response result = new Legacy1Response();

		String reportingEnterriseRegNr = null;
		XteeHeaderMap header = null;
		try {
			header = getXteeHeader();
			if ((header.getSubEnterpriseRegNr() != null)
					&& (header.getSubEnterpriseRegNr().trim().length() > 0))
				reportingEnterriseRegNr = header.getSubEnterpriseRegNr().trim();
			else
				reportingEnterriseRegNr = header.getEnterpriseRegNr().trim();

			String baseURI = registryService.getBaseURI();
			if ((registryService
					.getEnterpriseByActivity(reportingEnterriseRegNr)) == null) {

				result.setUrl(new URI(baseURI + "/index.html#LoginErrorPage6"));
				url.value = new URI(baseURI + "/index.html#LoginErrorPage6");
			} else {

				XTeeId xId = new XTeeId();
				xId.setId(header.getId());
				xId.setRegistryCode(header.getRequestEnterprise());
				xId.setRepresentativeName(header.getRepresenativeName());
				xId.setRepresentativePersonalCode(header
						.getRepresentativeRegNr());
				xId.setrepresentativeOccupation(header
						.getRepresentativeProfession() == null ? "" : header
						.getRepresentativeProfession());
				xId.setCreated(new Date());
				registryService.saveXid(xId);

				result.setUrl(new URI(baseURI
						+ "/login?nonce=" + header.getId()));

				url.value = new URI(baseURI + "/login?nonce="
						+ header.getId());

			}
			 putHeader(header);
		} catch (Exception e) {

		}
	}

	// ise kirjutatud loogika.

	/**
	 * 
	 * @return
	 * @throws AxisFault
	 * 
	 *             this.put("andmekogu", null); this.put("nimi", null);
	 *             this.put("asutus", null); this.put("allasutus", null);
	 *             this.put("isikukood", null); this.put("id", null);
	 *             this.put("toimik", null); this.put("amet", null);
	 *             this.put("ametniknimi", null);
	 */
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
			for (Iterator<SOAPHeaderElement> i = env.getHeader()
					.getChildElements(); i.hasNext();) {
				SOAPHeaderElement elem = i.next();

				if (elem.getName().equals("protocolVersion")) {
					System.out.println("elem: " + elem.getName() + " "
							+ elem.getValue());
				}
				if (elem.getName().equals("issue")) {
					System.out.println("elem: " + elem.getName() + " "
							+ elem.getValue());
					xteeHeader.put("toimik", elem.getValue());
				}
				if (elem.getName().equals("id")) {
					System.out.println("elem: " + elem.getName() + " "
							+ elem.getValue());
					xteeHeader.put("id", elem.getValue());
				}
				if (elem.getName().equals("userId")) {
					System.out.println("elem: " + elem.getName() + " "
							+ elem.getValue().substring(2));

					xteeHeader.put("isikukood", elem.getValue().substring(2));
				}

				if (elem.getName().equals("service")) {
					System.out.println("elem: " + elem.getName());
					for (Iterator<SOAPElement> ix = elem.getChildElements(); ix
							.hasNext();) {
						SOAPElement subElem = ix.next();
						System.out.println("elem: " + subElem.getLocalName()
								+ " " + subElem.getValue());

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

					xteeHeader.put("nimi", subsystemCode + "." + serviceCode
							+ "." + serviceVersion);
				}

				if (elem.getName().equals("client")) {
					System.out.println("elem: " + elem.getName());
					for (Iterator<SOAPElement> ix = elem.getChildElements(); ix
							.hasNext();) {

						SOAPElement subElem = ix.next();
						System.out.println("elem: " + subElem.getLocalName()
								+ " " + subElem.getValue());

						if (subElem.getLocalName().equals("memberCode")) {
							xteeHeader.put("asutus", subElem.getValue());
						}
					}
				}

				if (elem.getName().equals("representedParty")) {
					System.out.println("elem: " + elem.getName());
					for (Iterator<SOAPElement> ix = elem.getChildElements(); ix
							.hasNext();) {
						SOAPElement subElem = ix.next();
						System.out.println("elem: " + subElem.getLocalName()
								+ " " + subElem.getValue());
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
			System.out.println("hdr: " + headerName + " "
					+ xteeHeader.get(headerName));
		}

		return xteeHeader;

	}

	private void respondAttachment(String content) throws AxisFault {
		MessageContext msgContext = MessageContext.getCurrentContext();
		Message repMsg = msgContext.getResponseMessage();

		repMsg.getAttachmentsImpl().setSendType(Attachments.SEND_TYPE_MIME);

		DataHandler dh = new DataHandler(content, "text/plain");
		// DataHandler dh = new DataHandler(new FileDataSource(f));

		org.apache.axis.attachments.AttachmentPart attachment = new org.apache.axis.attachments.AttachmentPart(
				dh);
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

			SOAPHeader hdr = (SOAPHeader) msgContext.getRequestMessage()
					.getSOAPEnvelope().getHeader();

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

	private static SimpleDateFormat KAMM_DATE_FORMAT = new SimpleDateFormat(
			"dd.MM.yyyy");
	static {
		KAMM_DATE_FORMAT.setLenient(false);
	}

	private AretolaadibResponse processUploadedReport(
			XteeHeaderMap headerValue, Enterprise reportingEnterpriseRegNr,
			eu.x_road.alkor2.types.AruandeperioodReq period) {

		List rowErrors = new ArrayList();
		MessageDigest sha = null;
		File f = null;

		AretolaadibResponse results = new AretolaadibResponse();

		try {
			AttachmentPart[] attachments = getMessageAttachments();
			DataHandler attachment = attachments[0].getDataHandler();
			sha = MessageDigest.getInstance("SHA-1");
			String cType = attachment.getContentType();

			InputStream is = attachment.getInputStream();
			f = File.createTempFile("eit", ".csv",
					registryService.getDocRoot() == null ? null : new File(
							registryService.getDocRoot()));
			FileOutputStream os = new FileOutputStream(f);
			int c = 0;
			while ((c = is.read()) > 0) {
				os.write(c);
				sha.update((byte) c);
			}
			os.close();
		} catch (Exception e) {
			results.setTeade(Messages.getMessage("error.reporting.upload"));
			return null;
		}
		byte[] digest = sha.digest();

		ProductMovementReport report = new ProductMovementReport();
		report.setCreated(new Date());
		report.setLoadingEnterpriseRegNr(headerValue.getEnterpriseRegNr());
		report.setLoadingUserId(headerValue.getRepresentativeRegNr());
		report.setReportingEnterprise(reportingEnterpriseRegNr);

		if (period != null) {
			Calendar cal = Calendar.getInstance();
			if (period.getRep_year() != null) {
				Integer year = 0;
				try {
					year = new Integer(Integer.parseInt(period.getRep_year()));
				} catch (Exception e) {

					results.setTeade(Messages
							.getMessage("error.upload.formatError"));
					return results;
				}
				cal.set(Calendar.YEAR, year);
			}
			if (period.getRep_month() != null) {
				String monthCode = period.getRep_month().getValue();
				cal.set(Calendar.MONTH, Integer.parseInt(monthCode) - 1);
			}
			cal.set(Calendar.DAY_OF_MONTH, 1);
			report.setRepDate(cal.getTime());
		}

		try {
			BufferedReader fReader = new BufferedReader(new FileReader(f));
			String line = null;
			// /*
			StringBuffer b64 = new StringBuffer(); // TODO RK: uuema versiooni
													// jaoks, kus peab
													// attachmenti base64-st
													// dekodeerima!
			while ((line = fReader.readLine()) != null) { // seega TEST jaoks
															// peab see olemas
															// olema, LIVE jaoks
															// seda ei ole kuni
															// kasutatakse
															// sinist keskkonda
				b64.append(line); // loeme kogu hashi sisse
			}
			fReader = new BufferedReader(new StringReader(new String(
					Base64.decode(b64.toString()))));
			// */
			int rowNr = 0;
			HashMap<String, RegistryEntry> entrys = new HashMap<String, RegistryEntry>();
			while ((line = fReader.readLine()) != null) {
				rowNr++;

				String[] cols = line.split(";");
				if (cols.length != 8) {
					rowErrors.add(new Reaviga(String.valueOf(rowNr), Messages
							.getMessage("error.upload.wrongColNumber")));
					continue;
				}
				boolean colError = false;
				for (int i = 0; i < 8; i++) {
					if (cols[i].trim().length() == 0) {
						rowErrors.add(new Reaviga(String.valueOf(rowNr),
								Messages.getMessage("error.upload.emptyColumn",
										new Integer(i))));
						colError = true;
					}
				}
				if (colError)
					continue;
				String registryEntryNr = cols[0].trim().toLowerCase();
				if (registryEntryNr.indexOf(' ') > 0) {
					String[] regNrParts = registryEntryNr.split(" ");
					registryEntryNr = regNrParts[0];
				}
				RegistryEntry entry = null;
				if (entrys.containsKey(registryEntryNr)) {
					entry = entrys.get(registryEntryNr);
				} else {
					try {

						entry = registryService
								.findRegistryEntry(registryEntryNr);
						entrys.put(registryEntryNr, entry);

					} catch (Exception e) {
						rowErrors.add(new Reaviga(String.valueOf(rowNr),
								(Messages.getMessage(
										"error.reporting.regentry.NotFound",
										cols[0]))));
						continue;
					}
					// entrys.put(registryEntryNr, entry); // ee.. miks jälle?
				}
				/**
				 * 16.05.2014 @author Martin
				 * 
				 * See on mingi vana viga, taotluse salvestamisel on vahepeal
				 * anomaalia.
				 */

				if (entry == null) {
					// Piksel
					// @author MARTIN
					// FIXME SEDA VIGA UURIDA!

					rowErrors.add(new Reaviga(String.valueOf(rowNr), (Messages
							.getMessage("error.reporting.regentry.NotFound",
									cols[0]))));
					continue;
				}

				// LOGGER.debug("5");
				ProductMovementReportRecord record = new ProductMovementReportRecord();
				record.setCreated(new Date());
				record.setRegistryEntry(entry);
				record.setReceiverName(cols[1]);
				record.setMarketingPlaceName(cols[2]);
				record.setMarketingPlaceDistrict(cols[3]);
				record.setMarketingPlaceOrgUnit(cols[4]);
				record.setMarketingPlaceAddress(cols[5]);
				record.setPartyNr(cols[6]);
				Integer amount = null;
				try {
					amount = new Integer(cols[7]);
				} catch (Exception e) {
					rowErrors
							.add(new Reaviga(
									Integer.toString(rowNr),
									(Messages
											.getMessage("error.reporting.amountFormat"))));
				}
				record.setAmount(amount);
				report.addRecord(record);
			}
		} catch (IOException ioe) {
			results.setTeade(Messages.getMessage("error.reporting.file"));
			return results;
		}
		// LOGGER.debug(rowErrors.size()+" rowErrors for " +
		// reportingEnterpriseRegNr.getName() + "," +
		// reportingEnterpriseRegNr.getRegistrationId() ); // FIXME NPE

		if (rowErrors.size() > 0) {
			results.setTeade(Messages
					.getMessage("error.reporting.reportErrors"));
			Reaviga[] vead = new Reaviga[rowErrors.size()];
			int i = 0;
			for (Iterator it = rowErrors.iterator(); it.hasNext(); i++) {
				vead[i] = (Reaviga) it.next();

			}
			results.setVead(vead);

		} else {
			try {
				registryService.saveOrUpdate(report);
			} catch (Exception e) {

				results.setTeade(Messages.getMessage("error.reporting.save"));
				return results;
			}
			results.setTeade(Messages
					.getMessage("info.reporting.savedRecords", new Integer(
							report.getProductMovementReportRecords().size())));
		}

		return results;
	}

	private EitlaadibResponse processUploadedReportEIT(
			XteeHeaderMap headerValue, Enterprise reportingEnterpriseRegNr,
			eu.x_road.alkor2.types.AruandeperioodReq period) {

		List rowErrors = new ArrayList();
		MessageDigest sha = null;
		File f = null;

		EitlaadibResponse results = new EitlaadibResponse();

		try {
			AttachmentPart[] attachments = getMessageAttachments();
			DataHandler attachment = attachments[0].getDataHandler();
			sha = MessageDigest.getInstance("SHA-1");
			String cType = attachment.getContentType();

			InputStream is = attachment.getInputStream();
			f = File.createTempFile("eit", ".csv",
					registryService.getDocRoot() == null ? null : new File(
							registryService.getDocRoot()));
			FileOutputStream os = new FileOutputStream(f);
			int c = 0;
			while ((c = is.read()) > 0) {
				os.write(c);
				sha.update((byte) c);
			}
			os.close();
		} catch (Exception e) {
			results.setTeade(Messages.getMessage("error.reporting.upload"));
			return null;
		}
		byte[] digest = sha.digest();

		ProductMovementReport report = new ProductMovementReport();
		report.setCreated(new Date());
		report.setLoadingEnterpriseRegNr(headerValue.getEnterpriseRegNr());
		report.setLoadingUserId(headerValue.getRepresentativeRegNr());
		report.setReportingEnterprise(reportingEnterpriseRegNr);

		if (period != null) {
			Calendar cal = Calendar.getInstance();
			if (period.getRep_year() != null) {
				Integer year = 0;
				try {
					year = new Integer(Integer.parseInt(period.getRep_year()));
				} catch (Exception e) {

					results.setTeade(Messages
							.getMessage("error.upload.formatError"));
					return results;
				}
				cal.set(Calendar.YEAR, year);
			}
			if (period.getRep_month() != null) {
				String monthCode = period.getRep_month().getValue();
				cal.set(Calendar.MONTH, Integer.parseInt(monthCode) - 1);
			}
			cal.set(Calendar.DAY_OF_MONTH, 1);
			report.setRepDate(cal.getTime());
		}

		try {
			BufferedReader fReader = new BufferedReader(new FileReader(f));
			String line = null;
			// /*
			StringBuffer b64 = new StringBuffer(); // TODO RK: uuema versiooni
													// jaoks, kus peab
													// attachmenti base64-st
													// dekodeerima!
			while ((line = fReader.readLine()) != null) { // seega TEST jaoks
															// peab see olemas
															// olema, LIVE jaoks
															// seda ei ole kuni
															// kasutatakse
															// sinist keskkonda
				b64.append(line); // loeme kogu hashi sisse
			}
			fReader = new BufferedReader(new StringReader(new String(
					Base64.decode(b64.toString()))));
			// */
			int rowNr = 0;
			HashMap<String, RegistryEntry> entrys = new HashMap<String, RegistryEntry>();
			while ((line = fReader.readLine()) != null) {
				rowNr++;

				String[] cols = line.split(";");
				if (cols.length != 8) {
					rowErrors.add(new Reaviga(String.valueOf(rowNr), Messages
							.getMessage("error.upload.wrongColNumber")));
					continue;
				}
				boolean colError = false;
				for (int i = 0; i < 8; i++) {
					if (cols[i].trim().length() == 0) {
						rowErrors.add(new Reaviga(String.valueOf(rowNr),
								Messages.getMessage("error.upload.emptyColumn",
										new Integer(i))));
						colError = true;
					}
				}
				if (colError)
					continue;
				String registryEntryNr = cols[0].trim().toLowerCase();
				if (registryEntryNr.indexOf(' ') > 0) {
					String[] regNrParts = registryEntryNr.split(" ");
					registryEntryNr = regNrParts[0];
				}
				RegistryEntry entry = null;
				if (entrys.containsKey(registryEntryNr)) {
					entry = entrys.get(registryEntryNr);
				} else {
					try {

						entry = registryService
								.findRegistryEntry(registryEntryNr);
						entrys.put(registryEntryNr, entry);

					} catch (Exception e) {
						rowErrors.add(new Reaviga(String.valueOf(rowNr),
								(Messages.getMessage(
										"error.reporting.regentry.NotFound",
										cols[0]))));
						continue;
					}
					// entrys.put(registryEntryNr, entry); // ee.. miks jälle?
				}
				/**
				 * 16.05.2014 @author Martin
				 * 
				 * See on mingi vana viga, taotluse salvestamisel on vahepeal
				 * anomaalia.
				 */

				if (entry == null) {
					// Piksel
					// @author MARTIN
					// FIXME SEDA VIGA UURIDA!

					rowErrors.add(new Reaviga(String.valueOf(rowNr), (Messages
							.getMessage("error.reporting.regentry.NotFound",
									cols[0]))));
					continue;
				}

				// LOGGER.debug("5");
				ProductMovementReportRecord record = new ProductMovementReportRecord();
				record.setCreated(new Date());
				record.setRegistryEntry(entry);
				record.setReceiverName(cols[1]);
				record.setMarketingPlaceName(cols[2]);
				record.setMarketingPlaceDistrict(cols[3]);
				record.setMarketingPlaceOrgUnit(cols[4]);
				record.setMarketingPlaceAddress(cols[5]);
				record.setPartyNr(cols[6]);
				Integer amount = null;
				try {
					amount = new Integer(cols[7]);
				} catch (Exception e) {
					rowErrors
							.add(new Reaviga(
									Integer.toString(rowNr),
									(Messages
											.getMessage("error.reporting.amountFormat"))));
				}
				record.setAmount(amount);
				report.addRecord(record);
			}
		} catch (IOException ioe) {
			results.setTeade(Messages.getMessage("error.reporting.file"));
			return results;
		}
		// LOGGER.debug(rowErrors.size()+" rowErrors for " +
		// reportingEnterpriseRegNr.getName() + "," +
		// reportingEnterpriseRegNr.getRegistrationId() ); // FIXME NPE

		if (rowErrors.size() > 0) {
			results.setTeade(Messages
					.getMessage("error.reporting.reportErrors"));
			Reaviga[] vead = new Reaviga[rowErrors.size()];
			int i = 0;
			for (Iterator it = rowErrors.iterator(); it.hasNext(); i++) {
				vead[i] = (Reaviga) it.next();

			}
			results.setVead(vead);

		} else {
			try {
				registryService.saveOrUpdate(report);
			} catch (Exception e) {

				results.setTeade(Messages.getMessage("error.reporting.save"));
				return results;
			}
			results.setTeade(Messages
					.getMessage("info.reporting.savedRecords", new Integer(
							report.getProductMovementReportRecords().size())));
		}

		return results;
	}

	private AttachmentPart[] getMessageAttachments() throws AxisFault {
		MessageContext msgContext = MessageContext.getCurrentContext();
		Message reqMsg = msgContext.getRequestMessage();
		Attachments messageAttachments = reqMsg.getAttachmentsImpl();
		if (null == messageAttachments) {
			return new AttachmentPart[0];
		}
		int attachmentCount = messageAttachments.getAttachmentCount();
		AttachmentPart attachments[] = new AttachmentPart[attachmentCount];
		Iterator it = messageAttachments.getAttachments().iterator();
		int count = 0;
		while (it.hasNext()) {
			AttachmentPart part = (AttachmentPart) it.next();
			attachments[count++] = part;
		}
		return attachments;
	}

	private static SimpleDateFormat MOKA_DATE_FORMAT = new SimpleDateFormat(
			"dd.MM.yyyy");
}
