/**
 * Liikumine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class Liikumine  implements java.io.Serializable {
    private java.lang.String reg_book_nr;

    private java.lang.String receiver;

    private java.lang.String market;

    private java.lang.String addr_county;

    private java.lang.String addr_town;

    private java.lang.String addr_str;

    private java.lang.String p_nr;

    private java.lang.String p_cnt;

    private java.lang.String ent_name;

    private java.lang.String report_id;

    public Liikumine() {
    }

    public Liikumine(
           java.lang.String reg_book_nr,
           java.lang.String receiver,
           java.lang.String market,
           java.lang.String addr_county,
           java.lang.String addr_town,
           java.lang.String addr_str,
           java.lang.String p_nr,
           java.lang.String p_cnt,
           java.lang.String ent_name,
           java.lang.String report_id) {
           this.reg_book_nr = reg_book_nr;
           this.receiver = receiver;
           this.market = market;
           this.addr_county = addr_county;
           this.addr_town = addr_town;
           this.addr_str = addr_str;
           this.p_nr = p_nr;
           this.p_cnt = p_cnt;
           this.ent_name = ent_name;
           this.report_id = report_id;
    }


    /**
     * Gets the reg_book_nr value for this Liikumine.
     * 
     * @return reg_book_nr
     */
    public java.lang.String getReg_book_nr() {
        return reg_book_nr;
    }


    /**
     * Sets the reg_book_nr value for this Liikumine.
     * 
     * @param reg_book_nr
     */
    public void setReg_book_nr(java.lang.String reg_book_nr) {
        this.reg_book_nr = reg_book_nr;
    }


    /**
     * Gets the receiver value for this Liikumine.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this Liikumine.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the market value for this Liikumine.
     * 
     * @return market
     */
    public java.lang.String getMarket() {
        return market;
    }


    /**
     * Sets the market value for this Liikumine.
     * 
     * @param market
     */
    public void setMarket(java.lang.String market) {
        this.market = market;
    }


    /**
     * Gets the addr_county value for this Liikumine.
     * 
     * @return addr_county
     */
    public java.lang.String getAddr_county() {
        return addr_county;
    }


    /**
     * Sets the addr_county value for this Liikumine.
     * 
     * @param addr_county
     */
    public void setAddr_county(java.lang.String addr_county) {
        this.addr_county = addr_county;
    }


    /**
     * Gets the addr_town value for this Liikumine.
     * 
     * @return addr_town
     */
    public java.lang.String getAddr_town() {
        return addr_town;
    }


    /**
     * Sets the addr_town value for this Liikumine.
     * 
     * @param addr_town
     */
    public void setAddr_town(java.lang.String addr_town) {
        this.addr_town = addr_town;
    }


    /**
     * Gets the addr_str value for this Liikumine.
     * 
     * @return addr_str
     */
    public java.lang.String getAddr_str() {
        return addr_str;
    }


    /**
     * Sets the addr_str value for this Liikumine.
     * 
     * @param addr_str
     */
    public void setAddr_str(java.lang.String addr_str) {
        this.addr_str = addr_str;
    }


    /**
     * Gets the p_nr value for this Liikumine.
     * 
     * @return p_nr
     */
    public java.lang.String getP_nr() {
        return p_nr;
    }


    /**
     * Sets the p_nr value for this Liikumine.
     * 
     * @param p_nr
     */
    public void setP_nr(java.lang.String p_nr) {
        this.p_nr = p_nr;
    }


    /**
     * Gets the p_cnt value for this Liikumine.
     * 
     * @return p_cnt
     */
    public java.lang.String getP_cnt() {
        return p_cnt;
    }


    /**
     * Sets the p_cnt value for this Liikumine.
     * 
     * @param p_cnt
     */
    public void setP_cnt(java.lang.String p_cnt) {
        this.p_cnt = p_cnt;
    }


    /**
     * Gets the ent_name value for this Liikumine.
     * 
     * @return ent_name
     */
    public java.lang.String getEnt_name() {
        return ent_name;
    }


    /**
     * Sets the ent_name value for this Liikumine.
     * 
     * @param ent_name
     */
    public void setEnt_name(java.lang.String ent_name) {
        this.ent_name = ent_name;
    }


    /**
     * Gets the report_id value for this Liikumine.
     * 
     * @return report_id
     */
    public java.lang.String getReport_id() {
        return report_id;
    }


    /**
     * Sets the report_id value for this Liikumine.
     * 
     * @param report_id
     */
    public void setReport_id(java.lang.String report_id) {
        this.report_id = report_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Liikumine)) return false;
        Liikumine other = (Liikumine) obj;
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
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.market==null && other.getMarket()==null) || 
             (this.market!=null &&
              this.market.equals(other.getMarket()))) &&
            ((this.addr_county==null && other.getAddr_county()==null) || 
             (this.addr_county!=null &&
              this.addr_county.equals(other.getAddr_county()))) &&
            ((this.addr_town==null && other.getAddr_town()==null) || 
             (this.addr_town!=null &&
              this.addr_town.equals(other.getAddr_town()))) &&
            ((this.addr_str==null && other.getAddr_str()==null) || 
             (this.addr_str!=null &&
              this.addr_str.equals(other.getAddr_str()))) &&
            ((this.p_nr==null && other.getP_nr()==null) || 
             (this.p_nr!=null &&
              this.p_nr.equals(other.getP_nr()))) &&
            ((this.p_cnt==null && other.getP_cnt()==null) || 
             (this.p_cnt!=null &&
              this.p_cnt.equals(other.getP_cnt()))) &&
            ((this.ent_name==null && other.getEnt_name()==null) || 
             (this.ent_name!=null &&
              this.ent_name.equals(other.getEnt_name()))) &&
            ((this.report_id==null && other.getReport_id()==null) || 
             (this.report_id!=null &&
              this.report_id.equals(other.getReport_id())));
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
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getMarket() != null) {
            _hashCode += getMarket().hashCode();
        }
        if (getAddr_county() != null) {
            _hashCode += getAddr_county().hashCode();
        }
        if (getAddr_town() != null) {
            _hashCode += getAddr_town().hashCode();
        }
        if (getAddr_str() != null) {
            _hashCode += getAddr_str().hashCode();
        }
        if (getP_nr() != null) {
            _hashCode += getP_nr().hashCode();
        }
        if (getP_cnt() != null) {
            _hashCode += getP_cnt().hashCode();
        }
        if (getEnt_name() != null) {
            _hashCode += getEnt_name().hashCode();
        }
        if (getReport_id() != null) {
            _hashCode += getReport_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Liikumine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "liikumine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_book_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reg_book_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("market");
        elemField.setXmlName(new javax.xml.namespace.QName("", "market"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_county");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_town");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_town"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_str");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_cnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p_cnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ent_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ent_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
