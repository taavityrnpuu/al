/**
 * Ettevotja_muudatus_kandevaline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_kandevaline  implements java.io.Serializable {
    private java.lang.String kandevaline_tyyp;

    private java.lang.String ettevotja_id;

    private java.lang.Integer ettevotja_ariregistri_kood;

    private java.lang.String ettevotja_arinimi;

    private java.lang.String ettevotja_oiguslik_vorm;

    /* Kandevälise muudatuse kirje ID */
    private java.lang.String kirje_id;

    public Ettevotja_muudatus_kandevaline() {
    }

    public Ettevotja_muudatus_kandevaline(
           java.lang.String kandevaline_tyyp,
           java.lang.String ettevotja_id,
           java.lang.Integer ettevotja_ariregistri_kood,
           java.lang.String ettevotja_arinimi,
           java.lang.String ettevotja_oiguslik_vorm,
           java.lang.String kirje_id) {
           this.kandevaline_tyyp = kandevaline_tyyp;
           this.ettevotja_id = ettevotja_id;
           this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
           this.ettevotja_arinimi = ettevotja_arinimi;
           this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
           this.kirje_id = kirje_id;
    }


    /**
     * Gets the kandevaline_tyyp value for this Ettevotja_muudatus_kandevaline.
     * 
     * @return kandevaline_tyyp
     */
    public java.lang.String getKandevaline_tyyp() {
        return kandevaline_tyyp;
    }


    /**
     * Sets the kandevaline_tyyp value for this Ettevotja_muudatus_kandevaline.
     * 
     * @param kandevaline_tyyp
     */
    public void setKandevaline_tyyp(java.lang.String kandevaline_tyyp) {
        this.kandevaline_tyyp = kandevaline_tyyp;
    }


    /**
     * Gets the ettevotja_id value for this Ettevotja_muudatus_kandevaline.
     * 
     * @return ettevotja_id
     */
    public java.lang.String getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Ettevotja_muudatus_kandevaline.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.lang.String ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_kandevaline.
     * 
     * @return ettevotja_ariregistri_kood
     */
    public java.lang.Integer getEttevotja_ariregistri_kood() {
        return ettevotja_ariregistri_kood;
    }


    /**
     * Sets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_kandevaline.
     * 
     * @param ettevotja_ariregistri_kood
     */
    public void setEttevotja_ariregistri_kood(java.lang.Integer ettevotja_ariregistri_kood) {
        this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
    }


    /**
     * Gets the ettevotja_arinimi value for this Ettevotja_muudatus_kandevaline.
     * 
     * @return ettevotja_arinimi
     */
    public java.lang.String getEttevotja_arinimi() {
        return ettevotja_arinimi;
    }


    /**
     * Sets the ettevotja_arinimi value for this Ettevotja_muudatus_kandevaline.
     * 
     * @param ettevotja_arinimi
     */
    public void setEttevotja_arinimi(java.lang.String ettevotja_arinimi) {
        this.ettevotja_arinimi = ettevotja_arinimi;
    }


    /**
     * Gets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_kandevaline.
     * 
     * @return ettevotja_oiguslik_vorm
     */
    public java.lang.String getEttevotja_oiguslik_vorm() {
        return ettevotja_oiguslik_vorm;
    }


    /**
     * Sets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_kandevaline.
     * 
     * @param ettevotja_oiguslik_vorm
     */
    public void setEttevotja_oiguslik_vorm(java.lang.String ettevotja_oiguslik_vorm) {
        this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
    }


    /**
     * Gets the kirje_id value for this Ettevotja_muudatus_kandevaline.
     * 
     * @return kirje_id   * Kandevälise muudatuse kirje ID
     */
    public java.lang.String getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Ettevotja_muudatus_kandevaline.
     * 
     * @param kirje_id   * Kandevälise muudatuse kirje ID
     */
    public void setKirje_id(java.lang.String kirje_id) {
        this.kirje_id = kirje_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_kandevaline)) return false;
        Ettevotja_muudatus_kandevaline other = (Ettevotja_muudatus_kandevaline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kandevaline_tyyp==null && other.getKandevaline_tyyp()==null) || 
             (this.kandevaline_tyyp!=null &&
              this.kandevaline_tyyp.equals(other.getKandevaline_tyyp()))) &&
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id()))) &&
            ((this.ettevotja_ariregistri_kood==null && other.getEttevotja_ariregistri_kood()==null) || 
             (this.ettevotja_ariregistri_kood!=null &&
              this.ettevotja_ariregistri_kood.equals(other.getEttevotja_ariregistri_kood()))) &&
            ((this.ettevotja_arinimi==null && other.getEttevotja_arinimi()==null) || 
             (this.ettevotja_arinimi!=null &&
              this.ettevotja_arinimi.equals(other.getEttevotja_arinimi()))) &&
            ((this.ettevotja_oiguslik_vorm==null && other.getEttevotja_oiguslik_vorm()==null) || 
             (this.ettevotja_oiguslik_vorm!=null &&
              this.ettevotja_oiguslik_vorm.equals(other.getEttevotja_oiguslik_vorm()))) &&
            ((this.kirje_id==null && other.getKirje_id()==null) || 
             (this.kirje_id!=null &&
              this.kirje_id.equals(other.getKirje_id())));
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
        if (getKandevaline_tyyp() != null) {
            _hashCode += getKandevaline_tyyp().hashCode();
        }
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        if (getEttevotja_ariregistri_kood() != null) {
            _hashCode += getEttevotja_ariregistri_kood().hashCode();
        }
        if (getEttevotja_arinimi() != null) {
            _hashCode += getEttevotja_arinimi().hashCode();
        }
        if (getEttevotja_oiguslik_vorm() != null) {
            _hashCode += getEttevotja_oiguslik_vorm().hashCode();
        }
        if (getKirje_id() != null) {
            _hashCode += getKirje_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
