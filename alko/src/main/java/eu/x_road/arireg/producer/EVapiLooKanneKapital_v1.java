/**
 * EVapiLooKanneKapital_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneKapital_v1  implements java.io.Serializable {
    private java.math.BigInteger suurus;

    private java.lang.String valuuta;

    public EVapiLooKanneKapital_v1() {
    }

    public EVapiLooKanneKapital_v1(
           java.math.BigInteger suurus,
           java.lang.String valuuta) {
           this.suurus = suurus;
           this.valuuta = valuuta;
    }


    /**
     * Gets the suurus value for this EVapiLooKanneKapital_v1.
     * 
     * @return suurus
     */
    public java.math.BigInteger getSuurus() {
        return suurus;
    }


    /**
     * Sets the suurus value for this EVapiLooKanneKapital_v1.
     * 
     * @param suurus
     */
    public void setSuurus(java.math.BigInteger suurus) {
        this.suurus = suurus;
    }


    /**
     * Gets the valuuta value for this EVapiLooKanneKapital_v1.
     * 
     * @return valuuta
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }


    /**
     * Sets the valuuta value for this EVapiLooKanneKapital_v1.
     * 
     * @param valuuta
     */
    public void setValuuta(java.lang.String valuuta) {
        this.valuuta = valuuta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneKapital_v1)) return false;
        EVapiLooKanneKapital_v1 other = (EVapiLooKanneKapital_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suurus==null && other.getSuurus()==null) || 
             (this.suurus!=null &&
              this.suurus.equals(other.getSuurus()))) &&
            ((this.valuuta==null && other.getValuuta()==null) || 
             (this.valuuta!=null &&
              this.valuuta.equals(other.getValuuta())));
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
        if (getSuurus() != null) {
            _hashCode += getSuurus().hashCode();
        }
        if (getValuuta() != null) {
            _hashCode += getValuuta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
