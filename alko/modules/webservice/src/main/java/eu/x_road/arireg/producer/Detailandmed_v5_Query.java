/**
 * Detailandmed_v5_Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_Query  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private java.lang.String ariregister_sessioon;

    private java.lang.String ariregister_valjundi_formaat;

    private java.lang.String arinimi;

    private java.math.BigInteger ariregistri_kood;

    private java.math.BigInteger ettevotja_id;

    private java.lang.String asukoht_ettevotja_aadressis;

    private java.lang.String haldyksus_ettevotja_aadressis;

    private java.lang.String fyysilise_isiku_eesnimi;

    private java.lang.String fyysilise_isiku_perekonnanimi;

    private java.util.Date fyysilise_isiku_synniaeg;

    private java.lang.String fyysilise_isiku_kood;

    private java.lang.String[] fyysilise_isiku_roll_jada;

    private java.lang.String jurisik_nimetus;

    private java.lang.String jurisik_ark;

    private java.lang.String[] jurisik_roll_jada;

    private boolean yandmed;

    private boolean iandmed;

    private boolean kandmed;

    private boolean dandmed;

    private boolean maarused;

    private java.lang.Boolean ainult_kehtivad;

    /* Võimalik filtreerida kindlaid staatusi, R=Registrisse kantud,
     * L=Likvideerimisel, N=Pankrotis, K=Kustutatud. Kui staatusi päringusse
     * sisse antud ei ole, siis tagastatakse kõik staatused (v.a. projekt/mitte-kantud/eitav). */
    private java.lang.String[] staatused;

    private java.lang.String keel;

    private java.math.BigInteger evarv;

    public Detailandmed_v5_Query() {
    }

    public Detailandmed_v5_Query(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.lang.String ariregister_sessioon,
           java.lang.String ariregister_valjundi_formaat,
           java.lang.String arinimi,
           java.math.BigInteger ariregistri_kood,
           java.math.BigInteger ettevotja_id,
           java.lang.String asukoht_ettevotja_aadressis,
           java.lang.String haldyksus_ettevotja_aadressis,
           java.lang.String fyysilise_isiku_eesnimi,
           java.lang.String fyysilise_isiku_perekonnanimi,
           java.util.Date fyysilise_isiku_synniaeg,
           java.lang.String fyysilise_isiku_kood,
           java.lang.String[] fyysilise_isiku_roll_jada,
           java.lang.String jurisik_nimetus,
           java.lang.String jurisik_ark,
           java.lang.String[] jurisik_roll_jada,
           boolean yandmed,
           boolean iandmed,
           boolean kandmed,
           boolean dandmed,
           boolean maarused,
           java.lang.Boolean ainult_kehtivad,
           java.lang.String[] staatused,
           java.lang.String keel,
           java.math.BigInteger evarv) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregister_sessioon = ariregister_sessioon;
           this.ariregister_valjundi_formaat = ariregister_valjundi_formaat;
           this.arinimi = arinimi;
           this.ariregistri_kood = ariregistri_kood;
           this.ettevotja_id = ettevotja_id;
           this.asukoht_ettevotja_aadressis = asukoht_ettevotja_aadressis;
           this.haldyksus_ettevotja_aadressis = haldyksus_ettevotja_aadressis;
           this.fyysilise_isiku_eesnimi = fyysilise_isiku_eesnimi;
           this.fyysilise_isiku_perekonnanimi = fyysilise_isiku_perekonnanimi;
           this.fyysilise_isiku_synniaeg = fyysilise_isiku_synniaeg;
           this.fyysilise_isiku_kood = fyysilise_isiku_kood;
           this.fyysilise_isiku_roll_jada = fyysilise_isiku_roll_jada;
           this.jurisik_nimetus = jurisik_nimetus;
           this.jurisik_ark = jurisik_ark;
           this.jurisik_roll_jada = jurisik_roll_jada;
           this.yandmed = yandmed;
           this.iandmed = iandmed;
           this.kandmed = kandmed;
           this.dandmed = dandmed;
           this.maarused = maarused;
           this.ainult_kehtivad = ainult_kehtivad;
           this.staatused = staatused;
           this.keel = keel;
           this.evarv = evarv;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Detailandmed_v5_Query.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Detailandmed_v5_Query.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Detailandmed_v5_Query.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Detailandmed_v5_Query.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregister_sessioon value for this Detailandmed_v5_Query.
     * 
     * @return ariregister_sessioon
     */
    public java.lang.String getAriregister_sessioon() {
        return ariregister_sessioon;
    }


    /**
     * Sets the ariregister_sessioon value for this Detailandmed_v5_Query.
     * 
     * @param ariregister_sessioon
     */
    public void setAriregister_sessioon(java.lang.String ariregister_sessioon) {
        this.ariregister_sessioon = ariregister_sessioon;
    }


    /**
     * Gets the ariregister_valjundi_formaat value for this Detailandmed_v5_Query.
     * 
     * @return ariregister_valjundi_formaat
     */
    public java.lang.String getAriregister_valjundi_formaat() {
        return ariregister_valjundi_formaat;
    }


    /**
     * Sets the ariregister_valjundi_formaat value for this Detailandmed_v5_Query.
     * 
     * @param ariregister_valjundi_formaat
     */
    public void setAriregister_valjundi_formaat(java.lang.String ariregister_valjundi_formaat) {
        this.ariregister_valjundi_formaat = ariregister_valjundi_formaat;
    }


    /**
     * Gets the arinimi value for this Detailandmed_v5_Query.
     * 
     * @return arinimi
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }


    /**
     * Sets the arinimi value for this Detailandmed_v5_Query.
     * 
     * @param arinimi
     */
    public void setArinimi(java.lang.String arinimi) {
        this.arinimi = arinimi;
    }


    /**
     * Gets the ariregistri_kood value for this Detailandmed_v5_Query.
     * 
     * @return ariregistri_kood
     */
    public java.math.BigInteger getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Detailandmed_v5_Query.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.math.BigInteger ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the ettevotja_id value for this Detailandmed_v5_Query.
     * 
     * @return ettevotja_id
     */
    public java.math.BigInteger getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Detailandmed_v5_Query.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.math.BigInteger ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the asukoht_ettevotja_aadressis value for this Detailandmed_v5_Query.
     * 
     * @return asukoht_ettevotja_aadressis
     */
    public java.lang.String getAsukoht_ettevotja_aadressis() {
        return asukoht_ettevotja_aadressis;
    }


    /**
     * Sets the asukoht_ettevotja_aadressis value for this Detailandmed_v5_Query.
     * 
     * @param asukoht_ettevotja_aadressis
     */
    public void setAsukoht_ettevotja_aadressis(java.lang.String asukoht_ettevotja_aadressis) {
        this.asukoht_ettevotja_aadressis = asukoht_ettevotja_aadressis;
    }


    /**
     * Gets the haldyksus_ettevotja_aadressis value for this Detailandmed_v5_Query.
     * 
     * @return haldyksus_ettevotja_aadressis
     */
    public java.lang.String getHaldyksus_ettevotja_aadressis() {
        return haldyksus_ettevotja_aadressis;
    }


    /**
     * Sets the haldyksus_ettevotja_aadressis value for this Detailandmed_v5_Query.
     * 
     * @param haldyksus_ettevotja_aadressis
     */
    public void setHaldyksus_ettevotja_aadressis(java.lang.String haldyksus_ettevotja_aadressis) {
        this.haldyksus_ettevotja_aadressis = haldyksus_ettevotja_aadressis;
    }


    /**
     * Gets the fyysilise_isiku_eesnimi value for this Detailandmed_v5_Query.
     * 
     * @return fyysilise_isiku_eesnimi
     */
    public java.lang.String getFyysilise_isiku_eesnimi() {
        return fyysilise_isiku_eesnimi;
    }


    /**
     * Sets the fyysilise_isiku_eesnimi value for this Detailandmed_v5_Query.
     * 
     * @param fyysilise_isiku_eesnimi
     */
    public void setFyysilise_isiku_eesnimi(java.lang.String fyysilise_isiku_eesnimi) {
        this.fyysilise_isiku_eesnimi = fyysilise_isiku_eesnimi;
    }


    /**
     * Gets the fyysilise_isiku_perekonnanimi value for this Detailandmed_v5_Query.
     * 
     * @return fyysilise_isiku_perekonnanimi
     */
    public java.lang.String getFyysilise_isiku_perekonnanimi() {
        return fyysilise_isiku_perekonnanimi;
    }


    /**
     * Sets the fyysilise_isiku_perekonnanimi value for this Detailandmed_v5_Query.
     * 
     * @param fyysilise_isiku_perekonnanimi
     */
    public void setFyysilise_isiku_perekonnanimi(java.lang.String fyysilise_isiku_perekonnanimi) {
        this.fyysilise_isiku_perekonnanimi = fyysilise_isiku_perekonnanimi;
    }


    /**
     * Gets the fyysilise_isiku_synniaeg value for this Detailandmed_v5_Query.
     * 
     * @return fyysilise_isiku_synniaeg
     */
    public java.util.Date getFyysilise_isiku_synniaeg() {
        return fyysilise_isiku_synniaeg;
    }


    /**
     * Sets the fyysilise_isiku_synniaeg value for this Detailandmed_v5_Query.
     * 
     * @param fyysilise_isiku_synniaeg
     */
    public void setFyysilise_isiku_synniaeg(java.util.Date fyysilise_isiku_synniaeg) {
        this.fyysilise_isiku_synniaeg = fyysilise_isiku_synniaeg;
    }


    /**
     * Gets the fyysilise_isiku_kood value for this Detailandmed_v5_Query.
     * 
     * @return fyysilise_isiku_kood
     */
    public java.lang.String getFyysilise_isiku_kood() {
        return fyysilise_isiku_kood;
    }


    /**
     * Sets the fyysilise_isiku_kood value for this Detailandmed_v5_Query.
     * 
     * @param fyysilise_isiku_kood
     */
    public void setFyysilise_isiku_kood(java.lang.String fyysilise_isiku_kood) {
        this.fyysilise_isiku_kood = fyysilise_isiku_kood;
    }


    /**
     * Gets the fyysilise_isiku_roll_jada value for this Detailandmed_v5_Query.
     * 
     * @return fyysilise_isiku_roll_jada
     */
    public java.lang.String[] getFyysilise_isiku_roll_jada() {
        return fyysilise_isiku_roll_jada;
    }


    /**
     * Sets the fyysilise_isiku_roll_jada value for this Detailandmed_v5_Query.
     * 
     * @param fyysilise_isiku_roll_jada
     */
    public void setFyysilise_isiku_roll_jada(java.lang.String[] fyysilise_isiku_roll_jada) {
        this.fyysilise_isiku_roll_jada = fyysilise_isiku_roll_jada;
    }

    public java.lang.String getFyysilise_isiku_roll_jada(int i) {
        return this.fyysilise_isiku_roll_jada[i];
    }

    public void setFyysilise_isiku_roll_jada(int i, java.lang.String _value) {
        this.fyysilise_isiku_roll_jada[i] = _value;
    }


    /**
     * Gets the jurisik_nimetus value for this Detailandmed_v5_Query.
     * 
     * @return jurisik_nimetus
     */
    public java.lang.String getJurisik_nimetus() {
        return jurisik_nimetus;
    }


    /**
     * Sets the jurisik_nimetus value for this Detailandmed_v5_Query.
     * 
     * @param jurisik_nimetus
     */
    public void setJurisik_nimetus(java.lang.String jurisik_nimetus) {
        this.jurisik_nimetus = jurisik_nimetus;
    }


    /**
     * Gets the jurisik_ark value for this Detailandmed_v5_Query.
     * 
     * @return jurisik_ark
     */
    public java.lang.String getJurisik_ark() {
        return jurisik_ark;
    }


    /**
     * Sets the jurisik_ark value for this Detailandmed_v5_Query.
     * 
     * @param jurisik_ark
     */
    public void setJurisik_ark(java.lang.String jurisik_ark) {
        this.jurisik_ark = jurisik_ark;
    }


    /**
     * Gets the jurisik_roll_jada value for this Detailandmed_v5_Query.
     * 
     * @return jurisik_roll_jada
     */
    public java.lang.String[] getJurisik_roll_jada() {
        return jurisik_roll_jada;
    }


    /**
     * Sets the jurisik_roll_jada value for this Detailandmed_v5_Query.
     * 
     * @param jurisik_roll_jada
     */
    public void setJurisik_roll_jada(java.lang.String[] jurisik_roll_jada) {
        this.jurisik_roll_jada = jurisik_roll_jada;
    }

    public java.lang.String getJurisik_roll_jada(int i) {
        return this.jurisik_roll_jada[i];
    }

    public void setJurisik_roll_jada(int i, java.lang.String _value) {
        this.jurisik_roll_jada[i] = _value;
    }


    /**
     * Gets the yandmed value for this Detailandmed_v5_Query.
     * 
     * @return yandmed
     */
    public boolean isYandmed() {
        return yandmed;
    }


    /**
     * Sets the yandmed value for this Detailandmed_v5_Query.
     * 
     * @param yandmed
     */
    public void setYandmed(boolean yandmed) {
        this.yandmed = yandmed;
    }


    /**
     * Gets the iandmed value for this Detailandmed_v5_Query.
     * 
     * @return iandmed
     */
    public boolean isIandmed() {
        return iandmed;
    }


    /**
     * Sets the iandmed value for this Detailandmed_v5_Query.
     * 
     * @param iandmed
     */
    public void setIandmed(boolean iandmed) {
        this.iandmed = iandmed;
    }


    /**
     * Gets the kandmed value for this Detailandmed_v5_Query.
     * 
     * @return kandmed
     */
    public boolean isKandmed() {
        return kandmed;
    }


    /**
     * Sets the kandmed value for this Detailandmed_v5_Query.
     * 
     * @param kandmed
     */
    public void setKandmed(boolean kandmed) {
        this.kandmed = kandmed;
    }


    /**
     * Gets the dandmed value for this Detailandmed_v5_Query.
     * 
     * @return dandmed
     */
    public boolean isDandmed() {
        return dandmed;
    }


    /**
     * Sets the dandmed value for this Detailandmed_v5_Query.
     * 
     * @param dandmed
     */
    public void setDandmed(boolean dandmed) {
        this.dandmed = dandmed;
    }


    /**
     * Gets the maarused value for this Detailandmed_v5_Query.
     * 
     * @return maarused
     */
    public boolean isMaarused() {
        return maarused;
    }


    /**
     * Sets the maarused value for this Detailandmed_v5_Query.
     * 
     * @param maarused
     */
    public void setMaarused(boolean maarused) {
        this.maarused = maarused;
    }


    /**
     * Gets the ainult_kehtivad value for this Detailandmed_v5_Query.
     * 
     * @return ainult_kehtivad
     */
    public java.lang.Boolean getAinult_kehtivad() {
        return ainult_kehtivad;
    }


    /**
     * Sets the ainult_kehtivad value for this Detailandmed_v5_Query.
     * 
     * @param ainult_kehtivad
     */
    public void setAinult_kehtivad(java.lang.Boolean ainult_kehtivad) {
        this.ainult_kehtivad = ainult_kehtivad;
    }


    /**
     * Gets the staatused value for this Detailandmed_v5_Query.
     * 
     * @return staatused   * Võimalik filtreerida kindlaid staatusi, R=Registrisse kantud,
     * L=Likvideerimisel, N=Pankrotis, K=Kustutatud. Kui staatusi päringusse
     * sisse antud ei ole, siis tagastatakse kõik staatused (v.a. projekt/mitte-kantud/eitav).
     */
    public java.lang.String[] getStaatused() {
        return staatused;
    }


    /**
     * Sets the staatused value for this Detailandmed_v5_Query.
     * 
     * @param staatused   * Võimalik filtreerida kindlaid staatusi, R=Registrisse kantud,
     * L=Likvideerimisel, N=Pankrotis, K=Kustutatud. Kui staatusi päringusse
     * sisse antud ei ole, siis tagastatakse kõik staatused (v.a. projekt/mitte-kantud/eitav).
     */
    public void setStaatused(java.lang.String[] staatused) {
        this.staatused = staatused;
    }

    public java.lang.String getStaatused(int i) {
        return this.staatused[i];
    }

    public void setStaatused(int i, java.lang.String _value) {
        this.staatused[i] = _value;
    }


    /**
     * Gets the keel value for this Detailandmed_v5_Query.
     * 
     * @return keel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Detailandmed_v5_Query.
     * 
     * @param keel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }


    /**
     * Gets the evarv value for this Detailandmed_v5_Query.
     * 
     * @return evarv
     */
    public java.math.BigInteger getEvarv() {
        return evarv;
    }


    /**
     * Sets the evarv value for this Detailandmed_v5_Query.
     * 
     * @param evarv
     */
    public void setEvarv(java.math.BigInteger evarv) {
        this.evarv = evarv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_Query)) return false;
        Detailandmed_v5_Query other = (Detailandmed_v5_Query) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregister_kasutajanimi==null && other.getAriregister_kasutajanimi()==null) || 
             (this.ariregister_kasutajanimi!=null &&
              this.ariregister_kasutajanimi.equals(other.getAriregister_kasutajanimi()))) &&
            ((this.ariregister_parool==null && other.getAriregister_parool()==null) || 
             (this.ariregister_parool!=null &&
              this.ariregister_parool.equals(other.getAriregister_parool()))) &&
            ((this.ariregister_sessioon==null && other.getAriregister_sessioon()==null) || 
             (this.ariregister_sessioon!=null &&
              this.ariregister_sessioon.equals(other.getAriregister_sessioon()))) &&
            ((this.ariregister_valjundi_formaat==null && other.getAriregister_valjundi_formaat()==null) || 
             (this.ariregister_valjundi_formaat!=null &&
              this.ariregister_valjundi_formaat.equals(other.getAriregister_valjundi_formaat()))) &&
            ((this.arinimi==null && other.getArinimi()==null) || 
             (this.arinimi!=null &&
              this.arinimi.equals(other.getArinimi()))) &&
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id()))) &&
            ((this.asukoht_ettevotja_aadressis==null && other.getAsukoht_ettevotja_aadressis()==null) || 
             (this.asukoht_ettevotja_aadressis!=null &&
              this.asukoht_ettevotja_aadressis.equals(other.getAsukoht_ettevotja_aadressis()))) &&
            ((this.haldyksus_ettevotja_aadressis==null && other.getHaldyksus_ettevotja_aadressis()==null) || 
             (this.haldyksus_ettevotja_aadressis!=null &&
              this.haldyksus_ettevotja_aadressis.equals(other.getHaldyksus_ettevotja_aadressis()))) &&
            ((this.fyysilise_isiku_eesnimi==null && other.getFyysilise_isiku_eesnimi()==null) || 
             (this.fyysilise_isiku_eesnimi!=null &&
              this.fyysilise_isiku_eesnimi.equals(other.getFyysilise_isiku_eesnimi()))) &&
            ((this.fyysilise_isiku_perekonnanimi==null && other.getFyysilise_isiku_perekonnanimi()==null) || 
             (this.fyysilise_isiku_perekonnanimi!=null &&
              this.fyysilise_isiku_perekonnanimi.equals(other.getFyysilise_isiku_perekonnanimi()))) &&
            ((this.fyysilise_isiku_synniaeg==null && other.getFyysilise_isiku_synniaeg()==null) || 
             (this.fyysilise_isiku_synniaeg!=null &&
              this.fyysilise_isiku_synniaeg.equals(other.getFyysilise_isiku_synniaeg()))) &&
            ((this.fyysilise_isiku_kood==null && other.getFyysilise_isiku_kood()==null) || 
             (this.fyysilise_isiku_kood!=null &&
              this.fyysilise_isiku_kood.equals(other.getFyysilise_isiku_kood()))) &&
            ((this.fyysilise_isiku_roll_jada==null && other.getFyysilise_isiku_roll_jada()==null) || 
             (this.fyysilise_isiku_roll_jada!=null &&
              java.util.Arrays.equals(this.fyysilise_isiku_roll_jada, other.getFyysilise_isiku_roll_jada()))) &&
            ((this.jurisik_nimetus==null && other.getJurisik_nimetus()==null) || 
             (this.jurisik_nimetus!=null &&
              this.jurisik_nimetus.equals(other.getJurisik_nimetus()))) &&
            ((this.jurisik_ark==null && other.getJurisik_ark()==null) || 
             (this.jurisik_ark!=null &&
              this.jurisik_ark.equals(other.getJurisik_ark()))) &&
            ((this.jurisik_roll_jada==null && other.getJurisik_roll_jada()==null) || 
             (this.jurisik_roll_jada!=null &&
              java.util.Arrays.equals(this.jurisik_roll_jada, other.getJurisik_roll_jada()))) &&
            this.yandmed == other.isYandmed() &&
            this.iandmed == other.isIandmed() &&
            this.kandmed == other.isKandmed() &&
            this.dandmed == other.isDandmed() &&
            this.maarused == other.isMaarused() &&
            ((this.ainult_kehtivad==null && other.getAinult_kehtivad()==null) || 
             (this.ainult_kehtivad!=null &&
              this.ainult_kehtivad.equals(other.getAinult_kehtivad()))) &&
            ((this.staatused==null && other.getStaatused()==null) || 
             (this.staatused!=null &&
              java.util.Arrays.equals(this.staatused, other.getStaatused()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel()))) &&
            ((this.evarv==null && other.getEvarv()==null) || 
             (this.evarv!=null &&
              this.evarv.equals(other.getEvarv())));
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
        if (getAriregister_kasutajanimi() != null) {
            _hashCode += getAriregister_kasutajanimi().hashCode();
        }
        if (getAriregister_parool() != null) {
            _hashCode += getAriregister_parool().hashCode();
        }
        if (getAriregister_sessioon() != null) {
            _hashCode += getAriregister_sessioon().hashCode();
        }
        if (getAriregister_valjundi_formaat() != null) {
            _hashCode += getAriregister_valjundi_formaat().hashCode();
        }
        if (getArinimi() != null) {
            _hashCode += getArinimi().hashCode();
        }
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        if (getAsukoht_ettevotja_aadressis() != null) {
            _hashCode += getAsukoht_ettevotja_aadressis().hashCode();
        }
        if (getHaldyksus_ettevotja_aadressis() != null) {
            _hashCode += getHaldyksus_ettevotja_aadressis().hashCode();
        }
        if (getFyysilise_isiku_eesnimi() != null) {
            _hashCode += getFyysilise_isiku_eesnimi().hashCode();
        }
        if (getFyysilise_isiku_perekonnanimi() != null) {
            _hashCode += getFyysilise_isiku_perekonnanimi().hashCode();
        }
        if (getFyysilise_isiku_synniaeg() != null) {
            _hashCode += getFyysilise_isiku_synniaeg().hashCode();
        }
        if (getFyysilise_isiku_kood() != null) {
            _hashCode += getFyysilise_isiku_kood().hashCode();
        }
        if (getFyysilise_isiku_roll_jada() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFyysilise_isiku_roll_jada());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFyysilise_isiku_roll_jada(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJurisik_nimetus() != null) {
            _hashCode += getJurisik_nimetus().hashCode();
        }
        if (getJurisik_ark() != null) {
            _hashCode += getJurisik_ark().hashCode();
        }
        if (getJurisik_roll_jada() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJurisik_roll_jada());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJurisik_roll_jada(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isYandmed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIandmed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isKandmed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDandmed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMaarused() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAinult_kehtivad() != null) {
            _hashCode += getAinult_kehtivad().hashCode();
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
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        if (getEvarv() != null) {
            _hashCode += getEvarv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
