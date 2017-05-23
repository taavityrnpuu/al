/**
 * Detailandmed_v5_sidevahend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_sidevahend  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.lang.String liik;

    private java.lang.String liik_tekstina;

    private java.lang.String sisu;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_sidevahend() {
    }

    public Detailandmed_v5_sidevahend(
           java.math.BigInteger kirje_id,
           java.lang.String liik,
           java.lang.String liik_tekstina,
           java.lang.String sisu,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.liik = liik;
           this.liik_tekstina = liik_tekstina;
           this.sisu = sisu;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_sidevahend.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_sidevahend.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the liik value for this Detailandmed_v5_sidevahend.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Detailandmed_v5_sidevahend.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the liik_tekstina value for this Detailandmed_v5_sidevahend.
     * 
     * @return liik_tekstina
     */
    public java.lang.String getLiik_tekstina() {
        return liik_tekstina;
    }


    /**
     * Sets the liik_tekstina value for this Detailandmed_v5_sidevahend.
     * 
     * @param liik_tekstina
     */
    public void setLiik_tekstina(java.lang.String liik_tekstina) {
        this.liik_tekstina = liik_tekstina;
    }


    /**
     * Gets the sisu value for this Detailandmed_v5_sidevahend.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this Detailandmed_v5_sidevahend.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_sidevahend.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_sidevahend.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_sidevahend.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_sidevahend.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_sidevahend)) return false;
        Detailandmed_v5_sidevahend other = (Detailandmed_v5_sidevahend) obj;
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
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.liik_tekstina==null && other.getLiik_tekstina()==null) || 
             (this.liik_tekstina!=null &&
              this.liik_tekstina.equals(other.getLiik_tekstina()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getLiik_tekstina() != null) {
            _hashCode += getLiik_tekstina().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
