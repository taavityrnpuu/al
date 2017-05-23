/**
 * Paringliht_v5_evkapital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringliht_v5_evkapital  implements java.io.Serializable {
    private java.lang.String kapitali_suurus;

    private java.lang.String kapitali_valuuta;

    private java.lang.Boolean asutatud_sissemakset_tegemata;

    public Paringliht_v5_evkapital() {
    }

    public Paringliht_v5_evkapital(
           java.lang.String kapitali_suurus,
           java.lang.String kapitali_valuuta,
           java.lang.Boolean asutatud_sissemakset_tegemata) {
           this.kapitali_suurus = kapitali_suurus;
           this.kapitali_valuuta = kapitali_valuuta;
           this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
    }


    /**
     * Gets the kapitali_suurus value for this Paringliht_v5_evkapital.
     * 
     * @return kapitali_suurus
     */
    public java.lang.String getKapitali_suurus() {
        return kapitali_suurus;
    }


    /**
     * Sets the kapitali_suurus value for this Paringliht_v5_evkapital.
     * 
     * @param kapitali_suurus
     */
    public void setKapitali_suurus(java.lang.String kapitali_suurus) {
        this.kapitali_suurus = kapitali_suurus;
    }


    /**
     * Gets the kapitali_valuuta value for this Paringliht_v5_evkapital.
     * 
     * @return kapitali_valuuta
     */
    public java.lang.String getKapitali_valuuta() {
        return kapitali_valuuta;
    }


    /**
     * Sets the kapitali_valuuta value for this Paringliht_v5_evkapital.
     * 
     * @param kapitali_valuuta
     */
    public void setKapitali_valuuta(java.lang.String kapitali_valuuta) {
        this.kapitali_valuuta = kapitali_valuuta;
    }


    /**
     * Gets the asutatud_sissemakset_tegemata value for this Paringliht_v5_evkapital.
     * 
     * @return asutatud_sissemakset_tegemata
     */
    public java.lang.Boolean getAsutatud_sissemakset_tegemata() {
        return asutatud_sissemakset_tegemata;
    }


    /**
     * Sets the asutatud_sissemakset_tegemata value for this Paringliht_v5_evkapital.
     * 
     * @param asutatud_sissemakset_tegemata
     */
    public void setAsutatud_sissemakset_tegemata(java.lang.Boolean asutatud_sissemakset_tegemata) {
        this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v5_evkapital)) return false;
        Paringliht_v5_evkapital other = (Paringliht_v5_evkapital) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kapitali_suurus==null && other.getKapitali_suurus()==null) || 
             (this.kapitali_suurus!=null &&
              this.kapitali_suurus.equals(other.getKapitali_suurus()))) &&
            ((this.kapitali_valuuta==null && other.getKapitali_valuuta()==null) || 
             (this.kapitali_valuuta!=null &&
              this.kapitali_valuuta.equals(other.getKapitali_valuuta()))) &&
            ((this.asutatud_sissemakset_tegemata==null && other.getAsutatud_sissemakset_tegemata()==null) || 
             (this.asutatud_sissemakset_tegemata!=null &&
              this.asutatud_sissemakset_tegemata.equals(other.getAsutatud_sissemakset_tegemata())));
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
        if (getKapitali_suurus() != null) {
            _hashCode += getKapitali_suurus().hashCode();
        }
        if (getKapitali_valuuta() != null) {
            _hashCode += getKapitali_valuuta().hashCode();
        }
        if (getAsutatud_sissemakset_tegemata() != null) {
            _hashCode += getAsutatud_sissemakset_tegemata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
