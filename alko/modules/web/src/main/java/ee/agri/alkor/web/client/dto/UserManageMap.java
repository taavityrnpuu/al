package ee.agri.alkor.web.client.dto;


/**
 * Kasutajate halduse tabeli võtmed
 * 
 * @author martin
 */
public class UserManageMap extends ABaseDTOMap {
   
   public static final String USER_NAME ="name";
   
   public static final String PERSON ="person";
   
   public static final String PASSWORD ="password";
   
   public static final String USER_ROLES = "groups";

   public static final String ROLE = "userGroupClass";
   
   public static final String ACTIVE = "active";
   
   public static final String ROLE_CODE = USER_ROLES+ "." + ClassItemMap.CODE;
   public static final String ROLE_NAME = USER_ROLES+ "." + ClassItemMap.NAME;
   

   
//nested properties   
   public static final String USER_ROLES_CODE = USER_ROLES+"."+ROLE+"."+ClassItemMap.CODE;
   public static final String PERS_CODE =PERSON+".registrationId";
   public static final String FIRST_NAME =PERSON+".firstName";
   public static final String FAMILY_NAME =PERSON+".lastName";
   public static final String E_MAIL =PERSON+".contactInfo.email";
   public static final String PERSON_ID =PERSON+"." + ABaseDTOMap.ID;
   
   private static final long serialVersionUID = 1L;
   
   public UserManageMap() {
      super();
   }

}
