/**
 *
 */
package ee.agri.alkor.model.history;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Address History
 * @author Kaupo Parmas
 */
@Embeddable
public class AddressHistory implements Serializable {

	private String country;

	private String district;
	/**
	 * Linn, kyla vm.
	 */
	private String orgUnit;

	private String postalIndex;

	private String town;

	private String street;

	private String house;

	private String appartmentNr;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name="DISTRICT", length=100)
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name="ORG_UNIT", length=100)
	public String getOrgUnit() {
		return orgUnit;
	}

	public void setOrgUnit(String orgUnit) {
		this.orgUnit = orgUnit;
	}

	@Column(name="ZIP", length=10)
	public String getPostalIndex() {
		return postalIndex;
	}

	public void setPostalIndex(String postalIndex) {
		this.postalIndex = postalIndex;
	}

	/**
	 * @return the appartmentNr
	 */
	@Column(name="APPARTMENT_NR", length=10)
	public String getAppartmentNr() {
		return appartmentNr;
	}

	/**
	 * @param appartmentNr the appartmentNr to set
	 */
	public void setAppartmentNr(String appartmentNr) {
		this.appartmentNr = appartmentNr;
	}

	/**
	 * @return the city
	 */
	@Column(name="TOWN", length=50)
	public String getTown() {
		return town;
	}

	/**
	 * @param city the city to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the house
	 */
	@Column(name="HOUSE", length=10)
	public String getHouse() {
		return house;
	}

	/**
	 * @param house the house to set
	 */
	public void setHouse(String house) {
		this.house = house;
	}

	/**
	 * @return the street
	 */
	@Column(name="STREET", length=100)
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

}
