/**
 * Toimiku_dokument_v2_Vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Toimiku_dokument_v2_Vastus  implements java.io.Serializable {
    private org.apache.axis.types.URI viide_manusele;

    private java.lang.String failinimi;

    private eu.x_road.arireg.producer.Toimiku_dokumendid_dokument dokument;

    public Toimiku_dokument_v2_Vastus() {
    }

    public Toimiku_dokument_v2_Vastus(
           org.apache.axis.types.URI viide_manusele,
           java.lang.String failinimi,
           eu.x_road.arireg.producer.Toimiku_dokumendid_dokument dokument) {
           this.viide_manusele = viide_manusele;
           this.failinimi = failinimi;
           this.dokument = dokument;
    }


    /**
     * Gets the viide_manusele value for this Toimiku_dokument_v2_Vastus.
     * 
     * @return viide_manusele
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this Toimiku_dokument_v2_Vastus.
     * 
     * @param viide_manusele
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the failinimi value for this Toimiku_dokument_v2_Vastus.
     * 
     * @return failinimi
     */
    public java.lang.String getFailinimi() {
        return failinimi;
    }


    /**
     * Sets the failinimi value for this Toimiku_dokument_v2_Vastus.
     * 
     * @param failinimi
     */
    public void setFailinimi(java.lang.String failinimi) {
        this.failinimi = failinimi;
    }


    /**
     * Gets the dokument value for this Toimiku_dokument_v2_Vastus.
     * 
     * @return dokument
     */
    public eu.x_road.arireg.producer.Toimiku_dokumendid_dokument getDokument() {
        return dokument;
    }


    /**
     * Sets the dokument value for this Toimiku_dokument_v2_Vastus.
     * 
     * @param dokument
     */
    public void setDokument(eu.x_road.arireg.producer.Toimiku_dokumendid_dokument dokument) {
        this.dokument = dokument;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Toimiku_dokument_v2_Vastus)) return false;
        Toimiku_dokument_v2_Vastus other = (Toimiku_dokument_v2_Vastus) obj;
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
              this.failinimi.equals(other.getFailinimi()))) &&
            ((this.dokument==null && other.getDokument()==null) || 
             (this.dokument!=null &&
              this.dokument.equals(other.getDokument())));
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
        if (getDokument() != null) {
            _hashCode += getDokument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
