/**
 * Paringliht_tasuta_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringliht_tasuta_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private java.lang.String ariregister_sessioon;

    private java.lang.String ariregister_valjundi_formaat;

    private java.lang.String evnimi;

    private java.math.BigInteger ariregistri_kood;

    private java.math.BigInteger evarv;

    private java.lang.String keel;

    public Paringliht_tasuta_paring() {
    }

    public Paringliht_tasuta_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.lang.String ariregister_sessioon,
           java.lang.String ariregister_valjundi_formaat,
           java.lang.String evnimi,
           java.math.BigInteger ariregistri_kood,
           java.math.BigInteger evarv,
           java.lang.String keel) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregister_sessioon = ariregister_sessioon;
           this.ariregister_valjundi_formaat = ariregister_valjundi_formaat;
           this.evnimi = evnimi;
           this.ariregistri_kood = ariregistri_kood;
           this.evarv = evarv;
           this.keel = keel;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Paringliht_tasuta_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Paringliht_tasuta_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Paringliht_tasuta_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Paringliht_tasuta_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregister_sessioon value for this Paringliht_tasuta_paring.
     * 
     * @return ariregister_sessioon
     */
    public java.lang.String getAriregister_sessioon() {
        return ariregister_sessioon;
    }


    /**
     * Sets the ariregister_sessioon value for this Paringliht_tasuta_paring.
     * 
     * @param ariregister_sessioon
     */
    public void setAriregister_sessioon(java.lang.String ariregister_sessioon) {
        this.ariregister_sessioon = ariregister_sessioon;
    }


    /**
     * Gets the ariregister_valjundi_formaat value for this Paringliht_tasuta_paring.
     * 
     * @return ariregister_valjundi_formaat
     */
    public java.lang.String getAriregister_valjundi_formaat() {
        return ariregister_valjundi_formaat;
    }


    /**
     * Sets the ariregister_valjundi_formaat value for this Paringliht_tasuta_paring.
     * 
     * @param ariregister_valjundi_formaat
     */
    public void setAriregister_valjundi_formaat(java.lang.String ariregister_valjundi_formaat) {
        this.ariregister_valjundi_formaat = ariregister_valjundi_formaat;
    }


    /**
     * Gets the evnimi value for this Paringliht_tasuta_paring.
     * 
     * @return evnimi
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }


    /**
     * Sets the evnimi value for this Paringliht_tasuta_paring.
     * 
     * @param evnimi
     */
    public void setEvnimi(java.lang.String evnimi) {
        this.evnimi = evnimi;
    }


    /**
     * Gets the ariregistri_kood value for this Paringliht_tasuta_paring.
     * 
     * @return ariregistri_kood
     */
    public java.math.BigInteger getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Paringliht_tasuta_paring.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.math.BigInteger ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the evarv value for this Paringliht_tasuta_paring.
     * 
     * @return evarv
     */
    public java.math.BigInteger getEvarv() {
        return evarv;
    }


    /**
     * Sets the evarv value for this Paringliht_tasuta_paring.
     * 
     * @param evarv
     */
    public void setEvarv(java.math.BigInteger evarv) {
        this.evarv = evarv;
    }


    /**
     * Gets the keel value for this Paringliht_tasuta_paring.
     * 
     * @return keel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Paringliht_tasuta_paring.
     * 
     * @param keel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_tasuta_paring)) return false;
        Paringliht_tasuta_paring other = (Paringliht_tasuta_paring) obj;
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
            ((this.ariregister_valjundi_formaat==null && other.getAriregister_valjundi_formaat()==null) || 
             (this.ariregister_valjundi_formaat!=null &&
              this.ariregister_valjundi_formaat.equals(other.getAriregister_valjundi_formaat()))) &&
            ((this.evnimi==null && other.getEvnimi()==null) || 
             (this.evnimi!=null &&
              this.evnimi.equals(other.getEvnimi()))) &&
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.evarv==null && other.getEvarv()==null) || 
             (this.evarv!=null &&
              this.evarv.equals(other.getEvarv()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel())));
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
        if (getAriregister_valjundi_formaat() != null) {
            _hashCode += getAriregister_valjundi_formaat().hashCode();
        }
        if (getEvnimi() != null) {
            _hashCode += getEvnimi().hashCode();
        }
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getEvarv() != null) {
            _hashCode += getEvarv().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
