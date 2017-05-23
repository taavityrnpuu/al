package ee.agri.alkor.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="product_move_report_view"
    ,schema="public"
)
public class ProductMoveReportView  implements java.io.Serializable {


     private Long id;
     private String loadEnterpriseId;
     private String name;
     private String regId;
     private String phone;
     private String mobile;
     private String email;
     private String fax;
     private Date created;
     private String loadPersonId;
     private Long total;
     private Date repDate;

    public ProductMoveReportView() {
    }

     @Id
    @Column(name="id")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public Date getRepDate()
    {
    	return this.repDate;
    }
    
    public void setRepDate(Date repDate)
    {
    	this.repDate = repDate;
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



}


