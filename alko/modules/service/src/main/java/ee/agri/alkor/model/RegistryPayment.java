package ee.agri.alkor.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Formula;

import ee.agri.alkor.model.history.IHistorical;

@Entity
@Table(name = "REG_PAYMENT")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class RegistryPayment extends ABaseBean implements IHistorical {
   /**
     * The id of the entity.
     */
   private Long id;

   /**
     * Maksja nimi.
     */
   private String payerName;

   /**
     * Maksja konto.
     */
   private String payingAccNo;

   /**
     * Maksja äriregistri kood.
     */
   private String payerRegistrationNr;

   /**
     * Viitenumber.
     */
   private String referenceNr;

   private Date paymentDate;

   private BigDecimal amount;

   private Enterprise boundEnterprise;
   
   /**
    * Unikaalne laekumise number
    */
   private String orderNumber;

   private String paymentDesc;
   
   /**
    * arvutuslikud
    */
   
   private Boolean has_enterprise = false;


   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_PAYMENT_SEQ")
   @javax.persistence.SequenceGenerator(name = "REG_PAYMENT_SEQ", sequenceName = "REG_PAYMENT_SEQ", allocationSize = 1)
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

   @Column(name = "AMOUNT", scale=2)
   public BigDecimal getAmount() {
      return amount;
   }

   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   @Column(name = "PAYER_NAME", length = 64)
   public String getPayerName() {
      return payerName;
   }

   public void setPayerName(String payerName) {
      this.payerName = payerName;
   }

   @Column(name = "PAYER_ACCNO", length = 32)
   public String getPayingAccNo() {
      return payingAccNo;
   }

   public void setPayingAccNo(String payingAccNo) {
      this.payingAccNo = payingAccNo;
   }

   @Column(name = "PAYMENT_TIME", length = 32)
   public Date getPaymentDate() {
      return paymentDate;
   }

   public void setPaymentDate(Date paymentTime) {
      this.paymentDate = paymentTime;
   }

   @Column(name = "REF_NR", length = 64)
   public String getReferenceNr() {
      return referenceNr;
   }

   public void setReferenceNr(String referenceNr) {
      this.referenceNr = referenceNr;
   }

   @Column(name = "REG_NR", length = 20)
   public String getPayerRegistrationNr() {
      return payerRegistrationNr;
   }

   public void setPayerRegistrationNr(String payerRegistrationNr) {
      this.payerRegistrationNr = payerRegistrationNr;
   }
   
   @Column(name = "ORDER_NUM", length = 50)
   public String getOrderNumber()
   {
      return orderNumber;
   }
   
   public void setOrderNumber(String orderNumber)
   {
      this.orderNumber = orderNumber;
   }

   @ManyToOne(cascade = {CascadeType.REFRESH})
   @JoinColumn(name = "PAYER_ENTERPRISE_ID")
   @ForeignKey(name = "FK_PAYING_ENTERPRISE")
   public Enterprise getBoundEnterprise() {
      return boundEnterprise;
   }

   public void setBoundEnterprise(Enterprise boundEnterprise) {
      this.boundEnterprise = boundEnterprise;
   }

   @Formula(value="(CASE WHEN payer_enterprise_id IS NOT NULL THEN true ELSE false END)")
   @Basic(fetch=FetchType.LAZY)
   public Boolean getHas_enterprise() {
	   return has_enterprise;
   }
   
   public void setHas_enterprise(Boolean has_enterprise) {
	   this.has_enterprise = has_enterprise;
   }

   @Column(name = "DESCRIPTION", length = 1000)
   public String getPaymentDesc() {
      return paymentDesc;
   }

   public void setPaymentDesc(String paymentDesc) {
      this.paymentDesc = paymentDesc;
   }
}
