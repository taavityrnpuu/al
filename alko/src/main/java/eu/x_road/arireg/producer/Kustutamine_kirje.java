/**
 * Kustutamine_kirje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Kustutamine_kirje  implements java.io.Serializable {
    private java.math.BigInteger ark;

    private java.lang.String arinimi;

    private java.util.Date kustut_kpv;

    public Kustutamine_kirje() {
    }

    public Kustutamine_kirje(
           java.math.BigInteger ark,
           java.lang.String arinimi,
           java.util.Date kustut_kpv) {
           this.ark = ark;
           this.arinimi = arinimi;
           this.kustut_kpv = kustut_kpv;
    }


    /**
     * Gets the ark value for this Kustutamine_kirje.
     * 
     * @return ark
     */
    public java.math.BigInteger getArk() {
        return ark;
    }


    /**
     * Sets the ark value for this Kustutamine_kirje.
     * 
     * @param ark
     */
    public void setArk(java.math.BigInteger ark) {
        this.ark = ark;
    }


    /**
     * Gets the arinimi value for this Kustutamine_kirje.
     * 
     * @return arinimi
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }


    /**
     * Sets the arinimi value for this Kustutamine_kirje.
     * 
     * @param arinimi
     */
    public void setArinimi(java.lang.String arinimi) {
        this.arinimi = arinimi;
    }


    /**
     * Gets the kustut_kpv value for this Kustutamine_kirje.
     * 
     * @return kustut_kpv
     */
    public java.util.Date getKustut_kpv() {
        return kustut_kpv;
    }


    /**
     * Sets the kustut_kpv value for this Kustutamine_kirje.
     * 
     * @param kustut_kpv
     */
    public void setKustut_kpv(java.util.Date kustut_kpv) {
        this.kustut_kpv = kustut_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kustutamine_kirje)) return false;
        Kustutamine_kirje other = (Kustutamine_kirje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ark==null && other.getArk()==null) || 
             (this.ark!=null &&
              this.ark.equals(other.getArk()))) &&
            ((this.arinimi==null && other.getArinimi()==null) || 
             (this.arinimi!=null &&
              this.arinimi.equals(other.getArinimi()))) &&
            ((this.kustut_kpv==null && other.getKustut_kpv()==null) || 
             (this.kustut_kpv!=null &&
              this.kustut_kpv.equals(other.getKustut_kpv())));
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
        if (getArk() != null) {
            _hashCode += getArk().hashCode();
        }
        if (getArinimi() != null) {
            _hashCode += getArinimi().hashCode();
        }
        if (getKustut_kpv() != null) {
            _hashCode += getKustut_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
