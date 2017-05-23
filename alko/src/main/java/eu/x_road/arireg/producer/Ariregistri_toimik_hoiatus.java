/**
 * Ariregistri_toimik_hoiatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ariregistri_toimik_hoiatus  implements java.io.Serializable {
    /* Hoiatuse number */
    private java.lang.String hoiatuse_number;

    /* Hoiatuse kuupäev. */
    private java.util.Date hoiatuse_kpv;

    /* Hoiatuse liik */
    private java.lang.String hoiatuse_liik;

    /* Hoiatuse liik lokaliseeritud tekstina */
    private java.lang.String hoiatuse_liik_tekstina;

    /* Hoiatuse olek */
    private java.lang.String hoiatuse_olek;

    /* Hoiatuse olek lokaliseeritud tekstina */
    private java.lang.String hoiatuse_olek_tekstina;

    /* Puuduste kõrvaldamise tähtaeg */
    private java.util.Date tahtaeg;

    /* Menetleja ID */
    private java.lang.Integer menetleja_id;

    /* Menetleja nimi */
    private java.lang.String menetleja_nimi;

    /* Hoiatuse tekst */
    private java.lang.String hoiatuse_tekst;

    public Ariregistri_toimik_hoiatus() {
    }

    public Ariregistri_toimik_hoiatus(
           java.lang.String hoiatuse_number,
           java.util.Date hoiatuse_kpv,
           java.lang.String hoiatuse_liik,
           java.lang.String hoiatuse_liik_tekstina,
           java.lang.String hoiatuse_olek,
           java.lang.String hoiatuse_olek_tekstina,
           java.util.Date tahtaeg,
           java.lang.Integer menetleja_id,
           java.lang.String menetleja_nimi,
           java.lang.String hoiatuse_tekst) {
           this.hoiatuse_number = hoiatuse_number;
           this.hoiatuse_kpv = hoiatuse_kpv;
           this.hoiatuse_liik = hoiatuse_liik;
           this.hoiatuse_liik_tekstina = hoiatuse_liik_tekstina;
           this.hoiatuse_olek = hoiatuse_olek;
           this.hoiatuse_olek_tekstina = hoiatuse_olek_tekstina;
           this.tahtaeg = tahtaeg;
           this.menetleja_id = menetleja_id;
           this.menetleja_nimi = menetleja_nimi;
           this.hoiatuse_tekst = hoiatuse_tekst;
    }


    /**
     * Gets the hoiatuse_number value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_number   * Hoiatuse number
     */
    public java.lang.String getHoiatuse_number() {
        return hoiatuse_number;
    }


    /**
     * Sets the hoiatuse_number value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_number   * Hoiatuse number
     */
    public void setHoiatuse_number(java.lang.String hoiatuse_number) {
        this.hoiatuse_number = hoiatuse_number;
    }


    /**
     * Gets the hoiatuse_kpv value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_kpv   * Hoiatuse kuupäev.
     */
    public java.util.Date getHoiatuse_kpv() {
        return hoiatuse_kpv;
    }


    /**
     * Sets the hoiatuse_kpv value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_kpv   * Hoiatuse kuupäev.
     */
    public void setHoiatuse_kpv(java.util.Date hoiatuse_kpv) {
        this.hoiatuse_kpv = hoiatuse_kpv;
    }


    /**
     * Gets the hoiatuse_liik value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_liik   * Hoiatuse liik
     */
    public java.lang.String getHoiatuse_liik() {
        return hoiatuse_liik;
    }


    /**
     * Sets the hoiatuse_liik value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_liik   * Hoiatuse liik
     */
    public void setHoiatuse_liik(java.lang.String hoiatuse_liik) {
        this.hoiatuse_liik = hoiatuse_liik;
    }


    /**
     * Gets the hoiatuse_liik_tekstina value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_liik_tekstina   * Hoiatuse liik lokaliseeritud tekstina
     */
    public java.lang.String getHoiatuse_liik_tekstina() {
        return hoiatuse_liik_tekstina;
    }


    /**
     * Sets the hoiatuse_liik_tekstina value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_liik_tekstina   * Hoiatuse liik lokaliseeritud tekstina
     */
    public void setHoiatuse_liik_tekstina(java.lang.String hoiatuse_liik_tekstina) {
        this.hoiatuse_liik_tekstina = hoiatuse_liik_tekstina;
    }


    /**
     * Gets the hoiatuse_olek value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_olek   * Hoiatuse olek
     */
    public java.lang.String getHoiatuse_olek() {
        return hoiatuse_olek;
    }


    /**
     * Sets the hoiatuse_olek value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_olek   * Hoiatuse olek
     */
    public void setHoiatuse_olek(java.lang.String hoiatuse_olek) {
        this.hoiatuse_olek = hoiatuse_olek;
    }


    /**
     * Gets the hoiatuse_olek_tekstina value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_olek_tekstina   * Hoiatuse olek lokaliseeritud tekstina
     */
    public java.lang.String getHoiatuse_olek_tekstina() {
        return hoiatuse_olek_tekstina;
    }


    /**
     * Sets the hoiatuse_olek_tekstina value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_olek_tekstina   * Hoiatuse olek lokaliseeritud tekstina
     */
    public void setHoiatuse_olek_tekstina(java.lang.String hoiatuse_olek_tekstina) {
        this.hoiatuse_olek_tekstina = hoiatuse_olek_tekstina;
    }


    /**
     * Gets the tahtaeg value for this Ariregistri_toimik_hoiatus.
     * 
     * @return tahtaeg   * Puuduste kõrvaldamise tähtaeg
     */
    public java.util.Date getTahtaeg() {
        return tahtaeg;
    }


    /**
     * Sets the tahtaeg value for this Ariregistri_toimik_hoiatus.
     * 
     * @param tahtaeg   * Puuduste kõrvaldamise tähtaeg
     */
    public void setTahtaeg(java.util.Date tahtaeg) {
        this.tahtaeg = tahtaeg;
    }


    /**
     * Gets the menetleja_id value for this Ariregistri_toimik_hoiatus.
     * 
     * @return menetleja_id   * Menetleja ID
     */
    public java.lang.Integer getMenetleja_id() {
        return menetleja_id;
    }


    /**
     * Sets the menetleja_id value for this Ariregistri_toimik_hoiatus.
     * 
     * @param menetleja_id   * Menetleja ID
     */
    public void setMenetleja_id(java.lang.Integer menetleja_id) {
        this.menetleja_id = menetleja_id;
    }


    /**
     * Gets the menetleja_nimi value for this Ariregistri_toimik_hoiatus.
     * 
     * @return menetleja_nimi   * Menetleja nimi
     */
    public java.lang.String getMenetleja_nimi() {
        return menetleja_nimi;
    }


    /**
     * Sets the menetleja_nimi value for this Ariregistri_toimik_hoiatus.
     * 
     * @param menetleja_nimi   * Menetleja nimi
     */
    public void setMenetleja_nimi(java.lang.String menetleja_nimi) {
        this.menetleja_nimi = menetleja_nimi;
    }


    /**
     * Gets the hoiatuse_tekst value for this Ariregistri_toimik_hoiatus.
     * 
     * @return hoiatuse_tekst   * Hoiatuse tekst
     */
    public java.lang.String getHoiatuse_tekst() {
        return hoiatuse_tekst;
    }


    /**
     * Sets the hoiatuse_tekst value for this Ariregistri_toimik_hoiatus.
     * 
     * @param hoiatuse_tekst   * Hoiatuse tekst
     */
    public void setHoiatuse_tekst(java.lang.String hoiatuse_tekst) {
        this.hoiatuse_tekst = hoiatuse_tekst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ariregistri_toimik_hoiatus)) return false;
        Ariregistri_toimik_hoiatus other = (Ariregistri_toimik_hoiatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hoiatuse_number==null && other.getHoiatuse_number()==null) || 
             (this.hoiatuse_number!=null &&
              this.hoiatuse_number.equals(other.getHoiatuse_number()))) &&
            ((this.hoiatuse_kpv==null && other.getHoiatuse_kpv()==null) || 
             (this.hoiatuse_kpv!=null &&
              this.hoiatuse_kpv.equals(other.getHoiatuse_kpv()))) &&
            ((this.hoiatuse_liik==null && other.getHoiatuse_liik()==null) || 
             (this.hoiatuse_liik!=null &&
              this.hoiatuse_liik.equals(other.getHoiatuse_liik()))) &&
            ((this.hoiatuse_liik_tekstina==null && other.getHoiatuse_liik_tekstina()==null) || 
             (this.hoiatuse_liik_tekstina!=null &&
              this.hoiatuse_liik_tekstina.equals(other.getHoiatuse_liik_tekstina()))) &&
            ((this.hoiatuse_olek==null && other.getHoiatuse_olek()==null) || 
             (this.hoiatuse_olek!=null &&
              this.hoiatuse_olek.equals(other.getHoiatuse_olek()))) &&
            ((this.hoiatuse_olek_tekstina==null && other.getHoiatuse_olek_tekstina()==null) || 
             (this.hoiatuse_olek_tekstina!=null &&
              this.hoiatuse_olek_tekstina.equals(other.getHoiatuse_olek_tekstina()))) &&
            ((this.tahtaeg==null && other.getTahtaeg()==null) || 
             (this.tahtaeg!=null &&
              this.tahtaeg.equals(other.getTahtaeg()))) &&
            ((this.menetleja_id==null && other.getMenetleja_id()==null) || 
             (this.menetleja_id!=null &&
              this.menetleja_id.equals(other.getMenetleja_id()))) &&
            ((this.menetleja_nimi==null && other.getMenetleja_nimi()==null) || 
             (this.menetleja_nimi!=null &&
              this.menetleja_nimi.equals(other.getMenetleja_nimi()))) &&
            ((this.hoiatuse_tekst==null && other.getHoiatuse_tekst()==null) || 
             (this.hoiatuse_tekst!=null &&
              this.hoiatuse_tekst.equals(other.getHoiatuse_tekst())));
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
        if (getHoiatuse_number() != null) {
            _hashCode += getHoiatuse_number().hashCode();
        }
        if (getHoiatuse_kpv() != null) {
            _hashCode += getHoiatuse_kpv().hashCode();
        }
        if (getHoiatuse_liik() != null) {
            _hashCode += getHoiatuse_liik().hashCode();
        }
        if (getHoiatuse_liik_tekstina() != null) {
            _hashCode += getHoiatuse_liik_tekstina().hashCode();
        }
        if (getHoiatuse_olek() != null) {
            _hashCode += getHoiatuse_olek().hashCode();
        }
        if (getHoiatuse_olek_tekstina() != null) {
            _hashCode += getHoiatuse_olek_tekstina().hashCode();
        }
        if (getTahtaeg() != null) {
            _hashCode += getTahtaeg().hashCode();
        }
        if (getMenetleja_id() != null) {
            _hashCode += getMenetleja_id().hashCode();
        }
        if (getMenetleja_nimi() != null) {
            _hashCode += getMenetleja_nimi().hashCode();
        }
        if (getHoiatuse_tekst() != null) {
            _hashCode += getHoiatuse_tekst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
