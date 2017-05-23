/**
 * RKOARRAsutused_v1_KOAS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class RKOARRAsutused_v1_KOAS  implements java.io.Serializable {
    private java.lang.String kood;

    private java.lang.String nimi;

    public RKOARRAsutused_v1_KOAS() {
    }

    public RKOARRAsutused_v1_KOAS(
           java.lang.String kood,
           java.lang.String nimi) {
           this.kood = kood;
           this.nimi = nimi;
    }


    /**
     * Gets the kood value for this RKOARRAsutused_v1_KOAS.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RKOARRAsutused_v1_KOAS.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimi value for this RKOARRAsutused_v1_KOAS.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this RKOARRAsutused_v1_KOAS.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RKOARRAsutused_v1_KOAS)) return false;
        RKOARRAsutused_v1_KOAS other = (RKOARRAsutused_v1_KOAS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi())));
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
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
