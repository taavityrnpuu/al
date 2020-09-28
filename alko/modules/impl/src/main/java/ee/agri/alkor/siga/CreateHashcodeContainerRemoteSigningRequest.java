package ee.agri.alkor.siga;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createHashcodeContainerRemoteSigningRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createHashcodeContainerRemoteSigningRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signingCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signatureProfile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="roles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="signatureProductionPlace" type="{http://json.webapp.siga.openeid.ee/}signatureProductionPlace" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createHashcodeContainerRemoteSigningRequest", propOrder = {
    "signingCertificate",
    "signatureProfile",
    "roles",
    "signatureProductionPlace"
})
public class CreateHashcodeContainerRemoteSigningRequest {

    @XmlElement(required = true)
    protected String signingCertificate;
    @XmlElement(required = true)
    protected String signatureProfile;
    protected List<String> roles;
    protected SignatureProductionPlace signatureProductionPlace;

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningCertificate(String value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the signatureProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureProfile() {
        return signatureProfile;
    }

    /**
     * Sets the value of the signatureProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureProfile(String value) {
        this.signatureProfile = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoles() {
        if (roles == null) {
            roles = new ArrayList<String>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the signatureProductionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlace }
     *     
     */
    public SignatureProductionPlace getSignatureProductionPlace() {
        return signatureProductionPlace;
    }

    /**
     * Sets the value of the signatureProductionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlace }
     *     
     */
    public void setSignatureProductionPlace(SignatureProductionPlace value) {
        this.signatureProductionPlace = value;
    }

}

