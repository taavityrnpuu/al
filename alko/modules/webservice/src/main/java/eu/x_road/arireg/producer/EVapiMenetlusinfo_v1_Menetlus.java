/**
 * EVapiMenetlusinfo_v1_Menetlus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiMenetlusinfo_v1_Menetlus  implements java.io.Serializable {
    private java.math.BigInteger menetluse_id;

    private java.math.BigInteger seotud_menetluse_id;

    private java.util.Date esit_kp;

    private java.lang.String menetluse_liik;

    private java.lang.String menetluse_olek;

    private java.lang.String ettevotja_reg_kood;

    private java.lang.String ettevotja_nimi;

    public EVapiMenetlusinfo_v1_Menetlus() {
    }

    public EVapiMenetlusinfo_v1_Menetlus(
           java.math.BigInteger menetluse_id,
           java.math.BigInteger seotud_menetluse_id,
           java.util.Date esit_kp,
           java.lang.String menetluse_liik,
           java.lang.String menetluse_olek,
           java.lang.String ettevotja_reg_kood,
           java.lang.String ettevotja_nimi) {
           this.menetluse_id = menetluse_id;
           this.seotud_menetluse_id = seotud_menetluse_id;
           this.esit_kp = esit_kp;
           this.menetluse_liik = menetluse_liik;
           this.menetluse_olek = menetluse_olek;
           this.ettevotja_reg_kood = ettevotja_reg_kood;
           this.ettevotja_nimi = ettevotja_nimi;
    }


    /**
     * Gets the menetluse_id value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return menetluse_id
     */
    public java.math.BigInteger getMenetluse_id() {
        return menetluse_id;
    }


    /**
     * Sets the menetluse_id value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param menetluse_id
     */
    public void setMenetluse_id(java.math.BigInteger menetluse_id) {
        this.menetluse_id = menetluse_id;
    }


    /**
     * Gets the seotud_menetluse_id value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return seotud_menetluse_id
     */
    public java.math.BigInteger getSeotud_menetluse_id() {
        return seotud_menetluse_id;
    }


    /**
     * Sets the seotud_menetluse_id value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param seotud_menetluse_id
     */
    public void setSeotud_menetluse_id(java.math.BigInteger seotud_menetluse_id) {
        this.seotud_menetluse_id = seotud_menetluse_id;
    }


    /**
     * Gets the esit_kp value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return esit_kp
     */
    public java.util.Date getEsit_kp() {
        return esit_kp;
    }


    /**
     * Sets the esit_kp value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param esit_kp
     */
    public void setEsit_kp(java.util.Date esit_kp) {
        this.esit_kp = esit_kp;
    }


    /**
     * Gets the menetluse_liik value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return menetluse_liik
     */
    public java.lang.String getMenetluse_liik() {
        return menetluse_liik;
    }


    /**
     * Sets the menetluse_liik value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param menetluse_liik
     */
    public void setMenetluse_liik(java.lang.String menetluse_liik) {
        this.menetluse_liik = menetluse_liik;
    }


    /**
     * Gets the menetluse_olek value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return menetluse_olek
     */
    public java.lang.String getMenetluse_olek() {
        return menetluse_olek;
    }


    /**
     * Sets the menetluse_olek value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param menetluse_olek
     */
    public void setMenetluse_olek(java.lang.String menetluse_olek) {
        this.menetluse_olek = menetluse_olek;
    }


    /**
     * Gets the ettevotja_reg_kood value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return ettevotja_reg_kood
     */
    public java.lang.String getEttevotja_reg_kood() {
        return ettevotja_reg_kood;
    }


    /**
     * Sets the ettevotja_reg_kood value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param ettevotja_reg_kood
     */
    public void setEttevotja_reg_kood(java.lang.String ettevotja_reg_kood) {
        this.ettevotja_reg_kood = ettevotja_reg_kood;
    }


    /**
     * Gets the ettevotja_nimi value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @return ettevotja_nimi
     */
    public java.lang.String getEttevotja_nimi() {
        return ettevotja_nimi;
    }


    /**
     * Sets the ettevotja_nimi value for this EVapiMenetlusinfo_v1_Menetlus.
     * 
     * @param ettevotja_nimi
     */
    public void setEttevotja_nimi(java.lang.String ettevotja_nimi) {
        this.ettevotja_nimi = ettevotja_nimi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiMenetlusinfo_v1_Menetlus)) return false;
        EVapiMenetlusinfo_v1_Menetlus other = (EVapiMenetlusinfo_v1_Menetlus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.menetluse_id==null && other.getMenetluse_id()==null) || 
             (this.menetluse_id!=null &&
              this.menetluse_id.equals(other.getMenetluse_id()))) &&
            ((this.seotud_menetluse_id==null && other.getSeotud_menetluse_id()==null) || 
             (this.seotud_menetluse_id!=null &&
              this.seotud_menetluse_id.equals(other.getSeotud_menetluse_id()))) &&
            ((this.esit_kp==null && other.getEsit_kp()==null) || 
             (this.esit_kp!=null &&
              this.esit_kp.equals(other.getEsit_kp()))) &&
            ((this.menetluse_liik==null && other.getMenetluse_liik()==null) || 
             (this.menetluse_liik!=null &&
              this.menetluse_liik.equals(other.getMenetluse_liik()))) &&
            ((this.menetluse_olek==null && other.getMenetluse_olek()==null) || 
             (this.menetluse_olek!=null &&
              this.menetluse_olek.equals(other.getMenetluse_olek()))) &&
            ((this.ettevotja_reg_kood==null && other.getEttevotja_reg_kood()==null) || 
             (this.ettevotja_reg_kood!=null &&
              this.ettevotja_reg_kood.equals(other.getEttevotja_reg_kood()))) &&
            ((this.ettevotja_nimi==null && other.getEttevotja_nimi()==null) || 
             (this.ettevotja_nimi!=null &&
              this.ettevotja_nimi.equals(other.getEttevotja_nimi())));
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
        if (getMenetluse_id() != null) {
            _hashCode += getMenetluse_id().hashCode();
        }
        if (getSeotud_menetluse_id() != null) {
            _hashCode += getSeotud_menetluse_id().hashCode();
        }
        if (getEsit_kp() != null) {
            _hashCode += getEsit_kp().hashCode();
        }
        if (getMenetluse_liik() != null) {
            _hashCode += getMenetluse_liik().hashCode();
        }
        if (getMenetluse_olek() != null) {
            _hashCode += getMenetluse_olek().hashCode();
        }
        if (getEttevotja_reg_kood() != null) {
            _hashCode += getEttevotja_reg_kood().hashCode();
        }
        if (getEttevotja_nimi() != null) {
            _hashCode += getEttevotja_nimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
