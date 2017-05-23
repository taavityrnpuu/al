/**
 * Sooritakanne_majaasta_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_majaasta_v4  implements java.io.Serializable {
    private java.lang.String majandusaasta_algus;

    private java.lang.String majandusaasta_lopp;

    public Sooritakanne_majaasta_v4() {
    }

    public Sooritakanne_majaasta_v4(
           java.lang.String majandusaasta_algus,
           java.lang.String majandusaasta_lopp) {
           this.majandusaasta_algus = majandusaasta_algus;
           this.majandusaasta_lopp = majandusaasta_lopp;
    }


    /**
     * Gets the majandusaasta_algus value for this Sooritakanne_majaasta_v4.
     * 
     * @return majandusaasta_algus
     */
    public java.lang.String getMajandusaasta_algus() {
        return majandusaasta_algus;
    }


    /**
     * Sets the majandusaasta_algus value for this Sooritakanne_majaasta_v4.
     * 
     * @param majandusaasta_algus
     */
    public void setMajandusaasta_algus(java.lang.String majandusaasta_algus) {
        this.majandusaasta_algus = majandusaasta_algus;
    }


    /**
     * Gets the majandusaasta_lopp value for this Sooritakanne_majaasta_v4.
     * 
     * @return majandusaasta_lopp
     */
    public java.lang.String getMajandusaasta_lopp() {
        return majandusaasta_lopp;
    }


    /**
     * Sets the majandusaasta_lopp value for this Sooritakanne_majaasta_v4.
     * 
     * @param majandusaasta_lopp
     */
    public void setMajandusaasta_lopp(java.lang.String majandusaasta_lopp) {
        this.majandusaasta_lopp = majandusaasta_lopp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sooritakanne_majaasta_v4)) return false;
        Sooritakanne_majaasta_v4 other = (Sooritakanne_majaasta_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.majandusaasta_algus==null && other.getMajandusaasta_algus()==null) || 
             (this.majandusaasta_algus!=null &&
              this.majandusaasta_algus.equals(other.getMajandusaasta_algus()))) &&
            ((this.majandusaasta_lopp==null && other.getMajandusaasta_lopp()==null) || 
             (this.majandusaasta_lopp!=null &&
              this.majandusaasta_lopp.equals(other.getMajandusaasta_lopp())));
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
        if (getMajandusaasta_algus() != null) {
            _hashCode += getMajandusaasta_algus().hashCode();
        }
        if (getMajandusaasta_lopp() != null) {
            _hashCode += getMajandusaasta_lopp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
