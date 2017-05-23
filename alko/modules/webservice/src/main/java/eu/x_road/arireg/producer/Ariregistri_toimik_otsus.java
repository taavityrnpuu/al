/**
 * Ariregistri_toimik_otsus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ariregistri_toimik_otsus  implements java.io.Serializable {
    /* Otsuse number */
    private java.lang.String otsuse_number;

    /* Otsuse kuupäev. */
    private java.util.Date otsuse_kpv;

    /* Otsuse liik */
    private java.lang.String otsuse_liik;

    /* Otsuse liik lokaliseeritud tekstina */
    private java.lang.String otsuse_liik_tekstina;

    /* Otsuse olek */
    private java.lang.String otsuse_olek;

    /* Otsuse olek lokaliseeritud tekstina */
    private java.lang.String otsuse_olek_tekstina;

    /* Otsuse jõustumise kuupäev */
    private java.util.Date joust_kpv;

    /* Kande jõustumise kuupäev */
    private java.util.Date kande_kpv;

    /* Määruse lisatähtaeg */
    private java.util.Date lisatahtaeg;

    /* Kandeliik */
    private java.lang.String kandeliik;

    /* Kandeliik lokaliseeritud tekstina */
    private java.lang.String kandeliik_tekstina;

    /* Määruse tekst */
    private java.lang.String maaruse_tekst;

    public Ariregistri_toimik_otsus() {
    }

    public Ariregistri_toimik_otsus(
           java.lang.String otsuse_number,
           java.util.Date otsuse_kpv,
           java.lang.String otsuse_liik,
           java.lang.String otsuse_liik_tekstina,
           java.lang.String otsuse_olek,
           java.lang.String otsuse_olek_tekstina,
           java.util.Date joust_kpv,
           java.util.Date kande_kpv,
           java.util.Date lisatahtaeg,
           java.lang.String kandeliik,
           java.lang.String kandeliik_tekstina,
           java.lang.String maaruse_tekst) {
           this.otsuse_number = otsuse_number;
           this.otsuse_kpv = otsuse_kpv;
           this.otsuse_liik = otsuse_liik;
           this.otsuse_liik_tekstina = otsuse_liik_tekstina;
           this.otsuse_olek = otsuse_olek;
           this.otsuse_olek_tekstina = otsuse_olek_tekstina;
           this.joust_kpv = joust_kpv;
           this.kande_kpv = kande_kpv;
           this.lisatahtaeg = lisatahtaeg;
           this.kandeliik = kandeliik;
           this.kandeliik_tekstina = kandeliik_tekstina;
           this.maaruse_tekst = maaruse_tekst;
    }


    /**
     * Gets the otsuse_number value for this Ariregistri_toimik_otsus.
     * 
     * @return otsuse_number   * Otsuse number
     */
    public java.lang.String getOtsuse_number() {
        return otsuse_number;
    }


    /**
     * Sets the otsuse_number value for this Ariregistri_toimik_otsus.
     * 
     * @param otsuse_number   * Otsuse number
     */
    public void setOtsuse_number(java.lang.String otsuse_number) {
        this.otsuse_number = otsuse_number;
    }


    /**
     * Gets the otsuse_kpv value for this Ariregistri_toimik_otsus.
     * 
     * @return otsuse_kpv   * Otsuse kuupäev.
     */
    public java.util.Date getOtsuse_kpv() {
        return otsuse_kpv;
    }


    /**
     * Sets the otsuse_kpv value for this Ariregistri_toimik_otsus.
     * 
     * @param otsuse_kpv   * Otsuse kuupäev.
     */
    public void setOtsuse_kpv(java.util.Date otsuse_kpv) {
        this.otsuse_kpv = otsuse_kpv;
    }


    /**
     * Gets the otsuse_liik value for this Ariregistri_toimik_otsus.
     * 
     * @return otsuse_liik   * Otsuse liik
     */
    public java.lang.String getOtsuse_liik() {
        return otsuse_liik;
    }


    /**
     * Sets the otsuse_liik value for this Ariregistri_toimik_otsus.
     * 
     * @param otsuse_liik   * Otsuse liik
     */
    public void setOtsuse_liik(java.lang.String otsuse_liik) {
        this.otsuse_liik = otsuse_liik;
    }


    /**
     * Gets the otsuse_liik_tekstina value for this Ariregistri_toimik_otsus.
     * 
     * @return otsuse_liik_tekstina   * Otsuse liik lokaliseeritud tekstina
     */
    public java.lang.String getOtsuse_liik_tekstina() {
        return otsuse_liik_tekstina;
    }


    /**
     * Sets the otsuse_liik_tekstina value for this Ariregistri_toimik_otsus.
     * 
     * @param otsuse_liik_tekstina   * Otsuse liik lokaliseeritud tekstina
     */
    public void setOtsuse_liik_tekstina(java.lang.String otsuse_liik_tekstina) {
        this.otsuse_liik_tekstina = otsuse_liik_tekstina;
    }


    /**
     * Gets the otsuse_olek value for this Ariregistri_toimik_otsus.
     * 
     * @return otsuse_olek   * Otsuse olek
     */
    public java.lang.String getOtsuse_olek() {
        return otsuse_olek;
    }


    /**
     * Sets the otsuse_olek value for this Ariregistri_toimik_otsus.
     * 
     * @param otsuse_olek   * Otsuse olek
     */
    public void setOtsuse_olek(java.lang.String otsuse_olek) {
        this.otsuse_olek = otsuse_olek;
    }


    /**
     * Gets the otsuse_olek_tekstina value for this Ariregistri_toimik_otsus.
     * 
     * @return otsuse_olek_tekstina   * Otsuse olek lokaliseeritud tekstina
     */
    public java.lang.String getOtsuse_olek_tekstina() {
        return otsuse_olek_tekstina;
    }


    /**
     * Sets the otsuse_olek_tekstina value for this Ariregistri_toimik_otsus.
     * 
     * @param otsuse_olek_tekstina   * Otsuse olek lokaliseeritud tekstina
     */
    public void setOtsuse_olek_tekstina(java.lang.String otsuse_olek_tekstina) {
        this.otsuse_olek_tekstina = otsuse_olek_tekstina;
    }


    /**
     * Gets the joust_kpv value for this Ariregistri_toimik_otsus.
     * 
     * @return joust_kpv   * Otsuse jõustumise kuupäev
     */
    public java.util.Date getJoust_kpv() {
        return joust_kpv;
    }


    /**
     * Sets the joust_kpv value for this Ariregistri_toimik_otsus.
     * 
     * @param joust_kpv   * Otsuse jõustumise kuupäev
     */
    public void setJoust_kpv(java.util.Date joust_kpv) {
        this.joust_kpv = joust_kpv;
    }


    /**
     * Gets the kande_kpv value for this Ariregistri_toimik_otsus.
     * 
     * @return kande_kpv   * Kande jõustumise kuupäev
     */
    public java.util.Date getKande_kpv() {
        return kande_kpv;
    }


    /**
     * Sets the kande_kpv value for this Ariregistri_toimik_otsus.
     * 
     * @param kande_kpv   * Kande jõustumise kuupäev
     */
    public void setKande_kpv(java.util.Date kande_kpv) {
        this.kande_kpv = kande_kpv;
    }


    /**
     * Gets the lisatahtaeg value for this Ariregistri_toimik_otsus.
     * 
     * @return lisatahtaeg   * Määruse lisatähtaeg
     */
    public java.util.Date getLisatahtaeg() {
        return lisatahtaeg;
    }


    /**
     * Sets the lisatahtaeg value for this Ariregistri_toimik_otsus.
     * 
     * @param lisatahtaeg   * Määruse lisatähtaeg
     */
    public void setLisatahtaeg(java.util.Date lisatahtaeg) {
        this.lisatahtaeg = lisatahtaeg;
    }


    /**
     * Gets the kandeliik value for this Ariregistri_toimik_otsus.
     * 
     * @return kandeliik   * Kandeliik
     */
    public java.lang.String getKandeliik() {
        return kandeliik;
    }


    /**
     * Sets the kandeliik value for this Ariregistri_toimik_otsus.
     * 
     * @param kandeliik   * Kandeliik
     */
    public void setKandeliik(java.lang.String kandeliik) {
        this.kandeliik = kandeliik;
    }


    /**
     * Gets the kandeliik_tekstina value for this Ariregistri_toimik_otsus.
     * 
     * @return kandeliik_tekstina   * Kandeliik lokaliseeritud tekstina
     */
    public java.lang.String getKandeliik_tekstina() {
        return kandeliik_tekstina;
    }


    /**
     * Sets the kandeliik_tekstina value for this Ariregistri_toimik_otsus.
     * 
     * @param kandeliik_tekstina   * Kandeliik lokaliseeritud tekstina
     */
    public void setKandeliik_tekstina(java.lang.String kandeliik_tekstina) {
        this.kandeliik_tekstina = kandeliik_tekstina;
    }


    /**
     * Gets the maaruse_tekst value for this Ariregistri_toimik_otsus.
     * 
     * @return maaruse_tekst   * Määruse tekst
     */
    public java.lang.String getMaaruse_tekst() {
        return maaruse_tekst;
    }


    /**
     * Sets the maaruse_tekst value for this Ariregistri_toimik_otsus.
     * 
     * @param maaruse_tekst   * Määruse tekst
     */
    public void setMaaruse_tekst(java.lang.String maaruse_tekst) {
        this.maaruse_tekst = maaruse_tekst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ariregistri_toimik_otsus)) return false;
        Ariregistri_toimik_otsus other = (Ariregistri_toimik_otsus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otsuse_number==null && other.getOtsuse_number()==null) || 
             (this.otsuse_number!=null &&
              this.otsuse_number.equals(other.getOtsuse_number()))) &&
            ((this.otsuse_kpv==null && other.getOtsuse_kpv()==null) || 
             (this.otsuse_kpv!=null &&
              this.otsuse_kpv.equals(other.getOtsuse_kpv()))) &&
            ((this.otsuse_liik==null && other.getOtsuse_liik()==null) || 
             (this.otsuse_liik!=null &&
              this.otsuse_liik.equals(other.getOtsuse_liik()))) &&
            ((this.otsuse_liik_tekstina==null && other.getOtsuse_liik_tekstina()==null) || 
             (this.otsuse_liik_tekstina!=null &&
              this.otsuse_liik_tekstina.equals(other.getOtsuse_liik_tekstina()))) &&
            ((this.otsuse_olek==null && other.getOtsuse_olek()==null) || 
             (this.otsuse_olek!=null &&
              this.otsuse_olek.equals(other.getOtsuse_olek()))) &&
            ((this.otsuse_olek_tekstina==null && other.getOtsuse_olek_tekstina()==null) || 
             (this.otsuse_olek_tekstina!=null &&
              this.otsuse_olek_tekstina.equals(other.getOtsuse_olek_tekstina()))) &&
            ((this.joust_kpv==null && other.getJoust_kpv()==null) || 
             (this.joust_kpv!=null &&
              this.joust_kpv.equals(other.getJoust_kpv()))) &&
            ((this.kande_kpv==null && other.getKande_kpv()==null) || 
             (this.kande_kpv!=null &&
              this.kande_kpv.equals(other.getKande_kpv()))) &&
            ((this.lisatahtaeg==null && other.getLisatahtaeg()==null) || 
             (this.lisatahtaeg!=null &&
              this.lisatahtaeg.equals(other.getLisatahtaeg()))) &&
            ((this.kandeliik==null && other.getKandeliik()==null) || 
             (this.kandeliik!=null &&
              this.kandeliik.equals(other.getKandeliik()))) &&
            ((this.kandeliik_tekstina==null && other.getKandeliik_tekstina()==null) || 
             (this.kandeliik_tekstina!=null &&
              this.kandeliik_tekstina.equals(other.getKandeliik_tekstina()))) &&
            ((this.maaruse_tekst==null && other.getMaaruse_tekst()==null) || 
             (this.maaruse_tekst!=null &&
              this.maaruse_tekst.equals(other.getMaaruse_tekst())));
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
        if (getOtsuse_number() != null) {
            _hashCode += getOtsuse_number().hashCode();
        }
        if (getOtsuse_kpv() != null) {
            _hashCode += getOtsuse_kpv().hashCode();
        }
        if (getOtsuse_liik() != null) {
            _hashCode += getOtsuse_liik().hashCode();
        }
        if (getOtsuse_liik_tekstina() != null) {
            _hashCode += getOtsuse_liik_tekstina().hashCode();
        }
        if (getOtsuse_olek() != null) {
            _hashCode += getOtsuse_olek().hashCode();
        }
        if (getOtsuse_olek_tekstina() != null) {
            _hashCode += getOtsuse_olek_tekstina().hashCode();
        }
        if (getJoust_kpv() != null) {
            _hashCode += getJoust_kpv().hashCode();
        }
        if (getKande_kpv() != null) {
            _hashCode += getKande_kpv().hashCode();
        }
        if (getLisatahtaeg() != null) {
            _hashCode += getLisatahtaeg().hashCode();
        }
        if (getKandeliik() != null) {
            _hashCode += getKandeliik().hashCode();
        }
        if (getKandeliik_tekstina() != null) {
            _hashCode += getKandeliik_tekstina().hashCode();
        }
        if (getMaaruse_tekst() != null) {
            _hashCode += getMaaruse_tekst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
