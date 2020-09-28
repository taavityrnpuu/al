package ee.agri.alkor.impl;


public abstract class Config {
	public static String SIGA_URL = "";
	public static String SIGA_ALGORITHM = "";
	public static String SIGA_UUID = "";
	public static String SIGA_SIGNING_KEY = "";
	
	public static void load(){
		try{ 
		ResultSet rs = PostgreUtils.query("SELECT key, value FROM config WHERE key IN ('SIGA_URL', 'SIGA_ALGORITHM', 'SIGA_UUID', 'SIGA_SIGNING_KEY')");
		while(rs.next()){
			String value = rs.getString("value");
			String key = rs.getString("key");
			switch(key) {
				case "SIGA_URL":
					Config.SIGA_URL = value;
				case "SIGA_ALGORITHM":
					Config.SIGA_ALGORITHM = value;
				case "SIGA_UUID":
					Config.SIGA_UUID = value;
				case "SIGA_SIGNING_KEY":
					Config.SIGA_SIGNING_KEY = value;
				default:
					continue;
			}
		}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
