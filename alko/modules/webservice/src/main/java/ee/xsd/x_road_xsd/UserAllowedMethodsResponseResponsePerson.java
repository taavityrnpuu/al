/**
 * UserAllowedMethodsResponseResponsePerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UserAllowedMethodsResponseResponsePerson  implements java.io.Serializable {
    private java.lang.String personCode;

    private ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery[] orgQuery;

    public UserAllowedMethodsResponseResponsePerson() {
    }

    public UserAllowedMethodsResponseResponsePerson(
           java.lang.String personCode,
           ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery[] orgQuery) {
           this.personCode = personCode;
           this.orgQuery = orgQuery;
    }


    /**
     * Gets the personCode value for this UserAllowedMethodsResponseResponsePerson.
     * 
     * @return personCode
     */
    public java.lang.String getPersonCode() {
        return personCode;
    }


    /**
     * Sets the personCode value for this UserAllowedMethodsResponseResponsePerson.
     * 
     * @param personCode
     */
    public void setPersonCode(java.lang.String personCode) {
        this.personCode = personCode;
    }


    /**
     * Gets the orgQuery value for this UserAllowedMethodsResponseResponsePerson.
     * 
     * @return orgQuery
     */
    public ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery[] getOrgQuery() {
        return orgQuery;
    }


    /**
     * Sets the orgQuery value for this UserAllowedMethodsResponseResponsePerson.
     * 
     * @param orgQuery
     */
    public void setOrgQuery(ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery[] orgQuery) {
        this.orgQuery = orgQuery;
    }

    public ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery getOrgQuery(int i) {
        return this.orgQuery[i];
    }

    public void setOrgQuery(int i, ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery _value) {
        this.orgQuery[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAllowedMethodsResponseResponsePerson)) return false;
        UserAllowedMethodsResponseResponsePerson other = (UserAllowedMethodsResponseResponsePerson) obj;
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
              this.personCode.equals(other.getPersonCode()))) &&
            ((this.orgQuery==null && other.getOrgQuery()==null) || 
             (this.orgQuery!=null &&
              java.util.Arrays.equals(this.orgQuery, other.getOrgQuery())));
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
        if (getOrgQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
