/**
 * LiikumineParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2.types;

public class LiikumineParing  implements java.io.Serializable {
    private java.lang.String reg_book_nr;

    private java.lang.String ent_reg_nr;

    private java.lang.String ent_name;

    private java.lang.String receiver;

    private java.lang.String market;

    private java.lang.String addr_county;

    private java.lang.String addr_town;

    private java.lang.String addr_str;

    private java.lang.String p_nr;

    private java.lang.String p_cnt;

    private java.util.Date l_date_from;

    private java.util.Date l_date_to;

    private eu.x_road.alkor2.types.Aruandeperiood period;

    private java.lang.Integer report_id;

    private java.lang.Boolean resp_attach;

    public LiikumineParing() {
    }

    public LiikumineParing(
           java.lang.String reg_book_nr,
           java.lang.String ent_reg_nr,
           java.lang.String ent_name,
           java.lang.String receiver,
           java.lang.String market,
           java.lang.String addr_county,
           java.lang.String addr_town,
           java.lang.String addr_str,
           java.lang.String p_nr,
           java.lang.String p_cnt,
           java.util.Date l_date_from,
           java.util.Date l_date_to,
           eu.x_road.alkor2.types.Aruandeperiood period,
           java.lang.Integer report_id,
           java.lang.Boolean resp_attach) {
           this.reg_book_nr = reg_book_nr;
           this.ent_reg_nr = ent_reg_nr;
           this.ent_name = ent_name;
           this.receiver = receiver;
           this.market = market;
           this.addr_county = addr_county;
           this.addr_town = addr_town;
           this.addr_str = addr_str;
           this.p_nr = p_nr;
           this.p_cnt = p_cnt;
           this.l_date_from = l_date_from;
           this.l_date_to = l_date_to;
           this.period = period;
           this.report_id = report_id;
           this.resp_attach = resp_attach;
    }


    /**
     * Gets the reg_book_nr value for this LiikumineParing.
     * 
     * @return reg_book_nr
     */
    public java.lang.String getReg_book_nr() {
        return reg_book_nr;
    }


    /**
     * Sets the reg_book_nr value for this LiikumineParing.
     * 
     * @param reg_book_nr
     */
    public void setReg_book_nr(java.lang.String reg_book_nr) {
        this.reg_book_nr = reg_book_nr;
    }


    /**
     * Gets the ent_reg_nr value for this LiikumineParing.
     * 
     * @return ent_reg_nr
     */
    public java.lang.String getEnt_reg_nr() {
        return ent_reg_nr;
    }


    /**
     * Sets the ent_reg_nr value for this LiikumineParing.
     * 
     * @param ent_reg_nr
     */
    public void setEnt_reg_nr(java.lang.String ent_reg_nr) {
        this.ent_reg_nr = ent_reg_nr;
    }


    /**
     * Gets the ent_name value for this LiikumineParing.
     * 
     * @return ent_name
     */
    public java.lang.String getEnt_name() {
        return ent_name;
    }


    /**
     * Sets the ent_name value for this LiikumineParing.
     * 
     * @param ent_name
     */
    public void setEnt_name(java.lang.String ent_name) {
        this.ent_name = ent_name;
    }


    /**
     * Gets the receiver value for this LiikumineParing.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this LiikumineParing.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the market value for this LiikumineParing.
     * 
     * @return market
     */
    public java.lang.String getMarket() {
        return market;
    }


    /**
     * Sets the market value for this LiikumineParing.
     * 
     * @param market
     */
    public void setMarket(java.lang.String market) {
        this.market = market;
    }


    /**
     * Gets the addr_county value for this LiikumineParing.
     * 
     * @return addr_county
     */
    public java.lang.String getAddr_county() {
        return addr_county;
    }


    /**
     * Sets the addr_county value for this LiikumineParing.
     * 
     * @param addr_county
     */
    public void setAddr_county(java.lang.String addr_county) {
        this.addr_county = addr_county;
    }


    /**
     * Gets the addr_town value for this LiikumineParing.
     * 
     * @return addr_town
     */
    public java.lang.String getAddr_town() {
        return addr_town;
    }


    /**
     * Sets the addr_town value for this LiikumineParing.
     * 
     * @param addr_town
     */
    public void setAddr_town(java.lang.String addr_town) {
        this.addr_town = addr_town;
    }


    /**
     * Gets the addr_str value for this LiikumineParing.
     * 
     * @return addr_str
     */
    public java.lang.String getAddr_str() {
        return addr_str;
    }


    /**
     * Sets the addr_str value for this LiikumineParing.
     * 
     * @param addr_str
     */
    public void setAddr_str(java.lang.String addr_str) {
        this.addr_str = addr_str;
    }


    /**
     * Gets the p_nr value for this LiikumineParing.
     * 
     * @return p_nr
     */
    public java.lang.String getP_nr() {
        return p_nr;
    }


    /**
     * Sets the p_nr value for this LiikumineParing.
     * 
     * @param p_nr
     */
    public void setP_nr(java.lang.String p_nr) {
        this.p_nr = p_nr;
    }


    /**
     * Gets the p_cnt value for this LiikumineParing.
     * 
     * @return p_cnt
     */
    public java.lang.String getP_cnt() {
        return p_cnt;
    }


    /**
     * Sets the p_cnt value for this LiikumineParing.
     * 
     * @param p_cnt
     */
    public void setP_cnt(java.lang.String p_cnt) {
        this.p_cnt = p_cnt;
    }


    /**
     * Gets the l_date_from value for this LiikumineParing.
     * 
     * @return l_date_from
     */
    public java.util.Date getL_date_from() {
        return l_date_from;
    }


    /**
     * Sets the l_date_from value for this LiikumineParing.
     * 
     * @param l_date_from
     */
    public void setL_date_from(java.util.Date l_date_from) {
        this.l_date_from = l_date_from;
    }


    /**
     * Gets the l_date_to value for this LiikumineParing.
     * 
     * @return l_date_to
     */
    public java.util.Date getL_date_to() {
        return l_date_to;
    }


    /**
     * Sets the l_date_to value for this LiikumineParing.
     * 
     * @param l_date_to
     */
    public void setL_date_to(java.util.Date l_date_to) {
        this.l_date_to = l_date_to;
    }


    /**
     * Gets the period value for this LiikumineParing.
     * 
     * @return period
     */
    public eu.x_road.alkor2.types.Aruandeperiood getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this LiikumineParing.
     * 
     * @param period
     */
    public void setPeriod(eu.x_road.alkor2.types.Aruandeperiood period) {
        this.period = period;
    }


    /**
     * Gets the report_id value for this LiikumineParing.
     * 
     * @return report_id
     */
    public java.lang.Integer getReport_id() {
        return report_id;
    }


    /**
     * Sets the report_id value for this LiikumineParing.
     * 
     * @param report_id
     */
    public void setReport_id(java.lang.Integer report_id) {
        this.report_id = report_id;
    }


    /**
     * Gets the resp_attach value for this LiikumineParing.
     * 
     * @return resp_attach
     */
    public java.lang.Boolean getResp_attach() {
        return resp_attach;
    }


    /**
     * Sets the resp_attach value for this LiikumineParing.
     * 
     * @param resp_attach
     */
    public void setResp_attach(java.lang.Boolean resp_attach) {
        this.resp_attach = resp_attach;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiikumineParing)) return false;
        LiikumineParing other = (LiikumineParing) obj;
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
            ((this.ent_reg_nr==null && other.getEnt_reg_nr()==null) || 
             (this.ent_reg_nr!=null &&
              this.ent_reg_nr.equals(other.getEnt_reg_nr()))) &&
            ((this.ent_name==null && other.getEnt_name()==null) || 
             (this.ent_name!=null &&
              this.ent_name.equals(other.getEnt_name()))) &&
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
            ((this.l_date_from==null && other.getL_date_from()==null) || 
             (this.l_date_from!=null &&
              this.l_date_from.equals(other.getL_date_from()))) &&
            ((this.l_date_to==null && other.getL_date_to()==null) || 
             (this.l_date_to!=null &&
              this.l_date_to.equals(other.getL_date_to()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.report_id==null && other.getReport_id()==null) || 
             (this.report_id!=null &&
              this.report_id.equals(other.getReport_id()))) &&
            ((this.resp_attach==null && other.getResp_attach()==null) || 
             (this.resp_attach!=null &&
              this.resp_attach.equals(other.getResp_attach())));
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
        if (getEnt_reg_nr() != null) {
            _hashCode += getEnt_reg_nr().hashCode();
        }
        if (getEnt_name() != null) {
            _hashCode += getEnt_name().hashCode();
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
        if (getL_date_from() != null) {
            _hashCode += getL_date_from().hashCode();
        }
        if (getL_date_to() != null) {
            _hashCode += getL_date_to().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getReport_id() != null) {
            _hashCode += getReport_id().hashCode();
        }
        if (getResp_attach() != null) {
            _hashCode += getResp_attach().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiikumineParing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">liikumineParing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_book_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reg_book_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ent_reg_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ent_reg_nr"));
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
        elemField.setFieldName("l_date_from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l_date_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l_date_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l_date_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeperiood"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resp_attach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resp_attach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
