/**
 * Ettevotja_muudatus_tootukassa_kandeelement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_tootukassa_kandeelement  implements java.io.Serializable {
    /* Kandeelemendi ID */
    private java.lang.Integer kandeelemendi_id;

    /* Kandeelemendi liik */
    private java.lang.String kandeelemendi_liik;

    /* Kandeelemendi kehtivus */
    private java.lang.String kandeelemendi_kehtivus;

    /* Tühistatava kande ID */
    private java.lang.String tyhistatava_kande_id;

    /* Kandeelemendi kehtivuse alguskuupaev */
    private java.util.Date algus_kuupaev;

    /* Kandeelemendi kehtivuse lõppkuupäev */
    private java.util.Date lopp_kuupaev;

    /* Füüsilise isiku liik */
    private java.lang.String isiku_liik;

    /* Füüsilise isiku eesnimi */
    private java.lang.String eesnimi;

    /* Füüsilise isiku perekonnanimi või ärinimi */
    private java.lang.String nimi_arinimi;

    private java.lang.String isikukood_registrikood;

    private java.lang.String isiku_valis_kood;

    private java.lang.String valis_kood_riik;

    private java.util.Date synniaeg;

    public Ettevotja_muudatus_tootukassa_kandeelement() {
    }

    public Ettevotja_muudatus_tootukassa_kandeelement(
           java.lang.Integer kandeelemendi_id,
           java.lang.String kandeelemendi_liik,
           java.lang.String kandeelemendi_kehtivus,
           java.lang.String tyhistatava_kande_id,
           java.util.Date algus_kuupaev,
           java.util.Date lopp_kuupaev,
           java.lang.String isiku_liik,
           java.lang.String eesnimi,
           java.lang.String nimi_arinimi,
           java.lang.String isikukood_registrikood,
           java.lang.String isiku_valis_kood,
           java.lang.String valis_kood_riik,
           java.util.Date synniaeg) {
           this.kandeelemendi_id = kandeelemendi_id;
           this.kandeelemendi_liik = kandeelemendi_liik;
           this.kandeelemendi_kehtivus = kandeelemendi_kehtivus;
           this.tyhistatava_kande_id = tyhistatava_kande_id;
           this.algus_kuupaev = algus_kuupaev;
           this.lopp_kuupaev = lopp_kuupaev;
           this.isiku_liik = isiku_liik;
           this.eesnimi = eesnimi;
           this.nimi_arinimi = nimi_arinimi;
           this.isikukood_registrikood = isikukood_registrikood;
           this.isiku_valis_kood = isiku_valis_kood;
           this.valis_kood_riik = valis_kood_riik;
           this.synniaeg = synniaeg;
    }


    /**
     * Gets the kandeelemendi_id value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return kandeelemendi_id   * Kandeelemendi ID
     */
    public java.lang.Integer getKandeelemendi_id() {
        return kandeelemendi_id;
    }


    /**
     * Sets the kandeelemendi_id value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param kandeelemendi_id   * Kandeelemendi ID
     */
    public void setKandeelemendi_id(java.lang.Integer kandeelemendi_id) {
        this.kandeelemendi_id = kandeelemendi_id;
    }


    /**
     * Gets the kandeelemendi_liik value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return kandeelemendi_liik   * Kandeelemendi liik
     */
    public java.lang.String getKandeelemendi_liik() {
        return kandeelemendi_liik;
    }


    /**
     * Sets the kandeelemendi_liik value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param kandeelemendi_liik   * Kandeelemendi liik
     */
    public void setKandeelemendi_liik(java.lang.String kandeelemendi_liik) {
        this.kandeelemendi_liik = kandeelemendi_liik;
    }


    /**
     * Gets the kandeelemendi_kehtivus value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return kandeelemendi_kehtivus   * Kandeelemendi kehtivus
     */
    public java.lang.String getKandeelemendi_kehtivus() {
        return kandeelemendi_kehtivus;
    }


    /**
     * Sets the kandeelemendi_kehtivus value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param kandeelemendi_kehtivus   * Kandeelemendi kehtivus
     */
    public void setKandeelemendi_kehtivus(java.lang.String kandeelemendi_kehtivus) {
        this.kandeelemendi_kehtivus = kandeelemendi_kehtivus;
    }


    /**
     * Gets the tyhistatava_kande_id value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return tyhistatava_kande_id   * Tühistatava kande ID
     */
    public java.lang.String getTyhistatava_kande_id() {
        return tyhistatava_kande_id;
    }


    /**
     * Sets the tyhistatava_kande_id value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param tyhistatava_kande_id   * Tühistatava kande ID
     */
    public void setTyhistatava_kande_id(java.lang.String tyhistatava_kande_id) {
        this.tyhistatava_kande_id = tyhistatava_kande_id;
    }


    /**
     * Gets the algus_kuupaev value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return algus_kuupaev   * Kandeelemendi kehtivuse alguskuupaev
     */
    public java.util.Date getAlgus_kuupaev() {
        return algus_kuupaev;
    }


    /**
     * Sets the algus_kuupaev value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param algus_kuupaev   * Kandeelemendi kehtivuse alguskuupaev
     */
    public void setAlgus_kuupaev(java.util.Date algus_kuupaev) {
        this.algus_kuupaev = algus_kuupaev;
    }


    /**
     * Gets the lopp_kuupaev value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return lopp_kuupaev   * Kandeelemendi kehtivuse lõppkuupäev
     */
    public java.util.Date getLopp_kuupaev() {
        return lopp_kuupaev;
    }


    /**
     * Sets the lopp_kuupaev value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param lopp_kuupaev   * Kandeelemendi kehtivuse lõppkuupäev
     */
    public void setLopp_kuupaev(java.util.Date lopp_kuupaev) {
        this.lopp_kuupaev = lopp_kuupaev;
    }


    /**
     * Gets the isiku_liik value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return isiku_liik   * Füüsilise isiku liik
     */
    public java.lang.String getIsiku_liik() {
        return isiku_liik;
    }


    /**
     * Sets the isiku_liik value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param isiku_liik   * Füüsilise isiku liik
     */
    public void setIsiku_liik(java.lang.String isiku_liik) {
        this.isiku_liik = isiku_liik;
    }


    /**
     * Gets the eesnimi value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return eesnimi   * Füüsilise isiku eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param eesnimi   * Füüsilise isiku eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the nimi_arinimi value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return nimi_arinimi   * Füüsilise isiku perekonnanimi või ärinimi
     */
    public java.lang.String getNimi_arinimi() {
        return nimi_arinimi;
    }


    /**
     * Sets the nimi_arinimi value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param nimi_arinimi   * Füüsilise isiku perekonnanimi või ärinimi
     */
    public void setNimi_arinimi(java.lang.String nimi_arinimi) {
        this.nimi_arinimi = nimi_arinimi;
    }


    /**
     * Gets the isikukood_registrikood value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return isikukood_registrikood
     */
    public java.lang.String getIsikukood_registrikood() {
        return isikukood_registrikood;
    }


    /**
     * Sets the isikukood_registrikood value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param isikukood_registrikood
     */
    public void setIsikukood_registrikood(java.lang.String isikukood_registrikood) {
        this.isikukood_registrikood = isikukood_registrikood;
    }


    /**
     * Gets the isiku_valis_kood value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return isiku_valis_kood
     */
    public java.lang.String getIsiku_valis_kood() {
        return isiku_valis_kood;
    }


    /**
     * Sets the isiku_valis_kood value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param isiku_valis_kood
     */
    public void setIsiku_valis_kood(java.lang.String isiku_valis_kood) {
        this.isiku_valis_kood = isiku_valis_kood;
    }


    /**
     * Gets the valis_kood_riik value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return valis_kood_riik
     */
    public java.lang.String getValis_kood_riik() {
        return valis_kood_riik;
    }


    /**
     * Sets the valis_kood_riik value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param valis_kood_riik
     */
    public void setValis_kood_riik(java.lang.String valis_kood_riik) {
        this.valis_kood_riik = valis_kood_riik;
    }


    /**
     * Gets the synniaeg value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @return synniaeg
     */
    public java.util.Date getSynniaeg() {
        return synniaeg;
    }


    /**
     * Sets the synniaeg value for this Ettevotja_muudatus_tootukassa_kandeelement.
     * 
     * @param synniaeg
     */
    public void setSynniaeg(java.util.Date synniaeg) {
        this.synniaeg = synniaeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_tootukassa_kandeelement)) return false;
        Ettevotja_muudatus_tootukassa_kandeelement other = (Ettevotja_muudatus_tootukassa_kandeelement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kandeelemendi_id==null && other.getKandeelemendi_id()==null) || 
             (this.kandeelemendi_id!=null &&
              this.kandeelemendi_id.equals(other.getKandeelemendi_id()))) &&
            ((this.kandeelemendi_liik==null && other.getKandeelemendi_liik()==null) || 
             (this.kandeelemendi_liik!=null &&
              this.kandeelemendi_liik.equals(other.getKandeelemendi_liik()))) &&
            ((this.kandeelemendi_kehtivus==null && other.getKandeelemendi_kehtivus()==null) || 
             (this.kandeelemendi_kehtivus!=null &&
              this.kandeelemendi_kehtivus.equals(other.getKandeelemendi_kehtivus()))) &&
            ((this.tyhistatava_kande_id==null && other.getTyhistatava_kande_id()==null) || 
             (this.tyhistatava_kande_id!=null &&
              this.tyhistatava_kande_id.equals(other.getTyhistatava_kande_id()))) &&
            ((this.algus_kuupaev==null && other.getAlgus_kuupaev()==null) || 
             (this.algus_kuupaev!=null &&
              this.algus_kuupaev.equals(other.getAlgus_kuupaev()))) &&
            ((this.lopp_kuupaev==null && other.getLopp_kuupaev()==null) || 
             (this.lopp_kuupaev!=null &&
              this.lopp_kuupaev.equals(other.getLopp_kuupaev()))) &&
            ((this.isiku_liik==null && other.getIsiku_liik()==null) || 
             (this.isiku_liik!=null &&
              this.isiku_liik.equals(other.getIsiku_liik()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.nimi_arinimi==null && other.getNimi_arinimi()==null) || 
             (this.nimi_arinimi!=null &&
              this.nimi_arinimi.equals(other.getNimi_arinimi()))) &&
            ((this.isikukood_registrikood==null && other.getIsikukood_registrikood()==null) || 
             (this.isikukood_registrikood!=null &&
              this.isikukood_registrikood.equals(other.getIsikukood_registrikood()))) &&
            ((this.isiku_valis_kood==null && other.getIsiku_valis_kood()==null) || 
             (this.isiku_valis_kood!=null &&
              this.isiku_valis_kood.equals(other.getIsiku_valis_kood()))) &&
            ((this.valis_kood_riik==null && other.getValis_kood_riik()==null) || 
             (this.valis_kood_riik!=null &&
              this.valis_kood_riik.equals(other.getValis_kood_riik()))) &&
            ((this.synniaeg==null && other.getSynniaeg()==null) || 
             (this.synniaeg!=null &&
              this.synniaeg.equals(other.getSynniaeg())));
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
        if (getKandeelemendi_id() != null) {
            _hashCode += getKandeelemendi_id().hashCode();
        }
        if (getKandeelemendi_liik() != null) {
            _hashCode += getKandeelemendi_liik().hashCode();
        }
        if (getKandeelemendi_kehtivus() != null) {
            _hashCode += getKandeelemendi_kehtivus().hashCode();
        }
        if (getTyhistatava_kande_id() != null) {
            _hashCode += getTyhistatava_kande_id().hashCode();
        }
        if (getAlgus_kuupaev() != null) {
            _hashCode += getAlgus_kuupaev().hashCode();
        }
        if (getLopp_kuupaev() != null) {
            _hashCode += getLopp_kuupaev().hashCode();
        }
        if (getIsiku_liik() != null) {
            _hashCode += getIsiku_liik().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getNimi_arinimi() != null) {
            _hashCode += getNimi_arinimi().hashCode();
        }
        if (getIsikukood_registrikood() != null) {
            _hashCode += getIsikukood_registrikood().hashCode();
        }
        if (getIsiku_valis_kood() != null) {
            _hashCode += getIsiku_valis_kood().hashCode();
        }
        if (getValis_kood_riik() != null) {
            _hashCode += getValis_kood_riik().hashCode();
        }
        if (getSynniaeg() != null) {
            _hashCode += getSynniaeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
