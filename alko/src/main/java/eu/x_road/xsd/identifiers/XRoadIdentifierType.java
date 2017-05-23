/**
 * XRoadIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.xsd.identifiers;


/**
 * Globally unique identifier in the X-Road system.
 *                 Identifier consists of object type specifier and list
 * of
 *                 hierarchical codes (starting with code that identifiers
 * the X-Road instance).
 */
public class XRoadIdentifierType  implements java.io.Serializable {
    private java.lang.String xRoadInstance;

    private java.lang.String memberClass;

    private java.lang.String memberCode;

    private java.lang.String subsystemCode;

    private java.lang.String groupCode;

    private java.lang.String serviceCode;

    private java.lang.String serviceVersion;

    private java.lang.String securityCategoryCode;

    private java.lang.String serverCode;

    private eu.x_road.xsd.identifiers.XRoadObjectType objectType;  // attribute

    public XRoadIdentifierType() {
    }

    public XRoadIdentifierType(
           java.lang.String xRoadInstance,
           java.lang.String memberClass,
           java.lang.String memberCode,
           java.lang.String subsystemCode,
           java.lang.String groupCode,
           java.lang.String serviceCode,
           java.lang.String serviceVersion,
           java.lang.String securityCategoryCode,
           java.lang.String serverCode,
           eu.x_road.xsd.identifiers.XRoadObjectType objectType) {
           this.xRoadInstance = xRoadInstance;
           this.memberClass = memberClass;
           this.memberCode = memberCode;
           this.subsystemCode = subsystemCode;
           this.groupCode = groupCode;
           this.serviceCode = serviceCode;
           this.serviceVersion = serviceVersion;
           this.securityCategoryCode = securityCategoryCode;
           this.serverCode = serverCode;
           this.objectType = objectType;
    }


    /**
     * Gets the xRoadInstance value for this XRoadIdentifierType.
     * 
     * @return xRoadInstance
     */
    public java.lang.String getXRoadInstance() {
        return xRoadInstance;
    }


    /**
     * Sets the xRoadInstance value for this XRoadIdentifierType.
     * 
     * @param xRoadInstance
     */
    public void setXRoadInstance(java.lang.String xRoadInstance) {
        this.xRoadInstance = xRoadInstance;
    }


    /**
     * Gets the memberClass value for this XRoadIdentifierType.
     * 
     * @return memberClass
     */
    public java.lang.String getMemberClass() {
        return memberClass;
    }


    /**
     * Sets the memberClass value for this XRoadIdentifierType.
     * 
     * @param memberClass
     */
    public void setMemberClass(java.lang.String memberClass) {
        this.memberClass = memberClass;
    }


    /**
     * Gets the memberCode value for this XRoadIdentifierType.
     * 
     * @return memberCode
     */
    public java.lang.String getMemberCode() {
        return memberCode;
    }


    /**
     * Sets the memberCode value for this XRoadIdentifierType.
     * 
     * @param memberCode
     */
    public void setMemberCode(java.lang.String memberCode) {
        this.memberCode = memberCode;
    }


    /**
     * Gets the subsystemCode value for this XRoadIdentifierType.
     * 
     * @return subsystemCode
     */
    public java.lang.String getSubsystemCode() {
        return subsystemCode;
    }


    /**
     * Sets the subsystemCode value for this XRoadIdentifierType.
     * 
     * @param subsystemCode
     */
    public void setSubsystemCode(java.lang.String subsystemCode) {
        this.subsystemCode = subsystemCode;
    }


    /**
     * Gets the groupCode value for this XRoadIdentifierType.
     * 
     * @return groupCode
     */
    public java.lang.String getGroupCode() {
        return groupCode;
    }


    /**
     * Sets the groupCode value for this XRoadIdentifierType.
     * 
     * @param groupCode
     */
    public void setGroupCode(java.lang.String groupCode) {
        this.groupCode = groupCode;
    }


