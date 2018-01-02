/**
 * Detailandmed_v5_yldandmed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_yldandmed  implements java.io.Serializable {
    private java.math.BigInteger ettevotteregistri_nr;

    private java.util.Date esmaregistreerimise_kpv;

    private java.util.Date kustutamise_kpv;

    private java.lang.String staatus;

    private java.lang.String staatus_tekstina;

    private java.math.BigInteger piirkond;

    private java.lang.String piirkond_tekstina;

    private java.lang.String piirkond_tekstina_pikk;

    private java.lang.String tegutseb;

    private java.lang.String tegutseb_tekstina;

    private eu.x_road.arireg.producer.Detailandmed_v5_mkrreg_kuupaev[] mkr_reg_kpv;

    /* Täidetud vaid riigi ja KOV asutustel. */
    private eu.x_road.arireg.producer.Detailandmed_v5_raamatupidamiskohustus[] raamatupidamiskohustused;

    private eu.x_road.arireg.producer.Detailandmed_v5_teg_aeg[] ettevotja_tegevuse_aeg;

    private java.lang.Boolean evks_registreeritud;

    private java.util.Date evks_registreeritud_kande_kpv;

    private java.lang.String oiguslik_vorm;

    private java.math.BigInteger oiguslik_vorm_nr;

    private java.lang.String oiguslik_vorm_tekstina;

    private java.lang.String oigusliku_vormi_alaliik;

    private java.lang.String oigusliku_vormi_alaliik_tekstina;

    private eu.x_road.arireg.producer.Detailandmed_v5_sundlopetamine sundlopetamine;

    private eu.x_road.arireg.producer.Detailandmed_v5_staatus[] staatused;

    private eu.x_road.arireg.producer.Detailandmed_v5_valismaa_ariyhing valismaa_ariyhing;

    private eu.x_road.arireg.producer.Detailandmed_v5_arinimi[] arinimed;

    private eu.x_road.arireg.producer.Detailandmed_v5_aadress[] aadressid;

    private eu.x_road.arireg.producer.Detailandmed_v5_kinnisasi[] kinnisasjad;

    private eu.x_road.arireg.producer.Detailandmed_v5_oiguslik_vorm[] oiguslikud_vormid;

    private eu.x_road.arireg.producer.Detailandmed_v5_oigusliku_vormi_alaliik[] oigusliku_vormi_alaliigid;

    private eu.x_road.arireg.producer.Detailandmed_v5_kapital[] kapitalid;

    private eu.x_road.arireg.producer.Detailandmed_v5_nimivaartusetaaktsia[] nimivaartuseta_aktsiad;

    private eu.x_road.arireg.producer.Detailandmed_v5_oigusjargsus[] oigusjargsused;

    private eu.x_road.arireg.producer.Detailandmed_v5_seisundi_muutus[] seisundi_muutused;

    private eu.x_road.arireg.producer.Detailandmed_v5_majandusaasta[] majandusaastad;

    private eu.x_road.arireg.producer.Detailandmed_v5_pohikiri[] pohikirjad;

    private eu.x_road.arireg.producer.Detailandmed_v5_kompromissi_tahtaeg[] kompromissi_tahtajad;

    private eu.x_road.arireg.producer.Detailandmed_v5_asutamise_aeg[] asutamise_ajad;

    private eu.x_road.arireg.producer.Detailandmed_v5_tegutsemise_tahtaeg[] tegutsemise_tahtajad;

    private eu.x_road.arireg.producer.Detailandmed_v5_esmanimetamise_aeg[] esmanimetamise_ajad;

    private eu.x_road.arireg.producer.Detailandmed_v5_valisleping[] valislepingud;

    private eu.x_road.arireg.producer.Detailandmed_v5_markus_kaardil[] markused_kaardil;

    private eu.x_road.arireg.producer.Detailandmed_v5_tegevusala_kaardil[] tegevusalad_kaardil;

    private eu.x_road.arireg.producer.Detailandmed_v5_eesmark_kaardil[] eesmargid_kaardil;

    private eu.x_road.arireg.producer.Detailandmed_v5_sidevahend[] sidevahendid;

    private eu.x_road.arireg.producer.Detailandmed_v5_teatatud_tegevusala[] teatatud_tegevusalad;

    private eu.x_road.arireg.producer.Detailandmed_v5_aruande_info[] info_majandusaasta_aruannetest;

    private java.lang.Boolean asutatud_sissemakset_tegemata;

    /* Täidetud vaid riigi ja KOV asutustel. */
    private java.lang.Boolean on_raamatupidamiskohustuslane;

    public Detailandmed_v5_yldandmed() {
    }

    public Detailandmed_v5_yldandmed(
           java.math.BigInteger ettevotteregistri_nr,
           java.util.Date esmaregistreerimise_kpv,
           java.util.Date kustutamise_kpv,
           java.lang.String staatus,
           java.lang.String staatus_tekstina,
           java.math.BigInteger piirkond,
           java.lang.String piirkond_tekstina,
           java.lang.String piirkond_tekstina_pikk,
           java.lang.String tegutseb,
           java.lang.String tegutseb_tekstina,
           eu.x_road.arireg.producer.Detailandmed_v5_mkrreg_kuupaev[] mkr_reg_kpv,
           eu.x_road.arireg.producer.Detailandmed_v5_raamatupidamiskohustus[] raamatupidamiskohustused,
           eu.x_road.arireg.producer.Detailandmed_v5_teg_aeg[] ettevotja_tegevuse_aeg,
           java.lang.Boolean evks_registreeritud,
           java.util.Date evks_registreeritud_kande_kpv,
           java.lang.String oiguslik_vorm,
           java.math.BigInteger oiguslik_vorm_nr,
           java.lang.String oiguslik_vorm_tekstina,
           java.lang.String oigusliku_vormi_alaliik,
           java.lang.String oigusliku_vormi_alaliik_tekstina,
           eu.x_road.arireg.producer.Detailandmed_v5_sundlopetamine sundlopetamine,
           eu.x_road.arireg.producer.Detailandmed_v5_staatus[] staatused,
           eu.x_road.arireg.producer.Detailandmed_v5_valismaa_ariyhing valismaa_ariyhing,
           eu.x_road.arireg.producer.Detailandmed_v5_arinimi[] arinimed,
           eu.x_road.arireg.producer.Detailandmed_v5_aadress[] aadressid,
           eu.x_road.arireg.producer.Detailandmed_v5_kinnisasi[] kinnisasjad,
           eu.x_road.arireg.producer.Detailandmed_v5_oiguslik_vorm[] oiguslikud_vormid,
           eu.x_road.arireg.producer.Detailandmed_v5_oigusliku_vormi_alaliik[] oigusliku_vormi_alaliigid,
           eu.x_road.arireg.producer.Detailandmed_v5_kapital[] kapitalid,
           eu.x_road.arireg.producer.Detailandmed_v5_nimivaartusetaaktsia[] nimivaartuseta_aktsiad,
           eu.x_road.arireg.producer.Detailandmed_v5_oigusjargsus[] oigusjargsused,
           eu.x_road.arireg.producer.Detailandmed_v5_seisundi_muutus[] seisundi_muutused,
           eu.x_road.arireg.producer.Detailandmed_v5_majandusaasta[] majandusaastad,
           eu.x_road.arireg.producer.Detailandmed_v5_pohikiri[] pohikirjad,
           eu.x_road.arireg.producer.Detailandmed_v5_kompromissi_tahtaeg[] kompromissi_tahtajad,
           eu.x_road.arireg.producer.Detailandmed_v5_asutamise_aeg[] asutamise_ajad,
           eu.x_road.arireg.producer.Detailandmed_v5_tegutsemise_tahtaeg[] tegutsemise_tahtajad,
           eu.x_road.arireg.producer.Detailandmed_v5_esmanimetamise_aeg[] esmanimetamise_ajad,
           eu.x_road.arireg.producer.Detailandmed_v5_valisleping[] valislepingud,
           eu.x_road.arireg.producer.Detailandmed_v5_markus_kaardil[] markused_kaardil,
           eu.x_road.arireg.producer.Detailandmed_v5_tegevusala_kaardil[] tegevusalad_kaardil,
           eu.x_road.arireg.producer.Detailandmed_v5_eesmark_kaardil[] eesmargid_kaardil,
           eu.x_road.arireg.producer.Detailandmed_v5_sidevahend[] sidevahendid,
           eu.x_road.arireg.producer.Detailandmed_v5_teatatud_tegevusala[] teatatud_tegevusalad,
           eu.x_road.arireg.producer.Detailandmed_v5_aruande_info[] info_majandusaasta_aruannetest,
           java.lang.Boolean asutatud_sissemakset_tegemata,
           java.lang.Boolean on_raamatupidamiskohustuslane) {
           this.ettevotteregistri_nr = ettevotteregistri_nr;
           this.esmaregistreerimise_kpv = esmaregistreerimise_kpv;
           this.kustutamise_kpv = kustutamise_kpv;
           this.staatus = staatus;
           this.staatus_tekstina = staatus_tekstina;
           this.piirkond = piirkond;
           this.piirkond_tekstina = piirkond_tekstina;
           this.piirkond_tekstina_pikk = piirkond_tekstina_pikk;
           this.tegutseb = tegutseb;
           this.tegutseb_tekstina = tegutseb_tekstina;
           this.mkr_reg_kpv = mkr_reg_kpv;
           this.raamatupidamiskohustused = raamatupidamiskohustused;
           this.ettevotja_tegevuse_aeg = ettevotja_tegevuse_aeg;
           this.evks_registreeritud = evks_registreeritud;
           this.evks_registreeritud_kande_kpv = evks_registreeritud_kande_kpv;
           this.oiguslik_vorm = oiguslik_vorm;
           this.oiguslik_vorm_nr = oiguslik_vorm_nr;
           this.oiguslik_vorm_tekstina = oiguslik_vorm_tekstina;
           this.oigusliku_vormi_alaliik = oigusliku_vormi_alaliik;
           this.oigusliku_vormi_alaliik_tekstina = oigusliku_vormi_alaliik_tekstina;
           this.sundlopetamine = sundlopetamine;
           this.staatused = staatused;
           this.valismaa_ariyhing = valismaa_ariyhing;
           this.arinimed = arinimed;
           this.aadressid = aadressid;
           this.kinnisasjad = kinnisasjad;
           this.oiguslikud_vormid = oiguslikud_vormid;
           this.oigusliku_vormi_alaliigid = oigusliku_vormi_alaliigid;
           this.kapitalid = kapitalid;
           this.nimivaartuseta_aktsiad = nimivaartuseta_aktsiad;
           this.oigusjargsused = oigusjargsused;
           this.seisundi_muutused = seisundi_muutused;
           this.majandusaastad = majandusaastad;
           this.pohikirjad = pohikirjad;
           this.kompromissi_tahtajad = kompromissi_tahtajad;
           this.asutamise_ajad = asutamise_ajad;
           this.tegutsemise_tahtajad = tegutsemise_tahtajad;
           this.esmanimetamise_ajad = esmanimetamise_ajad;
           this.valislepingud = valislepingud;
           this.markused_kaardil = markused_kaardil;
           this.tegevusalad_kaardil = tegevusalad_kaardil;
           this.eesmargid_kaardil = eesmargid_kaardil;
           this.sidevahendid = sidevahendid;
           this.teatatud_tegevusalad = teatatud_tegevusalad;
           this.info_majandusaasta_aruannetest = info_majandusaasta_aruannetest;
           this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
           this.on_raamatupidamiskohustuslane = on_raamatupidamiskohustuslane;
    }


    /**
     * Gets the ettevotteregistri_nr value for this Detailandmed_v5_yldandmed.
     * 
     * @return ettevotteregistri_nr
     */
    public java.math.BigInteger getEttevotteregistri_nr() {
        return ettevotteregistri_nr;
    }


    /**
     * Sets the ettevotteregistri_nr value for this Detailandmed_v5_yldandmed.
     * 
     * @param ettevotteregistri_nr
     */
    public void setEttevotteregistri_nr(java.math.BigInteger ettevotteregistri_nr) {
        this.ettevotteregistri_nr = ettevotteregistri_nr;
    }


    /**
     * Gets the esmaregistreerimise_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @return esmaregistreerimise_kpv
     */
    public java.util.Date getEsmaregistreerimise_kpv() {
        return esmaregistreerimise_kpv;
    }


    /**
     * Sets the esmaregistreerimise_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @param esmaregistreerimise_kpv
     */
    public void setEsmaregistreerimise_kpv(java.util.Date esmaregistreerimise_kpv) {
        this.esmaregistreerimise_kpv = esmaregistreerimise_kpv;
    }


    /**
     * Gets the kustutamise_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @return kustutamise_kpv
     */
    public java.util.Date getKustutamise_kpv() {
        return kustutamise_kpv;
    }


    /**
     * Sets the kustutamise_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @param kustutamise_kpv
     */
    public void setKustutamise_kpv(java.util.Date kustutamise_kpv) {
        this.kustutamise_kpv = kustutamise_kpv;
    }


    /**
     * Gets the staatus value for this Detailandmed_v5_yldandmed.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Detailandmed_v5_yldandmed.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @return staatus_tekstina
     */
    public java.lang.String getStaatus_tekstina() {
        return staatus_tekstina;
    }


    /**
     * Sets the staatus_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @param staatus_tekstina
     */
    public void setStaatus_tekstina(java.lang.String staatus_tekstina) {
        this.staatus_tekstina = staatus_tekstina;
    }


    /**
     * Gets the piirkond value for this Detailandmed_v5_yldandmed.
     * 
     * @return piirkond
     */
    public java.math.BigInteger getPiirkond() {
        return piirkond;
    }


    /**
     * Sets the piirkond value for this Detailandmed_v5_yldandmed.
     * 
     * @param piirkond
     */
    public void setPiirkond(java.math.BigInteger piirkond) {
        this.piirkond = piirkond;
    }


    /**
     * Gets the piirkond_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @return piirkond_tekstina
     */
    public java.lang.String getPiirkond_tekstina() {
        return piirkond_tekstina;
    }


    /**
     * Sets the piirkond_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @param piirkond_tekstina
     */
    public void setPiirkond_tekstina(java.lang.String piirkond_tekstina) {
        this.piirkond_tekstina = piirkond_tekstina;
    }


    /**
     * Gets the piirkond_tekstina_pikk value for this Detailandmed_v5_yldandmed.
     * 
     * @return piirkond_tekstina_pikk
     */
    public java.lang.String getPiirkond_tekstina_pikk() {
        return piirkond_tekstina_pikk;
    }


    /**
     * Sets the piirkond_tekstina_pikk value for this Detailandmed_v5_yldandmed.
     * 
     * @param piirkond_tekstina_pikk
     */
    public void setPiirkond_tekstina_pikk(java.lang.String piirkond_tekstina_pikk) {
        this.piirkond_tekstina_pikk = piirkond_tekstina_pikk;
    }


    /**
     * Gets the tegutseb value for this Detailandmed_v5_yldandmed.
     * 
     * @return tegutseb
     */
    public java.lang.String getTegutseb() {
        return tegutseb;
    }


    /**
     * Sets the tegutseb value for this Detailandmed_v5_yldandmed.
     * 
     * @param tegutseb
     */
    public void setTegutseb(java.lang.String tegutseb) {
        this.tegutseb = tegutseb;
    }


    /**
     * Gets the tegutseb_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @return tegutseb_tekstina
     */
    public java.lang.String getTegutseb_tekstina() {
        return tegutseb_tekstina;
    }


    /**
     * Sets the tegutseb_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @param tegutseb_tekstina
     */
    public void setTegutseb_tekstina(java.lang.String tegutseb_tekstina) {
        this.tegutseb_tekstina = tegutseb_tekstina;
    }


    /**
     * Gets the mkr_reg_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @return mkr_reg_kpv
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_mkrreg_kuupaev[] getMkr_reg_kpv() {
        return mkr_reg_kpv;
    }


    /**
     * Sets the mkr_reg_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @param mkr_reg_kpv
     */
    public void setMkr_reg_kpv(eu.x_road.arireg.producer.Detailandmed_v5_mkrreg_kuupaev[] mkr_reg_kpv) {
        this.mkr_reg_kpv = mkr_reg_kpv;
    }


    /**
     * Gets the raamatupidamiskohustused value for this Detailandmed_v5_yldandmed.
     * 
     * @return raamatupidamiskohustused   * Täidetud vaid riigi ja KOV asutustel.
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_raamatupidamiskohustus[] getRaamatupidamiskohustused() {
        return raamatupidamiskohustused;
    }


    /**
     * Sets the raamatupidamiskohustused value for this Detailandmed_v5_yldandmed.
     * 
     * @param raamatupidamiskohustused   * Täidetud vaid riigi ja KOV asutustel.
     */
    public void setRaamatupidamiskohustused(eu.x_road.arireg.producer.Detailandmed_v5_raamatupidamiskohustus[] raamatupidamiskohustused) {
        this.raamatupidamiskohustused = raamatupidamiskohustused;
    }


    /**
     * Gets the ettevotja_tegevuse_aeg value for this Detailandmed_v5_yldandmed.
     * 
     * @return ettevotja_tegevuse_aeg
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_teg_aeg[] getEttevotja_tegevuse_aeg() {
        return ettevotja_tegevuse_aeg;
    }


    /**
     * Sets the ettevotja_tegevuse_aeg value for this Detailandmed_v5_yldandmed.
     * 
     * @param ettevotja_tegevuse_aeg
     */
    public void setEttevotja_tegevuse_aeg(eu.x_road.arireg.producer.Detailandmed_v5_teg_aeg[] ettevotja_tegevuse_aeg) {
        this.ettevotja_tegevuse_aeg = ettevotja_tegevuse_aeg;
    }


    /**
     * Gets the evks_registreeritud value for this Detailandmed_v5_yldandmed.
     * 
     * @return evks_registreeritud
     */
    public java.lang.Boolean getEvks_registreeritud() {
        return evks_registreeritud;
    }


    /**
     * Sets the evks_registreeritud value for this Detailandmed_v5_yldandmed.
     * 
     * @param evks_registreeritud
     */
    public void setEvks_registreeritud(java.lang.Boolean evks_registreeritud) {
        this.evks_registreeritud = evks_registreeritud;
    }


    /**
     * Gets the evks_registreeritud_kande_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @return evks_registreeritud_kande_kpv
     */
    public java.util.Date getEvks_registreeritud_kande_kpv() {
        return evks_registreeritud_kande_kpv;
    }


    /**
     * Sets the evks_registreeritud_kande_kpv value for this Detailandmed_v5_yldandmed.
     * 
     * @param evks_registreeritud_kande_kpv
     */
    public void setEvks_registreeritud_kande_kpv(java.util.Date evks_registreeritud_kande_kpv) {
        this.evks_registreeritud_kande_kpv = evks_registreeritud_kande_kpv;
    }


    /**
     * Gets the oiguslik_vorm value for this Detailandmed_v5_yldandmed.
     * 
     * @return oiguslik_vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Detailandmed_v5_yldandmed.
     * 
     * @param oiguslik_vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the oiguslik_vorm_nr value for this Detailandmed_v5_yldandmed.
     * 
     * @return oiguslik_vorm_nr
     */
    public java.math.BigInteger getOiguslik_vorm_nr() {
        return oiguslik_vorm_nr;
    }


    /**
     * Sets the oiguslik_vorm_nr value for this Detailandmed_v5_yldandmed.
     * 
     * @param oiguslik_vorm_nr
     */
    public void setOiguslik_vorm_nr(java.math.BigInteger oiguslik_vorm_nr) {
        this.oiguslik_vorm_nr = oiguslik_vorm_nr;
    }


    /**
     * Gets the oiguslik_vorm_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @return oiguslik_vorm_tekstina
     */
    public java.lang.String getOiguslik_vorm_tekstina() {
        return oiguslik_vorm_tekstina;
    }


    /**
     * Sets the oiguslik_vorm_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @param oiguslik_vorm_tekstina
     */
    public void setOiguslik_vorm_tekstina(java.lang.String oiguslik_vorm_tekstina) {
        this.oiguslik_vorm_tekstina = oiguslik_vorm_tekstina;
    }


    /**
     * Gets the oigusliku_vormi_alaliik value for this Detailandmed_v5_yldandmed.
     * 
     * @return oigusliku_vormi_alaliik
     */
    public java.lang.String getOigusliku_vormi_alaliik() {
        return oigusliku_vormi_alaliik;
    }


    /**
     * Sets the oigusliku_vormi_alaliik value for this Detailandmed_v5_yldandmed.
     * 
     * @param oigusliku_vormi_alaliik
     */
    public void setOigusliku_vormi_alaliik(java.lang.String oigusliku_vormi_alaliik) {
        this.oigusliku_vormi_alaliik = oigusliku_vormi_alaliik;
    }


    /**
     * Gets the oigusliku_vormi_alaliik_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @return oigusliku_vormi_alaliik_tekstina
     */
    public java.lang.String getOigusliku_vormi_alaliik_tekstina() {
        return oigusliku_vormi_alaliik_tekstina;
    }


    /**
     * Sets the oigusliku_vormi_alaliik_tekstina value for this Detailandmed_v5_yldandmed.
     * 
     * @param oigusliku_vormi_alaliik_tekstina
     */
    public void setOigusliku_vormi_alaliik_tekstina(java.lang.String oigusliku_vormi_alaliik_tekstina) {
        this.oigusliku_vormi_alaliik_tekstina = oigusliku_vormi_alaliik_tekstina;
    }


    /**
     * Gets the sundlopetamine value for this Detailandmed_v5_yldandmed.
     * 
     * @return sundlopetamine
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_sundlopetamine getSundlopetamine() {
        return sundlopetamine;
    }


    /**
     * Sets the sundlopetamine value for this Detailandmed_v5_yldandmed.
     * 
     * @param sundlopetamine
     */
    public void setSundlopetamine(eu.x_road.arireg.producer.Detailandmed_v5_sundlopetamine sundlopetamine) {
        this.sundlopetamine = sundlopetamine;
    }


    /**
     * Gets the staatused value for this Detailandmed_v5_yldandmed.
     * 
     * @return staatused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_staatus[] getStaatused() {
        return staatused;
    }


    /**
     * Sets the staatused value for this Detailandmed_v5_yldandmed.
     * 
     * @param staatused
     */
    public void setStaatused(eu.x_road.arireg.producer.Detailandmed_v5_staatus[] staatused) {
        this.staatused = staatused;
    }


    /**
     * Gets the valismaa_ariyhing value for this Detailandmed_v5_yldandmed.
     * 
     * @return valismaa_ariyhing
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_valismaa_ariyhing getValismaa_ariyhing() {
        return valismaa_ariyhing;
    }


    /**
     * Sets the valismaa_ariyhing value for this Detailandmed_v5_yldandmed.
     * 
     * @param valismaa_ariyhing
     */
    public void setValismaa_ariyhing(eu.x_road.arireg.producer.Detailandmed_v5_valismaa_ariyhing valismaa_ariyhing) {
        this.valismaa_ariyhing = valismaa_ariyhing;
    }


    /**
     * Gets the arinimed value for this Detailandmed_v5_yldandmed.
     * 
     * @return arinimed
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_arinimi[] getArinimed() {
        return arinimed;
    }


    /**
     * Sets the arinimed value for this Detailandmed_v5_yldandmed.
     * 
     * @param arinimed
     */
    public void setArinimed(eu.x_road.arireg.producer.Detailandmed_v5_arinimi[] arinimed) {
        this.arinimed = arinimed;
    }


    /**
     * Gets the aadressid value for this Detailandmed_v5_yldandmed.
     * 
     * @return aadressid
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_aadress[] getAadressid() {
        return aadressid;
    }


    /**
     * Sets the aadressid value for this Detailandmed_v5_yldandmed.
     * 
     * @param aadressid
     */
    public void setAadressid(eu.x_road.arireg.producer.Detailandmed_v5_aadress[] aadressid) {
        this.aadressid = aadressid;
    }


    /**
     * Gets the kinnisasjad value for this Detailandmed_v5_yldandmed.
     * 
     * @return kinnisasjad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kinnisasi[] getKinnisasjad() {
        return kinnisasjad;
    }


    /**
     * Sets the kinnisasjad value for this Detailandmed_v5_yldandmed.
     * 
     * @param kinnisasjad
     */
    public void setKinnisasjad(eu.x_road.arireg.producer.Detailandmed_v5_kinnisasi[] kinnisasjad) {
        this.kinnisasjad = kinnisasjad;
    }


    /**
     * Gets the oiguslikud_vormid value for this Detailandmed_v5_yldandmed.
     * 
     * @return oiguslikud_vormid
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_oiguslik_vorm[] getOiguslikud_vormid() {
        return oiguslikud_vormid;
    }


    /**
     * Sets the oiguslikud_vormid value for this Detailandmed_v5_yldandmed.
     * 
     * @param oiguslikud_vormid
     */
    public void setOiguslikud_vormid(eu.x_road.arireg.producer.Detailandmed_v5_oiguslik_vorm[] oiguslikud_vormid) {
        this.oiguslikud_vormid = oiguslikud_vormid;
    }


    /**
     * Gets the oigusliku_vormi_alaliigid value for this Detailandmed_v5_yldandmed.
     * 
     * @return oigusliku_vormi_alaliigid
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_oigusliku_vormi_alaliik[] getOigusliku_vormi_alaliigid() {
        return oigusliku_vormi_alaliigid;
    }


    /**
     * Sets the oigusliku_vormi_alaliigid value for this Detailandmed_v5_yldandmed.
     * 
     * @param oigusliku_vormi_alaliigid
     */
    public void setOigusliku_vormi_alaliigid(eu.x_road.arireg.producer.Detailandmed_v5_oigusliku_vormi_alaliik[] oigusliku_vormi_alaliigid) {
        this.oigusliku_vormi_alaliigid = oigusliku_vormi_alaliigid;
    }


    /**
     * Gets the kapitalid value for this Detailandmed_v5_yldandmed.
     * 
     * @return kapitalid
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kapital[] getKapitalid() {
        return kapitalid;
    }


    /**
     * Sets the kapitalid value for this Detailandmed_v5_yldandmed.
     * 
     * @param kapitalid
     */
    public void setKapitalid(eu.x_road.arireg.producer.Detailandmed_v5_kapital[] kapitalid) {
        this.kapitalid = kapitalid;
    }


    /**
     * Gets the nimivaartuseta_aktsiad value for this Detailandmed_v5_yldandmed.
     * 
     * @return nimivaartuseta_aktsiad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_nimivaartusetaaktsia[] getNimivaartuseta_aktsiad() {
        return nimivaartuseta_aktsiad;
    }


    /**
     * Sets the nimivaartuseta_aktsiad value for this Detailandmed_v5_yldandmed.
     * 
     * @param nimivaartuseta_aktsiad
     */
    public void setNimivaartuseta_aktsiad(eu.x_road.arireg.producer.Detailandmed_v5_nimivaartusetaaktsia[] nimivaartuseta_aktsiad) {
        this.nimivaartuseta_aktsiad = nimivaartuseta_aktsiad;
    }


    /**
     * Gets the oigusjargsused value for this Detailandmed_v5_yldandmed.
     * 
     * @return oigusjargsused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_oigusjargsus[] getOigusjargsused() {
        return oigusjargsused;
    }


    /**
     * Sets the oigusjargsused value for this Detailandmed_v5_yldandmed.
     * 
     * @param oigusjargsused
     */
    public void setOigusjargsused(eu.x_road.arireg.producer.Detailandmed_v5_oigusjargsus[] oigusjargsused) {
        this.oigusjargsused = oigusjargsused;
    }


    /**
     * Gets the seisundi_muutused value for this Detailandmed_v5_yldandmed.
     * 
     * @return seisundi_muutused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_seisundi_muutus[] getSeisundi_muutused() {
        return seisundi_muutused;
    }


    /**
     * Sets the seisundi_muutused value for this Detailandmed_v5_yldandmed.
     * 
     * @param seisundi_muutused
     */
    public void setSeisundi_muutused(eu.x_road.arireg.producer.Detailandmed_v5_seisundi_muutus[] seisundi_muutused) {
        this.seisundi_muutused = seisundi_muutused;
    }


    /**
     * Gets the majandusaastad value for this Detailandmed_v5_yldandmed.
     * 
     * @return majandusaastad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_majandusaasta[] getMajandusaastad() {
        return majandusaastad;
    }


    /**
     * Sets the majandusaastad value for this Detailandmed_v5_yldandmed.
     * 
     * @param majandusaastad
     */
    public void setMajandusaastad(eu.x_road.arireg.producer.Detailandmed_v5_majandusaasta[] majandusaastad) {
        this.majandusaastad = majandusaastad;
    }


    /**
     * Gets the pohikirjad value for this Detailandmed_v5_yldandmed.
     * 
     * @return pohikirjad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_pohikiri[] getPohikirjad() {
        return pohikirjad;
    }


    /**
     * Sets the pohikirjad value for this Detailandmed_v5_yldandmed.
     * 
     * @param pohikirjad
     */
    public void setPohikirjad(eu.x_road.arireg.producer.Detailandmed_v5_pohikiri[] pohikirjad) {
        this.pohikirjad = pohikirjad;
    }


    /**
     * Gets the kompromissi_tahtajad value for this Detailandmed_v5_yldandmed.
     * 
     * @return kompromissi_tahtajad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kompromissi_tahtaeg[] getKompromissi_tahtajad() {
        return kompromissi_tahtajad;
    }


    /**
     * Sets the kompromissi_tahtajad value for this Detailandmed_v5_yldandmed.
     * 
     * @param kompromissi_tahtajad
     */
    public void setKompromissi_tahtajad(eu.x_road.arireg.producer.Detailandmed_v5_kompromissi_tahtaeg[] kompromissi_tahtajad) {
        this.kompromissi_tahtajad = kompromissi_tahtajad;
    }


    /**
     * Gets the asutamise_ajad value for this Detailandmed_v5_yldandmed.
     * 
     * @return asutamise_ajad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_asutamise_aeg[] getAsutamise_ajad() {
        return asutamise_ajad;
    }


    /**
     * Sets the asutamise_ajad value for this Detailandmed_v5_yldandmed.
     * 
     * @param asutamise_ajad
     */
    public void setAsutamise_ajad(eu.x_road.arireg.producer.Detailandmed_v5_asutamise_aeg[] asutamise_ajad) {
        this.asutamise_ajad = asutamise_ajad;
    }


    /**
     * Gets the tegutsemise_tahtajad value for this Detailandmed_v5_yldandmed.
     * 
     * @return tegutsemise_tahtajad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_tegutsemise_tahtaeg[] getTegutsemise_tahtajad() {
        return tegutsemise_tahtajad;
    }


    /**
     * Sets the tegutsemise_tahtajad value for this Detailandmed_v5_yldandmed.
     * 
     * @param tegutsemise_tahtajad
     */
    public void setTegutsemise_tahtajad(eu.x_road.arireg.producer.Detailandmed_v5_tegutsemise_tahtaeg[] tegutsemise_tahtajad) {
        this.tegutsemise_tahtajad = tegutsemise_tahtajad;
    }


    /**
     * Gets the esmanimetamise_ajad value for this Detailandmed_v5_yldandmed.
     * 
     * @return esmanimetamise_ajad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_esmanimetamise_aeg[] getEsmanimetamise_ajad() {
        return esmanimetamise_ajad;
    }


    /**
     * Sets the esmanimetamise_ajad value for this Detailandmed_v5_yldandmed.
     * 
     * @param esmanimetamise_ajad
     */
    public void setEsmanimetamise_ajad(eu.x_road.arireg.producer.Detailandmed_v5_esmanimetamise_aeg[] esmanimetamise_ajad) {
        this.esmanimetamise_ajad = esmanimetamise_ajad;
    }


    /**
     * Gets the valislepingud value for this Detailandmed_v5_yldandmed.
     * 
     * @return valislepingud
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_valisleping[] getValislepingud() {
        return valislepingud;
    }


    /**
     * Sets the valislepingud value for this Detailandmed_v5_yldandmed.
     * 
     * @param valislepingud
     */
    public void setValislepingud(eu.x_road.arireg.producer.Detailandmed_v5_valisleping[] valislepingud) {
        this.valislepingud = valislepingud;
    }


    /**
     * Gets the markused_kaardil value for this Detailandmed_v5_yldandmed.
     * 
     * @return markused_kaardil
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_markus_kaardil[] getMarkused_kaardil() {
        return markused_kaardil;
    }


    /**
     * Sets the markused_kaardil value for this Detailandmed_v5_yldandmed.
     * 
     * @param markused_kaardil
     */
    public void setMarkused_kaardil(eu.x_road.arireg.producer.Detailandmed_v5_markus_kaardil[] markused_kaardil) {
        this.markused_kaardil = markused_kaardil;
    }


    /**
     * Gets the tegevusalad_kaardil value for this Detailandmed_v5_yldandmed.
     * 
     * @return tegevusalad_kaardil
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_tegevusala_kaardil[] getTegevusalad_kaardil() {
        return tegevusalad_kaardil;
    }


    /**
     * Sets the tegevusalad_kaardil value for this Detailandmed_v5_yldandmed.
     * 
     * @param tegevusalad_kaardil
     */
    public void setTegevusalad_kaardil(eu.x_road.arireg.producer.Detailandmed_v5_tegevusala_kaardil[] tegevusalad_kaardil) {
        this.tegevusalad_kaardil = tegevusalad_kaardil;
    }


    /**
     * Gets the eesmargid_kaardil value for this Detailandmed_v5_yldandmed.
     * 
     * @return eesmargid_kaardil
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_eesmark_kaardil[] getEesmargid_kaardil() {
        return eesmargid_kaardil;
    }


    /**
     * Sets the eesmargid_kaardil value for this Detailandmed_v5_yldandmed.
     * 
     * @param eesmargid_kaardil
     */
    public void setEesmargid_kaardil(eu.x_road.arireg.producer.Detailandmed_v5_eesmark_kaardil[] eesmargid_kaardil) {
        this.eesmargid_kaardil = eesmargid_kaardil;
    }


    /**
     * Gets the sidevahendid value for this Detailandmed_v5_yldandmed.
     * 
     * @return sidevahendid
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_sidevahend[] getSidevahendid() {
        return sidevahendid;
    }


    /**
     * Sets the sidevahendid value for this Detailandmed_v5_yldandmed.
     * 
     * @param sidevahendid
     */
    public void setSidevahendid(eu.x_road.arireg.producer.Detailandmed_v5_sidevahend[] sidevahendid) {
        this.sidevahendid = sidevahendid;
    }


    /**
     * Gets the teatatud_tegevusalad value for this Detailandmed_v5_yldandmed.
     * 
     * @return teatatud_tegevusalad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_teatatud_tegevusala[] getTeatatud_tegevusalad() {
        return teatatud_tegevusalad;
    }


    /**
     * Sets the teatatud_tegevusalad value for this Detailandmed_v5_yldandmed.
     * 
     * @param teatatud_tegevusalad
     */
    public void setTeatatud_tegevusalad(eu.x_road.arireg.producer.Detailandmed_v5_teatatud_tegevusala[] teatatud_tegevusalad) {
        this.teatatud_tegevusalad = teatatud_tegevusalad;
    }


    /**
     * Gets the info_majandusaasta_aruannetest value for this Detailandmed_v5_yldandmed.
     * 
     * @return info_majandusaasta_aruannetest
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_aruande_info[] getInfo_majandusaasta_aruannetest() {
        return info_majandusaasta_aruannetest;
    }


    /**
     * Sets the info_majandusaasta_aruannetest value for this Detailandmed_v5_yldandmed.
     * 
     * @param info_majandusaasta_aruannetest
     */
    public void setInfo_majandusaasta_aruannetest(eu.x_road.arireg.producer.Detailandmed_v5_aruande_info[] info_majandusaasta_aruannetest) {
        this.info_majandusaasta_aruannetest = info_majandusaasta_aruannetest;
    }


    /**
     * Gets the asutatud_sissemakset_tegemata value for this Detailandmed_v5_yldandmed.
     * 
     * @return asutatud_sissemakset_tegemata
     */
    public java.lang.Boolean getAsutatud_sissemakset_tegemata() {
        return asutatud_sissemakset_tegemata;
    }


    /**
     * Sets the asutatud_sissemakset_tegemata value for this Detailandmed_v5_yldandmed.
     * 
     * @param asutatud_sissemakset_tegemata
     */
    public void setAsutatud_sissemakset_tegemata(java.lang.Boolean asutatud_sissemakset_tegemata) {
        this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
    }


    /**
     * Gets the on_raamatupidamiskohustuslane value for this Detailandmed_v5_yldandmed.
     * 
     * @return on_raamatupidamiskohustuslane   * Täidetud vaid riigi ja KOV asutustel.
     */
    public java.lang.Boolean getOn_raamatupidamiskohustuslane() {
        return on_raamatupidamiskohustuslane;
    }


    /**
     * Sets the on_raamatupidamiskohustuslane value for this Detailandmed_v5_yldandmed.
     * 
     * @param on_raamatupidamiskohustuslane   * Täidetud vaid riigi ja KOV asutustel.
     */
    public void setOn_raamatupidamiskohustuslane(java.lang.Boolean on_raamatupidamiskohustuslane) {
        this.on_raamatupidamiskohustuslane = on_raamatupidamiskohustuslane;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_yldandmed)) return false;
        Detailandmed_v5_yldandmed other = (Detailandmed_v5_yldandmed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotteregistri_nr==null && other.getEttevotteregistri_nr()==null) || 
             (this.ettevotteregistri_nr!=null &&
              this.ettevotteregistri_nr.equals(other.getEttevotteregistri_nr()))) &&
            ((this.esmaregistreerimise_kpv==null && other.getEsmaregistreerimise_kpv()==null) || 
             (this.esmaregistreerimise_kpv!=null &&
              this.esmaregistreerimise_kpv.equals(other.getEsmaregistreerimise_kpv()))) &&
            ((this.kustutamise_kpv==null && other.getKustutamise_kpv()==null) || 
             (this.kustutamise_kpv!=null &&
              this.kustutamise_kpv.equals(other.getKustutamise_kpv()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_tekstina==null && other.getStaatus_tekstina()==null) || 
             (this.staatus_tekstina!=null &&
              this.staatus_tekstina.equals(other.getStaatus_tekstina()))) &&
            ((this.piirkond==null && other.getPiirkond()==null) || 
             (this.piirkond!=null &&
              this.piirkond.equals(other.getPiirkond()))) &&
            ((this.piirkond_tekstina==null && other.getPiirkond_tekstina()==null) || 
             (this.piirkond_tekstina!=null &&
              this.piirkond_tekstina.equals(other.getPiirkond_tekstina()))) &&
            ((this.piirkond_tekstina_pikk==null && other.getPiirkond_tekstina_pikk()==null) || 
             (this.piirkond_tekstina_pikk!=null &&
              this.piirkond_tekstina_pikk.equals(other.getPiirkond_tekstina_pikk()))) &&
            ((this.tegutseb==null && other.getTegutseb()==null) || 
             (this.tegutseb!=null &&
              this.tegutseb.equals(other.getTegutseb()))) &&
            ((this.tegutseb_tekstina==null && other.getTegutseb_tekstina()==null) || 
             (this.tegutseb_tekstina!=null &&
              this.tegutseb_tekstina.equals(other.getTegutseb_tekstina()))) &&
            ((this.mkr_reg_kpv==null && other.getMkr_reg_kpv()==null) || 
             (this.mkr_reg_kpv!=null &&
              java.util.Arrays.equals(this.mkr_reg_kpv, other.getMkr_reg_kpv()))) &&
            ((this.raamatupidamiskohustused==null && other.getRaamatupidamiskohustused()==null) || 
             (this.raamatupidamiskohustused!=null &&
              java.util.Arrays.equals(this.raamatupidamiskohustused, other.getRaamatupidamiskohustused()))) &&
            ((this.ettevotja_tegevuse_aeg==null && other.getEttevotja_tegevuse_aeg()==null) || 
             (this.ettevotja_tegevuse_aeg!=null &&
              java.util.Arrays.equals(this.ettevotja_tegevuse_aeg, other.getEttevotja_tegevuse_aeg()))) &&
            ((this.evks_registreeritud==null && other.getEvks_registreeritud()==null) || 
             (this.evks_registreeritud!=null &&
              this.evks_registreeritud.equals(other.getEvks_registreeritud()))) &&
            ((this.evks_registreeritud_kande_kpv==null && other.getEvks_registreeritud_kande_kpv()==null) || 
             (this.evks_registreeritud_kande_kpv!=null &&
              this.evks_registreeritud_kande_kpv.equals(other.getEvks_registreeritud_kande_kpv()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm()))) &&
            ((this.oiguslik_vorm_nr==null && other.getOiguslik_vorm_nr()==null) || 
             (this.oiguslik_vorm_nr!=null &&
              this.oiguslik_vorm_nr.equals(other.getOiguslik_vorm_nr()))) &&
            ((this.oiguslik_vorm_tekstina==null && other.getOiguslik_vorm_tekstina()==null) || 
             (this.oiguslik_vorm_tekstina!=null &&
              this.oiguslik_vorm_tekstina.equals(other.getOiguslik_vorm_tekstina()))) &&
            ((this.oigusliku_vormi_alaliik==null && other.getOigusliku_vormi_alaliik()==null) || 
             (this.oigusliku_vormi_alaliik!=null &&
              this.oigusliku_vormi_alaliik.equals(other.getOigusliku_vormi_alaliik()))) &&
            ((this.oigusliku_vormi_alaliik_tekstina==null && other.getOigusliku_vormi_alaliik_tekstina()==null) || 
             (this.oigusliku_vormi_alaliik_tekstina!=null &&
              this.oigusliku_vormi_alaliik_tekstina.equals(other.getOigusliku_vormi_alaliik_tekstina()))) &&
            ((this.sundlopetamine==null && other.getSundlopetamine()==null) || 
             (this.sundlopetamine!=null &&
              this.sundlopetamine.equals(other.getSundlopetamine()))) &&
            ((this.staatused==null && other.getStaatused()==null) || 
             (this.staatused!=null &&
              java.util.Arrays.equals(this.staatused, other.getStaatused()))) &&
            ((this.valismaa_ariyhing==null && other.getValismaa_ariyhing()==null) || 
             (this.valismaa_ariyhing!=null &&
              this.valismaa_ariyhing.equals(other.getValismaa_ariyhing()))) &&
            ((this.arinimed==null && other.getArinimed()==null) || 
             (this.arinimed!=null &&
              java.util.Arrays.equals(this.arinimed, other.getArinimed()))) &&
            ((this.aadressid==null && other.getAadressid()==null) || 
             (this.aadressid!=null &&
              java.util.Arrays.equals(this.aadressid, other.getAadressid()))) &&
            ((this.kinnisasjad==null && other.getKinnisasjad()==null) || 
             (this.kinnisasjad!=null &&
              java.util.Arrays.equals(this.kinnisasjad, other.getKinnisasjad()))) &&
            ((this.oiguslikud_vormid==null && other.getOiguslikud_vormid()==null) || 
             (this.oiguslikud_vormid!=null &&
              java.util.Arrays.equals(this.oiguslikud_vormid, other.getOiguslikud_vormid()))) &&
            ((this.oigusliku_vormi_alaliigid==null && other.getOigusliku_vormi_alaliigid()==null) || 
             (this.oigusliku_vormi_alaliigid!=null &&
              java.util.Arrays.equals(this.oigusliku_vormi_alaliigid, other.getOigusliku_vormi_alaliigid()))) &&
            ((this.kapitalid==null && other.getKapitalid()==null) || 
             (this.kapitalid!=null &&
              java.util.Arrays.equals(this.kapitalid, other.getKapitalid()))) &&
            ((this.nimivaartuseta_aktsiad==null && other.getNimivaartuseta_aktsiad()==null) || 
             (this.nimivaartuseta_aktsiad!=null &&
              java.util.Arrays.equals(this.nimivaartuseta_aktsiad, other.getNimivaartuseta_aktsiad()))) &&
            ((this.oigusjargsused==null && other.getOigusjargsused()==null) || 
             (this.oigusjargsused!=null &&
              java.util.Arrays.equals(this.oigusjargsused, other.getOigusjargsused()))) &&
            ((this.seisundi_muutused==null && other.getSeisundi_muutused()==null) || 
             (this.seisundi_muutused!=null &&
              java.util.Arrays.equals(this.seisundi_muutused, other.getSeisundi_muutused()))) &&
            ((this.majandusaastad==null && other.getMajandusaastad()==null) || 
             (this.majandusaastad!=null &&
              java.util.Arrays.equals(this.majandusaastad, other.getMajandusaastad()))) &&
            ((this.pohikirjad==null && other.getPohikirjad()==null) || 
             (this.pohikirjad!=null &&
              java.util.Arrays.equals(this.pohikirjad, other.getPohikirjad()))) &&
            ((this.kompromissi_tahtajad==null && other.getKompromissi_tahtajad()==null) || 
             (this.kompromissi_tahtajad!=null &&
              java.util.Arrays.equals(this.kompromissi_tahtajad, other.getKompromissi_tahtajad()))) &&
            ((this.asutamise_ajad==null && other.getAsutamise_ajad()==null) || 
             (this.asutamise_ajad!=null &&
              java.util.Arrays.equals(this.asutamise_ajad, other.getAsutamise_ajad()))) &&
            ((this.tegutsemise_tahtajad==null && other.getTegutsemise_tahtajad()==null) || 
             (this.tegutsemise_tahtajad!=null &&
              java.util.Arrays.equals(this.tegutsemise_tahtajad, other.getTegutsemise_tahtajad()))) &&
            ((this.esmanimetamise_ajad==null && other.getEsmanimetamise_ajad()==null) || 
             (this.esmanimetamise_ajad!=null &&
              java.util.Arrays.equals(this.esmanimetamise_ajad, other.getEsmanimetamise_ajad()))) &&
            ((this.valislepingud==null && other.getValislepingud()==null) || 
             (this.valislepingud!=null &&
              java.util.Arrays.equals(this.valislepingud, other.getValislepingud()))) &&
            ((this.markused_kaardil==null && other.getMarkused_kaardil()==null) || 
             (this.markused_kaardil!=null &&
              java.util.Arrays.equals(this.markused_kaardil, other.getMarkused_kaardil()))) &&
            ((this.tegevusalad_kaardil==null && other.getTegevusalad_kaardil()==null) || 
             (this.tegevusalad_kaardil!=null &&
              java.util.Arrays.equals(this.tegevusalad_kaardil, other.getTegevusalad_kaardil()))) &&
            ((this.eesmargid_kaardil==null && other.getEesmargid_kaardil()==null) || 
             (this.eesmargid_kaardil!=null &&
              java.util.Arrays.equals(this.eesmargid_kaardil, other.getEesmargid_kaardil()))) &&
            ((this.sidevahendid==null && other.getSidevahendid()==null) || 
             (this.sidevahendid!=null &&
              java.util.Arrays.equals(this.sidevahendid, other.getSidevahendid()))) &&
            ((this.teatatud_tegevusalad==null && other.getTeatatud_tegevusalad()==null) || 
             (this.teatatud_tegevusalad!=null &&
              java.util.Arrays.equals(this.teatatud_tegevusalad, other.getTeatatud_tegevusalad()))) &&
            ((this.info_majandusaasta_aruannetest==null && other.getInfo_majandusaasta_aruannetest()==null) || 
             (this.info_majandusaasta_aruannetest!=null &&
              java.util.Arrays.equals(this.info_majandusaasta_aruannetest, other.getInfo_majandusaasta_aruannetest()))) &&
            ((this.asutatud_sissemakset_tegemata==null && other.getAsutatud_sissemakset_tegemata()==null) || 
             (this.asutatud_sissemakset_tegemata!=null &&
              this.asutatud_sissemakset_tegemata.equals(other.getAsutatud_sissemakset_tegemata()))) &&
            ((this.on_raamatupidamiskohustuslane==null && other.getOn_raamatupidamiskohustuslane()==null) || 
             (this.on_raamatupidamiskohustuslane!=null &&
              this.on_raamatupidamiskohustuslane.equals(other.getOn_raamatupidamiskohustuslane())));
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
        if (getEttevotteregistri_nr() != null) {
            _hashCode += getEttevotteregistri_nr().hashCode();
        }
        if (getEsmaregistreerimise_kpv() != null) {
            _hashCode += getEsmaregistreerimise_kpv().hashCode();
        }
        if (getKustutamise_kpv() != null) {
            _hashCode += getKustutamise_kpv().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_tekstina() != null) {
            _hashCode += getStaatus_tekstina().hashCode();
        }
        if (getPiirkond() != null) {
            _hashCode += getPiirkond().hashCode();
        }
        if (getPiirkond_tekstina() != null) {
            _hashCode += getPiirkond_tekstina().hashCode();
        }
        if (getPiirkond_tekstina_pikk() != null) {
            _hashCode += getPiirkond_tekstina_pikk().hashCode();
        }
        if (getTegutseb() != null) {
            _hashCode += getTegutseb().hashCode();
        }
        if (getTegutseb_tekstina() != null) {
            _hashCode += getTegutseb_tekstina().hashCode();
        }
        if (getMkr_reg_kpv() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMkr_reg_kpv());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMkr_reg_kpv(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRaamatupidamiskohustused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRaamatupidamiskohustused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRaamatupidamiskohustused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEttevotja_tegevuse_aeg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotja_tegevuse_aeg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotja_tegevuse_aeg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvks_registreeritud() != null) {
            _hashCode += getEvks_registreeritud().hashCode();
        }
        if (getEvks_registreeritud_kande_kpv() != null) {
            _hashCode += getEvks_registreeritud_kande_kpv().hashCode();
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        if (getOiguslik_vorm_nr() != null) {
            _hashCode += getOiguslik_vorm_nr().hashCode();
        }
        if (getOiguslik_vorm_tekstina() != null) {
            _hashCode += getOiguslik_vorm_tekstina().hashCode();
        }
        if (getOigusliku_vormi_alaliik() != null) {
            _hashCode += getOigusliku_vormi_alaliik().hashCode();
        }
        if (getOigusliku_vormi_alaliik_tekstina() != null) {
            _hashCode += getOigusliku_vormi_alaliik_tekstina().hashCode();
        }
        if (getSundlopetamine() != null) {
            _hashCode += getSundlopetamine().hashCode();
        }
        if (getStaatused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaatused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaatused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValismaa_ariyhing() != null) {
            _hashCode += getValismaa_ariyhing().hashCode();
        }
        if (getArinimed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArinimed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArinimed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAadressid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAadressid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAadressid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKinnisasjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKinnisasjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKinnisasjad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOiguslikud_vormid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOiguslikud_vormid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOiguslikud_vormid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOigusliku_vormi_alaliigid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOigusliku_vormi_alaliigid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOigusliku_vormi_alaliigid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKapitalid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKapitalid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKapitalid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNimivaartuseta_aktsiad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNimivaartuseta_aktsiad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNimivaartuseta_aktsiad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOigusjargsused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOigusjargsused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOigusjargsused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeisundi_muutused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeisundi_muutused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeisundi_muutused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMajandusaastad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMajandusaastad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMajandusaastad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPohikirjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPohikirjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPohikirjad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKompromissi_tahtajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKompromissi_tahtajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKompromissi_tahtajad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsutamise_ajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsutamise_ajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsutamise_ajad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTegutsemise_tahtajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegutsemise_tahtajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegutsemise_tahtajad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEsmanimetamise_ajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEsmanimetamise_ajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEsmanimetamise_ajad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValislepingud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValislepingud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValislepingud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarkused_kaardil() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkused_kaardil());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkused_kaardil(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTegevusalad_kaardil() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusalad_kaardil());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusalad_kaardil(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEesmargid_kaardil() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEesmargid_kaardil());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEesmargid_kaardil(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSidevahendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSidevahendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSidevahendid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTeatatud_tegevusalad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeatatud_tegevusalad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeatatud_tegevusalad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInfo_majandusaasta_aruannetest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfo_majandusaasta_aruannetest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfo_majandusaasta_aruannetest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsutatud_sissemakset_tegemata() != null) {
            _hashCode += getAsutatud_sissemakset_tegemata().hashCode();
        }
        if (getOn_raamatupidamiskohustuslane() != null) {
            _hashCode += getOn_raamatupidamiskohustuslane().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
