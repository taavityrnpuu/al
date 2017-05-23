/**
 * SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida  implements java.io.Serializable {
    private java.math.BigInteger tyypteemaId;

    private java.lang.String oiguslikAlus;

    private java.lang.String sisu;

    private java.lang.String pohjendus;

    private java.util.Date tahtaeg;

    private java.math.BigDecimal sunniraha;

    private java.util.Date taitmiseKuupaev;

    private java.lang.String taitmiseKommentaar;

    private boolean vaidlustatud;

    private ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRidaArhiveerimisePohjus arhiveerimisePohjus;

    private java.util.Date kehtetuksTunnistamiseKuupaev;

    private java.lang.String kehtetuksTunnistamiseUlatus;

    private java.lang.String kehtetuksTunnistamiseFailiNimi;

    private java.lang.String kehtetuksTunnistamiseFailiSisu;

    public SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida() {
    }

    public SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida(
           java.math.BigInteger tyypteemaId,
           java.lang.String oiguslikAlus,
           java.lang.String sisu,
           java.lang.String pohjendus,
           java.util.Date tahtaeg,
           java.math.BigDecimal sunniraha,
           java.util.Date taitmiseKuupaev,
           java.lang.String taitmiseKommentaar,
           boolean vaidlustatud,
           ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRidaArhiveerimisePohjus arhiveerimisePohjus,
           java.util.Date kehtetuksTunnistamiseKuupaev,
           java.lang.String kehtetuksTunnistamiseUlatus,
           java.lang.String kehtetuksTunnistamiseFailiNimi,
           java.lang.String kehtetuksTunnistamiseFailiSisu) {
           this.tyypteemaId = tyypteemaId;
           this.oiguslikAlus = oiguslikAlus;
           this.sisu = sisu;
           this.pohjendus = pohjendus;
           this.tahtaeg = tahtaeg;
           this.sunniraha = sunniraha;
           this.taitmiseKuupaev = taitmiseKuupaev;
           this.taitmiseKommentaar = taitmiseKommentaar;
           this.vaidlustatud = vaidlustatud;
           this.arhiveerimisePohjus = arhiveerimisePohjus;
           this.kehtetuksTunnistamiseKuupaev = kehtetuksTunnistamiseKuupaev;
           this.kehtetuksTunnistamiseUlatus = kehtetuksTunnistamiseUlatus;
           this.kehtetuksTunnistamiseFailiNimi = kehtetuksTunnistamiseFailiNimi;
           this.kehtetuksTunnistamiseFailiSisu = kehtetuksTunnistamiseFailiSisu;
    }


    /**
     * Gets the tyypteemaId value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return tyypteemaId
     */
    public java.math.BigInteger getTyypteemaId() {
        return tyypteemaId;
    }


    /**
     * Sets the tyypteemaId value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param tyypteemaId
     */
    public void setTyypteemaId(java.math.BigInteger tyypteemaId) {
        this.tyypteemaId = tyypteemaId;
    }


    /**
     * Gets the oiguslikAlus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return oiguslikAlus
     */
    public java.lang.String getOiguslikAlus() {
        return oiguslikAlus;
    }


    /**
     * Sets the oiguslikAlus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param oiguslikAlus
     */
    public void setOiguslikAlus(java.lang.String oiguslikAlus) {
        this.oiguslikAlus = oiguslikAlus;
    }


    /**
     * Gets the sisu value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }


    /**
     * Gets the pohjendus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return pohjendus
     */
    public java.lang.String getPohjendus() {
        return pohjendus;
    }


    /**
     * Sets the pohjendus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param pohjendus
     */
    public void setPohjendus(java.lang.String pohjendus) {
        this.pohjendus = pohjendus;
    }


    /**
     * Gets the tahtaeg value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return tahtaeg
     */
    public java.util.Date getTahtaeg() {
        return tahtaeg;
    }


    /**
     * Sets the tahtaeg value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param tahtaeg
     */
    public void setTahtaeg(java.util.Date tahtaeg) {
        this.tahtaeg = tahtaeg;
    }


    /**
     * Gets the sunniraha value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return sunniraha
     */
    public java.math.BigDecimal getSunniraha() {
        return sunniraha;
    }


    /**
     * Sets the sunniraha value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param sunniraha
     */
    public void setSunniraha(java.math.BigDecimal sunniraha) {
        this.sunniraha = sunniraha;
    }


    /**
     * Gets the taitmiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return taitmiseKuupaev
     */
    public java.util.Date getTaitmiseKuupaev() {
        return taitmiseKuupaev;
    }


    /**
     * Sets the taitmiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param taitmiseKuupaev
     */
    public void setTaitmiseKuupaev(java.util.Date taitmiseKuupaev) {
        this.taitmiseKuupaev = taitmiseKuupaev;
    }


    /**
     * Gets the taitmiseKommentaar value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return taitmiseKommentaar
     */
    public java.lang.String getTaitmiseKommentaar() {
        return taitmiseKommentaar;
    }


    /**
     * Sets the taitmiseKommentaar value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param taitmiseKommentaar
     */
    public void setTaitmiseKommentaar(java.lang.String taitmiseKommentaar) {
        this.taitmiseKommentaar = taitmiseKommentaar;
    }


    /**
     * Gets the vaidlustatud value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return vaidlustatud
     */
    public boolean isVaidlustatud() {
        return vaidlustatud;
    }


    /**
     * Sets the vaidlustatud value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param vaidlustatud
     */
    public void setVaidlustatud(boolean vaidlustatud) {
        this.vaidlustatud = vaidlustatud;
    }


    /**
     * Gets the arhiveerimisePohjus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return arhiveerimisePohjus
     */
    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRidaArhiveerimisePohjus getArhiveerimisePohjus() {
        return arhiveerimisePohjus;
    }


    /**
     * Sets the arhiveerimisePohjus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param arhiveerimisePohjus
     */
    public void setArhiveerimisePohjus(ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRidaArhiveerimisePohjus arhiveerimisePohjus) {
        this.arhiveerimisePohjus = arhiveerimisePohjus;
    }


    /**
     * Gets the kehtetuksTunnistamiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return kehtetuksTunnistamiseKuupaev
     */
    public java.util.Date getKehtetuksTunnistamiseKuupaev() {
        return kehtetuksTunnistamiseKuupaev;
    }


    /**
     * Sets the kehtetuksTunnistamiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param kehtetuksTunnistamiseKuupaev
     */
    public void setKehtetuksTunnistamiseKuupaev(java.util.Date kehtetuksTunnistamiseKuupaev) {
        this.kehtetuksTunnistamiseKuupaev = kehtetuksTunnistamiseKuupaev;
    }


    /**
     * Gets the kehtetuksTunnistamiseUlatus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return kehtetuksTunnistamiseUlatus
     */
    public java.lang.String getKehtetuksTunnistamiseUlatus() {
        return kehtetuksTunnistamiseUlatus;
    }


    /**
     * Sets the kehtetuksTunnistamiseUlatus value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param kehtetuksTunnistamiseUlatus
     */
    public void setKehtetuksTunnistamiseUlatus(java.lang.String kehtetuksTunnistamiseUlatus) {
        this.kehtetuksTunnistamiseUlatus = kehtetuksTunnistamiseUlatus;
    }


    /**
     * Gets the kehtetuksTunnistamiseFailiNimi value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return kehtetuksTunnistamiseFailiNimi
     */
    public java.lang.String getKehtetuksTunnistamiseFailiNimi() {
        return kehtetuksTunnistamiseFailiNimi;
    }


    /**
     * Sets the kehtetuksTunnistamiseFailiNimi value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param kehtetuksTunnistamiseFailiNimi
     */
    public void setKehtetuksTunnistamiseFailiNimi(java.lang.String kehtetuksTunnistamiseFailiNimi) {
        this.kehtetuksTunnistamiseFailiNimi = kehtetuksTunnistamiseFailiNimi;
    }


    /**
     * Gets the kehtetuksTunnistamiseFailiSisu value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @return kehtetuksTunnistamiseFailiSisu
     */
    public java.lang.String getKehtetuksTunnistamiseFailiSisu() {
        return kehtetuksTunnistamiseFailiSisu;
    }


    /**
     * Sets the kehtetuksTunnistamiseFailiSisu value for this SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.
     * 
     * @param kehtetuksTunnistamiseFailiSisu
     */
    public void setKehtetuksTunnistamiseFailiSisu(java.lang.String kehtetuksTunnistamiseFailiSisu) {
        this.kehtetuksTunnistamiseFailiSisu = kehtetuksTunnistamiseFailiSisu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida)) return false;
        SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida other = (SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyypteemaId==null && other.getTyypteemaId()==null) || 
             (this.tyypteemaId!=null &&
              this.tyypteemaId.equals(other.getTyypteemaId()))) &&
            ((this.oiguslikAlus==null && other.getOiguslikAlus()==null) || 
             (this.oiguslikAlus!=null &&
              this.oiguslikAlus.equals(other.getOiguslikAlus()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu()))) &&
            ((this.pohjendus==null && other.getPohjendus()==null) || 
             (this.pohjendus!=null &&
              this.pohjendus.equals(other.getPohjendus()))) &&
            ((this.tahtaeg==null && other.getTahtaeg()==null) || 
             (this.tahtaeg!=null &&
              this.tahtaeg.equals(other.getTahtaeg()))) &&
            ((this.sunniraha==null && other.getSunniraha()==null) || 
             (this.sunniraha!=null &&
              this.sunniraha.equals(other.getSunniraha()))) &&
            ((this.taitmiseKuupaev==null && other.getTaitmiseKuupaev()==null) || 
             (this.taitmiseKuupaev!=null &&
              this.taitmiseKuupaev.equals(other.getTaitmiseKuupaev()))) &&
            ((this.taitmiseKommentaar==null && other.getTaitmiseKommentaar()==null) || 
             (this.taitmiseKommentaar!=null &&
              this.taitmiseKommentaar.equals(other.getTaitmiseKommentaar()))) &&
            this.vaidlustatud == other.isVaidlustatud() &&
            ((this.arhiveerimisePohjus==null && other.getArhiveerimisePohjus()==null) || 
             (this.arhiveerimisePohjus!=null &&
              this.arhiveerimisePohjus.equals(other.getArhiveerimisePohjus()))) &&
            ((this.kehtetuksTunnistamiseKuupaev==null && other.getKehtetuksTunnistamiseKuupaev()==null) || 
             (this.kehtetuksTunnistamiseKuupaev!=null &&
              this.kehtetuksTunnistamiseKuupaev.equals(other.getKehtetuksTunnistamiseKuupaev()))) &&
            ((this.kehtetuksTunnistamiseUlatus==null && other.getKehtetuksTunnistamiseUlatus()==null) || 
             (this.kehtetuksTunnistamiseUlatus!=null &&
              this.kehtetuksTunnistamiseUlatus.equals(other.getKehtetuksTunnistamiseUlatus()))) &&
            ((this.kehtetuksTunnistamiseFailiNimi==null && other.getKehtetuksTunnistamiseFailiNimi()==null) || 
             (this.kehtetuksTunnistamiseFailiNimi!=null &&
              this.kehtetuksTunnistamiseFailiNimi.equals(other.getKehtetuksTunnistamiseFailiNimi()))) &&
            ((this.kehtetuksTunnistamiseFailiSisu==null && other.getKehtetuksTunnistamiseFailiSisu()==null) || 
             (this.kehtetuksTunnistamiseFailiSisu!=null &&
              this.kehtetuksTunnistamiseFailiSisu.equals(other.getKehtetuksTunnistamiseFailiSisu())));
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
        if (getTyypteemaId() != null) {
            _hashCode += getTyypteemaId().hashCode();
        }
        if (getOiguslikAlus() != null) {
            _hashCode += getOiguslikAlus().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        if (getPohjendus() != null) {
            _hashCode += getPohjendus().hashCode();
        }
        if (getTahtaeg() != null) {
            _hashCode += getTahtaeg().hashCode();
        }
        if (getSunniraha() != null) {
            _hashCode += getSunniraha().hashCode();
        }
        if (getTaitmiseKuupaev() != null) {
            _hashCode += getTaitmiseKuupaev().hashCode();
        }
        if (getTaitmiseKommentaar() != null) {
            _hashCode += getTaitmiseKommentaar().hashCode();
        }
        _hashCode += (isVaidlustatud() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getArhiveerimisePohjus() != null) {
            _hashCode += getArhiveerimisePohjus().hashCode();
        }
        if (getKehtetuksTunnistamiseKuupaev() != null) {
            _hashCode += getKehtetuksTunnistamiseKuupaev().hashCode();
        }
        if (getKehtetuksTunnistamiseUlatus() != null) {
            _hashCode += getKehtetuksTunnistamiseUlatus().hashCode();
        }
        if (getKehtetuksTunnistamiseFailiNimi() != null) {
            _hashCode += getKehtetuksTunnistamiseFailiNimi().hashCode();
        }
        if (getKehtetuksTunnistamiseFailiSisu() != null) {
            _hashCode += getKehtetuksTunnistamiseFailiSisu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
