/**
 * MokaQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class MokaQueryType  implements java.io.Serializable {
    private eu.x_road.alkor2.MokaType moka;

    public MokaQueryType() {
    }

    public MokaQueryType(
           eu.x_road.alkor2.MokaType moka) {
           this.moka = moka;
    }


    /**
     * Gets the moka value for this MokaQueryType.
     * 
     * @return moka
     */
    public eu.x_road.alkor2.MokaType getMoka() {
        return moka;
    }


    /**
     * Sets the moka value for this MokaQueryType.
     * 
     * @param moka
     */
    public void setMoka(eu.x_road.alkor2.MokaType moka) {
        this.moka = moka;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MokaQueryType)) return false;
        MokaQueryType other = (MokaQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moka==null && other.getMoka()==null) || 
             (this.moka!=null &&
              this.moka.equals(other.getMoka())));
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
        if (getMoka() != null) {
            _hashCode += getMoka().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MokaQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "MokaQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moka");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Moka"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "MokaType"));
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
