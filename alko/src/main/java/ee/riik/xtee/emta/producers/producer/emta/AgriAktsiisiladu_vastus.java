/**
 * AgriAktsiisiladu_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.emta.producers.producer.emta;

public class AgriAktsiisiladu_vastus  implements java.io.Serializable {
    private java.lang.String kokku;

    private ee.riik.xtee.emta.producers.producer.emta.Aktsiisiladu[] aktsiisilaod;

    public AgriAktsiisiladu_vastus() {
    }

    public AgriAktsiisiladu_vastus(
           java.lang.String kokku,
           ee.riik.xtee.emta.producers.producer.emta.Aktsiisiladu[] aktsiisilaod) {
           this.kokku = kokku;
           this.aktsiisilaod = aktsiisilaod;
    }


    /**
     * Gets the kokku value for this AgriAktsiisiladu_vastus.
     * 
     * @return kokku
     */
    public java.lang.String getKokku() {
        return kokku;
    }


    /**
     * Sets the kokku value for this AgriAktsiisiladu_vastus.
     * 
     * @param kokku
     */
    public void setKokku(java.lang.String kokku) {
        this.kokku = kokku;
    }


    /**
     * Gets the aktsiisilaod value for this AgriAktsiisiladu_vastus.
     * 
     * @return aktsiisilaod
     */
    public ee.riik.xtee.emta.producers.producer.emta.Aktsiisiladu[] getAktsiisilaod() {
        return aktsiisilaod;
    }


    /**
     * Sets the aktsiisilaod value for this AgriAktsiisiladu_vastus.
     * 
     * @param aktsiisilaod
     */
    public void setAktsiisilaod(ee.riik.xtee.emta.producers.producer.emta.Aktsiisiladu[] aktsiisilaod) {
        this.aktsiisilaod = aktsiisilaod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgriAktsiisiladu_vastus)) return false;
        AgriAktsiisiladu_vastus other = (AgriAktsiisiladu_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kokku==null && other.getKokku()==null) || 
             (this.kokku!=null &&
              this.kokku.equals(other.getKokku()))) &&
            ((this.aktsiisilaod==null && other.getAktsiisilaod()==null) || 
             (this.aktsiisilaod!=null &&
              java.util.Arrays.equals(this.aktsiisilaod, other.getAktsiisilaod())));
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
        if (getKokku() != null) {
            _hashCode += getKokku().hashCode();
        }
        if (getAktsiisilaod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAktsiisilaod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAktsiisilaod(), i);
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
        new org.apache.axis.description.TypeDesc(AgriAktsiisiladu_vastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.emta.xtee.riik.ee/producer/emta", "agriAktsiisiladu_vastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kokku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kokku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aktsiisilaod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aktsiisilaod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.emta.xtee.riik.ee/producer/emta", "aktsiisiladu"));
        elemField.setNillable(true);
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
