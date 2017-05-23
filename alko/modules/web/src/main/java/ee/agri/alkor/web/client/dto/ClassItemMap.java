package ee.agri.alkor.web.client.dto;

public class ClassItemMap
	extends ABaseDTOMap {

	public static final String CLASS = "class";

	public static final String CODE = "code";

	public static final String NAME = "name";

	public static final String ACTIVE = "active";

   public static final String CATEGORY_NAME = "categoryName";

   public static final String VALID_FROM = "validFrom";

   public static final String VALID_TO = "validUntil";
   
   public static final String ORDER_NR = "orderNr";
   
   public static final String ORDER_NR_VTA = "orderNrVta";
   
   public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		String uus = "ClassItemMap[id="+this.getProperty(ABaseDTOMap.ID)
		+"; class="+this.getProperty(ClassItemMap.CLASS)
		+"; name="+this.getProperty(ClassItemMap.NAME)
		+"; categoryName="+this.getProperty(ClassItemMap.CATEGORY_NAME)
		+"; validFrom="+this.getProperty(ClassItemMap.VALID_FROM)
		+"; code=" + this.getProperty(ClassItemMap.CODE)
		+";]";
		return uus;
	}

}
