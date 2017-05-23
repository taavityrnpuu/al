/**
 * MinuTaotlusVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class MinuTaotlusVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.Taotlus taotlus;

    public MinuTaotlusVastus() {
    }

    public MinuTaotlusVastus(
           ee.x_road.mtr.producer.Taotlus taotlus) {
           this.taotlus = taotlus;
    }


    /**
     * Gets the taotlus value for this MinuTaotlusVastus.
     * 
     * @return taotlus
     */
    public ee.x_road.mtr.producer.Taotlus getTaotlus() {
        return taotlus;
    }


    /**
     * Sets the taotlus value for this MinuTaotlusVastus.
     * 
     * @param taotlus
     */
    public void setTaotlus(ee.x_road.mtr.producer.Taotlus taotlus) {
        this.taotlus = taotlus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinuTaotlusVastus)) return false;
        MinuTaotlusVastus other = (MinuTaotlusVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taotlus==null && other.getTaotlus()==null) || 
             (this.taotlus!=null &&
              this.taotlus.equals(other.getTaotlus())));
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
        if (getTaotlus() != null) {
            _hashCode += getTaotlus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
