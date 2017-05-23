/**
 * UnitRepresentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UnitRepresentRequest  implements java.io.Serializable {
    private java.lang.String personCode;

    public UnitRepresentRequest() {
    }

    public UnitRepresentRequest(
           java.lang.String personCode) {
           this.personCode = personCode;
    }


    /**
     * Gets the personCode value for this UnitRepresentRequest.
     * 
     * @return personCode
     */
    public java.lang.String getPersonCode() {
        return personCode;
    }


    /**
     * Sets the personCode value for this UnitRepresentRequest.
     * 
     * @param personCode
     */
    public void setPersonCode(java.lang.String personCode) {
        this.personCode = personCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitRepresentRequest)) return false;
        UnitRepresentRequest other = (UnitRepresentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.personCode==null && other.getPersonCode()==null) || 
             (this.personCode!=null &&
              this.personCode.equals(other.getPersonCode())));
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
        if (getPersonCode() != null) {
            _hashCode += getPersonCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
