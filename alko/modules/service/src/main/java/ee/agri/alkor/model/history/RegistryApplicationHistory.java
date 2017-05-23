/**
 *
 */
package ee.agri.alkor.model.history;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;
import ee.agri.alkor.model.ProductExamples;

/**
 * RegistryApplication History
 * @author kaupo
 *
 */
@Entity
@javax.persistence.SequenceGenerator(name = "REG_APPLICATION_HIST_SEQ", sequenceName = "REG_APPLICATION_HIST_SEQ", allocationSize=1)
@Table(name = "REG_APPLICATION_HISTORY")
public class RegistryApplicationHistory extends ABaseBean implements
		IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -2938490039185841080L;

	private Long histId;

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
	private String state; //ApplicationState
	/**
	 * Taotluse staatus.
	 */
	private String type; //ApplicationType

	/**
	 * Esitamise aeg.
	 */

	private Date arrived;
	/**
	 * Taotleja
	 */
	private Long applicant; //Enterprise
	/**
	 * Menetleja.
	 */
	private Long processor; //SystemUser
	/**
	 * Toode.
	 */
	private Long product; //Product

	/**
	 * Tootenäidised.
	 */
	private ProductExamples productExamples; //ProductExamples
	/**
	 * Dokumendi lisainfo.
	 */
	private String notes;
	/**
	 * Viide riigiloivu tasumise kohta.
	 */
	private Long tax; //RegistryPayment
	/**
	 * Taotluse otsus.
	 */
	private DecisionHistory decision; //Decision

	private Long registryEntry;
	
	/**
	 * Taotluse esitaja 
	 */
	private Long enterpriseRepresentative;

   private String recievedBy ;
   private String examplRecievedBy ;
   private Date examplReturned ;
   private String examplReturnedBy ;

   /* (non-Javadoc)
	 * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_APPLICATION_HIST_SEQ")
	public Long getHistId() {
		return this.histId;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.model.history.IHistoryEntity#setHistId(java.lang.Long)
	 */
	public void setHistId(Long histId) {
		this.histId = histId;
	}

    /**
     * Getter for id.
     * @return id
     *
     */
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

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
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
	@Column(name="APPL_SUBJ_ID")
	public Long getApplicant() {
		return applicant;
	}
	public void setApplicant(Long applicant) {
		this.applicant = applicant;
	}

	@Column(name="PROCESS_SUBJ_ID")
	public Long getProcessor() {
		return processor;
	}

	public void setProcessor(Long processor) {
		this.processor = processor;
	}

	/**
	 *
	 * @return Product
	 *
	 */
	@Column(name="PRODUCT_ID")
	public Long getProduct() {
		return product;
	}
	public void setProduct(Long product) {
		this.product = product;
	}

	/**
	 *
	 * @return Classificator
	 */
	@Column(name="NOTES", length=2500)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name="PAYMENT_ID")
	public Long getTax() {
		return tax;
	}

	public void setTax(Long tax) {
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
	public DecisionHistory getDecision() {
		return decision;
	}

	public void setDecision(DecisionHistory decision) {
		this.decision = decision;
	}

	/**
	 * @return the registryEntry
	 */
	public Long getRegistryEntry() {
		return registryEntry;
	}

	/**
	 * @param registryEntry the registryEntry to set
	 */
	public void setRegistryEntry(Long registryEntry) {
		this.registryEntry = registryEntry;
	}
	
	@Column(name="ENT_REPRESENTATIVE_ID")
	public Long getEnterpriseRepresentative() {
		return enterpriseRepresentative;
	}

	public void setEnterpriseRepresentative(Long enterpriseRepresentative) {
		this.enterpriseRepresentative = enterpriseRepresentative;
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
