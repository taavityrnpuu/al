/**
 * Sooritakanne_kapitali_tingimuslik_suurendamine_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_kapitali_tingimuslik_suurendamine_v4  implements java.io.Serializable {
    /* Otsuse kuupäev, millega otsustati kapitali tingimuslik suurendamine. */
    private java.util.Date otsuse_kuupaev;

    private java.math.BigDecimal suurus;

    private java.lang.String valuuta;

    public Sooritakanne_kapitali_tingimuslik_suurendamine_v4() {
    }

    public Sooritakanne_kapitali_tingimuslik_suurendamine_v4(
           java.util.Date otsuse_kuupaev,
           java.math.BigDecimal suurus,
           java.lang.String valuuta) {
           this.otsuse_kuupaev = otsuse_kuupaev;
           this.suurus = suurus;
           this.valuuta = valuuta;
    }


    /**
     * Gets the otsuse_kuupaev value for this Sooritakanne_kapitali_tingimuslik_suurendamine_v4.
     * 
     * @return otsuse_kuupaev   * Otsuse kuupäev, millega otsustati kapitali tingimuslik suurendamine.
     */
    public java.util.Date getOtsuse_kuupaev() {
        return otsuse_kuupaev;
    }


    /**
     * Sets the otsuse_kuupaev value for this Sooritakanne_kapitali_tingimuslik_suurendamine_v4.
     * 
     * @param otsuse_kuupaev   * Otsuse kuupäev, millega otsustati kapitali tingimuslik suurendamine.
     */
    public void setOtsuse_kuupaev(java.util.Date otsuse_kuupaev) {
        this.otsuse_kuupaev = otsuse_kuupaev;
    }


    /**
     * Gets the suurus value for this Sooritakanne_kapitali_tingimuslik_suurendamine_v4.
     * 
     * @return suurus
     */
    public java.math.BigDecimal getSuurus() {
        return suurus;
    }


    /**
     * Sets the suurus value for this Sooritakanne_kapitali_tingimuslik_suurendamine_v4.
     * 
     * @param suurus
     */
    public void setSuurus(java.math.BigDecimal suurus) {
        this.suurus = suurus;
    }


    /**
     * Gets the valuuta value for this Sooritakanne_kapitali_tingimuslik_suurendamine_v4.
     * 
     * @return valuuta
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }


    /**
     * Sets the valuuta value for this Sooritakanne_kapitali_tingimuslik_suurendamine_v4.
     * 
     * @param valuuta
     */
    public void setValuuta(java.lang.String valuuta) {
        this.valuuta = valuuta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sooritakanne_kapitali_tingimuslik_suurendamine_v4)) return false;
        Sooritakanne_kapitali_tingimuslik_suurendamine_v4 other = (Sooritakanne_kapitali_tingimuslik_suurendamine_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otsuse_kuupaev==null && other.getOtsuse_kuupaev()==null) || 
             (this.otsuse_kuupaev!=null &&
              this.otsuse_kuupaev.equals(other.getOtsuse_kuupaev()))) &&
            ((this.suurus==null && other.getSuurus()==null) || 
             (this.suurus!=null &&
              this.suurus.equals(other.getSuurus()))) &&
            ((this.valuuta==null && other.getValuuta()==null) || 
             (this.valuuta!=null &&
              this.valuuta.equals(other.getValuuta())));
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
        if (getOtsuse_kuupaev() != null) {
            _hashCode += getOtsuse_kuupaev().hashCode();
        }
        if (getSuurus() != null) {
            _hashCode += getSuurus().hashCode();
        }
        if (getValuuta() != null) {
            _hashCode += getValuuta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
