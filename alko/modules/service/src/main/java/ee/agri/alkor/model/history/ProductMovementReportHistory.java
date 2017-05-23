/**
 *
 */
package ee.agri.alkor.model.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * ProductMovementReport History
 * @author kaupo
 *
 */
@Entity
@Table(name = "PRODUCT_MOVE_REPORT_HISTORY")
@javax.persistence.SequenceGenerator(name = "PRODUCT_MOVE_REPORT_HIST_SEQ", sequenceName = "PRODUCT_MOVE_REPORT_HIST_SEQ", allocationSize = 1)
public class ProductMovementReportHistory extends ABaseBean implements
		IHistoryEntity {

	private Long histId;

	private Long id;

	/**
     * laadiva asutuse registrikood
     */
	private String loadingEnterpriseRegNr; //Enterprise

	/**
     * laadiva isiku isikukood.
     */
	private String loadingUserId; //SystemUser

	/**
     * aruande esitanud firma.
     */
	private Long reportingEnterprise; //Enterprise


	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_MOVE_REPORT_HIST_SEQ")
	public Long getHistId() {
		return this.histId;
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#setHistId(java.lang.Long)
     */
	public void setHistId(Long histId) {
		this.histId = histId;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="LOAD_ENTERPRISE_ID", length=40)
	public String getLoadingEnterpriseRegNr() {
		return loadingEnterpriseRegNr;
	}

	public void setLoadingEnterpriseRegNr(String loadingEnterpriseRegNr) {
		this.loadingEnterpriseRegNr = loadingEnterpriseRegNr;
	}

	@Column(name="LOAD_PERSON_ID", length=16)
	public String getLoadingUserId() {
		return loadingUserId;
	}

	public void setLoadingUserId(String loadingUserId) {
		this.loadingUserId = loadingUserId;
	}

	@Column(name="REPORT_ENT_ID")
	public Long getReportingEnterprise() {
		return reportingEnterprise;
	}

	public void setReportingEnterprise(Long reportingEnterprise) {
		this.reportingEnterprise = reportingEnterprise;
	}

}
