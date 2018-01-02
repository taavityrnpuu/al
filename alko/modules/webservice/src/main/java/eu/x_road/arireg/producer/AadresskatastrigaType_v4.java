/**
 * AadresskatastrigaType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class AadresskatastrigaType_v4  implements java.io.Serializable {
    /* Tänav, maja, krt, talu jne. Välismaa aadressidel kogu aadress. */
    private java.lang.String asukoht;

    /* Eesti riigi puhul peab olema alati antud EHAK */
    private java.lang.String ehak;

    private java.lang.String riik;

    private java.lang.String postiindeks;

    private java.lang.String adob_id;

    private java.lang.Integer adr_id;

    private java.lang.String tase6;

    private java.lang.String tase7;

    private java.lang.String tase8;

    private java.lang.String ads_oid;

    private java.lang.String koodaadress;

    private java.lang.String katastriyksus;

    private java.lang.String taisaadress;

    private java.lang.String taisaadress_tapsustus;

    private java.lang.String tyyp;

    public AadresskatastrigaType_v4() {
    }

    public AadresskatastrigaType_v4(
           java.lang.String asukoht,
           java.lang.String ehak,
           java.lang.String riik,
           java.lang.String postiindeks,
           java.lang.String adob_id,
           java.lang.Integer adr_id,
           java.lang.String tase6,
           java.lang.String tase7,
           java.lang.String tase8,
           java.lang.String ads_oid,
           java.lang.String koodaadress,
           java.lang.String katastriyksus,
           java.lang.String taisaadress,
           java.lang.String taisaadress_tapsustus,
           java.lang.String tyyp) {
           this.asukoht = asukoht;
           this.ehak = ehak;
           this.riik = riik;
           this.postiindeks = postiindeks;
           this.adob_id = adob_id;
           this.adr_id = adr_id;
           this.tase6 = tase6;
           this.tase7 = tase7;
           this.tase8 = tase8;
           this.ads_oid = ads_oid;
           this.koodaadress = koodaadress;
           this.katastriyksus = katastriyksus;
           this.taisaadress = taisaadress;
           this.taisaadress_tapsustus = taisaadress_tapsustus;
           this.tyyp = tyyp;
    }


    /**
     * Gets the asukoht value for this AadresskatastrigaType_v4.
     * 
     * @return asukoht   * Tänav, maja, krt, talu jne. Välismaa aadressidel kogu aadress.
     */
    public java.lang.String getAsukoht() {
        return asukoht;
    }


    /**
     * Sets the asukoht value for this AadresskatastrigaType_v4.
     * 
     * @param asukoht   * Tänav, maja, krt, talu jne. Välismaa aadressidel kogu aadress.
     */
    public void setAsukoht(java.lang.String asukoht) {
        this.asukoht = asukoht;
    }


    /**
     * Gets the ehak value for this AadresskatastrigaType_v4.
     * 
     * @return ehak   * Eesti riigi puhul peab olema alati antud EHAK
     */
    public java.lang.String getEhak() {
        return ehak;
    }


    /**
     * Sets the ehak value for this AadresskatastrigaType_v4.
     * 
     * @param ehak   * Eesti riigi puhul peab olema alati antud EHAK
     */
    public void setEhak(java.lang.String ehak) {
        this.ehak = ehak;
    }


    /**
     * Gets the riik value for this AadresskatastrigaType_v4.
     * 
     * @return riik
     */
    public java.lang.String getRiik() {
        return riik;
    }


    /**
     * Sets the riik value for this AadresskatastrigaType_v4.
     * 
     * @param riik
     */
    public void setRiik(java.lang.String riik) {
        this.riik = riik;
    }


    /**
     * Gets the postiindeks value for this AadresskatastrigaType_v4.
     * 
     * @return postiindeks
     */
    public java.lang.String getPostiindeks() {
        return postiindeks;
    }


    /**
     * Sets the postiindeks value for this AadresskatastrigaType_v4.
     * 
     * @param postiindeks
     */
    public void setPostiindeks(java.lang.String postiindeks) {
        this.postiindeks = postiindeks;
    }


    /**
     * Gets the adob_id value for this AadresskatastrigaType_v4.
     * 
     * @return adob_id
     */
    public java.lang.String getAdob_id() {
        return adob_id;
    }


    /**
     * Sets the adob_id value for this AadresskatastrigaType_v4.
     * 
     * @param adob_id
     */
    public void setAdob_id(java.lang.String adob_id) {
        this.adob_id = adob_id;
    }


    /**
     * Gets the adr_id value for this AadresskatastrigaType_v4.
     * 
     * @return adr_id
     */
    public java.lang.Integer getAdr_id() {
        return adr_id;
    }


    /**
     * Sets the adr_id value for this AadresskatastrigaType_v4.
     * 
     * @param adr_id
     */
    public void setAdr_id(java.lang.Integer adr_id) {
        this.adr_id = adr_id;
    }


    /**
     * Gets the tase6 value for this AadresskatastrigaType_v4.
     * 
     * @return tase6
     */
    public java.lang.String getTase6() {
        return tase6;
    }


    /**
     * Sets the tase6 value for this AadresskatastrigaType_v4.
     * 
     * @param tase6
     */
    public void setTase6(java.lang.String tase6) {
        this.tase6 = tase6;
    }


    /**
     * Gets the tase7 value for this AadresskatastrigaType_v4.
     * 
     * @return tase7
     */
    public java.lang.String getTase7() {
        return tase7;
    }


    /**
     * Sets the tase7 value for this AadresskatastrigaType_v4.
     * 
     * @param tase7
     */
    public void setTase7(java.lang.String tase7) {
        this.tase7 = tase7;
    }


    /**
     * Gets the tase8 value for this AadresskatastrigaType_v4.
     * 
     * @return tase8
     */
    public java.lang.String getTase8() {
        return tase8;
    }


    /**
     * Sets the tase8 value for this AadresskatastrigaType_v4.
     * 
     * @param tase8
     */
    public void setTase8(java.lang.String tase8) {
        this.tase8 = tase8;
    }


    /**
     * Gets the ads_oid value for this AadresskatastrigaType_v4.
     * 
     * @return ads_oid
     */
    public java.lang.String getAds_oid() {
        return ads_oid;
    }


    /**
     * Sets the ads_oid value for this AadresskatastrigaType_v4.
     * 
     * @param ads_oid
     */
    public void setAds_oid(java.lang.String ads_oid) {
        this.ads_oid = ads_oid;
    }


    /**
     * Gets the koodaadress value for this AadresskatastrigaType_v4.
     * 
     * @return koodaadress
     */
    public java.lang.String getKoodaadress() {
        return koodaadress;
    }


    /**
     * Sets the koodaadress value for this AadresskatastrigaType_v4.
     * 
     * @param koodaadress
     */
    public void setKoodaadress(java.lang.String koodaadress) {
        this.koodaadress = koodaadress;
    }


    /**
     * Gets the katastriyksus value for this AadresskatastrigaType_v4.
     * 
     * @return katastriyksus
     */
    public java.lang.String getKatastriyksus() {
        return katastriyksus;
    }


    /**
     * Sets the katastriyksus value for this AadresskatastrigaType_v4.
     * 
     * @param katastriyksus
     */
    public void setKatastriyksus(java.lang.String katastriyksus) {
        this.katastriyksus = katastriyksus;
    }


    /**
     * Gets the taisaadress value for this AadresskatastrigaType_v4.
     * 
     * @return taisaadress
     */
    public java.lang.String getTaisaadress() {
        return taisaadress;
    }


    /**
     * Sets the taisaadress value for this AadresskatastrigaType_v4.
     * 
     * @param taisaadress
     */
    public void setTaisaadress(java.lang.String taisaadress) {
        this.taisaadress = taisaadress;
    }


    /**
     * Gets the taisaadress_tapsustus value for this AadresskatastrigaType_v4.
     * 
     * @return taisaadress_tapsustus
     */
    public java.lang.String getTaisaadress_tapsustus() {
        return taisaadress_tapsustus;
    }


    /**
     * Sets the taisaadress_tapsustus value for this AadresskatastrigaType_v4.
     * 
     * @param taisaadress_tapsustus
     */
    public void setTaisaadress_tapsustus(java.lang.String taisaadress_tapsustus) {
        this.taisaadress_tapsustus = taisaadress_tapsustus;
    }


    /**
     * Gets the tyyp value for this AadresskatastrigaType_v4.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this AadresskatastrigaType_v4.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AadresskatastrigaType_v4)) return false;
        AadresskatastrigaType_v4 other = (AadresskatastrigaType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asukoht==null && other.getAsukoht()==null) || 
             (this.asukoht!=null &&
              this.asukoht.equals(other.getAsukoht()))) &&
            ((this.ehak==null && other.getEhak()==null) || 
             (this.ehak!=null &&
              this.ehak.equals(other.getEhak()))) &&
            ((this.riik==null && other.getRiik()==null) || 
             (this.riik!=null &&
              this.riik.equals(other.getRiik()))) &&
            ((this.postiindeks==null && other.getPostiindeks()==null) || 
             (this.postiindeks!=null &&
              this.postiindeks.equals(other.getPostiindeks()))) &&
            ((this.adob_id==null && other.getAdob_id()==null) || 
             (this.adob_id!=null &&
              this.adob_id.equals(other.getAdob_id()))) &&
            ((this.adr_id==null && other.getAdr_id()==null) || 
             (this.adr_id!=null &&
              this.adr_id.equals(other.getAdr_id()))) &&
            ((this.tase6==null && other.getTase6()==null) || 
             (this.tase6!=null &&
              this.tase6.equals(other.getTase6()))) &&
            ((this.tase7==null && other.getTase7()==null) || 
             (this.tase7!=null &&
              this.tase7.equals(other.getTase7()))) &&
            ((this.tase8==null && other.getTase8()==null) || 
             (this.tase8!=null &&
              this.tase8.equals(other.getTase8()))) &&
            ((this.ads_oid==null && other.getAds_oid()==null) || 
             (this.ads_oid!=null &&
              this.ads_oid.equals(other.getAds_oid()))) &&
            ((this.koodaadress==null && other.getKoodaadress()==null) || 
             (this.koodaadress!=null &&
              this.koodaadress.equals(other.getKoodaadress()))) &&
            ((this.katastriyksus==null && other.getKatastriyksus()==null) || 
             (this.katastriyksus!=null &&
              this.katastriyksus.equals(other.getKatastriyksus()))) &&
            ((this.taisaadress==null && other.getTaisaadress()==null) || 
             (this.taisaadress!=null &&
              this.taisaadress.equals(other.getTaisaadress()))) &&
            ((this.taisaadress_tapsustus==null && other.getTaisaadress_tapsustus()==null) || 
             (this.taisaadress_tapsustus!=null &&
              this.taisaadress_tapsustus.equals(other.getTaisaadress_tapsustus()))) &&
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp())));
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
        if (getAsukoht() != null) {
            _hashCode += getAsukoht().hashCode();
        }
        if (getEhak() != null) {
            _hashCode += getEhak().hashCode();
        }
        if (getRiik() != null) {
            _hashCode += getRiik().hashCode();
        }
        if (getPostiindeks() != null) {
            _hashCode += getPostiindeks().hashCode();
        }
        if (getAdob_id() != null) {
            _hashCode += getAdob_id().hashCode();
        }
        if (getAdr_id() != null) {
            _hashCode += getAdr_id().hashCode();
        }
        if (getTase6() != null) {
            _hashCode += getTase6().hashCode();
        }
        if (getTase7() != null) {
            _hashCode += getTase7().hashCode();
        }
        if (getTase8() != null) {
            _hashCode += getTase8().hashCode();
        }
        if (getAds_oid() != null) {
            _hashCode += getAds_oid().hashCode();
        }
        if (getKoodaadress() != null) {
            _hashCode += getKoodaadress().hashCode();
        }
        if (getKatastriyksus() != null) {
            _hashCode += getKatastriyksus().hashCode();
        }
        if (getTaisaadress() != null) {
            _hashCode += getTaisaadress().hashCode();
        }
        if (getTaisaadress_tapsustus() != null) {
            _hashCode += getTaisaadress_tapsustus().hashCode();
        }
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
