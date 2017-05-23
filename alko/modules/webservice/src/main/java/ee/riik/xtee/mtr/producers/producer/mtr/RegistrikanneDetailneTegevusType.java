/**
 * RegistrikanneDetailneTegevusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistrikanneDetailneTegevusType  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneType ettevotja;

    private ee.riik.xtee.mtr.producers.producer.mtr.ValdkondType valdkond;

    private ee.riik.xtee.mtr.producers.producer.mtr.TegevusalaType tegevusala;

    private java.util.Date registreeritudKP;

    private ee.riik.xtee.mtr.producers.producer.mtr.TegevusType[] tegevused;

    private java.lang.String regNR;  // attribute

    public RegistrikanneDetailneTegevusType() {
    }

    public RegistrikanneDetailneTegevusType(
           ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneType ettevotja,
           ee.riik.xtee.mtr.producers.producer.mtr.ValdkondType valdkond,
           ee.riik.xtee.mtr.producers.producer.mtr.TegevusalaType tegevusala,
           java.util.Date registreeritudKP,
           ee.riik.xtee.mtr.producers.producer.mtr.TegevusType[] tegevused,
           java.lang.String regNR) {
           this.ettevotja = ettevotja;
           this.valdkond = valdkond;
           this.tegevusala = tegevusala;
           this.registreeritudKP = registreeritudKP;
           this.tegevused = tegevused;
           this.regNR = regNR;
    }


    /**
     * Gets the ettevotja value for this RegistrikanneDetailneTegevusType.
     * 
     * @return ettevotja
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneType getEttevotja() {
        return ettevotja;
    }


    /**
     * Sets the ettevotja value for this RegistrikanneDetailneTegevusType.
     * 
     * @param ettevotja
     */
    public void setEttevotja(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneType ettevotja) {
        this.ettevotja = ettevotja;
    }


    /**
     * Gets the valdkond value for this RegistrikanneDetailneTegevusType.
     * 
     * @return valdkond
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.ValdkondType getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this RegistrikanneDetailneTegevusType.
     * 
     * @param valdkond
     */
    public void setValdkond(ee.riik.xtee.mtr.producers.producer.mtr.ValdkondType valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the tegevusala value for this RegistrikanneDetailneTegevusType.
     * 
     * @return tegevusala
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.TegevusalaType getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this RegistrikanneDetailneTegevusType.
     * 
     * @param tegevusala
     */
    public void setTegevusala(ee.riik.xtee.mtr.producers.producer.mtr.TegevusalaType tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the registreeritudKP value for this RegistrikanneDetailneTegevusType.
     * 
     * @return registreeritudKP
     */
    public java.util.Date getRegistreeritudKP() {
        return registreeritudKP;
    }


    /**
     * Sets the registreeritudKP value for this RegistrikanneDetailneTegevusType.
     * 
     * @param registreeritudKP
     */
    public void setRegistreeritudKP(java.util.Date registreeritudKP) {
        this.registreeritudKP = registreeritudKP;
    }


    /**
     * Gets the tegevused value for this RegistrikanneDetailneTegevusType.
     * 
     * @return tegevused
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.TegevusType[] getTegevused() {
        return tegevused;
    }


    /**
     * Sets the tegevused value for this RegistrikanneDetailneTegevusType.
     * 
     * @param tegevused
     */
    public void setTegevused(ee.riik.xtee.mtr.producers.producer.mtr.TegevusType[] tegevused) {
        this.tegevused = tegevused;
    }


    /**
     * Gets the regNR value for this RegistrikanneDetailneTegevusType.
     * 
     * @return regNR
     */
    public java.lang.String getRegNR() {
        return regNR;
    }


    /**
     * Sets the regNR value for this RegistrikanneDetailneTegevusType.
     * 
     * @param regNR
     */
    public void setRegNR(java.lang.String regNR) {
        this.regNR = regNR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneTegevusType)) return false;
        RegistrikanneDetailneTegevusType other = (RegistrikanneDetailneTegevusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja==null && other.getEttevotja()==null) || 
             (this.ettevotja!=null &&
              this.ettevotja.equals(other.getEttevotja()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.registreeritudKP==null && other.getRegistreeritudKP()==null) || 
             (this.registreeritudKP!=null &&
              this.registreeritudKP.equals(other.getRegistreeritudKP()))) &&
            ((this.tegevused==null && other.getTegevused()==null) || 
             (this.tegevused!=null &&
              java.util.Arrays.equals(this.tegevused, other.getTegevused()))) &&
            ((this.regNR==null && other.getRegNR()==null) || 
             (this.regNR!=null &&
              this.regNR.equals(other.getRegNR())));
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
        if (getEttevotja() != null) {
            _hashCode += getEttevotja().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getRegistreeritudKP() != null) {
            _hashCode += getRegistreeritudKP().hashCode();
        }
        if (getTegevused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegNR() != null) {
            _hashCode += getRegNR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistrikanneDetailneTegevusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneTegevusType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("regNR");
        attrField.setXmlName(new javax.xml.namespace.QName("", "regNR"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettevotja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ettevotja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "ettevotjaDetailneType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valdkond");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valdkond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "valdkondType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusala");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevusala"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusalaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreeritudKP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registreeritudKP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevused");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "tegevus"));
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
