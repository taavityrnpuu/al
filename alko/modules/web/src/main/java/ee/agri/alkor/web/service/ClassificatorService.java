package ee.agri.alkor.web.service;

import java.util.List;

import ee.agri.alkor.web.client.common.LinkedHashMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;

/**
 *
 * @author suisalu
 *
 */
public interface ClassificatorService extends BaseService {
   /**
    *
    * @param category
    * @return List ClassItem instances
    */
   List findClassItems(String category) ;
   List findClassItems2(String category);
   List findEnterpriseSpecificClassItems(String className, String regCode);

   LinkedHashMap findCategories(String code) ;

   ClassItemMap saveClass(ClassItemMap map);

   void delete (Long classItemId);

   List findAllClassItems(String category);
}
