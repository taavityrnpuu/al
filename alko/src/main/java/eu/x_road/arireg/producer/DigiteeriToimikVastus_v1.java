/**
 * DigiteeriToimikVastus_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class DigiteeriToimikVastus_v1  implements java.io.Serializable {
    /* Teenuse vastus masinloetava koodina */
    private java.math.BigInteger kood;

    /* Teenuse vastus tekstina */
    private java.lang.String teade;

    public DigiteeriToimikVastus_v1() {
    }

    public DigiteeriToimikVastus_v1(
           java.math.BigInteger kood,
           java.lang.String teade) {
           this.kood = kood;
           this.teade = teade;
    }


    /**
     * Gets the kood value for this DigiteeriToimikVastus_v1.
     * 
     * @return kood   * Teenuse vastus masinloetava koodina
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this DigiteeriToimikVastus_v1.
     * 
     * @param kood   * Teenuse vastus masinloetava koodina
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the teade value for this DigiteeriToimikVastus_v1.
     * 
     * @return teade   * Teenuse vastus tekstina
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this DigiteeriToimikVastus_v1.
     * 
     * @param teade   * Teenuse vastus tekstina
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigiteeriToimikVastus_v1)) return false;
        DigiteeriToimikVastus_v1 other = (DigiteeriToimikVastus_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade())));
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
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
