/**
 * XRoadRepresentedPartyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.xsd.representation_xsd;

public class XRoadRepresentedPartyType  implements java.io.Serializable {
    private java.lang.String partyClass;

    private java.lang.String partyCode;

    public XRoadRepresentedPartyType() {
    }

    public XRoadRepresentedPartyType(
           java.lang.String partyClass,
           java.lang.String partyCode) {
           this.partyClass = partyClass;
           this.partyCode = partyCode;
    }


    /**
     * Gets the partyClass value for this XRoadRepresentedPartyType.
     * 
     * @return partyClass
     */
    public java.lang.String getPartyClass() {
        return partyClass;
    }


    /**
     * Sets the partyClass value for this XRoadRepresentedPartyType.
     * 
     * @param partyClass
     */
    public void setPartyClass(java.lang.String partyClass) {
        this.partyClass = partyClass;
    }


    /**
     * Gets the partyCode value for this XRoadRepresentedPartyType.
     * 
     * @return partyCode
     */
    public java.lang.String getPartyCode() {
        return partyCode;
    }


    /**
     * Sets the partyCode value for this XRoadRepresentedPartyType.
     * 
     * @param partyCode
     */
    public void setPartyCode(java.lang.String partyCode) {
        this.partyCode = partyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XRoadRepresentedPartyType)) return false;
        XRoadRepresentedPartyType other = (XRoadRepresentedPartyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partyClass==null && other.getPartyClass()==null) || 
             (this.partyClass!=null &&
              this.partyClass.equals(other.getPartyClass()))) &&
            ((this.partyCode==null && other.getPartyCode()==null) || 
             (this.partyCode!=null &&
              this.partyCode.equals(other.getPartyCode())));
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
        if (getPartyClass() != null) {
            _hashCode += getPartyClass().hashCode();
        }
        if (getPartyCode() != null) {
            _hashCode += getPartyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XRoadRepresentedPartyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-road.eu/xsd/representation.xsd", "XRoadRepresentedPartyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/representation.xsd", "partyClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/representation.xsd", "partyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
