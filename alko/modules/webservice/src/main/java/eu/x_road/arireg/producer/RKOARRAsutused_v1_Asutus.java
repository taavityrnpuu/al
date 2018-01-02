/**
 * RKOARRAsutused_v1_Asutus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class RKOARRAsutused_v1_Asutus  implements java.io.Serializable {
    private java.math.BigInteger kood;

    private java.lang.String nimi;

    private java.lang.String oig_vorm;

    private java.lang.String oig_vorm_alal;

    private java.lang.String olek;

    private java.lang.String aadress_riik;

    private java.lang.String aadres_ehak;

    private java.lang.String aadress_tekst;

    private java.lang.String aadress_postiindeks;

    private java.math.BigInteger aadress_adr_id;

    private java.lang.String aadress_ads_oid;

    private java.lang.String aadress_ads_normaliseeritud_taisaadress;

    private java.lang.String aadress_adob_id;

    private java.lang.String aadress_koodaadress;

    private java.lang.String aadress_ads_normaliseeritud_taisaadress_tapsustus;

    private java.lang.String aadress_tyyp;

    private java.lang.String evreg_kood;

    private eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS[] korgemalseisev_asutus;

    private eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend[] sidevahend;

    public RKOARRAsutused_v1_Asutus() {
    }

    public RKOARRAsutused_v1_Asutus(
           java.math.BigInteger kood,
           java.lang.String nimi,
           java.lang.String oig_vorm,
           java.lang.String oig_vorm_alal,
           java.lang.String olek,
           java.lang.String aadress_riik,
           java.lang.String aadres_ehak,
           java.lang.String aadress_tekst,
           java.lang.String aadress_postiindeks,
           java.math.BigInteger aadress_adr_id,
           java.lang.String aadress_ads_oid,
           java.lang.String aadress_ads_normaliseeritud_taisaadress,
           java.lang.String aadress_adob_id,
           java.lang.String aadress_koodaadress,
           java.lang.String aadress_ads_normaliseeritud_taisaadress_tapsustus,
           java.lang.String aadress_tyyp,
           java.lang.String evreg_kood,
           eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS[] korgemalseisev_asutus,
           eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend[] sidevahend) {
           this.kood = kood;
           this.nimi = nimi;
           this.oig_vorm = oig_vorm;
           this.oig_vorm_alal = oig_vorm_alal;
           this.olek = olek;
           this.aadress_riik = aadress_riik;
           this.aadres_ehak = aadres_ehak;
           this.aadress_tekst = aadress_tekst;
           this.aadress_postiindeks = aadress_postiindeks;
           this.aadress_adr_id = aadress_adr_id;
           this.aadress_ads_oid = aadress_ads_oid;
           this.aadress_ads_normaliseeritud_taisaadress = aadress_ads_normaliseeritud_taisaadress;
           this.aadress_adob_id = aadress_adob_id;
           this.aadress_koodaadress = aadress_koodaadress;
           this.aadress_ads_normaliseeritud_taisaadress_tapsustus = aadress_ads_normaliseeritud_taisaadress_tapsustus;
           this.aadress_tyyp = aadress_tyyp;
           this.evreg_kood = evreg_kood;
           this.korgemalseisev_asutus = korgemalseisev_asutus;
           this.sidevahend = sidevahend;
    }


    /**
     * Gets the kood value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return kood
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param kood
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimi value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the oig_vorm value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return oig_vorm
     */
    public java.lang.String getOig_vorm() {
        return oig_vorm;
    }


    /**
     * Sets the oig_vorm value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param oig_vorm
     */
    public void setOig_vorm(java.lang.String oig_vorm) {
        this.oig_vorm = oig_vorm;
    }


    /**
     * Gets the oig_vorm_alal value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return oig_vorm_alal
     */
    public java.lang.String getOig_vorm_alal() {
        return oig_vorm_alal;
    }


    /**
     * Sets the oig_vorm_alal value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param oig_vorm_alal
     */
    public void setOig_vorm_alal(java.lang.String oig_vorm_alal) {
        this.oig_vorm_alal = oig_vorm_alal;
    }


    /**
     * Gets the olek value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return olek
     */
    public java.lang.String getOlek() {
        return olek;
    }


    /**
     * Sets the olek value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param olek
     */
    public void setOlek(java.lang.String olek) {
        this.olek = olek;
    }


    /**
     * Gets the aadress_riik value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_riik
     */
    public java.lang.String getAadress_riik() {
        return aadress_riik;
    }


    /**
     * Sets the aadress_riik value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_riik
     */
    public void setAadress_riik(java.lang.String aadress_riik) {
        this.aadress_riik = aadress_riik;
    }


    /**
     * Gets the aadres_ehak value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadres_ehak
     */
    public java.lang.String getAadres_ehak() {
        return aadres_ehak;
    }


    /**
     * Sets the aadres_ehak value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadres_ehak
     */
    public void setAadres_ehak(java.lang.String aadres_ehak) {
        this.aadres_ehak = aadres_ehak;
    }


    /**
     * Gets the aadress_tekst value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_tekst
     */
    public java.lang.String getAadress_tekst() {
        return aadress_tekst;
    }


    /**
     * Sets the aadress_tekst value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_tekst
     */
    public void setAadress_tekst(java.lang.String aadress_tekst) {
        this.aadress_tekst = aadress_tekst;
    }


    /**
     * Gets the aadress_postiindeks value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_postiindeks
     */
    public java.lang.String getAadress_postiindeks() {
        return aadress_postiindeks;
    }


    /**
     * Sets the aadress_postiindeks value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_postiindeks
     */
    public void setAadress_postiindeks(java.lang.String aadress_postiindeks) {
        this.aadress_postiindeks = aadress_postiindeks;
    }


    /**
     * Gets the aadress_adr_id value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_adr_id
     */
    public java.math.BigInteger getAadress_adr_id() {
        return aadress_adr_id;
    }


    /**
     * Sets the aadress_adr_id value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_adr_id
     */
    public void setAadress_adr_id(java.math.BigInteger aadress_adr_id) {
        this.aadress_adr_id = aadress_adr_id;
    }


    /**
     * Gets the aadress_ads_oid value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_ads_oid
     */
    public java.lang.String getAadress_ads_oid() {
        return aadress_ads_oid;
    }


    /**
     * Sets the aadress_ads_oid value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_ads_oid
     */
    public void setAadress_ads_oid(java.lang.String aadress_ads_oid) {
        this.aadress_ads_oid = aadress_ads_oid;
    }


    /**
     * Gets the aadress_ads_normaliseeritud_taisaadress value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_ads_normaliseeritud_taisaadress
     */
    public java.lang.String getAadress_ads_normaliseeritud_taisaadress() {
        return aadress_ads_normaliseeritud_taisaadress;
    }


    /**
     * Sets the aadress_ads_normaliseeritud_taisaadress value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_ads_normaliseeritud_taisaadress
     */
    public void setAadress_ads_normaliseeritud_taisaadress(java.lang.String aadress_ads_normaliseeritud_taisaadress) {
        this.aadress_ads_normaliseeritud_taisaadress = aadress_ads_normaliseeritud_taisaadress;
    }


    /**
     * Gets the aadress_adob_id value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_adob_id
     */
    public java.lang.String getAadress_adob_id() {
        return aadress_adob_id;
    }


    /**
     * Sets the aadress_adob_id value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_adob_id
     */
    public void setAadress_adob_id(java.lang.String aadress_adob_id) {
        this.aadress_adob_id = aadress_adob_id;
    }


    /**
     * Gets the aadress_koodaadress value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_koodaadress
     */
    public java.lang.String getAadress_koodaadress() {
        return aadress_koodaadress;
    }


    /**
     * Sets the aadress_koodaadress value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_koodaadress
     */
    public void setAadress_koodaadress(java.lang.String aadress_koodaadress) {
        this.aadress_koodaadress = aadress_koodaadress;
    }


    /**
     * Gets the aadress_ads_normaliseeritud_taisaadress_tapsustus value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_ads_normaliseeritud_taisaadress_tapsustus
     */
    public java.lang.String getAadress_ads_normaliseeritud_taisaadress_tapsustus() {
        return aadress_ads_normaliseeritud_taisaadress_tapsustus;
    }


    /**
     * Sets the aadress_ads_normaliseeritud_taisaadress_tapsustus value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_ads_normaliseeritud_taisaadress_tapsustus
     */
    public void setAadress_ads_normaliseeritud_taisaadress_tapsustus(java.lang.String aadress_ads_normaliseeritud_taisaadress_tapsustus) {
        this.aadress_ads_normaliseeritud_taisaadress_tapsustus = aadress_ads_normaliseeritud_taisaadress_tapsustus;
    }


    /**
     * Gets the aadress_tyyp value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return aadress_tyyp
     */
    public java.lang.String getAadress_tyyp() {
        return aadress_tyyp;
    }


    /**
     * Sets the aadress_tyyp value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param aadress_tyyp
     */
    public void setAadress_tyyp(java.lang.String aadress_tyyp) {
        this.aadress_tyyp = aadress_tyyp;
    }


    /**
     * Gets the evreg_kood value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return evreg_kood
     */
    public java.lang.String getEvreg_kood() {
        return evreg_kood;
    }


    /**
     * Sets the evreg_kood value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param evreg_kood
     */
    public void setEvreg_kood(java.lang.String evreg_kood) {
        this.evreg_kood = evreg_kood;
    }


    /**
     * Gets the korgemalseisev_asutus value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return korgemalseisev_asutus
     */
    public eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS[] getKorgemalseisev_asutus() {
        return korgemalseisev_asutus;
    }


    /**
     * Sets the korgemalseisev_asutus value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param korgemalseisev_asutus
     */
    public void setKorgemalseisev_asutus(eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS[] korgemalseisev_asutus) {
        this.korgemalseisev_asutus = korgemalseisev_asutus;
    }

    public eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS getKorgemalseisev_asutus(int i) {
        return this.korgemalseisev_asutus[i];
    }

    public void setKorgemalseisev_asutus(int i, eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS _value) {
        this.korgemalseisev_asutus[i] = _value;
    }


    /**
     * Gets the sidevahend value for this RKOARRAsutused_v1_Asutus.
     * 
     * @return sidevahend
     */
    public eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend[] getSidevahend() {
        return sidevahend;
    }


    /**
     * Sets the sidevahend value for this RKOARRAsutused_v1_Asutus.
     * 
     * @param sidevahend
     */
    public void setSidevahend(eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend[] sidevahend) {
        this.sidevahend = sidevahend;
    }

    public eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend getSidevahend(int i) {
        return this.sidevahend[i];
    }

    public void setSidevahend(int i, eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend _value) {
        this.sidevahend[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RKOARRAsutused_v1_Asutus)) return false;
        RKOARRAsutused_v1_Asutus other = (RKOARRAsutused_v1_Asutus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.oig_vorm==null && other.getOig_vorm()==null) || 
             (this.oig_vorm!=null &&
              this.oig_vorm.equals(other.getOig_vorm()))) &&
            ((this.oig_vorm_alal==null && other.getOig_vorm_alal()==null) || 
             (this.oig_vorm_alal!=null &&
              this.oig_vorm_alal.equals(other.getOig_vorm_alal()))) &&
            ((this.olek==null && other.getOlek()==null) || 
             (this.olek!=null &&
              this.olek.equals(other.getOlek()))) &&
            ((this.aadress_riik==null && other.getAadress_riik()==null) || 
             (this.aadress_riik!=null &&
              this.aadress_riik.equals(other.getAadress_riik()))) &&
            ((this.aadres_ehak==null && other.getAadres_ehak()==null) || 
             (this.aadres_ehak!=null &&
              this.aadres_ehak.equals(other.getAadres_ehak()))) &&
            ((this.aadress_tekst==null && other.getAadress_tekst()==null) || 
             (this.aadress_tekst!=null &&
              this.aadress_tekst.equals(other.getAadress_tekst()))) &&
            ((this.aadress_postiindeks==null && other.getAadress_postiindeks()==null) || 
             (this.aadress_postiindeks!=null &&
              this.aadress_postiindeks.equals(other.getAadress_postiindeks()))) &&
            ((this.aadress_adr_id==null && other.getAadress_adr_id()==null) || 
             (this.aadress_adr_id!=null &&
              this.aadress_adr_id.equals(other.getAadress_adr_id()))) &&
            ((this.aadress_ads_oid==null && other.getAadress_ads_oid()==null) || 
             (this.aadress_ads_oid!=null &&
              this.aadress_ads_oid.equals(other.getAadress_ads_oid()))) &&
            ((this.aadress_ads_normaliseeritud_taisaadress==null && other.getAadress_ads_normaliseeritud_taisaadress()==null) || 
             (this.aadress_ads_normaliseeritud_taisaadress!=null &&
              this.aadress_ads_normaliseeritud_taisaadress.equals(other.getAadress_ads_normaliseeritud_taisaadress()))) &&
            ((this.aadress_adob_id==null && other.getAadress_adob_id()==null) || 
             (this.aadress_adob_id!=null &&
              this.aadress_adob_id.equals(other.getAadress_adob_id()))) &&
            ((this.aadress_koodaadress==null && other.getAadress_koodaadress()==null) || 
             (this.aadress_koodaadress!=null &&
              this.aadress_koodaadress.equals(other.getAadress_koodaadress()))) &&
            ((this.aadress_ads_normaliseeritud_taisaadress_tapsustus==null && other.getAadress_ads_normaliseeritud_taisaadress_tapsustus()==null) || 
             (this.aadress_ads_normaliseeritud_taisaadress_tapsustus!=null &&
              this.aadress_ads_normaliseeritud_taisaadress_tapsustus.equals(other.getAadress_ads_normaliseeritud_taisaadress_tapsustus()))) &&
            ((this.aadress_tyyp==null && other.getAadress_tyyp()==null) || 
             (this.aadress_tyyp!=null &&
              this.aadress_tyyp.equals(other.getAadress_tyyp()))) &&
            ((this.evreg_kood==null && other.getEvreg_kood()==null) || 
             (this.evreg_kood!=null &&
              this.evreg_kood.equals(other.getEvreg_kood()))) &&
            ((this.korgemalseisev_asutus==null && other.getKorgemalseisev_asutus()==null) || 
             (this.korgemalseisev_asutus!=null &&
              java.util.Arrays.equals(this.korgemalseisev_asutus, other.getKorgemalseisev_asutus()))) &&
            ((this.sidevahend==null && other.getSidevahend()==null) || 
             (this.sidevahend!=null &&
              java.util.Arrays.equals(this.sidevahend, other.getSidevahend())));
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
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getOig_vorm() != null) {
            _hashCode += getOig_vorm().hashCode();
        }
        if (getOig_vorm_alal() != null) {
            _hashCode += getOig_vorm_alal().hashCode();
        }
        if (getOlek() != null) {
            _hashCode += getOlek().hashCode();
        }
        if (getAadress_riik() != null) {
            _hashCode += getAadress_riik().hashCode();
        }
        if (getAadres_ehak() != null) {
            _hashCode += getAadres_ehak().hashCode();
        }
        if (getAadress_tekst() != null) {
            _hashCode += getAadress_tekst().hashCode();
        }
        if (getAadress_postiindeks() != null) {
            _hashCode += getAadress_postiindeks().hashCode();
        }
        if (getAadress_adr_id() != null) {
            _hashCode += getAadress_adr_id().hashCode();
        }
        if (getAadress_ads_oid() != null) {
            _hashCode += getAadress_ads_oid().hashCode();
        }
        if (getAadress_ads_normaliseeritud_taisaadress() != null) {
            _hashCode += getAadress_ads_normaliseeritud_taisaadress().hashCode();
        }
        if (getAadress_adob_id() != null) {
            _hashCode += getAadress_adob_id().hashCode();
        }
        if (getAadress_koodaadress() != null) {
            _hashCode += getAadress_koodaadress().hashCode();
        }
        if (getAadress_ads_normaliseeritud_taisaadress_tapsustus() != null) {
            _hashCode += getAadress_ads_normaliseeritud_taisaadress_tapsustus().hashCode();
        }
        if (getAadress_tyyp() != null) {
            _hashCode += getAadress_tyyp().hashCode();
        }
        if (getEvreg_kood() != null) {
            _hashCode += getEvreg_kood().hashCode();
        }
        if (getKorgemalseisev_asutus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKorgemalseisev_asutus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKorgemalseisev_asutus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSidevahend() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSidevahend());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSidevahend(), i);
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
