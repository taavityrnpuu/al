package ee.agri.alkor.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.classes.Country;

/**
 * Address component used in entities.
 *
 * @author ivar
 */
@Embeddable
public class Address
	implements IClassificatorAware {

	private Country country;

	private String district;
	/**
	 * Linn, kyla vm.
	 */
	private String orgUnit;
	/**
	 * Tänav, maja jne.
	 */

	private String postalIndex;

	private String town;

	private String street;

	private String house;

	private String appartmentNr;

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="COUNTRY_CLASS_ID")
	@ForeignKey(name="FK_ADDR_COUNTRY_CLASS")
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
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

	@Transient
	public String getAddress() {
		StringBuffer sb = new StringBuffer();
		if(getStreet() != null && getStreet().length() != 0) {
			sb.append(getStreet());
		}
		if(getHouse() != null && getHouse().length() != 0) {
			sb.append(getHouse());
		}
		if(getAppartmentNr() != null && getAppartmentNr().length() != 0) {
			sb.append("-" + getAppartmentNr());
		}
		return sb.toString();
	}

}
