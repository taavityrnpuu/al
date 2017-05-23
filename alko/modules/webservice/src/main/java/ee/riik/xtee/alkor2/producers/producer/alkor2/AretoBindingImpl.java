package ee.riik.xtee.alkor2.producers.producer.alkor2;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.attachments.AttachmentPart;
import org.apache.axis.attachments.Attachments;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.types.URI;
import org.apache.log4j.Logger;

import com.lowagie.text.pdf.codec.Base64;

import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.ContactInfo;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductMoveReportView;
import ee.agri.alkor.model.ProductMovementReport;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.XTeeId;
import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.ApplicationType;
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
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.IUserManagerService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.service.SystemException;
import ee.agri.alkor.xtee.Messages;
import ee.agri.alkor.xtee.impl.XteeHeaderMap;
import ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddEnterpriseResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AppFollowResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationsResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ExtendResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder;

/**
 * Siin on implementeeritud K6IK xtee/eesti.ee veebiteenused.
 * vt ka alkor2.wsdl
 */
public class AretoBindingImpl implements
ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType {

   private static Logger LOGGER = Logger.getLogger(AretoBindingImpl.class);

   private static String[] methods = { "alkor2.eitlaadib.v2",
      "alkor2.liikumine.v2", "alkor2.aretolaadib.v2",
      "alkor2.eitparib.v2", "alkor2.aruandeparing.v2",
      "alkor2.tooteparing.v2", "alkor2.kammparing.v2",
      "alkor2.transactionStatement.v1", "alkor2.addApplication.v2",
      "alkor2.updateApplication.v2", "alkor2.applyedApplications.v2",
      "alkor2.acceptedApplications.v2", "alkor2.getApplication.v2",
      "alkor2.prolongApplication.v2", "alkor2.getApplicationDocuments.v2",
      "alkor2.updateApplicationDocuments.v2","alkor2.checkApplication.v1",
      "alkor2.aruandjaparija.v2","alkor2.getEnterprise.v1", "alkor2.addEnterprise.v1",
      "alkor2.legacy1.v1", "alkor2.extendApps.v1", "alkor2.prolongApp60.v1"};

   private static List countriesList, tooteLiigid, capacitTypes,
   packingMaterialTypes, bottleColorTypes, bottleShapeTypes,
   corkMaterialTypes, corkColorTypes, corkShapeTypes,
   stockingColorTypes;

   public static final String ettevotjaNimi = "EITist uus ettevõtja";

   private final IRegistryService registryService;

   private final  DecimalFormat ethanolRateFormat;

   public AretoBindingImpl() {
      super();
      ethanolRateFormat = new DecimalFormat();
      ethanolRateFormat.setDecimalSeparatorAlwaysShown(false);
      DecimalFormatSymbols dfs = new DecimalFormatSymbols();
      dfs.setDecimalSeparator('.'); // EI TOHI OLLA KOMA, PUNKT-PUNKT-PUNKT !!!
      ethanolRateFormat.setDecimalFormatSymbols(dfs);

      registryService = ServiceFactory.getRegistryService();
      IClassificatorService classService = ServiceFactory
            .getClassificatorService();
      if (tooteLiigid == null) {
         LOGGER.info("Initsialiseerime klassifikaatorid...");

         List<Classificator> countries = classService
               .findClassItems(Country.class.getName());
         countriesList = new ArrayList();
         countriesList.add(new CountryType(""));
         for (Classificator c : countries) {
            countriesList.add(new CountryType(c.getCode()));
         }
         List<Classificator> productTypes = classService
               .findClassItems(ProductType.class.getName());
         tooteLiigid = new ArrayList();
         for (Classificator c : productTypes) {
            tooteLiigid.add(new Tooteliik(c.getCode()));
         }
         List<Classificator> types = classService
               .findClassItems(Capacity.class.getName());
         capacitTypes = new ArrayList();
         for (Classificator c : types) {
            capacitTypes.add(new CapacityType(c.getCode()));
         }

         types = classService
               .findClassItems(PackingMaterial.class.getName());
         packingMaterialTypes = new ArrayList();
         for (Classificator c : types) {
            packingMaterialTypes.add(new PackingMaterialType(c.getCode()));
         }
         types = classService.findClassItems(BottleColor.class.getName());
         bottleColorTypes = new ArrayList();
         for (Classificator c : types) {
            bottleColorTypes.add(new BottleColorType(c.getCode()));
         }
         types = classService.findClassItems(BottleShape.class.getName());
         bottleShapeTypes = new ArrayList();
         for (Classificator c : types) {
            bottleShapeTypes.add(new BottleShapeType(c.getCode()));
         }

         types = classService.findClassItems(CorkMaterial.class.getName());
         corkMaterialTypes = new ArrayList();
         for (Classificator c : types) {
            corkMaterialTypes.add(new CorkMaterialType(c.getCode()));
         }
         types = classService.findClassItems(CorkColor.class.getName());
         corkColorTypes = new ArrayList();
         for (Classificator c : types) {
            corkColorTypes.add(new CorkColorType(c.getCode()));
         }
         types = classService.findClassItems(CorkShape.class.getName());
         corkShapeTypes = new ArrayList();
         for (Classificator c : types) {
            corkShapeTypes.add(new CorkShapeType(c.getCode()));
         }
         types = classService.findClassItems(StockingColor.class.getName());
         stockingColorTypes = new ArrayList();
         for (Classificator c : types) {
            stockingColorTypes.add(new StockingColorType(c.getCode()));
         }

         LOGGER.info("klassifikaatorite initsialiseerime l�bi");
      }
   }

   public java.lang.String[] listMethods(String keha)
         throws java.rmi.RemoteException {
      LOGGER.debug(">>> >>> >>> listMethods");
      return methods;
   }

   public void eitlaadib(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring keha,
         org.apache.axis.holders.DataHandlerHolder aruanne,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2)
               throws java.rmi.RemoteException {
      LOGGER.debug(">>> >>> >>> eitlaadib");
      paring.value = keha;
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }
      String reportingEnterriseRegNr = null;
      
      
      
      if ((header.getSubEnterpriseRegNr() != null)
            && (header.getSubEnterpriseRegNr().trim().length() > 0)) {
         reportingEnterriseRegNr = header.getSubEnterpriseRegNr().trim();
         LOGGER.debug("allasutus: " + reportingEnterriseRegNr); 
      } else {
    	  reportingEnterriseRegNr = header.getRequestEnterprise();
//          LOGGER.debug("allasutus: " + reportingEnterriseRegNr); 
//    	  String message = Messages.getMessage("error.reporting.enterprise.noSubenterprise");
//          LOGGER.error(message);
//          Eitlaadib_vastus results = new Eitlaadib_vastus();
//          keha2.value = results;
//          results.setTeade(message);
//          keha.setAruanne(null);
//          throw new RemoteException(message);
      }
      
      Enterprise reportingEnt = null;
      try {
         if ((reportingEnt = registryService
               .getEnterpriseByActivity(reportingEnterriseRegNr)) == null) {

            String message = Messages.getMessage("error.reporting.enterprise.NotRegistered",reportingEnterriseRegNr);
            LOGGER.error(message);
            Eitlaadib_vastus results = new Eitlaadib_vastus();
            keha2.value = results;
            results.setTeade(message);
            keha.setAruanne(null);
         }

         else if(keha.getPeriod()==null||keha.getPeriod().getRep_month()==null||keha.getPeriod().getRep_month().getValue()==null){
            String message = Messages.getMessage("error.reporting.month.missing");
            LOGGER.error(message);
            Eitlaadib_vastus results = new Eitlaadib_vastus();
            keha2.value = results;
            results.setTeade(message);
            keha.setAruanne(null);
         }
         else  if(keha.getPeriod().getRep_year()==null){
            String message = Messages.getMessage("error.reporting.year.missing");
            LOGGER.error(message);
            Eitlaadib_vastus results = new Eitlaadib_vastus();
            keha2.value = results;
            results.setTeade(message);
            keha.setAruanne(null);
         }
         else{
            keha.setAruanne(processUploadedReport(header, reportingEnt, keha.getPeriod(), keha2));
         }
         LOGGER.debug("all done");
      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }
      putHeader(header);
   }

   public void aretolaadib(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring keha,
         org.apache.axis.holders.DataHandlerHolder aruanne,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aretolaadib_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2)
               throws java.rmi.RemoteException {
      LOGGER.debug(">>> >>> >>> aretolaadib");
      paring.value = keha;
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
         if ((reportingEnt = registryService.getEnterpriseByActivity(keha.getAruandja().getReg_nr())) == null) {
            String message = Messages.getMessage("error.reporting.enterprise.NotRegistered",keha.getAruandja().getReg_nr());
            LOGGER.error(message);
            Eitlaadib_vastus results = new Eitlaadib_vastus();
            keha2.value = results;
            results.setTeade(message);
            keha.setAruanne(null);
         }
         if(keha.getPeriod()==null||keha.getPeriod().getRep_month()==null||keha.getPeriod().getRep_month().getValue()==null){
            String message = Messages.getMessage("error.reporting.month.missing");
            LOGGER.error(message);
            Eitlaadib_vastus results = new Eitlaadib_vastus();
            keha2.value = results;
            results.setTeade(message);
            keha.setAruanne(null);
         } else  if(keha.getPeriod().getRep_year()==null){
            String message = Messages.getMessage("error.reporting.year.missing");
            LOGGER.error(message);
            Eitlaadib_vastus results = new Eitlaadib_vastus();
            keha2.value = results;
            results.setTeade(message);
            keha.setAruanne(null);
         }else
         {
            keha.setAruanne(processUploadedReport(header, reportingEnt, keha.getPeriod(), keha2));
         }
      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }
      putHeader(header);
   }

   public void liikumine(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_vastusHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> liikumine");
	  XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }
      LOGGER.debug("here!");
      paring.value = keha;
      SearchFilter search = new SearchFilter();
      search.setObjectClass("ProductMovementReportRecord");
      Map searchParams = new HashMap();
      if (keha.getReg_book_nr() != null)
         searchParams.put("registryEntry.nr", keha.getReg_book_nr());
      if (keha.getEnt_name() != null)
         searchParams.put("report.reportingEnterprise.name", keha
               .getEnt_name());
      if (keha.getEnt_reg_nr() != null)
         searchParams.put("report.reportingEnterprise.registrationId", keha
               .getEnt_reg_nr());
      if (keha.getReceiver() != null)
         searchParams.put("receiverName", keha.getReceiver());
      if (keha.getMarket() != null)
         searchParams.put("marketingPlaceName", keha.getMarket());
      if (keha.getAddr_str() != null)
         searchParams.put("marketingPlaceAddress", keha.getAddr_str());
      if (keha.getAddr_town() != null)
         searchParams.put("marketingPlaceOrgUnit", keha.getAddr_town());
      if (keha.getAddr_county() != null)
         searchParams.put("marketingPlaceDistrict", keha.getAddr_county());
      if (keha.getP_nr() != null)
         searchParams.put("partyNr", keha.getP_nr());
      if (keha.getP_cnt() != null)
         searchParams.put("amount", keha.getP_cnt());

      if (keha.getReport_id() != null)
         searchParams.put("report.id", keha.getReport_id().longValue());

      if (keha.getL_date_from() != null)
         searchParams.put("start_date", keha.getL_date_from());
      if (keha.getL_date_to() != null)
         searchParams.put("end_date", keha.getL_date_to());

      if (keha.getPeriod() != null) {
         Kalendrikuu month = keha.getPeriod().getRep_month();
         if (month != null) {
            String repMonth = keha.getPeriod().getRep_month().getValue();
            searchParams.put("report.reportPeriodMonth.code", repMonth);
         }
         if (keha.getPeriod().getRep_year() != null) {
            try {
               Integer repYear = Integer.parseInt(keha.getPeriod()
                     .getRep_year());
               searchParams.put("report.reportPeriodYear", repYear);
            } catch (Exception e) {
               LOGGER.error(e,e);
            }

         }
      }
      search.setQueryParams(searchParams);
      search.setPageSize(1000);
      Map sort = new HashMap<String, String>();
      sort.put("created","desc");
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
            search.setStartIndex(search.getStartIndex()+search.getResultsList().size());
         }
         message = Messages.getMessage("info.searchResults", new Integer(
               resultList.size()));
      } catch (Exception e) {
         LOGGER.error(e, e);
         message = e.toString();
      }
      Liikumine[] moves = null;
      StringBuilder csvReport = new StringBuilder();

      if ((keha.getResp_attach() != null)
            && keha.getResp_attach().booleanValue()) {
         moves = new Liikumine[0];
         try {
            /*
				 File f = File.createTempFile("alkor2" + header.getId(), ".csv");
				 PrintWriter out = new PrintWriter(f);*/
            for (Iterator it = resultList.iterator(); it.hasNext();) {
               Liikumine move = (Liikumine) it.next();
               StringBuilder sb = new StringBuilder();
               sb.append(move.getReg_book_nr()).append(";").append(
                     move.getEnt_name()).append(";").append(
                           move.getMarket()).append(";").append(
                                 move.getReceiver()).append(";").append(
                                       move.getAddr_county()).append(";").append(
                                             move.getAddr_town()).append(";").append(
                                                   move.getAddr_str()).append(";").append(
                                                         move.getP_nr()).append(";").append(
                                                               move.getReport_id()).append(";").append(
                                                                     move.getP_cnt()).append("\n");

               //out.println(sb.toString());
               csvReport.append(sb);
            }
            //out.close();

            respondAttachment(csvReport.toString());
            // f.delete();
         } catch (Exception e) {
            LOGGER.error(e, e);
            message = e.toString();
         }
      } else {
         moves = new Liikumine[resultList.size()];
         int i = 0;
         for (Iterator it = resultList.iterator(); it.hasNext(); i++) {
            moves[i] = (Liikumine) it.next();
         }
      }
      keha2.value = new Liikumine_vastus(message, moves, csvReport.toString());

      putHeader(header);

   }

   public void eitparib(
         java.lang.String keha,
         javax.xml.rpc.holders.StringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> eitparib");
	  paring.value = keha;
      keha2.value = new ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus();
      XteeHeaderMap header = null;
      Enterprise reportingEnterprise = null;
      Aruandja aruandja = new Aruandja();
      keha2.value.setAruandja(aruandja);

      try {
         header = getXteeHeader();
         putHeader(header);
         String reportingEntRegrNr = (header.getSubEnterpriseRegNr() != null) ? header.getSubEnterpriseRegNr(): header.getEnterpriseRegNr();
         LOGGER.debug("otsin numbriga:"+reportingEntRegrNr);
         keha2.value = new ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus();
         keha2.value.setAruandja(aruandja);

         reportingEnterprise = registryService.findProductMovementReportingEnterprise(reportingEntRegrNr.trim());
      } catch (IndexOutOfBoundsException ioe) {
         aruandja.setName(" ");
         keha2.value.setTeade(Messages.getMessage("info.query.notFound"));
         return;
      }
      aruandja.setName(reportingEnterprise.getName());
      if (reportingEnterprise.getContactInfo() != null) {
         aruandja.setEmail(reportingEnterprise.getContactInfo().getEmail());
         aruandja.setFax(reportingEnterprise.getContactInfo().getFax());
      }
      aruandja.setAddress(formatAddress(reportingEnterprise.getAddress()));
   }

   public void aruandjaparija(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandjaparija_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> aruandjaparija");
	  paring.value = keha;
      keha2.value = new ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus();
      Enterprise reportingEnterprise = null;
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
      } catch (Exception e) {
         keha2.value.setTeade(e.toString());
         return;
      }

      int reportId = paring.value.getReport_id();
      if (reportId == 0) {
         keha2.value.setTeade(Messages
               .getMessage("error.query.reportIdRequired"));
         return;
      }
      Aruandja aruandja = new Aruandja();
      keha2.value.setAruandja(aruandja);
      try {
         reportingEnterprise = registryService
               .findProductMovementReportingEnterprise(paring.value
                     .getReport_id());
      } catch (IndexOutOfBoundsException ioe) {
         keha2.value.setTeade(Messages.getMessage("info.query.notFound"));
         return;
      }
      if (reportingEnterprise == null) {
         keha2.value.setTeade(Messages.getMessage("info.query.notFound"));
         return;
      }

      aruandja.setName(reportingEnterprise.getName());
      if (reportingEnterprise.getContactInfo() != null) {
         aruandja.setEmail(reportingEnterprise.getContactInfo().getEmail());
         aruandja.setFax(reportingEnterprise.getContactInfo().getFax());
      }

      Address address = reportingEnterprise.getAddress();

      if (address != null) {
         aruandja.setAddress(formatAddress(address));
      }
      putHeader(header);
   }

   public void aruandeparing(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_vastusHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> aruandeparing");
	  paring.value = keha;
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
      } catch (Exception e) {
         keha2.value.setTeade(e.toString());
         return;
      }
      SearchFilter filter = new SearchFilter();
      filter.setObjectClass("ProductMoveReportView");
      Map searchParams = new HashMap();

      String reportingEntRegrNr = (header.getSubEnterpriseRegNr() != null) ? header.getSubEnterpriseRegNr(): header.getEnterpriseRegNr();
      searchParams.put("regId", reportingEntRegrNr);
      LOGGER.info("reportingEnterprise.registrationId:"+reportingEntRegrNr);
      searchParams.put("loadEnterpriseId", new StringBuilder(header.getEnterpriseRegNr()));
      LOGGER.info("loadEnterpriseId"+header.getEnterpriseRegNr());
      if (keha.getL_date_from() != null)
         searchParams.put("start_date", keha.getL_date_from());
      if (keha.getL_date_to() != null)
      {
         Date endDate = keha.getL_date_to();
         Calendar cal = Calendar.getInstance();
         cal.setTime(endDate);
         cal.add(Calendar.DAY_OF_YEAR, 1);
         searchParams.put("end_date", cal.getTime());
      }
      if (keha.getPeriodStart() != null) {
         Kalendrikuu month = keha.getPeriodStart().getRep_month();
         LOGGER.info("month:"+month);
         if (keha.getPeriodStart().getRep_year() != null) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.MONTH, 0);
            try {
               Integer repYear = Integer.parseInt(keha.getPeriodStart().getRep_year());
               cal.set(Calendar.YEAR, repYear);
               if(month!=null)
                  cal.set(Calendar.MONTH, Integer.parseInt(month.getValue())-1);
               searchParams.put("reportPeriodStart", cal.getTime());
               LOGGER.info("reportPeriodStart:"+cal.getTime());
            } catch (Exception e) {
               LOGGER.error(e,e);
            }
         }else{
            if (month != null) {
               searchParams.put("reportPeriodMonthStart", Integer.parseInt(month.getValue()));
            }
         }
      }

      if (keha.getPeriodEnd() != null) {
         Kalendrikuu month = keha.getPeriodEnd().getRep_month();
         LOGGER.info("month:"+month);
         if (keha.getPeriodEnd().getRep_year() != null) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.MONTH, 0);
            try {
               Integer repYear = Integer.parseInt(keha.getPeriodEnd().getRep_year());
               cal.set(Calendar.YEAR, repYear);
               if(month!=null)
                  cal.set(Calendar.MONTH, Integer.parseInt(month.getValue())-1);
               searchParams.put("reportPeriodEnd", cal.getTime());
               LOGGER.info("reportPeriodEnd:"+cal.getTime());
            } catch (Exception e) {
               LOGGER.error(e,e);
            }
         }else{
            if (month != null) {
               searchParams.put("reportPeriodMonthEnd", Integer.parseInt(month.getValue()));
            }
         }
      }
      Map sort = new HashMap<String, String>();
      sort.put("repDate","desc");
      filter.setSortMap(sort);
      filter.setQueryParams(searchParams);
      List resultList = new ArrayList();
      String message = null;
      try {
         while (true) {
            //			   LOGGER.debug("aruandeparingn");
            registryService.search(filter);
            if (filter.getResultsList().size() == 0)
               break;
            //				int i=0;
            //				LOGGER.debug("XX");
            for (Iterator it = filter.getResultsList().iterator(); it.hasNext();) {
               //				   LOGGER.debug(i);
               //				   i++;
            	ProductMoveReportView report = (ProductMoveReportView) it.next();
               Aruandeparing_vastuserida row = new Aruandeparing_vastuserida();
               row.setLoad_date(report.getCreated());
               row.setLoad_user(report.getLoadPersonId());
               if (report.getLoadEnterpriseId()!=null) {
                  row.setEnt_reg_nr(report.getRegId());
                  row.setEnt_name(report.getName());
                  row.setEnt_contact(report.getContacts());
               }
               Aruandeperiood period = new Aruandeperiood();
               if (report.getRepDate() != null){
                  Calendar cal = Calendar.getInstance();
                  cal.setTime(report.getRepDate());
                  period.setRep_year(cal.get(Calendar.YEAR)+"");

                  period.setRep_month(new Kalendrikuu((cal.get(Calendar.MONTH)+1)+""));
               }
               row.setPeriod(period);
               row.setReport_id(report.getId().intValue());
               row.setRcd_count(Long.toString(report.getTotal()));
               resultList.add(row);
            }
            filter.setStartIndex(filter.getStartIndex()+filter.getResultsList().size());
         }
         message = Messages.getMessage("info.searchResults", new Integer(
               resultList.size()));
      } catch (Exception e) {
         LOGGER.error(e, e);
         message = e.toString();
      }
      //		LOGGER.debug("aruandeparing pool");
      Aruandeparing_vastuserida[] rows = null;
      StringBuilder csvReport = new StringBuilder();

      if (keha.isResp_attach()) {
         rows = new Aruandeparing_vastuserida[0];
         try {
            /**
				 File f = File.createTempFile("alkor2" + header.getId(), ".csv");
				 PrintWriter out = new PrintWriter(f);*/
            for (Iterator it = resultList.iterator(); it.hasNext();) {
               Aruandeparing_vastuserida row = (Aruandeparing_vastuserida) it
                     .next();
               StringBuilder sb = new StringBuilder();
               sb.append(row.getReport_id()).append(";").append(row.getEnt_name()).append(";").append(row.getEnt_reg_nr()).append(";").append(row.getLoad_date()).append(";");
               if (row.getPeriod() != null) {
                  sb.append(row.getPeriod().getRep_year());
                  if (row.getPeriod().getRep_month() != null)
                     sb.append("-").append(row.getPeriod().getRep_month().getValue());
               }
               sb.append(";");
               sb.append(row.getLoad_user());
               sb.append(";");
               sb.append(row.getRcd_count()).append("\n");

               //out.println(sb.toString());
               csvReport.append(sb);
            }
            //out.close();

            respondAttachment(csvReport.toString());
            // f.delete();
         } catch (Exception e) {
            LOGGER.info(e,e);
            LOGGER.error(e, e);
            message = e.toString();
         }

      } else {
         rows = new Aruandeparing_vastuserida[resultList.size()];
         int i = 0;
         for (Iterator it = resultList.iterator(); it.hasNext(); i++) {
            rows[i] = (Aruandeparing_vastuserida) it.next();
         }
      }
      keha2.value = new Aruandeparing_vastus(message, rows, csvReport
            .toString());
      LOGGER.info("aruandeparing end");
      putHeader(header);
   }

   @SuppressWarnings({ "unchecked", "rawtypes" })
   public void tooteparing(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_vastusHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> tooteparing");
      paring.value = keha;
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
         putHeader(header);
      } catch (Exception e) {
         keha2.value.setTeade(e.toString());
         return;
      }
      String message = null;
      String requestEntRegNr = header.getRequestEnterprise();
      SearchFilter filter = new SearchFilter();
      filter.setObjectClass("RegistryApplication");
      Map searchParams = new HashMap();
      searchParams.put("applicant.registrationId", requestEntRegNr);
      searchParams.put("type.code", IClassificatorService.APPL_TYPE_ARE);

      if (keha.getReg_book_nr() != null)
         searchParams.put("registryEntry.nr", keha.getReg_book_nr());
      if (keha.getCountry() != null)
         searchParams.put("product.producer.address.country.code", keha.getCountry().getValue());
      if (keha.getItem_name() != null)
         searchParams.put("product.name", keha.getItem_name());
      if (keha.getProducttype() != null)
         searchParams.put("product.type.code", keha.getProducttype().getValue());
      if (keha.getMan_actor_name() != null)
         searchParams.put("product.producer.name", keha.getMan_actor_name());
      if (keha.getEthanol_vol()!=null)
         searchParams.put("product.ethanolRate", new BigDecimal(keha.getEthanol_vol()));
      if (keha.getVolume()!=null)
         searchParams.put("product.packingVolume.code", keha.getVolume().getValue());

      if( (keha.getStatus1() != null && keha.getStatus1().booleanValue()) &&
            (keha.getStatus2() != null && keha.getStatus2().booleanValue()) )
      {
         // do nothing, if both options are checked
      }
      else if(keha.getStatus1() != null && keha.getStatus1().booleanValue())
      {
         searchParams.put("registryEntry.validUntil", SearchFilter.NOT_LESS_THAN_CURRENT_DATE);
      }
      else if(keha.getStatus2() != null && keha.getStatus2().booleanValue())
      {
         searchParams.put("registryEntry.validUntil", SearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE);
      }

      Map sort = new HashMap<String, String>();
      sort.put("created","desc");
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
               //s.applicant.registrationId
               RegistryApplication a = (RegistryApplication) it.next();
               Tooteparing_vastuserida row = new Tooteparing_vastuserida();
               if (a.getRegistryEntry() != null) {
                  row.setReg_book_nr(a.getRegistryEntry().getNr());
                  if(a.getRegistryEntry().getValidFrom()!=null){
                     if(keha.getDate_fromS()!=null){
                        if(a.getRegistryEntry().getValidFrom().before(keha.getDate_fromS())){
                           continue;
                        }
                     }
                     if(keha.getDate_toS()!=null){
                        if(a.getRegistryEntry().getValidFrom().after(keha.getDate_toS())){
                           continue;
                        }
                     }
                  }
                  if(a.getRegistryEntry().getValidUntil()!=null){
                     if(keha.getDate_fromE()!=null){
                        if(a.getRegistryEntry().getValidUntil().before(keha.getDate_fromE())){
                           continue;
                        }
                     }
                     if(keha.getDate_toE()!=null){
                        if(a.getRegistryEntry().getValidUntil().after(keha.getDate_toE())){
                           continue;
                        }
                     }
                  }
                  row.setReg_start(a.getRegistryEntry().getValidFrom());
                  row.setReg_end(a.getRegistryEntry().getValidUntil());
               }else
                  continue;
               Product p = a.getProduct();
               row.setItem_name(p.getName());
               row.setProducttype(p.getType().getName());
               row.setVolume(ethanolRateFormat.format(p.getEthanolRate().doubleValue()));
               row.setComment(p.getNotes());
               row.setState(a.getState().getName());
               if(p.getPackingVolume()!=null)
                  row.setCapacity(p.getPackingVolume().getName());
               if (p.getProducer() != null) {
                  row.setMan_actor_name(p.getProducer().getName());
                  if ((p.getProducer().getAddress() != null) && (p.getProducer().getAddress().getCountry() != null))
                     row.setCountry(p.getProducer().getAddress().getCountry().getName());
               }
               if(p.getOriginCountry()!=null)
                  row.setCreatcountry(p.getOriginCountry().getName());
               LOGGER.info(a.getState().getName()+":"+a.getState().getCode());
               resultList.add(row);
            }
            filter.setStartIndex(filter.getStartIndex() + filter.getResultsList().size());
         }
         message = Messages.getMessage("info.searchResults", new Integer(
               resultList.size()));
         Tooteparing_vastuserida[] rows = null;
         String csvReport = "";
         if (keha.isResp_attach()) {//paneme kokku faili
            StringBuilder csvReportBuf = new StringBuilder();
            rows = new Tooteparing_vastuserida[0];
            try {
               for (Iterator it = resultList.iterator(); it.hasNext();) {
                  Tooteparing_vastuserida row = (Tooteparing_vastuserida) it.next();
                  if(row.getReg_book_nr() != null)
                     csvReportBuf.append(row.getReg_book_nr());
                  csvReportBuf.append(",");
                  if(row.getReg_start() != null)
                     csvReportBuf.append(KAMM_DATE_FORMAT.format(row.getReg_start()));
                  csvReportBuf.append(",");
                  if(row.getReg_end() != null)
                     csvReportBuf.append(KAMM_DATE_FORMAT.format(row.getReg_end()));
                  csvReportBuf.append(",");
                  csvReportBuf.append(row.getItem_name()).append(",");
                  csvReportBuf.append(row.getMan_actor_name()).append(",");
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
               LOGGER.error(e, e);
               message = e.toString();
            }
         } else {
            rows = new Tooteparing_vastuserida[resultList.size()];
            int i = 0;
            for (Iterator it = resultList.iterator(); it.hasNext();) {
               rows[i++] = (Tooteparing_vastuserida) it.next();
            }
         }
         LOGGER.info("done");
         keha2.value = new Tooteparing_vastus(message, rows, csvReport);
      } catch (Exception e) {
         LOGGER.error(e, e);
         keha2.value.setTeade(e.toString());
      }

   }

   private static SimpleDateFormat KAMM_DATE_FORMAT = new SimpleDateFormat(
         "dd.MM.yyyy");
   static {
      KAMM_DATE_FORMAT.setLenient(false);
   }

   public void kammparing(
         ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_paringHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_vastusHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> kammparing");
      paring.value = keha;
      Kammparing_vastus result = new ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus();
      keha2.value = result;
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.toString());
      }
      // query has date precision, minute precision is needed
      // for applications added current date
      Date compDate = keha.getReg_date();
      Date now = new Date(System.currentTimeMillis());
      compDate.setHours(now.getHours());
      compDate.setMinutes(now.getMinutes());
      if (LOGGER.isDebugEnabled()){
         LOGGER.debug("compDate=" + compDate);
         LOGGER.debug("reg_book_nr=" + keha.getReg_book_nr());
      }
      Item item = new Item();
      result.setItem(item);

      try {
         RegistryEntry regEntry=registryService.findRegistryEntry(keha.getReg_book_nr().trim().toLowerCase());
         if (regEntry==null)
            result.setStatus(new Status_t("NOK"));
         else if (compDate!=null&&(regEntry.getValidFrom()!=null)&&(compDate.before(regEntry.getValidFrom()))
               ||(((regEntry.getValidUntil()!=null)&&(compDate.after(regEntry.getValidUntil()))))) {

            if (LOGGER.isDebugEnabled())
               LOGGER.debug("compDate not between valid, returning");
            // item.setItem_name("");
            result.setStatus(new Status_t("NOK"));
         } else {
            RegistryApplication a=regEntry.getApplication();
            Product p=regEntry.getApplication().getProduct();
            item.setItem_name(p.getName());
            item.setCn_code(p.getCode());
            item.setProducttype(p.getType().getName());
            item.setApp_reg_nr(regEntry.getNr());
            item.setReg_date(regEntry.getCreated());
            item.setCapacity(p.getPackingVolume().getName());
            item.setVolume(ethanolRateFormat.format(p.getEthanolRate().doubleValue()));
            if (a.getApplicant()!=null) {
               item.setApp_actor_name(a.getApplicant().getName());
            }
            if (p.getProducer() != null) {
               item.setMan_actor_name(p.getProducer().getName()); // selgub, et kõigil toodetel siiski pole tootjat ja tekib NPE, seega wrapime nullchecki sisse
               if (p.getProducer().getAddress()!=null)
                  item.setCountry(p.getProducer().getAddress().getCountry().getName());
            } else {
               LOGGER.warn("Producer is null!");
            }
            result.setStatus(new Status_t("OK"));
         }
      } catch (Exception e) {
         LOGGER.error("viga", e);
         result.setStatus(new Status_t("NOK"));
      }
      putHeader(header);
   }

   private static SimpleDateFormat MOKA_DATE_FORMAT = new SimpleDateFormat(
         "dd.MM.yyyy");

   public void transactionStatement(
         ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaQueryHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaResponseHolder keha2)
               throws java.rmi.RemoteException {
	  LOGGER.debug(">>> >>> >>> transactionStatement");
      final String PAYMENT_REF_NUMBER = "2900078305";
      final String PAYMENT_REF_NUMBER_2 = "2900082249";
      final String CREDIT_MESSAGE = "c";
      final String DEBIT_MESSAGE = "d";

      LOGGER.debug("--- beginning of transactionStatement()");

      // XXX: don't delete, may be required for debugging new Treasury perversions
      /*
	    // SOAP message
        try {
            MessageContext msgContext = MessageContext.getCurrentContext();
            Message requestMsg = msgContext.getRequestMessage();
            LOGGER.debug("MokaQuery SOAP message:\n" + requestMsg.getSOAPBody());
        } catch (SOAPException e) {
            LOGGER.error("", e);
        }*/
      // keha
      if (keha != null) {
         MokaType mt = keha.getMoka();
         if (mt != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("MokaQuery {\n");
            Payer payer = mt.getPayer();
            if (payer != null) {
               sb.append("\tPayer.AccountNum=" + payer.getAccountNum() + "\n");
               sb.append("\tPayer.Name=" + payer.getName() + "\n");
               sb.append("\tPayer.RefNum=" + payer.getRefNum() + "\n");
               sb.append("\tPayer.RegNum=" + payer.getRegNum() + "\n");
               sb.append("\tPayer.TransmissionDate=" + payer.getTransmissionDate() + "\n");
               sb.append("\n");
            }
            Payment payment = mt.getPayment();
            String paymentDesc = mt.getPaymentDesc();
            sb.append("\tPayment.PaymentDesc=" + paymentDesc + "\n");
            if (payment != null) {
               sb.append("\tPayment.Currency=" + payment.getCurrency() + "\n");
               sb.append("\tPayment.Type=" + payment.getType() + "\n");
               sb.append("\tPayment.Amount=" + payment.getAmount() + "\n");
               sb.append("\tPayment.BaseCurrencyAmount=" + payment.getBaseCurrencyAmount() + "\n");
               sb.append("\n");
            }
            Receiver receiver = mt.getReceiver();
            if (receiver != null) {
               sb.append("\tReceiver.AccountNum=" + receiver.getAccountNum() + "\n");
               sb.append("\tReceiver.Name=" + receiver.getName() + "\n");
               sb.append("\tReceiver.ReceptionDate=" + receiver.getReceptionDate() + "\n");
               sb.append("\tReceiver.RefNum=" + receiver.getRefNum() + "\n");
               sb.append("\tReceiver.RegNum=" + receiver.getRegNum() + "\n");
               sb.append("\n");
            }
            Treasury treasury = mt.getTreasury();
            String treasuryClassif = mt.getTreasuryClassif();
            sb.append("\tTreasury.TreasuryClassif=" + treasuryClassif + "\n");
            if (treasury != null) {
               sb.append("\tTreasury.BankRef=" + treasury.getBankRef() + "\n");
               sb.append("\tTreasury.DocumentNum=" + treasury.getDocumentNum() + "\n");
               sb.append("\tTreasury.OrderNum=" + treasury.getOrderNum() + "\n");
               sb.append("\n");
            }
            sb.append("} // end of MokaQuery\n");
            //LOGGER.debug(sb.toString());
         }
      }
      /**/


      paring.value = keha;

      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
         putHeader(header);
      } catch (Exception e) {
         LOGGER.error("AretoBindingImpl.transactionStatement exception"+e.getMessage(), e);
         keha2.value = new MokaResponse();
         keha2.value.setMessage(e.toString());
         keha2.value.setCode(2);
      }

      String resultText = "OK";
      int rc = 0;
      MokaType moka = keha.getMoka();

      if(registryService.isPaymentUnique(moka.getTreasury().getOrderNum()))
      {
         LOGGER.info("saving transaction, order_nr: "
               + moka.getTreasury().getOrderNum());

         RegistryPayment payment = new RegistryPayment();
         payment.setPayerRegistrationNr(moka.getPayer().getRegNum());
         payment.setPayerName(moka.getPayer().getName());
         payment.setPayingAccNo(moka.getPayer().getAccountNum());
         payment.setOrderNumber(moka.getTreasury().getOrderNum());
         payment.setPaymentDesc(moka.getPaymentDesc()); // hiljem lisatud

         // XXX: porn warning
         /* riigiametite perversus: kui on sisemine makse,
          * siis viitenumber voib olla tuhi ja tegelik viitenumber
          * asub saaja kontonumbri all
          */
         String type = moka.getPayment().getType() == null ? "" : moka.getPayment().getType();
         LOGGER.debug("Receieved payment type :" + type);
         if(DEBIT_MESSAGE.equals(type.toLowerCase()))
         {
            String refNum = moka.getReceiver().getRefNum();
            if (refNum == null || "".equals(refNum)) {
               refNum = moka.getReceiver().getAccountNum();
            }
            payment.setAmount(moka.getPayment().getAmount());
            payment.setReferenceNr(refNum);
         }
         else if(CREDIT_MESSAGE.equals(type.toLowerCase()))
         {
            payment.setReferenceNr(moka.getPayer().getAccountNum());
            payment.setAmount(moka.getPayment().getAmount() == null ? null : moka.getPayment().getAmount().negate());
         }
         else
         {
            resultText = "Not supported payment type:" + type;
            rc = 1; //TODO what is correct failure code ?
            LOGGER.error(resultText);

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
               LOGGER.error(resultText);
            }
         }
         try {
            //check the reference number
            if (!PAYMENT_REF_NUMBER.equals(payment.getReferenceNr()) && !PAYMENT_REF_NUMBER_2.equals(payment.getReferenceNr())) {
                LOGGER.warn("payment has an incorrect reference number (refNum=" + payment.getReferenceNr() + ") ADDING ANYWAY !!!");
            }
            RegistryPayment payment2 = (RegistryPayment)registryService.saveOrUpdate(payment);
            //try to automatically bind an enterprise to a payment by enterprise registration nr
            Enterprise enterprise = registryService.getEnterpriseByActivity(payment.getPayerRegistrationNr());
            if (enterprise != null) {
                registryService.bindPaymentToEnterpriseById(enterprise.getId(), payment2.getId());
            } else {
                LOGGER.debug("did not find any enterprises with given registration number (regNr="
                        + payment.getPayerRegistrationNr() + ")");
            }
         } catch (Exception e) {
            resultText = "Exception when saving transaction";
            rc = 2; // What ever
            LOGGER.error(resultText, e);
         }
      }
      else
      {
         LOGGER.info("Payment duplicate received, with orderNum:" + moka.getTreasury().getOrderNum());
      }
      keha2.value = new MokaResponse();
      keha2.value.setMessage(resultText);
      keha2.value.setCode(rc);
      LOGGER.debug("--- end of transactionStatement()");
   }

   public void getApplicationDocuments(ApplicationQuery keha,
         ApplicationQueryHolder paring,
         UpdateApplicationDocumentsResponseHolder keha2)
               throws RemoteException {
	   LOGGER.debug(">>> >>> >>> getApplicationDocuments");
      paring.value = keha;
      XteeHeaderMap header = null;
      UpdateApplicationDocumentsResponse response = new UpdateApplicationDocumentsResponse();
      response.setApplicationId(keha.getId());
      keha2.value = response;
      try {
         header = getXteeHeader();
         putHeader(header);
         List<RegistryDocument> applDocs = registryService
               .findApplicationDocuments(new Long(keha.getId()));

         ExistingApplicationDocumentType [] existingDocs = new ExistingApplicationDocumentType[applDocs
                                                                                               .size()];
         int i = 0;
         for (RegistryDocument d : applDocs) {
            ExistingApplicationDocumentType existingDoc = new ExistingApplicationDocumentType();
            existingDoc.setName(d.getName());
            existingDocs[i++] = existingDoc;
         }

         response.setExistingApplicationDocuments(existingDocs);

      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }

   }

   public void updateApplicationDocuments(
         ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery keha,
         org.apache.axis.holders.DataHandlerHolder doc1,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsQueryHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2)
               throws java.rmi.RemoteException {
	   LOGGER.debug(">>> >>> >>> updateApplicationDocuments");
      paring.value = keha;

      UpdateApplicationResponse response = new UpdateApplicationResponse();
      response.setId(keha.getApplicationId());
      response.setMessage("OK");
      keha2.value = response;
      UpdateApplicationDocumentsQuery query = keha;
      XteeHeaderMap header = null;

      try {
         header = getXteeHeader();
         putHeader(header);
         ExistingApplicationDocumentType2[] existingDocs = keha.getExistingApplicationDocuments();
         if (existingDocs != null) {
            for (int i = 0; i < existingDocs.length; i++) {
               ExistingApplicationDocumentType2 existingDoc = existingDocs[i];
               if(existingDoc.isDelete())
                  registryService
                  .deleteDocument(new Long(keha.getApplicationId()),
                        existingDoc.getName());
            }
         }
         AttachmentPart[] attachments = getMessageAttachments();

         if(LOGGER.isDebugEnabled())
            LOGGER.debug("attachments.length: " + attachments.length);

         NewApplicationDocumentType newApplDoc = query
               .getNewApplicationDocument();
         if ((newApplDoc != null) && (attachments.length > 0)) {
            saveApplicationDoc(new Long(query.getApplicationId()), newApplDoc,
                  attachments[0]);
            LOGGER.debug("attachment saved");
         }

      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }

   }

   public void applyedApplications(String keha, StringHolder paring,
         AppFollowResponseHolder keha2) throws RemoteException {
	   LOGGER.debug(">>> >>> >>> applyedApplications");
      paring.value = keha;
      AppFollowResponse result = new AppFollowResponse();
      keha2.value = result;
      result.setMessage("OK");
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         List<RegistryApplication> appls = registryService.findWaitingEnterpriseApplications(header.getRequestEnterprise());
         result.setApps(convertF(appls));
      } catch (Exception e) {
         LOGGER.error(e, e);
         result.setMessage(e.getMessage());
         throw new RemoteException(e.getMessage());
      }
   }

   public void acceptedApplications(String keha, StringHolder paring,
         ApplicationsResponseHolder keha2) throws RemoteException {
	   LOGGER.debug(">>> >>> >>> acceptedApplications");
      paring.value = keha;
      ApplicationsResponse result = new ApplicationsResponse();
      keha2.value = result;
      result.setMessage("OK");
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         List<RegistryApplication> appls = registryService
               .findEnterpriseExpiringEntryApplications(header
                     .getRequestEnterprise());
         result.setApps(convert(appls));
      } catch (Exception e) {
         LOGGER.error(e, e);
         result.setMessage(e.getMessage());
         throw new RemoteException(e.getMessage());
      }
   }

   private ApplicationDataShort[] convert(List<RegistryApplication> appls) {
      ApplicationDataShort[] applsData = new ApplicationDataShort[appls
                                                                  .size()];
      int i = 0;
      for (RegistryApplication a : appls) {
         ApplicationDataShort applData = new ApplicationDataShort();
         applsData[i] = applData;
         applData.setId(a.getId().toString());
         if(a.getNr()!=null)
            applData.setNr(a.getNr().toString());
         if (a.getRegistryEntry() != null)
            applData.setRegNr(a.getRegistryEntry().getNr());
         applData.setDate(KAMM_DATE_FORMAT.format(a.getArrived()));
         applData.setState(a.getState().getName());
         if (a.getDecision() != null){
            applData.setDecisionDate(KAMM_DATE_FORMAT.format(a.getDecision().getDate()));
            applData.setDecision(a.getDecision().getRegEntryDecision().getName());
         }
         if(a.getModified() != null)
            applData.setModificationDate(KAMM_DATE_FORMAT.format(a.getModified()));
         else
            applData.setModificationDate(KAMM_DATE_FORMAT.format(a.getCreated()));
         applData.setProductName(a.getProduct().getName());
         applData.setProductType(a.getProduct().getType().getName());
         if (a.getProcessor() != null)
            applData.setProcessingPerson(a.getProcessor().getFirstName()
                  + " " + a.getProcessor().getLastName());
         applData.setComment(a.getNotes());
         i++;
      }
      return applsData;
   }

   private AppFollow[] convertF(List<RegistryApplication> appls) {
      AppFollow[] applsData = new AppFollow[appls.size()];
      int i = 0;
      for (RegistryApplication a : appls) {
         AppFollow applData = new AppFollow();
         applsData[i] = applData;
         applData.setId(a.getId().toString());
         applData.setDate(KAMM_DATE_FORMAT.format(a.getArrived()));
         if(a.getProduct()!=null){
            applData.setProductName(a.getProduct().getName());
            if(a.getProduct().getType()!=null)
               applData.setProductType(a.getProduct().getType().getName());
            if(a.getProduct().getPackingVolume()!=null)
               applData.setProductCap(a.getProduct().getPackingVolume().getName());
            if(a.getProduct().getEthanolRate()!=null)
               applData.setProductVol(ethanolRateFormat.format(a.getProduct().getEthanolRate().doubleValue()));
         }
         applData.setState(a.getState().getName());
         if (a.getProcessor() != null)
            applData.setProcessingPerson(a.getProcessor().getFirstName()+ " " + a.getProcessor().getLastName());
         applData.setComment(a.getNotes());
         if(a.getModified() != null)
            applData.setModificationDate(KAMM_DATE_FORMAT.format(a.getModified()));
         else
            applData.setModificationDate(KAMM_DATE_FORMAT.format(a.getCreated()));
         i++;
      }
      return applsData;
   }

   private ExtendData[] convertE(List<RegistryApplication> appls) {
      ExtendData[] applsData = new ExtendData[appls.size()];
      int i = 0;
      for (RegistryApplication a : appls) {
         ExtendData applData = new ExtendData();
         applData.setId(a.getId().toString());
         if (a.getRegistryEntry() != null){
            applData.setRegNr(a.getRegistryEntry().getNr());
            applData.setStart(KAMM_DATE_FORMAT.format(a.getRegistryEntry().getValidFrom()));
            applData.setEnd(KAMM_DATE_FORMAT.format(a.getRegistryEntry().getValidUntil()));
         }
         if(a.getProduct()!=null){
            applData.setProductName(a.getProduct().getName());
            if(a.getProduct().getType()!=null)
               applData.setProductType(a.getProduct().getType().getName());
            if(a.getProduct().getPackingVolume()!=null)
               applData.setProductCap(a.getProduct().getPackingVolume().getName());
            if(a.getProduct().getEthanolRate()!=null)
               applData.setProductVol(ethanolRateFormat.format(a.getProduct().getEthanolRate().doubleValue()));
            if(a.getProduct().getProducer()!=null)
               applData.setProducerName(a.getProduct().getProducer().getName());
            if(a.getProduct().getProducer()!=null)
               applData.setProducerCountry(a.getProduct().getProducer().getAddress().getCountry().getName());
            if(a.getProduct().getOriginCountry()!=null)
               applData.setOrigCountry(a.getProduct().getOriginCountry().getName());
         }
         applData.setRemark(a.getNotes());
         applsData[i] = applData;
         i++;
      }
      return applsData;
   }

   /**
    * Registri kande pikendamise taotlus.
    * @param keha Strng - registrikande number.
    */
   public void prolongApplication(ApplicationQuery keha,
         ApplicationQueryHolder paring, ApplicationResponseHolder keha2)
               throws RemoteException {
	   LOGGER.debug(">>> >>> >>> prolongApplication");
      paring.value = keha;
      ApplicationResponse response = new ApplicationResponse();
      response.setMessage("OK");
      keha2.value = response;
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         RegistryEntry entry = registryService
               .findRegistryEntryByApplicationId(new Long(keha.getId()));
         RegistryApplication existingAppl = entry.getApplication();
         RegistryApplication appl = new RegistryApplication();
         appl.setApplicant(existingAppl.getApplicant());
         appl.setProduct(existingAppl.getProduct());
         appl.setRegistryEntry(entry);
         appl.setArrived(new Date());
         appl.setNr(existingAppl.getNr());
         appl.setType(new ApplicationType(
               IClassificatorService.APPL_TYPE_ARP));
         appl.setState(new ApplicationState(
               IClassificatorService.APPL_STATE_PRE));
         appl.setCreatedBy(IUserManagerService.EIT_USER);
         registryService.saveOrUpdate(appl);
      } catch (Exception e) {
         response.setMessage("Ei leitud vastavat taotlust!");
         LOGGER.error(e, e);
         throw new RemoteException("Ei leitud vastavat taotlust!");
      }

   }

   private String validateApplication(Application requestAppl) {
      StringBuffer messages = new StringBuffer();
      if((requestAppl.getMTRCode() == null) ||((requestAppl.getMTRCode() != null) && (requestAppl.getMTRCode().trim().length() == 0)))
         messages.append(Messages.getMessage("error.validation.Application.MTRCode")).append("\n");
      ee.riik.xtee.alkor2.producers.producer.alkor2.Product product= requestAppl.getProductInfo();
      if(requestAppl.getNotes()!=null&&requestAppl.getNotes().length()>4000)
         messages.append(Messages.getMessage("error.validation.Application.notes")).append("\n");
      if(product.getName() == null)
         messages.append(Messages.getMessage("error.validation.Product.name")).append("\n");
      if(product.getProductType() == null)
         messages.append(Messages.getMessage("error.validation.Product.type")).append("\n");
      if(product.getOriginCountry() == null)
         messages.append(Messages.getMessage("error.validation.Product.originCountry")).append("\n");
      if(product.getEthanolRate() == null)
         messages.append(Messages.getMessage("error.validation.Product.ethanolRate")).append("\n");
      else {
         try{
            if(product.getEthanolRate().contains(","))
               product.setEthanolRate(product.getEthanolRate().replaceAll(",", "."));
            BigDecimal rate = new BigDecimal(product.getEthanolRate());
            if(rate.compareTo(new BigDecimal(100))>0)
               messages.append(Messages.getMessage("error.validation.Product.ethanolRate.numeric")).append("\n");
         }catch  (NumberFormatException e){
            messages.append(Messages.getMessage("error.validation.Product.ethanolRate.numeric")).append("\n");
         }
      }
      if(product.getCapacity() == null)
         messages.append(Messages.getMessage("error.validation.Product.capacity")).append("\n");
      LOGGER.info("kodx:"+product.getKNCode());
      if(product.getKNCode() == null){
         messages.append(Messages.getMessage("error.validation.Product.KNCode")).append("\n");
      }
      else if(product.getKNCode().trim().length()<8||product.getKNCode().trim().length()>12){
         messages.append(Messages.getMessage("error.validation.Product.KNCode.length")).append("\n");
      }
      else if (product.getPackingMaterial() == null)
      {
         messages.append(Messages.getMessage("error.validation.Product.packingMaterial")).append("\n");
      }
      //		if(product.getProducerInfo() == null)
      //			messages.append(Messages.getMessage("error.validation.Product.producerInfo.name")).append("\n");
      return (messages.length() == 0) ? null : messages.toString();
   }

   private String saveOrUpdateApplication(RegistryApplication application,
         ee.agri.alkor.model.Product product, Application requestAppl,
         XteeHeaderMap header) throws Exception {
      String validationErrors = validateApplication(requestAppl);
      LOGGER.debug(validationErrors);
      if(validationErrors!=null&&validationErrors.length()!=0)
         return validationErrors;

      //ContactInfoType requestor = requestAppl.getContactInfo();
      String entName = null;
      Enterprise applEnterpise = registryService.findEnterpriseByRegNr(header.getRequestEnterprise());
      try {
         if (applEnterpise == null) {
            return Messages.getMessage("error.enterpriseIsNotRegistered", header.getRequestEnterprise());
         }
      } catch(Throwable t) {
         LOGGER.error(t,t);
      }
      if (requestAppl.getAcknowledgementNr() != null)
         applEnterpise.setAcknowledgementNr(requestAppl
               .getAcknowledgementNr());
      if (requestAppl.getAcknowledgementDate() != null)
         applEnterpise.setAcknowledgementDate(requestAppl
               .getAcknowledgementDate());
      if (requestAppl.getExciseStoreHouseNr() != null)
         applEnterpise.setExciseStoreHouseNr(requestAppl
               .getExciseStoreHouseNr());
      if (requestAppl.getMTRCode() != null)
         applEnterpise.setMTRCode(requestAppl.getMTRCode());

      setEnterpriseRepresentative(header, applEnterpise, application);
      registryService.saveOrUpdate(applEnterpise);

      ee.riik.xtee.alkor2.producers.producer.alkor2.Product applProduct = requestAppl
            .getProductInfo();

      product.setName(applProduct.getName());
      product.setCode(applProduct.getKNCode());
      if (applProduct.getHasFrontLabel() != null)
         product.setHasFrontLabel(applProduct.getHasFrontLabel()
               .booleanValue());
      else
         applProduct.setHasFrontLabel(new Boolean(false)); // For MISP we have to initialize

      if (applProduct.getHasNeckLabel() != null)
         product.setHasNeckLabel(applProduct.getHasNeckLabel()
               .booleanValue());
      else
         product.setHasNeckLabel(new Boolean(false));
      if (applProduct.getHasRearLabel() != null)
         product.setHasRearLabel(applProduct.getHasRearLabel());
      else
         product.setHasRearLabel(new Boolean(false));
      if (applProduct.getHasOtherLabel() != null)
         product.setHasOtherLabel(applProduct.getHasOtherLabel());
      else
         product.setHasOtherLabel(new Boolean(false));
      if (applProduct.getHasStocking() != null)
         product.setHasStocking(applProduct.getHasStocking());
      else
         product.setHasStocking(new Boolean(false));
      if (applProduct.getProductType() != null)
         product.setType(new ProductType(applProduct.getProductType()
               .getValue()));
      if (applProduct.getEthanolRate() != null)
         product.setEthanolRate(new BigDecimal(applProduct.getEthanolRate()));
      if (applProduct.getNumberOfLabels() != null)
         product.setNumberOfLabels((int) applProduct.getNumberOfLabels()
               .longValue());
      if (applProduct.getBottleColor() != null)
         product.setBottleColor(new BottleColor(applProduct.getBottleColor()
               .getValue()));
      if (applProduct.getBottleShape() != null)
         product.setBottleShape(new BottleShape(applProduct.getBottleShape()
               .getValue()));
      if (applProduct.getCorkColor() != null)
         product.setCorkColor(new CorkColor(applProduct.getCorkColor()
               .getValue()));
      if (applProduct.getCorkMaterial() != null)
         product.setCorkMaterial(new CorkMaterial(applProduct
               .getCorkMaterial().getValue()));
      if (applProduct.getCorkShape() != null)
         product.setCorkShape(new CorkShape(applProduct.getCorkShape()
               .getValue()));
      if (applProduct.getStockingColor() != null)
         product.setStockingColor(new StockingColor(applProduct.getStockingColor()
               .getValue()));

      if (applProduct.getPackingMaterial() != null)
         product.setPackingMaterial(new PackingMaterial(applProduct
               .getPackingMaterial().getValue()));
      if (applProduct.getCapacity() != null)
         product.setPackingVolume(new Capacity(applProduct.getCapacity()
               .getValue()));

      if (applProduct.getOriginCountry() != null)
      {
         product.setOriginCountry(new Country(applProduct.getOriginCountry()
               .getValue()));
      }

      if(applProduct.getProducerId() != null)
      {
         Enterprise producer;

         try {
            producer = registryService.getEnterprise(Long
                  .parseLong(applProduct.getProducerId()));
            if (producer == null) {
               LOGGER.info("Ei leidnud tootjat tootele: "
                     + product.getName() + " taolev ettevote: "
                     + entName + ", id'ga "
                     + applProduct.getProducerId());
               product.setProducer(producer);
            }
         } catch (NumberFormatException e) {
            LOGGER.error("Invalid producer id - " + applProduct.getProducerId());
         }
      }

      application.setProduct(product);
      application.setApplicant(applEnterpise);
      application.setNotes(requestAppl.getNotes());
      application = registryService.saveOrUpdate(application);

      byte[] file = registryService.createApplicationDocumentByIdAndRegCode("ARE", application.getId(),applEnterpise.getRegistrationId());
      Calendar cal = Calendar.getInstance();
      registryService.addDocument(file, null, null,null,application.getId(), "Taotlus"+cal.get(Calendar.DAY_OF_MONTH)+"."+(cal.get(Calendar.MONTH)+1)+"."+cal.get(Calendar.YEAR)+".pdf", "pdf", "application/pdf",true, "0");
      return  validationErrors;
   }

   private void setEnterpriseRepresentative( XteeHeaderMap header, Enterprise enterprise, RegistryApplication application)
   {

      Person representative  = null;
      representative = registryService.findPerson(header.getRepresentativeRegNr());
      if(representative == null)
      {
         representative = new Person();
      }
      representative.setRegistrationId(header.getRepresentativeRegNr());
      String headerName = header.getRepresenativeName();
      int index = headerName != null ? headerName.indexOf(' ') : -1;
      String firstName = index != -1 ? headerName.substring(0, index) :
         (headerName == null || headerName.length() < 1) ? null : headerName;
      String lastName = index != -1 ? headerName.substring(index+1,headerName.length()) : null;
      representative.setFirstName(firstName);
      representative.setLastName(lastName);
      representative.setOccupation(header.getRepresentativeProfession() == null ? "" : header.getRepresentativeProfession());
      enterprise.setEnterpriseRepresentative(representative);
      application.setEnterpriseRepresentative(representative);
   }

   private void saveApplicationDoc(Long applicationId,
         NewApplicationDocumentType newDoc, AttachmentPart part)
               throws Exception {

      if ((newDoc != null) && (newDoc.getName() != null) && (part != null)) {
         DataHandler handler = part.getDataHandler();
         LOGGER.debug("part.getDataHandler(): " + part.getDataHandler()
               + " newDoc.getName: " + newDoc.getName());
         int total = part.getSize();
         InputStream is = handler.getInputStream();
         ByteArrayOutputStream os = new ByteArrayOutputStream();

         MessageDigest sha = MessageDigest.getInstance("SHA-1");

         int b = 0;
         int count = 0;
         while (count < total) {
            while ((b = is.read()) >= 0) {
               os.write(b);
               sha.update((byte) b);
               count++;

            }
         }
         if (count < total)
            throw new SystemException("Attachment upload error");

         newDoc.setDocument(sha.digest());

         registryService.addDocument(os.toByteArray(), null, null,null,
               new Long(applicationId), newDoc.getName(), newDoc.getFileName(), part
               .getContentType(),false, "0");
      }
   }

   private byte[] processUploadedReport(XteeHeaderMap headerValue,
         Enterprise reportingEnterpriseRegNr, AruandeperioodReq period,
         Eitlaadib_vastusHolder resultHolder) {
      Aruandeperiood p = new Aruandeperiood();
      p.setRep_month(period.getRep_month());
      p.setRep_year(period.getRep_year());
      return processUploadedReport(headerValue, reportingEnterpriseRegNr, p, resultHolder);
   }

   private byte[] processUploadedReport(XteeHeaderMap headerValue,
         Enterprise reportingEnterpriseRegNr, Aruandeperiood period,
         Eitlaadib_vastusHolder resultHolder) {
      Eitlaadib_vastus results = new Eitlaadib_vastus();
      resultHolder.value = results;
      List rowErrors = new ArrayList();
      MessageDigest sha = null;
      File f = null;

      try {
         AttachmentPart[] attachments = getMessageAttachments();
         DataHandler attachment = attachments[0].getDataHandler();
         sha = MessageDigest.getInstance("SHA-1");
         String cType = attachment.getContentType();
         if(LOGGER.isDebugEnabled())
            LOGGER.debug("Arrived content type:" + cType);

         InputStream is = attachment.getInputStream();
         f = File.createTempFile("eit", ".csv",
               registryService.getDocRoot() == null ? null : new File(registryService.getDocRoot()));
         FileOutputStream os = new FileOutputStream(f);
         int c = 0;
         while ((c = is.read()) > 0) {
            os.write(c);
            sha.update((byte) c);
         }
         os.close();
      } catch (Exception e) {
         LOGGER.error(e, e);
         results.setTeade(Messages.getMessage("error.reporting.upload"));
         return null;
      }
      byte[] digest = sha.digest();

      ProductMovementReport report = new ProductMovementReport();
      report.setCreated(new Date());
      report.setLoadingEnterpriseRegNr(headerValue.getEnterpriseRegNr());
      report.setLoadingUserId(headerValue.getRepresentativeRegNr());
      report.setReportingEnterprise(reportingEnterpriseRegNr);

      if (period != null){
         Calendar cal = Calendar.getInstance();
         if (period.getRep_year() != null){
            Integer year = 0;
            try {
               year = new Integer(Integer.parseInt(period.getRep_year()));
            } catch (Exception e) {
               LOGGER.error(e, e);
               results.setTeade(Messages
                     .getMessage("error.upload.formatError"));
               return digest;
            }
            cal.set(Calendar.YEAR, year);
         }
         if (period.getRep_month() != null){
            String monthCode = period.getRep_month().getValue();
            cal.set(Calendar.MONTH, Integer.parseInt(monthCode)-1);
         }
         cal.set(Calendar.DAY_OF_MONTH, 1);
         report.setRepDate(cal.getTime());
      }

      try {
         BufferedReader fReader=new BufferedReader(new FileReader(f));
         String line = null;
         ///*
         StringBuffer b64 = new StringBuffer(); // TODO RK: uuema versiooni jaoks, kus peab attachmenti base64-st dekodeerima!
         while ((line=fReader.readLine())!=null) {    // seega TEST jaoks peab see olemas olema, LIVE jaoks seda ei ole kuni kasutatakse sinist keskkonda
            b64.append(line);  // loeme kogu hashi sisse
         }
         fReader=new BufferedReader(new StringReader(new String(Base64.decode(b64.toString()))));
         //*/
         int rowNr=0;
         HashMap<String, RegistryEntry> entrys=new HashMap<String, RegistryEntry>();
         while ((line=fReader.readLine())!=null) {
            rowNr++;
            if(rowNr%100==0)
               LOGGER.debug("processed rows:"+rowNr);

            
            String[] cols = line.split(";");
            if (cols.length!=8) {
               rowErrors.add(new Reaviga(String.valueOf(rowNr), Messages.getMessage("error.upload.wrongColNumber")));
               continue;
            }
            boolean colError=false;
            for (int i=0; i<8; i++) {
               if (cols[i].trim().length()==0) {
                  rowErrors.add(new Reaviga(String.valueOf(rowNr), Messages.getMessage("error.upload.emptyColumn",new Integer(i))));
                  colError=true;
               }
            }
            if (colError)
               continue;
            String registryEntryNr=cols[0].trim().toLowerCase();
            if (registryEntryNr.indexOf(' ')>0) {
               String[] regNrParts=registryEntryNr.split(" ");
               registryEntryNr=regNrParts[0];
            }
            RegistryEntry entry=null;
            if (entrys.containsKey(registryEntryNr)){
               entry=entrys.get(registryEntryNr);
            }else {
               try {
                  
                  entry=registryService.findRegistryEntry(registryEntryNr);
                  entrys.put(registryEntryNr, entry);
                  
               } catch (Exception e) {
                  LOGGER.error("Exception!", e);
                  rowErrors.add(new Reaviga(String.valueOf(rowNr), (Messages.getMessage("error.reporting.regentry.NotFound", cols[0]))));
                  continue;
               }
               //entrys.put(registryEntryNr, entry); // ee.. miks jälle?
            }
            /**
             * 16.05.2014 @author Martin
             * 
             * See on mingi vana viga, taotluse salvestamisel on vahepeal anomaalia.
             */
            
            if (entry==null) {
            	//Piksel
            	//@author MARTIN
            	//FIXME SEDA VIGA UURIDA!
            	
               LOGGER.warn("Bug#3216 <"+registryEntryNr+">");
               rowErrors.add(new Reaviga(String.valueOf(rowNr), (Messages.getMessage("error.reporting.regentry.NotFound", cols[0]))));
               continue;
            }
            
            //            LOGGER.debug("5");
            ProductMovementReportRecord record=new ProductMovementReportRecord();
            record.setCreated(new Date());
            record.setRegistryEntry(entry);
            record.setReceiverName(cols[1]);
            record.setMarketingPlaceName(cols[2]);
            record.setMarketingPlaceDistrict(cols[3]);
            record.setMarketingPlaceOrgUnit(cols[4]);
            record.setMarketingPlaceAddress(cols[5]);
            record.setPartyNr(cols[6]);
            Integer amount=null;
            try {
               amount=new Integer(cols[7]);
            } catch (Exception e) {
               LOGGER.error(e, e);
               rowErrors.add(new Reaviga(Integer.toString(rowNr), (Messages.getMessage("error.reporting.amountFormat"))));
            }
            record.setAmount(amount);
            report.addRecord(record);
         }
      } catch (IOException ioe) {
         LOGGER.error(ioe, ioe);
         LOGGER.debug("IO Exception occured");
         results.setTeade(Messages.getMessage("error.reporting.file"));
         return digest;
      }
      //LOGGER.debug(rowErrors.size()+" rowErrors for " + reportingEnterpriseRegNr.getName() + "," + reportingEnterpriseRegNr.getRegistrationId()	); // FIXME NPE

      if (rowErrors.size() > 0) {
         results.setTeade(Messages.getMessage("error.reporting.reportErrors"));
         Reaviga[] vead = new Reaviga[rowErrors.size()];
         int i = 0;
         for (Iterator it = rowErrors.iterator(); it.hasNext(); i++){
            vead[i] = (Reaviga) it.next();
            LOGGER.debug("row " + vead[i].getRida() + " error:" + vead[i].getMure());
         }
         results.setVead(vead);

      }else {
         try {
            registryService.saveOrUpdate(report);
         } catch (Exception e) {
            LOGGER.error(	e,e);
            results.setTeade(Messages.getMessage("error.reporting.save"));
            return digest;
         }
         results.setTeade(Messages.getMessage("info.reporting.savedRecords", new Integer(report.getProductMovementReportRecords().size())));
      }
      LOGGER.debug("processUploadedReport is  complete");
      return digest;
   }

   private XteeHeaderMap getXteeHeader() throws AxisFault {
      XteeHeaderMap xteeHeader = new XteeHeaderMap();
      MessageContext msgContext = MessageContext.getCurrentContext();
      Message reqMsg = msgContext.getRequestMessage();
      // Get SOAP envelope of request
      SOAPEnvelope env = reqMsg.getSOAPEnvelope();
      for (Iterator it = xteeHeader.keySet().iterator(); it.hasNext();) {
         String headerName = (String) it.next();
         SOAPHeaderElement soapHeaderElement = env.getHeaderByName(
               "http://x-tee.riik.ee/xsd/xtee.xsd", headerName);
         if (soapHeaderElement != null)
         {
            xteeHeader.put(headerName, soapHeaderElement.getValue());
         }
      }

      return xteeHeader;

   }

   private void putHeader(XteeHeaderMap header) throws AxisFault {
      MessageContext msgContext = MessageContext.getCurrentContext();
      Message repMsg = msgContext.getResponseMessage();
      // Get SOAP envelope of request
      SOAPEnvelope env = repMsg.getSOAPEnvelope();

      for (Iterator it = header.keySet().iterator(); it.hasNext();) {
         String headerName = (String) it.next();
         SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement(
               "http://x-tee.riik.ee/xsd/xtee.xsd", headerName,
               header.get(headerName));
         env.addHeader(soapHeaderElement);
      }

   }

   private AttachmentPart[] getMessageAttachments() throws AxisFault {
      MessageContext msgContext = MessageContext.getCurrentContext();
      Message reqMsg = msgContext.getRequestMessage();
      Attachments messageAttachments = reqMsg.getAttachmentsImpl();
      if (null == messageAttachments) {
         LOGGER.error("no attachment support");
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

   private void respondAttachment(String content) throws AxisFault {
      MessageContext msgContext = MessageContext.getCurrentContext();
      Message repMsg = msgContext.getResponseMessage();

      repMsg.getAttachmentsImpl().setSendType(Attachments.SEND_TYPE_MIME);

      DataHandler dh = new DataHandler(content, "text/plain");
      //DataHandler dh = new DataHandler(new FileDataSource(f));

      org.apache.axis.attachments.AttachmentPart attachment = new org.apache.axis.attachments.AttachmentPart(
            dh);
      attachment.setMimeHeader("Content-Transfer-Encoding", "8bit");
      repMsg.addAttachmentPart(attachment);

      //javax.xml.soap.AttachmentPart part = repMsg
      //		.createAttachmentPart(aruanne);
      //repMsg.addAttachmentPart(part);
   }

   private String formatAddress(Address addr) {
      if (addr == null)
         return null;
      StringBuffer sbuf = new StringBuffer();
      sbuf.append(addr.getAddress());
      if (addr.getPostalIndex() != null)
         sbuf.append(" ").append(addr.getPostalIndex());
      if (addr.getOrgUnit() != null)
         sbuf.append(" ").append(addr.getOrgUnit());
      if (addr.getTown() != null)
         sbuf.append(" ").append(addr.getTown());
      if (addr.getDistrict() != null)
         sbuf.append(" ").append(addr.getDistrict());
      if (addr.getCountry() != null)
         sbuf.append(" ").append(addr.getCountry().getName());
      return sbuf.toString();
   }

   private AddressType convertAddress(Address addr) {
      if (addr == null)
         return null;
      AddressType outAddr = new AddressType();
      if (addr.getCountry() != null) {
         outAddr.setCountry(CountryType.fromString(addr.getCountry()
               .getCode()));
      }
      if(addr.getDistrict() != null)
         outAddr.setDistrict(addr.getDistrict());
      if(addr.getOrgUnit() != null)
         outAddr.setOrgUnit(addr.getOrgUnit());
      if(addr.getPostalIndex() != null)
         outAddr.setPostalIndex(addr.getPostalIndex());
      if(addr.getStreet() != null)
         outAddr.setStreet(addr.getStreet());
      if(addr.getHouse() != null)
         outAddr.setHouse(addr.getHouse());
      if(addr.getAppartmentNr() != null)
         outAddr.setAppartment(addr.getAppartmentNr());
      if(addr.getTown() != null)
         outAddr.setTown(addr.getTown());
      return outAddr;
   }

   private Address convertAddress(AddressType address) {
      if (address == null)
         return null;
      Address outAddr = new Address();
      if (address.getCountry() != null) {
         Country country = new Country();
         country.setCode(address.getCountry().getValue());
         outAddr.setCountry(country);
      }
      if(address.getAppartment() != null)
         outAddr.setDistrict(address.getAppartment());
      if(address.getOrgUnit() != null)
         outAddr.setOrgUnit(address.getOrgUnit());
      if(address.getTown() != null)
         outAddr.setTown(address.getTown());
      if(address.getDistrict() != null)
         outAddr.setDistrict(address.getDistrict());
      if(address.getStreet() != null)
         outAddr.setStreet(address.getStreet());
      if(address.getPostalIndex() != null)
         outAddr.setPostalIndex(address.getPostalIndex());
      if(address.getHouse() != null)
         outAddr.setHouse(address.getHouse());
      if(address.getAppartment() != null)
         outAddr.setAppartmentNr(address.getAppartment());
      return outAddr;
   }

   public void checkApplication(UpdateApplicationQuery keha, UpdateApplicationQueryHolder paring,
         UpdateApplicationResponseHolder keha2) throws RemoteException {
	   LOGGER.debug(">>> >>> >>> checkApplication");
      paring.value = keha;
      UpdateApplicationResponse response = new UpdateApplicationResponse();
      keha2.value = response;
      response.setMessage("OK");
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
         putHeader(header);
      } catch (Exception e) {
         response.setMessage(e.getMessage());
         LOGGER.error(e, e);
      }
      EnteredApplication requestAppl = keha.getAppl().getApplication();
      response.setId(requestAppl.getId());

      try {
         RegistryApplication application = registryService
               .findRegistryApplicationById(new Long(requestAppl.getId()));
         if((application != null)
               && (application.getState().getCode().indexOf("NMO") < 0)) {
            response.setMessage(Messages.getMessage("error.applicationNotInNMO"));
            return;
         }
         Product product = application.getProduct();
         application.setState(new ApplicationState(IClassificatorService.APPL_STATE_CTL));
         String validationMessages = saveOrUpdateApplication(application, product, requestAppl, header);
         if(validationMessages != null)
            response.setMessage(validationMessages);
      } catch (Exception e) {
         LOGGER.error(e, e);
         response.setMessage(e.getMessage());
         throw new RemoteException(e.getMessage());
      }
   }

   private class ApplicationHold{
      RegistryApplication appl;
      Long date;
      public ApplicationHold(RegistryApplication appl, Long date) {
         this.appl=appl;
         this.date=date;
      }
   }

   //   public void tootjaotsing(Totsing_paring keha, Totsing_paringHolder paring, Totsing_vastusHolder keha2)
   //         throws RemoteException {
   //      paring.value = keha;
   //      XteeHeaderMap header = null;
   //      try {
   //         header = getXteeHeader();
   //      } catch (Exception e) {
   //         keha2.value.setMessage(e.getMessage());
   //         return;
   //      }
   //
   //      SearchFilter filter = new SearchFilter();
   //      filter.setObjectClass("Enterprise");
   //      Map searchParams = new HashMap();
   //      if (keha.getEnt_reg_nr() != null)
   //         searchParams.put("registrationId", keha
   //               .getEnt_reg_nr());
   //      if (keha.getName() != null)
   //         searchParams.put("name", keha.getName());
   //      Map sort = new HashMap<String, String>();
   //      sort.put("created","desc");
   //      filter.setSortMap(sort);
   //      filter.setQueryParams(searchParams);
   //
   //      List resultList = new ArrayList();
   //      String message = null;
   //      try {
   //         while (true) {
   //            registryService.search(filter);
   //            if (filter.getResultsList().size() == 0)
   //               break;
   //            for (Iterator it = filter.getResultsList().iterator(); it.hasNext();) {
   //               ProductMovementReport report = (ProductMovementReport) it.next();
   //               Tots row = new Aruandeparing_vastuserida();
   //               row.setLoad_date(report.getCreated());
   //               row.setLoad_user(report.getLoadingUserId());
   //               if (report.getReportingEnterprise()!=null) {
   //                  row.setEnt_reg_nr(report.getReportingEnterprise().getRegistrationId());
   //                  row.setEnt_name(report.getReportingEnterprise().getName());
   //                  ContactInfo contact=report.getReportingEnterprise().getContactInfo();
   //                  Address address=report.getReportingEnterprise().getAddress();
   //                  StringBuilder sb=new StringBuilder();
   //                  if (contact!=null) {
   //                     if (contact.getPhone()!=null)
   //                        sb.append(contact.getPhone()).append(" ");
   //                     if (contact.getEmail()!=null)
   //                        sb.append(contact.getEmail()).append(" ");
   //                  }
   //                  if (address!=null) {
   //                     sb.append(formatAddress(address));
   //                  }
   //                  row.setEnt_contact(sb.toString());
   //               }
   //               Aruandeperiood period = new Aruandeperiood();
   //               if (report.getReportPeriodYear() != null)
   //                  period.setRep_year(report.getReportPeriodYear().toString());
   //               if (report.getReportPeriodMonth() != null)
   //                  period.setRep_month(new Kalendrikuu(report.getReportPeriodMonth().getCode()));
   //               row.setPeriod(period);
   //               row.setReport_id(report.getId().intValue());
   //               row.setRcd_count(Integer.toString(report.getProductMovementReportRecords().size()));
   //               resultList.add(row);
   //            }
   //            filter.setStartIndex(filter.getStartIndex()+filter.getResultsList().size());
   //         }
   //         message = Messages.getMessage("info.searchResults", new Integer(
   //               resultList.size()));
   //      } catch (Exception e) {
   //         LOGGER.error(e, e);
   //         message = e.toString();
   //      }
   //   }

   private class CacheItem{
      private final Application app;
      private final Date p;
      private final String validationMessages;
      public CacheItem(Application app, Date p, String validationMessages){
         this.app=app;
         this.p=p;
         this.validationMessages=validationMessages;
      }
      public Application getApp() {
         return app;
      }
      public Date getP() {
         return p;
      }
      public String getValidationMessages() {
         return validationMessages;
      }

   }

   public void getEnterprise(EnterpriseQuery keha, EnterpriseQueryHolder paring, EnterpriseResponseHolder keha2)
         throws RemoteException {
	   LOGGER.debug(">>> >>> >>> getEnterprise");
      paring.value = keha;
      EnterpriseResponse result = new EnterpriseResponse();
      keha2.value = result;
      result.setTeade("OK");
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         List<Enterprise> enterprises =registryService.findEnterpriseByNameorRegNr(keha.getName(),keha.getRegNr());
         LOGGER.debug(enterprises.size());
         Aruandjakoodiga[] ettevoted = new Aruandjakoodiga[enterprises.size()];
         int i=0;
         for(Enterprise enterprise:enterprises){
            Aruandjakoodiga ettevote = new Aruandjakoodiga();
            ettevote.setReg_nr(enterprise.getRegistrationId());
            ettevote.setName(enterprise.getName());
            ettevote.setId(enterprise.getId()+"");
            ettevote.setAddress(formatAddress(enterprise.getAddress()));
            ettevoted[i]=ettevote;
            i++;
         }
         result.setEttevotted(ettevoted);
      } catch (Exception e) {
         LOGGER.error(e, e);
         result.setTeade(e.getMessage());
         throw new RemoteException(e.getMessage());
      }
   }

   public void addEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise keha, EnterpriseHolder paring, AddEnterpriseResponseHolder keha2)
         throws RemoteException {
	   LOGGER.debug(">>> >>> >>> addEnterprise");
      paring.value = keha;
      AddEnterpriseResponse result = new AddEnterpriseResponse();
      keha2.value = result;
      result.setMessage("OK");
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
         putHeader(header);
         Enterprise applEnterpise = new Enterprise();
         //return Messages.getMessage("error.enterpriseIsNotRegistered", header.getRequestEnterprise());
         applEnterpise = new Enterprise();
         applEnterpise.setName(keha.getContactInfo().getName());
         applEnterpise.setRegistrationId(header.getRequestEnterprise());
         //applEnterpise.setNotes(keha.getNotes()==null?"":requestAppl.getNotes().toString());

         if (keha.getAcknowledgementNr() != null)
            applEnterpise.setAcknowledgementNr(keha.getAcknowledgementNr());
         if (keha.getAcknowledgementDate() != null)
            applEnterpise.setAcknowledgementDate(keha.getAcknowledgementDate());
         if (keha.getExciseStoreHouseNr() != null)
            applEnterpise.setExciseStoreHouseNr(keha.getExciseStoreHouseNr());
         if (keha.getMTRCode() != null)
            applEnterpise.setMTRCode(keha.getMTRCode());
         if (keha.getRegNr() != null)
            applEnterpise.setRegistrationId(keha.getRegNr());
         if(keha.getContactInfo()!=null){
            ContactInfoType ct = keha.getContactInfo();
            applEnterpise.setAddress(convertAddress(ct.getAddress()));
            ContactInfo contactInfo = applEnterpise.getContactInfo();
            if (contactInfo == null)
               contactInfo = new ContactInfo();
            if (ct.getEmail() != null)
               contactInfo.setEmail(ct.getEmail());
            if (ct.getFax() != null)
               contactInfo.setFax(ct.getFax());
            if (ct.getTel() != null)
               contactInfo.setPhone(ct.getTel());
            applEnterpise.setContactInfo(contactInfo);
         }
         Person representative = new Person();
         representative.setRegistrationId(header.getRepresentativeRegNr());
         //      representative.setOccupation(requestAppl.getApplicantPosition());
         applEnterpise.setEnterpriseRepresentative(representative);
         registryService.saveOrUpdate(applEnterpise);
      } catch (Exception e) {
         result.setMessage(e.getMessage());
         LOGGER.error(e, e);
      }
   }

   /**
    * L2bi xtee/eesti.ee alkoregistrisse sisenemiseks (XTeeForm.java avatakse)
    */
   public void legacy1(String[] keha, ArrayOfStringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Legacy_responseHolder keha2) throws RemoteException {
	   LOGGER.debug(">>> >>> >>> legacy1 (endine legacyQuery start)");
      paring.value = keha;
      ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response result = new ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response();
      keha2.value = result;
      String reportingEnterriseRegNr = null;
      XteeHeaderMap header = null;
      try
      {
         header = getXteeHeader();
         if ((header.getSubEnterpriseRegNr() != null)
               && (header.getSubEnterpriseRegNr().trim().length() > 0))
            reportingEnterriseRegNr = header.getSubEnterpriseRegNr().trim();
         else
            reportingEnterriseRegNr = header.getEnterpriseRegNr().trim();

         String baseURI = registryService.getBaseURI();
         if ((registryService.getEnterpriseByActivity(reportingEnterriseRegNr)) == null)
         {
            LOGGER.info("legacy1(), enterprise not registered, code :" + reportingEnterriseRegNr);
            result.setUrl(new URI(baseURI + "/index.html#LoginErrorPage6"));
         }
         else
         {
            LOGGER.debug(header);
            XTeeId xId = new XTeeId();
            xId.setId(header.getId());
            xId.setRegistryCode(header.getRequestEnterprise());
            xId.setRepresentativeName(header.getRepresenativeName());
            xId.setRepresentativePersonalCode(header.getRepresentativeRegNr());
            xId.setrepresentativeOccupation(header.getRepresentativeProfession() == null ? "" : header.getRepresentativeProfession());
            xId.setCreated(new Date());
            registryService.saveXid(xId);
            LOGGER.debug(xId);
            result.setUrl(new URI(baseURI + "/j_acegi_security_check?nonce="+header.getId()));
            LOGGER.debug("URI XTEELE:" + baseURI + "/j_acegi_security_check?nonce="+header.getId());
         }
         putHeader(header);
      } catch (Exception e) {
         LOGGER.error(e, e);
      }
      if (LOGGER.isDebugEnabled())
         LOGGER.debug("legacyQuery done");
   }

   public void extendApps(String keha, StringHolder paring, ExtendResponseHolder keha2) throws RemoteException {
	   LOGGER.debug(">>> >>> >>> extendApps");
      paring.value = keha;
      ExtendResponse result = new ExtendResponse();
      keha2.value = result;
      result.setMessage("OK");
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         List<RegistryApplication> appls = registryService.findEnterpriseExpiringIn60(header.getRequestEnterprise());
         LOGGER.debug(appls.size());
         result.setApps(convertE(appls));
      } catch (Exception e) {
         LOGGER.error(e, e);
         result.setMessage(e.getMessage());
         throw new RemoteException(e.getMessage());
      }
   }

   public void prolongApp60(ApplicationQuery keha,
         ApplicationQueryHolder paring, ApplicationResponseHolder keha2)
               throws RemoteException {
	   LOGGER.debug(">>> >>> >>> prolongApp60");
      paring.value = keha;
      ApplicationResponse response = new ApplicationResponse();
      response.setMessage("OK");
      keha2.value = response;
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         RegistryEntry entry = registryService
               .findRegistryEntryByApplicationId(new Long(keha.getId()));
         RegistryApplication existingAppl = entry.getApplication();
         RegistryApplication appl = new RegistryApplication();

         appl.setProduct(existingAppl.getProduct());
         appl.setRegistryEntry(entry);
         appl.setType(new ApplicationType(IClassificatorService.APPL_TYPE_ARP));
         appl.setState(new ApplicationState(IClassificatorService.APPL_STATE_PRE));
         appl.setArrived(new Date());
         appl.setApplicant(existingAppl.getApplicant());
         setEnterpriseRepresentative(header, appl.getApplicant(), appl);
         appl = registryService.saveNewExtendApplication(appl);
      } catch (Exception e) {
         response.setMessage("Ei leitud vastavat taotlust!");
         LOGGER.error(e, e);
         throw new RemoteException("Ei leitud vastavat taotlust!");
      }
   }

   public void addApplication(
         ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery keha,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationQueryHolder paring,
         ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationResponseHolder keha2)
               throws java.rmi.RemoteException {
	   LOGGER.debug(">>> >>> >>> addApplication");
      paring.value = keha;
      AddApplicationResponse response = new AddApplicationResponse();
      response.setMessage("OK");
      response.setApplication(keha.getApplication());
      keha2.value = response;
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
         putHeader(header);
      } catch (Exception e) {
         LOGGER.error(e, e);
         keha2.value.setMessage(e.toString());
      }
      Application requestAppl = keha.getApplication();
      RegistryApplication application = new RegistryApplication();
      application.setArrived(new Date());
      application.setCreatedBy(IUserManagerService.EIT_USER);
      application.setState(new ApplicationState(IClassificatorService.APPL_STATE_PRE));
      application.setType(new ApplicationType(IClassificatorService.APPL_TYPE_ARE));
      Product product = new Product();
      try {
         String validationMessages = saveOrUpdateApplication(application, product, requestAppl, header);
         if(validationMessages != null){
            validationMessages=validationMessages+(Messages.getMessage("error.message.not.saved"))+("\n");
            response.setMessage(validationMessages);
         }
         if(application.getId() != null)
            response.setId(application.getId().toString());
      } catch (Exception e) {
         LOGGER.error(e, e);
         response.setMessage(e.getMessage());
         throw new RemoteException(e.getMessage());
      }

   }

   public void updateApplication(UpdateApplicationQuery keha,
         UpdateApplicationQueryHolder paring,
         UpdateApplicationResponseHolder keha2) throws RemoteException {
	   LOGGER.debug(">>> >>> >>> updateApplication");
      paring.value = keha;
      UpdateApplicationResponse response = new UpdateApplicationResponse();
      keha2.value = response;
      response.setMessage("OK");
      XteeHeaderMap header = null;
      try {
         header = getXteeHeader();
         putHeader(header);
      } catch (Exception e) {
         response.setMessage(e.getMessage());
         LOGGER.error(e, e);
      }
      EnteredApplication requestAppl = keha.getAppl().getApplication();
      response.setId(requestAppl.getId());

      try {
         Long id =null;
         RegistryApplication application=null;
         Product product=null;
         try{
            id = new Long(requestAppl.getId());
         }catch (NumberFormatException e){
            LOGGER.error(e,e);
         }
         if(LOGGER.isDebugEnabled())
            LOGGER.debug("id:"+id);
         if(id!=null){
            application = registryService.findRegistryApplicationById(id);
            if((application != null)&& (application.getState().getCode().indexOf("ADD") < 0)) {
               response.setMessage(Messages.getMessage("error.applicationNotInPRE"));
               return;
            }
            product = application.getProduct();
         }else{
            application=new RegistryApplication();
            application.setArrived(new Date());
            application.setCreatedBy(IUserManagerService.EIT_USER);
            application.setState(new ApplicationState(
                  IClassificatorService.APPL_STATE_PRE));
            application.setType(new ApplicationType(
                  IClassificatorService.APPL_TYPE_ARE));
            product = new Product();
         }
         String validationMessages = saveOrUpdateApplication(application, product, requestAppl, header);
         if(validationMessages != null){
            validationMessages=validationMessages+(Messages.getMessage("error.message.not.saved"))+("\n");
         }else{
            response.setId(application.getId()+"");
         }
      } catch (Exception e) {
         LOGGER.error(e, e);
         response.setMessage(e.getMessage());
         throw new RemoteException(e.getMessage());
      }
   }

   public void getApplication(ApplicationQuery keha,
         ApplicationQueryHolder paring, UpdateApplicationQueryHolder keha2)
               throws RemoteException {
      if(LOGGER.isDebugEnabled())
         LOGGER.debug(">>> >>> >>> getApplication:'" + keha.getId() + "'");
      paring.value = keha;
      if((keha.getId() == null) ||
            ((keha.getId() != null) && (keha.getId().length() == 0))){
         if((keha.getMessage() != null) &&
               (keha.getMessage().length() != 0))
            throw new RemoteException(keha.getMessage());
         else throw new RemoteException("Invalid input");
      }
      EnteredApplication responseAppl = new EnteredApplication();
      try {
         XteeHeaderMap header = getXteeHeader();
         putHeader(header);
         ee.riik.xtee.alkor2.producers.producer.alkor2.Product productInfo = new ee.riik.xtee.alkor2.producers.producer.alkor2.Product();
         RegistryApplication appl = registryService.findRegistryApplicationById(new Long(keha.getId()));
         Enterprise applicant = appl.getApplicant();
         responseAppl.setId(appl.getId().toString());
         responseAppl.setMTRCode(applicant.getMTRCode()==null?"":applicant.getMTRCode());
         responseAppl.setAcknowledgementDate(applicant.getAcknowledgementDate());
         responseAppl.setAcknowledgementNr(applicant.getAcknowledgementNr());
         responseAppl.setExciseStoreHouseNr(applicant.getExciseStoreHouseNr());
         if (applicant.getEnterpriseRepresentative() != null)
            responseAppl.setApplicantPosition(applicant.getEnterpriseRepresentative().getOccupation());
         productInfo.setName(appl.getProduct().getName());
         productInfo.setKNCode(appl.getProduct().getCode());
         if (appl.getProduct().getOriginCountry() != null)
            productInfo.setOriginCountry(CountryType.fromString(appl.getProduct().getOriginCountry().getCode()));
         productInfo.setProductType(Tooteliik.fromString(appl.getProduct().getType().getCode()));
         if (appl.getProduct().getBottleColor() != null)
            productInfo.setBottleColor(BottleColorType.fromString(appl.getProduct().getBottleColor().getCode()));
         if (appl.getProduct().getBottleShape() != null)
            productInfo.setBottleShape(BottleShapeType.fromString(appl.getProduct().getBottleShape().getCode()));
         if (appl.getProduct().getPackingVolume() != null)
            productInfo.setCapacity(CapacityType.fromString(appl.getProduct().getPackingVolume().getCode()));
         if (appl.getProduct().getCorkColor() != null)
            productInfo.setCorkColor(CorkColorType.fromString(appl.getProduct().getCorkColor().getCode()));
         if (appl.getProduct().getCorkMaterial() != null)
            productInfo.setCorkMaterial(CorkMaterialType.fromString(appl.getProduct().getCorkMaterial().getCode()));
         if (appl.getProduct().getCorkShape() != null)
            productInfo.setCorkShape(CorkShapeType.fromString(appl.getProduct().getCorkShape().getCode()));
         if (appl.getProduct().getPackingMaterial() != null)
            productInfo.setPackingMaterial(PackingMaterialType.fromString(appl.getProduct().getPackingMaterial().getCode()));
         if (appl.getProduct().getStockingColor() != null)
            productInfo.setStockingColor(StockingColorType.fromString(appl.getProduct().getStockingColor().getCode()));
         LOGGER.debug(appl.getProduct().getProducer());
         if(appl.getProduct().getProducer()!=null){
            productInfo.setProducerInfo(appl.getProduct().getProducer().getName());
            productInfo.setProducerInfoId(appl.getProduct().getProducer().getRegistrationId());
            productInfo.setProducerId(appl.getProduct().getProducer().getId()+"");
         }
         productInfo.setEthanolRate(ethanolRateFormat.format(appl.getProduct().getEthanolRate().doubleValue()));
         if(appl.getProduct().getHasFrontLabel() == null)
            productInfo.setHasFrontLabel(new Boolean(false));
         else
            productInfo.setHasFrontLabel(appl.getProduct().getHasFrontLabel());
         productInfo.setHasNeckLabel(appl.getProduct().getHasNeckLabel());
         productInfo.setHasOtherLabel(appl.getProduct().getHasOtherLabel());
         productInfo.setHasRearLabel(appl.getProduct().getHasRearLabel());
         productInfo.setHasStocking(appl.getProduct().getHasStocking());
         if (appl.getProduct().getNumberOfLabels() != null)
            productInfo.setNumberOfLabels(new BigInteger(appl.getProduct().getNumberOfLabels().toString()));
         responseAppl.setNotes(appl.getNotes());

         responseAppl.setProductInfo(productInfo);
         ExistingApplication existingAppl = new ExistingApplication();
         existingAppl.setApplication(responseAppl);
         UpdateApplicationQuery query = new UpdateApplicationQuery();
         query.setAppl(existingAppl);
         keha2.value = query;
         LOGGER.debug("done");
      } catch (Exception e) {
         LOGGER.error(e, e);
         throw new RemoteException(e.getMessage());
      }
   }
}
