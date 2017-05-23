/**
 * Ettevotja_muudatus_aruanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_aruanne  implements java.io.Serializable {
    private java.lang.String ettevotja_id;

    private java.lang.Integer ettevotja_ariregistri_kood;

    private java.lang.String ettevotja_arinimi;

    private java.lang.String ettevotja_oiguslik_vorm;

    /* Majandusaasta algus */
    private java.util.Date majandusaasta_algus;

    /* Majandusaasta lõpp */
    private java.util.Date majandusaasta_lopp;

    public Ettevotja_muudatus_aruanne() {
    }

    public Ettevotja_muudatus_aruanne(
           java.lang.String ettevotja_id,
           java.lang.Integer ettevotja_ariregistri_kood,
           java.lang.String ettevotja_arinimi,
           java.lang.String ettevotja_oiguslik_vorm,
           java.util.Date majandusaasta_algus,
           java.util.Date majandusaasta_lopp) {
           this.ettevotja_id = ettevotja_id;
           this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
           this.ettevotja_arinimi = ettevotja_arinimi;
           this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
           this.majandusaasta_algus = majandusaasta_algus;
           this.majandusaasta_lopp = majandusaasta_lopp;
    }


    /**
     * Gets the ettevotja_id value for this Ettevotja_muudatus_aruanne.
     * 
     * @return ettevotja_id
     */
    public java.lang.String getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Ettevotja_muudatus_aruanne.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.lang.String ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_aruanne.
     * 
     * @return ettevotja_ariregistri_kood
     */
    public java.lang.Integer getEttevotja_ariregistri_kood() {
        return ettevotja_ariregistri_kood;
    }


    /**
     * Sets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_aruanne.
     * 
     * @param ettevotja_ariregistri_kood
     */
    public void setEttevotja_ariregistri_kood(java.lang.Integer ettevotja_ariregistri_kood) {
        this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
    }


    /**
     * Gets the ettevotja_arinimi value for this Ettevotja_muudatus_aruanne.
     * 
     * @return ettevotja_arinimi
     */
    public java.lang.String getEttevotja_arinimi() {
        return ettevotja_arinimi;
    }


    /**
     * Sets the ettevotja_arinimi value for this Ettevotja_muudatus_aruanne.
     * 
     * @param ettevotja_arinimi
     */
    public void setEttevotja_arinimi(java.lang.String ettevotja_arinimi) {
        this.ettevotja_arinimi = ettevotja_arinimi;
    }


    /**
     * Gets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_aruanne.
     * 
     * @return ettevotja_oiguslik_vorm
     */
    public java.lang.String getEttevotja_oiguslik_vorm() {
        return ettevotja_oiguslik_vorm;
    }


    /**
     * Sets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_aruanne.
     * 
     * @param ettevotja_oiguslik_vorm
     */
    public void setEttevotja_oiguslik_vorm(java.lang.String ettevotja_oiguslik_vorm) {
        this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
    }


    /**
     * Gets the majandusaasta_algus value for this Ettevotja_muudatus_aruanne.
     * 
     * @return majandusaasta_algus   * Majandusaasta algus
     */
    public java.util.Date getMajandusaasta_algus() {
        return majandusaasta_algus;
    }


    /**
     * Sets the majandusaasta_algus value for this Ettevotja_muudatus_aruanne.
     * 
     * @param majandusaasta_algus   * Majandusaasta algus
     */
    public void setMajandusaasta_algus(java.util.Date majandusaasta_algus) {
        this.majandusaasta_algus = majandusaasta_algus;
    }


    /**
     * Gets the majandusaasta_lopp value for this Ettevotja_muudatus_aruanne.
     * 
     * @return majandusaasta_lopp   * Majandusaasta lõpp
     */
    public java.util.Date getMajandusaasta_lopp() {
        return majandusaasta_lopp;
    }


    /**
     * Sets the majandusaasta_lopp value for this Ettevotja_muudatus_aruanne.
     * 
     * @param majandusaasta_lopp   * Majandusaasta lõpp
     */
    public void setMajandusaasta_lopp(java.util.Date majandusaasta_lopp) {
        this.majandusaasta_lopp = majandusaasta_lopp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_aruanne)) return false;
        Ettevotja_muudatus_aruanne other = (Ettevotja_muudatus_aruanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id()))) &&
            ((this.ettevotja_ariregistri_kood==null && other.getEttevotja_ariregistri_kood()==null) || 
             (this.ettevotja_ariregistri_kood!=null &&
              this.ettevotja_ariregistri_kood.equals(other.getEttevotja_ariregistri_kood()))) &&
            ((this.ettevotja_arinimi==null && other.getEttevotja_arinimi()==null) || 
             (this.ettevotja_arinimi!=null &&
              this.ettevotja_arinimi.equals(other.getEttevotja_arinimi()))) &&
            ((this.ettevotja_oiguslik_vorm==null && other.getEttevotja_oiguslik_vorm()==null) || 
             (this.ettevotja_oiguslik_vorm!=null &&
              this.ettevotja_oiguslik_vorm.equals(other.getEttevotja_oiguslik_vorm()))) &&
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
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        if (getEttevotja_ariregistri_kood() != null) {
            _hashCode += getEttevotja_ariregistri_kood().hashCode();
        }
        if (getEttevotja_arinimi() != null) {
            _hashCode += getEttevotja_arinimi().hashCode();
        }
        if (getEttevotja_oiguslik_vorm() != null) {
            _hashCode += getEttevotja_oiguslik_vorm().hashCode();
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
