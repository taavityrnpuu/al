/**
 * LiikumineParingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2.types;

public class LiikumineParingResponse  implements java.io.Serializable {
    private java.lang.String teade;

    private eu.x_road.alkor2.types.Liikumine[] liikumised;

    private java.lang.String liikumised_csv;

    public LiikumineParingResponse() {
    }

    public LiikumineParingResponse(
           java.lang.String teade,
           eu.x_road.alkor2.types.Liikumine[] liikumised,
           java.lang.String liikumised_csv) {
           this.teade = teade;
           this.liikumised = liikumised;
           this.liikumised_csv = liikumised_csv;
    }


    /**
     * Gets the teade value for this LiikumineParingResponse.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this LiikumineParingResponse.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the liikumised value for this LiikumineParingResponse.
     * 
     * @return liikumised
     */
    public eu.x_road.alkor2.types.Liikumine[] getLiikumised() {
        return liikumised;
    }


    /**
     * Sets the liikumised value for this LiikumineParingResponse.
     * 
     * @param liikumised
     */
    public void setLiikumised(eu.x_road.alkor2.types.Liikumine[] liikumised) {
        this.liikumised = liikumised;
    }


    /**
     * Gets the liikumised_csv value for this LiikumineParingResponse.
     * 
     * @return liikumised_csv
     */
    public java.lang.String getLiikumised_csv() {
        return liikumised_csv;
    }


    /**
     * Sets the liikumised_csv value for this LiikumineParingResponse.
     * 
     * @param liikumised_csv
     */
    public void setLiikumised_csv(java.lang.String liikumised_csv) {
        this.liikumised_csv = liikumised_csv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiikumineParingResponse)) return false;
        LiikumineParingResponse other = (LiikumineParingResponse) obj;
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
            ((this.liikumised==null && other.getLiikumised()==null) || 
             (this.liikumised!=null &&
              java.util.Arrays.equals(this.liikumised, other.getLiikumised()))) &&
            ((this.liikumised_csv==null && other.getLiikumised_csv()==null) || 
             (this.liikumised_csv!=null &&
              this.liikumised_csv.equals(other.getLiikumised_csv())));
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
        if (getLiikumised() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiikumised());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiikumised(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiikumised_csv() != null) {
            _hashCode += getLiikumised_csv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiikumineParingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">liikumineParingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liikumised");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liikumised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "liikumine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liikumised_csv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liikumised_csv"));
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
