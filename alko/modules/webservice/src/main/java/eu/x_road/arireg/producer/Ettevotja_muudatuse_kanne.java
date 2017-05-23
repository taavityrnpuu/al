/**
 * Ettevotja_muudatuse_kanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatuse_kanne  implements java.io.Serializable {
    /* Registrikaardile märgitud piirkond */
    private java.lang.Integer registrikaardi_piirkond;

    /* Registrikaardi tüüp */
    private java.lang.String registrikaardi_tyyp;

    /* Registrikaardi number */
    private java.lang.Integer registrikaardi_nr;

    /* Kande number */
    private java.lang.Integer kande_nr;

    /* Kande kuupaev */
    private java.util.Date kande_kuupaev;

    /* Kande liik */
    private java.lang.Integer kande_liik;

    /* Kande liik tekstina */
    private java.lang.String kande_liik_tekst;

    /* Isikuandmed */
    private java.lang.String isikuandmed;

    public Ettevotja_muudatuse_kanne() {
    }

    public Ettevotja_muudatuse_kanne(
           java.lang.Integer registrikaardi_piirkond,
           java.lang.String registrikaardi_tyyp,
           java.lang.Integer registrikaardi_nr,
           java.lang.Integer kande_nr,
           java.util.Date kande_kuupaev,
           java.lang.Integer kande_liik,
           java.lang.String kande_liik_tekst,
           java.lang.String isikuandmed) {
           this.registrikaardi_piirkond = registrikaardi_piirkond;
           this.registrikaardi_tyyp = registrikaardi_tyyp;
           this.registrikaardi_nr = registrikaardi_nr;
           this.kande_nr = kande_nr;
           this.kande_kuupaev = kande_kuupaev;
           this.kande_liik = kande_liik;
           this.kande_liik_tekst = kande_liik_tekst;
           this.isikuandmed = isikuandmed;
    }


    /**
     * Gets the registrikaardi_piirkond value for this Ettevotja_muudatuse_kanne.
     * 
     * @return registrikaardi_piirkond   * Registrikaardile märgitud piirkond
     */
    public java.lang.Integer getRegistrikaardi_piirkond() {
        return registrikaardi_piirkond;
    }


    /**
     * Sets the registrikaardi_piirkond value for this Ettevotja_muudatuse_kanne.
     * 
     * @param registrikaardi_piirkond   * Registrikaardile märgitud piirkond
     */
    public void setRegistrikaardi_piirkond(java.lang.Integer registrikaardi_piirkond) {
        this.registrikaardi_piirkond = registrikaardi_piirkond;
    }


    /**
     * Gets the registrikaardi_tyyp value for this Ettevotja_muudatuse_kanne.
     * 
     * @return registrikaardi_tyyp   * Registrikaardi tüüp
     */
    public java.lang.String getRegistrikaardi_tyyp() {
        return registrikaardi_tyyp;
    }


    /**
     * Sets the registrikaardi_tyyp value for this Ettevotja_muudatuse_kanne.
     * 
     * @param registrikaardi_tyyp   * Registrikaardi tüüp
     */
    public void setRegistrikaardi_tyyp(java.lang.String registrikaardi_tyyp) {
        this.registrikaardi_tyyp = registrikaardi_tyyp;
    }


    /**
     * Gets the registrikaardi_nr value for this Ettevotja_muudatuse_kanne.
     * 
     * @return registrikaardi_nr   * Registrikaardi number
     */
    public java.lang.Integer getRegistrikaardi_nr() {
        return registrikaardi_nr;
    }


    /**
     * Sets the registrikaardi_nr value for this Ettevotja_muudatuse_kanne.
     * 
     * @param registrikaardi_nr   * Registrikaardi number
     */
    public void setRegistrikaardi_nr(java.lang.Integer registrikaardi_nr) {
        this.registrikaardi_nr = registrikaardi_nr;
    }


    /**
     * Gets the kande_nr value for this Ettevotja_muudatuse_kanne.
     * 
     * @return kande_nr   * Kande number
     */
    public java.lang.Integer getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Ettevotja_muudatuse_kanne.
     * 
     * @param kande_nr   * Kande number
     */
    public void setKande_nr(java.lang.Integer kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the kande_kuupaev value for this Ettevotja_muudatuse_kanne.
     * 
     * @return kande_kuupaev   * Kande kuupaev
     */
    public java.util.Date getKande_kuupaev() {
        return kande_kuupaev;
    }


    /**
     * Sets the kande_kuupaev value for this Ettevotja_muudatuse_kanne.
     * 
     * @param kande_kuupaev   * Kande kuupaev
     */
    public void setKande_kuupaev(java.util.Date kande_kuupaev) {
        this.kande_kuupaev = kande_kuupaev;
    }


    /**
     * Gets the kande_liik value for this Ettevotja_muudatuse_kanne.
     * 
     * @return kande_liik   * Kande liik
     */
    public java.lang.Integer getKande_liik() {
        return kande_liik;
    }


    /**
     * Sets the kande_liik value for this Ettevotja_muudatuse_kanne.
     * 
     * @param kande_liik   * Kande liik
     */
    public void setKande_liik(java.lang.Integer kande_liik) {
        this.kande_liik = kande_liik;
    }


    /**
     * Gets the kande_liik_tekst value for this Ettevotja_muudatuse_kanne.
     * 
     * @return kande_liik_tekst   * Kande liik tekstina
     */
    public java.lang.String getKande_liik_tekst() {
        return kande_liik_tekst;
    }


    /**
     * Sets the kande_liik_tekst value for this Ettevotja_muudatuse_kanne.
     * 
     * @param kande_liik_tekst   * Kande liik tekstina
     */
    public void setKande_liik_tekst(java.lang.String kande_liik_tekst) {
        this.kande_liik_tekst = kande_liik_tekst;
    }


    /**
     * Gets the isikuandmed value for this Ettevotja_muudatuse_kanne.
     * 
     * @return isikuandmed   * Isikuandmed
     */
    public java.lang.String getIsikuandmed() {
        return isikuandmed;
    }


    /**
     * Sets the isikuandmed value for this Ettevotja_muudatuse_kanne.
     * 
     * @param isikuandmed   * Isikuandmed
     */
    public void setIsikuandmed(java.lang.String isikuandmed) {
        this.isikuandmed = isikuandmed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatuse_kanne)) return false;
        Ettevotja_muudatuse_kanne other = (Ettevotja_muudatuse_kanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikaardi_piirkond==null && other.getRegistrikaardi_piirkond()==null) || 
             (this.registrikaardi_piirkond!=null &&
              this.registrikaardi_piirkond.equals(other.getRegistrikaardi_piirkond()))) &&
            ((this.registrikaardi_tyyp==null && other.getRegistrikaardi_tyyp()==null) || 
             (this.registrikaardi_tyyp!=null &&
              this.registrikaardi_tyyp.equals(other.getRegistrikaardi_tyyp()))) &&
            ((this.registrikaardi_nr==null && other.getRegistrikaardi_nr()==null) || 
             (this.registrikaardi_nr!=null &&
              this.registrikaardi_nr.equals(other.getRegistrikaardi_nr()))) &&
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.kande_kuupaev==null && other.getKande_kuupaev()==null) || 
             (this.kande_kuupaev!=null &&
              this.kande_kuupaev.equals(other.getKande_kuupaev()))) &&
            ((this.kande_liik==null && other.getKande_liik()==null) || 
             (this.kande_liik!=null &&
              this.kande_liik.equals(other.getKande_liik()))) &&
            ((this.kande_liik_tekst==null && other.getKande_liik_tekst()==null) || 
             (this.kande_liik_tekst!=null &&
              this.kande_liik_tekst.equals(other.getKande_liik_tekst()))) &&
            ((this.isikuandmed==null && other.getIsikuandmed()==null) || 
             (this.isikuandmed!=null &&
              this.isikuandmed.equals(other.getIsikuandmed())));
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
        if (getRegistrikaardi_piirkond() != null) {
            _hashCode += getRegistrikaardi_piirkond().hashCode();
        }
        if (getRegistrikaardi_tyyp() != null) {
            _hashCode += getRegistrikaardi_tyyp().hashCode();
        }
        if (getRegistrikaardi_nr() != null) {
            _hashCode += getRegistrikaardi_nr().hashCode();
        }
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getKande_kuupaev() != null) {
            _hashCode += getKande_kuupaev().hashCode();
        }
        if (getKande_liik() != null) {
            _hashCode += getKande_liik().hashCode();
        }
        if (getKande_liik_tekst() != null) {
            _hashCode += getKande_liik_tekst().hashCode();
        }
        if (getIsikuandmed() != null) {
            _hashCode += getIsikuandmed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
