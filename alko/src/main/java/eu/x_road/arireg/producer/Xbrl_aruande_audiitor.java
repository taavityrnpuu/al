/**
 * Xbrl_aruande_audiitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrl_aruande_audiitor  implements java.io.Serializable {
    private java.lang.String va_isikukood;

    private java.lang.String va_nimi;

    private java.lang.String aev_registrikood;

    private java.lang.String aev_nimi;

    private java.util.Date audit_kpv;

    public Xbrl_aruande_audiitor() {
    }

    public Xbrl_aruande_audiitor(
           java.lang.String va_isikukood,
           java.lang.String va_nimi,
           java.lang.String aev_registrikood,
           java.lang.String aev_nimi,
           java.util.Date audit_kpv) {
           this.va_isikukood = va_isikukood;
           this.va_nimi = va_nimi;
           this.aev_registrikood = aev_registrikood;
           this.aev_nimi = aev_nimi;
           this.audit_kpv = audit_kpv;
    }


    /**
     * Gets the va_isikukood value for this Xbrl_aruande_audiitor.
     * 
     * @return va_isikukood
     */
    public java.lang.String getVa_isikukood() {
        return va_isikukood;
    }


    /**
     * Sets the va_isikukood value for this Xbrl_aruande_audiitor.
     * 
     * @param va_isikukood
     */
    public void setVa_isikukood(java.lang.String va_isikukood) {
        this.va_isikukood = va_isikukood;
    }


    /**
     * Gets the va_nimi value for this Xbrl_aruande_audiitor.
     * 
     * @return va_nimi
     */
    public java.lang.String getVa_nimi() {
        return va_nimi;
    }


    /**
     * Sets the va_nimi value for this Xbrl_aruande_audiitor.
     * 
     * @param va_nimi
     */
    public void setVa_nimi(java.lang.String va_nimi) {
        this.va_nimi = va_nimi;
    }


    /**
     * Gets the aev_registrikood value for this Xbrl_aruande_audiitor.
     * 
     * @return aev_registrikood
     */
    public java.lang.String getAev_registrikood() {
        return aev_registrikood;
    }


    /**
     * Sets the aev_registrikood value for this Xbrl_aruande_audiitor.
     * 
     * @param aev_registrikood
     */
    public void setAev_registrikood(java.lang.String aev_registrikood) {
        this.aev_registrikood = aev_registrikood;
    }


    /**
     * Gets the aev_nimi value for this Xbrl_aruande_audiitor.
     * 
     * @return aev_nimi
     */
    public java.lang.String getAev_nimi() {
        return aev_nimi;
    }


    /**
     * Sets the aev_nimi value for this Xbrl_aruande_audiitor.
     * 
     * @param aev_nimi
     */
    public void setAev_nimi(java.lang.String aev_nimi) {
        this.aev_nimi = aev_nimi;
    }


    /**
     * Gets the audit_kpv value for this Xbrl_aruande_audiitor.
     * 
     * @return audit_kpv
     */
    public java.util.Date getAudit_kpv() {
        return audit_kpv;
    }


    /**
     * Sets the audit_kpv value for this Xbrl_aruande_audiitor.
     * 
     * @param audit_kpv
     */
    public void setAudit_kpv(java.util.Date audit_kpv) {
        this.audit_kpv = audit_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrl_aruande_audiitor)) return false;
        Xbrl_aruande_audiitor other = (Xbrl_aruande_audiitor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.va_isikukood==null && other.getVa_isikukood()==null) || 
             (this.va_isikukood!=null &&
              this.va_isikukood.equals(other.getVa_isikukood()))) &&
            ((this.va_nimi==null && other.getVa_nimi()==null) || 
             (this.va_nimi!=null &&
              this.va_nimi.equals(other.getVa_nimi()))) &&
            ((this.aev_registrikood==null && other.getAev_registrikood()==null) || 
             (this.aev_registrikood!=null &&
              this.aev_registrikood.equals(other.getAev_registrikood()))) &&
            ((this.aev_nimi==null && other.getAev_nimi()==null) || 
             (this.aev_nimi!=null &&
              this.aev_nimi.equals(other.getAev_nimi()))) &&
            ((this.audit_kpv==null && other.getAudit_kpv()==null) || 
             (this.audit_kpv!=null &&
              this.audit_kpv.equals(other.getAudit_kpv())));
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
        if (getVa_isikukood() != null) {
            _hashCode += getVa_isikukood().hashCode();
        }
        if (getVa_nimi() != null) {
            _hashCode += getVa_nimi().hashCode();
        }
        if (getAev_registrikood() != null) {
            _hashCode += getAev_registrikood().hashCode();
        }
        if (getAev_nimi() != null) {
            _hashCode += getAev_nimi().hashCode();
        }
        if (getAudit_kpv() != null) {
            _hashCode += getAudit_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
