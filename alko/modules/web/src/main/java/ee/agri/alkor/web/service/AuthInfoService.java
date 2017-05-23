package ee.agri.alkor.web.service;


import ee.agri.alkor.web.client.dto.UserInfo;

public interface AuthInfoService extends BaseService {

	UserInfo getUserInfo() ;
   
    UserInfo invalidateSession(boolean keepUser);
    
    UserInfo isSessionValid();

}
