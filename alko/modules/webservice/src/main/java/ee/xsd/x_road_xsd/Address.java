/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class Address  implements java.io.Serializable {
    private java.lang.String producer;  // attribute

    public Address() {
    }

    public Address(
           java.lang.String producer) {
           this.producer = producer;
    }


    /**
     * Gets the producer value for this Address.
     * 
     * @return producer
     */
    public java.lang.String getProducer() {
        return producer;
    }


    /**
     * Sets the producer value for this Address.
     * 
     * @param producer
     */
    public void setProducer(java.lang.String producer) {
        this.producer = producer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.producer==null && other.getProducer()==null) || 
             (this.producer!=null &&
              this.producer.equals(other.getProducer())));
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
        if (getProducer() != null) {
            _hashCode += getProducer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
