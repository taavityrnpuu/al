/**
 * Detailandmed_v5_kapital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_kapital  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String kapitali_suurus;

    private java.lang.String kapitali_valuuta;

    private java.lang.String kapitali_valuuta_tekstina;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_kapital() {
    }

    public Detailandmed_v5_kapital(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String kapitali_suurus,
           java.lang.String kapitali_valuuta,
           java.lang.String kapitali_valuuta_tekstina,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.kapitali_suurus = kapitali_suurus;
           this.kapitali_valuuta = kapitali_valuuta;
           this.kapitali_valuuta_tekstina = kapitali_valuuta_tekstina;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_kapital.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_kapital.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_kapital.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_kapital.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_kapital.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_kapital.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_kapital.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_kapital.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_kapital.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_kapital.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the kapitali_suurus value for this Detailandmed_v5_kapital.
     * 
     * @return kapitali_suurus
     */
    public java.lang.String getKapitali_suurus() {
        return kapitali_suurus;
    }


    /**
     * Sets the kapitali_suurus value for this Detailandmed_v5_kapital.
     * 
     * @param kapitali_suurus
     */
    public void setKapitali_suurus(java.lang.String kapitali_suurus) {
        this.kapitali_suurus = kapitali_suurus;
    }


    /**
     * Gets the kapitali_valuuta value for this Detailandmed_v5_kapital.
     * 
     * @return kapitali_valuuta
     */
    public java.lang.String getKapitali_valuuta() {
        return kapitali_valuuta;
    }


    /**
     * Sets the kapitali_valuuta value for this Detailandmed_v5_kapital.
     * 
     * @param kapitali_valuuta
     */
    public void setKapitali_valuuta(java.lang.String kapitali_valuuta) {
        this.kapitali_valuuta = kapitali_valuuta;
    }


    /**
     * Gets the kapitali_valuuta_tekstina value for this Detailandmed_v5_kapital.
     * 
     * @return kapitali_valuuta_tekstina
     */
    public java.lang.String getKapitali_valuuta_tekstina() {
        return kapitali_valuuta_tekstina;
    }


    /**
     * Sets the kapitali_valuuta_tekstina value for this Detailandmed_v5_kapital.
     * 
     * @param kapitali_valuuta_tekstina
     */
    public void setKapitali_valuuta_tekstina(java.lang.String kapitali_valuuta_tekstina) {
        this.kapitali_valuuta_tekstina = kapitali_valuuta_tekstina;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_kapital.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_kapital.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_kapital.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_kapital.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_kapital)) return false;
        Detailandmed_v5_kapital other = (Detailandmed_v5_kapital) obj;
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
            ((this.kapitali_suurus==null && other.getKapitali_suurus()==null) || 
             (this.kapitali_suurus!=null &&
              this.kapitali_suurus.equals(other.getKapitali_suurus()))) &&
            ((this.kapitali_valuuta==null && other.getKapitali_valuuta()==null) || 
             (this.kapitali_valuuta!=null &&
              this.kapitali_valuuta.equals(other.getKapitali_valuuta()))) &&
            ((this.kapitali_valuuta_tekstina==null && other.getKapitali_valuuta_tekstina()==null) || 
             (this.kapitali_valuuta_tekstina!=null &&
              this.kapitali_valuuta_tekstina.equals(other.getKapitali_valuuta_tekstina()))) &&
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
        if (getKapitali_suurus() != null) {
            _hashCode += getKapitali_suurus().hashCode();
        }
        if (getKapitali_valuuta() != null) {
            _hashCode += getKapitali_valuuta().hashCode();
        }
        if (getKapitali_valuuta_tekstina() != null) {
            _hashCode += getKapitali_valuuta_tekstina().hashCode();
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
