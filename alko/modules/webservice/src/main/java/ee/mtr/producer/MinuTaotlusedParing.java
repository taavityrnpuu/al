/**
 * MinuTaotlusedParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class MinuTaotlusedParing  implements java.io.Serializable {
    private java.util.Date sisestamiseAegAlates;

    private java.util.Date sisestamiseAegKuni;

    private java.lang.String number;

    private java.lang.String olek;

    private java.lang.String jarjestamiseTulp;

    private java.lang.String jarjestamiseSuund;

    private java.math.BigInteger lehekylg;

    public MinuTaotlusedParing() {
    }

    public MinuTaotlusedParing(
           java.util.Date sisestamiseAegAlates,
           java.util.Date sisestamiseAegKuni,
           java.lang.String number,
           java.lang.String olek,
           java.lang.String jarjestamiseTulp,
           java.lang.String jarjestamiseSuund,
           java.math.BigInteger lehekylg) {
           this.sisestamiseAegAlates = sisestamiseAegAlates;
           this.sisestamiseAegKuni = sisestamiseAegKuni;
           this.number = number;
           this.olek = olek;
           this.jarjestamiseTulp = jarjestamiseTulp;
           this.jarjestamiseSuund = jarjestamiseSuund;
           this.lehekylg = lehekylg;
    }


    /**
     * Gets the sisestamiseAegAlates value for this MinuTaotlusedParing.
     * 
     * @return sisestamiseAegAlates
     */
    public java.util.Date getSisestamiseAegAlates() {
        return sisestamiseAegAlates;
    }


    /**
     * Sets the sisestamiseAegAlates value for this MinuTaotlusedParing.
     * 
     * @param sisestamiseAegAlates
     */
    public void setSisestamiseAegAlates(java.util.Date sisestamiseAegAlates) {
        this.sisestamiseAegAlates = sisestamiseAegAlates;
    }


    /**
     * Gets the sisestamiseAegKuni value for this MinuTaotlusedParing.
     * 
     * @return sisestamiseAegKuni
     */
    public java.util.Date getSisestamiseAegKuni() {
        return sisestamiseAegKuni;
    }


    /**
     * Sets the sisestamiseAegKuni value for this MinuTaotlusedParing.
     * 
     * @param sisestamiseAegKuni
     */
    public void setSisestamiseAegKuni(java.util.Date sisestamiseAegKuni) {
        this.sisestamiseAegKuni = sisestamiseAegKuni;
    }


    /**
     * Gets the number value for this MinuTaotlusedParing.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this MinuTaotlusedParing.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the olek value for this MinuTaotlusedParing.
     * 
     * @return olek
     */
    public java.lang.String getOlek() {
        return olek;
    }


    /**
     * Sets the olek value for this MinuTaotlusedParing.
     * 
     * @param olek
     */
    public void setOlek(java.lang.String olek) {
        this.olek = olek;
    }


    /**
     * Gets the jarjestamiseTulp value for this MinuTaotlusedParing.
     * 
     * @return jarjestamiseTulp
     */
    public java.lang.String getJarjestamiseTulp() {
        return jarjestamiseTulp;
    }


    /**
     * Sets the jarjestamiseTulp value for this MinuTaotlusedParing.
     * 
     * @param jarjestamiseTulp
     */
    public void setJarjestamiseTulp(java.lang.String jarjestamiseTulp) {
        this.jarjestamiseTulp = jarjestamiseTulp;
    }


    /**
     * Gets the jarjestamiseSuund value for this MinuTaotlusedParing.
     * 
     * @return jarjestamiseSuund
     */
    public java.lang.String getJarjestamiseSuund() {
        return jarjestamiseSuund;
    }


    /**
     * Sets the jarjestamiseSuund value for this MinuTaotlusedParing.
     * 
     * @param jarjestamiseSuund
     */
    public void setJarjestamiseSuund(java.lang.String jarjestamiseSuund) {
        this.jarjestamiseSuund = jarjestamiseSuund;
    }


    /**
     * Gets the lehekylg value for this MinuTaotlusedParing.
     * 
     * @return lehekylg
     */
    public java.math.BigInteger getLehekylg() {
        return lehekylg;
    }


    /**
     * Sets the lehekylg value for this MinuTaotlusedParing.
     * 
     * @param lehekylg
     */
    public void setLehekylg(java.math.BigInteger lehekylg) {
        this.lehekylg = lehekylg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinuTaotlusedParing)) return false;
        MinuTaotlusedParing other = (MinuTaotlusedParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sisestamiseAegAlates==null && other.getSisestamiseAegAlates()==null) || 
             (this.sisestamiseAegAlates!=null &&
              this.sisestamiseAegAlates.equals(other.getSisestamiseAegAlates()))) &&
            ((this.sisestamiseAegKuni==null && other.getSisestamiseAegKuni()==null) || 
             (this.sisestamiseAegKuni!=null &&
              this.sisestamiseAegKuni.equals(other.getSisestamiseAegKuni()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.olek==null && other.getOlek()==null) || 
             (this.olek!=null &&
              this.olek.equals(other.getOlek()))) &&
            ((this.jarjestamiseTulp==null && other.getJarjestamiseTulp()==null) || 
             (this.jarjestamiseTulp!=null &&
              this.jarjestamiseTulp.equals(other.getJarjestamiseTulp()))) &&
            ((this.jarjestamiseSuund==null && other.getJarjestamiseSuund()==null) || 
             (this.jarjestamiseSuund!=null &&
              this.jarjestamiseSuund.equals(other.getJarjestamiseSuund()))) &&
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
        if (getSisestamiseAegAlates() != null) {
            _hashCode += getSisestamiseAegAlates().hashCode();
        }
        if (getSisestamiseAegKuni() != null) {
            _hashCode += getSisestamiseAegKuni().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOlek() != null) {
            _hashCode += getOlek().hashCode();
        }
        if (getJarjestamiseTulp() != null) {
            _hashCode += getJarjestamiseTulp().hashCode();
        }
        if (getJarjestamiseSuund() != null) {
            _hashCode += getJarjestamiseSuund().hashCode();
        }
        if (getLehekylg() != null) {
            _hashCode += getLehekylg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
