/**
 * DigiteeriDokumendidParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class DigiteeriDokumendidParing_v1  implements java.io.Serializable {
    /* Ettevõtja ID */
    private java.math.BigInteger ettevotja_id;

    /* Esitaja perekonnanimi */
    private java.lang.String esitaja_nimi;

    /* Esitaja eesnimi */
    private java.lang.String esitaja_eesnimi;

    /* Esitaja isikukood */
    private java.lang.String esitaja_kood;

    /* Esitaja e-posti aadress */
    private java.lang.String esitaja_epost;

    /* Tellimuse esitamise viis (L - Teabesüsteemist lepinguline tellimus,
     * Y - Teabesüsteemist üksikkasutaja tellimus, E - Ettevõtjaportaalist
     * seotud ettevõtja tellimus) */
    private java.lang.String tellimise_viis;

    /* Teenust kasutava süsteemi tellimused indentifikaator */
    private java.lang.String sidussysteemi_tellimuse_identifikaator;

    /* Dokumendi ID */
    private java.math.BigInteger[] dokument_id;

    public DigiteeriDokumendidParing_v1() {
    }

    public DigiteeriDokumendidParing_v1(
           java.math.BigInteger ettevotja_id,
           java.lang.String esitaja_nimi,
           java.lang.String esitaja_eesnimi,
           java.lang.String esitaja_kood,
           java.lang.String esitaja_epost,
           java.lang.String tellimise_viis,
           java.lang.String sidussysteemi_tellimuse_identifikaator,
           java.math.BigInteger[] dokument_id) {
           this.ettevotja_id = ettevotja_id;
           this.esitaja_nimi = esitaja_nimi;
           this.esitaja_eesnimi = esitaja_eesnimi;
           this.esitaja_kood = esitaja_kood;
           this.esitaja_epost = esitaja_epost;
           this.tellimise_viis = tellimise_viis;
           this.sidussysteemi_tellimuse_identifikaator = sidussysteemi_tellimuse_identifikaator;
           this.dokument_id = dokument_id;
    }


    /**
     * Gets the ettevotja_id value for this DigiteeriDokumendidParing_v1.
     * 
     * @return ettevotja_id   * Ettevõtja ID
     */
    public java.math.BigInteger getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this DigiteeriDokumendidParing_v1.
     * 
     * @param ettevotja_id   * Ettevõtja ID
     */
    public void setEttevotja_id(java.math.BigInteger ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the esitaja_nimi value for this DigiteeriDokumendidParing_v1.
     * 
     * @return esitaja_nimi   * Esitaja perekonnanimi
     */
    public java.lang.String getEsitaja_nimi() {
        return esitaja_nimi;
    }


    /**
     * Sets the esitaja_nimi value for this DigiteeriDokumendidParing_v1.
     * 
     * @param esitaja_nimi   * Esitaja perekonnanimi
     */
    public void setEsitaja_nimi(java.lang.String esitaja_nimi) {
        this.esitaja_nimi = esitaja_nimi;
    }


    /**
     * Gets the esitaja_eesnimi value for this DigiteeriDokumendidParing_v1.
     * 
     * @return esitaja_eesnimi   * Esitaja eesnimi
     */
    public java.lang.String getEsitaja_eesnimi() {
        return esitaja_eesnimi;
    }


    /**
     * Sets the esitaja_eesnimi value for this DigiteeriDokumendidParing_v1.
     * 
     * @param esitaja_eesnimi   * Esitaja eesnimi
     */
    public void setEsitaja_eesnimi(java.lang.String esitaja_eesnimi) {
        this.esitaja_eesnimi = esitaja_eesnimi;
    }


    /**
     * Gets the esitaja_kood value for this DigiteeriDokumendidParing_v1.
     * 
     * @return esitaja_kood   * Esitaja isikukood
     */
    public java.lang.String getEsitaja_kood() {
        return esitaja_kood;
    }


    /**
     * Sets the esitaja_kood value for this DigiteeriDokumendidParing_v1.
     * 
     * @param esitaja_kood   * Esitaja isikukood
     */
    public void setEsitaja_kood(java.lang.String esitaja_kood) {
        this.esitaja_kood = esitaja_kood;
    }


    /**
     * Gets the esitaja_epost value for this DigiteeriDokumendidParing_v1.
     * 
     * @return esitaja_epost   * Esitaja e-posti aadress
     */
    public java.lang.String getEsitaja_epost() {
        return esitaja_epost;
    }


    /**
     * Sets the esitaja_epost value for this DigiteeriDokumendidParing_v1.
     * 
     * @param esitaja_epost   * Esitaja e-posti aadress
     */
    public void setEsitaja_epost(java.lang.String esitaja_epost) {
        this.esitaja_epost = esitaja_epost;
    }


    /**
     * Gets the tellimise_viis value for this DigiteeriDokumendidParing_v1.
     * 
     * @return tellimise_viis   * Tellimuse esitamise viis (L - Teabesüsteemist lepinguline tellimus,
     * Y - Teabesüsteemist üksikkasutaja tellimus, E - Ettevõtjaportaalist
     * seotud ettevõtja tellimus)
     */
    public java.lang.String getTellimise_viis() {
        return tellimise_viis;
    }


    /**
     * Sets the tellimise_viis value for this DigiteeriDokumendidParing_v1.
     * 
     * @param tellimise_viis   * Tellimuse esitamise viis (L - Teabesüsteemist lepinguline tellimus,
     * Y - Teabesüsteemist üksikkasutaja tellimus, E - Ettevõtjaportaalist
     * seotud ettevõtja tellimus)
     */
    public void setTellimise_viis(java.lang.String tellimise_viis) {
        this.tellimise_viis = tellimise_viis;
    }


    /**
     * Gets the sidussysteemi_tellimuse_identifikaator value for this DigiteeriDokumendidParing_v1.
     * 
     * @return sidussysteemi_tellimuse_identifikaator   * Teenust kasutava süsteemi tellimused indentifikaator
     */
    public java.lang.String getSidussysteemi_tellimuse_identifikaator() {
        return sidussysteemi_tellimuse_identifikaator;
    }


    /**
     * Sets the sidussysteemi_tellimuse_identifikaator value for this DigiteeriDokumendidParing_v1.
     * 
     * @param sidussysteemi_tellimuse_identifikaator   * Teenust kasutava süsteemi tellimused indentifikaator
     */
    public void setSidussysteemi_tellimuse_identifikaator(java.lang.String sidussysteemi_tellimuse_identifikaator) {
        this.sidussysteemi_tellimuse_identifikaator = sidussysteemi_tellimuse_identifikaator;
    }


    /**
     * Gets the dokument_id value for this DigiteeriDokumendidParing_v1.
     * 
     * @return dokument_id   * Dokumendi ID
     */
    public java.math.BigInteger[] getDokument_id() {
        return dokument_id;
    }


    /**
     * Sets the dokument_id value for this DigiteeriDokumendidParing_v1.
     * 
     * @param dokument_id   * Dokumendi ID
     */
    public void setDokument_id(java.math.BigInteger[] dokument_id) {
        this.dokument_id = dokument_id;
    }

    public java.math.BigInteger getDokument_id(int i) {
        return this.dokument_id[i];
    }

    public void setDokument_id(int i, java.math.BigInteger _value) {
        this.dokument_id[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigiteeriDokumendidParing_v1)) return false;
        DigiteeriDokumendidParing_v1 other = (DigiteeriDokumendidParing_v1) obj;
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
            ((this.esitaja_nimi==null && other.getEsitaja_nimi()==null) || 
             (this.esitaja_nimi!=null &&
              this.esitaja_nimi.equals(other.getEsitaja_nimi()))) &&
            ((this.esitaja_eesnimi==null && other.getEsitaja_eesnimi()==null) || 
             (this.esitaja_eesnimi!=null &&
              this.esitaja_eesnimi.equals(other.getEsitaja_eesnimi()))) &&
            ((this.esitaja_kood==null && other.getEsitaja_kood()==null) || 
             (this.esitaja_kood!=null &&
              this.esitaja_kood.equals(other.getEsitaja_kood()))) &&
            ((this.esitaja_epost==null && other.getEsitaja_epost()==null) || 
             (this.esitaja_epost!=null &&
              this.esitaja_epost.equals(other.getEsitaja_epost()))) &&
            ((this.tellimise_viis==null && other.getTellimise_viis()==null) || 
             (this.tellimise_viis!=null &&
              this.tellimise_viis.equals(other.getTellimise_viis()))) &&
            ((this.sidussysteemi_tellimuse_identifikaator==null && other.getSidussysteemi_tellimuse_identifikaator()==null) || 
             (this.sidussysteemi_tellimuse_identifikaator!=null &&
              this.sidussysteemi_tellimuse_identifikaator.equals(other.getSidussysteemi_tellimuse_identifikaator()))) &&
            ((this.dokument_id==null && other.getDokument_id()==null) || 
             (this.dokument_id!=null &&
              java.util.Arrays.equals(this.dokument_id, other.getDokument_id())));
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
        if (getEsitaja_nimi() != null) {
            _hashCode += getEsitaja_nimi().hashCode();
        }
        if (getEsitaja_eesnimi() != null) {
            _hashCode += getEsitaja_eesnimi().hashCode();
        }
        if (getEsitaja_kood() != null) {
            _hashCode += getEsitaja_kood().hashCode();
        }
        if (getEsitaja_epost() != null) {
            _hashCode += getEsitaja_epost().hashCode();
        }
        if (getTellimise_viis() != null) {
            _hashCode += getTellimise_viis().hashCode();
        }
        if (getSidussysteemi_tellimuse_identifikaator() != null) {
            _hashCode += getSidussysteemi_tellimuse_identifikaator().hashCode();
        }
        if (getDokument_id() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDokument_id());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDokument_id(), i);
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
