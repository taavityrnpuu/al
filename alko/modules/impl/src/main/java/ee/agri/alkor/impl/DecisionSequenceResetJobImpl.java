package ee.agri.alkor.impl;

import java.sql.ResultSet;
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
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryEntry;

public class DecisionSequenceResetJobImpl extends HibernateDaoSupport {

	private static Logger LOGGER = Logger.getLogger(DecisionSequenceResetJobImpl.class);

	public void resetSequence() {

		LOGGER.info("Executing decisionSequenceResetJobImpl resetSequence");

		try {
			boolean failed = PostgreUtils.update("SELECT setval('public.decision_seq', 1, false);");
			if (failed) {
				LOGGER.info("sequence reset failed");
			} else {
				LOGGER.info("sequence reset successful");
			}
		} catch (Exception x) {
			LOGGER.info("sequence reset failed: " + x.getMessage());
			x.printStackTrace();
		}
	}
}
