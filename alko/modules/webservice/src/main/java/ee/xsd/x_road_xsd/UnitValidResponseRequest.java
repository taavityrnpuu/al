/**
 * UnitValidResponseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UnitValidResponseRequest  implements java.io.Serializable {
    private java.lang.String unitCode;

    public UnitValidResponseRequest() {
    }

    public UnitValidResponseRequest(
           java.lang.String unitCode) {
           this.unitCode = unitCode;
    }


    /**
     * Gets the unitCode value for this UnitValidResponseRequest.
     * 
     * @return unitCode
     */
    public java.lang.String getUnitCode() {
        return unitCode;
    }


    /**
     * Sets the unitCode value for this UnitValidResponseRequest.
     * 
     * @param unitCode
     */
    public void setUnitCode(java.lang.String unitCode) {
        this.unitCode = unitCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitValidResponseRequest)) return false;
        UnitValidResponseRequest other = (UnitValidResponseRequest) obj;
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
              this.unitCode.equals(other.getUnitCode())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
