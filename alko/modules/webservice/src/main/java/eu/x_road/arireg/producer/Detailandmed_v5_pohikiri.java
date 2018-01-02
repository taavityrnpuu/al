/**
 * Detailandmed_v5_pohikiri.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_pohikiri  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.util.Date kinnitamise_kpv;

    private java.util.Date muutmise_kpv;

    private java.lang.String selgitus;

    private boolean sisaldab_erioigusi;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Detailandmed_v5_pohikiri() {
    }

    public Detailandmed_v5_pohikiri(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.util.Date kinnitamise_kpv,
           java.util.Date muutmise_kpv,
           java.lang.String selgitus,
           boolean sisaldab_erioigusi,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.kinnitamise_kpv = kinnitamise_kpv;
           this.muutmise_kpv = muutmise_kpv;
           this.selgitus = selgitus;
           this.sisaldab_erioigusi = sisaldab_erioigusi;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_pohikiri.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_pohikiri.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_pohikiri.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_pohikiri.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_pohikiri.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_pohikiri.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_pohikiri.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_pohikiri.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_pohikiri.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_pohikiri.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the kinnitamise_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @return kinnitamise_kpv
     */
    public java.util.Date getKinnitamise_kpv() {
        return kinnitamise_kpv;
    }


    /**
     * Sets the kinnitamise_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @param kinnitamise_kpv
     */
    public void setKinnitamise_kpv(java.util.Date kinnitamise_kpv) {
        this.kinnitamise_kpv = kinnitamise_kpv;
    }


    /**
     * Gets the muutmise_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @return muutmise_kpv
     */
    public java.util.Date getMuutmise_kpv() {
        return muutmise_kpv;
    }


    /**
     * Sets the muutmise_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @param muutmise_kpv
     */
    public void setMuutmise_kpv(java.util.Date muutmise_kpv) {
        this.muutmise_kpv = muutmise_kpv;
    }


    /**
     * Gets the selgitus value for this Detailandmed_v5_pohikiri.
     * 
     * @return selgitus
     */
    public java.lang.String getSelgitus() {
        return selgitus;
    }


    /**
     * Sets the selgitus value for this Detailandmed_v5_pohikiri.
     * 
     * @param selgitus
     */
    public void setSelgitus(java.lang.String selgitus) {
        this.selgitus = selgitus;
    }


    /**
     * Gets the sisaldab_erioigusi value for this Detailandmed_v5_pohikiri.
     * 
     * @return sisaldab_erioigusi
     */
    public boolean isSisaldab_erioigusi() {
        return sisaldab_erioigusi;
    }


    /**
     * Sets the sisaldab_erioigusi value for this Detailandmed_v5_pohikiri.
     * 
     * @param sisaldab_erioigusi
     */
    public void setSisaldab_erioigusi(boolean sisaldab_erioigusi) {
        this.sisaldab_erioigusi = sisaldab_erioigusi;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_pohikiri.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_pohikiri)) return false;
        Detailandmed_v5_pohikiri other = (Detailandmed_v5_pohikiri) obj;
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
            ((this.kinnitamise_kpv==null && other.getKinnitamise_kpv()==null) || 
             (this.kinnitamise_kpv!=null &&
              this.kinnitamise_kpv.equals(other.getKinnitamise_kpv()))) &&
            ((this.muutmise_kpv==null && other.getMuutmise_kpv()==null) || 
             (this.muutmise_kpv!=null &&
              this.muutmise_kpv.equals(other.getMuutmise_kpv()))) &&
            ((this.selgitus==null && other.getSelgitus()==null) || 
             (this.selgitus!=null &&
              this.selgitus.equals(other.getSelgitus()))) &&
            this.sisaldab_erioigusi == other.isSisaldab_erioigusi() &&
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
        if (getKinnitamise_kpv() != null) {
            _hashCode += getKinnitamise_kpv().hashCode();
        }
        if (getMuutmise_kpv() != null) {
            _hashCode += getMuutmise_kpv().hashCode();
        }
        if (getSelgitus() != null) {
            _hashCode += getSelgitus().hashCode();
        }
        _hashCode += (isSisaldab_erioigusi() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
