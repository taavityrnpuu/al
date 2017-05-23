/**
 * Erakondakuuluvus_liige.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Erakondakuuluvus_liige  implements java.io.Serializable {
    private java.math.BigInteger kood;

    private java.lang.String nimi;

    private java.util.Date liikmeks_astumise_aeg;

    public Erakondakuuluvus_liige() {
    }

    public Erakondakuuluvus_liige(
           java.math.BigInteger kood,
           java.lang.String nimi,
           java.util.Date liikmeks_astumise_aeg) {
           this.kood = kood;
           this.nimi = nimi;
           this.liikmeks_astumise_aeg = liikmeks_astumise_aeg;
    }


    /**
     * Gets the kood value for this Erakondakuuluvus_liige.
     * 
     * @return kood
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this Erakondakuuluvus_liige.
     * 
     * @param kood
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimi value for this Erakondakuuluvus_liige.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Erakondakuuluvus_liige.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the liikmeks_astumise_aeg value for this Erakondakuuluvus_liige.
     * 
     * @return liikmeks_astumise_aeg
     */
    public java.util.Date getLiikmeks_astumise_aeg() {
        return liikmeks_astumise_aeg;
    }


    /**
     * Sets the liikmeks_astumise_aeg value for this Erakondakuuluvus_liige.
     * 
     * @param liikmeks_astumise_aeg
     */
    public void setLiikmeks_astumise_aeg(java.util.Date liikmeks_astumise_aeg) {
        this.liikmeks_astumise_aeg = liikmeks_astumise_aeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erakondakuuluvus_liige)) return false;
        Erakondakuuluvus_liige other = (Erakondakuuluvus_liige) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
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
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getLiikmeks_astumise_aeg() != null) {
            _hashCode += getLiikmeks_astumise_aeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