    /**
     * Gets the serviceCode value for this XRoadIdentifierType.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this XRoadIdentifierType.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceVersion value for this XRoadIdentifierType.
     * 
     * @return serviceVersion
     */
    public java.lang.String getServiceVersion() {
        return serviceVersion;
    }


    /**
     * Sets the serviceVersion value for this XRoadIdentifierType.
     * 
     * @param serviceVersion
     */
    public void setServiceVersion(java.lang.String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }


    /**
     * Gets the securityCategoryCode value for this XRoadIdentifierType.
     * 
     * @return securityCategoryCode
     */
    public java.lang.String getSecurityCategoryCode() {
        return securityCategoryCode;
    }


    /**
     * Sets the securityCategoryCode value for this XRoadIdentifierType.
     * 
     * @param securityCategoryCode
     */
    public void setSecurityCategoryCode(java.lang.String securityCategoryCode) {
        this.securityCategoryCode = securityCategoryCode;
    }


    /**
     * Gets the serverCode value for this XRoadIdentifierType.
     * 
     * @return serverCode
     */
    public java.lang.String getServerCode() {
        return serverCode;
    }


    /**
     * Sets the serverCode value for this XRoadIdentifierType.
     * 
     * @param serverCode
     */
    public void setServerCode(java.lang.String serverCode) {
        this.serverCode = serverCode;
    }


    /**
     * Gets the objectType value for this XRoadIdentifierType.
     * 
     * @return objectType
     */
    public eu.x_road.xsd.identifiers.XRoadObjectType getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this XRoadIdentifierType.
     * 
     * @param objectType
     */
    public void setObjectType(eu.x_road.xsd.identifiers.XRoadObjectType objectType) {
        this.objectType = objectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XRoadIdentifierType)) return false;
        XRoadIdentifierType other = (XRoadIdentifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xRoadInstance==null && other.getXRoadInstance()==null) || 
             (this.xRoadInstance!=null &&
              this.xRoadInstance.equals(other.getXRoadInstance()))) &&
            ((this.memberClass==null && other.getMemberClass()==null) || 
             (this.memberClass!=null &&
              this.memberClass.equals(other.getMemberClass()))) &&
            ((this.memberCode==null && other.getMemberCode()==null) || 
             (this.memberCode!=null &&
              this.memberCode.equals(other.getMemberCode()))) &&
            ((this.subsystemCode==null && other.getSubsystemCode()==null) || 
             (this.subsystemCode!=null &&
              this.subsystemCode.equals(other.getSubsystemCode()))) &&
            ((this.groupCode==null && other.getGroupCode()==null) || 
             (this.groupCode!=null &&
              this.groupCode.equals(other.getGroupCode()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.serviceVersion==null && other.getServiceVersion()==null) || 
             (this.serviceVersion!=null &&
              this.serviceVersion.equals(other.getServiceVersion()))) &&
            ((this.securityCategoryCode==null && other.getSecurityCategoryCode()==null) || 
             (this.securityCategoryCode!=null &&
              this.securityCategoryCode.equals(other.getSecurityCategoryCode()))) &&
            ((this.serverCode==null && other.getServerCode()==null) || 
             (this.serverCode!=null &&
              this.serverCode.equals(other.getServerCode()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType())));
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
        if (getXRoadInstance() != null) {
            _hashCode += getXRoadInstance().hashCode();
        }
        if (getMemberClass() != null) {
            _hashCode += getMemberClass().hashCode();
        }
        if (getMemberCode() != null) {
            _hashCode += getMemberCode().hashCode();
        }
        if (getSubsystemCode() != null) {
            _hashCode += getSubsystemCode().hashCode();
        }
        if (getGroupCode() != null) {
            _hashCode += getGroupCode().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getServiceVersion() != null) {
            _hashCode += getServiceVersion().hashCode();
        }
        if (getSecurityCategoryCode() != null) {
            _hashCode += getSecurityCategoryCode().hashCode();
        }
        if (getServerCode() != null) {
            _hashCode += getServerCode().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
