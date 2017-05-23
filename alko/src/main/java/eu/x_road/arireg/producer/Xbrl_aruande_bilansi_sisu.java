/**
 * Xbrl_aruande_bilansi_sisu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrl_aruande_bilansi_sisu  implements java.io.Serializable {
    private java.math.BigInteger maketi_id;

    private java.math.BigInteger naitaja_id;

    private java.lang.String bil_veerg;

    private java.lang.String vaartus;

    public Xbrl_aruande_bilansi_sisu() {
    }

    public Xbrl_aruande_bilansi_sisu(
           java.math.BigInteger maketi_id,
           java.math.BigInteger naitaja_id,
           java.lang.String bil_veerg,
           java.lang.String vaartus) {
           this.maketi_id = maketi_id;
           this.naitaja_id = naitaja_id;
           this.bil_veerg = bil_veerg;
           this.vaartus = vaartus;
    }


    /**
     * Gets the maketi_id value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @return maketi_id
     */
    public java.math.BigInteger getMaketi_id() {
        return maketi_id;
    }


    /**
     * Sets the maketi_id value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @param maketi_id
     */
    public void setMaketi_id(java.math.BigInteger maketi_id) {
        this.maketi_id = maketi_id;
    }


    /**
     * Gets the naitaja_id value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @return naitaja_id
     */
    public java.math.BigInteger getNaitaja_id() {
        return naitaja_id;
    }


    /**
     * Sets the naitaja_id value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @param naitaja_id
     */
    public void setNaitaja_id(java.math.BigInteger naitaja_id) {
        this.naitaja_id = naitaja_id;
    }


    /**
     * Gets the bil_veerg value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @return bil_veerg
     */
    public java.lang.String getBil_veerg() {
        return bil_veerg;
    }


    /**
     * Sets the bil_veerg value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @param bil_veerg
     */
    public void setBil_veerg(java.lang.String bil_veerg) {
        this.bil_veerg = bil_veerg;
    }


    /**
     * Gets the vaartus value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @return vaartus
     */
    public java.lang.String getVaartus() {
        return vaartus;
    }


    /**
     * Sets the vaartus value for this Xbrl_aruande_bilansi_sisu.
     * 
     * @param vaartus
     */
    public void setVaartus(java.lang.String vaartus) {
        this.vaartus = vaartus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrl_aruande_bilansi_sisu)) return false;
        Xbrl_aruande_bilansi_sisu other = (Xbrl_aruande_bilansi_sisu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maketi_id==null && other.getMaketi_id()==null) || 
             (this.maketi_id!=null &&
              this.maketi_id.equals(other.getMaketi_id()))) &&
            ((this.naitaja_id==null && other.getNaitaja_id()==null) || 
             (this.naitaja_id!=null &&
              this.naitaja_id.equals(other.getNaitaja_id()))) &&
            ((this.bil_veerg==null && other.getBil_veerg()==null) || 
             (this.bil_veerg!=null &&
              this.bil_veerg.equals(other.getBil_veerg()))) &&
            ((this.vaartus==null && other.getVaartus()==null) || 
             (this.vaartus!=null &&
              this.vaartus.equals(other.getVaartus())));
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
        if (getMaketi_id() != null) {
            _hashCode += getMaketi_id().hashCode();
        }
        if (getNaitaja_id() != null) {
            _hashCode += getNaitaja_id().hashCode();
        }
        if (getBil_veerg() != null) {
            _hashCode += getBil_veerg().hashCode();
        }
        if (getVaartus() != null) {
            _hashCode += getVaartus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
