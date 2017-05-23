/**
 * NewApplicationDocumentsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class NewApplicationDocumentsType  implements java.io.Serializable {
    private ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument1;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument2;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument3;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument4;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument5;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument6;

    public NewApplicationDocumentsType() {
    }

    public NewApplicationDocumentsType(
           ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument1,
           ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument2,
           ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument3,
           ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument4,
           ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument5,
           ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument6) {
           this.applicationDocument1 = applicationDocument1;
           this.applicationDocument2 = applicationDocument2;
           this.applicationDocument3 = applicationDocument3;
           this.applicationDocument4 = applicationDocument4;
           this.applicationDocument5 = applicationDocument5;
           this.applicationDocument6 = applicationDocument6;
    }


    /**
     * Gets the applicationDocument1 value for this NewApplicationDocumentsType.
     * 
     * @return applicationDocument1
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType getApplicationDocument1() {
        return applicationDocument1;
    }


    /**
     * Sets the applicationDocument1 value for this NewApplicationDocumentsType.
     * 
     * @param applicationDocument1
     */
    public void setApplicationDocument1(ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument1) {
        this.applicationDocument1 = applicationDocument1;
    }


    /**
     * Gets the applicationDocument2 value for this NewApplicationDocumentsType.
     * 
     * @return applicationDocument2
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType getApplicationDocument2() {
        return applicationDocument2;
    }


    /**
     * Sets the applicationDocument2 value for this NewApplicationDocumentsType.
     * 
     * @param applicationDocument2
     */
    public void setApplicationDocument2(ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument2) {
        this.applicationDocument2 = applicationDocument2;
    }


    /**
     * Gets the applicationDocument3 value for this NewApplicationDocumentsType.
     * 
     * @return applicationDocument3
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType getApplicationDocument3() {
        return applicationDocument3;
    }


    /**
     * Sets the applicationDocument3 value for this NewApplicationDocumentsType.
     * 
     * @param applicationDocument3
     */
    public void setApplicationDocument3(ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument3) {
        this.applicationDocument3 = applicationDocument3;
    }


    /**
     * Gets the applicationDocument4 value for this NewApplicationDocumentsType.
     * 
     * @return applicationDocument4
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType getApplicationDocument4() {
        return applicationDocument4;
    }


    /**
     * Sets the applicationDocument4 value for this NewApplicationDocumentsType.
     * 
     * @param applicationDocument4
     */
    public void setApplicationDocument4(ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument4) {
        this.applicationDocument4 = applicationDocument4;
    }


    /**
     * Gets the applicationDocument5 value for this NewApplicationDocumentsType.
     * 
     * @return applicationDocument5
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType getApplicationDocument5() {
        return applicationDocument5;
    }


    /**
     * Sets the applicationDocument5 value for this NewApplicationDocumentsType.
     * 
     * @param applicationDocument5
     */
    public void setApplicationDocument5(ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument5) {
        this.applicationDocument5 = applicationDocument5;
    }


    /**
     * Gets the applicationDocument6 value for this NewApplicationDocumentsType.
     * 
     * @return applicationDocument6
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType getApplicationDocument6() {
        return applicationDocument6;
    }


    /**
     * Sets the applicationDocument6 value for this NewApplicationDocumentsType.
     * 
     * @param applicationDocument6
     */
    public void setApplicationDocument6(ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType applicationDocument6) {
        this.applicationDocument6 = applicationDocument6;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewApplicationDocumentsType)) return false;
        NewApplicationDocumentsType other = (NewApplicationDocumentsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationDocument1==null && other.getApplicationDocument1()==null) || 
             (this.applicationDocument1!=null &&
              this.applicationDocument1.equals(other.getApplicationDocument1()))) &&
            ((this.applicationDocument2==null && other.getApplicationDocument2()==null) || 
             (this.applicationDocument2!=null &&
              this.applicationDocument2.equals(other.getApplicationDocument2()))) &&
            ((this.applicationDocument3==null && other.getApplicationDocument3()==null) || 
             (this.applicationDocument3!=null &&
              this.applicationDocument3.equals(other.getApplicationDocument3()))) &&
            ((this.applicationDocument4==null && other.getApplicationDocument4()==null) || 
             (this.applicationDocument4!=null &&
              this.applicationDocument4.equals(other.getApplicationDocument4()))) &&
            ((this.applicationDocument5==null && other.getApplicationDocument5()==null) || 
             (this.applicationDocument5!=null &&
              this.applicationDocument5.equals(other.getApplicationDocument5()))) &&
            ((this.applicationDocument6==null && other.getApplicationDocument6()==null) || 
             (this.applicationDocument6!=null &&
              this.applicationDocument6.equals(other.getApplicationDocument6())));
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
        if (getApplicationDocument1() != null) {
            _hashCode += getApplicationDocument1().hashCode();
        }
        if (getApplicationDocument2() != null) {
            _hashCode += getApplicationDocument2().hashCode();
        }
        if (getApplicationDocument3() != null) {
            _hashCode += getApplicationDocument3().hashCode();
        }
        if (getApplicationDocument4() != null) {
            _hashCode += getApplicationDocument4().hashCode();
        }
        if (getApplicationDocument5() != null) {
            _hashCode += getApplicationDocument5().hashCode();
        }
        if (getApplicationDocument6() != null) {
            _hashCode += getApplicationDocument6().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewApplicationDocumentsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDocument1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationDocument1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDocument2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationDocument2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDocument3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationDocument3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDocument4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationDocument4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDocument5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationDocument5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDocument6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationDocument6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType"));
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
