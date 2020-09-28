package test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.orm.hibernate5.SessionHolder;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import ee.agri.alkor.util.AppContextHelper;
import ee.agri.alkor.util.convert.Alkor1Converter;
import ee.agri.alkor.util.convert.PmrConverter;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * @author ivar
 * @version 1.0
 */
public class RegistryImportTest  extends TestCase {

	private Alkor1Converter alkor1Converter;

	private Alkor1Converter productsConverter;

	private PmrConverter reportsConverter;

	private SessionFactory sessionFactory;

    public RegistryImportTest() {
    	super("");
    }
    public RegistryImportTest(String name) {
        super(name);
   }
    protected void setUp() throws Exception {
        super.setUp();
        alkor1Converter = (Alkor1Converter)AppContextHelper.getInstance().
        		getBean("alkor1Converter");
        productsConverter = (Alkor1Converter)AppContextHelper.getInstance().
        		getBean("alkor1Converter");
        reportsConverter = (PmrConverter)AppContextHelper.getInstance().
			getBean("pmrConverter");
        sessionFactory = (SessionFactory) alkor1Converter.getAlkor1Export().getSessionFactory();
        Session session = SessionFactoryUtils.getSession(sessionFactory, true);
        TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(session));
    }

    protected void tearDown() throws Exception {
    	SessionHolder sessionHolder = (SessionHolder) TransactionSynchronizationManager
    			.unbindResource(sessionFactory);
    	SessionFactoryUtils.closeSession(sessionHolder.getSession());
    	super.tearDown();
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        //suite.addTest(new RegistryImportTest("testConvertProducts"));
        //suite.addTest(new RegistryImportTest("testConvertReports"));
        suite.addTest(new RegistryImportTest("testConvert"));
        //TODO: testConvertReports eraldi
        System.gc();
        suite.addTest(new RegistryImportTest("testConvertReports"));
        return suite;
    }
    public void testConvertProducts() throws Exception {
    	productsConverter.convert();
    }

    public void testConvert() throws Exception {
    	alkor1Converter.convert();
    }

    public void testConvertReports() throws Exception {
    	reportsConverter.convert();
    }
}
