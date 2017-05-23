/**
 * UpdateApplicationQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class UpdateApplicationQuery  implements java.io.Serializable {
    private ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplication appl;

    public UpdateApplicationQuery() {
    }

    public UpdateApplicationQuery(
           ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplication appl) {
           this.appl = appl;
    }


    /**
     * Gets the appl value for this UpdateApplicationQuery.
     * 
     * @return appl
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplication getAppl() {
        return appl;
    }


    /**
     * Sets the appl value for this UpdateApplicationQuery.
     * 
     * @param appl
     */
    public void setAppl(ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplication appl) {
        this.appl = appl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateApplicationQuery)) return false;
        UpdateApplicationQuery other = (UpdateApplicationQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appl==null && other.getAppl()==null) || 
             (this.appl!=null &&
              this.appl.equals(other.getAppl())));
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
        if (getAppl() != null) {
            _hashCode += getAppl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateApplicationQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplication"));
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
