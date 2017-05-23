/**
 * Paringliht_v4_evaadress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.arireg.producers.producer.arireg;

public class Paringliht_v4_evaadress  implements java.io.Serializable {
    private java.lang.String asukoht_ettevotja_aadressis;

    private java.lang.String asukoha_ehak_kood;

    private java.lang.String asukoha_ehak_tekstina;

    private java.lang.String indeks_ettevotja_aadressis;

    public Paringliht_v4_evaadress() {
    }

    public Paringliht_v4_evaadress(
           java.lang.String asukoht_ettevotja_aadressis,
           java.lang.String asukoha_ehak_kood,
           java.lang.String asukoha_ehak_tekstina,
           java.lang.String indeks_ettevotja_aadressis) {
           this.asukoht_ettevotja_aadressis = asukoht_ettevotja_aadressis;
           this.asukoha_ehak_kood = asukoha_ehak_kood;
           this.asukoha_ehak_tekstina = asukoha_ehak_tekstina;
           this.indeks_ettevotja_aadressis = indeks_ettevotja_aadressis;
    }


    /**
     * Gets the asukoht_ettevotja_aadressis value for this Paringliht_v4_evaadress.
     * 
     * @return asukoht_ettevotja_aadressis
     */
    public java.lang.String getAsukoht_ettevotja_aadressis() {
        return asukoht_ettevotja_aadressis;
    }


    /**
     * Sets the asukoht_ettevotja_aadressis value for this Paringliht_v4_evaadress.
     * 
     * @param asukoht_ettevotja_aadressis
     */
    public void setAsukoht_ettevotja_aadressis(java.lang.String asukoht_ettevotja_aadressis) {
        this.asukoht_ettevotja_aadressis = asukoht_ettevotja_aadressis;
    }


    /**
     * Gets the asukoha_ehak_kood value for this Paringliht_v4_evaadress.
     * 
     * @return asukoha_ehak_kood
     */
    public java.lang.String getAsukoha_ehak_kood() {
        return asukoha_ehak_kood;
    }


    /**
     * Sets the asukoha_ehak_kood value for this Paringliht_v4_evaadress.
     * 
     * @param asukoha_ehak_kood
     */
    public void setAsukoha_ehak_kood(java.lang.String asukoha_ehak_kood) {
        this.asukoha_ehak_kood = asukoha_ehak_kood;
    }


    /**
     * Gets the asukoha_ehak_tekstina value for this Paringliht_v4_evaadress.
     * 
     * @return asukoha_ehak_tekstina
     */
    public java.lang.String getAsukoha_ehak_tekstina() {
        return asukoha_ehak_tekstina;
    }


    /**
     * Sets the asukoha_ehak_tekstina value for this Paringliht_v4_evaadress.
     * 
     * @param asukoha_ehak_tekstina
     */
    public void setAsukoha_ehak_tekstina(java.lang.String asukoha_ehak_tekstina) {
        this.asukoha_ehak_tekstina = asukoha_ehak_tekstina;
    }


    /**
     * Gets the indeks_ettevotja_aadressis value for this Paringliht_v4_evaadress.
     * 
     * @return indeks_ettevotja_aadressis
     */
    public java.lang.String getIndeks_ettevotja_aadressis() {
        return indeks_ettevotja_aadressis;
    }


    /**
     * Sets the indeks_ettevotja_aadressis value for this Paringliht_v4_evaadress.
     * 
     * @param indeks_ettevotja_aadressis
     */
    public void setIndeks_ettevotja_aadressis(java.lang.String indeks_ettevotja_aadressis) {
        this.indeks_ettevotja_aadressis = indeks_ettevotja_aadressis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v4_evaadress)) return false;
        Paringliht_v4_evaadress other = (Paringliht_v4_evaadress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asukoht_ettevotja_aadressis==null && other.getAsukoht_ettevotja_aadressis()==null) || 
             (this.asukoht_ettevotja_aadressis!=null &&
              this.asukoht_ettevotja_aadressis.equals(other.getAsukoht_ettevotja_aadressis()))) &&
            ((this.asukoha_ehak_kood==null && other.getAsukoha_ehak_kood()==null) || 
             (this.asukoha_ehak_kood!=null &&
              this.asukoha_ehak_kood.equals(other.getAsukoha_ehak_kood()))) &&
            ((this.asukoha_ehak_tekstina==null && other.getAsukoha_ehak_tekstina()==null) || 
             (this.asukoha_ehak_tekstina!=null &&
              this.asukoha_ehak_tekstina.equals(other.getAsukoha_ehak_tekstina()))) &&
            ((this.indeks_ettevotja_aadressis==null && other.getIndeks_ettevotja_aadressis()==null) || 
             (this.indeks_ettevotja_aadressis!=null &&
              this.indeks_ettevotja_aadressis.equals(other.getIndeks_ettevotja_aadressis())));
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
        if (getAsukoht_ettevotja_aadressis() != null) {
            _hashCode += getAsukoht_ettevotja_aadressis().hashCode();
        }
        if (getAsukoha_ehak_kood() != null) {
            _hashCode += getAsukoha_ehak_kood().hashCode();
        }
        if (getAsukoha_ehak_tekstina() != null) {
            _hashCode += getAsukoha_ehak_tekstina().hashCode();
        }
        if (getIndeks_ettevotja_aadressis() != null) {
            _hashCode += getIndeks_ettevotja_aadressis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paringliht_v4_evaadress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "paringliht_v4_evaadress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asukoht_ettevotja_aadressis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asukoht_ettevotja_aadressis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asukoha_ehak_kood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asukoha_ehak_kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asukoha_ehak_tekstina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asukoha_ehak_tekstina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indeks_ettevotja_aadressis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indeks_ettevotja_aadressis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
