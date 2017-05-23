/**
 * EttevotjaVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class EttevotjaVastus  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastusEttevotjadEttevotja[] ettevotjad;

    private java.math.BigInteger kirjeid;

    public EttevotjaVastus() {
    }

    public EttevotjaVastus(
           ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastusEttevotjadEttevotja[] ettevotjad,
           java.math.BigInteger kirjeid) {
           this.ettevotjad = ettevotjad;
           this.kirjeid = kirjeid;
    }


    /**
     * Gets the ettevotjad value for this EttevotjaVastus.
     * 
     * @return ettevotjad
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastusEttevotjadEttevotja[] getEttevotjad() {
        return ettevotjad;
    }


    /**
     * Sets the ettevotjad value for this EttevotjaVastus.
     * 
     * @param ettevotjad
     */
    public void setEttevotjad(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastusEttevotjadEttevotja[] ettevotjad) {
        this.ettevotjad = ettevotjad;
    }


    /**
     * Gets the kirjeid value for this EttevotjaVastus.
     * 
     * @return kirjeid
     */
    public java.math.BigInteger getKirjeid() {
        return kirjeid;
    }


    /**
     * Sets the kirjeid value for this EttevotjaVastus.
     * 
     * @param kirjeid
     */
    public void setKirjeid(java.math.BigInteger kirjeid) {
        this.kirjeid = kirjeid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaVastus)) return false;
        EttevotjaVastus other = (EttevotjaVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotjad==null && other.getEttevotjad()==null) || 
             (this.ettevotjad!=null &&
              java.util.Arrays.equals(this.ettevotjad, other.getEttevotjad()))) &&
            ((this.kirjeid==null && other.getKirjeid()==null) || 
             (this.kirjeid!=null &&
              this.kirjeid.equals(other.getKirjeid())));
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
        if (getEttevotjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotjad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKirjeid() != null) {
            _hashCode += getKirjeid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EttevotjaVastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaVastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettevotjad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ettevotjad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaVastus>ettevotjad>ettevotja"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ettevotja"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kirjeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kirjeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
