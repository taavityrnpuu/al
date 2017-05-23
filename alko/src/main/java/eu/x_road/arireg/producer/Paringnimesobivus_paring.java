/**
 * Paringnimesobivus_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringnimesobivus_paring  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.Integer tapsusklass;

    private java.lang.Boolean otsi_euroopa_kaubamarke;

    private java.lang.String keel;

    public Paringnimesobivus_paring() {
    }

    public Paringnimesobivus_paring(
           java.lang.String nimi,
           java.lang.Integer tapsusklass,
           java.lang.Boolean otsi_euroopa_kaubamarke,
           java.lang.String keel) {
           this.nimi = nimi;
           this.tapsusklass = tapsusklass;
           this.otsi_euroopa_kaubamarke = otsi_euroopa_kaubamarke;
           this.keel = keel;
    }


    /**
     * Gets the nimi value for this Paringnimesobivus_paring.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Paringnimesobivus_paring.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the tapsusklass value for this Paringnimesobivus_paring.
     * 
     * @return tapsusklass
     */
    public java.lang.Integer getTapsusklass() {
        return tapsusklass;
    }


    /**
     * Sets the tapsusklass value for this Paringnimesobivus_paring.
     * 
     * @param tapsusklass
     */
    public void setTapsusklass(java.lang.Integer tapsusklass) {
        this.tapsusklass = tapsusklass;
    }


    /**
     * Gets the otsi_euroopa_kaubamarke value for this Paringnimesobivus_paring.
     * 
     * @return otsi_euroopa_kaubamarke
     */
    public java.lang.Boolean getOtsi_euroopa_kaubamarke() {
        return otsi_euroopa_kaubamarke;
    }


    /**
     * Sets the otsi_euroopa_kaubamarke value for this Paringnimesobivus_paring.
     * 
     * @param otsi_euroopa_kaubamarke
     */
    public void setOtsi_euroopa_kaubamarke(java.lang.Boolean otsi_euroopa_kaubamarke) {
        this.otsi_euroopa_kaubamarke = otsi_euroopa_kaubamarke;
    }


    /**
     * Gets the keel value for this Paringnimesobivus_paring.
     * 
     * @return keel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Paringnimesobivus_paring.
     * 
     * @param keel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringnimesobivus_paring)) return false;
        Paringnimesobivus_paring other = (Paringnimesobivus_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.tapsusklass==null && other.getTapsusklass()==null) || 
             (this.tapsusklass!=null &&
              this.tapsusklass.equals(other.getTapsusklass()))) &&
            ((this.otsi_euroopa_kaubamarke==null && other.getOtsi_euroopa_kaubamarke()==null) || 
             (this.otsi_euroopa_kaubamarke!=null &&
              this.otsi_euroopa_kaubamarke.equals(other.getOtsi_euroopa_kaubamarke()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getTapsusklass() != null) {
            _hashCode += getTapsusklass().hashCode();
        }
        if (getOtsi_euroopa_kaubamarke() != null) {
            _hashCode += getOtsi_euroopa_kaubamarke().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
