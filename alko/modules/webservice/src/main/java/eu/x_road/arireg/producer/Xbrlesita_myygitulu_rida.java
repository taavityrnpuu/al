/**
 * Xbrlesita_myygitulu_rida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesita_myygitulu_rida  implements java.io.Serializable {
    private java.lang.String emtak_kood;

    private java.lang.String emtak_versioon;

    private java.math.BigDecimal tulu;

    private java.math.BigDecimal tulu_protsent;

    private boolean pohitegevus;

    public Xbrlesita_myygitulu_rida() {
    }

    public Xbrlesita_myygitulu_rida(
           java.lang.String emtak_kood,
           java.lang.String emtak_versioon,
           java.math.BigDecimal tulu,
           java.math.BigDecimal tulu_protsent,
           boolean pohitegevus) {
           this.emtak_kood = emtak_kood;
           this.emtak_versioon = emtak_versioon;
           this.tulu = tulu;
           this.tulu_protsent = tulu_protsent;
           this.pohitegevus = pohitegevus;
    }


    /**
     * Gets the emtak_kood value for this Xbrlesita_myygitulu_rida.
     * 
     * @return emtak_kood
     */
    public java.lang.String getEmtak_kood() {
        return emtak_kood;
    }


    /**
     * Sets the emtak_kood value for this Xbrlesita_myygitulu_rida.
     * 
     * @param emtak_kood
     */
    public void setEmtak_kood(java.lang.String emtak_kood) {
        this.emtak_kood = emtak_kood;
    }


    /**
     * Gets the emtak_versioon value for this Xbrlesita_myygitulu_rida.
     * 
     * @return emtak_versioon
     */
    public java.lang.String getEmtak_versioon() {
        return emtak_versioon;
    }


    /**
     * Sets the emtak_versioon value for this Xbrlesita_myygitulu_rida.
     * 
     * @param emtak_versioon
     */
    public void setEmtak_versioon(java.lang.String emtak_versioon) {
        this.emtak_versioon = emtak_versioon;
    }


    /**
     * Gets the tulu value for this Xbrlesita_myygitulu_rida.
     * 
     * @return tulu
     */
    public java.math.BigDecimal getTulu() {
        return tulu;
    }


    /**
     * Sets the tulu value for this Xbrlesita_myygitulu_rida.
     * 
     * @param tulu
     */
    public void setTulu(java.math.BigDecimal tulu) {
        this.tulu = tulu;
    }


    /**
     * Gets the tulu_protsent value for this Xbrlesita_myygitulu_rida.
     * 
     * @return tulu_protsent
     */
    public java.math.BigDecimal getTulu_protsent() {
        return tulu_protsent;
    }


    /**
     * Sets the tulu_protsent value for this Xbrlesita_myygitulu_rida.
     * 
     * @param tulu_protsent
     */
    public void setTulu_protsent(java.math.BigDecimal tulu_protsent) {
        this.tulu_protsent = tulu_protsent;
    }


    /**
     * Gets the pohitegevus value for this Xbrlesita_myygitulu_rida.
     * 
     * @return pohitegevus
     */
    public boolean isPohitegevus() {
        return pohitegevus;
    }


    /**
     * Sets the pohitegevus value for this Xbrlesita_myygitulu_rida.
     * 
     * @param pohitegevus
     */
    public void setPohitegevus(boolean pohitegevus) {
        this.pohitegevus = pohitegevus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesita_myygitulu_rida)) return false;
        Xbrlesita_myygitulu_rida other = (Xbrlesita_myygitulu_rida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emtak_kood==null && other.getEmtak_kood()==null) || 
             (this.emtak_kood!=null &&
              this.emtak_kood.equals(other.getEmtak_kood()))) &&
            ((this.emtak_versioon==null && other.getEmtak_versioon()==null) || 
             (this.emtak_versioon!=null &&
              this.emtak_versioon.equals(other.getEmtak_versioon()))) &&
            ((this.tulu==null && other.getTulu()==null) || 
             (this.tulu!=null &&
              this.tulu.equals(other.getTulu()))) &&
            ((this.tulu_protsent==null && other.getTulu_protsent()==null) || 
             (this.tulu_protsent!=null &&
              this.tulu_protsent.equals(other.getTulu_protsent()))) &&
            this.pohitegevus == other.isPohitegevus();
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
        if (getEmtak_kood() != null) {
            _hashCode += getEmtak_kood().hashCode();
        }
        if (getEmtak_versioon() != null) {
            _hashCode += getEmtak_versioon().hashCode();
        }
        if (getTulu() != null) {
            _hashCode += getTulu().hashCode();
        }
        if (getTulu_protsent() != null) {
            _hashCode += getTulu_protsent().hashCode();
        }
        _hashCode += (isPohitegevus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
