/**
 * RegistreeringMIKOParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistreeringMIKOParing  implements java.io.Serializable {
    private java.math.BigInteger kuu;

    private java.math.BigInteger aasta;

    public RegistreeringMIKOParing() {
    }

    public RegistreeringMIKOParing(
           java.math.BigInteger kuu,
           java.math.BigInteger aasta) {
           this.kuu = kuu;
           this.aasta = aasta;
    }


    /**
     * Gets the kuu value for this RegistreeringMIKOParing.
     * 
     * @return kuu
     */
    public java.math.BigInteger getKuu() {
        return kuu;
    }


    /**
     * Sets the kuu value for this RegistreeringMIKOParing.
     * 
     * @param kuu
     */
    public void setKuu(java.math.BigInteger kuu) {
        this.kuu = kuu;
    }


    /**
     * Gets the aasta value for this RegistreeringMIKOParing.
     * 
     * @return aasta
     */
    public java.math.BigInteger getAasta() {
        return aasta;
    }


    /**
     * Sets the aasta value for this RegistreeringMIKOParing.
     * 
     * @param aasta
     */
    public void setAasta(java.math.BigInteger aasta) {
        this.aasta = aasta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringMIKOParing)) return false;
        RegistreeringMIKOParing other = (RegistreeringMIKOParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kuu==null && other.getKuu()==null) || 
             (this.kuu!=null &&
              this.kuu.equals(other.getKuu()))) &&
            ((this.aasta==null && other.getAasta()==null) || 
             (this.aasta!=null &&
              this.aasta.equals(other.getAasta())));
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
        if (getKuu() != null) {
            _hashCode += getKuu().hashCode();
        }
        if (getAasta() != null) {
            _hashCode += getAasta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
