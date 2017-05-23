/**
 * Ettevotja_dokument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_dokument  implements java.io.Serializable {
    /* Dokumendi ID, saab kasutada sisendina teenuses arireg.toimiku_dokument.v1. */
    private java.math.BigInteger dokumendi_id;

    private int ariregistri_kood;

    /* A – majandusaasta aruanded PDF, D - majandusaasta aruanded
     * BDOC, DDOC, X - majandusaasta aruanded XBRL, P – põhikirjad */
    private java.lang.String dokumendi_liik;

    private java.lang.String dokumendi_nimetus;

    /* Väärtus on -1, kui suurust ei ole määratud. */
    private java.lang.Integer dokumendi_suurus;

    private java.util.Date dokumendi_seisu_kuupaev;

    /* K - kehtiv, A - aegunud */
    private java.lang.String dokumendi_kehtivus;

    /* P - lõpparuanne, L- likvideerimisbilanss, V - vahearuanne/bilanss,
     * A - aastaaruanne;  "" - põhikirjal aruande liik puudub */
    private java.lang.String aruande_liik;

    /* Põhikirja aruandeaaasta on 0. */
    private java.lang.Integer aruandeaasta;

    private java.lang.String dokumendi_url;

    public Ettevotja_dokument() {
    }

    public Ettevotja_dokument(
           java.math.BigInteger dokumendi_id,
           int ariregistri_kood,
           java.lang.String dokumendi_liik,
           java.lang.String dokumendi_nimetus,
           java.lang.Integer dokumendi_suurus,
           java.util.Date dokumendi_seisu_kuupaev,
           java.lang.String dokumendi_kehtivus,
           java.lang.String aruande_liik,
           java.lang.Integer aruandeaasta,
           java.lang.String dokumendi_url) {
           this.dokumendi_id = dokumendi_id;
           this.ariregistri_kood = ariregistri_kood;
           this.dokumendi_liik = dokumendi_liik;
           this.dokumendi_nimetus = dokumendi_nimetus;
           this.dokumendi_suurus = dokumendi_suurus;
           this.dokumendi_seisu_kuupaev = dokumendi_seisu_kuupaev;
           this.dokumendi_kehtivus = dokumendi_kehtivus;
           this.aruande_liik = aruande_liik;
           this.aruandeaasta = aruandeaasta;
           this.dokumendi_url = dokumendi_url;
    }


    /**
     * Gets the dokumendi_id value for this Ettevotja_dokument.
     * 
     * @return dokumendi_id   * Dokumendi ID, saab kasutada sisendina teenuses arireg.toimiku_dokument.v1.
     */
    public java.math.BigInteger getDokumendi_id() {
        return dokumendi_id;
    }


    /**
     * Sets the dokumendi_id value for this Ettevotja_dokument.
     * 
     * @param dokumendi_id   * Dokumendi ID, saab kasutada sisendina teenuses arireg.toimiku_dokument.v1.
     */
    public void setDokumendi_id(java.math.BigInteger dokumendi_id) {
        this.dokumendi_id = dokumendi_id;
    }


    /**
     * Gets the ariregistri_kood value for this Ettevotja_dokument.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ettevotja_dokument.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the dokumendi_liik value for this Ettevotja_dokument.
     * 
     * @return dokumendi_liik   * A – majandusaasta aruanded PDF, D - majandusaasta aruanded
     * BDOC, DDOC, X - majandusaasta aruanded XBRL, P – põhikirjad
     */
    public java.lang.String getDokumendi_liik() {
        return dokumendi_liik;
    }


    /**
     * Sets the dokumendi_liik value for this Ettevotja_dokument.
     * 
     * @param dokumendi_liik   * A – majandusaasta aruanded PDF, D - majandusaasta aruanded
     * BDOC, DDOC, X - majandusaasta aruanded XBRL, P – põhikirjad
     */
    public void setDokumendi_liik(java.lang.String dokumendi_liik) {
        this.dokumendi_liik = dokumendi_liik;
    }


    /**
     * Gets the dokumendi_nimetus value for this Ettevotja_dokument.
     * 
     * @return dokumendi_nimetus
     */
    public java.lang.String getDokumendi_nimetus() {
        return dokumendi_nimetus;
    }


    /**
     * Sets the dokumendi_nimetus value for this Ettevotja_dokument.
     * 
     * @param dokumendi_nimetus
     */
    public void setDokumendi_nimetus(java.lang.String dokumendi_nimetus) {
        this.dokumendi_nimetus = dokumendi_nimetus;
    }


    /**
     * Gets the dokumendi_suurus value for this Ettevotja_dokument.
     * 
     * @return dokumendi_suurus   * Väärtus on -1, kui suurust ei ole määratud.
     */
    public java.lang.Integer getDokumendi_suurus() {
        return dokumendi_suurus;
    }


    /**
     * Sets the dokumendi_suurus value for this Ettevotja_dokument.
     * 
     * @param dokumendi_suurus   * Väärtus on -1, kui suurust ei ole määratud.
     */
    public void setDokumendi_suurus(java.lang.Integer dokumendi_suurus) {
        this.dokumendi_suurus = dokumendi_suurus;
    }


    /**
     * Gets the dokumendi_seisu_kuupaev value for this Ettevotja_dokument.
     * 
     * @return dokumendi_seisu_kuupaev
     */
    public java.util.Date getDokumendi_seisu_kuupaev() {
        return dokumendi_seisu_kuupaev;
    }


    /**
     * Sets the dokumendi_seisu_kuupaev value for this Ettevotja_dokument.
     * 
     * @param dokumendi_seisu_kuupaev
     */
    public void setDokumendi_seisu_kuupaev(java.util.Date dokumendi_seisu_kuupaev) {
        this.dokumendi_seisu_kuupaev = dokumendi_seisu_kuupaev;
    }


    /**
     * Gets the dokumendi_kehtivus value for this Ettevotja_dokument.
     * 
     * @return dokumendi_kehtivus   * K - kehtiv, A - aegunud
     */
    public java.lang.String getDokumendi_kehtivus() {
        return dokumendi_kehtivus;
    }


    /**
     * Sets the dokumendi_kehtivus value for this Ettevotja_dokument.
     * 
     * @param dokumendi_kehtivus   * K - kehtiv, A - aegunud
     */
    public void setDokumendi_kehtivus(java.lang.String dokumendi_kehtivus) {
        this.dokumendi_kehtivus = dokumendi_kehtivus;
    }


    /**
     * Gets the aruande_liik value for this Ettevotja_dokument.
     * 
     * @return aruande_liik   * P - lõpparuanne, L- likvideerimisbilanss, V - vahearuanne/bilanss,
     * A - aastaaruanne;  "" - põhikirjal aruande liik puudub
     */
    public java.lang.String getAruande_liik() {
        return aruande_liik;
    }


    /**
     * Sets the aruande_liik value for this Ettevotja_dokument.
     * 
     * @param aruande_liik   * P - lõpparuanne, L- likvideerimisbilanss, V - vahearuanne/bilanss,
     * A - aastaaruanne;  "" - põhikirjal aruande liik puudub
     */
    public void setAruande_liik(java.lang.String aruande_liik) {
        this.aruande_liik = aruande_liik;
    }


    /**
     * Gets the aruandeaasta value for this Ettevotja_dokument.
     * 
     * @return aruandeaasta   * Põhikirja aruandeaaasta on 0.
     */
    public java.lang.Integer getAruandeaasta() {
        return aruandeaasta;
    }


    /**
     * Sets the aruandeaasta value for this Ettevotja_dokument.
     * 
     * @param aruandeaasta   * Põhikirja aruandeaaasta on 0.
     */
    public void setAruandeaasta(java.lang.Integer aruandeaasta) {
        this.aruandeaasta = aruandeaasta;
    }


    /**
     * Gets the dokumendi_url value for this Ettevotja_dokument.
     * 
     * @return dokumendi_url
     */
    public java.lang.String getDokumendi_url() {
        return dokumendi_url;
    }


    /**
     * Sets the dokumendi_url value for this Ettevotja_dokument.
     * 
     * @param dokumendi_url
     */
    public void setDokumendi_url(java.lang.String dokumendi_url) {
        this.dokumendi_url = dokumendi_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_dokument)) return false;
        Ettevotja_dokument other = (Ettevotja_dokument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dokumendi_id==null && other.getDokumendi_id()==null) || 
             (this.dokumendi_id!=null &&
              this.dokumendi_id.equals(other.getDokumendi_id()))) &&
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.dokumendi_liik==null && other.getDokumendi_liik()==null) || 
             (this.dokumendi_liik!=null &&
              this.dokumendi_liik.equals(other.getDokumendi_liik()))) &&
            ((this.dokumendi_nimetus==null && other.getDokumendi_nimetus()==null) || 
             (this.dokumendi_nimetus!=null &&
              this.dokumendi_nimetus.equals(other.getDokumendi_nimetus()))) &&
            ((this.dokumendi_suurus==null && other.getDokumendi_suurus()==null) || 
             (this.dokumendi_suurus!=null &&
              this.dokumendi_suurus.equals(other.getDokumendi_suurus()))) &&
            ((this.dokumendi_seisu_kuupaev==null && other.getDokumendi_seisu_kuupaev()==null) || 
             (this.dokumendi_seisu_kuupaev!=null &&
              this.dokumendi_seisu_kuupaev.equals(other.getDokumendi_seisu_kuupaev()))) &&
            ((this.dokumendi_kehtivus==null && other.getDokumendi_kehtivus()==null) || 
             (this.dokumendi_kehtivus!=null &&
              this.dokumendi_kehtivus.equals(other.getDokumendi_kehtivus()))) &&
            ((this.aruande_liik==null && other.getAruande_liik()==null) || 
             (this.aruande_liik!=null &&
              this.aruande_liik.equals(other.getAruande_liik()))) &&
            ((this.aruandeaasta==null && other.getAruandeaasta()==null) || 
             (this.aruandeaasta!=null &&
              this.aruandeaasta.equals(other.getAruandeaasta()))) &&
            ((this.dokumendi_url==null && other.getDokumendi_url()==null) || 
             (this.dokumendi_url!=null &&
              this.dokumendi_url.equals(other.getDokumendi_url())));
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
        if (getDokumendi_id() != null) {
            _hashCode += getDokumendi_id().hashCode();
        }
        _hashCode += getAriregistri_kood();
        if (getDokumendi_liik() != null) {
            _hashCode += getDokumendi_liik().hashCode();
        }
        if (getDokumendi_nimetus() != null) {
            _hashCode += getDokumendi_nimetus().hashCode();
        }
        if (getDokumendi_suurus() != null) {
            _hashCode += getDokumendi_suurus().hashCode();
        }
        if (getDokumendi_seisu_kuupaev() != null) {
            _hashCode += getDokumendi_seisu_kuupaev().hashCode();
        }
        if (getDokumendi_kehtivus() != null) {
            _hashCode += getDokumendi_kehtivus().hashCode();
        }
        if (getAruande_liik() != null) {
            _hashCode += getAruande_liik().hashCode();
        }
        if (getAruandeaasta() != null) {
            _hashCode += getAruandeaasta().hashCode();
        }
        if (getDokumendi_url() != null) {
            _hashCode += getDokumendi_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
