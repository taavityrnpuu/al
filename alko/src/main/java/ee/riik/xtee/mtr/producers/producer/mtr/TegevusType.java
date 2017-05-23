/**
 * TegevusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class TegevusType  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.util.Date margeKP;

    private java.math.BigInteger kood;  // attribute

    private ee.riik.xtee.mtr.producers.producer.mtr.TegevusTyypType tyyp;  // attribute

    public TegevusType() {
    }

    public TegevusType(
           java.lang.String nimi,
           java.util.Date margeKP,
           java.math.BigInteger kood,
           ee.riik.xtee.mtr.producers.producer.mtr.TegevusTyypType tyyp) {
           this.nimi = nimi;
           this.margeKP = margeKP;
           this.kood = kood;
           this.tyyp = tyyp;
    }


    /**
     * Gets the nimi value for this TegevusType.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TegevusType.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the margeKP value for this TegevusType.
     * 
     * @return margeKP
     */
    public java.util.Date getMargeKP() {
        return margeKP;
    }


    /**
     * Sets the margeKP value for this TegevusType.
     * 
     * @param margeKP
     */
    public void setMargeKP(java.util.Date margeKP) {
        this.margeKP = margeKP;
    }


    /**
     * Gets the kood value for this TegevusType.
     * 
     * @return kood
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this TegevusType.
     * 
     * @param kood
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the tyyp value for this TegevusType.
     * 
     * @return tyyp
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.TegevusTyypType getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this TegevusType.
     * 
     * @param tyyp
     */
    public void setTyyp(ee.riik.xtee.mtr.producers.producer.mtr.TegevusTyypType tyyp) {
        this.tyyp = tyyp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TegevusType)) return false;
        TegevusType other = (TegevusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.margeKP==null && other.getMargeKP()==null) || 
             (this.margeKP!=null &&
              this.margeKP.equals(other.getMargeKP()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getMargeKP() != null) {
            _hashCode += getMargeKP().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TegevusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("kood");
        attrField.setXmlName(new javax.xml.namespace.QName("", "kood"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tyyp");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tyyp"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusTyypType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nimi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margeKP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "margeKP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
