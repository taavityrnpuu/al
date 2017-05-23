/**
 * Xbrlpdfesita_laiend_audiitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlpdfesita_laiend_audiitor  implements java.io.Serializable {
    private java.lang.String isikukood;

    private java.lang.String nimi;

    private java.lang.String kutsetunnistuse_nr;

    private java.lang.String audiitorettevotja_kood;

    private java.lang.String audiitorettevotja_nimi;

    private java.lang.String audiitorettevotja_loa_nr;

    private java.util.Date auditit_kpv;

    public Xbrlpdfesita_laiend_audiitor() {
    }

    public Xbrlpdfesita_laiend_audiitor(
           java.lang.String isikukood,
           java.lang.String nimi,
           java.lang.String kutsetunnistuse_nr,
           java.lang.String audiitorettevotja_kood,
           java.lang.String audiitorettevotja_nimi,
           java.lang.String audiitorettevotja_loa_nr,
           java.util.Date auditit_kpv) {
           this.isikukood = isikukood;
           this.nimi = nimi;
           this.kutsetunnistuse_nr = kutsetunnistuse_nr;
           this.audiitorettevotja_kood = audiitorettevotja_kood;
           this.audiitorettevotja_nimi = audiitorettevotja_nimi;
           this.audiitorettevotja_loa_nr = audiitorettevotja_loa_nr;
           this.auditit_kpv = auditit_kpv;
    }


    /**
     * Gets the isikukood value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the nimi value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kutsetunnistuse_nr value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return kutsetunnistuse_nr
     */
    public java.lang.String getKutsetunnistuse_nr() {
        return kutsetunnistuse_nr;
    }


    /**
     * Sets the kutsetunnistuse_nr value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param kutsetunnistuse_nr
     */
    public void setKutsetunnistuse_nr(java.lang.String kutsetunnistuse_nr) {
        this.kutsetunnistuse_nr = kutsetunnistuse_nr;
    }


    /**
     * Gets the audiitorettevotja_kood value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return audiitorettevotja_kood
     */
    public java.lang.String getAudiitorettevotja_kood() {
        return audiitorettevotja_kood;
    }


    /**
     * Sets the audiitorettevotja_kood value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param audiitorettevotja_kood
     */
    public void setAudiitorettevotja_kood(java.lang.String audiitorettevotja_kood) {
        this.audiitorettevotja_kood = audiitorettevotja_kood;
    }


    /**
     * Gets the audiitorettevotja_nimi value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return audiitorettevotja_nimi
     */
    public java.lang.String getAudiitorettevotja_nimi() {
        return audiitorettevotja_nimi;
    }


    /**
     * Sets the audiitorettevotja_nimi value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param audiitorettevotja_nimi
     */
    public void setAudiitorettevotja_nimi(java.lang.String audiitorettevotja_nimi) {
        this.audiitorettevotja_nimi = audiitorettevotja_nimi;
    }


    /**
     * Gets the audiitorettevotja_loa_nr value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return audiitorettevotja_loa_nr
     */
    public java.lang.String getAudiitorettevotja_loa_nr() {
        return audiitorettevotja_loa_nr;
    }


    /**
     * Sets the audiitorettevotja_loa_nr value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param audiitorettevotja_loa_nr
     */
    public void setAudiitorettevotja_loa_nr(java.lang.String audiitorettevotja_loa_nr) {
        this.audiitorettevotja_loa_nr = audiitorettevotja_loa_nr;
    }


    /**
     * Gets the auditit_kpv value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @return auditit_kpv
     */
    public java.util.Date getAuditit_kpv() {
        return auditit_kpv;
    }


    /**
     * Sets the auditit_kpv value for this Xbrlpdfesita_laiend_audiitor.
     * 
     * @param auditit_kpv
     */
    public void setAuditit_kpv(java.util.Date auditit_kpv) {
        this.auditit_kpv = auditit_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlpdfesita_laiend_audiitor)) return false;
        Xbrlpdfesita_laiend_audiitor other = (Xbrlpdfesita_laiend_audiitor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.kutsetunnistuse_nr==null && other.getKutsetunnistuse_nr()==null) || 
             (this.kutsetunnistuse_nr!=null &&
              this.kutsetunnistuse_nr.equals(other.getKutsetunnistuse_nr()))) &&
            ((this.audiitorettevotja_kood==null && other.getAudiitorettevotja_kood()==null) || 
             (this.audiitorettevotja_kood!=null &&
              this.audiitorettevotja_kood.equals(other.getAudiitorettevotja_kood()))) &&
            ((this.audiitorettevotja_nimi==null && other.getAudiitorettevotja_nimi()==null) || 
             (this.audiitorettevotja_nimi!=null &&
              this.audiitorettevotja_nimi.equals(other.getAudiitorettevotja_nimi()))) &&
            ((this.audiitorettevotja_loa_nr==null && other.getAudiitorettevotja_loa_nr()==null) || 
             (this.audiitorettevotja_loa_nr!=null &&
              this.audiitorettevotja_loa_nr.equals(other.getAudiitorettevotja_loa_nr()))) &&
            ((this.auditit_kpv==null && other.getAuditit_kpv()==null) || 
             (this.auditit_kpv!=null &&
              this.auditit_kpv.equals(other.getAuditit_kpv())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getKutsetunnistuse_nr() != null) {
            _hashCode += getKutsetunnistuse_nr().hashCode();
        }
        if (getAudiitorettevotja_kood() != null) {
            _hashCode += getAudiitorettevotja_kood().hashCode();
        }
        if (getAudiitorettevotja_nimi() != null) {
            _hashCode += getAudiitorettevotja_nimi().hashCode();
        }
        if (getAudiitorettevotja_loa_nr() != null) {
            _hashCode += getAudiitorettevotja_loa_nr().hashCode();
        }
        if (getAuditit_kpv() != null) {
            _hashCode += getAuditit_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
