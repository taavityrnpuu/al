/**
 * FokaHooldajaVastusFoka_hooldajaKliima.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajaVastusFoka_hooldajaKliima  implements java.io.Serializable {
    private java.lang.String dok_nr;

    private java.util.Date kehtivuse_algus_kpv;

    private java.util.Date kehtivuse_lopp_kpv;

    private java.lang.String dok_valjastaja_riik;

    private java.lang.String dok_valjastaja_asutus;

    private java.lang.String dok_valjastaja_registrikood;

    public FokaHooldajaVastusFoka_hooldajaKliima() {
    }

    public FokaHooldajaVastusFoka_hooldajaKliima(
           java.lang.String dok_nr,
           java.util.Date kehtivuse_algus_kpv,
           java.util.Date kehtivuse_lopp_kpv,
           java.lang.String dok_valjastaja_riik,
           java.lang.String dok_valjastaja_asutus,
           java.lang.String dok_valjastaja_registrikood) {
           this.dok_nr = dok_nr;
           this.kehtivuse_algus_kpv = kehtivuse_algus_kpv;
           this.kehtivuse_lopp_kpv = kehtivuse_lopp_kpv;
           this.dok_valjastaja_riik = dok_valjastaja_riik;
           this.dok_valjastaja_asutus = dok_valjastaja_asutus;
           this.dok_valjastaja_registrikood = dok_valjastaja_registrikood;
    }


    /**
     * Gets the dok_nr value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @return dok_nr
     */
    public java.lang.String getDok_nr() {
        return dok_nr;
    }


    /**
     * Sets the dok_nr value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @param dok_nr
     */
    public void setDok_nr(java.lang.String dok_nr) {
        this.dok_nr = dok_nr;
    }


    /**
     * Gets the kehtivuse_algus_kpv value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @return kehtivuse_algus_kpv
     */
    public java.util.Date getKehtivuse_algus_kpv() {
        return kehtivuse_algus_kpv;
    }


    /**
     * Sets the kehtivuse_algus_kpv value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @param kehtivuse_algus_kpv
     */
    public void setKehtivuse_algus_kpv(java.util.Date kehtivuse_algus_kpv) {
        this.kehtivuse_algus_kpv = kehtivuse_algus_kpv;
    }


    /**
     * Gets the kehtivuse_lopp_kpv value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @return kehtivuse_lopp_kpv
     */
    public java.util.Date getKehtivuse_lopp_kpv() {
        return kehtivuse_lopp_kpv;
    }


    /**
     * Sets the kehtivuse_lopp_kpv value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @param kehtivuse_lopp_kpv
     */
    public void setKehtivuse_lopp_kpv(java.util.Date kehtivuse_lopp_kpv) {
        this.kehtivuse_lopp_kpv = kehtivuse_lopp_kpv;
    }


    /**
     * Gets the dok_valjastaja_riik value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @return dok_valjastaja_riik
     */
    public java.lang.String getDok_valjastaja_riik() {
        return dok_valjastaja_riik;
    }


    /**
     * Sets the dok_valjastaja_riik value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @param dok_valjastaja_riik
     */
    public void setDok_valjastaja_riik(java.lang.String dok_valjastaja_riik) {
        this.dok_valjastaja_riik = dok_valjastaja_riik;
    }


    /**
     * Gets the dok_valjastaja_asutus value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @return dok_valjastaja_asutus
     */
    public java.lang.String getDok_valjastaja_asutus() {
        return dok_valjastaja_asutus;
    }


    /**
     * Sets the dok_valjastaja_asutus value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @param dok_valjastaja_asutus
     */
    public void setDok_valjastaja_asutus(java.lang.String dok_valjastaja_asutus) {
        this.dok_valjastaja_asutus = dok_valjastaja_asutus;
    }


    /**
     * Gets the dok_valjastaja_registrikood value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @return dok_valjastaja_registrikood
     */
    public java.lang.String getDok_valjastaja_registrikood() {
        return dok_valjastaja_registrikood;
    }


    /**
     * Sets the dok_valjastaja_registrikood value for this FokaHooldajaVastusFoka_hooldajaKliima.
     * 
     * @param dok_valjastaja_registrikood
     */
    public void setDok_valjastaja_registrikood(java.lang.String dok_valjastaja_registrikood) {
        this.dok_valjastaja_registrikood = dok_valjastaja_registrikood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FokaHooldajaVastusFoka_hooldajaKliima)) return false;
        FokaHooldajaVastusFoka_hooldajaKliima other = (FokaHooldajaVastusFoka_hooldajaKliima) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dok_nr==null && other.getDok_nr()==null) || 
             (this.dok_nr!=null &&
              this.dok_nr.equals(other.getDok_nr()))) &&
            ((this.kehtivuse_algus_kpv==null && other.getKehtivuse_algus_kpv()==null) || 
             (this.kehtivuse_algus_kpv!=null &&
              this.kehtivuse_algus_kpv.equals(other.getKehtivuse_algus_kpv()))) &&
            ((this.kehtivuse_lopp_kpv==null && other.getKehtivuse_lopp_kpv()==null) || 
             (this.kehtivuse_lopp_kpv!=null &&
              this.kehtivuse_lopp_kpv.equals(other.getKehtivuse_lopp_kpv()))) &&
            ((this.dok_valjastaja_riik==null && other.getDok_valjastaja_riik()==null) || 
             (this.dok_valjastaja_riik!=null &&
              this.dok_valjastaja_riik.equals(other.getDok_valjastaja_riik()))) &&
            ((this.dok_valjastaja_asutus==null && other.getDok_valjastaja_asutus()==null) || 
             (this.dok_valjastaja_asutus!=null &&
              this.dok_valjastaja_asutus.equals(other.getDok_valjastaja_asutus()))) &&
            ((this.dok_valjastaja_registrikood==null && other.getDok_valjastaja_registrikood()==null) || 
             (this.dok_valjastaja_registrikood!=null &&
              this.dok_valjastaja_registrikood.equals(other.getDok_valjastaja_registrikood())));
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
        if (getDok_nr() != null) {
            _hashCode += getDok_nr().hashCode();
        }
        if (getKehtivuse_algus_kpv() != null) {
            _hashCode += getKehtivuse_algus_kpv().hashCode();
        }
        if (getKehtivuse_lopp_kpv() != null) {
            _hashCode += getKehtivuse_lopp_kpv().hashCode();
        }
        if (getDok_valjastaja_riik() != null) {
            _hashCode += getDok_valjastaja_riik().hashCode();
        }
        if (getDok_valjastaja_asutus() != null) {
            _hashCode += getDok_valjastaja_asutus().hashCode();
        }
        if (getDok_valjastaja_registrikood() != null) {
            _hashCode += getDok_valjastaja_registrikood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
