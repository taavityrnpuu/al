/**
 * Evk_kapital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Evk_kapital  implements java.io.Serializable {
    /* kapitali suurus */
    private float kapitali_suurus;

    /* kapitali_valuuta_tahis */
    private java.lang.String kapitali_valuuta_tahis;

    public Evk_kapital() {
    }

    public Evk_kapital(
           float kapitali_suurus,
           java.lang.String kapitali_valuuta_tahis) {
           this.kapitali_suurus = kapitali_suurus;
           this.kapitali_valuuta_tahis = kapitali_valuuta_tahis;
    }


    /**
     * Gets the kapitali_suurus value for this Evk_kapital.
     * 
     * @return kapitali_suurus   * kapitali suurus
     */
    public float getKapitali_suurus() {
        return kapitali_suurus;
    }


    /**
     * Sets the kapitali_suurus value for this Evk_kapital.
     * 
     * @param kapitali_suurus   * kapitali suurus
     */
    public void setKapitali_suurus(float kapitali_suurus) {
        this.kapitali_suurus = kapitali_suurus;
    }


    /**
     * Gets the kapitali_valuuta_tahis value for this Evk_kapital.
     * 
     * @return kapitali_valuuta_tahis   * kapitali_valuuta_tahis
     */
    public java.lang.String getKapitali_valuuta_tahis() {
        return kapitali_valuuta_tahis;
    }


    /**
     * Sets the kapitali_valuuta_tahis value for this Evk_kapital.
     * 
     * @param kapitali_valuuta_tahis   * kapitali_valuuta_tahis
     */
    public void setKapitali_valuuta_tahis(java.lang.String kapitali_valuuta_tahis) {
        this.kapitali_valuuta_tahis = kapitali_valuuta_tahis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evk_kapital)) return false;
        Evk_kapital other = (Evk_kapital) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.kapitali_suurus == other.getKapitali_suurus() &&
            ((this.kapitali_valuuta_tahis==null && other.getKapitali_valuuta_tahis()==null) || 
             (this.kapitali_valuuta_tahis!=null &&
              this.kapitali_valuuta_tahis.equals(other.getKapitali_valuuta_tahis())));
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
        _hashCode += new Float(getKapitali_suurus()).hashCode();
        if (getKapitali_valuuta_tahis() != null) {
            _hashCode += getKapitali_valuuta_tahis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
