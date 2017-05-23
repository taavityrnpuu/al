/**
 * EesmargidType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EesmargidType_v4  implements java.io.Serializable {
    private java.lang.String nimetus;

    private java.lang.String tegevus;

    public EesmargidType_v4() {
    }

    public EesmargidType_v4(
           java.lang.String nimetus,
           java.lang.String tegevus) {
           this.nimetus = nimetus;
           this.tegevus = tegevus;
    }


    /**
     * Gets the nimetus value for this EesmargidType_v4.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this EesmargidType_v4.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the tegevus value for this EesmargidType_v4.
     * 
     * @return tegevus
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this EesmargidType_v4.
     * 
     * @param tegevus
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EesmargidType_v4)) return false;
        EesmargidType_v4 other = (EesmargidType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus())));
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
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
