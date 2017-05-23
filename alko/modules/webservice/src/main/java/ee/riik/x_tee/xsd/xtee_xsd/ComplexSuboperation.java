/**
 * ComplexSuboperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.x_tee.xsd.xtee_xsd;

public class ComplexSuboperation  implements java.io.Serializable {
    private org.w3.www._1999.xlink.Type type;  // attribute

    private java.lang.String title;  // attribute

    private org.apache.axis.types.URI href;  // attribute

    private org.apache.axis.types.NMToken label;  // attribute

    private java.lang.String actuate;  // attribute

    public ComplexSuboperation() {
    }

    public ComplexSuboperation(
           org.w3.www._1999.xlink.Type type,
           java.lang.String title,
           org.apache.axis.types.URI href,
           org.apache.axis.types.NMToken label,
           java.lang.String actuate) {
           this.type = type;
           this.title = title;
           this.href = href;
           this.label = label;
           this.actuate = actuate;
    }


    /**
     * Gets the type value for this ComplexSuboperation.
     * 
     * @return type
     */
    public org.w3.www._1999.xlink.Type getType() {
        return type;
    }


    /**
     * Sets the type value for this ComplexSuboperation.
     * 
     * @param type
     */
    public void setType(org.w3.www._1999.xlink.Type type) {
        this.type = type;
    }


    /**
     * Gets the title value for this ComplexSuboperation.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ComplexSuboperation.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the href value for this ComplexSuboperation.
     * 
     * @return href
     */
    public org.apache.axis.types.URI getHref() {
        return href;
    }


    /**
     * Sets the href value for this ComplexSuboperation.
     * 
     * @param href
     */
    public void setHref(org.apache.axis.types.URI href) {
        this.href = href;
    }


    /**
     * Gets the label value for this ComplexSuboperation.
     * 
     * @return label
     */
    public org.apache.axis.types.NMToken getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ComplexSuboperation.
     * 
     * @param label
     */
    public void setLabel(org.apache.axis.types.NMToken label) {
        this.label = label;
    }


    /**
     * Gets the actuate value for this ComplexSuboperation.
     * 
     * @return actuate
     */
    public java.lang.String getActuate() {
        return actuate;
    }


    /**
     * Sets the actuate value for this ComplexSuboperation.
     * 
     * @param actuate
     */
    public void setActuate(java.lang.String actuate) {
        this.actuate = actuate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexSuboperation)) return false;
        ComplexSuboperation other = (ComplexSuboperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.href==null && other.getHref()==null) || 
             (this.href!=null &&
              this.href.equals(other.getHref()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.actuate==null && other.getActuate()==null) || 
             (this.actuate!=null &&
              this.actuate.equals(other.getActuate())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getHref() != null) {
            _hashCode += getHref().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getActuate() != null) {
            _hashCode += getActuate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplexSuboperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", ">>complex>suboperation"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("title");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("href");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("label");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "label"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NMTOKEN"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actuate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "actuate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
