/**
 * Paringliht_v4_evkapital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.arireg.producers.producer.arireg;

public class Paringliht_v4_evkapital  implements java.io.Serializable {
    private java.lang.String kapitali_suurus;

    private java.lang.String kapitali_valuuta;

    private java.lang.Boolean asutatud_sissemakset_tegemata;

    public Paringliht_v4_evkapital() {
    }

    public Paringliht_v4_evkapital(
           java.lang.String kapitali_suurus,
           java.lang.String kapitali_valuuta,
           java.lang.Boolean asutatud_sissemakset_tegemata) {
           this.kapitali_suurus = kapitali_suurus;
           this.kapitali_valuuta = kapitali_valuuta;
           this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
    }


    /**
     * Gets the kapitali_suurus value for this Paringliht_v4_evkapital.
     * 
     * @return kapitali_suurus
     */
    public java.lang.String getKapitali_suurus() {
        return kapitali_suurus;
    }


    /**
     * Sets the kapitali_suurus value for this Paringliht_v4_evkapital.
     * 
     * @param kapitali_suurus
     */
    public void setKapitali_suurus(java.lang.String kapitali_suurus) {
        this.kapitali_suurus = kapitali_suurus;
    }


    /**
     * Gets the kapitali_valuuta value for this Paringliht_v4_evkapital.
     * 
     * @return kapitali_valuuta
     */
    public java.lang.String getKapitali_valuuta() {
        return kapitali_valuuta;
    }


    /**
     * Sets the kapitali_valuuta value for this Paringliht_v4_evkapital.
     * 
     * @param kapitali_valuuta
     */
    public void setKapitali_valuuta(java.lang.String kapitali_valuuta) {
        this.kapitali_valuuta = kapitali_valuuta;
    }


    /**
     * Gets the asutatud_sissemakset_tegemata value for this Paringliht_v4_evkapital.
     * 
     * @return asutatud_sissemakset_tegemata
     */
    public java.lang.Boolean getAsutatud_sissemakset_tegemata() {
        return asutatud_sissemakset_tegemata;
    }


    /**
     * Sets the asutatud_sissemakset_tegemata value for this Paringliht_v4_evkapital.
     * 
     * @param asutatud_sissemakset_tegemata
     */
    public void setAsutatud_sissemakset_tegemata(java.lang.Boolean asutatud_sissemakset_tegemata) {
        this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v4_evkapital)) return false;
        Paringliht_v4_evkapital other = (Paringliht_v4_evkapital) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kapitali_suurus==null && other.getKapitali_suurus()==null) || 
             (this.kapitali_suurus!=null &&
              this.kapitali_suurus.equals(other.getKapitali_suurus()))) &&
            ((this.kapitali_valuuta==null && other.getKapitali_valuuta()==null) || 
             (this.kapitali_valuuta!=null &&
              this.kapitali_valuuta.equals(other.getKapitali_valuuta()))) &&
            ((this.asutatud_sissemakset_tegemata==null && other.getAsutatud_sissemakset_tegemata()==null) || 
             (this.asutatud_sissemakset_tegemata!=null &&
              this.asutatud_sissemakset_tegemata.equals(other.getAsutatud_sissemakset_tegemata())));
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
        if (getKapitali_suurus() != null) {
            _hashCode += getKapitali_suurus().hashCode();
        }
        if (getKapitali_valuuta() != null) {
            _hashCode += getKapitali_valuuta().hashCode();
        }
        if (getAsutatud_sissemakset_tegemata() != null) {
            _hashCode += getAsutatud_sissemakset_tegemata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paringliht_v4_evkapital.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "paringliht_v4_evkapital"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kapitali_suurus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kapitali_suurus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kapitali_valuuta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kapitali_valuuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asutatud_sissemakset_tegemata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asutatud_sissemakset_tegemata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
