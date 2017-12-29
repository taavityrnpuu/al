/**
 * XRoadSecurityServerIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.xsd.identifiers;

public class XRoadSecurityServerIdentifierType  extends eu.x_road.xsd.identifiers.XRoadIdentifierType  implements java.io.Serializable {
    public XRoadSecurityServerIdentifierType() {
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XRoadSecurityServerIdentifierType.class, false);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadSecurityServerIdentifierType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objectType");
        attrField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "objectType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadObjectType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XRoadInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "xRoadInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serverCode"));
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
