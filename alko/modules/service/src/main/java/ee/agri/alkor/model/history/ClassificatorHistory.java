/**
 *
 */
package ee.agri.alkor.model.history;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * Classificator History
 * @author kaupo
 *
 */
@Entity
@Table(name = "CLASSIFICATOR_HISTORY")
@javax.persistence.SequenceGenerator(name = "CLASSIFICATOR_HIST_SEQ", sequenceName = "CLASSIFICATOR_HIST_SEQ", allocationSize = 1)
public class ClassificatorHistory extends ABaseBean implements IHistoryEntity {

    private Long histId;

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
    
    private Integer orderNr;
    
    
    /*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLASSIFICATOR_HIST_SEQ")
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

    /**
     * Getter for id.
     *
     * @return id
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for id.
     *
     * @param aId
     *            id
     */
    public void setId(Long aId) {
        this.id = aId;
    }

    /**
     *
     * @return
     */
    @Column(name = "CAT_NAME", length = 40)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @hibernate.property column="CODE" length="10"
     * @return String
     */

    @Column(name = "CODE", length = 64)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String
     */

    @Column(name = "NAME", length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "VALID_FROM")
    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    @Column(name = "VALID_UNTIL")
    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    @Column(name = "SYSTEM_CLASS")
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

}
