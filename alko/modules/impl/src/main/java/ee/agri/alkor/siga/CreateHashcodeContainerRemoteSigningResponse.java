package ee.agri.alkor.siga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createHashcodeContainerRemoteSigningResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createHashcodeContainerRemoteSigningResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generatedSignatureId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataToSign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="digestAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createHashcodeContainerRemoteSigningResponse", propOrder = {
    "generatedSignatureId",
    "dataToSign",
    "digestAlgorithm"
})
public class CreateHashcodeContainerRemoteSigningResponse {

    @XmlElement(required = true)
    protected String generatedSignatureId;
    @XmlElement(required = true)
    protected String dataToSign;
    @XmlElement(required = true)
    protected String digestAlgorithm;

    /**
     * Gets the value of the generatedSignatureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedSignatureId() {
        return generatedSignatureId;
    }

    /**
     * Sets the value of the generatedSignatureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedSignatureId(String value) {
        this.generatedSignatureId = value;
    }

    /**
     * Gets the value of the dataToSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataToSign() {
        return dataToSign;
    }

    /**
     * Sets the value of the dataToSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataToSign(String value) {
        this.dataToSign = value;
    }

    /**
     * Gets the value of the digestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * Sets the value of the digestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestAlgorithm(String value) {
        this.digestAlgorithm = value;
    }

}

