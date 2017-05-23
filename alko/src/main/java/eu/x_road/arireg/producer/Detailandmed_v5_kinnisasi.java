/**
 * Detailandmed_v5_kinnisasi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_kinnisasi  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String ehak;

    private java.lang.String ehak_nimetus;

    private java.lang.String tanav_maja;

    private java.lang.String postiindeks;

    private java.math.BigInteger kinnisasja_nr;

    private java.math.BigInteger kinnistusjaoskond;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_kinnisasi() {
    }

    public Detailandmed_v5_kinnisasi(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String ehak,
           java.lang.String ehak_nimetus,
           java.lang.String tanav_maja,
           java.lang.String postiindeks,
           java.math.BigInteger kinnisasja_nr,
           java.math.BigInteger kinnistusjaoskond,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.ehak = ehak;
           this.ehak_nimetus = ehak_nimetus;
           this.tanav_maja = tanav_maja;
           this.postiindeks = postiindeks;
           this.kinnisasja_nr = kinnisasja_nr;
           this.kinnistusjaoskond = kinnistusjaoskond;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the ehak value for this Detailandmed_v5_kinnisasi.
     * 
     * @return ehak
     */
    public java.lang.String getEhak() {
        return ehak;
    }


    /**
     * Sets the ehak value for this Detailandmed_v5_kinnisasi.
     * 
     * @param ehak
     */
    public void setEhak(java.lang.String ehak) {
        this.ehak = ehak;
    }


    /**
     * Gets the ehak_nimetus value for this Detailandmed_v5_kinnisasi.
     * 
     * @return ehak_nimetus
     */
    public java.lang.String getEhak_nimetus() {
        return ehak_nimetus;
    }


    /**
     * Sets the ehak_nimetus value for this Detailandmed_v5_kinnisasi.
     * 
     * @param ehak_nimetus
     */
    public void setEhak_nimetus(java.lang.String ehak_nimetus) {
        this.ehak_nimetus = ehak_nimetus;
    }


    /**
     * Gets the tanav_maja value for this Detailandmed_v5_kinnisasi.
     * 
     * @return tanav_maja
     */
    public java.lang.String getTanav_maja() {
        return tanav_maja;
    }


    /**
     * Sets the tanav_maja value for this Detailandmed_v5_kinnisasi.
     * 
     * @param tanav_maja
     */
    public void setTanav_maja(java.lang.String tanav_maja) {
        this.tanav_maja = tanav_maja;
    }


    /**
     * Gets the postiindeks value for this Detailandmed_v5_kinnisasi.
     * 
     * @return postiindeks
     */
    public java.lang.String getPostiindeks() {
        return postiindeks;
    }


    /**
     * Sets the postiindeks value for this Detailandmed_v5_kinnisasi.
     * 
     * @param postiindeks
     */
    public void setPostiindeks(java.lang.String postiindeks) {
        this.postiindeks = postiindeks;
    }


    /**
     * Gets the kinnisasja_nr value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kinnisasja_nr
     */
    public java.math.BigInteger getKinnisasja_nr() {
        return kinnisasja_nr;
    }


    /**
     * Sets the kinnisasja_nr value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kinnisasja_nr
     */
    public void setKinnisasja_nr(java.math.BigInteger kinnisasja_nr) {
        this.kinnisasja_nr = kinnisasja_nr;
    }


    /**
     * Gets the kinnistusjaoskond value for this Detailandmed_v5_kinnisasi.
     * 
     * @return kinnistusjaoskond
     */
    public java.math.BigInteger getKinnistusjaoskond() {
        return kinnistusjaoskond;
    }


    /**
     * Sets the kinnistusjaoskond value for this Detailandmed_v5_kinnisasi.
     * 
     * @param kinnistusjaoskond
     */
    public void setKinnistusjaoskond(java.math.BigInteger kinnistusjaoskond) {
        this.kinnistusjaoskond = kinnistusjaoskond;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_kinnisasi.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_kinnisasi.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_kinnisasi.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_kinnisasi.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_kinnisasi)) return false;
        Detailandmed_v5_kinnisasi other = (Detailandmed_v5_kinnisasi) obj;
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
            ((this.tanav_maja==null && other.getTanav_maja()==null) || 
             (this.tanav_maja!=null &&
              this.tanav_maja.equals(other.getTanav_maja()))) &&
            ((this.postiindeks==null && other.getPostiindeks()==null) || 
             (this.postiindeks!=null &&
              this.postiindeks.equals(other.getPostiindeks()))) &&
            ((this.kinnisasja_nr==null && other.getKinnisasja_nr()==null) || 
             (this.kinnisasja_nr!=null &&
              this.kinnisasja_nr.equals(other.getKinnisasja_nr()))) &&
            ((this.kinnistusjaoskond==null && other.getKinnistusjaoskond()==null) || 
             (this.kinnistusjaoskond!=null &&
              this.kinnistusjaoskond.equals(other.getKinnistusjaoskond()))) &&
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
        if (getTanav_maja() != null) {
            _hashCode += getTanav_maja().hashCode();
        }
        if (getPostiindeks() != null) {
            _hashCode += getPostiindeks().hashCode();
        }
        if (getKinnisasja_nr() != null) {
            _hashCode += getKinnisasja_nr().hashCode();
        }
        if (getKinnistusjaoskond() != null) {
            _hashCode += getKinnistusjaoskond().hashCode();
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
