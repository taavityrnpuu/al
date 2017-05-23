/**
 * Detailandmed_v5_dokument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_dokument  implements java.io.Serializable {
    private java.math.BigInteger number;

    private java.util.Date esitamise_kpv;

    private java.lang.String dok_liik;

    private java.lang.String dok_liik_tekstina;

    private java.lang.String aasta;

    private java.lang.String notar_id;

    private java.math.BigInteger notar_nr;

    private java.math.BigInteger piirkond;

    private java.lang.String piirkond_tekstina;

    private java.lang.String olek;

    private java.lang.String olek_tekstina;

    public Detailandmed_v5_dokument() {
    }

    public Detailandmed_v5_dokument(
           java.math.BigInteger number,
           java.util.Date esitamise_kpv,
           java.lang.String dok_liik,
           java.lang.String dok_liik_tekstina,
           java.lang.String aasta,
           java.lang.String notar_id,
           java.math.BigInteger notar_nr,
           java.math.BigInteger piirkond,
           java.lang.String piirkond_tekstina,
           java.lang.String olek,
           java.lang.String olek_tekstina) {
           this.number = number;
           this.esitamise_kpv = esitamise_kpv;
           this.dok_liik = dok_liik;
           this.dok_liik_tekstina = dok_liik_tekstina;
           this.aasta = aasta;
           this.notar_id = notar_id;
           this.notar_nr = notar_nr;
           this.piirkond = piirkond;
           this.piirkond_tekstina = piirkond_tekstina;
           this.olek = olek;
           this.olek_tekstina = olek_tekstina;
    }


    /**
     * Gets the number value for this Detailandmed_v5_dokument.
     * 
     * @return number
     */
    public java.math.BigInteger getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Detailandmed_v5_dokument.
     * 
     * @param number
     */
    public void setNumber(java.math.BigInteger number) {
        this.number = number;
    }


    /**
     * Gets the esitamise_kpv value for this Detailandmed_v5_dokument.
     * 
     * @return esitamise_kpv
     */
    public java.util.Date getEsitamise_kpv() {
        return esitamise_kpv;
    }


    /**
     * Sets the esitamise_kpv value for this Detailandmed_v5_dokument.
     * 
     * @param esitamise_kpv
     */
    public void setEsitamise_kpv(java.util.Date esitamise_kpv) {
        this.esitamise_kpv = esitamise_kpv;
    }


    /**
     * Gets the dok_liik value for this Detailandmed_v5_dokument.
     * 
     * @return dok_liik
     */
    public java.lang.String getDok_liik() {
        return dok_liik;
    }


    /**
     * Sets the dok_liik value for this Detailandmed_v5_dokument.
     * 
     * @param dok_liik
     */
    public void setDok_liik(java.lang.String dok_liik) {
        this.dok_liik = dok_liik;
    }


    /**
     * Gets the dok_liik_tekstina value for this Detailandmed_v5_dokument.
     * 
     * @return dok_liik_tekstina
     */
    public java.lang.String getDok_liik_tekstina() {
        return dok_liik_tekstina;
    }


    /**
     * Sets the dok_liik_tekstina value for this Detailandmed_v5_dokument.
     * 
     * @param dok_liik_tekstina
     */
    public void setDok_liik_tekstina(java.lang.String dok_liik_tekstina) {
        this.dok_liik_tekstina = dok_liik_tekstina;
    }


    /**
     * Gets the aasta value for this Detailandmed_v5_dokument.
     * 
     * @return aasta
     */
    public java.lang.String getAasta() {
        return aasta;
    }


    /**
     * Sets the aasta value for this Detailandmed_v5_dokument.
     * 
     * @param aasta
     */
    public void setAasta(java.lang.String aasta) {
        this.aasta = aasta;
    }


    /**
     * Gets the notar_id value for this Detailandmed_v5_dokument.
     * 
     * @return notar_id
     */
    public java.lang.String getNotar_id() {
        return notar_id;
    }


    /**
     * Sets the notar_id value for this Detailandmed_v5_dokument.
     * 
     * @param notar_id
     */
    public void setNotar_id(java.lang.String notar_id) {
        this.notar_id = notar_id;
    }


    /**
     * Gets the notar_nr value for this Detailandmed_v5_dokument.
     * 
     * @return notar_nr
     */
    public java.math.BigInteger getNotar_nr() {
        return notar_nr;
    }


    /**
     * Sets the notar_nr value for this Detailandmed_v5_dokument.
     * 
     * @param notar_nr
     */
    public void setNotar_nr(java.math.BigInteger notar_nr) {
        this.notar_nr = notar_nr;
    }


    /**
     * Gets the piirkond value for this Detailandmed_v5_dokument.
     * 
     * @return piirkond
     */
    public java.math.BigInteger getPiirkond() {
        return piirkond;
    }


    /**
     * Sets the piirkond value for this Detailandmed_v5_dokument.
     * 
     * @param piirkond
     */
    public void setPiirkond(java.math.BigInteger piirkond) {
        this.piirkond = piirkond;
    }


    /**
     * Gets the piirkond_tekstina value for this Detailandmed_v5_dokument.
     * 
     * @return piirkond_tekstina
     */
    public java.lang.String getPiirkond_tekstina() {
        return piirkond_tekstina;
    }


    /**
     * Sets the piirkond_tekstina value for this Detailandmed_v5_dokument.
     * 
     * @param piirkond_tekstina
     */
    public void setPiirkond_tekstina(java.lang.String piirkond_tekstina) {
        this.piirkond_tekstina = piirkond_tekstina;
    }


    /**
     * Gets the olek value for this Detailandmed_v5_dokument.
     * 
     * @return olek
     */
    public java.lang.String getOlek() {
        return olek;
    }


    /**
     * Sets the olek value for this Detailandmed_v5_dokument.
     * 
     * @param olek
     */
    public void setOlek(java.lang.String olek) {
        this.olek = olek;
    }


    /**
     * Gets the olek_tekstina value for this Detailandmed_v5_dokument.
     * 
     * @return olek_tekstina
     */
    public java.lang.String getOlek_tekstina() {
        return olek_tekstina;
    }


    /**
     * Sets the olek_tekstina value for this Detailandmed_v5_dokument.
     * 
     * @param olek_tekstina
     */
    public void setOlek_tekstina(java.lang.String olek_tekstina) {
        this.olek_tekstina = olek_tekstina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_dokument)) return false;
        Detailandmed_v5_dokument other = (Detailandmed_v5_dokument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.esitamise_kpv==null && other.getEsitamise_kpv()==null) || 
             (this.esitamise_kpv!=null &&
              this.esitamise_kpv.equals(other.getEsitamise_kpv()))) &&
            ((this.dok_liik==null && other.getDok_liik()==null) || 
             (this.dok_liik!=null &&
              this.dok_liik.equals(other.getDok_liik()))) &&
            ((this.dok_liik_tekstina==null && other.getDok_liik_tekstina()==null) || 
             (this.dok_liik_tekstina!=null &&
              this.dok_liik_tekstina.equals(other.getDok_liik_tekstina()))) &&
            ((this.aasta==null && other.getAasta()==null) || 
             (this.aasta!=null &&
              this.aasta.equals(other.getAasta()))) &&
            ((this.notar_id==null && other.getNotar_id()==null) || 
             (this.notar_id!=null &&
              this.notar_id.equals(other.getNotar_id()))) &&
            ((this.notar_nr==null && other.getNotar_nr()==null) || 
             (this.notar_nr!=null &&
              this.notar_nr.equals(other.getNotar_nr()))) &&
            ((this.piirkond==null && other.getPiirkond()==null) || 
             (this.piirkond!=null &&
              this.piirkond.equals(other.getPiirkond()))) &&
            ((this.piirkond_tekstina==null && other.getPiirkond_tekstina()==null) || 
             (this.piirkond_tekstina!=null &&
              this.piirkond_tekstina.equals(other.getPiirkond_tekstina()))) &&
            ((this.olek==null && other.getOlek()==null) || 
             (this.olek!=null &&
              this.olek.equals(other.getOlek()))) &&
            ((this.olek_tekstina==null && other.getOlek_tekstina()==null) || 
             (this.olek_tekstina!=null &&
              this.olek_tekstina.equals(other.getOlek_tekstina())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getEsitamise_kpv() != null) {
            _hashCode += getEsitamise_kpv().hashCode();
        }
        if (getDok_liik() != null) {
            _hashCode += getDok_liik().hashCode();
        }
        if (getDok_liik_tekstina() != null) {
            _hashCode += getDok_liik_tekstina().hashCode();
        }
        if (getAasta() != null) {
            _hashCode += getAasta().hashCode();
        }
        if (getNotar_id() != null) {
            _hashCode += getNotar_id().hashCode();
        }
        if (getNotar_nr() != null) {
            _hashCode += getNotar_nr().hashCode();
        }
        if (getPiirkond() != null) {
            _hashCode += getPiirkond().hashCode();
        }
        if (getPiirkond_tekstina() != null) {
            _hashCode += getPiirkond_tekstina().hashCode();
        }
        if (getOlek() != null) {
            _hashCode += getOlek().hashCode();
        }
        if (getOlek_tekstina() != null) {
            _hashCode += getOlek_tekstina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
