/**
 * Toimiku_dokument_v2_Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Toimiku_dokument_v2_Request  implements java.io.Serializable {
    private java.math.BigInteger dokumendi_id;

    public Toimiku_dokument_v2_Request() {
    }

    public Toimiku_dokument_v2_Request(
           java.math.BigInteger dokumendi_id) {
           this.dokumendi_id = dokumendi_id;
    }


    /**
     * Gets the dokumendi_id value for this Toimiku_dokument_v2_Request.
     * 
     * @return dokumendi_id
     */
    public java.math.BigInteger getDokumendi_id() {
        return dokumendi_id;
    }


    /**
     * Sets the dokumendi_id value for this Toimiku_dokument_v2_Request.
     * 
     * @param dokumendi_id
     */
    public void setDokumendi_id(java.math.BigInteger dokumendi_id) {
        this.dokumendi_id = dokumendi_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Toimiku_dokument_v2_Request)) return false;
        Toimiku_dokument_v2_Request other = (Toimiku_dokument_v2_Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dokumendi_id==null && other.getDokumendi_id()==null) || 
             (this.dokumendi_id!=null &&
              this.dokumendi_id.equals(other.getDokumendi_id())));
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
        if (getDokumendi_id() != null) {
            _hashCode += getDokumendi_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
