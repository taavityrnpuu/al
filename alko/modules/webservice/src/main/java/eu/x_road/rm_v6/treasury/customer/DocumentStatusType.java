/**
 * DocumentStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;


/**
 * Signeeritud dokumendi vastuvõtmise formaat.
 */
public class DocumentStatusType  implements java.io.Serializable {
    /* Dokumendi unikaalne ID. */
    private java.lang.String uniqueId;

    /* Dokumendi tüüp. */
    private java.lang.String type;

    /* Dokumendi tüüp. */
    private eu.x_road.rm_v6.treasury.customer.FileType[] files;

    /* Failis olnud alamdokumentide massiiv. */
    private eu.x_road.rm_v6.treasury.customer.ItemType[] items;

    public DocumentStatusType() {
    }

    public DocumentStatusType(
           java.lang.String uniqueId,
           java.lang.String type,
           eu.x_road.rm_v6.treasury.customer.FileType[] files,
           eu.x_road.rm_v6.treasury.customer.ItemType[] items) {
           this.uniqueId = uniqueId;
           this.type = type;
           this.files = files;
           this.items = items;
    }


    /**
     * Gets the uniqueId value for this DocumentStatusType.
     * 
     * @return uniqueId   * Dokumendi unikaalne ID.
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this DocumentStatusType.
     * 
     * @param uniqueId   * Dokumendi unikaalne ID.
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the type value for this DocumentStatusType.
     * 
     * @return type   * Dokumendi tüüp.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DocumentStatusType.
     * 
     * @param type   * Dokumendi tüüp.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the files value for this DocumentStatusType.
     * 
     * @return files   * Dokumendi tüüp.
     */
    public eu.x_road.rm_v6.treasury.customer.FileType[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this DocumentStatusType.
     * 
     * @param files   * Dokumendi tüüp.
     */
    public void setFiles(eu.x_road.rm_v6.treasury.customer.FileType[] files) {
        this.files = files;
    }


    /**
     * Gets the items value for this DocumentStatusType.
     * 
     * @return items   * Failis olnud alamdokumentide massiiv.
     */
    public eu.x_road.rm_v6.treasury.customer.ItemType[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this DocumentStatusType.
     * 
     * @param items   * Failis olnud alamdokumentide massiiv.
     */
    public void setItems(eu.x_road.rm_v6.treasury.customer.ItemType[] items) {
        this.items = items;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentStatusType)) return false;
        DocumentStatusType other = (DocumentStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
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
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "DocumentStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "FileType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "File"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "ItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Item"));
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
