/**
 * Reaviga.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class Reaviga  implements java.io.Serializable {
    private java.lang.String rida;

    private java.lang.String mure;

    public Reaviga() {
    }

    public Reaviga(
           java.lang.String rida,
           java.lang.String mure) {
           this.rida = rida;
           this.mure = mure;
    }


    /**
     * Gets the rida value for this Reaviga.
     * 
     * @return rida
     */
    public java.lang.String getRida() {
        return rida;
    }


    /**
     * Sets the rida value for this Reaviga.
     * 
     * @param rida
     */
    public void setRida(java.lang.String rida) {
        this.rida = rida;
    }


    /**
     * Gets the mure value for this Reaviga.
     * 
     * @return mure
     */
    public java.lang.String getMure() {
        return mure;
    }


    /**
     * Sets the mure value for this Reaviga.
     * 
     * @param mure
     */
    public void setMure(java.lang.String mure) {
        this.mure = mure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reaviga)) return false;
        Reaviga other = (Reaviga) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rida==null && other.getRida()==null) || 
             (this.rida!=null &&
              this.rida.equals(other.getRida()))) &&
            ((this.mure==null && other.getMure()==null) || 
             (this.mure!=null &&
              this.mure.equals(other.getMure())));
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
        if (getRida() != null) {
            _hashCode += getRida().hashCode();
        }
        if (getMure() != null) {
            _hashCode += getMure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reaviga.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "reaviga"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mure"));
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
