/**
 * Paringesindus_iseendakohta_ettevote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringesindus_iseendakohta_ettevote  implements java.io.Serializable {
    private java.lang.Integer ariregistri_kood;

    private java.lang.String arinimi;

    public Paringesindus_iseendakohta_ettevote() {
    }

    public Paringesindus_iseendakohta_ettevote(
           java.lang.Integer ariregistri_kood,
           java.lang.String arinimi) {
           this.ariregistri_kood = ariregistri_kood;
           this.arinimi = arinimi;
    }


    /**
     * Gets the ariregistri_kood value for this Paringesindus_iseendakohta_ettevote.
     * 
     * @return ariregistri_kood
     */
    public java.lang.Integer getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Paringesindus_iseendakohta_ettevote.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.Integer ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the arinimi value for this Paringesindus_iseendakohta_ettevote.
     * 
     * @return arinimi
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }


    /**
     * Sets the arinimi value for this Paringesindus_iseendakohta_ettevote.
     * 
     * @param arinimi
     */
    public void setArinimi(java.lang.String arinimi) {
        this.arinimi = arinimi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringesindus_iseendakohta_ettevote)) return false;
        Paringesindus_iseendakohta_ettevote other = (Paringesindus_iseendakohta_ettevote) obj;
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
            ((this.arinimi==null && other.getArinimi()==null) || 
             (this.arinimi!=null &&
              this.arinimi.equals(other.getArinimi())));
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
        if (getArinimi() != null) {
            _hashCode += getArinimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
