/**
 * SalvestaEttekirjutusParingEttekirjutus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaEttekirjutusParingEttekirjutus  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String saajaKood;

    private java.lang.String saajaNimi;

    private java.lang.String saajaRiik;

    private java.util.Date tegemiseKuupaev;

    private java.lang.String number;

    private java.lang.String tegijaIsikukood;

    private java.lang.String tegijaEesnimi;

    private java.lang.String tegijaPerenimi;

    private java.lang.String tegijaRegistrikood;

    private ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusStaatus staatus;

    private java.lang.String failiNimi;

    private java.lang.String failiSisu;

    private java.util.Date arhiveerimiseKuupaev;

    private ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida[] ettekirjutuseRida;

    private ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala[] tegevusala;

    public SalvestaEttekirjutusParingEttekirjutus() {
    }

    public SalvestaEttekirjutusParingEttekirjutus(
           java.math.BigInteger id,
           java.lang.String saajaKood,
           java.lang.String saajaNimi,
           java.lang.String saajaRiik,
           java.util.Date tegemiseKuupaev,
           java.lang.String number,
           java.lang.String tegijaIsikukood,
           java.lang.String tegijaEesnimi,
           java.lang.String tegijaPerenimi,
           java.lang.String tegijaRegistrikood,
           ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusStaatus staatus,
           java.lang.String failiNimi,
           java.lang.String failiSisu,
           java.util.Date arhiveerimiseKuupaev,
           ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida[] ettekirjutuseRida,
           ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala[] tegevusala) {
           this.id = id;
           this.saajaKood = saajaKood;
           this.saajaNimi = saajaNimi;
           this.saajaRiik = saajaRiik;
           this.tegemiseKuupaev = tegemiseKuupaev;
           this.number = number;
           this.tegijaIsikukood = tegijaIsikukood;
           this.tegijaEesnimi = tegijaEesnimi;
           this.tegijaPerenimi = tegijaPerenimi;
           this.tegijaRegistrikood = tegijaRegistrikood;
           this.staatus = staatus;
           this.failiNimi = failiNimi;
           this.failiSisu = failiSisu;
           this.arhiveerimiseKuupaev = arhiveerimiseKuupaev;
           this.ettekirjutuseRida = ettekirjutuseRida;
           this.tegevusala = tegevusala;
    }


    /**
     * Gets the id value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the saajaKood value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return saajaKood
     */
    public java.lang.String getSaajaKood() {
        return saajaKood;
    }


    /**
     * Sets the saajaKood value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param saajaKood
     */
    public void setSaajaKood(java.lang.String saajaKood) {
        this.saajaKood = saajaKood;
    }


    /**
     * Gets the saajaNimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return saajaNimi
     */
    public java.lang.String getSaajaNimi() {
        return saajaNimi;
    }


    /**
     * Sets the saajaNimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param saajaNimi
     */
    public void setSaajaNimi(java.lang.String saajaNimi) {
        this.saajaNimi = saajaNimi;
    }


    /**
     * Gets the saajaRiik value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return saajaRiik
     */
    public java.lang.String getSaajaRiik() {
        return saajaRiik;
    }


    /**
     * Sets the saajaRiik value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param saajaRiik
     */
    public void setSaajaRiik(java.lang.String saajaRiik) {
        this.saajaRiik = saajaRiik;
    }


    /**
     * Gets the tegemiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return tegemiseKuupaev
     */
    public java.util.Date getTegemiseKuupaev() {
        return tegemiseKuupaev;
    }


    /**
     * Sets the tegemiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param tegemiseKuupaev
     */
    public void setTegemiseKuupaev(java.util.Date tegemiseKuupaev) {
        this.tegemiseKuupaev = tegemiseKuupaev;
    }


    /**
     * Gets the number value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the tegijaIsikukood value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return tegijaIsikukood
     */
    public java.lang.String getTegijaIsikukood() {
        return tegijaIsikukood;
    }


    /**
     * Sets the tegijaIsikukood value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param tegijaIsikukood
     */
    public void setTegijaIsikukood(java.lang.String tegijaIsikukood) {
        this.tegijaIsikukood = tegijaIsikukood;
    }


    /**
     * Gets the tegijaEesnimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return tegijaEesnimi
     */
    public java.lang.String getTegijaEesnimi() {
        return tegijaEesnimi;
    }


    /**
     * Sets the tegijaEesnimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param tegijaEesnimi
     */
    public void setTegijaEesnimi(java.lang.String tegijaEesnimi) {
        this.tegijaEesnimi = tegijaEesnimi;
    }


    /**
     * Gets the tegijaPerenimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return tegijaPerenimi
     */
    public java.lang.String getTegijaPerenimi() {
        return tegijaPerenimi;
    }


    /**
     * Sets the tegijaPerenimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param tegijaPerenimi
     */
    public void setTegijaPerenimi(java.lang.String tegijaPerenimi) {
        this.tegijaPerenimi = tegijaPerenimi;
    }


    /**
     * Gets the tegijaRegistrikood value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return tegijaRegistrikood
     */
    public java.lang.String getTegijaRegistrikood() {
        return tegijaRegistrikood;
    }


    /**
     * Sets the tegijaRegistrikood value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param tegijaRegistrikood
     */
    public void setTegijaRegistrikood(java.lang.String tegijaRegistrikood) {
        this.tegijaRegistrikood = tegijaRegistrikood;
    }


    /**
     * Gets the staatus value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return staatus
     */
    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusStaatus getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param staatus
     */
    public void setStaatus(ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusStaatus staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the failiNimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return failiNimi
     */
    public java.lang.String getFailiNimi() {
        return failiNimi;
    }


    /**
     * Sets the failiNimi value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param failiNimi
     */
    public void setFailiNimi(java.lang.String failiNimi) {
        this.failiNimi = failiNimi;
    }


    /**
     * Gets the failiSisu value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return failiSisu
     */
    public java.lang.String getFailiSisu() {
        return failiSisu;
    }


    /**
     * Sets the failiSisu value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param failiSisu
     */
    public void setFailiSisu(java.lang.String failiSisu) {
        this.failiSisu = failiSisu;
    }


    /**
     * Gets the arhiveerimiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return arhiveerimiseKuupaev
     */
    public java.util.Date getArhiveerimiseKuupaev() {
        return arhiveerimiseKuupaev;
    }


    /**
     * Sets the arhiveerimiseKuupaev value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param arhiveerimiseKuupaev
     */
    public void setArhiveerimiseKuupaev(java.util.Date arhiveerimiseKuupaev) {
        this.arhiveerimiseKuupaev = arhiveerimiseKuupaev;
    }


    /**
     * Gets the ettekirjutuseRida value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return ettekirjutuseRida
     */
    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida[] getEttekirjutuseRida() {
        return ettekirjutuseRida;
    }


    /**
     * Sets the ettekirjutuseRida value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param ettekirjutuseRida
     */
    public void setEttekirjutuseRida(ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida[] ettekirjutuseRida) {
        this.ettekirjutuseRida = ettekirjutuseRida;
    }

    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida getEttekirjutuseRida(int i) {
        return this.ettekirjutuseRida[i];
    }

    public void setEttekirjutuseRida(int i, ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida _value) {
        this.ettekirjutuseRida[i] = _value;
    }


    /**
     * Gets the tegevusala value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @return tegevusala
     */
    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala[] getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this SalvestaEttekirjutusParingEttekirjutus.
     * 
     * @param tegevusala
     */
    public void setTegevusala(ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala[] tegevusala) {
        this.tegevusala = tegevusala;
    }

    public ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala getTegevusala(int i) {
        return this.tegevusala[i];
    }

    public void setTegevusala(int i, ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala _value) {
        this.tegevusala[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaEttekirjutusParingEttekirjutus)) return false;
        SalvestaEttekirjutusParingEttekirjutus other = (SalvestaEttekirjutusParingEttekirjutus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.saajaKood==null && other.getSaajaKood()==null) || 
             (this.saajaKood!=null &&
              this.saajaKood.equals(other.getSaajaKood()))) &&
            ((this.saajaNimi==null && other.getSaajaNimi()==null) || 
             (this.saajaNimi!=null &&
              this.saajaNimi.equals(other.getSaajaNimi()))) &&
            ((this.saajaRiik==null && other.getSaajaRiik()==null) || 
             (this.saajaRiik!=null &&
              this.saajaRiik.equals(other.getSaajaRiik()))) &&
            ((this.tegemiseKuupaev==null && other.getTegemiseKuupaev()==null) || 
             (this.tegemiseKuupaev!=null &&
              this.tegemiseKuupaev.equals(other.getTegemiseKuupaev()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.tegijaIsikukood==null && other.getTegijaIsikukood()==null) || 
             (this.tegijaIsikukood!=null &&
              this.tegijaIsikukood.equals(other.getTegijaIsikukood()))) &&
            ((this.tegijaEesnimi==null && other.getTegijaEesnimi()==null) || 
             (this.tegijaEesnimi!=null &&
              this.tegijaEesnimi.equals(other.getTegijaEesnimi()))) &&
            ((this.tegijaPerenimi==null && other.getTegijaPerenimi()==null) || 
             (this.tegijaPerenimi!=null &&
              this.tegijaPerenimi.equals(other.getTegijaPerenimi()))) &&
            ((this.tegijaRegistrikood==null && other.getTegijaRegistrikood()==null) || 
             (this.tegijaRegistrikood!=null &&
              this.tegijaRegistrikood.equals(other.getTegijaRegistrikood()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.failiNimi==null && other.getFailiNimi()==null) || 
             (this.failiNimi!=null &&
              this.failiNimi.equals(other.getFailiNimi()))) &&
            ((this.failiSisu==null && other.getFailiSisu()==null) || 
             (this.failiSisu!=null &&
              this.failiSisu.equals(other.getFailiSisu()))) &&
            ((this.arhiveerimiseKuupaev==null && other.getArhiveerimiseKuupaev()==null) || 
             (this.arhiveerimiseKuupaev!=null &&
              this.arhiveerimiseKuupaev.equals(other.getArhiveerimiseKuupaev()))) &&
            ((this.ettekirjutuseRida==null && other.getEttekirjutuseRida()==null) || 
             (this.ettekirjutuseRida!=null &&
              java.util.Arrays.equals(this.ettekirjutuseRida, other.getEttekirjutuseRida()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              java.util.Arrays.equals(this.tegevusala, other.getTegevusala())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSaajaKood() != null) {
            _hashCode += getSaajaKood().hashCode();
        }
        if (getSaajaNimi() != null) {
            _hashCode += getSaajaNimi().hashCode();
        }
        if (getSaajaRiik() != null) {
            _hashCode += getSaajaRiik().hashCode();
        }
        if (getTegemiseKuupaev() != null) {
            _hashCode += getTegemiseKuupaev().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getTegijaIsikukood() != null) {
            _hashCode += getTegijaIsikukood().hashCode();
        }
        if (getTegijaEesnimi() != null) {
            _hashCode += getTegijaEesnimi().hashCode();
        }
        if (getTegijaPerenimi() != null) {
            _hashCode += getTegijaPerenimi().hashCode();
        }
        if (getTegijaRegistrikood() != null) {
            _hashCode += getTegijaRegistrikood().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getFailiNimi() != null) {
            _hashCode += getFailiNimi().hashCode();
        }
        if (getFailiSisu() != null) {
            _hashCode += getFailiSisu().hashCode();
        }
        if (getArhiveerimiseKuupaev() != null) {
            _hashCode += getArhiveerimiseKuupaev().hashCode();
        }
        if (getEttekirjutuseRida() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttekirjutuseRida());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttekirjutuseRida(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTegevusala() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusala());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusala(), i);
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
