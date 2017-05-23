/**
 * Paringarikeelud_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringarikeelud_paring  implements java.io.Serializable {
    private java.lang.String fyysilise_isiku_kood;

    private java.lang.String fyysilise_isiku_eesnimi;

    private java.lang.String fyysilise_isiku_perenimi;

    private java.util.Date fyysilise_isiku_synniaeg;

    public Paringarikeelud_paring() {
    }

    public Paringarikeelud_paring(
           java.lang.String fyysilise_isiku_kood,
           java.lang.String fyysilise_isiku_eesnimi,
           java.lang.String fyysilise_isiku_perenimi,
           java.util.Date fyysilise_isiku_synniaeg) {
           this.fyysilise_isiku_kood = fyysilise_isiku_kood;
           this.fyysilise_isiku_eesnimi = fyysilise_isiku_eesnimi;
           this.fyysilise_isiku_perenimi = fyysilise_isiku_perenimi;
           this.fyysilise_isiku_synniaeg = fyysilise_isiku_synniaeg;
    }


    /**
     * Gets the fyysilise_isiku_kood value for this Paringarikeelud_paring.
     * 
     * @return fyysilise_isiku_kood
     */
    public java.lang.String getFyysilise_isiku_kood() {
        return fyysilise_isiku_kood;
    }


    /**
     * Sets the fyysilise_isiku_kood value for this Paringarikeelud_paring.
     * 
     * @param fyysilise_isiku_kood
     */
    public void setFyysilise_isiku_kood(java.lang.String fyysilise_isiku_kood) {
        this.fyysilise_isiku_kood = fyysilise_isiku_kood;
    }


    /**
     * Gets the fyysilise_isiku_eesnimi value for this Paringarikeelud_paring.
     * 
     * @return fyysilise_isiku_eesnimi
     */
    public java.lang.String getFyysilise_isiku_eesnimi() {
        return fyysilise_isiku_eesnimi;
    }


    /**
     * Sets the fyysilise_isiku_eesnimi value for this Paringarikeelud_paring.
     * 
     * @param fyysilise_isiku_eesnimi
     */
    public void setFyysilise_isiku_eesnimi(java.lang.String fyysilise_isiku_eesnimi) {
        this.fyysilise_isiku_eesnimi = fyysilise_isiku_eesnimi;
    }


    /**
     * Gets the fyysilise_isiku_perenimi value for this Paringarikeelud_paring.
     * 
     * @return fyysilise_isiku_perenimi
     */
    public java.lang.String getFyysilise_isiku_perenimi() {
        return fyysilise_isiku_perenimi;
    }


    /**
     * Sets the fyysilise_isiku_perenimi value for this Paringarikeelud_paring.
     * 
     * @param fyysilise_isiku_perenimi
     */
    public void setFyysilise_isiku_perenimi(java.lang.String fyysilise_isiku_perenimi) {
        this.fyysilise_isiku_perenimi = fyysilise_isiku_perenimi;
    }


    /**
     * Gets the fyysilise_isiku_synniaeg value for this Paringarikeelud_paring.
     * 
     * @return fyysilise_isiku_synniaeg
     */
    public java.util.Date getFyysilise_isiku_synniaeg() {
        return fyysilise_isiku_synniaeg;
    }


    /**
     * Sets the fyysilise_isiku_synniaeg value for this Paringarikeelud_paring.
     * 
     * @param fyysilise_isiku_synniaeg
     */
    public void setFyysilise_isiku_synniaeg(java.util.Date fyysilise_isiku_synniaeg) {
        this.fyysilise_isiku_synniaeg = fyysilise_isiku_synniaeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringarikeelud_paring)) return false;
        Paringarikeelud_paring other = (Paringarikeelud_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fyysilise_isiku_kood==null && other.getFyysilise_isiku_kood()==null) || 
             (this.fyysilise_isiku_kood!=null &&
              this.fyysilise_isiku_kood.equals(other.getFyysilise_isiku_kood()))) &&
            ((this.fyysilise_isiku_eesnimi==null && other.getFyysilise_isiku_eesnimi()==null) || 
             (this.fyysilise_isiku_eesnimi!=null &&
              this.fyysilise_isiku_eesnimi.equals(other.getFyysilise_isiku_eesnimi()))) &&
            ((this.fyysilise_isiku_perenimi==null && other.getFyysilise_isiku_perenimi()==null) || 
             (this.fyysilise_isiku_perenimi!=null &&
              this.fyysilise_isiku_perenimi.equals(other.getFyysilise_isiku_perenimi()))) &&
            ((this.fyysilise_isiku_synniaeg==null && other.getFyysilise_isiku_synniaeg()==null) || 
             (this.fyysilise_isiku_synniaeg!=null &&
              this.fyysilise_isiku_synniaeg.equals(other.getFyysilise_isiku_synniaeg())));
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
        if (getFyysilise_isiku_kood() != null) {
            _hashCode += getFyysilise_isiku_kood().hashCode();
        }
        if (getFyysilise_isiku_eesnimi() != null) {
            _hashCode += getFyysilise_isiku_eesnimi().hashCode();
        }
        if (getFyysilise_isiku_perenimi() != null) {
            _hashCode += getFyysilise_isiku_perenimi().hashCode();
        }
        if (getFyysilise_isiku_synniaeg() != null) {
            _hashCode += getFyysilise_isiku_synniaeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
