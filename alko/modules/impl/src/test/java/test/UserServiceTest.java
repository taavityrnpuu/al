package test;

import java.util.List;

import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.classes.SystemGroup;
import ee.agri.alkor.service.ConstraintViolationException;
import ee.agri.alkor.service.IUserManagerService;
import ee.agri.alkor.service.UserManagerServiceDelegate;
import ee.agri.alkor.util.AppContextHelper;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * @author ivar
 * @version 1.0
 */
public class UserServiceTest extends TestCase {

	private IUserManagerService service;

	public UserServiceTest() {
		super("");
	}

	public UserServiceTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		service = ((UserManagerServiceDelegate) AppContextHelper.getInstance()
				.getBean("userServiceDelegate")).getService();
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		/*suite.addTest(new UserServiceTest("testAddUser"));*/
		//suite.addTest(new UserServiceTest("testAddUser2"));
		//suite.addTest(new UserServiceTest("testFindUser"));
		/*suite.addTest(new UserServiceTest("testFindSystemGroups"));
		suite.addTest(new UserServiceTest("testRemoveUser"));*/
		
		return suite;
	}

	public void testAddUser() throws Exception {
		SystemUser user = new SystemUser();
		user.setName("karu");
		user.setPassword("12345");
		service.saveUser(user);
	}
	public void testAddUser2() throws Exception {
		SystemUser user = new SystemUser();
		user.setName("karu");
		user.setPassword("12345");
		try {
		service.saveUser(user);
		} catch(Exception e) {
			assertTrue(e instanceof ConstraintViolationException);
			
		}
	}

	public void testFindUser() throws Exception {
		SystemUser user = service.findUser("karu");
		assertTrue(user != null);
	}

	public void testFindSystemGroups() throws Exception {
		List<SystemGroup> groups = service.findSystemGroups();
		assertTrue(groups.size() == 2);
	}

	public void testRemoveUser() throws Exception {
		SystemUser user = service.findUser("karu");
		service.deleteUser(user.getId());
		user = service.findUser("karu");
		assertTrue(user != null);
	}

}
