package ee.agri.alkor.impl;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryEntry;

public class ExendUntilApplicationExpiryNotificationJobs extends
		HibernateDaoSupport {
	
	private static Logger LOGGER = Logger.getLogger(ExendUntilApplicationExpiryNotificationJobs.class);
	
	private static final String LIVE_MODE = "LIVE";
	
	private String mailFrom;
	/**
	 * Mitu päeva enne kande kehtivus lakkamist sonum saata.
	 */
	private int daysBeforeNotificationIsSent;
	
	private String mode;
	
	private JavaMailSender mailSender;
	
	private VelocityEngine velocityEngine;
	
	
	/**
	 * Sends notification emails to processors whose extended until applications  expire after given days
	 */
	public void sendExendUntilApplicationExpiryNotifications() {
		final Calendar expireDate = Calendar.getInstance();
		expireDate.add(Calendar.DAY_OF_YEAR, getDaysBeforeNotificationIsSent());
		LOGGER.debug("sendExendUntilApplicationExpiryNotifications mode:"+getMode());
		
		if(!LIVE_MODE.equals(getMode())){
			LOGGER.info("sendExendUntilApplicationExpiryNotifications not live mode - execution halted");
			return;
		}
		
		getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) {
				LOGGER.debug("Executing sendExendUntilApplicationExpiryNotifications");
				
				Query q = session.createQuery("from RegistryApplication e where e.decision.extendUntilDate is not null and date_trunc('day',e.decision.extendUntilDate) = (current_date + "+getDaysBeforeNotificationIsSent()+")");
				
				Map<Person, List<RegistryApplication>> entriesMap = new HashMap<Person, List<RegistryApplication>>();
				
				int count = 0;
				boolean all = false;
				while(!all) {
					q.setFirstResult(count);
					q.setMaxResults(100);
					List entries = q.list();
					if(entries.size() == 0) break;
					
					LOGGER.info("Number of notifications to be sent:"+entries.size());
					for(Iterator it = entries.iterator();it.hasNext();) {
						final RegistryApplication application = (RegistryApplication)it.next();
						
						final Person processor = application.getProcessor();
						
						if (entriesMap.containsKey(processor)) {
							entriesMap.get(processor).add(application);
						} else {
							List applicationsList = new ArrayList<RegistryApplication>();
							applicationsList.add(application);
							entriesMap.put(processor, applicationsList);
						}
						
					}
					
					for(Iterator it = entriesMap.keySet().iterator(); it.hasNext();) {
						final Person applicationProcesor = (Person)it.next();
						final List<RegistryApplication> processorApplications = (List<RegistryApplication>)entriesMap.get(applicationProcesor);
						if(applicationProcesor != null && applicationProcesor.getContactInfo() != null && applicationProcesor.getContactInfo().getEmail() != null) {
							MimeMessagePreparator preparator = new MimeMessagePreparator() {
						         public void prepare(MimeMessage mimeMessage) throws Exception {
						            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
									message.setSubject("Menetluses kuni taotluste kehtivuse l&otilde;ppemine");
									//message.setTo("tiit@piksel.ee");
									message.setTo(applicationProcesor.getContactInfo().getEmail());
									/*
									 * 14-01-2014 parandus
									 */
									String[] bccAddresses = {"tanja@piksel.ee", "alkoreg@vet.agri.ee"};
									message.setBcc(bccAddresses);
									
									//message.setBcc("nastja@piksel.ee");
									//message.setBcc("alkoreg@vet.agri.ee");
									
									
									message.setFrom(ExendUntilApplicationExpiryNotificationJobs.this.getMailFrom()); 
									Map<String, Object> model = new HashMap();
									
									Calendar cal = Calendar.getInstance();
									String DATE_FORMAT = "dd.MM.yyyy";
									SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
									
									
									model.put("current_date", sdf.format(cal.getTime()));
									model.put("processor", applicationProcesor);
									model.put("processorApplications", processorApplications);
									
									VelocityContext velocityContext = new VelocityContext();
									for (Map.Entry<String, Object> entry : model.entrySet()) {
										velocityContext.put(entry.getKey(), entry.getValue());
									}
									StringWriter text = new StringWriter();
									velocityEngine.mergeTemplate(System.getProperty("catalina.base") + "/webapps/ROOT/extendUntilExpiry.vm", "UTF-8", velocityContext, text);
							        message.setText(text.toString(), true);
							   }
							};
							try {
								ExendUntilApplicationExpiryNotificationJobs.this.getMailSender().send(preparator);
								
								LOGGER.info("Notification sent to " + applicationProcesor.getFirstName() + " " + applicationProcesor.getLastName()
									+ "," + applicationProcesor.getContactInfo().getEmail());
							} catch (Exception ex) {
								LOGGER.error("Sending extend until notification to processor '" +
								applicationProcesor.getFirstName() + " " + applicationProcesor.getLastName() + "' failed: ", ex);
								LOGGER.info("Mail error:" + ex.getMessage());
						    	all = true;
						    }
						} else {
							LOGGER.info("Sending notification to " + applicationProcesor.getFirstName() + " " + applicationProcesor.getLastName() + " failed, e-mail missing!");
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


	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getDaysBeforeNotificationIsSent() {
		return daysBeforeNotificationIsSent;
	}

	public void setDaysBeforeNotificationIsSent(int daysBeforeNotificationIsSent) {
		this.daysBeforeNotificationIsSent = daysBeforeNotificationIsSent;
	}

}
