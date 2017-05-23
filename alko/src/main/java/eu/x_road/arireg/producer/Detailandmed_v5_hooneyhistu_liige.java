/**
 * Detailandmed_v5_hooneyhistu_liige.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_hooneyhistu_liige  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.lang.String liikmesuse_nr;

    private java.math.BigDecimal pindala;

    private java.math.BigInteger maksumaara_lugeja;

    private java.math.BigInteger maksumaara_nimetaja;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    private eu.x_road.arireg.producer.Detailandmed_v5_hy_liige[] liikmed;

    private eu.x_road.arireg.producer.Detailandmed_v5_hy_kitsendus[] kitsendused;

    public Detailandmed_v5_hooneyhistu_liige() {
    }

    public Detailandmed_v5_hooneyhistu_liige(
           java.math.BigInteger kirje_id,
           java.lang.String liikmesuse_nr,
           java.math.BigDecimal pindala,
           java.math.BigInteger maksumaara_lugeja,
           java.math.BigInteger maksumaara_nimetaja,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv,
           eu.x_road.arireg.producer.Detailandmed_v5_hy_liige[] liikmed,
           eu.x_road.arireg.producer.Detailandmed_v5_hy_kitsendus[] kitsendused) {
           this.kirje_id = kirje_id;
           this.liikmesuse_nr = liikmesuse_nr;
           this.pindala = pindala;
           this.maksumaara_lugeja = maksumaara_lugeja;
           this.maksumaara_nimetaja = maksumaara_nimetaja;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
           this.liikmed = liikmed;
           this.kitsendused = kitsendused;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the liikmesuse_nr value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return liikmesuse_nr
     */
    public java.lang.String getLiikmesuse_nr() {
        return liikmesuse_nr;
    }


    /**
     * Sets the liikmesuse_nr value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param liikmesuse_nr
     */
    public void setLiikmesuse_nr(java.lang.String liikmesuse_nr) {
        this.liikmesuse_nr = liikmesuse_nr;
    }


    /**
     * Gets the pindala value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return pindala
     */
    public java.math.BigDecimal getPindala() {
        return pindala;
    }


    /**
     * Sets the pindala value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param pindala
     */
    public void setPindala(java.math.BigDecimal pindala) {
        this.pindala = pindala;
    }


    /**
     * Gets the maksumaara_lugeja value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return maksumaara_lugeja
     */
    public java.math.BigInteger getMaksumaara_lugeja() {
        return maksumaara_lugeja;
    }


    /**
     * Sets the maksumaara_lugeja value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param maksumaara_lugeja
     */
    public void setMaksumaara_lugeja(java.math.BigInteger maksumaara_lugeja) {
        this.maksumaara_lugeja = maksumaara_lugeja;
    }


    /**
     * Gets the maksumaara_nimetaja value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return maksumaara_nimetaja
     */
    public java.math.BigInteger getMaksumaara_nimetaja() {
        return maksumaara_nimetaja;
    }


    /**
     * Sets the maksumaara_nimetaja value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param maksumaara_nimetaja
     */
    public void setMaksumaara_nimetaja(java.math.BigInteger maksumaara_nimetaja) {
        this.maksumaara_nimetaja = maksumaara_nimetaja;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the liikmed value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return liikmed
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_hy_liige[] getLiikmed() {
        return liikmed;
    }


    /**
     * Sets the liikmed value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param liikmed
     */
    public void setLiikmed(eu.x_road.arireg.producer.Detailandmed_v5_hy_liige[] liikmed) {
        this.liikmed = liikmed;
    }


    /**
     * Gets the kitsendused value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @return kitsendused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_hy_kitsendus[] getKitsendused() {
        return kitsendused;
    }


    /**
     * Sets the kitsendused value for this Detailandmed_v5_hooneyhistu_liige.
     * 
     * @param kitsendused
     */
    public void setKitsendused(eu.x_road.arireg.producer.Detailandmed_v5_hy_kitsendus[] kitsendused) {
        this.kitsendused = kitsendused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_hooneyhistu_liige)) return false;
        Detailandmed_v5_hooneyhistu_liige other = (Detailandmed_v5_hooneyhistu_liige) obj;
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
            ((this.liikmesuse_nr==null && other.getLiikmesuse_nr()==null) || 
             (this.liikmesuse_nr!=null &&
              this.liikmesuse_nr.equals(other.getLiikmesuse_nr()))) &&
            ((this.pindala==null && other.getPindala()==null) || 
             (this.pindala!=null &&
              this.pindala.equals(other.getPindala()))) &&
            ((this.maksumaara_lugeja==null && other.getMaksumaara_lugeja()==null) || 
             (this.maksumaara_lugeja!=null &&
              this.maksumaara_lugeja.equals(other.getMaksumaara_lugeja()))) &&
            ((this.maksumaara_nimetaja==null && other.getMaksumaara_nimetaja()==null) || 
             (this.maksumaara_nimetaja!=null &&
              this.maksumaara_nimetaja.equals(other.getMaksumaara_nimetaja()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv()))) &&
            ((this.liikmed==null && other.getLiikmed()==null) || 
             (this.liikmed!=null &&
              java.util.Arrays.equals(this.liikmed, other.getLiikmed()))) &&
            ((this.kitsendused==null && other.getKitsendused()==null) || 
             (this.kitsendused!=null &&
              java.util.Arrays.equals(this.kitsendused, other.getKitsendused())));
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
        if (getLiikmesuse_nr() != null) {
            _hashCode += getLiikmesuse_nr().hashCode();
        }
        if (getPindala() != null) {
            _hashCode += getPindala().hashCode();
        }
        if (getMaksumaara_lugeja() != null) {
            _hashCode += getMaksumaara_lugeja().hashCode();
        }
        if (getMaksumaara_nimetaja() != null) {
            _hashCode += getMaksumaara_nimetaja().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        if (getLiikmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiikmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiikmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKitsendused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKitsendused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKitsendused(), i);
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
