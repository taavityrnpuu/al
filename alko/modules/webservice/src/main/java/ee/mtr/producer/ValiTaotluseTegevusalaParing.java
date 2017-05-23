/**
 * ValiTaotluseTegevusalaParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class ValiTaotluseTegevusalaParing  implements java.io.Serializable {
    private java.lang.String tyyp;

    public ValiTaotluseTegevusalaParing() {
    }

    public ValiTaotluseTegevusalaParing(
           java.lang.String tyyp) {
           this.tyyp = tyyp;
    }


    /**
     * Gets the tyyp value for this ValiTaotluseTegevusalaParing.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this ValiTaotluseTegevusalaParing.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValiTaotluseTegevusalaParing)) return false;
        ValiTaotluseTegevusalaParing other = (ValiTaotluseTegevusalaParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp())));
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
