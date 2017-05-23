/**
 * EttevotjaDetailneVastusEttevotja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class EttevotjaDetailneVastusEttevotja  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotjaYldinfo yldinfo;

    private ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType[] registrikanne;

    public EttevotjaDetailneVastusEttevotja() {
    }

    public EttevotjaDetailneVastusEttevotja(
           ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotjaYldinfo yldinfo,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType[] registrikanne) {
           this.yldinfo = yldinfo;
           this.registrikanne = registrikanne;
    }


    /**
     * Gets the yldinfo value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @return yldinfo
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotjaYldinfo getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotjaYldinfo yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the registrikanne value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @return registrikanne
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType[] getRegistrikanne() {
        return registrikanne;
    }


    /**
     * Sets the registrikanne value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @param registrikanne
     */
    public void setRegistrikanne(ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType[] registrikanne) {
        this.registrikanne = registrikanne;
    }

    public ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType getRegistrikanne(int i) {
        return this.registrikanne[i];
    }

    public void setRegistrikanne(int i, ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType _value) {
        this.registrikanne[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaDetailneVastusEttevotja)) return false;
        EttevotjaDetailneVastusEttevotja other = (EttevotjaDetailneVastusEttevotja) obj;
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
            ((this.registrikanne==null && other.getRegistrikanne()==null) || 
             (this.registrikanne!=null &&
              java.util.Arrays.equals(this.registrikanne, other.getRegistrikanne())));
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
        if (getRegistrikanne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikanne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikanne(), i);
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
        new org.apache.axis.description.TypeDesc(EttevotjaDetailneVastusEttevotja.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">EttevotjaDetailneVastus>ettevotja"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yldinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yldinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaDetailneVastus>ettevotja>yldinfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrikanne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrikanne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
