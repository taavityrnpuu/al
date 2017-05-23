/**
 * CheckTransportManagerGoodReputeRequest_Body.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class CheckTransportManagerGoodReputeRequest_Body  implements java.io.Serializable {
    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.util.Date birthDate;

    private java.lang.String cpcDocumentNumber;

    private java.lang.String cpcDocumentIssueCountry;

    private java.util.Date cpcDocumentIssueDate;

    public CheckTransportManagerGoodReputeRequest_Body() {
    }

    public CheckTransportManagerGoodReputeRequest_Body(
           java.lang.String firstName,
           java.lang.String lastName,
           java.util.Date birthDate,
           java.lang.String cpcDocumentNumber,
           java.lang.String cpcDocumentIssueCountry,
           java.util.Date cpcDocumentIssueDate) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.birthDate = birthDate;
           this.cpcDocumentNumber = cpcDocumentNumber;
           this.cpcDocumentIssueCountry = cpcDocumentIssueCountry;
           this.cpcDocumentIssueDate = cpcDocumentIssueDate;
    }


    /**
     * Gets the firstName value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the birthDate value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the cpcDocumentNumber value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @return cpcDocumentNumber
     */
    public java.lang.String getCpcDocumentNumber() {
        return cpcDocumentNumber;
    }


    /**
     * Sets the cpcDocumentNumber value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @param cpcDocumentNumber
     */
    public void setCpcDocumentNumber(java.lang.String cpcDocumentNumber) {
        this.cpcDocumentNumber = cpcDocumentNumber;
    }


    /**
     * Gets the cpcDocumentIssueCountry value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @return cpcDocumentIssueCountry
     */
    public java.lang.String getCpcDocumentIssueCountry() {
        return cpcDocumentIssueCountry;
    }


    /**
     * Sets the cpcDocumentIssueCountry value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @param cpcDocumentIssueCountry
     */
    public void setCpcDocumentIssueCountry(java.lang.String cpcDocumentIssueCountry) {
        this.cpcDocumentIssueCountry = cpcDocumentIssueCountry;
    }


    /**
     * Gets the cpcDocumentIssueDate value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @return cpcDocumentIssueDate
     */
    public java.util.Date getCpcDocumentIssueDate() {
        return cpcDocumentIssueDate;
    }


    /**
     * Sets the cpcDocumentIssueDate value for this CheckTransportManagerGoodReputeRequest_Body.
     * 
     * @param cpcDocumentIssueDate
     */
    public void setCpcDocumentIssueDate(java.util.Date cpcDocumentIssueDate) {
        this.cpcDocumentIssueDate = cpcDocumentIssueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckTransportManagerGoodReputeRequest_Body)) return false;
        CheckTransportManagerGoodReputeRequest_Body other = (CheckTransportManagerGoodReputeRequest_Body) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.cpcDocumentNumber==null && other.getCpcDocumentNumber()==null) || 
             (this.cpcDocumentNumber!=null &&
              this.cpcDocumentNumber.equals(other.getCpcDocumentNumber()))) &&
            ((this.cpcDocumentIssueCountry==null && other.getCpcDocumentIssueCountry()==null) || 
             (this.cpcDocumentIssueCountry!=null &&
              this.cpcDocumentIssueCountry.equals(other.getCpcDocumentIssueCountry()))) &&
            ((this.cpcDocumentIssueDate==null && other.getCpcDocumentIssueDate()==null) || 
             (this.cpcDocumentIssueDate!=null &&
              this.cpcDocumentIssueDate.equals(other.getCpcDocumentIssueDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getCpcDocumentNumber() != null) {
            _hashCode += getCpcDocumentNumber().hashCode();
        }
        if (getCpcDocumentIssueCountry() != null) {
            _hashCode += getCpcDocumentIssueCountry().hashCode();
        }
        if (getCpcDocumentIssueDate() != null) {
            _hashCode += getCpcDocumentIssueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
