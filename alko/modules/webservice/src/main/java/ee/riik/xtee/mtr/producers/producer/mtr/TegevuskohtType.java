/**
 * TegevuskohtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class TegevuskohtType  implements java.io.Serializable {
    private java.lang.String liik;

    private java.lang.String nimetus;

    private ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress;

    private java.util.Date alguskp;

    private java.util.Date loppkp;

    public TegevuskohtType() {
    }

    public TegevuskohtType(
           java.lang.String liik,
           java.lang.String nimetus,
           ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress,
           java.util.Date alguskp,
           java.util.Date loppkp) {
           this.liik = liik;
           this.nimetus = nimetus;
           this.aadress = aadress;
           this.alguskp = alguskp;
           this.loppkp = loppkp;
    }


    /**
     * Gets the liik value for this TegevuskohtType.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this TegevuskohtType.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the nimetus value for this TegevuskohtType.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this TegevuskohtType.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the aadress value for this TegevuskohtType.
     * 
     * @return aadress
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.AadressType getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this TegevuskohtType.
     * 
     * @param aadress
     */
    public void setAadress(ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress) {
        this.aadress = aadress;
    }


    /**
     * Gets the alguskp value for this TegevuskohtType.
     * 
     * @return alguskp
     */
    public java.util.Date getAlguskp() {
        return alguskp;
    }


    /**
     * Sets the alguskp value for this TegevuskohtType.
     * 
     * @param alguskp
     */
    public void setAlguskp(java.util.Date alguskp) {
        this.alguskp = alguskp;
    }


    /**
     * Gets the loppkp value for this TegevuskohtType.
     * 
     * @return loppkp
     */
    public java.util.Date getLoppkp() {
        return loppkp;
    }


    /**
     * Sets the loppkp value for this TegevuskohtType.
     * 
     * @param loppkp
     */
    public void setLoppkp(java.util.Date loppkp) {
        this.loppkp = loppkp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TegevuskohtType)) return false;
        TegevuskohtType other = (TegevuskohtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress()))) &&
            ((this.alguskp==null && other.getAlguskp()==null) || 
             (this.alguskp!=null &&
              this.alguskp.equals(other.getAlguskp()))) &&
            ((this.loppkp==null && other.getLoppkp()==null) || 
             (this.loppkp!=null &&
              this.loppkp.equals(other.getLoppkp())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        if (getAlguskp() != null) {
            _hashCode += getAlguskp().hashCode();
        }
        if (getLoppkp() != null) {
            _hashCode += getLoppkp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TegevuskohtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevuskohtType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liik");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liik"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nimetus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nimetus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aadress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aadress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "aadressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alguskp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alguskp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loppkp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loppkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
