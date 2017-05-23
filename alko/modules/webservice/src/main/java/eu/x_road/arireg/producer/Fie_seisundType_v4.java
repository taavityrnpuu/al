/**
 * Fie_seisundType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Fie_seisundType_v4  implements java.io.Serializable {
    private java.lang.String tegevus;

    /* Kande elemendi tüüp - TP, HA, AT */
    private java.lang.String elemtyyp;

    /* Perioodi algus */
    private java.util.Date alguskpv;

    /* Perioodi lõpp */
    private java.util.Date loppkpv;

    private java.lang.String periood;

    public Fie_seisundType_v4() {
    }

    public Fie_seisundType_v4(
           java.lang.String tegevus,
           java.lang.String elemtyyp,
           java.util.Date alguskpv,
           java.util.Date loppkpv,
           java.lang.String periood) {
           this.tegevus = tegevus;
           this.elemtyyp = elemtyyp;
           this.alguskpv = alguskpv;
           this.loppkpv = loppkpv;
           this.periood = periood;
    }


    /**
     * Gets the tegevus value for this Fie_seisundType_v4.
     * 
     * @return tegevus
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this Fie_seisundType_v4.
     * 
     * @param tegevus
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }


    /**
     * Gets the elemtyyp value for this Fie_seisundType_v4.
     * 
     * @return elemtyyp   * Kande elemendi tüüp - TP, HA, AT
     */
    public java.lang.String getElemtyyp() {
        return elemtyyp;
    }


    /**
     * Sets the elemtyyp value for this Fie_seisundType_v4.
     * 
     * @param elemtyyp   * Kande elemendi tüüp - TP, HA, AT
     */
    public void setElemtyyp(java.lang.String elemtyyp) {
        this.elemtyyp = elemtyyp;
    }


    /**
     * Gets the alguskpv value for this Fie_seisundType_v4.
     * 
     * @return alguskpv   * Perioodi algus
     */
    public java.util.Date getAlguskpv() {
        return alguskpv;
    }


    /**
     * Sets the alguskpv value for this Fie_seisundType_v4.
     * 
     * @param alguskpv   * Perioodi algus
     */
    public void setAlguskpv(java.util.Date alguskpv) {
        this.alguskpv = alguskpv;
    }


    /**
     * Gets the loppkpv value for this Fie_seisundType_v4.
     * 
     * @return loppkpv   * Perioodi lõpp
     */
    public java.util.Date getLoppkpv() {
        return loppkpv;
    }


    /**
     * Sets the loppkpv value for this Fie_seisundType_v4.
     * 
     * @param loppkpv   * Perioodi lõpp
     */
    public void setLoppkpv(java.util.Date loppkpv) {
        this.loppkpv = loppkpv;
    }


    /**
     * Gets the periood value for this Fie_seisundType_v4.
     * 
     * @return periood
     */
    public java.lang.String getPeriood() {
        return periood;
    }


    /**
     * Sets the periood value for this Fie_seisundType_v4.
     * 
     * @param periood
     */
    public void setPeriood(java.lang.String periood) {
        this.periood = periood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fie_seisundType_v4)) return false;
        Fie_seisundType_v4 other = (Fie_seisundType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus()))) &&
            ((this.elemtyyp==null && other.getElemtyyp()==null) || 
             (this.elemtyyp!=null &&
              this.elemtyyp.equals(other.getElemtyyp()))) &&
            ((this.alguskpv==null && other.getAlguskpv()==null) || 
             (this.alguskpv!=null &&
              this.alguskpv.equals(other.getAlguskpv()))) &&
            ((this.loppkpv==null && other.getLoppkpv()==null) || 
             (this.loppkpv!=null &&
              this.loppkpv.equals(other.getLoppkpv()))) &&
            ((this.periood==null && other.getPeriood()==null) || 
             (this.periood!=null &&
              this.periood.equals(other.getPeriood())));
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
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        if (getElemtyyp() != null) {
            _hashCode += getElemtyyp().hashCode();
        }
        if (getAlguskpv() != null) {
            _hashCode += getAlguskpv().hashCode();
        }
        if (getLoppkpv() != null) {
            _hashCode += getLoppkpv().hashCode();
        }
        if (getPeriood() != null) {
            _hashCode += getPeriood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
