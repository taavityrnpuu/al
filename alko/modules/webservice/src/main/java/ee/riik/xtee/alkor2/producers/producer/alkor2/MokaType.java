/**
 * MokaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;


/**
 * Asutustele kontoliikumistest teavitamise formaat
 */
public class MokaType  implements java.io.Serializable {
    private ee.riik.xtee.alkor2.producers.producer.alkor2.Treasury treasury;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Payer payer;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Receiver receiver;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Payment payment;

    private java.lang.String treasuryClassif;

    private java.lang.String paymentDesc;

    public MokaType() {
    }

    public MokaType(
           ee.riik.xtee.alkor2.producers.producer.alkor2.Treasury treasury,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Payer payer,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Receiver receiver,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Payment payment,
           java.lang.String treasuryClassif,
           java.lang.String paymentDesc) {
           this.treasury = treasury;
           this.payer = payer;
           this.receiver = receiver;
           this.payment = payment;
           this.treasuryClassif = treasuryClassif;
           this.paymentDesc = paymentDesc;
    }


    /**
     * Gets the treasury value for this MokaType.
     * 
     * @return treasury
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Treasury getTreasury() {
        return treasury;
    }


    /**
     * Sets the treasury value for this MokaType.
     * 
     * @param treasury
     */
    public void setTreasury(ee.riik.xtee.alkor2.producers.producer.alkor2.Treasury treasury) {
        this.treasury = treasury;
    }


    /**
     * Gets the payer value for this MokaType.
     * 
     * @return payer
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Payer getPayer() {
        return payer;
    }


    /**
     * Sets the payer value for this MokaType.
     * 
     * @param payer
     */
    public void setPayer(ee.riik.xtee.alkor2.producers.producer.alkor2.Payer payer) {
        this.payer = payer;
    }


    /**
     * Gets the receiver value for this MokaType.
     * 
     * @return receiver
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Receiver getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this MokaType.
     * 
     * @param receiver
     */
    public void setReceiver(ee.riik.xtee.alkor2.producers.producer.alkor2.Receiver receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the payment value for this MokaType.
     * 
     * @return payment
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Payment getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this MokaType.
     * 
     * @param payment
     */
    public void setPayment(ee.riik.xtee.alkor2.producers.producer.alkor2.Payment payment) {
        this.payment = payment;
    }


    /**
     * Gets the treasuryClassif value for this MokaType.
     * 
     * @return treasuryClassif
     */
    public java.lang.String getTreasuryClassif() {
        return treasuryClassif;
    }


    /**
     * Sets the treasuryClassif value for this MokaType.
     * 
     * @param treasuryClassif
     */
    public void setTreasuryClassif(java.lang.String treasuryClassif) {
        this.treasuryClassif = treasuryClassif;
    }


    /**
     * Gets the paymentDesc value for this MokaType.
     * 
     * @return paymentDesc
     */
    public java.lang.String getPaymentDesc() {
        return paymentDesc;
    }


    /**
     * Sets the paymentDesc value for this MokaType.
     * 
     * @param paymentDesc
     */
    public void setPaymentDesc(java.lang.String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MokaType)) return false;
        MokaType other = (MokaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.treasury==null && other.getTreasury()==null) || 
             (this.treasury!=null &&
              this.treasury.equals(other.getTreasury()))) &&
            ((this.payer==null && other.getPayer()==null) || 
             (this.payer!=null &&
              this.payer.equals(other.getPayer()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.treasuryClassif==null && other.getTreasuryClassif()==null) || 
             (this.treasuryClassif!=null &&
              this.treasuryClassif.equals(other.getTreasuryClassif()))) &&
            ((this.paymentDesc==null && other.getPaymentDesc()==null) || 
             (this.paymentDesc!=null &&
              this.paymentDesc.equals(other.getPaymentDesc())));
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
        if (getTreasury() != null) {
            _hashCode += getTreasury().hashCode();
        }
        if (getPayer() != null) {
            _hashCode += getPayer().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getTreasuryClassif() != null) {
            _hashCode += getTreasuryClassif().hashCode();
        }
        if (getPaymentDesc() != null) {
            _hashCode += getPaymentDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MokaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treasury");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Treasury"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Treasury"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Payer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Payer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Receiver"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Payment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treasuryClassif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TreasuryClassif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentDesc"));
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
