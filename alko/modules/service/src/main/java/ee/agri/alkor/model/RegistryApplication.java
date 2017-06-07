package ee.agri.alkor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.Where;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OptimisticLockType;

import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.ApplicationType;
import ee.agri.alkor.model.history.IHistorical;

/**
 *
 *
 * @author suisalu
 * @author raido.kalbre
 */
@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
        optimisticLock = OptimisticLockType.DIRTY)
@Table(name="REG_APPLICATION")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@FilterDef(name = RegistryApplication.LATEST_PAYMENT_FILTER)
public class RegistryApplication extends ABaseBean
	implements IClassificatorAware, IHistorical {

	public static final String LATEST_PAYMENT_FILTER = "latestPaymentFilter";

    /**
     * The id of the entity.
     */
    private Long id;

	/**
	 * Taotluse reg. number
	 */
	private String nr;

	/**
	 * Taotluse staatus.
	 */
	private ApplicationState state;
	/**
	 * Taotluse tüüp.
	 */
	private ApplicationType type;

	/**
	 * Esitamise aeg.
	 */

	private Date arrived;
	/**
	 * Taotleja
	 */
	private Enterprise applicant;
	/**
	 * Menetleja.
	 */
	private Person processor;
	/**
	 * Toode.
	 */
	private Product product;

	/**
	 * Shows if this application has been processed
	 * TODO remove this and use application status(Ivar).
	private transient boolean processed;
	 */
	/**
	 * Maaletooja
	 */
	// TODO private Enterprise importer;
	/**
	 * Turustaja
	 */
	//TODO private Enterprise marketer;
	/**
	 * Tootenäidised.
	 */
	private ProductExamples productExamples;
	/**
	 * Dokumendi lisainfo.
	 */
	private String notes;
	/**
	 * Viide riigiloivu tasumise kohta.
	 */
	private RegistryPayment tax;
	/**
	 * Taotluse otsus.
	 */
	private Decision decision;

	private RegistryEntry registryEntry;

	/**
	 * Taotlusega seotud riigilõivud
	 */
	private List<PaymentMatchingLog> paymentLogs = new ArrayList<PaymentMatchingLog>(); // väga paha asi

	private String latestPayment;

	private String createdBy;
	
	/**
	 * Taotluse esitaja 
	 */
	private Person enterpriseRepresentative;
	
	private Boolean fromXTee;

   private String recievedBy ;
   private String examplRecievedBy ;
   private Date examplReturned ;
   private String examplReturnedBy ;
   
	public void setLatestPayment(String latestPayment) {
		this.latestPayment = latestPayment;
	}


	/**
	 * Sorts product's payments and returns latest's amount
	 * @return latest payment
	 */
	@Transient
    public String getLatestPayment() {
    	List<PaymentMatchingLog> paymentLogs = this.paymentLogs; 
    	if(paymentLogs.size() == 0){
    		return "";
    	} else {
        	return ((PaymentMatchingLog)paymentLogs.toArray()[0]).getAmount().toPlainString().replace(".", ",");
    	}
	}

    /**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REG_APPL_SEQ")
	@javax.persistence.SequenceGenerator(
    name="REG_APPL_SEQ",
    sequenceName="REG_APPL_SEQ",
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
	 * @return String
	 *
	 */
    @Column(name="NR")
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="APPL_STATE_CLASS_ID")
	@ForeignKey(name="FK_APPL_APPL_STATE_CLASS")
	public ApplicationState getState() {
		return state;
	}
	public void setState(ApplicationState state) {
		this.state = state;
	}

	@ManyToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name="APPL_TYPE_CLASS_ID")
	@ForeignKey(name="FK_APPL_TYPE_CLASS")
	public ApplicationType getType() {
		return type;
	}

	public void setType(ApplicationType type) {
		this.type = type;
	}


    @Column(name="ARRIVED")
	public Date getArrived() {
		return arrived;
	}

	public void setArrived(Date arrived) {
		this.arrived = arrived;
	}

    /**
     *
     * @return Enterprise
     *
     */
	@ManyToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name="APPL_SUBJ_ID")
	@ForeignKey(name="FK_APPL_SUBJ")
	public Enterprise getApplicant() {
		return applicant;
	}
	public void setApplicant(Enterprise applicant) {
		this.applicant = applicant;
	}

	@ManyToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name="PROCESS_SUBJ_ID")
	@ForeignKey(name="FK_APPL_PROCESS_SUBJ")
	public Person getProcessor() {
		return processor;
	}

	public void setProcessor(Person processor) {
		this.processor = processor;
	}

	/**
	 *
	 * @return Product
	 *
	 */
	@ManyToOne(fetch = FetchType.EAGER, cascade={CascadeType.REFRESH})
	@JoinColumn(name="PRODUCT_ID")
	@Fetch(FetchMode.JOIN)
	@ForeignKey(name="FK_APPL_PRODUCT")
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	/*
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="IMP_SUBJ_ID")
	@ForeignKey(name="FK_APPL_IMP_SUBJ")
	public Enterprise getImporter() {
		return importer;
	}

	public void setImporter(Enterprise importer) {
		this.importer = importer;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="MARK_SUBJ_ID")
	@ForeignKey(name="FK_APPL_MARK_SUBJ")
	public Enterprise getMarketer() {
		return marketer;
	}

	public void setMarketer(Enterprise marketer) {
		this.marketer = marketer;
	}*/
	/**
	 *
	 * @return Classificator
	 */
	@Column(name="NOTES", length=4000)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="PAYMENT_ID")
	@ForeignKey(name="FK_APPL_PAYMENT")
	public RegistryPayment getTax() {
		return tax;
	}

	public void setTax(RegistryPayment tax) {
		this.tax = tax;
	}

	@Embedded
	public ProductExamples getProductExamples() {
		return productExamples;
	}

	public void setProductExamples(ProductExamples productExamples) {
		this.productExamples = productExamples;
	}

	@Embedded
	public Decision getDecision() {
		return decision;
	}

	public void setDecision(Decision decision) {
		this.decision = decision;
	}

