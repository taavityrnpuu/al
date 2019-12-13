package ee.agri.alkor.model;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OptimisticLockType;

import ee.agri.alkor.model.history.IHistorical;
/**
 *
 * @author ivar
 *
 */
@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
        optimisticLock = OptimisticLockType.DIRTY)
@Table(name="PRODUCT_MOVE_REPORT")
public class ProductMovementReport
    implements IEntity, IClassificatorAware, IHistorical {

    private Long id;

    /**
     * The timestamp of the creation.
     */
    private Date created;

    /**
     * Report date
     */

    private Date repDate;
   /**
     * laadiva asutuse registrikood.
     */
    private String loadingEnterpriseRegNr;
    /**
     * laadiva isiku isikukood.
     */
    private String loadingUserId;
    /**
     * aruande esitanud firma.
     */
    private Enterprise reportingEnterprise;

    private Set productMovementReportRecords = new HashSet();

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_MOVE_REPORT_SEQ")
    @javax.persistence.SequenceGenerator(
    name="PRODUCT_MOVE_REPORT_SEQ",
    sequenceName="PRODUCT_MOVE_REPORT_SEQ",
    allocationSize=1
    )
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="CREATED")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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


    @ManyToOne (cascade = CascadeType.REFRESH)
    @JoinColumn(name="REPORT_ENT_ID")
    @ForeignKey(name="FK_REPORT_ENT")
    public Enterprise getReportingEnterprise() {
        return reportingEnterprise;
    }

    public void setReportingEnterprise(Enterprise reportingEnterprise) {
        this.reportingEnterprise = reportingEnterprise;
    }

    @OneToMany(mappedBy="report", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    public Set<ProductMovementReportRecord> getProductMovementReportRecords() {
        return productMovementReportRecords;
    }

    public void setProductMovementReportRecords(Set productMovementReportRecords) {
        this.productMovementReportRecords = productMovementReportRecords;
    }

    public void addRecord(ProductMovementReportRecord record) {
        getProductMovementReportRecords().add(record);
        record.setReport(this);
    }

    @Column(name = "REPORT_DATE")
    public Date getRepDate() {
       return repDate;
    }

    public void setRepDate(Date repDate) {
       this.repDate = repDate;
    }


    public static final String _RECORDS = "records";
       public static final String _PERIOD = "period";
       public static final String _CONTACTS = "contacts";

    @Transient
    public String getRecords() {
    	return Integer.toString(getProductMovementReportRecords() != null ? getProductMovementReportRecords().size() : 0);
    }

    @Transient
    public String getPeriod(){
    	 if(getRepDate() == null)
  	   {
  		   return "-";
  	   }
  	   Calendar calendar = Calendar.getInstance();
  	   calendar.setTime(getRepDate());
       String period = calendar.get(Calendar.YEAR) + ", " + calendar.get(Calendar.MONTH);
         
       return period;
    }

    @Transient
    public String getContacts() {
    	if(getReportingEnterprise() != null && getReportingEnterprise().getContactInfo() != null) {
    		String phone = getReportingEnterprise().getContactInfo().getPhone();
            String mobile = getReportingEnterprise().getContactInfo().getMobile();
            String email = getReportingEnterprise().getContactInfo().getEmail();
            String fax = getReportingEnterprise().getContactInfo().getFax();
            StringBuffer contacts = new StringBuffer();
            contacts.append((phone != null) ? phone + ", " : "");
            contacts.append((mobile != null) ? mobile + ", " : "");
            contacts.append((email != null) ? email + ", " : "");
            contacts.append((fax != null) ? fax : "");
            return contacts.toString();
    	} else {
    		return null;
    	}
    }


}
