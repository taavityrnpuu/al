/**
 * AsutusTegevuskoht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AsutusTegevuskoht  implements java.io.Serializable {
    private java.lang.String riik;

    private java.lang.String maakond;

    private java.lang.String linnvald;

    private java.lang.String külaAlevAlevik;

    private java.lang.String tänav;

    private java.lang.String majaNimi;

    private java.lang.String majaNr;

    private java.lang.String korter;

    private java.lang.String postiindeks;

    public AsutusTegevuskoht() {
    }

    public AsutusTegevuskoht(
           java.lang.String riik,
           java.lang.String maakond,
           java.lang.String linnvald,
           java.lang.String külaAlevAlevik,
           java.lang.String tänav,
           java.lang.String majaNimi,
           java.lang.String majaNr,
           java.lang.String korter,
           java.lang.String postiindeks) {
           this.riik = riik;
           this.maakond = maakond;
           this.linnvald = linnvald;
           this.külaAlevAlevik = külaAlevAlevik;
           this.tänav = tänav;
           this.majaNimi = majaNimi;
           this.majaNr = majaNr;
           this.korter = korter;
           this.postiindeks = postiindeks;
    }


    /**
     * Gets the riik value for this AsutusTegevuskoht.
     * 
     * @return riik
     */
    public java.lang.String getRiik() {
        return riik;
    }


    /**
     * Sets the riik value for this AsutusTegevuskoht.
     * 
     * @param riik
     */
    public void setRiik(java.lang.String riik) {
        this.riik = riik;
    }


    /**
     * Gets the maakond value for this AsutusTegevuskoht.
     * 
     * @return maakond
     */
    public java.lang.String getMaakond() {
        return maakond;
    }


    /**
     * Sets the maakond value for this AsutusTegevuskoht.
     * 
     * @param maakond
     */
    public void setMaakond(java.lang.String maakond) {
        this.maakond = maakond;
    }


    /**
     * Gets the linnvald value for this AsutusTegevuskoht.
     * 
     * @return linnvald
     */
    public java.lang.String getLinnvald() {
        return linnvald;
    }


    /**
     * Sets the linnvald value for this AsutusTegevuskoht.
     * 
     * @param linnvald
     */
    public void setLinnvald(java.lang.String linnvald) {
        this.linnvald = linnvald;
    }


    /**
     * Gets the külaAlevAlevik value for this AsutusTegevuskoht.
     * 
     * @return külaAlevAlevik
     */
    public java.lang.String getKülaAlevAlevik() {
        return külaAlevAlevik;
    }


    /**
     * Sets the külaAlevAlevik value for this AsutusTegevuskoht.
     * 
     * @param külaAlevAlevik
     */
    public void setKülaAlevAlevik(java.lang.String külaAlevAlevik) {
        this.külaAlevAlevik = külaAlevAlevik;
    }


    /**
     * Gets the tänav value for this AsutusTegevuskoht.
     * 
     * @return tänav
     */
    public java.lang.String getTänav() {
        return tänav;
    }


    /**
     * Sets the tänav value for this AsutusTegevuskoht.
     * 
     * @param tänav
     */
    public void setTänav(java.lang.String tänav) {
        this.tänav = tänav;
    }


    /**
     * Gets the majaNimi value for this AsutusTegevuskoht.
     * 
     * @return majaNimi
     */
    public java.lang.String getMajaNimi() {
        return majaNimi;
    }


    /**
     * Sets the majaNimi value for this AsutusTegevuskoht.
     * 
     * @param majaNimi
     */
    public void setMajaNimi(java.lang.String majaNimi) {
        this.majaNimi = majaNimi;
    }


    /**
     * Gets the majaNr value for this AsutusTegevuskoht.
     * 
     * @return majaNr
     */
    public java.lang.String getMajaNr() {
        return majaNr;
    }


    /**
     * Sets the majaNr value for this AsutusTegevuskoht.
     * 
     * @param majaNr
     */
    public void setMajaNr(java.lang.String majaNr) {
        this.majaNr = majaNr;
    }


    /**
     * Gets the korter value for this AsutusTegevuskoht.
     * 
     * @return korter
     */
    public java.lang.String getKorter() {
        return korter;
    }


    /**
     * Sets the korter value for this AsutusTegevuskoht.
     * 
     * @param korter
     */
    public void setKorter(java.lang.String korter) {
        this.korter = korter;
    }


    /**
     * Gets the postiindeks value for this AsutusTegevuskoht.
     * 
     * @return postiindeks
     */
    public java.lang.String getPostiindeks() {
        return postiindeks;
    }


    /**
     * Sets the postiindeks value for this AsutusTegevuskoht.
     * 
     * @param postiindeks
     */
    public void setPostiindeks(java.lang.String postiindeks) {
        this.postiindeks = postiindeks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsutusTegevuskoht)) return false;
        AsutusTegevuskoht other = (AsutusTegevuskoht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riik==null && other.getRiik()==null) || 
             (this.riik!=null &&
              this.riik.equals(other.getRiik()))) &&
            ((this.maakond==null && other.getMaakond()==null) || 
             (this.maakond!=null &&
              this.maakond.equals(other.getMaakond()))) &&
            ((this.linnvald==null && other.getLinnvald()==null) || 
             (this.linnvald!=null &&
              this.linnvald.equals(other.getLinnvald()))) &&
            ((this.külaAlevAlevik==null && other.getKülaAlevAlevik()==null) || 
             (this.külaAlevAlevik!=null &&
              this.külaAlevAlevik.equals(other.getKülaAlevAlevik()))) &&
            ((this.tänav==null && other.getTänav()==null) || 
             (this.tänav!=null &&
              this.tänav.equals(other.getTänav()))) &&
            ((this.majaNimi==null && other.getMajaNimi()==null) || 
             (this.majaNimi!=null &&
              this.majaNimi.equals(other.getMajaNimi()))) &&
            ((this.majaNr==null && other.getMajaNr()==null) || 
             (this.majaNr!=null &&
              this.majaNr.equals(other.getMajaNr()))) &&
            ((this.korter==null && other.getKorter()==null) || 
             (this.korter!=null &&
              this.korter.equals(other.getKorter()))) &&
            ((this.postiindeks==null && other.getPostiindeks()==null) || 
             (this.postiindeks!=null &&
              this.postiindeks.equals(other.getPostiindeks())));
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
        if (getRiik() != null) {
            _hashCode += getRiik().hashCode();
        }
        if (getMaakond() != null) {
            _hashCode += getMaakond().hashCode();
        }
        if (getLinnvald() != null) {
            _hashCode += getLinnvald().hashCode();
        }
        if (getKülaAlevAlevik() != null) {
            _hashCode += getKülaAlevAlevik().hashCode();
        }
        if (getTänav() != null) {
            _hashCode += getTänav().hashCode();
        }
        if (getMajaNimi() != null) {
            _hashCode += getMajaNimi().hashCode();
        }
        if (getMajaNr() != null) {
            _hashCode += getMajaNr().hashCode();
        }
        if (getKorter() != null) {
            _hashCode += getKorter().hashCode();
        }
        if (getPostiindeks() != null) {
            _hashCode += getPostiindeks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
