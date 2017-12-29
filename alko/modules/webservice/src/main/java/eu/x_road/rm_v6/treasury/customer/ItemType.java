/**
 * ItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;

public class ItemType  implements java.io.Serializable {
    /* Faili nimetus. */
    private java.lang.String filename;

    /* Dokumendi viitenumber. Maksekorralduste puhul maksja
     * 								viitenumber. */
    private java.lang.String refNum;

    private int code;

    private java.lang.String message;

    public ItemType() {
    }

    public ItemType(
           java.lang.String filename,
           java.lang.String refNum,
           int code,
           java.lang.String message) {
           this.filename = filename;
           this.refNum = refNum;
           this.code = code;
           this.message = message;
    }


    /**
     * Gets the filename value for this ItemType.
     * 
     * @return filename   * Faili nimetus.
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this ItemType.
     * 
     * @param filename   * Faili nimetus.
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the refNum value for this ItemType.
     * 
     * @return refNum   * Dokumendi viitenumber. Maksekorralduste puhul maksja
     * 								viitenumber.
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this ItemType.
     * 
     * @param refNum   * Dokumendi viitenumber. Maksekorralduste puhul maksja
     * 								viitenumber.
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the code value for this ItemType.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this ItemType.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the message value for this ItemType.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ItemType.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemType)) return false;
        ItemType other = (ItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            this.code == other.getCode() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        _hashCode += getCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "ItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "Filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", ">Filename"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "Message"));
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
