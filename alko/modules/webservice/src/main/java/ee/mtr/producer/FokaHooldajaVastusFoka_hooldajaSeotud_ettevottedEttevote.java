/**
 * FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote  implements java.io.Serializable {
    private java.lang.String registrikood;

    private java.lang.String ettevotte_nimi;

    private ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik loa_liik;

    public FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote() {
    }

    public FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote(
           java.lang.String registrikood,
           java.lang.String ettevotte_nimi,
           ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik loa_liik) {
           this.registrikood = registrikood;
           this.ettevotte_nimi = ettevotte_nimi;
           this.loa_liik = loa_liik;
    }


    /**
     * Gets the registrikood value for this FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.
     * 
     * @return registrikood
     */
    public java.lang.String getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.lang.String registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the ettevotte_nimi value for this FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.
     * 
     * @return ettevotte_nimi
     */
    public java.lang.String getEttevotte_nimi() {
        return ettevotte_nimi;
    }


    /**
     * Sets the ettevotte_nimi value for this FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.
     * 
     * @param ettevotte_nimi
     */
    public void setEttevotte_nimi(java.lang.String ettevotte_nimi) {
        this.ettevotte_nimi = ettevotte_nimi;
    }


    /**
     * Gets the loa_liik value for this FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.
     * 
     * @return loa_liik
     */
    public ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik getLoa_liik() {
        return loa_liik;
    }


    /**
     * Sets the loa_liik value for this FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.
     * 
     * @param loa_liik
     */
    public void setLoa_liik(ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik loa_liik) {
        this.loa_liik = loa_liik;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote)) return false;
        FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote other = (FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood()))) &&
            ((this.ettevotte_nimi==null && other.getEttevotte_nimi()==null) || 
             (this.ettevotte_nimi!=null &&
              this.ettevotte_nimi.equals(other.getEttevotte_nimi()))) &&
            ((this.loa_liik==null && other.getLoa_liik()==null) || 
             (this.loa_liik!=null &&
              this.loa_liik.equals(other.getLoa_liik())));
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
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        if (getEttevotte_nimi() != null) {
            _hashCode += getEttevotte_nimi().hashCode();
        }
        if (getLoa_liik() != null) {
            _hashCode += getLoa_liik().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
