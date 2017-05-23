package test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductEnterpriseRole;
import ee.agri.alkor.model.ProductMovementReport;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.EnterpriseRole;
import ee.agri.alkor.model.classes.Month;
import ee.agri.alkor.model.classes.ProductType;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.RegistryServiceDelegate;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.util.AppContextHelper;

/**
 * @author ivar
 * @version 1.0
 */
public class RegistryServiceTest  extends TestCase {

	private IRegistryService service;

	public RegistryServiceTest() {
		super("");
	}

	public RegistryServiceTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		service = ((RegistryServiceDelegate)AppContextHelper.getInstance().
				getBean("registryServiceDelegate")).getService();
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		System.out.println("hello");
		//suite.addTest(new RegistryServiceTest("testPDFCreator"));
		//suite.addTest(new RegistryServiceTest("testAddProduct"));
		//suite.addTest(new RegistryServiceTest("testAddEnterprise"));
		//suite.addTest(new RegistryServiceTest("testAddPayment"));
		//suite.addTest(new RegistryServiceTest("testFindPayments"));
		//suite.addTest(new RegistryServiceTest("testSearchSubject"));
		//suite.addTest(new RegistryServiceTest("testDeleteSubject"));
		//suite.addTest(new RegistryServiceTest("testFindPublicDocs"));
		suite.addTest(new RegistryServiceTest("testAddApplication"));
		//suite.addTest(new RegistryServiceTest("testFindApplication"));
		//suite.addTest(new RegistryServiceTest("testAddProductMovement"));
		//suite.addTest(new RegistryServiceTest("testFindEnterpriseApplicationsInState"));
		//suite.addTest(new RegistryServiceTest("testSuperSearch"));
		//suite.addTest(new RegistryServiceTest("testBindPaymentToEnterprise"));
		//suite.addTest(new RegistryServiceTest("testGetEnterpriseByActivity"));
		return suite;
	}

	public void testFindPublicDocs() throws Exception {
		List<RegistryDocument> docs = service.findPublicDocuments();
		assertTrue(docs != null);
		System.out.println(docs.size());
	}

	public void testBindPaymentToEnterprise() throws Exception{

		Boolean result = service.bindPaymentToEnterprise("10047712",new Long(2));
		assertTrue(result);
	}

	public void testGetEnterpriseByActivity() throws Exception {

		Enterprise ent = service.getEnterpriseByActivity("10047712");
		assertTrue(ent != null);

	}

	public void testAddEnterprise() throws Exception {
		Enterprise enterprise = new Enterprise();
		enterprise.setName("Liviko");
		enterprise.setRegistrationId("110110110");
		Address address = new Address();
		Country country = new Country();
		country.setCode("est");
		address.setCountry(country);
		address.setDistrict("Harjumaa");
		address.setOrgUnit("Tallinn");
		address.setStreet("Hämariku");
		address.setPostalIndex("11211");
		enterprise.setAddress(address);
		enterprise.setExciseStoreHouseNr("15");
		enterprise.setAcknowledgementDate(new Date());
		enterprise.setMTRCode("12345");

		ProductEnterpriseRole productEnterpriseRole = new ProductEnterpriseRole();
		EnterpriseRole role = new EnterpriseRole();
		role.setCode("PRO");
		productEnterpriseRole.setEnterpriseRoleClass(role);
		enterprise.addEnterpriseRole(productEnterpriseRole);

		Enterprise ent = service.saveOrUpdate(enterprise);
		assertTrue(ent != null);
	}

	public void testSearchSubject() throws Exception {
		SearchFilter sf = new SearchFilter();
		sf.setObjectClass("Enterprise");
		sf.setPageSize(10);
		sf.setStartIndex(0);
		Map<String, Object> qp = new HashMap<String, Object>();
		qp.put("name", "Saku%");
		sf.setQueryParams(qp);
		sf = service.search(sf);
		assertTrue(sf.getResultsList().size() == 1);
		for(Enterprise enterprise: (List<Enterprise>)sf.getResultsList()) {
			assertTrue(enterprise.getAddress().getStreet()
					.equals("Hämariku"));

		}
	}
	public void testAddProduct() throws Exception {
		Product product = new Product();
		product.setCode("ALC");
		product.setName("Viin");
		IEntity prod = service.saveOrUpdate(product);
		assertTrue(prod != null);
	}

	public void testAddApplication() throws Exception {
		RegistryApplication appl = new RegistryApplication();

		Product product = new Product();
		product.setCode("123456789");
		product.setName("Viin");
		product.setType(new ProductType("1"));
		appl.setProduct(product);
		appl = service.saveOrUpdate(appl);
		assertTrue(appl != null);
	}

	public void testPDFCreator() {
		System.out.println("hell2o");
		service.createApplicationDocument("DEC",
				"30001", null) ;
	}

	public void testFindApplication() {
		RegistryApplication appl = new RegistryApplication();
		appl.setNr("54378129");
		Map<String, Object> qp = new HashMap<String, Object>();
		qp.put("name", "Saku%");
		SearchFilter sf = new SearchFilter();
		sf.setQueryParams(qp);
		sf = service.search(sf);
		Enterprise subj = (Enterprise)sf.getResultsList().get(0);
		appl.setApplicant(subj);
		//appl.setProduct(product);
		service.saveOrUpdate(appl);

	}
	public void testDeleteSubject() throws Exception {
		SearchFilter sf = new SearchFilter();
		sf.setObjectClass("Enterprise");
		sf.setPageSize(10);
		sf.setStartIndex(0);
		Map<String, Object> qp = new HashMap<String, Object>();
		qp.put("registrationId", "110110110");
		sf.setQueryParams(qp);
		sf = service.search(sf);
		Enterprise s = (Enterprise)sf.getResultsList().get(0);
		service.deleteEnterprise(s.getId());
	}

	public void testAddPayment() throws Exception {
		RegistryPayment payment = new RegistryPayment();
		payment.setAmount(new BigDecimal(1000));
		payment.setPayerName("Liviko");
		payment.setPayerRegistrationNr("110110110");
		payment.setPayingAccNo("2030030300");
		payment.setReferenceNr("356789876");
		payment.setPaymentDate(new Date());
		payment.setOrderNumber("1");
		service.saveOrUpdate(payment);

		RegistryPayment payment2 = new RegistryPayment();
		payment2.setAmount(new BigDecimal(235000));
		payment2.setPayerName("Saaremaa");
		payment2.setPayerRegistrationNr("12344321");
		payment2.setPayingAccNo("1102030022");
		payment2.setReferenceNr("2333444322");
		payment2.setOrderNumber("1");
		payment2.setPaymentDate(new Date());
		service.saveOrUpdate(payment2);

	}

	public void testFindPayments() throws Exception {
		SearchFilter filter = new SearchFilter();
		filter.setObjectClass("RegistryPayment");
		filter.setOrderBy("created desc");

		filter = service.search(filter);
		assertTrue("result", filter.getResultsList().size() == 1);
		for(Iterator it = filter.getResultsList().iterator();it.hasNext();) {
			RegistryPayment p = (RegistryPayment)it.next();
		}
	}

	public void testAddProductMovement() throws Exception {
		ProductMovementReport report = new ProductMovementReport();
		Month repMonth = new Month();
		repMonth.setCode("1");
		//    	report.setReportPeriodMonth(repMonth);
		service.saveOrUpdate(report);
	}

	public void testSuperSearch() throws Exception {
		SearchFilter filter = new SearchFilter();
		filter.setObjectClass("SearchView");
		filter = service.superSearch(filter);
		System.out.println("search Done!");
	}

	public void testFindEnterpriseApplicationsInState() throws Exception {
		//    	List apps = service.findEnterpriseApplicationsInState("70000734", IClassificatorService.APPL_STATE_RGE);
		//    	System.out.println("apps.size: " + apps.size());
		//    	assertTrue(apps.size() == 2);
	}

}
