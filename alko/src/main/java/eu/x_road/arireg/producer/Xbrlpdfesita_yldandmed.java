/**
 * Xbrlpdfesita_yldandmed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlpdfesita_yldandmed  implements java.io.Serializable {
    private boolean vigane_aruanne;

    private int ariregistri_kood;

    private java.util.Date majaasta_algus;

    private java.util.Date majaasta_lopp;

    private java.math.BigInteger standard;

    private boolean konsolideeritud;

    private java.math.BigInteger erandid;

    private java.math.BigInteger tapsusaste;

    private java.lang.String aruande_liik;

    private java.math.BigInteger xbrl_aruande_id;

    private java.math.BigInteger paev_nr;

    private java.lang.String pteg_emtak;

    private java.lang.String pteg_emtak_versioon;

    private java.math.BigInteger tootajate_arv;

    private java.math.BigInteger kaive;

    private java.math.BigInteger kasum;

    private java.math.BigInteger bilansimaht;

    private java.math.BigInteger konsol_tootajate_arv;

    private java.math.BigInteger konsol_kaive;

    private java.math.BigInteger konsol_kasum;

    private java.math.BigInteger konsol_bilansimaht;

    private java.lang.String valuuta;

    private java.lang.Boolean auditeeritus;

    public Xbrlpdfesita_yldandmed() {
    }

    public Xbrlpdfesita_yldandmed(
           boolean vigane_aruanne,
           int ariregistri_kood,
           java.util.Date majaasta_algus,
           java.util.Date majaasta_lopp,
           java.math.BigInteger standard,
           boolean konsolideeritud,
           java.math.BigInteger erandid,
           java.math.BigInteger tapsusaste,
           java.lang.String aruande_liik,
           java.math.BigInteger xbrl_aruande_id,
           java.math.BigInteger paev_nr,
           java.lang.String pteg_emtak,
           java.lang.String pteg_emtak_versioon,
           java.math.BigInteger tootajate_arv,
           java.math.BigInteger kaive,
           java.math.BigInteger kasum,
           java.math.BigInteger bilansimaht,
           java.math.BigInteger konsol_tootajate_arv,
           java.math.BigInteger konsol_kaive,
           java.math.BigInteger konsol_kasum,
           java.math.BigInteger konsol_bilansimaht,
           java.lang.String valuuta,
           java.lang.Boolean auditeeritus) {
           this.vigane_aruanne = vigane_aruanne;
           this.ariregistri_kood = ariregistri_kood;
           this.majaasta_algus = majaasta_algus;
           this.majaasta_lopp = majaasta_lopp;
           this.standard = standard;
           this.konsolideeritud = konsolideeritud;
           this.erandid = erandid;
           this.tapsusaste = tapsusaste;
           this.aruande_liik = aruande_liik;
           this.xbrl_aruande_id = xbrl_aruande_id;
           this.paev_nr = paev_nr;
           this.pteg_emtak = pteg_emtak;
           this.pteg_emtak_versioon = pteg_emtak_versioon;
           this.tootajate_arv = tootajate_arv;
           this.kaive = kaive;
           this.kasum = kasum;
           this.bilansimaht = bilansimaht;
           this.konsol_tootajate_arv = konsol_tootajate_arv;
           this.konsol_kaive = konsol_kaive;
           this.konsol_kasum = konsol_kasum;
           this.konsol_bilansimaht = konsol_bilansimaht;
           this.valuuta = valuuta;
           this.auditeeritus = auditeeritus;
    }


    /**
     * Gets the vigane_aruanne value for this Xbrlpdfesita_yldandmed.
     * 
     * @return vigane_aruanne
     */
    public boolean isVigane_aruanne() {
        return vigane_aruanne;
    }


    /**
     * Sets the vigane_aruanne value for this Xbrlpdfesita_yldandmed.
     * 
     * @param vigane_aruanne
     */
    public void setVigane_aruanne(boolean vigane_aruanne) {
        this.vigane_aruanne = vigane_aruanne;
    }


    /**
     * Gets the ariregistri_kood value for this Xbrlpdfesita_yldandmed.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Xbrlpdfesita_yldandmed.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the majaasta_algus value for this Xbrlpdfesita_yldandmed.
     * 
     * @return majaasta_algus
     */
    public java.util.Date getMajaasta_algus() {
        return majaasta_algus;
    }


    /**
     * Sets the majaasta_algus value for this Xbrlpdfesita_yldandmed.
     * 
     * @param majaasta_algus
     */
    public void setMajaasta_algus(java.util.Date majaasta_algus) {
        this.majaasta_algus = majaasta_algus;
    }


    /**
     * Gets the majaasta_lopp value for this Xbrlpdfesita_yldandmed.
     * 
     * @return majaasta_lopp
     */
    public java.util.Date getMajaasta_lopp() {
        return majaasta_lopp;
    }


    /**
     * Sets the majaasta_lopp value for this Xbrlpdfesita_yldandmed.
     * 
     * @param majaasta_lopp
     */
    public void setMajaasta_lopp(java.util.Date majaasta_lopp) {
        this.majaasta_lopp = majaasta_lopp;
    }


    /**
     * Gets the standard value for this Xbrlpdfesita_yldandmed.
     * 
     * @return standard
     */
    public java.math.BigInteger getStandard() {
        return standard;
    }


    /**
     * Sets the standard value for this Xbrlpdfesita_yldandmed.
     * 
     * @param standard
     */
    public void setStandard(java.math.BigInteger standard) {
        this.standard = standard;
    }


    /**
     * Gets the konsolideeritud value for this Xbrlpdfesita_yldandmed.
     * 
     * @return konsolideeritud
     */
    public boolean isKonsolideeritud() {
        return konsolideeritud;
    }


    /**
     * Sets the konsolideeritud value for this Xbrlpdfesita_yldandmed.
     * 
     * @param konsolideeritud
     */
    public void setKonsolideeritud(boolean konsolideeritud) {
        this.konsolideeritud = konsolideeritud;
    }


    /**
     * Gets the erandid value for this Xbrlpdfesita_yldandmed.
     * 
     * @return erandid
     */
    public java.math.BigInteger getErandid() {
        return erandid;
    }


    /**
     * Sets the erandid value for this Xbrlpdfesita_yldandmed.
     * 
     * @param erandid
     */
    public void setErandid(java.math.BigInteger erandid) {
        this.erandid = erandid;
    }


    /**
     * Gets the tapsusaste value for this Xbrlpdfesita_yldandmed.
     * 
     * @return tapsusaste
     */
    public java.math.BigInteger getTapsusaste() {
        return tapsusaste;
    }


    /**
     * Sets the tapsusaste value for this Xbrlpdfesita_yldandmed.
     * 
     * @param tapsusaste
     */
    public void setTapsusaste(java.math.BigInteger tapsusaste) {
        this.tapsusaste = tapsusaste;
    }


    /**
     * Gets the aruande_liik value for this Xbrlpdfesita_yldandmed.
     * 
     * @return aruande_liik
     */
    public java.lang.String getAruande_liik() {
        return aruande_liik;
    }


    /**
     * Sets the aruande_liik value for this Xbrlpdfesita_yldandmed.
     * 
     * @param aruande_liik
     */
    public void setAruande_liik(java.lang.String aruande_liik) {
        this.aruande_liik = aruande_liik;
    }


    /**
     * Gets the xbrl_aruande_id value for this Xbrlpdfesita_yldandmed.
     * 
     * @return xbrl_aruande_id
     */
    public java.math.BigInteger getXbrl_aruande_id() {
        return xbrl_aruande_id;
    }


    /**
     * Sets the xbrl_aruande_id value for this Xbrlpdfesita_yldandmed.
     * 
     * @param xbrl_aruande_id
     */
    public void setXbrl_aruande_id(java.math.BigInteger xbrl_aruande_id) {
        this.xbrl_aruande_id = xbrl_aruande_id;
    }


    /**
     * Gets the paev_nr value for this Xbrlpdfesita_yldandmed.
     * 
     * @return paev_nr
     */
    public java.math.BigInteger getPaev_nr() {
        return paev_nr;
    }


    /**
     * Sets the paev_nr value for this Xbrlpdfesita_yldandmed.
     * 
     * @param paev_nr
     */
    public void setPaev_nr(java.math.BigInteger paev_nr) {
        this.paev_nr = paev_nr;
    }


    /**
     * Gets the pteg_emtak value for this Xbrlpdfesita_yldandmed.
     * 
     * @return pteg_emtak
     */
    public java.lang.String getPteg_emtak() {
        return pteg_emtak;
    }


    /**
     * Sets the pteg_emtak value for this Xbrlpdfesita_yldandmed.
     * 
     * @param pteg_emtak
     */
    public void setPteg_emtak(java.lang.String pteg_emtak) {
        this.pteg_emtak = pteg_emtak;
    }


    /**
     * Gets the pteg_emtak_versioon value for this Xbrlpdfesita_yldandmed.
     * 
     * @return pteg_emtak_versioon
     */
    public java.lang.String getPteg_emtak_versioon() {
        return pteg_emtak_versioon;
    }


    /**
     * Sets the pteg_emtak_versioon value for this Xbrlpdfesita_yldandmed.
     * 
     * @param pteg_emtak_versioon
     */
    public void setPteg_emtak_versioon(java.lang.String pteg_emtak_versioon) {
        this.pteg_emtak_versioon = pteg_emtak_versioon;
    }


    /**
     * Gets the tootajate_arv value for this Xbrlpdfesita_yldandmed.
     * 
     * @return tootajate_arv
     */
    public java.math.BigInteger getTootajate_arv() {
        return tootajate_arv;
    }


    /**
     * Sets the tootajate_arv value for this Xbrlpdfesita_yldandmed.
     * 
     * @param tootajate_arv
     */
    public void setTootajate_arv(java.math.BigInteger tootajate_arv) {
        this.tootajate_arv = tootajate_arv;
    }


    /**
     * Gets the kaive value for this Xbrlpdfesita_yldandmed.
     * 
     * @return kaive
     */
    public java.math.BigInteger getKaive() {
        return kaive;
    }


    /**
     * Sets the kaive value for this Xbrlpdfesita_yldandmed.
     * 
     * @param kaive
     */
    public void setKaive(java.math.BigInteger kaive) {
        this.kaive = kaive;
    }


    /**
     * Gets the kasum value for this Xbrlpdfesita_yldandmed.
     * 
     * @return kasum
     */
    public java.math.BigInteger getKasum() {
        return kasum;
    }


    /**
     * Sets the kasum value for this Xbrlpdfesita_yldandmed.
     * 
     * @param kasum
     */
    public void setKasum(java.math.BigInteger kasum) {
        this.kasum = kasum;
    }


    /**
     * Gets the bilansimaht value for this Xbrlpdfesita_yldandmed.
     * 
     * @return bilansimaht
     */
    public java.math.BigInteger getBilansimaht() {
        return bilansimaht;
    }


    /**
     * Sets the bilansimaht value for this Xbrlpdfesita_yldandmed.
     * 
     * @param bilansimaht
     */
    public void setBilansimaht(java.math.BigInteger bilansimaht) {
        this.bilansimaht = bilansimaht;
    }


    /**
     * Gets the konsol_tootajate_arv value for this Xbrlpdfesita_yldandmed.
     * 
     * @return konsol_tootajate_arv
     */
    public java.math.BigInteger getKonsol_tootajate_arv() {
        return konsol_tootajate_arv;
    }


    /**
     * Sets the konsol_tootajate_arv value for this Xbrlpdfesita_yldandmed.
     * 
     * @param konsol_tootajate_arv
     */
    public void setKonsol_tootajate_arv(java.math.BigInteger konsol_tootajate_arv) {
        this.konsol_tootajate_arv = konsol_tootajate_arv;
    }


    /**
     * Gets the konsol_kaive value for this Xbrlpdfesita_yldandmed.
     * 
     * @return konsol_kaive
     */
    public java.math.BigInteger getKonsol_kaive() {
        return konsol_kaive;
    }


    /**
     * Sets the konsol_kaive value for this Xbrlpdfesita_yldandmed.
     * 
     * @param konsol_kaive
     */
    public void setKonsol_kaive(java.math.BigInteger konsol_kaive) {
        this.konsol_kaive = konsol_kaive;
    }


    /**
     * Gets the konsol_kasum value for this Xbrlpdfesita_yldandmed.
     * 
     * @return konsol_kasum
     */
    public java.math.BigInteger getKonsol_kasum() {
        return konsol_kasum;
    }


    /**
     * Sets the konsol_kasum value for this Xbrlpdfesita_yldandmed.
     * 
     * @param konsol_kasum
     */
    public void setKonsol_kasum(java.math.BigInteger konsol_kasum) {
        this.konsol_kasum = konsol_kasum;
    }


    /**
     * Gets the konsol_bilansimaht value for this Xbrlpdfesita_yldandmed.
     * 
     * @return konsol_bilansimaht
     */
    public java.math.BigInteger getKonsol_bilansimaht() {
        return konsol_bilansimaht;
    }


    /**
     * Sets the konsol_bilansimaht value for this Xbrlpdfesita_yldandmed.
     * 
     * @param konsol_bilansimaht
     */
    public void setKonsol_bilansimaht(java.math.BigInteger konsol_bilansimaht) {
        this.konsol_bilansimaht = konsol_bilansimaht;
    }


    /**
     * Gets the valuuta value for this Xbrlpdfesita_yldandmed.
     * 
     * @return valuuta
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }


    /**
     * Sets the valuuta value for this Xbrlpdfesita_yldandmed.
     * 
     * @param valuuta
     */
    public void setValuuta(java.lang.String valuuta) {
        this.valuuta = valuuta;
    }


    /**
     * Gets the auditeeritus value for this Xbrlpdfesita_yldandmed.
     * 
     * @return auditeeritus
     */
    public java.lang.Boolean getAuditeeritus() {
        return auditeeritus;
    }


    /**
     * Sets the auditeeritus value for this Xbrlpdfesita_yldandmed.
     * 
     * @param auditeeritus
     */
    public void setAuditeeritus(java.lang.Boolean auditeeritus) {
        this.auditeeritus = auditeeritus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlpdfesita_yldandmed)) return false;
        Xbrlpdfesita_yldandmed other = (Xbrlpdfesita_yldandmed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.vigane_aruanne == other.isVigane_aruanne() &&
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.majaasta_algus==null && other.getMajaasta_algus()==null) || 
             (this.majaasta_algus!=null &&
              this.majaasta_algus.equals(other.getMajaasta_algus()))) &&
            ((this.majaasta_lopp==null && other.getMajaasta_lopp()==null) || 
             (this.majaasta_lopp!=null &&
              this.majaasta_lopp.equals(other.getMajaasta_lopp()))) &&
            ((this.standard==null && other.getStandard()==null) || 
             (this.standard!=null &&
              this.standard.equals(other.getStandard()))) &&
            this.konsolideeritud == other.isKonsolideeritud() &&
            ((this.erandid==null && other.getErandid()==null) || 
             (this.erandid!=null &&
              this.erandid.equals(other.getErandid()))) &&
            ((this.tapsusaste==null && other.getTapsusaste()==null) || 
             (this.tapsusaste!=null &&
              this.tapsusaste.equals(other.getTapsusaste()))) &&
            ((this.aruande_liik==null && other.getAruande_liik()==null) || 
             (this.aruande_liik!=null &&
              this.aruande_liik.equals(other.getAruande_liik()))) &&
            ((this.xbrl_aruande_id==null && other.getXbrl_aruande_id()==null) || 
             (this.xbrl_aruande_id!=null &&
              this.xbrl_aruande_id.equals(other.getXbrl_aruande_id()))) &&
            ((this.paev_nr==null && other.getPaev_nr()==null) || 
             (this.paev_nr!=null &&
              this.paev_nr.equals(other.getPaev_nr()))) &&
            ((this.pteg_emtak==null && other.getPteg_emtak()==null) || 
             (this.pteg_emtak!=null &&
              this.pteg_emtak.equals(other.getPteg_emtak()))) &&
            ((this.pteg_emtak_versioon==null && other.getPteg_emtak_versioon()==null) || 
             (this.pteg_emtak_versioon!=null &&
              this.pteg_emtak_versioon.equals(other.getPteg_emtak_versioon()))) &&
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
            ((this.auditeeritus==null && other.getAuditeeritus()==null) || 
             (this.auditeeritus!=null &&
              this.auditeeritus.equals(other.getAuditeeritus())));
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
        _hashCode += (isVigane_aruanne() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAriregistri_kood();
        if (getMajaasta_algus() != null) {
            _hashCode += getMajaasta_algus().hashCode();
        }
        if (getMajaasta_lopp() != null) {
            _hashCode += getMajaasta_lopp().hashCode();
        }
        if (getStandard() != null) {
            _hashCode += getStandard().hashCode();
        }
        _hashCode += (isKonsolideeritud() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErandid() != null) {
            _hashCode += getErandid().hashCode();
        }
        if (getTapsusaste() != null) {
            _hashCode += getTapsusaste().hashCode();
        }
        if (getAruande_liik() != null) {
            _hashCode += getAruande_liik().hashCode();
        }
        if (getXbrl_aruande_id() != null) {
            _hashCode += getXbrl_aruande_id().hashCode();
        }
        if (getPaev_nr() != null) {
            _hashCode += getPaev_nr().hashCode();
        }
        if (getPteg_emtak() != null) {
            _hashCode += getPteg_emtak().hashCode();
        }
        if (getPteg_emtak_versioon() != null) {
            _hashCode += getPteg_emtak_versioon().hashCode();
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
        if (getAuditeeritus() != null) {
            _hashCode += getAuditeeritus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
