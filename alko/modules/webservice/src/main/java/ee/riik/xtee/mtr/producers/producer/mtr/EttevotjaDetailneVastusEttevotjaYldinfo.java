/**
 * EttevotjaDetailneVastusEttevotjaYldinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class EttevotjaDetailneVastusEttevotjaYldinfo  extends ee.riik.xtee.mtr.producers.producer.mtr.YldinfoBaseType  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress;

    public EttevotjaDetailneVastusEttevotjaYldinfo() {
    }

    public EttevotjaDetailneVastusEttevotjaYldinfo(
           java.lang.String nimi,
           java.lang.String kood,
           java.lang.String tel,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String web,
           org.apache.axis.types.URI mtrlink,
           ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress) {
        super(
            nimi,
            kood,
            tel,
            fax,
            email,
            web,
            mtrlink);
        this.aadress = aadress;
    }


    /**
     * Gets the aadress value for this EttevotjaDetailneVastusEttevotjaYldinfo.
     * 
     * @return aadress
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.AadressType getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this EttevotjaDetailneVastusEttevotjaYldinfo.
     * 
     * @param aadress
     */
    public void setAadress(ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress) {
        this.aadress = aadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaDetailneVastusEttevotjaYldinfo)) return false;
        EttevotjaDetailneVastusEttevotjaYldinfo other = (EttevotjaDetailneVastusEttevotjaYldinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EttevotjaDetailneVastusEttevotjaYldinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaDetailneVastus>ettevotja>yldinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aadress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aadress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "aadressType"));
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
