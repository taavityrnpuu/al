/**
 * Tagatis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Tagatis  implements java.io.Serializable {
    private java.math.BigDecimal kindlustussumma;

    private java.lang.String rahaühik;

    private java.util.Calendar kehtivuseAlgus;

    private java.util.Calendar kehtivuseLõpp;

    private java.lang.String väljaandjaNimi;

    private java.lang.String väljaandjaRegistrikood;

    public Tagatis() {
    }

    public Tagatis(
           java.math.BigDecimal kindlustussumma,
           java.lang.String rahaühik,
           java.util.Calendar kehtivuseAlgus,
           java.util.Calendar kehtivuseLõpp,
           java.lang.String väljaandjaNimi,
           java.lang.String väljaandjaRegistrikood) {
           this.kindlustussumma = kindlustussumma;
           this.rahaühik = rahaühik;
           this.kehtivuseAlgus = kehtivuseAlgus;
           this.kehtivuseLõpp = kehtivuseLõpp;
           this.väljaandjaNimi = väljaandjaNimi;
           this.väljaandjaRegistrikood = väljaandjaRegistrikood;
    }


    /**
     * Gets the kindlustussumma value for this Tagatis.
     * 
     * @return kindlustussumma
     */
    public java.math.BigDecimal getKindlustussumma() {
        return kindlustussumma;
    }


    /**
     * Sets the kindlustussumma value for this Tagatis.
     * 
     * @param kindlustussumma
     */
    public void setKindlustussumma(java.math.BigDecimal kindlustussumma) {
        this.kindlustussumma = kindlustussumma;
    }


    /**
     * Gets the rahaühik value for this Tagatis.
     * 
     * @return rahaühik
     */
    public java.lang.String getRahaühik() {
        return rahaühik;
    }


    /**
     * Sets the rahaühik value for this Tagatis.
     * 
     * @param rahaühik
     */
    public void setRahaühik(java.lang.String rahaühik) {
        this.rahaühik = rahaühik;
    }


    /**
     * Gets the kehtivuseAlgus value for this Tagatis.
     * 
     * @return kehtivuseAlgus
     */
    public java.util.Calendar getKehtivuseAlgus() {
        return kehtivuseAlgus;
    }


    /**
     * Sets the kehtivuseAlgus value for this Tagatis.
     * 
     * @param kehtivuseAlgus
     */
    public void setKehtivuseAlgus(java.util.Calendar kehtivuseAlgus) {
        this.kehtivuseAlgus = kehtivuseAlgus;
    }


    /**
     * Gets the kehtivuseLõpp value for this Tagatis.
     * 
     * @return kehtivuseLõpp
     */
    public java.util.Calendar getKehtivuseLõpp() {
        return kehtivuseLõpp;
    }


    /**
     * Sets the kehtivuseLõpp value for this Tagatis.
     * 
     * @param kehtivuseLõpp
     */
    public void setKehtivuseLõpp(java.util.Calendar kehtivuseLõpp) {
        this.kehtivuseLõpp = kehtivuseLõpp;
    }


    /**
     * Gets the väljaandjaNimi value for this Tagatis.
     * 
     * @return väljaandjaNimi
     */
    public java.lang.String getVäljaandjaNimi() {
        return väljaandjaNimi;
    }


    /**
     * Sets the väljaandjaNimi value for this Tagatis.
     * 
     * @param väljaandjaNimi
     */
    public void setVäljaandjaNimi(java.lang.String väljaandjaNimi) {
        this.väljaandjaNimi = väljaandjaNimi;
    }


    /**
     * Gets the väljaandjaRegistrikood value for this Tagatis.
     * 
     * @return väljaandjaRegistrikood
     */
    public java.lang.String getVäljaandjaRegistrikood() {
        return väljaandjaRegistrikood;
    }


    /**
     * Sets the väljaandjaRegistrikood value for this Tagatis.
     * 
     * @param väljaandjaRegistrikood
     */
    public void setVäljaandjaRegistrikood(java.lang.String väljaandjaRegistrikood) {
        this.väljaandjaRegistrikood = väljaandjaRegistrikood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tagatis)) return false;
        Tagatis other = (Tagatis) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kindlustussumma==null && other.getKindlustussumma()==null) || 
             (this.kindlustussumma!=null &&
              this.kindlustussumma.equals(other.getKindlustussumma()))) &&
            ((this.rahaühik==null && other.getRahaühik()==null) || 
             (this.rahaühik!=null &&
              this.rahaühik.equals(other.getRahaühik()))) &&
            ((this.kehtivuseAlgus==null && other.getKehtivuseAlgus()==null) || 
             (this.kehtivuseAlgus!=null &&
              this.kehtivuseAlgus.equals(other.getKehtivuseAlgus()))) &&
            ((this.kehtivuseLõpp==null && other.getKehtivuseLõpp()==null) || 
             (this.kehtivuseLõpp!=null &&
              this.kehtivuseLõpp.equals(other.getKehtivuseLõpp()))) &&
            ((this.väljaandjaNimi==null && other.getVäljaandjaNimi()==null) || 
             (this.väljaandjaNimi!=null &&
              this.väljaandjaNimi.equals(other.getVäljaandjaNimi()))) &&
            ((this.väljaandjaRegistrikood==null && other.getVäljaandjaRegistrikood()==null) || 
             (this.väljaandjaRegistrikood!=null &&
              this.väljaandjaRegistrikood.equals(other.getVäljaandjaRegistrikood())));
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
        if (getKindlustussumma() != null) {
            _hashCode += getKindlustussumma().hashCode();
        }
        if (getRahaühik() != null) {
            _hashCode += getRahaühik().hashCode();
        }
        if (getKehtivuseAlgus() != null) {
            _hashCode += getKehtivuseAlgus().hashCode();
        }
        if (getKehtivuseLõpp() != null) {
            _hashCode += getKehtivuseLõpp().hashCode();
        }
        if (getVäljaandjaNimi() != null) {
            _hashCode += getVäljaandjaNimi().hashCode();
        }
        if (getVäljaandjaRegistrikood() != null) {
            _hashCode += getVäljaandjaRegistrikood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
