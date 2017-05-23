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
 * ProductEnterpriseRole History
 * @author kaupo
 *
 */
@Entity
@Table(name = "ENTERPRISE_ROLE_HISTORY")
@javax.persistence.SequenceGenerator(name = "ENTERPRISE_ROLE_HIST_SEQ", sequenceName = "ENTERPRISE_ROLE_HIST_SEQ", allocationSize = 1)
public class ProductEnterpriseRoleHistory extends ABaseBean implements
		IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -5441088181037745861L;

	/**
     * The id of the entity.
     */
	private Long id;

	/**
     * Reference to enterprise.
     */
	private Long enterprise; //Enterprise

	/**
     * Reference to EnterpriseRole classificator.
     */
	private String enterpriseRoleClass;

	private Long histId;

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENTERPRISE_ROLE_HIST_SEQ")
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

	@Column(name="ENTERPRISE_ID")
	public Long getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Long enterprise) {
		this.enterprise = enterprise;
	}

	@Column(name="ENT_ROLE")
	public String getEnterpriseRoleClass() {
		return enterpriseRoleClass;
	}

	public void setEnterpriseRoleClass(String roleClass) {
		this.enterpriseRoleClass = roleClass;
	}

}
