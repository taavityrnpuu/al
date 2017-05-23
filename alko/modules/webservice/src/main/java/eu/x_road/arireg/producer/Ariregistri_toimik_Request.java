/**
 * Ariregistri_toimik_Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ariregistri_toimik_Request  implements java.io.Serializable {
    /* Äriregistri kood */
    private int ariregistri_kood;

    /* Klassifikaatorite tõlgete keel */
    private java.lang.String keel;

    /* Otsuste ja hoiatuse sisu formaat */
    private eu.x_road.arireg.producer.X_formaat formaat;

    public Ariregistri_toimik_Request() {
    }

    public Ariregistri_toimik_Request(
           int ariregistri_kood,
           java.lang.String keel,
           eu.x_road.arireg.producer.X_formaat formaat) {
           this.ariregistri_kood = ariregistri_kood;
           this.keel = keel;
           this.formaat = formaat;
    }


    /**
     * Gets the ariregistri_kood value for this Ariregistri_toimik_Request.
     * 
     * @return ariregistri_kood   * Äriregistri kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ariregistri_toimik_Request.
     * 
     * @param ariregistri_kood   * Äriregistri kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the keel value for this Ariregistri_toimik_Request.
     * 
     * @return keel   * Klassifikaatorite tõlgete keel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Ariregistri_toimik_Request.
     * 
     * @param keel   * Klassifikaatorite tõlgete keel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }


    /**
     * Gets the formaat value for this Ariregistri_toimik_Request.
     * 
     * @return formaat   * Otsuste ja hoiatuse sisu formaat
     */
    public eu.x_road.arireg.producer.X_formaat getFormaat() {
        return formaat;
    }


    /**
     * Sets the formaat value for this Ariregistri_toimik_Request.
     * 
     * @param formaat   * Otsuste ja hoiatuse sisu formaat
     */
    public void setFormaat(eu.x_road.arireg.producer.X_formaat formaat) {
        this.formaat = formaat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ariregistri_toimik_Request)) return false;
        Ariregistri_toimik_Request other = (Ariregistri_toimik_Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel()))) &&
            ((this.formaat==null && other.getFormaat()==null) || 
             (this.formaat!=null &&
              this.formaat.equals(other.getFormaat())));
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
        _hashCode += getAriregistri_kood();
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        if (getFormaat() != null) {
            _hashCode += getFormaat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
