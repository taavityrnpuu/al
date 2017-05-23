/**
 * NapTasumiseLisamineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class NapTasumiseLisamineType  implements java.io.Serializable {
    /* Noude Id alliksüsteemis */
    private java.lang.String noudeIdAllikas;

    /* Laekumise unikaalne id (MKR poolt omistatud) */
    private java.lang.String laekId;

    /* Tasumise id MKR süsteemis */
    private java.lang.String tasuId;

    /* Laekumise kuupäev */
    private java.util.Date laekKpv;

    /* Maksja isikukood/reg.kood/ID */
    private java.lang.String maksjaIsikukood;

    /* Ettemaksukonto omaniku reg.kood/ID või MTA mitteresidendi kood,
     * kuhu see laekumine tuli. Võib jääda tühjaks, kui selgitamisel laekumine */
    private java.lang.String emkoOmanikIsikukood;

    private java.lang.String maksjaNimi;

    /* Maksja kontonumber (milliselt kontolt makse tehti, kui tegu
     * on tavaülekandega). Jääb tühjaks, kui tasumine tehti näiteks tagastusest? */
    private java.lang.String maksjaKontoNR;

    private java.lang.String makseSelgitus;

    /* NAP tasumise summa, mille võrra nõude saldo antud tehingus
     * muutus (võib olla väiksem kui LaekumiseSumma, kui laekumine seoti
     * nõudega osaliselt või laekumise summa oli nõudest suurem). */
    private java.math.BigDecimal tasumiseSumma;

    /* Summa, mille maksja üle kandis */
    private java.math.BigDecimal laekumiseSumma;

    private java.lang.String viitenumber;

    /* Praegu: Tasumine=1, Tasumise tühistamine=2, Mahakandmine= 3,
     * mahakandmise tühistamine e. ennistamine=4). */
    private int muutuseLiikKL;

    public NapTasumiseLisamineType() {
    }

    public NapTasumiseLisamineType(
           java.lang.String noudeIdAllikas,
           java.lang.String laekId,
           java.lang.String tasuId,
           java.util.Date laekKpv,
           java.lang.String maksjaIsikukood,
           java.lang.String emkoOmanikIsikukood,
           java.lang.String maksjaNimi,
           java.lang.String maksjaKontoNR,
           java.lang.String makseSelgitus,
           java.math.BigDecimal tasumiseSumma,
           java.math.BigDecimal laekumiseSumma,
           java.lang.String viitenumber,
           int muutuseLiikKL) {
           this.noudeIdAllikas = noudeIdAllikas;
           this.laekId = laekId;
           this.tasuId = tasuId;
           this.laekKpv = laekKpv;
           this.maksjaIsikukood = maksjaIsikukood;
           this.emkoOmanikIsikukood = emkoOmanikIsikukood;
           this.maksjaNimi = maksjaNimi;
           this.maksjaKontoNR = maksjaKontoNR;
           this.makseSelgitus = makseSelgitus;
           this.tasumiseSumma = tasumiseSumma;
           this.laekumiseSumma = laekumiseSumma;
           this.viitenumber = viitenumber;
           this.muutuseLiikKL = muutuseLiikKL;
    }


    /**
     * Gets the noudeIdAllikas value for this NapTasumiseLisamineType.
     * 
     * @return noudeIdAllikas   * Noude Id alliksüsteemis
     */
    public java.lang.String getNoudeIdAllikas() {
        return noudeIdAllikas;
    }


    /**
     * Sets the noudeIdAllikas value for this NapTasumiseLisamineType.
     * 
     * @param noudeIdAllikas   * Noude Id alliksüsteemis
     */
    public void setNoudeIdAllikas(java.lang.String noudeIdAllikas) {
        this.noudeIdAllikas = noudeIdAllikas;
    }


    /**
     * Gets the laekId value for this NapTasumiseLisamineType.
     * 
     * @return laekId   * Laekumise unikaalne id (MKR poolt omistatud)
     */
    public java.lang.String getLaekId() {
        return laekId;
    }


    /**
     * Sets the laekId value for this NapTasumiseLisamineType.
     * 
     * @param laekId   * Laekumise unikaalne id (MKR poolt omistatud)
     */
    public void setLaekId(java.lang.String laekId) {
        this.laekId = laekId;
    }


    /**
     * Gets the tasuId value for this NapTasumiseLisamineType.
     * 
     * @return tasuId   * Tasumise id MKR süsteemis
     */
    public java.lang.String getTasuId() {
        return tasuId;
    }


    /**
     * Sets the tasuId value for this NapTasumiseLisamineType.
     * 
     * @param tasuId   * Tasumise id MKR süsteemis
     */
    public void setTasuId(java.lang.String tasuId) {
        this.tasuId = tasuId;
    }


    /**
     * Gets the laekKpv value for this NapTasumiseLisamineType.
     * 
     * @return laekKpv   * Laekumise kuupäev
     */
    public java.util.Date getLaekKpv() {
        return laekKpv;
    }


    /**
     * Sets the laekKpv value for this NapTasumiseLisamineType.
     * 
     * @param laekKpv   * Laekumise kuupäev
     */
    public void setLaekKpv(java.util.Date laekKpv) {
        this.laekKpv = laekKpv;
    }


    /**
     * Gets the maksjaIsikukood value for this NapTasumiseLisamineType.
     * 
     * @return maksjaIsikukood   * Maksja isikukood/reg.kood/ID
     */
    public java.lang.String getMaksjaIsikukood() {
        return maksjaIsikukood;
    }


    /**
     * Sets the maksjaIsikukood value for this NapTasumiseLisamineType.
     * 
     * @param maksjaIsikukood   * Maksja isikukood/reg.kood/ID
     */
    public void setMaksjaIsikukood(java.lang.String maksjaIsikukood) {
        this.maksjaIsikukood = maksjaIsikukood;
    }


    /**
     * Gets the emkoOmanikIsikukood value for this NapTasumiseLisamineType.
     * 
     * @return emkoOmanikIsikukood   * Ettemaksukonto omaniku reg.kood/ID või MTA mitteresidendi kood,
     * kuhu see laekumine tuli. Võib jääda tühjaks, kui selgitamisel laekumine
     */
    public java.lang.String getEmkoOmanikIsikukood() {
        return emkoOmanikIsikukood;
    }


    /**
     * Sets the emkoOmanikIsikukood value for this NapTasumiseLisamineType.
     * 
     * @param emkoOmanikIsikukood   * Ettemaksukonto omaniku reg.kood/ID või MTA mitteresidendi kood,
     * kuhu see laekumine tuli. Võib jääda tühjaks, kui selgitamisel laekumine
     */
    public void setEmkoOmanikIsikukood(java.lang.String emkoOmanikIsikukood) {
        this.emkoOmanikIsikukood = emkoOmanikIsikukood;
    }


    /**
     * Gets the maksjaNimi value for this NapTasumiseLisamineType.
     * 
     * @return maksjaNimi
     */
    public java.lang.String getMaksjaNimi() {
        return maksjaNimi;
    }


    /**
     * Sets the maksjaNimi value for this NapTasumiseLisamineType.
     * 
     * @param maksjaNimi
     */
    public void setMaksjaNimi(java.lang.String maksjaNimi) {
        this.maksjaNimi = maksjaNimi;
    }


    /**
     * Gets the maksjaKontoNR value for this NapTasumiseLisamineType.
     * 
     * @return maksjaKontoNR   * Maksja kontonumber (milliselt kontolt makse tehti, kui tegu
     * on tavaülekandega). Jääb tühjaks, kui tasumine tehti näiteks tagastusest?
     */
    public java.lang.String getMaksjaKontoNR() {
        return maksjaKontoNR;
    }


    /**
     * Sets the maksjaKontoNR value for this NapTasumiseLisamineType.
     * 
     * @param maksjaKontoNR   * Maksja kontonumber (milliselt kontolt makse tehti, kui tegu
     * on tavaülekandega). Jääb tühjaks, kui tasumine tehti näiteks tagastusest?
     */
    public void setMaksjaKontoNR(java.lang.String maksjaKontoNR) {
        this.maksjaKontoNR = maksjaKontoNR;
    }


    /**
     * Gets the makseSelgitus value for this NapTasumiseLisamineType.
     * 
     * @return makseSelgitus
     */
    public java.lang.String getMakseSelgitus() {
        return makseSelgitus;
    }


    /**
     * Sets the makseSelgitus value for this NapTasumiseLisamineType.
     * 
     * @param makseSelgitus
     */
    public void setMakseSelgitus(java.lang.String makseSelgitus) {
        this.makseSelgitus = makseSelgitus;
    }


    /**
     * Gets the tasumiseSumma value for this NapTasumiseLisamineType.
     * 
     * @return tasumiseSumma   * NAP tasumise summa, mille võrra nõude saldo antud tehingus
     * muutus (võib olla väiksem kui LaekumiseSumma, kui laekumine seoti
     * nõudega osaliselt või laekumise summa oli nõudest suurem).
     */
    public java.math.BigDecimal getTasumiseSumma() {
        return tasumiseSumma;
    }


    /**
     * Sets the tasumiseSumma value for this NapTasumiseLisamineType.
     * 
     * @param tasumiseSumma   * NAP tasumise summa, mille võrra nõude saldo antud tehingus
     * muutus (võib olla väiksem kui LaekumiseSumma, kui laekumine seoti
     * nõudega osaliselt või laekumise summa oli nõudest suurem).
     */
    public void setTasumiseSumma(java.math.BigDecimal tasumiseSumma) {
        this.tasumiseSumma = tasumiseSumma;
    }


    /**
     * Gets the laekumiseSumma value for this NapTasumiseLisamineType.
     * 
     * @return laekumiseSumma   * Summa, mille maksja üle kandis
     */
    public java.math.BigDecimal getLaekumiseSumma() {
        return laekumiseSumma;
    }


    /**
     * Sets the laekumiseSumma value for this NapTasumiseLisamineType.
     * 
     * @param laekumiseSumma   * Summa, mille maksja üle kandis
     */
    public void setLaekumiseSumma(java.math.BigDecimal laekumiseSumma) {
        this.laekumiseSumma = laekumiseSumma;
    }


    /**
     * Gets the viitenumber value for this NapTasumiseLisamineType.
     * 
     * @return viitenumber
     */
    public java.lang.String getViitenumber() {
        return viitenumber;
    }


    /**
     * Sets the viitenumber value for this NapTasumiseLisamineType.
     * 
     * @param viitenumber
     */
    public void setViitenumber(java.lang.String viitenumber) {
        this.viitenumber = viitenumber;
    }


    /**
     * Gets the muutuseLiikKL value for this NapTasumiseLisamineType.
     * 
     * @return muutuseLiikKL   * Praegu: Tasumine=1, Tasumise tühistamine=2, Mahakandmine= 3,
     * mahakandmise tühistamine e. ennistamine=4).
     */
    public int getMuutuseLiikKL() {
        return muutuseLiikKL;
    }


    /**
     * Sets the muutuseLiikKL value for this NapTasumiseLisamineType.
     * 
     * @param muutuseLiikKL   * Praegu: Tasumine=1, Tasumise tühistamine=2, Mahakandmine= 3,
     * mahakandmise tühistamine e. ennistamine=4).
     */
    public void setMuutuseLiikKL(int muutuseLiikKL) {
        this.muutuseLiikKL = muutuseLiikKL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NapTasumiseLisamineType)) return false;
        NapTasumiseLisamineType other = (NapTasumiseLisamineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noudeIdAllikas==null && other.getNoudeIdAllikas()==null) || 
             (this.noudeIdAllikas!=null &&
              this.noudeIdAllikas.equals(other.getNoudeIdAllikas()))) &&
            ((this.laekId==null && other.getLaekId()==null) || 
             (this.laekId!=null &&
              this.laekId.equals(other.getLaekId()))) &&
            ((this.tasuId==null && other.getTasuId()==null) || 
             (this.tasuId!=null &&
              this.tasuId.equals(other.getTasuId()))) &&
            ((this.laekKpv==null && other.getLaekKpv()==null) || 
             (this.laekKpv!=null &&
              this.laekKpv.equals(other.getLaekKpv()))) &&
            ((this.maksjaIsikukood==null && other.getMaksjaIsikukood()==null) || 
             (this.maksjaIsikukood!=null &&
              this.maksjaIsikukood.equals(other.getMaksjaIsikukood()))) &&
            ((this.emkoOmanikIsikukood==null && other.getEmkoOmanikIsikukood()==null) || 
             (this.emkoOmanikIsikukood!=null &&
              this.emkoOmanikIsikukood.equals(other.getEmkoOmanikIsikukood()))) &&
            ((this.maksjaNimi==null && other.getMaksjaNimi()==null) || 
             (this.maksjaNimi!=null &&
              this.maksjaNimi.equals(other.getMaksjaNimi()))) &&
            ((this.maksjaKontoNR==null && other.getMaksjaKontoNR()==null) || 
             (this.maksjaKontoNR!=null &&
              this.maksjaKontoNR.equals(other.getMaksjaKontoNR()))) &&
            ((this.makseSelgitus==null && other.getMakseSelgitus()==null) || 
             (this.makseSelgitus!=null &&
              this.makseSelgitus.equals(other.getMakseSelgitus()))) &&
            ((this.tasumiseSumma==null && other.getTasumiseSumma()==null) || 
             (this.tasumiseSumma!=null &&
              this.tasumiseSumma.equals(other.getTasumiseSumma()))) &&
            ((this.laekumiseSumma==null && other.getLaekumiseSumma()==null) || 
             (this.laekumiseSumma!=null &&
              this.laekumiseSumma.equals(other.getLaekumiseSumma()))) &&
            ((this.viitenumber==null && other.getViitenumber()==null) || 
             (this.viitenumber!=null &&
              this.viitenumber.equals(other.getViitenumber()))) &&
            this.muutuseLiikKL == other.getMuutuseLiikKL();
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
        if (getNoudeIdAllikas() != null) {
            _hashCode += getNoudeIdAllikas().hashCode();
        }
        if (getLaekId() != null) {
            _hashCode += getLaekId().hashCode();
        }
        if (getTasuId() != null) {
            _hashCode += getTasuId().hashCode();
        }
        if (getLaekKpv() != null) {
            _hashCode += getLaekKpv().hashCode();
        }
        if (getMaksjaIsikukood() != null) {
            _hashCode += getMaksjaIsikukood().hashCode();
        }
        if (getEmkoOmanikIsikukood() != null) {
            _hashCode += getEmkoOmanikIsikukood().hashCode();
        }
        if (getMaksjaNimi() != null) {
            _hashCode += getMaksjaNimi().hashCode();
        }
        if (getMaksjaKontoNR() != null) {
            _hashCode += getMaksjaKontoNR().hashCode();
        }
        if (getMakseSelgitus() != null) {
            _hashCode += getMakseSelgitus().hashCode();
        }
        if (getTasumiseSumma() != null) {
            _hashCode += getTasumiseSumma().hashCode();
        }
        if (getLaekumiseSumma() != null) {
            _hashCode += getLaekumiseSumma().hashCode();
        }
        if (getViitenumber() != null) {
            _hashCode += getViitenumber().hashCode();
        }
        _hashCode += getMuutuseLiikKL();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
