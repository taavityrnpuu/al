package ee.agri.alkor.service;

import java.util.List;

import ee.agri.alkor.model.classes.Classificator;

public interface IClassificatorService extends IBaseService {

   /**
    * Läbi EIT tulnud kasutaja nimi
    */
   String EIT_USERNAME = "EIT";

   /**
    * Authentication types.
    */
   String AUTH_TYPE_FORM = "FORM";

   String AUTH_TYPE_CERT = "CLIENT_CERT";
   
   String AUTH_TYPE_EIT = "EIT";
   /**
    * Taotluse liik: Taotlus registrisse kandmiseks"
    */
   String APPL_TYPE_ARE = "ARE";
   /**
    * Taotluse liik: otlus registrikande pikendamiseks.
    */
   String APPL_TYPE_ARP = "ARP";

   /**
    * Application 'kontrollimisel' state code.
    */
   String APPL_STATE_CTL = "CTL";
   /**
    * Application 'Esitatud menetlemiseks' state code.
    */
   String APPL_STATE_PRE = "ADD";
   /**
    * Application 'menetluses' state code.
    */
   String APPL_STATE_PRO = "PRO";

   /**
    * Application 'pikendatud' state code.
    */
   String APPL_STATE_REXT = "REXT";

   /**
    * Application 'mitte pikendatud' state code.
    */
   String APPL_STATE_REXT_NOT = "REXTN";

   /**
    * Application 'Registrisse kantud' state code.
    */
   String APPL_STATE_RGE = "RGE";

   /**
    * Application 'Registrisse mittekantud' state code.
    */
   String APPL_STATE_RGN = "RGN";

   /**
    * Application 'Tühistatud' state code.
    */
   String APPL_STATE_VOID = "VOID";

   /**
    * Application 'Esitamata' state code
    */
   String APPL_STATE_ENT = "ENT";

   /**
    * Positive RegistryEntryDecision class code.
    */
   String REGENTRY_DECISION = "RGE";
   /**
    * Negative RegistryEntryDecision class code
    */
   String REGENTRY_DECISION_N = "RGN";
   /**
    * Positive extend RegistryEntryDecision class code
    */
   String REGENTRY_DECISION_EXTENDED = "REXT";


   /**
    * Negative extend RegistryEntryDecision class code
    */
   String REGENTRY_DECISION_NOT_EXTENDED = "REXTN";
   /**
    *
    */
   String EXAMPLES_DECISION_RETURN = "PER";
   String EXAMPLES_DECISION_KEEP = "PEK";
   /**
    *
    * Public document type classificator code value.
    */
   String DOC_TYPE_PUB = "PUB";
   /**
    *
    * Application for registry entry
    * document type classificator code value.
    */
   String DOC_TYPE_ARE = "ARE";
   /**
    * Registry entry decision
    * document type classificator code value.
    */
   String DOC_TYPE_DEC = "DEC";

   /**
    * Registry entry decline (ärakiri)
    * document type classificator code value.
    */
   String DOC_TYPE_NDEC = "NDEC";

   /**
    * Registry entry correction(õiend)
    * document type classificator code value.
    */
   String DOC_TYPE_COR = "COR";


   /**
    * Registry entry extend decision
    * document type classificator code value.
    */
   String DOC_TYPE_EX_DEC = "EX_DEC";

   /**
    * Registry entry extend decline
    * document type classificator code value.
    */
   String DOC_TYPE_EX_NDEC = "EX_NDEC";

   /**
    * Registry entry extend correction(õiend)
    * document type classificator code value.
    */
   String DOC_TYPE_EX_COR = "EX_COR";

   /**
    * Default user role
    */
   String ROLE_ANONYMOUS = "ANONYMOUS";

   /**
    * Extend application decision types
    */
   String EXTEND_DECISION = "extended";
   String NOTEXTENDED_DECISION = "notExtended";
   String EXTENDED_UNTIL = "extendedUntil";

   void addClassList(List<Classificator> classList) throws ConstraintViolationException ;

   void delete(Long classItemId);

   /**
    * Finds all classificator categories.
    *
    * @return Map of (category->categoryName)
    */
   LinkedHashMap findCategories(String code);

   List<Classificator> findClassItems(String category);
   List<Classificator> findClassItems2(String category);

   List<Classificator> findAllClassItems(String category, boolean all);

   Classificator find(String category, String code);

   List<Classificator> findEnterpriseSpecificClassItems(String className, String regCode);

}
