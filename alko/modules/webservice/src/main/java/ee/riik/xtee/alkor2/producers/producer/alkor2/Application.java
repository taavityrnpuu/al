/**
 * Application.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Application  implements java.io.Serializable {
    private java.lang.String applicantPosition;

    private java.lang.String exciseStoreHouseNr;

    private java.lang.String acknowledgementNr;

    private java.util.Date acknowledgementDate;

    private java.lang.String MTRCode;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Product productInfo;

    private java.lang.String notes;

    public Application() {
    }

    public Application(
           java.lang.String applicantPosition,
           java.lang.String exciseStoreHouseNr,
           java.lang.String acknowledgementNr,
           java.util.Date acknowledgementDate,
           java.lang.String MTRCode,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Product productInfo,
           java.lang.String notes) {
           this.applicantPosition = applicantPosition;
           this.exciseStoreHouseNr = exciseStoreHouseNr;
           this.acknowledgementNr = acknowledgementNr;
           this.acknowledgementDate = acknowledgementDate;
           this.MTRCode = MTRCode;
           this.productInfo = productInfo;
           this.notes = notes;
    }


    /**
     * Gets the applicantPosition value for this Application.
     * 
     * @return applicantPosition
     */
    public java.lang.String getApplicantPosition() {
        return applicantPosition;
    }


    /**
     * Sets the applicantPosition value for this Application.
     * 
     * @param applicantPosition
     */
    public void setApplicantPosition(java.lang.String applicantPosition) {
        this.applicantPosition = applicantPosition;
    }


    /**
     * Gets the exciseStoreHouseNr value for this Application.
     * 
     * @return exciseStoreHouseNr
     */
    public java.lang.String getExciseStoreHouseNr() {
        return exciseStoreHouseNr;
    }


    /**
     * Sets the exciseStoreHouseNr value for this Application.
     * 
     * @param exciseStoreHouseNr
     */
    public void setExciseStoreHouseNr(java.lang.String exciseStoreHouseNr) {
        this.exciseStoreHouseNr = exciseStoreHouseNr;
    }


    /**
     * Gets the acknowledgementNr value for this Application.
     * 
     * @return acknowledgementNr
     */
    public java.lang.String getAcknowledgementNr() {
        return acknowledgementNr;
    }


    /**
     * Sets the acknowledgementNr value for this Application.
     * 
     * @param acknowledgementNr
     */
    public void setAcknowledgementNr(java.lang.String acknowledgementNr) {
        this.acknowledgementNr = acknowledgementNr;
    }


    /**
     * Gets the acknowledgementDate value for this Application.
     * 
     * @return acknowledgementDate
     */
    public java.util.Date getAcknowledgementDate() {
        return acknowledgementDate;
    }


    /**
     * Sets the acknowledgementDate value for this Application.
     * 
     * @param acknowledgementDate
     */
    public void setAcknowledgementDate(java.util.Date acknowledgementDate) {
        this.acknowledgementDate = acknowledgementDate;
    }


    /**
     * Gets the MTRCode value for this Application.
     * 
     * @return MTRCode
     */
    public java.lang.String getMTRCode() {
        return MTRCode;
    }


    /**
     * Sets the MTRCode value for this Application.
     * 
     * @param MTRCode
     */
    public void setMTRCode(java.lang.String MTRCode) {
        this.MTRCode = MTRCode;
    }


    /**
     * Gets the productInfo value for this Application.
     * 
     * @return productInfo
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Product getProductInfo() {
        return productInfo;
    }


    /**
     * Sets the productInfo value for this Application.
     * 
     * @param productInfo
     */
    public void setProductInfo(ee.riik.xtee.alkor2.producers.producer.alkor2.Product productInfo) {
        this.productInfo = productInfo;
    }


    /**
     * Gets the notes value for this Application.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Application.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Application)) return false;
        Application other = (Application) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicantPosition==null && other.getApplicantPosition()==null) || 
             (this.applicantPosition!=null &&
              this.applicantPosition.equals(other.getApplicantPosition()))) &&
            ((this.exciseStoreHouseNr==null && other.getExciseStoreHouseNr()==null) || 
             (this.exciseStoreHouseNr!=null &&
              this.exciseStoreHouseNr.equals(other.getExciseStoreHouseNr()))) &&
            ((this.acknowledgementNr==null && other.getAcknowledgementNr()==null) || 
             (this.acknowledgementNr!=null &&
              this.acknowledgementNr.equals(other.getAcknowledgementNr()))) &&
            ((this.acknowledgementDate==null && other.getAcknowledgementDate()==null) || 
             (this.acknowledgementDate!=null &&
              this.acknowledgementDate.equals(other.getAcknowledgementDate()))) &&
            ((this.MTRCode==null && other.getMTRCode()==null) || 
             (this.MTRCode!=null &&
              this.MTRCode.equals(other.getMTRCode()))) &&
            ((this.productInfo==null && other.getProductInfo()==null) || 
             (this.productInfo!=null &&
              this.productInfo.equals(other.getProductInfo()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes())));
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
        if (getApplicantPosition() != null) {
            _hashCode += getApplicantPosition().hashCode();
        }
        if (getExciseStoreHouseNr() != null) {
            _hashCode += getExciseStoreHouseNr().hashCode();
        }
        if (getAcknowledgementNr() != null) {
            _hashCode += getAcknowledgementNr().hashCode();
        }
        if (getAcknowledgementDate() != null) {
            _hashCode += getAcknowledgementDate().hashCode();
        }
        if (getMTRCode() != null) {
            _hashCode += getMTRCode().hashCode();
        }
        if (getProductInfo() != null) {
            _hashCode += getProductInfo().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Application.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Application"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicantPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exciseStoreHouseNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExciseStoreHouseNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledgementNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcknowledgementNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledgementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcknowledgementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTRCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MTRCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Product"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Notes"));
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
