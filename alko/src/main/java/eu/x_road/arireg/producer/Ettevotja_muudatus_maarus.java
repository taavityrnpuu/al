/**
 * Ettevotja_muudatus_maarus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_maarus  implements java.io.Serializable {
    private java.lang.String ettevotja_id;

    private java.lang.Integer ettevotja_ariregistri_kood;

    private java.lang.String ettevotja_arinimi;

    private java.lang.String ettevotja_oiguslik_vorm;

    /* Piirkond */
    private java.lang.Integer piirkond;

    /* Olek */
    private java.lang.String olek;

    /* Oleku kuupäev */
    private java.util.Date oleku_kpv;

    /* Otsuse ID */
    private java.lang.String otsuse_id;

    /* Otsuse number */
    private java.lang.String otsuse_nr;

    /* Otsuse liik */
    private java.lang.String otsuse_liik;

    /* Kandeliik */
    private java.lang.String kandeliik;

    public Ettevotja_muudatus_maarus() {
    }

    public Ettevotja_muudatus_maarus(
           java.lang.String ettevotja_id,
           java.lang.Integer ettevotja_ariregistri_kood,
           java.lang.String ettevotja_arinimi,
           java.lang.String ettevotja_oiguslik_vorm,
           java.lang.Integer piirkond,
           java.lang.String olek,
           java.util.Date oleku_kpv,
           java.lang.String otsuse_id,
           java.lang.String otsuse_nr,
           java.lang.String otsuse_liik,
           java.lang.String kandeliik) {
           this.ettevotja_id = ettevotja_id;
           this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
           this.ettevotja_arinimi = ettevotja_arinimi;
           this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
           this.piirkond = piirkond;
           this.olek = olek;
           this.oleku_kpv = oleku_kpv;
           this.otsuse_id = otsuse_id;
           this.otsuse_nr = otsuse_nr;
           this.otsuse_liik = otsuse_liik;
           this.kandeliik = kandeliik;
    }


    /**
     * Gets the ettevotja_id value for this Ettevotja_muudatus_maarus.
     * 
     * @return ettevotja_id
     */
    public java.lang.String getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Ettevotja_muudatus_maarus.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.lang.String ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_maarus.
     * 
     * @return ettevotja_ariregistri_kood
     */
    public java.lang.Integer getEttevotja_ariregistri_kood() {
        return ettevotja_ariregistri_kood;
    }


    /**
     * Sets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_maarus.
     * 
     * @param ettevotja_ariregistri_kood
     */
    public void setEttevotja_ariregistri_kood(java.lang.Integer ettevotja_ariregistri_kood) {
        this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
    }


    /**
     * Gets the ettevotja_arinimi value for this Ettevotja_muudatus_maarus.
     * 
     * @return ettevotja_arinimi
     */
    public java.lang.String getEttevotja_arinimi() {
        return ettevotja_arinimi;
    }


    /**
     * Sets the ettevotja_arinimi value for this Ettevotja_muudatus_maarus.
     * 
     * @param ettevotja_arinimi
     */
    public void setEttevotja_arinimi(java.lang.String ettevotja_arinimi) {
        this.ettevotja_arinimi = ettevotja_arinimi;
    }


    /**
     * Gets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_maarus.
     * 
     * @return ettevotja_oiguslik_vorm
     */
    public java.lang.String getEttevotja_oiguslik_vorm() {
        return ettevotja_oiguslik_vorm;
    }


    /**
     * Sets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_maarus.
     * 
     * @param ettevotja_oiguslik_vorm
     */
    public void setEttevotja_oiguslik_vorm(java.lang.String ettevotja_oiguslik_vorm) {
        this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
    }


    /**
     * Gets the piirkond value for this Ettevotja_muudatus_maarus.
     * 
     * @return piirkond   * Piirkond
     */
    public java.lang.Integer getPiirkond() {
        return piirkond;
    }


    /**
     * Sets the piirkond value for this Ettevotja_muudatus_maarus.
     * 
     * @param piirkond   * Piirkond
     */
    public void setPiirkond(java.lang.Integer piirkond) {
        this.piirkond = piirkond;
    }


    /**
     * Gets the olek value for this Ettevotja_muudatus_maarus.
     * 
     * @return olek   * Olek
     */
    public java.lang.String getOlek() {
        return olek;
    }


    /**
     * Sets the olek value for this Ettevotja_muudatus_maarus.
     * 
     * @param olek   * Olek
     */
    public void setOlek(java.lang.String olek) {
        this.olek = olek;
    }


    /**
     * Gets the oleku_kpv value for this Ettevotja_muudatus_maarus.
     * 
     * @return oleku_kpv   * Oleku kuupäev
     */
    public java.util.Date getOleku_kpv() {
        return oleku_kpv;
    }


    /**
     * Sets the oleku_kpv value for this Ettevotja_muudatus_maarus.
     * 
     * @param oleku_kpv   * Oleku kuupäev
     */
    public void setOleku_kpv(java.util.Date oleku_kpv) {
        this.oleku_kpv = oleku_kpv;
    }


    /**
     * Gets the otsuse_id value for this Ettevotja_muudatus_maarus.
     * 
     * @return otsuse_id   * Otsuse ID
     */
    public java.lang.String getOtsuse_id() {
        return otsuse_id;
    }


    /**
     * Sets the otsuse_id value for this Ettevotja_muudatus_maarus.
     * 
     * @param otsuse_id   * Otsuse ID
     */
    public void setOtsuse_id(java.lang.String otsuse_id) {
        this.otsuse_id = otsuse_id;
    }


    /**
     * Gets the otsuse_nr value for this Ettevotja_muudatus_maarus.
     * 
     * @return otsuse_nr   * Otsuse number
     */
    public java.lang.String getOtsuse_nr() {
        return otsuse_nr;
    }


    /**
     * Sets the otsuse_nr value for this Ettevotja_muudatus_maarus.
     * 
     * @param otsuse_nr   * Otsuse number
     */
    public void setOtsuse_nr(java.lang.String otsuse_nr) {
        this.otsuse_nr = otsuse_nr;
    }


    /**
     * Gets the otsuse_liik value for this Ettevotja_muudatus_maarus.
     * 
     * @return otsuse_liik   * Otsuse liik
     */
    public java.lang.String getOtsuse_liik() {
        return otsuse_liik;
    }


    /**
     * Sets the otsuse_liik value for this Ettevotja_muudatus_maarus.
     * 
     * @param otsuse_liik   * Otsuse liik
     */
    public void setOtsuse_liik(java.lang.String otsuse_liik) {
        this.otsuse_liik = otsuse_liik;
    }


    /**
     * Gets the kandeliik value for this Ettevotja_muudatus_maarus.
     * 
     * @return kandeliik   * Kandeliik
     */
    public java.lang.String getKandeliik() {
        return kandeliik;
    }


    /**
     * Sets the kandeliik value for this Ettevotja_muudatus_maarus.
     * 
     * @param kandeliik   * Kandeliik
     */
    public void setKandeliik(java.lang.String kandeliik) {
        this.kandeliik = kandeliik;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_maarus)) return false;
        Ettevotja_muudatus_maarus other = (Ettevotja_muudatus_maarus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id()))) &&
            ((this.ettevotja_ariregistri_kood==null && other.getEttevotja_ariregistri_kood()==null) || 
             (this.ettevotja_ariregistri_kood!=null &&
              this.ettevotja_ariregistri_kood.equals(other.getEttevotja_ariregistri_kood()))) &&
            ((this.ettevotja_arinimi==null && other.getEttevotja_arinimi()==null) || 
             (this.ettevotja_arinimi!=null &&
              this.ettevotja_arinimi.equals(other.getEttevotja_arinimi()))) &&
            ((this.ettevotja_oiguslik_vorm==null && other.getEttevotja_oiguslik_vorm()==null) || 
             (this.ettevotja_oiguslik_vorm!=null &&
              this.ettevotja_oiguslik_vorm.equals(other.getEttevotja_oiguslik_vorm()))) &&
            ((this.piirkond==null && other.getPiirkond()==null) || 
             (this.piirkond!=null &&
              this.piirkond.equals(other.getPiirkond()))) &&
            ((this.olek==null && other.getOlek()==null) || 
             (this.olek!=null &&
              this.olek.equals(other.getOlek()))) &&
            ((this.oleku_kpv==null && other.getOleku_kpv()==null) || 
             (this.oleku_kpv!=null &&
              this.oleku_kpv.equals(other.getOleku_kpv()))) &&
            ((this.otsuse_id==null && other.getOtsuse_id()==null) || 
             (this.otsuse_id!=null &&
              this.otsuse_id.equals(other.getOtsuse_id()))) &&
            ((this.otsuse_nr==null && other.getOtsuse_nr()==null) || 
             (this.otsuse_nr!=null &&
              this.otsuse_nr.equals(other.getOtsuse_nr()))) &&
            ((this.otsuse_liik==null && other.getOtsuse_liik()==null) || 
             (this.otsuse_liik!=null &&
              this.otsuse_liik.equals(other.getOtsuse_liik()))) &&
            ((this.kandeliik==null && other.getKandeliik()==null) || 
             (this.kandeliik!=null &&
              this.kandeliik.equals(other.getKandeliik())));
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
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        if (getEttevotja_ariregistri_kood() != null) {
            _hashCode += getEttevotja_ariregistri_kood().hashCode();
        }
        if (getEttevotja_arinimi() != null) {
            _hashCode += getEttevotja_arinimi().hashCode();
        }
        if (getEttevotja_oiguslik_vorm() != null) {
            _hashCode += getEttevotja_oiguslik_vorm().hashCode();
        }
        if (getPiirkond() != null) {
            _hashCode += getPiirkond().hashCode();
        }
        if (getOlek() != null) {
            _hashCode += getOlek().hashCode();
        }
        if (getOleku_kpv() != null) {
            _hashCode += getOleku_kpv().hashCode();
        }
        if (getOtsuse_id() != null) {
            _hashCode += getOtsuse_id().hashCode();
        }
        if (getOtsuse_nr() != null) {
            _hashCode += getOtsuse_nr().hashCode();
        }
        if (getOtsuse_liik() != null) {
            _hashCode += getOtsuse_liik().hashCode();
        }
        if (getKandeliik() != null) {
            _hashCode += getKandeliik().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
