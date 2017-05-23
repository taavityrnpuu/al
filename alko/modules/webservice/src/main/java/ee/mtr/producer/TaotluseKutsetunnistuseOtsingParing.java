/**
 * TaotluseKutsetunnistuseOtsingParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseKutsetunnistuseOtsingParing  implements java.io.Serializable {
    private java.lang.String registrinumberVoiIsikukood;

    public TaotluseKutsetunnistuseOtsingParing() {
    }

    public TaotluseKutsetunnistuseOtsingParing(
           java.lang.String registrinumberVoiIsikukood) {
           this.registrinumberVoiIsikukood = registrinumberVoiIsikukood;
    }


    /**
     * Gets the registrinumberVoiIsikukood value for this TaotluseKutsetunnistuseOtsingParing.
     * 
     * @return registrinumberVoiIsikukood
     */
    public java.lang.String getRegistrinumberVoiIsikukood() {
        return registrinumberVoiIsikukood;
    }


    /**
     * Sets the registrinumberVoiIsikukood value for this TaotluseKutsetunnistuseOtsingParing.
     * 
     * @param registrinumberVoiIsikukood
     */
    public void setRegistrinumberVoiIsikukood(java.lang.String registrinumberVoiIsikukood) {
        this.registrinumberVoiIsikukood = registrinumberVoiIsikukood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseKutsetunnistuseOtsingParing)) return false;
        TaotluseKutsetunnistuseOtsingParing other = (TaotluseKutsetunnistuseOtsingParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrinumberVoiIsikukood==null && other.getRegistrinumberVoiIsikukood()==null) || 
             (this.registrinumberVoiIsikukood!=null &&
              this.registrinumberVoiIsikukood.equals(other.getRegistrinumberVoiIsikukood())));
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
        if (getRegistrinumberVoiIsikukood() != null) {
            _hashCode += getRegistrinumberVoiIsikukood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
