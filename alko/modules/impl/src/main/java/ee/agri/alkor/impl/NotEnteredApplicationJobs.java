package ee.agri.alkor.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import ee.agri.alkor.service.IClassificatorService;

public class NotEnteredApplicationJobs extends HibernateDaoSupport {

	private static final Logger LOGGER = Logger.getLogger(NotEnteredApplicationJobs.class);
	
	@SuppressWarnings("unused")
	public void deleteNotEnteredApplications() {
		LOGGER.info("Executing deleteNotEnteredApplications() " + new Date().toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date now_m7days = new Date();
		now_m7days.setTime(now_m7days.getTime() - (long) 7 * 1000 * 60 * 60 * 24);
		int apps = 0;
		
		Long id_pik = 0l;
		try{
			ResultSet rs2 = PostgreUtils.query("SELECT id FROM classificator WHERE category = 'ApplicationType' AND code = 'ARE'");
			while(rs2.next()){
				id_pik = rs2.getLong("id");
			}
		}catch(Exception x){
			x.printStackTrace();
		}
		
		String sql = "SELECT id, nr, product_id, appl_type_class_id FROM reg_application WHERE created <= '" + sdf.format(now_m7days) + "' "
				+ "AND appl_state_class_id = (SELECT id FROM classificator WHERE code = '"+ IClassificatorService.APPL_STATE_ENT +"' "
					+ "AND category = 'ApplicationState')";
	
		try {
			ResultSet rs = PostgreUtils.query(sql);
			while(rs.next()) {
				Long product_id = rs.getLong("product_id");
				Long appl_id = rs.getLong("id");
				Long appl_type = rs.getLong("appl_type_class_id");
				String app_nr = rs.getString("nr");
				
				LOGGER.info("found reg_application "+appl_id+" (nr: "+app_nr+")");
				if(appl_type == id_pik) { // pikendamise taotlus
					try{ // eemaldame seose
						PostgreUtils.update("UPDATE reg_application SET product_id = null WHERE id = "+appl_id);
						LOGGER.info("updated reg_application "+appl_id+" set product_id = null");
					}catch(Exception x){
						x.printStackTrace();
					}
				} else {
					List<Long> products = new ArrayList<Long>();
					
					if(product_id != null && product_id != 0l)
						products.add(product_id);
						
					try { // igaks juhuks kõik tooted
						ResultSet rs2 = PostgreUtils.query("SELECT id FROM product WHERE id != "+product_id+" AND appl_id = "+appl_id);
						
						while(rs2.next()) {
							products.add(rs2.getLong("id"));
						}
					} catch(Exception x) {
						x.printStackTrace();
					}
					
					try { // eemaldame seose
						PostgreUtils.update("UPDATE reg_application SET product_id = null WHERE id = "+appl_id);
						LOGGER.info("seos updated reg_application "+appl_id+" set product_id = null");
					} catch(Exception x) {
						x.printStackTrace();
					}
					
					System.out.println(products.toString());
					for(Long id : products){
						try { // eemaldame seose
							PostgreUtils.update("UPDATE product SET appl_id = null WHERE id = "+id);
							LOGGER.info("updated product "+id+" set appl_id = null");
						} catch(Exception x) {
							x.printStackTrace();
						}
						
						try { // kustutame toote
							PostgreUtils.delete("DELETE FROM product WHERE id = "+id);
							LOGGER.info("deleted product "+id);
						} catch(Exception x) {
							x.printStackTrace();
						}
					}
				}
				
				try {
					 // kustutame taotluse failid
					PostgreUtils.delete("DELETE FROM reg_doc WHERE doc_appl_id = "+appl_id);
					LOGGER.info("deleted reg_doc where doc_appl_id = "+appl_id);
					
					 // kustutame taotluse
					PostgreUtils.delete("DELETE FROM reg_application WHERE id = "+appl_id);
					LOGGER.info("deleted reg_application "+appl_id);
				} catch(Exception x) {
					x.printStackTrace();
				}
				
				apps++;
			}	
		} catch(Exception x) {
			x.printStackTrace();
		}
		
		LOGGER.info("deleteNotEnteredApplications() COMPLETE");
	}
}
