/**
 * DigiteeriToimikParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class DigiteeriToimikParing_v1  implements java.io.Serializable {
    /* Ettevõtja ID */
    private java.math.BigInteger ettevotja_id;

    /* Esitaja nimi */
    private java.lang.String esitaja_nimi;

    /* Esitaja isikukood */
    private java.lang.String esitaja_kood;

    /* Esitaja e-posti aadress */
    private java.lang.String esitaja_epost;

    /* Esitaja IP aadress */
    private java.lang.String esitaja_ip;

    public DigiteeriToimikParing_v1() {
    }

    public DigiteeriToimikParing_v1(
           java.math.BigInteger ettevotja_id,
           java.lang.String esitaja_nimi,
           java.lang.String esitaja_kood,
           java.lang.String esitaja_epost,
           java.lang.String esitaja_ip) {
           this.ettevotja_id = ettevotja_id;
           this.esitaja_nimi = esitaja_nimi;
           this.esitaja_kood = esitaja_kood;
           this.esitaja_epost = esitaja_epost;
           this.esitaja_ip = esitaja_ip;
    }


    /**
     * Gets the ettevotja_id value for this DigiteeriToimikParing_v1.
     * 
     * @return ettevotja_id   * Ettevõtja ID
     */
    public java.math.BigInteger getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this DigiteeriToimikParing_v1.
     * 
     * @param ettevotja_id   * Ettevõtja ID
     */
    public void setEttevotja_id(java.math.BigInteger ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the esitaja_nimi value for this DigiteeriToimikParing_v1.
     * 
     * @return esitaja_nimi   * Esitaja nimi
     */
    public java.lang.String getEsitaja_nimi() {
        return esitaja_nimi;
    }


    /**
     * Sets the esitaja_nimi value for this DigiteeriToimikParing_v1.
     * 
     * @param esitaja_nimi   * Esitaja nimi
     */
    public void setEsitaja_nimi(java.lang.String esitaja_nimi) {
        this.esitaja_nimi = esitaja_nimi;
    }


    /**
     * Gets the esitaja_kood value for this DigiteeriToimikParing_v1.
     * 
     * @return esitaja_kood   * Esitaja isikukood
     */
    public java.lang.String getEsitaja_kood() {
        return esitaja_kood;
    }


    /**
     * Sets the esitaja_kood value for this DigiteeriToimikParing_v1.
     * 
     * @param esitaja_kood   * Esitaja isikukood
     */
    public void setEsitaja_kood(java.lang.String esitaja_kood) {
        this.esitaja_kood = esitaja_kood;
    }


    /**
     * Gets the esitaja_epost value for this DigiteeriToimikParing_v1.
     * 
     * @return esitaja_epost   * Esitaja e-posti aadress
     */
    public java.lang.String getEsitaja_epost() {
        return esitaja_epost;
    }


    /**
     * Sets the esitaja_epost value for this DigiteeriToimikParing_v1.
     * 
     * @param esitaja_epost   * Esitaja e-posti aadress
     */
    public void setEsitaja_epost(java.lang.String esitaja_epost) {
        this.esitaja_epost = esitaja_epost;
    }


    /**
     * Gets the esitaja_ip value for this DigiteeriToimikParing_v1.
     * 
     * @return esitaja_ip   * Esitaja IP aadress
     */
    public java.lang.String getEsitaja_ip() {
        return esitaja_ip;
    }


    /**
     * Sets the esitaja_ip value for this DigiteeriToimikParing_v1.
     * 
     * @param esitaja_ip   * Esitaja IP aadress
     */
    public void setEsitaja_ip(java.lang.String esitaja_ip) {
        this.esitaja_ip = esitaja_ip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigiteeriToimikParing_v1)) return false;
        DigiteeriToimikParing_v1 other = (DigiteeriToimikParing_v1) obj;
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
            ((this.esitaja_nimi==null && other.getEsitaja_nimi()==null) || 
             (this.esitaja_nimi!=null &&
              this.esitaja_nimi.equals(other.getEsitaja_nimi()))) &&
            ((this.esitaja_kood==null && other.getEsitaja_kood()==null) || 
             (this.esitaja_kood!=null &&
              this.esitaja_kood.equals(other.getEsitaja_kood()))) &&
            ((this.esitaja_epost==null && other.getEsitaja_epost()==null) || 
             (this.esitaja_epost!=null &&
              this.esitaja_epost.equals(other.getEsitaja_epost()))) &&
            ((this.esitaja_ip==null && other.getEsitaja_ip()==null) || 
             (this.esitaja_ip!=null &&
              this.esitaja_ip.equals(other.getEsitaja_ip())));
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
        if (getEsitaja_nimi() != null) {
            _hashCode += getEsitaja_nimi().hashCode();
        }
        if (getEsitaja_kood() != null) {
            _hashCode += getEsitaja_kood().hashCode();
        }
        if (getEsitaja_epost() != null) {
            _hashCode += getEsitaja_epost().hashCode();
        }
        if (getEsitaja_ip() != null) {
            _hashCode += getEsitaja_ip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
