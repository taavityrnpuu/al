/**
 * Payer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Payer  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String regNum;

    private java.lang.String accountNum;

    private java.lang.String refNum;

    private java.lang.String transmissionDate;

    public Payer() {
    }

    public Payer(
           java.lang.String name,
           java.lang.String regNum,
           java.lang.String accountNum,
           java.lang.String refNum,
           java.lang.String transmissionDate) {
           this.name = name;
           this.regNum = regNum;
           this.accountNum = accountNum;
           this.refNum = refNum;
           this.transmissionDate = transmissionDate;
    }


    /**
     * Gets the name value for this Payer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Payer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the regNum value for this Payer.
     * 
     * @return regNum
     */
    public java.lang.String getRegNum() {
        return regNum;
    }


    /**
     * Sets the regNum value for this Payer.
     * 
     * @param regNum
     */
    public void setRegNum(java.lang.String regNum) {
        this.regNum = regNum;
    }


    /**
     * Gets the accountNum value for this Payer.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this Payer.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the refNum value for this Payer.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this Payer.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the transmissionDate value for this Payer.
     * 
     * @return transmissionDate
     */
    public java.lang.String getTransmissionDate() {
        return transmissionDate;
    }


    /**
     * Sets the transmissionDate value for this Payer.
     * 
     * @param transmissionDate
     */
    public void setTransmissionDate(java.lang.String transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Payer)) return false;
        Payer other = (Payer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.regNum==null && other.getRegNum()==null) || 
             (this.regNum!=null &&
              this.regNum.equals(other.getRegNum()))) &&
            ((this.accountNum==null && other.getAccountNum()==null) || 
             (this.accountNum!=null &&
              this.accountNum.equals(other.getAccountNum()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.transmissionDate==null && other.getTransmissionDate()==null) || 
             (this.transmissionDate!=null &&
              this.transmissionDate.equals(other.getTransmissionDate())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRegNum() != null) {
            _hashCode += getRegNum().hashCode();
        }
        if (getAccountNum() != null) {
            _hashCode += getAccountNum().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getTransmissionDate() != null) {
            _hashCode += getTransmissionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Payer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Payer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transmissionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransmissionDate"));
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
