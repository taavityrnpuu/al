/**
 * X_sideliik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class X_sideliik implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected X_sideliik(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EMAIL = "EMAIL";
    public static final java.lang.String _FAX = "FAX";
    public static final java.lang.String _WWW = "WWW";
    public static final java.lang.String _MOB = "MOB";
    public static final java.lang.String _MOD = "MOD";
    public static final java.lang.String _MUU = "MUU";
    public static final java.lang.String _TEL = "TEL";
    public static final java.lang.String _TELEX = "TELEX";
    public static final X_sideliik EMAIL = new X_sideliik(_EMAIL);
    public static final X_sideliik FAX = new X_sideliik(_FAX);
    public static final X_sideliik WWW = new X_sideliik(_WWW);
    public static final X_sideliik MOB = new X_sideliik(_MOB);
    public static final X_sideliik MOD = new X_sideliik(_MOD);
    public static final X_sideliik MUU = new X_sideliik(_MUU);
    public static final X_sideliik TEL = new X_sideliik(_TEL);
    public static final X_sideliik TELEX = new X_sideliik(_TELEX);
    public java.lang.String getValue() { return _value_;}
    public static X_sideliik fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        X_sideliik enumeration = (X_sideliik)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static X_sideliik fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(X_sideliik.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_sideliik"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
