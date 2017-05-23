/**
 * Tooteparing_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Tooteparing_vastus  implements java.io.Serializable {
    private java.lang.String teade;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida[] tooted;

    private java.lang.String tooted_csv;

    public Tooteparing_vastus() {
    }

    public Tooteparing_vastus(
           java.lang.String teade,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida[] tooted,
           java.lang.String tooted_csv) {
           this.teade = teade;
           this.tooted = tooted;
           this.tooted_csv = tooted_csv;
    }


    /**
     * Gets the teade value for this Tooteparing_vastus.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this Tooteparing_vastus.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the tooted value for this Tooteparing_vastus.
     * 
     * @return tooted
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida[] getTooted() {
        return tooted;
    }


    /**
     * Sets the tooted value for this Tooteparing_vastus.
     * 
     * @param tooted
     */
    public void setTooted(ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida[] tooted) {
        this.tooted = tooted;
    }


    /**
     * Gets the tooted_csv value for this Tooteparing_vastus.
     * 
     * @return tooted_csv
     */
    public java.lang.String getTooted_csv() {
        return tooted_csv;
    }


    /**
     * Sets the tooted_csv value for this Tooteparing_vastus.
     * 
     * @param tooted_csv
     */
    public void setTooted_csv(java.lang.String tooted_csv) {
        this.tooted_csv = tooted_csv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tooteparing_vastus)) return false;
        Tooteparing_vastus other = (Tooteparing_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade()))) &&
            ((this.tooted==null && other.getTooted()==null) || 
             (this.tooted!=null &&
              java.util.Arrays.equals(this.tooted, other.getTooted()))) &&
            ((this.tooted_csv==null && other.getTooted_csv()==null) || 
             (this.tooted_csv!=null &&
              this.tooted_csv.equals(other.getTooted_csv())));
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
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        if (getTooted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTooted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTooted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTooted_csv() != null) {
            _hashCode += getTooted_csv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tooteparing_vastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tooted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tooted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastuserida"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tooted_csv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tooted_csv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
