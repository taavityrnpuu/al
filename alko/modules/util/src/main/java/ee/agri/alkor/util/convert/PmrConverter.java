package ee.agri.alkor.util.convert;

import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate5.HibernateCallback;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.ProductMovementReport;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.classes.Month;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.util.convert.model.pmr.AtReport;
import ee.agri.alkor.util.convert.model.pmr.AtReportRcd;

public class PmrConverter {

	// Logger
	private static Logger LOGGER = Logger.getLogger(PmrConverter.class);

	// Used interfaces configured by spring
	private Alkor1Export alkor1Export;
	private IClassificatorService classService;
	private IAlkor2Service registryService;
	private Hashtable<String, RegistryEntry> regEntrys;

	private static int convertCount = 0;

	/**
	 * Conversion entry point
	 * @throws Exception
	 */
	public void convert() throws Exception {
		Date start = new Date();
		regEntrys = getRegistryService().findAllRegEntry();
		Date end = new Date();
		LOGGER.debug("Time taken for fetching registryEntrys: " + (end.getTime() - start.getTime()));
		convertReports();
	}

	/**
	 * Method for converting all reports
	 *
	 */
	private void convertReports() {
		Date start = new Date();
		LOGGER.info("Starting with atReports");

		//count for statistics
		int count = 0;
		List<IEntity> entrys = new LinkedList<IEntity>();
		try {

			getAlkor1Export().getHibernateTemplate().execute(new HibernateCallback<Void>() {
				/* (non-Javadoc)
				 * @see org.springframework.orm.hibernate5.HibernateCallback#doInHibernate(org.hibernate.Session)
				 */
				public Void doInHibernate(Session arg0) throws HibernateException {
					Object count = arg0.createQuery("select count(*) from AtReport").uniqueResult();
					LOGGER.debug("Total of " + count + " AtReports");
					Object count_r = arg0.createQuery("select count(*) from AtReportRcd").uniqueResult();
					LOGGER.debug("Total of " + count_r + " ArReportRcds");
					return null;
				}
			});

			// Converts in batches - reads and inserts 50 entries at a time
			int batchSize = 5;
			for (int c = 0; ; c += batchSize ) {

				// Get the next batch of entries starting from index c
				Iterator alkor1Iterator = getAlkor1Export().fetchEntities("AtReport", c, batchSize).iterator();

				if (!alkor1Iterator.hasNext()) break;

				while (alkor1Iterator.hasNext()) {
					ProductMovementReport report = convertProductMovementReport((AtReport) alkor1Iterator.next());
					//saveReport(report);
					entrys.add(report);
					count++;
				}
				getRegistryService().saveList(entrys);
				entrys.clear();
			}
		} catch (Throwable t) {
			t.printStackTrace();
			LOGGER.error(t, t);
		}
		Date end = new Date();
		LOGGER.debug("Time taken for the conversion of " + count + " reports: " + (end.getTime() - start.getTime()));
		//Logging.
		LOGGER.info("Processed " + count + " rows and converted "
				+ convertCount + " atReports");

	}

	/**
	 * Saves the converted ProductMovementReport object
	 * @param report
	 */
	private void saveReport(ProductMovementReport report) {

		if (report == null) return;

		convertCount++;

		try {
			getRegistryService().save(report);
		} catch (ConstraintViolationException cve) {
			LOGGER.error("Duplicate atReport: " + cve);
		} catch (DataIntegrityViolationException cve) {
			LOGGER.error("Duplicate atReport: "+ cve);
		}
	}

