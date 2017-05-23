/**
 * EttevotjaVastusEttevotjadEttevotja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class EttevotjaVastusEttevotjadEttevotja  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.YldinfoType yldinfo;

    private ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType[] registrikanded;

    public EttevotjaVastusEttevotjadEttevotja() {
    }

    public EttevotjaVastusEttevotjadEttevotja(
           ee.riik.xtee.mtr.producers.producer.mtr.YldinfoType yldinfo,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType[] registrikanded) {
           this.yldinfo = yldinfo;
           this.registrikanded = registrikanded;
    }


    /**
     * Gets the yldinfo value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @return yldinfo
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.YldinfoType getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.riik.xtee.mtr.producers.producer.mtr.YldinfoType yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the registrikanded value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @return registrikanded
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType[] getRegistrikanded() {
        return registrikanded;
    }


    /**
     * Sets the registrikanded value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @param registrikanded
     */
    public void setRegistrikanded(ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType[] registrikanded) {
        this.registrikanded = registrikanded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaVastusEttevotjadEttevotja)) return false;
        EttevotjaVastusEttevotjadEttevotja other = (EttevotjaVastusEttevotjadEttevotja) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yldinfo==null && other.getYldinfo()==null) || 
             (this.yldinfo!=null &&
              this.yldinfo.equals(other.getYldinfo()))) &&
            ((this.registrikanded==null && other.getRegistrikanded()==null) || 
             (this.registrikanded!=null &&
              java.util.Arrays.equals(this.registrikanded, other.getRegistrikanded())));
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
        if (getYldinfo() != null) {
            _hashCode += getYldinfo().hashCode();
        }
        if (getRegistrikanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikanded(), i);
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
        new org.apache.axis.description.TypeDesc(EttevotjaVastusEttevotjadEttevotja.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaVastus>ettevotjad>ettevotja"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yldinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yldinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "yldinfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrikanded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrikanded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "registrikanne"));
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
