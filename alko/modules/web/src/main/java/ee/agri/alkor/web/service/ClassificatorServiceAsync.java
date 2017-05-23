package ee.agri.alkor.web.service;


import com.google.gwt.user.client.rpc.AsyncCallback;

import ee.agri.alkor.web.client.dto.ClassItemMap;

/**
 *
 * @author suisalu
 *
 */
public interface ClassificatorServiceAsync  {
   /**
    *
    * @param category String
    * @param callback AsyncCallback
    */
   void findClassItems(String category, AsyncCallback callback);
   void findClassItems2(String category, AsyncCallback callback);
   void findEnterpriseSpecificClassItems(String className, String regCode, AsyncCallback callback);

   void findCategories(String code, AsyncCallback callback);

   void saveClass(ClassItemMap map, AsyncCallback callback);
   void delete (Long id, AsyncCallback callback);

   void findAllClassItems(String category, AsyncCallback callback) ;

}
