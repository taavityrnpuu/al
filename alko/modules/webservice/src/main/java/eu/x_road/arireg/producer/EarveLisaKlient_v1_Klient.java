/**
 * EarveLisaKlient_v1_Klient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EarveLisaKlient_v1_Klient  implements java.io.Serializable {
    private java.math.BigInteger registrikood;

    private java.lang.String kontakt_epost;

    public EarveLisaKlient_v1_Klient() {
    }

    public EarveLisaKlient_v1_Klient(
           java.math.BigInteger registrikood,
           java.lang.String kontakt_epost) {
           this.registrikood = registrikood;
           this.kontakt_epost = kontakt_epost;
    }


    /**
     * Gets the registrikood value for this EarveLisaKlient_v1_Klient.
     * 
     * @return registrikood
     */
    public java.math.BigInteger getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this EarveLisaKlient_v1_Klient.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.math.BigInteger registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the kontakt_epost value for this EarveLisaKlient_v1_Klient.
     * 
     * @return kontakt_epost
     */
    public java.lang.String getKontakt_epost() {
        return kontakt_epost;
    }


    /**
     * Sets the kontakt_epost value for this EarveLisaKlient_v1_Klient.
     * 
     * @param kontakt_epost
     */
    public void setKontakt_epost(java.lang.String kontakt_epost) {
        this.kontakt_epost = kontakt_epost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EarveLisaKlient_v1_Klient)) return false;
        EarveLisaKlient_v1_Klient other = (EarveLisaKlient_v1_Klient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood()))) &&
            ((this.kontakt_epost==null && other.getKontakt_epost()==null) || 
             (this.kontakt_epost!=null &&
              this.kontakt_epost.equals(other.getKontakt_epost())));
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
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        if (getKontakt_epost() != null) {
            _hashCode += getKontakt_epost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
