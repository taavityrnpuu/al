/**
 * Detailandmed_v5_aadress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_aadress  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String ehak;

    private java.lang.String ehak_nimetus;

    private java.lang.String tanav_maja_korter;

    private java.lang.String aadress_ads__ads_oid;

    private java.lang.String aadress_ads__adr_id;

    private java.lang.String aadress_ads__ads_normaliseeritud_taisaadress;

    private java.lang.String postiindeks;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_aadress() {
    }

    public Detailandmed_v5_aadress(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String ehak,
           java.lang.String ehak_nimetus,
           java.lang.String tanav_maja_korter,
           java.lang.String aadress_ads__ads_oid,
           java.lang.String aadress_ads__adr_id,
           java.lang.String aadress_ads__ads_normaliseeritud_taisaadress,
           java.lang.String postiindeks,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.ehak = ehak;
           this.ehak_nimetus = ehak_nimetus;
           this.tanav_maja_korter = tanav_maja_korter;
           this.aadress_ads__ads_oid = aadress_ads__ads_oid;
           this.aadress_ads__adr_id = aadress_ads__adr_id;
           this.aadress_ads__ads_normaliseeritud_taisaadress = aadress_ads__ads_normaliseeritud_taisaadress;
           this.postiindeks = postiindeks;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_aadress.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_aadress.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_aadress.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_aadress.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_aadress.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_aadress.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_aadress.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_aadress.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_aadress.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_aadress.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the ehak value for this Detailandmed_v5_aadress.
     * 
     * @return ehak
     */
    public java.lang.String getEhak() {
        return ehak;
    }


    /**
     * Sets the ehak value for this Detailandmed_v5_aadress.
     * 
     * @param ehak
     */
    public void setEhak(java.lang.String ehak) {
        this.ehak = ehak;
    }


    /**
     * Gets the ehak_nimetus value for this Detailandmed_v5_aadress.
     * 
     * @return ehak_nimetus
     */
    public java.lang.String getEhak_nimetus() {
        return ehak_nimetus;
    }


    /**
     * Sets the ehak_nimetus value for this Detailandmed_v5_aadress.
     * 
     * @param ehak_nimetus
     */
    public void setEhak_nimetus(java.lang.String ehak_nimetus) {
        this.ehak_nimetus = ehak_nimetus;
    }


    /**
     * Gets the tanav_maja_korter value for this Detailandmed_v5_aadress.
     * 
     * @return tanav_maja_korter
     */
    public java.lang.String getTanav_maja_korter() {
        return tanav_maja_korter;
    }


    /**
     * Sets the tanav_maja_korter value for this Detailandmed_v5_aadress.
     * 
     * @param tanav_maja_korter
     */
    public void setTanav_maja_korter(java.lang.String tanav_maja_korter) {
        this.tanav_maja_korter = tanav_maja_korter;
    }


    /**
     * Gets the aadress_ads__ads_oid value for this Detailandmed_v5_aadress.
     * 
     * @return aadress_ads__ads_oid
     */
    public java.lang.String getAadress_ads__ads_oid() {
        return aadress_ads__ads_oid;
    }


    /**
     * Sets the aadress_ads__ads_oid value for this Detailandmed_v5_aadress.
     * 
     * @param aadress_ads__ads_oid
     */
    public void setAadress_ads__ads_oid(java.lang.String aadress_ads__ads_oid) {
        this.aadress_ads__ads_oid = aadress_ads__ads_oid;
    }


    /**
     * Gets the aadress_ads__adr_id value for this Detailandmed_v5_aadress.
     * 
     * @return aadress_ads__adr_id
     */
    public java.lang.String getAadress_ads__adr_id() {
        return aadress_ads__adr_id;
    }


    /**
     * Sets the aadress_ads__adr_id value for this Detailandmed_v5_aadress.
     * 
     * @param aadress_ads__adr_id
     */
    public void setAadress_ads__adr_id(java.lang.String aadress_ads__adr_id) {
        this.aadress_ads__adr_id = aadress_ads__adr_id;
    }


    /**
     * Gets the aadress_ads__ads_normaliseeritud_taisaadress value for this Detailandmed_v5_aadress.
     * 
     * @return aadress_ads__ads_normaliseeritud_taisaadress
     */
    public java.lang.String getAadress_ads__ads_normaliseeritud_taisaadress() {
        return aadress_ads__ads_normaliseeritud_taisaadress;
    }


    /**
     * Sets the aadress_ads__ads_normaliseeritud_taisaadress value for this Detailandmed_v5_aadress.
     * 
     * @param aadress_ads__ads_normaliseeritud_taisaadress
     */
    public void setAadress_ads__ads_normaliseeritud_taisaadress(java.lang.String aadress_ads__ads_normaliseeritud_taisaadress) {
        this.aadress_ads__ads_normaliseeritud_taisaadress = aadress_ads__ads_normaliseeritud_taisaadress;
    }


    /**
     * Gets the postiindeks value for this Detailandmed_v5_aadress.
     * 
     * @return postiindeks
     */
    public java.lang.String getPostiindeks() {
        return postiindeks;
    }


    /**
     * Sets the postiindeks value for this Detailandmed_v5_aadress.
     * 
     * @param postiindeks
     */
    public void setPostiindeks(java.lang.String postiindeks) {
        this.postiindeks = postiindeks;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_aadress.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_aadress.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_aadress.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_aadress.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_aadress)) return false;
        Detailandmed_v5_aadress other = (Detailandmed_v5_aadress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirje_id==null && other.getKirje_id()==null) || 
             (this.kirje_id!=null &&
              this.kirje_id.equals(other.getKirje_id()))) &&
            ((this.kaardi_piirkond==null && other.getKaardi_piirkond()==null) || 
             (this.kaardi_piirkond!=null &&
              this.kaardi_piirkond.equals(other.getKaardi_piirkond()))) &&
            ((this.kaardi_nr==null && other.getKaardi_nr()==null) || 
             (this.kaardi_nr!=null &&
              this.kaardi_nr.equals(other.getKaardi_nr()))) &&
            ((this.kaardi_tyyp==null && other.getKaardi_tyyp()==null) || 
             (this.kaardi_tyyp!=null &&
              this.kaardi_tyyp.equals(other.getKaardi_tyyp()))) &&
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.ehak==null && other.getEhak()==null) || 
             (this.ehak!=null &&
              this.ehak.equals(other.getEhak()))) &&
            ((this.ehak_nimetus==null && other.getEhak_nimetus()==null) || 
             (this.ehak_nimetus!=null &&
              this.ehak_nimetus.equals(other.getEhak_nimetus()))) &&
            ((this.tanav_maja_korter==null && other.getTanav_maja_korter()==null) || 
             (this.tanav_maja_korter!=null &&
              this.tanav_maja_korter.equals(other.getTanav_maja_korter()))) &&
            ((this.aadress_ads__ads_oid==null && other.getAadress_ads__ads_oid()==null) || 
             (this.aadress_ads__ads_oid!=null &&
              this.aadress_ads__ads_oid.equals(other.getAadress_ads__ads_oid()))) &&
            ((this.aadress_ads__adr_id==null && other.getAadress_ads__adr_id()==null) || 
             (this.aadress_ads__adr_id!=null &&
              this.aadress_ads__adr_id.equals(other.getAadress_ads__adr_id()))) &&
            ((this.aadress_ads__ads_normaliseeritud_taisaadress==null && other.getAadress_ads__ads_normaliseeritud_taisaadress()==null) || 
             (this.aadress_ads__ads_normaliseeritud_taisaadress!=null &&
              this.aadress_ads__ads_normaliseeritud_taisaadress.equals(other.getAadress_ads__ads_normaliseeritud_taisaadress()))) &&
            ((this.postiindeks==null && other.getPostiindeks()==null) || 
             (this.postiindeks!=null &&
              this.postiindeks.equals(other.getPostiindeks()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv())));
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
        if (getKirje_id() != null) {
            _hashCode += getKirje_id().hashCode();
        }
        if (getKaardi_piirkond() != null) {
            _hashCode += getKaardi_piirkond().hashCode();
        }
        if (getKaardi_nr() != null) {
            _hashCode += getKaardi_nr().hashCode();
        }
        if (getKaardi_tyyp() != null) {
            _hashCode += getKaardi_tyyp().hashCode();
        }
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getEhak() != null) {
            _hashCode += getEhak().hashCode();
        }
        if (getEhak_nimetus() != null) {
            _hashCode += getEhak_nimetus().hashCode();
        }
        if (getTanav_maja_korter() != null) {
            _hashCode += getTanav_maja_korter().hashCode();
        }
        if (getAadress_ads__ads_oid() != null) {
            _hashCode += getAadress_ads__ads_oid().hashCode();
        }
        if (getAadress_ads__adr_id() != null) {
            _hashCode += getAadress_ads__adr_id().hashCode();
        }
        if (getAadress_ads__ads_normaliseeritud_taisaadress() != null) {
            _hashCode += getAadress_ads__ads_normaliseeritud_taisaadress().hashCode();
        }
        if (getPostiindeks() != null) {
            _hashCode += getPostiindeks().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
