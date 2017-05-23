/**
 * Majandusaasta_aruannete_loetelu_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Majandusaasta_aruannete_loetelu_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private int ariregistri_kood;

    public Majandusaasta_aruannete_loetelu_paring() {
    }

    public Majandusaasta_aruannete_loetelu_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           int ariregistri_kood) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Majandusaasta_aruannete_loetelu_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Majandusaasta_aruannete_loetelu_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Majandusaasta_aruannete_loetelu_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Majandusaasta_aruannete_loetelu_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregistri_kood value for this Majandusaasta_aruannete_loetelu_paring.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Majandusaasta_aruannete_loetelu_paring.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandusaasta_aruannete_loetelu_paring)) return false;
        Majandusaasta_aruannete_loetelu_paring other = (Majandusaasta_aruannete_loetelu_paring) obj;
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
            this.ariregistri_kood == other.getAriregistri_kood();
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
        _hashCode += getAriregistri_kood();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
