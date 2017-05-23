/**
 * Seos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Seos  implements java.io.Serializable {
    private java.lang.String isiku_tyyp;

    private java.lang.String isiku_roll;

    private java.lang.String isiku_roll_tekstina;

    private java.lang.String eesnimi;

    private java.lang.String nimi_arinimi;

    private java.lang.String isikukood_registrikood;

    private java.util.Date synniaeg;

    private java.lang.String valis_kood;

    private java.lang.String valis_kood_riik;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    private java.math.BigDecimal osaluse_protsent;

    private java.math.BigDecimal osaluse_suurus;

    private java.lang.String osaluse_valuuta;

    private java.lang.String staatus;

    private java.lang.String staatus_tekstina;

    public Seos() {
    }

    public Seos(
           java.lang.String isiku_tyyp,
           java.lang.String isiku_roll,
           java.lang.String isiku_roll_tekstina,
           java.lang.String eesnimi,
           java.lang.String nimi_arinimi,
           java.lang.String isikukood_registrikood,
           java.util.Date synniaeg,
           java.lang.String valis_kood,
           java.lang.String valis_kood_riik,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv,
           java.math.BigDecimal osaluse_protsent,
           java.math.BigDecimal osaluse_suurus,
           java.lang.String osaluse_valuuta,
           java.lang.String staatus,
           java.lang.String staatus_tekstina) {
           this.isiku_tyyp = isiku_tyyp;
           this.isiku_roll = isiku_roll;
           this.isiku_roll_tekstina = isiku_roll_tekstina;
           this.eesnimi = eesnimi;
           this.nimi_arinimi = nimi_arinimi;
           this.isikukood_registrikood = isikukood_registrikood;
           this.synniaeg = synniaeg;
           this.valis_kood = valis_kood;
           this.valis_kood_riik = valis_kood_riik;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
           this.osaluse_protsent = osaluse_protsent;
           this.osaluse_suurus = osaluse_suurus;
           this.osaluse_valuuta = osaluse_valuuta;
           this.staatus = staatus;
           this.staatus_tekstina = staatus_tekstina;
    }


    /**
     * Gets the isiku_tyyp value for this Seos.
     * 
     * @return isiku_tyyp
     */
    public java.lang.String getIsiku_tyyp() {
        return isiku_tyyp;
    }


    /**
     * Sets the isiku_tyyp value for this Seos.
     * 
     * @param isiku_tyyp
     */
    public void setIsiku_tyyp(java.lang.String isiku_tyyp) {
        this.isiku_tyyp = isiku_tyyp;
    }


    /**
     * Gets the isiku_roll value for this Seos.
     * 
     * @return isiku_roll
     */
    public java.lang.String getIsiku_roll() {
        return isiku_roll;
    }


    /**
     * Sets the isiku_roll value for this Seos.
     * 
     * @param isiku_roll
     */
    public void setIsiku_roll(java.lang.String isiku_roll) {
        this.isiku_roll = isiku_roll;
    }


    /**
     * Gets the isiku_roll_tekstina value for this Seos.
     * 
     * @return isiku_roll_tekstina
     */
    public java.lang.String getIsiku_roll_tekstina() {
        return isiku_roll_tekstina;
    }


    /**
     * Sets the isiku_roll_tekstina value for this Seos.
     * 
     * @param isiku_roll_tekstina
     */
    public void setIsiku_roll_tekstina(java.lang.String isiku_roll_tekstina) {
        this.isiku_roll_tekstina = isiku_roll_tekstina;
    }


    /**
     * Gets the eesnimi value for this Seos.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this Seos.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the nimi_arinimi value for this Seos.
     * 
     * @return nimi_arinimi
     */
    public java.lang.String getNimi_arinimi() {
        return nimi_arinimi;
    }


    /**
     * Sets the nimi_arinimi value for this Seos.
     * 
     * @param nimi_arinimi
     */
    public void setNimi_arinimi(java.lang.String nimi_arinimi) {
        this.nimi_arinimi = nimi_arinimi;
    }


    /**
     * Gets the isikukood_registrikood value for this Seos.
     * 
     * @return isikukood_registrikood
     */
    public java.lang.String getIsikukood_registrikood() {
        return isikukood_registrikood;
    }


    /**
     * Sets the isikukood_registrikood value for this Seos.
     * 
     * @param isikukood_registrikood
     */
    public void setIsikukood_registrikood(java.lang.String isikukood_registrikood) {
        this.isikukood_registrikood = isikukood_registrikood;
    }


    /**
     * Gets the synniaeg value for this Seos.
     * 
     * @return synniaeg
     */
    public java.util.Date getSynniaeg() {
        return synniaeg;
    }


    /**
     * Sets the synniaeg value for this Seos.
     * 
     * @param synniaeg
     */
    public void setSynniaeg(java.util.Date synniaeg) {
        this.synniaeg = synniaeg;
    }


    /**
     * Gets the valis_kood value for this Seos.
     * 
     * @return valis_kood
     */
    public java.lang.String getValis_kood() {
        return valis_kood;
    }


    /**
     * Sets the valis_kood value for this Seos.
     * 
     * @param valis_kood
     */
    public void setValis_kood(java.lang.String valis_kood) {
        this.valis_kood = valis_kood;
    }


    /**
     * Gets the valis_kood_riik value for this Seos.
     * 
     * @return valis_kood_riik
     */
    public java.lang.String getValis_kood_riik() {
        return valis_kood_riik;
    }


    /**
     * Sets the valis_kood_riik value for this Seos.
     * 
     * @param valis_kood_riik
     */
    public void setValis_kood_riik(java.lang.String valis_kood_riik) {
        this.valis_kood_riik = valis_kood_riik;
    }


    /**
     * Gets the algus_kpv value for this Seos.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Seos.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Seos.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Seos.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the osaluse_protsent value for this Seos.
     * 
     * @return osaluse_protsent
     */
    public java.math.BigDecimal getOsaluse_protsent() {
        return osaluse_protsent;
    }


    /**
     * Sets the osaluse_protsent value for this Seos.
     * 
     * @param osaluse_protsent
     */
    public void setOsaluse_protsent(java.math.BigDecimal osaluse_protsent) {
        this.osaluse_protsent = osaluse_protsent;
    }


    /**
     * Gets the osaluse_suurus value for this Seos.
     * 
     * @return osaluse_suurus
     */
    public java.math.BigDecimal getOsaluse_suurus() {
        return osaluse_suurus;
    }


    /**
     * Sets the osaluse_suurus value for this Seos.
     * 
     * @param osaluse_suurus
     */
    public void setOsaluse_suurus(java.math.BigDecimal osaluse_suurus) {
        this.osaluse_suurus = osaluse_suurus;
    }


    /**
     * Gets the osaluse_valuuta value for this Seos.
     * 
     * @return osaluse_valuuta
     */
    public java.lang.String getOsaluse_valuuta() {
        return osaluse_valuuta;
    }


    /**
     * Sets the osaluse_valuuta value for this Seos.
     * 
     * @param osaluse_valuuta
     */
    public void setOsaluse_valuuta(java.lang.String osaluse_valuuta) {
        this.osaluse_valuuta = osaluse_valuuta;
    }


    /**
     * Gets the staatus value for this Seos.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Seos.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_tekstina value for this Seos.
     * 
     * @return staatus_tekstina
     */
    public java.lang.String getStaatus_tekstina() {
        return staatus_tekstina;
    }


    /**
     * Sets the staatus_tekstina value for this Seos.
     * 
     * @param staatus_tekstina
     */
    public void setStaatus_tekstina(java.lang.String staatus_tekstina) {
        this.staatus_tekstina = staatus_tekstina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seos)) return false;
        Seos other = (Seos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isiku_tyyp==null && other.getIsiku_tyyp()==null) || 
             (this.isiku_tyyp!=null &&
              this.isiku_tyyp.equals(other.getIsiku_tyyp()))) &&
            ((this.isiku_roll==null && other.getIsiku_roll()==null) || 
             (this.isiku_roll!=null &&
              this.isiku_roll.equals(other.getIsiku_roll()))) &&
            ((this.isiku_roll_tekstina==null && other.getIsiku_roll_tekstina()==null) || 
             (this.isiku_roll_tekstina!=null &&
              this.isiku_roll_tekstina.equals(other.getIsiku_roll_tekstina()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.nimi_arinimi==null && other.getNimi_arinimi()==null) || 
             (this.nimi_arinimi!=null &&
              this.nimi_arinimi.equals(other.getNimi_arinimi()))) &&
            ((this.isikukood_registrikood==null && other.getIsikukood_registrikood()==null) || 
             (this.isikukood_registrikood!=null &&
              this.isikukood_registrikood.equals(other.getIsikukood_registrikood()))) &&
            ((this.synniaeg==null && other.getSynniaeg()==null) || 
             (this.synniaeg!=null &&
              this.synniaeg.equals(other.getSynniaeg()))) &&
            ((this.valis_kood==null && other.getValis_kood()==null) || 
             (this.valis_kood!=null &&
              this.valis_kood.equals(other.getValis_kood()))) &&
            ((this.valis_kood_riik==null && other.getValis_kood_riik()==null) || 
             (this.valis_kood_riik!=null &&
              this.valis_kood_riik.equals(other.getValis_kood_riik()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv()))) &&
            ((this.osaluse_protsent==null && other.getOsaluse_protsent()==null) || 
             (this.osaluse_protsent!=null &&
              this.osaluse_protsent.equals(other.getOsaluse_protsent()))) &&
            ((this.osaluse_suurus==null && other.getOsaluse_suurus()==null) || 
             (this.osaluse_suurus!=null &&
              this.osaluse_suurus.equals(other.getOsaluse_suurus()))) &&
            ((this.osaluse_valuuta==null && other.getOsaluse_valuuta()==null) || 
             (this.osaluse_valuuta!=null &&
              this.osaluse_valuuta.equals(other.getOsaluse_valuuta()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_tekstina==null && other.getStaatus_tekstina()==null) || 
             (this.staatus_tekstina!=null &&
              this.staatus_tekstina.equals(other.getStaatus_tekstina())));
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
        if (getIsiku_tyyp() != null) {
            _hashCode += getIsiku_tyyp().hashCode();
        }
        if (getIsiku_roll() != null) {
            _hashCode += getIsiku_roll().hashCode();
        }
        if (getIsiku_roll_tekstina() != null) {
            _hashCode += getIsiku_roll_tekstina().hashCode();
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
        if (getSynniaeg() != null) {
            _hashCode += getSynniaeg().hashCode();
        }
        if (getValis_kood() != null) {
            _hashCode += getValis_kood().hashCode();
        }
        if (getValis_kood_riik() != null) {
            _hashCode += getValis_kood_riik().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        if (getOsaluse_protsent() != null) {
            _hashCode += getOsaluse_protsent().hashCode();
        }
        if (getOsaluse_suurus() != null) {
            _hashCode += getOsaluse_suurus().hashCode();
        }
        if (getOsaluse_valuuta() != null) {
            _hashCode += getOsaluse_valuuta().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_tekstina() != null) {
            _hashCode += getStaatus_tekstina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
