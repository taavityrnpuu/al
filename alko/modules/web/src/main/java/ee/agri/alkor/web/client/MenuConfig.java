package ee.agri.alkor.web.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.web.client.form.BlanketForm;
import ee.agri.alkor.web.client.form.EnterpriseList;
import ee.agri.alkor.web.client.form.EnterpriseReferenceFrom;
import ee.agri.alkor.web.client.form.FAQForm;
import ee.agri.alkor.web.client.form.EITEnterpriseForm;
import ee.agri.alkor.web.client.form.DeleteConfirmation;
import ee.agri.alkor.web.client.form.ConfigForm;
import ee.agri.alkor.web.client.form.NewsForm;
import ee.agri.alkor.web.client.form.SearchForm;
import ee.agri.alkor.web.client.form.admin.AuthenticLog;
import ee.agri.alkor.web.client.form.admin.RolesManagement;
import ee.agri.alkor.web.client.form.admin.UsersManagementForm;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;
import ee.agri.alkor.web.client.form.appl.ProductsForm;
import ee.agri.alkor.web.client.form.clm.ClassificatorsManagement;
import ee.agri.alkor.web.client.form.cm.ManageFAQForm;
import ee.agri.alkor.web.client.form.cm.ManageNewsForm;
import ee.agri.alkor.web.client.form.cm.PublicDocuments;
import ee.agri.alkor.web.client.form.finance.IncomsForm;
import ee.agri.alkor.web.client.form.finance.StateFeeForm;
import ee.agri.alkor.web.client.form.quer.AlcoMovementForm;
import ee.agri.alkor.web.client.form.quer.InvalidAlcoForm;
import ee.agri.alkor.web.client.form.quer.RegisteredAlcoForm;
import ee.agri.alkor.web.client.form.quer.SubmittedReportsForm;
import ee.agri.alkor.web.client.form.xtee.XTeeForm;
import ee.agri.alkor.web.client.form.EnterpriseDetails;
import ee.agri.alkor.web.client.statics.ContactPage;
import ee.agri.alkor.web.client.statics.HomePage;
import ee.agri.alkor.web.client.statics.LegalForm;
import ee.agri.alkor.web.service.ServiceConstants;

public class MenuConfig {

   private static ConstantsWithLookup messages;
   private static List<MenuItem> menu;

   public static Object getConstantsWithLookup() {
      if ("est".equals(ServiceContext.getInstance().getLanguage()))
         return GWT.create(MenuEstMsgs.class);
      else
         return GWT.create(MenuEngMsgs.class);
   }

