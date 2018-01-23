package ee.agri.alkor.web.server;

import java.util.List;

import org.apache.log4j.Logger;

import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.client.common.LinkedHashMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.service.ClassificatorService;
import ee.agri.alkor.web.service.SystemException;

/**
 *
 * @author suisalu
 *
 */
public class ClassificatorServiceImpl implements ClassificatorService {
   private static Logger LOGGER = Logger
         .getLogger(ClassificatorServiceImpl.class);

   public ClassificatorServiceImpl() {
      super();
   }

   public List findClassItems(String category) {
      IClassificatorService service = ServiceFactory.getClassificatorService();
      //List<Classificator> serverList = service.findClassItems(category);//TODO: kas see peab siin olema?

      List classList = ClientDataFactory.create(category, service.findClassItems(category));

      //if (LOGGER.isDebugEnabled())
      //LOGGER.debug("classList.size: " + classList.size());

      return classList;
   }
   
   public List findClassItems2(String category) {
	      IClassificatorService service = ServiceFactory.getClassificatorService();
	      //List<Classificator> serverList = service.findClassItems2(category);//TODO: kas see peab siin olema?

	      List classList = ClientDataFactory.create(category, service.findClassItems2(category));

	      //if (LOGGER.isDebugEnabled())
	      //LOGGER.debug("classList.size: " + classList.size());

	      return classList;
	   }

   public List findAllClassItems(String category) {
      IClassificatorService service = ServiceFactory.getClassificatorService();
      List classList = ClientDataFactory.create(category, service.findAllClassItems(category, true));
      if (LOGGER.isDebugEnabled())
         LOGGER.debug("classList.size: " + classList.size());

      return classList;

   }

   public LinkedHashMap findCategories(String code) {
      LinkedHashMap map = ClientDataFactory.create(ServiceFactory.getClassificatorService().findCategories(code));
      return map;
   }

   public ClassItemMap saveClass(ClassItemMap map) {
      try {
         return ClientDataFactory.create((Classificator) ServiceFactory.getClassificatorService().saveOrUpdate(
               ClientDataFactory.create(map)));
      } catch (Exception cve) {
         cve.printStackTrace();
         throw new SystemException(cve.getMessage());
      }
   }

   public void delete(Long classItemId) {
      ServiceFactory.getClassificatorService().delete(classItemId);
   }

   public List findEnterpriseSpecificClassItems(String className, String regCode) {
      IClassificatorService service = ServiceFactory.getClassificatorService();
      List classList = ClientDataFactory.create(className, service.findEnterpriseSpecificClassItems(className, regCode));
      return classList;
   }

}
