/**
 * Enterprise.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Enterprise  implements java.io.Serializable {
    private java.lang.String regNr;

    private java.lang.String exciseStoreHouseNr;

    private java.lang.String acknowledgementNr;

    private java.util.Date acknowledgementDate;

    private java.lang.String MTRCode;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.ContactInfoType contactInfo;

    public Enterprise() {
    }

    public Enterprise(
           java.lang.String regNr,
           java.lang.String exciseStoreHouseNr,
           java.lang.String acknowledgementNr,
           java.util.Date acknowledgementDate,
           java.lang.String MTRCode,
           ee.riik.xtee.alkor2.producers.producer.alkor2.ContactInfoType contactInfo) {
           this.regNr = regNr;
           this.exciseStoreHouseNr = exciseStoreHouseNr;
           this.acknowledgementNr = acknowledgementNr;
           this.acknowledgementDate = acknowledgementDate;
           this.MTRCode = MTRCode;
           this.contactInfo = contactInfo;
    }


    /**
     * Gets the regNr value for this Enterprise.
     * 
     * @return regNr
     */
    public java.lang.String getRegNr() {
        return regNr;
    }


    /**
     * Sets the regNr value for this Enterprise.
     * 
     * @param regNr
     */
    public void setRegNr(java.lang.String regNr) {
        this.regNr = regNr;
    }


    /**
     * Gets the exciseStoreHouseNr value for this Enterprise.
     * 
     * @return exciseStoreHouseNr
     */
    public java.lang.String getExciseStoreHouseNr() {
        return exciseStoreHouseNr;
    }


    /**
     * Sets the exciseStoreHouseNr value for this Enterprise.
     * 
     * @param exciseStoreHouseNr
     */
    public void setExciseStoreHouseNr(java.lang.String exciseStoreHouseNr) {
        this.exciseStoreHouseNr = exciseStoreHouseNr;
    }


    /**
     * Gets the acknowledgementNr value for this Enterprise.
     * 
     * @return acknowledgementNr
     */
    public java.lang.String getAcknowledgementNr() {
        return acknowledgementNr;
    }


    /**
     * Sets the acknowledgementNr value for this Enterprise.
     * 
     * @param acknowledgementNr
     */
    public void setAcknowledgementNr(java.lang.String acknowledgementNr) {
        this.acknowledgementNr = acknowledgementNr;
    }


    /**
     * Gets the acknowledgementDate value for this Enterprise.
     * 
     * @return acknowledgementDate
     */
    public java.util.Date getAcknowledgementDate() {
        return acknowledgementDate;
    }


    /**
     * Sets the acknowledgementDate value for this Enterprise.
     * 
     * @param acknowledgementDate
     */
    public void setAcknowledgementDate(java.util.Date acknowledgementDate) {
        this.acknowledgementDate = acknowledgementDate;
    }


    /**
     * Gets the MTRCode value for this Enterprise.
     * 
     * @return MTRCode
     */
    public java.lang.String getMTRCode() {
        return MTRCode;
    }


    /**
     * Sets the MTRCode value for this Enterprise.
     * 
     * @param MTRCode
     */
    public void setMTRCode(java.lang.String MTRCode) {
        this.MTRCode = MTRCode;
    }


    /**
     * Gets the contactInfo value for this Enterprise.
     * 
     * @return contactInfo
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.ContactInfoType getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this Enterprise.
     * 
     * @param contactInfo
     */
    public void setContactInfo(ee.riik.xtee.alkor2.producers.producer.alkor2.ContactInfoType contactInfo) {
        this.contactInfo = contactInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Enterprise)) return false;
        Enterprise other = (Enterprise) obj;
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
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo())));
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
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Enterprise.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Enterprise"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exciseStoreHouseNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExciseStoreHouseNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledgementNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcknowledgementNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ContactInfoType"));
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
