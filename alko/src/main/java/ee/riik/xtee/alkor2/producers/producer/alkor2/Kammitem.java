/**
 * Kammitem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Kammitem  implements java.io.Serializable {
    private java.lang.String item_name;

    private java.lang.Double volume;

    private java.lang.String capacity;

    private java.lang.String producttype;

    private java.util.Date reg_date;

    private java.lang.String cn_code;

    private java.lang.String app_reg_nr;

    private java.lang.String app_actor_name;

    private java.lang.String man_actor_name;

    private java.lang.String country;

    public Kammitem() {
    }

    public Kammitem(
           java.lang.String item_name,
           java.lang.Double volume,
           java.lang.String capacity,
           java.lang.String producttype,
           java.util.Date reg_date,
           java.lang.String cn_code,
           java.lang.String app_reg_nr,
           java.lang.String app_actor_name,
           java.lang.String man_actor_name,
           java.lang.String country) {
           this.item_name = item_name;
           this.volume = volume;
           this.capacity = capacity;
           this.producttype = producttype;
           this.reg_date = reg_date;
           this.cn_code = cn_code;
           this.app_reg_nr = app_reg_nr;
           this.app_actor_name = app_actor_name;
           this.man_actor_name = man_actor_name;
           this.country = country;
    }


    /**
     * Gets the item_name value for this Kammitem.
     * 
     * @return item_name
     */
    public java.lang.String getItem_name() {
        return item_name;
    }


    /**
     * Sets the item_name value for this Kammitem.
     * 
     * @param item_name
     */
    public void setItem_name(java.lang.String item_name) {
        this.item_name = item_name;
    }


    /**
     * Gets the volume value for this Kammitem.
     * 
     * @return volume
     */
    public java.lang.Double getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this Kammitem.
     * 
     * @param volume
     */
    public void setVolume(java.lang.Double volume) {
        this.volume = volume;
    }


    /**
     * Gets the capacity value for this Kammitem.
     * 
     * @return capacity
     */
    public java.lang.String getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this Kammitem.
     * 
     * @param capacity
     */
    public void setCapacity(java.lang.String capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the producttype value for this Kammitem.
     * 
     * @return producttype
     */
    public java.lang.String getProducttype() {
        return producttype;
    }


    /**
     * Sets the producttype value for this Kammitem.
     * 
     * @param producttype
     */
    public void setProducttype(java.lang.String producttype) {
        this.producttype = producttype;
    }


    /**
     * Gets the reg_date value for this Kammitem.
     * 
     * @return reg_date
     */
    public java.util.Date getReg_date() {
        return reg_date;
    }


    /**
     * Sets the reg_date value for this Kammitem.
     * 
     * @param reg_date
     */
    public void setReg_date(java.util.Date reg_date) {
        this.reg_date = reg_date;
    }


    /**
     * Gets the cn_code value for this Kammitem.
     * 
     * @return cn_code
     */
    public java.lang.String getCn_code() {
        return cn_code;
    }


    /**
     * Sets the cn_code value for this Kammitem.
     * 
     * @param cn_code
     */
    public void setCn_code(java.lang.String cn_code) {
        this.cn_code = cn_code;
    }


    /**
     * Gets the app_reg_nr value for this Kammitem.
     * 
     * @return app_reg_nr
     */
    public java.lang.String getApp_reg_nr() {
        return app_reg_nr;
    }


    /**
     * Sets the app_reg_nr value for this Kammitem.
     * 
     * @param app_reg_nr
     */
    public void setApp_reg_nr(java.lang.String app_reg_nr) {
        this.app_reg_nr = app_reg_nr;
    }


    /**
     * Gets the app_actor_name value for this Kammitem.
     * 
     * @return app_actor_name
     */
    public java.lang.String getApp_actor_name() {
        return app_actor_name;
    }


    /**
     * Sets the app_actor_name value for this Kammitem.
     * 
     * @param app_actor_name
     */
    public void setApp_actor_name(java.lang.String app_actor_name) {
        this.app_actor_name = app_actor_name;
    }


    /**
     * Gets the man_actor_name value for this Kammitem.
     * 
     * @return man_actor_name
     */
    public java.lang.String getMan_actor_name() {
        return man_actor_name;
    }


    /**
     * Sets the man_actor_name value for this Kammitem.
     * 
     * @param man_actor_name
     */
    public void setMan_actor_name(java.lang.String man_actor_name) {
        this.man_actor_name = man_actor_name;
    }


    /**
     * Gets the country value for this Kammitem.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Kammitem.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kammitem)) return false;
        Kammitem other = (Kammitem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item_name==null && other.getItem_name()==null) || 
             (this.item_name!=null &&
              this.item_name.equals(other.getItem_name()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.producttype==null && other.getProducttype()==null) || 
             (this.producttype!=null &&
              this.producttype.equals(other.getProducttype()))) &&
            ((this.reg_date==null && other.getReg_date()==null) || 
             (this.reg_date!=null &&
              this.reg_date.equals(other.getReg_date()))) &&
            ((this.cn_code==null && other.getCn_code()==null) || 
             (this.cn_code!=null &&
              this.cn_code.equals(other.getCn_code()))) &&
            ((this.app_reg_nr==null && other.getApp_reg_nr()==null) || 
             (this.app_reg_nr!=null &&
              this.app_reg_nr.equals(other.getApp_reg_nr()))) &&
            ((this.app_actor_name==null && other.getApp_actor_name()==null) || 
             (this.app_actor_name!=null &&
              this.app_actor_name.equals(other.getApp_actor_name()))) &&
            ((this.man_actor_name==null && other.getMan_actor_name()==null) || 
             (this.man_actor_name!=null &&
              this.man_actor_name.equals(other.getMan_actor_name()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getItem_name() != null) {
            _hashCode += getItem_name().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getProducttype() != null) {
            _hashCode += getProducttype().hashCode();
        }
        if (getReg_date() != null) {
            _hashCode += getReg_date().hashCode();
        }
        if (getCn_code() != null) {
            _hashCode += getCn_code().hashCode();
        }
        if (getApp_reg_nr() != null) {
            _hashCode += getApp_reg_nr().hashCode();
        }
        if (getApp_actor_name() != null) {
            _hashCode += getApp_actor_name().hashCode();
        }
        if (getMan_actor_name() != null) {
            _hashCode += getMan_actor_name().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Kammitem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammitem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reg_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cn_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("app_reg_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "app_reg_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("app_actor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "app_actor_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
