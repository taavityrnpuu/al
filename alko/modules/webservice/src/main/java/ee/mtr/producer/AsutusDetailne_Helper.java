/**
 * AsutusDetailne_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AsutusDetailne_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsutusDetailne.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusDetailne"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevuskohad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tegevuskohad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusTegevuskoht"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AsutusTegevuskoht"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidevahendid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sidevahendid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Sidevahend"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Sidevahend"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagatised");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tagatised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Tagatis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Tagatis"));
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
