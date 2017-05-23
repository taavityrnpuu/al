/**
 * Liikumine_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Liikumine_vastus  implements java.io.Serializable {
    private java.lang.String teade;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine[] liikumised;

    private java.lang.String liikumised_csv;

    public Liikumine_vastus() {
    }

    public Liikumine_vastus(
           java.lang.String teade,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine[] liikumised,
           java.lang.String liikumised_csv) {
           this.teade = teade;
           this.liikumised = liikumised;
           this.liikumised_csv = liikumised_csv;
    }


    /**
     * Gets the teade value for this Liikumine_vastus.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this Liikumine_vastus.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the liikumised value for this Liikumine_vastus.
     * 
     * @return liikumised
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine[] getLiikumised() {
        return liikumised;
    }


    /**
     * Sets the liikumised value for this Liikumine_vastus.
     * 
     * @param liikumised
     */
    public void setLiikumised(ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine[] liikumised) {
        this.liikumised = liikumised;
    }


    /**
     * Gets the liikumised_csv value for this Liikumine_vastus.
     * 
     * @return liikumised_csv
     */
    public java.lang.String getLiikumised_csv() {
        return liikumised_csv;
    }


    /**
     * Sets the liikumised_csv value for this Liikumine_vastus.
     * 
     * @param liikumised_csv
     */
    public void setLiikumised_csv(java.lang.String liikumised_csv) {
        this.liikumised_csv = liikumised_csv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Liikumine_vastus)) return false;
        Liikumine_vastus other = (Liikumine_vastus) obj;
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
            ((this.liikumised==null && other.getLiikumised()==null) || 
             (this.liikumised!=null &&
              java.util.Arrays.equals(this.liikumised, other.getLiikumised()))) &&
            ((this.liikumised_csv==null && other.getLiikumised_csv()==null) || 
             (this.liikumised_csv!=null &&
              this.liikumised_csv.equals(other.getLiikumised_csv())));
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
        if (getLiikumised() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiikumised());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiikumised(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiikumised_csv() != null) {
            _hashCode += getLiikumised_csv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Liikumine_vastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_vastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liikumised");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liikumised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liikumised_csv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liikumised_csv"));
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
