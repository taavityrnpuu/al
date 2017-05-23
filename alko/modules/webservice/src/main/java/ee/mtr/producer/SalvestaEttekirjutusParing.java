/**
 * SalvestaEttekirjutusParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaEttekirjutusParing  implements java.io.Serializable {
    private ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutus ettekirjutus;

    public SalvestaEttekirjutusParing() {
    }

    public SalvestaEttekirjutusParing(
           ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutus ettekirjutus) {
           this.ettekirjutus = ettekirjutus;
    }


    /**
     * Gets the ettekirjutus value for this SalvestaEttekirjutusParing.
     * 
     * @return ettekirjutus
     */
    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutus getEttekirjutus() {
        return ettekirjutus;
    }


    /**
     * Sets the ettekirjutus value for this SalvestaEttekirjutusParing.
     * 
     * @param ettekirjutus
     */
    public void setEttekirjutus(ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutus ettekirjutus) {
        this.ettekirjutus = ettekirjutus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaEttekirjutusParing)) return false;
        SalvestaEttekirjutusParing other = (SalvestaEttekirjutusParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettekirjutus==null && other.getEttekirjutus()==null) || 
             (this.ettekirjutus!=null &&
              this.ettekirjutus.equals(other.getEttekirjutus())));
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
        if (getEttekirjutus() != null) {
            _hashCode += getEttekirjutus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
