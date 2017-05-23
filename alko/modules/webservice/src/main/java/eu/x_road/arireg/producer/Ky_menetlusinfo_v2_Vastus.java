/**
 * Ky_menetlusinfo_v2_Vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_menetlusinfo_v2_Vastus  implements java.io.Serializable {
    private java.math.BigInteger staatus;

    private java.lang.String staatus_detailid;

    public Ky_menetlusinfo_v2_Vastus() {
    }

    public Ky_menetlusinfo_v2_Vastus(
           java.math.BigInteger staatus,
           java.lang.String staatus_detailid) {
           this.staatus = staatus;
           this.staatus_detailid = staatus_detailid;
    }


    /**
     * Gets the staatus value for this Ky_menetlusinfo_v2_Vastus.
     * 
     * @return staatus
     */
    public java.math.BigInteger getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Ky_menetlusinfo_v2_Vastus.
     * 
     * @param staatus
     */
    public void setStaatus(java.math.BigInteger staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_detailid value for this Ky_menetlusinfo_v2_Vastus.
     * 
     * @return staatus_detailid
     */
    public java.lang.String getStaatus_detailid() {
        return staatus_detailid;
    }


    /**
     * Sets the staatus_detailid value for this Ky_menetlusinfo_v2_Vastus.
     * 
     * @param staatus_detailid
     */
    public void setStaatus_detailid(java.lang.String staatus_detailid) {
        this.staatus_detailid = staatus_detailid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_menetlusinfo_v2_Vastus)) return false;
        Ky_menetlusinfo_v2_Vastus other = (Ky_menetlusinfo_v2_Vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_detailid==null && other.getStaatus_detailid()==null) || 
             (this.staatus_detailid!=null &&
              this.staatus_detailid.equals(other.getStaatus_detailid())));
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
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_detailid() != null) {
            _hashCode += getStaatus_detailid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
