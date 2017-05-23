/**
 * RegistrikanneDetailneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistrikanneDetailneType  extends ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht[] tegevuskoht;

    public RegistrikanneDetailneType() {
    }

    public RegistrikanneDetailneType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           org.apache.axis.types.URI mtrlink,
           ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht[] tegevuskoht) {
        super(
            tyyp,
            regnr,
            valdkond,
            tegevusala,
            tegevusalakood,
            registreerimisekp,
            mtrlink);
        this.tegevuskoht = tegevuskoht;
    }


    /**
     * Gets the tegevuskoht value for this RegistrikanneDetailneType.
     * 
     * @return tegevuskoht
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht[] getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this RegistrikanneDetailneType.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht[] tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }

    public ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht getTegevuskoht(int i) {
        return this.tegevuskoht[i];
    }

    public void setTegevuskoht(int i, ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht _value) {
        this.tegevuskoht[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneType)) return false;
        RegistrikanneDetailneType other = (RegistrikanneDetailneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tegevuskoht==null && other.getTegevuskoht()==null) || 
             (this.tegevuskoht!=null &&
              java.util.Arrays.equals(this.tegevuskoht, other.getTegevuskoht())));
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
        if (getTegevuskoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskoht(), i);
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
        new org.apache.axis.description.TypeDesc(RegistrikanneDetailneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevuskoht");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tegevuskoht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registrikanneDetailneType>tegevuskoht"));
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
