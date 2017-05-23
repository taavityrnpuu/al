/**
 * RegistreeringDetailneParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistreeringDetailneParing  implements java.io.Serializable {
    private java.lang.String tegevusalaKood;

    private java.lang.String kood;

    private java.math.BigInteger[] tegevused;

    public RegistreeringDetailneParing() {
    }

    public RegistreeringDetailneParing(
           java.lang.String tegevusalaKood,
           java.lang.String kood,
           java.math.BigInteger[] tegevused) {
           this.tegevusalaKood = tegevusalaKood;
           this.kood = kood;
           this.tegevused = tegevused;
    }


    /**
     * Gets the tegevusalaKood value for this RegistreeringDetailneParing.
     * 
     * @return tegevusalaKood
     */
    public java.lang.String getTegevusalaKood() {
        return tegevusalaKood;
    }


    /**
     * Sets the tegevusalaKood value for this RegistreeringDetailneParing.
     * 
     * @param tegevusalaKood
     */
    public void setTegevusalaKood(java.lang.String tegevusalaKood) {
        this.tegevusalaKood = tegevusalaKood;
    }


    /**
     * Gets the kood value for this RegistreeringDetailneParing.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RegistreeringDetailneParing.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the tegevused value for this RegistreeringDetailneParing.
     * 
     * @return tegevused
     */
    public java.math.BigInteger[] getTegevused() {
        return tegevused;
    }


    /**
     * Sets the tegevused value for this RegistreeringDetailneParing.
     * 
     * @param tegevused
     */
    public void setTegevused(java.math.BigInteger[] tegevused) {
        this.tegevused = tegevused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringDetailneParing)) return false;
        RegistreeringDetailneParing other = (RegistreeringDetailneParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevusalaKood==null && other.getTegevusalaKood()==null) || 
             (this.tegevusalaKood!=null &&
              this.tegevusalaKood.equals(other.getTegevusalaKood()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.tegevused==null && other.getTegevused()==null) || 
             (this.tegevused!=null &&
              java.util.Arrays.equals(this.tegevused, other.getTegevused())));
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
        if (getTegevusalaKood() != null) {
            _hashCode += getTegevusalaKood().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getTegevused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevused(), i);
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
        new org.apache.axis.description.TypeDesc(RegistreeringDetailneParing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneParing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusalaKood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevusalaKood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevused");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "tegevusKood"));
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
