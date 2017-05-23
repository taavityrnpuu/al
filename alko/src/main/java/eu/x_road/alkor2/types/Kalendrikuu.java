/**
 * Kalendrikuu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2.types;

public class Kalendrikuu implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    public Kalendrikuu(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "1";
    public static final java.lang.String _value2 = "2";
    public static final java.lang.String _value3 = "3";
    public static final java.lang.String _value4 = "4";
    public static final java.lang.String _value5 = "5";
    public static final java.lang.String _value6 = "6";
    public static final java.lang.String _value7 = "7";
    public static final java.lang.String _value8 = "8";
    public static final java.lang.String _value9 = "9";
    public static final java.lang.String _value10 = "10";
    public static final java.lang.String _value11 = "11";
    public static final java.lang.String _value12 = "12";
    public static final Kalendrikuu value1 = new Kalendrikuu(_value1);
    public static final Kalendrikuu value2 = new Kalendrikuu(_value2);
    public static final Kalendrikuu value3 = new Kalendrikuu(_value3);
    public static final Kalendrikuu value4 = new Kalendrikuu(_value4);
    public static final Kalendrikuu value5 = new Kalendrikuu(_value5);
    public static final Kalendrikuu value6 = new Kalendrikuu(_value6);
    public static final Kalendrikuu value7 = new Kalendrikuu(_value7);
    public static final Kalendrikuu value8 = new Kalendrikuu(_value8);
    public static final Kalendrikuu value9 = new Kalendrikuu(_value9);
    public static final Kalendrikuu value10 = new Kalendrikuu(_value10);
    public static final Kalendrikuu value11 = new Kalendrikuu(_value11);
    public static final Kalendrikuu value12 = new Kalendrikuu(_value12);
    public java.lang.String getValue() { return _value_;}
    public static Kalendrikuu fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Kalendrikuu enumeration = (Kalendrikuu)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Kalendrikuu fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Kalendrikuu.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "kalendrikuu"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
