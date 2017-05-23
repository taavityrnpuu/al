package ee.agri.alkor.impl;

import java.util.Iterator;

import ee.agri.alkor.model.ListHolder;
import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IUserManagerService;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.util.AppContextHelper;

/**
 * Application base data setup.
 *
 * @author ivar
 *
 */
public class AppSetup {

	@SuppressWarnings("unchecked")
	private void setUp() throws Exception {
		IClassificatorService classService =
			ServiceFactory.getClassificatorService();
		IUserManagerService userService =
			ServiceFactory.getUserManagerService();
    	ListHolder listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("userGroups");
    	classService.addClassList(listHolder.getList());
    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("docTypes");
    	classService.addClassList(listHolder.getList());
    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("countries");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("subjectRoles");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("productTypes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("corkShapes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("stockingColors");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("queryStates");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("applicationTypes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("packingMaterials");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("bottleShapes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("bottleColors");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("corkColors");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("corkMaterials");
    	classService.addClassList(listHolder.getList());


    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("applicationStates");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("regEntryDecisionTypes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("prodExampleDecisionTypes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("taxAmounts");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("languages");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("authTypes");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("months");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("classes.xml").getBean("capacities");
    	classService.addClassList(listHolder.getList());

    	listHolder =
    		(ListHolder)AppContextHelper.getInstance("users.xml").getBean("users");
    	for(Iterator it = listHolder.getList().iterator();it.hasNext();) {
    		SystemUser user = (SystemUser)it.next();
    		userService.saveUser(user);
    	}
	}

	public static void main(String[] args) {
		AppSetup setup = new AppSetup();
		try {
			setup.setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
