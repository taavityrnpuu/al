/**
 * Detailandmed_v5_osa_pant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_osa_pant  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.lang.String osapant_voi_tingimuslik_voorandamine;

    private java.lang.String osa_omaniku_liik;

    private java.lang.String osa_omaniku_isikukood_registrikood;

    private java.lang.String osa_omaniku_valis_kood;

    private java.util.Date osa_omaniku_synniaeg;

    private java.lang.String osa_omaniku_nimi;

    private java.lang.String osa_omaniku_eesnimi;

    private java.math.BigDecimal osa_suurus;

    private java.math.BigInteger osapandi_jarjekoht;

    private java.lang.String osapandi_kirjeldus;

    private java.util.Date osapandi_algus_kpv;

    private java.util.Date osapandi_lopp_kpv;

    private eu.x_road.arireg.producer.Detailandmed_v5_pandipidaja[] pandipidajad;

    public Detailandmed_v5_osa_pant() {
    }

    public Detailandmed_v5_osa_pant(
           java.math.BigInteger kirje_id,
           java.lang.String osapant_voi_tingimuslik_voorandamine,
           java.lang.String osa_omaniku_liik,
           java.lang.String osa_omaniku_isikukood_registrikood,
           java.lang.String osa_omaniku_valis_kood,
           java.util.Date osa_omaniku_synniaeg,
           java.lang.String osa_omaniku_nimi,
           java.lang.String osa_omaniku_eesnimi,
           java.math.BigDecimal osa_suurus,
           java.math.BigInteger osapandi_jarjekoht,
           java.lang.String osapandi_kirjeldus,
           java.util.Date osapandi_algus_kpv,
           java.util.Date osapandi_lopp_kpv,
           eu.x_road.arireg.producer.Detailandmed_v5_pandipidaja[] pandipidajad) {
           this.kirje_id = kirje_id;
           this.osapant_voi_tingimuslik_voorandamine = osapant_voi_tingimuslik_voorandamine;
           this.osa_omaniku_liik = osa_omaniku_liik;
           this.osa_omaniku_isikukood_registrikood = osa_omaniku_isikukood_registrikood;
           this.osa_omaniku_valis_kood = osa_omaniku_valis_kood;
           this.osa_omaniku_synniaeg = osa_omaniku_synniaeg;
           this.osa_omaniku_nimi = osa_omaniku_nimi;
           this.osa_omaniku_eesnimi = osa_omaniku_eesnimi;
           this.osa_suurus = osa_suurus;
           this.osapandi_jarjekoht = osapandi_jarjekoht;
           this.osapandi_kirjeldus = osapandi_kirjeldus;
           this.osapandi_algus_kpv = osapandi_algus_kpv;
           this.osapandi_lopp_kpv = osapandi_lopp_kpv;
           this.pandipidajad = pandipidajad;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_osa_pant.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_osa_pant.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the osapant_voi_tingimuslik_voorandamine value for this Detailandmed_v5_osa_pant.
     * 
     * @return osapant_voi_tingimuslik_voorandamine
     */
    public java.lang.String getOsapant_voi_tingimuslik_voorandamine() {
        return osapant_voi_tingimuslik_voorandamine;
    }


    /**
     * Sets the osapant_voi_tingimuslik_voorandamine value for this Detailandmed_v5_osa_pant.
     * 
     * @param osapant_voi_tingimuslik_voorandamine
     */
    public void setOsapant_voi_tingimuslik_voorandamine(java.lang.String osapant_voi_tingimuslik_voorandamine) {
        this.osapant_voi_tingimuslik_voorandamine = osapant_voi_tingimuslik_voorandamine;
    }


    /**
     * Gets the osa_omaniku_liik value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_omaniku_liik
     */
    public java.lang.String getOsa_omaniku_liik() {
        return osa_omaniku_liik;
    }


    /**
     * Sets the osa_omaniku_liik value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_omaniku_liik
     */
    public void setOsa_omaniku_liik(java.lang.String osa_omaniku_liik) {
        this.osa_omaniku_liik = osa_omaniku_liik;
    }


    /**
     * Gets the osa_omaniku_isikukood_registrikood value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_omaniku_isikukood_registrikood
     */
    public java.lang.String getOsa_omaniku_isikukood_registrikood() {
        return osa_omaniku_isikukood_registrikood;
    }


    /**
     * Sets the osa_omaniku_isikukood_registrikood value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_omaniku_isikukood_registrikood
     */
    public void setOsa_omaniku_isikukood_registrikood(java.lang.String osa_omaniku_isikukood_registrikood) {
        this.osa_omaniku_isikukood_registrikood = osa_omaniku_isikukood_registrikood;
    }


    /**
     * Gets the osa_omaniku_valis_kood value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_omaniku_valis_kood
     */
    public java.lang.String getOsa_omaniku_valis_kood() {
        return osa_omaniku_valis_kood;
    }


    /**
     * Sets the osa_omaniku_valis_kood value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_omaniku_valis_kood
     */
    public void setOsa_omaniku_valis_kood(java.lang.String osa_omaniku_valis_kood) {
        this.osa_omaniku_valis_kood = osa_omaniku_valis_kood;
    }


    /**
     * Gets the osa_omaniku_synniaeg value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_omaniku_synniaeg
     */
    public java.util.Date getOsa_omaniku_synniaeg() {
        return osa_omaniku_synniaeg;
    }


    /**
     * Sets the osa_omaniku_synniaeg value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_omaniku_synniaeg
     */
    public void setOsa_omaniku_synniaeg(java.util.Date osa_omaniku_synniaeg) {
        this.osa_omaniku_synniaeg = osa_omaniku_synniaeg;
    }


    /**
     * Gets the osa_omaniku_nimi value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_omaniku_nimi
     */
    public java.lang.String getOsa_omaniku_nimi() {
        return osa_omaniku_nimi;
    }


    /**
     * Sets the osa_omaniku_nimi value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_omaniku_nimi
     */
    public void setOsa_omaniku_nimi(java.lang.String osa_omaniku_nimi) {
        this.osa_omaniku_nimi = osa_omaniku_nimi;
    }


    /**
     * Gets the osa_omaniku_eesnimi value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_omaniku_eesnimi
     */
    public java.lang.String getOsa_omaniku_eesnimi() {
        return osa_omaniku_eesnimi;
    }


    /**
     * Sets the osa_omaniku_eesnimi value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_omaniku_eesnimi
     */
    public void setOsa_omaniku_eesnimi(java.lang.String osa_omaniku_eesnimi) {
        this.osa_omaniku_eesnimi = osa_omaniku_eesnimi;
    }


    /**
     * Gets the osa_suurus value for this Detailandmed_v5_osa_pant.
     * 
     * @return osa_suurus
     */
    public java.math.BigDecimal getOsa_suurus() {
        return osa_suurus;
    }


    /**
     * Sets the osa_suurus value for this Detailandmed_v5_osa_pant.
     * 
     * @param osa_suurus
     */
    public void setOsa_suurus(java.math.BigDecimal osa_suurus) {
        this.osa_suurus = osa_suurus;
    }


    /**
     * Gets the osapandi_jarjekoht value for this Detailandmed_v5_osa_pant.
     * 
     * @return osapandi_jarjekoht
     */
    public java.math.BigInteger getOsapandi_jarjekoht() {
        return osapandi_jarjekoht;
    }


    /**
     * Sets the osapandi_jarjekoht value for this Detailandmed_v5_osa_pant.
     * 
     * @param osapandi_jarjekoht
     */
    public void setOsapandi_jarjekoht(java.math.BigInteger osapandi_jarjekoht) {
        this.osapandi_jarjekoht = osapandi_jarjekoht;
    }


    /**
     * Gets the osapandi_kirjeldus value for this Detailandmed_v5_osa_pant.
     * 
     * @return osapandi_kirjeldus
     */
    public java.lang.String getOsapandi_kirjeldus() {
        return osapandi_kirjeldus;
    }


    /**
     * Sets the osapandi_kirjeldus value for this Detailandmed_v5_osa_pant.
     * 
     * @param osapandi_kirjeldus
     */
    public void setOsapandi_kirjeldus(java.lang.String osapandi_kirjeldus) {
        this.osapandi_kirjeldus = osapandi_kirjeldus;
    }


    /**
     * Gets the osapandi_algus_kpv value for this Detailandmed_v5_osa_pant.
     * 
     * @return osapandi_algus_kpv
     */
    public java.util.Date getOsapandi_algus_kpv() {
        return osapandi_algus_kpv;
    }


    /**
     * Sets the osapandi_algus_kpv value for this Detailandmed_v5_osa_pant.
     * 
     * @param osapandi_algus_kpv
     */
    public void setOsapandi_algus_kpv(java.util.Date osapandi_algus_kpv) {
        this.osapandi_algus_kpv = osapandi_algus_kpv;
    }


    /**
     * Gets the osapandi_lopp_kpv value for this Detailandmed_v5_osa_pant.
     * 
     * @return osapandi_lopp_kpv
     */
    public java.util.Date getOsapandi_lopp_kpv() {
        return osapandi_lopp_kpv;
    }


    /**
     * Sets the osapandi_lopp_kpv value for this Detailandmed_v5_osa_pant.
     * 
     * @param osapandi_lopp_kpv
     */
    public void setOsapandi_lopp_kpv(java.util.Date osapandi_lopp_kpv) {
        this.osapandi_lopp_kpv = osapandi_lopp_kpv;
    }


    /**
     * Gets the pandipidajad value for this Detailandmed_v5_osa_pant.
     * 
     * @return pandipidajad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_pandipidaja[] getPandipidajad() {
        return pandipidajad;
    }


    /**
     * Sets the pandipidajad value for this Detailandmed_v5_osa_pant.
     * 
     * @param pandipidajad
     */
    public void setPandipidajad(eu.x_road.arireg.producer.Detailandmed_v5_pandipidaja[] pandipidajad) {
        this.pandipidajad = pandipidajad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_osa_pant)) return false;
        Detailandmed_v5_osa_pant other = (Detailandmed_v5_osa_pant) obj;
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
            ((this.osapant_voi_tingimuslik_voorandamine==null && other.getOsapant_voi_tingimuslik_voorandamine()==null) || 
             (this.osapant_voi_tingimuslik_voorandamine!=null &&
              this.osapant_voi_tingimuslik_voorandamine.equals(other.getOsapant_voi_tingimuslik_voorandamine()))) &&
            ((this.osa_omaniku_liik==null && other.getOsa_omaniku_liik()==null) || 
             (this.osa_omaniku_liik!=null &&
              this.osa_omaniku_liik.equals(other.getOsa_omaniku_liik()))) &&
            ((this.osa_omaniku_isikukood_registrikood==null && other.getOsa_omaniku_isikukood_registrikood()==null) || 
             (this.osa_omaniku_isikukood_registrikood!=null &&
              this.osa_omaniku_isikukood_registrikood.equals(other.getOsa_omaniku_isikukood_registrikood()))) &&
            ((this.osa_omaniku_valis_kood==null && other.getOsa_omaniku_valis_kood()==null) || 
             (this.osa_omaniku_valis_kood!=null &&
              this.osa_omaniku_valis_kood.equals(other.getOsa_omaniku_valis_kood()))) &&
            ((this.osa_omaniku_synniaeg==null && other.getOsa_omaniku_synniaeg()==null) || 
             (this.osa_omaniku_synniaeg!=null &&
              this.osa_omaniku_synniaeg.equals(other.getOsa_omaniku_synniaeg()))) &&
            ((this.osa_omaniku_nimi==null && other.getOsa_omaniku_nimi()==null) || 
             (this.osa_omaniku_nimi!=null &&
              this.osa_omaniku_nimi.equals(other.getOsa_omaniku_nimi()))) &&
            ((this.osa_omaniku_eesnimi==null && other.getOsa_omaniku_eesnimi()==null) || 
             (this.osa_omaniku_eesnimi!=null &&
              this.osa_omaniku_eesnimi.equals(other.getOsa_omaniku_eesnimi()))) &&
            ((this.osa_suurus==null && other.getOsa_suurus()==null) || 
             (this.osa_suurus!=null &&
              this.osa_suurus.equals(other.getOsa_suurus()))) &&
            ((this.osapandi_jarjekoht==null && other.getOsapandi_jarjekoht()==null) || 
             (this.osapandi_jarjekoht!=null &&
              this.osapandi_jarjekoht.equals(other.getOsapandi_jarjekoht()))) &&
            ((this.osapandi_kirjeldus==null && other.getOsapandi_kirjeldus()==null) || 
             (this.osapandi_kirjeldus!=null &&
              this.osapandi_kirjeldus.equals(other.getOsapandi_kirjeldus()))) &&
            ((this.osapandi_algus_kpv==null && other.getOsapandi_algus_kpv()==null) || 
             (this.osapandi_algus_kpv!=null &&
              this.osapandi_algus_kpv.equals(other.getOsapandi_algus_kpv()))) &&
            ((this.osapandi_lopp_kpv==null && other.getOsapandi_lopp_kpv()==null) || 
             (this.osapandi_lopp_kpv!=null &&
              this.osapandi_lopp_kpv.equals(other.getOsapandi_lopp_kpv()))) &&
            ((this.pandipidajad==null && other.getPandipidajad()==null) || 
             (this.pandipidajad!=null &&
              java.util.Arrays.equals(this.pandipidajad, other.getPandipidajad())));
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
        if (getOsapant_voi_tingimuslik_voorandamine() != null) {
            _hashCode += getOsapant_voi_tingimuslik_voorandamine().hashCode();
        }
        if (getOsa_omaniku_liik() != null) {
            _hashCode += getOsa_omaniku_liik().hashCode();
        }
        if (getOsa_omaniku_isikukood_registrikood() != null) {
            _hashCode += getOsa_omaniku_isikukood_registrikood().hashCode();
        }
        if (getOsa_omaniku_valis_kood() != null) {
            _hashCode += getOsa_omaniku_valis_kood().hashCode();
        }
        if (getOsa_omaniku_synniaeg() != null) {
            _hashCode += getOsa_omaniku_synniaeg().hashCode();
        }
        if (getOsa_omaniku_nimi() != null) {
            _hashCode += getOsa_omaniku_nimi().hashCode();
        }
        if (getOsa_omaniku_eesnimi() != null) {
            _hashCode += getOsa_omaniku_eesnimi().hashCode();
        }
        if (getOsa_suurus() != null) {
            _hashCode += getOsa_suurus().hashCode();
        }
        if (getOsapandi_jarjekoht() != null) {
            _hashCode += getOsapandi_jarjekoht().hashCode();
        }
        if (getOsapandi_kirjeldus() != null) {
            _hashCode += getOsapandi_kirjeldus().hashCode();
        }
        if (getOsapandi_algus_kpv() != null) {
            _hashCode += getOsapandi_algus_kpv().hashCode();
        }
        if (getOsapandi_lopp_kpv() != null) {
            _hashCode += getOsapandi_lopp_kpv().hashCode();
        }
        if (getPandipidajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPandipidajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPandipidajad(), i);
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
