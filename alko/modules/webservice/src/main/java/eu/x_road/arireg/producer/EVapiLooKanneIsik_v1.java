/**
 * EVapiLooKanneIsik_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneIsik_v1  implements java.io.Serializable {
    /* Isiku liik: F - füüsiline, J - juriidiline (NB: FIE lugeda
     * juriidiliseks) */
    private java.lang.String liik;

    /* Isiku roll: N - nõukogu liige, JUHL - juhatuse liige, PROK
     * - prokurist, jmt */
    private java.lang.String roll;

    /* Sissemaksu suurus/summa usaldusosanikul. */
    private java.math.BigInteger sissemaksu_summa;

    /* Sissemaksu valuuta usaldusosanikul */
    private java.lang.String sissemaksu_valuuta;

    private java.lang.String eesnimi;

    /* Perenimi või Ärinimi */
    private java.lang.String nimi;

    /* Eesti isikukood või Äriregistri kood */
    private java.lang.String kood;

    private eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 aadress;

    /* Residentsuse riik */
    private java.lang.String residentsus;

    private java.lang.String email;

    private java.lang.String kontakt;

    public EVapiLooKanneIsik_v1() {
    }

    public EVapiLooKanneIsik_v1(
           java.lang.String liik,
           java.lang.String roll,
           java.math.BigInteger sissemaksu_summa,
           java.lang.String sissemaksu_valuuta,
           java.lang.String eesnimi,
           java.lang.String nimi,
           java.lang.String kood,
           eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 aadress,
           java.lang.String residentsus,
           java.lang.String email,
           java.lang.String kontakt) {
           this.liik = liik;
           this.roll = roll;
           this.sissemaksu_summa = sissemaksu_summa;
           this.sissemaksu_valuuta = sissemaksu_valuuta;
           this.eesnimi = eesnimi;
           this.nimi = nimi;
           this.kood = kood;
           this.aadress = aadress;
           this.residentsus = residentsus;
           this.email = email;
           this.kontakt = kontakt;
    }


    /**
     * Gets the liik value for this EVapiLooKanneIsik_v1.
     * 
     * @return liik   * Isiku liik: F - füüsiline, J - juriidiline (NB: FIE lugeda
     * juriidiliseks)
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this EVapiLooKanneIsik_v1.
     * 
     * @param liik   * Isiku liik: F - füüsiline, J - juriidiline (NB: FIE lugeda
     * juriidiliseks)
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the roll value for this EVapiLooKanneIsik_v1.
     * 
     * @return roll   * Isiku roll: N - nõukogu liige, JUHL - juhatuse liige, PROK
     * - prokurist, jmt
     */
    public java.lang.String getRoll() {
        return roll;
    }


    /**
     * Sets the roll value for this EVapiLooKanneIsik_v1.
     * 
     * @param roll   * Isiku roll: N - nõukogu liige, JUHL - juhatuse liige, PROK
     * - prokurist, jmt
     */
    public void setRoll(java.lang.String roll) {
        this.roll = roll;
    }


    /**
     * Gets the sissemaksu_summa value for this EVapiLooKanneIsik_v1.
     * 
     * @return sissemaksu_summa   * Sissemaksu suurus/summa usaldusosanikul.
     */
    public java.math.BigInteger getSissemaksu_summa() {
        return sissemaksu_summa;
    }


    /**
     * Sets the sissemaksu_summa value for this EVapiLooKanneIsik_v1.
     * 
     * @param sissemaksu_summa   * Sissemaksu suurus/summa usaldusosanikul.
     */
    public void setSissemaksu_summa(java.math.BigInteger sissemaksu_summa) {
        this.sissemaksu_summa = sissemaksu_summa;
    }


    /**
     * Gets the sissemaksu_valuuta value for this EVapiLooKanneIsik_v1.
     * 
     * @return sissemaksu_valuuta   * Sissemaksu valuuta usaldusosanikul
     */
    public java.lang.String getSissemaksu_valuuta() {
        return sissemaksu_valuuta;
    }


    /**
     * Sets the sissemaksu_valuuta value for this EVapiLooKanneIsik_v1.
     * 
     * @param sissemaksu_valuuta   * Sissemaksu valuuta usaldusosanikul
     */
    public void setSissemaksu_valuuta(java.lang.String sissemaksu_valuuta) {
        this.sissemaksu_valuuta = sissemaksu_valuuta;
    }


    /**
     * Gets the eesnimi value for this EVapiLooKanneIsik_v1.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this EVapiLooKanneIsik_v1.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the nimi value for this EVapiLooKanneIsik_v1.
     * 
     * @return nimi   * Perenimi või Ärinimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this EVapiLooKanneIsik_v1.
     * 
     * @param nimi   * Perenimi või Ärinimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kood value for this EVapiLooKanneIsik_v1.
     * 
     * @return kood   * Eesti isikukood või Äriregistri kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this EVapiLooKanneIsik_v1.
     * 
     * @param kood   * Eesti isikukood või Äriregistri kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the aadress value for this EVapiLooKanneIsik_v1.
     * 
     * @return aadress
     */
    public eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this EVapiLooKanneIsik_v1.
     * 
     * @param aadress
     */
    public void setAadress(eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 aadress) {
        this.aadress = aadress;
    }


    /**
     * Gets the residentsus value for this EVapiLooKanneIsik_v1.
     * 
     * @return residentsus   * Residentsuse riik
     */
    public java.lang.String getResidentsus() {
        return residentsus;
    }


    /**
     * Sets the residentsus value for this EVapiLooKanneIsik_v1.
     * 
     * @param residentsus   * Residentsuse riik
     */
    public void setResidentsus(java.lang.String residentsus) {
        this.residentsus = residentsus;
    }


    /**
     * Gets the email value for this EVapiLooKanneIsik_v1.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EVapiLooKanneIsik_v1.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the kontakt value for this EVapiLooKanneIsik_v1.
     * 
     * @return kontakt
     */
    public java.lang.String getKontakt() {
        return kontakt;
    }


    /**
     * Sets the kontakt value for this EVapiLooKanneIsik_v1.
     * 
     * @param kontakt
     */
    public void setKontakt(java.lang.String kontakt) {
        this.kontakt = kontakt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneIsik_v1)) return false;
        EVapiLooKanneIsik_v1 other = (EVapiLooKanneIsik_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.roll==null && other.getRoll()==null) || 
             (this.roll!=null &&
              this.roll.equals(other.getRoll()))) &&
            ((this.sissemaksu_summa==null && other.getSissemaksu_summa()==null) || 
             (this.sissemaksu_summa!=null &&
              this.sissemaksu_summa.equals(other.getSissemaksu_summa()))) &&
            ((this.sissemaksu_valuuta==null && other.getSissemaksu_valuuta()==null) || 
             (this.sissemaksu_valuuta!=null &&
              this.sissemaksu_valuuta.equals(other.getSissemaksu_valuuta()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress()))) &&
            ((this.residentsus==null && other.getResidentsus()==null) || 
             (this.residentsus!=null &&
              this.residentsus.equals(other.getResidentsus()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.kontakt==null && other.getKontakt()==null) || 
             (this.kontakt!=null &&
              this.kontakt.equals(other.getKontakt())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getRoll() != null) {
            _hashCode += getRoll().hashCode();
        }
        if (getSissemaksu_summa() != null) {
            _hashCode += getSissemaksu_summa().hashCode();
        }
        if (getSissemaksu_valuuta() != null) {
            _hashCode += getSissemaksu_valuuta().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        if (getResidentsus() != null) {
            _hashCode += getResidentsus().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getKontakt() != null) {
            _hashCode += getKontakt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
