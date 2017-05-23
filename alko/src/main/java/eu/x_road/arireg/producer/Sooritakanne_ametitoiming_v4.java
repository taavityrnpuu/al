/**
 * Sooritakanne_ametitoiming_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_ametitoiming_v4  implements java.io.Serializable {
    private java.util.Date tehingu_kuupaev;

    private java.lang.Integer ametitoimingu_nr;

    private java.lang.String notari_nimi;

    private java.lang.String notari_isikukood;

    public Sooritakanne_ametitoiming_v4() {
    }

    public Sooritakanne_ametitoiming_v4(
           java.util.Date tehingu_kuupaev,
           java.lang.Integer ametitoimingu_nr,
           java.lang.String notari_nimi,
           java.lang.String notari_isikukood) {
           this.tehingu_kuupaev = tehingu_kuupaev;
           this.ametitoimingu_nr = ametitoimingu_nr;
           this.notari_nimi = notari_nimi;
           this.notari_isikukood = notari_isikukood;
    }


    /**
     * Gets the tehingu_kuupaev value for this Sooritakanne_ametitoiming_v4.
     * 
     * @return tehingu_kuupaev
     */
    public java.util.Date getTehingu_kuupaev() {
        return tehingu_kuupaev;
    }


    /**
     * Sets the tehingu_kuupaev value for this Sooritakanne_ametitoiming_v4.
     * 
     * @param tehingu_kuupaev
     */
    public void setTehingu_kuupaev(java.util.Date tehingu_kuupaev) {
        this.tehingu_kuupaev = tehingu_kuupaev;
    }


    /**
     * Gets the ametitoimingu_nr value for this Sooritakanne_ametitoiming_v4.
     * 
     * @return ametitoimingu_nr
     */
    public java.lang.Integer getAmetitoimingu_nr() {
        return ametitoimingu_nr;
    }


    /**
     * Sets the ametitoimingu_nr value for this Sooritakanne_ametitoiming_v4.
     * 
     * @param ametitoimingu_nr
     */
    public void setAmetitoimingu_nr(java.lang.Integer ametitoimingu_nr) {
        this.ametitoimingu_nr = ametitoimingu_nr;
    }


    /**
     * Gets the notari_nimi value for this Sooritakanne_ametitoiming_v4.
     * 
     * @return notari_nimi
     */
    public java.lang.String getNotari_nimi() {
        return notari_nimi;
    }


    /**
     * Sets the notari_nimi value for this Sooritakanne_ametitoiming_v4.
     * 
     * @param notari_nimi
     */
    public void setNotari_nimi(java.lang.String notari_nimi) {
        this.notari_nimi = notari_nimi;
    }


    /**
     * Gets the notari_isikukood value for this Sooritakanne_ametitoiming_v4.
     * 
     * @return notari_isikukood
     */
    public java.lang.String getNotari_isikukood() {
        return notari_isikukood;
    }


    /**
     * Sets the notari_isikukood value for this Sooritakanne_ametitoiming_v4.
     * 
     * @param notari_isikukood
     */
    public void setNotari_isikukood(java.lang.String notari_isikukood) {
        this.notari_isikukood = notari_isikukood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sooritakanne_ametitoiming_v4)) return false;
        Sooritakanne_ametitoiming_v4 other = (Sooritakanne_ametitoiming_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tehingu_kuupaev==null && other.getTehingu_kuupaev()==null) || 
             (this.tehingu_kuupaev!=null &&
              this.tehingu_kuupaev.equals(other.getTehingu_kuupaev()))) &&
            ((this.ametitoimingu_nr==null && other.getAmetitoimingu_nr()==null) || 
             (this.ametitoimingu_nr!=null &&
              this.ametitoimingu_nr.equals(other.getAmetitoimingu_nr()))) &&
            ((this.notari_nimi==null && other.getNotari_nimi()==null) || 
             (this.notari_nimi!=null &&
              this.notari_nimi.equals(other.getNotari_nimi()))) &&
            ((this.notari_isikukood==null && other.getNotari_isikukood()==null) || 
             (this.notari_isikukood!=null &&
              this.notari_isikukood.equals(other.getNotari_isikukood())));
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
        if (getTehingu_kuupaev() != null) {
            _hashCode += getTehingu_kuupaev().hashCode();
        }
        if (getAmetitoimingu_nr() != null) {
            _hashCode += getAmetitoimingu_nr().hashCode();
        }
        if (getNotari_nimi() != null) {
            _hashCode += getNotari_nimi().hashCode();
        }
        if (getNotari_isikukood() != null) {
            _hashCode += getNotari_isikukood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
