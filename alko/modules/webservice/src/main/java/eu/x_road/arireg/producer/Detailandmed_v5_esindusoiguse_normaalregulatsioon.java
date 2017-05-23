/**
 * Detailandmed_v5_esindusoiguse_normaalregulatsioon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_esindusoiguse_normaalregulatsioon  implements java.io.Serializable {
    private java.lang.String roll;

    private java.lang.String sisu;

    public Detailandmed_v5_esindusoiguse_normaalregulatsioon() {
    }

    public Detailandmed_v5_esindusoiguse_normaalregulatsioon(
           java.lang.String roll,
           java.lang.String sisu) {
           this.roll = roll;
           this.sisu = sisu;
    }


    /**
     * Gets the roll value for this Detailandmed_v5_esindusoiguse_normaalregulatsioon.
     * 
     * @return roll
     */
    public java.lang.String getRoll() {
        return roll;
    }


    /**
     * Sets the roll value for this Detailandmed_v5_esindusoiguse_normaalregulatsioon.
     * 
     * @param roll
     */
    public void setRoll(java.lang.String roll) {
        this.roll = roll;
    }


    /**
     * Gets the sisu value for this Detailandmed_v5_esindusoiguse_normaalregulatsioon.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this Detailandmed_v5_esindusoiguse_normaalregulatsioon.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_esindusoiguse_normaalregulatsioon)) return false;
        Detailandmed_v5_esindusoiguse_normaalregulatsioon other = (Detailandmed_v5_esindusoiguse_normaalregulatsioon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roll==null && other.getRoll()==null) || 
             (this.roll!=null &&
              this.roll.equals(other.getRoll()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu())));
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
        if (getRoll() != null) {
            _hashCode += getRoll().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
