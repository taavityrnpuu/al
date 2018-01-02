/**
 * SooritaKanne_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class SooritaKanne_v4  implements java.io.Serializable {
    /* V - ettevõtjaportaal, N - e-notar, K - KR */
    private java.lang.String kande_paritolu;

    /* Notari või KR või ettevõtjaportaali kande ID */
    private java.lang.String kande_id;

    /* Kandeliik ettevõtjaportaali klassifikaatori järgi */
    private int ekande_liik;

    /* Kas on paranduskanne, kui on, siis peab olema määratud ka kas
     * eelmine_lahend_legacy või eelmine_paevikukande_id */
    private java.lang.Boolean on_paranduskanne;

    /* Viit eelnevale menetlusele kui tegemist on paranduskandega,
     * viit on vormingus piirkond:menetluse_nr, nt 1:10000032 */
    private java.lang.String eelmine_lahend_legacy;

    /* Viit eelnevale paevik.id-le kui tegemist on paranduskandega */
    private java.lang.String eelmine_paevikukande_id;

    /* Eelmise ettevõtjaportaali kande ID */
    private java.lang.String eelmine_ekande_id;

    /* Kas on kiirmenetlus, kasutatakse avaldustes, mis on tulnud
     * ettevõtjaportaalist */
    private java.lang.Boolean on_kiirmenetlus;

    /* E-notari poolt edastatav KR menetluse number, kui on ühine
     * menetlus */
    private java.lang.String kr_menetluse_number;

    private java.util.Date kande_kuupaev;

    /* Esitaja nimi ettevõtjaportaalist esitatud kandeavalduse korral */
    private java.lang.String esitaja_nimi;

    /* Esitaja isikukood ettevõtjaportaalist esitatud kandeavalduse
     * korral */
    private java.lang.String esitaja_kood;

    /* Asutamisnumber ettevõtjaportaalist esitatud kandeavalduse korral */
    private java.lang.String asutamisnumber;

    private eu.x_road.arireg.producer.Sooritakanne_ametitoiming_v4 ametitoiming;

    private eu.x_road.arireg.producer.RiigiloivType_v4[] riigiloivud;

    /* Ettevõtjaportaalis genereeritava avalduse puhul avalduse riigilõivu
     * viitenumber. Väli on vajalik selleks, et kui riigilõivu ennast ei
     * ole, siis oleks ette genereeritud viitenumber ikka teada */
    private java.lang.String viitenumber_loiv;

    /* Ettevõtjaportaalis genereeritava avalduse puhul osakapitali
     * deposiidi viitenumber. */
    private java.lang.String viitenumber_okap;

    /* Tuleb täita esmakandel kui õigusliku vormi alaliik on KIRIK,
     * KOGL, KOGUD või KLOOS */
    private java.lang.String registri_piirkond;

    private java.lang.Boolean lisa_arp_markus;

    private java.lang.Boolean eemalda_arp_markus;

    /* Siia alla tuleb ettevõtjate loetelu, igal ettevõtjal oma kande
     * sisu ja dokumendid */
    private eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4[] ettevotjad;

    public SooritaKanne_v4() {
    }

    public SooritaKanne_v4(
           java.lang.String kande_paritolu,
           java.lang.String kande_id,
           int ekande_liik,
           java.lang.Boolean on_paranduskanne,
           java.lang.String eelmine_lahend_legacy,
           java.lang.String eelmine_paevikukande_id,
           java.lang.String eelmine_ekande_id,
           java.lang.Boolean on_kiirmenetlus,
           java.lang.String kr_menetluse_number,
           java.util.Date kande_kuupaev,
           java.lang.String esitaja_nimi,
           java.lang.String esitaja_kood,
           java.lang.String asutamisnumber,
           eu.x_road.arireg.producer.Sooritakanne_ametitoiming_v4 ametitoiming,
           eu.x_road.arireg.producer.RiigiloivType_v4[] riigiloivud,
           java.lang.String viitenumber_loiv,
           java.lang.String viitenumber_okap,
           java.lang.String registri_piirkond,
           java.lang.Boolean lisa_arp_markus,
           java.lang.Boolean eemalda_arp_markus,
           eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4[] ettevotjad) {
           this.kande_paritolu = kande_paritolu;
           this.kande_id = kande_id;
           this.ekande_liik = ekande_liik;
           this.on_paranduskanne = on_paranduskanne;
           this.eelmine_lahend_legacy = eelmine_lahend_legacy;
           this.eelmine_paevikukande_id = eelmine_paevikukande_id;
           this.eelmine_ekande_id = eelmine_ekande_id;
           this.on_kiirmenetlus = on_kiirmenetlus;
           this.kr_menetluse_number = kr_menetluse_number;
           this.kande_kuupaev = kande_kuupaev;
           this.esitaja_nimi = esitaja_nimi;
           this.esitaja_kood = esitaja_kood;
           this.asutamisnumber = asutamisnumber;
           this.ametitoiming = ametitoiming;
           this.riigiloivud = riigiloivud;
           this.viitenumber_loiv = viitenumber_loiv;
           this.viitenumber_okap = viitenumber_okap;
           this.registri_piirkond = registri_piirkond;
           this.lisa_arp_markus = lisa_arp_markus;
           this.eemalda_arp_markus = eemalda_arp_markus;
           this.ettevotjad = ettevotjad;
    }


    /**
     * Gets the kande_paritolu value for this SooritaKanne_v4.
     * 
     * @return kande_paritolu   * V - ettevõtjaportaal, N - e-notar, K - KR
     */
    public java.lang.String getKande_paritolu() {
        return kande_paritolu;
    }


    /**
     * Sets the kande_paritolu value for this SooritaKanne_v4.
     * 
     * @param kande_paritolu   * V - ettevõtjaportaal, N - e-notar, K - KR
     */
    public void setKande_paritolu(java.lang.String kande_paritolu) {
        this.kande_paritolu = kande_paritolu;
    }


    /**
     * Gets the kande_id value for this SooritaKanne_v4.
     * 
     * @return kande_id   * Notari või KR või ettevõtjaportaali kande ID
     */
    public java.lang.String getKande_id() {
        return kande_id;
    }


    /**
     * Sets the kande_id value for this SooritaKanne_v4.
     * 
     * @param kande_id   * Notari või KR või ettevõtjaportaali kande ID
     */
    public void setKande_id(java.lang.String kande_id) {
        this.kande_id = kande_id;
    }


    /**
     * Gets the ekande_liik value for this SooritaKanne_v4.
     * 
     * @return ekande_liik   * Kandeliik ettevõtjaportaali klassifikaatori järgi
     */
    public int getEkande_liik() {
        return ekande_liik;
    }


    /**
     * Sets the ekande_liik value for this SooritaKanne_v4.
     * 
     * @param ekande_liik   * Kandeliik ettevõtjaportaali klassifikaatori järgi
     */
    public void setEkande_liik(int ekande_liik) {
        this.ekande_liik = ekande_liik;
    }


    /**
     * Gets the on_paranduskanne value for this SooritaKanne_v4.
     * 
     * @return on_paranduskanne   * Kas on paranduskanne, kui on, siis peab olema määratud ka kas
     * eelmine_lahend_legacy või eelmine_paevikukande_id
     */
    public java.lang.Boolean getOn_paranduskanne() {
        return on_paranduskanne;
    }


    /**
     * Sets the on_paranduskanne value for this SooritaKanne_v4.
     * 
     * @param on_paranduskanne   * Kas on paranduskanne, kui on, siis peab olema määratud ka kas
     * eelmine_lahend_legacy või eelmine_paevikukande_id
     */
    public void setOn_paranduskanne(java.lang.Boolean on_paranduskanne) {
        this.on_paranduskanne = on_paranduskanne;
    }


    /**
     * Gets the eelmine_lahend_legacy value for this SooritaKanne_v4.
     * 
     * @return eelmine_lahend_legacy   * Viit eelnevale menetlusele kui tegemist on paranduskandega,
     * viit on vormingus piirkond:menetluse_nr, nt 1:10000032
     */
    public java.lang.String getEelmine_lahend_legacy() {
        return eelmine_lahend_legacy;
    }


    /**
     * Sets the eelmine_lahend_legacy value for this SooritaKanne_v4.
     * 
     * @param eelmine_lahend_legacy   * Viit eelnevale menetlusele kui tegemist on paranduskandega,
     * viit on vormingus piirkond:menetluse_nr, nt 1:10000032
     */
    public void setEelmine_lahend_legacy(java.lang.String eelmine_lahend_legacy) {
        this.eelmine_lahend_legacy = eelmine_lahend_legacy;
    }


    /**
     * Gets the eelmine_paevikukande_id value for this SooritaKanne_v4.
     * 
     * @return eelmine_paevikukande_id   * Viit eelnevale paevik.id-le kui tegemist on paranduskandega
     */
    public java.lang.String getEelmine_paevikukande_id() {
        return eelmine_paevikukande_id;
    }


    /**
     * Sets the eelmine_paevikukande_id value for this SooritaKanne_v4.
     * 
     * @param eelmine_paevikukande_id   * Viit eelnevale paevik.id-le kui tegemist on paranduskandega
     */
    public void setEelmine_paevikukande_id(java.lang.String eelmine_paevikukande_id) {
        this.eelmine_paevikukande_id = eelmine_paevikukande_id;
    }


    /**
     * Gets the eelmine_ekande_id value for this SooritaKanne_v4.
     * 
     * @return eelmine_ekande_id   * Eelmise ettevõtjaportaali kande ID
     */
    public java.lang.String getEelmine_ekande_id() {
        return eelmine_ekande_id;
    }


    /**
     * Sets the eelmine_ekande_id value for this SooritaKanne_v4.
     * 
     * @param eelmine_ekande_id   * Eelmise ettevõtjaportaali kande ID
     */
    public void setEelmine_ekande_id(java.lang.String eelmine_ekande_id) {
        this.eelmine_ekande_id = eelmine_ekande_id;
    }


    /**
     * Gets the on_kiirmenetlus value for this SooritaKanne_v4.
     * 
     * @return on_kiirmenetlus   * Kas on kiirmenetlus, kasutatakse avaldustes, mis on tulnud
     * ettevõtjaportaalist
     */
    public java.lang.Boolean getOn_kiirmenetlus() {
        return on_kiirmenetlus;
    }


    /**
     * Sets the on_kiirmenetlus value for this SooritaKanne_v4.
     * 
     * @param on_kiirmenetlus   * Kas on kiirmenetlus, kasutatakse avaldustes, mis on tulnud
     * ettevõtjaportaalist
     */
    public void setOn_kiirmenetlus(java.lang.Boolean on_kiirmenetlus) {
        this.on_kiirmenetlus = on_kiirmenetlus;
    }


    /**
     * Gets the kr_menetluse_number value for this SooritaKanne_v4.
     * 
     * @return kr_menetluse_number   * E-notari poolt edastatav KR menetluse number, kui on ühine
     * menetlus
     */
    public java.lang.String getKr_menetluse_number() {
        return kr_menetluse_number;
    }


    /**
     * Sets the kr_menetluse_number value for this SooritaKanne_v4.
     * 
     * @param kr_menetluse_number   * E-notari poolt edastatav KR menetluse number, kui on ühine
     * menetlus
     */
    public void setKr_menetluse_number(java.lang.String kr_menetluse_number) {
        this.kr_menetluse_number = kr_menetluse_number;
    }


    /**
     * Gets the kande_kuupaev value for this SooritaKanne_v4.
     * 
     * @return kande_kuupaev
     */
    public java.util.Date getKande_kuupaev() {
        return kande_kuupaev;
    }


    /**
     * Sets the kande_kuupaev value for this SooritaKanne_v4.
     * 
     * @param kande_kuupaev
     */
    public void setKande_kuupaev(java.util.Date kande_kuupaev) {
        this.kande_kuupaev = kande_kuupaev;
    }


    /**
     * Gets the esitaja_nimi value for this SooritaKanne_v4.
     * 
     * @return esitaja_nimi   * Esitaja nimi ettevõtjaportaalist esitatud kandeavalduse korral
     */
    public java.lang.String getEsitaja_nimi() {
        return esitaja_nimi;
    }


    /**
     * Sets the esitaja_nimi value for this SooritaKanne_v4.
     * 
     * @param esitaja_nimi   * Esitaja nimi ettevõtjaportaalist esitatud kandeavalduse korral
     */
    public void setEsitaja_nimi(java.lang.String esitaja_nimi) {
        this.esitaja_nimi = esitaja_nimi;
    }


    /**
     * Gets the esitaja_kood value for this SooritaKanne_v4.
     * 
     * @return esitaja_kood   * Esitaja isikukood ettevõtjaportaalist esitatud kandeavalduse
     * korral
     */
    public java.lang.String getEsitaja_kood() {
        return esitaja_kood;
    }


    /**
     * Sets the esitaja_kood value for this SooritaKanne_v4.
     * 
     * @param esitaja_kood   * Esitaja isikukood ettevõtjaportaalist esitatud kandeavalduse
     * korral
     */
    public void setEsitaja_kood(java.lang.String esitaja_kood) {
        this.esitaja_kood = esitaja_kood;
    }


    /**
     * Gets the asutamisnumber value for this SooritaKanne_v4.
     * 
     * @return asutamisnumber   * Asutamisnumber ettevõtjaportaalist esitatud kandeavalduse korral
     */
    public java.lang.String getAsutamisnumber() {
        return asutamisnumber;
    }


    /**
     * Sets the asutamisnumber value for this SooritaKanne_v4.
     * 
     * @param asutamisnumber   * Asutamisnumber ettevõtjaportaalist esitatud kandeavalduse korral
     */
    public void setAsutamisnumber(java.lang.String asutamisnumber) {
        this.asutamisnumber = asutamisnumber;
    }


    /**
     * Gets the ametitoiming value for this SooritaKanne_v4.
     * 
     * @return ametitoiming
     */
    public eu.x_road.arireg.producer.Sooritakanne_ametitoiming_v4 getAmetitoiming() {
        return ametitoiming;
    }


    /**
     * Sets the ametitoiming value for this SooritaKanne_v4.
     * 
     * @param ametitoiming
     */
    public void setAmetitoiming(eu.x_road.arireg.producer.Sooritakanne_ametitoiming_v4 ametitoiming) {
        this.ametitoiming = ametitoiming;
    }


    /**
     * Gets the riigiloivud value for this SooritaKanne_v4.
     * 
     * @return riigiloivud
     */
    public eu.x_road.arireg.producer.RiigiloivType_v4[] getRiigiloivud() {
        return riigiloivud;
    }


    /**
     * Sets the riigiloivud value for this SooritaKanne_v4.
     * 
     * @param riigiloivud
     */
    public void setRiigiloivud(eu.x_road.arireg.producer.RiigiloivType_v4[] riigiloivud) {
        this.riigiloivud = riigiloivud;
    }

    public eu.x_road.arireg.producer.RiigiloivType_v4 getRiigiloivud(int i) {
        return this.riigiloivud[i];
    }

    public void setRiigiloivud(int i, eu.x_road.arireg.producer.RiigiloivType_v4 _value) {
        this.riigiloivud[i] = _value;
    }


    /**
     * Gets the viitenumber_loiv value for this SooritaKanne_v4.
     * 
     * @return viitenumber_loiv   * Ettevõtjaportaalis genereeritava avalduse puhul avalduse riigilõivu
     * viitenumber. Väli on vajalik selleks, et kui riigilõivu ennast ei
     * ole, siis oleks ette genereeritud viitenumber ikka teada
     */
    public java.lang.String getViitenumber_loiv() {
        return viitenumber_loiv;
    }


    /**
     * Sets the viitenumber_loiv value for this SooritaKanne_v4.
     * 
     * @param viitenumber_loiv   * Ettevõtjaportaalis genereeritava avalduse puhul avalduse riigilõivu
     * viitenumber. Väli on vajalik selleks, et kui riigilõivu ennast ei
     * ole, siis oleks ette genereeritud viitenumber ikka teada
     */
    public void setViitenumber_loiv(java.lang.String viitenumber_loiv) {
        this.viitenumber_loiv = viitenumber_loiv;
    }


    /**
     * Gets the viitenumber_okap value for this SooritaKanne_v4.
     * 
     * @return viitenumber_okap   * Ettevõtjaportaalis genereeritava avalduse puhul osakapitali
     * deposiidi viitenumber.
     */
    public java.lang.String getViitenumber_okap() {
        return viitenumber_okap;
    }


    /**
     * Sets the viitenumber_okap value for this SooritaKanne_v4.
     * 
     * @param viitenumber_okap   * Ettevõtjaportaalis genereeritava avalduse puhul osakapitali
     * deposiidi viitenumber.
     */
    public void setViitenumber_okap(java.lang.String viitenumber_okap) {
        this.viitenumber_okap = viitenumber_okap;
    }


    /**
     * Gets the registri_piirkond value for this SooritaKanne_v4.
     * 
     * @return registri_piirkond   * Tuleb täita esmakandel kui õigusliku vormi alaliik on KIRIK,
     * KOGL, KOGUD või KLOOS
     */
    public java.lang.String getRegistri_piirkond() {
        return registri_piirkond;
    }


    /**
     * Sets the registri_piirkond value for this SooritaKanne_v4.
     * 
     * @param registri_piirkond   * Tuleb täita esmakandel kui õigusliku vormi alaliik on KIRIK,
     * KOGL, KOGUD või KLOOS
     */
    public void setRegistri_piirkond(java.lang.String registri_piirkond) {
        this.registri_piirkond = registri_piirkond;
    }


    /**
     * Gets the lisa_arp_markus value for this SooritaKanne_v4.
     * 
     * @return lisa_arp_markus
     */
    public java.lang.Boolean getLisa_arp_markus() {
        return lisa_arp_markus;
    }


    /**
     * Sets the lisa_arp_markus value for this SooritaKanne_v4.
     * 
     * @param lisa_arp_markus
     */
    public void setLisa_arp_markus(java.lang.Boolean lisa_arp_markus) {
        this.lisa_arp_markus = lisa_arp_markus;
    }


    /**
     * Gets the eemalda_arp_markus value for this SooritaKanne_v4.
     * 
     * @return eemalda_arp_markus
     */
    public java.lang.Boolean getEemalda_arp_markus() {
        return eemalda_arp_markus;
    }


    /**
     * Sets the eemalda_arp_markus value for this SooritaKanne_v4.
     * 
     * @param eemalda_arp_markus
     */
    public void setEemalda_arp_markus(java.lang.Boolean eemalda_arp_markus) {
        this.eemalda_arp_markus = eemalda_arp_markus;
    }


    /**
     * Gets the ettevotjad value for this SooritaKanne_v4.
     * 
     * @return ettevotjad   * Siia alla tuleb ettevõtjate loetelu, igal ettevõtjal oma kande
     * sisu ja dokumendid
     */
    public eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4[] getEttevotjad() {
        return ettevotjad;
    }


    /**
     * Sets the ettevotjad value for this SooritaKanne_v4.
     * 
     * @param ettevotjad   * Siia alla tuleb ettevõtjate loetelu, igal ettevõtjal oma kande
     * sisu ja dokumendid
     */
    public void setEttevotjad(eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4[] ettevotjad) {
        this.ettevotjad = ettevotjad;
    }

    public eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4 getEttevotjad(int i) {
        return this.ettevotjad[i];
    }

    public void setEttevotjad(int i, eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4 _value) {
        this.ettevotjad[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SooritaKanne_v4)) return false;
        SooritaKanne_v4 other = (SooritaKanne_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kande_paritolu==null && other.getKande_paritolu()==null) || 
             (this.kande_paritolu!=null &&
              this.kande_paritolu.equals(other.getKande_paritolu()))) &&
            ((this.kande_id==null && other.getKande_id()==null) || 
             (this.kande_id!=null &&
              this.kande_id.equals(other.getKande_id()))) &&
            this.ekande_liik == other.getEkande_liik() &&
            ((this.on_paranduskanne==null && other.getOn_paranduskanne()==null) || 
             (this.on_paranduskanne!=null &&
              this.on_paranduskanne.equals(other.getOn_paranduskanne()))) &&
            ((this.eelmine_lahend_legacy==null && other.getEelmine_lahend_legacy()==null) || 
             (this.eelmine_lahend_legacy!=null &&
              this.eelmine_lahend_legacy.equals(other.getEelmine_lahend_legacy()))) &&
            ((this.eelmine_paevikukande_id==null && other.getEelmine_paevikukande_id()==null) || 
             (this.eelmine_paevikukande_id!=null &&
              this.eelmine_paevikukande_id.equals(other.getEelmine_paevikukande_id()))) &&
            ((this.eelmine_ekande_id==null && other.getEelmine_ekande_id()==null) || 
             (this.eelmine_ekande_id!=null &&
              this.eelmine_ekande_id.equals(other.getEelmine_ekande_id()))) &&
            ((this.on_kiirmenetlus==null && other.getOn_kiirmenetlus()==null) || 
             (this.on_kiirmenetlus!=null &&
              this.on_kiirmenetlus.equals(other.getOn_kiirmenetlus()))) &&
            ((this.kr_menetluse_number==null && other.getKr_menetluse_number()==null) || 
             (this.kr_menetluse_number!=null &&
              this.kr_menetluse_number.equals(other.getKr_menetluse_number()))) &&
            ((this.kande_kuupaev==null && other.getKande_kuupaev()==null) || 
             (this.kande_kuupaev!=null &&
              this.kande_kuupaev.equals(other.getKande_kuupaev()))) &&
            ((this.esitaja_nimi==null && other.getEsitaja_nimi()==null) || 
             (this.esitaja_nimi!=null &&
              this.esitaja_nimi.equals(other.getEsitaja_nimi()))) &&
            ((this.esitaja_kood==null && other.getEsitaja_kood()==null) || 
             (this.esitaja_kood!=null &&
              this.esitaja_kood.equals(other.getEsitaja_kood()))) &&
            ((this.asutamisnumber==null && other.getAsutamisnumber()==null) || 
             (this.asutamisnumber!=null &&
              this.asutamisnumber.equals(other.getAsutamisnumber()))) &&
            ((this.ametitoiming==null && other.getAmetitoiming()==null) || 
             (this.ametitoiming!=null &&
              this.ametitoiming.equals(other.getAmetitoiming()))) &&
            ((this.riigiloivud==null && other.getRiigiloivud()==null) || 
             (this.riigiloivud!=null &&
              java.util.Arrays.equals(this.riigiloivud, other.getRiigiloivud()))) &&
            ((this.viitenumber_loiv==null && other.getViitenumber_loiv()==null) || 
             (this.viitenumber_loiv!=null &&
              this.viitenumber_loiv.equals(other.getViitenumber_loiv()))) &&
            ((this.viitenumber_okap==null && other.getViitenumber_okap()==null) || 
             (this.viitenumber_okap!=null &&
              this.viitenumber_okap.equals(other.getViitenumber_okap()))) &&
            ((this.registri_piirkond==null && other.getRegistri_piirkond()==null) || 
             (this.registri_piirkond!=null &&
              this.registri_piirkond.equals(other.getRegistri_piirkond()))) &&
            ((this.lisa_arp_markus==null && other.getLisa_arp_markus()==null) || 
             (this.lisa_arp_markus!=null &&
              this.lisa_arp_markus.equals(other.getLisa_arp_markus()))) &&
            ((this.eemalda_arp_markus==null && other.getEemalda_arp_markus()==null) || 
             (this.eemalda_arp_markus!=null &&
              this.eemalda_arp_markus.equals(other.getEemalda_arp_markus()))) &&
            ((this.ettevotjad==null && other.getEttevotjad()==null) || 
             (this.ettevotjad!=null &&
              java.util.Arrays.equals(this.ettevotjad, other.getEttevotjad())));
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
        if (getKande_paritolu() != null) {
            _hashCode += getKande_paritolu().hashCode();
        }
        if (getKande_id() != null) {
            _hashCode += getKande_id().hashCode();
        }
        _hashCode += getEkande_liik();
        if (getOn_paranduskanne() != null) {
            _hashCode += getOn_paranduskanne().hashCode();
        }
        if (getEelmine_lahend_legacy() != null) {
            _hashCode += getEelmine_lahend_legacy().hashCode();
        }
        if (getEelmine_paevikukande_id() != null) {
            _hashCode += getEelmine_paevikukande_id().hashCode();
        }
        if (getEelmine_ekande_id() != null) {
            _hashCode += getEelmine_ekande_id().hashCode();
        }
        if (getOn_kiirmenetlus() != null) {
            _hashCode += getOn_kiirmenetlus().hashCode();
        }
        if (getKr_menetluse_number() != null) {
            _hashCode += getKr_menetluse_number().hashCode();
        }
        if (getKande_kuupaev() != null) {
            _hashCode += getKande_kuupaev().hashCode();
        }
        if (getEsitaja_nimi() != null) {
            _hashCode += getEsitaja_nimi().hashCode();
        }
        if (getEsitaja_kood() != null) {
            _hashCode += getEsitaja_kood().hashCode();
        }
        if (getAsutamisnumber() != null) {
            _hashCode += getAsutamisnumber().hashCode();
        }
        if (getAmetitoiming() != null) {
            _hashCode += getAmetitoiming().hashCode();
        }
        if (getRiigiloivud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRiigiloivud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRiigiloivud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViitenumber_loiv() != null) {
            _hashCode += getViitenumber_loiv().hashCode();
        }
        if (getViitenumber_okap() != null) {
            _hashCode += getViitenumber_okap().hashCode();
        }
        if (getRegistri_piirkond() != null) {
            _hashCode += getRegistri_piirkond().hashCode();
        }
        if (getLisa_arp_markus() != null) {
            _hashCode += getLisa_arp_markus().hashCode();
        }
        if (getEemalda_arp_markus() != null) {
            _hashCode += getEemalda_arp_markus().hashCode();
        }
        if (getEttevotjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotjad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
