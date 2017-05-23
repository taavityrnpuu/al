/**
 * EVapiRiigiloivuViitenumberParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiRiigiloivuViitenumberParing_v1  implements java.io.Serializable {
    /* partneritunnus:autentimistunnus */
    private java.lang.String partner_auth;

    /* Kolmanda osapoole infosüsteemi avalduse ID */
    private java.lang.String kande_id;

    public EVapiRiigiloivuViitenumberParing_v1() {
    }

    public EVapiRiigiloivuViitenumberParing_v1(
           java.lang.String partner_auth,
           java.lang.String kande_id) {
           this.partner_auth = partner_auth;
           this.kande_id = kande_id;
    }


    /**
     * Gets the partner_auth value for this EVapiRiigiloivuViitenumberParing_v1.
     * 
     * @return partner_auth   * partneritunnus:autentimistunnus
     */
    public java.lang.String getPartner_auth() {
        return partner_auth;
    }


    /**
     * Sets the partner_auth value for this EVapiRiigiloivuViitenumberParing_v1.
     * 
     * @param partner_auth   * partneritunnus:autentimistunnus
     */
    public void setPartner_auth(java.lang.String partner_auth) {
        this.partner_auth = partner_auth;
    }


    /**
     * Gets the kande_id value for this EVapiRiigiloivuViitenumberParing_v1.
     * 
     * @return kande_id   * Kolmanda osapoole infosüsteemi avalduse ID
     */
    public java.lang.String getKande_id() {
        return kande_id;
    }


    /**
     * Sets the kande_id value for this EVapiRiigiloivuViitenumberParing_v1.
     * 
     * @param kande_id   * Kolmanda osapoole infosüsteemi avalduse ID
     */
    public void setKande_id(java.lang.String kande_id) {
        this.kande_id = kande_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiRiigiloivuViitenumberParing_v1)) return false;
        EVapiRiigiloivuViitenumberParing_v1 other = (EVapiRiigiloivuViitenumberParing_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partner_auth==null && other.getPartner_auth()==null) || 
             (this.partner_auth!=null &&
              this.partner_auth.equals(other.getPartner_auth()))) &&
            ((this.kande_id==null && other.getKande_id()==null) || 
             (this.kande_id!=null &&
              this.kande_id.equals(other.getKande_id())));
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
        if (getPartner_auth() != null) {
            _hashCode += getPartner_auth().hashCode();
        }
        if (getKande_id() != null) {
            _hashCode += getKande_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
