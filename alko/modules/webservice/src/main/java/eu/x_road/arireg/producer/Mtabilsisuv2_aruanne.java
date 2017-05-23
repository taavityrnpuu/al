/**
 * Mtabilsisuv2_aruanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtabilsisuv2_aruanne  implements java.io.Serializable {
    private java.math.BigInteger bil_id;

    private java.lang.String maketi_id;

    private java.math.BigInteger naitaja_id;

    private java.lang.String bil_veerg;

    private java.lang.String vaartus;

    public Mtabilsisuv2_aruanne() {
    }

    public Mtabilsisuv2_aruanne(
           java.math.BigInteger bil_id,
           java.lang.String maketi_id,
           java.math.BigInteger naitaja_id,
           java.lang.String bil_veerg,
           java.lang.String vaartus) {
           this.bil_id = bil_id;
           this.maketi_id = maketi_id;
           this.naitaja_id = naitaja_id;
           this.bil_veerg = bil_veerg;
           this.vaartus = vaartus;
    }


    /**
     * Gets the bil_id value for this Mtabilsisuv2_aruanne.
     * 
     * @return bil_id
     */
    public java.math.BigInteger getBil_id() {
        return bil_id;
    }


    /**
     * Sets the bil_id value for this Mtabilsisuv2_aruanne.
     * 
     * @param bil_id
     */
    public void setBil_id(java.math.BigInteger bil_id) {
        this.bil_id = bil_id;
    }


    /**
     * Gets the maketi_id value for this Mtabilsisuv2_aruanne.
     * 
     * @return maketi_id
     */
    public java.lang.String getMaketi_id() {
        return maketi_id;
    }


    /**
     * Sets the maketi_id value for this Mtabilsisuv2_aruanne.
     * 
     * @param maketi_id
     */
    public void setMaketi_id(java.lang.String maketi_id) {
        this.maketi_id = maketi_id;
    }


    /**
     * Gets the naitaja_id value for this Mtabilsisuv2_aruanne.
     * 
     * @return naitaja_id
     */
    public java.math.BigInteger getNaitaja_id() {
        return naitaja_id;
    }


    /**
     * Sets the naitaja_id value for this Mtabilsisuv2_aruanne.
     * 
     * @param naitaja_id
     */
    public void setNaitaja_id(java.math.BigInteger naitaja_id) {
        this.naitaja_id = naitaja_id;
    }


    /**
     * Gets the bil_veerg value for this Mtabilsisuv2_aruanne.
     * 
     * @return bil_veerg
     */
    public java.lang.String getBil_veerg() {
        return bil_veerg;
    }


    /**
     * Sets the bil_veerg value for this Mtabilsisuv2_aruanne.
     * 
     * @param bil_veerg
     */
    public void setBil_veerg(java.lang.String bil_veerg) {
        this.bil_veerg = bil_veerg;
    }


    /**
     * Gets the vaartus value for this Mtabilsisuv2_aruanne.
     * 
     * @return vaartus
     */
    public java.lang.String getVaartus() {
        return vaartus;
    }


    /**
     * Sets the vaartus value for this Mtabilsisuv2_aruanne.
     * 
     * @param vaartus
     */
    public void setVaartus(java.lang.String vaartus) {
        this.vaartus = vaartus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtabilsisuv2_aruanne)) return false;
        Mtabilsisuv2_aruanne other = (Mtabilsisuv2_aruanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bil_id==null && other.getBil_id()==null) || 
             (this.bil_id!=null &&
              this.bil_id.equals(other.getBil_id()))) &&
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
        if (getBil_id() != null) {
            _hashCode += getBil_id().hashCode();
        }
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
