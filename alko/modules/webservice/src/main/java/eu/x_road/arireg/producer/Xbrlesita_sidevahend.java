/**
 * Xbrlesita_sidevahend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesita_sidevahend  implements java.io.Serializable {
    private eu.x_road.arireg.producer.X_sideliik liik;

    private java.lang.String number;

    public Xbrlesita_sidevahend() {
    }

    public Xbrlesita_sidevahend(
           eu.x_road.arireg.producer.X_sideliik liik,
           java.lang.String number) {
           this.liik = liik;
           this.number = number;
    }


    /**
     * Gets the liik value for this Xbrlesita_sidevahend.
     * 
     * @return liik
     */
    public eu.x_road.arireg.producer.X_sideliik getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Xbrlesita_sidevahend.
     * 
     * @param liik
     */
    public void setLiik(eu.x_road.arireg.producer.X_sideliik liik) {
        this.liik = liik;
    }


    /**
     * Gets the number value for this Xbrlesita_sidevahend.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Xbrlesita_sidevahend.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesita_sidevahend)) return false;
        Xbrlesita_sidevahend other = (Xbrlesita_sidevahend) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
