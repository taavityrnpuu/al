/**
 * EVapiLooKannedokumentType_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKannedokumentType_v1  implements java.io.Serializable {
    /* dokumendi ID - viide attachment reference nimele */
    private org.apache.axis.types.URI id;

    /* Failinimi koos laiendiga. */
    private java.lang.String failinimi;

    /* Dokumendi liik (36 - kontaktisiku nõusolek) */
    private java.lang.Integer dokumendiliik;

    public EVapiLooKannedokumentType_v1() {
    }

    public EVapiLooKannedokumentType_v1(
           org.apache.axis.types.URI id,
           java.lang.String failinimi,
           java.lang.Integer dokumendiliik) {
           this.id = id;
           this.failinimi = failinimi;
           this.dokumendiliik = dokumendiliik;
    }


    /**
     * Gets the id value for this EVapiLooKannedokumentType_v1.
     * 
     * @return id   * dokumendi ID - viide attachment reference nimele
     */
    public org.apache.axis.types.URI getId() {
        return id;
    }


    /**
     * Sets the id value for this EVapiLooKannedokumentType_v1.
     * 
     * @param id   * dokumendi ID - viide attachment reference nimele
     */
    public void setId(org.apache.axis.types.URI id) {
        this.id = id;
    }


    /**
     * Gets the failinimi value for this EVapiLooKannedokumentType_v1.
     * 
     * @return failinimi   * Failinimi koos laiendiga.
     */
    public java.lang.String getFailinimi() {
        return failinimi;
    }


    /**
     * Sets the failinimi value for this EVapiLooKannedokumentType_v1.
     * 
     * @param failinimi   * Failinimi koos laiendiga.
     */
    public void setFailinimi(java.lang.String failinimi) {
        this.failinimi = failinimi;
    }


    /**
     * Gets the dokumendiliik value for this EVapiLooKannedokumentType_v1.
     * 
     * @return dokumendiliik   * Dokumendi liik (36 - kontaktisiku nõusolek)
     */
    public java.lang.Integer getDokumendiliik() {
        return dokumendiliik;
    }


    /**
     * Sets the dokumendiliik value for this EVapiLooKannedokumentType_v1.
     * 
     * @param dokumendiliik   * Dokumendi liik (36 - kontaktisiku nõusolek)
     */
    public void setDokumendiliik(java.lang.Integer dokumendiliik) {
        this.dokumendiliik = dokumendiliik;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKannedokumentType_v1)) return false;
        EVapiLooKannedokumentType_v1 other = (EVapiLooKannedokumentType_v1) obj;
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
            ((this.failinimi==null && other.getFailinimi()==null) || 
             (this.failinimi!=null &&
              this.failinimi.equals(other.getFailinimi()))) &&
            ((this.dokumendiliik==null && other.getDokumendiliik()==null) || 
             (this.dokumendiliik!=null &&
              this.dokumendiliik.equals(other.getDokumendiliik())));
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
        if (getFailinimi() != null) {
            _hashCode += getFailinimi().hashCode();
        }
        if (getDokumendiliik() != null) {
            _hashCode += getDokumendiliik().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
