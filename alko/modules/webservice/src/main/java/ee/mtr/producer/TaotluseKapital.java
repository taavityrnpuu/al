/**
 * TaotluseKapital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseKapital  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String registrikood;

    private double suurus;

    private java.lang.String valuuta;

    public TaotluseKapital() {
    }

    public TaotluseKapital(
           java.math.BigInteger id,
           java.lang.String registrikood,
           double suurus,
           java.lang.String valuuta) {
           this.id = id;
           this.registrikood = registrikood;
           this.suurus = suurus;
           this.valuuta = valuuta;
    }


    /**
     * Gets the id value for this TaotluseKapital.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this TaotluseKapital.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the registrikood value for this TaotluseKapital.
     * 
     * @return registrikood
     */
    public java.lang.String getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this TaotluseKapital.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.lang.String registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the suurus value for this TaotluseKapital.
     * 
     * @return suurus
     */
    public double getSuurus() {
        return suurus;
    }


    /**
     * Sets the suurus value for this TaotluseKapital.
     * 
     * @param suurus
     */
    public void setSuurus(double suurus) {
        this.suurus = suurus;
    }


    /**
     * Gets the valuuta value for this TaotluseKapital.
     * 
     * @return valuuta
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }


    /**
     * Sets the valuuta value for this TaotluseKapital.
     * 
     * @param valuuta
     */
    public void setValuuta(java.lang.String valuuta) {
        this.valuuta = valuuta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseKapital)) return false;
        TaotluseKapital other = (TaotluseKapital) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood()))) &&
            this.suurus == other.getSuurus() &&
            ((this.valuuta==null && other.getValuuta()==null) || 
             (this.valuuta!=null &&
              this.valuuta.equals(other.getValuuta())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        _hashCode += new Double(getSuurus()).hashCode();
        if (getValuuta() != null) {
            _hashCode += getValuuta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
