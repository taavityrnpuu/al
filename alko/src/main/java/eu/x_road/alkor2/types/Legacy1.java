/**
 * Legacy1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2.types;

public class Legacy1  implements java.io.Serializable {
    private java.lang.String[] keha;

    public Legacy1() {
    }

    public Legacy1(
           java.lang.String[] keha) {
           this.keha = keha;
    }


    /**
     * Gets the keha value for this Legacy1.
     * 
     * @return keha
     */
    public java.lang.String[] getKeha() {
        return keha;
    }


    /**
     * Sets the keha value for this Legacy1.
     * 
     * @param keha
     */
    public void setKeha(java.lang.String[] keha) {
        this.keha = keha;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Legacy1)) return false;
        Legacy1 other = (Legacy1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keha==null && other.getKeha()==null) || 
             (this.keha!=null &&
              java.util.Arrays.equals(this.keha, other.getKeha())));
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
        if (getKeha() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeha());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeha(), i);
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
        new org.apache.axis.description.TypeDesc(Legacy1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">legacy1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
