/**
 * Xbrl_aruande_myygitulu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrl_aruande_myygitulu  implements java.io.Serializable {
    private java.lang.String emtak_kood;

    private java.lang.String emtak_versioon;

    private java.math.BigDecimal summa;

    private java.math.BigDecimal summa_protsent;

    private java.math.BigDecimal summa_koef;

    private boolean pohitegevus;

    public Xbrl_aruande_myygitulu() {
    }

    public Xbrl_aruande_myygitulu(
           java.lang.String emtak_kood,
           java.lang.String emtak_versioon,
           java.math.BigDecimal summa,
           java.math.BigDecimal summa_protsent,
           java.math.BigDecimal summa_koef,
           boolean pohitegevus) {
           this.emtak_kood = emtak_kood;
           this.emtak_versioon = emtak_versioon;
           this.summa = summa;
           this.summa_protsent = summa_protsent;
           this.summa_koef = summa_koef;
           this.pohitegevus = pohitegevus;
    }


    /**
     * Gets the emtak_kood value for this Xbrl_aruande_myygitulu.
     * 
     * @return emtak_kood
     */
    public java.lang.String getEmtak_kood() {
        return emtak_kood;
    }


    /**
     * Sets the emtak_kood value for this Xbrl_aruande_myygitulu.
     * 
     * @param emtak_kood
     */
    public void setEmtak_kood(java.lang.String emtak_kood) {
        this.emtak_kood = emtak_kood;
    }


    /**
     * Gets the emtak_versioon value for this Xbrl_aruande_myygitulu.
     * 
     * @return emtak_versioon
     */
    public java.lang.String getEmtak_versioon() {
        return emtak_versioon;
    }


    /**
     * Sets the emtak_versioon value for this Xbrl_aruande_myygitulu.
     * 
     * @param emtak_versioon
     */
    public void setEmtak_versioon(java.lang.String emtak_versioon) {
        this.emtak_versioon = emtak_versioon;
    }


    /**
     * Gets the summa value for this Xbrl_aruande_myygitulu.
     * 
     * @return summa
     */
    public java.math.BigDecimal getSumma() {
        return summa;
    }


    /**
     * Sets the summa value for this Xbrl_aruande_myygitulu.
     * 
     * @param summa
     */
    public void setSumma(java.math.BigDecimal summa) {
        this.summa = summa;
    }


    /**
     * Gets the summa_protsent value for this Xbrl_aruande_myygitulu.
     * 
     * @return summa_protsent
     */
    public java.math.BigDecimal getSumma_protsent() {
        return summa_protsent;
    }


    /**
     * Sets the summa_protsent value for this Xbrl_aruande_myygitulu.
     * 
     * @param summa_protsent
     */
    public void setSumma_protsent(java.math.BigDecimal summa_protsent) {
        this.summa_protsent = summa_protsent;
    }


    /**
     * Gets the summa_koef value for this Xbrl_aruande_myygitulu.
     * 
     * @return summa_koef
     */
    public java.math.BigDecimal getSumma_koef() {
        return summa_koef;
    }


    /**
     * Sets the summa_koef value for this Xbrl_aruande_myygitulu.
     * 
     * @param summa_koef
     */
    public void setSumma_koef(java.math.BigDecimal summa_koef) {
        this.summa_koef = summa_koef;
    }


    /**
     * Gets the pohitegevus value for this Xbrl_aruande_myygitulu.
     * 
     * @return pohitegevus
     */
    public boolean isPohitegevus() {
        return pohitegevus;
    }


    /**
     * Sets the pohitegevus value for this Xbrl_aruande_myygitulu.
     * 
     * @param pohitegevus
     */
    public void setPohitegevus(boolean pohitegevus) {
        this.pohitegevus = pohitegevus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrl_aruande_myygitulu)) return false;
        Xbrl_aruande_myygitulu other = (Xbrl_aruande_myygitulu) obj;
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
            ((this.summa==null && other.getSumma()==null) || 
             (this.summa!=null &&
              this.summa.equals(other.getSumma()))) &&
            ((this.summa_protsent==null && other.getSumma_protsent()==null) || 
             (this.summa_protsent!=null &&
              this.summa_protsent.equals(other.getSumma_protsent()))) &&
            ((this.summa_koef==null && other.getSumma_koef()==null) || 
             (this.summa_koef!=null &&
              this.summa_koef.equals(other.getSumma_koef()))) &&
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
        if (getSumma() != null) {
            _hashCode += getSumma().hashCode();
        }
        if (getSumma_protsent() != null) {
            _hashCode += getSumma_protsent().hashCode();
        }
        if (getSumma_koef() != null) {
            _hashCode += getSumma_koef().hashCode();
        }
        _hashCode += (isPohitegevus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
