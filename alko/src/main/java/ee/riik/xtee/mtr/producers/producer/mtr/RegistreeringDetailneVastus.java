/**
 * RegistreeringDetailneVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistreeringDetailneVastus  implements java.io.Serializable {
    private java.math.BigInteger kirjeteArv;

    private ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTegevusType[] registreeringud;

    public RegistreeringDetailneVastus() {
    }

    public RegistreeringDetailneVastus(
           java.math.BigInteger kirjeteArv,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTegevusType[] registreeringud) {
           this.kirjeteArv = kirjeteArv;
           this.registreeringud = registreeringud;
    }


    /**
     * Gets the kirjeteArv value for this RegistreeringDetailneVastus.
     * 
     * @return kirjeteArv
     */
    public java.math.BigInteger getKirjeteArv() {
        return kirjeteArv;
    }


    /**
     * Sets the kirjeteArv value for this RegistreeringDetailneVastus.
     * 
     * @param kirjeteArv
     */
    public void setKirjeteArv(java.math.BigInteger kirjeteArv) {
        this.kirjeteArv = kirjeteArv;
    }


    /**
     * Gets the registreeringud value for this RegistreeringDetailneVastus.
     * 
     * @return registreeringud
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTegevusType[] getRegistreeringud() {
        return registreeringud;
    }


    /**
     * Sets the registreeringud value for this RegistreeringDetailneVastus.
     * 
     * @param registreeringud
     */
    public void setRegistreeringud(ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTegevusType[] registreeringud) {
        this.registreeringud = registreeringud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringDetailneVastus)) return false;
        RegistreeringDetailneVastus other = (RegistreeringDetailneVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirjeteArv==null && other.getKirjeteArv()==null) || 
             (this.kirjeteArv!=null &&
              this.kirjeteArv.equals(other.getKirjeteArv()))) &&
            ((this.registreeringud==null && other.getRegistreeringud()==null) || 
             (this.registreeringud!=null &&
              java.util.Arrays.equals(this.registreeringud, other.getRegistreeringud())));
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
        if (getKirjeteArv() != null) {
            _hashCode += getKirjeteArv().hashCode();
        }
        if (getRegistreeringud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistreeringud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistreeringud(), i);
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
        new org.apache.axis.description.TypeDesc(RegistreeringDetailneVastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneVastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kirjeteArv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kirjeteArv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreeringud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registreeringud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneTegevusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "registreering"));
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
