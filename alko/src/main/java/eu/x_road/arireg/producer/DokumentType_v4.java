/**
 * DokumentType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class DokumentType_v4  implements java.io.Serializable {
    /* dokumendi ID - viide attachment reference nimele */
    private org.apache.axis.types.URI id;

    /* Dokumendi ID ettevõtjaportaalis */
    private java.math.BigInteger edokumendi_id;

    /* Viit digidoc-i sisesele failile (nn virtuaalne kirje). Digidoc
     * konteiner ja kõik selle sisufailid peavad omama sama ID-d (vt eelmine
     * element, viide attachment reference nimele). Kasutatav vorming on
     * DDOC puhul: "DDOC||D0", kus D0 on dokumendi ID, millele viidatakse.
     * Näide: viit "DDOC||D2||D3||D1" tähendab, et viidatakse digidoc konteineris
     * olevale kolmandale dokumendile (mis on ise ka digidoc), selles neljandale
     * dokumendile (mis on ise ka digidoc) ja selles teisele dokumendile. */
    private java.lang.String digidoc_viit;

    /* Failinimi koos laiendiga. Viidatud dokumendi puhul (DDOC) peab
     * siin olema faili pärisnimi, mitte digidoc konteineri nimi. */
    private java.lang.String failinimi;

    /* Dokumendi liik schemast arireg.dok_liigid, täidetakse ainult
     * ettevõtjaportaalist saadetud kandeavalduste korral */
    private java.lang.Integer liik_ettevotjaportaal;

    /* Dokumendi liik e-Notaris, täidetakse ainult e-Notarist saadetud
     * kandeavalduste korral */
    private java.lang.Integer liik_enotar;

    public DokumentType_v4() {
    }

    public DokumentType_v4(
           org.apache.axis.types.URI id,
           java.math.BigInteger edokumendi_id,
           java.lang.String digidoc_viit,
           java.lang.String failinimi,
           java.lang.Integer liik_ettevotjaportaal,
           java.lang.Integer liik_enotar) {
           this.id = id;
           this.edokumendi_id = edokumendi_id;
           this.digidoc_viit = digidoc_viit;
           this.failinimi = failinimi;
           this.liik_ettevotjaportaal = liik_ettevotjaportaal;
           this.liik_enotar = liik_enotar;
    }


    /**
     * Gets the id value for this DokumentType_v4.
     * 
     * @return id   * dokumendi ID - viide attachment reference nimele
     */
    public org.apache.axis.types.URI getId() {
        return id;
    }


    /**
     * Sets the id value for this DokumentType_v4.
     * 
     * @param id   * dokumendi ID - viide attachment reference nimele
     */
    public void setId(org.apache.axis.types.URI id) {
        this.id = id;
    }


    /**
     * Gets the edokumendi_id value for this DokumentType_v4.
     * 
     * @return edokumendi_id   * Dokumendi ID ettevõtjaportaalis
     */
    public java.math.BigInteger getEdokumendi_id() {
        return edokumendi_id;
    }


    /**
     * Sets the edokumendi_id value for this DokumentType_v4.
     * 
     * @param edokumendi_id   * Dokumendi ID ettevõtjaportaalis
     */
    public void setEdokumendi_id(java.math.BigInteger edokumendi_id) {
        this.edokumendi_id = edokumendi_id;
    }


    /**
     * Gets the digidoc_viit value for this DokumentType_v4.
     * 
     * @return digidoc_viit   * Viit digidoc-i sisesele failile (nn virtuaalne kirje). Digidoc
     * konteiner ja kõik selle sisufailid peavad omama sama ID-d (vt eelmine
     * element, viide attachment reference nimele). Kasutatav vorming on
     * DDOC puhul: "DDOC||D0", kus D0 on dokumendi ID, millele viidatakse.
     * Näide: viit "DDOC||D2||D3||D1" tähendab, et viidatakse digidoc konteineris
     * olevale kolmandale dokumendile (mis on ise ka digidoc), selles neljandale
     * dokumendile (mis on ise ka digidoc) ja selles teisele dokumendile.
     */
    public java.lang.String getDigidoc_viit() {
        return digidoc_viit;
    }


    /**
     * Sets the digidoc_viit value for this DokumentType_v4.
     * 
     * @param digidoc_viit   * Viit digidoc-i sisesele failile (nn virtuaalne kirje). Digidoc
     * konteiner ja kõik selle sisufailid peavad omama sama ID-d (vt eelmine
     * element, viide attachment reference nimele). Kasutatav vorming on
     * DDOC puhul: "DDOC||D0", kus D0 on dokumendi ID, millele viidatakse.
     * Näide: viit "DDOC||D2||D3||D1" tähendab, et viidatakse digidoc konteineris
     * olevale kolmandale dokumendile (mis on ise ka digidoc), selles neljandale
     * dokumendile (mis on ise ka digidoc) ja selles teisele dokumendile.
     */
    public void setDigidoc_viit(java.lang.String digidoc_viit) {
        this.digidoc_viit = digidoc_viit;
    }


    /**
     * Gets the failinimi value for this DokumentType_v4.
     * 
     * @return failinimi   * Failinimi koos laiendiga. Viidatud dokumendi puhul (DDOC) peab
     * siin olema faili pärisnimi, mitte digidoc konteineri nimi.
     */
    public java.lang.String getFailinimi() {
        return failinimi;
    }


    /**
     * Sets the failinimi value for this DokumentType_v4.
     * 
     * @param failinimi   * Failinimi koos laiendiga. Viidatud dokumendi puhul (DDOC) peab
     * siin olema faili pärisnimi, mitte digidoc konteineri nimi.
     */
    public void setFailinimi(java.lang.String failinimi) {
        this.failinimi = failinimi;
    }


    /**
     * Gets the liik_ettevotjaportaal value for this DokumentType_v4.
     * 
     * @return liik_ettevotjaportaal   * Dokumendi liik schemast arireg.dok_liigid, täidetakse ainult
     * ettevõtjaportaalist saadetud kandeavalduste korral
     */
    public java.lang.Integer getLiik_ettevotjaportaal() {
        return liik_ettevotjaportaal;
    }


    /**
     * Sets the liik_ettevotjaportaal value for this DokumentType_v4.
     * 
     * @param liik_ettevotjaportaal   * Dokumendi liik schemast arireg.dok_liigid, täidetakse ainult
     * ettevõtjaportaalist saadetud kandeavalduste korral
     */
    public void setLiik_ettevotjaportaal(java.lang.Integer liik_ettevotjaportaal) {
        this.liik_ettevotjaportaal = liik_ettevotjaportaal;
    }


    /**
     * Gets the liik_enotar value for this DokumentType_v4.
     * 
     * @return liik_enotar   * Dokumendi liik e-Notaris, täidetakse ainult e-Notarist saadetud
     * kandeavalduste korral
     */
    public java.lang.Integer getLiik_enotar() {
        return liik_enotar;
    }


    /**
     * Sets the liik_enotar value for this DokumentType_v4.
     * 
     * @param liik_enotar   * Dokumendi liik e-Notaris, täidetakse ainult e-Notarist saadetud
     * kandeavalduste korral
     */
    public void setLiik_enotar(java.lang.Integer liik_enotar) {
        this.liik_enotar = liik_enotar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DokumentType_v4)) return false;
        DokumentType_v4 other = (DokumentType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.edokumendi_id==null && other.getEdokumendi_id()==null) || 
             (this.edokumendi_id!=null &&
              this.edokumendi_id.equals(other.getEdokumendi_id()))) &&
            ((this.digidoc_viit==null && other.getDigidoc_viit()==null) || 
             (this.digidoc_viit!=null &&
              this.digidoc_viit.equals(other.getDigidoc_viit()))) &&
            ((this.failinimi==null && other.getFailinimi()==null) || 
             (this.failinimi!=null &&
              this.failinimi.equals(other.getFailinimi()))) &&
            ((this.liik_ettevotjaportaal==null && other.getLiik_ettevotjaportaal()==null) || 
             (this.liik_ettevotjaportaal!=null &&
              this.liik_ettevotjaportaal.equals(other.getLiik_ettevotjaportaal()))) &&
            ((this.liik_enotar==null && other.getLiik_enotar()==null) || 
             (this.liik_enotar!=null &&
              this.liik_enotar.equals(other.getLiik_enotar())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getEdokumendi_id() != null) {
            _hashCode += getEdokumendi_id().hashCode();
        }
        if (getDigidoc_viit() != null) {
            _hashCode += getDigidoc_viit().hashCode();
        }
        if (getFailinimi() != null) {
            _hashCode += getFailinimi().hashCode();
        }
        if (getLiik_ettevotjaportaal() != null) {
            _hashCode += getLiik_ettevotjaportaal().hashCode();
        }
        if (getLiik_enotar() != null) {
            _hashCode += getLiik_enotar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
