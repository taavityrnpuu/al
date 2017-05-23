/**
 * Treasury.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Treasury  implements java.io.Serializable {
    private java.lang.String documentNum;

    private java.lang.String orderNum;

    private java.lang.String bankRef;

    public Treasury() {
    }

    public Treasury(
           java.lang.String documentNum,
           java.lang.String orderNum,
           java.lang.String bankRef) {
           this.documentNum = documentNum;
           this.orderNum = orderNum;
           this.bankRef = bankRef;
    }


    /**
     * Gets the documentNum value for this Treasury.
     * 
     * @return documentNum
     */
    public java.lang.String getDocumentNum() {
        return documentNum;
    }


    /**
     * Sets the documentNum value for this Treasury.
     * 
     * @param documentNum
     */
    public void setDocumentNum(java.lang.String documentNum) {
        this.documentNum = documentNum;
    }


    /**
     * Gets the orderNum value for this Treasury.
     * 
     * @return orderNum
     */
    public java.lang.String getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Treasury.
     * 
     * @param orderNum
     */
    public void setOrderNum(java.lang.String orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the bankRef value for this Treasury.
     * 
     * @return bankRef
     */
    public java.lang.String getBankRef() {
        return bankRef;
    }


    /**
     * Sets the bankRef value for this Treasury.
     * 
     * @param bankRef
     */
    public void setBankRef(java.lang.String bankRef) {
        this.bankRef = bankRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Treasury)) return false;
        Treasury other = (Treasury) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentNum==null && other.getDocumentNum()==null) || 
             (this.documentNum!=null &&
              this.documentNum.equals(other.getDocumentNum()))) &&
            ((this.orderNum==null && other.getOrderNum()==null) || 
             (this.orderNum!=null &&
              this.orderNum.equals(other.getOrderNum()))) &&
            ((this.bankRef==null && other.getBankRef()==null) || 
             (this.bankRef!=null &&
              this.bankRef.equals(other.getBankRef())));
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
        if (getDocumentNum() != null) {
            _hashCode += getDocumentNum().hashCode();
        }
        if (getOrderNum() != null) {
            _hashCode += getOrderNum().hashCode();
        }
        if (getBankRef() != null) {
            _hashCode += getBankRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Treasury.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Treasury"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankRef"));
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
