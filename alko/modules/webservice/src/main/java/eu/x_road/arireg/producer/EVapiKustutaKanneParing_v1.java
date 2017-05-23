/**
 * EVapiKustutaKanneParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiKustutaKanneParing_v1  implements java.io.Serializable {
    /* partneritunnus:autentimistunnus */
    private java.lang.String partner_auth;

    /* Kustutatava kandeprojekti ID */
    private java.math.BigInteger ekanded_id;

    public EVapiKustutaKanneParing_v1() {
    }

    public EVapiKustutaKanneParing_v1(
           java.lang.String partner_auth,
           java.math.BigInteger ekanded_id) {
           this.partner_auth = partner_auth;
           this.ekanded_id = ekanded_id;
    }


    /**
     * Gets the partner_auth value for this EVapiKustutaKanneParing_v1.
     * 
     * @return partner_auth   * partneritunnus:autentimistunnus
     */
    public java.lang.String getPartner_auth() {
        return partner_auth;
    }


    /**
     * Sets the partner_auth value for this EVapiKustutaKanneParing_v1.
     * 
     * @param partner_auth   * partneritunnus:autentimistunnus
     */
    public void setPartner_auth(java.lang.String partner_auth) {
        this.partner_auth = partner_auth;
    }


    /**
     * Gets the ekanded_id value for this EVapiKustutaKanneParing_v1.
     * 
     * @return ekanded_id   * Kustutatava kandeprojekti ID
     */
    public java.math.BigInteger getEkanded_id() {
        return ekanded_id;
    }


    /**
     * Sets the ekanded_id value for this EVapiKustutaKanneParing_v1.
     * 
     * @param ekanded_id   * Kustutatava kandeprojekti ID
     */
    public void setEkanded_id(java.math.BigInteger ekanded_id) {
        this.ekanded_id = ekanded_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiKustutaKanneParing_v1)) return false;
        EVapiKustutaKanneParing_v1 other = (EVapiKustutaKanneParing_v1) obj;
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
            ((this.ekanded_id==null && other.getEkanded_id()==null) || 
             (this.ekanded_id!=null &&
              this.ekanded_id.equals(other.getEkanded_id())));
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
        if (getEkanded_id() != null) {
            _hashCode += getEkanded_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
