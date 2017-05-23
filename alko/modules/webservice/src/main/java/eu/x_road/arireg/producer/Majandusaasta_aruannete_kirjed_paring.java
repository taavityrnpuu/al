/**
 * Majandusaasta_aruannete_kirjed_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Majandusaasta_aruannete_kirjed_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private int ariregistri_kood;

    /* 01 - bilanss 
     *                         02 - kasumiaruanne skeem 1 
     *                         03 - kasumiaruanne skeem 2 
     *                         04 - rahavoogude aruanne 
     *                         05 - põhivara liikumine skeem 1 
     *                         06 - põhivara liikumine skeem 2 
     *                         07 - tulude-kulude aruanne 
     *                         08 - bilanss (2003-2004) 
     *                         09 - kasumiaruanne skeem 1 (alates 2003) 
     *                         10 - kasumiaruanne skeem 2 (alates 2003) 
     *                         11 - tulude-kulude aruanne (alates 2003) 
     *                         12 - bilanss (alates 2005) 
     *                         13 - rahavoogude aruanne (alates 2005) 
     *                         14 – bilanss (alates 2009 XBRLis esitatud
     * aruannete puhul kasutuses) 
     *                         15 - kasumiaruanne skeem 1 
     *                         16 - kasumiaruanne skeem 2 
     *                         17 - tulemiaruanne 
     *                         18 - rahavoogude aruanne (kaudne meetod)
     *                         19 - rahavoogude aruanne (otsene meetod) */
    private java.lang.String aruande_liik;

    private int aruandeaasta;

    /* Pole kasutusel */
    private java.lang.String keel;

    public Majandusaasta_aruannete_kirjed_paring() {
    }

    public Majandusaasta_aruannete_kirjed_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           int ariregistri_kood,
           java.lang.String aruande_liik,
           int aruandeaasta,
           java.lang.String keel) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregistri_kood = ariregistri_kood;
           this.aruande_liik = aruande_liik;
           this.aruandeaasta = aruandeaasta;
           this.keel = keel;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregistri_kood value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the aruande_liik value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @return aruande_liik   * 01 - bilanss 
     *                         02 - kasumiaruanne skeem 1 
     *                         03 - kasumiaruanne skeem 2 
     *                         04 - rahavoogude aruanne 
     *                         05 - põhivara liikumine skeem 1 
     *                         06 - põhivara liikumine skeem 2 
     *                         07 - tulude-kulude aruanne 
     *                         08 - bilanss (2003-2004) 
     *                         09 - kasumiaruanne skeem 1 (alates 2003) 
     *                         10 - kasumiaruanne skeem 2 (alates 2003) 
     *                         11 - tulude-kulude aruanne (alates 2003) 
     *                         12 - bilanss (alates 2005) 
     *                         13 - rahavoogude aruanne (alates 2005) 
     *                         14 – bilanss (alates 2009 XBRLis esitatud
     * aruannete puhul kasutuses) 
     *                         15 - kasumiaruanne skeem 1 
     *                         16 - kasumiaruanne skeem 2 
     *                         17 - tulemiaruanne 
     *                         18 - rahavoogude aruanne (kaudne meetod)
     *                         19 - rahavoogude aruanne (otsene meetod)
     */
    public java.lang.String getAruande_liik() {
        return aruande_liik;
    }


    /**
     * Sets the aruande_liik value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @param aruande_liik   * 01 - bilanss 
     *                         02 - kasumiaruanne skeem 1 
     *                         03 - kasumiaruanne skeem 2 
     *                         04 - rahavoogude aruanne 
     *                         05 - põhivara liikumine skeem 1 
     *                         06 - põhivara liikumine skeem 2 
     *                         07 - tulude-kulude aruanne 
     *                         08 - bilanss (2003-2004) 
     *                         09 - kasumiaruanne skeem 1 (alates 2003) 
     *                         10 - kasumiaruanne skeem 2 (alates 2003) 
     *                         11 - tulude-kulude aruanne (alates 2003) 
     *                         12 - bilanss (alates 2005) 
     *                         13 - rahavoogude aruanne (alates 2005) 
     *                         14 – bilanss (alates 2009 XBRLis esitatud
     * aruannete puhul kasutuses) 
     *                         15 - kasumiaruanne skeem 1 
     *                         16 - kasumiaruanne skeem 2 
     *                         17 - tulemiaruanne 
     *                         18 - rahavoogude aruanne (kaudne meetod)
     *                         19 - rahavoogude aruanne (otsene meetod)
     */
    public void setAruande_liik(java.lang.String aruande_liik) {
        this.aruande_liik = aruande_liik;
    }


    /**
     * Gets the aruandeaasta value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @return aruandeaasta
     */
    public int getAruandeaasta() {
        return aruandeaasta;
    }


    /**
     * Sets the aruandeaasta value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @param aruandeaasta
     */
    public void setAruandeaasta(int aruandeaasta) {
        this.aruandeaasta = aruandeaasta;
    }


    /**
     * Gets the keel value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @return keel   * Pole kasutusel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Majandusaasta_aruannete_kirjed_paring.
     * 
     * @param keel   * Pole kasutusel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandusaasta_aruannete_kirjed_paring)) return false;
        Majandusaasta_aruannete_kirjed_paring other = (Majandusaasta_aruannete_kirjed_paring) obj;
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
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.aruande_liik==null && other.getAruande_liik()==null) || 
             (this.aruande_liik!=null &&
              this.aruande_liik.equals(other.getAruande_liik()))) &&
            this.aruandeaasta == other.getAruandeaasta() &&
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
        _hashCode += getAriregistri_kood();
        if (getAruande_liik() != null) {
            _hashCode += getAruande_liik().hashCode();
        }
        _hashCode += getAruandeaasta();
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
