/**
 * TaotluseLoendiVaartus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseLoendiVaartus  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String vaartus;

    private boolean peidetud;

    public TaotluseLoendiVaartus() {
    }

    public TaotluseLoendiVaartus(
           java.lang.String nimi,
           java.lang.String vaartus,
           boolean peidetud) {
           this.nimi = nimi;
           this.vaartus = vaartus;
           this.peidetud = peidetud;
    }


    /**
     * Gets the nimi value for this TaotluseLoendiVaartus.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseLoendiVaartus.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the vaartus value for this TaotluseLoendiVaartus.
     * 
     * @return vaartus
     */
    public java.lang.String getVaartus() {
        return vaartus;
    }


    /**
     * Sets the vaartus value for this TaotluseLoendiVaartus.
     * 
     * @param vaartus
     */
    public void setVaartus(java.lang.String vaartus) {
        this.vaartus = vaartus;
    }


    /**
     * Gets the peidetud value for this TaotluseLoendiVaartus.
     * 
     * @return peidetud
     */
    public boolean isPeidetud() {
        return peidetud;
    }


    /**
     * Sets the peidetud value for this TaotluseLoendiVaartus.
     * 
     * @param peidetud
     */
    public void setPeidetud(boolean peidetud) {
        this.peidetud = peidetud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseLoendiVaartus)) return false;
        TaotluseLoendiVaartus other = (TaotluseLoendiVaartus) obj;
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
            ((this.vaartus==null && other.getVaartus()==null) || 
             (this.vaartus!=null &&
              this.vaartus.equals(other.getVaartus()))) &&
            this.peidetud == other.isPeidetud();
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
        if (getVaartus() != null) {
            _hashCode += getVaartus().hashCode();
        }
        _hashCode += (isPeidetud() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
