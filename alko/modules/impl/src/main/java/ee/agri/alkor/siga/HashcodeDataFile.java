package ee.agri.alkor.siga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hashcodeDataFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hashcodeDataFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileHashSha256" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileHashSha512" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hashcodeDataFile", propOrder = {
    "fileName",
    "fileHashSha256",
    "fileHashSha512",
    "fileSize"
})
public class HashcodeDataFile {

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String fileHashSha256;
    @XmlElement(required = true)
    protected String fileHashSha512;
    protected int fileSize;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileHashSha256 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHashSha256() {
        return fileHashSha256;
    }

    /**
     * Sets the value of the fileHashSha256 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHashSha256(String value) {
        this.fileHashSha256 = value;
    }

    /**
     * Gets the value of the fileHashSha512 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHashSha512() {
        return fileHashSha512;
    }

    /**
     * Sets the value of the fileHashSha512 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHashSha512(String value) {
        this.fileHashSha512 = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(int value) {
        this.fileSize = value;
    }

}
