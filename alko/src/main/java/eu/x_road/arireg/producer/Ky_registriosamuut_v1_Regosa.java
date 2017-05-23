/**
 * Ky_registriosamuut_v1_Regosa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_registriosamuut_v1_Regosa  implements java.io.Serializable {
    private java.math.BigInteger registriosa_number;

    private java.math.BigInteger kande_number;

    private java.util.Date kande_aeg;

    private java.lang.String kandeliigi_tahis;

    public Ky_registriosamuut_v1_Regosa() {
    }

    public Ky_registriosamuut_v1_Regosa(
           java.math.BigInteger registriosa_number,
           java.math.BigInteger kande_number,
           java.util.Date kande_aeg,
           java.lang.String kandeliigi_tahis) {
           this.registriosa_number = registriosa_number;
           this.kande_number = kande_number;
           this.kande_aeg = kande_aeg;
           this.kandeliigi_tahis = kandeliigi_tahis;
    }


    /**
     * Gets the registriosa_number value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @return registriosa_number
     */
    public java.math.BigInteger getRegistriosa_number() {
        return registriosa_number;
    }


    /**
     * Sets the registriosa_number value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @param registriosa_number
     */
    public void setRegistriosa_number(java.math.BigInteger registriosa_number) {
        this.registriosa_number = registriosa_number;
    }


    /**
     * Gets the kande_number value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @return kande_number
     */
    public java.math.BigInteger getKande_number() {
        return kande_number;
    }


    /**
     * Sets the kande_number value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @param kande_number
     */
    public void setKande_number(java.math.BigInteger kande_number) {
        this.kande_number = kande_number;
    }


    /**
     * Gets the kande_aeg value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @return kande_aeg
     */
    public java.util.Date getKande_aeg() {
        return kande_aeg;
    }


    /**
     * Sets the kande_aeg value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @param kande_aeg
     */
    public void setKande_aeg(java.util.Date kande_aeg) {
        this.kande_aeg = kande_aeg;
    }


    /**
     * Gets the kandeliigi_tahis value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @return kandeliigi_tahis
     */
    public java.lang.String getKandeliigi_tahis() {
        return kandeliigi_tahis;
    }


    /**
     * Sets the kandeliigi_tahis value for this Ky_registriosamuut_v1_Regosa.
     * 
     * @param kandeliigi_tahis
     */
    public void setKandeliigi_tahis(java.lang.String kandeliigi_tahis) {
        this.kandeliigi_tahis = kandeliigi_tahis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_registriosamuut_v1_Regosa)) return false;
        Ky_registriosamuut_v1_Regosa other = (Ky_registriosamuut_v1_Regosa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registriosa_number==null && other.getRegistriosa_number()==null) || 
             (this.registriosa_number!=null &&
              this.registriosa_number.equals(other.getRegistriosa_number()))) &&
            ((this.kande_number==null && other.getKande_number()==null) || 
             (this.kande_number!=null &&
              this.kande_number.equals(other.getKande_number()))) &&
            ((this.kande_aeg==null && other.getKande_aeg()==null) || 
             (this.kande_aeg!=null &&
              this.kande_aeg.equals(other.getKande_aeg()))) &&
            ((this.kandeliigi_tahis==null && other.getKandeliigi_tahis()==null) || 
             (this.kandeliigi_tahis!=null &&
              this.kandeliigi_tahis.equals(other.getKandeliigi_tahis())));
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
        if (getRegistriosa_number() != null) {
            _hashCode += getRegistriosa_number().hashCode();
        }
        if (getKande_number() != null) {
            _hashCode += getKande_number().hashCode();
        }
        if (getKande_aeg() != null) {
            _hashCode += getKande_aeg().hashCode();
        }
        if (getKandeliigi_tahis() != null) {
            _hashCode += getKandeliigi_tahis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
