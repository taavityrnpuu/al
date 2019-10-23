package ee.agri.alkor.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.security.core.userdetails.UserDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.xml.sax.InputSource;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.ExceptionConverter;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.xml.XmlParser;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.service.AuthenticationServiceDelegate;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.SystemException;

public class PDFCreator implements InitializingBean {

	private static Logger LOGGER = Logger.getLogger(PDFCreator.class);

	private String defaultFont;

	private String titleFont;

	private String defaultDateFormat;

	private String logoUrl;
	
	private String logoUrl2;

	private Properties contactInfo;

	private SimpleDateFormat dateFormat;

	private SimpleDateFormat yearFormat;

	private SimpleDateFormat yearShortFormat;

	private XmlParser parser;

	private String docRoot;

	public void setDocRoot(String docRoot) {
		this.docRoot = docRoot;
	}

	public String getDocRoot() {
		return docRoot;
	}

	/**
	 * synchronized to avoid exception caused by multiple threads calling parser
	 * simultaneously
	 * 
	 * @param docType
	 * @param application
	 * @param signer
	 * @param documents
	 * @return
	 */
	public synchronized File create(String docType, RegistryApplication application,
				Person signer, List<RegistryDocument> documents) {
		File tmpFile = null;
		// change /n to <newline />
		insertNewLinesToExplanation(application, 0);
		
		try {
			InputStream is = getClass().getClassLoader().getResourceAsStream(
						docType + ".xml");
			if (is == null)
				throw new SystemException("Couldn't find document template '"
							+ docType + ".xml");
			Map args = new HashMap();
			boolean isEIT = false;
			Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
			if (currentUser instanceof AlkoUserDetails) {
				AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
				if ("EIT".equals(userDetails.getUsername())) {
					isEIT = true;
				}
			}
			String nr = "";
			String arrived = "";
			String receiver = "";
			String exReceiver = "";
			String exReturned = "";
			String returner = "";
			if (!isEIT) {
				nr = application.getNr();
				if (application.getArrived() != null)
					arrived = dateFormat.format(application.getArrived());
				if (application.getRecievedBy() != null)
					receiver=getName(application.getRecievedBy());
				if (application.getExamplRecievedBy() != null)
					exReceiver=getName(application.getExamplRecievedBy());
				if (application.getExamplReturned() != null)
					exReturned = dateFormat.format(application.getExamplReturned());
				if (application.getExamplReturnedBy() != null)
					returner=getName(application.getExamplReturnedBy());
			}
			args.put("font", getDefaultFont());
			args.put("titleFont", getTitleFont());
			args.put("dateFormat", dateFormat);
			args.put("yearFormat", yearFormat);
			args.put("yearShortFormat", yearShortFormat);
			args.put("this", this);
			args.put("application", application);
			args.put("signer", signer);
			args.put("nr", nr);
			args.put("arrived", arrived);
			args.put("receiver", receiver);
			args.put("exReceiver", exReceiver);
			args.put("exReturned", exReturned);
			args.put("returner", returner);
			args.put("documents", documents != null ? documents : new ArrayList());

			String submtrName = "";
			if(application != null && (
					(application.getFromXTee() != null && application.getFromXTee() == true) || 
					(application.getCreatedBy() != null && application.getCreatedBy().equals("EIT"))
					)){
				
				submtrName = (application.getSubmitterName() != null ? application.getSubmitterName() : "").trim();
				if(application.getSubmitterOccupation() != null && !application.getSubmitterOccupation().equals("")){
					submtrName = submtrName + "; " + application.getSubmitterOccupation().trim(); 
				}
				
				submtrName.replaceAll("  ", " "); // topelt tühikud eemaldame ära, vanadest vigastest andmetest
			}
			
			args.put("submitterName", submtrName);

			String docString = VelocityTemplateProcessor.getInstance()
						.evaluate(new InputStreamReader(is), args);

			/*
			 * if(LOGGER.isDebugEnabled()) LOGGER.debug("Output from velosity:\n" +
			 * docString);
			 */

			tmpFile = File.createTempFile(docType, ".pdf",
						getDocRoot() == null ? null : new File(getDocRoot()));
			Document document;
			// DEC page size 505,940
			if (IClassificatorService.DOC_TYPE_DEC.equals(docType) || IClassificatorService.DOC_TYPE_NDEC.equals(docType)
					|| IClassificatorService.DOC_TYPE_EX_DEC.equals(docType) || IClassificatorService.DOC_TYPE_EX_NDEC.equals(docType)) {
			document = new Document(PageSize.A4);
		} else {
			document = new Document(PageSize.A4);
		}

			// new Rectangle(595,842)
			PdfWriter writer = PdfWriter.getInstance(document,
						new FileOutputStream(tmpFile));
			if (IClassificatorService.DOC_TYPE_DEC.equals(docType) || IClassificatorService.DOC_TYPE_EX_DEC.equals(docType)) {
				writer.setPageEvent(new DecisionEventHelper());
			} else if (IClassificatorService.DOC_TYPE_COR.equals(docType) || IClassificatorService.DOC_TYPE_EX_COR.equals(docType)) {
				writer.setPageEvent(new CorrectionEventHelper());
			}
			
			parser.go(document, new InputSource(new StringReader(docString)));
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		// change <newline /> to /n
		insertNewLinesToExplanation(application, 1);
		return tmpFile;
	}

	private String getName(String name) {
		String result="";
		 SystemUser user = AuthenticationServiceDelegate.loadUserByNameStat(name);
		if (user != null){
			result = user.getPerson().getFirstName() + " " + user.getPerson().getLastName();
		}
		return result;
	}

	public PDFCreator() {
		super();
		this.parser = new XmlParser();
	}

	/**
	 * Called after properties has been set.
	 */
	public void afterPropertiesSet() throws Exception {
		dateFormat = new SimpleDateFormat(getDefaultDateFormat());
		yearFormat = new SimpleDateFormat("yyyy");
		yearShortFormat = new SimpleDateFormat("yy");
	}

	// reavahetused
	private void insertNewLinesToExplanation(RegistryApplication application, int option) {
		if (application.getDecision() != null) {
			String refuseReason = (String) application.getDecision().getExplanation();
			if (refuseReason != null && refuseReason != "") {

				if (option == 0)
					refuseReason = refuseReason.replaceAll("\n", "<newline />");
				else
					refuseReason = refuseReason.replaceAll("<newline />", "\n");
				application.getDecision().setExplanation(refuseReason);
			}
		}

	}

	public String getDefaultFont() {
		return defaultFont;
	}

	public void setDefaultFont(String defaultFont) {
		this.defaultFont = defaultFont;
	}

	public String getDefaultDateFormat() {
		return defaultDateFormat;
	}

	public void setDefaultDateFormat(String defaultDateFormat) {
		this.defaultDateFormat = defaultDateFormat;
	}

	public Properties getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Properties contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	
	public String getLogoUrl2() {
		return logoUrl2;
	}

	public void setLogoUrl2(String logoUrl2) {
		this.logoUrl2 = logoUrl2;
	}

	/**
	 * @param titleFont
	 *           the titleFont to set
	 */
	public void setTitleFont(String titleFont) {
		this.titleFont = titleFont;
	}

	/**
	 * @return the font
	 */
	public String getTitleFont() {
		return this.titleFont;
	}

	/**
	 * Used to add a footer to the correction document
	 * 
	 * @author kaupo
	 * 
	 */
	class CorrectionEventHelper extends PdfPageEventHelper {

		private PdfPTable foot;

		private Font font;

		/**
		 *
		 */
		public CorrectionEventHelper() {
			font = FontFactory.getFont(defaultFont);
			font.setSize(12.0f);
			foot = new PdfPTable(3);
			PdfPCell empty = new PdfPCell();
			//PdfPCell cell = new PdfPCell(new Phrase(contactInfo.getProperty("streetAdr"), font));
			//cell.setBorder(1);
			//foot.addCell(empty);
			//cell = new PdfPCell(new Phrase("Tel   " + contactInfo.getProperty("phone"), font));
			//cell.setBorder(1);
			//foot.addCell(empty);
			//cell = new PdfPCell(new Phrase("E-post " + contactInfo.getProperty("email"), font));
			//cell.setBorder(1);
			//foot.addCell(empty);
			//cell = new PdfPCell(new Phrase(contactInfo.getProperty("cityAdr"), font));
			//cell.setBorder(0);
			//foot.addCell(empty);
			//cell = new PdfPCell(new Phrase("Faks " + contactInfo.getProperty("fax"), font));
			//cell.setBorder(0);
			//foot.addCell(empty);
			//cell = new PdfPCell(new Phrase("Reg nr " + contactInfo.getProperty("regnr"), font));
			//cell.setBorder(0);
			//foot.addCell(empty);
		}

		/**
		 * Will add a footer with contact info
		 */
		public void onEndPage(PdfWriter writer, Document document) {
			try {
				Rectangle page = document.getPageSize();

				foot.setTotalWidth(page.getWidth() - document.leftMargin() - document.rightMargin());
				foot.writeSelectedRows(0, -1, document.leftMargin(), document.bottomMargin(),
							writer.getDirectContent());
				document.setPageSize(PageSize.A4);
			} catch (Exception e) {
				throw new ExceptionConverter(e);
			}
		}
	}

	class DecisionEventHelper extends PdfPageEventHelper {

		private PdfPTable foot;

		private Font font;

		/**
		 *
		 */
		public DecisionEventHelper() {
			font = FontFactory.getFont(defaultFont);
			font.setSize(10.0f);
			foot = new PdfPTable(3);
			PdfPCell empty = new PdfPCell();
			//empty.setBorder(1);
			//foot.addCell(empty);
			//foot.addCell(empty);
			//PdfPCell cell = new PdfPCell(new Phrase("Reg nr " + contactInfo.getProperty("regnr"), font));
			//cell.setBorder(1);
			//cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			//foot.addCell(empty);
		}

		/**
		 * Will add a footer with contact info
		 */
		public void onEndPage(PdfWriter writer, Document document) {
			try {
				Rectangle page = document.getPageSize();

				foot.setTotalWidth(page.getWidth() - document.leftMargin() - document.rightMargin());
				foot.writeSelectedRows(0, -1, document.leftMargin(), document.bottomMargin(),
							writer.getDirectContent());
				document.setPageSize(PageSize.A4);
			} catch (Exception e) {
				throw new ExceptionConverter(e);
			}
		}
	}

}
