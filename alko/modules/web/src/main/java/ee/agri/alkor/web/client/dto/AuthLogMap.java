package ee.agri.alkor.web.client.dto;

public class AuthLogMap 
	extends ABaseDTOMap {

	public static final String USER_FULL_NAME = "userFullName";
	
	public static final String IP = "clientIP";
   
   public static final String REGISTRY_CODE = "registrationId";
   
   public static final String AUTH_TIME = "time";
   
   public static final String AUTH_TYPE = "type";
   
   public static final String AUTH_TYPE_NAME = AUTH_TYPE + "." + ClassItemMap.NAME;

}
