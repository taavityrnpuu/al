/**
 * Ettevotja_rekvisiidid_fail_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_rekvisiidid_fail_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private java.lang.String faili_formaat;

    public Ettevotja_rekvisiidid_fail_paring() {
    }

    public Ettevotja_rekvisiidid_fail_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.lang.String faili_formaat) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.faili_formaat = faili_formaat;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Ettevotja_rekvisiidid_fail_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Ettevotja_rekvisiidid_fail_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Ettevotja_rekvisiidid_fail_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Ettevotja_rekvisiidid_fail_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the faili_formaat value for this Ettevotja_rekvisiidid_fail_paring.
     * 
     * @return faili_formaat
     */
    public java.lang.String getFaili_formaat() {
        return faili_formaat;
    }


    /**
     * Sets the faili_formaat value for this Ettevotja_rekvisiidid_fail_paring.
     * 
     * @param faili_formaat
     */
    public void setFaili_formaat(java.lang.String faili_formaat) {
        this.faili_formaat = faili_formaat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_rekvisiidid_fail_paring)) return false;
        Ettevotja_rekvisiidid_fail_paring other = (Ettevotja_rekvisiidid_fail_paring) obj;
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
            ((this.faili_formaat==null && other.getFaili_formaat()==null) || 
             (this.faili_formaat!=null &&
              this.faili_formaat.equals(other.getFaili_formaat())));
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
        if (getFaili_formaat() != null) {
            _hashCode += getFaili_formaat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
