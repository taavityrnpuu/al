/**
 * Sooritakanne_ettevotjad_v4_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_ettevotjad_v4_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sooritakanne_ettevotjad_v4.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_ettevotjad_v4"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrikood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asutamise_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "asutamise_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kande_sisu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kande_sisu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_kandesisu_v4"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dokumendid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "dokumendid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "dokumentType_v4"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
