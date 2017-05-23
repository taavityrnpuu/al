/**
 * Toimiku_dokumendid_dokument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Toimiku_dokumendid_dokument  implements java.io.Serializable {
    /* Dokumendid vastuses. */
    private java.math.BigInteger dokumendi_id;

    /* Dokumendid vastuses. */
    private java.math.BigInteger pohi_dokumendi_id;

    /* Menetluse number. */
    private java.lang.String menetluse_number;

    /* Menetluse alguskuupäev. */
    private java.util.Date menetluse_algus_kuupaev;

    /* Menetluse loppkuupäev. */
    private java.util.Date menetluse_lopp_kuupaev;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_liik;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_liik_tekstina;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_olek;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_olek_tekstina;

    /* Notari ID. */
    private java.lang.String notari_id;

    /* Notari nimi. */
    private java.lang.String notari_nimi;

    /* Notari isikukood. */
    private java.lang.String notari_isikukood;

    /* Notari tehingu number. */
    private java.lang.String notari_tehingu_nr;

    /* Notari tehingu aasta. */
    private java.lang.String notari_tehingu_aasta;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_paritolu;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_paritolu_tekstina;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_failinimi;

    /* Dokumendi suurus. */
    private java.lang.Integer dokumendi_suurus;

    public Toimiku_dokumendid_dokument() {
    }

    public Toimiku_dokumendid_dokument(
           java.math.BigInteger dokumendi_id,
           java.math.BigInteger pohi_dokumendi_id,
           java.lang.String menetluse_number,
           java.util.Date menetluse_algus_kuupaev,
           java.util.Date menetluse_lopp_kuupaev,
           java.lang.String dokumendi_liik,
           java.lang.String dokumendi_liik_tekstina,
           java.lang.String dokumendi_olek,
           java.lang.String dokumendi_olek_tekstina,
           java.lang.String notari_id,
           java.lang.String notari_nimi,
           java.lang.String notari_isikukood,
           java.lang.String notari_tehingu_nr,
           java.lang.String notari_tehingu_aasta,
           java.lang.String dokumendi_paritolu,
           java.lang.String dokumendi_paritolu_tekstina,
           java.lang.String dokumendi_failinimi,
           java.lang.Integer dokumendi_suurus) {
           this.dokumendi_id = dokumendi_id;
           this.pohi_dokumendi_id = pohi_dokumendi_id;
           this.menetluse_number = menetluse_number;
           this.menetluse_algus_kuupaev = menetluse_algus_kuupaev;
           this.menetluse_lopp_kuupaev = menetluse_lopp_kuupaev;
           this.dokumendi_liik = dokumendi_liik;
           this.dokumendi_liik_tekstina = dokumendi_liik_tekstina;
           this.dokumendi_olek = dokumendi_olek;
           this.dokumendi_olek_tekstina = dokumendi_olek_tekstina;
           this.notari_id = notari_id;
           this.notari_nimi = notari_nimi;
           this.notari_isikukood = notari_isikukood;
           this.notari_tehingu_nr = notari_tehingu_nr;
           this.notari_tehingu_aasta = notari_tehingu_aasta;
           this.dokumendi_paritolu = dokumendi_paritolu;
           this.dokumendi_paritolu_tekstina = dokumendi_paritolu_tekstina;
           this.dokumendi_failinimi = dokumendi_failinimi;
           this.dokumendi_suurus = dokumendi_suurus;
    }


    /**
     * Gets the dokumendi_id value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_id   * Dokumendid vastuses.
     */
    public java.math.BigInteger getDokumendi_id() {
        return dokumendi_id;
    }


    /**
     * Sets the dokumendi_id value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_id   * Dokumendid vastuses.
     */
    public void setDokumendi_id(java.math.BigInteger dokumendi_id) {
        this.dokumendi_id = dokumendi_id;
    }


    /**
     * Gets the pohi_dokumendi_id value for this Toimiku_dokumendid_dokument.
     * 
     * @return pohi_dokumendi_id   * Dokumendid vastuses.
     */
    public java.math.BigInteger getPohi_dokumendi_id() {
        return pohi_dokumendi_id;
    }


    /**
     * Sets the pohi_dokumendi_id value for this Toimiku_dokumendid_dokument.
     * 
     * @param pohi_dokumendi_id   * Dokumendid vastuses.
     */
    public void setPohi_dokumendi_id(java.math.BigInteger pohi_dokumendi_id) {
        this.pohi_dokumendi_id = pohi_dokumendi_id;
    }


    /**
     * Gets the menetluse_number value for this Toimiku_dokumendid_dokument.
     * 
     * @return menetluse_number   * Menetluse number.
     */
    public java.lang.String getMenetluse_number() {
        return menetluse_number;
    }


    /**
     * Sets the menetluse_number value for this Toimiku_dokumendid_dokument.
     * 
     * @param menetluse_number   * Menetluse number.
     */
    public void setMenetluse_number(java.lang.String menetluse_number) {
        this.menetluse_number = menetluse_number;
    }


    /**
     * Gets the menetluse_algus_kuupaev value for this Toimiku_dokumendid_dokument.
     * 
     * @return menetluse_algus_kuupaev   * Menetluse alguskuupäev.
     */
    public java.util.Date getMenetluse_algus_kuupaev() {
        return menetluse_algus_kuupaev;
    }


    /**
     * Sets the menetluse_algus_kuupaev value for this Toimiku_dokumendid_dokument.
     * 
     * @param menetluse_algus_kuupaev   * Menetluse alguskuupäev.
     */
    public void setMenetluse_algus_kuupaev(java.util.Date menetluse_algus_kuupaev) {
        this.menetluse_algus_kuupaev = menetluse_algus_kuupaev;
    }


    /**
     * Gets the menetluse_lopp_kuupaev value for this Toimiku_dokumendid_dokument.
     * 
     * @return menetluse_lopp_kuupaev   * Menetluse loppkuupäev.
     */
    public java.util.Date getMenetluse_lopp_kuupaev() {
        return menetluse_lopp_kuupaev;
    }


    /**
     * Sets the menetluse_lopp_kuupaev value for this Toimiku_dokumendid_dokument.
     * 
     * @param menetluse_lopp_kuupaev   * Menetluse loppkuupäev.
     */
    public void setMenetluse_lopp_kuupaev(java.util.Date menetluse_lopp_kuupaev) {
        this.menetluse_lopp_kuupaev = menetluse_lopp_kuupaev;
    }


    /**
     * Gets the dokumendi_liik value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_liik   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_liik() {
        return dokumendi_liik;
    }


    /**
     * Sets the dokumendi_liik value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_liik   * Dokumendid vastuses.
     */
    public void setDokumendi_liik(java.lang.String dokumendi_liik) {
        this.dokumendi_liik = dokumendi_liik;
    }


    /**
     * Gets the dokumendi_liik_tekstina value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_liik_tekstina   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_liik_tekstina() {
        return dokumendi_liik_tekstina;
    }


    /**
     * Sets the dokumendi_liik_tekstina value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_liik_tekstina   * Dokumendid vastuses.
     */
    public void setDokumendi_liik_tekstina(java.lang.String dokumendi_liik_tekstina) {
        this.dokumendi_liik_tekstina = dokumendi_liik_tekstina;
    }


    /**
     * Gets the dokumendi_olek value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_olek   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_olek() {
        return dokumendi_olek;
    }


    /**
     * Sets the dokumendi_olek value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_olek   * Dokumendid vastuses.
     */
    public void setDokumendi_olek(java.lang.String dokumendi_olek) {
        this.dokumendi_olek = dokumendi_olek;
    }


    /**
     * Gets the dokumendi_olek_tekstina value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_olek_tekstina   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_olek_tekstina() {
        return dokumendi_olek_tekstina;
    }


    /**
     * Sets the dokumendi_olek_tekstina value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_olek_tekstina   * Dokumendid vastuses.
     */
    public void setDokumendi_olek_tekstina(java.lang.String dokumendi_olek_tekstina) {
        this.dokumendi_olek_tekstina = dokumendi_olek_tekstina;
    }


    /**
     * Gets the notari_id value for this Toimiku_dokumendid_dokument.
     * 
     * @return notari_id   * Notari ID.
     */
    public java.lang.String getNotari_id() {
        return notari_id;
    }


    /**
     * Sets the notari_id value for this Toimiku_dokumendid_dokument.
     * 
     * @param notari_id   * Notari ID.
     */
    public void setNotari_id(java.lang.String notari_id) {
        this.notari_id = notari_id;
    }


    /**
     * Gets the notari_nimi value for this Toimiku_dokumendid_dokument.
     * 
     * @return notari_nimi   * Notari nimi.
     */
    public java.lang.String getNotari_nimi() {
        return notari_nimi;
    }


    /**
     * Sets the notari_nimi value for this Toimiku_dokumendid_dokument.
     * 
     * @param notari_nimi   * Notari nimi.
     */
    public void setNotari_nimi(java.lang.String notari_nimi) {
        this.notari_nimi = notari_nimi;
    }


    /**
     * Gets the notari_isikukood value for this Toimiku_dokumendid_dokument.
     * 
     * @return notari_isikukood   * Notari isikukood.
     */
    public java.lang.String getNotari_isikukood() {
        return notari_isikukood;
    }


    /**
     * Sets the notari_isikukood value for this Toimiku_dokumendid_dokument.
     * 
     * @param notari_isikukood   * Notari isikukood.
     */
    public void setNotari_isikukood(java.lang.String notari_isikukood) {
        this.notari_isikukood = notari_isikukood;
    }


    /**
     * Gets the notari_tehingu_nr value for this Toimiku_dokumendid_dokument.
     * 
     * @return notari_tehingu_nr   * Notari tehingu number.
     */
    public java.lang.String getNotari_tehingu_nr() {
        return notari_tehingu_nr;
    }


    /**
     * Sets the notari_tehingu_nr value for this Toimiku_dokumendid_dokument.
     * 
     * @param notari_tehingu_nr   * Notari tehingu number.
     */
    public void setNotari_tehingu_nr(java.lang.String notari_tehingu_nr) {
        this.notari_tehingu_nr = notari_tehingu_nr;
    }


    /**
     * Gets the notari_tehingu_aasta value for this Toimiku_dokumendid_dokument.
     * 
     * @return notari_tehingu_aasta   * Notari tehingu aasta.
     */
    public java.lang.String getNotari_tehingu_aasta() {
        return notari_tehingu_aasta;
    }


    /**
     * Sets the notari_tehingu_aasta value for this Toimiku_dokumendid_dokument.
     * 
     * @param notari_tehingu_aasta   * Notari tehingu aasta.
     */
    public void setNotari_tehingu_aasta(java.lang.String notari_tehingu_aasta) {
        this.notari_tehingu_aasta = notari_tehingu_aasta;
    }


    /**
     * Gets the dokumendi_paritolu value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_paritolu   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_paritolu() {
        return dokumendi_paritolu;
    }


    /**
     * Sets the dokumendi_paritolu value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_paritolu   * Dokumendid vastuses.
     */
    public void setDokumendi_paritolu(java.lang.String dokumendi_paritolu) {
        this.dokumendi_paritolu = dokumendi_paritolu;
    }


    /**
     * Gets the dokumendi_paritolu_tekstina value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_paritolu_tekstina   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_paritolu_tekstina() {
        return dokumendi_paritolu_tekstina;
    }


    /**
     * Sets the dokumendi_paritolu_tekstina value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_paritolu_tekstina   * Dokumendid vastuses.
     */
    public void setDokumendi_paritolu_tekstina(java.lang.String dokumendi_paritolu_tekstina) {
        this.dokumendi_paritolu_tekstina = dokumendi_paritolu_tekstina;
    }


    /**
     * Gets the dokumendi_failinimi value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_failinimi   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_failinimi() {
        return dokumendi_failinimi;
    }


    /**
     * Sets the dokumendi_failinimi value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_failinimi   * Dokumendid vastuses.
     */
    public void setDokumendi_failinimi(java.lang.String dokumendi_failinimi) {
        this.dokumendi_failinimi = dokumendi_failinimi;
    }


    /**
     * Gets the dokumendi_suurus value for this Toimiku_dokumendid_dokument.
     * 
     * @return dokumendi_suurus   * Dokumendi suurus.
     */
    public java.lang.Integer getDokumendi_suurus() {
        return dokumendi_suurus;
    }


    /**
     * Sets the dokumendi_suurus value for this Toimiku_dokumendid_dokument.
     * 
     * @param dokumendi_suurus   * Dokumendi suurus.
     */
    public void setDokumendi_suurus(java.lang.Integer dokumendi_suurus) {
        this.dokumendi_suurus = dokumendi_suurus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Toimiku_dokumendid_dokument)) return false;
        Toimiku_dokumendid_dokument other = (Toimiku_dokumendid_dokument) obj;
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
            ((this.pohi_dokumendi_id==null && other.getPohi_dokumendi_id()==null) || 
             (this.pohi_dokumendi_id!=null &&
              this.pohi_dokumendi_id.equals(other.getPohi_dokumendi_id()))) &&
            ((this.menetluse_number==null && other.getMenetluse_number()==null) || 
             (this.menetluse_number!=null &&
              this.menetluse_number.equals(other.getMenetluse_number()))) &&
            ((this.menetluse_algus_kuupaev==null && other.getMenetluse_algus_kuupaev()==null) || 
             (this.menetluse_algus_kuupaev!=null &&
              this.menetluse_algus_kuupaev.equals(other.getMenetluse_algus_kuupaev()))) &&
            ((this.menetluse_lopp_kuupaev==null && other.getMenetluse_lopp_kuupaev()==null) || 
             (this.menetluse_lopp_kuupaev!=null &&
              this.menetluse_lopp_kuupaev.equals(other.getMenetluse_lopp_kuupaev()))) &&
            ((this.dokumendi_liik==null && other.getDokumendi_liik()==null) || 
             (this.dokumendi_liik!=null &&
              this.dokumendi_liik.equals(other.getDokumendi_liik()))) &&
            ((this.dokumendi_liik_tekstina==null && other.getDokumendi_liik_tekstina()==null) || 
             (this.dokumendi_liik_tekstina!=null &&
              this.dokumendi_liik_tekstina.equals(other.getDokumendi_liik_tekstina()))) &&
            ((this.dokumendi_olek==null && other.getDokumendi_olek()==null) || 
             (this.dokumendi_olek!=null &&
              this.dokumendi_olek.equals(other.getDokumendi_olek()))) &&
            ((this.dokumendi_olek_tekstina==null && other.getDokumendi_olek_tekstina()==null) || 
             (this.dokumendi_olek_tekstina!=null &&
              this.dokumendi_olek_tekstina.equals(other.getDokumendi_olek_tekstina()))) &&
            ((this.notari_id==null && other.getNotari_id()==null) || 
             (this.notari_id!=null &&
              this.notari_id.equals(other.getNotari_id()))) &&
            ((this.notari_nimi==null && other.getNotari_nimi()==null) || 
             (this.notari_nimi!=null &&
              this.notari_nimi.equals(other.getNotari_nimi()))) &&
            ((this.notari_isikukood==null && other.getNotari_isikukood()==null) || 
             (this.notari_isikukood!=null &&
              this.notari_isikukood.equals(other.getNotari_isikukood()))) &&
            ((this.notari_tehingu_nr==null && other.getNotari_tehingu_nr()==null) || 
             (this.notari_tehingu_nr!=null &&
              this.notari_tehingu_nr.equals(other.getNotari_tehingu_nr()))) &&
            ((this.notari_tehingu_aasta==null && other.getNotari_tehingu_aasta()==null) || 
             (this.notari_tehingu_aasta!=null &&
              this.notari_tehingu_aasta.equals(other.getNotari_tehingu_aasta()))) &&
            ((this.dokumendi_paritolu==null && other.getDokumendi_paritolu()==null) || 
             (this.dokumendi_paritolu!=null &&
              this.dokumendi_paritolu.equals(other.getDokumendi_paritolu()))) &&
            ((this.dokumendi_paritolu_tekstina==null && other.getDokumendi_paritolu_tekstina()==null) || 
             (this.dokumendi_paritolu_tekstina!=null &&
              this.dokumendi_paritolu_tekstina.equals(other.getDokumendi_paritolu_tekstina()))) &&
            ((this.dokumendi_failinimi==null && other.getDokumendi_failinimi()==null) || 
             (this.dokumendi_failinimi!=null &&
              this.dokumendi_failinimi.equals(other.getDokumendi_failinimi()))) &&
            ((this.dokumendi_suurus==null && other.getDokumendi_suurus()==null) || 
             (this.dokumendi_suurus!=null &&
              this.dokumendi_suurus.equals(other.getDokumendi_suurus())));
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
        if (getPohi_dokumendi_id() != null) {
            _hashCode += getPohi_dokumendi_id().hashCode();
        }
        if (getMenetluse_number() != null) {
            _hashCode += getMenetluse_number().hashCode();
        }
        if (getMenetluse_algus_kuupaev() != null) {
            _hashCode += getMenetluse_algus_kuupaev().hashCode();
        }
        if (getMenetluse_lopp_kuupaev() != null) {
            _hashCode += getMenetluse_lopp_kuupaev().hashCode();
        }
        if (getDokumendi_liik() != null) {
            _hashCode += getDokumendi_liik().hashCode();
        }
        if (getDokumendi_liik_tekstina() != null) {
            _hashCode += getDokumendi_liik_tekstina().hashCode();
        }
        if (getDokumendi_olek() != null) {
            _hashCode += getDokumendi_olek().hashCode();
        }
        if (getDokumendi_olek_tekstina() != null) {
            _hashCode += getDokumendi_olek_tekstina().hashCode();
        }
        if (getNotari_id() != null) {
            _hashCode += getNotari_id().hashCode();
        }
        if (getNotari_nimi() != null) {
            _hashCode += getNotari_nimi().hashCode();
        }
        if (getNotari_isikukood() != null) {
            _hashCode += getNotari_isikukood().hashCode();
        }
        if (getNotari_tehingu_nr() != null) {
            _hashCode += getNotari_tehingu_nr().hashCode();
        }
        if (getNotari_tehingu_aasta() != null) {
            _hashCode += getNotari_tehingu_aasta().hashCode();
        }
        if (getDokumendi_paritolu() != null) {
            _hashCode += getDokumendi_paritolu().hashCode();
        }
        if (getDokumendi_paritolu_tekstina() != null) {
            _hashCode += getDokumendi_paritolu_tekstina().hashCode();
        }
        if (getDokumendi_failinimi() != null) {
            _hashCode += getDokumendi_failinimi().hashCode();
        }
        if (getDokumendi_suurus() != null) {
            _hashCode += getDokumendi_suurus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
