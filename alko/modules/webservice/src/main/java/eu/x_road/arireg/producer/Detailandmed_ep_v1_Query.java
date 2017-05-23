/**
 * Detailandmed_ep_v1_Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_ep_v1_Query  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private java.lang.String ariregister_sessioon;

    private java.util.Date muudatused_algus;

    private java.util.Date muudatused_lopp;

    private java.math.BigInteger tellimuse_id;

    public Detailandmed_ep_v1_Query() {
    }

    public Detailandmed_ep_v1_Query(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.lang.String ariregister_sessioon,
           java.util.Date muudatused_algus,
           java.util.Date muudatused_lopp,
           java.math.BigInteger tellimuse_id) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregister_sessioon = ariregister_sessioon;
           this.muudatused_algus = muudatused_algus;
           this.muudatused_lopp = muudatused_lopp;
           this.tellimuse_id = tellimuse_id;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Detailandmed_ep_v1_Query.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Detailandmed_ep_v1_Query.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Detailandmed_ep_v1_Query.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Detailandmed_ep_v1_Query.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregister_sessioon value for this Detailandmed_ep_v1_Query.
     * 
     * @return ariregister_sessioon
     */
    public java.lang.String getAriregister_sessioon() {
        return ariregister_sessioon;
    }


    /**
     * Sets the ariregister_sessioon value for this Detailandmed_ep_v1_Query.
     * 
     * @param ariregister_sessioon
     */
    public void setAriregister_sessioon(java.lang.String ariregister_sessioon) {
        this.ariregister_sessioon = ariregister_sessioon;
    }


    /**
     * Gets the muudatused_algus value for this Detailandmed_ep_v1_Query.
     * 
     * @return muudatused_algus
     */
    public java.util.Date getMuudatused_algus() {
        return muudatused_algus;
    }


    /**
     * Sets the muudatused_algus value for this Detailandmed_ep_v1_Query.
     * 
     * @param muudatused_algus
     */
    public void setMuudatused_algus(java.util.Date muudatused_algus) {
        this.muudatused_algus = muudatused_algus;
    }


    /**
     * Gets the muudatused_lopp value for this Detailandmed_ep_v1_Query.
     * 
     * @return muudatused_lopp
     */
    public java.util.Date getMuudatused_lopp() {
        return muudatused_lopp;
    }


    /**
     * Sets the muudatused_lopp value for this Detailandmed_ep_v1_Query.
     * 
     * @param muudatused_lopp
     */
    public void setMuudatused_lopp(java.util.Date muudatused_lopp) {
        this.muudatused_lopp = muudatused_lopp;
    }


    /**
     * Gets the tellimuse_id value for this Detailandmed_ep_v1_Query.
     * 
     * @return tellimuse_id
     */
    public java.math.BigInteger getTellimuse_id() {
        return tellimuse_id;
    }


    /**
     * Sets the tellimuse_id value for this Detailandmed_ep_v1_Query.
     * 
     * @param tellimuse_id
     */
    public void setTellimuse_id(java.math.BigInteger tellimuse_id) {
        this.tellimuse_id = tellimuse_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_ep_v1_Query)) return false;
        Detailandmed_ep_v1_Query other = (Detailandmed_ep_v1_Query) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregister_kasutajanimi==null && other.getAriregister_kasutajanimi()==null) || 
             (this.ariregister_kasutajanimi!=null &&
              this.ariregister_kasutajanimi.equals(other.getAriregister_kasutajanimi()))) &&
            ((this.ariregister_parool==null && other.getAriregister_parool()==null) || 
             (this.ariregister_parool!=null &&
              this.ariregister_parool.equals(other.getAriregister_parool()))) &&
            ((this.ariregister_sessioon==null && other.getAriregister_sessioon()==null) || 
             (this.ariregister_sessioon!=null &&
              this.ariregister_sessioon.equals(other.getAriregister_sessioon()))) &&
            ((this.muudatused_algus==null && other.getMuudatused_algus()==null) || 
             (this.muudatused_algus!=null &&
              this.muudatused_algus.equals(other.getMuudatused_algus()))) &&
            ((this.muudatused_lopp==null && other.getMuudatused_lopp()==null) || 
             (this.muudatused_lopp!=null &&
              this.muudatused_lopp.equals(other.getMuudatused_lopp()))) &&
            ((this.tellimuse_id==null && other.getTellimuse_id()==null) || 
             (this.tellimuse_id!=null &&
              this.tellimuse_id.equals(other.getTellimuse_id())));
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
        if (getAriregister_kasutajanimi() != null) {
            _hashCode += getAriregister_kasutajanimi().hashCode();
        }
        if (getAriregister_parool() != null) {
            _hashCode += getAriregister_parool().hashCode();
        }
        if (getAriregister_sessioon() != null) {
            _hashCode += getAriregister_sessioon().hashCode();
        }
        if (getMuudatused_algus() != null) {
            _hashCode += getMuudatused_algus().hashCode();
        }
        if (getMuudatused_lopp() != null) {
            _hashCode += getMuudatused_lopp().hashCode();
        }
        if (getTellimuse_id() != null) {
            _hashCode += getTellimuse_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
