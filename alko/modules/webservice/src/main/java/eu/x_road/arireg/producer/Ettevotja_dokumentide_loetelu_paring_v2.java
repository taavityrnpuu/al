/**
 * Ettevotja_dokumentide_loetelu_paring_v2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_dokumentide_loetelu_paring_v2  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    /* Mis ettevõtte kohta dokumente päritakse. Kohustuslik, kui pole
     * kuupäeva. */
    private java.lang.Integer ariregistri_kood;

    /* Näitab, millise kuupäeva kohta dokumente päritakse. Kohustuslik,
     * kui pole äriregistri koodi. */
    private java.util.Date kuupaev;

    /* Näitab mitmendat valimit andmetest päritakse. Kohustuslik,
     * kui teostatakse päring kuupäeva järgi. */
    private java.math.BigInteger lehekylg;

    /* Näitab, millise aasta kohta majandusaasta aruannete linke saada
     * soovitakse. Põhikirju aasta numbri järgi otsida ei saa. Kasutatakse
     * ainult ariregistri koodiga otsingus. */
    private java.lang.Integer aruandeaasta;

    /* A – majandusaasta aruanded PDF, D - majandusaasta aruanded
     * BDOC, DDOC, X - majandusaasta aruanded XBRL, P – põhikirjad, K - majandusaasta
     * aruanded ja põhikirjad (vaikimisi) */
    private java.lang.String dokumendi_liik;

    /* K – kehtiv (vaikimisi), A – ajaloolised ja kehtivad */
    private java.lang.String dokumendi_kehtivus;

    /* Pole kasutusel */
    private java.lang.String keel;

    public Ettevotja_dokumentide_loetelu_paring_v2() {
    }

    public Ettevotja_dokumentide_loetelu_paring_v2(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.lang.Integer ariregistri_kood,
           java.util.Date kuupaev,
           java.math.BigInteger lehekylg,
           java.lang.Integer aruandeaasta,
           java.lang.String dokumendi_liik,
           java.lang.String dokumendi_kehtivus,
           java.lang.String keel) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregistri_kood = ariregistri_kood;
           this.kuupaev = kuupaev;
           this.lehekylg = lehekylg;
           this.aruandeaasta = aruandeaasta;
           this.dokumendi_liik = dokumendi_liik;
           this.dokumendi_kehtivus = dokumendi_kehtivus;
           this.keel = keel;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregistri_kood value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return ariregistri_kood   * Mis ettevõtte kohta dokumente päritakse. Kohustuslik, kui pole
     * kuupäeva.
     */
    public java.lang.Integer getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param ariregistri_kood   * Mis ettevõtte kohta dokumente päritakse. Kohustuslik, kui pole
     * kuupäeva.
     */
    public void setAriregistri_kood(java.lang.Integer ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the kuupaev value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return kuupaev   * Näitab, millise kuupäeva kohta dokumente päritakse. Kohustuslik,
     * kui pole äriregistri koodi.
     */
    public java.util.Date getKuupaev() {
        return kuupaev;
    }


    /**
     * Sets the kuupaev value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param kuupaev   * Näitab, millise kuupäeva kohta dokumente päritakse. Kohustuslik,
     * kui pole äriregistri koodi.
     */
    public void setKuupaev(java.util.Date kuupaev) {
        this.kuupaev = kuupaev;
    }


    /**
     * Gets the lehekylg value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return lehekylg   * Näitab mitmendat valimit andmetest päritakse. Kohustuslik,
     * kui teostatakse päring kuupäeva järgi.
     */
    public java.math.BigInteger getLehekylg() {
        return lehekylg;
    }


    /**
     * Sets the lehekylg value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param lehekylg   * Näitab mitmendat valimit andmetest päritakse. Kohustuslik,
     * kui teostatakse päring kuupäeva järgi.
     */
    public void setLehekylg(java.math.BigInteger lehekylg) {
        this.lehekylg = lehekylg;
    }


    /**
     * Gets the aruandeaasta value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return aruandeaasta   * Näitab, millise aasta kohta majandusaasta aruannete linke saada
     * soovitakse. Põhikirju aasta numbri järgi otsida ei saa. Kasutatakse
     * ainult ariregistri koodiga otsingus.
     */
    public java.lang.Integer getAruandeaasta() {
        return aruandeaasta;
    }


    /**
     * Sets the aruandeaasta value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param aruandeaasta   * Näitab, millise aasta kohta majandusaasta aruannete linke saada
     * soovitakse. Põhikirju aasta numbri järgi otsida ei saa. Kasutatakse
     * ainult ariregistri koodiga otsingus.
     */
    public void setAruandeaasta(java.lang.Integer aruandeaasta) {
        this.aruandeaasta = aruandeaasta;
    }


    /**
     * Gets the dokumendi_liik value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return dokumendi_liik   * A – majandusaasta aruanded PDF, D - majandusaasta aruanded
     * BDOC, DDOC, X - majandusaasta aruanded XBRL, P – põhikirjad, K - majandusaasta
     * aruanded ja põhikirjad (vaikimisi)
     */
    public java.lang.String getDokumendi_liik() {
        return dokumendi_liik;
    }


    /**
     * Sets the dokumendi_liik value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param dokumendi_liik   * A – majandusaasta aruanded PDF, D - majandusaasta aruanded
     * BDOC, DDOC, X - majandusaasta aruanded XBRL, P – põhikirjad, K - majandusaasta
     * aruanded ja põhikirjad (vaikimisi)
     */
    public void setDokumendi_liik(java.lang.String dokumendi_liik) {
        this.dokumendi_liik = dokumendi_liik;
    }


    /**
     * Gets the dokumendi_kehtivus value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return dokumendi_kehtivus   * K – kehtiv (vaikimisi), A – ajaloolised ja kehtivad
     */
    public java.lang.String getDokumendi_kehtivus() {
        return dokumendi_kehtivus;
    }


    /**
     * Sets the dokumendi_kehtivus value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param dokumendi_kehtivus   * K – kehtiv (vaikimisi), A – ajaloolised ja kehtivad
     */
    public void setDokumendi_kehtivus(java.lang.String dokumendi_kehtivus) {
        this.dokumendi_kehtivus = dokumendi_kehtivus;
    }


    /**
     * Gets the keel value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @return keel   * Pole kasutusel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Ettevotja_dokumentide_loetelu_paring_v2.
     * 
     * @param keel   * Pole kasutusel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_dokumentide_loetelu_paring_v2)) return false;
        Ettevotja_dokumentide_loetelu_paring_v2 other = (Ettevotja_dokumentide_loetelu_paring_v2) obj;
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
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.kuupaev==null && other.getKuupaev()==null) || 
             (this.kuupaev!=null &&
              this.kuupaev.equals(other.getKuupaev()))) &&
            ((this.lehekylg==null && other.getLehekylg()==null) || 
             (this.lehekylg!=null &&
              this.lehekylg.equals(other.getLehekylg()))) &&
            ((this.aruandeaasta==null && other.getAruandeaasta()==null) || 
             (this.aruandeaasta!=null &&
              this.aruandeaasta.equals(other.getAruandeaasta()))) &&
            ((this.dokumendi_liik==null && other.getDokumendi_liik()==null) || 
             (this.dokumendi_liik!=null &&
              this.dokumendi_liik.equals(other.getDokumendi_liik()))) &&
            ((this.dokumendi_kehtivus==null && other.getDokumendi_kehtivus()==null) || 
             (this.dokumendi_kehtivus!=null &&
              this.dokumendi_kehtivus.equals(other.getDokumendi_kehtivus()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getKuupaev() != null) {
            _hashCode += getKuupaev().hashCode();
        }
        if (getLehekylg() != null) {
            _hashCode += getLehekylg().hashCode();
        }
        if (getAruandeaasta() != null) {
            _hashCode += getAruandeaasta().hashCode();
        }
        if (getDokumendi_liik() != null) {
            _hashCode += getDokumendi_liik().hashCode();
        }
        if (getDokumendi_kehtivus() != null) {
            _hashCode += getDokumendi_kehtivus().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
