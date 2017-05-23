/**
 * KinnisasiType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class KinnisasiType_v4  implements java.io.Serializable {
    private java.lang.String tegevus;

    private java.lang.String number;

    private eu.x_road.arireg.producer.AadressType_v4 aadress;

    public KinnisasiType_v4() {
    }

    public KinnisasiType_v4(
           java.lang.String tegevus,
           java.lang.String number,
           eu.x_road.arireg.producer.AadressType_v4 aadress) {
           this.tegevus = tegevus;
           this.number = number;
           this.aadress = aadress;
    }


    /**
     * Gets the tegevus value for this KinnisasiType_v4.
     * 
     * @return tegevus
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this KinnisasiType_v4.
     * 
     * @param tegevus
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }


    /**
     * Gets the number value for this KinnisasiType_v4.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this KinnisasiType_v4.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the aadress value for this KinnisasiType_v4.
     * 
     * @return aadress
     */
    public eu.x_road.arireg.producer.AadressType_v4 getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this KinnisasiType_v4.
     * 
     * @param aadress
     */
    public void setAadress(eu.x_road.arireg.producer.AadressType_v4 aadress) {
        this.aadress = aadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KinnisasiType_v4)) return false;
        KinnisasiType_v4 other = (KinnisasiType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress())));
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
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
