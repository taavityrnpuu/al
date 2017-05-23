/**
 * ExtendData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class ExtendData  implements java.io.Serializable {
    private java.lang.String regNr;

    private java.lang.String start;

    private java.lang.String end;

    private java.lang.String productName;

    private java.lang.String productType;

    private java.lang.String productCap;

    private java.lang.String productVol;

    private java.lang.String producerName;

    private java.lang.String producerCountry;

    private java.lang.String origCountry;

    private java.lang.String remark;

    private java.lang.String id;

    public ExtendData() {
    }

    public ExtendData(
           java.lang.String regNr,
           java.lang.String start,
           java.lang.String end,
           java.lang.String productName,
           java.lang.String productType,
           java.lang.String productCap,
           java.lang.String productVol,
           java.lang.String producerName,
           java.lang.String producerCountry,
           java.lang.String origCountry,
           java.lang.String remark,
           java.lang.String id) {
           this.regNr = regNr;
           this.start = start;
           this.end = end;
           this.productName = productName;
           this.productType = productType;
           this.productCap = productCap;
           this.productVol = productVol;
           this.producerName = producerName;
           this.producerCountry = producerCountry;
           this.origCountry = origCountry;
           this.remark = remark;
           this.id = id;
    }


    /**
     * Gets the regNr value for this ExtendData.
     * 
     * @return regNr
     */
    public java.lang.String getRegNr() {
        return regNr;
    }


    /**
     * Sets the regNr value for this ExtendData.
     * 
     * @param regNr
     */
    public void setRegNr(java.lang.String regNr) {
        this.regNr = regNr;
    }


    /**
     * Gets the start value for this ExtendData.
     * 
     * @return start
     */
    public java.lang.String getStart() {
        return start;
    }


    /**
     * Sets the start value for this ExtendData.
     * 
     * @param start
     */
    public void setStart(java.lang.String start) {
        this.start = start;
    }


    /**
     * Gets the end value for this ExtendData.
     * 
     * @return end
     */
    public java.lang.String getEnd() {
        return end;
    }


    /**
     * Sets the end value for this ExtendData.
     * 
     * @param end
     */
    public void setEnd(java.lang.String end) {
        this.end = end;
    }


    /**
     * Gets the productName value for this ExtendData.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this ExtendData.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productType value for this ExtendData.
     * 
     * @return productType
     */
    public java.lang.String getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this ExtendData.
     * 
     * @param productType
     */
    public void setProductType(java.lang.String productType) {
        this.productType = productType;
    }


    /**
     * Gets the productCap value for this ExtendData.
     * 
     * @return productCap
     */
    public java.lang.String getProductCap() {
        return productCap;
    }


    /**
     * Sets the productCap value for this ExtendData.
     * 
     * @param productCap
     */
    public void setProductCap(java.lang.String productCap) {
        this.productCap = productCap;
    }


    /**
     * Gets the productVol value for this ExtendData.
     * 
     * @return productVol
     */
    public java.lang.String getProductVol() {
        return productVol;
    }


    /**
     * Sets the productVol value for this ExtendData.
     * 
     * @param productVol
     */
    public void setProductVol(java.lang.String productVol) {
        this.productVol = productVol;
    }


    /**
     * Gets the producerName value for this ExtendData.
     * 
     * @return producerName
     */
    public java.lang.String getProducerName() {
        return producerName;
    }


    /**
     * Sets the producerName value for this ExtendData.
     * 
     * @param producerName
     */
    public void setProducerName(java.lang.String producerName) {
        this.producerName = producerName;
    }


    /**
     * Gets the producerCountry value for this ExtendData.
     * 
     * @return producerCountry
     */
    public java.lang.String getProducerCountry() {
        return producerCountry;
    }


    /**
     * Sets the producerCountry value for this ExtendData.
     * 
     * @param producerCountry
     */
    public void setProducerCountry(java.lang.String producerCountry) {
        this.producerCountry = producerCountry;
    }


    /**
     * Gets the origCountry value for this ExtendData.
     * 
     * @return origCountry
     */
    public java.lang.String getOrigCountry() {
        return origCountry;
    }


    /**
     * Sets the origCountry value for this ExtendData.
     * 
     * @param origCountry
     */
    public void setOrigCountry(java.lang.String origCountry) {
        this.origCountry = origCountry;
    }


    /**
     * Gets the remark value for this ExtendData.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this ExtendData.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the id value for this ExtendData.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ExtendData.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendData)) return false;
        ExtendData other = (ExtendData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regNr==null && other.getRegNr()==null) || 
             (this.regNr!=null &&
              this.regNr.equals(other.getRegNr()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd()))) &&
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
            ((this.producerName==null && other.getProducerName()==null) || 
             (this.producerName!=null &&
              this.producerName.equals(other.getProducerName()))) &&
            ((this.producerCountry==null && other.getProducerCountry()==null) || 
             (this.producerCountry!=null &&
              this.producerCountry.equals(other.getProducerCountry()))) &&
            ((this.origCountry==null && other.getOrigCountry()==null) || 
             (this.origCountry!=null &&
              this.origCountry.equals(other.getOrigCountry()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getRegNr() != null) {
            _hashCode += getRegNr().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
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
        if (getProducerName() != null) {
            _hashCode += getProducerName().hashCode();
        }
        if (getProducerCountry() != null) {
            _hashCode += getProducerCountry().hashCode();
        }
        if (getOrigCountry() != null) {
            _hashCode += getOrigCountry().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("producerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
