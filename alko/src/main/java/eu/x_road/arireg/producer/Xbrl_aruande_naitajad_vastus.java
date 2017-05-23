/**
 * Xbrl_aruande_naitajad_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrl_aruande_naitajad_vastus  implements java.io.Serializable {
    private int status;

    private java.lang.String status_text;

    public Xbrl_aruande_naitajad_vastus() {
    }

    public Xbrl_aruande_naitajad_vastus(
           int status,
           java.lang.String status_text) {
           this.status = status;
           this.status_text = status_text;
    }


    /**
     * Gets the status value for this Xbrl_aruande_naitajad_vastus.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Xbrl_aruande_naitajad_vastus.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the status_text value for this Xbrl_aruande_naitajad_vastus.
     * 
     * @return status_text
     */
    public java.lang.String getStatus_text() {
        return status_text;
    }


    /**
     * Sets the status_text value for this Xbrl_aruande_naitajad_vastus.
     * 
     * @param status_text
     */
    public void setStatus_text(java.lang.String status_text) {
        this.status_text = status_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrl_aruande_naitajad_vastus)) return false;
        Xbrl_aruande_naitajad_vastus other = (Xbrl_aruande_naitajad_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.status_text==null && other.getStatus_text()==null) || 
             (this.status_text!=null &&
              this.status_text.equals(other.getStatus_text())));
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
        _hashCode += getStatus();
        if (getStatus_text() != null) {
            _hashCode += getStatus_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
