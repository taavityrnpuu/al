/**
 * RegistriKanneMIKOTypeEttekirjutus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class RegistriKanneMIKOTypeEttekirjutus  implements java.io.Serializable {
    private java.util.Date tehtudkp;

    private java.util.Date taitmisekp;

    private java.util.Date kustutatudkp;

    private java.lang.String sisu;

    public RegistriKanneMIKOTypeEttekirjutus() {
    }

    public RegistriKanneMIKOTypeEttekirjutus(
           java.util.Date tehtudkp,
           java.util.Date taitmisekp,
           java.util.Date kustutatudkp,
           java.lang.String sisu) {
           this.tehtudkp = tehtudkp;
           this.taitmisekp = taitmisekp;
           this.kustutatudkp = kustutatudkp;
           this.sisu = sisu;
    }


    /**
     * Gets the tehtudkp value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @return tehtudkp
     */
    public java.util.Date getTehtudkp() {
        return tehtudkp;
    }


    /**
     * Sets the tehtudkp value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @param tehtudkp
     */
    public void setTehtudkp(java.util.Date tehtudkp) {
        this.tehtudkp = tehtudkp;
    }


    /**
     * Gets the taitmisekp value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @return taitmisekp
     */
    public java.util.Date getTaitmisekp() {
        return taitmisekp;
    }


    /**
     * Sets the taitmisekp value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @param taitmisekp
     */
    public void setTaitmisekp(java.util.Date taitmisekp) {
        this.taitmisekp = taitmisekp;
    }


    /**
     * Gets the kustutatudkp value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @return kustutatudkp
     */
    public java.util.Date getKustutatudkp() {
        return kustutatudkp;
    }


    /**
     * Sets the kustutatudkp value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @param kustutatudkp
     */
    public void setKustutatudkp(java.util.Date kustutatudkp) {
        this.kustutatudkp = kustutatudkp;
    }


    /**
     * Gets the sisu value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this RegistriKanneMIKOTypeEttekirjutus.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistriKanneMIKOTypeEttekirjutus)) return false;
        RegistriKanneMIKOTypeEttekirjutus other = (RegistriKanneMIKOTypeEttekirjutus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tehtudkp==null && other.getTehtudkp()==null) || 
             (this.tehtudkp!=null &&
              this.tehtudkp.equals(other.getTehtudkp()))) &&
            ((this.taitmisekp==null && other.getTaitmisekp()==null) || 
             (this.taitmisekp!=null &&
              this.taitmisekp.equals(other.getTaitmisekp()))) &&
            ((this.kustutatudkp==null && other.getKustutatudkp()==null) || 
             (this.kustutatudkp!=null &&
              this.kustutatudkp.equals(other.getKustutatudkp()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu())));
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
        if (getTehtudkp() != null) {
            _hashCode += getTehtudkp().hashCode();
        }
        if (getTaitmisekp() != null) {
            _hashCode += getTaitmisekp().hashCode();
        }
        if (getKustutatudkp() != null) {
            _hashCode += getKustutatudkp().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistriKanneMIKOTypeEttekirjutus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>ettekirjutus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tehtudkp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tehtudkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taitmisekp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taitmisekp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kustutatudkp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kustutatudkp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sisu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sisu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
