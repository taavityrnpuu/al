/**
 * ExtendResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class ExtendResponse  implements java.io.Serializable {
    private java.lang.String message;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendData[] apps;

    public ExtendResponse() {
    }

    public ExtendResponse(
           java.lang.String message,
           ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendData[] apps) {
           this.message = message;
           this.apps = apps;
    }


    /**
     * Gets the message value for this ExtendResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ExtendResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the apps value for this ExtendResponse.
     * 
     * @return apps
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendData[] getApps() {
        return apps;
    }


    /**
     * Sets the apps value for this ExtendResponse.
     * 
     * @param apps
     */
    public void setApps(ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendData[] apps) {
        this.apps = apps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendResponse)) return false;
        ExtendResponse other = (ExtendResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.apps==null && other.getApps()==null) || 
             (this.apps!=null &&
              java.util.Arrays.equals(this.apps, other.getApps())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getApps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApps(), i);
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
        new org.apache.axis.description.TypeDesc(ExtendResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendData"));
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
