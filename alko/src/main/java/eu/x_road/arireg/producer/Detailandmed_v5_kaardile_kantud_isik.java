/**
 * Detailandmed_v5_kaardile_kantud_isik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_kaardile_kantud_isik  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String isiku_tyyp;

    private java.lang.String isiku_roll;

    private java.lang.String isiku_roll_tekstina;

    private java.lang.String eesnimi;

    private java.lang.String nimi_arinimi;

    private java.lang.String isikukood_registrikood;

    private java.lang.String valis_kood;

    private java.lang.String valis_kood_riik;

    private java.lang.String valis_kood_riik_tekstina;

    private java.util.Date synniaeg;

    private java.math.BigDecimal osamaks;

    private java.lang.String osamaksu_valuuta;

    private java.lang.String osamaksu_valuuta_tekstina;

    private java.util.Date volituste_loppemise_kpv;

    private java.lang.String aadress_riik;

    private java.lang.String aadress_riik_tekstina;

    private java.lang.String aadress_ehak;

    private java.lang.String aadress_ehak_tekstina;

    private java.lang.String aadress_tanav_maja_korter;

    private java.lang.String aadress_ads__ads_oid;

    private java.lang.String aadress_ads__adr_id;

    private java.lang.String aadress_ads__ads_normaliseeritud_taisaadress;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    private java.lang.String email;

    public Detailandmed_v5_kaardile_kantud_isik() {
    }

    public Detailandmed_v5_kaardile_kantud_isik(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String isiku_tyyp,
           java.lang.String isiku_roll,
           java.lang.String isiku_roll_tekstina,
           java.lang.String eesnimi,
           java.lang.String nimi_arinimi,
           java.lang.String isikukood_registrikood,
           java.lang.String valis_kood,
           java.lang.String valis_kood_riik,
           java.lang.String valis_kood_riik_tekstina,
           java.util.Date synniaeg,
           java.math.BigDecimal osamaks,
           java.lang.String osamaksu_valuuta,
           java.lang.String osamaksu_valuuta_tekstina,
           java.util.Date volituste_loppemise_kpv,
           java.lang.String aadress_riik,
           java.lang.String aadress_riik_tekstina,
           java.lang.String aadress_ehak,
           java.lang.String aadress_ehak_tekstina,
           java.lang.String aadress_tanav_maja_korter,
           java.lang.String aadress_ads__ads_oid,
           java.lang.String aadress_ads__adr_id,
           java.lang.String aadress_ads__ads_normaliseeritud_taisaadress,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv,
           java.lang.String email) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.isiku_tyyp = isiku_tyyp;
           this.isiku_roll = isiku_roll;
           this.isiku_roll_tekstina = isiku_roll_tekstina;
           this.eesnimi = eesnimi;
           this.nimi_arinimi = nimi_arinimi;
           this.isikukood_registrikood = isikukood_registrikood;
           this.valis_kood = valis_kood;
           this.valis_kood_riik = valis_kood_riik;
           this.valis_kood_riik_tekstina = valis_kood_riik_tekstina;
           this.synniaeg = synniaeg;
           this.osamaks = osamaks;
           this.osamaksu_valuuta = osamaksu_valuuta;
           this.osamaksu_valuuta_tekstina = osamaksu_valuuta_tekstina;
           this.volituste_loppemise_kpv = volituste_loppemise_kpv;
           this.aadress_riik = aadress_riik;
           this.aadress_riik_tekstina = aadress_riik_tekstina;
           this.aadress_ehak = aadress_ehak;
           this.aadress_ehak_tekstina = aadress_ehak_tekstina;
           this.aadress_tanav_maja_korter = aadress_tanav_maja_korter;
           this.aadress_ads__ads_oid = aadress_ads__ads_oid;
           this.aadress_ads__adr_id = aadress_ads__adr_id;
           this.aadress_ads__ads_normaliseeritud_taisaadress = aadress_ads__ads_normaliseeritud_taisaadress;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
           this.email = email;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the isiku_tyyp value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return isiku_tyyp
     */
    public java.lang.String getIsiku_tyyp() {
        return isiku_tyyp;
    }


    /**
     * Sets the isiku_tyyp value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param isiku_tyyp
     */
    public void setIsiku_tyyp(java.lang.String isiku_tyyp) {
        this.isiku_tyyp = isiku_tyyp;
    }


    /**
     * Gets the isiku_roll value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return isiku_roll
     */
    public java.lang.String getIsiku_roll() {
        return isiku_roll;
    }


    /**
     * Sets the isiku_roll value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param isiku_roll
     */
    public void setIsiku_roll(java.lang.String isiku_roll) {
        this.isiku_roll = isiku_roll;
    }


    /**
     * Gets the isiku_roll_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return isiku_roll_tekstina
     */
    public java.lang.String getIsiku_roll_tekstina() {
        return isiku_roll_tekstina;
    }


    /**
     * Sets the isiku_roll_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param isiku_roll_tekstina
     */
    public void setIsiku_roll_tekstina(java.lang.String isiku_roll_tekstina) {
        this.isiku_roll_tekstina = isiku_roll_tekstina;
    }


    /**
     * Gets the eesnimi value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the nimi_arinimi value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return nimi_arinimi
     */
    public java.lang.String getNimi_arinimi() {
        return nimi_arinimi;
    }


    /**
     * Sets the nimi_arinimi value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param nimi_arinimi
     */
    public void setNimi_arinimi(java.lang.String nimi_arinimi) {
        this.nimi_arinimi = nimi_arinimi;
    }


    /**
     * Gets the isikukood_registrikood value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return isikukood_registrikood
     */
    public java.lang.String getIsikukood_registrikood() {
        return isikukood_registrikood;
    }


    /**
     * Sets the isikukood_registrikood value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param isikukood_registrikood
     */
    public void setIsikukood_registrikood(java.lang.String isikukood_registrikood) {
        this.isikukood_registrikood = isikukood_registrikood;
    }


    /**
     * Gets the valis_kood value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return valis_kood
     */
    public java.lang.String getValis_kood() {
        return valis_kood;
    }


    /**
     * Sets the valis_kood value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param valis_kood
     */
    public void setValis_kood(java.lang.String valis_kood) {
        this.valis_kood = valis_kood;
    }


    /**
     * Gets the valis_kood_riik value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return valis_kood_riik
     */
    public java.lang.String getValis_kood_riik() {
        return valis_kood_riik;
    }


    /**
     * Sets the valis_kood_riik value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param valis_kood_riik
     */
    public void setValis_kood_riik(java.lang.String valis_kood_riik) {
        this.valis_kood_riik = valis_kood_riik;
    }


    /**
     * Gets the valis_kood_riik_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return valis_kood_riik_tekstina
     */
    public java.lang.String getValis_kood_riik_tekstina() {
        return valis_kood_riik_tekstina;
    }


    /**
     * Sets the valis_kood_riik_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param valis_kood_riik_tekstina
     */
    public void setValis_kood_riik_tekstina(java.lang.String valis_kood_riik_tekstina) {
        this.valis_kood_riik_tekstina = valis_kood_riik_tekstina;
    }


    /**
     * Gets the synniaeg value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return synniaeg
     */
    public java.util.Date getSynniaeg() {
        return synniaeg;
    }


    /**
     * Sets the synniaeg value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param synniaeg
     */
    public void setSynniaeg(java.util.Date synniaeg) {
        this.synniaeg = synniaeg;
    }


    /**
     * Gets the osamaks value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return osamaks
     */
    public java.math.BigDecimal getOsamaks() {
        return osamaks;
    }


    /**
     * Sets the osamaks value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param osamaks
     */
    public void setOsamaks(java.math.BigDecimal osamaks) {
        this.osamaks = osamaks;
    }


    /**
     * Gets the osamaksu_valuuta value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return osamaksu_valuuta
     */
    public java.lang.String getOsamaksu_valuuta() {
        return osamaksu_valuuta;
    }


    /**
     * Sets the osamaksu_valuuta value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param osamaksu_valuuta
     */
    public void setOsamaksu_valuuta(java.lang.String osamaksu_valuuta) {
        this.osamaksu_valuuta = osamaksu_valuuta;
    }


    /**
     * Gets the osamaksu_valuuta_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return osamaksu_valuuta_tekstina
     */
    public java.lang.String getOsamaksu_valuuta_tekstina() {
        return osamaksu_valuuta_tekstina;
    }


    /**
     * Sets the osamaksu_valuuta_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param osamaksu_valuuta_tekstina
     */
    public void setOsamaksu_valuuta_tekstina(java.lang.String osamaksu_valuuta_tekstina) {
        this.osamaksu_valuuta_tekstina = osamaksu_valuuta_tekstina;
    }


    /**
     * Gets the volituste_loppemise_kpv value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return volituste_loppemise_kpv
     */
    public java.util.Date getVolituste_loppemise_kpv() {
        return volituste_loppemise_kpv;
    }


    /**
     * Sets the volituste_loppemise_kpv value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param volituste_loppemise_kpv
     */
    public void setVolituste_loppemise_kpv(java.util.Date volituste_loppemise_kpv) {
        this.volituste_loppemise_kpv = volituste_loppemise_kpv;
    }


    /**
     * Gets the aadress_riik value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_riik
     */
    public java.lang.String getAadress_riik() {
        return aadress_riik;
    }


    /**
     * Sets the aadress_riik value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_riik
     */
    public void setAadress_riik(java.lang.String aadress_riik) {
        this.aadress_riik = aadress_riik;
    }


    /**
     * Gets the aadress_riik_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_riik_tekstina
     */
    public java.lang.String getAadress_riik_tekstina() {
        return aadress_riik_tekstina;
    }


    /**
     * Sets the aadress_riik_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_riik_tekstina
     */
    public void setAadress_riik_tekstina(java.lang.String aadress_riik_tekstina) {
        this.aadress_riik_tekstina = aadress_riik_tekstina;
    }


    /**
     * Gets the aadress_ehak value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_ehak
     */
    public java.lang.String getAadress_ehak() {
        return aadress_ehak;
    }


    /**
     * Sets the aadress_ehak value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_ehak
     */
    public void setAadress_ehak(java.lang.String aadress_ehak) {
        this.aadress_ehak = aadress_ehak;
    }


    /**
     * Gets the aadress_ehak_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_ehak_tekstina
     */
    public java.lang.String getAadress_ehak_tekstina() {
        return aadress_ehak_tekstina;
    }


    /**
     * Sets the aadress_ehak_tekstina value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_ehak_tekstina
     */
    public void setAadress_ehak_tekstina(java.lang.String aadress_ehak_tekstina) {
        this.aadress_ehak_tekstina = aadress_ehak_tekstina;
    }


    /**
     * Gets the aadress_tanav_maja_korter value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_tanav_maja_korter
     */
    public java.lang.String getAadress_tanav_maja_korter() {
        return aadress_tanav_maja_korter;
    }


    /**
     * Sets the aadress_tanav_maja_korter value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_tanav_maja_korter
     */
    public void setAadress_tanav_maja_korter(java.lang.String aadress_tanav_maja_korter) {
        this.aadress_tanav_maja_korter = aadress_tanav_maja_korter;
    }


    /**
     * Gets the aadress_ads__ads_oid value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_ads__ads_oid
     */
    public java.lang.String getAadress_ads__ads_oid() {
        return aadress_ads__ads_oid;
    }


    /**
     * Sets the aadress_ads__ads_oid value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_ads__ads_oid
     */
    public void setAadress_ads__ads_oid(java.lang.String aadress_ads__ads_oid) {
        this.aadress_ads__ads_oid = aadress_ads__ads_oid;
    }


    /**
     * Gets the aadress_ads__adr_id value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_ads__adr_id
     */
    public java.lang.String getAadress_ads__adr_id() {
        return aadress_ads__adr_id;
    }


    /**
     * Sets the aadress_ads__adr_id value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_ads__adr_id
     */
    public void setAadress_ads__adr_id(java.lang.String aadress_ads__adr_id) {
        this.aadress_ads__adr_id = aadress_ads__adr_id;
    }


    /**
     * Gets the aadress_ads__ads_normaliseeritud_taisaadress value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return aadress_ads__ads_normaliseeritud_taisaadress
     */
    public java.lang.String getAadress_ads__ads_normaliseeritud_taisaadress() {
        return aadress_ads__ads_normaliseeritud_taisaadress;
    }


    /**
     * Sets the aadress_ads__ads_normaliseeritud_taisaadress value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param aadress_ads__ads_normaliseeritud_taisaadress
     */
    public void setAadress_ads__ads_normaliseeritud_taisaadress(java.lang.String aadress_ads__ads_normaliseeritud_taisaadress) {
        this.aadress_ads__ads_normaliseeritud_taisaadress = aadress_ads__ads_normaliseeritud_taisaadress;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the email value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Detailandmed_v5_kaardile_kantud_isik.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_kaardile_kantud_isik)) return false;
        Detailandmed_v5_kaardile_kantud_isik other = (Detailandmed_v5_kaardile_kantud_isik) obj;
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
            ((this.isiku_tyyp==null && other.getIsiku_tyyp()==null) || 
             (this.isiku_tyyp!=null &&
              this.isiku_tyyp.equals(other.getIsiku_tyyp()))) &&
            ((this.isiku_roll==null && other.getIsiku_roll()==null) || 
             (this.isiku_roll!=null &&
              this.isiku_roll.equals(other.getIsiku_roll()))) &&
            ((this.isiku_roll_tekstina==null && other.getIsiku_roll_tekstina()==null) || 
             (this.isiku_roll_tekstina!=null &&
              this.isiku_roll_tekstina.equals(other.getIsiku_roll_tekstina()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.nimi_arinimi==null && other.getNimi_arinimi()==null) || 
             (this.nimi_arinimi!=null &&
              this.nimi_arinimi.equals(other.getNimi_arinimi()))) &&
            ((this.isikukood_registrikood==null && other.getIsikukood_registrikood()==null) || 
             (this.isikukood_registrikood!=null &&
              this.isikukood_registrikood.equals(other.getIsikukood_registrikood()))) &&
            ((this.valis_kood==null && other.getValis_kood()==null) || 
             (this.valis_kood!=null &&
              this.valis_kood.equals(other.getValis_kood()))) &&
            ((this.valis_kood_riik==null && other.getValis_kood_riik()==null) || 
             (this.valis_kood_riik!=null &&
              this.valis_kood_riik.equals(other.getValis_kood_riik()))) &&
            ((this.valis_kood_riik_tekstina==null && other.getValis_kood_riik_tekstina()==null) || 
             (this.valis_kood_riik_tekstina!=null &&
              this.valis_kood_riik_tekstina.equals(other.getValis_kood_riik_tekstina()))) &&
            ((this.synniaeg==null && other.getSynniaeg()==null) || 
             (this.synniaeg!=null &&
              this.synniaeg.equals(other.getSynniaeg()))) &&
            ((this.osamaks==null && other.getOsamaks()==null) || 
             (this.osamaks!=null &&
              this.osamaks.equals(other.getOsamaks()))) &&
            ((this.osamaksu_valuuta==null && other.getOsamaksu_valuuta()==null) || 
             (this.osamaksu_valuuta!=null &&
              this.osamaksu_valuuta.equals(other.getOsamaksu_valuuta()))) &&
            ((this.osamaksu_valuuta_tekstina==null && other.getOsamaksu_valuuta_tekstina()==null) || 
             (this.osamaksu_valuuta_tekstina!=null &&
              this.osamaksu_valuuta_tekstina.equals(other.getOsamaksu_valuuta_tekstina()))) &&
            ((this.volituste_loppemise_kpv==null && other.getVolituste_loppemise_kpv()==null) || 
             (this.volituste_loppemise_kpv!=null &&
              this.volituste_loppemise_kpv.equals(other.getVolituste_loppemise_kpv()))) &&
            ((this.aadress_riik==null && other.getAadress_riik()==null) || 
             (this.aadress_riik!=null &&
              this.aadress_riik.equals(other.getAadress_riik()))) &&
            ((this.aadress_riik_tekstina==null && other.getAadress_riik_tekstina()==null) || 
             (this.aadress_riik_tekstina!=null &&
              this.aadress_riik_tekstina.equals(other.getAadress_riik_tekstina()))) &&
            ((this.aadress_ehak==null && other.getAadress_ehak()==null) || 
             (this.aadress_ehak!=null &&
              this.aadress_ehak.equals(other.getAadress_ehak()))) &&
            ((this.aadress_ehak_tekstina==null && other.getAadress_ehak_tekstina()==null) || 
             (this.aadress_ehak_tekstina!=null &&
              this.aadress_ehak_tekstina.equals(other.getAadress_ehak_tekstina()))) &&
            ((this.aadress_tanav_maja_korter==null && other.getAadress_tanav_maja_korter()==null) || 
             (this.aadress_tanav_maja_korter!=null &&
              this.aadress_tanav_maja_korter.equals(other.getAadress_tanav_maja_korter()))) &&
            ((this.aadress_ads__ads_oid==null && other.getAadress_ads__ads_oid()==null) || 
             (this.aadress_ads__ads_oid!=null &&
              this.aadress_ads__ads_oid.equals(other.getAadress_ads__ads_oid()))) &&
            ((this.aadress_ads__adr_id==null && other.getAadress_ads__adr_id()==null) || 
             (this.aadress_ads__adr_id!=null &&
              this.aadress_ads__adr_id.equals(other.getAadress_ads__adr_id()))) &&
            ((this.aadress_ads__ads_normaliseeritud_taisaadress==null && other.getAadress_ads__ads_normaliseeritud_taisaadress()==null) || 
             (this.aadress_ads__ads_normaliseeritud_taisaadress!=null &&
              this.aadress_ads__ads_normaliseeritud_taisaadress.equals(other.getAadress_ads__ads_normaliseeritud_taisaadress()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getIsiku_tyyp() != null) {
            _hashCode += getIsiku_tyyp().hashCode();
        }
        if (getIsiku_roll() != null) {
            _hashCode += getIsiku_roll().hashCode();
        }
        if (getIsiku_roll_tekstina() != null) {
            _hashCode += getIsiku_roll_tekstina().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getNimi_arinimi() != null) {
            _hashCode += getNimi_arinimi().hashCode();
        }
        if (getIsikukood_registrikood() != null) {
            _hashCode += getIsikukood_registrikood().hashCode();
        }
        if (getValis_kood() != null) {
            _hashCode += getValis_kood().hashCode();
        }
        if (getValis_kood_riik() != null) {
            _hashCode += getValis_kood_riik().hashCode();
        }
        if (getValis_kood_riik_tekstina() != null) {
            _hashCode += getValis_kood_riik_tekstina().hashCode();
        }
        if (getSynniaeg() != null) {
            _hashCode += getSynniaeg().hashCode();
        }
        if (getOsamaks() != null) {
            _hashCode += getOsamaks().hashCode();
        }
        if (getOsamaksu_valuuta() != null) {
            _hashCode += getOsamaksu_valuuta().hashCode();
        }
        if (getOsamaksu_valuuta_tekstina() != null) {
            _hashCode += getOsamaksu_valuuta_tekstina().hashCode();
        }
        if (getVolituste_loppemise_kpv() != null) {
            _hashCode += getVolituste_loppemise_kpv().hashCode();
        }
        if (getAadress_riik() != null) {
            _hashCode += getAadress_riik().hashCode();
        }
        if (getAadress_riik_tekstina() != null) {
            _hashCode += getAadress_riik_tekstina().hashCode();
        }
        if (getAadress_ehak() != null) {
            _hashCode += getAadress_ehak().hashCode();
        }
        if (getAadress_ehak_tekstina() != null) {
            _hashCode += getAadress_ehak_tekstina().hashCode();
        }
        if (getAadress_tanav_maja_korter() != null) {
            _hashCode += getAadress_tanav_maja_korter().hashCode();
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
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
