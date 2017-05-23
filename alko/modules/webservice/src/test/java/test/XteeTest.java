package test;

import java.util.Iterator;
import java.util.List;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.service.ClassificatorServiceDelegate;
import ee.agri.alkor.util.AppContextHelper;
import ee.agri.alkor.xtee.IXteeServices;
import ee.agri.alkor.xtee.MTRLicense;
import ee.agri.alkor.xtee.MtrAndCustomsQueryResult;
import ee.agri.alkor.xtee.ServiceFactory;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class XteeTest extends TestCase {

	private IXteeServices services;
	
    public XteeTest() {
    	super("");
    }
    public XteeTest(String name) {
        super(name);
   }
    protected void setUp() throws Exception {
        super.setUp();
        services = ServiceFactory.getXteeServices();
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        //suite.addTest(new XteeTest("testFindEnterprise"));      	
        //suite.addTest(new XteeTest("testQueryMTRAndCustoms"));      	
        return suite;
    }

    public void testFindEnterprise() {
    	//Enterprise ent = services.queryEnterprise(null, "10030278");
    	//assertTrue(ent != null);
    	//System.out.println("name: " + ent.getName());
    }
    
    public void testQueryMTRAndCustoms() {
    	//MtrAndCustomsQueryResult result = services.queryMTRAndCustoms("10030278");
	MtrAndCustomsQueryResult result = services.queryMTRAndCustoms("10190912");
   	assertTrue(result != null);
    	List lices = result.getMtrLicenses();
    	
    	assertTrue(lices.size() > 0);
    	for(Iterator it = lices.iterator();it.hasNext();) {
    		MTRLicense lic = (MTRLicense)it.next();
    		
    		System.out.println("tegevusloa regnr: " 
    				+ lic.getNr() + " kp: " + lic.getDate() + " tegevusala: " + lic.getBusinessName());
    	}
    }
    
}
