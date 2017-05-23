/**
 * Klassifikaatorid_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Klassifikaatorid_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    /* Klassifikaatori kood (kui puudub, siis tagastatakse kõik klassifikaatorid) */
    private java.lang.String klassifikaator;

    /* est (vaikimisi), eng */
    private java.lang.String keel;

    public Klassifikaatorid_paring() {
    }

    public Klassifikaatorid_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.lang.String klassifikaator,
           java.lang.String keel) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.klassifikaator = klassifikaator;
           this.keel = keel;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Klassifikaatorid_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Klassifikaatorid_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Klassifikaatorid_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Klassifikaatorid_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the klassifikaator value for this Klassifikaatorid_paring.
     * 
     * @return klassifikaator   * Klassifikaatori kood (kui puudub, siis tagastatakse kõik klassifikaatorid)
     */
    public java.lang.String getKlassifikaator() {
        return klassifikaator;
    }


    /**
     * Sets the klassifikaator value for this Klassifikaatorid_paring.
     * 
     * @param klassifikaator   * Klassifikaatori kood (kui puudub, siis tagastatakse kõik klassifikaatorid)
     */
    public void setKlassifikaator(java.lang.String klassifikaator) {
        this.klassifikaator = klassifikaator;
    }


    /**
     * Gets the keel value for this Klassifikaatorid_paring.
     * 
     * @return keel   * est (vaikimisi), eng
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Klassifikaatorid_paring.
     * 
     * @param keel   * est (vaikimisi), eng
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Klassifikaatorid_paring)) return false;
        Klassifikaatorid_paring other = (Klassifikaatorid_paring) obj;
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
            ((this.klassifikaator==null && other.getKlassifikaator()==null) || 
             (this.klassifikaator!=null &&
              this.klassifikaator.equals(other.getKlassifikaator()))) &&
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
        if (getKlassifikaator() != null) {
            _hashCode += getKlassifikaator().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
