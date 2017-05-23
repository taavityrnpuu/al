/**
 * AretolaadibResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2.types;

public class AretolaadibResponse  implements java.io.Serializable {
    private java.lang.String teade;

    private eu.x_road.alkor2.types.Reaviga[] vead;

    public AretolaadibResponse() {
    }

    public AretolaadibResponse(
           java.lang.String teade,
           eu.x_road.alkor2.types.Reaviga[] vead) {
           this.teade = teade;
           this.vead = vead;
    }


    /**
     * Gets the teade value for this AretolaadibResponse.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this AretolaadibResponse.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the vead value for this AretolaadibResponse.
     * 
     * @return vead
     */
    public eu.x_road.alkor2.types.Reaviga[] getVead() {
        return vead;
    }


    /**
     * Sets the vead value for this AretolaadibResponse.
     * 
     * @param vead
     */
    public void setVead(eu.x_road.alkor2.types.Reaviga[] vead) {
        this.vead = vead;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AretolaadibResponse)) return false;
        AretolaadibResponse other = (AretolaadibResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade()))) &&
            ((this.vead==null && other.getVead()==null) || 
             (this.vead!=null &&
              java.util.Arrays.equals(this.vead, other.getVead())));
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
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        if (getVead() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVead());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVead(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AretolaadibResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">aretolaadibResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vead");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "reaviga"));
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
