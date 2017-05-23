/**
 * AadressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class AadressType  implements java.io.Serializable {
    private java.lang.String riik;

    private java.lang.String riigikood;

    private java.lang.String ehak;

    private java.lang.String maakond;

    private java.lang.String linnvald;

    private java.lang.String asula;

    private java.lang.String tänav;

    private java.lang.String majanimi;

    private java.lang.String majanr;

    private java.lang.String korterinr;

    private java.lang.String postiindeks;

    public AadressType() {
    }

    public AadressType(
           java.lang.String riik,
           java.lang.String riigikood,
           java.lang.String ehak,
           java.lang.String maakond,
           java.lang.String linnvald,
           java.lang.String asula,
           java.lang.String tänav,
           java.lang.String majanimi,
           java.lang.String majanr,
           java.lang.String korterinr,
           java.lang.String postiindeks) {
           this.riik = riik;
           this.riigikood = riigikood;
           this.ehak = ehak;
           this.maakond = maakond;
           this.linnvald = linnvald;
           this.asula = asula;
           this.tänav = tänav;
           this.majanimi = majanimi;
           this.majanr = majanr;
           this.korterinr = korterinr;
           this.postiindeks = postiindeks;
    }


    /**
     * Gets the riik value for this AadressType.
     * 
     * @return riik
     */
    public java.lang.String getRiik() {
        return riik;
    }


    /**
     * Sets the riik value for this AadressType.
     * 
     * @param riik
     */
    public void setRiik(java.lang.String riik) {
        this.riik = riik;
    }


    /**
     * Gets the riigikood value for this AadressType.
     * 
     * @return riigikood
     */
    public java.lang.String getRiigikood() {
        return riigikood;
    }


    /**
     * Sets the riigikood value for this AadressType.
     * 
     * @param riigikood
     */
    public void setRiigikood(java.lang.String riigikood) {
        this.riigikood = riigikood;
    }


    /**
     * Gets the ehak value for this AadressType.
     * 
     * @return ehak
     */
    public java.lang.String getEhak() {
        return ehak;
    }


    /**
     * Sets the ehak value for this AadressType.
     * 
     * @param ehak
     */
    public void setEhak(java.lang.String ehak) {
        this.ehak = ehak;
    }


    /**
     * Gets the maakond value for this AadressType.
     * 
     * @return maakond
     */
    public java.lang.String getMaakond() {
        return maakond;
    }


    /**
     * Sets the maakond value for this AadressType.
     * 
     * @param maakond
     */
    public void setMaakond(java.lang.String maakond) {
        this.maakond = maakond;
    }


    /**
     * Gets the linnvald value for this AadressType.
     * 
     * @return linnvald
     */
    public java.lang.String getLinnvald() {
        return linnvald;
    }


    /**
     * Sets the linnvald value for this AadressType.
     * 
     * @param linnvald
     */
    public void setLinnvald(java.lang.String linnvald) {
        this.linnvald = linnvald;
    }


    /**
     * Gets the asula value for this AadressType.
     * 
     * @return asula
     */
    public java.lang.String getAsula() {
        return asula;
    }


    /**
     * Sets the asula value for this AadressType.
     * 
     * @param asula
     */
    public void setAsula(java.lang.String asula) {
        this.asula = asula;
    }


    /**
     * Gets the tänav value for this AadressType.
     * 
     * @return tänav
     */
    public java.lang.String getTänav() {
        return tänav;
    }


    /**
     * Sets the tänav value for this AadressType.
     * 
     * @param tänav
     */
    public void setTänav(java.lang.String tänav) {
        this.tänav = tänav;
    }


    /**
     * Gets the majanimi value for this AadressType.
     * 
     * @return majanimi
     */
    public java.lang.String getMajanimi() {
        return majanimi;
    }


    /**
     * Sets the majanimi value for this AadressType.
     * 
     * @param majanimi
     */
    public void setMajanimi(java.lang.String majanimi) {
        this.majanimi = majanimi;
    }


    /**
     * Gets the majanr value for this AadressType.
     * 
     * @return majanr
     */
    public java.lang.String getMajanr() {
        return majanr;
    }


    /**
     * Sets the majanr value for this AadressType.
     * 
     * @param majanr
     */
    public void setMajanr(java.lang.String majanr) {
        this.majanr = majanr;
    }


    /**
     * Gets the korterinr value for this AadressType.
     * 
     * @return korterinr
     */
    public java.lang.String getKorterinr() {
        return korterinr;
    }


    /**
     * Sets the korterinr value for this AadressType.
     * 
     * @param korterinr
     */
    public void setKorterinr(java.lang.String korterinr) {
        this.korterinr = korterinr;
    }


    /**
     * Gets the postiindeks value for this AadressType.
     * 
     * @return postiindeks
     */
    public java.lang.String getPostiindeks() {
        return postiindeks;
    }


    /**
     * Sets the postiindeks value for this AadressType.
     * 
     * @param postiindeks
     */
    public void setPostiindeks(java.lang.String postiindeks) {
        this.postiindeks = postiindeks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AadressType)) return false;
        AadressType other = (AadressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riik==null && other.getRiik()==null) || 
             (this.riik!=null &&
              this.riik.equals(other.getRiik()))) &&
            ((this.riigikood==null && other.getRiigikood()==null) || 
             (this.riigikood!=null &&
              this.riigikood.equals(other.getRiigikood()))) &&
            ((this.ehak==null && other.getEhak()==null) || 
             (this.ehak!=null &&
              this.ehak.equals(other.getEhak()))) &&
            ((this.maakond==null && other.getMaakond()==null) || 
             (this.maakond!=null &&
              this.maakond.equals(other.getMaakond()))) &&
            ((this.linnvald==null && other.getLinnvald()==null) || 
             (this.linnvald!=null &&
              this.linnvald.equals(other.getLinnvald()))) &&
            ((this.asula==null && other.getAsula()==null) || 
             (this.asula!=null &&
              this.asula.equals(other.getAsula()))) &&
            ((this.tänav==null && other.getTänav()==null) || 
             (this.tänav!=null &&
              this.tänav.equals(other.getTänav()))) &&
            ((this.majanimi==null && other.getMajanimi()==null) || 
             (this.majanimi!=null &&
              this.majanimi.equals(other.getMajanimi()))) &&
            ((this.majanr==null && other.getMajanr()==null) || 
             (this.majanr!=null &&
              this.majanr.equals(other.getMajanr()))) &&
            ((this.korterinr==null && other.getKorterinr()==null) || 
             (this.korterinr!=null &&
              this.korterinr.equals(other.getKorterinr()))) &&
            ((this.postiindeks==null && other.getPostiindeks()==null) || 
             (this.postiindeks!=null &&
              this.postiindeks.equals(other.getPostiindeks())));
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
        if (getRiik() != null) {
            _hashCode += getRiik().hashCode();
        }
        if (getRiigikood() != null) {
            _hashCode += getRiigikood().hashCode();
        }
        if (getEhak() != null) {
            _hashCode += getEhak().hashCode();
        }
        if (getMaakond() != null) {
            _hashCode += getMaakond().hashCode();
        }
        if (getLinnvald() != null) {
            _hashCode += getLinnvald().hashCode();
        }
        if (getAsula() != null) {
            _hashCode += getAsula().hashCode();
        }
        if (getTänav() != null) {
            _hashCode += getTänav().hashCode();
        }
        if (getMajanimi() != null) {
            _hashCode += getMajanimi().hashCode();
        }
        if (getMajanr() != null) {
            _hashCode += getMajanr().hashCode();
        }
        if (getKorterinr() != null) {
            _hashCode += getKorterinr().hashCode();
        }
        if (getPostiindeks() != null) {
            _hashCode += getPostiindeks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AadressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "aadressType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riik");
        elemField.setXmlName(new javax.xml.namespace.QName("", "riik"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riigikood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "riigikood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehak");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ehak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maakond");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maakond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linnvald");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linnvald"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tänav");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tänav"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majanimi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majanimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majanr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majanr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("korterinr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "korterinr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postiindeks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postiindeks"));
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
