/**
 * UserAllowedMethodsResponseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UserAllowedMethodsResponseResponse  implements java.io.Serializable {
    private ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson[] person;

    private java.lang.String faultCode;

    private java.lang.String faultString;

    public UserAllowedMethodsResponseResponse() {
    }

    public UserAllowedMethodsResponseResponse(
           ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson[] person,
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.person = person;
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the person value for this UserAllowedMethodsResponseResponse.
     * 
     * @return person
     */
    public ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson[] getPerson() {
        return person;
    }


    /**
     * Sets the person value for this UserAllowedMethodsResponseResponse.
     * 
     * @param person
     */
    public void setPerson(ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson[] person) {
        this.person = person;
    }

    public ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson getPerson(int i) {
        return this.person[i];
    }

    public void setPerson(int i, ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson _value) {
        this.person[i] = _value;
    }


    /**
     * Gets the faultCode value for this UserAllowedMethodsResponseResponse.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this UserAllowedMethodsResponseResponse.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this UserAllowedMethodsResponseResponse.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this UserAllowedMethodsResponseResponse.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAllowedMethodsResponseResponse)) return false;
        UserAllowedMethodsResponseResponse other = (UserAllowedMethodsResponseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              java.util.Arrays.equals(this.person, other.getPerson()))) &&
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
        if (getPerson() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerson());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerson(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
