/**
 * SalvestaEttekirjutusParingEttekirjutusTegevusala.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaEttekirjutusParingEttekirjutusTegevusala  implements java.io.Serializable {
    private java.math.BigInteger tegevusalaId;

    private java.lang.String registrikandeNumber;

    public SalvestaEttekirjutusParingEttekirjutusTegevusala() {
    }

    public SalvestaEttekirjutusParingEttekirjutusTegevusala(
           java.math.BigInteger tegevusalaId,
           java.lang.String registrikandeNumber) {
           this.tegevusalaId = tegevusalaId;
           this.registrikandeNumber = registrikandeNumber;
    }


    /**
     * Gets the tegevusalaId value for this SalvestaEttekirjutusParingEttekirjutusTegevusala.
     * 
     * @return tegevusalaId
     */
    public java.math.BigInteger getTegevusalaId() {
        return tegevusalaId;
    }


    /**
     * Sets the tegevusalaId value for this SalvestaEttekirjutusParingEttekirjutusTegevusala.
     * 
     * @param tegevusalaId
     */
    public void setTegevusalaId(java.math.BigInteger tegevusalaId) {
        this.tegevusalaId = tegevusalaId;
    }


    /**
     * Gets the registrikandeNumber value for this SalvestaEttekirjutusParingEttekirjutusTegevusala.
     * 
     * @return registrikandeNumber
     */
    public java.lang.String getRegistrikandeNumber() {
        return registrikandeNumber;
    }


    /**
     * Sets the registrikandeNumber value for this SalvestaEttekirjutusParingEttekirjutusTegevusala.
     * 
     * @param registrikandeNumber
     */
    public void setRegistrikandeNumber(java.lang.String registrikandeNumber) {
        this.registrikandeNumber = registrikandeNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaEttekirjutusParingEttekirjutusTegevusala)) return false;
        SalvestaEttekirjutusParingEttekirjutusTegevusala other = (SalvestaEttekirjutusParingEttekirjutusTegevusala) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevusalaId==null && other.getTegevusalaId()==null) || 
             (this.tegevusalaId!=null &&
              this.tegevusalaId.equals(other.getTegevusalaId()))) &&
            ((this.registrikandeNumber==null && other.getRegistrikandeNumber()==null) || 
             (this.registrikandeNumber!=null &&
              this.registrikandeNumber.equals(other.getRegistrikandeNumber())));
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
        if (getTegevusalaId() != null) {
            _hashCode += getTegevusalaId().hashCode();
        }
        if (getRegistrikandeNumber() != null) {
            _hashCode += getRegistrikandeNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
