package ee.agri.alkor.model.classes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import ee.agri.alkor.model.ABaseBean;
/**
 * Entity which maps directly into
 * CLASSIFICATOR table without subclassing.
 *
 * @author suisalu
 *
 */
@Entity
@Table(name="CLASSIFICATOR",
		uniqueConstraints = {@UniqueConstraint(columnNames={"CATEGORY", "CODE"})})

public class ClassificatorRow extends ABaseBean {

	/**
     * The id of the entity.
     */
    private Long id;

    private String category;

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

    @Column(name="CATEGORY", length=32)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
}
