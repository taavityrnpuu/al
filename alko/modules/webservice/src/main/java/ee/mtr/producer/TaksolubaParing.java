/**
 * TaksolubaParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaksolubaParing  implements java.io.Serializable {
    private java.lang.String soidukiRegNr;

    private java.util.Date kontrollitavKuupaev;

    public TaksolubaParing() {
    }

    public TaksolubaParing(
           java.lang.String soidukiRegNr,
           java.util.Date kontrollitavKuupaev) {
           this.soidukiRegNr = soidukiRegNr;
           this.kontrollitavKuupaev = kontrollitavKuupaev;
    }


    /**
     * Gets the soidukiRegNr value for this TaksolubaParing.
     * 
     * @return soidukiRegNr
     */
    public java.lang.String getSoidukiRegNr() {
        return soidukiRegNr;
    }


    /**
     * Sets the soidukiRegNr value for this TaksolubaParing.
     * 
     * @param soidukiRegNr
     */
    public void setSoidukiRegNr(java.lang.String soidukiRegNr) {
        this.soidukiRegNr = soidukiRegNr;
    }


    /**
     * Gets the kontrollitavKuupaev value for this TaksolubaParing.
     * 
     * @return kontrollitavKuupaev
     */
    public java.util.Date getKontrollitavKuupaev() {
        return kontrollitavKuupaev;
    }


    /**
     * Sets the kontrollitavKuupaev value for this TaksolubaParing.
     * 
     * @param kontrollitavKuupaev
     */
    public void setKontrollitavKuupaev(java.util.Date kontrollitavKuupaev) {
        this.kontrollitavKuupaev = kontrollitavKuupaev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaksolubaParing)) return false;
        TaksolubaParing other = (TaksolubaParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soidukiRegNr==null && other.getSoidukiRegNr()==null) || 
             (this.soidukiRegNr!=null &&
              this.soidukiRegNr.equals(other.getSoidukiRegNr()))) &&
            ((this.kontrollitavKuupaev==null && other.getKontrollitavKuupaev()==null) || 
             (this.kontrollitavKuupaev!=null &&
              this.kontrollitavKuupaev.equals(other.getKontrollitavKuupaev())));
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
        if (getSoidukiRegNr() != null) {
            _hashCode += getSoidukiRegNr().hashCode();
        }
        if (getKontrollitavKuupaev() != null) {
            _hashCode += getKontrollitavKuupaev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
