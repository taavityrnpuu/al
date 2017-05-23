/**
 * TaotluseSoidukiOtsingParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseSoidukiOtsingParing  implements java.io.Serializable {
    private java.lang.String registreerimismark;

    public TaotluseSoidukiOtsingParing() {
    }

    public TaotluseSoidukiOtsingParing(
           java.lang.String registreerimismark) {
           this.registreerimismark = registreerimismark;
    }


    /**
     * Gets the registreerimismark value for this TaotluseSoidukiOtsingParing.
     * 
     * @return registreerimismark
     */
    public java.lang.String getRegistreerimismark() {
        return registreerimismark;
    }


    /**
     * Sets the registreerimismark value for this TaotluseSoidukiOtsingParing.
     * 
     * @param registreerimismark
     */
    public void setRegistreerimismark(java.lang.String registreerimismark) {
        this.registreerimismark = registreerimismark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseSoidukiOtsingParing)) return false;
        TaotluseSoidukiOtsingParing other = (TaotluseSoidukiOtsingParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registreerimismark==null && other.getRegistreerimismark()==null) || 
             (this.registreerimismark!=null &&
              this.registreerimismark.equals(other.getRegistreerimismark())));
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
        if (getRegistreerimismark() != null) {
            _hashCode += getRegistreerimismark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
