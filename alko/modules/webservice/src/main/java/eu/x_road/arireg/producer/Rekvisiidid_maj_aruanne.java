/**
 * Rekvisiidid_maj_aruanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Rekvisiidid_maj_aruanne  implements java.io.Serializable {
    /* Aruande aasta */
    private java.lang.Integer aasta;

    private java.util.Date majandusaasta_algus;

    private java.util.Date majandusaasta_lopp;

    private java.lang.String aruande_liik;

    private java.util.Date esitamise_aeg;

    public Rekvisiidid_maj_aruanne() {
    }

    public Rekvisiidid_maj_aruanne(
           java.lang.Integer aasta,
           java.util.Date majandusaasta_algus,
           java.util.Date majandusaasta_lopp,
           java.lang.String aruande_liik,
           java.util.Date esitamise_aeg) {
           this.aasta = aasta;
           this.majandusaasta_algus = majandusaasta_algus;
           this.majandusaasta_lopp = majandusaasta_lopp;
           this.aruande_liik = aruande_liik;
           this.esitamise_aeg = esitamise_aeg;
    }


    /**
     * Gets the aasta value for this Rekvisiidid_maj_aruanne.
     * 
     * @return aasta   * Aruande aasta
     */
    public java.lang.Integer getAasta() {
        return aasta;
    }


    /**
     * Sets the aasta value for this Rekvisiidid_maj_aruanne.
     * 
     * @param aasta   * Aruande aasta
     */
    public void setAasta(java.lang.Integer aasta) {
        this.aasta = aasta;
    }


    /**
     * Gets the majandusaasta_algus value for this Rekvisiidid_maj_aruanne.
     * 
     * @return majandusaasta_algus
     */
    public java.util.Date getMajandusaasta_algus() {
        return majandusaasta_algus;
    }


    /**
     * Sets the majandusaasta_algus value for this Rekvisiidid_maj_aruanne.
     * 
     * @param majandusaasta_algus
     */
    public void setMajandusaasta_algus(java.util.Date majandusaasta_algus) {
        this.majandusaasta_algus = majandusaasta_algus;
    }


    /**
     * Gets the majandusaasta_lopp value for this Rekvisiidid_maj_aruanne.
     * 
     * @return majandusaasta_lopp
     */
    public java.util.Date getMajandusaasta_lopp() {
        return majandusaasta_lopp;
    }


    /**
     * Sets the majandusaasta_lopp value for this Rekvisiidid_maj_aruanne.
     * 
     * @param majandusaasta_lopp
     */
    public void setMajandusaasta_lopp(java.util.Date majandusaasta_lopp) {
        this.majandusaasta_lopp = majandusaasta_lopp;
    }


    /**
     * Gets the aruande_liik value for this Rekvisiidid_maj_aruanne.
     * 
     * @return aruande_liik
     */
    public java.lang.String getAruande_liik() {
        return aruande_liik;
    }


    /**
     * Sets the aruande_liik value for this Rekvisiidid_maj_aruanne.
     * 
     * @param aruande_liik
     */
    public void setAruande_liik(java.lang.String aruande_liik) {
        this.aruande_liik = aruande_liik;
    }


    /**
     * Gets the esitamise_aeg value for this Rekvisiidid_maj_aruanne.
     * 
     * @return esitamise_aeg
     */
    public java.util.Date getEsitamise_aeg() {
        return esitamise_aeg;
    }


    /**
     * Sets the esitamise_aeg value for this Rekvisiidid_maj_aruanne.
     * 
     * @param esitamise_aeg
     */
    public void setEsitamise_aeg(java.util.Date esitamise_aeg) {
        this.esitamise_aeg = esitamise_aeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rekvisiidid_maj_aruanne)) return false;
        Rekvisiidid_maj_aruanne other = (Rekvisiidid_maj_aruanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aasta==null && other.getAasta()==null) || 
             (this.aasta!=null &&
              this.aasta.equals(other.getAasta()))) &&
            ((this.majandusaasta_algus==null && other.getMajandusaasta_algus()==null) || 
             (this.majandusaasta_algus!=null &&
              this.majandusaasta_algus.equals(other.getMajandusaasta_algus()))) &&
            ((this.majandusaasta_lopp==null && other.getMajandusaasta_lopp()==null) || 
             (this.majandusaasta_lopp!=null &&
              this.majandusaasta_lopp.equals(other.getMajandusaasta_lopp()))) &&
            ((this.aruande_liik==null && other.getAruande_liik()==null) || 
             (this.aruande_liik!=null &&
              this.aruande_liik.equals(other.getAruande_liik()))) &&
            ((this.esitamise_aeg==null && other.getEsitamise_aeg()==null) || 
             (this.esitamise_aeg!=null &&
              this.esitamise_aeg.equals(other.getEsitamise_aeg())));
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
        if (getAasta() != null) {
            _hashCode += getAasta().hashCode();
        }
        if (getMajandusaasta_algus() != null) {
            _hashCode += getMajandusaasta_algus().hashCode();
        }
        if (getMajandusaasta_lopp() != null) {
            _hashCode += getMajandusaasta_lopp().hashCode();
        }
        if (getAruande_liik() != null) {
            _hashCode += getAruande_liik().hashCode();
        }
        if (getEsitamise_aeg() != null) {
            _hashCode += getEsitamise_aeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
