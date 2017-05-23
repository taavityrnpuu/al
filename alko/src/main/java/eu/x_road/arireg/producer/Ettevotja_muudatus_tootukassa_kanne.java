/**
 * Ettevotja_muudatus_tootukassa_kanne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus_tootukassa_kanne  implements java.io.Serializable {
    private java.lang.String ettevotja_id;

    private java.lang.Integer ettevotja_ariregistri_kood;

    private java.lang.String ettevotja_arinimi;

    private java.lang.String ettevotja_oiguslik_vorm;

    private java.lang.String ettevotja_staatus;

    /* Kande ID */
    private java.lang.String kande_id;

    /* Kande kuupaev */
    private java.util.Date kande_kpv;

    /* Kande liik */
    private java.lang.Integer kande_liik;

    /* Kandeelemendid */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement[] kandeelement;

    public Ettevotja_muudatus_tootukassa_kanne() {
    }

    public Ettevotja_muudatus_tootukassa_kanne(
           java.lang.String ettevotja_id,
           java.lang.Integer ettevotja_ariregistri_kood,
           java.lang.String ettevotja_arinimi,
           java.lang.String ettevotja_oiguslik_vorm,
           java.lang.String ettevotja_staatus,
           java.lang.String kande_id,
           java.util.Date kande_kpv,
           java.lang.Integer kande_liik,
           eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement[] kandeelement) {
           this.ettevotja_id = ettevotja_id;
           this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
           this.ettevotja_arinimi = ettevotja_arinimi;
           this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
           this.ettevotja_staatus = ettevotja_staatus;
           this.kande_id = kande_id;
           this.kande_kpv = kande_kpv;
           this.kande_liik = kande_liik;
           this.kandeelement = kandeelement;
    }


    /**
     * Gets the ettevotja_id value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return ettevotja_id
     */
    public java.lang.String getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.lang.String ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return ettevotja_ariregistri_kood
     */
    public java.lang.Integer getEttevotja_ariregistri_kood() {
        return ettevotja_ariregistri_kood;
    }


    /**
     * Sets the ettevotja_ariregistri_kood value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param ettevotja_ariregistri_kood
     */
    public void setEttevotja_ariregistri_kood(java.lang.Integer ettevotja_ariregistri_kood) {
        this.ettevotja_ariregistri_kood = ettevotja_ariregistri_kood;
    }


    /**
     * Gets the ettevotja_arinimi value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return ettevotja_arinimi
     */
    public java.lang.String getEttevotja_arinimi() {
        return ettevotja_arinimi;
    }


    /**
     * Sets the ettevotja_arinimi value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param ettevotja_arinimi
     */
    public void setEttevotja_arinimi(java.lang.String ettevotja_arinimi) {
        this.ettevotja_arinimi = ettevotja_arinimi;
    }


    /**
     * Gets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return ettevotja_oiguslik_vorm
     */
    public java.lang.String getEttevotja_oiguslik_vorm() {
        return ettevotja_oiguslik_vorm;
    }


    /**
     * Sets the ettevotja_oiguslik_vorm value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param ettevotja_oiguslik_vorm
     */
    public void setEttevotja_oiguslik_vorm(java.lang.String ettevotja_oiguslik_vorm) {
        this.ettevotja_oiguslik_vorm = ettevotja_oiguslik_vorm;
    }


    /**
     * Gets the ettevotja_staatus value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return ettevotja_staatus
     */
    public java.lang.String getEttevotja_staatus() {
        return ettevotja_staatus;
    }


    /**
     * Sets the ettevotja_staatus value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param ettevotja_staatus
     */
    public void setEttevotja_staatus(java.lang.String ettevotja_staatus) {
        this.ettevotja_staatus = ettevotja_staatus;
    }


    /**
     * Gets the kande_id value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return kande_id   * Kande ID
     */
    public java.lang.String getKande_id() {
        return kande_id;
    }


    /**
     * Sets the kande_id value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param kande_id   * Kande ID
     */
    public void setKande_id(java.lang.String kande_id) {
        this.kande_id = kande_id;
    }


    /**
     * Gets the kande_kpv value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return kande_kpv   * Kande kuupaev
     */
    public java.util.Date getKande_kpv() {
        return kande_kpv;
    }


    /**
     * Sets the kande_kpv value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param kande_kpv   * Kande kuupaev
     */
    public void setKande_kpv(java.util.Date kande_kpv) {
        this.kande_kpv = kande_kpv;
    }


    /**
     * Gets the kande_liik value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return kande_liik   * Kande liik
     */
    public java.lang.Integer getKande_liik() {
        return kande_liik;
    }


    /**
     * Sets the kande_liik value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param kande_liik   * Kande liik
     */
    public void setKande_liik(java.lang.Integer kande_liik) {
        this.kande_liik = kande_liik;
    }


    /**
     * Gets the kandeelement value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @return kandeelement   * Kandeelemendid
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement[] getKandeelement() {
        return kandeelement;
    }


    /**
     * Sets the kandeelement value for this Ettevotja_muudatus_tootukassa_kanne.
     * 
     * @param kandeelement   * Kandeelemendid
     */
    public void setKandeelement(eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement[] kandeelement) {
        this.kandeelement = kandeelement;
    }

    public eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement getKandeelement(int i) {
        return this.kandeelement[i];
    }

    public void setKandeelement(int i, eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement _value) {
        this.kandeelement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus_tootukassa_kanne)) return false;
        Ettevotja_muudatus_tootukassa_kanne other = (Ettevotja_muudatus_tootukassa_kanne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id()))) &&
            ((this.ettevotja_ariregistri_kood==null && other.getEttevotja_ariregistri_kood()==null) || 
             (this.ettevotja_ariregistri_kood!=null &&
              this.ettevotja_ariregistri_kood.equals(other.getEttevotja_ariregistri_kood()))) &&
            ((this.ettevotja_arinimi==null && other.getEttevotja_arinimi()==null) || 
             (this.ettevotja_arinimi!=null &&
              this.ettevotja_arinimi.equals(other.getEttevotja_arinimi()))) &&
            ((this.ettevotja_oiguslik_vorm==null && other.getEttevotja_oiguslik_vorm()==null) || 
             (this.ettevotja_oiguslik_vorm!=null &&
              this.ettevotja_oiguslik_vorm.equals(other.getEttevotja_oiguslik_vorm()))) &&
            ((this.ettevotja_staatus==null && other.getEttevotja_staatus()==null) || 
             (this.ettevotja_staatus!=null &&
              this.ettevotja_staatus.equals(other.getEttevotja_staatus()))) &&
            ((this.kande_id==null && other.getKande_id()==null) || 
             (this.kande_id!=null &&
              this.kande_id.equals(other.getKande_id()))) &&
            ((this.kande_kpv==null && other.getKande_kpv()==null) || 
             (this.kande_kpv!=null &&
              this.kande_kpv.equals(other.getKande_kpv()))) &&
            ((this.kande_liik==null && other.getKande_liik()==null) || 
             (this.kande_liik!=null &&
              this.kande_liik.equals(other.getKande_liik()))) &&
            ((this.kandeelement==null && other.getKandeelement()==null) || 
             (this.kandeelement!=null &&
              java.util.Arrays.equals(this.kandeelement, other.getKandeelement())));
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
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        if (getEttevotja_ariregistri_kood() != null) {
            _hashCode += getEttevotja_ariregistri_kood().hashCode();
        }
        if (getEttevotja_arinimi() != null) {
            _hashCode += getEttevotja_arinimi().hashCode();
        }
        if (getEttevotja_oiguslik_vorm() != null) {
            _hashCode += getEttevotja_oiguslik_vorm().hashCode();
        }
        if (getEttevotja_staatus() != null) {
            _hashCode += getEttevotja_staatus().hashCode();
        }
        if (getKande_id() != null) {
            _hashCode += getKande_id().hashCode();
        }
        if (getKande_kpv() != null) {
            _hashCode += getKande_kpv().hashCode();
        }
        if (getKande_liik() != null) {
            _hashCode += getKande_liik().hashCode();
        }
        if (getKandeelement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKandeelement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKandeelement(), i);
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
