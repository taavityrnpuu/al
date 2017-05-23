/**
 * Aruande_auditeerimiseandmed_kirje_audiitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Aruande_auditeerimiseandmed_kirje_audiitor  implements java.io.Serializable {
    private java.lang.String va_kood;

    private java.lang.String va_nimi;

    private java.lang.String va_kutsetunnistuse_nr;

    private java.lang.String aev_kood;

    private java.lang.String aev_nimi;

    private java.lang.String aev_loa_nr;

    private java.util.Date audit_kpv;

    public Aruande_auditeerimiseandmed_kirje_audiitor() {
    }

    public Aruande_auditeerimiseandmed_kirje_audiitor(
           java.lang.String va_kood,
           java.lang.String va_nimi,
           java.lang.String va_kutsetunnistuse_nr,
           java.lang.String aev_kood,
           java.lang.String aev_nimi,
           java.lang.String aev_loa_nr,
           java.util.Date audit_kpv) {
           this.va_kood = va_kood;
           this.va_nimi = va_nimi;
           this.va_kutsetunnistuse_nr = va_kutsetunnistuse_nr;
           this.aev_kood = aev_kood;
           this.aev_nimi = aev_nimi;
           this.aev_loa_nr = aev_loa_nr;
           this.audit_kpv = audit_kpv;
    }


    /**
     * Gets the va_kood value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return va_kood
     */
    public java.lang.String getVa_kood() {
        return va_kood;
    }


    /**
     * Sets the va_kood value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param va_kood
     */
    public void setVa_kood(java.lang.String va_kood) {
        this.va_kood = va_kood;
    }


    /**
     * Gets the va_nimi value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return va_nimi
     */
    public java.lang.String getVa_nimi() {
        return va_nimi;
    }


    /**
     * Sets the va_nimi value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param va_nimi
     */
    public void setVa_nimi(java.lang.String va_nimi) {
        this.va_nimi = va_nimi;
    }


    /**
     * Gets the va_kutsetunnistuse_nr value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return va_kutsetunnistuse_nr
     */
    public java.lang.String getVa_kutsetunnistuse_nr() {
        return va_kutsetunnistuse_nr;
    }


    /**
     * Sets the va_kutsetunnistuse_nr value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param va_kutsetunnistuse_nr
     */
    public void setVa_kutsetunnistuse_nr(java.lang.String va_kutsetunnistuse_nr) {
        this.va_kutsetunnistuse_nr = va_kutsetunnistuse_nr;
    }


    /**
     * Gets the aev_kood value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return aev_kood
     */
    public java.lang.String getAev_kood() {
        return aev_kood;
    }


    /**
     * Sets the aev_kood value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param aev_kood
     */
    public void setAev_kood(java.lang.String aev_kood) {
        this.aev_kood = aev_kood;
    }


    /**
     * Gets the aev_nimi value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return aev_nimi
     */
    public java.lang.String getAev_nimi() {
        return aev_nimi;
    }


    /**
     * Sets the aev_nimi value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param aev_nimi
     */
    public void setAev_nimi(java.lang.String aev_nimi) {
        this.aev_nimi = aev_nimi;
    }


    /**
     * Gets the aev_loa_nr value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return aev_loa_nr
     */
    public java.lang.String getAev_loa_nr() {
        return aev_loa_nr;
    }


    /**
     * Sets the aev_loa_nr value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param aev_loa_nr
     */
    public void setAev_loa_nr(java.lang.String aev_loa_nr) {
        this.aev_loa_nr = aev_loa_nr;
    }


    /**
     * Gets the audit_kpv value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @return audit_kpv
     */
    public java.util.Date getAudit_kpv() {
        return audit_kpv;
    }


    /**
     * Sets the audit_kpv value for this Aruande_auditeerimiseandmed_kirje_audiitor.
     * 
     * @param audit_kpv
     */
    public void setAudit_kpv(java.util.Date audit_kpv) {
        this.audit_kpv = audit_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruande_auditeerimiseandmed_kirje_audiitor)) return false;
        Aruande_auditeerimiseandmed_kirje_audiitor other = (Aruande_auditeerimiseandmed_kirje_audiitor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.va_kood==null && other.getVa_kood()==null) || 
             (this.va_kood!=null &&
              this.va_kood.equals(other.getVa_kood()))) &&
            ((this.va_nimi==null && other.getVa_nimi()==null) || 
             (this.va_nimi!=null &&
              this.va_nimi.equals(other.getVa_nimi()))) &&
            ((this.va_kutsetunnistuse_nr==null && other.getVa_kutsetunnistuse_nr()==null) || 
             (this.va_kutsetunnistuse_nr!=null &&
              this.va_kutsetunnistuse_nr.equals(other.getVa_kutsetunnistuse_nr()))) &&
            ((this.aev_kood==null && other.getAev_kood()==null) || 
             (this.aev_kood!=null &&
              this.aev_kood.equals(other.getAev_kood()))) &&
            ((this.aev_nimi==null && other.getAev_nimi()==null) || 
             (this.aev_nimi!=null &&
              this.aev_nimi.equals(other.getAev_nimi()))) &&
            ((this.aev_loa_nr==null && other.getAev_loa_nr()==null) || 
             (this.aev_loa_nr!=null &&
              this.aev_loa_nr.equals(other.getAev_loa_nr()))) &&
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
        if (getVa_kood() != null) {
            _hashCode += getVa_kood().hashCode();
        }
        if (getVa_nimi() != null) {
            _hashCode += getVa_nimi().hashCode();
        }
        if (getVa_kutsetunnistuse_nr() != null) {
            _hashCode += getVa_kutsetunnistuse_nr().hashCode();
        }
        if (getAev_kood() != null) {
            _hashCode += getAev_kood().hashCode();
        }
        if (getAev_nimi() != null) {
            _hashCode += getAev_nimi().hashCode();
        }
        if (getAev_loa_nr() != null) {
            _hashCode += getAev_loa_nr().hashCode();
        }
        if (getAudit_kpv() != null) {
            _hashCode += getAudit_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
