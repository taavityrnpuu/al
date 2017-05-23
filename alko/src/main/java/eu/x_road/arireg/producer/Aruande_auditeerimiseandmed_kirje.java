/**
 * Aruande_auditeerimiseandmed_kirje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Aruande_auditeerimiseandmed_kirje  implements java.io.Serializable {
    private java.lang.String ariregistri_kood;

    private java.util.Calendar esitamise_aeg;

    /* Aruande aasta */
    private java.math.BigInteger aasta;

    private java.util.Date aruande_aasta_algus;

    private java.util.Date aruande_aasta_lopp;

    private java.lang.Boolean kohustuslik_audit;

    private eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje_audiitor[] audiitorid;

    public Aruande_auditeerimiseandmed_kirje() {
    }

    public Aruande_auditeerimiseandmed_kirje(
           java.lang.String ariregistri_kood,
           java.util.Calendar esitamise_aeg,
           java.math.BigInteger aasta,
           java.util.Date aruande_aasta_algus,
           java.util.Date aruande_aasta_lopp,
           java.lang.Boolean kohustuslik_audit,
           eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje_audiitor[] audiitorid) {
           this.ariregistri_kood = ariregistri_kood;
           this.esitamise_aeg = esitamise_aeg;
           this.aasta = aasta;
           this.aruande_aasta_algus = aruande_aasta_algus;
           this.aruande_aasta_lopp = aruande_aasta_lopp;
           this.kohustuslik_audit = kohustuslik_audit;
           this.audiitorid = audiitorid;
    }


    /**
     * Gets the ariregistri_kood value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return ariregistri_kood
     */
    public java.lang.String getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.String ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the esitamise_aeg value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return esitamise_aeg
     */
    public java.util.Calendar getEsitamise_aeg() {
        return esitamise_aeg;
    }


    /**
     * Sets the esitamise_aeg value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param esitamise_aeg
     */
    public void setEsitamise_aeg(java.util.Calendar esitamise_aeg) {
        this.esitamise_aeg = esitamise_aeg;
    }


    /**
     * Gets the aasta value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return aasta   * Aruande aasta
     */
    public java.math.BigInteger getAasta() {
        return aasta;
    }


    /**
     * Sets the aasta value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param aasta   * Aruande aasta
     */
    public void setAasta(java.math.BigInteger aasta) {
        this.aasta = aasta;
    }


    /**
     * Gets the aruande_aasta_algus value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return aruande_aasta_algus
     */
    public java.util.Date getAruande_aasta_algus() {
        return aruande_aasta_algus;
    }


    /**
     * Sets the aruande_aasta_algus value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param aruande_aasta_algus
     */
    public void setAruande_aasta_algus(java.util.Date aruande_aasta_algus) {
        this.aruande_aasta_algus = aruande_aasta_algus;
    }


    /**
     * Gets the aruande_aasta_lopp value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return aruande_aasta_lopp
     */
    public java.util.Date getAruande_aasta_lopp() {
        return aruande_aasta_lopp;
    }


    /**
     * Sets the aruande_aasta_lopp value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param aruande_aasta_lopp
     */
    public void setAruande_aasta_lopp(java.util.Date aruande_aasta_lopp) {
        this.aruande_aasta_lopp = aruande_aasta_lopp;
    }


    /**
     * Gets the kohustuslik_audit value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return kohustuslik_audit
     */
    public java.lang.Boolean getKohustuslik_audit() {
        return kohustuslik_audit;
    }


    /**
     * Sets the kohustuslik_audit value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param kohustuslik_audit
     */
    public void setKohustuslik_audit(java.lang.Boolean kohustuslik_audit) {
        this.kohustuslik_audit = kohustuslik_audit;
    }


    /**
     * Gets the audiitorid value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @return audiitorid
     */
    public eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje_audiitor[] getAudiitorid() {
        return audiitorid;
    }


    /**
     * Sets the audiitorid value for this Aruande_auditeerimiseandmed_kirje.
     * 
     * @param audiitorid
     */
    public void setAudiitorid(eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje_audiitor[] audiitorid) {
        this.audiitorid = audiitorid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruande_auditeerimiseandmed_kirje)) return false;
        Aruande_auditeerimiseandmed_kirje other = (Aruande_auditeerimiseandmed_kirje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.esitamise_aeg==null && other.getEsitamise_aeg()==null) || 
             (this.esitamise_aeg!=null &&
              this.esitamise_aeg.equals(other.getEsitamise_aeg()))) &&
            ((this.aasta==null && other.getAasta()==null) || 
             (this.aasta!=null &&
              this.aasta.equals(other.getAasta()))) &&
            ((this.aruande_aasta_algus==null && other.getAruande_aasta_algus()==null) || 
             (this.aruande_aasta_algus!=null &&
              this.aruande_aasta_algus.equals(other.getAruande_aasta_algus()))) &&
            ((this.aruande_aasta_lopp==null && other.getAruande_aasta_lopp()==null) || 
             (this.aruande_aasta_lopp!=null &&
              this.aruande_aasta_lopp.equals(other.getAruande_aasta_lopp()))) &&
            ((this.kohustuslik_audit==null && other.getKohustuslik_audit()==null) || 
             (this.kohustuslik_audit!=null &&
              this.kohustuslik_audit.equals(other.getKohustuslik_audit()))) &&
            ((this.audiitorid==null && other.getAudiitorid()==null) || 
             (this.audiitorid!=null &&
              java.util.Arrays.equals(this.audiitorid, other.getAudiitorid())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getEsitamise_aeg() != null) {
            _hashCode += getEsitamise_aeg().hashCode();
        }
        if (getAasta() != null) {
            _hashCode += getAasta().hashCode();
        }
        if (getAruande_aasta_algus() != null) {
            _hashCode += getAruande_aasta_algus().hashCode();
        }
        if (getAruande_aasta_lopp() != null) {
            _hashCode += getAruande_aasta_lopp().hashCode();
        }
        if (getKohustuslik_audit() != null) {
            _hashCode += getKohustuslik_audit().hashCode();
        }
        if (getAudiitorid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudiitorid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudiitorid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
