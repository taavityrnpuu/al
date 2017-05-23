/**
 * Xbrlesita_audiitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesita_audiitor  implements java.io.Serializable {
    private java.lang.String isikukood;

    private java.lang.String audiitorettevotja_kood;

    private java.util.Date auditit_kpv;

    public Xbrlesita_audiitor() {
    }

    public Xbrlesita_audiitor(
           java.lang.String isikukood,
           java.lang.String audiitorettevotja_kood,
           java.util.Date auditit_kpv) {
           this.isikukood = isikukood;
           this.audiitorettevotja_kood = audiitorettevotja_kood;
           this.auditit_kpv = auditit_kpv;
    }


    /**
     * Gets the isikukood value for this Xbrlesita_audiitor.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this Xbrlesita_audiitor.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the audiitorettevotja_kood value for this Xbrlesita_audiitor.
     * 
     * @return audiitorettevotja_kood
     */
    public java.lang.String getAudiitorettevotja_kood() {
        return audiitorettevotja_kood;
    }


    /**
     * Sets the audiitorettevotja_kood value for this Xbrlesita_audiitor.
     * 
     * @param audiitorettevotja_kood
     */
    public void setAudiitorettevotja_kood(java.lang.String audiitorettevotja_kood) {
        this.audiitorettevotja_kood = audiitorettevotja_kood;
    }


    /**
     * Gets the auditit_kpv value for this Xbrlesita_audiitor.
     * 
     * @return auditit_kpv
     */
    public java.util.Date getAuditit_kpv() {
        return auditit_kpv;
    }


    /**
     * Sets the auditit_kpv value for this Xbrlesita_audiitor.
     * 
     * @param auditit_kpv
     */
    public void setAuditit_kpv(java.util.Date auditit_kpv) {
        this.auditit_kpv = auditit_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesita_audiitor)) return false;
        Xbrlesita_audiitor other = (Xbrlesita_audiitor) obj;
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
            ((this.audiitorettevotja_kood==null && other.getAudiitorettevotja_kood()==null) || 
             (this.audiitorettevotja_kood!=null &&
              this.audiitorettevotja_kood.equals(other.getAudiitorettevotja_kood()))) &&
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
        if (getAudiitorettevotja_kood() != null) {
            _hashCode += getAudiitorettevotja_kood().hashCode();
        }
        if (getAuditit_kpv() != null) {
            _hashCode += getAuditit_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
