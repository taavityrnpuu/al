package ee.agri.alkor.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import ee.agri.alkor.impl.PostgreUtils;
import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.Decision;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Faq;
import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.News;
import ee.agri.alkor.model.PaymentMatchingLog;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductEnterpriseRole;
import ee.agri.alkor.model.ProductMovementReportRecord;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.RegistryPaymentLog;
import ee.agri.alkor.model.XTeeId;
import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.DocumentType;
import ee.agri.alkor.model.classes.Language;
import ee.agri.alkor.model.classes.RegistryEntryDecisionType;
import ee.agri.alkor.service.AuthenticationServiceDelegate;
import ee.agri.alkor.service.ConstraintViolationException;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.SystemException;
import ee.agri.alkor.siga.SigaServiceImpl;
import ee.agri.alkor.util.AppContextHelper;
import ee.agri.alkor.model.classes.ApplicationType;

@Service
public class RegistryServiceImpl extends BaseBO implements IRegistryService {

	private static Logger LOGGER = Logger.getLogger(RegistryServiceImpl.class);

	private String docRoot;
	private String baseURI;

	@Autowired
    private SessionFactory sessionFactory;

	private long applicationNrBase;

	private long decisionNrBase;

	private long entryNrBase;

	private PDFCreator pdfCreator;

	private String trustStore;
	private String trustStorePassword;

	public RegistryServiceImpl() {
		super();
	}

