/**
 * EVapiMaaruseDokumentParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiMaaruseDokumentParing_v1  implements java.io.Serializable {
    /* partneritunnus:autentimistunnus */
    private java.lang.String partner_auth;

    private java.math.BigInteger maaruse_id;

    public EVapiMaaruseDokumentParing_v1() {
    }

    public EVapiMaaruseDokumentParing_v1(
           java.lang.String partner_auth,
           java.math.BigInteger maaruse_id) {
           this.partner_auth = partner_auth;
           this.maaruse_id = maaruse_id;
    }


    /**
     * Gets the partner_auth value for this EVapiMaaruseDokumentParing_v1.
     * 
     * @return partner_auth   * partneritunnus:autentimistunnus
     */
    public java.lang.String getPartner_auth() {
        return partner_auth;
    }


    /**
     * Sets the partner_auth value for this EVapiMaaruseDokumentParing_v1.
     * 
     * @param partner_auth   * partneritunnus:autentimistunnus
     */
    public void setPartner_auth(java.lang.String partner_auth) {
        this.partner_auth = partner_auth;
    }


    /**
     * Gets the maaruse_id value for this EVapiMaaruseDokumentParing_v1.
     * 
     * @return maaruse_id
     */
    public java.math.BigInteger getMaaruse_id() {
        return maaruse_id;
    }


    /**
     * Sets the maaruse_id value for this EVapiMaaruseDokumentParing_v1.
     * 
     * @param maaruse_id
     */
    public void setMaaruse_id(java.math.BigInteger maaruse_id) {
        this.maaruse_id = maaruse_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiMaaruseDokumentParing_v1)) return false;
        EVapiMaaruseDokumentParing_v1 other = (EVapiMaaruseDokumentParing_v1) obj;
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
            ((this.maaruse_id==null && other.getMaaruse_id()==null) || 
             (this.maaruse_id!=null &&
              this.maaruse_id.equals(other.getMaaruse_id())));
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
        if (getMaaruse_id() != null) {
            _hashCode += getMaaruse_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
