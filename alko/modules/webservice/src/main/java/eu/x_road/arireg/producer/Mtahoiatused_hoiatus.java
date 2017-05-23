/**
 * Mtahoiatused_hoiatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtahoiatused_hoiatus  implements java.io.Serializable {
    private java.math.BigInteger hoiat_id;

    private java.math.BigInteger ark;

    private java.lang.String liik;

    private java.util.Date kuupaev;

    private java.lang.String olek;

    private java.util.Date oleku_muutm_kpv;

    private java.math.BigInteger maj_paevik_id;

    private java.math.BigInteger paevik_id;

    public Mtahoiatused_hoiatus() {
    }

    public Mtahoiatused_hoiatus(
           java.math.BigInteger hoiat_id,
           java.math.BigInteger ark,
           java.lang.String liik,
           java.util.Date kuupaev,
           java.lang.String olek,
           java.util.Date oleku_muutm_kpv,
           java.math.BigInteger maj_paevik_id,
           java.math.BigInteger paevik_id) {
           this.hoiat_id = hoiat_id;
           this.ark = ark;
           this.liik = liik;
           this.kuupaev = kuupaev;
           this.olek = olek;
           this.oleku_muutm_kpv = oleku_muutm_kpv;
           this.maj_paevik_id = maj_paevik_id;
           this.paevik_id = paevik_id;
    }


    /**
     * Gets the hoiat_id value for this Mtahoiatused_hoiatus.
     * 
     * @return hoiat_id
     */
    public java.math.BigInteger getHoiat_id() {
        return hoiat_id;
    }


    /**
     * Sets the hoiat_id value for this Mtahoiatused_hoiatus.
     * 
     * @param hoiat_id
     */
    public void setHoiat_id(java.math.BigInteger hoiat_id) {
        this.hoiat_id = hoiat_id;
    }


    /**
     * Gets the ark value for this Mtahoiatused_hoiatus.
     * 
     * @return ark
     */
    public java.math.BigInteger getArk() {
        return ark;
    }


    /**
     * Sets the ark value for this Mtahoiatused_hoiatus.
     * 
     * @param ark
     */
    public void setArk(java.math.BigInteger ark) {
        this.ark = ark;
    }


    /**
     * Gets the liik value for this Mtahoiatused_hoiatus.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Mtahoiatused_hoiatus.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the kuupaev value for this Mtahoiatused_hoiatus.
     * 
     * @return kuupaev
     */
    public java.util.Date getKuupaev() {
        return kuupaev;
    }


    /**
     * Sets the kuupaev value for this Mtahoiatused_hoiatus.
     * 
     * @param kuupaev
     */
    public void setKuupaev(java.util.Date kuupaev) {
        this.kuupaev = kuupaev;
    }


    /**
     * Gets the olek value for this Mtahoiatused_hoiatus.
     * 
     * @return olek
     */
    public java.lang.String getOlek() {
        return olek;
    }


    /**
     * Sets the olek value for this Mtahoiatused_hoiatus.
     * 
     * @param olek
     */
    public void setOlek(java.lang.String olek) {
        this.olek = olek;
    }


    /**
     * Gets the oleku_muutm_kpv value for this Mtahoiatused_hoiatus.
     * 
     * @return oleku_muutm_kpv
     */
    public java.util.Date getOleku_muutm_kpv() {
        return oleku_muutm_kpv;
    }


    /**
     * Sets the oleku_muutm_kpv value for this Mtahoiatused_hoiatus.
     * 
     * @param oleku_muutm_kpv
     */
    public void setOleku_muutm_kpv(java.util.Date oleku_muutm_kpv) {
        this.oleku_muutm_kpv = oleku_muutm_kpv;
    }


    /**
     * Gets the maj_paevik_id value for this Mtahoiatused_hoiatus.
     * 
     * @return maj_paevik_id
     */
    public java.math.BigInteger getMaj_paevik_id() {
        return maj_paevik_id;
    }


    /**
     * Sets the maj_paevik_id value for this Mtahoiatused_hoiatus.
     * 
     * @param maj_paevik_id
     */
    public void setMaj_paevik_id(java.math.BigInteger maj_paevik_id) {
        this.maj_paevik_id = maj_paevik_id;
    }


    /**
     * Gets the paevik_id value for this Mtahoiatused_hoiatus.
     * 
     * @return paevik_id
     */
    public java.math.BigInteger getPaevik_id() {
        return paevik_id;
    }


    /**
     * Sets the paevik_id value for this Mtahoiatused_hoiatus.
     * 
     * @param paevik_id
     */
    public void setPaevik_id(java.math.BigInteger paevik_id) {
        this.paevik_id = paevik_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtahoiatused_hoiatus)) return false;
        Mtahoiatused_hoiatus other = (Mtahoiatused_hoiatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hoiat_id==null && other.getHoiat_id()==null) || 
             (this.hoiat_id!=null &&
              this.hoiat_id.equals(other.getHoiat_id()))) &&
            ((this.ark==null && other.getArk()==null) || 
             (this.ark!=null &&
              this.ark.equals(other.getArk()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.kuupaev==null && other.getKuupaev()==null) || 
             (this.kuupaev!=null &&
              this.kuupaev.equals(other.getKuupaev()))) &&
            ((this.olek==null && other.getOlek()==null) || 
             (this.olek!=null &&
              this.olek.equals(other.getOlek()))) &&
            ((this.oleku_muutm_kpv==null && other.getOleku_muutm_kpv()==null) || 
             (this.oleku_muutm_kpv!=null &&
              this.oleku_muutm_kpv.equals(other.getOleku_muutm_kpv()))) &&
            ((this.maj_paevik_id==null && other.getMaj_paevik_id()==null) || 
             (this.maj_paevik_id!=null &&
              this.maj_paevik_id.equals(other.getMaj_paevik_id()))) &&
            ((this.paevik_id==null && other.getPaevik_id()==null) || 
             (this.paevik_id!=null &&
              this.paevik_id.equals(other.getPaevik_id())));
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
        if (getHoiat_id() != null) {
            _hashCode += getHoiat_id().hashCode();
        }
        if (getArk() != null) {
            _hashCode += getArk().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getKuupaev() != null) {
            _hashCode += getKuupaev().hashCode();
        }
        if (getOlek() != null) {
            _hashCode += getOlek().hashCode();
        }
        if (getOleku_muutm_kpv() != null) {
            _hashCode += getOleku_muutm_kpv().hashCode();
        }
        if (getMaj_paevik_id() != null) {
            _hashCode += getMaj_paevik_id().hashCode();
        }
        if (getPaevik_id() != null) {
            _hashCode += getPaevik_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
