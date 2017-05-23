/**
 * Menetlusinfo_v3_maarus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Menetlusinfo_v3_maarus  implements java.io.Serializable {
    private java.lang.String otsuse_nr;

    private java.lang.String paevikukande_id;

    /* Menetluse number vanas vormingus (piirkond:menetluse_nr) */
    private java.lang.String paevikukande_id_vana;

    private java.lang.String otsuse_liik;

    private java.util.Date otsuse_kpv;

    private java.util.Date joust_kpv;

    private java.lang.String joust;

    private java.lang.Integer kandeliik;

    private java.util.Date lisatahtaeg;

    private java.lang.String maaruse_tekst;

    public Menetlusinfo_v3_maarus() {
    }

    public Menetlusinfo_v3_maarus(
           java.lang.String otsuse_nr,
           java.lang.String paevikukande_id,
           java.lang.String paevikukande_id_vana,
           java.lang.String otsuse_liik,
           java.util.Date otsuse_kpv,
           java.util.Date joust_kpv,
           java.lang.String joust,
           java.lang.Integer kandeliik,
           java.util.Date lisatahtaeg,
           java.lang.String maaruse_tekst) {
           this.otsuse_nr = otsuse_nr;
           this.paevikukande_id = paevikukande_id;
           this.paevikukande_id_vana = paevikukande_id_vana;
           this.otsuse_liik = otsuse_liik;
           this.otsuse_kpv = otsuse_kpv;
           this.joust_kpv = joust_kpv;
           this.joust = joust;
           this.kandeliik = kandeliik;
           this.lisatahtaeg = lisatahtaeg;
           this.maaruse_tekst = maaruse_tekst;
    }


    /**
     * Gets the otsuse_nr value for this Menetlusinfo_v3_maarus.
     * 
     * @return otsuse_nr
     */
    public java.lang.String getOtsuse_nr() {
        return otsuse_nr;
    }


    /**
     * Sets the otsuse_nr value for this Menetlusinfo_v3_maarus.
     * 
     * @param otsuse_nr
     */
    public void setOtsuse_nr(java.lang.String otsuse_nr) {
        this.otsuse_nr = otsuse_nr;
    }


    /**
     * Gets the paevikukande_id value for this Menetlusinfo_v3_maarus.
     * 
     * @return paevikukande_id
     */
    public java.lang.String getPaevikukande_id() {
        return paevikukande_id;
    }


    /**
     * Sets the paevikukande_id value for this Menetlusinfo_v3_maarus.
     * 
     * @param paevikukande_id
     */
    public void setPaevikukande_id(java.lang.String paevikukande_id) {
        this.paevikukande_id = paevikukande_id;
    }


    /**
     * Gets the paevikukande_id_vana value for this Menetlusinfo_v3_maarus.
     * 
     * @return paevikukande_id_vana   * Menetluse number vanas vormingus (piirkond:menetluse_nr)
     */
    public java.lang.String getPaevikukande_id_vana() {
        return paevikukande_id_vana;
    }


    /**
     * Sets the paevikukande_id_vana value for this Menetlusinfo_v3_maarus.
     * 
     * @param paevikukande_id_vana   * Menetluse number vanas vormingus (piirkond:menetluse_nr)
     */
    public void setPaevikukande_id_vana(java.lang.String paevikukande_id_vana) {
        this.paevikukande_id_vana = paevikukande_id_vana;
    }


    /**
     * Gets the otsuse_liik value for this Menetlusinfo_v3_maarus.
     * 
     * @return otsuse_liik
     */
    public java.lang.String getOtsuse_liik() {
        return otsuse_liik;
    }


    /**
     * Sets the otsuse_liik value for this Menetlusinfo_v3_maarus.
     * 
     * @param otsuse_liik
     */
    public void setOtsuse_liik(java.lang.String otsuse_liik) {
        this.otsuse_liik = otsuse_liik;
    }


    /**
     * Gets the otsuse_kpv value for this Menetlusinfo_v3_maarus.
     * 
     * @return otsuse_kpv
     */
    public java.util.Date getOtsuse_kpv() {
        return otsuse_kpv;
    }


    /**
     * Sets the otsuse_kpv value for this Menetlusinfo_v3_maarus.
     * 
     * @param otsuse_kpv
     */
    public void setOtsuse_kpv(java.util.Date otsuse_kpv) {
        this.otsuse_kpv = otsuse_kpv;
    }


    /**
     * Gets the joust_kpv value for this Menetlusinfo_v3_maarus.
     * 
     * @return joust_kpv
     */
    public java.util.Date getJoust_kpv() {
        return joust_kpv;
    }


    /**
     * Sets the joust_kpv value for this Menetlusinfo_v3_maarus.
     * 
     * @param joust_kpv
     */
    public void setJoust_kpv(java.util.Date joust_kpv) {
        this.joust_kpv = joust_kpv;
    }


    /**
     * Gets the joust value for this Menetlusinfo_v3_maarus.
     * 
     * @return joust
     */
    public java.lang.String getJoust() {
        return joust;
    }


    /**
     * Sets the joust value for this Menetlusinfo_v3_maarus.
     * 
     * @param joust
     */
    public void setJoust(java.lang.String joust) {
        this.joust = joust;
    }


    /**
     * Gets the kandeliik value for this Menetlusinfo_v3_maarus.
     * 
     * @return kandeliik
     */
    public java.lang.Integer getKandeliik() {
        return kandeliik;
    }


    /**
     * Sets the kandeliik value for this Menetlusinfo_v3_maarus.
     * 
     * @param kandeliik
     */
    public void setKandeliik(java.lang.Integer kandeliik) {
        this.kandeliik = kandeliik;
    }


    /**
     * Gets the lisatahtaeg value for this Menetlusinfo_v3_maarus.
     * 
     * @return lisatahtaeg
     */
    public java.util.Date getLisatahtaeg() {
        return lisatahtaeg;
    }


    /**
     * Sets the lisatahtaeg value for this Menetlusinfo_v3_maarus.
     * 
     * @param lisatahtaeg
     */
    public void setLisatahtaeg(java.util.Date lisatahtaeg) {
        this.lisatahtaeg = lisatahtaeg;
    }


    /**
     * Gets the maaruse_tekst value for this Menetlusinfo_v3_maarus.
     * 
     * @return maaruse_tekst
     */
    public java.lang.String getMaaruse_tekst() {
        return maaruse_tekst;
    }


    /**
     * Sets the maaruse_tekst value for this Menetlusinfo_v3_maarus.
     * 
     * @param maaruse_tekst
     */
    public void setMaaruse_tekst(java.lang.String maaruse_tekst) {
        this.maaruse_tekst = maaruse_tekst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menetlusinfo_v3_maarus)) return false;
        Menetlusinfo_v3_maarus other = (Menetlusinfo_v3_maarus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otsuse_nr==null && other.getOtsuse_nr()==null) || 
             (this.otsuse_nr!=null &&
              this.otsuse_nr.equals(other.getOtsuse_nr()))) &&
            ((this.paevikukande_id==null && other.getPaevikukande_id()==null) || 
             (this.paevikukande_id!=null &&
              this.paevikukande_id.equals(other.getPaevikukande_id()))) &&
            ((this.paevikukande_id_vana==null && other.getPaevikukande_id_vana()==null) || 
             (this.paevikukande_id_vana!=null &&
              this.paevikukande_id_vana.equals(other.getPaevikukande_id_vana()))) &&
            ((this.otsuse_liik==null && other.getOtsuse_liik()==null) || 
             (this.otsuse_liik!=null &&
              this.otsuse_liik.equals(other.getOtsuse_liik()))) &&
            ((this.otsuse_kpv==null && other.getOtsuse_kpv()==null) || 
             (this.otsuse_kpv!=null &&
              this.otsuse_kpv.equals(other.getOtsuse_kpv()))) &&
            ((this.joust_kpv==null && other.getJoust_kpv()==null) || 
             (this.joust_kpv!=null &&
              this.joust_kpv.equals(other.getJoust_kpv()))) &&
            ((this.joust==null && other.getJoust()==null) || 
             (this.joust!=null &&
              this.joust.equals(other.getJoust()))) &&
            ((this.kandeliik==null && other.getKandeliik()==null) || 
             (this.kandeliik!=null &&
              this.kandeliik.equals(other.getKandeliik()))) &&
            ((this.lisatahtaeg==null && other.getLisatahtaeg()==null) || 
             (this.lisatahtaeg!=null &&
              this.lisatahtaeg.equals(other.getLisatahtaeg()))) &&
            ((this.maaruse_tekst==null && other.getMaaruse_tekst()==null) || 
             (this.maaruse_tekst!=null &&
              this.maaruse_tekst.equals(other.getMaaruse_tekst())));
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
        if (getOtsuse_nr() != null) {
            _hashCode += getOtsuse_nr().hashCode();
        }
        if (getPaevikukande_id() != null) {
            _hashCode += getPaevikukande_id().hashCode();
        }
        if (getPaevikukande_id_vana() != null) {
            _hashCode += getPaevikukande_id_vana().hashCode();
        }
        if (getOtsuse_liik() != null) {
            _hashCode += getOtsuse_liik().hashCode();
        }
        if (getOtsuse_kpv() != null) {
            _hashCode += getOtsuse_kpv().hashCode();
        }
        if (getJoust_kpv() != null) {
            _hashCode += getJoust_kpv().hashCode();
        }
        if (getJoust() != null) {
            _hashCode += getJoust().hashCode();
        }
        if (getKandeliik() != null) {
            _hashCode += getKandeliik().hashCode();
        }
        if (getLisatahtaeg() != null) {
            _hashCode += getLisatahtaeg().hashCode();
        }
        if (getMaaruse_tekst() != null) {
            _hashCode += getMaaruse_tekst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
