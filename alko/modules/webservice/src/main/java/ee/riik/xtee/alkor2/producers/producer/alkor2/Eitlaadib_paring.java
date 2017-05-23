/**
 * Eitlaadib_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Eitlaadib_paring  implements java.io.Serializable {
    private ee.riik.xtee.alkor2.producers.producer.alkor2.AruandeperioodReq period;

    private byte[] aruanne;

    public Eitlaadib_paring() {
    }

    public Eitlaadib_paring(
           ee.riik.xtee.alkor2.producers.producer.alkor2.AruandeperioodReq period,
           byte[] aruanne) {
           this.period = period;
           this.aruanne = aruanne;
    }


    /**
     * Gets the period value for this Eitlaadib_paring.
     * 
     * @return period
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.AruandeperioodReq getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this Eitlaadib_paring.
     * 
     * @param period
     */
    public void setPeriod(ee.riik.xtee.alkor2.producers.producer.alkor2.AruandeperioodReq period) {
        this.period = period;
    }


    /**
     * Gets the aruanne value for this Eitlaadib_paring.
     * 
     * @return aruanne
     */
    public byte[] getAruanne() {
        return aruanne;
    }


    /**
     * Sets the aruanne value for this Eitlaadib_paring.
     * 
     * @param aruanne
     */
    public void setAruanne(byte[] aruanne) {
        this.aruanne = aruanne;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Eitlaadib_paring)) return false;
        Eitlaadib_paring other = (Eitlaadib_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.aruanne==null && other.getAruanne()==null) || 
             (this.aruanne!=null &&
              java.util.Arrays.equals(this.aruanne, other.getAruanne())));
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getAruanne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAruanne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAruanne(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Eitlaadib_paring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_paring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeperioodReq"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aruanne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aruanne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
