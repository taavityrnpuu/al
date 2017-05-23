/**
 * KammparingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2.types;

public class KammparingResponse  implements java.io.Serializable {
    private eu.x_road.alkor2.types.Status_t status;

    private eu.x_road.alkor2.types.Item item;

    public KammparingResponse() {
    }

    public KammparingResponse(
           eu.x_road.alkor2.types.Status_t status,
           eu.x_road.alkor2.types.Item item) {
           this.status = status;
           this.item = item;
    }


    /**
     * Gets the status value for this KammparingResponse.
     * 
     * @return status
     */
    public eu.x_road.alkor2.types.Status_t getStatus() {
        return status;
    }


    /**
     * Sets the status value for this KammparingResponse.
     * 
     * @param status
     */
    public void setStatus(eu.x_road.alkor2.types.Status_t status) {
        this.status = status;
    }


    /**
     * Gets the item value for this KammparingResponse.
     * 
     * @return item
     */
    public eu.x_road.alkor2.types.Item getItem() {
        return item;
    }


    /**
     * Sets the item value for this KammparingResponse.
     * 
     * @param item
     */
    public void setItem(eu.x_road.alkor2.types.Item item) {
        this.item = item;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KammparingResponse)) return false;
        KammparingResponse other = (KammparingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KammparingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">kammparingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "status_t"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "item"));
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
