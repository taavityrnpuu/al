package ee.agri.alkor.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.service.IClassificatorService;

public class NotEnteredApplicationJobs extends HibernateDaoSupport {

	private static final Logger LOGGER = Logger.getLogger(NotEnteredApplicationJobs.class);

	@SuppressWarnings("unused")
	public void deleteNotEnteredApplications() {
		LOGGER.info("Ececuting deleteNotEnteredApplications() " + new Date().toString());

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
	
		try{
			ResultSet rs = PostgreUtils.query(sql);

			while(rs.next()){
				
				Long product_id = rs.getLong("product_id");
				Long appl_id = rs.getLong("id");
				Long appl_type = rs.getLong("appl_type_class_id");
				String app_nr = rs.getString("nr");
				
				LOGGER.info("found reg_application "+appl_id+" (nr: "+app_nr+")");
				
				if(appl_type == id_pik){ // pikendamise taotlus
					try{ // eemaldame seose
						PostgreUtils.update("UPDATE reg_application SET product_id = null WHERE id = "+appl_id);
						LOGGER.info("updated reg_application "+appl_id+" set product_id = null");
					}catch(Exception x){
						x.printStackTrace();
					}
				}
				else{
					List<Long> products = new ArrayList<Long>();
					
					if(product_id == null){
						try{ // igaks juhuks kõik tooted
							ResultSet rs2 = PostgreUtils.query("SELECT id FROM product WHERE appl_id = "+appl_id);
							
							while(rs2.next()){
								products.add(rs2.getLong("id"));
							}
						}catch(Exception x){
							x.printStackTrace();
						}
					}
					else {
						products.add(product_id);
					}
					
					try{ // eemaldame seose
						PostgreUtils.update("UPDATE reg_application SET product_id = null WHERE id = "+appl_id);
						LOGGER.info("updated reg_application "+appl_id+" set product_id = null");
					}catch(Exception x){
						x.printStackTrace();
					}
					
					for(Long id : products){
						try{ // eemaldame seose
							PostgreUtils.update("UPDATE product SET appl_id = null WHERE id = "+id);
							LOGGER.info("updated product "+id+" set appl_id = null");
						}catch(Exception x){
							x.printStackTrace();
						}
						
						try{ // kustutame toote
							PostgreUtils.delete("DELETE FROM product WHERE id = "+id);
							LOGGER.info("deleted product "+id);
						}catch(Exception x){
							x.printStackTrace();
						}
					}
				}
				
				try{
					 // kustutame taotluse failid
					PostgreUtils.delete("DELETE FROM reg_doc WHERE doc_appl_id = "+appl_id);
					LOGGER.info("deleted reg_doc where doc_appl_id = "+appl_id);
					
					 // kustutame taotluse
					PostgreUtils.delete("DELETE FROM reg_application WHERE id = "+appl_id);
					LOGGER.info("deleted reg_application "+appl_id);
				}catch(Exception x){
					x.printStackTrace();
				}
				
				apps++;
			}
			
		}catch(Exception x){
			x.printStackTrace();
		}
				
		LOGGER.info("deleteNotEnteredApplications() COMPLETE");
	}