   public static List getConfig(boolean canEditEnterprise) {
	  
      messages = (ConstantsWithLookup) getConstantsWithLookup();

      menu = new ArrayList();
      MenuItem item = new MenuItem(getLabel("menuHome"), "MainMenu", HomePage.getKey(), null);
      menu.add(item);
      item = new MenuItem(getLabel("menuQueries"), "MainMenu", null, null);
      menu.add(item);
      item.addSubMenu(new MenuItem(getLabel("menuRegisteredAlco"), "SubMenu", RegisteredAlcoForm.getKey(), null));
      item.addSubMenu(new MenuItem(getLabel("menuInvalidAlco"), "SubMenu", InvalidAlcoForm.getKey(), null));
      item.addSubMenu(new MenuItem(getLabel("menuAlcoMovement"), "SubMenu", AlcoMovementForm.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_AUDIT}));
      item.addSubMenu(new MenuItem(getLabel("menuReports"), "SubMenu", SubmittedReportsForm.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_AUDIT}));
      item = new MenuItem(getLabel("menuForms"), "MainMenu", BlanketForm.getKey(), null);
      menu.add(item);
      item = new MenuItem(getLabel("menuActs"), "MainMenu", LegalForm.getKey(), null);
      menu.add(item);
      item = new MenuItem(getLabel("menuContacts"), "MainMenu", ContactPage.getKey(), null);
      menu.add(item);
      item = new MenuItem(getLabel("menuNews"), "MainMenu", NewsForm.getKey(), null);
      menu.add(item);
      item = new MenuItem(getLabel("menuFaq"), "MainMenu", FAQForm.getKey(), null);
      menu.add(item);
      item = new MenuItem(getLabel("menuXTee"), "MainMenu", XTeeForm.getKey(), new String[] {ServiceConstants.ROLE_EIT_GRP});
      menu.add(item);
      if(canEditEnterprise){  
    	  item = new MenuItem("Muuda asutuse andmeid", "MainMenu", EITEnterpriseForm.getKey(), new String[] {ServiceConstants.ROLE_EIT_GRP});
    	  menu.add(item);
      }
     // item = new MenuItem(getLabel("menuPassword"), "MainMenu", XTeeForm.getKey(), new String[] {ServiceConstants.ROLE_EIT_GRP});
     // menu.add(item);
      item = new MenuItem(getLabel("menuSearch"), "MainMenu", SearchForm.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_AUDIT});
      menu.add(item);
      item = new MenuItem(getLabel("menuApplications"), "MainMenu", ApplicationForm.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_AUDIT});
      menu.add(item);
      item = new MenuItem(getLabel("menuProducts"), "MainMenu", ProductsForm.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_AUDIT});
      menu.add(item);
      item = new MenuItem(getLabel("menuEnterprises"), "MainMenu", EnterpriseList.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_AUDIT});
      menu.add(item);
      item = new MenuItem(getLabel("menuIncoms"), "MainMenu", IncomsForm.getKey(),  new String[] {ServiceConstants.ROLE_REG_WRK});
      menu.add(item);
      item = new MenuItem(getLabel("menuStateFee"),"MainMenu",StateFeeForm.getKey(),new String[] {ServiceConstants.ROLE_REG_WRK});
      menu.add(item);
      item = new MenuItem(getLabel("menuClassificators"), "MainMenu", ClassificatorsManagement.getKey(), new String[] {ServiceConstants.ROLE_REG_WRK, ServiceConstants.ROLE_USR_ADM});
      menu.add(item);
      item = new MenuItem(getLabel("menuAdmin"), "MainMenu", null, new String[] {ServiceConstants.ROLE_USR_ADM, ServiceConstants.ROLE_CLASS_ADM});
      menu.add(item);
      item.addSubMenu(new MenuItem("Kustutamise põhjendused", "SubMenu", DeleteConfirmation.getKey(), new String[] {ServiceConstants.ROLE_USR_ADM}));
      item.addSubMenu(new MenuItem(getLabel("menuManageUsers"), "SubMenu", UsersManagementForm.getKey(), new String[] {ServiceConstants.ROLE_USR_ADM}));
      item.addSubMenu(new MenuItem(getLabel("menuManageRoles"), "SubMenu", RolesManagement.getKey(), new String[] {ServiceConstants.ROLE_USR_ADM}));
      item.addSubMenu(new MenuItem(getLabel("menuLogs"), "SubMenu", AuthenticLog.getKey(), new String[] {ServiceConstants.ROLE_CLASS_ADM}));
      item.addSubMenu(new MenuItem("Süsteemi konfiguratsioon", "SubMenu", ConfigForm.getKey(), new String[] {ServiceConstants.ROLE_USR_ADM}));
      item = new MenuItem(getLabel("menuContentManage"), "MainMenu", null, new String[] {ServiceConstants.ROLE_USR_ADM});
      menu.add(item);
      item.addSubMenu(new MenuItem(getLabel("menuForms"), "SubMenu", PublicDocuments.getKey(), null));
      item.addSubMenu(new MenuItem(getLabel("menuNewsManage"), "SubMenu", ManageNewsForm.getKey(), null));
      item.addSubMenu(new MenuItem(getLabel("menuFaqManage"), "SubMenu", ManageFAQForm.getKey(), null));      
      if(canEditEnterprise){      
    	  item = new MenuItem("Volitused", "MainMenu", EnterpriseReferenceFrom.getKey(), new String[] {ServiceConstants.ROLE_EIT_GRP});
    	  menu.add(item);
      }
      item = new MenuItem("Minu aruanded", "MainMenu", SubmittedReportsForm.getKeyEIT(), new String[] {ServiceConstants.ROLE_EIT_GRP});
	  menu.add(item);
      return menu;
   }

   private static String getLabel(String key) {
      String parsed = key.replace('.', '_');
      try {
         return messages.getString(parsed);
      } catch (Exception e) {
         return "[NO_MESSAGE]";
      }
   }
   
   public static String[] getMenuItemViewRoles(String token) {
      return getMenuItemViewRolesFrom(menu, token);
   }
   
   private static String[] getMenuItemViewRolesFrom(List<MenuItem> list, String token) {
      for (MenuItem item : list) {
         if (token != null && token.equals(item.getHistoryKey())) {
            return item.getViewRoles();
         }
         if (item.getSubMenus() != null) {
            String[] innerMenu = getMenuItemViewRolesFrom(item.getSubMenus(), token);
            if (innerMenu != null) {
               return innerMenu;
            }
         }
      }
      return null;
   }

}
