/**
 * MargiKattetoimetatuksParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class MargiKattetoimetatuksParing_v1  implements java.io.Serializable {
    /* Ettevõtja ID */
    private java.math.BigInteger ettevotja_id;

    /* Määruse ID */
    private java.math.BigInteger maaruse_id;

    /* Esitaja perekonnanimi */
    private java.lang.String esitaja_nimi;

    /* Esitaja eesnimi */
    private java.lang.String esitaja_eesnimi;

    /* Esitaja isikukood */
    private java.lang.String esitaja_kood;

    /* Esitaja autentimise viis. 1-ID kaart, 2-pangalink, 3-Mobiil
     * ID, 4-Trust */
    private java.lang.String esitaja_auth;

    public MargiKattetoimetatuksParing_v1() {
    }

    public MargiKattetoimetatuksParing_v1(
           java.math.BigInteger ettevotja_id,
           java.math.BigInteger maaruse_id,
           java.lang.String esitaja_nimi,
           java.lang.String esitaja_eesnimi,
           java.lang.String esitaja_kood,
           java.lang.String esitaja_auth) {
           this.ettevotja_id = ettevotja_id;
           this.maaruse_id = maaruse_id;
           this.esitaja_nimi = esitaja_nimi;
           this.esitaja_eesnimi = esitaja_eesnimi;
           this.esitaja_kood = esitaja_kood;
           this.esitaja_auth = esitaja_auth;
    }


    /**
     * Gets the ettevotja_id value for this MargiKattetoimetatuksParing_v1.
     * 
     * @return ettevotja_id   * Ettevõtja ID
     */
    public java.math.BigInteger getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this MargiKattetoimetatuksParing_v1.
     * 
     * @param ettevotja_id   * Ettevõtja ID
     */
    public void setEttevotja_id(java.math.BigInteger ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the maaruse_id value for this MargiKattetoimetatuksParing_v1.
     * 
     * @return maaruse_id   * Määruse ID
     */
    public java.math.BigInteger getMaaruse_id() {
        return maaruse_id;
    }


    /**
     * Sets the maaruse_id value for this MargiKattetoimetatuksParing_v1.
     * 
     * @param maaruse_id   * Määruse ID
     */
    public void setMaaruse_id(java.math.BigInteger maaruse_id) {
        this.maaruse_id = maaruse_id;
    }


    /**
     * Gets the esitaja_nimi value for this MargiKattetoimetatuksParing_v1.
     * 
     * @return esitaja_nimi   * Esitaja perekonnanimi
     */
    public java.lang.String getEsitaja_nimi() {
        return esitaja_nimi;
    }


    /**
     * Sets the esitaja_nimi value for this MargiKattetoimetatuksParing_v1.
     * 
     * @param esitaja_nimi   * Esitaja perekonnanimi
     */
    public void setEsitaja_nimi(java.lang.String esitaja_nimi) {
        this.esitaja_nimi = esitaja_nimi;
    }


    /**
     * Gets the esitaja_eesnimi value for this MargiKattetoimetatuksParing_v1.
     * 
     * @return esitaja_eesnimi   * Esitaja eesnimi
     */
    public java.lang.String getEsitaja_eesnimi() {
        return esitaja_eesnimi;
    }


    /**
     * Sets the esitaja_eesnimi value for this MargiKattetoimetatuksParing_v1.
     * 
     * @param esitaja_eesnimi   * Esitaja eesnimi
     */
    public void setEsitaja_eesnimi(java.lang.String esitaja_eesnimi) {
        this.esitaja_eesnimi = esitaja_eesnimi;
    }


    /**
     * Gets the esitaja_kood value for this MargiKattetoimetatuksParing_v1.
     * 
     * @return esitaja_kood   * Esitaja isikukood
     */
    public java.lang.String getEsitaja_kood() {
        return esitaja_kood;
    }


    /**
     * Sets the esitaja_kood value for this MargiKattetoimetatuksParing_v1.
     * 
     * @param esitaja_kood   * Esitaja isikukood
     */
    public void setEsitaja_kood(java.lang.String esitaja_kood) {
        this.esitaja_kood = esitaja_kood;
    }


    /**
     * Gets the esitaja_auth value for this MargiKattetoimetatuksParing_v1.
     * 
     * @return esitaja_auth   * Esitaja autentimise viis. 1-ID kaart, 2-pangalink, 3-Mobiil
     * ID, 4-Trust
     */
    public java.lang.String getEsitaja_auth() {
        return esitaja_auth;
    }


    /**
     * Sets the esitaja_auth value for this MargiKattetoimetatuksParing_v1.
     * 
     * @param esitaja_auth   * Esitaja autentimise viis. 1-ID kaart, 2-pangalink, 3-Mobiil
     * ID, 4-Trust
     */
    public void setEsitaja_auth(java.lang.String esitaja_auth) {
        this.esitaja_auth = esitaja_auth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MargiKattetoimetatuksParing_v1)) return false;
        MargiKattetoimetatuksParing_v1 other = (MargiKattetoimetatuksParing_v1) obj;
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
            ((this.maaruse_id==null && other.getMaaruse_id()==null) || 
             (this.maaruse_id!=null &&
              this.maaruse_id.equals(other.getMaaruse_id()))) &&
            ((this.esitaja_nimi==null && other.getEsitaja_nimi()==null) || 
             (this.esitaja_nimi!=null &&
              this.esitaja_nimi.equals(other.getEsitaja_nimi()))) &&
            ((this.esitaja_eesnimi==null && other.getEsitaja_eesnimi()==null) || 
             (this.esitaja_eesnimi!=null &&
              this.esitaja_eesnimi.equals(other.getEsitaja_eesnimi()))) &&
            ((this.esitaja_kood==null && other.getEsitaja_kood()==null) || 
             (this.esitaja_kood!=null &&
              this.esitaja_kood.equals(other.getEsitaja_kood()))) &&
            ((this.esitaja_auth==null && other.getEsitaja_auth()==null) || 
             (this.esitaja_auth!=null &&
              this.esitaja_auth.equals(other.getEsitaja_auth())));
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
        if (getMaaruse_id() != null) {
            _hashCode += getMaaruse_id().hashCode();
        }
        if (getEsitaja_nimi() != null) {
            _hashCode += getEsitaja_nimi().hashCode();
        }
        if (getEsitaja_eesnimi() != null) {
            _hashCode += getEsitaja_eesnimi().hashCode();
        }
        if (getEsitaja_kood() != null) {
            _hashCode += getEsitaja_kood().hashCode();
        }
        if (getEsitaja_auth() != null) {
            _hashCode += getEsitaja_auth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
