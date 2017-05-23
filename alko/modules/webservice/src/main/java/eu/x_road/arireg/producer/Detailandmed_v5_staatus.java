/**
 * Detailandmed_v5_staatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_staatus  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String staatus;

    private java.lang.String staatus_tekstina;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_staatus() {
    }

    public Detailandmed_v5_staatus(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String staatus,
           java.lang.String staatus_tekstina,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.staatus = staatus;
           this.staatus_tekstina = staatus_tekstina;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_staatus.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_staatus.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_staatus.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_staatus.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_staatus.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_staatus.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_staatus.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_staatus.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_staatus.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_staatus.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the staatus value for this Detailandmed_v5_staatus.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Detailandmed_v5_staatus.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_tekstina value for this Detailandmed_v5_staatus.
     * 
     * @return staatus_tekstina
     */
    public java.lang.String getStaatus_tekstina() {
        return staatus_tekstina;
    }


    /**
     * Sets the staatus_tekstina value for this Detailandmed_v5_staatus.
     * 
     * @param staatus_tekstina
     */
    public void setStaatus_tekstina(java.lang.String staatus_tekstina) {
        this.staatus_tekstina = staatus_tekstina;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_staatus.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_staatus.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_staatus.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_staatus.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_staatus)) return false;
        Detailandmed_v5_staatus other = (Detailandmed_v5_staatus) obj;
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
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_tekstina==null && other.getStaatus_tekstina()==null) || 
             (this.staatus_tekstina!=null &&
              this.staatus_tekstina.equals(other.getStaatus_tekstina()))) &&
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
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_tekstina() != null) {
            _hashCode += getStaatus_tekstina().hashCode();
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
