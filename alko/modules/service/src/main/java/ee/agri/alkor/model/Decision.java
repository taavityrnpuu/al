package ee.agri.alkor.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.classes.ProductExamplesDecisionType;
import ee.agri.alkor.model.classes.RegistryEntryDecisionType;

/**
 * 
 * @author ivar
 *
 */
@Embeddable
public class Decision  
	implements IClassificatorAware {

    /**
     * 
     */
    private String nr;
    /**
     * 
     */
    private Date date;
    
    private Date extendUntilDate;
    
    private RegistryEntryDecisionType regEntryDecision;
    
    private String extendRegEntryDecision;
    
    private ProductExamplesDecisionType prodExamplesDecision;
    
    private String explanation;
    
    private String extendUntilExplanation;
    
    /**
     * Allkirjastaja
     */
    private Person signer;
    
    public Decision() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	/**
	 * 
	 * @return String
	 */
    @javax.persistence.SequenceGenerator(
    	    name="DECISION_SEQ",
    	    sequenceName="DECISION_SEQ",
    	    allocationSize=1
    		)
    @Column(name="DECISION_NR", length=15)	
	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

    @Column(name="DECISION_DATE")	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    @Column(name="DECISION_EXPLANATION", length=50000)	
	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="EXAMPL_DEC_CLASS_ID")
	@ForeignKey(name="FK_EXAMPL_DEC_CLASS")
	public ProductExamplesDecisionType getProdExamplesDecision() {
		return prodExamplesDecision;
	}

	public void setProdExamplesDecision(
			ProductExamplesDecisionType prodExamplesDecision) {
		this.prodExamplesDecision = prodExamplesDecision;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="ENTRY_DEC_CLASS_ID")
	@ForeignKey(name="FK_ENTRY_DEC_CLASS")
	public RegistryEntryDecisionType getRegEntryDecision() {
		return regEntryDecision;
	}

	public void setRegEntryDecision(RegistryEntryDecisionType regEntryDecision) {
		this.regEntryDecision = regEntryDecision;
	}

	/**
	 * 
	 * @return Person
	 */
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="DEC_SIGNER_ID")
	@ForeignKey(name="FK_DEC_SIG_PERSON")
	public Person getSigner() {
		return signer;
	}


	public void setSigner(Person signer) {
		this.signer = signer;
	}


	@Column(name="extend_until_decision_explanation", length=50000)	
	public String getExtendUntilExplanation() {
		return extendUntilExplanation;
	}



	public void setExtendUntilExplanation(String extendUntilExplanation) {
		this.extendUntilExplanation = extendUntilExplanation;
	}


	@Transient
	public String getExtendRegEntryDecision() {
		return extendRegEntryDecision;
	}



	public void setExtendRegEntryDecision(String extendRegEntryDecision) {
		this.extendRegEntryDecision = extendRegEntryDecision;
	}


	@Column(name="extend_until_date")	
	public Date getExtendUntilDate() {
		return extendUntilDate;
	}



	public void setExtendUntilDate(Date extendUntilDate) {
		this.extendUntilDate = extendUntilDate;
	}

}
