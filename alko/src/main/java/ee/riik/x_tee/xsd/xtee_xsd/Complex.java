/**
 * Complex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.x_tee.xsd.xtee_xsd;

public class Complex  implements java.io.Serializable {
    /* Viide osapäringule */
    private ee.riik.x_tee.xsd.xtee_xsd.ComplexSuboperation[] suboperation;

    /* Kahe osapäringu järgnevus */
    private ee.riik.x_tee.xsd.xtee_xsd.ComplexArc[] arc;

    /* Parameetri väärtustamine */
    private ee.riik.x_tee.xsd.xtee_xsd.ComplexSubstitution[] substitution;

    private org.w3.www._1999.xlink.Type type;  // attribute

    public Complex() {
    }

    public Complex(
           ee.riik.x_tee.xsd.xtee_xsd.ComplexSuboperation[] suboperation,
           ee.riik.x_tee.xsd.xtee_xsd.ComplexArc[] arc,
           ee.riik.x_tee.xsd.xtee_xsd.ComplexSubstitution[] substitution,
           org.w3.www._1999.xlink.Type type) {
           this.suboperation = suboperation;
           this.arc = arc;
           this.substitution = substitution;
           this.type = type;
    }


    /**
     * Gets the suboperation value for this Complex.
     * 
     * @return suboperation   * Viide osapäringule
     */
    public ee.riik.x_tee.xsd.xtee_xsd.ComplexSuboperation[] getSuboperation() {
        return suboperation;
    }


    /**
     * Sets the suboperation value for this Complex.
     * 
     * @param suboperation   * Viide osapäringule
     */
    public void setSuboperation(ee.riik.x_tee.xsd.xtee_xsd.ComplexSuboperation[] suboperation) {
        this.suboperation = suboperation;
    }

    public ee.riik.x_tee.xsd.xtee_xsd.ComplexSuboperation getSuboperation(int i) {
        return this.suboperation[i];
    }

    public void setSuboperation(int i, ee.riik.x_tee.xsd.xtee_xsd.ComplexSuboperation _value) {
        this.suboperation[i] = _value;
    }


    /**
     * Gets the arc value for this Complex.
     * 
     * @return arc   * Kahe osapäringu järgnevus
     */
    public ee.riik.x_tee.xsd.xtee_xsd.ComplexArc[] getArc() {
        return arc;
    }


    /**
     * Sets the arc value for this Complex.
     * 
     * @param arc   * Kahe osapäringu järgnevus
     */
    public void setArc(ee.riik.x_tee.xsd.xtee_xsd.ComplexArc[] arc) {
        this.arc = arc;
    }

    public ee.riik.x_tee.xsd.xtee_xsd.ComplexArc getArc(int i) {
        return this.arc[i];
    }

    public void setArc(int i, ee.riik.x_tee.xsd.xtee_xsd.ComplexArc _value) {
        this.arc[i] = _value;
    }


    /**
     * Gets the substitution value for this Complex.
     * 
     * @return substitution   * Parameetri väärtustamine
     */
    public ee.riik.x_tee.xsd.xtee_xsd.ComplexSubstitution[] getSubstitution() {
        return substitution;
    }


    /**
     * Sets the substitution value for this Complex.
     * 
     * @param substitution   * Parameetri väärtustamine
     */
    public void setSubstitution(ee.riik.x_tee.xsd.xtee_xsd.ComplexSubstitution[] substitution) {
        this.substitution = substitution;
    }

    public ee.riik.x_tee.xsd.xtee_xsd.ComplexSubstitution getSubstitution(int i) {
        return this.substitution[i];
    }

    public void setSubstitution(int i, ee.riik.x_tee.xsd.xtee_xsd.ComplexSubstitution _value) {
        this.substitution[i] = _value;
    }


    /**
     * Gets the type value for this Complex.
     * 
     * @return type
     */
    public org.w3.www._1999.xlink.Type getType() {
        return type;
    }


    /**
     * Sets the type value for this Complex.
     * 
     * @param type
     */
    public void setType(org.w3.www._1999.xlink.Type type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Complex)) return false;
        Complex other = (Complex) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suboperation==null && other.getSuboperation()==null) || 
             (this.suboperation!=null &&
              java.util.Arrays.equals(this.suboperation, other.getSuboperation()))) &&
            ((this.arc==null && other.getArc()==null) || 
             (this.arc!=null &&
              java.util.Arrays.equals(this.arc, other.getArc()))) &&
            ((this.substitution==null && other.getSubstitution()==null) || 
             (this.substitution!=null &&
              java.util.Arrays.equals(this.substitution, other.getSubstitution()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getSuboperation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuboperation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuboperation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubstitution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubstitution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubstitution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Complex.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", ">complex"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">type"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suboperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suboperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", ">>complex>suboperation"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", ">>complex>arc"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substitution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "substitution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", ">>complex>substitution"));
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
