/**
 * Toimiku_dokument_v1_Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Toimiku_dokument_v1_Request  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private java.math.BigInteger dokumendi_id;

    /* M – Määrus, D – Dokument,  K - Kiri. */
    private java.lang.String dokumendi_tyyp;

    public Toimiku_dokument_v1_Request() {
    }

    public Toimiku_dokument_v1_Request(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.math.BigInteger dokumendi_id,
           java.lang.String dokumendi_tyyp) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.dokumendi_id = dokumendi_id;
           this.dokumendi_tyyp = dokumendi_tyyp;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Toimiku_dokument_v1_Request.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Toimiku_dokument_v1_Request.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Toimiku_dokument_v1_Request.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Toimiku_dokument_v1_Request.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the dokumendi_id value for this Toimiku_dokument_v1_Request.
     * 
     * @return dokumendi_id
     */
    public java.math.BigInteger getDokumendi_id() {
        return dokumendi_id;
    }


    /**
     * Sets the dokumendi_id value for this Toimiku_dokument_v1_Request.
     * 
     * @param dokumendi_id
     */
    public void setDokumendi_id(java.math.BigInteger dokumendi_id) {
        this.dokumendi_id = dokumendi_id;
    }


    /**
     * Gets the dokumendi_tyyp value for this Toimiku_dokument_v1_Request.
     * 
     * @return dokumendi_tyyp   * M – Määrus, D – Dokument,  K - Kiri.
     */
    public java.lang.String getDokumendi_tyyp() {
        return dokumendi_tyyp;
    }


    /**
     * Sets the dokumendi_tyyp value for this Toimiku_dokument_v1_Request.
     * 
     * @param dokumendi_tyyp   * M – Määrus, D – Dokument,  K - Kiri.
     */
    public void setDokumendi_tyyp(java.lang.String dokumendi_tyyp) {
        this.dokumendi_tyyp = dokumendi_tyyp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Toimiku_dokument_v1_Request)) return false;
        Toimiku_dokument_v1_Request other = (Toimiku_dokument_v1_Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregister_kasutajanimi==null && other.getAriregister_kasutajanimi()==null) || 
             (this.ariregister_kasutajanimi!=null &&
              this.ariregister_kasutajanimi.equals(other.getAriregister_kasutajanimi()))) &&
            ((this.ariregister_parool==null && other.getAriregister_parool()==null) || 
             (this.ariregister_parool!=null &&
              this.ariregister_parool.equals(other.getAriregister_parool()))) &&
            ((this.dokumendi_id==null && other.getDokumendi_id()==null) || 
             (this.dokumendi_id!=null &&
              this.dokumendi_id.equals(other.getDokumendi_id()))) &&
            ((this.dokumendi_tyyp==null && other.getDokumendi_tyyp()==null) || 
             (this.dokumendi_tyyp!=null &&
              this.dokumendi_tyyp.equals(other.getDokumendi_tyyp())));
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
        if (getAriregister_kasutajanimi() != null) {
            _hashCode += getAriregister_kasutajanimi().hashCode();
        }
        if (getAriregister_parool() != null) {
            _hashCode += getAriregister_parool().hashCode();
        }
        if (getDokumendi_id() != null) {
            _hashCode += getDokumendi_id().hashCode();
        }
        if (getDokumendi_tyyp() != null) {
            _hashCode += getDokumendi_tyyp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
