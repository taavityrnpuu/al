/**
 * Aruandeparing_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Aruandeparing_vastus  implements java.io.Serializable {
    private java.lang.String teade;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida[] aruanded;

    private java.lang.String aruanded_csv;

    public Aruandeparing_vastus() {
    }

    public Aruandeparing_vastus(
           java.lang.String teade,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida[] aruanded,
           java.lang.String aruanded_csv) {
           this.teade = teade;
           this.aruanded = aruanded;
           this.aruanded_csv = aruanded_csv;
    }


    /**
     * Gets the teade value for this Aruandeparing_vastus.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this Aruandeparing_vastus.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the aruanded value for this Aruandeparing_vastus.
     * 
     * @return aruanded
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida[] getAruanded() {
        return aruanded;
    }


    /**
     * Sets the aruanded value for this Aruandeparing_vastus.
     * 
     * @param aruanded
     */
    public void setAruanded(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida[] aruanded) {
        this.aruanded = aruanded;
    }


    /**
     * Gets the aruanded_csv value for this Aruandeparing_vastus.
     * 
     * @return aruanded_csv
     */
    public java.lang.String getAruanded_csv() {
        return aruanded_csv;
    }


    /**
     * Sets the aruanded_csv value for this Aruandeparing_vastus.
     * 
     * @param aruanded_csv
     */
    public void setAruanded_csv(java.lang.String aruanded_csv) {
        this.aruanded_csv = aruanded_csv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruandeparing_vastus)) return false;
        Aruandeparing_vastus other = (Aruandeparing_vastus) obj;
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
            ((this.aruanded==null && other.getAruanded()==null) || 
             (this.aruanded!=null &&
              java.util.Arrays.equals(this.aruanded, other.getAruanded()))) &&
            ((this.aruanded_csv==null && other.getAruanded_csv()==null) || 
             (this.aruanded_csv!=null &&
              this.aruanded_csv.equals(other.getAruanded_csv())));
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
        if (getAruanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAruanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAruanded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAruanded_csv() != null) {
            _hashCode += getAruanded_csv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aruandeparing_vastus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aruanded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aruanded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastuserida"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aruanded_csv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aruanded_csv"));
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
