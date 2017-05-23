/**
 * Aktsiisiladu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.emta.producers.producer.emta;

public class Aktsiisiladu  implements java.io.Serializable {
    private java.lang.String luba;

    private java.util.Date kehtibAlates;

    private java.util.Date kehtibKuni;

    public Aktsiisiladu() {
    }

    public Aktsiisiladu(
           java.lang.String luba,
           java.util.Date kehtibAlates,
           java.util.Date kehtibKuni) {
           this.luba = luba;
           this.kehtibAlates = kehtibAlates;
           this.kehtibKuni = kehtibKuni;
    }


    /**
     * Gets the luba value for this Aktsiisiladu.
     * 
     * @return luba
     */
    public java.lang.String getLuba() {
        return luba;
    }


    /**
     * Sets the luba value for this Aktsiisiladu.
     * 
     * @param luba
     */
    public void setLuba(java.lang.String luba) {
        this.luba = luba;
    }


    /**
     * Gets the kehtibAlates value for this Aktsiisiladu.
     * 
     * @return kehtibAlates
     */
    public java.util.Date getKehtibAlates() {
        return kehtibAlates;
    }


    /**
     * Sets the kehtibAlates value for this Aktsiisiladu.
     * 
     * @param kehtibAlates
     */
    public void setKehtibAlates(java.util.Date kehtibAlates) {
        this.kehtibAlates = kehtibAlates;
    }


    /**
     * Gets the kehtibKuni value for this Aktsiisiladu.
     * 
     * @return kehtibKuni
     */
    public java.util.Date getKehtibKuni() {
        return kehtibKuni;
    }


    /**
     * Sets the kehtibKuni value for this Aktsiisiladu.
     * 
     * @param kehtibKuni
     */
    public void setKehtibKuni(java.util.Date kehtibKuni) {
        this.kehtibKuni = kehtibKuni;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aktsiisiladu)) return false;
        Aktsiisiladu other = (Aktsiisiladu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.luba==null && other.getLuba()==null) || 
             (this.luba!=null &&
              this.luba.equals(other.getLuba()))) &&
            ((this.kehtibAlates==null && other.getKehtibAlates()==null) || 
             (this.kehtibAlates!=null &&
              this.kehtibAlates.equals(other.getKehtibAlates()))) &&
            ((this.kehtibKuni==null && other.getKehtibKuni()==null) || 
             (this.kehtibKuni!=null &&
              this.kehtibKuni.equals(other.getKehtibKuni())));
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
        if (getLuba() != null) {
            _hashCode += getLuba().hashCode();
        }
        if (getKehtibAlates() != null) {
            _hashCode += getKehtibAlates().hashCode();
        }
        if (getKehtibKuni() != null) {
            _hashCode += getKehtibKuni().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aktsiisiladu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.emta.xtee.riik.ee/producer/emta", "aktsiisiladu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luba");
        elemField.setXmlName(new javax.xml.namespace.QName("", "luba"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kehtibAlates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kehtibAlates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kehtibKuni");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kehtibKuni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
