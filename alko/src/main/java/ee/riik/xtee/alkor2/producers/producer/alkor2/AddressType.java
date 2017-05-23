/**
 * AddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class AddressType  implements java.io.Serializable {
    private ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType country;

    private java.lang.String district;

    private java.lang.String orgUnit;

    private java.lang.String town;

    private java.lang.String postalIndex;

    private java.lang.String street;

    private java.lang.String house;

    private java.lang.String appartment;

    public AddressType() {
    }

    public AddressType(
           ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType country,
           java.lang.String district,
           java.lang.String orgUnit,
           java.lang.String town,
           java.lang.String postalIndex,
           java.lang.String street,
           java.lang.String house,
           java.lang.String appartment) {
           this.country = country;
           this.district = district;
           this.orgUnit = orgUnit;
           this.town = town;
           this.postalIndex = postalIndex;
           this.street = street;
           this.house = house;
           this.appartment = appartment;
    }


    /**
     * Gets the country value for this AddressType.
     * 
     * @return country
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AddressType.
     * 
     * @param country
     */
    public void setCountry(ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType country) {
        this.country = country;
    }


    /**
     * Gets the district value for this AddressType.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this AddressType.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the orgUnit value for this AddressType.
     * 
     * @return orgUnit
     */
    public java.lang.String getOrgUnit() {
        return orgUnit;
    }


    /**
     * Sets the orgUnit value for this AddressType.
     * 
     * @param orgUnit
     */
    public void setOrgUnit(java.lang.String orgUnit) {
        this.orgUnit = orgUnit;
    }


    /**
     * Gets the town value for this AddressType.
     * 
     * @return town
     */
    public java.lang.String getTown() {
        return town;
    }


    /**
     * Sets the town value for this AddressType.
     * 
     * @param town
     */
    public void setTown(java.lang.String town) {
        this.town = town;
    }


    /**
     * Gets the postalIndex value for this AddressType.
     * 
     * @return postalIndex
     */
    public java.lang.String getPostalIndex() {
        return postalIndex;
    }


    /**
     * Sets the postalIndex value for this AddressType.
     * 
     * @param postalIndex
     */
    public void setPostalIndex(java.lang.String postalIndex) {
        this.postalIndex = postalIndex;
    }


    /**
     * Gets the street value for this AddressType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this AddressType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house value for this AddressType.
     * 
     * @return house
     */
    public java.lang.String getHouse() {
        return house;
    }


    /**
     * Sets the house value for this AddressType.
     * 
     * @param house
     */
    public void setHouse(java.lang.String house) {
        this.house = house;
    }


    /**
     * Gets the appartment value for this AddressType.
     * 
     * @return appartment
     */
    public java.lang.String getAppartment() {
        return appartment;
    }


    /**
     * Sets the appartment value for this AddressType.
     * 
     * @param appartment
     */
    public void setAppartment(java.lang.String appartment) {
        this.appartment = appartment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressType)) return false;
        AddressType other = (AddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.orgUnit==null && other.getOrgUnit()==null) || 
             (this.orgUnit!=null &&
              this.orgUnit.equals(other.getOrgUnit()))) &&
            ((this.town==null && other.getTown()==null) || 
             (this.town!=null &&
              this.town.equals(other.getTown()))) &&
            ((this.postalIndex==null && other.getPostalIndex()==null) || 
             (this.postalIndex!=null &&
              this.postalIndex.equals(other.getPostalIndex()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.house==null && other.getHouse()==null) || 
             (this.house!=null &&
              this.house.equals(other.getHouse()))) &&
            ((this.appartment==null && other.getAppartment()==null) || 
             (this.appartment!=null &&
              this.appartment.equals(other.getAppartment())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getOrgUnit() != null) {
            _hashCode += getOrgUnit().hashCode();
        }
        if (getTown() != null) {
            _hashCode += getTown().hashCode();
        }
        if (getPostalIndex() != null) {
            _hashCode += getPostalIndex().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouse() != null) {
            _hashCode += getHouse().hashCode();
        }
        if (getAppartment() != null) {
            _hashCode += getAppartment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddressType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CountryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("town");
        elemField.setXmlName(new javax.xml.namespace.QName("", "town"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house");
        elemField.setXmlName(new javax.xml.namespace.QName("", "house"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appartment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appartment"));
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
