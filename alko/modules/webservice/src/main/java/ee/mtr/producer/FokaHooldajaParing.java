/**
 * FokaHooldajaParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajaParing  implements java.io.Serializable {
    private java.lang.String ikood;

    public FokaHooldajaParing() {
    }

    public FokaHooldajaParing(
           java.lang.String ikood) {
           this.ikood = ikood;
    }


    /**
     * Gets the ikood value for this FokaHooldajaParing.
     * 
     * @return ikood
     */
    public java.lang.String getIkood() {
        return ikood;
    }


    /**
     * Sets the ikood value for this FokaHooldajaParing.
     * 
     * @param ikood
     */
    public void setIkood(java.lang.String ikood) {
        this.ikood = ikood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FokaHooldajaParing)) return false;
        FokaHooldajaParing other = (FokaHooldajaParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ikood==null && other.getIkood()==null) || 
             (this.ikood!=null &&
              this.ikood.equals(other.getIkood())));
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
        if (getIkood() != null) {
            _hashCode += getIkood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
