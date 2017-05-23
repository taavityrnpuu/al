/**
 * RequestHash.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.xsd.xroad_xsd;

public class RequestHash  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String algorithmId;  // attribute

    public RequestHash() {
    }

    // Simple Types must have a String constructor
    public RequestHash(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this RequestHash.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this RequestHash.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the algorithmId value for this RequestHash.
     * 
     * @return algorithmId
     */
    public java.lang.String getAlgorithmId() {
        return algorithmId;
    }


    /**
     * Sets the algorithmId value for this RequestHash.
     * 
     * @param algorithmId
     */
    public void setAlgorithmId(java.lang.String algorithmId) {
        this.algorithmId = algorithmId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHash)) return false;
        RequestHash other = (RequestHash) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.algorithmId==null && other.getAlgorithmId()==null) || 
             (this.algorithmId!=null &&
              this.algorithmId.equals(other.getAlgorithmId())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getAlgorithmId() != null) {
            _hashCode += getAlgorithmId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
