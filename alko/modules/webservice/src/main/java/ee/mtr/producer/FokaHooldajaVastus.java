/**
 * FokaHooldajaVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajaVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldaja foka_hooldaja;

    public FokaHooldajaVastus() {
    }

    public FokaHooldajaVastus(
           ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldaja foka_hooldaja) {
           this.foka_hooldaja = foka_hooldaja;
    }


    /**
     * Gets the foka_hooldaja value for this FokaHooldajaVastus.
     * 
     * @return foka_hooldaja
     */
    public ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldaja getFoka_hooldaja() {
        return foka_hooldaja;
    }


    /**
     * Sets the foka_hooldaja value for this FokaHooldajaVastus.
     * 
     * @param foka_hooldaja
     */
    public void setFoka_hooldaja(ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldaja foka_hooldaja) {
        this.foka_hooldaja = foka_hooldaja;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FokaHooldajaVastus)) return false;
        FokaHooldajaVastus other = (FokaHooldajaVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.foka_hooldaja==null && other.getFoka_hooldaja()==null) || 
             (this.foka_hooldaja!=null &&
              this.foka_hooldaja.equals(other.getFoka_hooldaja())));
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
        if (getFoka_hooldaja() != null) {
            _hashCode += getFoka_hooldaja().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
