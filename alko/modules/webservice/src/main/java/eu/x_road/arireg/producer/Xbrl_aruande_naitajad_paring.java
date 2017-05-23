/**
 * Xbrl_aruande_naitajad_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrl_aruande_naitajad_paring  implements java.io.Serializable {
    private java.math.BigInteger xbrl_aruande_id;

    private java.math.BigInteger paev_nr;

    private java.util.Date maj_algus;

    private java.util.Date maj_lopp;

    private java.lang.String ehak;

    private java.lang.String aadress;

    private java.lang.String postiind;

    private java.lang.String pteg_emtak;

    private java.lang.String pteg_emtak_versioon;

    private java.util.Date esitatud;

    private java.math.BigInteger ark;

    private java.math.BigInteger tootajate_arv;

    private java.math.BigInteger kaive;

    private java.math.BigInteger kasum;

    private java.math.BigInteger bilansimaht;

    private java.math.BigInteger konsol_tootajate_arv;

    private java.math.BigInteger konsol_kaive;

    private java.math.BigInteger konsol_kasum;

    private java.math.BigInteger konsol_bilansimaht;

    private java.lang.String valuuta;

    private java.lang.String esitamise_viis;

    private java.lang.Boolean auditeerimiskohustus;

    private java.lang.Boolean auditeeritus;

    private eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] bilansi_sisud;

    private java.lang.Boolean ainult_audiitorid_ja_emtak;

    private java.lang.Boolean kohustuslik_audit;

    private eu.x_road.arireg.producer.Xbrl_aruande_audiitor[] audiitorid;

    private java.math.BigInteger activity_occured;

    private eu.x_road.arireg.producer.Xbrl_aruande_myygitulu[] myygitulu;

    public Xbrl_aruande_naitajad_paring() {
    }

    public Xbrl_aruande_naitajad_paring(
           java.math.BigInteger xbrl_aruande_id,
           java.math.BigInteger paev_nr,
           java.util.Date maj_algus,
           java.util.Date maj_lopp,
           java.lang.String ehak,
           java.lang.String aadress,
           java.lang.String postiind,
           java.lang.String pteg_emtak,
           java.lang.String pteg_emtak_versioon,
           java.util.Date esitatud,
           java.math.BigInteger ark,
           java.math.BigInteger tootajate_arv,
           java.math.BigInteger kaive,
           java.math.BigInteger kasum,
           java.math.BigInteger bilansimaht,
           java.math.BigInteger konsol_tootajate_arv,
           java.math.BigInteger konsol_kaive,
           java.math.BigInteger konsol_kasum,
           java.math.BigInteger konsol_bilansimaht,
           java.lang.String valuuta,
           java.lang.String esitamise_viis,
           java.lang.Boolean auditeerimiskohustus,
           java.lang.Boolean auditeeritus,
           eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] bilansi_sisud,
           java.lang.Boolean ainult_audiitorid_ja_emtak,
           java.lang.Boolean kohustuslik_audit,
           eu.x_road.arireg.producer.Xbrl_aruande_audiitor[] audiitorid,
           java.math.BigInteger activity_occured,
           eu.x_road.arireg.producer.Xbrl_aruande_myygitulu[] myygitulu) {
           this.xbrl_aruande_id = xbrl_aruande_id;
           this.paev_nr = paev_nr;
           this.maj_algus = maj_algus;
           this.maj_lopp = maj_lopp;
           this.ehak = ehak;
           this.aadress = aadress;
           this.postiind = postiind;
           this.pteg_emtak = pteg_emtak;
           this.pteg_emtak_versioon = pteg_emtak_versioon;
           this.esitatud = esitatud;
           this.ark = ark;
           this.tootajate_arv = tootajate_arv;
           this.kaive = kaive;
           this.kasum = kasum;
           this.bilansimaht = bilansimaht;
           this.konsol_tootajate_arv = konsol_tootajate_arv;
           this.konsol_kaive = konsol_kaive;
           this.konsol_kasum = konsol_kasum;
           this.konsol_bilansimaht = konsol_bilansimaht;
           this.valuuta = valuuta;
           this.esitamise_viis = esitamise_viis;
           this.auditeerimiskohustus = auditeerimiskohustus;
           this.auditeeritus = auditeeritus;
           this.bilansi_sisud = bilansi_sisud;
           this.ainult_audiitorid_ja_emtak = ainult_audiitorid_ja_emtak;
           this.kohustuslik_audit = kohustuslik_audit;
           this.audiitorid = audiitorid;
           this.activity_occured = activity_occured;
           this.myygitulu = myygitulu;
    }


    /**
     * Gets the xbrl_aruande_id value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return xbrl_aruande_id
     */
    public java.math.BigInteger getXbrl_aruande_id() {
        return xbrl_aruande_id;
    }


    /**
     * Sets the xbrl_aruande_id value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param xbrl_aruande_id
     */
    public void setXbrl_aruande_id(java.math.BigInteger xbrl_aruande_id) {
        this.xbrl_aruande_id = xbrl_aruande_id;
    }


    /**
     * Gets the paev_nr value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return paev_nr
     */
    public java.math.BigInteger getPaev_nr() {
        return paev_nr;
    }


    /**
     * Sets the paev_nr value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param paev_nr
     */
    public void setPaev_nr(java.math.BigInteger paev_nr) {
        this.paev_nr = paev_nr;
    }


    /**
     * Gets the maj_algus value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return maj_algus
     */
    public java.util.Date getMaj_algus() {
        return maj_algus;
    }


    /**
     * Sets the maj_algus value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param maj_algus
     */
    public void setMaj_algus(java.util.Date maj_algus) {
        this.maj_algus = maj_algus;
    }


    /**
     * Gets the maj_lopp value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return maj_lopp
     */
    public java.util.Date getMaj_lopp() {
        return maj_lopp;
    }


    /**
     * Sets the maj_lopp value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param maj_lopp
     */
    public void setMaj_lopp(java.util.Date maj_lopp) {
        this.maj_lopp = maj_lopp;
    }


    /**
     * Gets the ehak value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return ehak
     */
    public java.lang.String getEhak() {
        return ehak;
    }


    /**
     * Sets the ehak value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param ehak
     */
    public void setEhak(java.lang.String ehak) {
        this.ehak = ehak;
    }


    /**
     * Gets the aadress value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return aadress
     */
    public java.lang.String getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param aadress
     */
    public void setAadress(java.lang.String aadress) {
        this.aadress = aadress;
    }


    /**
     * Gets the postiind value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return postiind
     */
    public java.lang.String getPostiind() {
        return postiind;
    }


    /**
     * Sets the postiind value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param postiind
     */
    public void setPostiind(java.lang.String postiind) {
        this.postiind = postiind;
    }


    /**
     * Gets the pteg_emtak value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return pteg_emtak
     */
    public java.lang.String getPteg_emtak() {
        return pteg_emtak;
    }


    /**
     * Sets the pteg_emtak value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param pteg_emtak
     */
    public void setPteg_emtak(java.lang.String pteg_emtak) {
        this.pteg_emtak = pteg_emtak;
    }


    /**
     * Gets the pteg_emtak_versioon value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return pteg_emtak_versioon
     */
    public java.lang.String getPteg_emtak_versioon() {
        return pteg_emtak_versioon;
    }


    /**
     * Sets the pteg_emtak_versioon value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param pteg_emtak_versioon
     */
    public void setPteg_emtak_versioon(java.lang.String pteg_emtak_versioon) {
        this.pteg_emtak_versioon = pteg_emtak_versioon;
    }


    /**
     * Gets the esitatud value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return esitatud
     */
    public java.util.Date getEsitatud() {
        return esitatud;
    }


    /**
     * Sets the esitatud value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param esitatud
     */
    public void setEsitatud(java.util.Date esitatud) {
        this.esitatud = esitatud;
    }


    /**
     * Gets the ark value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return ark
     */
    public java.math.BigInteger getArk() {
        return ark;
    }


    /**
     * Sets the ark value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param ark
     */
    public void setArk(java.math.BigInteger ark) {
        this.ark = ark;
    }


    /**
     * Gets the tootajate_arv value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return tootajate_arv
     */
    public java.math.BigInteger getTootajate_arv() {
        return tootajate_arv;
    }


    /**
     * Sets the tootajate_arv value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param tootajate_arv
     */
    public void setTootajate_arv(java.math.BigInteger tootajate_arv) {
        this.tootajate_arv = tootajate_arv;
    }


    /**
     * Gets the kaive value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return kaive
     */
    public java.math.BigInteger getKaive() {
        return kaive;
    }


    /**
     * Sets the kaive value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param kaive
     */
    public void setKaive(java.math.BigInteger kaive) {
        this.kaive = kaive;
    }


    /**
     * Gets the kasum value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return kasum
     */
    public java.math.BigInteger getKasum() {
        return kasum;
    }


    /**
     * Sets the kasum value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param kasum
     */
    public void setKasum(java.math.BigInteger kasum) {
        this.kasum = kasum;
    }


    /**
     * Gets the bilansimaht value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return bilansimaht
     */
    public java.math.BigInteger getBilansimaht() {
        return bilansimaht;
    }


    /**
     * Sets the bilansimaht value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param bilansimaht
     */
    public void setBilansimaht(java.math.BigInteger bilansimaht) {
        this.bilansimaht = bilansimaht;
    }


    /**
     * Gets the konsol_tootajate_arv value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return konsol_tootajate_arv
     */
    public java.math.BigInteger getKonsol_tootajate_arv() {
        return konsol_tootajate_arv;
    }


    /**
     * Sets the konsol_tootajate_arv value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param konsol_tootajate_arv
     */
    public void setKonsol_tootajate_arv(java.math.BigInteger konsol_tootajate_arv) {
        this.konsol_tootajate_arv = konsol_tootajate_arv;
    }


    /**
     * Gets the konsol_kaive value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return konsol_kaive
     */
    public java.math.BigInteger getKonsol_kaive() {
        return konsol_kaive;
    }


    /**
     * Sets the konsol_kaive value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param konsol_kaive
     */
    public void setKonsol_kaive(java.math.BigInteger konsol_kaive) {
        this.konsol_kaive = konsol_kaive;
    }


    /**
     * Gets the konsol_kasum value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return konsol_kasum
     */
    public java.math.BigInteger getKonsol_kasum() {
        return konsol_kasum;
    }


    /**
     * Sets the konsol_kasum value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param konsol_kasum
     */
    public void setKonsol_kasum(java.math.BigInteger konsol_kasum) {
        this.konsol_kasum = konsol_kasum;
    }


    /**
     * Gets the konsol_bilansimaht value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return konsol_bilansimaht
     */
    public java.math.BigInteger getKonsol_bilansimaht() {
        return konsol_bilansimaht;
    }


    /**
     * Sets the konsol_bilansimaht value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param konsol_bilansimaht
     */
    public void setKonsol_bilansimaht(java.math.BigInteger konsol_bilansimaht) {
        this.konsol_bilansimaht = konsol_bilansimaht;
    }


    /**
     * Gets the valuuta value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return valuuta
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }


    /**
     * Sets the valuuta value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param valuuta
     */
    public void setValuuta(java.lang.String valuuta) {
        this.valuuta = valuuta;
    }


    /**
     * Gets the esitamise_viis value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return esitamise_viis
     */
    public java.lang.String getEsitamise_viis() {
        return esitamise_viis;
    }


    /**
     * Sets the esitamise_viis value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param esitamise_viis
     */
    public void setEsitamise_viis(java.lang.String esitamise_viis) {
        this.esitamise_viis = esitamise_viis;
    }


    /**
     * Gets the auditeerimiskohustus value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return auditeerimiskohustus
     */
    public java.lang.Boolean getAuditeerimiskohustus() {
        return auditeerimiskohustus;
    }


    /**
     * Sets the auditeerimiskohustus value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param auditeerimiskohustus
     */
    public void setAuditeerimiskohustus(java.lang.Boolean auditeerimiskohustus) {
        this.auditeerimiskohustus = auditeerimiskohustus;
    }


    /**
     * Gets the auditeeritus value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return auditeeritus
     */
    public java.lang.Boolean getAuditeeritus() {
        return auditeeritus;
    }


    /**
     * Sets the auditeeritus value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param auditeeritus
     */
    public void setAuditeeritus(java.lang.Boolean auditeeritus) {
        this.auditeeritus = auditeeritus;
    }


    /**
     * Gets the bilansi_sisud value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return bilansi_sisud
     */
    public eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] getBilansi_sisud() {
        return bilansi_sisud;
    }


    /**
     * Sets the bilansi_sisud value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param bilansi_sisud
     */
    public void setBilansi_sisud(eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] bilansi_sisud) {
        this.bilansi_sisud = bilansi_sisud;
    }


    /**
     * Gets the ainult_audiitorid_ja_emtak value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return ainult_audiitorid_ja_emtak
     */
    public java.lang.Boolean getAinult_audiitorid_ja_emtak() {
        return ainult_audiitorid_ja_emtak;
    }


    /**
     * Sets the ainult_audiitorid_ja_emtak value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param ainult_audiitorid_ja_emtak
     */
    public void setAinult_audiitorid_ja_emtak(java.lang.Boolean ainult_audiitorid_ja_emtak) {
        this.ainult_audiitorid_ja_emtak = ainult_audiitorid_ja_emtak;
    }


    /**
     * Gets the kohustuslik_audit value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return kohustuslik_audit
     */
    public java.lang.Boolean getKohustuslik_audit() {
        return kohustuslik_audit;
    }


    /**
     * Sets the kohustuslik_audit value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param kohustuslik_audit
     */
    public void setKohustuslik_audit(java.lang.Boolean kohustuslik_audit) {
        this.kohustuslik_audit = kohustuslik_audit;
    }


    /**
     * Gets the audiitorid value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return audiitorid
     */
    public eu.x_road.arireg.producer.Xbrl_aruande_audiitor[] getAudiitorid() {
        return audiitorid;
    }


    /**
     * Sets the audiitorid value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param audiitorid
     */
    public void setAudiitorid(eu.x_road.arireg.producer.Xbrl_aruande_audiitor[] audiitorid) {
        this.audiitorid = audiitorid;
    }


    /**
     * Gets the activity_occured value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return activity_occured
     */
    public java.math.BigInteger getActivity_occured() {
        return activity_occured;
    }


    /**
     * Sets the activity_occured value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param activity_occured
     */
    public void setActivity_occured(java.math.BigInteger activity_occured) {
        this.activity_occured = activity_occured;
    }


    /**
     * Gets the myygitulu value for this Xbrl_aruande_naitajad_paring.
     * 
     * @return myygitulu
     */
    public eu.x_road.arireg.producer.Xbrl_aruande_myygitulu[] getMyygitulu() {
        return myygitulu;
    }


    /**
     * Sets the myygitulu value for this Xbrl_aruande_naitajad_paring.
     * 
     * @param myygitulu
     */
    public void setMyygitulu(eu.x_road.arireg.producer.Xbrl_aruande_myygitulu[] myygitulu) {
        this.myygitulu = myygitulu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrl_aruande_naitajad_paring)) return false;
        Xbrl_aruande_naitajad_paring other = (Xbrl_aruande_naitajad_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xbrl_aruande_id==null && other.getXbrl_aruande_id()==null) || 
             (this.xbrl_aruande_id!=null &&
              this.xbrl_aruande_id.equals(other.getXbrl_aruande_id()))) &&
            ((this.paev_nr==null && other.getPaev_nr()==null) || 
             (this.paev_nr!=null &&
              this.paev_nr.equals(other.getPaev_nr()))) &&
            ((this.maj_algus==null && other.getMaj_algus()==null) || 
             (this.maj_algus!=null &&
              this.maj_algus.equals(other.getMaj_algus()))) &&
            ((this.maj_lopp==null && other.getMaj_lopp()==null) || 
             (this.maj_lopp!=null &&
              this.maj_lopp.equals(other.getMaj_lopp()))) &&
            ((this.ehak==null && other.getEhak()==null) || 
             (this.ehak!=null &&
              this.ehak.equals(other.getEhak()))) &&
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress()))) &&
            ((this.postiind==null && other.getPostiind()==null) || 
             (this.postiind!=null &&
              this.postiind.equals(other.getPostiind()))) &&
            ((this.pteg_emtak==null && other.getPteg_emtak()==null) || 
             (this.pteg_emtak!=null &&
              this.pteg_emtak.equals(other.getPteg_emtak()))) &&
            ((this.pteg_emtak_versioon==null && other.getPteg_emtak_versioon()==null) || 
             (this.pteg_emtak_versioon!=null &&
              this.pteg_emtak_versioon.equals(other.getPteg_emtak_versioon()))) &&
            ((this.esitatud==null && other.getEsitatud()==null) || 
             (this.esitatud!=null &&
              this.esitatud.equals(other.getEsitatud()))) &&
            ((this.ark==null && other.getArk()==null) || 
             (this.ark!=null &&
              this.ark.equals(other.getArk()))) &&
            ((this.tootajate_arv==null && other.getTootajate_arv()==null) || 
             (this.tootajate_arv!=null &&
              this.tootajate_arv.equals(other.getTootajate_arv()))) &&
            ((this.kaive==null && other.getKaive()==null) || 
             (this.kaive!=null &&
              this.kaive.equals(other.getKaive()))) &&
            ((this.kasum==null && other.getKasum()==null) || 
             (this.kasum!=null &&
              this.kasum.equals(other.getKasum()))) &&
            ((this.bilansimaht==null && other.getBilansimaht()==null) || 
             (this.bilansimaht!=null &&
              this.bilansimaht.equals(other.getBilansimaht()))) &&
            ((this.konsol_tootajate_arv==null && other.getKonsol_tootajate_arv()==null) || 
             (this.konsol_tootajate_arv!=null &&
              this.konsol_tootajate_arv.equals(other.getKonsol_tootajate_arv()))) &&
            ((this.konsol_kaive==null && other.getKonsol_kaive()==null) || 
             (this.konsol_kaive!=null &&
              this.konsol_kaive.equals(other.getKonsol_kaive()))) &&
            ((this.konsol_kasum==null && other.getKonsol_kasum()==null) || 
             (this.konsol_kasum!=null &&
              this.konsol_kasum.equals(other.getKonsol_kasum()))) &&
            ((this.konsol_bilansimaht==null && other.getKonsol_bilansimaht()==null) || 
             (this.konsol_bilansimaht!=null &&
              this.konsol_bilansimaht.equals(other.getKonsol_bilansimaht()))) &&
            ((this.valuuta==null && other.getValuuta()==null) || 
             (this.valuuta!=null &&
              this.valuuta.equals(other.getValuuta()))) &&
            ((this.esitamise_viis==null && other.getEsitamise_viis()==null) || 
             (this.esitamise_viis!=null &&
              this.esitamise_viis.equals(other.getEsitamise_viis()))) &&
            ((this.auditeerimiskohustus==null && other.getAuditeerimiskohustus()==null) || 
             (this.auditeerimiskohustus!=null &&
              this.auditeerimiskohustus.equals(other.getAuditeerimiskohustus()))) &&
            ((this.auditeeritus==null && other.getAuditeeritus()==null) || 
             (this.auditeeritus!=null &&
              this.auditeeritus.equals(other.getAuditeeritus()))) &&
            ((this.bilansi_sisud==null && other.getBilansi_sisud()==null) || 
             (this.bilansi_sisud!=null &&
              java.util.Arrays.equals(this.bilansi_sisud, other.getBilansi_sisud()))) &&
            ((this.ainult_audiitorid_ja_emtak==null && other.getAinult_audiitorid_ja_emtak()==null) || 
             (this.ainult_audiitorid_ja_emtak!=null &&
              this.ainult_audiitorid_ja_emtak.equals(other.getAinult_audiitorid_ja_emtak()))) &&
            ((this.kohustuslik_audit==null && other.getKohustuslik_audit()==null) || 
             (this.kohustuslik_audit!=null &&
              this.kohustuslik_audit.equals(other.getKohustuslik_audit()))) &&
            ((this.audiitorid==null && other.getAudiitorid()==null) || 
             (this.audiitorid!=null &&
              java.util.Arrays.equals(this.audiitorid, other.getAudiitorid()))) &&
            ((this.activity_occured==null && other.getActivity_occured()==null) || 
             (this.activity_occured!=null &&
              this.activity_occured.equals(other.getActivity_occured()))) &&
            ((this.myygitulu==null && other.getMyygitulu()==null) || 
             (this.myygitulu!=null &&
              java.util.Arrays.equals(this.myygitulu, other.getMyygitulu())));
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
        if (getXbrl_aruande_id() != null) {
            _hashCode += getXbrl_aruande_id().hashCode();
        }
        if (getPaev_nr() != null) {
            _hashCode += getPaev_nr().hashCode();
        }
        if (getMaj_algus() != null) {
            _hashCode += getMaj_algus().hashCode();
        }
        if (getMaj_lopp() != null) {
            _hashCode += getMaj_lopp().hashCode();
        }
        if (getEhak() != null) {
            _hashCode += getEhak().hashCode();
        }
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        if (getPostiind() != null) {
            _hashCode += getPostiind().hashCode();
        }
        if (getPteg_emtak() != null) {
            _hashCode += getPteg_emtak().hashCode();
        }
        if (getPteg_emtak_versioon() != null) {
            _hashCode += getPteg_emtak_versioon().hashCode();
        }
        if (getEsitatud() != null) {
            _hashCode += getEsitatud().hashCode();
        }
        if (getArk() != null) {
            _hashCode += getArk().hashCode();
        }
        if (getTootajate_arv() != null) {
            _hashCode += getTootajate_arv().hashCode();
        }
        if (getKaive() != null) {
            _hashCode += getKaive().hashCode();
        }
        if (getKasum() != null) {
            _hashCode += getKasum().hashCode();
        }
        if (getBilansimaht() != null) {
            _hashCode += getBilansimaht().hashCode();
        }
        if (getKonsol_tootajate_arv() != null) {
            _hashCode += getKonsol_tootajate_arv().hashCode();
        }
        if (getKonsol_kaive() != null) {
            _hashCode += getKonsol_kaive().hashCode();
        }
        if (getKonsol_kasum() != null) {
            _hashCode += getKonsol_kasum().hashCode();
        }
        if (getKonsol_bilansimaht() != null) {
            _hashCode += getKonsol_bilansimaht().hashCode();
        }
        if (getValuuta() != null) {
            _hashCode += getValuuta().hashCode();
        }
        if (getEsitamise_viis() != null) {
            _hashCode += getEsitamise_viis().hashCode();
        }
        if (getAuditeerimiskohustus() != null) {
            _hashCode += getAuditeerimiskohustus().hashCode();
        }
        if (getAuditeeritus() != null) {
            _hashCode += getAuditeeritus().hashCode();
        }
        if (getBilansi_sisud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBilansi_sisud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBilansi_sisud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAinult_audiitorid_ja_emtak() != null) {
            _hashCode += getAinult_audiitorid_ja_emtak().hashCode();
        }
        if (getKohustuslik_audit() != null) {
            _hashCode += getKohustuslik_audit().hashCode();
        }
        if (getAudiitorid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudiitorid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudiitorid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActivity_occured() != null) {
            _hashCode += getActivity_occured().hashCode();
        }
        if (getMyygitulu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMyygitulu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMyygitulu(), i);
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
