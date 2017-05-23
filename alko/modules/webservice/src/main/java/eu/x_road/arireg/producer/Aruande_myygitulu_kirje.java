/**
 * Aruande_myygitulu_kirje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Aruande_myygitulu_kirje  implements java.io.Serializable {
    private java.lang.String ariregistri_kood;

    private java.lang.String oiguslik_vorm;

    private java.util.Date esitamise_aeg;

    /* Aruande aasta */
    private java.math.BigInteger aasta;

    private java.lang.Boolean myygituluta_tegutsev_ettevote;

    private eu.x_road.arireg.producer.Aruande_myygitulu_kirje_myygitulu[] myygitulud;

    public Aruande_myygitulu_kirje() {
    }

    public Aruande_myygitulu_kirje(
           java.lang.String ariregistri_kood,
           java.lang.String oiguslik_vorm,
           java.util.Date esitamise_aeg,
           java.math.BigInteger aasta,
           java.lang.Boolean myygituluta_tegutsev_ettevote,
           eu.x_road.arireg.producer.Aruande_myygitulu_kirje_myygitulu[] myygitulud) {
           this.ariregistri_kood = ariregistri_kood;
           this.oiguslik_vorm = oiguslik_vorm;
           this.esitamise_aeg = esitamise_aeg;
           this.aasta = aasta;
           this.myygituluta_tegutsev_ettevote = myygituluta_tegutsev_ettevote;
           this.myygitulud = myygitulud;
    }


    /**
     * Gets the ariregistri_kood value for this Aruande_myygitulu_kirje.
     * 
     * @return ariregistri_kood
     */
    public java.lang.String getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Aruande_myygitulu_kirje.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.String ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the oiguslik_vorm value for this Aruande_myygitulu_kirje.
     * 
     * @return oiguslik_vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Aruande_myygitulu_kirje.
     * 
     * @param oiguslik_vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the esitamise_aeg value for this Aruande_myygitulu_kirje.
     * 
     * @return esitamise_aeg
     */
    public java.util.Date getEsitamise_aeg() {
        return esitamise_aeg;
    }


    /**
     * Sets the esitamise_aeg value for this Aruande_myygitulu_kirje.
     * 
     * @param esitamise_aeg
     */
    public void setEsitamise_aeg(java.util.Date esitamise_aeg) {
        this.esitamise_aeg = esitamise_aeg;
    }


    /**
     * Gets the aasta value for this Aruande_myygitulu_kirje.
     * 
     * @return aasta   * Aruande aasta
     */
    public java.math.BigInteger getAasta() {
        return aasta;
    }


    /**
     * Sets the aasta value for this Aruande_myygitulu_kirje.
     * 
     * @param aasta   * Aruande aasta
     */
    public void setAasta(java.math.BigInteger aasta) {
        this.aasta = aasta;
    }


    /**
     * Gets the myygituluta_tegutsev_ettevote value for this Aruande_myygitulu_kirje.
     * 
     * @return myygituluta_tegutsev_ettevote
     */
    public java.lang.Boolean getMyygituluta_tegutsev_ettevote() {
        return myygituluta_tegutsev_ettevote;
    }


    /**
     * Sets the myygituluta_tegutsev_ettevote value for this Aruande_myygitulu_kirje.
     * 
     * @param myygituluta_tegutsev_ettevote
     */
    public void setMyygituluta_tegutsev_ettevote(java.lang.Boolean myygituluta_tegutsev_ettevote) {
        this.myygituluta_tegutsev_ettevote = myygituluta_tegutsev_ettevote;
    }


    /**
     * Gets the myygitulud value for this Aruande_myygitulu_kirje.
     * 
     * @return myygitulud
     */
    public eu.x_road.arireg.producer.Aruande_myygitulu_kirje_myygitulu[] getMyygitulud() {
        return myygitulud;
    }


    /**
     * Sets the myygitulud value for this Aruande_myygitulu_kirje.
     * 
     * @param myygitulud
     */
    public void setMyygitulud(eu.x_road.arireg.producer.Aruande_myygitulu_kirje_myygitulu[] myygitulud) {
        this.myygitulud = myygitulud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruande_myygitulu_kirje)) return false;
        Aruande_myygitulu_kirje other = (Aruande_myygitulu_kirje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm()))) &&
            ((this.esitamise_aeg==null && other.getEsitamise_aeg()==null) || 
             (this.esitamise_aeg!=null &&
              this.esitamise_aeg.equals(other.getEsitamise_aeg()))) &&
            ((this.aasta==null && other.getAasta()==null) || 
             (this.aasta!=null &&
              this.aasta.equals(other.getAasta()))) &&
            ((this.myygituluta_tegutsev_ettevote==null && other.getMyygituluta_tegutsev_ettevote()==null) || 
             (this.myygituluta_tegutsev_ettevote!=null &&
              this.myygituluta_tegutsev_ettevote.equals(other.getMyygituluta_tegutsev_ettevote()))) &&
            ((this.myygitulud==null && other.getMyygitulud()==null) || 
             (this.myygitulud!=null &&
              java.util.Arrays.equals(this.myygitulud, other.getMyygitulud())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        if (getEsitamise_aeg() != null) {
            _hashCode += getEsitamise_aeg().hashCode();
        }
        if (getAasta() != null) {
            _hashCode += getAasta().hashCode();
        }
        if (getMyygituluta_tegutsev_ettevote() != null) {
            _hashCode += getMyygituluta_tegutsev_ettevote().hashCode();
        }
        if (getMyygitulud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMyygitulud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMyygitulud(), i);
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
