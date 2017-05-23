/**
 * EttevotjaKoodiParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class EttevotjaKoodiParing  implements java.io.Serializable {
    private java.lang.String registrikood;

    public EttevotjaKoodiParing() {
    }

    public EttevotjaKoodiParing(
           java.lang.String registrikood) {
           this.registrikood = registrikood;
    }


    /**
     * Gets the registrikood value for this EttevotjaKoodiParing.
     * 
     * @return registrikood
     */
    public java.lang.String getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this EttevotjaKoodiParing.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.lang.String registrikood) {
        this.registrikood = registrikood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaKoodiParing)) return false;
        EttevotjaKoodiParing other = (EttevotjaKoodiParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood())));
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
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
