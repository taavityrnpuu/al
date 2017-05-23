/**
 * Eitparib_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Eitparib_vastus  implements java.io.Serializable {
    private java.lang.String teade;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandja aruandja;

    public Eitparib_vastus() {
    }

    public Eitparib_vastus(
           java.lang.String teade,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandja aruandja) {
           this.teade = teade;
           this.aruandja = aruandja;
    }


    /**
     * Gets the teade value for this Eitparib_vastus.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this Eitparib_vastus.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the aruandja value for this Eitparib_vastus.
     * 
     * @return aruandja
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandja getAruandja() {
        return aruandja;
    }


    /**
     * Sets the aruandja value for this Eitparib_vastus.
     * 
     * @param aruandja
     */
    public void setAruandja(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandja aruandja) {
        this.aruandja = aruandja;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Eitparib_vastus)) return false;
        Eitparib_vastus other = (Eitparib_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade()))) &&
            ((this.aruandja==null && other.getAruandja()==null) || 
             (this.aruandja!=null &&
              this.aruandja.equals(other.getAruandja())));
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
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        if (getAruandja() != null) {
            _hashCode += getAruandja().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Eitparib_vastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitparib_vastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aruandja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aruandja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandja"));
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
