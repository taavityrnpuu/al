/**
 * EVapiRiigiloivuViitenumberVastus_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiRiigiloivuViitenumberVastus_v1  implements java.io.Serializable {
    private java.math.BigInteger viitenumber;

    public EVapiRiigiloivuViitenumberVastus_v1() {
    }

    public EVapiRiigiloivuViitenumberVastus_v1(
           java.math.BigInteger viitenumber) {
           this.viitenumber = viitenumber;
    }


    /**
     * Gets the viitenumber value for this EVapiRiigiloivuViitenumberVastus_v1.
     * 
     * @return viitenumber
     */
    public java.math.BigInteger getViitenumber() {
        return viitenumber;
    }


    /**
     * Sets the viitenumber value for this EVapiRiigiloivuViitenumberVastus_v1.
     * 
     * @param viitenumber
     */
    public void setViitenumber(java.math.BigInteger viitenumber) {
        this.viitenumber = viitenumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiRiigiloivuViitenumberVastus_v1)) return false;
        EVapiRiigiloivuViitenumberVastus_v1 other = (EVapiRiigiloivuViitenumberVastus_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viitenumber==null && other.getViitenumber()==null) || 
             (this.viitenumber!=null &&
              this.viitenumber.equals(other.getViitenumber())));
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
        if (getViitenumber() != null) {
            _hashCode += getViitenumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