	/**
	 * Changes the state code of application int processing.
	 * 
	 * @param applicationId
	 * @return String sateCode
	 */
	public ApplicationState processApplication(final Long applicationId) {
		if (applicationId == null)
			throw new NullPointerException("applicationId == null");

		RegistryApplication appl = null;
		try {
			appl = (RegistryApplication) getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					RegistryApplication appl = session.load(RegistryApplication.class, applicationId);
					ApplicationState state = new ApplicationState();
					state.setCode(IClassificatorService.APPL_STATE_PRO);
					appl.setState(state);
					
					return appl;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return appl.getState();
	}

	public RegistryApplication saveExtendApplicationDecision(final RegistryApplication registryApplication) {

		try {
			return (RegistryApplication)getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					Decision decision = registryApplication.getDecision();
					decision.setDate(new Date());
					RegistryEntry registryEntry = registryApplication.getRegistryEntry();

					if (IClassificatorService.EXTENDED_UNTIL.equals(decision.getExtendRegEntryDecision())) {
						registryEntry.setValidUntil(addYears(registryEntry.getValidUntil() != null
								? registryEntry.getValidUntil() : new Date(System.currentTimeMillis()), 5));
						
						// määrame aegumise mitte teavitatuks
						registryEntry.setExpiryNotificationSent(new Boolean(false));
					} else if (IClassificatorService.EXTEND_DECISION.equals(decision.getExtendRegEntryDecision())
							|| IClassificatorService.NOTEXTENDED_DECISION
									.equals(decision.getExtendRegEntryDecision())) {

						decision.setSigner(registryApplication.getProcessor());

						// if original reg application has decision nr,
						// it is
						// used as
						// extend application decision nr
						RegistryApplication oldRegistryApplication = findRegistryApplication(
								registryApplication.getNr().substring(0,
										registryApplication.getNr().indexOf('/') == -1
												? registryApplication.getNr().length()
												: registryApplication.getNr().indexOf('/')));
						if (oldRegistryApplication != null && oldRegistryApplication.getDecision() != null) {
							decision.setNr(oldRegistryApplication.getDecision().getNr());
						}
						if (IClassificatorService.EXTEND_DECISION.equals(decision.getExtendRegEntryDecision())) {
							if (decision.getExtendUntilDate() == null){
								registryEntry.setValidUntil(addYears(registryEntry.getValidUntil() != null
										? registryEntry.getValidUntil() : new Date(System.currentTimeMillis()), 5));

								// määrame aegumise mitte teavitatuks
								registryEntry.setExpiryNotificationSent(new Boolean(false));
							}
							ApplicationState applicationState = new ApplicationState();
							applicationState.setCode(IClassificatorService.APPL_STATE_REXT);
							registryApplication.setState(applicationState);
							RegistryEntryDecisionType decisionType = new RegistryEntryDecisionType();
							decisionType.setCode(IClassificatorService.REGENTRY_DECISION_EXTENDED);
							decision.setRegEntryDecision(decisionType);
						} else {
							if (decision.getExtendUntilDate() != null)
								registryEntry.setValidUntil(new Date());
							ApplicationState applicationState = new ApplicationState();
							applicationState.setCode(IClassificatorService.APPL_STATE_REXT_NOT);
							registryApplication.setState(applicationState);
							RegistryEntryDecisionType decisionType = new RegistryEntryDecisionType();
							decisionType.setCode(IClassificatorService.REGENTRY_DECISION_NOT_EXTENDED);
							decision.setRegEntryDecision(decisionType);
						}
						decision.setExtendUntilDate(null);
						decision.setExtendUntilExplanation(null);

					} else {
						// unknown decision type
						throw new SystemException();
					}
					
					/*
					 * Keerame staatuse õigeks
					 */
					ApplicationType type = new ApplicationType();
					type.setCode(IClassificatorService.APPL_TYPE_ARP);
					registryApplication.setType(type);
					session.saveOrUpdate(registryApplication);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					try {
						if (!IClassificatorService.EXTENDED_UNTIL.equals(decision.getExtendRegEntryDecision())) {
							createApplicationDocument(session, IClassificatorService.DOC_TYPE_EX_DEC,registryApplication, registryApplication.getProcessor());
							
							if (IClassificatorService.EXTEND_DECISION.equals(decision.getExtendRegEntryDecision())) {
								createApplicationDocument(session, IClassificatorService.DOC_TYPE_EX_COR,
										registryApplication, registryApplication.getProcessor());
							} else if (IClassificatorService.NOTEXTENDED_DECISION.equals(decision.getExtendRegEntryDecision())) {
								createApplicationDocument(session, IClassificatorService.DOC_TYPE_EX_NDEC,
										registryApplication, registryApplication.getProcessor());
							}

						}
					} catch (IOException ioe) {
						throw new HibernateException(ioe);
					}
					return registryApplication;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	public boolean isSigned(int applId, String docName) {
		if(docName != null){
			docName = docName.replaceAll("/", "_");
		}
		String sql = "select 1 from reg_doc where doc_appl_id = " + applId + " and name = '" + docName
				+ "' and name not like '%ustutatu%';";
		try {
			ResultSet rs = PostgreUtils.query(sql);

			while (rs.next()) {
				return true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		String strToCheck = null;
		if (docName.contains("tsus")) {
			strToCheck = "tsus";
		} else {
			strToCheck = "iend";
		}
		String sql2 = "select 1 from reg_doc where doc_appl_id = " + applId + " and name like '%" + strToCheck
				+ "%'and name not like '%ustutatu%'";
		try {
			ResultSet rs = PostgreUtils.query(sql2);

			while (rs.next()) {
				return false;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return true;
	}

	public boolean isReportOK() {

		String id = null;
		String sql = "SELECT id FROM product_move_report ORDER BY id DESC LIMIT 1";

		try {
			ResultSet rs = PostgreUtils.query(sql);

			while (rs.next()) {
				id = rs.getString("id");
			}

			sql = "SELECT count(*) as cnt FROM product_move_report_record WHERE report_id = '" + id + "'";

			ResultSet rs2 = PostgreUtils.query(sql);

			while (rs2.next()) {
				return true;
			}
			PostgreUtils.delete("DELETE FROM product_move_report WHERE id = '" + id + "'");

			return false;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean getCanEditEnterprise() {

		Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
		if (currentUser instanceof AlkoUserDetails) {
			AlkoUserDetails currentAlkoUserDetails = (AlkoUserDetails) currentUser;
			String loggedUser = currentAlkoUserDetails.getIdCode();
			String regCode = currentAlkoUserDetails.getRegCode();

			String sql = "SELECT 1 FROM user_arireg WHERE id_code = '" + loggedUser + "' and reg_nr = '" + regCode
					+ "'";
			try {
				ResultSet rs = PostgreUtils.query(sql);

				while (rs.next()) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		return false;

	}
	
	
	public String[] getLoginBackURL() {
		
		String[] urls = new String[3];
		
		String sql = "SELECT * FROM config WHERE type = 'cas_urls'";
		try {
			ResultSet rs = PostgreUtils.query(sql);

			while (rs.next()) {
				switch(rs.getString("key")){
					case "CAS_LOGIN_URL": 
						urls[0] = rs.getString("value"); 
						break;
					case "CAS_BACK_URL": 
						urls[1] = rs.getString("value"); 
						break;
					case "CAS_LOGOUT_URL": 
						urls[2] = rs.getString("value"); 
						break;
					default: continue;
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			urls[1] = URLEncoder.encode(urls[1], java.nio.charset.StandardCharsets.UTF_8.toString());
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return urls;
		
	}
	

	public boolean saveConfigValue(String key, String value) {
		String changed_by = "";
		Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
		if (currentUser instanceof AlkoUserDetails) {
			AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
			changed_by = userDetails.getUsername();
		}

		PostgreUtils.insert("INSERT INTO config_history (key, previous_value, created_by)" + "SELECT key, value, '"
				+ changed_by + "' FROM config WHERE key = '" + key.replaceAll("'", "\"") + "';");

		String sql = "UPDATE config SET value='" + value.replaceAll("'", "\"") + "' WHERE key = '"
				+ key.replaceAll("'", "\"") + "';";

		return PostgreUtils.update(sql);
	}

	/*
	 * mode 1 = add mode 2 = edit mode 3 = delete
	 */
	public long saveDeleteConfirmation(String title, String note, String id, int mode) {
		String sql = "";
		switch (mode) {
		case 1:
				sql = "INSERT INTO delete_reason(title, note) VALUES ('" + title.replaceAll("'", "\"") + "', '"	+ note.replaceAll("'", "\"") + "')";
			return PostgreUtils.insert(sql, "id");
		case 2:
				sql = "UPDATE delete_reason set title='" + title.replaceAll("'", "\"") + "', note='" + note.replaceAll("'", "\"") + "' WHERE id = " + id + ";";
			if (PostgreUtils.update(sql)) {
				return Long.valueOf(id);
			}
			return 0;
		case 3:
			sql = "DELETE FROM delete_reason WHERE id = " + id + ";";
			if (PostgreUtils.delete(sql)) {
				return Long.valueOf(id);
			}
			return 0;
			default:
				return 0;
		}
	}

	public long deleteEnterpriseReference(String id) {
		String sql = "update enterprise_person_ref set valid=false, revoked=now() WHERE id = " + id + ";";
		if (PostgreUtils.delete(sql)) {
			return Long.valueOf(id);
		}
		return 0;
	}

	public long saveEnterpriseReference(String firstname, String lastName, String idCode, String occupation, String toDate, String regCode) {
		String sql = "";
		String loggedUser = "";

		PostgreUtils.update("UPDATE enterprise_person_ref set valid = false, revoked = now() WHERE id_code = '"
				+ idCode.replaceAll("'", "\"") + "' and enterprise_id = (SELECT id FROM enterprise where reg_id = '"
				+ regCode.replaceAll("'", "\"") + "' LIMIT 1) AND valid = true");

		Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
		if (currentUser instanceof AlkoUserDetails) {
			AlkoUserDetails currentAlkoUserDetails = (AlkoUserDetails) currentUser;
			loggedUser = currentAlkoUserDetails.getIdCode();

			if (loggedUser.equals(idCode)) {
				return -2; // iseennast ei saa volitada
			}

			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			try {
				String sqlDate = "NULL";

				if (toDate != null && !toDate.equals("")) {

					Date toDateFormatted = sdf.parse(toDate);
					toDateFormatted.setHours(23);
					toDateFormatted.setMinutes(59);
					toDateFormatted.setSeconds(59);

					if (toDateFormatted.before(new Date())) {
						return -1; // ei luba minevikku lisada
					}

					sqlDate = "'" + sdf2.format(toDateFormatted) + "'";

				}

				sql = "INSERT INTO enterprise_person_ref(id_code, enterprise_id, valid, created_by, valid_until, name, lastname, occupation) VALUES ('"
						+ idCode.replaceAll("'", "\"") + "', (SELECT id FROM enterprise where reg_id = '"
						+ regCode.replaceAll("'", "\"") + "' LIMIT 1), true,'" + loggedUser + "', " + sqlDate + ", '"
						+ firstname.replaceAll("'", "\"") + "', '"+lastName.replaceAll("'", "\"") + "', '"+occupation.replaceAll("'", "\"") + "' )";

				return PostgreUtils.insert(sql, "id");
			} catch (Exception ex) {
				ex.printStackTrace();
				return 0;
			}
		}
		return 0;

	}

	public HashMap<String, String> getConfigFromDatabase() {
		HashMap<String, String> map = new HashMap<String, String>();

		try {
			String sql = "SELECT key, value FROM config";
			ResultSet rs = PostgreUtils.query(sql);
			while (rs.next()) {
				map.put(rs.getString("key"), rs.getString("value"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return map;
	}

	public ArrayList<String[]> getAllDeleteConfirmations() {
		ArrayList<String[]> list = new ArrayList<String[]>();

		try {
			String sql = "SELECT * FROM delete_reason";
			ResultSet rs = PostgreUtils.query(sql);
			while (rs.next()) {
				String[] map = new String[3];
				map[0] = String.valueOf(rs.getLong("id"));
				map[1] = rs.getString("title");
				map[2] = rs.getString("note");
				list.add(map);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}

	public ArrayList<String[]> getAllConfigValues() {
		ArrayList<String[]> list = new ArrayList<String[]>();

		try {
			String sql = "SELECT * FROM config ORDER BY key ASC";
			ResultSet rs = PostgreUtils.query(sql);
			while (rs.next()) {
				String[] map = new String[3];
				map[0] = rs.getString("key");
				map[1] = rs.getString("value");
				map[2] = rs.getString("note");
				list.add(map);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}

	public ArrayList<String[]> getAllEnterpriseReferences(String regCode) {
		ArrayList<String[]> list = new ArrayList<String[]>();

		try {

			String sqlUp = "UPDATE enterprise_person_ref SET valid = false "
					+ " WHERE valid = true AND valid_until < now() AND valid_until IS NOT NULL"
					+ " AND enterprise_id = (SELECT id FROM enterprise where reg_id = '" + regCode.replaceAll("'", "\"")
					+ "' LIMIT 1)";

			PostgreUtils.update(sqlUp);

			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

			String sql = "SELECT * FROM enterprise_person_ref WHERE enterprise_id = (SELECT id FROM enterprise where reg_id = '"
					+ regCode.replaceAll("'", "\"")
					+ "' LIMIT 1) and (COALESCE(revoked, valid_until) >= now() - interval '3 month' or valid = true) "
					+ " ORDER BY valid DESC, revoked DESC, created DESC";
			ResultSet rs = PostgreUtils.query(sql);
			while (rs.next()) {
				Timestamp validUntil = rs.getTimestamp("valid_until");
				String vu = "";
				Timestamp created = rs.getTimestamp("created");
				String c = "";
				Timestamp revokedTime = rs.getTimestamp("revoked");
				String rt = "";

				if(validUntil != null && !validUntil.toString().equals("")) {
					vu = sdf.format(validUntil.getTime());
				}
				
				if(created != null && !created.toString().equals("")) {
					c = sdf.format(created.getTime());
				}
				
				if(revokedTime != null && !revokedTime.toString().equals("")) {
					rt = sdf.format(revokedTime.getTime());
				}

				String[] map = new String[9];
				map[0] = String.valueOf(rs.getLong("id"));
				map[1] = rs.getString("name") != null ? rs.getString("name") : "";
				map[2] = rs.getString("lastname") != null ? rs.getString("lastname") : "";
				map[3] = rs.getString("id_code");
				map[4] = rs.getString("occupation");
				map[5] = c;
				map[6] = vu;
				map[7] = (rs.getBoolean("valid") ? "1" : "0");
				map[8] = rt;
				list.add(map);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}

	public RegistryApplication saveApplicationDecision(final RegistryApplication appl) {

		try {
			return (RegistryApplication)getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					ApplicationState state = new ApplicationState();
					Decision decision = appl.getDecision();
					state.setCode(decision.getRegEntryDecision() != null ? decision.getRegEntryDecision().getCode() : null);
					appl.setState(state);
					decision.setDate(new Date());
					decision.setNr(nextDesicionNr(session));
					decision.setSigner(appl.getProcessor());

					// Create new RegistryEntry if decision was like that.
					if (IClassificatorService.REGENTRY_DECISION.equals(decision.getRegEntryDecision().getCode())) {
						RegistryEntry newEntry = null;
						if (appl.getRegistryEntry() == null) {
							newEntry = new RegistryEntry();
						} else {
							newEntry = appl.getRegistryEntry();
						}
						Date startDate = new Date();
						newEntry.setValidFrom(startDate);
						newEntry.setValidUntil(addYears(startDate, 5));
						newEntry.setNr(generateEntryNr(appl));
						appl.setRegistryEntry(newEntry);
					}
					
					try {
						/*
						 * Kahtlane häkk, lõpus garanteeritakse et andmed oleks
						 * õiged. Tuleb millalgi õige probleemikoht üles leida.
						 */
						Product product = appl.getProduct();
						product.setRegistryEntryApplication(appl);
						session.saveOrUpdate(product);

						createApplicationDocument(session, IClassificatorService.DOC_TYPE_DEC, appl, appl.getProcessor());
						if (appl.getDecision().getRegEntryDecision().getCode() != null && appl.getDecision()
								.getRegEntryDecision().getCode().equals(IClassificatorService.APPL_STATE_RGE)) {
							createApplicationDocument(session, IClassificatorService.DOC_TYPE_COR, appl, appl.getProcessor());
						} else {
							createApplicationDocument(session, IClassificatorService.DOC_TYPE_NDEC, appl, appl.getProcessor());
						}

						Transaction tx = session.getTransaction();
						if(!tx.isActive()) {
							tx.begin();
						}

						session.flush();
						tx.commit();
					} catch (IOException ioe) {
						throw new HibernateException(ioe);
					}
					// TODO õiend samuti.
					return appl;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	public RegistryApplication redoDocument(final RegistryApplication appl) {
		try {
			return (RegistryApplication) getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					try {
						createApplicationDocument(session, IClassificatorService.DOC_TYPE_DEC, appl, appl.getProcessor());
						if (appl.getDecision().getRegEntryDecision().getCode() != null && appl.getDecision()
								.getRegEntryDecision().getCode().equals(IClassificatorService.APPL_STATE_RGE)) {
							createApplicationDocument(session, IClassificatorService.DOC_TYPE_COR, appl, appl.getProcessor());
						} else {
							createApplicationDocument(session, IClassificatorService.DOC_TYPE_NDEC, appl, appl.getProcessor());
						}
					} catch (IOException ioe) {
						throw new HibernateException(ioe);
					}
					// TODO õiend samuti.
					return appl;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	/**
	 * Updates signer in database and creates documents with updated signer
	 */
	public RegistryApplication saveNewSigner(final RegistryApplication appl) {
		try {
			return (RegistryApplication) getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					Decision decision = appl.getDecision();
					Person signer = (Person) session.createQuery("from Person where id = ?0").setParameter(0, decision.getSigner().getId()).list().get(0);
					decision.setSigner(signer);

					session.saveOrUpdate(appl);
					session.saveOrUpdate(appl.getProduct());
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();

					return appl;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	/**
	 * Method for taking the application into reprocessing, deleting the
	 * associated decision and registry entry and setting the application state
	 * to processing
	 */
	public RegistryApplication reprocessApplication(final RegistryApplication application, final String reasonToDelete) {
		try {
			return (RegistryApplication) getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					Long applId = application.getId();
					Transaction tx = session.getTransaction();

					LOGGER.info("REPROCESS");
					try {
						LOGGER.info("Teeme päringu ja vaatame mis toimub");
						ResultSet rs = PostgreUtils.query("select 1 from reg_application where appl_state_class_id not in(400, 406, 408) and id = '" + applId + "';");
						if (rs.isBeforeFirst()) {
							LOGGER.info("ETTEVÕTTE ANDMEID EI MUUDETUD, IGAV");
						} else {

							/*
							 * Tulemust pole, updateme eelmise riigilõivu ära
							 */
							LOGGER.info("ETTEVÕTJA MUUTUS, KAKUME RIIGILÕIVU MAHA");
							ResultSet rs2 = PostgreUtils.query(
									"select enterprise_binded_to, amount, created from payment_matching_log where amount>0 and payment_application_id ='"
											+ applId + "' order by id desc limit 1;");
							while (rs2.next()) {
								int ent = rs2.getInteger("enterprise_binded_to");
								String amnt = String.valueOf(rs2.getDouble("amount"));

								String first = amnt.substring(0, 1);
								if (first == "-") {
									amnt = amnt.substring(1);
								}
								LOGGER.info("First " + first);
								LOGGER.info("Amnt " + amnt);
								// Siia kontroll, et kas on vaja maha
								// võtta
								// euro või kroon. kui on > 30...

								float eur = 15.6466f;

								float sum2 = Float.parseFloat(amnt);

								if (sum2 > 20) {
									// Kroonid!!!
									float jagatis = sum2 / eur;

									amnt = Float.toString(jagatis);
								}

								/*
								 * Kui taotlejal pole piisavalt raha, siis tuleb
								 * tagastada ex sisuga 666
								 */

								LOGGER.info("Teeme päringu ja vaatame mis toimub");
								Random randomGenerator = new Random();
								int randomInt = randomGenerator.nextInt(500);

								LOGGER.info("RL UPDATE, raha juurde " + amnt + " enterprise: " + ent);

								LOGGER.info("RL UPDATE");
								PostgreUtils.update("UPDATE enterprise SET balance = balance + '" + amnt + "' where id = '"	+ ent + "'");
								LOGGER.info("RL UPDATE");

								String query = "INSERT INTO payment_matching_log(id, created, created_by, amount, payment_application_id, enterprise_binded_to) VALUES ("
										+ applId + ent + randomInt + ent + ",CURRENT_TIMESTAMP,'sys', '-" + amnt + "', "
										+ applId + ", " + ent + ")";

								PostgreUtils.insert(query);
							}
							application.setLatestPayment("");
						}
					} catch (Exception e) {
						e.printStackTrace();
						String msg = e.getMessage();
						if (msg == "666") {
							throw new SystemException("666");
						}

					}

					/*
					 * Deletes the registry entry and sets its reference to null
					 * on the application
					 */
					if (application.getRegistryEntry() != null) {
						session.delete(application.getRegistryEntry());
						application.setRegistryEntry(null);
						session.saveOrUpdate(application);
						
						tx = session.getTransaction();
						if(!tx.isActive()) {
							tx.begin();
						}
						
						session.flush();
						tx.commit();
					}

					List<?> results = session.createQuery(
						"select s.id from RegistryDocument s where s.application.id = ?0 and (s.docType.code = ?1 or s.docType.code = ?2 or s.docType.code = ?3)")
						.setParameter(0, application.getId()).setParameter(1, "DEC").setParameter(2, "COR")
						.setParameter(3, "NDEC").list();
					for (int i = 0; i < results.size(); i++) {
						deleteDocumentWithReason((Long) results.get(i), reasonToDelete);

					}

					/* Sets the application state to processing */
					ApplicationState state = new ApplicationState();
					state.setCode("PRO");
					application.setState(state);

					/* Sets the decision object to null */
					application.setDecision(null);

					/* Saves the application with the changed state */
					session.saveOrUpdate(application);
					
					tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();

					return application;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

	}

	/**
	 * Selects first enterprise by registrationId in order of cell active
	 * property active-inactive-unknown
	 */
	public Boolean bindPaymentToEnterprise(final String registrationId, final Long paymentId) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					Enterprise enter = (Enterprise) session
							.createQuery(
									"from Enterprise e where e.registrationId = ?0 and e.active is not null order by  e.active desc")
							.setParameter(0, registrationId).list().get(0);
					RegistryPayment payment = (RegistryPayment) session
							.createQuery("from RegistryPayment r where r.id = ?0").setParameter(0, paymentId).list().get(0);
					doBindPaymentToEnterpise(session, enter, payment);
					return true;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return false;
	}

	public Boolean bindPaymentToEnterpriseById(final Long enterpriseId, final Long paymentId) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					Enterprise enterprise = session.load(Enterprise.class, enterpriseId);
					RegistryPayment payment = session.load(RegistryPayment.class, paymentId);
					doBindPaymentToEnterpise(session, enterprise, payment);
					return true;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return false;
	}

	public Boolean unbindPaymentFromEnterprise(final Long enterpriseId, final Long paymentId) {

		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					Enterprise enter = (Enterprise)session.createQuery("from Enterprise e where e.id = ?0")
							.setParameter(0, enterpriseId).list().get(0);
					RegistryPayment payment = (RegistryPayment)session.createQuery("from RegistryPayment r where r.id = ?0")
						.setParameter(0, paymentId).list().get(0);
					doUnbindPaymentToEnterpise(session, enter, payment);
					return true;
				}

			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		return false;
	}

	/**
	 * Unbinds payment from enterprise and substracts amount from enterprise's
	 * account
	 * 
	 * @param registryPayment
	 * @return
	 */
	@Transactional
	private void doUnbindPaymentToEnterpise(Session session, Enterprise enterprise, RegistryPayment payment) {

		// to avoid double action called by double click
		if (isPaymentBindedToEnterprise(enterprise, payment.getId())) {
			Transaction tx = session.getTransaction();
			if (!tx.isActive()) {
				tx.begin();
			}
			
			BigDecimal balance = enterprise.getBalance() != null ? enterprise.getBalance() : new BigDecimal(0);
			enterprise.setBalance(balance.subtract(payment.getAmount()));
			RegistryPaymentLog registryPaymentLog = createLogInstance(enterprise, payment.getAmount().negate());
			session.saveOrUpdate(enterprise);
			payment.setBoundEnterprise(null);
			session.saveOrUpdate(payment);
			session.saveOrUpdate(registryPaymentLog);
			
			session.flush();
			tx.commit();
		} else {
			LOGGER.info("Payment is not binded to enterprise");
		}
	}

	/**
	 * Checks whether enterprise is binded to payment
	 * 
	 * @param boundEnterprise
	 * @param paymentId
	 * @return true, if enterprise is binded to payment, false otherwise
	 */
	public Boolean isPaymentBindedToEnterprise(final Enterprise boundEnterprise, final Long paymentId) {
		try {
			return (Boolean) getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					return !session.createQuery("from RegistryPayment p where p. id = ?0 and p.boundEnterprise = ?1")
									.setParameter(0, paymentId).setParameter(1, boundEnterprise).list().isEmpty();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}
	
	public Boolean bindPaymentToEnterpise(final RegistryPayment payment) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					createPaymentForEnterpise(session, payment.getBoundEnterprise(), payment);
					return true;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return false;
	}
	
	@Transactional
	private void createPaymentForEnterpise(Session session, Enterprise enterprise, RegistryPayment payment) {

		Transaction tx = session.getTransaction();
		if(!tx.isActive()) {
			tx.begin();
		}
		
		BigDecimal balance = enterprise.getBalance() != null ? enterprise.getBalance() : new BigDecimal(0);
		enterprise.setBalance(balance.add(payment.getAmount()));
		RegistryPaymentLog registryPaymentLog = createLogInstance(enterprise, payment.getAmount());
		
		session.saveOrUpdate(enterprise);
		session.saveOrUpdate(registryPaymentLog);
		session.saveOrUpdate(payment);
		
		session.flush();
		tx.commit();
	}


	/**
	 * Binds payment to enterprise
	 * 
	 * @param session
	 * @param enterprise
	 * @param payment
	 */
	@Transactional
	private void doBindPaymentToEnterpise(Session session, Enterprise enterprise, RegistryPayment payment) {
		Transaction tx = session.getTransaction();
		if(!tx.isActive()) {
			tx.begin();
		}
		
		BigDecimal balance = enterprise.getBalance() != null ? enterprise.getBalance() : new BigDecimal(0);
		enterprise.setBalance(balance.add(payment.getAmount()));
		RegistryPaymentLog registryPaymentLog = createLogInstance(enterprise, payment.getAmount());
		session.saveOrUpdate(enterprise);
		payment.setBoundEnterprise(enterprise);
		session.saveOrUpdate(payment);
		session.saveOrUpdate(registryPaymentLog);
		
		session.flush();
		tx.commit();
	}

	public RegistryPaymentLog createLogInstance(Enterprise enterprise, BigDecimal amount) {
		RegistryPaymentLog registryPaymentLog = new RegistryPaymentLog();
		registryPaymentLog.setCreated(new Date());
		registryPaymentLog.setCreatedBy(AuthenticationServiceDelegate.getCurrentUserName());
		registryPaymentLog.setAmount(amount);
		registryPaymentLog.setBoundEnterprise(enterprise);
		registryPaymentLog.setEnterprisePreviousBalance(enterprise.getBalance()); // see on vale (ei kasutata nagunii)
		
		return registryPaymentLog;
	}

	public Enterprise saveOrUpdate(final Enterprise enterprise) throws ConstraintViolationException {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					saveOrUpdate(session, enterprise);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(enterprise.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return enterprise;
	}

	@SuppressWarnings("unchecked")
	private void saveOrUpdate(Session session, Enterprise enterprise) {
		if (enterprise == null)
			return;
		LOGGER.info("saveOrUpdate enterprise start, version " + enterprise.getVersion());

		if (enterprise.getId() != null) {
			List<ProductEnterpriseRole> roles = session.createQuery("from ProductEnterpriseRole r where r.enterprise.id = ?0")
					.setParameter(0, enterprise.getId()).list();

			Set<ProductEnterpriseRole> newRoles = new HashSet<ProductEnterpriseRole>();
			for (ProductEnterpriseRole role : enterprise.getEnterpriseRoles()) {
				ProductEnterpriseRole foundRole = null;
				for (ProductEnterpriseRole existingRole : roles) {
					if (role != null && role.getEnterpriseRoleClass() != null && 
							role.getEnterpriseRoleClass().getCode() != null && 
							role.getEnterpriseRoleClass().getCode().equals(existingRole.getEnterpriseRoleClass().getCode()))
						foundRole = existingRole;
				}
				if (foundRole != null) {
					newRoles.add(foundRole);
					roles.remove(foundRole);
				} else {
					newRoles.add(role);
				}
			}
			session.clear();
			
			for (ProductEnterpriseRole existingRole : roles) {

				session.delete(existingRole);
			}
			enterprise.setEnterpriseRoles(newRoles);
		}

		if (enterprise.getEnterpriseRepresentative() != null) {
			Person entRep = enterprise.getEnterpriseRepresentative();
			Person savedPerson = null;
			if (entRep.getRegistrationId() != null) {
				savedPerson = findPerson(session, entRep.getRegistrationId());
			}
			if (savedPerson != null) {
				savedPerson.setOccupation(entRep.getOccupation() == null ? "" : entRep.getOccupation());
				savedPerson.setFirstName(entRep.getFirstName() == null ? "" : entRep.getFirstName());
				savedPerson.setLastName(entRep.getLastName() == null ? "" : entRep.getLastName());
				enterprise.setEnterpriseRepresentative(null);
				LOGGER.info("APPLENTREP FROM ID 1");
			} else {
				enterprise.setEnterpriseRepresentative(null);
				LOGGER.info("APPLENTREP FROM ID 2");
			}
		}

		 session.saveOrUpdate(enterprise);
		
		Transaction tx = session.getTransaction();
		if(!tx.isActive()) {
			tx.begin();
		}
		
		session.flush();
		tx.commit();
		LOGGER.info("saveOrUpdate enterprise end, version " + enterprise.getVersion());
	}

	private Person findPerson(Session session, String registrationId) {
		Person person = null;
		try {
			person = (Person)session.createQuery("from Person p where p.registrationId = ?0").setParameter(0, registrationId).list().get(0);
		} catch (IndexOutOfBoundsException ie) {}

		return person;
	}
	
	private Person findPersonById(Session session, long id) {
		Person person = null;
		try {
			person = (Person) session.createQuery("from Person p where p.id = ?0").setParameter(0, id).list().get(0);
		} catch (IndexOutOfBoundsException ie) {}

		return person;
	}

	/**
	 * Save application and also applicant and product, if neccesary
	 */
	public RegistryApplication saveOrUpdate(final RegistryApplication application) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					LOGGER.debug("XXXXXXXXXXXXXXXXXXXXXXXXXX KAS SEE JUHTUSKI!?");
					if (application.getId() == null) {
						RegistryApplication savedAppl = null;
						if (application.getNr() != null) {
							savedAppl = findRegistryApplication(session, application.getNr());
							application.setId(savedAppl.getId());
						}
					}

					saveOrUpdate(session, application.getApplicant());
					Product product = application.getProduct();
					if (application.getType() != null && application.getType().getCode() != null
							&& application.getType().getCode().equals(IClassificatorService.APPL_TYPE_ARE)
							&& (product.getRegistryEntryApplication() == null)) {
						product.setRegistryEntryApplication(application);
						LOGGER.info("KOOD kopeeriti, toode:" + product.getId() + ", taotlus:" + application.getId());
					}
					if (application.getNr() != null) {
						Long savedProductId = findApplicationProductId(session, application.getNr());
						product.setId(savedProductId);
					}
					saveOrUpdate(session, product);
					Person savedPerson = null;
					if ((application.getProcessor() != null)
							&& (application.getProcessor().getRegistrationId() != null))
						savedPerson = findPerson(session, application.getProcessor().getRegistrationId());
					if (savedPerson != null)
						application.setProcessor(savedPerson);

					// kirjuta salvestatud kirjega üle, muidu hibernate hakkab karjuma
					LOGGER.info("APPLENTREP FROM ENTERPRISE 1");

					application.setEnterpriseRepresentative(null);
					session.saveOrUpdate(application);
					// if the application status was processing then we add a nr to the application
					if ((application.getNr() == null) && (application.getState() != null)
							&& (IClassificatorService.APPL_STATE_PRO.equals(application.getState().getCode())))
						application.setNr(nextApplicationNr(session));
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		LOGGER.debug("RegistryApplication-saveOrUpdate id:" + application.getId() + ", nr:" + application.getNr());
		return application;
	}

	/**
	 * Save application
	 */
	public RegistryApplication saveOrUpdateJustApplication(final RegistryApplication application) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					if (application.getId() == null) {
						RegistryApplication savedAppl = null;
						if (application.getNr() != null) {
							savedAppl = findRegistryApplication(session, application.getNr());
							application.setId(savedAppl.getId());
						}
					}

					Enterprise applicant = application.getApplicant();
					if (applicant != null) {
						applicant = findEnterprise(applicant.getId());
					}

					Person representative = getCurrentUser(session, false);
					if (representative != null) {
						LOGGER.info("APPLENTREP FROM USERDETAILS 1.3 v" + representative.getVersion());
						applicant.setEnterpriseRepresentative(null);
						LOGGER.info("APPLENTREP FROM USERDETAILS 1.4 v" + representative.getVersion());
					}

					application.setArrived(new Date());
					application.setApplicant(applicant);

					Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
					if (currentUser instanceof AlkoUserDetails) {
						AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
						
						String fName = (userDetails.getFirstName() != null ? userDetails.getFirstName() : "").trim();
						String lName = (userDetails.getLastName() != null ? userDetails.getLastName() : "").trim();
						String occp = (userDetails.getOccupation() != null ? userDetails.getOccupation() : "").trim();
						
						application.setSubmitterName(fName+" "+lName);
						application.setSubmitterRegId(userDetails.getIdCode());
						application.setSubmitterOccupation(occp);
					}
					
					session.saveOrUpdate(application);
					if ((application.getNr() == null) && (application.getState() != null)
							&& (IClassificatorService.APPL_STATE_PRO.equals(application.getState().getCode())))
						application.setNr(nextApplicationNr(session));
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		
		LOGGER.info("RegistryApplication-saveOrUpdateJustApplication id:" + application.getId() + ", nr:"
				+ application.getNr() != null ? application.getNr() : null);
		return application;
	}

	public boolean enterpriseChanged(Long taotlejaId, Long applId) {

		if (taotlejaId == 0 || applId == 0) {
			return false;
		}

		try {
			LOGGER.info("Teeme päringu ja vaatame mis toimub");
			ResultSet rs = PostgreUtils.query("select 1 from reg_application where appl_subj_id ='" + taotlejaId + "' and nr = '" + applId + "';");

			if (rs.isBeforeFirst()) {
				LOGGER.info("return false");
				return false;
			} else {
				LOGGER.info("return true");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info("return false");
			return false;
		}
	}

	public RegistryApplication saveOrUpdateApplication(final RegistryApplication application) { // XXX
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					if (application.getId() == null) {
						RegistryApplication savedAppl = null;
						if (application.getNr() != null) {
							savedAppl = findRegistryApplication(session, application.getNr());
							application.setId(savedAppl.getId());
						}
					}

					Person savedPerson = null;
					if ((application.getProcessor() != null)
							&& (application.getProcessor().getRegistrationId() != null))
						savedPerson = findPerson(session, application.getProcessor().getRegistrationId());
					if (savedPerson != null)
						application.setProcessor(savedPerson);

					// kes on kasutaja?
					boolean isEIT = false;
					Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
					if (currentUser instanceof AlkoUserDetails) {
						AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
						if ("EIT".equals(userDetails.getUsername())) {
							isEIT = true;
						}
					}

					savedPerson = null;
					if (isEIT) {
						// kui on EIT kasutaja
						savedPerson = findPerson(session, ((AlkoUserDetails) currentUser).getIdCode());
						LOGGER.info("APPLENTREP FROM USERDETAILS 2");
					} else if (application.getFromXTee() != null && application.getFromXTee()
							&& application.getApplicant() != null
							&& application.getApplicant().getEnterpriseRepresentative() != null
							&& application.getApplicant().getEnterpriseRepresentative().getRegistrationId() != null) {
						LOGGER.info("APPLENTREP FROM ENTERPRISE 2");
						// kui on sisekasutaja ja kui taotlus pole EIT kasutaja poolt sisestatud
						savedPerson = findPerson(session, application.getApplicant().getEnterpriseRepresentative().getRegistrationId());
					} // muul juhul entrep jääb muutmata

					if (savedPerson != null) {
						application.setEnterpriseRepresentative(null);
					}

					// set application for product, if neccesary
					Product product = application.getProduct(); // võetakse taotluse küljest toode
					LOGGER.info("PPRODUCT got, " + (product == null ? "is null" : ("appl_id: " + product.getRegistryEntryApplication())));
					if (application.getType() != null && application.getType().getCode() != null) {
						LOGGER.info("PPRODUCT olemas? " + (product != null));
						if (application.getType().getCode().equals(IClassificatorService.APPL_TYPE_ARE)
								&& product != null && product.getRegistryEntryApplication() == null) {
							product.setRegistryEntryApplication(application); // mingil tingimusel pannakse tootele taotlus külge
							LOGGER.info("PPRODUCT kopi, " + (product == null ? "is null" : ("appl_id: " + product.getRegistryEntryApplication())));
						}
					}
					
					LOGGER.info("SAVE!!!");
					if(application.getNr() != null) { // kui taotlusel on number olemas
						// leitaks taotluse numbri järgi toote id
						Long savedProductId = findApplicationProductId(session, application.getNr());
						
						LOGGER.info("PPRODUCT query, " + (product == null ? "is null" : ("appl_id: " + product.getRegistryEntryApplication())));
						product.setId(savedProductId); // leitud id käesolevale toote objektile id-ks
						
						/*
						 * Riigilõiv teistele tagasi kui on muutunud
						 */
						Enterprise taotleja = application.getApplicant();
						Long taotlejaId = taotleja.getId();
						Long applId = application.getId();

						try {
							LOGGER.info("Teeme päringu ja vaatame mis toimub");
							ResultSet rs = PostgreUtils.query("select 1 from reg_application where (appl_subj_id ='"
									+ taotlejaId + "' or appl_state_class_id not in(400, 406, 408, 403)) and id = '"
									+ applId + "';");

							if (rs.isBeforeFirst()) {
								LOGGER.info("ETTEVÕTTE ANDMEID EI MUUDETUD, IGAV");
							} else {
								/*
								 * Tulemust pole, updateme eelmise riigilõivu
								 * ära
								 */
								LOGGER.info("ETTEVÕTJA MUUTUS, KAKUME RIIGILÕIVU MAHA");

								ResultSet rs2 = PostgreUtils.query(
										"select enterprise_binded_to, amount, created from payment_matching_log where payment_application_id ='"
												+ applId + "' limit 1;");
								while (rs2.next()) {
									int ent = rs2.getInteger("enterprise_binded_to");
									String amnt = rs2.getString("amount");
									String first = amnt.substring(0, 1);
									if (first == "-") {
										amnt = amnt.substring(1);
									}
									LOGGER.info("First " + first);
									LOGGER.info("Amnt " + amnt);
									// Siia kontroll, et kas on vaja maha võtta
									// euro või kroon. kui on > 30...

									float eur = 15.6466f;

									float sum2 = Float.parseFloat(amnt);

									if (sum2 > 20) {
										// Kroonid!!!
										float jagatis = sum2 / eur;

										amnt = Float.toString(jagatis);
									}

									/*
									 * Kui taotlejal pole piisavalt raha, siis
									 * tuleb tagastada ex sisuga 666
									 */

									LOGGER.info("Teeme päringu ja vaatame mis toimub: " + taotlejaId);
									ResultSet rsRaha = PostgreUtils.query("select balance from enterprise where id ='" + taotlejaId + "'");
									while (rsRaha.next()) {
										Float raha = rsRaha.getFloat("balance");
										float papp = Float.parseFloat(amnt);

										if (raha < papp) {
											// EX
											throw new SystemException("666");

										}
									}

									Random randomGenerator = new Random();
									int randomInt = randomGenerator.nextInt(500);

									LOGGER.info("RL UPDATE, raha juurde " + amnt + " enterprise: " + ent);

									LOGGER.info("RL UPDATE");
									PostgreUtils.update("UPDATE enterprise SET balance = balance + '" + amnt + "' where id = '" + ent + "'");
									LOGGER.info("RL UPDATE");

									PostgreUtils.update("UPDATE enterprise SET balance = balance - '" + amnt
											+ "' where id = '" + taotlejaId + "'");
									String query = "INSERT INTO payment_matching_log(id, created, created_by, amount, payment_application_id, enterprise_binded_to) VALUES ("
											+ applId + ent + randomInt + ent + ",CURRENT_TIMESTAMP,'sys', '-" + amnt
											+ "', " + applId + ", " + ent + ")";
									PostgreUtils.insert(query);

									randomInt = randomGenerator.nextInt(500);

									String query2 = "INSERT INTO payment_matching_log(id, created, created_by, amount, payment_application_id, enterprise_binded_to) VALUES ("
											+ applId + ent + randomInt + ent + ",CURRENT_TIMESTAMP,'sys', '" + amnt
											+ "', " + applId + ", " + taotlejaId + ")";
									PostgreUtils.insert(query2);
								}
								
								application.setLatestPayment("");
							}
							
						} catch (Exception e) {
							e.printStackTrace();
							String msg = e.getMessage();
							if (msg == "666") {
								throw new SystemException("666");
							}
						}

						LOGGER.info("PPRODUCT savedProductId=" + savedProductId.toString());
						}

					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.saveOrUpdate(product);
					session.saveOrUpdate(application);
					tx.commit();
					
					LOGGER.info("PPRODUCT saved, " + (product == null ? "is null" : ("appl_id: " + product.getRegistryEntryApplication())));
					if (product != null) {
						Long id = product.getId(); // talletatakse toote id
						LOGGER.info("PPRODUCT evict1, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));
						session.evict(product); // kustutatakse toode sessioonist
						product = findProduct(id); // otsitakse uuesti välja
						LOGGER.info("PPRODUCT evict2, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));

						if (application.getType() != null && application.getType().getCode() != null) {
							LOGGER.info("PPRODUCT evicted olemas? " + (product != null));
							if (application.getType().getCode().equals(IClassificatorService.APPL_TYPE_ARE)
									&& product != null && product.getRegistryEntryApplication() == null) {
								//mingil tingimusel pannakse tootele taotlus külge
								product.setRegistryEntryApplication(application);
								LOGGER.info("PPRODUCT evicted kopi, " + (product == null ? "is null"
										: ("appl_id: " + product.getRegistryEntryApplication())));
							}
						}

						LOGGER.info("PPRODUCT evicted, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));

						application.setProduct(product); //pannakse toode taotluse külge
					}

					// Save application
					if (application.getProductExamples() != null) {
						if (application.getExamplRecievedBy() == null
								&& application.getProductExamples().getReceptionDate() != null) {
							application.setExamplRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
						}
						if (application.getExamplReturnedBy() == null
								&& application.getProductExamples().getReturnDate() != null) {
							application.setExamplReturnedBy(AuthenticationServiceDelegate.getCurrentUserName());
							application.setExamplReturned(application.getProductExamples().getReturnDate());
						}
					}
					if (application.getId() == null && application.getRecievedBy() == null) {
						application.setRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
					}
					if ((application.getNr() == null) && (application.getState() != null)
							&& (IClassificatorService.APPL_STATE_PRO.equals(application.getState().getCode()))) {
						application.setRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
						application.setNr(nextApplicationNr(session));
					}
					session.saveOrUpdate(application);

					tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					// if the application status was processing then we add a nr to the application
					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return application;
	}

	public RegistryApplication saveOrUpdateApplicationA(final RegistryApplication application) { // XXX
		try { // ApplicationNoteForm(ka väliskasutaja) salvestamine ja enamus
				// teised tegevused ApplicationFormil!
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					if (application.getId() == null) {
						RegistryApplication savedAppl = null;
						if (application.getNr() != null) {
							savedAppl = findRegistryApplication(session, application.getNr());
							application.setId(savedAppl.getId());
						}
					}

					Person savedPerson = null;
					if ((application.getProcessor() != null)
							&& (application.getProcessor().getRegistrationId() != null))
						savedPerson = findPerson(session, application.getProcessor().getRegistrationId());
					if (savedPerson != null)
						application.setProcessor(savedPerson);

					// kes on kasutaja?
					boolean isEIT = false;
					Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
					if (currentUser instanceof AlkoUserDetails) {
						AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
						if ("EIT".equals(userDetails.getUsername())) {
							isEIT = true;
						}
					}

					savedPerson = null;
					if (isEIT) {
						// kui on EIT kasutaja
						savedPerson = findPerson(session, ((AlkoUserDetails) currentUser).getIdCode());
						LOGGER.info("APPLENTREP FROM USERDETAILS 2");
					} else if (application.getFromXTee() != null && application.getFromXTee()
							&& application.getApplicant() != null
							&& application.getApplicant().getEnterpriseRepresentative() != null
							&& application.getApplicant().getEnterpriseRepresentative().getRegistrationId() != null) {
						LOGGER.info("APPLENTREP FROM ENTERPRISE 2");
						// kui on sisekasutaja ja kui taotlus pole EIT kasutaja poolt sisestatud
						savedPerson = findPerson(session, application.getApplicant().getEnterpriseRepresentative().getRegistrationId());
					} // muul juhul entrep jääb muutmata

					if (savedPerson != null) {
						application.setEnterpriseRepresentative(null);
					}

					// set application for product, if neccesary
					//võetakse taotluse küljest toode
					Product product = application.getProduct();
					LOGGER.info("PPRODUCT got, "
							+ (product == null ? "is null" : ("appl_id: " + product.getRegistryEntryApplication())));
					if (application.getType() != null && application.getType().getCode() != null) {
						LOGGER.info("PPRODUCT olemas? " + (product != null));
						if (application.getType().getCode().equals(IClassificatorService.APPL_TYPE_ARE)
								&& product != null && product.getRegistryEntryApplication() == null) {
							//mingil tingimusel pannakse tootele taotlus külge
							product.setRegistryEntryApplication(application);
							LOGGER.info("PPRODUCT kopi, " + (product == null ? "is null"
									: ("appl_id: " + product.getRegistryEntryApplication())));
						}
					}
					LOGGER.info("Save andmin");
					if(application.getNr() != null) { // kui taotlusel on number olemas
						//leitaks taotluse numbri järgi toote id
						Long savedProductId = findApplicationProductId(session, application.getNr());
						LOGGER.info("PPRODUCT query, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));
						
						//leitud id käesolevale toote objektile id-ks
						product.setId(savedProductId);
						
						/*
						 * Riigilõiv teistele tagasi kui on muutunud
						 */
						Enterprise taotleja = application.getApplicant();
						Long taotlejaId = taotleja.getId();
						Long applId = application.getId();

						try {
							LOGGER.info("Teeme päringu ja vaatame mis toimub");
							ResultSet rs = PostgreUtils.query("select 1 from reg_application where appl_subj_id ='"
									+ taotlejaId + "' and id = '" + applId + "';");

							if (rs.isBeforeFirst()) {
								LOGGER.info("ETTEVÕTTE ANDMEID EI MUUDETUD, IGAV");
							} else {
								/*
								 * Tulemust pole, updateme eelmise riigilõivu
								 * ära
								 */
								LOGGER.info("ETTEVÕTJA MUUTUS, KAKUME RIIGILÕIVU MAHA");
								ResultSet rs2 = PostgreUtils.query(
										"select enterprise_binded_to, amount, created from payment_matching_log where payment_application_id ='"
												+ applId + "' limit 1;");
								while (rs2.next()) {
									int ent = rs2.getInteger("enterprise_binded_to");
									String amnt = rs2.getString("amount");
									String first = amnt.substring(0, 1);
									if (first == "-") {
										amnt = amnt.substring(1);
									}
									LOGGER.info("First " + first);
									LOGGER.info("Amnt " + amnt);
									// Siia kontroll, et kas on vaja maha võtta
									// euro või kroon. kui on > 30...

									float eur = 15.6466f;

									float sum2 = Float.parseFloat(amnt);

									if (sum2 > 20) {
										// Kroonid!!!
										float jagatis = sum2 / eur;
										amnt = Float.toString(jagatis);
									}

									Random randomGenerator = new Random();
									int randomInt = randomGenerator.nextInt(500);

									LOGGER.info("RL UPDATE, raha juurde " + amnt + " enterprise: " + ent);

									LOGGER.info("RL UPDATE");
									PostgreUtils.update("UPDATE enterprise SET balance = balance + '" + amnt + "' where id = '" + ent + "'");
									LOGGER.info("RL UPDATE");
									PostgreUtils.update("UPDATE enterprise SET balance = balance - '" + amnt
											+ "' where id = '" + taotlejaId + "'");
									String query = "INSERT INTO payment_matching_log(id, created, created_by, amount, payment_application_id, enterprise_binded_to) VALUES ("
											+ applId + ent + randomInt + ent + ",CURRENT_TIMESTAMP,'sys', '-" + amnt
											+ "', " + applId + ", " + ent + ")";
									PostgreUtils.insert(query);

									randomInt = randomGenerator.nextInt(500);

									String query2 = "INSERT INTO payment_matching_log(id, created, created_by, amount, payment_application_id, enterprise_binded_to) VALUES ("
											+ applId + ent + randomInt + ent + ",CURRENT_TIMESTAMP,'sys', '" + amnt
											+ "', " + applId + ", " + taotlejaId + ")";
									PostgreUtils.insert(query2);
								}
								
								application.setLatestPayment("");
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}

						LOGGER.info("PPRODUCT savedProductId=" + savedProductId.toString());
					}
					session.saveOrUpdate(product); // salvestatakse toode
					LOGGER.info("PPRODUCT saved, "
							+ (product == null ? "is null" : ("appl_id: " + product.getRegistryEntryApplication())));
					if (product != null) {
						Long id = product.getId(); // talletatakse toote id
						LOGGER.info("PPRODUCT evict1, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));
						session.evict(product); // kustutatakse toode sessioonist
						product = findProduct(id); // otsitakse uuesti välja
						LOGGER.info("PPRODUCT evict2, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));

						if (application.getType() != null && application.getType().getCode() != null) {
							LOGGER.info("PPRODUCT evicted olemas? " + (product != null));
							if (application.getType().getCode().equals(IClassificatorService.APPL_TYPE_ARE)
									&& product != null && product.getRegistryEntryApplication() == null) {
								//mingil tingimusel pannakse tootele taotlus külge
								product.setRegistryEntryApplication(application);
								LOGGER.info("PPRODUCT evicted kopi, " + (product == null ? "is null"
										: ("appl_id: " + product.getRegistryEntryApplication())));
							}
						}

						LOGGER.info("PPRODUCT evicted, " + (product == null ? "is null"
								: ("appl_id: " + product.getRegistryEntryApplication())));
						application.setProduct(product); //pannakse toode taotluse külge
					}

					// Save application
					if (application.getProductExamples() != null) {
						if (application.getExamplRecievedBy() == null
								&& application.getProductExamples().getReceptionDate() != null) {
							application.setExamplRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
						}
						if (application.getExamplReturnedBy() == null
								&& application.getProductExamples().getReturnDate() != null) {
							application.setExamplReturnedBy(AuthenticationServiceDelegate.getCurrentUserName());
							application.setExamplReturned(application.getProductExamples().getReturnDate());
						}
					}
					if (application.getId() == null && application.getRecievedBy() == null) {
						application.setRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
					}
					if ((application.getNr() == null) && (application.getState() != null)
							&& (IClassificatorService.APPL_STATE_PRO.equals(application.getState().getCode()))) {
						application.setRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
						application.setNr(nextApplicationNr(session));
					}
					session.saveOrUpdate(application);
					// if the application status was processing then we add a nr to the application
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();

					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return application;
	}

	@Transactional
	public RegistryApplication saveOrUpdateEITApplication(final RegistryApplication application) // XXX EIT kasutaja SAVE
	{
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					application.setEnterpriseRepresentative(null);

					if (application.getId() == null) {
						RegistryApplication savedAppl = null;
						if (application.getNr() != null) {
							savedAppl = findRegistryApplication(session, application.getNr());
							application.setId(savedAppl.getId());
						}
					}

					Person savedPerson = null;
					if((application.getProcessor() != null)	&& (application.getProcessor().getRegistrationId() != null))
						savedPerson = findPerson(session, application.getProcessor().getRegistrationId());
					if (savedPerson != null)
						application.setProcessor(savedPerson);

					session.saveOrUpdate(application);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (Exception e) {
			// e.printStackTrace();
			throw new SystemException(e);
		}
		return application;
	}

	public Person createOrUpdateRepresentative(Person representative, String firstName, String lastName, String idCode,
			String occupation) {
		if (representative == null) {
			Person newRepresentative = new Person();
			newRepresentative.setFirstName(firstName == null ? "" : firstName);
			newRepresentative.setLastName(lastName == null ? "" : lastName);
			newRepresentative.setRegistrationId(idCode == null ? "" : idCode);
			newRepresentative.setOccupation(occupation == null ? "" : occupation);
			// LOGGER.debug("new - " + newRepresentative);
			return newRepresentative;
		} else {
			representative.setFirstName(firstName == null ? "" : firstName);
			representative.setLastName(lastName == null ? "" : lastName);
			representative.setOccupation(occupation == null ? "" : occupation);
			// LOGGER.debug("update - " + representative);
			return representative;
		}
	}

	public boolean checkCanExtendByProduct(long id) {
		long applId = 0l;
		try{
			ResultSet rs = PostgreUtils.query("SELECT appl_id FROM product WHERE id = "+id);
			while(rs.next()){
				applId = rs.getLong("appl_id");
			}
		} catch(Exception x){
			x.printStackTrace();
		}

		return checkCanExtend(applId);
	}
	
	public boolean checkCanExtend(long id) {
		boolean isEIT = false;
		String number = "";
		
		Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
		if (currentUser instanceof AlkoUserDetails) {
			AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
			if ("EIT".equals(userDetails.getUsername())) {
				isEIT = true;
			}
		}
		
		try{
			String sql = "SELECT nr FROM reg_application WHERE id = "+id;
			ResultSet rl = PostgreUtils.query(sql);
			while (rl.next()) {
				number = rl.getString("nr");
			}
		} catch(Exception x){
			x.printStackTrace();
		}
		
		try {
			checkCanExtend(number, isEIT);
		} catch (Exception ex) {
			throw new SystemException(ex);
		}
		return true;
	}
	
	public void checkCanExtend(String number, boolean isEIT) {
		try{
			int daysFrom = 24;
			int daysTo = 60;
			
			System.out.println("Pikendamise kontrolli taotluse nr: "+number);
			
			if(isEIT){
				daysFrom = 24;
			}
			else{
				daysFrom = 1;
				
				try {
					ResultSet rs2 = PostgreUtils
							.query("SELECT value FROM config WHERE key = 'APPL_SAVE_EXTEND_DAYS'");
					if (rs2.next()) {
						daysFrom = Integer.valueOf(rs2.getString("value"));
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			
			String sql = "select * from reg_entry where valid_until::date not between (now() + interval '"+ daysFrom +"' day)::date and (now() + interval '"+ daysTo+"' day)::date"
					+ " and id = (select regentry_id from reg_application where nr = '" + number + "');";
			ResultSet rl = PostgreUtils.query(sql);
			if (rl.next()) {
				throw new SystemException("Enam ei saa pikendada: registrikande otsuse lõppkuupäev pole vajalikus vahemikus ("+ daysFrom +"-"+ daysTo +" päeva) ");
			}
			
			
			if(number.contains("/")){ // kui on pikendamise taotlus, siis võtame tal "/P" tagant ära
				number = number.substring(0, number.indexOf('/'));
			}
			
			String sql2 = "select 1 from reg_application where nr like '" + number + "/%' and decision_date is null";
			ResultSet rl2 = PostgreUtils.query(sql2);
			if(rl2.next()){
				throw new SystemException("Enam ei saa pikendada: pikendamise taotlus on juba esitatud ");
			}
		} catch(Exception x){
			x.printStackTrace();
			throw new SystemException(x);
		}
	}

	public RegistryApplication saveNewExtendApplication( //XXX pikendamise taotluse salvestamine
			final RegistryApplication application) { //nii sise- kui väliskasutaja
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					boolean isEIT = false;
					Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
					//väliskasutaja puhul pannakse taotlusele tema andmed külge
					if(currentUser instanceof AlkoUserDetails) {
						AlkoUserDetails userDetails = (AlkoUserDetails) currentUser;
						if ("EIT".equals(userDetails.getUsername())) {
							LOGGER.info("APPLENTREP FROM USERDETAILS 4");
							application.setEnterpriseRepresentative(null);
							isEIT = true;
						}
					}
					/*
					 * Piksel arendus
					 * 
					 * @author Martin vt bug 3196
					 */
					String oldNumber = application.getNr() != null ? application.getNr() : application.getProduct().getRegistryEntryApplication().getNr();
					try {
						checkCanExtend(oldNumber, isEIT);
					} catch (Exception ex) {
						throw new SystemException(ex);
					}

					long prod = (application.getProduct().getId() != null ? application.getProduct().getId() : 0l);
					LOGGER.info("--- application.getProduct().getId(): "+prod);
					if(prod == 0l){
						try{
							ResultSet rs = PostgreUtils.query("SELECT product_id FROM reg_application WHERE nr = '"+oldNumber+"'");
							while(rs.next()){
								prod = rs.getLong("product_id");
							}
						}catch (Exception e) {
							e.printStackTrace();
						}
						LOGGER.info("--- product_id FROM reg_application: "+prod);
					}
					
					if(prod == 0l){
						try{
							ResultSet rs = PostgreUtils.query("SELECT id FROM product WHERE appl_id = "+application.getId());
							while(rs.next()){
								prod = rs.getLong("id");
							}
						}catch (Exception e) {
							e.printStackTrace();
						}
						LOGGER.info("--- id FROM product: "+prod);
					}

					int nextNr = 1; // vaikimisi kohe esimene pikendamine
					LOGGER.info("product ID " + Long.toString(prod)+" , oldNumber: "+oldNumber+", appl_id: "+application.getId());
					ResultSet rs = PostgreUtils.query("SELECT CAST(REPLACE(nr, '" + oldNumber + "/P', '') AS INT) AS nr FROM reg_application WHERE nr LIKE '" + oldNumber + "/P%' ORDER BY CAST(REPLACE(nr, '" + oldNumber + "/P', '') AS INT) DESC LIMIT 1");
					if(rs.next()){ // kui leidus pikendamisi, siis võtame kõige hiliseima pikendamise numbri ja liidame +1
						nextNr = rs.getInteger("nr");
						LOGGER.info("leitud suurim pikendamise nr " + nextNr + ", liidame +1");
						nextNr = nextNr + 1;
					}
					
					String[] jupid = oldNumber.split("/");
					application.setNr(jupid[0] + "/P" + Integer.toString(nextNr));
					LOGGER.info("PXL newNr firstExtension"+ oldNumber);
					if(application.getRecievedBy() == null) {
						application.setRecievedBy(AuthenticationServiceDelegate.getCurrentUserName());
					}
					
					session.saveOrUpdate(application.getProduct());
					session.saveOrUpdate(application);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();

					return null;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		LOGGER.info("RegistryApplication-saveNewExtendApplication id:" + application.getId() + ", nr:"	+ application.getNr());
		LOGGER.info("RegisrtyApplication save successful");

		return application;
	}

	public Product saveOrUpdate(final Product product) throws ConstraintViolationException {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					saveOrUpdate(session, product);
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(product.toString());
		} catch(Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return product;
	}

	public Product saveOrUpdateWithProducerAddressRefresh(final Product product) throws ConstraintViolationException {

		Enterprise baseProducer = null;
		if (product.getProducer() != null)
			baseProducer = findEnterprise(product.getProducer().getId());

		product.getProducer().setAddress(baseProducer.getAddress());

		return saveOrUpdateProduct(product);
	}

	public Product saveOrUpdateProduct(final Product product) throws ConstraintViolationException {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					session.saveOrUpdate(product);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					System.out.println(tx.isActive());
					session.flush();
					tx.commit();
					
					return product;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(product.toString());
		} catch(Exception e) {
			LOGGER.info("PRODUCT WASN'T updated");
			e.printStackTrace();
			throw new SystemException(e);
		}
		LOGGER.info("PRODUCT WAS updated");
		LOGGER.info(product.toString());
		return product;
	}

	@Transactional
	public Product excludeProductFromregistry(final Product product) throws ConstraintViolationException {

		final RegistryApplication application = product.getRegistryEntryApplication();
		final RegistryEntry entry = product.getRegistryEntryApplication().getRegistryEntry();
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					session.saveOrUpdate(application);
					session.saveOrUpdate(entry);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(product.toString());
		} catch(Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return product;
	}

	private void saveOrUpdate(Session session, Product product) {
		saveOrUpdate(session, product.getImporter());
		saveOrUpdate(session, product.getMarketer());
		saveOrUpdate(session, product.getProducer());
		
		if (product.getId() != null) {
			session.saveOrUpdate(product);
		} else {
			session.save(product);
		}
	}

	public News saveOrUpdate(final News news) throws ConstraintViolationException {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					if (news.getId() != null) {
						session.saveOrUpdate(news);
					} else {
						session.save(news);
					}
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(news.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return news;
	}

	public Faq saveOrUpdate(final Faq faq) throws ConstraintViolationException {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					if (faq.getId() != null) {
						session.saveOrUpdate(faq);
					} else {
						session.save(faq);
					}
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(faq.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return faq;
	}

	public Enterprise getEnterprise(final Long enterpriseId) {
		try {
			return (Enterprise)getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					Enterprise enterprise = session.load(Enterprise.class, enterpriseId);
					Hibernate.initialize(enterprise.getEnterpriseRoles());
					return enterprise;
				}
			});
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public void deleteSubject(Long id) {
		super.delete(Enterprise.class, id);
	}

	public boolean deleteProduct(final Long id) {
		List<RegistryApplication> applications = getHibernateTemplate().execute(new HibernateCallback<List<RegistryApplication>>() {
			@SuppressWarnings("unchecked")
			public List<RegistryApplication> doInHibernate(Session session) {
				return session.createQuery("from RegistryApplication a where a.product.id = ?0").setParameter(0, id).list();
					}
		});

		if(applications.isEmpty()) {
			super.delete(Product.class, id);
		} else {
			return false;
		}

		return true;
	}

	public Long addDocument(final byte[] bytes, final String docType, final String docLangCode,
			final String applicationNr, final Long applId, final String docName, final String fileName,
			final String contentType, final boolean mayRepeat, final String isPublic) throws ConstraintViolationException {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("addDocument: docType=" + docType + " docLangCode=" + docLangCode + " applicationNr="
					+ applicationNr + " applId=" + applId + " docName=" + docName + " fileName=" + fileName);

		try {
			return (Long)getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					RegistryApplication application = null;
					if (applicationNr != null) {
						application = findApplication(session, applicationNr);
					} else if (applId != null) {
						application = findRegistryApplicationById(session, applId);
					}

					return saveDocument(session, bytes, contentType, docType, docLangCode, docName, fileName, application, mayRepeat, isPublic);
					}
			});

		} catch (DataIntegrityViolationException cve) {
			LOGGER.error(cve, cve);
			throw new ConstraintViolationException(cve.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	public byte[] createApplicationDocument(String docTypeCode, String applicationNr, String signerUserName) {
		RegistryApplication application = getHibernateTemplate().execute(new HibernateCallback<RegistryApplication>() {
			public RegistryApplication doInHibernate(Session session) {
				return (RegistryApplication)session.createQuery("from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).list().get(0);
			}
		});
		List<RegistryDocument> documents = findProductDocuments(application.getProduct().getId());
		File file = getPdfCreator().create(docTypeCode, application, null, documents);
		byte[] content = null;
		try {
			content = readFile(file.getPath());
			file.delete();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			throw new SystemException(ioe);
		}
		return content;
	}

	public void createExcelExportDocument(SearchFilter searchFilter, OutputStream output) {
		SearchFilter results = null;
		if (searchFilter.isLimited()) {
			results = searchApplications(searchFilter);
		} else {
			results = search(searchFilter);
		}
		ExcelCreator.createExcelFile(results, output);

	}

	public void deleteDocument(final Long documentId) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					RegistryDocument doc = (RegistryDocument) session
						.createQuery("from RegistryDocument d where d.id = ?0").setParameter(0, documentId.longValue())
							.list().get(0);

					finalDeleteDocument(doc.getId(), null);
					
					return null;
				}
			});

		} catch (Exception e) {
			throw new SystemException(e);
		}

	}

	public void deleteDocumentWithReason(final Long documentId, final String text) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					String sql2 = "select doc_appl_id, name from reg_doc where coalesce(archived, 0) = 0 and id = "	+ documentId;
					String docName = "";

					long applId = 0;

					try {
						ResultSet rl = PostgreUtils.query(sql2);
						while (rl.next()) {
							applId = rl.getLong("doc_appl_id");
							docName = rl.getString("name");
						}
					} catch (Exception e) {
						throw new SystemException(e);
					}

					String qry = null;

					if (docName.equals("")) {
						qry = "select id from reg_doc where coalesce(archived, 0) = 0 and id = " + documentId;
					} else {
						qry = "select id from reg_doc where coalesce(archived, 0) = 0 and name like '" + docName + "%' and doc_appl_id = " + applId;
					}

					try {

						ResultSet res = PostgreUtils.query(qry);

						while (res.next()) {
							finalDeleteDocument(res.getLong("id"), text);
						}
					} catch (Exception ex) {
						throw new SystemException(ex);
					}

					return null;
				}
			});

		} catch (Exception e) {
			throw new SystemException(e);
		}

	}

	public String rename(String path) {
		File file1 = new File(path);
		String[] splitted = path.split("\\.");
		String laiend = splitted[splitted.length - 1];
		String newLaiend = "_bak." + laiend;
		String build = "";

		for (int i = 0; i < splitted.length - 1; i++) {
			build = build + "." + splitted[i];
		}
		build = build + newLaiend;
		File file2 = new File(build.substring(1));

		file1.renameTo(file2);
		String newPath = build;

		return newPath.substring(1);
	}
	
	private void finalDeleteDocument(Long documentId, String reason) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					RegistryDocument doc = (RegistryDocument) session
							.createQuery("from RegistryDocument d where d.id = ?0")
							.setParameter(0, documentId).list().get(0);
					
					if(doc == null || doc.getId() == null) {
						return null;
					}
					
					doc.setArchived((short) 1);
					doc.setPub((short) 0);
					doc.setPath(rename(doc.getPath()));
					doc.setName(doc.getName() + " Kustutatud");
					doc.setCreated(new java.util.Date());
					doc.setDocType(null);
					if(reason != null) {
						doc.setReason(reason);
					}
					
					session.save(doc);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});

		} catch (Exception e) {
			throw new SystemException(e);
		}

	}

	public void deleteDocument(final String applicationNr, final String name) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					RegistryDocument doc = (RegistryDocument) session
							.createQuery("from RegistryDocument d where d.application.nr = ?0 and d.name = ?1")
							.setParameter(0, applicationNr).setParameter(1, name).list().get(0);
					
					finalDeleteDocument(doc.getId(), null);
					
					return null;
				}
			});

		} catch (Exception e) {
			throw new SystemException(e);
		}

	}

	public void deleteDocument(final Long applicationId, final String name) {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					RegistryDocument doc = (RegistryDocument) session
							.createQuery("from RegistryDocument d where d.application.id = ?0 and d.name = ?1")
							.setParameter(0, applicationId.longValue()).setParameter(1, name).list().get(0);
					
					finalDeleteDocument(doc.getId(), null);
					
					return null;
				}
			});

		} catch (Exception e) {
			throw new SystemException(e);
		}

	}

	public String deleteEnterprise(Long subjectId) {
		try {
			super.delete(Enterprise.class, subjectId);
			return "success";
		} catch (SystemException e) {

			return "ConstraintViolationException";
		}
	}

	public void deleteFaq(Long faqId) {
		super.delete(Faq.class, faqId);
	}

	public void deleteNews(Long newsId) {
		super.delete(News.class, newsId);
	}

	public List<RegistryDocument> findProductDocuments(final Long productId) {
		return findProductDocuments(productId, false);
	}

	public List<RegistryDocument> findProductDocumentsPublic(final Long productId) {
		return findProductDocumentsPublic(productId, false);
	}

	public List<RegistryDocument> findProductDocumentsArchived(final Long productId) {
		return findProductDocumentsArchived(productId, false);
	}

	private List<RegistryDocument> findProductDocuments(final Long productId, final boolean asUser) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					@SuppressWarnings("unchecked")
					List<Long> appIds = session.createQuery("select a.id from RegistryApplication a where a.product.id = ?0  order by a.nr")
						.setParameter(0, productId).list();
					List<RegistryDocument> docsList = new ArrayList<RegistryDocument>();
					for (Long applicationId : appIds) {
						List<RegistryDocument> docs = asUser ? findApplicationDocumentsFromUser(session, applicationId)
								: findApplicationDocuments(session, applicationId);
						if(docs != null && !docs.isEmpty())
							docsList.addAll(docs);
					}
					return docsList;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	private synchronized List<RegistryDocument> findProductDocumentsPublic(final Long productId, final boolean asUser) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					@SuppressWarnings("unchecked")
					List<Long> appIds = session.createQuery("select a.id from RegistryApplication a where a.product.id = ?0 order by a.nr")
						.setParameter(0, productId).list();
					List<RegistryDocument> docsList = new ArrayList<RegistryDocument>();
					for (Long applicationId : appIds) {
						List<RegistryDocument> docs = asUser ? findApplicationDocumentsFromUser(session, applicationId)
								: findApplicationDocumentsPublic(session, applicationId);
						if(docs != null && !docs.isEmpty())
							docsList.addAll(docs);
					}
					return docsList;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	private List<RegistryDocument> findProductDocumentsArchived(final Long productId, final boolean asUser) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					@SuppressWarnings("unchecked")
					List<Long> appIds = session.createQuery("select a.id from RegistryApplication a where a.product.id = ?0 order by a.nr")
						.setParameter(0, productId).list();
					List<RegistryDocument> docsList = new ArrayList<RegistryDocument>();
					for (Long applicationId : appIds) {
						List<RegistryDocument> docs = asUser ? findApplicationDocumentsFromUser(session, applicationId)
								: findApplicationDocumentsArchived(session, applicationId);
						if (docs != null && !docs.isEmpty())
							docsList.addAll(docs);
					}
					return docsList;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public RegistryEntry findRegistryEntry(String entryNr) {
		List<RegistryEntry> tulem = getHibernateTemplate().execute(new HibernateCallback<List<RegistryEntry>>() {
			@SuppressWarnings("unchecked")
			public List<RegistryEntry> doInHibernate(Session session) {
				return session.createQuery("from RegistryEntry e where lower(e.nr) = ?0").setParameter(0, entryNr).list();
			}
		});
		if(!tulem.isEmpty())
			return tulem.get(0);
		
		return null;
	}

	public RegistryEntry findRegistryEntryByApplication(String applicationNr) {
		return getHibernateTemplate().execute(new HibernateCallback<RegistryEntry>() {
			public RegistryEntry doInHibernate(Session session) {
				return (RegistryEntry)session.createQuery("from RegistryEntry e where e.application.nr = ?0").setParameter(0, applicationNr).list().get(0);
			}
		});
	}

	public RegistryEntry findRegistryEntryByApplicationId(Long applicationId) {
		return getHibernateTemplate().execute(new HibernateCallback<RegistryEntry>() {
			public RegistryEntry doInHibernate(Session session) {
				return (RegistryEntry)session.createQuery("from RegistryEntry e where e.application.id = ?0").setParameter(0, applicationId).list().get(0);
			}
		});
	}

	public synchronized RegistryApplication findRegistryApplication(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<RegistryApplication>() {
				public RegistryApplication doInHibernate(Session session) {
					return findRegistryApplication(session, applicationNr);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return null;
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized RegistryApplication findRegistryApplicationById(final Long id) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<RegistryApplication>() {
				public RegistryApplication doInHibernate(Session session) {
					return findRegistryApplicationById(session, id);
				}
			});

		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized RegistryApplication findRegistryApplicationById(Session session, Long applicationId) {
		return (RegistryApplication) session.createQuery("from RegistryApplication a where a.id = ?0").setParameter(0, applicationId).uniqueResult();
	}

	public synchronized RegistryApplication findRegistryApplication(Session session, String applicationNr) {
		return (RegistryApplication) session.createQuery("from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).list().get(0);
	}

	public List<RegistryApplication> findWaitingEnterpriseApplications(final String registrationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryApplication>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryApplication> doInHibernate(Session session) {
					return session.createQuery(
						"from RegistryApplication as a where a.applicant.registrationId = ?0 and a.state.code in ('ADD','CTL','PRO', 'NMO', 'ARP') and a.type.code in ('ARE','ARP')  order by a.arrived")
						.setParameter(0, registrationNr).list();
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryApplication>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public List<RegistryApplication> findEnterpriseExpiringEntryApplications(final String registrationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryApplication>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryApplication> doInHibernate(Session session) {
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.DAY_OF_YEAR, 30);
					Date date = cal.getTime();
					cal.add(Calendar.DAY_OF_YEAR, 30);
					Date date2 = cal.getTime();
					
					List<RegistryApplication> appsList = session.createQuery(
						"from RegistryApplication as a where a.registryEntry.id is not null and a.applicant.registrationId = ?0 and a.state.code ='"
						+ IClassificatorService.APPL_STATE_RGE
						+ "' and a.registryEntry.validUntil between ?1 and ?2").setParameter(0, registrationNr).setParameter(1, date)
						.setParameter(2, date2).list();
					
					if(appsList.isEmpty()) {
						return new ArrayList<RegistryApplication>();
					}
					return appsList;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryApplication>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RegistryApplication> findEnterpriseExpiringIn60(final String registrationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryApplication>>() {
				public List<RegistryApplication> doInHibernate(Session session) {
					Query q1 = session.createQuery("from RegistryApplication as a where a.registryEntry.id is not null and "
						+ "a.applicant.registrationId = ?0 and a.registryEntry.validFrom < ?1 and "
						+ "a.registryEntry.validUntil between ?2 and ?3 and " + "a.type.code != '"
									+ IClassificatorService.APPL_TYPE_ARP + "' and " + "a.state.code not in " + "('"
									+ IClassificatorService.APPL_STATE_RGN + "','"
									+ IClassificatorService.APPL_STATE_VOID + "') and " + "a.registryEntry.id not in "
									+ "(select r.registryEntry.id from RegistryApplication r where "
									+ "r.registryEntry.id is not null and ( (r.type.code='"
									+ IClassificatorService.APPL_TYPE_ARP + "' and " + "r.decision = null) or "
									+ "(r.type.code='" + IClassificatorService.APPL_TYPE_ARP + "' and "
									+ "r.state.code in " + "('" + IClassificatorService.APPL_STATE_REXT_NOT + "','"
									+ IClassificatorService.APPL_STATE_VOID + "')" + ")) )");
					q1.setString(0, registrationNr);
					Calendar cal = Calendar.getInstance();
					Date currentDate = cal.getTime();
					q1.setDate(1, currentDate);
					q1.setDate(2, currentDate);
					cal.add(Calendar.DAY_OF_YEAR, 60);
					Date latestExpiryDate = cal.getTime();
					q1.setDate(3, latestExpiryDate);
					LOGGER.info("query parameters:" + registrationNr + "," + currentDate + "," + latestExpiryDate + ","
							+ q1.getQueryString());
					List<RegistryApplication> appsList = null;
					try {
						appsList = q1.list();
					} catch (IndexOutOfBoundsException iof) {
						return new ArrayList<RegistryApplication>();
					}
					return appsList;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryApplication>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public List<RegistryDocument> findApplicationDocuments(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocuments(session, applicationNr);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public List<RegistryDocument> findApplicationDocumentsArchived(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocumentsArchived(session, applicationNr);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized List<RegistryDocument> findApplicationDocumentsPublic(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocumentsPublic(session, applicationNr);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public Person findPerson(final String personalCode) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Person>() {
				public Person doInHibernate(Session session) {
					return findPerson(session, personalCode);
				}
			});
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized List<RegistryDocument> findApplicationDocuments(final Long applicationId) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocuments(session, applicationId);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized List<RegistryDocument> findApplicationDocumentsPublic(final Long applicationId) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocumentsPublic(session, applicationId);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized List<RegistryDocument> findApplicationDocumentsArchived(final Long applicationId) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocumentsArchived(session, applicationId);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public List<RegistryDocument> findApplicationDocumentsFromUser(final Long applicationId) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				public List<RegistryDocument> doInHibernate(Session session) {
					return findApplicationDocumentsFromUser(session, applicationId);
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public List<RegistryDocument> findPublicDocuments() {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryDocument> doInHibernate(Session session) {
					List<RegistryDocument> l = session.createQuery("from RegistryDocument d where d.docType.code = ?0")
						.setParameter(0, IClassificatorService.DOC_TYPE_PUB).list();
					session.clear();
					return l;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public List<RegistryDocument> findPublicDocuments(final String langCode) {	
		try {
			return getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryDocument> doInHibernate(Session session) {
					List<RegistryDocument> l = session.createQuery("from RegistryDocument d where d.docType.code = ?0 and d.language.code = ?1")
						.setParameter(0, IClassificatorService.DOC_TYPE_PUB)
						.setParameter(1, langCode).list();
					session.clear();
					return l;
				}
			});

		} catch (IndexOutOfBoundsException iof) {
			return new ArrayList<RegistryDocument>();
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}

	public synchronized Enterprise findEnterpriseByName(String name) {
		Enterprise ent = null;
		try {
			ent = getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
				public Enterprise doInHibernate(Session session) {
					return (Enterprise)session.createQuery("from Enterprise e where e.name = ?0").setParameter(0, name).list().get(0);
		}
			});
		} catch (IndexOutOfBoundsException e) {}

		return ent;
	}

	public synchronized Enterprise findEnterpriseByRegNr(String regNr) {
		Enterprise ent = null;
		try {
			ent = getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
				public Enterprise doInHibernate(Session session) {
					return (Enterprise)session.createQuery("from Enterprise e where e.registrationId = ?0 and active=true order by e.created desc").setParameter(0, regNr).list().get(0);
		}
			});
		} catch (IndexOutOfBoundsException e) {}

		return ent;
	}

	public Enterprise findProductMovementReportingEnterprise(String enterpriseRegNr) {
		return getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
			public Enterprise doInHibernate(Session session) {
				return (Enterprise)session
					.createQuery("select r.reportingEnterprise from ProductMovementReport r where r.reportingEnterprise.registrationId = ?0 order by r.created desc")
					.setParameter(0, enterpriseRegNr).list().get(0);
			}
		});
	}

	public Enterprise findProductMovementReportingEnterprise(long reportId) {
		return getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
			public Enterprise doInHibernate(Session session) {
				return (Enterprise)session
					.createQuery("select r.reportingEnterprise from ProductMovementReport r where r.id = ?0")
					.setParameter(0, reportId).list().get(0);
			}
		});
	}

	public List<ProductMovementReportRecord> findProductMovementRecords(Long reportId) {
		return getHibernateTemplate().execute(new HibernateCallback<List<ProductMovementReportRecord>>() {
			@SuppressWarnings("unchecked")
			public List<ProductMovementReportRecord> doInHibernate(Session session) {
				return (List<ProductMovementReportRecord>)session
					.createQuery("from ProductMovementReportRecord r where r.report.id = ?0 order by r.id")
					.setParameter(0, reportId).list();
			}
		});
	}

	public List<Faq> findFaqs() {
		return getHibernateTemplate().execute(new HibernateCallback<List<Faq>>() {
			@SuppressWarnings("unchecked")
			public List<Faq> doInHibernate(Session session) {
				return (List<Faq>)session.createQuery("from Faq f order by id").list();
			}
		});
	}

	public List<News> findNews() {
		return getHibernateTemplate().execute(new HibernateCallback<List<News>>() {
			@SuppressWarnings("unchecked")
			public List<News> doInHibernate(Session session) {
				return (List<News>)session.createQuery("from News n order by id").list();
			}
		});
	}

	public RegistryDocument getDocument(Long documentId) {
		RegistryDocument doc = null;
		try {
			List<RegistryDocument> results = getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryDocument> doInHibernate(Session session) {
					return (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.id = ?0")
						.setParameter(0, documentId).list();
				}
			});
			
			if(!results.isEmpty())
				doc = results.get(0);
			else
				throw new SystemException("No application found!");
			doc.setContent(readFile(doc.getPath()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return doc;
	}

	public RegistryDocument getDocument(Long documentId, String regCode) {
		RegistryDocument doc = null;
		try {
			LOGGER.info("RRR --- getDocument --> from RegistryDocument d where d.id = " + documentId + " and d.application.applicant.registrationId=" + regCode);
			List<RegistryDocument> results = getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryDocument> doInHibernate(Session session) {
					return (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.id = ?0 and d.application.applicant.registrationId=?1")
						.setParameter(0, documentId).setParameter(1, regCode).list();
				}
			});
			LOGGER.info("RRR --- getDocument result size:" + results.size());
			if(!results.isEmpty())
				doc = results.get(0);
			else
				throw new SystemException("User has no permission to open this application or it does not exist!");
			doc.setContent(readFile(doc.getPath()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return doc;
	}

	public List getApplicationDocuments(String fileName) {
		List<RegistryDocument> result = null;
		StringBuffer arg = new StringBuffer("%").append(fileName).append("%");

		try {
			result = getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryDocument> doInHibernate(Session session) {
					return (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.path like ?0 order by id")
						.setParameter(0, arg.toString()).list();
				}
			});
			for (RegistryDocument doc : result) {
				doc.setContent(readFile(doc.getPath()));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public List<RegistryDocument> getApplicationDocumentsByNameAndApplicationId(String fileName, Long applicationId) {
		List<RegistryDocument> result = null;
		StringBuffer arg = new StringBuffer("%").append(fileName).append("%");

		try {
			result = getHibernateTemplate().execute(new HibernateCallback<List<RegistryDocument>>() {
				@SuppressWarnings("unchecked")
				public List<RegistryDocument> doInHibernate(Session session) {
					return (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.path like ?0 and d.application.id = ?1 order by id")
						.setParameter(0, arg.toString()).setParameter(1, applicationId).list();
				}
			});
			for (RegistryDocument doc : result) {
				doc.setContent(readFile(doc.getPath()));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public Enterprise getEnterprise(String registrationNr) {
		Enterprise enter = null;
		try {
			enter = getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
				public Enterprise doInHibernate(Session session) {
					return (Enterprise)session.createQuery("from Enterprise e where e.registrationId = ?0").setParameter(0, registrationNr).list().get(0);
				}
			});
		} catch (IndexOutOfBoundsException ioe) {}

		return enter;
	}

	/**
	 * Finds enterprise in order of active property by registration nr
	 */
	public synchronized Enterprise getEnterpriseByActivity(String registrationNr) {
		Enterprise enter = null;
		try {
			enter = getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
				public Enterprise doInHibernate(Session session) {
					return (Enterprise)session.createQuery("from Enterprise e where e.registrationId = ?0 and e.active is true order by e.active desc, e.modified desc")
						.setParameter(0, registrationNr).list().get(0);
				}
			});
		} catch (IndexOutOfBoundsException ioe) {}

		return enter;
	}

	public Product findProduct(Long productId) {
		return getHibernateTemplate().execute(new HibernateCallback<Product>() {
			public Product doInHibernate(Session session) {
				return (Product)session.createQuery("from Product p where p.id = ?0").setParameter(0, productId).list().get(0);
	}
		});
				}

	public Enterprise findEnterprise(Long enterpriseId) {
		return getHibernateTemplate().execute(new HibernateCallback<Enterprise>() {
			public Enterprise doInHibernate(Session session) {
				return (Enterprise)session.createQuery("from Enterprise e where e.id = ?0").setParameter(0, enterpriseId).list().get(0);
					}
		});
		}

	public RegistryApplication findApplication(Long applicationId) {
		return getHibernateTemplate().execute(new HibernateCallback<RegistryApplication>() {
			public RegistryApplication doInHibernate(Session session) {
				return (RegistryApplication)session.createQuery("from RegistryApplication r where r.id = ?0").setParameter(0, applicationId).list().get(0);
					}
		});
				}

	private RegistryApplication findApplication(Session session, String applicationNr) {
		return (RegistryApplication)session.createQuery("from RegistryApplication where nr = ?0").setParameter(0, applicationNr).list().get(0);
	}

	public Product findApplicationProduct(Session session, String applicationNr) {
		return (Product)session.createQuery("select a.product from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).list().get(0);
	}

	public Long findApplicationProductId(Session session, String applicationNr) {
		return (Long)session.createQuery("select a.product.id from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).list().get(0);
	}

	@SuppressWarnings("unchecked")
	private List<RegistryDocument> findApplicationDocuments(Session session, String applicationId) {
		return session.createQuery("from RegistryDocument d where d.application.id = ?0 AND (d.pub = 0 or d.pub is null) and (d.archived = 0 OR d.archived is null) order by d.id")
			.setParameter(0, new Long(applicationId)).list();
	}

	@SuppressWarnings("unchecked")
	private synchronized List<RegistryDocument> findApplicationDocumentsPublic(Session session, String applicationId) {
		return session.createQuery("from RegistryDocument d where d.application.id = ?0 AND d.pub = 1 AND (d.archived = 0 OR d.archived is null) order by d.id")
			.setParameter(0, new Long(applicationId)).list();
	}

	@SuppressWarnings("unchecked")
	private List<RegistryDocument> findApplicationDocumentsArchived(Session session, String applicationId) {
		return session.createQuery("from RegistryDocument d where d.application.id = ?0 AND d.archived = 1 order by d.id").setParameter(0, new Long(applicationId)).list();
	}

	@SuppressWarnings("unchecked")
	private List<RegistryDocument> findApplicationDocuments(Session session, Long applicationId) {
		/*
		 * Implementation of cache
		 */
		List<RegistryDocument> l = (List<RegistryDocument>)session.createQuery(
			"from RegistryDocument d where d.application.id = ?0 AND (d.pub = 0 or d.pub is null) and (d.archived = 0 OR d.archived is null) order by d.id")
			.setParameter(0, applicationId).list();
		session.clear();
		return l;
	}

	@SuppressWarnings("unchecked")
	private synchronized List<RegistryDocument> findApplicationDocumentsPublic(Session session, Long applicationId) {
		/*
		 * Implementation of cache
		 */
		List<RegistryDocument> l = (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.application.id = ?0 AND d.pub = 1 AND (d.archived = 0 OR d.archived is null) order by d.id")
			.setParameter(0, applicationId).list();
		session.clear();
		return l;
	}

	@SuppressWarnings("unchecked")
	private List<RegistryDocument> findApplicationDocumentsArchived(Session session, Long applicationId) {
		/*
		 * Implementation of cache
		 */
		List<RegistryDocument> l = (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.application.id = ?0 AND d.archived = 1 order by d.id")
			.setParameter(0, applicationId).list();
		session.clear();
		return l;
	}

	@SuppressWarnings("unchecked")
	private List<RegistryDocument> findApplicationDocumentsFromUser(Session session, Long applicationId) {
		/*
		 * Implementation of cache
		 */
		List<RegistryDocument> l = (List<RegistryDocument>)session.createQuery("from RegistryDocument d where d.application.id = ?0 AND d.docType = null order by d.id")
			.setParameter(0, applicationId).list();
		session.clear();
		return l;
	}

	private Long saveDocument(Session session, byte[] content, String contentType, String docType, String docLangCode,
			String docName, String fileName, RegistryApplication application, boolean mayRepeat, String isPublic) throws DataIntegrityViolationException {
		RegistryDocument doc = new RegistryDocument();
		doc.setContentType(contentType);
		doc.setName(docName);
		if (docType != null) {
			DocumentType documentType = null;
			List<DocumentType> docTypeQuery = getHibernateTemplate().execute(new HibernateCallback<List<DocumentType>>() {
				@SuppressWarnings("unchecked")
				public List<DocumentType> doInHibernate(Session session) {
					return (List<DocumentType>)session.createQuery("from DocumentType c where c.code = ?0").setParameter(0, docType).list();
				}
			});
			if(!docTypeQuery.isEmpty()) {
				documentType = docTypeQuery.get(0);
			} else {
				documentType = new DocumentType();
			documentType.setCode(docType);
				session.save(documentType);
			}
			
			doc.setDocType(documentType);
		}
		if (docLangCode != null) {
			Language lang = null;
			List<Language> langQuery = getHibernateTemplate().execute(new HibernateCallback<List<Language>>() {
				@SuppressWarnings("unchecked")
				public List<Language> doInHibernate(Session session) {
					return (List<Language>)session.createQuery("from Language c where c.code = ?0").setParameter(0, docLangCode).list();
				}
			});
			if(!langQuery.isEmpty()) {
				lang = langQuery.get(0);
			} else {
				lang = new Language();
			lang.setCode(docLangCode);
			}
			
			doc.setLanguage(lang);
			session.saveOrUpdate(lang);
		}
		
		if (application != null) {
			doc.setApplication(application);
			session.saveOrUpdate(application);
		}
		Long docId = (Long) session.save(doc);
		File file = createDocFile(docId, docType, docName, fileName, application, mayRepeat);
		BufferedOutputStream fileOut = null;
		if (isPublic == null) {
			isPublic = "1";
		}
		if (isPublic.equals("1")) {
			doc.setPub((short) 1);
		} else {
			doc.setPub((short) 0);
		}

		if (!file.exists()) {
			try {
				fileOut = new BufferedOutputStream(new FileOutputStream(file));
			} catch (IOException ioe) {
				throw new SystemException(ioe);
			}
			doc.setPath(file.getAbsolutePath());
		} else {
			throw new DataIntegrityViolationException("Document file:'" + fileName + " (real: " + file.getAbsolutePath() + ")");
		}

		try {
			fileOut.write(content);
			fileOut.flush();
			fileOut.close();
		} catch (IOException e) {
			session.getTransaction().rollback();
			throw new HibernateException(e);
		}

		Long id = (Long) session.save(doc);
		Transaction tx = session.getTransaction();
		if(!tx.isActive()) {
			tx.begin();
		}

		session.flush();
		tx.commit();
		
		return id;

	}

	private File createDocFile(Long docId, String docType, String docName, String fileName,	RegistryApplication application, boolean mayRepeat) {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("docName: " + docName);

		String applicationId = null;
		Long productId = null;

		if (application != null) {
			applicationId = application.getId().toString();
			Product product = application.getProduct();
			// Shouldn 't be like this
			if (product == null)
				throw new NullPointerException("application.getProduct() == null");

			productId = application.getProduct().getId();
		}
		StringBuffer sbuf = new StringBuffer(getDocRoot());
		if (productId != null) {
			// We make folders for 100 product docs.
			long prodId = productId.longValue() / 100;
			StringBuffer prodFolder = new StringBuffer(Long.toString(prodId)).append("00");
			sbuf.append(File.separator).append(prodFolder).append(File.separator).append(productId);
			File path = new File(sbuf.toString());
			if (!path.exists() && !path.mkdirs())
				throw new SystemException("Couldn't make directory: '" + path.toString() + "'");
		}
		if (applicationId != null) {
			sbuf.append(File.separator).append(applicationId);
			File path = new File(sbuf.toString());
			if (!path.exists() && !path.mkdir())
				throw new SystemException("Couldn't make directory: '" + path.toString() + "'");

		}
		/* FIXME: add file extension according to file type! */
		String sufix = "";
		if (fileName != null) {
			if(fileName.lastIndexOf('.') != -1)
				sufix = fileName.substring(fileName.lastIndexOf('.'));
			sbuf.append(File.separator).append(docName + sufix);
		} else {
			sbuf.append(File.separator).append(docName);
		}

		String path = sbuf.toString();

		File file = new File(path);
		if (file.exists() && mayRepeat) {
			int i = 1;
			String newPath;
			int k = path.lastIndexOf('.');
			while (file.exists()) {
				if (k != -1)
					newPath = path.substring(0, k) + "_" + i + path.substring(k);
				else
					newPath = path.substring(0, k) + "_" + i;
				file = new File(newPath);
				i++;
			}
		}
		if (LOGGER.isDebugEnabled())
			LOGGER.info("file path: " + path);
		
		return file;
	}

	private void createApplicationDocument(Session session, String docTypeCode, RegistryApplication application, Person signer) throws IOException {
		DocumentType docType = (DocumentType) ClassificatorServiceImpl.findClassItem(session, DocumentType.class, docTypeCode);

		String decisonNr = application.getDecision().getNr();
		String docName = null;
		// Construct the filename.
		StringBuffer sbuf = new StringBuffer(docTypeCode);
		if (decisonNr != null)
			decisonNr = decisonNr.replace("/", "_"); // hack - to be removed!!!
														// //
														// RK: why is it still
														// here?
														//
														// only god knows
		// Applciation document
		if (docTypeCode.equals(IClassificatorService.DOC_TYPE_DEC)
				|| docTypeCode.equals(IClassificatorService.DOC_TYPE_COR)
				|| docTypeCode.equals(IClassificatorService.DOC_TYPE_NDEC)
				|| docTypeCode.equals(IClassificatorService.DOC_TYPE_EX_DEC)
				|| docTypeCode.equals(IClassificatorService.DOC_TYPE_EX_COR)
				|| docTypeCode.equals(IClassificatorService.DOC_TYPE_EX_NDEC)) {
			sbuf.append(decisonNr);
			if (decisonNr != null)
				docName = docType.getName() + " nr. " + decisonNr;
			else
				docName = docType.getName();
		} else {
			throw new IllegalArgumentException("Illegal document type parameter: '" + docTypeCode + "'");
		}
		
		String fileName = sbuf.append(".pdf").toString();
		File tmpDocFile = pdfCreator.create(docTypeCode, application, signer, null);
		byte[] bytes = new byte[(int) tmpDocFile.length()];
		FileInputStream is = new FileInputStream(tmpDocFile);
		is.read(bytes);
		tmpDocFile.delete();
		is.close();
		System.out.println(docType.toString());
		saveDocument(session, bytes, "application/pdf", docTypeCode, null, docName, fileName, application, false, "0");
	}

	private String nextDesicionNr(Session session) {
		BigInteger next = (BigInteger) session.createSQLQuery("select nextval('decision_seq')").list().get(0);
		return Long.toString(next.longValue() + getDecisionNrBase());
	}

	private String nextExtendDesicionNr(Session session) {
		BigInteger next = (BigInteger) session.createSQLQuery("select nextval('extend_decision_seq')").list().get(0);
		return Long.toString(next.longValue());
	}

	private String nextApplicationNr(Session session) {
		BigInteger next = (BigInteger) session.createSQLQuery("select nextval('reg_application_nr_seq')").list().get(0);
		return Long.toString(next.longValue());
	}

	private Date addYears(Date start, int years) {
		Calendar newDate = Calendar.getInstance();
		newDate.setTime(start);
		newDate.roll(Calendar.YEAR, years);
		return newDate.getTime();
	}

	private String generateEntryNr(RegistryApplication savedAppl) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		String sYear = Integer.toString(year);
		StringBuffer sbuf = new StringBuffer("R");

		savedAppl.getProduct().getType().getCode();

		sbuf.append(sYear.substring(sYear.length() - 2)).append("/").append(savedAppl.getNr()).append("/").append(savedAppl.getProduct().getType().getCode());
		
		return sbuf.toString();
	}

	public RegistryEntry updateRegistryEntryNr(RegistryApplication savedAppl) throws ConstraintViolationException {

		RegistryEntry registryEntry = savedAppl.getRegistryEntry();

		if (registryEntry != null) {
			String oldNr = registryEntry.getNr();
			int subsIndex = oldNr.lastIndexOf('/');
			if (subsIndex == -1)
				return null;
			String substr = oldNr.substring(0, subsIndex != oldNr.length() ? subsIndex + 1 : subsIndex);
			substr = substr + savedAppl.getProduct().getType().getCode();
			registryEntry.setNr(substr);
			return saveOrUpdate(registryEntry);
		}
		return null;
	}

	private byte[] readFile(String fileName) throws IOException {
		File file = new File(fileName);
		byte[] content = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(content);
		fis.close();
		
		return content;
	}

	public String getDocRoot() {
		return docRoot;
	}

	public void setDocRoot(String docRoot) {
		this.docRoot = docRoot;
	}

	public String getBaseURI() {
		return baseURI;
	}

	public void setBaseURI(String baseURI) {
		this.baseURI = baseURI;
	}

	public long getApplicationNrBase() {
		return applicationNrBase;
	}

	public void setApplicationNrBase(long applicationNrBase) {
		this.applicationNrBase = applicationNrBase;
	}

	public String getTrustStore() {
		return trustStore;
	}

	public void setTrustStore(String trustStore) {
		this.trustStore = trustStore;
	}

	public String getTrustStorePassword() {
		return trustStorePassword;
	}

	public void setTrustStorePassword(String trustStorePassword) {
		this.trustStorePassword = trustStorePassword;
	}
	
	public long getDecisionNrBase() {
		return decisionNrBase;
	}

	public void setDecisionNrBase(long decisionNrBase) {
		this.decisionNrBase = decisionNrBase;
	}

	public long getEntryNrBase() {
		return entryNrBase;
	}

	public void setEntryNrBase(long entryNrBase) {
		this.entryNrBase = entryNrBase;
	}

	public PDFCreator getPdfCreator() {
		return pdfCreator;
	}

	public void setPdfCreator(PDFCreator pdfCreator) {
		this.pdfCreator = pdfCreator;
	}

	/**
	 * 
	 * Use this to update registry entry values
	 * 
	 * @param entry
	 *            the registry entry that should be updated
	 * @return
	 * @throws ConstraintViolationException
	 */
	public RegistryEntry saveOrUpdate(final RegistryEntry entry) throws ConstraintViolationException {
		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {
					if (entry.getId() != null) {
						session.saveOrUpdate(entry);
					} else {
						session.save(entry);
					}
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(entry.toString());
		} catch(Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return entry;
	}

	public SearchFilter superSearch(final SearchFilter filter) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<SearchFilter>() {
				public SearchFilter doInHibernate(Session session) {
					return superSearch(session, filter);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

	}

	/**
	 * Check if extend document of given type exists
	 */
	public Boolean isExtendDocumentPresent(final String applicationNr, final String docType) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
				public Boolean doInHibernate(Session session) {
					// check if there are any correction documents for this application
					return !session.createQuery("from RegistryDocument s where s.application.nr=?0 and docType.code=?1")
						.setParameter(0, applicationNr).setParameter(1, docType).list().isEmpty();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	/**
	 * Create new extend document by type
	 * 
	 * @param applicationNr
	 * @param docType
	 * @return
	 */
	public Boolean createNewExtendDocument(final String applicationNr, final String docType) {
		getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) {
				try {
					RegistryApplication appl = (RegistryApplication)session.createQuery("from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).uniqueResult();
					appl.setProcessor(getCurrentUser(session, false));
					appl.getDecision().setSigner(getCurrentUser(session, false));
					session.saveOrUpdate(appl);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					createApplicationDocument(session, docType, appl, appl.getDecision().getSigner());
					return true;
				} catch (IOException e) {
					e.printStackTrace();
					throw new SystemException(e);
				}

			}
		});
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.service.IRegistryService#isCorrectionDocumentPresent(java.lang.Long)
	 */
	public Boolean isCorrectionDocumentPresent(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
				public Boolean doInHibernate(Session session) {
					// check if there are any correction documents for this application
					return !session.createQuery("from RegistryDocument s where s.application.nr=?0 and docType.code=?1")
						.setParameter(0, applicationNr).setParameter(1, IClassificatorService.DOC_TYPE_COR).list().isEmpty();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.service.IRegistryService#isDecisionDocumentPresent(java.
	 * lang.Long)
	 */
	public Boolean isDecisionDocumentPresent(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
				public Boolean doInHibernate(Session session) {
					// check if there are any decision documents for this application
					return !session.createQuery("from RegistryDocument s where s.application.nr=?0 and docType.code=?1")
						.setParameter(0, applicationNr).setParameter(1, IClassificatorService.DOC_TYPE_DEC).list().isEmpty();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.service.IRegistryService#createNewCorrectionDocument(ee.agri.alkor.model.RegistryApplication)
	 */
	public Boolean createNewCorrectionDocument(final String applicationNr) {
		getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
			public Boolean doInHibernate(Session session) {
				try {
					RegistryApplication appl = (RegistryApplication) session
						.createQuery("from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).uniqueResult();
					appl.setProcessor(getCurrentUser(session, false));
					appl.getDecision().setSigner(getCurrentUser(session, false));
					session.saveOrUpdate(appl);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					createApplicationDocument(session, IClassificatorService.DOC_TYPE_COR, appl, appl.getDecision().getSigner());
					
					return true;
				} catch (IOException e) {
					e.printStackTrace();
					throw new SystemException(e);
				}

			}
		});
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.service.IRegistryService#createNewDecisionDocument(ee.agri
	 * .alkor.model.RegistryApplication)
	 */
	public Boolean createNewDecisionDocument(final String applicationNr) {
		getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
			public Boolean doInHibernate(Session session) {
				try {
					RegistryApplication appl = (RegistryApplication) session
						.createQuery("from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr).uniqueResult();
					appl.setProcessor(getCurrentUser(session, false));
					appl.getDecision().setSigner(getCurrentUser(session, false));
					session.saveOrUpdate(appl);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					createApplicationDocument(session, IClassificatorService.DOC_TYPE_DEC, appl, appl.getDecision().getSigner());
					
					return true;
				} catch (IOException e) {
					e.printStackTrace();
					throw new SystemException(e);
				}

			}
		});
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.service.IRegistryService#createNewDeclineDocument(java.lang.Long)
	 */
	public Boolean createNewDeclineDocument(final String applicationNr) {
		getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
			public Boolean doInHibernate(Session session) {
				try {
					RegistryApplication appl = (RegistryApplication) session
						.createQuery("from RegistryApplication a where a.nr = ?0").setParameter(0, applicationNr)
							.uniqueResult();
					appl.setProcessor(getCurrentUser(session, false));
					appl.getDecision().setSigner(getCurrentUser(session, false));
					session.saveOrUpdate(appl);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					createApplicationDocument(session, IClassificatorService.DOC_TYPE_NDEC, appl, appl.getDecision().getSigner());
					
					return true;
				} catch (IOException e) {
					e.printStackTrace();
					throw new SystemException(e);
				}
			}
		});
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ee.agri.alkor.service.IRegistryService#isDeclineDocumentPresent(java.lang
	 * .Long)
	 */
	public Boolean isDeclineDocumentPresent(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
				public Boolean doInHibernate(Session session) {
					// check if there are any decision documents for
					// this application
					return !session.createQuery("from RegistryDocument s where s.application.nr=?0 and docType.code=?1")
						.setParameter(0, applicationNr).setParameter(1, IClassificatorService.DOC_TYPE_NDEC).list().isEmpty();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
	}

	/**
	 * Updates applicant's balance and inserts new record to log table
	 */
	@Transactional
	public RegistryApplication processPaymentMatching(RegistryApplication registryApplication, final String tax,
			final PaymentMatchingLog paymentMatchingLog) throws ConstraintViolationException, IllegalArgumentException, SystemException {
		final Enterprise applicant;

		// refresh applicant
		applicant = findEnterprise(registryApplication.getApplicant().getId());

		BigDecimal decimalTax = BigDecimal.valueOf(Double.parseDouble(tax));
		paymentMatchingLog.setPaymentApplication(registryApplication);
		paymentMatchingLog.setAmount(decimalTax);
		paymentMatchingLog.setCreated(new java.util.Date());
		if (paymentMatchingLog.getCreatedBy() == null)
			paymentMatchingLog.setCreatedBy(AuthenticationServiceDelegate.getCurrentUserName());

		BigDecimal balance = applicant.getBalance();
		if (balance == null)
			balance = BigDecimal.valueOf(0);
		applicant.setBalance(balance.subtract(decimalTax));
		int balanceInt = balance.intValue();
		int decimalTaxInt = decimalTax.intValue();

		int err = 0;

		if (balanceInt - decimalTaxInt < 0) {
			err = 1;
		}

		if ((balanceInt <= 0 && decimalTaxInt > 0) || err == 1) {
			throw new IllegalArgumentException("Asutuse saldo liiga väike!");
		}

		//vale nimi? ei kasutata?
		paymentMatchingLog.setEnterprisePreviousBalance(applicant.getBalance()); 
		paymentMatchingLog.setEnterpriseBindedTo(applicant.getId());

		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					session.saveOrUpdate(applicant);
					session.saveOrUpdate(paymentMatchingLog);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		registryApplication.setApplicant(applicant);
		refreshEnterprises(registryApplication);

		return registryApplication;
	}
	
	public String takeBackPaymentMatching(RegistryApplication registryApplication, final String tax) {

		Enterprise applicant = findEnterprise(registryApplication.getApplicant().getId());
		BigDecimal decimalTax = BigDecimal.valueOf(Double.parseDouble(tax));

		try {
			String sql = "SELECT id, amount, enterprise_binded_to "
					+ " FROM payment_matching_log "
					+ " WHERE payment_application_id = "+registryApplication.getId()
					+ " AND amount = "+decimalTax
					+ " AND enterprise_binded_to = "+applicant.getId()
					+ " AND created_by = '"+AuthenticationServiceDelegate.getCurrentUserName()+"'"
					+ " ORDER BY created DESC LIMIT 1";
			
			ResultSet rs = PostgreUtils.query(sql);
			
			LOGGER.info("--- returning money and deleteing payment log entry: "+sql);
			
			if(rs.next()){
				String id = rs.getString("id");
				String amount = rs.getString("amount");
				String ent = rs.getString("enterprise_binded_to");

				LOGGER.info("--- id: "+id+", amount: "+amount+", ent: "+ent);
				
				if(id != null && id != "0"){
					PostgreUtils.delete("DELETE FROM payment_matching_log WHERE id = "+id);
					PostgreUtils.update("UPDATE enterprise SET balance = balance + "+amount+" WHERE id = "+ent);
				}
			} else {
				LOGGER.info("--- not found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		return "";
	}

	/**
	 * Updates applicant's balance and inserts new record to log table
	 */
	@Transactional
	public RegistryApplication processPaymentMatching2(RegistryApplication registryApplication, final String tax,
			final PaymentMatchingLog paymentMatchingLog) throws ConstraintViolationException {
		final Enterprise applicant;

		// refresh applicant
		applicant = findEnterprise(registryApplication.getApplicant().getId());

		BigDecimal decimalTax = BigDecimal.valueOf(Double.parseDouble(tax));
		paymentMatchingLog.setPaymentApplication(registryApplication);
		paymentMatchingLog.setAmount(decimalTax);
		paymentMatchingLog.setCreated(new java.util.Date());
		if (paymentMatchingLog.getCreatedBy() == null)
			paymentMatchingLog.setCreatedBy(AuthenticationServiceDelegate.getCurrentUserName());

		BigDecimal balance = applicant.getBalance();
		if (balance == null)
			balance = BigDecimal.valueOf(0);
		applicant.setBalance(balance.subtract(decimalTax));

		//vale nimi? ei kasutata?
		paymentMatchingLog.setEnterprisePreviousBalance(applicant.getBalance()); 
		paymentMatchingLog.setEnterpriseBindedTo(applicant.getId());

		try {
			getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) {

					session.saveOrUpdate(applicant);
					session.saveOrUpdate(paymentMatchingLog);
					
					Transaction tx = session.getTransaction();
					if(!tx.isActive()) {
						tx.begin();
					}
					
					session.flush();
					tx.commit();
					
					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		registryApplication.setApplicant(applicant);
		refreshEnterprises(registryApplication);

		return registryApplication;
	}

	/**
	 * Checks whether application has same enterprise in various roles and
	 * updates them. To avoid @HibernateOptimisticLockingFailureException
	 * 
	 * @param registryApplication
	 */
	private void refreshEnterprises(RegistryApplication registryApplication) {

		Enterprise applicant = registryApplication.getApplicant();

		if (registryApplication.getProduct().getProducer() != null
				&& registryApplication.getProduct().getProducer().getId().equals(applicant.getId()))
			registryApplication.getProduct().setProducer(applicant);
		if (registryApplication.getProduct().getImporter() != null
				&& registryApplication.getProduct().getImporter().getId().equals(applicant.getId()))
			registryApplication.getProduct().setImporter(applicant);
		if (registryApplication.getProduct().getMarketer() != null
				&& registryApplication.getProduct().getMarketer().getId().equals(applicant.getId()))
			registryApplication.getProduct().setMarketer(applicant);
		if (registryApplication.getProduct().getPackager() != null
				&& registryApplication.getProduct().getPackager().getId().equals(applicant.getId()))
			registryApplication.getProduct().setPackager(applicant);

	}

	/**
	 * Gets all Payment logs for current product
	 */
	public List<PaymentMatchingLog> findPaymentMatchingLogsByproduct(final Long productId) {

		List<PaymentMatchingLog> result = null;
		if (productId != null) {
			try {
				result = getHibernateTemplate().execute(new HibernateCallback<List<PaymentMatchingLog>>() {
					@SuppressWarnings("unchecked")
					public List<PaymentMatchingLog> doInHibernate(Session session) {
						return (List<PaymentMatchingLog>)session.createQuery("from PaymentMatchingLog d where d.paymentProduct = ?0 order by created desc")
							.setParameter(0, productId).list();
					}
				});

			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		return result;
	}

	/**
	 * Gets all Payment logs for current application
	 */
	public List<PaymentMatchingLog> findPaymentMatchingLogsByApplicationId(final Long applicationId) {

		List<PaymentMatchingLog> result = null;
		if (applicationId != null) {
			try {
				result = getHibernateTemplate().execute(new HibernateCallback<List<PaymentMatchingLog>>() {
					@SuppressWarnings("unchecked")
					public List<PaymentMatchingLog> doInHibernate(Session session) {
						return (List<PaymentMatchingLog>)session.createQuery("from PaymentMatchingLog d where d.paymentApplication = ?1 order by created desc").setLong(1, applicationId).list();
					}
				});

			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		return result;
	}

	@SuppressWarnings({ "unchecked" })
	public byte[] createApplicationDocumentByIdAndRegCode(String docTypeCode, Long id, String regCode) {
		RegistryApplication application = null;

		if (id == null || regCode == null) {
			throw new SystemException("Invalid parameters!");
		}

		LOGGER.info("createApplicationDocumentByIdAndRegCode :" + docTypeCode + " appId:" + id + " regCode:" + regCode);
		List<RegistryApplication> results = getHibernateTemplate().execute(new HibernateCallback<List<RegistryApplication>>() {
			public List<RegistryApplication> doInHibernate(Session session) {
				return (List<RegistryApplication>)session.createQuery("from RegistryApplication a where a.id = ?0 and a.applicant.registrationId = ?1")
					.setParameter(0, id).setParameter(1, regCode).list();
			}
		});
		if(!results.isEmpty())
			application = results.get(0);
		else
			throw new SystemException("No application found!");

		return generateFile(docTypeCode, application);
	}

	@SuppressWarnings({ "unchecked" })
	public byte[] createApplicationDocumentById(String docTypeCode, Long id) {
		RegistryApplication application = null;

		if (id == null) {
			throw new SystemException("Invalid parameters!");
		}
		LOGGER.info("createApplicationDocumentById :" + docTypeCode + " appId:" + id);

		List<RegistryApplication> results = getHibernateTemplate().execute(new HibernateCallback<List<RegistryApplication>>() {
			public List<RegistryApplication> doInHibernate(Session session) {
				return (List<RegistryApplication>)session.createQuery("from RegistryApplication a where a.id = ?0")
					.setParameter(0, id).list();
			}
		});
		if(!results.isEmpty()) {
			application = results.get(0);
		} else {
			throw new SystemException("No application found!");
		}

		return generateFile(docTypeCode, application);
	}

	private byte[] generateFile(String docTypeCode, RegistryApplication application) {
		List<RegistryDocument> documents = null;
		if (application.getProduct().getId() != null)
			documents = findProductDocuments(application.getProduct().getId(), true);
		File file = getPdfCreator().create(docTypeCode, application, null, documents);
		byte[] content = null;
		try {
			content = readFile(file.getPath());
			file.delete();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			throw new SystemException(ioe);
		}
		return content;
	}

	@SuppressWarnings({ "unchecked" })
	public synchronized List<Enterprise> findEnterpriseByNameorRegNr(String name, String regNr) {
		if (name != null && name.length() > 0 && regNr != null && regNr.length() > 0) {
			return getHibernateTemplate().execute(new HibernateCallback<List<Enterprise>>() {
				public List<Enterprise> doInHibernate(Session session) {
					return (List<Enterprise>)session.createQuery("from Enterprise e where e.name like ?0 and e.registrationId like ?1")
						.setParameter(0, "%" + name + "%").setParameter(1, "%" + regNr + "%").list();
				}
			});
		} else if (name != null && name.length() > 0) {
			return (List<Enterprise>)getHibernateTemplate().execute(new HibernateCallback<List<Enterprise>>() {
				public List<Enterprise> doInHibernate(Session session) {
					return (List<Enterprise>)session.createQuery("from Enterprise e where e.name like ?0")
						.setParameter(0, "%" + name + "%").list();
				}
			});
		} else if (regNr != null && regNr.length() > 0) {
			return (List<Enterprise>)getHibernateTemplate().execute(new HibernateCallback<List<Enterprise>>() {
				public List<Enterprise> doInHibernate(Session session) {
					return (List<Enterprise>)session.createQuery("from Enterprise e where e.registrationId like ?1")
						.setParameter(0, "%" + regNr + "%").list();
				}
			});
		} else {
			return new ArrayList<Enterprise>();

	}
	}

	public void saveXid(final XTeeId xid) {
		LOGGER.info(xid);
		getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) {
				session.save(xid);
				return null;
			}
		});
	}

	public synchronized void saveHistory(final IEntity entity) {
		getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) {
				session.save(entity);
				return null;
			}
		});
	}
	
	public boolean isPaymentUnique(final String orderNumber) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
				public Boolean doInHibernate(Session session) {
					return session.createQuery("from RegistryPayment r " + "where r.orderNumber = ?0 ").setParameter(0, orderNumber).list().isEmpty();
				}
			});
		} catch (Exception e) {
			LOGGER.error("isPaymentUnique failure, orderNum : " + orderNumber);
			e.printStackTrace();
			return true; // default action is to accept payment
		}
	}

	public boolean isExtendingAllowed(final String applicationNr) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Boolean>() {
				public Boolean doInHibernate(Session session) {
					//[applicationNr]/P% FIXME RK: kuupäeva kontroll!?
					return session.createQuery("FROM RegistryApplication s WHERE s.nr LIKE ?0 ").setParameter(0, applicationNr + "/P%").list().isEmpty();
				}
			});
		} catch (Exception e) {
			LOGGER.error("isExtendingAllowed failure, applicationNr : " + applicationNr);
			e.printStackTrace();
			return true;
		}
	}

	/**
	 * Operatsiooni teostava kasutaja andmed Person objektina.
	 * 
	 * @param session
	 * @return
	 */
	private Person getCurrentUser(Session session, boolean update) {
		Object currentUser = AuthenticationServiceDelegate.getCurrentUser();
		if (currentUser != null && (currentUser instanceof AlkoUserDetails)) {
			AlkoUserDetails currentAlkoUserDetails = (AlkoUserDetails) currentUser;
			
			if(currentAlkoUserDetails.getRegCode() != null && !currentAlkoUserDetails.getRegCode().equals("null") && !currentAlkoUserDetails.getRegCode().equals("")){ // on asutuse regcode küljes ehk on EIT
				return findPersonById(session, 100000l); // anname alati EIT kasutaja kui on EIT
			}
			
			Person person = findPerson(session, currentAlkoUserDetails.getIdCode());

			if (update) {
				person = createOrUpdateRepresentative(person, currentAlkoUserDetails.getFirstName(),
						currentAlkoUserDetails.getLastName(), currentAlkoUserDetails.getIdCode(),
						currentAlkoUserDetails.getOccupation());
			}
			return person;
		} else {
			LOGGER.info("saveEITApplication currentUser" + currentUser == null ? "null" : currentUser.toString());
			throw new SystemException("Kasutaja info puudub või on vigane");
		}

	}

	// AJUTISELT TAGASI:

	// public TempApplication getTempApplication(Long id) {
	// return (TempApplication)
	// getHibernateTemplate().find("from TempApplication e where e.id =
	// ?",id).get(0);
	// }
	//
	//
	// public Long saveTempApplication(final TempApplication app) {
	// return (Long) getHibernateTemplate().execute(
	// new HibernateCallback(){
	// public Object doInHibernate(Session session){
	// Long id=-1l;
	// List<BigInteger> ids =
	// session.createSQLQuery("select min(id) from TempApplication").list();
	// System.out.println(ids);
	// if(ids!=null&&ids.size()!=0){
	// if(ids.get(0)!=null){
	// id= -1l+ids.get(0).intValue();
	// }
	// }
	// app.setId(id);
	// session.save(app);
	// return id;
	// }
	// }
	// );
	// }
	//
	// public void update(final TempApplication app) {
	// getHibernateTemplate().execute(
	// new HibernateCallback(){
	// public Object doInHibernate(Session session){
	// session.update(app);
	// return null;
	// }
	// }
	// );
	// }

}
