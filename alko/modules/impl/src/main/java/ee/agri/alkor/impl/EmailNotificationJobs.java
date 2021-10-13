
package ee.agri.alkor.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.impl.util.spring.VelocityEngineFactoryBean;
import ee.agri.alkor.impl.util.spring.VelocityEngineUtils;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.util.AppContextHelper;

/**
 * 
 * @author suisalu
 *
 */
public class EmailNotificationJobs extends HibernateDaoSupport {
	
	private static Logger LOGGER = Logger.getLogger(EmailNotificationJobs.class);
	
	private static final String LIVE_MODE = "LIVE";
	
	private String mailFrom;
	/**
	 * Mitu päeva enne kande kehtivus lakkamist sonum saata.
	 */
	private int daysBeforeRegistryEntryExpiry;
	/**
	 * Mitu päeva pärast kande kehtivus lakkamist sonum saata.
	 */
	private int daysAfterRegistryEntryExpiry;
	
	private String mode;
	
	private String testNotificationMail;
	private int testNotificationAmount;

	private JavaMailSender mailSender;
	
	private VelocityEngine velocityEngine;
	
	private boolean isTest = false;
	
	/*
	 * 
	 * VT bug2922
	 * 
	 */
	
	public void sendRegistryEntryExpireNotifications() throws IOException, VelocityException {
		final Calendar expireDate = Calendar.getInstance();
		expireDate.add(Calendar.DAY_OF_YEAR, getDaysBeforeRegistryEntryExpiry());
		
		if(getTestNotificationMail() != null && !getTestNotificationMail().equals("")) {
			LOGGER.info("sendRegistryEntryExpireNotifications testing with set email: " + getTestNotificationMail());
			setTest(true);
		}
		else if(!LIVE_MODE.equals(getMode())){
			LOGGER.info("sendRegistryEntryExpireNotifications not live mode - execution halted");
			return;
		}
			
		VelocityEngine velocity = (VelocityEngine)AppContextHelper.getInstance().getBean("velocityEngine");
		setVelocityEngine(velocity);
		
		getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) {
				
				LOGGER.info("Executing sendRegistryEntryExpireNotifications");
				Query q = session.createQuery("from RegistryEntry e where (e.expiryNotificationSent = false or e.expiryNotificationSent is null) and"
						+ "  date_trunc('day',e.validUntil) >= (current_date + "+((int)Math.floor((getDaysAfterRegistryEntryExpiry())))+") AND date_trunc('day',e.validUntil) <= (current_date + "+getDaysBeforeRegistryEntryExpiry()+")");

				
				Map<Enterprise, List<RegistryEntry>> entriesMap = new HashMap<Enterprise, List<RegistryEntry>>();
				
				int count = 0; int mitmes = 0;
				boolean all = false;
				while(!all) {
					q.setFirstResult(count);
					q.setMaxResults(1000);
					List entries = q.list();
					if(entries.isEmpty()) {
						break;
					}
					
					LOGGER.info("Number of notifications to be sent:"+entries.size());
					for(Object entrant : entries) {
						final RegistryEntry entry = (RegistryEntry)entrant;
						
						if(entry == null){
							continue;
						}
						
						RegistryApplication appl =  entry.getApplication();
						if(appl == null){
							continue;
						}
						final Enterprise applicant = appl.getApplicant();
						
						if(applicant == null){
							continue;
						}
						
						if (entriesMap.containsKey(applicant)) {
							entriesMap.get(applicant).add(entry);
						} else {
							List entriesList = new ArrayList<RegistryEntry>();
							entriesList.add(entry);
							entriesMap.put(applicant, entriesList);
						}
					}
						
					for(Enterprise entrant : entriesMap.keySet()) {
						mitmes++;
						
						if(isTest() && mitmes >= getTestNotificationAmount()) {
							all = true;
							break;
						}
						
						final Enterprise applicant = entrant;
						final List<RegistryEntry> regentries = entriesMap.get(applicant);
						
						String to = "";
						if(isTest()) {
							to = getTestNotificationMail();
						}
						else if(applicant != null && applicant.getContactInfo() != null && applicant.getContactInfo().getEmail() != null) {
							to = applicant.getContactInfo().getEmail();
						}
						final String to_mail = to.trim();
						
						if(to_mail.length() != 0) {
							try {
								LOGGER.info("messagePreparator");
								MimeMessagePreparator preparator = new MimeMessagePreparator() {
							         public void prepare(MimeMessage mimeMessage) throws Exception {
							        	 
							            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
							            
							            message.setSubject("Riikliku alkoholiregistri registrikande kehtivuse kaotamisest teavitamine");
							            message.setTo(to_mail);
							            
							            if(!isTest()) {
								            String[] bccAddresses = {"olle@piksel.ee", "alkoreg@vet.agri.ee"};
								            message.setBcc(bccAddresses);
							            }
							            
							            message.setFrom(EmailNotificationJobs.this.getMailFrom()); 
								        Map<String, Object> model = new HashMap();
							            
							            Calendar cal = Calendar.getInstance();
							            String DATE_FORMAT = "dd.MM.yyyy";
							            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
							            
							            model.put("current_date", sdf.format(cal.getTime()));
							            model.put("applicant", applicant);
							            model.put("regentries", regentries);
							            
								        String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, Paths.get(System.getProperty("catalina.base") + "/webapps/ROOT/regentryExpiry.vm").toString(), "UTF-8", model);
							            // testimisel olenevalt confist on vaja ainult ette anda template nimi
								        //String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "regentryExpiry.vm", "UTF-8", model);
							            
								        message.setText(text, true);
							           
							         }
						        };
						        
						        LOGGER.info(EmailNotificationJobs.this.getMailSender().toString());
					        	EmailNotificationJobs.this.getMailSender().send(preparator);
					        	for (RegistryEntry entry : regentries) {
					        		entry.setExpiryNotificationSent(true);
					        	}
					        	LOGGER.info("Notification sent to " + applicant.getName() + "," + applicant.getRegistrationId()	+ "," + to_mail);
					        	
					        	Transaction tx = session.beginTransaction();
					        	session.flush();
								tx.commit();
					        } catch (Exception ex) {
					        	LOGGER.info("Sending regentry expiry notification to enterprise '" + applicant.getName()+","+applicant.getRegistrationId() + "' failed: ");
					        	LOGGER.error("Sending regentry expiry notification to enterprise '" + applicant.getName()+","+applicant.getRegistrationId() + "' failed: ", ex);
					        	System.out.println("Mail error:"+ex.getMessage());
					        	all = true;
					        }
						} else{
							LOGGER.info("Sending notification to "+applicant.getName()+","+applicant.getRegistrationId()+" failed, e-mail missing!");
						}
						
					}
					count += entries.size();
				}
				LOGGER.info("Notification service complete");
				return null;
			}
		});
		LOGGER.info("lõpetas");
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}


	public VelocityEngine getVelocityEngine() {
		return velocityEngine;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailForm) {
		this.mailFrom = mailForm;
	}

	public int getDaysBeforeRegistryEntryExpiry() {
		return daysBeforeRegistryEntryExpiry;
	}

	public void setDaysBeforeRegistryEntryExpiry(int daysBeforeRegistryEntryExpiry) {
		this.daysBeforeRegistryEntryExpiry = daysBeforeRegistryEntryExpiry;
	}
	
	public int getDaysAfterRegistryEntryExpiry() {
		return daysAfterRegistryEntryExpiry;
	}

	public void setDaysAfterRegistryEntryExpiry(int daysAfterRegistryEntryExpiry) {
		this.daysAfterRegistryEntryExpiry = daysAfterRegistryEntryExpiry;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public String getTestNotificationMail() {
		return testNotificationMail;
	}

	public void setTestNotificationMail(String testNotificationMail) {
		this.testNotificationMail = testNotificationMail;
	}

	public int getTestNotificationAmount() {
		return testNotificationAmount;
	}

	public void setTestNotificationAmount(int testNotificationAmount) {
		this.testNotificationAmount = testNotificationAmount;
	}

	public boolean isTest() {
		return isTest;
	}

	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}

}
