/**
 * Detailandmed_v5_esindusoiguse_eritingimus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_esindusoiguse_eritingimus  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String esinduse_tyyp;

    private java.lang.String esinduse_tyyp_tekstina;

    private java.lang.String esinduse_sisu;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_esindusoiguse_eritingimus() {
    }

    public Detailandmed_v5_esindusoiguse_eritingimus(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String esinduse_tyyp,
           java.lang.String esinduse_tyyp_tekstina,
           java.lang.String esinduse_sisu,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.esinduse_tyyp = esinduse_tyyp;
           this.esinduse_tyyp_tekstina = esinduse_tyyp_tekstina;
           this.esinduse_sisu = esinduse_sisu;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the esinduse_tyyp value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return esinduse_tyyp
     */
    public java.lang.String getEsinduse_tyyp() {
        return esinduse_tyyp;
    }


    /**
     * Sets the esinduse_tyyp value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param esinduse_tyyp
     */
    public void setEsinduse_tyyp(java.lang.String esinduse_tyyp) {
        this.esinduse_tyyp = esinduse_tyyp;
    }


    /**
     * Gets the esinduse_tyyp_tekstina value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return esinduse_tyyp_tekstina
     */
    public java.lang.String getEsinduse_tyyp_tekstina() {
        return esinduse_tyyp_tekstina;
    }


    /**
     * Sets the esinduse_tyyp_tekstina value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param esinduse_tyyp_tekstina
     */
    public void setEsinduse_tyyp_tekstina(java.lang.String esinduse_tyyp_tekstina) {
        this.esinduse_tyyp_tekstina = esinduse_tyyp_tekstina;
    }


    /**
     * Gets the esinduse_sisu value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return esinduse_sisu
     */
    public java.lang.String getEsinduse_sisu() {
        return esinduse_sisu;
    }


    /**
     * Sets the esinduse_sisu value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param esinduse_sisu
     */
    public void setEsinduse_sisu(java.lang.String esinduse_sisu) {
        this.esinduse_sisu = esinduse_sisu;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_esindusoiguse_eritingimus.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_esindusoiguse_eritingimus)) return false;
        Detailandmed_v5_esindusoiguse_eritingimus other = (Detailandmed_v5_esindusoiguse_eritingimus) obj;
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
            ((this.kaardi_piirkond==null && other.getKaardi_piirkond()==null) || 
             (this.kaardi_piirkond!=null &&
              this.kaardi_piirkond.equals(other.getKaardi_piirkond()))) &&
            ((this.kaardi_nr==null && other.getKaardi_nr()==null) || 
             (this.kaardi_nr!=null &&
              this.kaardi_nr.equals(other.getKaardi_nr()))) &&
            ((this.kaardi_tyyp==null && other.getKaardi_tyyp()==null) || 
             (this.kaardi_tyyp!=null &&
              this.kaardi_tyyp.equals(other.getKaardi_tyyp()))) &&
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.esinduse_tyyp==null && other.getEsinduse_tyyp()==null) || 
             (this.esinduse_tyyp!=null &&
              this.esinduse_tyyp.equals(other.getEsinduse_tyyp()))) &&
            ((this.esinduse_tyyp_tekstina==null && other.getEsinduse_tyyp_tekstina()==null) || 
             (this.esinduse_tyyp_tekstina!=null &&
              this.esinduse_tyyp_tekstina.equals(other.getEsinduse_tyyp_tekstina()))) &&
            ((this.esinduse_sisu==null && other.getEsinduse_sisu()==null) || 
             (this.esinduse_sisu!=null &&
              this.esinduse_sisu.equals(other.getEsinduse_sisu()))) &&
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
        if (getKaardi_piirkond() != null) {
            _hashCode += getKaardi_piirkond().hashCode();
        }
        if (getKaardi_nr() != null) {
            _hashCode += getKaardi_nr().hashCode();
        }
        if (getKaardi_tyyp() != null) {
            _hashCode += getKaardi_tyyp().hashCode();
        }
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getEsinduse_tyyp() != null) {
            _hashCode += getEsinduse_tyyp().hashCode();
        }
        if (getEsinduse_tyyp_tekstina() != null) {
            _hashCode += getEsinduse_tyyp_tekstina().hashCode();
        }
        if (getEsinduse_sisu() != null) {
            _hashCode += getEsinduse_sisu().hashCode();
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
