/**
 * AretoServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.StringHolder;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.axis.client.Call;

import ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Application;
import ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery;
import ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingStub;
import ee.riik.xtee.alkor2.producers.producer.alkor2.AretoServiceLocator;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood;
import ee.riik.xtee.alkor2.producers.producer.alkor2.AruandeperioodReq;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandja;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus;
import ee.riik.xtee.alkor2.producers.producer.alkor2.EnteredApplication;
import ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType;
import ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType2;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Kalendrikuu;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus;
import ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery;
import ee.riik.xtee.alkor2.producers.producer.alkor2.MokaType;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Payer;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Payment;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Reaviga;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Receiver;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida;
import ee.riik.xtee.alkor2.producers.producer.alkor2.Treasury;
import ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationsResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_paringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandjaparija_paringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_paringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_paringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_paringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_paringHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_vastusHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsResponseHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder;
import ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder;

public class AretoServiceTest extends junit.framework.TestCase {
	
//	private String serviceURL = "http://localhost:8080/alkor/services/areto";
//	private String serviceURL = "http://alkoreg.agri.ee/alkor/services/areto";
//	private String serviceURL = "http://213.184.49.195/cgi-bin/consumer_proxy";
//	private String serviceURL = "https://127.0.0.1:8443/cgi-bin/consumer_proxy";
	private String serviceURL = "http://localhost:8080/cgi-bin/consumer_proxy";
	private AretoBindingStub binding;
	
	private StringHolder andmekogu;
	private StringHolder asutus;
	private StringHolder isikukood;
	private StringHolder nimi;
	private StringHolder id;
	private  StringHolder toimik;
	
    public AretoServiceTest(java.lang.String name) {
        super(name);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new AretoServiceTest("testListMethods"));      	
        //suite.addTest(new AretoServiceTest("test2aretoPortTransactionStatement"));      	
        //suite.addTest(new AretoServiceTest("testAretoUpload"));      	
        //suite.addTest(new AretoServiceTest("testEITUpload"));      	
       //suite.addTest(new AretoServiceTest("testUpload"));      	
        //suite.addTest(new AretoServiceTest("testSearchMoves"));      	
        //suite.addTest(new AretoServiceTest("testSearchReports"));
        //suite.addTest(new AretoServiceTest("testAruandjaparija"));
        //suite.addTest(new AretoServiceTest("testAddApplication"));
        //suite.addTest(new AretoServiceTest("testSearchProducts"));      	
        //suite.addTest(new AretoServiceTest("testKamm"));      	
        //suite.addTest(new AretoServiceTest("testApplyedApplications"));
        //suite.addTest(new AretoServiceTest("testAcceptedApplications"));
        //suite.addTest(new AretoServiceTest("testGetApplication"));
        //suite.addTest(new AretoServiceTest("testGetUpdateApplicationDocs"));
        return suite;
    }
   
    protected void setUp() throws Exception {
        super.setUp();
        binding = (AretoBindingStub)
        new AretoServiceLocator().getareto(new URL(this.serviceURL));
        binding.setTimeout(60000);
        ((Stub)binding)._setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        ((Stub)binding)._setProperty(Call.ATTACHMENT_ENCAPSULATION_FORMAT, Call.ATTACHMENT_ENCAPSULATION_FORMAT_MIME);

        org.apache.axis.client.Stub stub = 
        	(org.apache.axis.client.Stub)binding;
        stub.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","andmekogu", "alkor2");
        stub.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","asutus", "70000734");
        stub.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","isikukood", "EE37003120292");
        stub.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","id", "a982745724589");
        
        /*
		 andmekogu = new StringHolder("alkor2");
		 asutus = new StringHolder("70000734");
		 isikukood = new StringHolder("EE37003120292");
		 id = new StringHolder("a982745724589");
		 toimik = new StringHolder("");
		 */
    }

    public void testListMethods() throws Exception {
    	String [] meths = binding.listMethods("");
    	for(int i = 0;i < meths.length;i++)
    		System.out.println(meths[i]);
    }

    public void test2aretoPortTransactionStatement() throws Exception {
        assertNotNull("binding is null", binding);
		 ((org.apache.axis.client.Stub)binding).setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.transactionStatement.v1");

        MokaType moka = new MokaType();
        Payment payment = new Payment();
        payment.setAmount(new BigDecimal(100));
        payment.setCurrency("EEK");
        payment.setType("C");
        moka.setPayment(payment);
        Receiver receiver = new Receiver();
        receiver.setAccountNum("123456789");
        receiver.setRegNum("2463615216");
        receiver.setRefNum("68873878788");
        receiver.setReceptionDate("18/03/2007");
        moka.setReceiver(receiver);
        Payer payer = new Payer();
        payer.setName("Saku �lletehase AS");
        payer.setRegNum("10030278");
        payer.setRefNum("3654792345");
        
        moka.setPayer(payer);
        Treasury treasury = new Treasury();
        treasury.setBankRef("gahfgkjqwf");
        treasury.setDocumentNum("6456234");
        treasury.setOrderNum("1");
        moka.setTreasury(treasury);
        moka.setPaymentDesc("see on Saku maksekirjeldus");
        MokaQuery query = new MokaQuery(moka);
        MokaResponseHolder respHolder = new MokaResponseHolder();
        
		 //nimi = new StringHolder("alokr2.transactionStatement.v1");
      
        // Test operation
        binding.transactionStatement(query, 
        		new ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaQueryHolder(),
        		respHolder);
        System.out.println("Vastus: " + respHolder.value.getCode());
    }
    public void testEITUpload() throws Exception {
		 nimi = new StringHolder("alkor2.eitlaadib.v1");
		 StringHolder allasutus = new StringHolder("");
		 
    	File file = new File("aruanne.csv");
    	DataHandler aruanne = new DataHandler(new FileDataSource(file));
    	org.apache.axis.holders.DataHandlerHolder aruandeHolder =
    		new org.apache.axis.holders.DataHandlerHolder(aruanne);
    	
    	Aruandja aruandja = new Aruandja();
    	aruandja.setName("Saku �lletehase AS");
    	/*aruandja.setAddress("Saku linn");
    	aruandja.setTel("81374934");
    	aruandja.setFax("6423642");
    	aruandja.setEmail("saku@gmail.com");*/
    	AruandeperioodReq period = new AruandeperioodReq();
    	period.setRep_year("2006");
    	period.setRep_month(Kalendrikuu.value1);
    	Eitlaadib_paring keha = new Eitlaadib_paring(period, null);
    	Eitlaadib_paringHolder paring = new Eitlaadib_paringHolder(keha);
    	Eitlaadib_vastusHolder keha2 = new Eitlaadib_vastusHolder(new Eitlaadib_vastus());
    	//binding.eitlaadib(keha, aruandeHolder, paring, keha2);
    	
    	
    	System.out.println("vastuse teade: " + keha2.value.getTeade());
    	if((keha2.value.getVead() != null) && (keha2.value.getVead().length > 0)) {
    		for(int i = 0;i < keha2.value.getVead().length;i++) {
    			Reaviga error = keha2.value.getVead()[i];
    			System.out.println("Rida: " + error.getRida() + " viga: " + error.getMure());
    		}
    	} else
    		System.out.println("vastuse aruande sig: " + new String(paring.value.getAruanne()));
    }
    public void testAretoUpload() throws Exception {
		 nimi = new StringHolder("alkor2.aretolaadib.v1");
		 StringHolder allasutus = new StringHolder("");
		 
   	File file = new File("aruanne.csv");
   	DataHandler aruanne = new DataHandler(new FileDataSource(file));
   	org.apache.axis.holders.DataHandlerHolder aruandeHolder =
   		new org.apache.axis.holders.DataHandlerHolder(aruanne);
   	
//   	Aruandjakoodiga aruandja = new Aruandjakoodiga();
//   	aruandja.setReg_nr("10030278");
//   	aruandja.setName("Saku �lletehase AS");
//   	aruandja.setAddress("Saku linn");
//   	aruandja.setTel("81374934");
//   	aruandja.setFax("6423642");
//   	aruandja.setEmail("saku@gmail.com");
//   	Aruandeperiood period = new Aruandeperiood();
//   	period.setRep_year("2006");
//   	period.setRep_month(Kalendrikuu.value1);
//   	Aretolaadib_paring keha = new Aretolaadib_paring(aruandja, period, new byte[0]);
//   	Aretolaadib_paringHolder paring = new Aretolaadib_paringHolder(keha);
//   	Eitlaadib_vastusHolder keha2 = new Eitlaadib_vastusHolder(new Eitlaadib_vastus());
//   	binding.aretolaadib(keha, aruandeHolder, paring, keha2);
//   	
//   	
//   	System.out.println("vastuse teade: " + keha2.value.getTeade());
//   	if((keha2.value.getVead() != null) && (keha2.value.getVead().length > 0)) {
//   		for(int i = 0;i < keha2.value.getVead().length;i++) {
//   			Reaviga error = keha2.value.getVead()[i];
//   			System.out.println("Rida: " + error.getRida() + " viga: " + error.getMure());
//   		}
//   	} else
//   		System.out.println("vastuse aruande sig: " + new String(paring.value.getAruanne()));
    }
    
    public void testSearchMoves() throws Exception {
		 //nimi = new StringHolder("alkor2.liikumine.v1");
		 ((org.apache.axis.client.Stub)binding).setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.liikumine.v1");

    	Liikumine_paring keha = new Liikumine_paring();
    	//keha.setEnt_name("Saku �lletehase AS");
    	//keha.setEnt_reg_nr("70000734");
    	//keha.setEnt_reg_nr("11237490");
    	Aruandeperiood period = new Aruandeperiood();
    	//period.setRep_year("2006");
    	//period.setRep_month(Kalendrikuu.value1);
    	keha.setPeriod(period);
    	
    	Liikumine_paringHolder paring = new Liikumine_paringHolder(keha);
    	Liikumine_vastusHolder keha2 = new Liikumine_vastusHolder(new Liikumine_vastus());
    	binding.liikumine(keha, paring, keha2);
    	
    	Liikumine [] liikumised = keha2.value.getLiikumised();
    	System.out.println("Liikumisi: " + liikumised.length);
    	for(int i = 0;i < liikumised.length;i++) 
    		System.out.println(liikumised[i].getEnt_name() + ", " + liikumised[i].getMarket());
    }
    
    public void testAruandjaparija() throws Exception {
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.aruandjaparija.v1");
		 Aruandjaparija_paring keha = new Aruandjaparija_paring();
		 keha.setReport_id(1);
		 Aruandjaparija_paringHolder paring = new Aruandjaparija_paringHolder(keha);
		 Eitparib_vastusHolder keha2 = new Eitparib_vastusHolder(new Eitparib_vastus());
		 binding.aruandjaparija(keha, paring, keha2);
		 
		 Aruandja aruandja = keha2.value.getAruandja();
		 System.out.println("Aruandja, nimi" + aruandja.getName() 
				 + " address: " + aruandja.getAddress());
    }
    
    public void testSearchReports() throws Exception {
    	((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.aruandeparing.v2");
	Aruandeparing_paring keha = new Aruandeparing_paring();
   	//keha.setEnt_name("Saku AS");
   	Aruandeperiood period = new Aruandeperiood();
   	//period.setRep_year("2006");
   	//period.setRep_month(Kalendrikuu.value1);

   	
   	Aruandeparing_paringHolder paring = new Aruandeparing_paringHolder(keha);
   	Aruandeparing_vastusHolder keha2 = new Aruandeparing_vastusHolder(new Aruandeparing_vastus());
   	binding.aruandeparing(keha, paring, keha2);
   	
   	System.out.println("aruandeid: " + keha2.value.getAruanded().length);
   	Aruandeparing_vastuserida[] rows = keha2.value.getAruanded();
   	for(int i = 0;i < rows.length;i++) {
   		System.out.println("aruandja ettevõtte nimi: " + rows[i].getEnt_name());
   		System.out.println("aruande ridade arv: " + rows[i].getRcd_count());
   	}
   }
    
    public void testSearchProducts() throws Exception {
		 nimi = new StringHolder("alkor2.tooteparing.v1");
		 Tooteparing_paring keha = new Tooteparing_paring();
  	keha.setMan_actor_name("Saku AS");
  	keha.setProducttype(Tooteliik.fromValue("37"));
  	
  	Tooteparing_paringHolder paring = new Tooteparing_paringHolder(keha);
  	Tooteparing_vastusHolder keha2 = new Tooteparing_vastusHolder();
  	binding.tooteparing(keha, paring, keha2);
  	
  	System.out.println("tooteid: " + keha2.value.getTooted().length);
  	Tooteparing_vastuserida[] rows = keha2.value.getTooted();
  	for(int i = 0;i < rows.length;i++) {
  		//System.out.println("taotleja ettevõtte address: " + rows[i].getApp_actor_address());
  		System.out.println("toote nimi: " + rows[i].getItem_name());
  	}
  }
    public void testKamm() throws Exception {
		 nimi = new StringHolder("alkor2.kammparing.v1");
    	Kammparing_paring keha = new Kammparing_paring();
    	keha.setReg_book_nr("R07/30001/37");
    	//keha.setReg_date("2007-05-22");
    	Kammparing_paringHolder paring = new Kammparing_paringHolder(keha);
    	Kammparing_vastusHolder keha2 = new Kammparing_vastusHolder();
    	binding.kammparing(keha, paring, keha2);
    	Kammparing_vastus result = keha2.value;
    	
    	System.out.println("Kamm vastuse status: " + result.getStatus().getValue());
    	//if(result.getKammitem() != null) System.out.println("Kamm vastuse capacity: " + result.getKammitem().getCapacity());
    	
    }
    
    public void testAddApplication() throws Exception {
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.addApplication.v2");
		 AddApplicationQuery paring = new AddApplicationQuery();
		 AddApplicationQueryHolder keha =  new AddApplicationQueryHolder();
		 AddApplicationResponseHolder keha2 = new AddApplicationResponseHolder();
		 javax.activation.DataHandler dh = null;
		Application appl = new Application();
		Aruandja taotleja = new Aruandja();
		taotleja.setName("AS Kupar");
		ee.riik.xtee.alkor2.producers.producer.alkor2.Product productInfo
			= new ee.riik.xtee.alkor2.producers.producer.alkor2.Product();
		productInfo.setName("Praska");
		productInfo.setKNCode("123456789");
		productInfo.setProductType(Tooteliik.fromString("$product.code"));
		appl.setProductInfo(productInfo);
		appl.setApplicantPosition("esitaja");
		appl.setAcknowledgementDate(new Date());
		appl.setAcknowledgementNr("123456789");
		appl.setExciseStoreHouseNr("123456789");
		appl.setMTRCode("123456789");
		paring.setApplication(appl);
		binding.addApplication(paring,  keha, keha2);
		
   }
    
	public void testUpload()throws Exception {
		makeCall("upload.xml");
	}
	
    public void testApplyedApplications() throws Exception {
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.applyedApplications.v2");
		 StringHolder paring = new StringHolder();
		 ApplicationsResponseHolder keha2 = new ApplicationsResponseHolder();
		 
		 System.out.println("apps.length: " + keha2.value.getApps().length);
    }
    public void testAcceptedApplications() throws Exception {
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.acceptedApplications.v2");
		 StringHolder paring = new StringHolder();
		 ApplicationsResponseHolder keha2 = new ApplicationsResponseHolder();
		 binding.acceptedApplications("", paring, keha2);
		 
		 System.out.println("apps.length: " + keha2.value.getApps().length);
   }
    public void testGetUpdateApplication() throws Exception {
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.getApplication.v2");
		 ApplicationQuery keha = new ApplicationQuery();
		 keha.setId("4");
		 ApplicationQueryHolder paring = new ApplicationQueryHolder();
		 UpdateApplicationQueryHolder keha2 = new UpdateApplicationQueryHolder();
		 binding.getApplication(keha, paring, keha2);
		 EnteredApplication app = keha2.value.getAppl().getApplication();
		 System.out.println("app.id: " + keha2.value.getAppl().getApplication().getId());
		 
   }
    
    public void testGetUpdateApplicationDocs() throws Exception {
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.getApplicationDocuments.v2");
		 ApplicationQuery keha = new ApplicationQuery();
		 keha.setId("4"); 
		 ApplicationQueryHolder paring = new ApplicationQueryHolder();
		 UpdateApplicationDocumentsResponseHolder keha2 = new UpdateApplicationDocumentsResponseHolder();
		 binding.getApplicationDocuments(keha, paring, keha2);
		 ExistingApplicationDocumentType[] existingDocs = keha2.value.getExistingApplicationDocuments();
		 System.out.println("exitingDocs.size: " + existingDocs.length);
		 
		 UpdateApplicationDocumentsQueryHolder paring2 = new UpdateApplicationDocumentsQueryHolder();
		 UpdateApplicationDocumentsQuery query = new UpdateApplicationDocumentsQuery();
		 ExistingApplicationDocumentType2 [] updateDocs = new ExistingApplicationDocumentType2[existingDocs.length];
		 // TODO copy data from existingDocs
		 query.setExistingApplicationDocuments(updateDocs);
		 query.setApplicationId(keha2.value.getApplicationId());
		 UpdateApplicationResponseHolder response = new UpdateApplicationResponseHolder();
		 org.apache.axis.holders.DataHandlerHolder doc = new org.apache.axis.holders.DataHandlerHolder();
		 ((org.apache.axis.client.Stub)binding)
		 	.setHeader("http://x-tee.riik.ee/xsd/xtee.xsd","nimi", "alkor2.updateApplicationDocuments.v2");
		 binding.updateApplicationDocuments(query, doc, paring2, response);
		 System.out.println("response: " + response.value.getMessage());
  }
    
	private void makeCall(String soapMsgFileName) throws Exception {
		 SOAPConnectionFactory conFactory = SOAPConnectionFactory.newInstance();
	      SOAPConnection con = conFactory.createConnection();
		MessageFactory factory = MessageFactory.newInstance();
	       SOAPMessage smsg =
	    	   factory.createMessage(new MimeHeaders(), new FileInputStream(soapMsgFileName));
		
	      SOAPMessage resMessage = con.call(smsg, new URL(serviceURL));
			System.out.println("in message: ");
			resMessage.writeTo(System.out);
		
	}

}
