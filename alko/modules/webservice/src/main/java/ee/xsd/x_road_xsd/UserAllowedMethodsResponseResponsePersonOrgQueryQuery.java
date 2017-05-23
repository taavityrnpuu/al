/**
 * UserAllowedMethodsResponseResponsePersonOrgQueryQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UserAllowedMethodsResponseResponsePersonOrgQueryQuery  implements java.io.Serializable {
    private java.lang.String queryName;

    private java.util.Date validUntil;

    public UserAllowedMethodsResponseResponsePersonOrgQueryQuery() {
    }

    public UserAllowedMethodsResponseResponsePersonOrgQueryQuery(
           java.lang.String queryName,
           java.util.Date validUntil) {
           this.queryName = queryName;
           this.validUntil = validUntil;
    }


    /**
     * Gets the queryName value for this UserAllowedMethodsResponseResponsePersonOrgQueryQuery.
     * 
     * @return queryName
     */
    public java.lang.String getQueryName() {
        return queryName;
    }


    /**
     * Sets the queryName value for this UserAllowedMethodsResponseResponsePersonOrgQueryQuery.
     * 
     * @param queryName
     */
    public void setQueryName(java.lang.String queryName) {
        this.queryName = queryName;
    }


    /**
     * Gets the validUntil value for this UserAllowedMethodsResponseResponsePersonOrgQueryQuery.
     * 
     * @return validUntil
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this UserAllowedMethodsResponseResponsePersonOrgQueryQuery.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAllowedMethodsResponseResponsePersonOrgQueryQuery)) return false;
        UserAllowedMethodsResponseResponsePersonOrgQueryQuery other = (UserAllowedMethodsResponseResponsePersonOrgQueryQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryName==null && other.getQueryName()==null) || 
             (this.queryName!=null &&
              this.queryName.equals(other.getQueryName()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil())));
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
        if (getQueryName() != null) {
            _hashCode += getQueryName().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
