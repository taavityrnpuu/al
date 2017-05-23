/**
 * UnitRepresentResponseResponseItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UnitRepresentResponseResponseItem  implements java.io.Serializable {
    private java.lang.String unitCode;

    private java.lang.String name;

    public UnitRepresentResponseResponseItem() {
    }

    public UnitRepresentResponseResponseItem(
           java.lang.String unitCode,
           java.lang.String name) {
           this.unitCode = unitCode;
           this.name = name;
    }


    /**
     * Gets the unitCode value for this UnitRepresentResponseResponseItem.
     * 
     * @return unitCode
     */
    public java.lang.String getUnitCode() {
        return unitCode;
    }


    /**
     * Sets the unitCode value for this UnitRepresentResponseResponseItem.
     * 
     * @param unitCode
     */
    public void setUnitCode(java.lang.String unitCode) {
        this.unitCode = unitCode;
    }


    /**
     * Gets the name value for this UnitRepresentResponseResponseItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UnitRepresentResponseResponseItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitRepresentResponseResponseItem)) return false;
        UnitRepresentResponseResponseItem other = (UnitRepresentResponseResponseItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unitCode==null && other.getUnitCode()==null) || 
             (this.unitCode!=null &&
              this.unitCode.equals(other.getUnitCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getUnitCode() != null) {
            _hashCode += getUnitCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
