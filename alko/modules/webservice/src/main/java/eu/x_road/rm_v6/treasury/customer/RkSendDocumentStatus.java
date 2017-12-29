/**
 * RkSendDocumentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;

public class RkSendDocumentStatus  implements java.io.Serializable {
    private eu.x_road.rm_v6.treasury.customer.DocumentStatusType documentStatus;

    public RkSendDocumentStatus() {
    }

    public RkSendDocumentStatus(
           eu.x_road.rm_v6.treasury.customer.DocumentStatusType documentStatus) {
           this.documentStatus = documentStatus;
    }


    /**
     * Gets the documentStatus value for this RkSendDocumentStatus.
     * 
     * @return documentStatus
     */
    public eu.x_road.rm_v6.treasury.customer.DocumentStatusType getDocumentStatus() {
        return documentStatus;
    }


    /**
     * Sets the documentStatus value for this RkSendDocumentStatus.
     * 
     * @param documentStatus
     */
    public void setDocumentStatus(eu.x_road.rm_v6.treasury.customer.DocumentStatusType documentStatus) {
        this.documentStatus = documentStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RkSendDocumentStatus)) return false;
        RkSendDocumentStatus other = (RkSendDocumentStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentStatus==null && other.getDocumentStatus()==null) || 
             (this.documentStatus!=null &&
              this.documentStatus.equals(other.getDocumentStatus())));
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
        if (getDocumentStatus() != null) {
            _hashCode += getDocumentStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RkSendDocumentStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", ">rkSendDocumentStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "DocumentStatusType"));
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
