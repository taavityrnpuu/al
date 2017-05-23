/**
 * Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package org.w3.www._1999.xlink;

public class Type implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Type(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _simple = new org.apache.axis.types.NMToken("simple");
    public static final org.apache.axis.types.NMToken _extended = new org.apache.axis.types.NMToken("extended");
    public static final org.apache.axis.types.NMToken _locator = new org.apache.axis.types.NMToken("locator");
    public static final org.apache.axis.types.NMToken _arc = new org.apache.axis.types.NMToken("arc");
    public static final org.apache.axis.types.NMToken _resource = new org.apache.axis.types.NMToken("resource");
    public static final org.apache.axis.types.NMToken _title = new org.apache.axis.types.NMToken("title");
    public static final org.apache.axis.types.NMToken _none = new org.apache.axis.types.NMToken("none");
    public static final Type simple = new Type(_simple);
    public static final Type extended = new Type(_extended);
    public static final Type locator = new Type(_locator);
    public static final Type arc = new Type(_arc);
    public static final Type resource = new Type(_resource);
    public static final Type title = new Type(_title);
    public static final Type none = new Type(_none);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static Type fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        Type enumeration = (Type)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Type fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(Type.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
