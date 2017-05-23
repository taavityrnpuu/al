/**
 * Ariregistri_toimik_dokument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ariregistri_toimik_dokument  implements java.io.Serializable {
    /* Dokumendi ID. */
    private java.math.BigInteger dokumendi_id;

    /* Põhidokumendi ID */
    private java.math.BigInteger pohi_dokumendi_id;

    /* E-dokumendi ID. */
    private java.math.BigInteger e_dokumendi_id;

    /* Menetluse number */
    private java.lang.String menetluse_number;

    /* Esitamise kuupäev. */
    private java.util.Date esit_kpv;

    /* Dokumendi liik */
    private java.lang.String dokumendi_liik;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_liik_tekstina;

    /* Dokumendi olek */
    private java.lang.String dokumendi_olek;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_olek_tekstina;

    /* Notari ID. */
    private java.lang.String notari_id;

    /* Notari ees- ja perekonnanimi */
    private java.lang.String notari_nimi;

    /* Esitaja ID. */
    private java.lang.String esitaja_id;

    /* Esitaja ees- ja perekonnanimi */
    private java.lang.String esitaja_nimi;

    /* Notari tehingu number. */
    private java.lang.String notari_tehingu_nr;

    /* Notari tehingu aasta. */
    private java.lang.String notari_tehingu_aasta;

    /* Dokumendi päritolu. */
    private java.lang.String dokumendi_paritolu;

    /* Dokumendid vastuses. */
    private java.lang.String dokumendi_paritolu_tekstina;

    /* Dokumendi faili nimi */
    private java.lang.String dokumendi_failinimi;

    /* Dokumendi faili suurus. */
    private java.lang.Integer dokumendi_suurus;

    public Ariregistri_toimik_dokument() {
    }

    public Ariregistri_toimik_dokument(
           java.math.BigInteger dokumendi_id,
           java.math.BigInteger pohi_dokumendi_id,
           java.math.BigInteger e_dokumendi_id,
           java.lang.String menetluse_number,
           java.util.Date esit_kpv,
           java.lang.String dokumendi_liik,
           java.lang.String dokumendi_liik_tekstina,
           java.lang.String dokumendi_olek,
           java.lang.String dokumendi_olek_tekstina,
           java.lang.String notari_id,
           java.lang.String notari_nimi,
           java.lang.String esitaja_id,
           java.lang.String esitaja_nimi,
           java.lang.String notari_tehingu_nr,
           java.lang.String notari_tehingu_aasta,
           java.lang.String dokumendi_paritolu,
           java.lang.String dokumendi_paritolu_tekstina,
           java.lang.String dokumendi_failinimi,
           java.lang.Integer dokumendi_suurus) {
           this.dokumendi_id = dokumendi_id;
           this.pohi_dokumendi_id = pohi_dokumendi_id;
           this.e_dokumendi_id = e_dokumendi_id;
           this.menetluse_number = menetluse_number;
           this.esit_kpv = esit_kpv;
           this.dokumendi_liik = dokumendi_liik;
           this.dokumendi_liik_tekstina = dokumendi_liik_tekstina;
           this.dokumendi_olek = dokumendi_olek;
           this.dokumendi_olek_tekstina = dokumendi_olek_tekstina;
           this.notari_id = notari_id;
           this.notari_nimi = notari_nimi;
           this.esitaja_id = esitaja_id;
           this.esitaja_nimi = esitaja_nimi;
           this.notari_tehingu_nr = notari_tehingu_nr;
           this.notari_tehingu_aasta = notari_tehingu_aasta;
           this.dokumendi_paritolu = dokumendi_paritolu;
           this.dokumendi_paritolu_tekstina = dokumendi_paritolu_tekstina;
           this.dokumendi_failinimi = dokumendi_failinimi;
           this.dokumendi_suurus = dokumendi_suurus;
    }


    /**
     * Gets the dokumendi_id value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_id   * Dokumendi ID.
     */
    public java.math.BigInteger getDokumendi_id() {
        return dokumendi_id;
    }


    /**
     * Sets the dokumendi_id value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_id   * Dokumendi ID.
     */
    public void setDokumendi_id(java.math.BigInteger dokumendi_id) {
        this.dokumendi_id = dokumendi_id;
    }


    /**
     * Gets the pohi_dokumendi_id value for this Ariregistri_toimik_dokument.
     * 
     * @return pohi_dokumendi_id   * Põhidokumendi ID
     */
    public java.math.BigInteger getPohi_dokumendi_id() {
        return pohi_dokumendi_id;
    }


    /**
     * Sets the pohi_dokumendi_id value for this Ariregistri_toimik_dokument.
     * 
     * @param pohi_dokumendi_id   * Põhidokumendi ID
     */
    public void setPohi_dokumendi_id(java.math.BigInteger pohi_dokumendi_id) {
        this.pohi_dokumendi_id = pohi_dokumendi_id;
    }


    /**
     * Gets the e_dokumendi_id value for this Ariregistri_toimik_dokument.
     * 
     * @return e_dokumendi_id   * E-dokumendi ID.
     */
    public java.math.BigInteger getE_dokumendi_id() {
        return e_dokumendi_id;
    }


    /**
     * Sets the e_dokumendi_id value for this Ariregistri_toimik_dokument.
     * 
     * @param e_dokumendi_id   * E-dokumendi ID.
     */
    public void setE_dokumendi_id(java.math.BigInteger e_dokumendi_id) {
        this.e_dokumendi_id = e_dokumendi_id;
    }


    /**
     * Gets the menetluse_number value for this Ariregistri_toimik_dokument.
     * 
     * @return menetluse_number   * Menetluse number
     */
    public java.lang.String getMenetluse_number() {
        return menetluse_number;
    }


    /**
     * Sets the menetluse_number value for this Ariregistri_toimik_dokument.
     * 
     * @param menetluse_number   * Menetluse number
     */
    public void setMenetluse_number(java.lang.String menetluse_number) {
        this.menetluse_number = menetluse_number;
    }


    /**
     * Gets the esit_kpv value for this Ariregistri_toimik_dokument.
     * 
     * @return esit_kpv   * Esitamise kuupäev.
     */
    public java.util.Date getEsit_kpv() {
        return esit_kpv;
    }


    /**
     * Sets the esit_kpv value for this Ariregistri_toimik_dokument.
     * 
     * @param esit_kpv   * Esitamise kuupäev.
     */
    public void setEsit_kpv(java.util.Date esit_kpv) {
        this.esit_kpv = esit_kpv;
    }


    /**
     * Gets the dokumendi_liik value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_liik   * Dokumendi liik
     */
    public java.lang.String getDokumendi_liik() {
        return dokumendi_liik;
    }


    /**
     * Sets the dokumendi_liik value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_liik   * Dokumendi liik
     */
    public void setDokumendi_liik(java.lang.String dokumendi_liik) {
        this.dokumendi_liik = dokumendi_liik;
    }


    /**
     * Gets the dokumendi_liik_tekstina value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_liik_tekstina   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_liik_tekstina() {
        return dokumendi_liik_tekstina;
    }


    /**
     * Sets the dokumendi_liik_tekstina value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_liik_tekstina   * Dokumendid vastuses.
     */
    public void setDokumendi_liik_tekstina(java.lang.String dokumendi_liik_tekstina) {
        this.dokumendi_liik_tekstina = dokumendi_liik_tekstina;
    }


    /**
     * Gets the dokumendi_olek value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_olek   * Dokumendi olek
     */
    public java.lang.String getDokumendi_olek() {
        return dokumendi_olek;
    }


    /**
     * Sets the dokumendi_olek value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_olek   * Dokumendi olek
     */
    public void setDokumendi_olek(java.lang.String dokumendi_olek) {
        this.dokumendi_olek = dokumendi_olek;
    }


    /**
     * Gets the dokumendi_olek_tekstina value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_olek_tekstina   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_olek_tekstina() {
        return dokumendi_olek_tekstina;
    }


    /**
     * Sets the dokumendi_olek_tekstina value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_olek_tekstina   * Dokumendid vastuses.
     */
    public void setDokumendi_olek_tekstina(java.lang.String dokumendi_olek_tekstina) {
        this.dokumendi_olek_tekstina = dokumendi_olek_tekstina;
    }


    /**
     * Gets the notari_id value for this Ariregistri_toimik_dokument.
     * 
     * @return notari_id   * Notari ID.
     */
    public java.lang.String getNotari_id() {
        return notari_id;
    }


    /**
     * Sets the notari_id value for this Ariregistri_toimik_dokument.
     * 
     * @param notari_id   * Notari ID.
     */
    public void setNotari_id(java.lang.String notari_id) {
        this.notari_id = notari_id;
    }


    /**
     * Gets the notari_nimi value for this Ariregistri_toimik_dokument.
     * 
     * @return notari_nimi   * Notari ees- ja perekonnanimi
     */
    public java.lang.String getNotari_nimi() {
        return notari_nimi;
    }


    /**
     * Sets the notari_nimi value for this Ariregistri_toimik_dokument.
     * 
     * @param notari_nimi   * Notari ees- ja perekonnanimi
     */
    public void setNotari_nimi(java.lang.String notari_nimi) {
        this.notari_nimi = notari_nimi;
    }


    /**
     * Gets the esitaja_id value for this Ariregistri_toimik_dokument.
     * 
     * @return esitaja_id   * Esitaja ID.
     */
    public java.lang.String getEsitaja_id() {
        return esitaja_id;
    }


    /**
     * Sets the esitaja_id value for this Ariregistri_toimik_dokument.
     * 
     * @param esitaja_id   * Esitaja ID.
     */
    public void setEsitaja_id(java.lang.String esitaja_id) {
        this.esitaja_id = esitaja_id;
    }


    /**
     * Gets the esitaja_nimi value for this Ariregistri_toimik_dokument.
     * 
     * @return esitaja_nimi   * Esitaja ees- ja perekonnanimi
     */
    public java.lang.String getEsitaja_nimi() {
        return esitaja_nimi;
    }


    /**
     * Sets the esitaja_nimi value for this Ariregistri_toimik_dokument.
     * 
     * @param esitaja_nimi   * Esitaja ees- ja perekonnanimi
     */
    public void setEsitaja_nimi(java.lang.String esitaja_nimi) {
        this.esitaja_nimi = esitaja_nimi;
    }


    /**
     * Gets the notari_tehingu_nr value for this Ariregistri_toimik_dokument.
     * 
     * @return notari_tehingu_nr   * Notari tehingu number.
     */
    public java.lang.String getNotari_tehingu_nr() {
        return notari_tehingu_nr;
    }


    /**
     * Sets the notari_tehingu_nr value for this Ariregistri_toimik_dokument.
     * 
     * @param notari_tehingu_nr   * Notari tehingu number.
     */
    public void setNotari_tehingu_nr(java.lang.String notari_tehingu_nr) {
        this.notari_tehingu_nr = notari_tehingu_nr;
    }


    /**
     * Gets the notari_tehingu_aasta value for this Ariregistri_toimik_dokument.
     * 
     * @return notari_tehingu_aasta   * Notari tehingu aasta.
     */
    public java.lang.String getNotari_tehingu_aasta() {
        return notari_tehingu_aasta;
    }


    /**
     * Sets the notari_tehingu_aasta value for this Ariregistri_toimik_dokument.
     * 
     * @param notari_tehingu_aasta   * Notari tehingu aasta.
     */
    public void setNotari_tehingu_aasta(java.lang.String notari_tehingu_aasta) {
        this.notari_tehingu_aasta = notari_tehingu_aasta;
    }


    /**
     * Gets the dokumendi_paritolu value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_paritolu   * Dokumendi päritolu.
     */
    public java.lang.String getDokumendi_paritolu() {
        return dokumendi_paritolu;
    }


    /**
     * Sets the dokumendi_paritolu value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_paritolu   * Dokumendi päritolu.
     */
    public void setDokumendi_paritolu(java.lang.String dokumendi_paritolu) {
        this.dokumendi_paritolu = dokumendi_paritolu;
    }


    /**
     * Gets the dokumendi_paritolu_tekstina value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_paritolu_tekstina   * Dokumendid vastuses.
     */
    public java.lang.String getDokumendi_paritolu_tekstina() {
        return dokumendi_paritolu_tekstina;
    }


    /**
     * Sets the dokumendi_paritolu_tekstina value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_paritolu_tekstina   * Dokumendid vastuses.
     */
    public void setDokumendi_paritolu_tekstina(java.lang.String dokumendi_paritolu_tekstina) {
        this.dokumendi_paritolu_tekstina = dokumendi_paritolu_tekstina;
    }


    /**
     * Gets the dokumendi_failinimi value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_failinimi   * Dokumendi faili nimi
     */
    public java.lang.String getDokumendi_failinimi() {
        return dokumendi_failinimi;
    }


    /**
     * Sets the dokumendi_failinimi value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_failinimi   * Dokumendi faili nimi
     */
    public void setDokumendi_failinimi(java.lang.String dokumendi_failinimi) {
        this.dokumendi_failinimi = dokumendi_failinimi;
    }


    /**
     * Gets the dokumendi_suurus value for this Ariregistri_toimik_dokument.
     * 
     * @return dokumendi_suurus   * Dokumendi faili suurus.
     */
    public java.lang.Integer getDokumendi_suurus() {
        return dokumendi_suurus;
    }


    /**
     * Sets the dokumendi_suurus value for this Ariregistri_toimik_dokument.
     * 
     * @param dokumendi_suurus   * Dokumendi faili suurus.
     */
    public void setDokumendi_suurus(java.lang.Integer dokumendi_suurus) {
        this.dokumendi_suurus = dokumendi_suurus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ariregistri_toimik_dokument)) return false;
        Ariregistri_toimik_dokument other = (Ariregistri_toimik_dokument) obj;
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
            ((this.e_dokumendi_id==null && other.getE_dokumendi_id()==null) || 
             (this.e_dokumendi_id!=null &&
              this.e_dokumendi_id.equals(other.getE_dokumendi_id()))) &&
            ((this.menetluse_number==null && other.getMenetluse_number()==null) || 
             (this.menetluse_number!=null &&
              this.menetluse_number.equals(other.getMenetluse_number()))) &&
            ((this.esit_kpv==null && other.getEsit_kpv()==null) || 
             (this.esit_kpv!=null &&
              this.esit_kpv.equals(other.getEsit_kpv()))) &&
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
            ((this.esitaja_id==null && other.getEsitaja_id()==null) || 
             (this.esitaja_id!=null &&
              this.esitaja_id.equals(other.getEsitaja_id()))) &&
            ((this.esitaja_nimi==null && other.getEsitaja_nimi()==null) || 
             (this.esitaja_nimi!=null &&
              this.esitaja_nimi.equals(other.getEsitaja_nimi()))) &&
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
        if (getE_dokumendi_id() != null) {
            _hashCode += getE_dokumendi_id().hashCode();
        }
        if (getMenetluse_number() != null) {
            _hashCode += getMenetluse_number().hashCode();
        }
        if (getEsit_kpv() != null) {
            _hashCode += getEsit_kpv().hashCode();
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
        if (getEsitaja_id() != null) {
            _hashCode += getEsitaja_id().hashCode();
        }
        if (getEsitaja_nimi() != null) {
            _hashCode += getEsitaja_nimi().hashCode();
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
