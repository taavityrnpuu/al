/**
 * Ettevotja_muudatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatus  implements java.io.Serializable {
    private java.lang.Integer ariregistri_kood;

    /* Ärinimi */
    private java.lang.String arinimi;

    /* Õiguslik vorm */
    private java.lang.String oiguslik_vorm;

    /* Kandeväline muudatus - muutusid kandevälised isikud */
    private java.lang.String kandevalised_isikud;

    /* Kandeväline muudatus - muutusid kandevälised sidevahendid */
    private java.lang.String kandevalised_sidevahendid;

    /* Kandeväline muudatus - muutusid kandevälised tegevusalad */
    private java.lang.String kandevalised_tegevusalad;

    /* Muudatus ariregistri kandes */
    private eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne[] kanded;

    public Ettevotja_muudatus() {
    }

    public Ettevotja_muudatus(
           java.lang.Integer ariregistri_kood,
           java.lang.String arinimi,
           java.lang.String oiguslik_vorm,
           java.lang.String kandevalised_isikud,
           java.lang.String kandevalised_sidevahendid,
           java.lang.String kandevalised_tegevusalad,
           eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne[] kanded) {
           this.ariregistri_kood = ariregistri_kood;
           this.arinimi = arinimi;
           this.oiguslik_vorm = oiguslik_vorm;
           this.kandevalised_isikud = kandevalised_isikud;
           this.kandevalised_sidevahendid = kandevalised_sidevahendid;
           this.kandevalised_tegevusalad = kandevalised_tegevusalad;
           this.kanded = kanded;
    }


    /**
     * Gets the ariregistri_kood value for this Ettevotja_muudatus.
     * 
     * @return ariregistri_kood
     */
    public java.lang.Integer getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ettevotja_muudatus.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.Integer ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the arinimi value for this Ettevotja_muudatus.
     * 
     * @return arinimi   * Ärinimi
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }


    /**
     * Sets the arinimi value for this Ettevotja_muudatus.
     * 
     * @param arinimi   * Ärinimi
     */
    public void setArinimi(java.lang.String arinimi) {
        this.arinimi = arinimi;
    }


    /**
     * Gets the oiguslik_vorm value for this Ettevotja_muudatus.
     * 
     * @return oiguslik_vorm   * Õiguslik vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Ettevotja_muudatus.
     * 
     * @param oiguslik_vorm   * Õiguslik vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the kandevalised_isikud value for this Ettevotja_muudatus.
     * 
     * @return kandevalised_isikud   * Kandeväline muudatus - muutusid kandevälised isikud
     */
    public java.lang.String getKandevalised_isikud() {
        return kandevalised_isikud;
    }


    /**
     * Sets the kandevalised_isikud value for this Ettevotja_muudatus.
     * 
     * @param kandevalised_isikud   * Kandeväline muudatus - muutusid kandevälised isikud
     */
    public void setKandevalised_isikud(java.lang.String kandevalised_isikud) {
        this.kandevalised_isikud = kandevalised_isikud;
    }


    /**
     * Gets the kandevalised_sidevahendid value for this Ettevotja_muudatus.
     * 
     * @return kandevalised_sidevahendid   * Kandeväline muudatus - muutusid kandevälised sidevahendid
     */
    public java.lang.String getKandevalised_sidevahendid() {
        return kandevalised_sidevahendid;
    }


    /**
     * Sets the kandevalised_sidevahendid value for this Ettevotja_muudatus.
     * 
     * @param kandevalised_sidevahendid   * Kandeväline muudatus - muutusid kandevälised sidevahendid
     */
    public void setKandevalised_sidevahendid(java.lang.String kandevalised_sidevahendid) {
        this.kandevalised_sidevahendid = kandevalised_sidevahendid;
    }


    /**
     * Gets the kandevalised_tegevusalad value for this Ettevotja_muudatus.
     * 
     * @return kandevalised_tegevusalad   * Kandeväline muudatus - muutusid kandevälised tegevusalad
     */
    public java.lang.String getKandevalised_tegevusalad() {
        return kandevalised_tegevusalad;
    }


    /**
     * Sets the kandevalised_tegevusalad value for this Ettevotja_muudatus.
     * 
     * @param kandevalised_tegevusalad   * Kandeväline muudatus - muutusid kandevälised tegevusalad
     */
    public void setKandevalised_tegevusalad(java.lang.String kandevalised_tegevusalad) {
        this.kandevalised_tegevusalad = kandevalised_tegevusalad;
    }


    /**
     * Gets the kanded value for this Ettevotja_muudatus.
     * 
     * @return kanded   * Muudatus ariregistri kandes
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne[] getKanded() {
        return kanded;
    }


    /**
     * Sets the kanded value for this Ettevotja_muudatus.
     * 
     * @param kanded   * Muudatus ariregistri kandes
     */
    public void setKanded(eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne[] kanded) {
        this.kanded = kanded;
    }

    public eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne getKanded(int i) {
        return this.kanded[i];
    }

    public void setKanded(int i, eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne _value) {
        this.kanded[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatus)) return false;
        Ettevotja_muudatus other = (Ettevotja_muudatus) obj;
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
            ((this.arinimi==null && other.getArinimi()==null) || 
             (this.arinimi!=null &&
              this.arinimi.equals(other.getArinimi()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm()))) &&
            ((this.kandevalised_isikud==null && other.getKandevalised_isikud()==null) || 
             (this.kandevalised_isikud!=null &&
              this.kandevalised_isikud.equals(other.getKandevalised_isikud()))) &&
            ((this.kandevalised_sidevahendid==null && other.getKandevalised_sidevahendid()==null) || 
             (this.kandevalised_sidevahendid!=null &&
              this.kandevalised_sidevahendid.equals(other.getKandevalised_sidevahendid()))) &&
            ((this.kandevalised_tegevusalad==null && other.getKandevalised_tegevusalad()==null) || 
             (this.kandevalised_tegevusalad!=null &&
              this.kandevalised_tegevusalad.equals(other.getKandevalised_tegevusalad()))) &&
            ((this.kanded==null && other.getKanded()==null) || 
             (this.kanded!=null &&
              java.util.Arrays.equals(this.kanded, other.getKanded())));
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
        if (getArinimi() != null) {
            _hashCode += getArinimi().hashCode();
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        if (getKandevalised_isikud() != null) {
            _hashCode += getKandevalised_isikud().hashCode();
        }
        if (getKandevalised_sidevahendid() != null) {
            _hashCode += getKandevalised_sidevahendid().hashCode();
        }
        if (getKandevalised_tegevusalad() != null) {
            _hashCode += getKandevalised_tegevusalad().hashCode();
        }
        if (getKanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKanded(), i);
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
