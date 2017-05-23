/**
 * EVapiLooKanneParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneParing_v1  implements java.io.Serializable {
    /* partneritunnus:autentimistunnus */
    private java.lang.String partner_auth;

    /* Kas lisada koostatavasse konteinerisse inglisekeelne põhikiri
     * ja avaldus? Vaikimisi ei. */
    private java.lang.Boolean lisa_inglk_dokumendid;

    /* Kolmanda osapoole infosüsteemi avalduse ID */
    private java.lang.String kande_id;

    /* Kas on paranduskanne, kui on, siis peab olema määratud ka eelmine_menetlus_id */
    private java.lang.Boolean on_paranduskanne;

    /* Viit eelneva avalduse menetluse numbrile kui tegemist on paranduskandega */
    private java.lang.String eelmine_menetlus_id;

    /* Esitaja nimi partneri portaalist esitatud kandeavalduse korral */
    private java.lang.String esitaja_nimi;

    /* Esitaja isikukood partneri portaalist esitatud kandeavalduse
     * korral */
    private java.lang.String esitaja_kood;

    /* Partneri portaalis genereeritava avalduse puhul avalduse riigilõivu
     * viitenumber. Väli on vajalik selleks, et kui riigilõivu ennast ei
     * ole, siis oleks ette genereeritud viitenumber ikka teada */
    private java.lang.String viitenumber_loiv;

    /* Siia alla tuleb kande sisu */
    private eu.x_road.arireg.producer.EVapiLooKanneKandeSisu_v1 kande_sisu;

    public EVapiLooKanneParing_v1() {
    }

    public EVapiLooKanneParing_v1(
           java.lang.String partner_auth,
           java.lang.Boolean lisa_inglk_dokumendid,
           java.lang.String kande_id,
           java.lang.Boolean on_paranduskanne,
           java.lang.String eelmine_menetlus_id,
           java.lang.String esitaja_nimi,
           java.lang.String esitaja_kood,
           java.lang.String viitenumber_loiv,
           eu.x_road.arireg.producer.EVapiLooKanneKandeSisu_v1 kande_sisu) {
           this.partner_auth = partner_auth;
           this.lisa_inglk_dokumendid = lisa_inglk_dokumendid;
           this.kande_id = kande_id;
           this.on_paranduskanne = on_paranduskanne;
           this.eelmine_menetlus_id = eelmine_menetlus_id;
           this.esitaja_nimi = esitaja_nimi;
           this.esitaja_kood = esitaja_kood;
           this.viitenumber_loiv = viitenumber_loiv;
           this.kande_sisu = kande_sisu;
    }


    /**
     * Gets the partner_auth value for this EVapiLooKanneParing_v1.
     * 
     * @return partner_auth   * partneritunnus:autentimistunnus
     */
    public java.lang.String getPartner_auth() {
        return partner_auth;
    }


    /**
     * Sets the partner_auth value for this EVapiLooKanneParing_v1.
     * 
     * @param partner_auth   * partneritunnus:autentimistunnus
     */
    public void setPartner_auth(java.lang.String partner_auth) {
        this.partner_auth = partner_auth;
    }


    /**
     * Gets the lisa_inglk_dokumendid value for this EVapiLooKanneParing_v1.
     * 
     * @return lisa_inglk_dokumendid   * Kas lisada koostatavasse konteinerisse inglisekeelne põhikiri
     * ja avaldus? Vaikimisi ei.
     */
    public java.lang.Boolean getLisa_inglk_dokumendid() {
        return lisa_inglk_dokumendid;
    }


    /**
     * Sets the lisa_inglk_dokumendid value for this EVapiLooKanneParing_v1.
     * 
     * @param lisa_inglk_dokumendid   * Kas lisada koostatavasse konteinerisse inglisekeelne põhikiri
     * ja avaldus? Vaikimisi ei.
     */
    public void setLisa_inglk_dokumendid(java.lang.Boolean lisa_inglk_dokumendid) {
        this.lisa_inglk_dokumendid = lisa_inglk_dokumendid;
    }


    /**
     * Gets the kande_id value for this EVapiLooKanneParing_v1.
     * 
     * @return kande_id   * Kolmanda osapoole infosüsteemi avalduse ID
     */
    public java.lang.String getKande_id() {
        return kande_id;
    }


    /**
     * Sets the kande_id value for this EVapiLooKanneParing_v1.
     * 
     * @param kande_id   * Kolmanda osapoole infosüsteemi avalduse ID
     */
    public void setKande_id(java.lang.String kande_id) {
        this.kande_id = kande_id;
    }


    /**
     * Gets the on_paranduskanne value for this EVapiLooKanneParing_v1.
     * 
     * @return on_paranduskanne   * Kas on paranduskanne, kui on, siis peab olema määratud ka eelmine_menetlus_id
     */
    public java.lang.Boolean getOn_paranduskanne() {
        return on_paranduskanne;
    }


    /**
     * Sets the on_paranduskanne value for this EVapiLooKanneParing_v1.
     * 
     * @param on_paranduskanne   * Kas on paranduskanne, kui on, siis peab olema määratud ka eelmine_menetlus_id
     */
    public void setOn_paranduskanne(java.lang.Boolean on_paranduskanne) {
        this.on_paranduskanne = on_paranduskanne;
    }


    /**
     * Gets the eelmine_menetlus_id value for this EVapiLooKanneParing_v1.
     * 
     * @return eelmine_menetlus_id   * Viit eelneva avalduse menetluse numbrile kui tegemist on paranduskandega
     */
    public java.lang.String getEelmine_menetlus_id() {
        return eelmine_menetlus_id;
    }


    /**
     * Sets the eelmine_menetlus_id value for this EVapiLooKanneParing_v1.
     * 
     * @param eelmine_menetlus_id   * Viit eelneva avalduse menetluse numbrile kui tegemist on paranduskandega
     */
    public void setEelmine_menetlus_id(java.lang.String eelmine_menetlus_id) {
        this.eelmine_menetlus_id = eelmine_menetlus_id;
    }


    /**
     * Gets the esitaja_nimi value for this EVapiLooKanneParing_v1.
     * 
     * @return esitaja_nimi   * Esitaja nimi partneri portaalist esitatud kandeavalduse korral
     */
    public java.lang.String getEsitaja_nimi() {
        return esitaja_nimi;
    }


    /**
     * Sets the esitaja_nimi value for this EVapiLooKanneParing_v1.
     * 
     * @param esitaja_nimi   * Esitaja nimi partneri portaalist esitatud kandeavalduse korral
     */
    public void setEsitaja_nimi(java.lang.String esitaja_nimi) {
        this.esitaja_nimi = esitaja_nimi;
    }


    /**
     * Gets the esitaja_kood value for this EVapiLooKanneParing_v1.
     * 
     * @return esitaja_kood   * Esitaja isikukood partneri portaalist esitatud kandeavalduse
     * korral
     */
    public java.lang.String getEsitaja_kood() {
        return esitaja_kood;
    }


    /**
     * Sets the esitaja_kood value for this EVapiLooKanneParing_v1.
     * 
     * @param esitaja_kood   * Esitaja isikukood partneri portaalist esitatud kandeavalduse
     * korral
     */
    public void setEsitaja_kood(java.lang.String esitaja_kood) {
        this.esitaja_kood = esitaja_kood;
    }


    /**
     * Gets the viitenumber_loiv value for this EVapiLooKanneParing_v1.
     * 
     * @return viitenumber_loiv   * Partneri portaalis genereeritava avalduse puhul avalduse riigilõivu
     * viitenumber. Väli on vajalik selleks, et kui riigilõivu ennast ei
     * ole, siis oleks ette genereeritud viitenumber ikka teada
     */
    public java.lang.String getViitenumber_loiv() {
        return viitenumber_loiv;
    }


    /**
     * Sets the viitenumber_loiv value for this EVapiLooKanneParing_v1.
     * 
     * @param viitenumber_loiv   * Partneri portaalis genereeritava avalduse puhul avalduse riigilõivu
     * viitenumber. Väli on vajalik selleks, et kui riigilõivu ennast ei
     * ole, siis oleks ette genereeritud viitenumber ikka teada
     */
    public void setViitenumber_loiv(java.lang.String viitenumber_loiv) {
        this.viitenumber_loiv = viitenumber_loiv;
    }


    /**
     * Gets the kande_sisu value for this EVapiLooKanneParing_v1.
     * 
     * @return kande_sisu   * Siia alla tuleb kande sisu
     */
    public eu.x_road.arireg.producer.EVapiLooKanneKandeSisu_v1 getKande_sisu() {
        return kande_sisu;
    }


    /**
     * Sets the kande_sisu value for this EVapiLooKanneParing_v1.
     * 
     * @param kande_sisu   * Siia alla tuleb kande sisu
     */
    public void setKande_sisu(eu.x_road.arireg.producer.EVapiLooKanneKandeSisu_v1 kande_sisu) {
        this.kande_sisu = kande_sisu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneParing_v1)) return false;
        EVapiLooKanneParing_v1 other = (EVapiLooKanneParing_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partner_auth==null && other.getPartner_auth()==null) || 
             (this.partner_auth!=null &&
              this.partner_auth.equals(other.getPartner_auth()))) &&
            ((this.lisa_inglk_dokumendid==null && other.getLisa_inglk_dokumendid()==null) || 
             (this.lisa_inglk_dokumendid!=null &&
              this.lisa_inglk_dokumendid.equals(other.getLisa_inglk_dokumendid()))) &&
            ((this.kande_id==null && other.getKande_id()==null) || 
             (this.kande_id!=null &&
              this.kande_id.equals(other.getKande_id()))) &&
            ((this.on_paranduskanne==null && other.getOn_paranduskanne()==null) || 
             (this.on_paranduskanne!=null &&
              this.on_paranduskanne.equals(other.getOn_paranduskanne()))) &&
            ((this.eelmine_menetlus_id==null && other.getEelmine_menetlus_id()==null) || 
             (this.eelmine_menetlus_id!=null &&
              this.eelmine_menetlus_id.equals(other.getEelmine_menetlus_id()))) &&
            ((this.esitaja_nimi==null && other.getEsitaja_nimi()==null) || 
             (this.esitaja_nimi!=null &&
              this.esitaja_nimi.equals(other.getEsitaja_nimi()))) &&
            ((this.esitaja_kood==null && other.getEsitaja_kood()==null) || 
             (this.esitaja_kood!=null &&
              this.esitaja_kood.equals(other.getEsitaja_kood()))) &&
            ((this.viitenumber_loiv==null && other.getViitenumber_loiv()==null) || 
             (this.viitenumber_loiv!=null &&
              this.viitenumber_loiv.equals(other.getViitenumber_loiv()))) &&
            ((this.kande_sisu==null && other.getKande_sisu()==null) || 
             (this.kande_sisu!=null &&
              this.kande_sisu.equals(other.getKande_sisu())));
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
        if (getPartner_auth() != null) {
            _hashCode += getPartner_auth().hashCode();
        }
        if (getLisa_inglk_dokumendid() != null) {
            _hashCode += getLisa_inglk_dokumendid().hashCode();
        }
        if (getKande_id() != null) {
            _hashCode += getKande_id().hashCode();
        }
        if (getOn_paranduskanne() != null) {
            _hashCode += getOn_paranduskanne().hashCode();
        }
        if (getEelmine_menetlus_id() != null) {
            _hashCode += getEelmine_menetlus_id().hashCode();
        }
        if (getEsitaja_nimi() != null) {
            _hashCode += getEsitaja_nimi().hashCode();
        }
        if (getEsitaja_kood() != null) {
            _hashCode += getEsitaja_kood().hashCode();
        }
        if (getViitenumber_loiv() != null) {
            _hashCode += getViitenumber_loiv().hashCode();
        }
        if (getKande_sisu() != null) {
            _hashCode += getKande_sisu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
