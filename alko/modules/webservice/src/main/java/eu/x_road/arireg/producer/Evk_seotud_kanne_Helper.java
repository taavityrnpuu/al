/**
 * Evk_seotud_kanne_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Evk_seotud_kanne_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Evk_seotud_kanne.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_seotud_kanne"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ariregistri_kood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esmakande_aeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esmakande_aeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kande_aeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kande_aeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kandeliigi_tahis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kandeliigi_tahis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kande_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kande_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notaritehingu_kood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "notaritehingu_kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arinimi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "arinimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oigusliku_vormi_tahis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oigusliku_vormi_tahis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loppstaatuse_tahis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "loppstaatuse_tahis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kapital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_kapital"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pohikiri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "pohikiri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_pohikiri"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
