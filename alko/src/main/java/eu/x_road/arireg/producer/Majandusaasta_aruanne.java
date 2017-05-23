/**
 * Majandusaasta_aruanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Majandusaasta_aruanne  implements java.io.Serializable {
    /* Aruande kood */
    private java.lang.String aruande_kood;

    /* Aruande nimetus */
    private java.lang.String aruande_nimetus;

    /* Aruande aasta */
    private java.lang.Integer aruande_aasta;

    private java.util.Date majandusaasta_algus;

    private java.util.Date majandusaasta_lopp;

    public Majandusaasta_aruanne() {
    }

    public Majandusaasta_aruanne(
           java.lang.String aruande_kood,
           java.lang.String aruande_nimetus,
           java.lang.Integer aruande_aasta,
           java.util.Date majandusaasta_algus,
           java.util.Date majandusaasta_lopp) {
           this.aruande_kood = aruande_kood;
           this.aruande_nimetus = aruande_nimetus;
           this.aruande_aasta = aruande_aasta;
           this.majandusaasta_algus = majandusaasta_algus;
           this.majandusaasta_lopp = majandusaasta_lopp;
    }


    /**
     * Gets the aruande_kood value for this Majandusaasta_aruanne.
     * 
     * @return aruande_kood   * Aruande kood
     */
    public java.lang.String getAruande_kood() {
        return aruande_kood;
    }


    /**
     * Sets the aruande_kood value for this Majandusaasta_aruanne.
     * 
     * @param aruande_kood   * Aruande kood
     */
    public void setAruande_kood(java.lang.String aruande_kood) {
        this.aruande_kood = aruande_kood;
    }


    /**
     * Gets the aruande_nimetus value for this Majandusaasta_aruanne.
     * 
     * @return aruande_nimetus   * Aruande nimetus
     */
    public java.lang.String getAruande_nimetus() {
        return aruande_nimetus;
    }


    /**
     * Sets the aruande_nimetus value for this Majandusaasta_aruanne.
     * 
     * @param aruande_nimetus   * Aruande nimetus
     */
    public void setAruande_nimetus(java.lang.String aruande_nimetus) {
        this.aruande_nimetus = aruande_nimetus;
    }


    /**
     * Gets the aruande_aasta value for this Majandusaasta_aruanne.
     * 
     * @return aruande_aasta   * Aruande aasta
     */
    public java.lang.Integer getAruande_aasta() {
        return aruande_aasta;
    }


    /**
     * Sets the aruande_aasta value for this Majandusaasta_aruanne.
     * 
     * @param aruande_aasta   * Aruande aasta
     */
    public void setAruande_aasta(java.lang.Integer aruande_aasta) {
        this.aruande_aasta = aruande_aasta;
    }


    /**
     * Gets the majandusaasta_algus value for this Majandusaasta_aruanne.
     * 
     * @return majandusaasta_algus
     */
    public java.util.Date getMajandusaasta_algus() {
        return majandusaasta_algus;
    }


    /**
     * Sets the majandusaasta_algus value for this Majandusaasta_aruanne.
     * 
     * @param majandusaasta_algus
     */
    public void setMajandusaasta_algus(java.util.Date majandusaasta_algus) {
        this.majandusaasta_algus = majandusaasta_algus;
    }


    /**
     * Gets the majandusaasta_lopp value for this Majandusaasta_aruanne.
     * 
     * @return majandusaasta_lopp
     */
    public java.util.Date getMajandusaasta_lopp() {
        return majandusaasta_lopp;
    }


    /**
     * Sets the majandusaasta_lopp value for this Majandusaasta_aruanne.
     * 
     * @param majandusaasta_lopp
     */
    public void setMajandusaasta_lopp(java.util.Date majandusaasta_lopp) {
        this.majandusaasta_lopp = majandusaasta_lopp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandusaasta_aruanne)) return false;
        Majandusaasta_aruanne other = (Majandusaasta_aruanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aruande_kood==null && other.getAruande_kood()==null) || 
             (this.aruande_kood!=null &&
              this.aruande_kood.equals(other.getAruande_kood()))) &&
            ((this.aruande_nimetus==null && other.getAruande_nimetus()==null) || 
             (this.aruande_nimetus!=null &&
              this.aruande_nimetus.equals(other.getAruande_nimetus()))) &&
            ((this.aruande_aasta==null && other.getAruande_aasta()==null) || 
             (this.aruande_aasta!=null &&
              this.aruande_aasta.equals(other.getAruande_aasta()))) &&
            ((this.majandusaasta_algus==null && other.getMajandusaasta_algus()==null) || 
             (this.majandusaasta_algus!=null &&
              this.majandusaasta_algus.equals(other.getMajandusaasta_algus()))) &&
            ((this.majandusaasta_lopp==null && other.getMajandusaasta_lopp()==null) || 
             (this.majandusaasta_lopp!=null &&
              this.majandusaasta_lopp.equals(other.getMajandusaasta_lopp())));
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
        if (getAruande_kood() != null) {
            _hashCode += getAruande_kood().hashCode();
        }
        if (getAruande_nimetus() != null) {
            _hashCode += getAruande_nimetus().hashCode();
        }
        if (getAruande_aasta() != null) {
            _hashCode += getAruande_aasta().hashCode();
        }
        if (getMajandusaasta_algus() != null) {
            _hashCode += getMajandusaasta_algus().hashCode();
        }
        if (getMajandusaasta_lopp() != null) {
            _hashCode += getMajandusaasta_lopp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
