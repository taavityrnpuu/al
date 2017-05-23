/**
 * Ettevotja_muudatus_kanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_kanne  implements java.io.Serializable {
    private java.lang.String ettevotja_id;

    private java.lang.Integer ettevotja_ariregistri_kood;

    private java.lang.String ettevotja_arinimi;

    private java.lang.String ettevotja_oiguslik_vorm;

    /* Ettevõtja piirkond */
    private java.lang.Integer ettevotja_piirkond;

    /* Piirkonna muutumisel uus piirkond */
    private java.lang.Integer ettevotja_uus_piirkond;

    /* Registrikaardi tüüp */
    private java.lang.String registrikaardi_tyyp;

    /* Registrikaardi number */
    private java.lang.Integer registrikaardi_nr;

    /* Kande ID */
    private java.lang.String kande_id;

    /* Kande number */
    private java.lang.Integer kande_nr;

    /* Kande kuupaev */
    private java.util.Date kande_kpv;

    /* Kande liik */
    private java.lang.Integer kande_liik;

    /* Kande liik tekstina */
    private java.lang.String kande_liik_tekst;

    /* Kande staatuse muutus */
    private java.lang.String kande_staatuse_muutus;

    /* Kandeelemendid */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement[] kandeelement;

    public Ettevotja_muudatus_kanne() {
    }

    public Ettevotja_muudatus_kanne(
           java.lang.String ettevotja_id,
           java.lang.Integer ettevotja_ariregistri_kood,
           java.lang.String ettevotja_arinimi,
           java.lang.String ettevotja_oiguslik_vorm,
           java.lang.Integer ettevotja_piirkond,
           java.lang.Integer ettevotja_uus_piirkond,
           java.lang.String registrikaardi_tyyp,
           java.lang.Integer registrikaardi_nr,
           java.lang.String kande_id,
           java.lang.Integer kande_nr,
           java.util.Date kande_kpv,
           java.lang.Integer kande_liik,
           java.lang.String kande_liik_tekst,
           java.lang.String kande_staatuse_muutus,
           eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement[] kandeelement) {
           this.ettevotja_id = ettevotja_id;
           this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
           this.ettevotja_arinimi = ettevotja_arinimi;
           this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
           this.ettevotja_piirkond = ettevotja_piirkond;
           this.ettevotja_uus_piirkond = ettevotja_uus_piirkond;
           this.registrikaardi_tyyp = registrikaardi_tyyp;
           this.registrikaardi_nr = registrikaardi_nr;
           this.kande_id = kande_id;
           this.kande_nr = kande_nr;
           this.kande_kpv = kande_kpv;
           this.kande_liik = kande_liik;
           this.kande_liik_tekst = kande_liik_tekst;
           this.kande_staatuse_muutus = kande_staatuse_muutus;
           this.kandeelement = kandeelement;
    }


    /**
     * Gets the ettevotja_id value for this Ettevotja_muudatus_kanne.
     * 
     * @return ettevotja_id
     */
    public java.lang.String getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Ettevotja_muudatus_kanne.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.lang.String ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_kanne.
     * 
     * @return ettevotja_ariregistri_kood
     */
    public java.lang.Integer getEttevotja_ariregistri_kood() {
        return ettevotja_ariregistri_kood;
    }


    /**
     * Sets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_kanne.
     * 
     * @param ettevotja_ariregistri_kood
     */
    public void setEttevotja_ariregistri_kood(java.lang.Integer ettevotja_ariregistri_kood) {
        this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
    }


    /**
     * Gets the ettevotja_arinimi value for this Ettevotja_muudatus_kanne.
     * 
     * @return ettevotja_arinimi
     */
    public java.lang.String getEttevotja_arinimi() {
        return ettevotja_arinimi;
    }


    /**
     * Sets the ettevotja_arinimi value for this Ettevotja_muudatus_kanne.
     * 
     * @param ettevotja_arinimi
     */
    public void setEttevotja_arinimi(java.lang.String ettevotja_arinimi) {
        this.ettevotja_arinimi = ettevotja_arinimi;
    }


    /**
     * Gets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_kanne.
     * 
     * @return ettevotja_oiguslik_vorm
     */
    public java.lang.String getEttevotja_oiguslik_vorm() {
        return ettevotja_oiguslik_vorm;
    }


    /**
     * Sets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_kanne.
     * 
     * @param ettevotja_oiguslik_vorm
     */
    public void setEttevotja_oiguslik_vorm(java.lang.String ettevotja_oiguslik_vorm) {
        this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
    }


    /**
     * Gets the ettevotja_piirkond value for this Ettevotja_muudatus_kanne.
     * 
     * @return ettevotja_piirkond   * Ettevõtja piirkond
     */
    public java.lang.Integer getEttevotja_piirkond() {
        return ettevotja_piirkond;
    }


    /**
     * Sets the ettevotja_piirkond value for this Ettevotja_muudatus_kanne.
     * 
     * @param ettevotja_piirkond   * Ettevõtja piirkond
     */
    public void setEttevotja_piirkond(java.lang.Integer ettevotja_piirkond) {
        this.ettevotja_piirkond = ettevotja_piirkond;
    }


    /**
     * Gets the ettevotja_uus_piirkond value for this Ettevotja_muudatus_kanne.
     * 
     * @return ettevotja_uus_piirkond   * Piirkonna muutumisel uus piirkond
     */
    public java.lang.Integer getEttevotja_uus_piirkond() {
        return ettevotja_uus_piirkond;
    }


    /**
     * Sets the ettevotja_uus_piirkond value for this Ettevotja_muudatus_kanne.
     * 
     * @param ettevotja_uus_piirkond   * Piirkonna muutumisel uus piirkond
     */
    public void setEttevotja_uus_piirkond(java.lang.Integer ettevotja_uus_piirkond) {
        this.ettevotja_uus_piirkond = ettevotja_uus_piirkond;
    }


    /**
     * Gets the registrikaardi_tyyp value for this Ettevotja_muudatus_kanne.
     * 
     * @return registrikaardi_tyyp   * Registrikaardi tüüp
     */
    public java.lang.String getRegistrikaardi_tyyp() {
        return registrikaardi_tyyp;
    }


    /**
     * Sets the registrikaardi_tyyp value for this Ettevotja_muudatus_kanne.
     * 
     * @param registrikaardi_tyyp   * Registrikaardi tüüp
     */
    public void setRegistrikaardi_tyyp(java.lang.String registrikaardi_tyyp) {
        this.registrikaardi_tyyp = registrikaardi_tyyp;
    }


    /**
     * Gets the registrikaardi_nr value for this Ettevotja_muudatus_kanne.
     * 
     * @return registrikaardi_nr   * Registrikaardi number
     */
    public java.lang.Integer getRegistrikaardi_nr() {
        return registrikaardi_nr;
    }


    /**
     * Sets the registrikaardi_nr value for this Ettevotja_muudatus_kanne.
     * 
     * @param registrikaardi_nr   * Registrikaardi number
     */
    public void setRegistrikaardi_nr(java.lang.Integer registrikaardi_nr) {
        this.registrikaardi_nr = registrikaardi_nr;
    }


    /**
     * Gets the kande_id value for this Ettevotja_muudatus_kanne.
     * 
     * @return kande_id   * Kande ID
     */
    public java.lang.String getKande_id() {
        return kande_id;
    }


    /**
     * Sets the kande_id value for this Ettevotja_muudatus_kanne.
     * 
     * @param kande_id   * Kande ID
     */
    public void setKande_id(java.lang.String kande_id) {
        this.kande_id = kande_id;
    }


    /**
     * Gets the kande_nr value for this Ettevotja_muudatus_kanne.
     * 
     * @return kande_nr   * Kande number
     */
    public java.lang.Integer getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Ettevotja_muudatus_kanne.
     * 
     * @param kande_nr   * Kande number
     */
    public void setKande_nr(java.lang.Integer kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the kande_kpv value for this Ettevotja_muudatus_kanne.
     * 
     * @return kande_kpv   * Kande kuupaev
     */
    public java.util.Date getKande_kpv() {
        return kande_kpv;
    }


    /**
     * Sets the kande_kpv value for this Ettevotja_muudatus_kanne.
     * 
     * @param kande_kpv   * Kande kuupaev
     */
    public void setKande_kpv(java.util.Date kande_kpv) {
        this.kande_kpv = kande_kpv;
    }


    /**
     * Gets the kande_liik value for this Ettevotja_muudatus_kanne.
     * 
     * @return kande_liik   * Kande liik
     */
    public java.lang.Integer getKande_liik() {
        return kande_liik;
    }


    /**
     * Sets the kande_liik value for this Ettevotja_muudatus_kanne.
     * 
     * @param kande_liik   * Kande liik
     */
    public void setKande_liik(java.lang.Integer kande_liik) {
        this.kande_liik = kande_liik;
    }


    /**
     * Gets the kande_liik_tekst value for this Ettevotja_muudatus_kanne.
     * 
     * @return kande_liik_tekst   * Kande liik tekstina
     */
    public java.lang.String getKande_liik_tekst() {
        return kande_liik_tekst;
    }


    /**
     * Sets the kande_liik_tekst value for this Ettevotja_muudatus_kanne.
     * 
     * @param kande_liik_tekst   * Kande liik tekstina
     */
    public void setKande_liik_tekst(java.lang.String kande_liik_tekst) {
        this.kande_liik_tekst = kande_liik_tekst;
    }


    /**
     * Gets the kande_staatuse_muutus value for this Ettevotja_muudatus_kanne.
     * 
     * @return kande_staatuse_muutus   * Kande staatuse muutus
     */
    public java.lang.String getKande_staatuse_muutus() {
        return kande_staatuse_muutus;
    }


    /**
     * Sets the kande_staatuse_muutus value for this Ettevotja_muudatus_kanne.
     * 
     * @param kande_staatuse_muutus   * Kande staatuse muutus
     */
    public void setKande_staatuse_muutus(java.lang.String kande_staatuse_muutus) {
        this.kande_staatuse_muutus = kande_staatuse_muutus;
    }


    /**
     * Gets the kandeelement value for this Ettevotja_muudatus_kanne.
     * 
     * @return kandeelement   * Kandeelemendid
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement[] getKandeelement() {
        return kandeelement;
    }


    /**
     * Sets the kandeelement value for this Ettevotja_muudatus_kanne.
     * 
     * @param kandeelement   * Kandeelemendid
     */
    public void setKandeelement(eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement[] kandeelement) {
        this.kandeelement = kandeelement;
    }

    public eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement getKandeelement(int i) {
        return this.kandeelement[i];
    }

    public void setKandeelement(int i, eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement _value) {
        this.kandeelement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_kanne)) return false;
        Ettevotja_muudatus_kanne other = (Ettevotja_muudatus_kanne) obj;
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
            ((this.ettevotja_piirkond==null && other.getEttevotja_piirkond()==null) || 
             (this.ettevotja_piirkond!=null &&
              this.ettevotja_piirkond.equals(other.getEttevotja_piirkond()))) &&
            ((this.ettevotja_uus_piirkond==null && other.getEttevotja_uus_piirkond()==null) || 
             (this.ettevotja_uus_piirkond!=null &&
              this.ettevotja_uus_piirkond.equals(other.getEttevotja_uus_piirkond()))) &&
            ((this.registrikaardi_tyyp==null && other.getRegistrikaardi_tyyp()==null) || 
             (this.registrikaardi_tyyp!=null &&
              this.registrikaardi_tyyp.equals(other.getRegistrikaardi_tyyp()))) &&
            ((this.registrikaardi_nr==null && other.getRegistrikaardi_nr()==null) || 
             (this.registrikaardi_nr!=null &&
              this.registrikaardi_nr.equals(other.getRegistrikaardi_nr()))) &&
            ((this.kande_id==null && other.getKande_id()==null) || 
             (this.kande_id!=null &&
              this.kande_id.equals(other.getKande_id()))) &&
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.kande_kpv==null && other.getKande_kpv()==null) || 
             (this.kande_kpv!=null &&
              this.kande_kpv.equals(other.getKande_kpv()))) &&
            ((this.kande_liik==null && other.getKande_liik()==null) || 
             (this.kande_liik!=null &&
              this.kande_liik.equals(other.getKande_liik()))) &&
            ((this.kande_liik_tekst==null && other.getKande_liik_tekst()==null) || 
             (this.kande_liik_tekst!=null &&
              this.kande_liik_tekst.equals(other.getKande_liik_tekst()))) &&
            ((this.kande_staatuse_muutus==null && other.getKande_staatuse_muutus()==null) || 
             (this.kande_staatuse_muutus!=null &&
              this.kande_staatuse_muutus.equals(other.getKande_staatuse_muutus()))) &&
            ((this.kandeelement==null && other.getKandeelement()==null) || 
             (this.kandeelement!=null &&
              java.util.Arrays.equals(this.kandeelement, other.getKandeelement())));
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
        if (getEttevotja_piirkond() != null) {
            _hashCode += getEttevotja_piirkond().hashCode();
        }
        if (getEttevotja_uus_piirkond() != null) {
            _hashCode += getEttevotja_uus_piirkond().hashCode();
        }
        if (getRegistrikaardi_tyyp() != null) {
            _hashCode += getRegistrikaardi_tyyp().hashCode();
        }
        if (getRegistrikaardi_nr() != null) {
            _hashCode += getRegistrikaardi_nr().hashCode();
        }
        if (getKande_id() != null) {
            _hashCode += getKande_id().hashCode();
        }
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getKande_kpv() != null) {
            _hashCode += getKande_kpv().hashCode();
        }
        if (getKande_liik() != null) {
            _hashCode += getKande_liik().hashCode();
        }
        if (getKande_liik_tekst() != null) {
            _hashCode += getKande_liik_tekst().hashCode();
        }
        if (getKande_staatuse_muutus() != null) {
            _hashCode += getKande_staatuse_muutus().hashCode();
        }
        if (getKandeelement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKandeelement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKandeelement(), i);
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
