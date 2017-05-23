/**
 * Detailandmed_v5_aruande_info.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_aruande_info  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.util.Date majandusaasta_perioodi_algus_kpv;

    private java.util.Date majandusaasta_perioodi_lopp_kpv;

    private java.math.BigInteger tootajate_arv;

    private java.lang.String ettevotja_aadress_aruandes;

    private java.lang.String tegevusala_emtak_kood;

    private java.lang.String tegevusala_emtak_tekstina;

    private java.math.BigInteger tegevusala_emtak_versioon;

    private java.lang.String tegevusala_emtak_versioon_tekstina;

    private java.lang.String tegevusala_nace_kood;

    public Detailandmed_v5_aruande_info() {
    }

    public Detailandmed_v5_aruande_info(
           java.math.BigInteger kirje_id,
           java.util.Date majandusaasta_perioodi_algus_kpv,
           java.util.Date majandusaasta_perioodi_lopp_kpv,
           java.math.BigInteger tootajate_arv,
           java.lang.String ettevotja_aadress_aruandes,
           java.lang.String tegevusala_emtak_kood,
           java.lang.String tegevusala_emtak_tekstina,
           java.math.BigInteger tegevusala_emtak_versioon,
           java.lang.String tegevusala_emtak_versioon_tekstina,
           java.lang.String tegevusala_nace_kood) {
           this.kirje_id = kirje_id;
           this.majandusaasta_perioodi_algus_kpv = majandusaasta_perioodi_algus_kpv;
           this.majandusaasta_perioodi_lopp_kpv = majandusaasta_perioodi_lopp_kpv;
           this.tootajate_arv = tootajate_arv;
           this.ettevotja_aadress_aruandes = ettevotja_aadress_aruandes;
           this.tegevusala_emtak_kood = tegevusala_emtak_kood;
           this.tegevusala_emtak_tekstina = tegevusala_emtak_tekstina;
           this.tegevusala_emtak_versioon = tegevusala_emtak_versioon;
           this.tegevusala_emtak_versioon_tekstina = tegevusala_emtak_versioon_tekstina;
           this.tegevusala_nace_kood = tegevusala_nace_kood;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_aruande_info.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_aruande_info.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the majandusaasta_perioodi_algus_kpv value for this Detailandmed_v5_aruande_info.
     * 
     * @return majandusaasta_perioodi_algus_kpv
     */
    public java.util.Date getMajandusaasta_perioodi_algus_kpv() {
        return majandusaasta_perioodi_algus_kpv;
    }


    /**
     * Sets the majandusaasta_perioodi_algus_kpv value for this Detailandmed_v5_aruande_info.
     * 
     * @param majandusaasta_perioodi_algus_kpv
     */
    public void setMajandusaasta_perioodi_algus_kpv(java.util.Date majandusaasta_perioodi_algus_kpv) {
        this.majandusaasta_perioodi_algus_kpv = majandusaasta_perioodi_algus_kpv;
    }


    /**
     * Gets the majandusaasta_perioodi_lopp_kpv value for this Detailandmed_v5_aruande_info.
     * 
     * @return majandusaasta_perioodi_lopp_kpv
     */
    public java.util.Date getMajandusaasta_perioodi_lopp_kpv() {
        return majandusaasta_perioodi_lopp_kpv;
    }


    /**
     * Sets the majandusaasta_perioodi_lopp_kpv value for this Detailandmed_v5_aruande_info.
     * 
     * @param majandusaasta_perioodi_lopp_kpv
     */
    public void setMajandusaasta_perioodi_lopp_kpv(java.util.Date majandusaasta_perioodi_lopp_kpv) {
        this.majandusaasta_perioodi_lopp_kpv = majandusaasta_perioodi_lopp_kpv;
    }


    /**
     * Gets the tootajate_arv value for this Detailandmed_v5_aruande_info.
     * 
     * @return tootajate_arv
     */
    public java.math.BigInteger getTootajate_arv() {
        return tootajate_arv;
    }


    /**
     * Sets the tootajate_arv value for this Detailandmed_v5_aruande_info.
     * 
     * @param tootajate_arv
     */
    public void setTootajate_arv(java.math.BigInteger tootajate_arv) {
        this.tootajate_arv = tootajate_arv;
    }


    /**
     * Gets the ettevotja_aadress_aruandes value for this Detailandmed_v5_aruande_info.
     * 
     * @return ettevotja_aadress_aruandes
     */
    public java.lang.String getEttevotja_aadress_aruandes() {
        return ettevotja_aadress_aruandes;
    }


    /**
     * Sets the ettevotja_aadress_aruandes value for this Detailandmed_v5_aruande_info.
     * 
     * @param ettevotja_aadress_aruandes
     */
    public void setEttevotja_aadress_aruandes(java.lang.String ettevotja_aadress_aruandes) {
        this.ettevotja_aadress_aruandes = ettevotja_aadress_aruandes;
    }


    /**
     * Gets the tegevusala_emtak_kood value for this Detailandmed_v5_aruande_info.
     * 
     * @return tegevusala_emtak_kood
     */
    public java.lang.String getTegevusala_emtak_kood() {
        return tegevusala_emtak_kood;
    }


    /**
     * Sets the tegevusala_emtak_kood value for this Detailandmed_v5_aruande_info.
     * 
     * @param tegevusala_emtak_kood
     */
    public void setTegevusala_emtak_kood(java.lang.String tegevusala_emtak_kood) {
        this.tegevusala_emtak_kood = tegevusala_emtak_kood;
    }


    /**
     * Gets the tegevusala_emtak_tekstina value for this Detailandmed_v5_aruande_info.
     * 
     * @return tegevusala_emtak_tekstina
     */
    public java.lang.String getTegevusala_emtak_tekstina() {
        return tegevusala_emtak_tekstina;
    }


    /**
     * Sets the tegevusala_emtak_tekstina value for this Detailandmed_v5_aruande_info.
     * 
     * @param tegevusala_emtak_tekstina
     */
    public void setTegevusala_emtak_tekstina(java.lang.String tegevusala_emtak_tekstina) {
        this.tegevusala_emtak_tekstina = tegevusala_emtak_tekstina;
    }


    /**
     * Gets the tegevusala_emtak_versioon value for this Detailandmed_v5_aruande_info.
     * 
     * @return tegevusala_emtak_versioon
     */
    public java.math.BigInteger getTegevusala_emtak_versioon() {
        return tegevusala_emtak_versioon;
    }


    /**
     * Sets the tegevusala_emtak_versioon value for this Detailandmed_v5_aruande_info.
     * 
     * @param tegevusala_emtak_versioon
     */
    public void setTegevusala_emtak_versioon(java.math.BigInteger tegevusala_emtak_versioon) {
        this.tegevusala_emtak_versioon = tegevusala_emtak_versioon;
    }


    /**
     * Gets the tegevusala_emtak_versioon_tekstina value for this Detailandmed_v5_aruande_info.
     * 
     * @return tegevusala_emtak_versioon_tekstina
     */
    public java.lang.String getTegevusala_emtak_versioon_tekstina() {
        return tegevusala_emtak_versioon_tekstina;
    }


    /**
     * Sets the tegevusala_emtak_versioon_tekstina value for this Detailandmed_v5_aruande_info.
     * 
     * @param tegevusala_emtak_versioon_tekstina
     */
    public void setTegevusala_emtak_versioon_tekstina(java.lang.String tegevusala_emtak_versioon_tekstina) {
        this.tegevusala_emtak_versioon_tekstina = tegevusala_emtak_versioon_tekstina;
    }


    /**
     * Gets the tegevusala_nace_kood value for this Detailandmed_v5_aruande_info.
     * 
     * @return tegevusala_nace_kood
     */
    public java.lang.String getTegevusala_nace_kood() {
        return tegevusala_nace_kood;
    }


    /**
     * Sets the tegevusala_nace_kood value for this Detailandmed_v5_aruande_info.
     * 
     * @param tegevusala_nace_kood
     */
    public void setTegevusala_nace_kood(java.lang.String tegevusala_nace_kood) {
        this.tegevusala_nace_kood = tegevusala_nace_kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_aruande_info)) return false;
        Detailandmed_v5_aruande_info other = (Detailandmed_v5_aruande_info) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirje_id==null && other.getKirje_id()==null) || 
             (this.kirje_id!=null &&
              this.kirje_id.equals(other.getKirje_id()))) &&
            ((this.majandusaasta_perioodi_algus_kpv==null && other.getMajandusaasta_perioodi_algus_kpv()==null) || 
             (this.majandusaasta_perioodi_algus_kpv!=null &&
              this.majandusaasta_perioodi_algus_kpv.equals(other.getMajandusaasta_perioodi_algus_kpv()))) &&
            ((this.majandusaasta_perioodi_lopp_kpv==null && other.getMajandusaasta_perioodi_lopp_kpv()==null) || 
             (this.majandusaasta_perioodi_lopp_kpv!=null &&
              this.majandusaasta_perioodi_lopp_kpv.equals(other.getMajandusaasta_perioodi_lopp_kpv()))) &&
            ((this.tootajate_arv==null && other.getTootajate_arv()==null) || 
             (this.tootajate_arv!=null &&
              this.tootajate_arv.equals(other.getTootajate_arv()))) &&
            ((this.ettevotja_aadress_aruandes==null && other.getEttevotja_aadress_aruandes()==null) || 
             (this.ettevotja_aadress_aruandes!=null &&
              this.ettevotja_aadress_aruandes.equals(other.getEttevotja_aadress_aruandes()))) &&
            ((this.tegevusala_emtak_kood==null && other.getTegevusala_emtak_kood()==null) || 
             (this.tegevusala_emtak_kood!=null &&
              this.tegevusala_emtak_kood.equals(other.getTegevusala_emtak_kood()))) &&
            ((this.tegevusala_emtak_tekstina==null && other.getTegevusala_emtak_tekstina()==null) || 
             (this.tegevusala_emtak_tekstina!=null &&
              this.tegevusala_emtak_tekstina.equals(other.getTegevusala_emtak_tekstina()))) &&
            ((this.tegevusala_emtak_versioon==null && other.getTegevusala_emtak_versioon()==null) || 
             (this.tegevusala_emtak_versioon!=null &&
              this.tegevusala_emtak_versioon.equals(other.getTegevusala_emtak_versioon()))) &&
            ((this.tegevusala_emtak_versioon_tekstina==null && other.getTegevusala_emtak_versioon_tekstina()==null) || 
             (this.tegevusala_emtak_versioon_tekstina!=null &&
              this.tegevusala_emtak_versioon_tekstina.equals(other.getTegevusala_emtak_versioon_tekstina()))) &&
            ((this.tegevusala_nace_kood==null && other.getTegevusala_nace_kood()==null) || 
             (this.tegevusala_nace_kood!=null &&
              this.tegevusala_nace_kood.equals(other.getTegevusala_nace_kood())));
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
        if (getKirje_id() != null) {
            _hashCode += getKirje_id().hashCode();
        }
        if (getMajandusaasta_perioodi_algus_kpv() != null) {
            _hashCode += getMajandusaasta_perioodi_algus_kpv().hashCode();
        }
        if (getMajandusaasta_perioodi_lopp_kpv() != null) {
            _hashCode += getMajandusaasta_perioodi_lopp_kpv().hashCode();
        }
        if (getTootajate_arv() != null) {
            _hashCode += getTootajate_arv().hashCode();
        }
        if (getEttevotja_aadress_aruandes() != null) {
            _hashCode += getEttevotja_aadress_aruandes().hashCode();
        }
        if (getTegevusala_emtak_kood() != null) {
            _hashCode += getTegevusala_emtak_kood().hashCode();
        }
        if (getTegevusala_emtak_tekstina() != null) {
            _hashCode += getTegevusala_emtak_tekstina().hashCode();
        }
        if (getTegevusala_emtak_versioon() != null) {
            _hashCode += getTegevusala_emtak_versioon().hashCode();
        }
        if (getTegevusala_emtak_versioon_tekstina() != null) {
            _hashCode += getTegevusala_emtak_versioon_tekstina().hashCode();
        }
        if (getTegevusala_nace_kood() != null) {
            _hashCode += getTegevusala_nace_kood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
