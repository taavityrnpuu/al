/**
 * InvalidInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class InvalidInput  implements java.io.Serializable {
    private java.lang.String faultCode;

    private java.lang.String faultString;

    public InvalidInput() {
    }

    public InvalidInput(
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the faultCode value for this InvalidInput.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this InvalidInput.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this InvalidInput.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this InvalidInput.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidInput)) return false;
        InvalidInput other = (InvalidInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultCode==null && other.getFaultCode()==null) || 
             (this.faultCode!=null &&
              this.faultCode.equals(other.getFaultCode()))) &&
            ((this.faultString==null && other.getFaultString()==null) || 
             (this.faultString!=null &&
              this.faultString.equals(other.getFaultString())));
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
        if (getFaultCode() != null) {
            _hashCode += getFaultCode().hashCode();
        }
        if (getFaultString() != null) {
            _hashCode += getFaultString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
