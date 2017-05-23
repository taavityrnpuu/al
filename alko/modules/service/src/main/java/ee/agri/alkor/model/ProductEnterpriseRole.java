package ee.agri.alkor.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.classes.EnterpriseRole;
import ee.agri.alkor.model.classes.SystemGroup;
import ee.agri.alkor.model.history.IHistorical;
/**
 * Ettevotte kui subjekti roll toote
 * seisukohalt.
 *
 * @author ivar
 *
 */
@Entity
@Table(name="ENTERPRISE_ROLE")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class ProductEnterpriseRole extends ABaseBean
	implements IClassificatorAware, IHistorical {
    /**
     * The id of the entity.
     */
    private Long id;
    /**
     * Reference to  enterprise.
     */
    private Enterprise enterprise;
    /**
     * Reference to EnterpriseRole classificator.
     */
    private EnterpriseRole enterpriseRoleClass;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENTERPRISE_ROLE_SEQ")
	@javax.persistence.SequenceGenerator(
    name="ENTERPRISE_ROLE_SEQ",
    sequenceName="ENTERPRISE_ROLE_SEQ",
    allocationSize=1
	)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="ENTERPRISE_ID")
	@ForeignKey(name="FK_ENTERPRISE_ROLE_ENT")
	public Enterprise getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="ENT_ROLE_ID")
	@ForeignKey(name="FK_ENT_ROLE_CLASS")
	public EnterpriseRole getEnterpriseRoleClass() {
		return enterpriseRoleClass;
	}
	public void setEnterpriseRoleClass(EnterpriseRole roleClass) {
		this.enterpriseRoleClass = roleClass;
	}

}