	/*
	@SuppressWarnings("unused")
	public void deleteNotEnteredApplications() {
		LOGGER.info("Ececuting deleteNotEnteredApplications() " + new Date().toString());

		try {

			getHibernateTemplate().execute(new HibernateCallback() {
				Query query;
				List<RegistryApplication> expiredNotEnteredApplications;

				public Object doInHibernate(Session session) throws HibernateException, SQLException {
					deleteApplications(session);
					deleteProducts(session);
					session.flush();
					return null;
				}
			});
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		LOGGER.info("deleteNotEnteredApplications() COMPLETE");
	}

	@SuppressWarnings("unchecked")
	private void deleteProducts(Session session) {
		Query query;
		String sql;
		List<Product> products = null;

		query = session
				.createQuery(" from Product p " + "where p.createdBy = ? and " + "registryEntryApplication is null")
				.setString(0, IClassificatorService.EIT_USERNAME);

		products = query.list();
		LOGGER.info("Found " + (products == null ? "0" : products.size()) + " not associated products");
		if (products != null && products.size() > 0) {
			for (Product product : products) {
				sql = " delete from Product p " + " where p.id = ? ";
				query = session.createQuery(sql).setLong(0, product.getId());
				try {
					query.executeUpdate();
				} catch (Exception e) {
					LOGGER.error("Failed do delete not associated product, id = " + product.getId());
					LOGGER.error(e.getMessage(), e);
					
					PostgreUtils.query("UPDATE product SET appl_id = (SELECT id FROM reg_application WHERE product_id = "+product.getId()+" ORDER BY id ASC LIMIT 1) WHERE id = "+product.getId());
					LOGGER.error("Updated product's appl_id to base application because it was null and could'nt delete, id = " + product.getId());
				}
				LOGGER.info("Deleted not associated product, id = " + product.getId());
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void deleteApplications(Session session) {
		Query query;
		List<RegistryApplication> expiredNotEnteredApplications;
		final Calendar expireDate = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date now_m7days = new Date();
		now_m7days.setTime(now_m7days.getTime() - (long) 7 * 1000 * 60 * 60 * 24);

		query = session
				.createQuery(" from RegistryApplication a " + " where a.created <= '" + sdf.format(now_m7days) + "'"
						+ " and a.state is not null " + " and a.state.code = ? " + " and a.type.code = ? ")
				.setString(0, IClassificatorService.APPL_STATE_ENT) // kustutame
																	// kandeid,
																	// mis on
																	// staatuses
																	// esitamata
																	// ja
				.setString(1, IClassificatorService.APPL_TYPE_ARE); // tüübiga
																	// registrisse
																	// kandmise
																	// taotlus
		expiredNotEnteredApplications = query.list();
		LOGGER.info("Found " + (expiredNotEnteredApplications == null ? "0" : expiredNotEnteredApplications.size())
				+ " expired and not entered applications");
		if (expiredNotEnteredApplications != null && expiredNotEnteredApplications.size() > 0) {
			for (RegistryApplication appl : expiredNotEnteredApplications) {
				try {
					deleteApplication(session, appl);
				} catch (Exception e) {
					LOGGER.error("Failed do delete application, id = " + appl.getId());
					LOGGER.error(e.getMessage(), e);
				}
			}
		}
	}

	@Transactional
	private void deleteApplication(Session session, RegistryApplication registryApplication) throws Exception {
		String sql = "";
		Query query = null;

		if (session == null || registryApplication == null || registryApplication.getId() == null) {
			throw new IllegalArgumentException("Illegal arguments");
		}

		sql = "delete from RegistryDocument d " + " where d.application = ? ";
		query = session.createQuery(sql).setParameter(0, registryApplication);
		query.executeUpdate();

		sql = "delete from PaymentMatchingLog l " + " where l.paymentApplication = ? ";
		query = session.createQuery(sql).setParameter(0, registryApplication);
		query.executeUpdate();

		if (registryApplication.getProduct() != null && registryApplication.getProduct().getId() != null) {
			LOGGER.info("App has product_id");
			sql = " update RegistryApplication a " + // kaotab viida
														// reg_application ->
														// product
			" set a.product = null " + " where a.id = ? " + " and a.product = ? ";
			query = session.createQuery(sql).setLong(0, registryApplication.getId()).setParameter(1,
					registryApplication.getProduct());
			query.executeUpdate();

			sql = " update Product p " + // kaotab viida product ->
											// reg_application
			" set p.registryEntryApplication = null " + // TODO kui peab
														// pikendamise
														// taotlusi ka
														// kustutama,
														// tuleb siia
														// vist eelmise
														// taotluse
														// number panna!
			" where p.id = ? ";
			query = session.createQuery(sql).setLong(0, registryApplication.getProduct().getId());
			query.executeUpdate();

			sql = " delete from Product p " + // kustutab toote
					" where p.id = ? ";
			query = session.createQuery(sql).setLong(0, registryApplication.getProduct().getId());
			query.executeUpdate();
			LOGGER.info("Deleted product, id = " + registryApplication.getProduct().getId());
		} else {
			LOGGER.info("App doesn't have product_id");
			query = session.createQuery(" from Product p " + "where registryEntryApplication = ?").setLong(0,
					registryApplication.getId());

			List<Product> products = query.list();
			LOGGER.info("Found " + (products == null ? "0" : products.size()) + " products for app with id "
					+ registryApplication.getId());
			if (products != null && products.size() > 0) {
				for (Product product : products) {
					sql = " delete from Product p " + " where p.id = ? ";
					query = session.createQuery(sql).setLong(0, product.getId());
					try {
						query.executeUpdate();
					} catch (Exception e) {
						LOGGER.error("Failed do delete product, id = " + product.getId());
						LOGGER.error(e.getMessage(), e);
					}
					LOGGER.info("Deleted product, id = " + product.getId());
				}
			}
		}

		sql = " delete from RegistryApplication a " + // kustutab taotluse
				" where a.id = ? ";
		query = session.createQuery(sql).setLong(0, registryApplication.getId());
		query.executeUpdate();
		LOGGER.info("Deleted application , id = " + registryApplication.getId());
	}
*/
}
