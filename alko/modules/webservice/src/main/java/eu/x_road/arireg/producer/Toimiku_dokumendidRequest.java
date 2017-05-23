/**
 * Toimiku_dokumendidRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Toimiku_dokumendidRequest  implements java.io.Serializable {
    /* Äriregistri kood */
    private int ariregistri_kood;

    public Toimiku_dokumendidRequest() {
    }

    public Toimiku_dokumendidRequest(
           int ariregistri_kood) {
           this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the ariregistri_kood value for this Toimiku_dokumendidRequest.
     * 
     * @return ariregistri_kood   * Äriregistri kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Toimiku_dokumendidRequest.
     * 
     * @param ariregistri_kood   * Äriregistri kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Toimiku_dokumendidRequest)) return false;
        Toimiku_dokumendidRequest other = (Toimiku_dokumendidRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        _hashCode += getAriregistri_kood();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
