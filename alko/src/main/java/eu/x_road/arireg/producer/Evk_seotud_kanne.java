/**
 * Evk_seotud_kanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Evk_seotud_kanne  implements java.io.Serializable {
    /* Ettevõtja registrikood */
    private java.math.BigInteger ariregistri_kood;

    /* esmakande aeg */
    private java.util.Date esmakande_aeg;

    /* kande aeg */
    private java.util.Date kande_aeg;

    /* Kandeliik */
    private java.lang.String kandeliigi_tahis;

    /* kande number */
    private java.lang.Integer kande_nr;

    /* notaritehingu kood */
    private java.lang.String notaritehingu_kood;

    /* Ärinimi */
    private java.lang.String arinimi;

    /* Õigusliku vormi tähis */
    private java.lang.String oigusliku_vormi_tahis;

    /* Lõppstaatuse tähis */
    private java.lang.String loppstaatuse_tahis;

    /* Kapital */
    private eu.x_road.arireg.producer.Evk_kapital kapital;

    /* Põhikiri */
    private eu.x_road.arireg.producer.Evk_pohikiri[] pohikiri;

    public Evk_seotud_kanne() {
    }

    public Evk_seotud_kanne(
           java.math.BigInteger ariregistri_kood,
           java.util.Date esmakande_aeg,
           java.util.Date kande_aeg,
           java.lang.String kandeliigi_tahis,
           java.lang.Integer kande_nr,
           java.lang.String notaritehingu_kood,
           java.lang.String arinimi,
           java.lang.String oigusliku_vormi_tahis,
           java.lang.String loppstaatuse_tahis,
           eu.x_road.arireg.producer.Evk_kapital kapital,
           eu.x_road.arireg.producer.Evk_pohikiri[] pohikiri) {
           this.ariregistri_kood = ariregistri_kood;
           this.esmakande_aeg = esmakande_aeg;
           this.kande_aeg = kande_aeg;
           this.kandeliigi_tahis = kandeliigi_tahis;
           this.kande_nr = kande_nr;
           this.notaritehingu_kood = notaritehingu_kood;
           this.arinimi = arinimi;
           this.oigusliku_vormi_tahis = oigusliku_vormi_tahis;
           this.loppstaatuse_tahis = loppstaatuse_tahis;
           this.kapital = kapital;
           this.pohikiri = pohikiri;
    }


    /**
     * Gets the ariregistri_kood value for this Evk_seotud_kanne.
     * 
     * @return ariregistri_kood   * Ettevõtja registrikood
     */
    public java.math.BigInteger getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Evk_seotud_kanne.
     * 
     * @param ariregistri_kood   * Ettevõtja registrikood
     */
    public void setAriregistri_kood(java.math.BigInteger ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the esmakande_aeg value for this Evk_seotud_kanne.
     * 
     * @return esmakande_aeg   * esmakande aeg
     */
    public java.util.Date getEsmakande_aeg() {
        return esmakande_aeg;
    }


    /**
     * Sets the esmakande_aeg value for this Evk_seotud_kanne.
     * 
     * @param esmakande_aeg   * esmakande aeg
     */
    public void setEsmakande_aeg(java.util.Date esmakande_aeg) {
        this.esmakande_aeg = esmakande_aeg;
    }


    /**
     * Gets the kande_aeg value for this Evk_seotud_kanne.
     * 
     * @return kande_aeg   * kande aeg
     */
    public java.util.Date getKande_aeg() {
        return kande_aeg;
    }


    /**
     * Sets the kande_aeg value for this Evk_seotud_kanne.
     * 
     * @param kande_aeg   * kande aeg
     */
    public void setKande_aeg(java.util.Date kande_aeg) {
        this.kande_aeg = kande_aeg;
    }


    /**
     * Gets the kandeliigi_tahis value for this Evk_seotud_kanne.
     * 
     * @return kandeliigi_tahis   * Kandeliik
     */
    public java.lang.String getKandeliigi_tahis() {
        return kandeliigi_tahis;
    }


    /**
     * Sets the kandeliigi_tahis value for this Evk_seotud_kanne.
     * 
     * @param kandeliigi_tahis   * Kandeliik
     */
    public void setKandeliigi_tahis(java.lang.String kandeliigi_tahis) {
        this.kandeliigi_tahis = kandeliigi_tahis;
    }


    /**
     * Gets the kande_nr value for this Evk_seotud_kanne.
     * 
     * @return kande_nr   * kande number
     */
    public java.lang.Integer getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Evk_seotud_kanne.
     * 
     * @param kande_nr   * kande number
     */
    public void setKande_nr(java.lang.Integer kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the notaritehingu_kood value for this Evk_seotud_kanne.
     * 
     * @return notaritehingu_kood   * notaritehingu kood
     */
    public java.lang.String getNotaritehingu_kood() {
        return notaritehingu_kood;
    }


    /**
     * Sets the notaritehingu_kood value for this Evk_seotud_kanne.
     * 
     * @param notaritehingu_kood   * notaritehingu kood
     */
    public void setNotaritehingu_kood(java.lang.String notaritehingu_kood) {
        this.notaritehingu_kood = notaritehingu_kood;
    }


    /**
     * Gets the arinimi value for this Evk_seotud_kanne.
     * 
     * @return arinimi   * Ärinimi
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }


    /**
     * Sets the arinimi value for this Evk_seotud_kanne.
     * 
     * @param arinimi   * Ärinimi
     */
    public void setArinimi(java.lang.String arinimi) {
        this.arinimi = arinimi;
    }


    /**
     * Gets the oigusliku_vormi_tahis value for this Evk_seotud_kanne.
     * 
     * @return oigusliku_vormi_tahis   * Õigusliku vormi tähis
     */
    public java.lang.String getOigusliku_vormi_tahis() {
        return oigusliku_vormi_tahis;
    }


    /**
     * Sets the oigusliku_vormi_tahis value for this Evk_seotud_kanne.
     * 
     * @param oigusliku_vormi_tahis   * Õigusliku vormi tähis
     */
    public void setOigusliku_vormi_tahis(java.lang.String oigusliku_vormi_tahis) {
        this.oigusliku_vormi_tahis = oigusliku_vormi_tahis;
    }


    /**
     * Gets the loppstaatuse_tahis value for this Evk_seotud_kanne.
     * 
     * @return loppstaatuse_tahis   * Lõppstaatuse tähis
     */
    public java.lang.String getLoppstaatuse_tahis() {
        return loppstaatuse_tahis;
    }


    /**
     * Sets the loppstaatuse_tahis value for this Evk_seotud_kanne.
     * 
     * @param loppstaatuse_tahis   * Lõppstaatuse tähis
     */
    public void setLoppstaatuse_tahis(java.lang.String loppstaatuse_tahis) {
        this.loppstaatuse_tahis = loppstaatuse_tahis;
    }


    /**
     * Gets the kapital value for this Evk_seotud_kanne.
     * 
     * @return kapital   * Kapital
     */
    public eu.x_road.arireg.producer.Evk_kapital getKapital() {
        return kapital;
    }


    /**
     * Sets the kapital value for this Evk_seotud_kanne.
     * 
     * @param kapital   * Kapital
     */
    public void setKapital(eu.x_road.arireg.producer.Evk_kapital kapital) {
        this.kapital = kapital;
    }


    /**
     * Gets the pohikiri value for this Evk_seotud_kanne.
     * 
     * @return pohikiri   * Põhikiri
     */
    public eu.x_road.arireg.producer.Evk_pohikiri[] getPohikiri() {
        return pohikiri;
    }


    /**
     * Sets the pohikiri value for this Evk_seotud_kanne.
     * 
     * @param pohikiri   * Põhikiri
     */
    public void setPohikiri(eu.x_road.arireg.producer.Evk_pohikiri[] pohikiri) {
        this.pohikiri = pohikiri;
    }

    public eu.x_road.arireg.producer.Evk_pohikiri getPohikiri(int i) {
        return this.pohikiri[i];
    }

    public void setPohikiri(int i, eu.x_road.arireg.producer.Evk_pohikiri _value) {
        this.pohikiri[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evk_seotud_kanne)) return false;
        Evk_seotud_kanne other = (Evk_seotud_kanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.esmakande_aeg==null && other.getEsmakande_aeg()==null) || 
             (this.esmakande_aeg!=null &&
              this.esmakande_aeg.equals(other.getEsmakande_aeg()))) &&
            ((this.kande_aeg==null && other.getKande_aeg()==null) || 
             (this.kande_aeg!=null &&
              this.kande_aeg.equals(other.getKande_aeg()))) &&
            ((this.kandeliigi_tahis==null && other.getKandeliigi_tahis()==null) || 
             (this.kandeliigi_tahis!=null &&
              this.kandeliigi_tahis.equals(other.getKandeliigi_tahis()))) &&
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.notaritehingu_kood==null && other.getNotaritehingu_kood()==null) || 
             (this.notaritehingu_kood!=null &&
              this.notaritehingu_kood.equals(other.getNotaritehingu_kood()))) &&
            ((this.arinimi==null && other.getArinimi()==null) || 
             (this.arinimi!=null &&
              this.arinimi.equals(other.getArinimi()))) &&
            ((this.oigusliku_vormi_tahis==null && other.getOigusliku_vormi_tahis()==null) || 
             (this.oigusliku_vormi_tahis!=null &&
              this.oigusliku_vormi_tahis.equals(other.getOigusliku_vormi_tahis()))) &&
            ((this.loppstaatuse_tahis==null && other.getLoppstaatuse_tahis()==null) || 
             (this.loppstaatuse_tahis!=null &&
              this.loppstaatuse_tahis.equals(other.getLoppstaatuse_tahis()))) &&
            ((this.kapital==null && other.getKapital()==null) || 
             (this.kapital!=null &&
              this.kapital.equals(other.getKapital()))) &&
            ((this.pohikiri==null && other.getPohikiri()==null) || 
             (this.pohikiri!=null &&
              java.util.Arrays.equals(this.pohikiri, other.getPohikiri())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getEsmakande_aeg() != null) {
            _hashCode += getEsmakande_aeg().hashCode();
        }
        if (getKande_aeg() != null) {
            _hashCode += getKande_aeg().hashCode();
        }
        if (getKandeliigi_tahis() != null) {
            _hashCode += getKandeliigi_tahis().hashCode();
        }
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getNotaritehingu_kood() != null) {
            _hashCode += getNotaritehingu_kood().hashCode();
        }
        if (getArinimi() != null) {
            _hashCode += getArinimi().hashCode();
        }
        if (getOigusliku_vormi_tahis() != null) {
            _hashCode += getOigusliku_vormi_tahis().hashCode();
        }
        if (getLoppstaatuse_tahis() != null) {
            _hashCode += getLoppstaatuse_tahis().hashCode();
        }
        if (getKapital() != null) {
            _hashCode += getKapital().hashCode();
        }
        if (getPohikiri() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPohikiri());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPohikiri(), i);
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
