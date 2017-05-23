/**
 * EVapiLooKanneTegevusala_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneTegevusala_v1  implements java.io.Serializable {
    private java.lang.String emtak_kood;

    private java.lang.Integer versioon;

    private java.lang.String nimetus;

    public EVapiLooKanneTegevusala_v1() {
    }

    public EVapiLooKanneTegevusala_v1(
           java.lang.String emtak_kood,
           java.lang.Integer versioon,
           java.lang.String nimetus) {
           this.emtak_kood = emtak_kood;
           this.versioon = versioon;
           this.nimetus = nimetus;
    }


    /**
     * Gets the emtak_kood value for this EVapiLooKanneTegevusala_v1.
     * 
     * @return emtak_kood
     */
    public java.lang.String getEmtak_kood() {
        return emtak_kood;
    }


    /**
     * Sets the emtak_kood value for this EVapiLooKanneTegevusala_v1.
     * 
     * @param emtak_kood
     */
    public void setEmtak_kood(java.lang.String emtak_kood) {
        this.emtak_kood = emtak_kood;
    }


    /**
     * Gets the versioon value for this EVapiLooKanneTegevusala_v1.
     * 
     * @return versioon
     */
    public java.lang.Integer getVersioon() {
        return versioon;
    }


    /**
     * Sets the versioon value for this EVapiLooKanneTegevusala_v1.
     * 
     * @param versioon
     */
    public void setVersioon(java.lang.Integer versioon) {
        this.versioon = versioon;
    }


    /**
     * Gets the nimetus value for this EVapiLooKanneTegevusala_v1.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this EVapiLooKanneTegevusala_v1.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneTegevusala_v1)) return false;
        EVapiLooKanneTegevusala_v1 other = (EVapiLooKanneTegevusala_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emtak_kood==null && other.getEmtak_kood()==null) || 
             (this.emtak_kood!=null &&
              this.emtak_kood.equals(other.getEmtak_kood()))) &&
            ((this.versioon==null && other.getVersioon()==null) || 
             (this.versioon!=null &&
              this.versioon.equals(other.getVersioon()))) &&
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus())));
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
        if (getEmtak_kood() != null) {
            _hashCode += getEmtak_kood().hashCode();
        }
        if (getVersioon() != null) {
            _hashCode += getVersioon().hashCode();
        }
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
