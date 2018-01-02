/**
 * Erakonnanimekiri_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Erakonnanimekiri_paring  implements java.io.Serializable {
    private java.math.BigInteger kood;

    private java.math.BigInteger lehekylg;

    public Erakonnanimekiri_paring() {
    }

    public Erakonnanimekiri_paring(
           java.math.BigInteger kood,
           java.math.BigInteger lehekylg) {
           this.kood = kood;
           this.lehekylg = lehekylg;
    }


    /**
     * Gets the kood value for this Erakonnanimekiri_paring.
     * 
     * @return kood
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this Erakonnanimekiri_paring.
     * 
     * @param kood
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the lehekylg value for this Erakonnanimekiri_paring.
     * 
     * @return lehekylg
     */
    public java.math.BigInteger getLehekylg() {
        return lehekylg;
    }


    /**
     * Sets the lehekylg value for this Erakonnanimekiri_paring.
     * 
     * @param lehekylg
     */
    public void setLehekylg(java.math.BigInteger lehekylg) {
        this.lehekylg = lehekylg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erakonnanimekiri_paring)) return false;
        Erakonnanimekiri_paring other = (Erakonnanimekiri_paring) obj;
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
            ((this.lehekylg==null && other.getLehekylg()==null) || 
             (this.lehekylg!=null &&
              this.lehekylg.equals(other.getLehekylg())));
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
        if (getLehekylg() != null) {
            _hashCode += getLehekylg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
