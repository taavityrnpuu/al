/**
 * AppFollow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class AppFollow  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String date;

    private java.lang.String productName;

    private java.lang.String productType;

    private java.lang.String productCap;

    private java.lang.String productVol;

    private java.lang.String state;

    private java.lang.String processingPerson;

    private java.lang.String comment;

    private java.lang.String modificationDate;

    public AppFollow() {
    }

    public AppFollow(
           java.lang.String id,
           java.lang.String date,
           java.lang.String productName,
           java.lang.String productType,
           java.lang.String productCap,
           java.lang.String productVol,
           java.lang.String state,
           java.lang.String processingPerson,
           java.lang.String comment,
           java.lang.String modificationDate) {
           this.id = id;
           this.date = date;
           this.productName = productName;
           this.productType = productType;
           this.productCap = productCap;
           this.productVol = productVol;
           this.state = state;
           this.processingPerson = processingPerson;
           this.comment = comment;
           this.modificationDate = modificationDate;
    }


    /**
     * Gets the id value for this AppFollow.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AppFollow.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the date value for this AppFollow.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this AppFollow.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the productName value for this AppFollow.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this AppFollow.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productType value for this AppFollow.
     * 
     * @return productType
     */
    public java.lang.String getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this AppFollow.
     * 
     * @param productType
     */
    public void setProductType(java.lang.String productType) {
        this.productType = productType;
    }


    /**
     * Gets the productCap value for this AppFollow.
     * 
     * @return productCap
     */
    public java.lang.String getProductCap() {
        return productCap;
    }


    /**
     * Sets the productCap value for this AppFollow.
     * 
     * @param productCap
     */
    public void setProductCap(java.lang.String productCap) {
        this.productCap = productCap;
    }


    /**
     * Gets the productVol value for this AppFollow.
     * 
     * @return productVol
     */
    public java.lang.String getProductVol() {
        return productVol;
    }


    /**
     * Sets the productVol value for this AppFollow.
     * 
     * @param productVol
     */
    public void setProductVol(java.lang.String productVol) {
        this.productVol = productVol;
    }


    /**
     * Gets the state value for this AppFollow.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this AppFollow.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the processingPerson value for this AppFollow.
     * 
     * @return processingPerson
     */
    public java.lang.String getProcessingPerson() {
        return processingPerson;
    }


    /**
     * Sets the processingPerson value for this AppFollow.
     * 
     * @param processingPerson
     */
    public void setProcessingPerson(java.lang.String processingPerson) {
        this.processingPerson = processingPerson;
    }


    /**
     * Gets the comment value for this AppFollow.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this AppFollow.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the modificationDate value for this AppFollow.
     * 
     * @return modificationDate
     */
    public java.lang.String getModificationDate() {
        return modificationDate;
    }


    /**
     * Sets the modificationDate value for this AppFollow.
     * 
     * @param modificationDate
     */
    public void setModificationDate(java.lang.String modificationDate) {
        this.modificationDate = modificationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppFollow)) return false;
        AppFollow other = (AppFollow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.productCap==null && other.getProductCap()==null) || 
             (this.productCap!=null &&
              this.productCap.equals(other.getProductCap()))) &&
            ((this.productVol==null && other.getProductVol()==null) || 
             (this.productVol!=null &&
              this.productVol.equals(other.getProductVol()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.processingPerson==null && other.getProcessingPerson()==null) || 
             (this.processingPerson!=null &&
              this.processingPerson.equals(other.getProcessingPerson()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.modificationDate==null && other.getModificationDate()==null) || 
             (this.modificationDate!=null &&
              this.modificationDate.equals(other.getModificationDate())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getProductCap() != null) {
            _hashCode += getProductCap().hashCode();
        }
        if (getProductVol() != null) {
            _hashCode += getProductVol().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getProcessingPerson() != null) {
            _hashCode += getProcessingPerson().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getModificationDate() != null) {
            _hashCode += getModificationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppFollow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AppFollow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productVol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processingPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modificationDate"));
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
