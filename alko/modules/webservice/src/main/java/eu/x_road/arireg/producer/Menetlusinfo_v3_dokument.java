/**
 * Menetlusinfo_v3_dokument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Menetlusinfo_v3_dokument  implements java.io.Serializable {
    private java.lang.String paevikukande_id;

    /* Menetluse number vanas vormingus (piirkond:menetluse_nr) */
    private java.lang.String paevikukande_id_vana;

    private java.lang.String seotud_paevikukande_id;

    private java.util.Date esit_kp;

    private java.lang.String dok_liik;

    private java.lang.String dok_olek;

    private java.lang.String notar_id;

    private java.lang.String aasta_nr;

    private java.lang.Integer notarnr;

    private java.lang.String ettevotja_reg_kood;

    private java.lang.String ettevotja_nimi;

    public Menetlusinfo_v3_dokument() {
    }

    public Menetlusinfo_v3_dokument(
           java.lang.String paevikukande_id,
           java.lang.String paevikukande_id_vana,
           java.lang.String seotud_paevikukande_id,
           java.util.Date esit_kp,
           java.lang.String dok_liik,
           java.lang.String dok_olek,
           java.lang.String notar_id,
           java.lang.String aasta_nr,
           java.lang.Integer notarnr,
           java.lang.String ettevotja_reg_kood,
           java.lang.String ettevotja_nimi) {
           this.paevikukande_id = paevikukande_id;
           this.paevikukande_id_vana = paevikukande_id_vana;
           this.seotud_paevikukande_id = seotud_paevikukande_id;
           this.esit_kp = esit_kp;
           this.dok_liik = dok_liik;
           this.dok_olek = dok_olek;
           this.notar_id = notar_id;
           this.aasta_nr = aasta_nr;
           this.notarnr = notarnr;
           this.ettevotja_reg_kood = ettevotja_reg_kood;
           this.ettevotja_nimi = ettevotja_nimi;
    }


    /**
     * Gets the paevikukande_id value for this Menetlusinfo_v3_dokument.
     * 
     * @return paevikukande_id
     */
    public java.lang.String getPaevikukande_id() {
        return paevikukande_id;
    }


    /**
     * Sets the paevikukande_id value for this Menetlusinfo_v3_dokument.
     * 
     * @param paevikukande_id
     */
    public void setPaevikukande_id(java.lang.String paevikukande_id) {
        this.paevikukande_id = paevikukande_id;
    }


    /**
     * Gets the paevikukande_id_vana value for this Menetlusinfo_v3_dokument.
     * 
     * @return paevikukande_id_vana   * Menetluse number vanas vormingus (piirkond:menetluse_nr)
     */
    public java.lang.String getPaevikukande_id_vana() {
        return paevikukande_id_vana;
    }


    /**
     * Sets the paevikukande_id_vana value for this Menetlusinfo_v3_dokument.
     * 
     * @param paevikukande_id_vana   * Menetluse number vanas vormingus (piirkond:menetluse_nr)
     */
    public void setPaevikukande_id_vana(java.lang.String paevikukande_id_vana) {
        this.paevikukande_id_vana = paevikukande_id_vana;
    }


    /**
     * Gets the seotud_paevikukande_id value for this Menetlusinfo_v3_dokument.
     * 
     * @return seotud_paevikukande_id
     */
    public java.lang.String getSeotud_paevikukande_id() {
        return seotud_paevikukande_id;
    }


    /**
     * Sets the seotud_paevikukande_id value for this Menetlusinfo_v3_dokument.
     * 
     * @param seotud_paevikukande_id
     */
    public void setSeotud_paevikukande_id(java.lang.String seotud_paevikukande_id) {
        this.seotud_paevikukande_id = seotud_paevikukande_id;
    }


    /**
     * Gets the esit_kp value for this Menetlusinfo_v3_dokument.
     * 
     * @return esit_kp
     */
    public java.util.Date getEsit_kp() {
        return esit_kp;
    }


    /**
     * Sets the esit_kp value for this Menetlusinfo_v3_dokument.
     * 
     * @param esit_kp
     */
    public void setEsit_kp(java.util.Date esit_kp) {
        this.esit_kp = esit_kp;
    }


    /**
     * Gets the dok_liik value for this Menetlusinfo_v3_dokument.
     * 
     * @return dok_liik
     */
    public java.lang.String getDok_liik() {
        return dok_liik;
    }


    /**
     * Sets the dok_liik value for this Menetlusinfo_v3_dokument.
     * 
     * @param dok_liik
     */
    public void setDok_liik(java.lang.String dok_liik) {
        this.dok_liik = dok_liik;
    }


    /**
     * Gets the dok_olek value for this Menetlusinfo_v3_dokument.
     * 
     * @return dok_olek
     */
    public java.lang.String getDok_olek() {
        return dok_olek;
    }


    /**
     * Sets the dok_olek value for this Menetlusinfo_v3_dokument.
     * 
     * @param dok_olek
     */
    public void setDok_olek(java.lang.String dok_olek) {
        this.dok_olek = dok_olek;
    }


    /**
     * Gets the notar_id value for this Menetlusinfo_v3_dokument.
     * 
     * @return notar_id
     */
    public java.lang.String getNotar_id() {
        return notar_id;
    }


    /**
     * Sets the notar_id value for this Menetlusinfo_v3_dokument.
     * 
     * @param notar_id
     */
    public void setNotar_id(java.lang.String notar_id) {
        this.notar_id = notar_id;
    }


    /**
     * Gets the aasta_nr value for this Menetlusinfo_v3_dokument.
     * 
     * @return aasta_nr
     */
    public java.lang.String getAasta_nr() {
        return aasta_nr;
    }


    /**
     * Sets the aasta_nr value for this Menetlusinfo_v3_dokument.
     * 
     * @param aasta_nr
     */
    public void setAasta_nr(java.lang.String aasta_nr) {
        this.aasta_nr = aasta_nr;
    }


    /**
     * Gets the notarnr value for this Menetlusinfo_v3_dokument.
     * 
     * @return notarnr
     */
    public java.lang.Integer getNotarnr() {
        return notarnr;
    }


    /**
     * Sets the notarnr value for this Menetlusinfo_v3_dokument.
     * 
     * @param notarnr
     */
    public void setNotarnr(java.lang.Integer notarnr) {
        this.notarnr = notarnr;
    }


    /**
     * Gets the ettevotja_reg_kood value for this Menetlusinfo_v3_dokument.
     * 
     * @return ettevotja_reg_kood
     */
    public java.lang.String getEttevotja_reg_kood() {
        return ettevotja_reg_kood;
    }


    /**
     * Sets the ettevotja_reg_kood value for this Menetlusinfo_v3_dokument.
     * 
     * @param ettevotja_reg_kood
     */
    public void setEttevotja_reg_kood(java.lang.String ettevotja_reg_kood) {
        this.ettevotja_reg_kood = ettevotja_reg_kood;
    }


    /**
     * Gets the ettevotja_nimi value for this Menetlusinfo_v3_dokument.
     * 
     * @return ettevotja_nimi
     */
    public java.lang.String getEttevotja_nimi() {
        return ettevotja_nimi;
    }


    /**
     * Sets the ettevotja_nimi value for this Menetlusinfo_v3_dokument.
     * 
     * @param ettevotja_nimi
     */
    public void setEttevotja_nimi(java.lang.String ettevotja_nimi) {
        this.ettevotja_nimi = ettevotja_nimi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menetlusinfo_v3_dokument)) return false;
        Menetlusinfo_v3_dokument other = (Menetlusinfo_v3_dokument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paevikukande_id==null && other.getPaevikukande_id()==null) || 
             (this.paevikukande_id!=null &&
              this.paevikukande_id.equals(other.getPaevikukande_id()))) &&
            ((this.paevikukande_id_vana==null && other.getPaevikukande_id_vana()==null) || 
             (this.paevikukande_id_vana!=null &&
              this.paevikukande_id_vana.equals(other.getPaevikukande_id_vana()))) &&
            ((this.seotud_paevikukande_id==null && other.getSeotud_paevikukande_id()==null) || 
             (this.seotud_paevikukande_id!=null &&
              this.seotud_paevikukande_id.equals(other.getSeotud_paevikukande_id()))) &&
            ((this.esit_kp==null && other.getEsit_kp()==null) || 
             (this.esit_kp!=null &&
              this.esit_kp.equals(other.getEsit_kp()))) &&
            ((this.dok_liik==null && other.getDok_liik()==null) || 
             (this.dok_liik!=null &&
              this.dok_liik.equals(other.getDok_liik()))) &&
            ((this.dok_olek==null && other.getDok_olek()==null) || 
             (this.dok_olek!=null &&
              this.dok_olek.equals(other.getDok_olek()))) &&
            ((this.notar_id==null && other.getNotar_id()==null) || 
             (this.notar_id!=null &&
              this.notar_id.equals(other.getNotar_id()))) &&
            ((this.aasta_nr==null && other.getAasta_nr()==null) || 
             (this.aasta_nr!=null &&
              this.aasta_nr.equals(other.getAasta_nr()))) &&
            ((this.notarnr==null && other.getNotarnr()==null) || 
             (this.notarnr!=null &&
              this.notarnr.equals(other.getNotarnr()))) &&
            ((this.ettevotja_reg_kood==null && other.getEttevotja_reg_kood()==null) || 
             (this.ettevotja_reg_kood!=null &&
              this.ettevotja_reg_kood.equals(other.getEttevotja_reg_kood()))) &&
            ((this.ettevotja_nimi==null && other.getEttevotja_nimi()==null) || 
             (this.ettevotja_nimi!=null &&
              this.ettevotja_nimi.equals(other.getEttevotja_nimi())));
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
        if (getPaevikukande_id() != null) {
            _hashCode += getPaevikukande_id().hashCode();
        }
        if (getPaevikukande_id_vana() != null) {
            _hashCode += getPaevikukande_id_vana().hashCode();
        }
        if (getSeotud_paevikukande_id() != null) {
            _hashCode += getSeotud_paevikukande_id().hashCode();
        }
        if (getEsit_kp() != null) {
            _hashCode += getEsit_kp().hashCode();
        }
        if (getDok_liik() != null) {
            _hashCode += getDok_liik().hashCode();
        }
        if (getDok_olek() != null) {
            _hashCode += getDok_olek().hashCode();
        }
        if (getNotar_id() != null) {
            _hashCode += getNotar_id().hashCode();
        }
        if (getAasta_nr() != null) {
            _hashCode += getAasta_nr().hashCode();
        }
        if (getNotarnr() != null) {
            _hashCode += getNotarnr().hashCode();
        }
        if (getEttevotja_reg_kood() != null) {
            _hashCode += getEttevotja_reg_kood().hashCode();
        }
        if (getEttevotja_nimi() != null) {
            _hashCode += getEttevotja_nimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
