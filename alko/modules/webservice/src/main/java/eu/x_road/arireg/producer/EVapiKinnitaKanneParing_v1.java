/**
 * EVapiKinnitaKanneParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiKinnitaKanneParing_v1  implements java.io.Serializable {
    /* partneritunnus:autentimistunnus */
    private java.lang.String partner_auth;

    /* Kinnitatava kandeprojekti ID */
    private java.math.BigInteger ekanded_id;

    /* Viide allkirjastatud dokumendile manuses */
    private org.apache.axis.types.URI viide_manusele;

    public EVapiKinnitaKanneParing_v1() {
    }

    public EVapiKinnitaKanneParing_v1(
           java.lang.String partner_auth,
           java.math.BigInteger ekanded_id,
           org.apache.axis.types.URI viide_manusele) {
           this.partner_auth = partner_auth;
           this.ekanded_id = ekanded_id;
           this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the partner_auth value for this EVapiKinnitaKanneParing_v1.
     * 
     * @return partner_auth   * partneritunnus:autentimistunnus
     */
    public java.lang.String getPartner_auth() {
        return partner_auth;
    }


    /**
     * Sets the partner_auth value for this EVapiKinnitaKanneParing_v1.
     * 
     * @param partner_auth   * partneritunnus:autentimistunnus
     */
    public void setPartner_auth(java.lang.String partner_auth) {
        this.partner_auth = partner_auth;
    }


    /**
     * Gets the ekanded_id value for this EVapiKinnitaKanneParing_v1.
     * 
     * @return ekanded_id   * Kinnitatava kandeprojekti ID
     */
    public java.math.BigInteger getEkanded_id() {
        return ekanded_id;
    }


    /**
     * Sets the ekanded_id value for this EVapiKinnitaKanneParing_v1.
     * 
     * @param ekanded_id   * Kinnitatava kandeprojekti ID
     */
    public void setEkanded_id(java.math.BigInteger ekanded_id) {
        this.ekanded_id = ekanded_id;
    }


    /**
     * Gets the viide_manusele value for this EVapiKinnitaKanneParing_v1.
     * 
     * @return viide_manusele   * Viide allkirjastatud dokumendile manuses
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this EVapiKinnitaKanneParing_v1.
     * 
     * @param viide_manusele   * Viide allkirjastatud dokumendile manuses
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiKinnitaKanneParing_v1)) return false;
        EVapiKinnitaKanneParing_v1 other = (EVapiKinnitaKanneParing_v1) obj;
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
              this.ekanded_id.equals(other.getEkanded_id()))) &&
            ((this.viide_manusele==null && other.getViide_manusele()==null) || 
             (this.viide_manusele!=null &&
              this.viide_manusele.equals(other.getViide_manusele())));
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
        if (getViide_manusele() != null) {
            _hashCode += getViide_manusele().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
