/**
 * TaotluseEttevotjaOtsingParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseEttevotjaOtsingParing  implements java.io.Serializable {
    private java.lang.String koodVoiNimeosa;

    public TaotluseEttevotjaOtsingParing() {
    }

    public TaotluseEttevotjaOtsingParing(
           java.lang.String koodVoiNimeosa) {
           this.koodVoiNimeosa = koodVoiNimeosa;
    }


    /**
     * Gets the koodVoiNimeosa value for this TaotluseEttevotjaOtsingParing.
     * 
     * @return koodVoiNimeosa
     */
    public java.lang.String getKoodVoiNimeosa() {
        return koodVoiNimeosa;
    }


    /**
     * Sets the koodVoiNimeosa value for this TaotluseEttevotjaOtsingParing.
     * 
     * @param koodVoiNimeosa
     */
    public void setKoodVoiNimeosa(java.lang.String koodVoiNimeosa) {
        this.koodVoiNimeosa = koodVoiNimeosa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseEttevotjaOtsingParing)) return false;
        TaotluseEttevotjaOtsingParing other = (TaotluseEttevotjaOtsingParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.koodVoiNimeosa==null && other.getKoodVoiNimeosa()==null) || 
             (this.koodVoiNimeosa!=null &&
              this.koodVoiNimeosa.equals(other.getKoodVoiNimeosa())));
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
        if (getKoodVoiNimeosa() != null) {
            _hashCode += getKoodVoiNimeosa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
