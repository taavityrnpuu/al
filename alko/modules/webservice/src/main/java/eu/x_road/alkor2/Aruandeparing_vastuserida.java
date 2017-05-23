/**
 * Aruandeparing_vastuserida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class Aruandeparing_vastuserida  implements java.io.Serializable {
    private java.lang.String ent_name;

    private java.lang.String ent_reg_nr;

    private java.lang.String ent_contact;

    private java.util.Date load_date;

    private eu.x_road.alkor2.Aruandeperiood period;

    private java.lang.String load_user;

    private java.lang.String rcd_count;

    private int report_id;

    public Aruandeparing_vastuserida() {
    }

    public Aruandeparing_vastuserida(
           java.lang.String ent_name,
           java.lang.String ent_reg_nr,
           java.lang.String ent_contact,
           java.util.Date load_date,
           eu.x_road.alkor2.Aruandeperiood period,
           java.lang.String load_user,
           java.lang.String rcd_count,
           int report_id) {
           this.ent_name = ent_name;
           this.ent_reg_nr = ent_reg_nr;
           this.ent_contact = ent_contact;
           this.load_date = load_date;
           this.period = period;
           this.load_user = load_user;
           this.rcd_count = rcd_count;
           this.report_id = report_id;
    }


    /**
     * Gets the ent_name value for this Aruandeparing_vastuserida.
     * 
     * @return ent_name
     */
    public java.lang.String getEnt_name() {
        return ent_name;
    }


    /**
     * Sets the ent_name value for this Aruandeparing_vastuserida.
     * 
     * @param ent_name
     */
    public void setEnt_name(java.lang.String ent_name) {
        this.ent_name = ent_name;
    }


    /**
     * Gets the ent_reg_nr value for this Aruandeparing_vastuserida.
     * 
     * @return ent_reg_nr
     */
    public java.lang.String getEnt_reg_nr() {
        return ent_reg_nr;
    }


    /**
     * Sets the ent_reg_nr value for this Aruandeparing_vastuserida.
     * 
     * @param ent_reg_nr
     */
    public void setEnt_reg_nr(java.lang.String ent_reg_nr) {
        this.ent_reg_nr = ent_reg_nr;
    }


    /**
     * Gets the ent_contact value for this Aruandeparing_vastuserida.
     * 
     * @return ent_contact
     */
    public java.lang.String getEnt_contact() {
        return ent_contact;
    }


    /**
     * Sets the ent_contact value for this Aruandeparing_vastuserida.
     * 
     * @param ent_contact
     */
    public void setEnt_contact(java.lang.String ent_contact) {
        this.ent_contact = ent_contact;
    }


    /**
     * Gets the load_date value for this Aruandeparing_vastuserida.
     * 
     * @return load_date
     */
    public java.util.Date getLoad_date() {
        return load_date;
    }


    /**
     * Sets the load_date value for this Aruandeparing_vastuserida.
     * 
     * @param load_date
     */
    public void setLoad_date(java.util.Date load_date) {
        this.load_date = load_date;
    }


    /**
     * Gets the period value for this Aruandeparing_vastuserida.
     * 
     * @return period
     */
    public eu.x_road.alkor2.Aruandeperiood getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this Aruandeparing_vastuserida.
     * 
     * @param period
     */
    public void setPeriod(eu.x_road.alkor2.Aruandeperiood period) {
        this.period = period;
    }


    /**
     * Gets the load_user value for this Aruandeparing_vastuserida.
     * 
     * @return load_user
     */
    public java.lang.String getLoad_user() {
        return load_user;
    }


    /**
     * Sets the load_user value for this Aruandeparing_vastuserida.
     * 
     * @param load_user
     */
    public void setLoad_user(java.lang.String load_user) {
        this.load_user = load_user;
    }


    /**
     * Gets the rcd_count value for this Aruandeparing_vastuserida.
     * 
     * @return rcd_count
     */
    public java.lang.String getRcd_count() {
        return rcd_count;
    }


    /**
     * Sets the rcd_count value for this Aruandeparing_vastuserida.
     * 
     * @param rcd_count
     */
    public void setRcd_count(java.lang.String rcd_count) {
        this.rcd_count = rcd_count;
    }


    /**
     * Gets the report_id value for this Aruandeparing_vastuserida.
     * 
     * @return report_id
     */
    public int getReport_id() {
        return report_id;
    }


    /**
     * Sets the report_id value for this Aruandeparing_vastuserida.
     * 
     * @param report_id
     */
    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruandeparing_vastuserida)) return false;
        Aruandeparing_vastuserida other = (Aruandeparing_vastuserida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ent_name==null && other.getEnt_name()==null) || 
             (this.ent_name!=null &&
              this.ent_name.equals(other.getEnt_name()))) &&
            ((this.ent_reg_nr==null && other.getEnt_reg_nr()==null) || 
             (this.ent_reg_nr!=null &&
              this.ent_reg_nr.equals(other.getEnt_reg_nr()))) &&
            ((this.ent_contact==null && other.getEnt_contact()==null) || 
             (this.ent_contact!=null &&
              this.ent_contact.equals(other.getEnt_contact()))) &&
            ((this.load_date==null && other.getLoad_date()==null) || 
             (this.load_date!=null &&
              this.load_date.equals(other.getLoad_date()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.load_user==null && other.getLoad_user()==null) || 
             (this.load_user!=null &&
              this.load_user.equals(other.getLoad_user()))) &&
            ((this.rcd_count==null && other.getRcd_count()==null) || 
             (this.rcd_count!=null &&
              this.rcd_count.equals(other.getRcd_count()))) &&
            this.report_id == other.getReport_id();
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
        if (getEnt_name() != null) {
            _hashCode += getEnt_name().hashCode();
        }
        if (getEnt_reg_nr() != null) {
            _hashCode += getEnt_reg_nr().hashCode();
        }
        if (getEnt_contact() != null) {
            _hashCode += getEnt_contact().hashCode();
        }
        if (getLoad_date() != null) {
            _hashCode += getLoad_date().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getLoad_user() != null) {
            _hashCode += getLoad_user().hashCode();
        }
        if (getRcd_count() != null) {
            _hashCode += getRcd_count().hashCode();
        }
        _hashCode += getReport_id();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aruandeparing_vastuserida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "aruandeparing_vastuserida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ent_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ent_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ent_reg_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ent_reg_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ent_contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ent_contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("load_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "load_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "aruandeperiood"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("load_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "load_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcd_count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcd_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
