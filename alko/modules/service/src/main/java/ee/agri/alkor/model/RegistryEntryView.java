/**
 * 
 */
package ee.agri.alkor.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ee.agri.alkor.model.classes.Capacity;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.ProductType;

/**
 * Class that wraps the view reg_entry_view
 * @author Kaupo Parmas
 *
 */
@Entity
@Table(name="reg_entry_view"
    ,schema="public"
)
public class RegistryEntryView implements Serializable {

	/**
	 * 
	 * entry ID
	 */
	private Long id;
	
	/**
	 * product name
	 */
	private String productName;
	
	/**
	 * product origin country
	 */
	private Country productCountry;
	
	/**
	 * product type
	 */
	private ProductType productType;
	
	/**
	 * product notes
	 */
	private String productNotes;
	
	/**
	 * product capacity
	 */
	private Capacity capacity;
	
	/**
	 * product ethanol rate
	 */
	private BigDecimal ethanolRate;
	
	/**
	 * producer name
	 */
	private String producerName;
	
	/**
	 * Producer country
	 */
	private Country country;
	
	/**
	 * Reg_entry valid_from
	 */
	private Date validFrom;
	
	/**
	 * Reg_entry valid_until
	 */
	private Date validUntil;
	
	/**
	 * Reg_entry nr
	 */
	private String nr;
	
	/**
	 * Applicant name
	 */
	private String applicantName;
	
	private Date decisionDate;
	
	private String publicDocCount;

	
	
	/**
	 * @return the id
	 */
	@Id
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the productName
	 */
	@Column(name="prod_name")
	public String getProductName() {
		return productName;
	}
	
	@Column(name="public_doc_count")
	public String getPublicDocCount() {
		return publicDocCount;
	}
	
	
	public void setPublicDocCount(String publicDocCount) {
		this.publicDocCount = publicDocCount;
	}
	
	

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productCountry
	 */
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="PROD_ORG_COUNTRY_CLASS_ID")
	public Country getProductCountry() {
		return productCountry;
	}

	/**
	 * @param productCountry the productCountry to set
	 */
	public void setProductCountry(Country productCountry) {
		this.productCountry = productCountry;
	}

	/**
	 * @return the productType
	 */
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="PROD_CLASS_ID")
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/**
	 * @return the productNotes
	 */
	@Column(name="prod_notes")
	public String getProductNotes() {
		return productNotes;
	}

	/**
	 * @param productNotes the productNotes to set
	 */
	public void setProductNotes(String productNotes) {
		this.productNotes = productNotes;
	}

	/**
	 * @return the capacity
	 */
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="CAPACITY_CLASS_ID")
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the ethanolRate
	 */
	@Column(name="ETHANOL_RATE", precision = 4, scale = 1)
	public BigDecimal getEthanolRate() {
		if(ethanolRate != null) {
			ethanolRate.setScale(1,BigDecimal.ROUND_DOWN);
		}
		return ethanolRate;
	}

	/**
	 * @param ethanolRate the ethanolRate to set
	 */
	public void setEthanolRate(BigDecimal ethanolRate) {
		this.ethanolRate = ethanolRate;
	}

	/**
	 * @return the producerName
	 */
	@Column(name="pe_name")
	public String getProducerName() {
		return producerName;
	}

	/**
	 * @param producerName the producerName to set
	 */
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	/**
	 * @return the country
	 */
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="PE_COUNTRY_CLASS_ID")
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the validFrom
	 */
	@Column(name="VALID_FROM")
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validUntil
	 */
	@Column(name="VALID_UNTIL")
	public Date getValidUntil() {
		return validUntil;
	}

	/**
	 * @param validUntil the validUntil to set
	 */
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

	/**
	 * @return the nr
	 */
	public String getNr() {
		return nr;
	}

	/**
	 * @param nr the nr to set
	 */
	public void setNr(String nr) {
		this.nr = nr;
	}

	/**
	 * @return the applicantName
	 */
	@Column(name="AE_NAME")
	public String getApplicantName() {
		return applicantName;
	}

	/**
	 * @param applicantName the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	@Column(name="decision_date")
	public Date getDecisionDate() {
		return decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}
	
	
	
}
