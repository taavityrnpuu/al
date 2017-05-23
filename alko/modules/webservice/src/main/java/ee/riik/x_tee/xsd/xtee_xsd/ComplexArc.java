/**
 * ComplexArc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.x_tee.xsd.xtee_xsd;

public class ComplexArc  implements java.io.Serializable {
    private org.w3.www._1999.xlink.Type type;  // attribute

    private java.lang.String title;  // attribute

    private org.apache.axis.types.URI from;  // attribute

    private org.apache.axis.types.URI to;  // attribute

    private org.w3.www._1999.xlink.Show show;  // attribute

    private org.w3.www._1999.xlink.Actuate actuate;  // attribute

    public ComplexArc() {
    }

    public ComplexArc(
           org.w3.www._1999.xlink.Type type,
           java.lang.String title,
           org.apache.axis.types.URI from,
           org.apache.axis.types.URI to,
           org.w3.www._1999.xlink.Show show,
           org.w3.www._1999.xlink.Actuate actuate) {
           this.type = type;
           this.title = title;
           this.from = from;
           this.to = to;
           this.show = show;
           this.actuate = actuate;
    }


    /**
     * Gets the type value for this ComplexArc.
     * 
     * @return type
     */
    public org.w3.www._1999.xlink.Type getType() {
        return type;
    }


    /**
     * Sets the type value for this ComplexArc.
     * 
     * @param type
     */
    public void setType(org.w3.www._1999.xlink.Type type) {
        this.type = type;
    }


    /**
     * Gets the title value for this ComplexArc.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ComplexArc.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the from value for this ComplexArc.
     * 
     * @return from
     */
    public org.apache.axis.types.URI getFrom() {
        return from;
    }


    /**
     * Sets the from value for this ComplexArc.
     * 
     * @param from
     */
    public void setFrom(org.apache.axis.types.URI from) {
        this.from = from;
    }


    /**
     * Gets the to value for this ComplexArc.
     * 
     * @return to
     */
    public org.apache.axis.types.URI getTo() {
        return to;
    }


    /**
     * Sets the to value for this ComplexArc.
     * 
     * @param to
     */
    public void setTo(org.apache.axis.types.URI to) {
        this.to = to;
    }


    /**
     * Gets the show value for this ComplexArc.
     * 
     * @return show
     */
    public org.w3.www._1999.xlink.Show getShow() {
        return show;
    }


    /**
     * Sets the show value for this ComplexArc.
     * 
     * @param show
     */
    public void setShow(org.w3.www._1999.xlink.Show show) {
        this.show = show;
    }


    /**
     * Gets the actuate value for this ComplexArc.
     * 
     * @return actuate
     */
    public org.w3.www._1999.xlink.Actuate getActuate() {
        return actuate;
    }


    /**
     * Sets the actuate value for this ComplexArc.
     * 
     * @param actuate
     */
    public void setActuate(org.w3.www._1999.xlink.Actuate actuate) {
        this.actuate = actuate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexArc)) return false;
        ComplexArc other = (ComplexArc) obj;
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
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.show==null && other.getShow()==null) || 
             (this.show!=null &&
              this.show.equals(other.getShow()))) &&
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getShow() != null) {
            _hashCode += getShow().hashCode();
        }
        if (getActuate() != null) {
            _hashCode += getActuate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplexArc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", ">>complex>arc"));
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
        attrField.setFieldName("from");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "from"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("to");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "to"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("show");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "show"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">show"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actuate");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "actuate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">actuate"));
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
