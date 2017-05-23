/**
 * Aruandeperiood.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class Aruandeperiood  implements java.io.Serializable {
    private java.lang.String rep_year;

    private eu.x_road.alkor2.Kalendrikuu rep_month;

    public Aruandeperiood() {
    }

    public Aruandeperiood(
           java.lang.String rep_year,
           eu.x_road.alkor2.Kalendrikuu rep_month) {
           this.rep_year = rep_year;
           this.rep_month = rep_month;
    }


    /**
     * Gets the rep_year value for this Aruandeperiood.
     * 
     * @return rep_year
     */
    public java.lang.String getRep_year() {
        return rep_year;
    }


    /**
     * Sets the rep_year value for this Aruandeperiood.
     * 
     * @param rep_year
     */
    public void setRep_year(java.lang.String rep_year) {
        this.rep_year = rep_year;
    }


    /**
     * Gets the rep_month value for this Aruandeperiood.
     * 
     * @return rep_month
     */
    public eu.x_road.alkor2.Kalendrikuu getRep_month() {
        return rep_month;
    }


    /**
     * Sets the rep_month value for this Aruandeperiood.
     * 
     * @param rep_month
     */
    public void setRep_month(eu.x_road.alkor2.Kalendrikuu rep_month) {
        this.rep_month = rep_month;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruandeperiood)) return false;
        Aruandeperiood other = (Aruandeperiood) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rep_year==null && other.getRep_year()==null) || 
             (this.rep_year!=null &&
              this.rep_year.equals(other.getRep_year()))) &&
            ((this.rep_month==null && other.getRep_month()==null) || 
             (this.rep_month!=null &&
              this.rep_month.equals(other.getRep_month())));
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
        if (getRep_year() != null) {
            _hashCode += getRep_year().hashCode();
        }
        if (getRep_month() != null) {
            _hashCode += getRep_month().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aruandeperiood.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "aruandeperiood"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rep_year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rep_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rep_month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rep_month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "kalendrikuu"));
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
