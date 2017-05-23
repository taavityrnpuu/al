/**
 * EVapiMaaruseDokumentVastus_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiMaaruseDokumentVastus_v1  implements java.io.Serializable {
    private org.apache.axis.types.URI viide_manusele;

    private java.lang.String failinimi;

    public EVapiMaaruseDokumentVastus_v1() {
    }

    public EVapiMaaruseDokumentVastus_v1(
           org.apache.axis.types.URI viide_manusele,
           java.lang.String failinimi) {
           this.viide_manusele = viide_manusele;
           this.failinimi = failinimi;
    }


    /**
     * Gets the viide_manusele value for this EVapiMaaruseDokumentVastus_v1.
     * 
     * @return viide_manusele
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this EVapiMaaruseDokumentVastus_v1.
     * 
     * @param viide_manusele
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the failinimi value for this EVapiMaaruseDokumentVastus_v1.
     * 
     * @return failinimi
     */
    public java.lang.String getFailinimi() {
        return failinimi;
    }


    /**
     * Sets the failinimi value for this EVapiMaaruseDokumentVastus_v1.
     * 
     * @param failinimi
     */
    public void setFailinimi(java.lang.String failinimi) {
        this.failinimi = failinimi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiMaaruseDokumentVastus_v1)) return false;
        EVapiMaaruseDokumentVastus_v1 other = (EVapiMaaruseDokumentVastus_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viide_manusele==null && other.getViide_manusele()==null) || 
             (this.viide_manusele!=null &&
              this.viide_manusele.equals(other.getViide_manusele()))) &&
            ((this.failinimi==null && other.getFailinimi()==null) || 
             (this.failinimi!=null &&
              this.failinimi.equals(other.getFailinimi())));
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
        if (getViide_manusele() != null) {
            _hashCode += getViide_manusele().hashCode();
        }
        if (getFailinimi() != null) {
            _hashCode += getFailinimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
