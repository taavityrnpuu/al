package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.ListHolder;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.service.ClassificatorServiceDelegate;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.LinkedHashMap;
import ee.agri.alkor.service.RegistryServiceDelegate;
import ee.agri.alkor.util.AppContextHelper;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * @author ivar
 * @version 1.0
 */
public class ClassServiceTest  extends TestCase {
	
	private IClassificatorService service;
	
    public ClassServiceTest() {
    	super("");
    }
    public ClassServiceTest(String name) {
        super(name);
   }
    protected void setUp() throws Exception {
        super.setUp();
        service = ((ClassificatorServiceDelegate)AppContextHelper.getInstance().
        		getBean("classServiceDelegate")).getService();
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        //suite.addTest(new ClassServiceTest("testAddClass"));      	
        //suite.addTest(new ClassServiceTest("testFindCategories")); 
        //suite.addTest(new ClassServiceTest("testFindCategoryClassItems")); 
        return suite;
    }

    public void testAddClass() throws Exception {
    	ListHolder listHolder = 
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("userGroups");
    	service.addClassList(listHolder.getList());
    }
    
    public void testFindCategories() throws Exception {
    	LinkedHashMap categories = service.findCategories(" ");
    }
    
    public void testFindCategoryClassItems() throws Exception {
    	List<Classificator> classItems = service.findClassItems("ProductType");
    	StringBuffer sbuf = new StringBuffer("<xs:simpleType name=\"tooteliik\">\n" +
"       <xs:annotation><xs:appinfo>\n" +
"         <xtee:title>Tooteliik</xtee:title>\n" +
"     </xs:appinfo></xs:annotation>\n" +
"     <xs:restriction base=\"xs:string\">\n");
    	for(Classificator item: classItems) {
    		sbuf.append(
"    		         <xs:enumeration value=\"").append(item.getCode()).append("\">\n" +
"    		            <xs:annotation><xs:appinfo>\n" +
"    		               <xtee:title>").append(item.getName()).append("</xtee:title>\n" +
 "   		            </xs:appinfo></xs:annotation>\n" +
 "   		         </xs:enumeration>\n");
    	}
    	sbuf.append("    </xs:restriction>\n" + 
"</xs:simpleType>\n");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
        		new FileOutputStream("productTypes.xsd"), "utf-8"));
        
        writer.write(sbuf.toString());
        writer.close();
    }

}
