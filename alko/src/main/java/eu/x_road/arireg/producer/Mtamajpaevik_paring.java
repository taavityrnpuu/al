/**
 * Mtamajpaevik_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtamajpaevik_paring  implements java.io.Serializable {
    private java.util.Date kpv;

    public Mtamajpaevik_paring() {
    }

    public Mtamajpaevik_paring(
           java.util.Date kpv) {
           this.kpv = kpv;
    }


    /**
     * Gets the kpv value for this Mtamajpaevik_paring.
     * 
     * @return kpv
     */
    public java.util.Date getKpv() {
        return kpv;
    }


    /**
     * Sets the kpv value for this Mtamajpaevik_paring.
     * 
     * @param kpv
     */
    public void setKpv(java.util.Date kpv) {
        this.kpv = kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtamajpaevik_paring)) return false;
        Mtamajpaevik_paring other = (Mtamajpaevik_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kpv==null && other.getKpv()==null) || 
             (this.kpv!=null &&
              this.kpv.equals(other.getKpv())));
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
        if (getKpv() != null) {
            _hashCode += getKpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
