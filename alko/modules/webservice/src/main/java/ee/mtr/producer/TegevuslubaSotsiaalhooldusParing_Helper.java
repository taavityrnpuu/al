/**
 * TegevuslubaSotsiaalhooldusParing_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TegevuslubaSotsiaalhooldusParing_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TegevuslubaSotsiaalhooldusParing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaSotsiaalhooldusParing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nimi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "nimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kood"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linnvald");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "linnvald"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tanav");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tanav"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusloaotsusenr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusloaotsusenr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "regnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">regnr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusalanimi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusalanimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusala");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusala"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">tegevusala"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regkp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "regkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taotluseesitaja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseesitaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kirjetearv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kirjetearv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoovitudKirjeteArv"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alateskirjest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "alateskirjest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
