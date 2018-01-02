/**
 * Ettevotja_muudatused_tasuta_tootukassa_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatused_tasuta_tootukassa_paring  implements java.io.Serializable {
    /* Näitab, millise kuupäeva kohta ettevõtja muudatusi päritama
     * hakatakse. */
    private java.util.Date alguskuupaev;

    /* Näitab, millise kuupäevani ettevõtja muudatusi päritakse. */
    private java.util.Date loppkuupaev;

    /* Ettevõtja muudatuste filter kandes isikute rollide järgi. */
    private java.lang.String[] kandes_isikud_rollid;

    /* Ettevõtja muudatuste lehekülje number. 100 muudatust lehel. */
    private java.lang.Integer tulemuste_lk;

    public Ettevotja_muudatused_tasuta_tootukassa_paring() {
    }

    public Ettevotja_muudatused_tasuta_tootukassa_paring(
           java.util.Date alguskuupaev,
           java.util.Date loppkuupaev,
           java.lang.String[] kandes_isikud_rollid,
           java.lang.Integer tulemuste_lk) {
           this.alguskuupaev = alguskuupaev;
           this.loppkuupaev = loppkuupaev;
           this.kandes_isikud_rollid = kandes_isikud_rollid;
           this.tulemuste_lk = tulemuste_lk;
    }


    /**
     * Gets the alguskuupaev value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @return alguskuupaev   * Näitab, millise kuupäeva kohta ettevõtja muudatusi päritama
     * hakatakse.
     */
    public java.util.Date getAlguskuupaev() {
        return alguskuupaev;
    }


    /**
     * Sets the alguskuupaev value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @param alguskuupaev   * Näitab, millise kuupäeva kohta ettevõtja muudatusi päritama
     * hakatakse.
     */
    public void setAlguskuupaev(java.util.Date alguskuupaev) {
        this.alguskuupaev = alguskuupaev;
    }


    /**
     * Gets the loppkuupaev value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @return loppkuupaev   * Näitab, millise kuupäevani ettevõtja muudatusi päritakse.
     */
    public java.util.Date getLoppkuupaev() {
        return loppkuupaev;
    }


    /**
     * Sets the loppkuupaev value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @param loppkuupaev   * Näitab, millise kuupäevani ettevõtja muudatusi päritakse.
     */
    public void setLoppkuupaev(java.util.Date loppkuupaev) {
        this.loppkuupaev = loppkuupaev;
    }


    /**
     * Gets the kandes_isikud_rollid value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @return kandes_isikud_rollid   * Ettevõtja muudatuste filter kandes isikute rollide järgi.
     */
    public java.lang.String[] getKandes_isikud_rollid() {
        return kandes_isikud_rollid;
    }


    /**
     * Sets the kandes_isikud_rollid value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @param kandes_isikud_rollid   * Ettevõtja muudatuste filter kandes isikute rollide järgi.
     */
    public void setKandes_isikud_rollid(java.lang.String[] kandes_isikud_rollid) {
        this.kandes_isikud_rollid = kandes_isikud_rollid;
    }

    public java.lang.String getKandes_isikud_rollid(int i) {
        return this.kandes_isikud_rollid[i];
    }

    public void setKandes_isikud_rollid(int i, java.lang.String _value) {
        this.kandes_isikud_rollid[i] = _value;
    }


    /**
     * Gets the tulemuste_lk value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @return tulemuste_lk   * Ettevõtja muudatuste lehekülje number. 100 muudatust lehel.
     */
    public java.lang.Integer getTulemuste_lk() {
        return tulemuste_lk;
    }


    /**
     * Sets the tulemuste_lk value for this Ettevotja_muudatused_tasuta_tootukassa_paring.
     * 
     * @param tulemuste_lk   * Ettevõtja muudatuste lehekülje number. 100 muudatust lehel.
     */
    public void setTulemuste_lk(java.lang.Integer tulemuste_lk) {
        this.tulemuste_lk = tulemuste_lk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatused_tasuta_tootukassa_paring)) return false;
        Ettevotja_muudatused_tasuta_tootukassa_paring other = (Ettevotja_muudatused_tasuta_tootukassa_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alguskuupaev==null && other.getAlguskuupaev()==null) || 
             (this.alguskuupaev!=null &&
              this.alguskuupaev.equals(other.getAlguskuupaev()))) &&
            ((this.loppkuupaev==null && other.getLoppkuupaev()==null) || 
             (this.loppkuupaev!=null &&
              this.loppkuupaev.equals(other.getLoppkuupaev()))) &&
            ((this.kandes_isikud_rollid==null && other.getKandes_isikud_rollid()==null) || 
             (this.kandes_isikud_rollid!=null &&
              java.util.Arrays.equals(this.kandes_isikud_rollid, other.getKandes_isikud_rollid()))) &&
            ((this.tulemuste_lk==null && other.getTulemuste_lk()==null) || 
             (this.tulemuste_lk!=null &&
              this.tulemuste_lk.equals(other.getTulemuste_lk())));
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
        if (getAlguskuupaev() != null) {
            _hashCode += getAlguskuupaev().hashCode();
        }
        if (getLoppkuupaev() != null) {
            _hashCode += getLoppkuupaev().hashCode();
        }
        if (getKandes_isikud_rollid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKandes_isikud_rollid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKandes_isikud_rollid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTulemuste_lk() != null) {
            _hashCode += getTulemuste_lk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
