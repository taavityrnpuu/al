/**
 * Detailandmed_v5_hy_kitsendus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_hy_kitsendus  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.lang.String tyyp;

    private java.lang.String tyyp_tekstina;

    private java.lang.String sisu;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_hy_kitsendus() {
    }

    public Detailandmed_v5_hy_kitsendus(
           java.math.BigInteger kirje_id,
           java.lang.String tyyp,
           java.lang.String tyyp_tekstina,
           java.lang.String sisu,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.tyyp = tyyp;
           this.tyyp_tekstina = tyyp_tekstina;
           this.sisu = sisu;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the tyyp value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the tyyp_tekstina value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @return tyyp_tekstina
     */
    public java.lang.String getTyyp_tekstina() {
        return tyyp_tekstina;
    }


    /**
     * Sets the tyyp_tekstina value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @param tyyp_tekstina
     */
    public void setTyyp_tekstina(java.lang.String tyyp_tekstina) {
        this.tyyp_tekstina = tyyp_tekstina;
    }


    /**
     * Gets the sisu value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_hy_kitsendus.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_hy_kitsendus)) return false;
        Detailandmed_v5_hy_kitsendus other = (Detailandmed_v5_hy_kitsendus) obj;
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
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.tyyp_tekstina==null && other.getTyyp_tekstina()==null) || 
             (this.tyyp_tekstina!=null &&
              this.tyyp_tekstina.equals(other.getTyyp_tekstina()))) &&
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getTyyp_tekstina() != null) {
            _hashCode += getTyyp_tekstina().hashCode();
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
