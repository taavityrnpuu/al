/**
 * Paringliht_v4_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.arireg.producers.producer.arireg;

public class Paringliht_v4_paring  implements java.io.Serializable {
	
    private java.lang.String evnimi;

    private java.math.BigInteger evarv;

    private java.lang.String keel;

    public Paringliht_v4_paring() {
    }

    public Paringliht_v4_paring(
           java.lang.String evnimi,
           java.math.BigInteger evarv,
           java.lang.String keel) {
           this.evnimi = evnimi;
           this.evarv = evarv;
           this.keel = keel;
    }


    /**
     * Gets the evnimi value for this Paringliht_v4_paring.
     * 
     * @return evnimi
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }


    /**
     * Sets the evnimi value for this Paringliht_v4_paring.
     * 
     * @param evnimi
     */
    public void setEvnimi(java.lang.String evnimi) {
        this.evnimi = evnimi;
    }


    /**
     * Gets the evarv value for this Paringliht_v4_paring.
     * 
     * @return evarv
     */
    public java.math.BigInteger getEvarv() {
        return evarv;
    }


    /**
     * Sets the evarv value for this Paringliht_v4_paring.
     * 
     * @param evarv
     */
    public void setEvarv(java.math.BigInteger evarv) {
        this.evarv = evarv;
    }


    /**
     * Gets the keel value for this Paringliht_v4_paring.
     * 
     * @return keel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Paringliht_v4_paring.
     * 
     * @param keel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v4_paring)) return false;
        Paringliht_v4_paring other = (Paringliht_v4_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.evnimi==null && other.getEvnimi()==null) || 
             (this.evnimi!=null &&
              this.evnimi.equals(other.getEvnimi()))) &&
            ((this.evarv==null && other.getEvarv()==null) || 
             (this.evarv!=null &&
              this.evarv.equals(other.getEvarv()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel())));
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
        if (getEvnimi() != null) {
            _hashCode += getEvnimi().hashCode();
        }
        if (getEvarv() != null) {
            _hashCode += getEvarv().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paringliht_v4_paring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "paringliht_v4_paring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evnimi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evnimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evarv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evarv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
