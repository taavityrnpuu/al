/**
 * Ettevotja_esmakanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_esmakanne  implements java.io.Serializable {
    private java.lang.Integer ariregistri_kood;

    /* Õiguslik vorm */
    private java.lang.String oiguslik_vorm;

    public Ettevotja_esmakanne() {
    }

    public Ettevotja_esmakanne(
           java.lang.Integer ariregistri_kood,
           java.lang.String oiguslik_vorm) {
           this.ariregistri_kood = ariregistri_kood;
           this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the ariregistri_kood value for this Ettevotja_esmakanne.
     * 
     * @return ariregistri_kood
     */
    public java.lang.Integer getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ettevotja_esmakanne.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.Integer ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the oiguslik_vorm value for this Ettevotja_esmakanne.
     * 
     * @return oiguslik_vorm   * Õiguslik vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Ettevotja_esmakanne.
     * 
     * @param oiguslik_vorm   * Õiguslik vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_esmakanne)) return false;
        Ettevotja_esmakanne other = (Ettevotja_esmakanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
