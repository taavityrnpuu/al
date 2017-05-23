/**
 * Kammparing_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Kammparing_paring  implements java.io.Serializable {
    private java.lang.String reg_book_nr;

    private java.util.Date reg_date;

    public Kammparing_paring() {
    }

    public Kammparing_paring(
           java.lang.String reg_book_nr,
           java.util.Date reg_date) {
           this.reg_book_nr = reg_book_nr;
           this.reg_date = reg_date;
    }


    /**
     * Gets the reg_book_nr value for this Kammparing_paring.
     * 
     * @return reg_book_nr
     */
    public java.lang.String getReg_book_nr() {
        return reg_book_nr;
    }


    /**
     * Sets the reg_book_nr value for this Kammparing_paring.
     * 
     * @param reg_book_nr
     */
    public void setReg_book_nr(java.lang.String reg_book_nr) {
        this.reg_book_nr = reg_book_nr;
    }


    /**
     * Gets the reg_date value for this Kammparing_paring.
     * 
     * @return reg_date
     */
    public java.util.Date getReg_date() {
        return reg_date;
    }


    /**
     * Sets the reg_date value for this Kammparing_paring.
     * 
     * @param reg_date
     */
    public void setReg_date(java.util.Date reg_date) {
        this.reg_date = reg_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kammparing_paring)) return false;
        Kammparing_paring other = (Kammparing_paring) obj;
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
            ((this.reg_date==null && other.getReg_date()==null) || 
             (this.reg_date!=null &&
              this.reg_date.equals(other.getReg_date())));
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
        if (getReg_date() != null) {
            _hashCode += getReg_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Kammparing_paring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_paring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_book_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reg_book_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reg_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
