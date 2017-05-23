/**
 * EttevotjaParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class EttevotjaParing  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String kood;

    private java.math.BigInteger isikukood;

    private java.lang.String regnr;

    private java.lang.String tegevusloaotsusenr;

    private java.lang.String tegevusala;

    private java.lang.String turuloanumber;

    private ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv kirjetearv;

    public EttevotjaParing() {
    }

    public EttevotjaParing(
           java.lang.String nimi,
           java.lang.String kood,
           java.math.BigInteger isikukood,
           java.lang.String regnr,
           java.lang.String tegevusloaotsusenr,
           java.lang.String tegevusala,
           java.lang.String turuloanumber,
           ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv kirjetearv) {
           this.nimi = nimi;
           this.kood = kood;
           this.isikukood = isikukood;
           this.regnr = regnr;
           this.tegevusloaotsusenr = tegevusloaotsusenr;
           this.tegevusala = tegevusala;
           this.turuloanumber = turuloanumber;
           this.kirjetearv = kirjetearv;
    }


    /**
     * Gets the nimi value for this EttevotjaParing.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this EttevotjaParing.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kood value for this EttevotjaParing.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this EttevotjaParing.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the isikukood value for this EttevotjaParing.
     * 
     * @return isikukood
     */
    public java.math.BigInteger getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this EttevotjaParing.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.math.BigInteger isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the regnr value for this EttevotjaParing.
     * 
     * @return regnr
     */
    public java.lang.String getRegnr() {
        return regnr;
    }


    /**
     * Sets the regnr value for this EttevotjaParing.
     * 
     * @param regnr
     */
    public void setRegnr(java.lang.String regnr) {
        this.regnr = regnr;
    }


    /**
     * Gets the tegevusloaotsusenr value for this EttevotjaParing.
     * 
     * @return tegevusloaotsusenr
     */
    public java.lang.String getTegevusloaotsusenr() {
        return tegevusloaotsusenr;
    }


    /**
     * Sets the tegevusloaotsusenr value for this EttevotjaParing.
     * 
     * @param tegevusloaotsusenr
     */
    public void setTegevusloaotsusenr(java.lang.String tegevusloaotsusenr) {
        this.tegevusloaotsusenr = tegevusloaotsusenr;
    }


    /**
     * Gets the tegevusala value for this EttevotjaParing.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this EttevotjaParing.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the turuloanumber value for this EttevotjaParing.
     * 
     * @return turuloanumber
     */
    public java.lang.String getTuruloanumber() {
        return turuloanumber;
    }


    /**
     * Sets the turuloanumber value for this EttevotjaParing.
     * 
     * @param turuloanumber
     */
    public void setTuruloanumber(java.lang.String turuloanumber) {
        this.turuloanumber = turuloanumber;
    }


    /**
     * Gets the kirjetearv value for this EttevotjaParing.
     * 
     * @return kirjetearv
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv getKirjetearv() {
        return kirjetearv;
    }


    /**
     * Sets the kirjetearv value for this EttevotjaParing.
     * 
     * @param kirjetearv
     */
    public void setKirjetearv(ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv kirjetearv) {
        this.kirjetearv = kirjetearv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaParing)) return false;
        EttevotjaParing other = (EttevotjaParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.regnr==null && other.getRegnr()==null) || 
             (this.regnr!=null &&
              this.regnr.equals(other.getRegnr()))) &&
            ((this.tegevusloaotsusenr==null && other.getTegevusloaotsusenr()==null) || 
             (this.tegevusloaotsusenr!=null &&
              this.tegevusloaotsusenr.equals(other.getTegevusloaotsusenr()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.turuloanumber==null && other.getTuruloanumber()==null) || 
             (this.turuloanumber!=null &&
              this.turuloanumber.equals(other.getTuruloanumber()))) &&
            ((this.kirjetearv==null && other.getKirjetearv()==null) || 
             (this.kirjetearv!=null &&
              this.kirjetearv.equals(other.getKirjetearv())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getRegnr() != null) {
            _hashCode += getRegnr().hashCode();
        }
        if (getTegevusloaotsusenr() != null) {
            _hashCode += getTegevusloaotsusenr().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTuruloanumber() != null) {
            _hashCode += getTuruloanumber().hashCode();
        }
        if (getKirjetearv() != null) {
            _hashCode += getKirjetearv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EttevotjaParing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaParing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nimi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "nimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">kood"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isikukood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "isikukood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">isikukood"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "regnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">regnr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusloaotsusenr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusloaotsusenr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusala");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusala"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">tegevusala"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turuloanumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "turuloanumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kirjetearv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "kirjetearv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "SoovitudKirjeteArv"));
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
