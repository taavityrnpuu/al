/**
 * Mtamajpaevik_paevik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtamajpaevik_paevik  implements java.io.Serializable {
    private java.math.BigInteger rea_id;

    private java.math.BigInteger piirk;

    private java.math.BigInteger ark;

    private java.util.Date maj_aasta;

    private java.util.Date maj_aastalopp;

    private java.lang.String kontr_olek;

    private java.util.Date oleku_muutm_kpv;

    public Mtamajpaevik_paevik() {
    }

    public Mtamajpaevik_paevik(
           java.math.BigInteger rea_id,
           java.math.BigInteger piirk,
           java.math.BigInteger ark,
           java.util.Date maj_aasta,
           java.util.Date maj_aastalopp,
           java.lang.String kontr_olek,
           java.util.Date oleku_muutm_kpv) {
           this.rea_id = rea_id;
           this.piirk = piirk;
           this.ark = ark;
           this.maj_aasta = maj_aasta;
           this.maj_aastalopp = maj_aastalopp;
           this.kontr_olek = kontr_olek;
           this.oleku_muutm_kpv = oleku_muutm_kpv;
    }


    /**
     * Gets the rea_id value for this Mtamajpaevik_paevik.
     * 
     * @return rea_id
     */
    public java.math.BigInteger getRea_id() {
        return rea_id;
    }


    /**
     * Sets the rea_id value for this Mtamajpaevik_paevik.
     * 
     * @param rea_id
     */
    public void setRea_id(java.math.BigInteger rea_id) {
        this.rea_id = rea_id;
    }


    /**
     * Gets the piirk value for this Mtamajpaevik_paevik.
     * 
     * @return piirk
     */
    public java.math.BigInteger getPiirk() {
        return piirk;
    }


    /**
     * Sets the piirk value for this Mtamajpaevik_paevik.
     * 
     * @param piirk
     */
    public void setPiirk(java.math.BigInteger piirk) {
        this.piirk = piirk;
    }


    /**
     * Gets the ark value for this Mtamajpaevik_paevik.
     * 
     * @return ark
     */
    public java.math.BigInteger getArk() {
        return ark;
    }


    /**
     * Sets the ark value for this Mtamajpaevik_paevik.
     * 
     * @param ark
     */
    public void setArk(java.math.BigInteger ark) {
        this.ark = ark;
    }


    /**
     * Gets the maj_aasta value for this Mtamajpaevik_paevik.
     * 
     * @return maj_aasta
     */
    public java.util.Date getMaj_aasta() {
        return maj_aasta;
    }


    /**
     * Sets the maj_aasta value for this Mtamajpaevik_paevik.
     * 
     * @param maj_aasta
     */
    public void setMaj_aasta(java.util.Date maj_aasta) {
        this.maj_aasta = maj_aasta;
    }


    /**
     * Gets the maj_aastalopp value for this Mtamajpaevik_paevik.
     * 
     * @return maj_aastalopp
     */
    public java.util.Date getMaj_aastalopp() {
        return maj_aastalopp;
    }


    /**
     * Sets the maj_aastalopp value for this Mtamajpaevik_paevik.
     * 
     * @param maj_aastalopp
     */
    public void setMaj_aastalopp(java.util.Date maj_aastalopp) {
        this.maj_aastalopp = maj_aastalopp;
    }


    /**
     * Gets the kontr_olek value for this Mtamajpaevik_paevik.
     * 
     * @return kontr_olek
     */
    public java.lang.String getKontr_olek() {
        return kontr_olek;
    }


    /**
     * Sets the kontr_olek value for this Mtamajpaevik_paevik.
     * 
     * @param kontr_olek
     */
    public void setKontr_olek(java.lang.String kontr_olek) {
        this.kontr_olek = kontr_olek;
    }


    /**
     * Gets the oleku_muutm_kpv value for this Mtamajpaevik_paevik.
     * 
     * @return oleku_muutm_kpv
     */
    public java.util.Date getOleku_muutm_kpv() {
        return oleku_muutm_kpv;
    }


    /**
     * Sets the oleku_muutm_kpv value for this Mtamajpaevik_paevik.
     * 
     * @param oleku_muutm_kpv
     */
    public void setOleku_muutm_kpv(java.util.Date oleku_muutm_kpv) {
        this.oleku_muutm_kpv = oleku_muutm_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtamajpaevik_paevik)) return false;
        Mtamajpaevik_paevik other = (Mtamajpaevik_paevik) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rea_id==null && other.getRea_id()==null) || 
             (this.rea_id!=null &&
              this.rea_id.equals(other.getRea_id()))) &&
            ((this.piirk==null && other.getPiirk()==null) || 
             (this.piirk!=null &&
              this.piirk.equals(other.getPiirk()))) &&
            ((this.ark==null && other.getArk()==null) || 
             (this.ark!=null &&
              this.ark.equals(other.getArk()))) &&
            ((this.maj_aasta==null && other.getMaj_aasta()==null) || 
             (this.maj_aasta!=null &&
              this.maj_aasta.equals(other.getMaj_aasta()))) &&
            ((this.maj_aastalopp==null && other.getMaj_aastalopp()==null) || 
             (this.maj_aastalopp!=null &&
              this.maj_aastalopp.equals(other.getMaj_aastalopp()))) &&
            ((this.kontr_olek==null && other.getKontr_olek()==null) || 
             (this.kontr_olek!=null &&
              this.kontr_olek.equals(other.getKontr_olek()))) &&
            ((this.oleku_muutm_kpv==null && other.getOleku_muutm_kpv()==null) || 
             (this.oleku_muutm_kpv!=null &&
              this.oleku_muutm_kpv.equals(other.getOleku_muutm_kpv())));
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
        if (getRea_id() != null) {
            _hashCode += getRea_id().hashCode();
        }
        if (getPiirk() != null) {
            _hashCode += getPiirk().hashCode();
        }
        if (getArk() != null) {
            _hashCode += getArk().hashCode();
        }
        if (getMaj_aasta() != null) {
            _hashCode += getMaj_aasta().hashCode();
        }
        if (getMaj_aastalopp() != null) {
            _hashCode += getMaj_aastalopp().hashCode();
        }
        if (getKontr_olek() != null) {
            _hashCode += getKontr_olek().hashCode();
        }
        if (getOleku_muutm_kpv() != null) {
            _hashCode += getOleku_muutm_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