//	@OneToMany(mappedBy="application", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
//	public Set<RegistryEntry> getRegistryEntries() {
//		return registryEntries;
//	}
//
//	public void setRegistryEntries(Set<RegistryEntry> registryEntries) {
//		this.registryEntries = registryEntries;
//	}

//	@OneToOne(mappedBy="application", fetch=FetchType.EAGER)
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="REGENTRY_ID")
	@ForeignKey(name="FK_APPL_REGENTRY")
	public RegistryEntry getRegistryEntry() {
		return registryEntry;
	}

	public void setRegistryEntry(RegistryEntry registryEntry) {
		this.registryEntry = registryEntry;
	}

	@OneToMany(mappedBy="paymentApplication", cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
	@Filter(name = LATEST_PAYMENT_FILTER, condition = 
	"CREATED = (select max(P.CREATED) from PAYMENT_MATCHING_LOG P where P.PAYMENT_APPLICATION_ID = ID")
	public List<PaymentMatchingLog> getPaymentLogs() {
		return paymentLogs;
	}

	public void setPaymentLogs(List<PaymentMatchingLog> paymentLogs) {
		this.paymentLogs = paymentLogs;
	}
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="ENT_REPR_SUBJ_ID")
	@ForeignKey(name="FK_ENT_REPR_SUBJECT")
	public Person getEnterpriseRepresentative() {
		return enterpriseRepresentative;
	}

	public void setEnterpriseRepresentative(Person enterpriseRepresentative) {
		this.enterpriseRepresentative = enterpriseRepresentative;
	}

   @Column(name="FROM_XTEE")
   public Boolean getFromXTee() {
      return fromXTee;
   }

   public void setFromXTee(Boolean fromXTee) {
      this.fromXTee = fromXTee;
   }

   @Column(name="RECIEVED_BY")
	public String getRecievedBy() {
		return recievedBy;
	}


	public void setRecievedBy(String recievedBy) {
		this.recievedBy = recievedBy;
	}


   @Column(name="EXAMPL_RECIEVED_BY")
	public String getExamplRecievedBy() {
		return examplRecievedBy;
	}


	public void setExamplRecievedBy(String examplRecievedBy) {
		this.examplRecievedBy = examplRecievedBy;
	}


   @Column(name="EXAMPL_RETURNED ")
	public Date getExamplReturned() {
		return examplReturned;
	}


	public void setExamplReturned(Date examplReturned) {
		this.examplReturned = examplReturned;
	}


   @Column(name="EXAMPL_RETURNED_BY ")
	public String getExamplReturnedBy() {
		return examplReturnedBy;
	}


	public void setExamplReturnedBy(String examplReturnedBy) {
		this.examplReturnedBy = examplReturnedBy;
	}

}
