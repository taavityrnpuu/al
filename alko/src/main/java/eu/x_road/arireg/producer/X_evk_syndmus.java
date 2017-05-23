/**
 * X_evk_syndmus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class X_evk_syndmus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected X_evk_syndmus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ESMAREG = "ESMAREG";
    public static final java.lang.String _KAPMUUT = "KAPMUUT";
    public static final java.lang.String _POHMUUT = "POHMUUT";
    public static final java.lang.String _ARINMUUT = "ARINMUUT";
    public static final java.lang.String _ETVMUUT = "ETVMUUT";
    public static final java.lang.String _YHIN = "YHIN";
    public static final java.lang.String _JAGUN = "JAGUN";
    public static final java.lang.String _REGKUST = "REGKUST";
    public static final X_evk_syndmus ESMAREG = new X_evk_syndmus(_ESMAREG);
    public static final X_evk_syndmus KAPMUUT = new X_evk_syndmus(_KAPMUUT);
    public static final X_evk_syndmus POHMUUT = new X_evk_syndmus(_POHMUUT);
    public static final X_evk_syndmus ARINMUUT = new X_evk_syndmus(_ARINMUUT);
    public static final X_evk_syndmus ETVMUUT = new X_evk_syndmus(_ETVMUUT);
    public static final X_evk_syndmus YHIN = new X_evk_syndmus(_YHIN);
    public static final X_evk_syndmus JAGUN = new X_evk_syndmus(_JAGUN);
    public static final X_evk_syndmus REGKUST = new X_evk_syndmus(_REGKUST);
    public java.lang.String getValue() { return _value_;}
    public static X_evk_syndmus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        X_evk_syndmus enumeration = (X_evk_syndmus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static X_evk_syndmus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(X_evk_syndmus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_evk_syndmus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
