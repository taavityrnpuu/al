/**
 * TaotluseEttevotja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseEttevotja  implements java.io.Serializable {
    private java.lang.String registrikood;

    private java.lang.String nimi;

    public TaotluseEttevotja() {
    }

    public TaotluseEttevotja(
           java.lang.String registrikood,
           java.lang.String nimi) {
           this.registrikood = registrikood;
           this.nimi = nimi;
    }


    /**
     * Gets the registrikood value for this TaotluseEttevotja.
     * 
     * @return registrikood
     */
    public java.lang.String getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this TaotluseEttevotja.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.lang.String registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the nimi value for this TaotluseEttevotja.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseEttevotja.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseEttevotja)) return false;
        TaotluseEttevotja other = (TaotluseEttevotja) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi())));
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
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
