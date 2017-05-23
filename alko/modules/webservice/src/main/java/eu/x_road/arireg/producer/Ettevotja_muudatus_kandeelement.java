/**
 * Ettevotja_muudatus_kandeelement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_kandeelement  implements java.io.Serializable {
    /* Kandeelemendi ID */
    private java.lang.Integer kandeelemendi_id;

    /* Kandeelemendi liik */
    private java.lang.String kandeelemendi_liik;

    /* Kandeelemendi järjekord */
    private java.lang.Integer kandeelemendi_jrk;

    /* Kandeelemendi kehtivus */
    private java.lang.String kandeelemendi_kehtivus;

    /* Tühistatava kande ID */
    private java.lang.String tyhistatava_kande_id;

    /* Tühistatava kande number */
    private java.lang.Integer tyhistatava_kande_nr;

    public Ettevotja_muudatus_kandeelement() {
    }

    public Ettevotja_muudatus_kandeelement(
           java.lang.Integer kandeelemendi_id,
           java.lang.String kandeelemendi_liik,
           java.lang.Integer kandeelemendi_jrk,
           java.lang.String kandeelemendi_kehtivus,
           java.lang.String tyhistatava_kande_id,
           java.lang.Integer tyhistatava_kande_nr) {
           this.kandeelemendi_id = kandeelemendi_id;
           this.kandeelemendi_liik = kandeelemendi_liik;
           this.kandeelemendi_jrk = kandeelemendi_jrk;
           this.kandeelemendi_kehtivus = kandeelemendi_kehtivus;
           this.tyhistatava_kande_id = tyhistatava_kande_id;
           this.tyhistatava_kande_nr = tyhistatava_kande_nr;
    }


    /**
     * Gets the kandeelemendi_id value for this Ettevotja_muudatus_kandeelement.
     * 
     * @return kandeelemendi_id   * Kandeelemendi ID
     */
    public java.lang.Integer getKandeelemendi_id() {
        return kandeelemendi_id;
    }


    /**
     * Sets the kandeelemendi_id value for this Ettevotja_muudatus_kandeelement.
     * 
     * @param kandeelemendi_id   * Kandeelemendi ID
     */
    public void setKandeelemendi_id(java.lang.Integer kandeelemendi_id) {
        this.kandeelemendi_id = kandeelemendi_id;
    }


    /**
     * Gets the kandeelemendi_liik value for this Ettevotja_muudatus_kandeelement.
     * 
     * @return kandeelemendi_liik   * Kandeelemendi liik
     */
    public java.lang.String getKandeelemendi_liik() {
        return kandeelemendi_liik;
    }


    /**
     * Sets the kandeelemendi_liik value for this Ettevotja_muudatus_kandeelement.
     * 
     * @param kandeelemendi_liik   * Kandeelemendi liik
     */
    public void setKandeelemendi_liik(java.lang.String kandeelemendi_liik) {
        this.kandeelemendi_liik = kandeelemendi_liik;
    }


    /**
     * Gets the kandeelemendi_jrk value for this Ettevotja_muudatus_kandeelement.
     * 
     * @return kandeelemendi_jrk   * Kandeelemendi järjekord
     */
    public java.lang.Integer getKandeelemendi_jrk() {
        return kandeelemendi_jrk;
    }


    /**
     * Sets the kandeelemendi_jrk value for this Ettevotja_muudatus_kandeelement.
     * 
     * @param kandeelemendi_jrk   * Kandeelemendi järjekord
     */
    public void setKandeelemendi_jrk(java.lang.Integer kandeelemendi_jrk) {
        this.kandeelemendi_jrk = kandeelemendi_jrk;
    }


    /**
     * Gets the kandeelemendi_kehtivus value for this Ettevotja_muudatus_kandeelement.
     * 
     * @return kandeelemendi_kehtivus   * Kandeelemendi kehtivus
     */
    public java.lang.String getKandeelemendi_kehtivus() {
        return kandeelemendi_kehtivus;
    }


    /**
     * Sets the kandeelemendi_kehtivus value for this Ettevotja_muudatus_kandeelement.
     * 
     * @param kandeelemendi_kehtivus   * Kandeelemendi kehtivus
     */
    public void setKandeelemendi_kehtivus(java.lang.String kandeelemendi_kehtivus) {
        this.kandeelemendi_kehtivus = kandeelemendi_kehtivus;
    }


    /**
     * Gets the tyhistatava_kande_id value for this Ettevotja_muudatus_kandeelement.
     * 
     * @return tyhistatava_kande_id   * Tühistatava kande ID
     */
    public java.lang.String getTyhistatava_kande_id() {
        return tyhistatava_kande_id;
    }


    /**
     * Sets the tyhistatava_kande_id value for this Ettevotja_muudatus_kandeelement.
     * 
     * @param tyhistatava_kande_id   * Tühistatava kande ID
     */
    public void setTyhistatava_kande_id(java.lang.String tyhistatava_kande_id) {
        this.tyhistatava_kande_id = tyhistatava_kande_id;
    }


    /**
     * Gets the tyhistatava_kande_nr value for this Ettevotja_muudatus_kandeelement.
     * 
     * @return tyhistatava_kande_nr   * Tühistatava kande number
     */
    public java.lang.Integer getTyhistatava_kande_nr() {
        return tyhistatava_kande_nr;
    }


    /**
     * Sets the tyhistatava_kande_nr value for this Ettevotja_muudatus_kandeelement.
     * 
     * @param tyhistatava_kande_nr   * Tühistatava kande number
     */
    public void setTyhistatava_kande_nr(java.lang.Integer tyhistatava_kande_nr) {
        this.tyhistatava_kande_nr = tyhistatava_kande_nr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_kandeelement)) return false;
        Ettevotja_muudatus_kandeelement other = (Ettevotja_muudatus_kandeelement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kandeelemendi_id==null && other.getKandeelemendi_id()==null) || 
             (this.kandeelemendi_id!=null &&
              this.kandeelemendi_id.equals(other.getKandeelemendi_id()))) &&
            ((this.kandeelemendi_liik==null && other.getKandeelemendi_liik()==null) || 
             (this.kandeelemendi_liik!=null &&
              this.kandeelemendi_liik.equals(other.getKandeelemendi_liik()))) &&
            ((this.kandeelemendi_jrk==null && other.getKandeelemendi_jrk()==null) || 
             (this.kandeelemendi_jrk!=null &&
              this.kandeelemendi_jrk.equals(other.getKandeelemendi_jrk()))) &&
            ((this.kandeelemendi_kehtivus==null && other.getKandeelemendi_kehtivus()==null) || 
             (this.kandeelemendi_kehtivus!=null &&
              this.kandeelemendi_kehtivus.equals(other.getKandeelemendi_kehtivus()))) &&
            ((this.tyhistatava_kande_id==null && other.getTyhistatava_kande_id()==null) || 
             (this.tyhistatava_kande_id!=null &&
              this.tyhistatava_kande_id.equals(other.getTyhistatava_kande_id()))) &&
            ((this.tyhistatava_kande_nr==null && other.getTyhistatava_kande_nr()==null) || 
             (this.tyhistatava_kande_nr!=null &&
              this.tyhistatava_kande_nr.equals(other.getTyhistatava_kande_nr())));
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
        if (getKandeelemendi_id() != null) {
            _hashCode += getKandeelemendi_id().hashCode();
        }
        if (getKandeelemendi_liik() != null) {
            _hashCode += getKandeelemendi_liik().hashCode();
        }
        if (getKandeelemendi_jrk() != null) {
            _hashCode += getKandeelemendi_jrk().hashCode();
        }
        if (getKandeelemendi_kehtivus() != null) {
            _hashCode += getKandeelemendi_kehtivus().hashCode();
        }
        if (getTyhistatava_kande_id() != null) {
            _hashCode += getTyhistatava_kande_id().hashCode();
        }
        if (getTyhistatava_kande_nr() != null) {
            _hashCode += getTyhistatava_kande_nr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
