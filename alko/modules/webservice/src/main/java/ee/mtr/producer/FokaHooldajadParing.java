/**
 * FokaHooldajadParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajadParing  implements java.io.Serializable {
    private ee.x_road.mtr.producer.FokaHooldajadParingTyyp tyyp;

    private ee.x_road.mtr.producer.FokaHooldajadParingAine aine;

    public FokaHooldajadParing() {
    }

    public FokaHooldajadParing(
           ee.x_road.mtr.producer.FokaHooldajadParingTyyp tyyp,
           ee.x_road.mtr.producer.FokaHooldajadParingAine aine) {
           this.tyyp = tyyp;
           this.aine = aine;
    }


    /**
     * Gets the tyyp value for this FokaHooldajadParing.
     * 
     * @return tyyp
     */
    public ee.x_road.mtr.producer.FokaHooldajadParingTyyp getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this FokaHooldajadParing.
     * 
     * @param tyyp
     */
    public void setTyyp(ee.x_road.mtr.producer.FokaHooldajadParingTyyp tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the aine value for this FokaHooldajadParing.
     * 
     * @return aine
     */
    public ee.x_road.mtr.producer.FokaHooldajadParingAine getAine() {
        return aine;
    }


    /**
     * Sets the aine value for this FokaHooldajadParing.
     * 
     * @param aine
     */
    public void setAine(ee.x_road.mtr.producer.FokaHooldajadParingAine aine) {
        this.aine = aine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FokaHooldajadParing)) return false;
        FokaHooldajadParing other = (FokaHooldajadParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.aine==null && other.getAine()==null) || 
             (this.aine!=null &&
              this.aine.equals(other.getAine())));
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getAine() != null) {
            _hashCode += getAine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
