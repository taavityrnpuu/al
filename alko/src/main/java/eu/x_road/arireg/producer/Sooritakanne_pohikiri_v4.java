/**
 * Sooritakanne_pohikiri_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_pohikiri_v4  implements java.io.Serializable {
    private java.util.Date kinnitamise_aeg;

    /* 0 - tavapõhikiri, 1 - tüüppõhikiri, saab saata ainult ettevõtjaportaalist */
    private java.lang.String pohikirja_tyyp;

    private java.lang.String sisu;

    /* true - sisaldab eriõigusi, false ja puuduv - ei sisalda eriõigusi */
    private java.lang.Boolean sisaldab_erioigusi;

    public Sooritakanne_pohikiri_v4() {
    }

    public Sooritakanne_pohikiri_v4(
           java.util.Date kinnitamise_aeg,
           java.lang.String pohikirja_tyyp,
           java.lang.String sisu,
           java.lang.Boolean sisaldab_erioigusi) {
           this.kinnitamise_aeg = kinnitamise_aeg;
           this.pohikirja_tyyp = pohikirja_tyyp;
           this.sisu = sisu;
           this.sisaldab_erioigusi = sisaldab_erioigusi;
    }


    /**
     * Gets the kinnitamise_aeg value for this Sooritakanne_pohikiri_v4.
     * 
     * @return kinnitamise_aeg
     */
    public java.util.Date getKinnitamise_aeg() {
        return kinnitamise_aeg;
    }


    /**
     * Sets the kinnitamise_aeg value for this Sooritakanne_pohikiri_v4.
     * 
     * @param kinnitamise_aeg
     */
    public void setKinnitamise_aeg(java.util.Date kinnitamise_aeg) {
        this.kinnitamise_aeg = kinnitamise_aeg;
    }


    /**
     * Gets the pohikirja_tyyp value for this Sooritakanne_pohikiri_v4.
     * 
     * @return pohikirja_tyyp   * 0 - tavapõhikiri, 1 - tüüppõhikiri, saab saata ainult ettevõtjaportaalist
     */
    public java.lang.String getPohikirja_tyyp() {
        return pohikirja_tyyp;
    }


    /**
     * Sets the pohikirja_tyyp value for this Sooritakanne_pohikiri_v4.
     * 
     * @param pohikirja_tyyp   * 0 - tavapõhikiri, 1 - tüüppõhikiri, saab saata ainult ettevõtjaportaalist
     */
    public void setPohikirja_tyyp(java.lang.String pohikirja_tyyp) {
        this.pohikirja_tyyp = pohikirja_tyyp;
    }


    /**
     * Gets the sisu value for this Sooritakanne_pohikiri_v4.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this Sooritakanne_pohikiri_v4.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }


    /**
     * Gets the sisaldab_erioigusi value for this Sooritakanne_pohikiri_v4.
     * 
     * @return sisaldab_erioigusi   * true - sisaldab eriõigusi, false ja puuduv - ei sisalda eriõigusi
     */
    public java.lang.Boolean getSisaldab_erioigusi() {
        return sisaldab_erioigusi;
    }


    /**
     * Sets the sisaldab_erioigusi value for this Sooritakanne_pohikiri_v4.
     * 
     * @param sisaldab_erioigusi   * true - sisaldab eriõigusi, false ja puuduv - ei sisalda eriõigusi
     */
    public void setSisaldab_erioigusi(java.lang.Boolean sisaldab_erioigusi) {
        this.sisaldab_erioigusi = sisaldab_erioigusi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sooritakanne_pohikiri_v4)) return false;
        Sooritakanne_pohikiri_v4 other = (Sooritakanne_pohikiri_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kinnitamise_aeg==null && other.getKinnitamise_aeg()==null) || 
             (this.kinnitamise_aeg!=null &&
              this.kinnitamise_aeg.equals(other.getKinnitamise_aeg()))) &&
            ((this.pohikirja_tyyp==null && other.getPohikirja_tyyp()==null) || 
             (this.pohikirja_tyyp!=null &&
              this.pohikirja_tyyp.equals(other.getPohikirja_tyyp()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu()))) &&
            ((this.sisaldab_erioigusi==null && other.getSisaldab_erioigusi()==null) || 
             (this.sisaldab_erioigusi!=null &&
              this.sisaldab_erioigusi.equals(other.getSisaldab_erioigusi())));
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
        if (getKinnitamise_aeg() != null) {
            _hashCode += getKinnitamise_aeg().hashCode();
        }
        if (getPohikirja_tyyp() != null) {
            _hashCode += getPohikirja_tyyp().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        if (getSisaldab_erioigusi() != null) {
            _hashCode += getSisaldab_erioigusi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
