package ee.agri.alkor.impl;


import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class ResetDecisionNumber extends HibernateDaoSupport {	
	
	public void reset(){
		/**
		 * Resetib iga aasta alguses otsuse numbri
		 *
		 */
		
		
	}
	
}
