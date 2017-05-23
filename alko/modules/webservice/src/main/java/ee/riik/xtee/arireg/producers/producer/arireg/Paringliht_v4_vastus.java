/**
 * Paringliht_v4_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.arireg.producers.producer.arireg;

public class Paringliht_v4_vastus  implements java.io.Serializable {
    private ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote[] ettevotjad;

    private java.math.BigInteger leitud_ettevotjate_arv;

    public Paringliht_v4_vastus() {
    }

    public Paringliht_v4_vastus(
           ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote[] ettevotjad,
           java.math.BigInteger leitud_ettevotjate_arv) {
           this.ettevotjad = ettevotjad;
           this.leitud_ettevotjate_arv = leitud_ettevotjate_arv;
    }


    /**
     * Gets the ettevotjad value for this Paringliht_v4_vastus.
     * 
     * @return ettevotjad
     */
    public ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote[] getEttevotjad() {
        return ettevotjad;
    }


    /**
     * Sets the ettevotjad value for this Paringliht_v4_vastus.
     * 
     * @param ettevotjad
     */
    public void setEttevotjad(ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote[] ettevotjad) {
        this.ettevotjad = ettevotjad;
    }


    /**
     * Gets the leitud_ettevotjate_arv value for this Paringliht_v4_vastus.
     * 
     * @return leitud_ettevotjate_arv
     */
    public java.math.BigInteger getLeitud_ettevotjate_arv() {
        return leitud_ettevotjate_arv;
    }


    /**
     * Sets the leitud_ettevotjate_arv value for this Paringliht_v4_vastus.
     * 
     * @param leitud_ettevotjate_arv
     */
    public void setLeitud_ettevotjate_arv(java.math.BigInteger leitud_ettevotjate_arv) {
        this.leitud_ettevotjate_arv = leitud_ettevotjate_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v4_vastus)) return false;
        Paringliht_v4_vastus other = (Paringliht_v4_vastus) obj;
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
            ((this.leitud_ettevotjate_arv==null && other.getLeitud_ettevotjate_arv()==null) || 
             (this.leitud_ettevotjate_arv!=null &&
              this.leitud_ettevotjate_arv.equals(other.getLeitud_ettevotjate_arv())));
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
        if (getLeitud_ettevotjate_arv() != null) {
            _hashCode += getLeitud_ettevotjate_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paringliht_v4_vastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "paringliht_v4_vastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettevotjad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ettevotjad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "paringliht_v4_ettevote"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leitud_ettevotjate_arv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leitud_ettevotjate_arv"));
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
