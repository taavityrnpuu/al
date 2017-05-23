/**
 * TaotluseHaridus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseHaridus  implements java.io.Serializable {
    private boolean detailne;

    private java.math.BigInteger id;

    private java.lang.String isikukood;

    private java.lang.String dokumendi_nr;

    private java.lang.String dokumendi_nimetus;

    private java.lang.String oppekava;

    private java.math.BigInteger korghariduse_eriala_id;

    private java.util.Date lopetamise_kp;

    private java.lang.String oppeasutus;

    private java.lang.String oppeasutus_regnr;

    private java.math.BigInteger korgharidust_andev_kool_id;

    private java.lang.String valjaandmise_koht;

    private boolean kasitsi;

    public TaotluseHaridus() {
    }

    public TaotluseHaridus(
           boolean detailne,
           java.math.BigInteger id,
           java.lang.String isikukood,
           java.lang.String dokumendi_nr,
           java.lang.String dokumendi_nimetus,
           java.lang.String oppekava,
           java.math.BigInteger korghariduse_eriala_id,
           java.util.Date lopetamise_kp,
           java.lang.String oppeasutus,
           java.lang.String oppeasutus_regnr,
           java.math.BigInteger korgharidust_andev_kool_id,
           java.lang.String valjaandmise_koht,
           boolean kasitsi) {
           this.detailne = detailne;
           this.id = id;
           this.isikukood = isikukood;
           this.dokumendi_nr = dokumendi_nr;
           this.dokumendi_nimetus = dokumendi_nimetus;
           this.oppekava = oppekava;
           this.korghariduse_eriala_id = korghariduse_eriala_id;
           this.lopetamise_kp = lopetamise_kp;
           this.oppeasutus = oppeasutus;
           this.oppeasutus_regnr = oppeasutus_regnr;
           this.korgharidust_andev_kool_id = korgharidust_andev_kool_id;
           this.valjaandmise_koht = valjaandmise_koht;
           this.kasitsi = kasitsi;
    }


    /**
     * Gets the detailne value for this TaotluseHaridus.
     * 
     * @return detailne
     */
    public boolean isDetailne() {
        return detailne;
    }


    /**
     * Sets the detailne value for this TaotluseHaridus.
     * 
     * @param detailne
     */
    public void setDetailne(boolean detailne) {
        this.detailne = detailne;
    }


    /**
     * Gets the id value for this TaotluseHaridus.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this TaotluseHaridus.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the isikukood value for this TaotluseHaridus.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this TaotluseHaridus.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the dokumendi_nr value for this TaotluseHaridus.
     * 
     * @return dokumendi_nr
     */
    public java.lang.String getDokumendi_nr() {
        return dokumendi_nr;
    }


    /**
     * Sets the dokumendi_nr value for this TaotluseHaridus.
     * 
     * @param dokumendi_nr
     */
    public void setDokumendi_nr(java.lang.String dokumendi_nr) {
        this.dokumendi_nr = dokumendi_nr;
    }


    /**
     * Gets the dokumendi_nimetus value for this TaotluseHaridus.
     * 
     * @return dokumendi_nimetus
     */
    public java.lang.String getDokumendi_nimetus() {
        return dokumendi_nimetus;
    }


    /**
     * Sets the dokumendi_nimetus value for this TaotluseHaridus.
     * 
     * @param dokumendi_nimetus
     */
    public void setDokumendi_nimetus(java.lang.String dokumendi_nimetus) {
        this.dokumendi_nimetus = dokumendi_nimetus;
    }


    /**
     * Gets the oppekava value for this TaotluseHaridus.
     * 
     * @return oppekava
     */
    public java.lang.String getOppekava() {
        return oppekava;
    }


    /**
     * Sets the oppekava value for this TaotluseHaridus.
     * 
     * @param oppekava
     */
    public void setOppekava(java.lang.String oppekava) {
        this.oppekava = oppekava;
    }


    /**
     * Gets the korghariduse_eriala_id value for this TaotluseHaridus.
     * 
     * @return korghariduse_eriala_id
     */
    public java.math.BigInteger getKorghariduse_eriala_id() {
        return korghariduse_eriala_id;
    }


    /**
     * Sets the korghariduse_eriala_id value for this TaotluseHaridus.
     * 
     * @param korghariduse_eriala_id
     */
    public void setKorghariduse_eriala_id(java.math.BigInteger korghariduse_eriala_id) {
        this.korghariduse_eriala_id = korghariduse_eriala_id;
    }


    /**
     * Gets the lopetamise_kp value for this TaotluseHaridus.
     * 
     * @return lopetamise_kp
     */
    public java.util.Date getLopetamise_kp() {
        return lopetamise_kp;
    }


    /**
     * Sets the lopetamise_kp value for this TaotluseHaridus.
     * 
     * @param lopetamise_kp
     */
    public void setLopetamise_kp(java.util.Date lopetamise_kp) {
        this.lopetamise_kp = lopetamise_kp;
    }


    /**
     * Gets the oppeasutus value for this TaotluseHaridus.
     * 
     * @return oppeasutus
     */
    public java.lang.String getOppeasutus() {
        return oppeasutus;
    }


    /**
     * Sets the oppeasutus value for this TaotluseHaridus.
     * 
     * @param oppeasutus
     */
    public void setOppeasutus(java.lang.String oppeasutus) {
        this.oppeasutus = oppeasutus;
    }


    /**
     * Gets the oppeasutus_regnr value for this TaotluseHaridus.
     * 
     * @return oppeasutus_regnr
     */
    public java.lang.String getOppeasutus_regnr() {
        return oppeasutus_regnr;
    }


    /**
     * Sets the oppeasutus_regnr value for this TaotluseHaridus.
     * 
     * @param oppeasutus_regnr
     */
    public void setOppeasutus_regnr(java.lang.String oppeasutus_regnr) {
        this.oppeasutus_regnr = oppeasutus_regnr;
    }


    /**
     * Gets the korgharidust_andev_kool_id value for this TaotluseHaridus.
     * 
     * @return korgharidust_andev_kool_id
     */
    public java.math.BigInteger getKorgharidust_andev_kool_id() {
        return korgharidust_andev_kool_id;
    }


    /**
     * Sets the korgharidust_andev_kool_id value for this TaotluseHaridus.
     * 
     * @param korgharidust_andev_kool_id
     */
    public void setKorgharidust_andev_kool_id(java.math.BigInteger korgharidust_andev_kool_id) {
        this.korgharidust_andev_kool_id = korgharidust_andev_kool_id;
    }


    /**
     * Gets the valjaandmise_koht value for this TaotluseHaridus.
     * 
     * @return valjaandmise_koht
     */
    public java.lang.String getValjaandmise_koht() {
        return valjaandmise_koht;
    }


    /**
     * Sets the valjaandmise_koht value for this TaotluseHaridus.
     * 
     * @param valjaandmise_koht
     */
    public void setValjaandmise_koht(java.lang.String valjaandmise_koht) {
        this.valjaandmise_koht = valjaandmise_koht;
    }


    /**
     * Gets the kasitsi value for this TaotluseHaridus.
     * 
     * @return kasitsi
     */
    public boolean isKasitsi() {
        return kasitsi;
    }


    /**
     * Sets the kasitsi value for this TaotluseHaridus.
     * 
     * @param kasitsi
     */
    public void setKasitsi(boolean kasitsi) {
        this.kasitsi = kasitsi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseHaridus)) return false;
        TaotluseHaridus other = (TaotluseHaridus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.detailne == other.isDetailne() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.dokumendi_nr==null && other.getDokumendi_nr()==null) || 
             (this.dokumendi_nr!=null &&
              this.dokumendi_nr.equals(other.getDokumendi_nr()))) &&
            ((this.dokumendi_nimetus==null && other.getDokumendi_nimetus()==null) || 
             (this.dokumendi_nimetus!=null &&
              this.dokumendi_nimetus.equals(other.getDokumendi_nimetus()))) &&
            ((this.oppekava==null && other.getOppekava()==null) || 
             (this.oppekava!=null &&
              this.oppekava.equals(other.getOppekava()))) &&
            ((this.korghariduse_eriala_id==null && other.getKorghariduse_eriala_id()==null) || 
             (this.korghariduse_eriala_id!=null &&
              this.korghariduse_eriala_id.equals(other.getKorghariduse_eriala_id()))) &&
            ((this.lopetamise_kp==null && other.getLopetamise_kp()==null) || 
             (this.lopetamise_kp!=null &&
              this.lopetamise_kp.equals(other.getLopetamise_kp()))) &&
            ((this.oppeasutus==null && other.getOppeasutus()==null) || 
             (this.oppeasutus!=null &&
              this.oppeasutus.equals(other.getOppeasutus()))) &&
            ((this.oppeasutus_regnr==null && other.getOppeasutus_regnr()==null) || 
             (this.oppeasutus_regnr!=null &&
              this.oppeasutus_regnr.equals(other.getOppeasutus_regnr()))) &&
            ((this.korgharidust_andev_kool_id==null && other.getKorgharidust_andev_kool_id()==null) || 
             (this.korgharidust_andev_kool_id!=null &&
              this.korgharidust_andev_kool_id.equals(other.getKorgharidust_andev_kool_id()))) &&
            ((this.valjaandmise_koht==null && other.getValjaandmise_koht()==null) || 
             (this.valjaandmise_koht!=null &&
              this.valjaandmise_koht.equals(other.getValjaandmise_koht()))) &&
            this.kasitsi == other.isKasitsi();
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
        _hashCode += (isDetailne() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getDokumendi_nr() != null) {
            _hashCode += getDokumendi_nr().hashCode();
        }
        if (getDokumendi_nimetus() != null) {
            _hashCode += getDokumendi_nimetus().hashCode();
        }
        if (getOppekava() != null) {
            _hashCode += getOppekava().hashCode();
        }
        if (getKorghariduse_eriala_id() != null) {
            _hashCode += getKorghariduse_eriala_id().hashCode();
        }
        if (getLopetamise_kp() != null) {
            _hashCode += getLopetamise_kp().hashCode();
        }
        if (getOppeasutus() != null) {
            _hashCode += getOppeasutus().hashCode();
        }
        if (getOppeasutus_regnr() != null) {
            _hashCode += getOppeasutus_regnr().hashCode();
        }
        if (getKorgharidust_andev_kool_id() != null) {
            _hashCode += getKorgharidust_andev_kool_id().hashCode();
        }
        if (getValjaandmise_koht() != null) {
            _hashCode += getValjaandmise_koht().hashCode();
        }
        _hashCode += (isKasitsi() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
