/**
 * TaotlusePadevustunnistuseOtsingParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotlusePadevustunnistuseOtsingParing  implements java.io.Serializable {
    private java.lang.String isikukood;

    public TaotlusePadevustunnistuseOtsingParing() {
    }

    public TaotlusePadevustunnistuseOtsingParing(
           java.lang.String isikukood) {
           this.isikukood = isikukood;
    }


    /**
     * Gets the isikukood value for this TaotlusePadevustunnistuseOtsingParing.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this TaotlusePadevustunnistuseOtsingParing.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotlusePadevustunnistuseOtsingParing)) return false;
        TaotlusePadevustunnistuseOtsingParing other = (TaotlusePadevustunnistuseOtsingParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
