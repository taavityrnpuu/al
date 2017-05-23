/**
 * Detailandmed_v5_kaardivaline_isik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_kaardivaline_isik  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

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

    private java.lang.String aadress_riik;

    private java.lang.String aadress_riik_tekstina;

    private java.lang.String aadress_ehak;

    private java.lang.String aadress_ehak_tekstina;

    private java.lang.String aadress_tanav_maja_korter;

    private java.lang.String aadress_ads__ads_oid;

    private java.lang.String aadress_ads__adr_id;

    private java.lang.String aadress_ads__ads_normaliseeritud_taisaadress;

    private java.math.BigDecimal osaluse_protsent;

    private java.math.BigDecimal osaluse_suurus;

    private java.lang.String osaluse_valuuta;

    private java.lang.String osaluse_valuuta_tekstina;

    private java.lang.String osaluse_omandiliik;

    private java.lang.String osaluse_omandiliik_tekstina;

    private java.math.BigInteger osaluse_murdosa_lugeja;

    private java.math.BigInteger osaluse_murdosa_nimetaja;

    private java.util.Date volituste_loppemise_kpv;

    private java.lang.String kontrolli_allikas;

    private java.lang.String kontrolli_allikas_tekstina;

    private java.util.Date kontrolli_allika_kpv;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    private java.math.BigInteger grupp;

    public Detailandmed_v5_kaardivaline_isik() {
    }

    public Detailandmed_v5_kaardivaline_isik(
           java.math.BigInteger kirje_id,
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
           java.lang.String aadress_riik,
           java.lang.String aadress_riik_tekstina,
           java.lang.String aadress_ehak,
           java.lang.String aadress_ehak_tekstina,
           java.lang.String aadress_tanav_maja_korter,
           java.lang.String aadress_ads__ads_oid,
           java.lang.String aadress_ads__adr_id,
           java.lang.String aadress_ads__ads_normaliseeritud_taisaadress,
           java.math.BigDecimal osaluse_protsent,
           java.math.BigDecimal osaluse_suurus,
           java.lang.String osaluse_valuuta,
           java.lang.String osaluse_valuuta_tekstina,
           java.lang.String osaluse_omandiliik,
           java.lang.String osaluse_omandiliik_tekstina,
           java.math.BigInteger osaluse_murdosa_lugeja,
           java.math.BigInteger osaluse_murdosa_nimetaja,
           java.util.Date volituste_loppemise_kpv,
           java.lang.String kontrolli_allikas,
           java.lang.String kontrolli_allikas_tekstina,
           java.util.Date kontrolli_allika_kpv,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv,
           java.math.BigInteger grupp) {
           this.kirje_id = kirje_id;
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
           this.aadress_riik = aadress_riik;
           this.aadress_riik_tekstina = aadress_riik_tekstina;
           this.aadress_ehak = aadress_ehak;
           this.aadress_ehak_tekstina = aadress_ehak_tekstina;
           this.aadress_tanav_maja_korter = aadress_tanav_maja_korter;
           this.aadress_ads__ads_oid = aadress_ads__ads_oid;
           this.aadress_ads__adr_id = aadress_ads__adr_id;
           this.aadress_ads__ads_normaliseeritud_taisaadress = aadress_ads__ads_normaliseeritud_taisaadress;
           this.osaluse_protsent = osaluse_protsent;
           this.osaluse_suurus = osaluse_suurus;
           this.osaluse_valuuta = osaluse_valuuta;
           this.osaluse_valuuta_tekstina = osaluse_valuuta_tekstina;
           this.osaluse_omandiliik = osaluse_omandiliik;
           this.osaluse_omandiliik_tekstina = osaluse_omandiliik_tekstina;
           this.osaluse_murdosa_lugeja = osaluse_murdosa_lugeja;
           this.osaluse_murdosa_nimetaja = osaluse_murdosa_nimetaja;
           this.volituste_loppemise_kpv = volituste_loppemise_kpv;
           this.kontrolli_allikas = kontrolli_allikas;
           this.kontrolli_allikas_tekstina = kontrolli_allikas_tekstina;
           this.kontrolli_allika_kpv = kontrolli_allika_kpv;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
           this.grupp = grupp;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the isiku_tyyp value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return isiku_tyyp
     */
    public java.lang.String getIsiku_tyyp() {
        return isiku_tyyp;
    }


    /**
     * Sets the isiku_tyyp value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param isiku_tyyp
     */
    public void setIsiku_tyyp(java.lang.String isiku_tyyp) {
        this.isiku_tyyp = isiku_tyyp;
    }


    /**
     * Gets the isiku_roll value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return isiku_roll
     */
    public java.lang.String getIsiku_roll() {
        return isiku_roll;
    }


    /**
     * Sets the isiku_roll value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param isiku_roll
     */
    public void setIsiku_roll(java.lang.String isiku_roll) {
        this.isiku_roll = isiku_roll;
    }


    /**
     * Gets the isiku_roll_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return isiku_roll_tekstina
     */
    public java.lang.String getIsiku_roll_tekstina() {
        return isiku_roll_tekstina;
    }


    /**
     * Sets the isiku_roll_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param isiku_roll_tekstina
     */
    public void setIsiku_roll_tekstina(java.lang.String isiku_roll_tekstina) {
        this.isiku_roll_tekstina = isiku_roll_tekstina;
    }


    /**
     * Gets the eesnimi value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the nimi_arinimi value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return nimi_arinimi
     */
    public java.lang.String getNimi_arinimi() {
        return nimi_arinimi;
    }


    /**
     * Sets the nimi_arinimi value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param nimi_arinimi
     */
    public void setNimi_arinimi(java.lang.String nimi_arinimi) {
        this.nimi_arinimi = nimi_arinimi;
    }


    /**
     * Gets the isikukood_registrikood value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return isikukood_registrikood
     */
    public java.lang.String getIsikukood_registrikood() {
        return isikukood_registrikood;
    }


    /**
     * Sets the isikukood_registrikood value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param isikukood_registrikood
     */
    public void setIsikukood_registrikood(java.lang.String isikukood_registrikood) {
        this.isikukood_registrikood = isikukood_registrikood;
    }


    /**
     * Gets the valis_kood value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return valis_kood
     */
    public java.lang.String getValis_kood() {
        return valis_kood;
    }


    /**
     * Sets the valis_kood value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param valis_kood
     */
    public void setValis_kood(java.lang.String valis_kood) {
        this.valis_kood = valis_kood;
    }


    /**
     * Gets the valis_kood_riik value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return valis_kood_riik
     */
    public java.lang.String getValis_kood_riik() {
        return valis_kood_riik;
    }


    /**
     * Sets the valis_kood_riik value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param valis_kood_riik
     */
    public void setValis_kood_riik(java.lang.String valis_kood_riik) {
        this.valis_kood_riik = valis_kood_riik;
    }


    /**
     * Gets the valis_kood_riik_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return valis_kood_riik_tekstina
     */
    public java.lang.String getValis_kood_riik_tekstina() {
        return valis_kood_riik_tekstina;
    }


    /**
     * Sets the valis_kood_riik_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param valis_kood_riik_tekstina
     */
    public void setValis_kood_riik_tekstina(java.lang.String valis_kood_riik_tekstina) {
        this.valis_kood_riik_tekstina = valis_kood_riik_tekstina;
    }


    /**
     * Gets the synniaeg value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return synniaeg
     */
    public java.util.Date getSynniaeg() {
        return synniaeg;
    }


    /**
     * Sets the synniaeg value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param synniaeg
     */
    public void setSynniaeg(java.util.Date synniaeg) {
        this.synniaeg = synniaeg;
    }


    /**
     * Gets the aadress_riik value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_riik
     */
    public java.lang.String getAadress_riik() {
        return aadress_riik;
    }


    /**
     * Sets the aadress_riik value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_riik
     */
    public void setAadress_riik(java.lang.String aadress_riik) {
        this.aadress_riik = aadress_riik;
    }


    /**
     * Gets the aadress_riik_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_riik_tekstina
     */
    public java.lang.String getAadress_riik_tekstina() {
        return aadress_riik_tekstina;
    }


    /**
     * Sets the aadress_riik_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_riik_tekstina
     */
    public void setAadress_riik_tekstina(java.lang.String aadress_riik_tekstina) {
        this.aadress_riik_tekstina = aadress_riik_tekstina;
    }


    /**
     * Gets the aadress_ehak value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_ehak
     */
    public java.lang.String getAadress_ehak() {
        return aadress_ehak;
    }


    /**
     * Sets the aadress_ehak value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_ehak
     */
    public void setAadress_ehak(java.lang.String aadress_ehak) {
        this.aadress_ehak = aadress_ehak;
    }


    /**
     * Gets the aadress_ehak_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_ehak_tekstina
     */
    public java.lang.String getAadress_ehak_tekstina() {
        return aadress_ehak_tekstina;
    }


    /**
     * Sets the aadress_ehak_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_ehak_tekstina
     */
    public void setAadress_ehak_tekstina(java.lang.String aadress_ehak_tekstina) {
        this.aadress_ehak_tekstina = aadress_ehak_tekstina;
    }


    /**
     * Gets the aadress_tanav_maja_korter value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_tanav_maja_korter
     */
    public java.lang.String getAadress_tanav_maja_korter() {
        return aadress_tanav_maja_korter;
    }


    /**
     * Sets the aadress_tanav_maja_korter value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_tanav_maja_korter
     */
    public void setAadress_tanav_maja_korter(java.lang.String aadress_tanav_maja_korter) {
        this.aadress_tanav_maja_korter = aadress_tanav_maja_korter;
    }


    /**
     * Gets the aadress_ads__ads_oid value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_ads__ads_oid
     */
    public java.lang.String getAadress_ads__ads_oid() {
        return aadress_ads__ads_oid;
    }


    /**
     * Sets the aadress_ads__ads_oid value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_ads__ads_oid
     */
    public void setAadress_ads__ads_oid(java.lang.String aadress_ads__ads_oid) {
        this.aadress_ads__ads_oid = aadress_ads__ads_oid;
    }


    /**
     * Gets the aadress_ads__adr_id value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_ads__adr_id
     */
    public java.lang.String getAadress_ads__adr_id() {
        return aadress_ads__adr_id;
    }


    /**
     * Sets the aadress_ads__adr_id value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_ads__adr_id
     */
    public void setAadress_ads__adr_id(java.lang.String aadress_ads__adr_id) {
        this.aadress_ads__adr_id = aadress_ads__adr_id;
    }


    /**
     * Gets the aadress_ads__ads_normaliseeritud_taisaadress value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return aadress_ads__ads_normaliseeritud_taisaadress
     */
    public java.lang.String getAadress_ads__ads_normaliseeritud_taisaadress() {
        return aadress_ads__ads_normaliseeritud_taisaadress;
    }


    /**
     * Sets the aadress_ads__ads_normaliseeritud_taisaadress value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param aadress_ads__ads_normaliseeritud_taisaadress
     */
    public void setAadress_ads__ads_normaliseeritud_taisaadress(java.lang.String aadress_ads__ads_normaliseeritud_taisaadress) {
        this.aadress_ads__ads_normaliseeritud_taisaadress = aadress_ads__ads_normaliseeritud_taisaadress;
    }


    /**
     * Gets the osaluse_protsent value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_protsent
     */
    public java.math.BigDecimal getOsaluse_protsent() {
        return osaluse_protsent;
    }


    /**
     * Sets the osaluse_protsent value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_protsent
     */
    public void setOsaluse_protsent(java.math.BigDecimal osaluse_protsent) {
        this.osaluse_protsent = osaluse_protsent;
    }


    /**
     * Gets the osaluse_suurus value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_suurus
     */
    public java.math.BigDecimal getOsaluse_suurus() {
        return osaluse_suurus;
    }


    /**
     * Sets the osaluse_suurus value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_suurus
     */
    public void setOsaluse_suurus(java.math.BigDecimal osaluse_suurus) {
        this.osaluse_suurus = osaluse_suurus;
    }


    /**
     * Gets the osaluse_valuuta value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_valuuta
     */
    public java.lang.String getOsaluse_valuuta() {
        return osaluse_valuuta;
    }


    /**
     * Sets the osaluse_valuuta value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_valuuta
     */
    public void setOsaluse_valuuta(java.lang.String osaluse_valuuta) {
        this.osaluse_valuuta = osaluse_valuuta;
    }


    /**
     * Gets the osaluse_valuuta_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_valuuta_tekstina
     */
    public java.lang.String getOsaluse_valuuta_tekstina() {
        return osaluse_valuuta_tekstina;
    }


    /**
     * Sets the osaluse_valuuta_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_valuuta_tekstina
     */
    public void setOsaluse_valuuta_tekstina(java.lang.String osaluse_valuuta_tekstina) {
        this.osaluse_valuuta_tekstina = osaluse_valuuta_tekstina;
    }


    /**
     * Gets the osaluse_omandiliik value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_omandiliik
     */
    public java.lang.String getOsaluse_omandiliik() {
        return osaluse_omandiliik;
    }


    /**
     * Sets the osaluse_omandiliik value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_omandiliik
     */
    public void setOsaluse_omandiliik(java.lang.String osaluse_omandiliik) {
        this.osaluse_omandiliik = osaluse_omandiliik;
    }


    /**
     * Gets the osaluse_omandiliik_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_omandiliik_tekstina
     */
    public java.lang.String getOsaluse_omandiliik_tekstina() {
        return osaluse_omandiliik_tekstina;
    }


    /**
     * Sets the osaluse_omandiliik_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_omandiliik_tekstina
     */
    public void setOsaluse_omandiliik_tekstina(java.lang.String osaluse_omandiliik_tekstina) {
        this.osaluse_omandiliik_tekstina = osaluse_omandiliik_tekstina;
    }


    /**
     * Gets the osaluse_murdosa_lugeja value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_murdosa_lugeja
     */
    public java.math.BigInteger getOsaluse_murdosa_lugeja() {
        return osaluse_murdosa_lugeja;
    }


    /**
     * Sets the osaluse_murdosa_lugeja value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_murdosa_lugeja
     */
    public void setOsaluse_murdosa_lugeja(java.math.BigInteger osaluse_murdosa_lugeja) {
        this.osaluse_murdosa_lugeja = osaluse_murdosa_lugeja;
    }


    /**
     * Gets the osaluse_murdosa_nimetaja value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return osaluse_murdosa_nimetaja
     */
    public java.math.BigInteger getOsaluse_murdosa_nimetaja() {
        return osaluse_murdosa_nimetaja;
    }


    /**
     * Sets the osaluse_murdosa_nimetaja value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param osaluse_murdosa_nimetaja
     */
    public void setOsaluse_murdosa_nimetaja(java.math.BigInteger osaluse_murdosa_nimetaja) {
        this.osaluse_murdosa_nimetaja = osaluse_murdosa_nimetaja;
    }


    /**
     * Gets the volituste_loppemise_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return volituste_loppemise_kpv
     */
    public java.util.Date getVolituste_loppemise_kpv() {
        return volituste_loppemise_kpv;
    }


    /**
     * Sets the volituste_loppemise_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param volituste_loppemise_kpv
     */
    public void setVolituste_loppemise_kpv(java.util.Date volituste_loppemise_kpv) {
        this.volituste_loppemise_kpv = volituste_loppemise_kpv;
    }


    /**
     * Gets the kontrolli_allikas value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return kontrolli_allikas
     */
    public java.lang.String getKontrolli_allikas() {
        return kontrolli_allikas;
    }


    /**
     * Sets the kontrolli_allikas value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param kontrolli_allikas
     */
    public void setKontrolli_allikas(java.lang.String kontrolli_allikas) {
        this.kontrolli_allikas = kontrolli_allikas;
    }


    /**
     * Gets the kontrolli_allikas_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return kontrolli_allikas_tekstina
     */
    public java.lang.String getKontrolli_allikas_tekstina() {
        return kontrolli_allikas_tekstina;
    }


    /**
     * Sets the kontrolli_allikas_tekstina value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param kontrolli_allikas_tekstina
     */
    public void setKontrolli_allikas_tekstina(java.lang.String kontrolli_allikas_tekstina) {
        this.kontrolli_allikas_tekstina = kontrolli_allikas_tekstina;
    }


    /**
     * Gets the kontrolli_allika_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return kontrolli_allika_kpv
     */
    public java.util.Date getKontrolli_allika_kpv() {
        return kontrolli_allika_kpv;
    }


    /**
     * Sets the kontrolli_allika_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param kontrolli_allika_kpv
     */
    public void setKontrolli_allika_kpv(java.util.Date kontrolli_allika_kpv) {
        this.kontrolli_allika_kpv = kontrolli_allika_kpv;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the grupp value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @return grupp
     */
    public java.math.BigInteger getGrupp() {
        return grupp;
    }


    /**
     * Sets the grupp value for this Detailandmed_v5_kaardivaline_isik.
     * 
     * @param grupp
     */
    public void setGrupp(java.math.BigInteger grupp) {
        this.grupp = grupp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_kaardivaline_isik)) return false;
        Detailandmed_v5_kaardivaline_isik other = (Detailandmed_v5_kaardivaline_isik) obj;
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
            ((this.osaluse_protsent==null && other.getOsaluse_protsent()==null) || 
             (this.osaluse_protsent!=null &&
              this.osaluse_protsent.equals(other.getOsaluse_protsent()))) &&
            ((this.osaluse_suurus==null && other.getOsaluse_suurus()==null) || 
             (this.osaluse_suurus!=null &&
              this.osaluse_suurus.equals(other.getOsaluse_suurus()))) &&
            ((this.osaluse_valuuta==null && other.getOsaluse_valuuta()==null) || 
             (this.osaluse_valuuta!=null &&
              this.osaluse_valuuta.equals(other.getOsaluse_valuuta()))) &&
            ((this.osaluse_valuuta_tekstina==null && other.getOsaluse_valuuta_tekstina()==null) || 
             (this.osaluse_valuuta_tekstina!=null &&
              this.osaluse_valuuta_tekstina.equals(other.getOsaluse_valuuta_tekstina()))) &&
            ((this.osaluse_omandiliik==null && other.getOsaluse_omandiliik()==null) || 
             (this.osaluse_omandiliik!=null &&
              this.osaluse_omandiliik.equals(other.getOsaluse_omandiliik()))) &&
            ((this.osaluse_omandiliik_tekstina==null && other.getOsaluse_omandiliik_tekstina()==null) || 
             (this.osaluse_omandiliik_tekstina!=null &&
              this.osaluse_omandiliik_tekstina.equals(other.getOsaluse_omandiliik_tekstina()))) &&
            ((this.osaluse_murdosa_lugeja==null && other.getOsaluse_murdosa_lugeja()==null) || 
             (this.osaluse_murdosa_lugeja!=null &&
              this.osaluse_murdosa_lugeja.equals(other.getOsaluse_murdosa_lugeja()))) &&
            ((this.osaluse_murdosa_nimetaja==null && other.getOsaluse_murdosa_nimetaja()==null) || 
             (this.osaluse_murdosa_nimetaja!=null &&
              this.osaluse_murdosa_nimetaja.equals(other.getOsaluse_murdosa_nimetaja()))) &&
            ((this.volituste_loppemise_kpv==null && other.getVolituste_loppemise_kpv()==null) || 
             (this.volituste_loppemise_kpv!=null &&
              this.volituste_loppemise_kpv.equals(other.getVolituste_loppemise_kpv()))) &&
            ((this.kontrolli_allikas==null && other.getKontrolli_allikas()==null) || 
             (this.kontrolli_allikas!=null &&
              this.kontrolli_allikas.equals(other.getKontrolli_allikas()))) &&
            ((this.kontrolli_allikas_tekstina==null && other.getKontrolli_allikas_tekstina()==null) || 
             (this.kontrolli_allikas_tekstina!=null &&
              this.kontrolli_allikas_tekstina.equals(other.getKontrolli_allikas_tekstina()))) &&
            ((this.kontrolli_allika_kpv==null && other.getKontrolli_allika_kpv()==null) || 
             (this.kontrolli_allika_kpv!=null &&
              this.kontrolli_allika_kpv.equals(other.getKontrolli_allika_kpv()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv()))) &&
            ((this.grupp==null && other.getGrupp()==null) || 
             (this.grupp!=null &&
              this.grupp.equals(other.getGrupp())));
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
        if (getOsaluse_protsent() != null) {
            _hashCode += getOsaluse_protsent().hashCode();
        }
        if (getOsaluse_suurus() != null) {
            _hashCode += getOsaluse_suurus().hashCode();
        }
        if (getOsaluse_valuuta() != null) {
            _hashCode += getOsaluse_valuuta().hashCode();
        }
        if (getOsaluse_valuuta_tekstina() != null) {
            _hashCode += getOsaluse_valuuta_tekstina().hashCode();
        }
        if (getOsaluse_omandiliik() != null) {
            _hashCode += getOsaluse_omandiliik().hashCode();
        }
        if (getOsaluse_omandiliik_tekstina() != null) {
            _hashCode += getOsaluse_omandiliik_tekstina().hashCode();
        }
        if (getOsaluse_murdosa_lugeja() != null) {
            _hashCode += getOsaluse_murdosa_lugeja().hashCode();
        }
        if (getOsaluse_murdosa_nimetaja() != null) {
            _hashCode += getOsaluse_murdosa_nimetaja().hashCode();
        }
        if (getVolituste_loppemise_kpv() != null) {
            _hashCode += getVolituste_loppemise_kpv().hashCode();
        }
        if (getKontrolli_allikas() != null) {
            _hashCode += getKontrolli_allikas().hashCode();
        }
        if (getKontrolli_allikas_tekstina() != null) {
            _hashCode += getKontrolli_allikas_tekstina().hashCode();
        }
        if (getKontrolli_allika_kpv() != null) {
            _hashCode += getKontrolli_allika_kpv().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        if (getGrupp() != null) {
            _hashCode += getGrupp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
