/**
 * TegevusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TegevusType  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.util.Date margeKP;

    private java.math.BigInteger kood;  // attribute

    private ee.x_road.mtr.producer.TegevusTyypType tyyp;  // attribute

    public TegevusType() {
    }

    public TegevusType(
           java.lang.String nimi,
           java.util.Date margeKP,
           java.math.BigInteger kood,
           ee.x_road.mtr.producer.TegevusTyypType tyyp) {
           this.nimi = nimi;
           this.margeKP = margeKP;
           this.kood = kood;
           this.tyyp = tyyp;
    }


    /**
     * Gets the nimi value for this TegevusType.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TegevusType.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the margeKP value for this TegevusType.
     * 
     * @return margeKP
     */
    public java.util.Date getMargeKP() {
        return margeKP;
    }


    /**
     * Sets the margeKP value for this TegevusType.
     * 
     * @param margeKP
     */
    public void setMargeKP(java.util.Date margeKP) {
        this.margeKP = margeKP;
    }


    /**
     * Gets the kood value for this TegevusType.
     * 
     * @return kood
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this TegevusType.
     * 
     * @param kood
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the tyyp value for this TegevusType.
     * 
     * @return tyyp
     */
    public ee.x_road.mtr.producer.TegevusTyypType getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this TegevusType.
     * 
     * @param tyyp
     */
    public void setTyyp(ee.x_road.mtr.producer.TegevusTyypType tyyp) {
        this.tyyp = tyyp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TegevusType)) return false;
        TegevusType other = (TegevusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.margeKP==null && other.getMargeKP()==null) || 
             (this.margeKP!=null &&
              this.margeKP.equals(other.getMargeKP()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getMargeKP() != null) {
            _hashCode += getMargeKP().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
