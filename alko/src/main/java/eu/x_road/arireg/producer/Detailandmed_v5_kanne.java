/**
 * Detailandmed_v5_kanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_kanne  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kande_nr;

    private java.util.Date kande_kpv;

    private java.lang.String kandeliik;

    private java.lang.String kandeliik_tekstina;

    public Detailandmed_v5_kanne() {
    }

    public Detailandmed_v5_kanne(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kande_nr,
           java.util.Date kande_kpv,
           java.lang.String kandeliik,
           java.lang.String kandeliik_tekstina) {
           this.kirje_id = kirje_id;
           this.kande_nr = kande_nr;
           this.kande_kpv = kande_kpv;
           this.kandeliik = kandeliik;
           this.kandeliik_tekstina = kandeliik_tekstina;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_kanne.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_kanne.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_kanne.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_kanne.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the kande_kpv value for this Detailandmed_v5_kanne.
     * 
     * @return kande_kpv
     */
    public java.util.Date getKande_kpv() {
        return kande_kpv;
    }


    /**
     * Sets the kande_kpv value for this Detailandmed_v5_kanne.
     * 
     * @param kande_kpv
     */
    public void setKande_kpv(java.util.Date kande_kpv) {
        this.kande_kpv = kande_kpv;
    }


    /**
     * Gets the kandeliik value for this Detailandmed_v5_kanne.
     * 
     * @return kandeliik
     */
    public java.lang.String getKandeliik() {
        return kandeliik;
    }


    /**
     * Sets the kandeliik value for this Detailandmed_v5_kanne.
     * 
     * @param kandeliik
     */
    public void setKandeliik(java.lang.String kandeliik) {
        this.kandeliik = kandeliik;
    }


    /**
     * Gets the kandeliik_tekstina value for this Detailandmed_v5_kanne.
     * 
     * @return kandeliik_tekstina
     */
    public java.lang.String getKandeliik_tekstina() {
        return kandeliik_tekstina;
    }


    /**
     * Sets the kandeliik_tekstina value for this Detailandmed_v5_kanne.
     * 
     * @param kandeliik_tekstina
     */
    public void setKandeliik_tekstina(java.lang.String kandeliik_tekstina) {
        this.kandeliik_tekstina = kandeliik_tekstina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_kanne)) return false;
        Detailandmed_v5_kanne other = (Detailandmed_v5_kanne) obj;
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
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.kande_kpv==null && other.getKande_kpv()==null) || 
             (this.kande_kpv!=null &&
              this.kande_kpv.equals(other.getKande_kpv()))) &&
            ((this.kandeliik==null && other.getKandeliik()==null) || 
             (this.kandeliik!=null &&
              this.kandeliik.equals(other.getKandeliik()))) &&
            ((this.kandeliik_tekstina==null && other.getKandeliik_tekstina()==null) || 
             (this.kandeliik_tekstina!=null &&
              this.kandeliik_tekstina.equals(other.getKandeliik_tekstina())));
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
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getKande_kpv() != null) {
            _hashCode += getKande_kpv().hashCode();
        }
        if (getKandeliik() != null) {
            _hashCode += getKandeliik().hashCode();
        }
        if (getKandeliik_tekstina() != null) {
            _hashCode += getKandeliik_tekstina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
