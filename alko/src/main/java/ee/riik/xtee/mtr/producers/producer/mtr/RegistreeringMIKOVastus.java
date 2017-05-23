/**
 * RegistreeringMIKOVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistreeringMIKOVastus  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType[] registrikanne;

    private java.math.BigInteger kirjeid;

    public RegistreeringMIKOVastus() {
    }

    public RegistreeringMIKOVastus(
           ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType[] registrikanne,
           java.math.BigInteger kirjeid) {
           this.registrikanne = registrikanne;
           this.kirjeid = kirjeid;
    }


    /**
     * Gets the registrikanne value for this RegistreeringMIKOVastus.
     * 
     * @return registrikanne
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType[] getRegistrikanne() {
        return registrikanne;
    }


    /**
     * Sets the registrikanne value for this RegistreeringMIKOVastus.
     * 
     * @param registrikanne
     */
    public void setRegistrikanne(ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType[] registrikanne) {
        this.registrikanne = registrikanne;
    }

    public ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType getRegistrikanne(int i) {
        return this.registrikanne[i];
    }

    public void setRegistrikanne(int i, ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType _value) {
        this.registrikanne[i] = _value;
    }


    /**
     * Gets the kirjeid value for this RegistreeringMIKOVastus.
     * 
     * @return kirjeid
     */
    public java.math.BigInteger getKirjeid() {
        return kirjeid;
    }


    /**
     * Sets the kirjeid value for this RegistreeringMIKOVastus.
     * 
     * @param kirjeid
     */
    public void setKirjeid(java.math.BigInteger kirjeid) {
        this.kirjeid = kirjeid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringMIKOVastus)) return false;
        RegistreeringMIKOVastus other = (RegistreeringMIKOVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikanne==null && other.getRegistrikanne()==null) || 
             (this.registrikanne!=null &&
              java.util.Arrays.equals(this.registrikanne, other.getRegistrikanne()))) &&
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
        if (getRegistrikanne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikanne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikanne(), i);
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
        new org.apache.axis.description.TypeDesc(RegistreeringMIKOVastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringMIKOVastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrikanne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrikanne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registriKanneMIKOType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
