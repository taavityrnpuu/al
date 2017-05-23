package ee.agri.alkor.xtee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * MTR ja EMTA päringute tulemus andmete DTO.
 * 
 * @author suisalu
 *
 */
public class MtrAndCustomsQueryResult implements Serializable {
	
	/**
	 * Ettevotte ariregistri kood.
	 */
	private String eneterPriseRegistrationNr;
	/**
	 * Ettvotte registreerimis KP MTR -is.
	 */
	private Date mtrRegstrationDate;
	/**
	 * Aktsiisiloa kehtivuse algus KP.
	 */
	private Date exciseLicenseValidDate;
	/**
	 * MTR tegevusload.
	 */
	private List<MTRLicense>  mtrLicenses = new ArrayList<MTRLicense>();
	
	
	public String getEneterPriseRegistrationNr() {
		return eneterPriseRegistrationNr;
	}
	public void setEneterPriseRegistrationNr(String eneterPriseRegistrationNr) {
		this.eneterPriseRegistrationNr = eneterPriseRegistrationNr;
	}
	public Date getExciseLicenseValidDate() {
		return exciseLicenseValidDate;
	}
	public void setExciseLicenseValidDate(Date exciseLicenseValidDate) {
		this.exciseLicenseValidDate = exciseLicenseValidDate;
	}
	
	public List<MTRLicense> getMtrLicenses() {
		return mtrLicenses;
	}
	public void setMtrLicenses(List<MTRLicense> mtrLicenses) {
		this.mtrLicenses = mtrLicenses;
	}
	public Date getMtrRegstrationDate() {
		return mtrRegstrationDate;
	}
	public void setMtrRegstrationDate(Date mtrRegstrationDate) {
		this.mtrRegstrationDate = mtrRegstrationDate;
	}

	public void addLicense(MTRLicense license) {
		getMtrLicenses().add(license);
	}
}
