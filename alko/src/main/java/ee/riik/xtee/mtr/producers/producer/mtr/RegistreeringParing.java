/**
 * RegistreeringParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistreeringParing  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String kood;

    private java.math.BigInteger isikukood;

    private java.lang.String linnvald;

    private java.lang.String tanav;

    private java.lang.String regnr;

    private java.util.Date regkp;

    private java.lang.String tegevusalanimi;

    private java.lang.String tegevusala;

    private java.lang.String taotluseesitaja;

    private java.lang.String seotudisik;

    private java.lang.String tegutsemiskohalinnvald;

    private java.lang.String tegutsemiskohanimi;

    private ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv kirjetearv;

    public RegistreeringParing() {
    }

    public RegistreeringParing(
           java.lang.String nimi,
           java.lang.String kood,
           java.math.BigInteger isikukood,
           java.lang.String linnvald,
           java.lang.String tanav,
           java.lang.String regnr,
           java.util.Date regkp,
           java.lang.String tegevusalanimi,
           java.lang.String tegevusala,
           java.lang.String taotluseesitaja,
           java.lang.String seotudisik,
           java.lang.String tegutsemiskohalinnvald,
           java.lang.String tegutsemiskohanimi,
           ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv kirjetearv) {
           this.nimi = nimi;
           this.kood = kood;
           this.isikukood = isikukood;
           this.linnvald = linnvald;
           this.tanav = tanav;
           this.regnr = regnr;
           this.regkp = regkp;
           this.tegevusalanimi = tegevusalanimi;
           this.tegevusala = tegevusala;
           this.taotluseesitaja = taotluseesitaja;
           this.seotudisik = seotudisik;
           this.tegutsemiskohalinnvald = tegutsemiskohalinnvald;
           this.tegutsemiskohanimi = tegutsemiskohanimi;
           this.kirjetearv = kirjetearv;
    }


    /**
     * Gets the nimi value for this RegistreeringParing.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this RegistreeringParing.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kood value for this RegistreeringParing.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RegistreeringParing.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the isikukood value for this RegistreeringParing.
     * 
     * @return isikukood
     */
    public java.math.BigInteger getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this RegistreeringParing.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.math.BigInteger isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the linnvald value for this RegistreeringParing.
     * 
     * @return linnvald
     */
    public java.lang.String getLinnvald() {
        return linnvald;
    }


    /**
     * Sets the linnvald value for this RegistreeringParing.
     * 
     * @param linnvald
     */
    public void setLinnvald(java.lang.String linnvald) {
        this.linnvald = linnvald;
    }


    /**
     * Gets the tanav value for this RegistreeringParing.
     * 
     * @return tanav
     */
    public java.lang.String getTanav() {
        return tanav;
    }


    /**
     * Sets the tanav value for this RegistreeringParing.
     * 
     * @param tanav
     */
    public void setTanav(java.lang.String tanav) {
        this.tanav = tanav;
    }


    /**
     * Gets the regnr value for this RegistreeringParing.
     * 
     * @return regnr
     */
    public java.lang.String getRegnr() {
        return regnr;
    }


    /**
     * Sets the regnr value for this RegistreeringParing.
     * 
     * @param regnr
     */
    public void setRegnr(java.lang.String regnr) {
        this.regnr = regnr;
    }


    /**
     * Gets the regkp value for this RegistreeringParing.
     * 
     * @return regkp
     */
    public java.util.Date getRegkp() {
        return regkp;
    }


    /**
     * Sets the regkp value for this RegistreeringParing.
     * 
     * @param regkp
     */
    public void setRegkp(java.util.Date regkp) {
        this.regkp = regkp;
    }


    /**
     * Gets the tegevusalanimi value for this RegistreeringParing.
     * 
     * @return tegevusalanimi
     */
    public java.lang.String getTegevusalanimi() {
        return tegevusalanimi;
    }


    /**
     * Sets the tegevusalanimi value for this RegistreeringParing.
     * 
     * @param tegevusalanimi
     */
    public void setTegevusalanimi(java.lang.String tegevusalanimi) {
        this.tegevusalanimi = tegevusalanimi;
    }


    /**
     * Gets the tegevusala value for this RegistreeringParing.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this RegistreeringParing.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the taotluseesitaja value for this RegistreeringParing.
     * 
     * @return taotluseesitaja
     */
    public java.lang.String getTaotluseesitaja() {
        return taotluseesitaja;
    }


    /**
     * Sets the taotluseesitaja value for this RegistreeringParing.
     * 
     * @param taotluseesitaja
     */
    public void setTaotluseesitaja(java.lang.String taotluseesitaja) {
        this.taotluseesitaja = taotluseesitaja;
    }


    /**
     * Gets the seotudisik value for this RegistreeringParing.
     * 
     * @return seotudisik
     */
    public java.lang.String getSeotudisik() {
        return seotudisik;
    }


    /**
     * Sets the seotudisik value for this RegistreeringParing.
     * 
     * @param seotudisik
     */
    public void setSeotudisik(java.lang.String seotudisik) {
        this.seotudisik = seotudisik;
    }


    /**
     * Gets the tegutsemiskohalinnvald value for this RegistreeringParing.
     * 
     * @return tegutsemiskohalinnvald
     */
    public java.lang.String getTegutsemiskohalinnvald() {
        return tegutsemiskohalinnvald;
    }


    /**
     * Sets the tegutsemiskohalinnvald value for this RegistreeringParing.
     * 
     * @param tegutsemiskohalinnvald
     */
    public void setTegutsemiskohalinnvald(java.lang.String tegutsemiskohalinnvald) {
        this.tegutsemiskohalinnvald = tegutsemiskohalinnvald;
    }


    /**
     * Gets the tegutsemiskohanimi value for this RegistreeringParing.
     * 
     * @return tegutsemiskohanimi
     */
    public java.lang.String getTegutsemiskohanimi() {
        return tegutsemiskohanimi;
    }


    /**
     * Sets the tegutsemiskohanimi value for this RegistreeringParing.
     * 
     * @param tegutsemiskohanimi
     */
    public void setTegutsemiskohanimi(java.lang.String tegutsemiskohanimi) {
        this.tegutsemiskohanimi = tegutsemiskohanimi;
    }


    /**
     * Gets the kirjetearv value for this RegistreeringParing.
     * 
     * @return kirjetearv
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv getKirjetearv() {
        return kirjetearv;
    }


    /**
     * Sets the kirjetearv value for this RegistreeringParing.
     * 
     * @param kirjetearv
     */
    public void setKirjetearv(ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv kirjetearv) {
        this.kirjetearv = kirjetearv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringParing)) return false;
        RegistreeringParing other = (RegistreeringParing) obj;
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
            ((this.linnvald==null && other.getLinnvald()==null) || 
             (this.linnvald!=null &&
              this.linnvald.equals(other.getLinnvald()))) &&
            ((this.tanav==null && other.getTanav()==null) || 
             (this.tanav!=null &&
              this.tanav.equals(other.getTanav()))) &&
            ((this.regnr==null && other.getRegnr()==null) || 
             (this.regnr!=null &&
              this.regnr.equals(other.getRegnr()))) &&
            ((this.regkp==null && other.getRegkp()==null) || 
             (this.regkp!=null &&
              this.regkp.equals(other.getRegkp()))) &&
            ((this.tegevusalanimi==null && other.getTegevusalanimi()==null) || 
             (this.tegevusalanimi!=null &&
              this.tegevusalanimi.equals(other.getTegevusalanimi()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.taotluseesitaja==null && other.getTaotluseesitaja()==null) || 
             (this.taotluseesitaja!=null &&
              this.taotluseesitaja.equals(other.getTaotluseesitaja()))) &&
            ((this.seotudisik==null && other.getSeotudisik()==null) || 
             (this.seotudisik!=null &&
              this.seotudisik.equals(other.getSeotudisik()))) &&
            ((this.tegutsemiskohalinnvald==null && other.getTegutsemiskohalinnvald()==null) || 
             (this.tegutsemiskohalinnvald!=null &&
              this.tegutsemiskohalinnvald.equals(other.getTegutsemiskohalinnvald()))) &&
            ((this.tegutsemiskohanimi==null && other.getTegutsemiskohanimi()==null) || 
             (this.tegutsemiskohanimi!=null &&
              this.tegutsemiskohanimi.equals(other.getTegutsemiskohanimi()))) &&
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
        if (getLinnvald() != null) {
            _hashCode += getLinnvald().hashCode();
        }
        if (getTanav() != null) {
            _hashCode += getTanav().hashCode();
        }
        if (getRegnr() != null) {
            _hashCode += getRegnr().hashCode();
        }
        if (getRegkp() != null) {
            _hashCode += getRegkp().hashCode();
        }
        if (getTegevusalanimi() != null) {
            _hashCode += getTegevusalanimi().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTaotluseesitaja() != null) {
            _hashCode += getTaotluseesitaja().hashCode();
        }
        if (getSeotudisik() != null) {
            _hashCode += getSeotudisik().hashCode();
        }
        if (getTegutsemiskohalinnvald() != null) {
            _hashCode += getTegutsemiskohalinnvald().hashCode();
        }
        if (getTegutsemiskohanimi() != null) {
            _hashCode += getTegutsemiskohanimi().hashCode();
        }
        if (getKirjetearv() != null) {
            _hashCode += getKirjetearv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistreeringParing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringParing"));
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
        elemField.setFieldName("linnvald");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "linnvald"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tanav");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tanav"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("regkp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "regkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusalanimi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusalanimi"));
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
        elemField.setFieldName("taotluseesitaja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "taotluseesitaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seotudisik");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seotudisik"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegutsemiskohalinnvald");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegutsemiskohalinnvald"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegutsemiskohanimi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegutsemiskohanimi"));
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
