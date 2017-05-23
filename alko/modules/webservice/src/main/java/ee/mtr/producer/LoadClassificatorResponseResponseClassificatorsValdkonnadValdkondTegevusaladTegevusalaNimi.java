/**
 * LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    public LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi() {
    }

    // Simple Types must have a String constructor
    public LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi)) return false;
        LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi other = (LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi) obj;
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
              this._value.equals(other.get_value())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
