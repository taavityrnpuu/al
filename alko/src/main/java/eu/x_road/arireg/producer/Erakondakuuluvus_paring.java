/**
 * Erakondakuuluvus_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Erakondakuuluvus_paring  implements java.io.Serializable {
    private java.math.BigInteger isikukood;

    public Erakondakuuluvus_paring() {
    }

    public Erakondakuuluvus_paring(
           java.math.BigInteger isikukood) {
           this.isikukood = isikukood;
    }


    /**
     * Gets the isikukood value for this Erakondakuuluvus_paring.
     * 
     * @return isikukood
     */
    public java.math.BigInteger getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this Erakondakuuluvus_paring.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.math.BigInteger isikukood) {
        this.isikukood = isikukood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erakondakuuluvus_paring)) return false;
        Erakondakuuluvus_paring other = (Erakondakuuluvus_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
