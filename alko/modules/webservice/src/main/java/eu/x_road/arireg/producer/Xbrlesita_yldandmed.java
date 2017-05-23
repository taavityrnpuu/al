/**
 * Xbrlesita_yldandmed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesita_yldandmed  implements java.io.Serializable {
    private int ariregistri_kood;

    private java.util.Date majaasta_algus;

    private java.util.Date majaasta_lopp;

    private java.math.BigInteger standard;

    private java.lang.String standard_tekstina;

    private boolean konsolideeritud;

    private java.math.BigInteger erandid;

    private java.lang.String erandid_tekstina;

    private java.math.BigInteger tapsusaste;

    private java.lang.String tapsusaste_tekstina;

    private java.lang.String aruande_liik;

    private java.lang.Integer xbrl_file_id;

    private java.lang.Integer ddoc_file_id;

    private java.math.BigInteger xbrl_aruande_id;

    public Xbrlesita_yldandmed() {
    }

    public Xbrlesita_yldandmed(
           int ariregistri_kood,
           java.util.Date majaasta_algus,
           java.util.Date majaasta_lopp,
           java.math.BigInteger standard,
           java.lang.String standard_tekstina,
           boolean konsolideeritud,
           java.math.BigInteger erandid,
           java.lang.String erandid_tekstina,
           java.math.BigInteger tapsusaste,
           java.lang.String tapsusaste_tekstina,
           java.lang.String aruande_liik,
           java.lang.Integer xbrl_file_id,
           java.lang.Integer ddoc_file_id,
           java.math.BigInteger xbrl_aruande_id) {
           this.ariregistri_kood = ariregistri_kood;
           this.majaasta_algus = majaasta_algus;
           this.majaasta_lopp = majaasta_lopp;
           this.standard = standard;
           this.standard_tekstina = standard_tekstina;
           this.konsolideeritud = konsolideeritud;
           this.erandid = erandid;
           this.erandid_tekstina = erandid_tekstina;
           this.tapsusaste = tapsusaste;
           this.tapsusaste_tekstina = tapsusaste_tekstina;
           this.aruande_liik = aruande_liik;
           this.xbrl_file_id = xbrl_file_id;
           this.ddoc_file_id = ddoc_file_id;
           this.xbrl_aruande_id = xbrl_aruande_id;
    }


    /**
     * Gets the ariregistri_kood value for this Xbrlesita_yldandmed.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Xbrlesita_yldandmed.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the majaasta_algus value for this Xbrlesita_yldandmed.
     * 
     * @return majaasta_algus
     */
    public java.util.Date getMajaasta_algus() {
        return majaasta_algus;
    }


    /**
     * Sets the majaasta_algus value for this Xbrlesita_yldandmed.
     * 
     * @param majaasta_algus
     */
    public void setMajaasta_algus(java.util.Date majaasta_algus) {
        this.majaasta_algus = majaasta_algus;
    }


    /**
     * Gets the majaasta_lopp value for this Xbrlesita_yldandmed.
     * 
     * @return majaasta_lopp
     */
    public java.util.Date getMajaasta_lopp() {
        return majaasta_lopp;
    }


    /**
     * Sets the majaasta_lopp value for this Xbrlesita_yldandmed.
     * 
     * @param majaasta_lopp
     */
    public void setMajaasta_lopp(java.util.Date majaasta_lopp) {
        this.majaasta_lopp = majaasta_lopp;
    }


    /**
     * Gets the standard value for this Xbrlesita_yldandmed.
     * 
     * @return standard
     */
    public java.math.BigInteger getStandard() {
        return standard;
    }


    /**
     * Sets the standard value for this Xbrlesita_yldandmed.
     * 
     * @param standard
     */
    public void setStandard(java.math.BigInteger standard) {
        this.standard = standard;
    }


    /**
     * Gets the standard_tekstina value for this Xbrlesita_yldandmed.
     * 
     * @return standard_tekstina
     */
    public java.lang.String getStandard_tekstina() {
        return standard_tekstina;
    }


    /**
     * Sets the standard_tekstina value for this Xbrlesita_yldandmed.
     * 
     * @param standard_tekstina
     */
    public void setStandard_tekstina(java.lang.String standard_tekstina) {
        this.standard_tekstina = standard_tekstina;
    }


    /**
     * Gets the konsolideeritud value for this Xbrlesita_yldandmed.
     * 
     * @return konsolideeritud
     */
    public boolean isKonsolideeritud() {
        return konsolideeritud;
    }


    /**
     * Sets the konsolideeritud value for this Xbrlesita_yldandmed.
     * 
     * @param konsolideeritud
     */
    public void setKonsolideeritud(boolean konsolideeritud) {
        this.konsolideeritud = konsolideeritud;
    }


    /**
     * Gets the erandid value for this Xbrlesita_yldandmed.
     * 
     * @return erandid
     */
    public java.math.BigInteger getErandid() {
        return erandid;
    }


    /**
     * Sets the erandid value for this Xbrlesita_yldandmed.
     * 
     * @param erandid
     */
    public void setErandid(java.math.BigInteger erandid) {
        this.erandid = erandid;
    }


    /**
     * Gets the erandid_tekstina value for this Xbrlesita_yldandmed.
     * 
     * @return erandid_tekstina
     */
    public java.lang.String getErandid_tekstina() {
        return erandid_tekstina;
    }


    /**
     * Sets the erandid_tekstina value for this Xbrlesita_yldandmed.
     * 
     * @param erandid_tekstina
     */
    public void setErandid_tekstina(java.lang.String erandid_tekstina) {
        this.erandid_tekstina = erandid_tekstina;
    }


    /**
     * Gets the tapsusaste value for this Xbrlesita_yldandmed.
     * 
     * @return tapsusaste
     */
    public java.math.BigInteger getTapsusaste() {
        return tapsusaste;
    }


    /**
     * Sets the tapsusaste value for this Xbrlesita_yldandmed.
     * 
     * @param tapsusaste
     */
    public void setTapsusaste(java.math.BigInteger tapsusaste) {
        this.tapsusaste = tapsusaste;
    }


    /**
     * Gets the tapsusaste_tekstina value for this Xbrlesita_yldandmed.
     * 
     * @return tapsusaste_tekstina
     */
    public java.lang.String getTapsusaste_tekstina() {
        return tapsusaste_tekstina;
    }


    /**
     * Sets the tapsusaste_tekstina value for this Xbrlesita_yldandmed.
     * 
     * @param tapsusaste_tekstina
     */
    public void setTapsusaste_tekstina(java.lang.String tapsusaste_tekstina) {
        this.tapsusaste_tekstina = tapsusaste_tekstina;
    }


    /**
     * Gets the aruande_liik value for this Xbrlesita_yldandmed.
     * 
     * @return aruande_liik
     */
    public java.lang.String getAruande_liik() {
        return aruande_liik;
    }


    /**
     * Sets the aruande_liik value for this Xbrlesita_yldandmed.
     * 
     * @param aruande_liik
     */
    public void setAruande_liik(java.lang.String aruande_liik) {
        this.aruande_liik = aruande_liik;
    }


    /**
     * Gets the xbrl_file_id value for this Xbrlesita_yldandmed.
     * 
     * @return xbrl_file_id
     */
    public java.lang.Integer getXbrl_file_id() {
        return xbrl_file_id;
    }


    /**
     * Sets the xbrl_file_id value for this Xbrlesita_yldandmed.
     * 
     * @param xbrl_file_id
     */
    public void setXbrl_file_id(java.lang.Integer xbrl_file_id) {
        this.xbrl_file_id = xbrl_file_id;
    }


    /**
     * Gets the ddoc_file_id value for this Xbrlesita_yldandmed.
     * 
     * @return ddoc_file_id
     */
    public java.lang.Integer getDdoc_file_id() {
        return ddoc_file_id;
    }


    /**
     * Sets the ddoc_file_id value for this Xbrlesita_yldandmed.
     * 
     * @param ddoc_file_id
     */
    public void setDdoc_file_id(java.lang.Integer ddoc_file_id) {
        this.ddoc_file_id = ddoc_file_id;
    }


    /**
     * Gets the xbrl_aruande_id value for this Xbrlesita_yldandmed.
     * 
     * @return xbrl_aruande_id
     */
    public java.math.BigInteger getXbrl_aruande_id() {
        return xbrl_aruande_id;
    }


    /**
     * Sets the xbrl_aruande_id value for this Xbrlesita_yldandmed.
     * 
     * @param xbrl_aruande_id
     */
    public void setXbrl_aruande_id(java.math.BigInteger xbrl_aruande_id) {
        this.xbrl_aruande_id = xbrl_aruande_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesita_yldandmed)) return false;
        Xbrlesita_yldandmed other = (Xbrlesita_yldandmed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.majaasta_algus==null && other.getMajaasta_algus()==null) || 
             (this.majaasta_algus!=null &&
              this.majaasta_algus.equals(other.getMajaasta_algus()))) &&
            ((this.majaasta_lopp==null && other.getMajaasta_lopp()==null) || 
             (this.majaasta_lopp!=null &&
              this.majaasta_lopp.equals(other.getMajaasta_lopp()))) &&
            ((this.standard==null && other.getStandard()==null) || 
             (this.standard!=null &&
              this.standard.equals(other.getStandard()))) &&
            ((this.standard_tekstina==null && other.getStandard_tekstina()==null) || 
             (this.standard_tekstina!=null &&
              this.standard_tekstina.equals(other.getStandard_tekstina()))) &&
            this.konsolideeritud == other.isKonsolideeritud() &&
            ((this.erandid==null && other.getErandid()==null) || 
             (this.erandid!=null &&
              this.erandid.equals(other.getErandid()))) &&
            ((this.erandid_tekstina==null && other.getErandid_tekstina()==null) || 
             (this.erandid_tekstina!=null &&
              this.erandid_tekstina.equals(other.getErandid_tekstina()))) &&
            ((this.tapsusaste==null && other.getTapsusaste()==null) || 
             (this.tapsusaste!=null &&
              this.tapsusaste.equals(other.getTapsusaste()))) &&
            ((this.tapsusaste_tekstina==null && other.getTapsusaste_tekstina()==null) || 
             (this.tapsusaste_tekstina!=null &&
              this.tapsusaste_tekstina.equals(other.getTapsusaste_tekstina()))) &&
            ((this.aruande_liik==null && other.getAruande_liik()==null) || 
             (this.aruande_liik!=null &&
              this.aruande_liik.equals(other.getAruande_liik()))) &&
            ((this.xbrl_file_id==null && other.getXbrl_file_id()==null) || 
             (this.xbrl_file_id!=null &&
              this.xbrl_file_id.equals(other.getXbrl_file_id()))) &&
            ((this.ddoc_file_id==null && other.getDdoc_file_id()==null) || 
             (this.ddoc_file_id!=null &&
              this.ddoc_file_id.equals(other.getDdoc_file_id()))) &&
            ((this.xbrl_aruande_id==null && other.getXbrl_aruande_id()==null) || 
             (this.xbrl_aruande_id!=null &&
              this.xbrl_aruande_id.equals(other.getXbrl_aruande_id())));
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
        _hashCode += getAriregistri_kood();
        if (getMajaasta_algus() != null) {
            _hashCode += getMajaasta_algus().hashCode();
        }
        if (getMajaasta_lopp() != null) {
            _hashCode += getMajaasta_lopp().hashCode();
        }
        if (getStandard() != null) {
            _hashCode += getStandard().hashCode();
        }
        if (getStandard_tekstina() != null) {
            _hashCode += getStandard_tekstina().hashCode();
        }
        _hashCode += (isKonsolideeritud() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErandid() != null) {
            _hashCode += getErandid().hashCode();
        }
        if (getErandid_tekstina() != null) {
            _hashCode += getErandid_tekstina().hashCode();
        }
        if (getTapsusaste() != null) {
            _hashCode += getTapsusaste().hashCode();
        }
        if (getTapsusaste_tekstina() != null) {
            _hashCode += getTapsusaste_tekstina().hashCode();
        }
        if (getAruande_liik() != null) {
            _hashCode += getAruande_liik().hashCode();
        }
        if (getXbrl_file_id() != null) {
            _hashCode += getXbrl_file_id().hashCode();
        }
        if (getDdoc_file_id() != null) {
            _hashCode += getDdoc_file_id().hashCode();
        }
        if (getXbrl_aruande_id() != null) {
            _hashCode += getXbrl_aruande_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
