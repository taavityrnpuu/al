package ee.agri.alkor.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="report_view"
    ,schema="public"
)
public class ReportView  implements java.io.Serializable {

     private Long id;
     private Long reportEntId;
     private String loadEnterpriseId;
     private String name;
     private String regId;
     private String phone;
     private String mobile;
     private String email;
     private String fax;
     private String period;
     private String contacts;
     private Date created;
     private String loadPersonId;
     private Long total;
     private Date reportDate;

    public ReportView() {
    }

    public ReportView(Long id, Long reportEntId, String loadEnterpriseId, String name, String regId, String phone, String mobile, String email, String fax, Date created, Date reportDate, String loadPersonId, Long total) {
       this.id = id;
       this.reportEntId = reportEntId;
       this.loadEnterpriseId = loadEnterpriseId;
       this.name = name;
       this.regId = regId;
       this.phone = phone;
       this.mobile = mobile;
       this.email = email;
       this.fax = fax;
       this.created = created;
       this.loadPersonId = loadPersonId;
       this.total = total;
       this.reportDate = reportDate;
    }

    @Id
    @Column(name="id")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="report_ent_id")
    public Long getReportEntId() {
        return this.reportEntId;
    }

    public void setReportEntId(Long reportEntId) {
        this.reportEntId = reportEntId;
    }

    @Column(name="load_enterprise_id", length=40)
    public String getLoadEnterpriseId() {
        return this.loadEnterpriseId;
    }

    public void setLoadEnterpriseId(String loadEnterpriseId) {
        this.loadEnterpriseId = loadEnterpriseId;
    }

    @Column(name="name", length=128)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="reg_id", length=40)
    public String getRegId() {
        return this.regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    @Column(name="phone", length=20)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name="mobile", length=20)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name="email", length=20)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="fax", length=20)
    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column(name="created", length=8)
    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name="load_person_id", length=16)
    public String getLoadPersonId() {
        return this.loadPersonId;
    }

    public void setLoadPersonId(String loadPersonId) {
        this.loadPersonId = loadPersonId;
    }

    @Column(name="total")
    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
    
    @Column(name="report_date")
    public Date getReportDate()
    {
    	return this.reportDate;
    }
    
    public void setReportDate(Date reportDate)
    {
    	this.reportDate = reportDate;
    }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getReportEntId() == null ? 0 : this.getReportEntId().hashCode() );
         result = 37 * result + ( getLoadEnterpriseId() == null ? 0 : this.getLoadEnterpriseId().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getRegId() == null ? 0 : this.getRegId().hashCode() );
         result = 37 * result + ( getPhone() == null ? 0 : this.getPhone().hashCode() );
         result = 37 * result + ( getMobile() == null ? 0 : this.getMobile().hashCode() );
         result = 37 * result + ( getEmail() == null ? 0 : this.getEmail().hashCode() );
         result = 37 * result + ( getFax() == null ? 0 : this.getFax().hashCode() );
         result = 37 * result + ( getCreated() == null ? 0 : this.getCreated().hashCode() );
         result = 37 * result + ( getLoadPersonId() == null ? 0 : this.getLoadPersonId().hashCode() );
         result = 37 * result + ( getTotal() == null ? 0 : this.getTotal().hashCode() );
         result = 37 * result + ( getReportDate() == null ? 0 : this.reportDate.hashCode());
         return result;
   }

   @Column(name="period")
   public String getPeriod(){
       return this.period;
   }
   
   public void setPeriod(String period) {
       this.period = period;
   }

   @Column(name="contacts")
   public String getContacts() {
       return this.contacts;
   }
   
   public void setContacts(String contacts) {
       this.contacts = contacts;
   }
   
   /*
   @Transient
   public String getPeriod(){
	   
	   if(getReportDate() == null)
	   {
		   return "-";
	   }
	   Calendar calendar = Calendar.getInstance();
	   calendar.setTime(getReportDate());
       String period = calendar.get(Calendar.YEAR) + ", " + (calendar.get(Calendar.MONTH) + 1);
       
       return period;
   }

   @Transient
   public String getContacts() {
        String phone = getPhone();
           String mobile = getMobile();
           String email = getEmail();
           String fax = getFax();
           StringBuffer contacts = new StringBuffer();
           contacts.append((phone != null) ? phone + ", " : "");
           contacts.append((mobile != null) ? mobile + ", " : "");
           contacts.append((email != null) ? email + ", " : "");
           contacts.append((fax != null) ? fax : "");
           return contacts.toString();
   }
*/


}


