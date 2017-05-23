/**
 * Erakonnanimekiri_liige.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Erakonnanimekiri_liige  implements java.io.Serializable {
    private java.math.BigInteger isikukood;

    private java.lang.String eesnimi;

    private java.lang.String perenimi;

    private java.util.Date liikmeks_astumise_aeg;

    public Erakonnanimekiri_liige() {
    }

    public Erakonnanimekiri_liige(
           java.math.BigInteger isikukood,
           java.lang.String eesnimi,
           java.lang.String perenimi,
           java.util.Date liikmeks_astumise_aeg) {
           this.isikukood = isikukood;
           this.eesnimi = eesnimi;
           this.perenimi = perenimi;
           this.liikmeks_astumise_aeg = liikmeks_astumise_aeg;
    }


    /**
     * Gets the isikukood value for this Erakonnanimekiri_liige.
     * 
     * @return isikukood
     */
    public java.math.BigInteger getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this Erakonnanimekiri_liige.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.math.BigInteger isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the eesnimi value for this Erakonnanimekiri_liige.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this Erakonnanimekiri_liige.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the perenimi value for this Erakonnanimekiri_liige.
     * 
     * @return perenimi
     */
    public java.lang.String getPerenimi() {
        return perenimi;
    }


    /**
     * Sets the perenimi value for this Erakonnanimekiri_liige.
     * 
     * @param perenimi
     */
    public void setPerenimi(java.lang.String perenimi) {
        this.perenimi = perenimi;
    }


    /**
     * Gets the liikmeks_astumise_aeg value for this Erakonnanimekiri_liige.
     * 
     * @return liikmeks_astumise_aeg
     */
    public java.util.Date getLiikmeks_astumise_aeg() {
        return liikmeks_astumise_aeg;
    }


    /**
     * Sets the liikmeks_astumise_aeg value for this Erakonnanimekiri_liige.
     * 
     * @param liikmeks_astumise_aeg
     */
    public void setLiikmeks_astumise_aeg(java.util.Date liikmeks_astumise_aeg) {
        this.liikmeks_astumise_aeg = liikmeks_astumise_aeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erakonnanimekiri_liige)) return false;
        Erakonnanimekiri_liige other = (Erakonnanimekiri_liige) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.perenimi==null && other.getPerenimi()==null) || 
             (this.perenimi!=null &&
              this.perenimi.equals(other.getPerenimi()))) &&
            ((this.liikmeks_astumise_aeg==null && other.getLiikmeks_astumise_aeg()==null) || 
             (this.liikmeks_astumise_aeg!=null &&
              this.liikmeks_astumise_aeg.equals(other.getLiikmeks_astumise_aeg())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getPerenimi() != null) {
            _hashCode += getPerenimi().hashCode();
        }
        if (getLiikmeks_astumise_aeg() != null) {
            _hashCode += getLiikmeks_astumise_aeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
