/**
 * Tooteparing_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Tooteparing_paring  implements java.io.Serializable {
    private java.lang.String reg_book_nr;

    private java.util.Date date_fromS;

    private java.util.Date date_toS;

    private java.util.Date date_fromE;

    private java.util.Date date_toE;

    private java.lang.String item_name;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik producttype;

    private java.lang.String man_actor_name;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType country;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType volume;

    private java.lang.String ethanol_vol;

    private java.lang.String desc;

    private java.lang.Boolean status1;

    private java.lang.Boolean status2;

    private boolean resp_attach;

    public Tooteparing_paring() {
    }

    public Tooteparing_paring(
           java.lang.String reg_book_nr,
           java.util.Date date_fromS,
           java.util.Date date_toS,
           java.util.Date date_fromE,
           java.util.Date date_toE,
           java.lang.String item_name,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik producttype,
           java.lang.String man_actor_name,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType country,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType volume,
           java.lang.String ethanol_vol,
           java.lang.String desc,
           java.lang.Boolean status1,
           java.lang.Boolean status2,
           boolean resp_attach) {
           this.reg_book_nr = reg_book_nr;
           this.date_fromS = date_fromS;
           this.date_toS = date_toS;
           this.date_fromE = date_fromE;
           this.date_toE = date_toE;
           this.item_name = item_name;
           this.producttype = producttype;
           this.man_actor_name = man_actor_name;
           this.country = country;
           this.volume = volume;
           this.ethanol_vol = ethanol_vol;
           this.desc = desc;
           this.status1 = status1;
           this.status2 = status2;
           this.resp_attach = resp_attach;
    }


    /**
     * Gets the reg_book_nr value for this Tooteparing_paring.
     * 
     * @return reg_book_nr
     */
    public java.lang.String getReg_book_nr() {
        return reg_book_nr;
    }


    /**
     * Sets the reg_book_nr value for this Tooteparing_paring.
     * 
     * @param reg_book_nr
     */
    public void setReg_book_nr(java.lang.String reg_book_nr) {
        this.reg_book_nr = reg_book_nr;
    }


    /**
     * Gets the date_fromS value for this Tooteparing_paring.
     * 
     * @return date_fromS
     */
    public java.util.Date getDate_fromS() {
        return date_fromS;
    }


    /**
     * Sets the date_fromS value for this Tooteparing_paring.
     * 
     * @param date_fromS
     */
    public void setDate_fromS(java.util.Date date_fromS) {
        this.date_fromS = date_fromS;
    }


    /**
     * Gets the date_toS value for this Tooteparing_paring.
     * 
     * @return date_toS
     */
    public java.util.Date getDate_toS() {
        return date_toS;
    }


    /**
     * Sets the date_toS value for this Tooteparing_paring.
     * 
     * @param date_toS
     */
    public void setDate_toS(java.util.Date date_toS) {
        this.date_toS = date_toS;
    }


    /**
     * Gets the date_fromE value for this Tooteparing_paring.
     * 
     * @return date_fromE
     */
    public java.util.Date getDate_fromE() {
        return date_fromE;
    }


    /**
     * Sets the date_fromE value for this Tooteparing_paring.
     * 
     * @param date_fromE
     */
    public void setDate_fromE(java.util.Date date_fromE) {
        this.date_fromE = date_fromE;
    }


    /**
     * Gets the date_toE value for this Tooteparing_paring.
     * 
     * @return date_toE
     */
    public java.util.Date getDate_toE() {
        return date_toE;
    }


    /**
     * Sets the date_toE value for this Tooteparing_paring.
     * 
     * @param date_toE
     */
    public void setDate_toE(java.util.Date date_toE) {
        this.date_toE = date_toE;
    }


    /**
     * Gets the item_name value for this Tooteparing_paring.
     * 
     * @return item_name
     */
    public java.lang.String getItem_name() {
        return item_name;
    }


    /**
     * Sets the item_name value for this Tooteparing_paring.
     * 
     * @param item_name
     */
    public void setItem_name(java.lang.String item_name) {
        this.item_name = item_name;
    }


    /**
     * Gets the producttype value for this Tooteparing_paring.
     * 
     * @return producttype
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik getProducttype() {
        return producttype;
    }


    /**
     * Sets the producttype value for this Tooteparing_paring.
     * 
     * @param producttype
     */
    public void setProducttype(ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik producttype) {
        this.producttype = producttype;
    }


    /**
     * Gets the man_actor_name value for this Tooteparing_paring.
     * 
     * @return man_actor_name
     */
    public java.lang.String getMan_actor_name() {
        return man_actor_name;
    }


    /**
     * Sets the man_actor_name value for this Tooteparing_paring.
     * 
     * @param man_actor_name
     */
    public void setMan_actor_name(java.lang.String man_actor_name) {
        this.man_actor_name = man_actor_name;
    }


    /**
     * Gets the country value for this Tooteparing_paring.
     * 
     * @return country
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Tooteparing_paring.
     * 
     * @param country
     */
    public void setCountry(ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType country) {
        this.country = country;
    }


    /**
     * Gets the volume value for this Tooteparing_paring.
     * 
     * @return volume
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this Tooteparing_paring.
     * 
     * @param volume
     */
    public void setVolume(ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType volume) {
        this.volume = volume;
    }


    /**
     * Gets the ethanol_vol value for this Tooteparing_paring.
     * 
     * @return ethanol_vol
     */
    public java.lang.String getEthanol_vol() {
        return ethanol_vol;
    }


    /**
     * Sets the ethanol_vol value for this Tooteparing_paring.
     * 
     * @param ethanol_vol
     */
    public void setEthanol_vol(java.lang.String ethanol_vol) {
        this.ethanol_vol = ethanol_vol;
    }


    /**
     * Gets the desc value for this Tooteparing_paring.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this Tooteparing_paring.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the status1 value for this Tooteparing_paring.
     * 
     * @return status1
     */
    public java.lang.Boolean getStatus1() {
        return status1;
    }


    /**
     * Sets the status1 value for this Tooteparing_paring.
     * 
     * @param status1
     */
    public void setStatus1(java.lang.Boolean status1) {
        this.status1 = status1;
    }


    /**
     * Gets the status2 value for this Tooteparing_paring.
     * 
     * @return status2
     */
    public java.lang.Boolean getStatus2() {
        return status2;
    }


    /**
     * Sets the status2 value for this Tooteparing_paring.
     * 
     * @param status2
     */
    public void setStatus2(java.lang.Boolean status2) {
        this.status2 = status2;
    }


    /**
     * Gets the resp_attach value for this Tooteparing_paring.
     * 
     * @return resp_attach
     */
    public boolean isResp_attach() {
        return resp_attach;
    }


    /**
     * Sets the resp_attach value for this Tooteparing_paring.
     * 
     * @param resp_attach
     */
    public void setResp_attach(boolean resp_attach) {
        this.resp_attach = resp_attach;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tooteparing_paring)) return false;
        Tooteparing_paring other = (Tooteparing_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reg_book_nr==null && other.getReg_book_nr()==null) || 
             (this.reg_book_nr!=null &&
              this.reg_book_nr.equals(other.getReg_book_nr()))) &&
            ((this.date_fromS==null && other.getDate_fromS()==null) || 
             (this.date_fromS!=null &&
              this.date_fromS.equals(other.getDate_fromS()))) &&
            ((this.date_toS==null && other.getDate_toS()==null) || 
             (this.date_toS!=null &&
              this.date_toS.equals(other.getDate_toS()))) &&
            ((this.date_fromE==null && other.getDate_fromE()==null) || 
             (this.date_fromE!=null &&
              this.date_fromE.equals(other.getDate_fromE()))) &&
            ((this.date_toE==null && other.getDate_toE()==null) || 
             (this.date_toE!=null &&
              this.date_toE.equals(other.getDate_toE()))) &&
            ((this.item_name==null && other.getItem_name()==null) || 
             (this.item_name!=null &&
              this.item_name.equals(other.getItem_name()))) &&
            ((this.producttype==null && other.getProducttype()==null) || 
             (this.producttype!=null &&
              this.producttype.equals(other.getProducttype()))) &&
            ((this.man_actor_name==null && other.getMan_actor_name()==null) || 
             (this.man_actor_name!=null &&
              this.man_actor_name.equals(other.getMan_actor_name()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.ethanol_vol==null && other.getEthanol_vol()==null) || 
             (this.ethanol_vol!=null &&
              this.ethanol_vol.equals(other.getEthanol_vol()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.status1==null && other.getStatus1()==null) || 
             (this.status1!=null &&
              this.status1.equals(other.getStatus1()))) &&
            ((this.status2==null && other.getStatus2()==null) || 
             (this.status2!=null &&
              this.status2.equals(other.getStatus2()))) &&
            this.resp_attach == other.isResp_attach();
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
        if (getReg_book_nr() != null) {
            _hashCode += getReg_book_nr().hashCode();
        }
        if (getDate_fromS() != null) {
            _hashCode += getDate_fromS().hashCode();
        }
        if (getDate_toS() != null) {
            _hashCode += getDate_toS().hashCode();
        }
        if (getDate_fromE() != null) {
            _hashCode += getDate_fromE().hashCode();
        }
        if (getDate_toE() != null) {
            _hashCode += getDate_toE().hashCode();
        }
        if (getItem_name() != null) {
            _hashCode += getItem_name().hashCode();
        }
        if (getProducttype() != null) {
            _hashCode += getProducttype().hashCode();
        }
        if (getMan_actor_name() != null) {
            _hashCode += getMan_actor_name().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getEthanol_vol() != null) {
            _hashCode += getEthanol_vol().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getStatus1() != null) {
            _hashCode += getStatus1().hashCode();
        }
        if (getStatus2() != null) {
            _hashCode += getStatus2().hashCode();
        }
        _hashCode += (isResp_attach() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tooteparing_paring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_paring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_book_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reg_book_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_fromS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_fromS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_toS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_toS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_fromE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_fromE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_toE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_toE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteliik"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("man_actor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "man_actor_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CountryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CapacityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethanol_vol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ethanol_vol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_attach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resp_attach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
