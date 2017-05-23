/**
 * RegistriKanneMIKOTypeTegevuskoht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistriKanneMIKOTypeTegevuskoht  extends ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType  implements java.io.Serializable {
    private ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType[] myygikoht;

    public RegistriKanneMIKOTypeTegevuskoht() {
    }

    public RegistriKanneMIKOTypeTegevuskoht(
           java.lang.String liik,
           java.lang.String nimetus,
           ee.riik.xtee.mtr.producers.producer.mtr.AadressType aadress,
           java.util.Date alguskp,
           java.util.Date loppkp,
           ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType[] myygikoht) {
        super(
            liik,
            nimetus,
            aadress,
            alguskp,
            loppkp);
        this.myygikoht = myygikoht;
    }


    /**
     * Gets the myygikoht value for this RegistriKanneMIKOTypeTegevuskoht.
     * 
     * @return myygikoht
     */
    public ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType[] getMyygikoht() {
        return myygikoht;
    }


    /**
     * Sets the myygikoht value for this RegistriKanneMIKOTypeTegevuskoht.
     * 
     * @param myygikoht
     */
    public void setMyygikoht(ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType[] myygikoht) {
        this.myygikoht = myygikoht;
    }

    public ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType getMyygikoht(int i) {
        return this.myygikoht[i];
    }

    public void setMyygikoht(int i, ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType _value) {
        this.myygikoht[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistriKanneMIKOTypeTegevuskoht)) return false;
        RegistriKanneMIKOTypeTegevuskoht other = (RegistriKanneMIKOTypeTegevuskoht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.myygikoht==null && other.getMyygikoht()==null) || 
             (this.myygikoht!=null &&
              java.util.Arrays.equals(this.myygikoht, other.getMyygikoht())));
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
        if (getMyygikoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMyygikoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMyygikoht(), i);
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
        new org.apache.axis.description.TypeDesc(RegistriKanneMIKOTypeTegevuskoht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>tegevuskoht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myygikoht");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myygikoht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevuskohtType"));
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
