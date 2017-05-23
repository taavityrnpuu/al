package ee.agri.alkor.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SearchViewId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	private Long productId;
	
	private Long applicationId;
	
	private Long producerId;
	
	private Long applicantId;
	
	private Long marketerId;
	
	private Long importerId;
	
	@Column(name="PRODUCT_ID")
	public Long getProductId() {
		return productId;
	}
	
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	@Column(name="APPLICATION_ID")
	public Long getApplicationId() {
		return applicationId;
	}
	
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	@Column(name="PRODUCER_ID")
	public Long getProducerId() {
		return producerId;
	}
	
	public void setProducerId(Long producerId) {
		this.producerId = producerId;
	}
	
	@Column(name="APPLICANT_ID")
	public Long getApplicantId() {
		return applicantId;
	}
	
	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}
	
	@Column(name="MARKETER_ID")
	public Long getMarketerId() {
		return marketerId;
	}
	
	public void setMarketerId(Long marketerId) {
		this.marketerId = marketerId;
	}
	
	@Column(name="IMPORTER_ID")
	public Long getImporterId() {
		return importerId;
	}
	
	public void setImporterId(Long importerId) {
		this.importerId = importerId;
	}
	
}