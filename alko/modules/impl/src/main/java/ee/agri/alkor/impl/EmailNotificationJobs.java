package ee.agri.alkor.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.ui.velocity.VelocityEngineUtils;

import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.RegistryEntry;

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
	
	private String mode;
	
	private JavaMailSender mailSender;
	
	private VelocityEngine velocityEngine;
	
	/*
	 * 
	 * VT bug2922
	 * 
	 */
	
	public void sendRegistryEntryExpireNotifications() {
		
		final Calendar expireDate = Calendar.getInstance();
		expireDate.add(Calendar.DAY_OF_YEAR, getDaysBeforeRegistryEntryExpiry());
		if(!LIVE_MODE.equals(getMode())){
			LOGGER.info("sendRegistryEntryExpireNotifications not live mode - execution halted");
			return;
		}
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) {
				
				LOGGER.info("Executing sendRegistryEntryExpireNotifications");
				Query q = session.createQuery("from RegistryEntry e where (e.expiryNotificationSent = false or e.expiryNotificationSent is null) and date_trunc('day',e.validUntil) = (current_date + "+getDaysBeforeRegistryEntryExpiry()+")");

				
				Map<Enterprise, List<RegistryEntry>> entriesMap = new HashMap<Enterprise, List<RegistryEntry>>();
				
				int count = 0;
				boolean all = false;
				while(!all) {
					q.setFirstResult(count);
					q.setMaxResults(1000);
					List entries = q.list();
					if(entries.size() == 0) break;
					LOGGER.info("Number of notifications to be sent:"+entries.size());
					for(Iterator it = entries.iterator();it.hasNext();) {
						final RegistryEntry entry = (RegistryEntry)it.next();
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
					for (Iterator it = entriesMap.keySet().iterator(); it.hasNext();) {
						final Enterprise applicant = (Enterprise)it.next();
						final List<RegistryEntry> regentries = (List<RegistryEntry>)entriesMap.get(applicant);
						if(applicant != null && applicant.getContactInfo() != null && applicant.getContactInfo().getEmail() != null) {
							MimeMessagePreparator preparator = new MimeMessagePreparator() {
						         public void prepare(MimeMessage mimeMessage) throws Exception {
						            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
						            message.setSubject("Riikliku alkoholiregistri registrikande kehtivuse kaotamisest teavitamine");
						            message.setTo(applicant.getContactInfo().getEmail());
						            String[] bccAddresses = {"tanja@piksel.ee", "alkoreg@vet.agri.ee"};
						            
						            message.setBcc(bccAddresses);
						            message.setFrom(EmailNotificationJobs.this.getMailFrom()); 
						            Map model = new HashMap();
						            
						            Calendar cal = Calendar.getInstance();
						            String DATE_FORMAT = "dd.MM.yyyy";
						            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
						            
						            
						            model.put("current_date", sdf.format(cal.getTime()));
						            model.put("applicant", applicant);
						            model.put("regentries", regentries);
						            String text = VelocityEngineUtils.mergeTemplateIntoString(
						               velocityEngine, "regentryExpiry.vm", "UTF-8", model);
						            message.setText(text, true);
						            
						            }
					        };
					        try {
					        	EmailNotificationJobs.this.getMailSender().send(preparator);
					        	for (RegistryEntry entry : regentries) {
					        		entry.setExpiryNotificationSent(new Boolean(true));
					        		
					        	}
					        	LOGGER.info("Notification sent to "+applicant.getName()
				        				+","+applicant.getRegistrationId()
				        					+","+applicant.getContactInfo().getEmail());
					        	
					        	session.flush();
					        } catch (Exception ex) {
					        	LOGGER.error("Sending regentry expiry notification to enterprise '" +
					        			applicant.getName()+","+applicant.getRegistrationId() + "' failed: ", ex);
					        	LOGGER.error("Mail error:"+ex.getMessage());
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

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
