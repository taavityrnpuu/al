/**
 * RkSendTransactionStatement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class RkSendTransactionStatement  implements java.io.Serializable {
    private eu.x_road.alkor2.MokaQueryType mokaQuery;

    public RkSendTransactionStatement() {
    }

    public RkSendTransactionStatement(
           eu.x_road.alkor2.MokaQueryType mokaQuery) {
           this.mokaQuery = mokaQuery;
    }


    /**
     * Gets the mokaQuery value for this RkSendTransactionStatement.
     * 
     * @return mokaQuery
     */
    public eu.x_road.alkor2.MokaQueryType getMokaQuery() {
        return mokaQuery;
    }


    /**
     * Sets the mokaQuery value for this RkSendTransactionStatement.
     * 
     * @param mokaQuery
     */
    public void setMokaQuery(eu.x_road.alkor2.MokaQueryType mokaQuery) {
        this.mokaQuery = mokaQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RkSendTransactionStatement)) return false;
        RkSendTransactionStatement other = (RkSendTransactionStatement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mokaQuery==null && other.getMokaQuery()==null) || 
             (this.mokaQuery!=null &&
              this.mokaQuery.equals(other.getMokaQuery())));
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
        if (getMokaQuery() != null) {
            _hashCode += getMokaQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RkSendTransactionStatement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", ">rkSendTransactionStatement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mokaQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MokaQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "MokaQueryType"));
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
