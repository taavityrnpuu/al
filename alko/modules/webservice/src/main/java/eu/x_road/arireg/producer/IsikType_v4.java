/**
 * IsikType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class IsikType_v4  implements java.io.Serializable {
    private java.lang.String tegevus;

    /* Isiku ID, kasutab vaid ettevõtjaportaal STORK esindaja seosteks */
    private java.math.BigInteger e_isikud_id;

    /* Isiku liik: F - füüsiline, J - juriidiline (NB: FIE lugeda
     * juriidiliseks) */
    private java.lang.String liik;

    /* Isiku roll: N - nõukogu liige, JUHL - juhatuse liige, PROK
     * - prokurist, jmt */
    private java.lang.String roll;

    /* Juhatuse või nõukogu volituste tähtaeg. */
    private java.util.Date volituste_tahtaeg;

    /* Sissemaksu suurus/summa usaldusosanikul. */
    private java.math.BigDecimal sissemaksu_summa;

    /* Sissemaksu valuuta usaldusosanikul */
    private java.lang.String sissemaksu_valuuta;

    private java.lang.Integer sissemaksu_lugeja;

    private java.lang.Integer sissemaksu_nimetaja;

    private java.lang.String eesnimi;

    /* Perenimi või Ärinimi */
    private java.lang.String nimi;

    private java.util.Date synniaeg;

    /* Eesti isikukood või Äriregistri kood */
    private java.lang.String kood;

    private java.lang.String valiskood;

    private java.lang.String valiskood_riik;

    private eu.x_road.arireg.producer.AadressType_v4 aadress;

    /* Residentsuse riik */
    private java.lang.String residentsus;

    private java.lang.String email;

    private java.lang.String kontakt;

    public IsikType_v4() {
    }

    public IsikType_v4(
           java.lang.String tegevus,
           java.math.BigInteger e_isikud_id,
           java.lang.String liik,
           java.lang.String roll,
           java.util.Date volituste_tahtaeg,
           java.math.BigDecimal sissemaksu_summa,
           java.lang.String sissemaksu_valuuta,
           java.lang.Integer sissemaksu_lugeja,
           java.lang.Integer sissemaksu_nimetaja,
           java.lang.String eesnimi,
           java.lang.String nimi,
           java.util.Date synniaeg,
           java.lang.String kood,
           java.lang.String valiskood,
           java.lang.String valiskood_riik,
           eu.x_road.arireg.producer.AadressType_v4 aadress,
           java.lang.String residentsus,
           java.lang.String email,
           java.lang.String kontakt) {
           this.tegevus = tegevus;
           this.e_isikud_id = e_isikud_id;
           this.liik = liik;
           this.roll = roll;
           this.volituste_tahtaeg = volituste_tahtaeg;
           this.sissemaksu_summa = sissemaksu_summa;
           this.sissemaksu_valuuta = sissemaksu_valuuta;
           this.sissemaksu_lugeja = sissemaksu_lugeja;
           this.sissemaksu_nimetaja = sissemaksu_nimetaja;
           this.eesnimi = eesnimi;
           this.nimi = nimi;
           this.synniaeg = synniaeg;
           this.kood = kood;
           this.valiskood = valiskood;
           this.valiskood_riik = valiskood_riik;
           this.aadress = aadress;
           this.residentsus = residentsus;
           this.email = email;
           this.kontakt = kontakt;
    }


    /**
     * Gets the tegevus value for this IsikType_v4.
     * 
     * @return tegevus
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this IsikType_v4.
     * 
     * @param tegevus
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }


    /**
     * Gets the e_isikud_id value for this IsikType_v4.
     * 
     * @return e_isikud_id   * Isiku ID, kasutab vaid ettevõtjaportaal STORK esindaja seosteks
     */
    public java.math.BigInteger getE_isikud_id() {
        return e_isikud_id;
    }


    /**
     * Sets the e_isikud_id value for this IsikType_v4.
     * 
     * @param e_isikud_id   * Isiku ID, kasutab vaid ettevõtjaportaal STORK esindaja seosteks
     */
    public void setE_isikud_id(java.math.BigInteger e_isikud_id) {
        this.e_isikud_id = e_isikud_id;
    }


    /**
     * Gets the liik value for this IsikType_v4.
     * 
     * @return liik   * Isiku liik: F - füüsiline, J - juriidiline (NB: FIE lugeda
     * juriidiliseks)
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this IsikType_v4.
     * 
     * @param liik   * Isiku liik: F - füüsiline, J - juriidiline (NB: FIE lugeda
     * juriidiliseks)
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the roll value for this IsikType_v4.
     * 
     * @return roll   * Isiku roll: N - nõukogu liige, JUHL - juhatuse liige, PROK
     * - prokurist, jmt
     */
    public java.lang.String getRoll() {
        return roll;
    }


    /**
     * Sets the roll value for this IsikType_v4.
     * 
     * @param roll   * Isiku roll: N - nõukogu liige, JUHL - juhatuse liige, PROK
     * - prokurist, jmt
     */
    public void setRoll(java.lang.String roll) {
        this.roll = roll;
    }


    /**
     * Gets the volituste_tahtaeg value for this IsikType_v4.
     * 
     * @return volituste_tahtaeg   * Juhatuse või nõukogu volituste tähtaeg.
     */
    public java.util.Date getVolituste_tahtaeg() {
        return volituste_tahtaeg;
    }


    /**
     * Sets the volituste_tahtaeg value for this IsikType_v4.
     * 
     * @param volituste_tahtaeg   * Juhatuse või nõukogu volituste tähtaeg.
     */
    public void setVolituste_tahtaeg(java.util.Date volituste_tahtaeg) {
        this.volituste_tahtaeg = volituste_tahtaeg;
    }


    /**
     * Gets the sissemaksu_summa value for this IsikType_v4.
     * 
     * @return sissemaksu_summa   * Sissemaksu suurus/summa usaldusosanikul.
     */
    public java.math.BigDecimal getSissemaksu_summa() {
        return sissemaksu_summa;
    }


    /**
     * Sets the sissemaksu_summa value for this IsikType_v4.
     * 
     * @param sissemaksu_summa   * Sissemaksu suurus/summa usaldusosanikul.
     */
    public void setSissemaksu_summa(java.math.BigDecimal sissemaksu_summa) {
        this.sissemaksu_summa = sissemaksu_summa;
    }


    /**
     * Gets the sissemaksu_valuuta value for this IsikType_v4.
     * 
     * @return sissemaksu_valuuta   * Sissemaksu valuuta usaldusosanikul
     */
    public java.lang.String getSissemaksu_valuuta() {
        return sissemaksu_valuuta;
    }


    /**
     * Sets the sissemaksu_valuuta value for this IsikType_v4.
     * 
     * @param sissemaksu_valuuta   * Sissemaksu valuuta usaldusosanikul
     */
    public void setSissemaksu_valuuta(java.lang.String sissemaksu_valuuta) {
        this.sissemaksu_valuuta = sissemaksu_valuuta;
    }


    /**
     * Gets the sissemaksu_lugeja value for this IsikType_v4.
     * 
     * @return sissemaksu_lugeja
     */
    public java.lang.Integer getSissemaksu_lugeja() {
        return sissemaksu_lugeja;
    }


    /**
     * Sets the sissemaksu_lugeja value for this IsikType_v4.
     * 
     * @param sissemaksu_lugeja
     */
    public void setSissemaksu_lugeja(java.lang.Integer sissemaksu_lugeja) {
        this.sissemaksu_lugeja = sissemaksu_lugeja;
    }


    /**
     * Gets the sissemaksu_nimetaja value for this IsikType_v4.
     * 
     * @return sissemaksu_nimetaja
     */
    public java.lang.Integer getSissemaksu_nimetaja() {
        return sissemaksu_nimetaja;
    }


    /**
     * Sets the sissemaksu_nimetaja value for this IsikType_v4.
     * 
     * @param sissemaksu_nimetaja
     */
    public void setSissemaksu_nimetaja(java.lang.Integer sissemaksu_nimetaja) {
        this.sissemaksu_nimetaja = sissemaksu_nimetaja;
    }


    /**
     * Gets the eesnimi value for this IsikType_v4.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this IsikType_v4.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the nimi value for this IsikType_v4.
     * 
     * @return nimi   * Perenimi või Ärinimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this IsikType_v4.
     * 
     * @param nimi   * Perenimi või Ärinimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the synniaeg value for this IsikType_v4.
     * 
     * @return synniaeg
     */
    public java.util.Date getSynniaeg() {
        return synniaeg;
    }


    /**
     * Sets the synniaeg value for this IsikType_v4.
     * 
     * @param synniaeg
     */
    public void setSynniaeg(java.util.Date synniaeg) {
        this.synniaeg = synniaeg;
    }


    /**
     * Gets the kood value for this IsikType_v4.
     * 
     * @return kood   * Eesti isikukood või Äriregistri kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this IsikType_v4.
     * 
     * @param kood   * Eesti isikukood või Äriregistri kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the valiskood value for this IsikType_v4.
     * 
     * @return valiskood
     */
    public java.lang.String getValiskood() {
        return valiskood;
    }


    /**
     * Sets the valiskood value for this IsikType_v4.
     * 
     * @param valiskood
     */
    public void setValiskood(java.lang.String valiskood) {
        this.valiskood = valiskood;
    }


    /**
     * Gets the valiskood_riik value for this IsikType_v4.
     * 
     * @return valiskood_riik
     */
    public java.lang.String getValiskood_riik() {
        return valiskood_riik;
    }


    /**
     * Sets the valiskood_riik value for this IsikType_v4.
     * 
     * @param valiskood_riik
     */
    public void setValiskood_riik(java.lang.String valiskood_riik) {
        this.valiskood_riik = valiskood_riik;
    }


    /**
     * Gets the aadress value for this IsikType_v4.
     * 
     * @return aadress
     */
    public eu.x_road.arireg.producer.AadressType_v4 getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this IsikType_v4.
     * 
     * @param aadress
     */
    public void setAadress(eu.x_road.arireg.producer.AadressType_v4 aadress) {
        this.aadress = aadress;
    }


    /**
     * Gets the residentsus value for this IsikType_v4.
     * 
     * @return residentsus   * Residentsuse riik
     */
    public java.lang.String getResidentsus() {
        return residentsus;
    }


    /**
     * Sets the residentsus value for this IsikType_v4.
     * 
     * @param residentsus   * Residentsuse riik
     */
    public void setResidentsus(java.lang.String residentsus) {
        this.residentsus = residentsus;
    }


    /**
     * Gets the email value for this IsikType_v4.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this IsikType_v4.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the kontakt value for this IsikType_v4.
     * 
     * @return kontakt
     */
    public java.lang.String getKontakt() {
        return kontakt;
    }


    /**
     * Sets the kontakt value for this IsikType_v4.
     * 
     * @param kontakt
     */
    public void setKontakt(java.lang.String kontakt) {
        this.kontakt = kontakt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsikType_v4)) return false;
        IsikType_v4 other = (IsikType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus()))) &&
            ((this.e_isikud_id==null && other.getE_isikud_id()==null) || 
             (this.e_isikud_id!=null &&
              this.e_isikud_id.equals(other.getE_isikud_id()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.roll==null && other.getRoll()==null) || 
             (this.roll!=null &&
              this.roll.equals(other.getRoll()))) &&
            ((this.volituste_tahtaeg==null && other.getVolituste_tahtaeg()==null) || 
             (this.volituste_tahtaeg!=null &&
              this.volituste_tahtaeg.equals(other.getVolituste_tahtaeg()))) &&
            ((this.sissemaksu_summa==null && other.getSissemaksu_summa()==null) || 
             (this.sissemaksu_summa!=null &&
              this.sissemaksu_summa.equals(other.getSissemaksu_summa()))) &&
            ((this.sissemaksu_valuuta==null && other.getSissemaksu_valuuta()==null) || 
             (this.sissemaksu_valuuta!=null &&
              this.sissemaksu_valuuta.equals(other.getSissemaksu_valuuta()))) &&
            ((this.sissemaksu_lugeja==null && other.getSissemaksu_lugeja()==null) || 
             (this.sissemaksu_lugeja!=null &&
              this.sissemaksu_lugeja.equals(other.getSissemaksu_lugeja()))) &&
            ((this.sissemaksu_nimetaja==null && other.getSissemaksu_nimetaja()==null) || 
             (this.sissemaksu_nimetaja!=null &&
              this.sissemaksu_nimetaja.equals(other.getSissemaksu_nimetaja()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.synniaeg==null && other.getSynniaeg()==null) || 
             (this.synniaeg!=null &&
              this.synniaeg.equals(other.getSynniaeg()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.valiskood==null && other.getValiskood()==null) || 
             (this.valiskood!=null &&
              this.valiskood.equals(other.getValiskood()))) &&
            ((this.valiskood_riik==null && other.getValiskood_riik()==null) || 
             (this.valiskood_riik!=null &&
              this.valiskood_riik.equals(other.getValiskood_riik()))) &&
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
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        if (getE_isikud_id() != null) {
            _hashCode += getE_isikud_id().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getRoll() != null) {
            _hashCode += getRoll().hashCode();
        }
        if (getVolituste_tahtaeg() != null) {
            _hashCode += getVolituste_tahtaeg().hashCode();
        }
        if (getSissemaksu_summa() != null) {
            _hashCode += getSissemaksu_summa().hashCode();
        }
        if (getSissemaksu_valuuta() != null) {
            _hashCode += getSissemaksu_valuuta().hashCode();
        }
        if (getSissemaksu_lugeja() != null) {
            _hashCode += getSissemaksu_lugeja().hashCode();
        }
        if (getSissemaksu_nimetaja() != null) {
            _hashCode += getSissemaksu_nimetaja().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getSynniaeg() != null) {
            _hashCode += getSynniaeg().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getValiskood() != null) {
            _hashCode += getValiskood().hashCode();
        }
        if (getValiskood_riik() != null) {
            _hashCode += getValiskood_riik().hashCode();
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