	/**
	 * Converts an AtReport type object to a ProductMovementReport type object
	 * @param atReport
	 * @return
	 */
	private ProductMovementReport convertProductMovementReport(AtReport atReport) {

		ProductMovementReport result = new ProductMovementReport();

		try {
			result.setCreated(atReport.getLoadDate());
			result.setLoadingEnterpriseRegNr(atReport.getLoadRegNr());
			result.setLoadingUserId(atReport.getLoadUser());

			//Convert enterprise
			result.setReportingEnterprise(getEnterpriseByRegNr(atReport.getEntRegNr()));

			//Convert period month
//			result.setReportPeriodMonth(convertIntegerToMonth(atReport.getRepMonth())); // RK: selles versioonis pole ProductMovementReport-is

//			result.setReportPeriodYear(atReport.getRepYear()); // RK: selles versioonis pole ProductMovementReport-is

			//Convert product movement report records
			result.setProductMovementReportRecords(convertProductMovementReportRecords(result,
					atReport.getRecords(), atReport.getLoadDate()));
		} catch (Exception e) {
			LOGGER.error("Error while converting: " + e);
		}

		return result;

	}

	/**
	 * Takes an integer and converts it to a month represented by the integer
	 * @param monthNr The month number
	 * @return converted Month object or null if not found;
	 */
	private Month convertIntegerToMonth(Integer monthNr) {

		if (monthNr == null) {
			return null;
		}
		return new Month(monthNr.toString());

	}

	/**
	 * Converts a set of AtReportRcd items to corresponding set of ProductMovementReportRecord items
	 * @param atRecords
	 * @param created
	 * @return
	 */
	private Set<ProductMovementReportRecord> convertProductMovementReportRecords(
			ProductMovementReport report, Set<AtReportRcd> atRecords, Date created) {

		Set<ProductMovementReportRecord> records = new HashSet<ProductMovementReportRecord>();

		//Convert each record from the set
		for (AtReportRcd atRecord : atRecords) {
			records.add(convertProductMovementReportRecord(report, atRecord, created));
		}

		return records;
	}

	/**
	 * Converts an AtReportRcd record object to a corresponding ProductMovementReportRecord object
	 * @param atRecord
	 * @param created
	 * @return
	 */
	private ProductMovementReportRecord convertProductMovementReportRecord(ProductMovementReport report,
			AtReportRcd atRecord, Date created) {

		ProductMovementReportRecord record = new ProductMovementReportRecord();

		record.setReport(report);
		record.setCreated(created);
		record.setAmount(atRecord.getPCnt());
		record.setMarketingPlaceAddress(atRecord.getAddrStr());
		record.setMarketingPlaceDistrict(atRecord.getAddrCounty());
		record.setMarketingPlaceOrgUnit(atRecord.getAddrTown());
		record.setMarketingPlaceName(atRecord.getMarket());
		record.setPartyNr(atRecord.getPNr());
		record.setReceiverName(atRecord.getReceiver());
		record.setRegistryEntry(getRegistryEntryByRegBookNr(atRecord.getRegBookNr()));

		return record;

	}

	/**
	 * Finds an enterprise with the specified registrationNr
	 * @param regNr Registration number to filter with
	 * @return found Enterprise or null, if none are found with the registrationNr
	 */
	private Enterprise getEnterpriseByRegNr(String regNr) {
		return (Enterprise) getRegistryService().find(Enterprise.class, "registrationId", regNr);
	}

	/**
	 * Finds a registry entry with the specified registration book number
	 * @param regBookNr Registration book number to filter with
	 * @return found RegistryEntry or null, if none are found with the regBookNr
	 */
	private RegistryEntry getRegistryEntryByRegBookNr(String regBookNr) {
		return regEntrys.get(regBookNr);
		//return (RegistryEntry) getRegistryService().find(RegistryEntry.class, "nr", regBookNr);
	}

	public Alkor1Export getAlkor1Export() {
		return alkor1Export;
	}

	public void setAlkor1Export(Alkor1Export alkor1Export) {
		this.alkor1Export = alkor1Export;
	}

	public IClassificatorService getClassService() {
		return classService;
	}

	public void setClassService(IClassificatorService classService) {
		this.classService = classService;
	}

	public IAlkor2Service getRegistryService() {
		return registryService;
	}

	public void setRegistryService(IAlkor2Service registryService) {
		this.registryService = registryService;
	}

}
