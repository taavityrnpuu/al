/**
 * EVapiLooKanneAadress_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneAadress_v1  implements java.io.Serializable {
    /* Tänav, maja, krt, talu jne. Välismaa aadressidel kogu aadress. */
    private java.lang.String asukoht;

    /* Eesti riigi puhul peab olema alati antud EHAK */
    private java.lang.String ehak;

    private java.lang.String riik;

    private java.lang.String postiindeks;

    private java.lang.String adob_id;

    private java.math.BigInteger adr_id;

    private java.lang.String ads_oid;

    private java.lang.String koodaadress;

    public EVapiLooKanneAadress_v1() {
    }

    public EVapiLooKanneAadress_v1(
           java.lang.String asukoht,
           java.lang.String ehak,
           java.lang.String riik,
           java.lang.String postiindeks,
           java.lang.String adob_id,
           java.math.BigInteger adr_id,
           java.lang.String ads_oid,
           java.lang.String koodaadress) {
           this.asukoht = asukoht;
           this.ehak = ehak;
           this.riik = riik;
           this.postiindeks = postiindeks;
           this.adob_id = adob_id;
           this.adr_id = adr_id;
           this.ads_oid = ads_oid;
           this.koodaadress = koodaadress;
    }


    /**
     * Gets the asukoht value for this EVapiLooKanneAadress_v1.
     * 
     * @return asukoht   * Tänav, maja, krt, talu jne. Välismaa aadressidel kogu aadress.
     */
    public java.lang.String getAsukoht() {
        return asukoht;
    }


    /**
     * Sets the asukoht value for this EVapiLooKanneAadress_v1.
     * 
     * @param asukoht   * Tänav, maja, krt, talu jne. Välismaa aadressidel kogu aadress.
     */
    public void setAsukoht(java.lang.String asukoht) {
        this.asukoht = asukoht;
    }


    /**
     * Gets the ehak value for this EVapiLooKanneAadress_v1.
     * 
     * @return ehak   * Eesti riigi puhul peab olema alati antud EHAK
     */
    public java.lang.String getEhak() {
        return ehak;
    }


    /**
     * Sets the ehak value for this EVapiLooKanneAadress_v1.
     * 
     * @param ehak   * Eesti riigi puhul peab olema alati antud EHAK
     */
    public void setEhak(java.lang.String ehak) {
        this.ehak = ehak;
    }


    /**
     * Gets the riik value for this EVapiLooKanneAadress_v1.
     * 
     * @return riik
     */
    public java.lang.String getRiik() {
        return riik;
    }


    /**
     * Sets the riik value for this EVapiLooKanneAadress_v1.
     * 
     * @param riik
     */
    public void setRiik(java.lang.String riik) {
        this.riik = riik;
    }


    /**
     * Gets the postiindeks value for this EVapiLooKanneAadress_v1.
     * 
     * @return postiindeks
     */
    public java.lang.String getPostiindeks() {
        return postiindeks;
    }


    /**
     * Sets the postiindeks value for this EVapiLooKanneAadress_v1.
     * 
     * @param postiindeks
     */
    public void setPostiindeks(java.lang.String postiindeks) {
        this.postiindeks = postiindeks;
    }


    /**
     * Gets the adob_id value for this EVapiLooKanneAadress_v1.
     * 
     * @return adob_id
     */
    public java.lang.String getAdob_id() {
        return adob_id;
    }


    /**
     * Sets the adob_id value for this EVapiLooKanneAadress_v1.
     * 
     * @param adob_id
     */
    public void setAdob_id(java.lang.String adob_id) {
        this.adob_id = adob_id;
    }


    /**
     * Gets the adr_id value for this EVapiLooKanneAadress_v1.
     * 
     * @return adr_id
     */
    public java.math.BigInteger getAdr_id() {
        return adr_id;
    }


    /**
     * Sets the adr_id value for this EVapiLooKanneAadress_v1.
     * 
     * @param adr_id
     */
    public void setAdr_id(java.math.BigInteger adr_id) {
        this.adr_id = adr_id;
    }


    /**
     * Gets the ads_oid value for this EVapiLooKanneAadress_v1.
     * 
     * @return ads_oid
     */
    public java.lang.String getAds_oid() {
        return ads_oid;
    }


    /**
     * Sets the ads_oid value for this EVapiLooKanneAadress_v1.
     * 
     * @param ads_oid
     */
    public void setAds_oid(java.lang.String ads_oid) {
        this.ads_oid = ads_oid;
    }


    /**
     * Gets the koodaadress value for this EVapiLooKanneAadress_v1.
     * 
     * @return koodaadress
     */
    public java.lang.String getKoodaadress() {
        return koodaadress;
    }


    /**
     * Sets the koodaadress value for this EVapiLooKanneAadress_v1.
     * 
     * @param koodaadress
     */
    public void setKoodaadress(java.lang.String koodaadress) {
        this.koodaadress = koodaadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneAadress_v1)) return false;
        EVapiLooKanneAadress_v1 other = (EVapiLooKanneAadress_v1) obj;
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
            ((this.ads_oid==null && other.getAds_oid()==null) || 
             (this.ads_oid!=null &&
              this.ads_oid.equals(other.getAds_oid()))) &&
            ((this.koodaadress==null && other.getKoodaadress()==null) || 
             (this.koodaadress!=null &&
              this.koodaadress.equals(other.getKoodaadress())));
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
        if (getAds_oid() != null) {
            _hashCode += getAds_oid().hashCode();
        }
        if (getKoodaadress() != null) {
            _hashCode += getKoodaadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
