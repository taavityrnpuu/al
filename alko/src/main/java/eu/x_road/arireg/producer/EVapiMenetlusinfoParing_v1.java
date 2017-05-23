/**
 * EVapiMenetlusinfoParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiMenetlusinfoParing_v1  implements java.io.Serializable {
    /* partneritunnus:autentimistunnus */
    private java.lang.String partner_auth;

    private java.util.Date algus_kuupaev;

    private java.util.Date lopp_kuupaev;

    public EVapiMenetlusinfoParing_v1() {
    }

    public EVapiMenetlusinfoParing_v1(
           java.lang.String partner_auth,
           java.util.Date algus_kuupaev,
           java.util.Date lopp_kuupaev) {
           this.partner_auth = partner_auth;
           this.algus_kuupaev = algus_kuupaev;
           this.lopp_kuupaev = lopp_kuupaev;
    }


    /**
     * Gets the partner_auth value for this EVapiMenetlusinfoParing_v1.
     * 
     * @return partner_auth   * partneritunnus:autentimistunnus
     */
    public java.lang.String getPartner_auth() {
        return partner_auth;
    }


    /**
     * Sets the partner_auth value for this EVapiMenetlusinfoParing_v1.
     * 
     * @param partner_auth   * partneritunnus:autentimistunnus
     */
    public void setPartner_auth(java.lang.String partner_auth) {
        this.partner_auth = partner_auth;
    }


    /**
     * Gets the algus_kuupaev value for this EVapiMenetlusinfoParing_v1.
     * 
     * @return algus_kuupaev
     */
    public java.util.Date getAlgus_kuupaev() {
        return algus_kuupaev;
    }


    /**
     * Sets the algus_kuupaev value for this EVapiMenetlusinfoParing_v1.
     * 
     * @param algus_kuupaev
     */
    public void setAlgus_kuupaev(java.util.Date algus_kuupaev) {
        this.algus_kuupaev = algus_kuupaev;
    }


    /**
     * Gets the lopp_kuupaev value for this EVapiMenetlusinfoParing_v1.
     * 
     * @return lopp_kuupaev
     */
    public java.util.Date getLopp_kuupaev() {
        return lopp_kuupaev;
    }


    /**
     * Sets the lopp_kuupaev value for this EVapiMenetlusinfoParing_v1.
     * 
     * @param lopp_kuupaev
     */
    public void setLopp_kuupaev(java.util.Date lopp_kuupaev) {
        this.lopp_kuupaev = lopp_kuupaev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiMenetlusinfoParing_v1)) return false;
        EVapiMenetlusinfoParing_v1 other = (EVapiMenetlusinfoParing_v1) obj;
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
            ((this.algus_kuupaev==null && other.getAlgus_kuupaev()==null) || 
             (this.algus_kuupaev!=null &&
              this.algus_kuupaev.equals(other.getAlgus_kuupaev()))) &&
            ((this.lopp_kuupaev==null && other.getLopp_kuupaev()==null) || 
             (this.lopp_kuupaev!=null &&
              this.lopp_kuupaev.equals(other.getLopp_kuupaev())));
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
        if (getAlgus_kuupaev() != null) {
            _hashCode += getAlgus_kuupaev().hashCode();
        }
        if (getLopp_kuupaev() != null) {
            _hashCode += getLopp_kuupaev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
