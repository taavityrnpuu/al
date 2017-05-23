/**
 * Maaruse_dokument_Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Maaruse_dokument_Request  implements java.io.Serializable {
    private java.math.BigInteger maaruse_id;

    public Maaruse_dokument_Request() {
    }

    public Maaruse_dokument_Request(
           java.math.BigInteger maaruse_id) {
           this.maaruse_id = maaruse_id;
    }


    /**
     * Gets the maaruse_id value for this Maaruse_dokument_Request.
     * 
     * @return maaruse_id
     */
    public java.math.BigInteger getMaaruse_id() {
        return maaruse_id;
    }


    /**
     * Sets the maaruse_id value for this Maaruse_dokument_Request.
     * 
     * @param maaruse_id
     */
    public void setMaaruse_id(java.math.BigInteger maaruse_id) {
        this.maaruse_id = maaruse_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Maaruse_dokument_Request)) return false;
        Maaruse_dokument_Request other = (Maaruse_dokument_Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maaruse_id==null && other.getMaaruse_id()==null) || 
             (this.maaruse_id!=null &&
              this.maaruse_id.equals(other.getMaaruse_id())));
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
        if (getMaaruse_id() != null) {
            _hashCode += getMaaruse_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
