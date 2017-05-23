package ee.agri.alkor.model.classes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.history.IHistorical;
/**
 *
 * @author suisalu
 *
 */
@Entity
@Table(name="CLASSIFICATOR",
		uniqueConstraints = {@UniqueConstraint(columnNames={"CATEGORY", "CODE"})})
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="CATEGORY", length=32,
    discriminatorType=DiscriminatorType.STRING
)
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Classificator extends ABaseBean implements IHistorical{


	/**
     * The id of the entity.
     */
    private Long id;

    private String categoryName;

	private String code;

	private String name;

	/**
	 * Kehtivuse algus
	 */
	private Date validFrom;
	/**
	 * Kehtivuse lopp
	 */
	private Date validUntil;

	/**
	 * Systeemne klassifikaator.
	 */
	private Boolean systemClass;

	private Boolean active;
	/**
	 * Järjestamise number
	 */
	private Integer orderNr;
	private Integer orderNrVta;

	public Classificator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classificator(String code) {
		super();
		this.code = code;
	}

    /**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLASSIFICATOR_SEQ")
	@javax.persistence.SequenceGenerator(
    name="CLASSIFICATOR_SEQ",
    sequenceName="CLASSIFICATOR_SEQ",
    allocationSize=1
	)
    public Long getId() {
        return id;
    }

    /**
     * Setter for id.
     * @param aId id
     */
    public void setId(Long aId) {
        this.id = aId;
    }

    /**
     *
     * @return
     */
    @Column(name="CAT_NAME", length=40)
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	/**
	 * @hibernate.property  column="CODE" length="10"
	 * @return String
	 */

    @Column(name="CODE", length=64)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return String
	 */

    @Column(name="NAME", length=128)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    @Column(name="VALID_FROM")
	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

    @Column(name="VALID_UNTIL")
	public Date getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

    @Column(name="SYSTEM_CLASS")
	public Boolean getSystemClass() {
		return systemClass;
	}

	public void setSystemClass(Boolean systemClass) {
		this.systemClass = systemClass;
	}

	@Column(name="ACTIVE")
	public Boolean getActive(){
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@Column(name="ORDER_NR")
	public Integer getOrderNr() {
		return orderNr;
	}

	public void setOrderNr(Integer orderNr) {
		this.orderNr = orderNr;
	}
	
	@Column(name="ORDER_NR_VTA")
	public Integer getOrderNrVta() {
		return orderNrVta;
	}

	public void setOrderNrVta(Integer orderNrVta) {
		this.orderNrVta = orderNrVta;
	}
	
	@Override
	public String toString() {
		return "Classificator - code: "+ getCode() +
			" ,category: "+ getCategoryName() +
			" ,id: " + getId();
	}
}
