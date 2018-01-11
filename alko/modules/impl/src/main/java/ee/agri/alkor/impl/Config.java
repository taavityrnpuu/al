package ee.agri.alkor.impl;


public abstract class Config {
	public static String DIGIDOCSERVICE_URL = "https://digidocservice.sk.ee";
	
	public static void load(){
		try{ 
		ResultSet rs = PostgreUtils.query("SELECT value FROM config WHERE key = 'DIGIDOCSERVICE_URL'");
		while(rs.next()){
			Config.DIGIDOCSERVICE_URL = rs.getString("value");
		}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
