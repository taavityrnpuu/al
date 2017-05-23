/**
 * Aruandeparing_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Aruandeparing_paring  implements java.io.Serializable {
    private java.util.Date l_date_from;

    private java.util.Date l_date_to;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood periodStart;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood periodEnd;

    private boolean resp_attach;

    public Aruandeparing_paring() {
    }

    public Aruandeparing_paring(
           java.util.Date l_date_from,
           java.util.Date l_date_to,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood periodStart,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood periodEnd,
           boolean resp_attach) {
           this.l_date_from = l_date_from;
           this.l_date_to = l_date_to;
           this.periodStart = periodStart;
           this.periodEnd = periodEnd;
           this.resp_attach = resp_attach;
    }


    /**
     * Gets the l_date_from value for this Aruandeparing_paring.
     * 
     * @return l_date_from
     */
    public java.util.Date getL_date_from() {
        return l_date_from;
    }


    /**
     * Sets the l_date_from value for this Aruandeparing_paring.
     * 
     * @param l_date_from
     */
    public void setL_date_from(java.util.Date l_date_from) {
        this.l_date_from = l_date_from;
    }


    /**
     * Gets the l_date_to value for this Aruandeparing_paring.
     * 
     * @return l_date_to
     */
    public java.util.Date getL_date_to() {
        return l_date_to;
    }


    /**
     * Sets the l_date_to value for this Aruandeparing_paring.
     * 
     * @param l_date_to
     */
    public void setL_date_to(java.util.Date l_date_to) {
        this.l_date_to = l_date_to;
    }


    /**
     * Gets the periodStart value for this Aruandeparing_paring.
     * 
     * @return periodStart
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood getPeriodStart() {
        return periodStart;
    }


    /**
     * Sets the periodStart value for this Aruandeparing_paring.
     * 
     * @param periodStart
     */
    public void setPeriodStart(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood periodStart) {
        this.periodStart = periodStart;
    }


    /**
     * Gets the periodEnd value for this Aruandeparing_paring.
     * 
     * @return periodEnd
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood getPeriodEnd() {
        return periodEnd;
    }


    /**
     * Sets the periodEnd value for this Aruandeparing_paring.
     * 
     * @param periodEnd
     */
    public void setPeriodEnd(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood periodEnd) {
        this.periodEnd = periodEnd;
    }


    /**
     * Gets the resp_attach value for this Aruandeparing_paring.
     * 
     * @return resp_attach
     */
    public boolean isResp_attach() {
        return resp_attach;
    }


    /**
     * Sets the resp_attach value for this Aruandeparing_paring.
     * 
     * @param resp_attach
     */
    public void setResp_attach(boolean resp_attach) {
        this.resp_attach = resp_attach;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruandeparing_paring)) return false;
        Aruandeparing_paring other = (Aruandeparing_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.l_date_from==null && other.getL_date_from()==null) || 
             (this.l_date_from!=null &&
              this.l_date_from.equals(other.getL_date_from()))) &&
            ((this.l_date_to==null && other.getL_date_to()==null) || 
             (this.l_date_to!=null &&
              this.l_date_to.equals(other.getL_date_to()))) &&
            ((this.periodStart==null && other.getPeriodStart()==null) || 
             (this.periodStart!=null &&
              this.periodStart.equals(other.getPeriodStart()))) &&
            ((this.periodEnd==null && other.getPeriodEnd()==null) || 
             (this.periodEnd!=null &&
              this.periodEnd.equals(other.getPeriodEnd()))) &&
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
        if (getL_date_from() != null) {
            _hashCode += getL_date_from().hashCode();
        }
        if (getL_date_to() != null) {
            _hashCode += getL_date_to().hashCode();
        }
        if (getPeriodStart() != null) {
            _hashCode += getPeriodStart().hashCode();
        }
        if (getPeriodEnd() != null) {
            _hashCode += getPeriodEnd().hashCode();
        }
        _hashCode += (isResp_attach() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aruandeparing_paring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_paring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("periodStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeperiood"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeperiood"));
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
