/**
 * Sooritakanne_kandesisu_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_kandesisu_v4  implements java.io.Serializable {
    /* Uus ärinimi nii muutmiskande kui esmakande korral. */
    private java.lang.String uus_arinimi;

    /* Korteriühistu täiendav nimi. */
    private java.lang.String taiendav_nimi;

    private java.lang.String oiguslik_vorm;

    private java.lang.String oigusliku_vormi_alaliik;

    private eu.x_road.arireg.producer.AadressType_v4 asukoht;

    private eu.x_road.arireg.producer.Ev_seisundType_v4 ev_seisund;

    private eu.x_road.arireg.producer.TegevusalaType_v4 pohitegevusala;

    private eu.x_road.arireg.producer.TegevusalaType_v4 lisategevusala;

    /* SA/TÜ eesmärk */
    private eu.x_road.arireg.producer.EesmargidType_v4[] eesmargid;

    private eu.x_road.arireg.producer.Sooritakanne_majaasta_v4 majandusaasta;

    /* Äriühingu kogukapitali suurus */
    private eu.x_road.arireg.producer.Sooritakanne_kapital_v4 kapital;

    /* Äriühingu kapitali tinglik suurendamine */
    private eu.x_road.arireg.producer.Sooritakanne_kapitali_tingimuslik_suurendamine_v4 kapitali_tingimuslik_suurendamine;

    /* Äriühingu nimiväärtuseta aktsiate arv */
    private java.math.BigInteger nimivaartuseta_aktsiate_arv;

    private java.lang.Boolean asutatud_sissemakset_tegemata;

    /* Kandes määratakse ainult tehtavad muudatused */
    private eu.x_road.arireg.producer.OmandiOsadType_v4[] omandi_osad;

    /* Isikute massiiv, nii registrikaardile kantavad isikud kui ka
     * kaardivälised isikud */
    private eu.x_road.arireg.producer.IsikType_v4[] isikud;

    /* STORK esindajate massiiv */
    private eu.x_road.arireg.producer.IsikesindajastorkType_v4[] isikud_esindajad_stork;

    private eu.x_road.arireg.producer.EsindusoigusType_v4[] esindusoigused;

    private eu.x_road.arireg.producer.Sooritakanne_pohikiri_v4 pohikiri;

    /* Kandega pannakse kaasa täiskomplekt sidevahendeid, mitte ainult
     * muudatused??? */
    private eu.x_road.arireg.producer.SidevahendType_v4[] sidevahendid;

    private java.lang.String[] markused;

    /* SA alustamise kuupäev */
    private java.util.Date tegutsemise_algus;

    /* MTÜ/SA tegutsemise tähtaeg */
    private java.util.Date tegutsemise_tahtaeg;

    /* Kirikl. ühenduse asutamise või esmamainimise aeg */
    private java.lang.String asutamise_aeg;

    private java.lang.String viide_eelkaijale;

    /* Kas asutus on raamatupidamiskohustuslane (JAH/EI) */
    private java.lang.String on_raamatupidamiskohuslane;

    /* Kandega antakse kaasa täiskomplekt andmeid */
    private eu.x_road.arireg.producer.KinnisasiType_v4[] kinnisasjad;

    /* Välismaa ettevõtte filiaali registreerimisel. (Juhatajad lähevad
     * SJESI isikurolliga isikute node'sse) */
    private eu.x_road.arireg.producer.Valismaa_emaettevoteType_v4 valismaa_emaettevote;

    /* FIE seisundid */
    private eu.x_road.arireg.producer.Fie_seisundType_v4[] fie_seisundid;

    /* FIE MKR-s registreerimise kuupäev */
    private java.util.Date maks_reg_kpv;

    /* Elamu aadressid ja katastriüksuse tunnused */
    private eu.x_road.arireg.producer.AadresskatastrigaType_v4[] elamu_aadressid;

    /* Korteriomandi kinnistu registriosa numbrid */
    private java.lang.String[] korteriomandi_kinnistud;

    /* Märkused korteriühistu eelmise majandusaasta majandamiskulude
     * summat ületava laenu kohta */
    private eu.x_road.arireg.producer.MarkusLiigigaTegevusega[] markused_mlaen;

    private java.lang.String asutalus_tekstina;

    private java.lang.String kustalus_tekstina;

    public Sooritakanne_kandesisu_v4() {
    }

    public Sooritakanne_kandesisu_v4(
           java.lang.String uus_arinimi,
           java.lang.String taiendav_nimi,
           java.lang.String oiguslik_vorm,
           java.lang.String oigusliku_vormi_alaliik,
           eu.x_road.arireg.producer.AadressType_v4 asukoht,
           eu.x_road.arireg.producer.Ev_seisundType_v4 ev_seisund,
           eu.x_road.arireg.producer.TegevusalaType_v4 pohitegevusala,
           eu.x_road.arireg.producer.TegevusalaType_v4 lisategevusala,
           eu.x_road.arireg.producer.EesmargidType_v4[] eesmargid,
           eu.x_road.arireg.producer.Sooritakanne_majaasta_v4 majandusaasta,
           eu.x_road.arireg.producer.Sooritakanne_kapital_v4 kapital,
           eu.x_road.arireg.producer.Sooritakanne_kapitali_tingimuslik_suurendamine_v4 kapitali_tingimuslik_suurendamine,
           java.math.BigInteger nimivaartuseta_aktsiate_arv,
           java.lang.Boolean asutatud_sissemakset_tegemata,
           eu.x_road.arireg.producer.OmandiOsadType_v4[] omandi_osad,
           eu.x_road.arireg.producer.IsikType_v4[] isikud,
           eu.x_road.arireg.producer.IsikesindajastorkType_v4[] isikud_esindajad_stork,
           eu.x_road.arireg.producer.EsindusoigusType_v4[] esindusoigused,
           eu.x_road.arireg.producer.Sooritakanne_pohikiri_v4 pohikiri,
           eu.x_road.arireg.producer.SidevahendType_v4[] sidevahendid,
           java.lang.String[] markused,
           java.util.Date tegutsemise_algus,
           java.util.Date tegutsemise_tahtaeg,
           java.lang.String asutamise_aeg,
           java.lang.String viide_eelkaijale,
           java.lang.String on_raamatupidamiskohuslane,
           eu.x_road.arireg.producer.KinnisasiType_v4[] kinnisasjad,
           eu.x_road.arireg.producer.Valismaa_emaettevoteType_v4 valismaa_emaettevote,
           eu.x_road.arireg.producer.Fie_seisundType_v4[] fie_seisundid,
           java.util.Date maks_reg_kpv,
           eu.x_road.arireg.producer.AadresskatastrigaType_v4[] elamu_aadressid,
           java.lang.String[] korteriomandi_kinnistud,
           eu.x_road.arireg.producer.MarkusLiigigaTegevusega[] markused_mlaen,
           java.lang.String asutalus_tekstina,
           java.lang.String kustalus_tekstina) {
           this.uus_arinimi = uus_arinimi;
           this.taiendav_nimi = taiendav_nimi;
           this.oiguslik_vorm = oiguslik_vorm;
           this.oigusliku_vormi_alaliik = oigusliku_vormi_alaliik;
           this.asukoht = asukoht;
           this.ev_seisund = ev_seisund;
           this.pohitegevusala = pohitegevusala;
           this.lisategevusala = lisategevusala;
           this.eesmargid = eesmargid;
           this.majandusaasta = majandusaasta;
           this.kapital = kapital;
           this.kapitali_tingimuslik_suurendamine = kapitali_tingimuslik_suurendamine;
           this.nimivaartuseta_aktsiate_arv = nimivaartuseta_aktsiate_arv;
           this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
           this.omandi_osad = omandi_osad;
           this.isikud = isikud;
           this.isikud_esindajad_stork = isikud_esindajad_stork;
           this.esindusoigused = esindusoigused;
           this.pohikiri = pohikiri;
           this.sidevahendid = sidevahendid;
           this.markused = markused;
           this.tegutsemise_algus = tegutsemise_algus;
           this.tegutsemise_tahtaeg = tegutsemise_tahtaeg;
           this.asutamise_aeg = asutamise_aeg;
           this.viide_eelkaijale = viide_eelkaijale;
           this.on_raamatupidamiskohuslane = on_raamatupidamiskohuslane;
           this.kinnisasjad = kinnisasjad;
           this.valismaa_emaettevote = valismaa_emaettevote;
           this.fie_seisundid = fie_seisundid;
           this.maks_reg_kpv = maks_reg_kpv;
           this.elamu_aadressid = elamu_aadressid;
           this.korteriomandi_kinnistud = korteriomandi_kinnistud;
           this.markused_mlaen = markused_mlaen;
           this.asutalus_tekstina = asutalus_tekstina;
           this.kustalus_tekstina = kustalus_tekstina;
    }


    /**
     * Gets the uus_arinimi value for this Sooritakanne_kandesisu_v4.
     * 
     * @return uus_arinimi   * Uus ärinimi nii muutmiskande kui esmakande korral.
     */
    public java.lang.String getUus_arinimi() {
        return uus_arinimi;
    }


    /**
     * Sets the uus_arinimi value for this Sooritakanne_kandesisu_v4.
     * 
     * @param uus_arinimi   * Uus ärinimi nii muutmiskande kui esmakande korral.
     */
    public void setUus_arinimi(java.lang.String uus_arinimi) {
        this.uus_arinimi = uus_arinimi;
    }


    /**
     * Gets the taiendav_nimi value for this Sooritakanne_kandesisu_v4.
     * 
     * @return taiendav_nimi   * Korteriühistu täiendav nimi.
     */
    public java.lang.String getTaiendav_nimi() {
        return taiendav_nimi;
    }


    /**
     * Sets the taiendav_nimi value for this Sooritakanne_kandesisu_v4.
     * 
     * @param taiendav_nimi   * Korteriühistu täiendav nimi.
     */
    public void setTaiendav_nimi(java.lang.String taiendav_nimi) {
        this.taiendav_nimi = taiendav_nimi;
    }


    /**
     * Gets the oiguslik_vorm value for this Sooritakanne_kandesisu_v4.
     * 
     * @return oiguslik_vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Sooritakanne_kandesisu_v4.
     * 
     * @param oiguslik_vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the oigusliku_vormi_alaliik value for this Sooritakanne_kandesisu_v4.
     * 
     * @return oigusliku_vormi_alaliik
     */
    public java.lang.String getOigusliku_vormi_alaliik() {
        return oigusliku_vormi_alaliik;
    }


    /**
     * Sets the oigusliku_vormi_alaliik value for this Sooritakanne_kandesisu_v4.
     * 
     * @param oigusliku_vormi_alaliik
     */
    public void setOigusliku_vormi_alaliik(java.lang.String oigusliku_vormi_alaliik) {
        this.oigusliku_vormi_alaliik = oigusliku_vormi_alaliik;
    }


    /**
     * Gets the asukoht value for this Sooritakanne_kandesisu_v4.
     * 
     * @return asukoht
     */
    public eu.x_road.arireg.producer.AadressType_v4 getAsukoht() {
        return asukoht;
    }


    /**
     * Sets the asukoht value for this Sooritakanne_kandesisu_v4.
     * 
     * @param asukoht
     */
    public void setAsukoht(eu.x_road.arireg.producer.AadressType_v4 asukoht) {
        this.asukoht = asukoht;
    }


    /**
     * Gets the ev_seisund value for this Sooritakanne_kandesisu_v4.
     * 
     * @return ev_seisund
     */
    public eu.x_road.arireg.producer.Ev_seisundType_v4 getEv_seisund() {
        return ev_seisund;
    }


    /**
     * Sets the ev_seisund value for this Sooritakanne_kandesisu_v4.
     * 
     * @param ev_seisund
     */
    public void setEv_seisund(eu.x_road.arireg.producer.Ev_seisundType_v4 ev_seisund) {
        this.ev_seisund = ev_seisund;
    }


    /**
     * Gets the pohitegevusala value for this Sooritakanne_kandesisu_v4.
     * 
     * @return pohitegevusala
     */
    public eu.x_road.arireg.producer.TegevusalaType_v4 getPohitegevusala() {
        return pohitegevusala;
    }


    /**
     * Sets the pohitegevusala value for this Sooritakanne_kandesisu_v4.
     * 
     * @param pohitegevusala
     */
    public void setPohitegevusala(eu.x_road.arireg.producer.TegevusalaType_v4 pohitegevusala) {
        this.pohitegevusala = pohitegevusala;
    }


    /**
     * Gets the lisategevusala value for this Sooritakanne_kandesisu_v4.
     * 
     * @return lisategevusala
     */
    public eu.x_road.arireg.producer.TegevusalaType_v4 getLisategevusala() {
        return lisategevusala;
    }


    /**
     * Sets the lisategevusala value for this Sooritakanne_kandesisu_v4.
     * 
     * @param lisategevusala
     */
    public void setLisategevusala(eu.x_road.arireg.producer.TegevusalaType_v4 lisategevusala) {
        this.lisategevusala = lisategevusala;
    }


    /**
     * Gets the eesmargid value for this Sooritakanne_kandesisu_v4.
     * 
     * @return eesmargid   * SA/TÜ eesmärk
     */
    public eu.x_road.arireg.producer.EesmargidType_v4[] getEesmargid() {
        return eesmargid;
    }


    /**
     * Sets the eesmargid value for this Sooritakanne_kandesisu_v4.
     * 
     * @param eesmargid   * SA/TÜ eesmärk
     */
    public void setEesmargid(eu.x_road.arireg.producer.EesmargidType_v4[] eesmargid) {
        this.eesmargid = eesmargid;
    }

    public eu.x_road.arireg.producer.EesmargidType_v4 getEesmargid(int i) {
        return this.eesmargid[i];
    }

    public void setEesmargid(int i, eu.x_road.arireg.producer.EesmargidType_v4 _value) {
        this.eesmargid[i] = _value;
    }


    /**
     * Gets the majandusaasta value for this Sooritakanne_kandesisu_v4.
     * 
     * @return majandusaasta
     */
    public eu.x_road.arireg.producer.Sooritakanne_majaasta_v4 getMajandusaasta() {
        return majandusaasta;
    }


    /**
     * Sets the majandusaasta value for this Sooritakanne_kandesisu_v4.
     * 
     * @param majandusaasta
     */
    public void setMajandusaasta(eu.x_road.arireg.producer.Sooritakanne_majaasta_v4 majandusaasta) {
        this.majandusaasta = majandusaasta;
    }


    /**
     * Gets the kapital value for this Sooritakanne_kandesisu_v4.
     * 
     * @return kapital   * Äriühingu kogukapitali suurus
     */
    public eu.x_road.arireg.producer.Sooritakanne_kapital_v4 getKapital() {
        return kapital;
    }


    /**
     * Sets the kapital value for this Sooritakanne_kandesisu_v4.
     * 
     * @param kapital   * Äriühingu kogukapitali suurus
     */
    public void setKapital(eu.x_road.arireg.producer.Sooritakanne_kapital_v4 kapital) {
        this.kapital = kapital;
    }


    /**
     * Gets the kapitali_tingimuslik_suurendamine value for this Sooritakanne_kandesisu_v4.
     * 
     * @return kapitali_tingimuslik_suurendamine   * Äriühingu kapitali tinglik suurendamine
     */
    public eu.x_road.arireg.producer.Sooritakanne_kapitali_tingimuslik_suurendamine_v4 getKapitali_tingimuslik_suurendamine() {
        return kapitali_tingimuslik_suurendamine;
    }


    /**
     * Sets the kapitali_tingimuslik_suurendamine value for this Sooritakanne_kandesisu_v4.
     * 
     * @param kapitali_tingimuslik_suurendamine   * Äriühingu kapitali tinglik suurendamine
     */
    public void setKapitali_tingimuslik_suurendamine(eu.x_road.arireg.producer.Sooritakanne_kapitali_tingimuslik_suurendamine_v4 kapitali_tingimuslik_suurendamine) {
        this.kapitali_tingimuslik_suurendamine = kapitali_tingimuslik_suurendamine;
    }


    /**
     * Gets the nimivaartuseta_aktsiate_arv value for this Sooritakanne_kandesisu_v4.
     * 
     * @return nimivaartuseta_aktsiate_arv   * Äriühingu nimiväärtuseta aktsiate arv
     */
    public java.math.BigInteger getNimivaartuseta_aktsiate_arv() {
        return nimivaartuseta_aktsiate_arv;
    }


    /**
     * Sets the nimivaartuseta_aktsiate_arv value for this Sooritakanne_kandesisu_v4.
     * 
     * @param nimivaartuseta_aktsiate_arv   * Äriühingu nimiväärtuseta aktsiate arv
     */
    public void setNimivaartuseta_aktsiate_arv(java.math.BigInteger nimivaartuseta_aktsiate_arv) {
        this.nimivaartuseta_aktsiate_arv = nimivaartuseta_aktsiate_arv;
    }


    /**
     * Gets the asutatud_sissemakset_tegemata value for this Sooritakanne_kandesisu_v4.
     * 
     * @return asutatud_sissemakset_tegemata
     */
    public java.lang.Boolean getAsutatud_sissemakset_tegemata() {
        return asutatud_sissemakset_tegemata;
    }


    /**
     * Sets the asutatud_sissemakset_tegemata value for this Sooritakanne_kandesisu_v4.
     * 
     * @param asutatud_sissemakset_tegemata
     */
    public void setAsutatud_sissemakset_tegemata(java.lang.Boolean asutatud_sissemakset_tegemata) {
        this.asutatud_sissemakset_tegemata = asutatud_sissemakset_tegemata;
    }


    /**
     * Gets the omandi_osad value for this Sooritakanne_kandesisu_v4.
     * 
     * @return omandi_osad   * Kandes määratakse ainult tehtavad muudatused
     */
    public eu.x_road.arireg.producer.OmandiOsadType_v4[] getOmandi_osad() {
        return omandi_osad;
    }


    /**
     * Sets the omandi_osad value for this Sooritakanne_kandesisu_v4.
     * 
     * @param omandi_osad   * Kandes määratakse ainult tehtavad muudatused
     */
    public void setOmandi_osad(eu.x_road.arireg.producer.OmandiOsadType_v4[] omandi_osad) {
        this.omandi_osad = omandi_osad;
    }

    public eu.x_road.arireg.producer.OmandiOsadType_v4 getOmandi_osad(int i) {
        return this.omandi_osad[i];
    }

    public void setOmandi_osad(int i, eu.x_road.arireg.producer.OmandiOsadType_v4 _value) {
        this.omandi_osad[i] = _value;
    }


    /**
     * Gets the isikud value for this Sooritakanne_kandesisu_v4.
     * 
     * @return isikud   * Isikute massiiv, nii registrikaardile kantavad isikud kui ka
     * kaardivälised isikud
     */
    public eu.x_road.arireg.producer.IsikType_v4[] getIsikud() {
        return isikud;
    }


    /**
     * Sets the isikud value for this Sooritakanne_kandesisu_v4.
     * 
     * @param isikud   * Isikute massiiv, nii registrikaardile kantavad isikud kui ka
     * kaardivälised isikud
     */
    public void setIsikud(eu.x_road.arireg.producer.IsikType_v4[] isikud) {
        this.isikud = isikud;
    }

    public eu.x_road.arireg.producer.IsikType_v4 getIsikud(int i) {
        return this.isikud[i];
    }

    public void setIsikud(int i, eu.x_road.arireg.producer.IsikType_v4 _value) {
        this.isikud[i] = _value;
    }


    /**
     * Gets the isikud_esindajad_stork value for this Sooritakanne_kandesisu_v4.
     * 
     * @return isikud_esindajad_stork   * STORK esindajate massiiv
     */
    public eu.x_road.arireg.producer.IsikesindajastorkType_v4[] getIsikud_esindajad_stork() {
        return isikud_esindajad_stork;
    }


    /**
     * Sets the isikud_esindajad_stork value for this Sooritakanne_kandesisu_v4.
     * 
     * @param isikud_esindajad_stork   * STORK esindajate massiiv
     */
    public void setIsikud_esindajad_stork(eu.x_road.arireg.producer.IsikesindajastorkType_v4[] isikud_esindajad_stork) {
        this.isikud_esindajad_stork = isikud_esindajad_stork;
    }

    public eu.x_road.arireg.producer.IsikesindajastorkType_v4 getIsikud_esindajad_stork(int i) {
        return this.isikud_esindajad_stork[i];
    }

    public void setIsikud_esindajad_stork(int i, eu.x_road.arireg.producer.IsikesindajastorkType_v4 _value) {
        this.isikud_esindajad_stork[i] = _value;
    }


    /**
     * Gets the esindusoigused value for this Sooritakanne_kandesisu_v4.
     * 
     * @return esindusoigused
     */
    public eu.x_road.arireg.producer.EsindusoigusType_v4[] getEsindusoigused() {
        return esindusoigused;
    }


    /**
     * Sets the esindusoigused value for this Sooritakanne_kandesisu_v4.
     * 
     * @param esindusoigused
     */
    public void setEsindusoigused(eu.x_road.arireg.producer.EsindusoigusType_v4[] esindusoigused) {
        this.esindusoigused = esindusoigused;
    }

    public eu.x_road.arireg.producer.EsindusoigusType_v4 getEsindusoigused(int i) {
        return this.esindusoigused[i];
    }

    public void setEsindusoigused(int i, eu.x_road.arireg.producer.EsindusoigusType_v4 _value) {
        this.esindusoigused[i] = _value;
    }


    /**
     * Gets the pohikiri value for this Sooritakanne_kandesisu_v4.
     * 
     * @return pohikiri
     */
    public eu.x_road.arireg.producer.Sooritakanne_pohikiri_v4 getPohikiri() {
        return pohikiri;
    }


    /**
     * Sets the pohikiri value for this Sooritakanne_kandesisu_v4.
     * 
     * @param pohikiri
     */
    public void setPohikiri(eu.x_road.arireg.producer.Sooritakanne_pohikiri_v4 pohikiri) {
        this.pohikiri = pohikiri;
    }


    /**
     * Gets the sidevahendid value for this Sooritakanne_kandesisu_v4.
     * 
     * @return sidevahendid   * Kandega pannakse kaasa täiskomplekt sidevahendeid, mitte ainult
     * muudatused???
     */
    public eu.x_road.arireg.producer.SidevahendType_v4[] getSidevahendid() {
        return sidevahendid;
    }


    /**
     * Sets the sidevahendid value for this Sooritakanne_kandesisu_v4.
     * 
     * @param sidevahendid   * Kandega pannakse kaasa täiskomplekt sidevahendeid, mitte ainult
     * muudatused???
     */
    public void setSidevahendid(eu.x_road.arireg.producer.SidevahendType_v4[] sidevahendid) {
        this.sidevahendid = sidevahendid;
    }

    public eu.x_road.arireg.producer.SidevahendType_v4 getSidevahendid(int i) {
        return this.sidevahendid[i];
    }

    public void setSidevahendid(int i, eu.x_road.arireg.producer.SidevahendType_v4 _value) {
        this.sidevahendid[i] = _value;
    }


    /**
     * Gets the markused value for this Sooritakanne_kandesisu_v4.
     * 
     * @return markused
     */
    public java.lang.String[] getMarkused() {
        return markused;
    }


    /**
     * Sets the markused value for this Sooritakanne_kandesisu_v4.
     * 
     * @param markused
     */
    public void setMarkused(java.lang.String[] markused) {
        this.markused = markused;
    }

    public java.lang.String getMarkused(int i) {
        return this.markused[i];
    }

    public void setMarkused(int i, java.lang.String _value) {
        this.markused[i] = _value;
    }


    /**
     * Gets the tegutsemise_algus value for this Sooritakanne_kandesisu_v4.
     * 
     * @return tegutsemise_algus   * SA alustamise kuupäev
     */
    public java.util.Date getTegutsemise_algus() {
        return tegutsemise_algus;
    }


    /**
     * Sets the tegutsemise_algus value for this Sooritakanne_kandesisu_v4.
     * 
     * @param tegutsemise_algus   * SA alustamise kuupäev
     */
    public void setTegutsemise_algus(java.util.Date tegutsemise_algus) {
        this.tegutsemise_algus = tegutsemise_algus;
    }


    /**
     * Gets the tegutsemise_tahtaeg value for this Sooritakanne_kandesisu_v4.
     * 
     * @return tegutsemise_tahtaeg   * MTÜ/SA tegutsemise tähtaeg
     */
    public java.util.Date getTegutsemise_tahtaeg() {
        return tegutsemise_tahtaeg;
    }


    /**
     * Sets the tegutsemise_tahtaeg value for this Sooritakanne_kandesisu_v4.
     * 
     * @param tegutsemise_tahtaeg   * MTÜ/SA tegutsemise tähtaeg
     */
    public void setTegutsemise_tahtaeg(java.util.Date tegutsemise_tahtaeg) {
        this.tegutsemise_tahtaeg = tegutsemise_tahtaeg;
    }


    /**
     * Gets the asutamise_aeg value for this Sooritakanne_kandesisu_v4.
     * 
     * @return asutamise_aeg   * Kirikl. ühenduse asutamise või esmamainimise aeg
     */
    public java.lang.String getAsutamise_aeg() {
        return asutamise_aeg;
    }


    /**
     * Sets the asutamise_aeg value for this Sooritakanne_kandesisu_v4.
     * 
     * @param asutamise_aeg   * Kirikl. ühenduse asutamise või esmamainimise aeg
     */
    public void setAsutamise_aeg(java.lang.String asutamise_aeg) {
        this.asutamise_aeg = asutamise_aeg;
    }


    /**
     * Gets the viide_eelkaijale value for this Sooritakanne_kandesisu_v4.
     * 
     * @return viide_eelkaijale
     */
    public java.lang.String getViide_eelkaijale() {
        return viide_eelkaijale;
    }


    /**
     * Sets the viide_eelkaijale value for this Sooritakanne_kandesisu_v4.
     * 
     * @param viide_eelkaijale
     */
    public void setViide_eelkaijale(java.lang.String viide_eelkaijale) {
        this.viide_eelkaijale = viide_eelkaijale;
    }


    /**
     * Gets the on_raamatupidamiskohuslane value for this Sooritakanne_kandesisu_v4.
     * 
     * @return on_raamatupidamiskohuslane   * Kas asutus on raamatupidamiskohustuslane (JAH/EI)
     */
    public java.lang.String getOn_raamatupidamiskohuslane() {
        return on_raamatupidamiskohuslane;
    }


    /**
     * Sets the on_raamatupidamiskohuslane value for this Sooritakanne_kandesisu_v4.
     * 
     * @param on_raamatupidamiskohuslane   * Kas asutus on raamatupidamiskohustuslane (JAH/EI)
     */
    public void setOn_raamatupidamiskohuslane(java.lang.String on_raamatupidamiskohuslane) {
        this.on_raamatupidamiskohuslane = on_raamatupidamiskohuslane;
    }


    /**
     * Gets the kinnisasjad value for this Sooritakanne_kandesisu_v4.
     * 
     * @return kinnisasjad   * Kandega antakse kaasa täiskomplekt andmeid
     */
    public eu.x_road.arireg.producer.KinnisasiType_v4[] getKinnisasjad() {
        return kinnisasjad;
    }


    /**
     * Sets the kinnisasjad value for this Sooritakanne_kandesisu_v4.
     * 
     * @param kinnisasjad   * Kandega antakse kaasa täiskomplekt andmeid
     */
    public void setKinnisasjad(eu.x_road.arireg.producer.KinnisasiType_v4[] kinnisasjad) {
        this.kinnisasjad = kinnisasjad;
    }

    public eu.x_road.arireg.producer.KinnisasiType_v4 getKinnisasjad(int i) {
        return this.kinnisasjad[i];
    }

    public void setKinnisasjad(int i, eu.x_road.arireg.producer.KinnisasiType_v4 _value) {
        this.kinnisasjad[i] = _value;
    }


    /**
     * Gets the valismaa_emaettevote value for this Sooritakanne_kandesisu_v4.
     * 
     * @return valismaa_emaettevote   * Välismaa ettevõtte filiaali registreerimisel. (Juhatajad lähevad
     * SJESI isikurolliga isikute node'sse)
     */
    public eu.x_road.arireg.producer.Valismaa_emaettevoteType_v4 getValismaa_emaettevote() {
        return valismaa_emaettevote;
    }


    /**
     * Sets the valismaa_emaettevote value for this Sooritakanne_kandesisu_v4.
     * 
     * @param valismaa_emaettevote   * Välismaa ettevõtte filiaali registreerimisel. (Juhatajad lähevad
     * SJESI isikurolliga isikute node'sse)
     */
    public void setValismaa_emaettevote(eu.x_road.arireg.producer.Valismaa_emaettevoteType_v4 valismaa_emaettevote) {
        this.valismaa_emaettevote = valismaa_emaettevote;
    }


    /**
     * Gets the fie_seisundid value for this Sooritakanne_kandesisu_v4.
     * 
     * @return fie_seisundid   * FIE seisundid
     */
    public eu.x_road.arireg.producer.Fie_seisundType_v4[] getFie_seisundid() {
        return fie_seisundid;
    }


    /**
     * Sets the fie_seisundid value for this Sooritakanne_kandesisu_v4.
     * 
     * @param fie_seisundid   * FIE seisundid
     */
    public void setFie_seisundid(eu.x_road.arireg.producer.Fie_seisundType_v4[] fie_seisundid) {
        this.fie_seisundid = fie_seisundid;
    }

    public eu.x_road.arireg.producer.Fie_seisundType_v4 getFie_seisundid(int i) {
        return this.fie_seisundid[i];
    }

    public void setFie_seisundid(int i, eu.x_road.arireg.producer.Fie_seisundType_v4 _value) {
        this.fie_seisundid[i] = _value;
    }


    /**
     * Gets the maks_reg_kpv value for this Sooritakanne_kandesisu_v4.
     * 
     * @return maks_reg_kpv   * FIE MKR-s registreerimise kuupäev
     */
    public java.util.Date getMaks_reg_kpv() {
        return maks_reg_kpv;
    }


    /**
     * Sets the maks_reg_kpv value for this Sooritakanne_kandesisu_v4.
     * 
     * @param maks_reg_kpv   * FIE MKR-s registreerimise kuupäev
     */
    public void setMaks_reg_kpv(java.util.Date maks_reg_kpv) {
        this.maks_reg_kpv = maks_reg_kpv;
    }


    /**
     * Gets the elamu_aadressid value for this Sooritakanne_kandesisu_v4.
     * 
     * @return elamu_aadressid   * Elamu aadressid ja katastriüksuse tunnused
     */
    public eu.x_road.arireg.producer.AadresskatastrigaType_v4[] getElamu_aadressid() {
        return elamu_aadressid;
    }


    /**
     * Sets the elamu_aadressid value for this Sooritakanne_kandesisu_v4.
     * 
     * @param elamu_aadressid   * Elamu aadressid ja katastriüksuse tunnused
     */
    public void setElamu_aadressid(eu.x_road.arireg.producer.AadresskatastrigaType_v4[] elamu_aadressid) {
        this.elamu_aadressid = elamu_aadressid;
    }

    public eu.x_road.arireg.producer.AadresskatastrigaType_v4 getElamu_aadressid(int i) {
        return this.elamu_aadressid[i];
    }

    public void setElamu_aadressid(int i, eu.x_road.arireg.producer.AadresskatastrigaType_v4 _value) {
        this.elamu_aadressid[i] = _value;
    }


    /**
     * Gets the korteriomandi_kinnistud value for this Sooritakanne_kandesisu_v4.
     * 
     * @return korteriomandi_kinnistud   * Korteriomandi kinnistu registriosa numbrid
     */
    public java.lang.String[] getKorteriomandi_kinnistud() {
        return korteriomandi_kinnistud;
    }


    /**
     * Sets the korteriomandi_kinnistud value for this Sooritakanne_kandesisu_v4.
     * 
     * @param korteriomandi_kinnistud   * Korteriomandi kinnistu registriosa numbrid
     */
    public void setKorteriomandi_kinnistud(java.lang.String[] korteriomandi_kinnistud) {
        this.korteriomandi_kinnistud = korteriomandi_kinnistud;
    }

    public java.lang.String getKorteriomandi_kinnistud(int i) {
        return this.korteriomandi_kinnistud[i];
    }

    public void setKorteriomandi_kinnistud(int i, java.lang.String _value) {
        this.korteriomandi_kinnistud[i] = _value;
    }


    /**
     * Gets the markused_mlaen value for this Sooritakanne_kandesisu_v4.
     * 
     * @return markused_mlaen   * Märkused korteriühistu eelmise majandusaasta majandamiskulude
     * summat ületava laenu kohta
     */
    public eu.x_road.arireg.producer.MarkusLiigigaTegevusega[] getMarkused_mlaen() {
        return markused_mlaen;
    }


    /**
     * Sets the markused_mlaen value for this Sooritakanne_kandesisu_v4.
     * 
     * @param markused_mlaen   * Märkused korteriühistu eelmise majandusaasta majandamiskulude
     * summat ületava laenu kohta
     */
    public void setMarkused_mlaen(eu.x_road.arireg.producer.MarkusLiigigaTegevusega[] markused_mlaen) {
        this.markused_mlaen = markused_mlaen;
    }

    public eu.x_road.arireg.producer.MarkusLiigigaTegevusega getMarkused_mlaen(int i) {
        return this.markused_mlaen[i];
    }

    public void setMarkused_mlaen(int i, eu.x_road.arireg.producer.MarkusLiigigaTegevusega _value) {
        this.markused_mlaen[i] = _value;
    }


    /**
     * Gets the asutalus_tekstina value for this Sooritakanne_kandesisu_v4.
     * 
     * @return asutalus_tekstina
     */
    public java.lang.String getAsutalus_tekstina() {
        return asutalus_tekstina;
    }


    /**
     * Sets the asutalus_tekstina value for this Sooritakanne_kandesisu_v4.
     * 
     * @param asutalus_tekstina
     */
    public void setAsutalus_tekstina(java.lang.String asutalus_tekstina) {
        this.asutalus_tekstina = asutalus_tekstina;
    }


    /**
     * Gets the kustalus_tekstina value for this Sooritakanne_kandesisu_v4.
     * 
     * @return kustalus_tekstina
     */
    public java.lang.String getKustalus_tekstina() {
        return kustalus_tekstina;
    }


    /**
     * Sets the kustalus_tekstina value for this Sooritakanne_kandesisu_v4.
     * 
     * @param kustalus_tekstina
     */
    public void setKustalus_tekstina(java.lang.String kustalus_tekstina) {
        this.kustalus_tekstina = kustalus_tekstina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sooritakanne_kandesisu_v4)) return false;
        Sooritakanne_kandesisu_v4 other = (Sooritakanne_kandesisu_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uus_arinimi==null && other.getUus_arinimi()==null) || 
             (this.uus_arinimi!=null &&
              this.uus_arinimi.equals(other.getUus_arinimi()))) &&
            ((this.taiendav_nimi==null && other.getTaiendav_nimi()==null) || 
             (this.taiendav_nimi!=null &&
              this.taiendav_nimi.equals(other.getTaiendav_nimi()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm()))) &&
            ((this.oigusliku_vormi_alaliik==null && other.getOigusliku_vormi_alaliik()==null) || 
             (this.oigusliku_vormi_alaliik!=null &&
              this.oigusliku_vormi_alaliik.equals(other.getOigusliku_vormi_alaliik()))) &&
            ((this.asukoht==null && other.getAsukoht()==null) || 
             (this.asukoht!=null &&
              this.asukoht.equals(other.getAsukoht()))) &&
            ((this.ev_seisund==null && other.getEv_seisund()==null) || 
             (this.ev_seisund!=null &&
              this.ev_seisund.equals(other.getEv_seisund()))) &&
            ((this.pohitegevusala==null && other.getPohitegevusala()==null) || 
             (this.pohitegevusala!=null &&
              this.pohitegevusala.equals(other.getPohitegevusala()))) &&
            ((this.lisategevusala==null && other.getLisategevusala()==null) || 
             (this.lisategevusala!=null &&
              this.lisategevusala.equals(other.getLisategevusala()))) &&
            ((this.eesmargid==null && other.getEesmargid()==null) || 
             (this.eesmargid!=null &&
              java.util.Arrays.equals(this.eesmargid, other.getEesmargid()))) &&
            ((this.majandusaasta==null && other.getMajandusaasta()==null) || 
             (this.majandusaasta!=null &&
              this.majandusaasta.equals(other.getMajandusaasta()))) &&
            ((this.kapital==null && other.getKapital()==null) || 
             (this.kapital!=null &&
              this.kapital.equals(other.getKapital()))) &&
            ((this.kapitali_tingimuslik_suurendamine==null && other.getKapitali_tingimuslik_suurendamine()==null) || 
             (this.kapitali_tingimuslik_suurendamine!=null &&
              this.kapitali_tingimuslik_suurendamine.equals(other.getKapitali_tingimuslik_suurendamine()))) &&
            ((this.nimivaartuseta_aktsiate_arv==null && other.getNimivaartuseta_aktsiate_arv()==null) || 
             (this.nimivaartuseta_aktsiate_arv!=null &&
              this.nimivaartuseta_aktsiate_arv.equals(other.getNimivaartuseta_aktsiate_arv()))) &&
            ((this.asutatud_sissemakset_tegemata==null && other.getAsutatud_sissemakset_tegemata()==null) || 
             (this.asutatud_sissemakset_tegemata!=null &&
              this.asutatud_sissemakset_tegemata.equals(other.getAsutatud_sissemakset_tegemata()))) &&
            ((this.omandi_osad==null && other.getOmandi_osad()==null) || 
             (this.omandi_osad!=null &&
              java.util.Arrays.equals(this.omandi_osad, other.getOmandi_osad()))) &&
            ((this.isikud==null && other.getIsikud()==null) || 
             (this.isikud!=null &&
              java.util.Arrays.equals(this.isikud, other.getIsikud()))) &&
            ((this.isikud_esindajad_stork==null && other.getIsikud_esindajad_stork()==null) || 
             (this.isikud_esindajad_stork!=null &&
              java.util.Arrays.equals(this.isikud_esindajad_stork, other.getIsikud_esindajad_stork()))) &&
            ((this.esindusoigused==null && other.getEsindusoigused()==null) || 
             (this.esindusoigused!=null &&
              java.util.Arrays.equals(this.esindusoigused, other.getEsindusoigused()))) &&
            ((this.pohikiri==null && other.getPohikiri()==null) || 
             (this.pohikiri!=null &&
              this.pohikiri.equals(other.getPohikiri()))) &&
            ((this.sidevahendid==null && other.getSidevahendid()==null) || 
             (this.sidevahendid!=null &&
              java.util.Arrays.equals(this.sidevahendid, other.getSidevahendid()))) &&
            ((this.markused==null && other.getMarkused()==null) || 
             (this.markused!=null &&
              java.util.Arrays.equals(this.markused, other.getMarkused()))) &&
            ((this.tegutsemise_algus==null && other.getTegutsemise_algus()==null) || 
             (this.tegutsemise_algus!=null &&
              this.tegutsemise_algus.equals(other.getTegutsemise_algus()))) &&
            ((this.tegutsemise_tahtaeg==null && other.getTegutsemise_tahtaeg()==null) || 
             (this.tegutsemise_tahtaeg!=null &&
              this.tegutsemise_tahtaeg.equals(other.getTegutsemise_tahtaeg()))) &&
            ((this.asutamise_aeg==null && other.getAsutamise_aeg()==null) || 
             (this.asutamise_aeg!=null &&
              this.asutamise_aeg.equals(other.getAsutamise_aeg()))) &&
            ((this.viide_eelkaijale==null && other.getViide_eelkaijale()==null) || 
             (this.viide_eelkaijale!=null &&
              this.viide_eelkaijale.equals(other.getViide_eelkaijale()))) &&
            ((this.on_raamatupidamiskohuslane==null && other.getOn_raamatupidamiskohuslane()==null) || 
             (this.on_raamatupidamiskohuslane!=null &&
              this.on_raamatupidamiskohuslane.equals(other.getOn_raamatupidamiskohuslane()))) &&
            ((this.kinnisasjad==null && other.getKinnisasjad()==null) || 
             (this.kinnisasjad!=null &&
              java.util.Arrays.equals(this.kinnisasjad, other.getKinnisasjad()))) &&
            ((this.valismaa_emaettevote==null && other.getValismaa_emaettevote()==null) || 
             (this.valismaa_emaettevote!=null &&
              this.valismaa_emaettevote.equals(other.getValismaa_emaettevote()))) &&
            ((this.fie_seisundid==null && other.getFie_seisundid()==null) || 
             (this.fie_seisundid!=null &&
              java.util.Arrays.equals(this.fie_seisundid, other.getFie_seisundid()))) &&
            ((this.maks_reg_kpv==null && other.getMaks_reg_kpv()==null) || 
             (this.maks_reg_kpv!=null &&
              this.maks_reg_kpv.equals(other.getMaks_reg_kpv()))) &&
            ((this.elamu_aadressid==null && other.getElamu_aadressid()==null) || 
             (this.elamu_aadressid!=null &&
              java.util.Arrays.equals(this.elamu_aadressid, other.getElamu_aadressid()))) &&
            ((this.korteriomandi_kinnistud==null && other.getKorteriomandi_kinnistud()==null) || 
             (this.korteriomandi_kinnistud!=null &&
              java.util.Arrays.equals(this.korteriomandi_kinnistud, other.getKorteriomandi_kinnistud()))) &&
            ((this.markused_mlaen==null && other.getMarkused_mlaen()==null) || 
             (this.markused_mlaen!=null &&
              java.util.Arrays.equals(this.markused_mlaen, other.getMarkused_mlaen()))) &&
            ((this.asutalus_tekstina==null && other.getAsutalus_tekstina()==null) || 
             (this.asutalus_tekstina!=null &&
              this.asutalus_tekstina.equals(other.getAsutalus_tekstina()))) &&
            ((this.kustalus_tekstina==null && other.getKustalus_tekstina()==null) || 
             (this.kustalus_tekstina!=null &&
              this.kustalus_tekstina.equals(other.getKustalus_tekstina())));
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
        if (getUus_arinimi() != null) {
            _hashCode += getUus_arinimi().hashCode();
        }
        if (getTaiendav_nimi() != null) {
            _hashCode += getTaiendav_nimi().hashCode();
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        if (getOigusliku_vormi_alaliik() != null) {
            _hashCode += getOigusliku_vormi_alaliik().hashCode();
        }
        if (getAsukoht() != null) {
            _hashCode += getAsukoht().hashCode();
        }
        if (getEv_seisund() != null) {
            _hashCode += getEv_seisund().hashCode();
        }
        if (getPohitegevusala() != null) {
            _hashCode += getPohitegevusala().hashCode();
        }
        if (getLisategevusala() != null) {
            _hashCode += getLisategevusala().hashCode();
        }
        if (getEesmargid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEesmargid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEesmargid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMajandusaasta() != null) {
            _hashCode += getMajandusaasta().hashCode();
        }
        if (getKapital() != null) {
            _hashCode += getKapital().hashCode();
        }
        if (getKapitali_tingimuslik_suurendamine() != null) {
            _hashCode += getKapitali_tingimuslik_suurendamine().hashCode();
        }
        if (getNimivaartuseta_aktsiate_arv() != null) {
            _hashCode += getNimivaartuseta_aktsiate_arv().hashCode();
        }
        if (getAsutatud_sissemakset_tegemata() != null) {
            _hashCode += getAsutatud_sissemakset_tegemata().hashCode();
        }
        if (getOmandi_osad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOmandi_osad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOmandi_osad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsikud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsikud_esindajad_stork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsikud_esindajad_stork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsikud_esindajad_stork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEsindusoigused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEsindusoigused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEsindusoigused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPohikiri() != null) {
            _hashCode += getPohikiri().hashCode();
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
        if (getMarkused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTegutsemise_algus() != null) {
            _hashCode += getTegutsemise_algus().hashCode();
        }
        if (getTegutsemise_tahtaeg() != null) {
            _hashCode += getTegutsemise_tahtaeg().hashCode();
        }
        if (getAsutamise_aeg() != null) {
            _hashCode += getAsutamise_aeg().hashCode();
        }
        if (getViide_eelkaijale() != null) {
            _hashCode += getViide_eelkaijale().hashCode();
        }
        if (getOn_raamatupidamiskohuslane() != null) {
            _hashCode += getOn_raamatupidamiskohuslane().hashCode();
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
        if (getValismaa_emaettevote() != null) {
            _hashCode += getValismaa_emaettevote().hashCode();
        }
        if (getFie_seisundid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFie_seisundid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFie_seisundid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaks_reg_kpv() != null) {
            _hashCode += getMaks_reg_kpv().hashCode();
        }
        if (getElamu_aadressid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElamu_aadressid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElamu_aadressid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKorteriomandi_kinnistud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKorteriomandi_kinnistud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKorteriomandi_kinnistud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarkused_mlaen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkused_mlaen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkused_mlaen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsutalus_tekstina() != null) {
            _hashCode += getAsutalus_tekstina().hashCode();
        }
        if (getKustalus_tekstina() != null) {
            _hashCode += getKustalus_tekstina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
