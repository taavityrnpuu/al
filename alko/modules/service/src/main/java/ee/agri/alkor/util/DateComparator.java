package ee.agri.alkor.util;

import java.util.Comparator;
import java.util.Date;

import ee.agri.alkor.model.PaymentMatchingLog;

/**
 * Compares created fields of PaymentMatchingLog objects and considers later date as greater
 * @author rolandv
 *
 */
public class DateComparator implements Comparator {

	public int compare(Object arg0, Object arg1) {
		
		
		Date first = ((PaymentMatchingLog) arg0).getCreated();
		Date second = ((PaymentMatchingLog) arg1).getCreated();
		if(first.equals(second))
			return 0;
		else if(first.before(second))
			return 1;
		else 
			return -1;
	}

}
