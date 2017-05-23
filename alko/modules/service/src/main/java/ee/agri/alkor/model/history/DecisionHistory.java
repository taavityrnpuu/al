/**
 *
 */
package ee.agri.alkor.model.history;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * Decision History
 * @author kaupo
 *
 */
@Embeddable
public class DecisionHistory implements Serializable {

	/**
     *
     */
    private String nr;
    /**
     *
     */
    private Date date;
    /**
     *
     */
    
    private Date extendUntilDate;

    private String regEntryDecision; //RegistryEntryDecisionType

    private String prodExamplesDecision; //ProductExamplesDecisionType

    private String explanation;
    
    private String extendUntilExplanation;
    /**
     * Allkirjastaja
     */
    private Long signer; //Person

    public DecisionHistory() {

	}



	/**
	 *
	 * @return String
	 */
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


	public String getProdExamplesDecision() {
		return prodExamplesDecision;
	}

	public void setProdExamplesDecision(
			String prodExamplesDecision) {
		this.prodExamplesDecision = prodExamplesDecision;
	}

	public String getRegEntryDecision() {
		return regEntryDecision;
	}

	public void setRegEntryDecision(String regEntryDecision) {
		this.regEntryDecision = regEntryDecision;
	}

	/**
	 *
	 * @return Person
	 */
	@Column(name="DEC_SIGNER_ID")
	public Long getSigner() {
		return signer;
	}


	public void setSigner(Long signer) {
		this.signer = signer;
	}
	
	@Column(name="extend_until_decision_explanation", length=50000)	
	public String getExtendUntilExplanation() {
		return extendUntilExplanation;
	}



	public void setExtendUntilExplanation(String extendUntilExplanation) {
		this.extendUntilExplanation = extendUntilExplanation;
	}



	@Column(name="extend_until_date")	
	public Date getExtendUntilDate() {
		return extendUntilDate;
	}



	public void setExtendUntilDate(Date extendUntilDate) {
		this.extendUntilDate = extendUntilDate;
	}

}
