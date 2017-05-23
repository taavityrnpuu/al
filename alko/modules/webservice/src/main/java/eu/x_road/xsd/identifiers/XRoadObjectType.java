/**
 * XRoadObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.xsd.identifiers;

public class XRoadObjectType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected XRoadObjectType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MEMBER = "MEMBER";
    public static final java.lang.String _SUBSYSTEM = "SUBSYSTEM";
    public static final java.lang.String _SERVER = "SERVER";
    public static final java.lang.String _GLOBALGROUP = "GLOBALGROUP";
    public static final java.lang.String _LOCALGROUP = "LOCALGROUP";
    public static final java.lang.String _SECURITYCATEGORY = "SECURITYCATEGORY";
    public static final java.lang.String _SERVICE = "SERVICE";
    public static final java.lang.String _CENTRALSERVICE = "CENTRALSERVICE";
    public static final XRoadObjectType MEMBER = new XRoadObjectType(_MEMBER);
    public static final XRoadObjectType SUBSYSTEM = new XRoadObjectType(_SUBSYSTEM);
    public static final XRoadObjectType SERVER = new XRoadObjectType(_SERVER);
    public static final XRoadObjectType GLOBALGROUP = new XRoadObjectType(_GLOBALGROUP);
    public static final XRoadObjectType LOCALGROUP = new XRoadObjectType(_LOCALGROUP);
    public static final XRoadObjectType SECURITYCATEGORY = new XRoadObjectType(_SECURITYCATEGORY);
    public static final XRoadObjectType SERVICE = new XRoadObjectType(_SERVICE);
    public static final XRoadObjectType CENTRALSERVICE = new XRoadObjectType(_CENTRALSERVICE);
    public java.lang.String getValue() { return _value_;}
    public static XRoadObjectType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        XRoadObjectType enumeration = (XRoadObjectType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static XRoadObjectType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XRoadObjectType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadObjectType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
