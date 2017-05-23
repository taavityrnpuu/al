/**
 * RegistriKanneMIKOType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistriKanneMIKOType  implements java.io.Serializable {
    private java.lang.String tyyp;

    private java.lang.String regnr;

    private java.lang.String valdkond;

    private java.lang.String tegevusala;

    private java.lang.String tegevusalakood;

    private java.util.Date registreerimisekp;

    private java.util.Date peatatudkp;

    private java.util.Date peatamiseloppkp;

    private ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttevotja ettevotja;

    private ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht[] tegevuskoht;

    private ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttekirjutus ettekirjutus;

    public RegistriKanneMIKOType() {
    }

    public RegistriKanneMIKOType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           java.util.Date peatatudkp,
           java.util.Date peatamiseloppkp,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttevotja ettevotja,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht[] tegevuskoht,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttekirjutus ettekirjutus) {
           this.tyyp = tyyp;
           this.regnr = regnr;
           this.valdkond = valdkond;
           this.tegevusala = tegevusala;
           this.tegevusalakood = tegevusalakood;
           this.registreerimisekp = registreerimisekp;
           this.peatatudkp = peatatudkp;
           this.peatamiseloppkp = peatamiseloppkp;
           this.ettevotja = ettevotja;
           this.tegevuskoht = tegevuskoht;
           this.ettekirjutus = ettekirjutus;
    }


    /**
     * Gets the tyyp value for this RegistriKanneMIKOType.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this RegistriKanneMIKOType.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the regnr value for this RegistriKanneMIKOType.
     * 
     * @return regnr
     */
    public java.lang.String getRegnr() {
        return regnr;
    }


    /**
     * Sets the regnr value for this RegistriKanneMIKOType.
     * 
     * @param regnr
     */
    public void setRegnr(java.lang.String regnr) {
        this.regnr = regnr;
    }


    /**
     * Gets the valdkond value for this RegistriKanneMIKOType.
     * 
     * @return valdkond
     */
    public java.lang.String getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this RegistriKanneMIKOType.
     * 
     * @param valdkond
     */
    public void setValdkond(java.lang.String valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the tegevusala value for this RegistriKanneMIKOType.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this RegistriKanneMIKOType.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the tegevusalakood value for this RegistriKanneMIKOType.
     * 
     * @return tegevusalakood
     */
    public java.lang.String getTegevusalakood() {
        return tegevusalakood;
    }


    /**
     * Sets the tegevusalakood value for this RegistriKanneMIKOType.
     * 
     * @param tegevusalakood
     */
    public void setTegevusalakood(java.lang.String tegevusalakood) {
        this.tegevusalakood = tegevusalakood;
    }


    /**
     * Gets the registreerimisekp value for this RegistriKanneMIKOType.
     * 
     * @return registreerimisekp
     */
    public java.util.Date getRegistreerimisekp() {
        return registreerimisekp;
    }


    /**
     * Sets the registreerimisekp value for this RegistriKanneMIKOType.
     * 
     * @param registreerimisekp
     */
    public void setRegistreerimisekp(java.util.Date registreerimisekp) {
        this.registreerimisekp = registreerimisekp;
    }


    /**
     * Gets the peatatudkp value for this RegistriKanneMIKOType.
     * 
     * @return peatatudkp
     */
    public java.util.Date getPeatatudkp() {
        return peatatudkp;
    }


    /**
     * Sets the peatatudkp value for this RegistriKanneMIKOType.
     * 
     * @param peatatudkp
     */
    public void setPeatatudkp(java.util.Date peatatudkp) {
        this.peatatudkp = peatatudkp;
    }


    /**
     * Gets the peatamiseloppkp value for this RegistriKanneMIKOType.
     * 
     * @return peatamiseloppkp
     */
    public java.util.Date getPeatamiseloppkp() {
        return peatamiseloppkp;
    }


    /**
     * Sets the peatamiseloppkp value for this RegistriKanneMIKOType.
     * 
     * @param peatamiseloppkp
     */
    public void setPeatamiseloppkp(java.util.Date peatamiseloppkp) {
        this.peatamiseloppkp = peatamiseloppkp;
    }


    /**
     * Gets the ettevotja value for this RegistriKanneMIKOType.
     * 
     * @return ettevotja
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttevotja getEttevotja() {
        return ettevotja;
    }


    /**
     * Sets the ettevotja value for this RegistriKanneMIKOType.
     * 
     * @param ettevotja
     */
    public void setEttevotja(ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttevotja ettevotja) {
        this.ettevotja = ettevotja;
    }


    /**
     * Gets the tegevuskoht value for this RegistriKanneMIKOType.
     * 
     * @return tegevuskoht
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht[] getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this RegistriKanneMIKOType.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht[] tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }

    public ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht getTegevuskoht(int i) {
        return this.tegevuskoht[i];
    }

    public void setTegevuskoht(int i, ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht _value) {
        this.tegevuskoht[i] = _value;
    }


    /**
     * Gets the ettekirjutus value for this RegistriKanneMIKOType.
     * 
     * @return ettekirjutus
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttekirjutus getEttekirjutus() {
        return ettekirjutus;
    }


    /**
     * Sets the ettekirjutus value for this RegistriKanneMIKOType.
     * 
     * @param ettekirjutus
     */
    public void setEttekirjutus(ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttekirjutus ettekirjutus) {
        this.ettekirjutus = ettekirjutus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistriKanneMIKOType)) return false;
        RegistriKanneMIKOType other = (RegistriKanneMIKOType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.regnr==null && other.getRegnr()==null) || 
             (this.regnr!=null &&
              this.regnr.equals(other.getRegnr()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.tegevusalakood==null && other.getTegevusalakood()==null) || 
             (this.tegevusalakood!=null &&
              this.tegevusalakood.equals(other.getTegevusalakood()))) &&
            ((this.registreerimisekp==null && other.getRegistreerimisekp()==null) || 
             (this.registreerimisekp!=null &&
              this.registreerimisekp.equals(other.getRegistreerimisekp()))) &&
            ((this.peatatudkp==null && other.getPeatatudkp()==null) || 
             (this.peatatudkp!=null &&
              this.peatatudkp.equals(other.getPeatatudkp()))) &&
            ((this.peatamiseloppkp==null && other.getPeatamiseloppkp()==null) || 
             (this.peatamiseloppkp!=null &&
              this.peatamiseloppkp.equals(other.getPeatamiseloppkp()))) &&
            ((this.ettevotja==null && other.getEttevotja()==null) || 
             (this.ettevotja!=null &&
              this.ettevotja.equals(other.getEttevotja()))) &&
            ((this.tegevuskoht==null && other.getTegevuskoht()==null) || 
             (this.tegevuskoht!=null &&
              java.util.Arrays.equals(this.tegevuskoht, other.getTegevuskoht()))) &&
            ((this.ettekirjutus==null && other.getEttekirjutus()==null) || 
             (this.ettekirjutus!=null &&
              this.ettekirjutus.equals(other.getEttekirjutus())));
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getRegnr() != null) {
            _hashCode += getRegnr().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTegevusalakood() != null) {
            _hashCode += getTegevusalakood().hashCode();
        }
        if (getRegistreerimisekp() != null) {
            _hashCode += getRegistreerimisekp().hashCode();
        }
        if (getPeatatudkp() != null) {
            _hashCode += getPeatatudkp().hashCode();
        }
        if (getPeatamiseloppkp() != null) {
            _hashCode += getPeatamiseloppkp().hashCode();
        }
        if (getEttevotja() != null) {
            _hashCode += getEttevotja().hashCode();
        }
        if (getTegevuskoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskoht(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEttekirjutus() != null) {
            _hashCode += getEttekirjutus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistriKanneMIKOType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registriKanneMIKOType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tyyp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tyyp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valdkond");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valdkond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusala");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevusala"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusalakood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevusalakood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreerimisekp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registreerimisekp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peatatudkp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peatatudkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peatamiseloppkp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peatamiseloppkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettevotja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ettevotja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>ettevotja"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevuskoht");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevuskoht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>tegevuskoht"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettekirjutus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ettekirjutus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>ettekirjutus"));
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
