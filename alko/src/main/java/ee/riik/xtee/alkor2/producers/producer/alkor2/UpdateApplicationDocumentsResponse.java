/**
 * UpdateApplicationDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class UpdateApplicationDocumentsResponse  implements java.io.Serializable {
    private java.lang.String applicationId;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType[] existingApplicationDocuments;

    public UpdateApplicationDocumentsResponse() {
    }

    public UpdateApplicationDocumentsResponse(
           java.lang.String applicationId,
           ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType[] existingApplicationDocuments) {
           this.applicationId = applicationId;
           this.existingApplicationDocuments = existingApplicationDocuments;
    }


    /**
     * Gets the applicationId value for this UpdateApplicationDocumentsResponse.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this UpdateApplicationDocumentsResponse.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the existingApplicationDocuments value for this UpdateApplicationDocumentsResponse.
     * 
     * @return existingApplicationDocuments
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType[] getExistingApplicationDocuments() {
        return existingApplicationDocuments;
    }


    /**
     * Sets the existingApplicationDocuments value for this UpdateApplicationDocumentsResponse.
     * 
     * @param existingApplicationDocuments
     */
    public void setExistingApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType[] existingApplicationDocuments) {
        this.existingApplicationDocuments = existingApplicationDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateApplicationDocumentsResponse)) return false;
        UpdateApplicationDocumentsResponse other = (UpdateApplicationDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.existingApplicationDocuments==null && other.getExistingApplicationDocuments()==null) || 
             (this.existingApplicationDocuments!=null &&
              java.util.Arrays.equals(this.existingApplicationDocuments, other.getExistingApplicationDocuments())));
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getExistingApplicationDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExistingApplicationDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExistingApplicationDocuments(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateApplicationDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingApplicationDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExistingApplicationDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplicationDocumentType"));
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
