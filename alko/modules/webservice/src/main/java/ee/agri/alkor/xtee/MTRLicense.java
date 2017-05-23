package ee.agri.alkor.xtee;

import java.io.Serializable;
import java.util.Date;
/**
 * MTR tegevusloa DTO klass.
 * 
 * @author suisalu
 *
 */
public class MTRLicense implements Serializable {

	/**
	 * Tegevusloa MTR nr.
	 */
	private String nr;
	/**
	 * Tegevusloa KP.
	 */
	private Date date;
	/**
	 * Tegevusala
	 */
	private String businessName;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
}
