/**
 * FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "kliima";
    public static final java.lang.String _value2 = "tuletorje";
    public static final java.lang.String _value3 = "kliima,tuletorje";
    public static final FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik value1 = new FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik(_value1);
    public static final FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik value2 = new FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik(_value2);
    public static final FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik value3 = new FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik(_value3);
    public java.lang.String getValue() { return _value_;}
    public static FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik enumeration = (FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>fokaHooldajaVastus>foka_hooldaja>seotud_ettevotted>ettevote>loa_liik"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
