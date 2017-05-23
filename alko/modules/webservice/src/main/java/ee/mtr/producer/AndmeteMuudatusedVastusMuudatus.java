/**
 * AndmeteMuudatusedVastusMuudatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AndmeteMuudatusedVastusMuudatus  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String number;

    private java.util.Date kehtivAlates;

    private java.lang.String kehtivKuni;

    private java.lang.String staatus;

    private java.lang.String valdkond;

    private java.lang.String tegevusala;

    private java.lang.String[] tegevusalaLiik;

    private java.math.BigInteger ettevotjaId;

    private java.lang.String ettevotjaNimi;

    private java.lang.String ettevotjaRegistrikood;

    private java.lang.String ettevotjaTelefon;

    private java.lang.String ettevotjaMobiil;

    private java.lang.String ettevotjaEpost;

    private java.lang.String ettevotjaPostiaadress;

    private java.lang.String ettevotjaPostiaadressAdsOid;

    private java.lang.String[] emtak;

    private java.util.Date arhiveerimiseKuupaev;

    private java.util.Date taastamiseKuupaev;

    private java.util.Date loobumiseAlguseKuupaev;

    private java.util.Date loobumiseLopuKuupaev;

    private java.util.Date peatamiseAlguseKuupaev;

    private java.util.Date peatamiseLopuKuupaev;

    private ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht[] tegevuskoht;

    private ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik[] isik;

    private ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk[] soiduk;

    private java.lang.String[] kytus;

    public AndmeteMuudatusedVastusMuudatus() {
    }

    public AndmeteMuudatusedVastusMuudatus(
           java.math.BigInteger id,
           java.lang.String number,
           java.util.Date kehtivAlates,
           java.lang.String kehtivKuni,
           java.lang.String staatus,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String[] tegevusalaLiik,
           java.math.BigInteger ettevotjaId,
           java.lang.String ettevotjaNimi,
           java.lang.String ettevotjaRegistrikood,
           java.lang.String ettevotjaTelefon,
           java.lang.String ettevotjaMobiil,
           java.lang.String ettevotjaEpost,
           java.lang.String ettevotjaPostiaadress,
           java.lang.String ettevotjaPostiaadressAdsOid,
           java.lang.String[] emtak,
           java.util.Date arhiveerimiseKuupaev,
           java.util.Date taastamiseKuupaev,
           java.util.Date loobumiseAlguseKuupaev,
           java.util.Date loobumiseLopuKuupaev,
           java.util.Date peatamiseAlguseKuupaev,
           java.util.Date peatamiseLopuKuupaev,
           ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht[] tegevuskoht,
           ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik[] isik,
           ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk[] soiduk,
           java.lang.String[] kytus) {
           this.id = id;
           this.number = number;
           this.kehtivAlates = kehtivAlates;
           this.kehtivKuni = kehtivKuni;
           this.staatus = staatus;
           this.valdkond = valdkond;
           this.tegevusala = tegevusala;
           this.tegevusalaLiik = tegevusalaLiik;
           this.ettevotjaId = ettevotjaId;
           this.ettevotjaNimi = ettevotjaNimi;
           this.ettevotjaRegistrikood = ettevotjaRegistrikood;
           this.ettevotjaTelefon = ettevotjaTelefon;
           this.ettevotjaMobiil = ettevotjaMobiil;
           this.ettevotjaEpost = ettevotjaEpost;
           this.ettevotjaPostiaadress = ettevotjaPostiaadress;
           this.ettevotjaPostiaadressAdsOid = ettevotjaPostiaadressAdsOid;
           this.emtak = emtak;
           this.arhiveerimiseKuupaev = arhiveerimiseKuupaev;
           this.taastamiseKuupaev = taastamiseKuupaev;
           this.loobumiseAlguseKuupaev = loobumiseAlguseKuupaev;
           this.loobumiseLopuKuupaev = loobumiseLopuKuupaev;
           this.peatamiseAlguseKuupaev = peatamiseAlguseKuupaev;
           this.peatamiseLopuKuupaev = peatamiseLopuKuupaev;
           this.tegevuskoht = tegevuskoht;
           this.isik = isik;
           this.soiduk = soiduk;
           this.kytus = kytus;
    }


    /**
     * Gets the id value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the number value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the kehtivAlates value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return kehtivAlates
     */
    public java.util.Date getKehtivAlates() {
        return kehtivAlates;
    }


    /**
     * Sets the kehtivAlates value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param kehtivAlates
     */
    public void setKehtivAlates(java.util.Date kehtivAlates) {
        this.kehtivAlates = kehtivAlates;
    }


    /**
     * Gets the kehtivKuni value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return kehtivKuni
     */
    public java.lang.String getKehtivKuni() {
        return kehtivKuni;
    }


    /**
     * Sets the kehtivKuni value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param kehtivKuni
     */
    public void setKehtivKuni(java.lang.String kehtivKuni) {
        this.kehtivKuni = kehtivKuni;
    }


    /**
     * Gets the staatus value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the valdkond value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return valdkond
     */
    public java.lang.String getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param valdkond
     */
    public void setValdkond(java.lang.String valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the tegevusala value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the tegevusalaLiik value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return tegevusalaLiik
     */
    public java.lang.String[] getTegevusalaLiik() {
        return tegevusalaLiik;
    }


    /**
     * Sets the tegevusalaLiik value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param tegevusalaLiik
     */
    public void setTegevusalaLiik(java.lang.String[] tegevusalaLiik) {
        this.tegevusalaLiik = tegevusalaLiik;
    }

    public java.lang.String getTegevusalaLiik(int i) {
        return this.tegevusalaLiik[i];
    }

    public void setTegevusalaLiik(int i, java.lang.String _value) {
        this.tegevusalaLiik[i] = _value;
    }


    /**
     * Gets the ettevotjaId value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaId
     */
    public java.math.BigInteger getEttevotjaId() {
        return ettevotjaId;
    }


    /**
     * Sets the ettevotjaId value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaId
     */
    public void setEttevotjaId(java.math.BigInteger ettevotjaId) {
        this.ettevotjaId = ettevotjaId;
    }


    /**
     * Gets the ettevotjaNimi value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaNimi
     */
    public java.lang.String getEttevotjaNimi() {
        return ettevotjaNimi;
    }


    /**
     * Sets the ettevotjaNimi value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaNimi
     */
    public void setEttevotjaNimi(java.lang.String ettevotjaNimi) {
        this.ettevotjaNimi = ettevotjaNimi;
    }


    /**
     * Gets the ettevotjaRegistrikood value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaRegistrikood
     */
    public java.lang.String getEttevotjaRegistrikood() {
        return ettevotjaRegistrikood;
    }


    /**
     * Sets the ettevotjaRegistrikood value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaRegistrikood
     */
    public void setEttevotjaRegistrikood(java.lang.String ettevotjaRegistrikood) {
        this.ettevotjaRegistrikood = ettevotjaRegistrikood;
    }


    /**
     * Gets the ettevotjaTelefon value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaTelefon
     */
    public java.lang.String getEttevotjaTelefon() {
        return ettevotjaTelefon;
    }


    /**
     * Sets the ettevotjaTelefon value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaTelefon
     */
    public void setEttevotjaTelefon(java.lang.String ettevotjaTelefon) {
        this.ettevotjaTelefon = ettevotjaTelefon;
    }


    /**
     * Gets the ettevotjaMobiil value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaMobiil
     */
    public java.lang.String getEttevotjaMobiil() {
        return ettevotjaMobiil;
    }


    /**
     * Sets the ettevotjaMobiil value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaMobiil
     */
    public void setEttevotjaMobiil(java.lang.String ettevotjaMobiil) {
        this.ettevotjaMobiil = ettevotjaMobiil;
    }


    /**
     * Gets the ettevotjaEpost value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaEpost
     */
    public java.lang.String getEttevotjaEpost() {
        return ettevotjaEpost;
    }


    /**
     * Sets the ettevotjaEpost value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaEpost
     */
    public void setEttevotjaEpost(java.lang.String ettevotjaEpost) {
        this.ettevotjaEpost = ettevotjaEpost;
    }


    /**
     * Gets the ettevotjaPostiaadress value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaPostiaadress
     */
    public java.lang.String getEttevotjaPostiaadress() {
        return ettevotjaPostiaadress;
    }


    /**
     * Sets the ettevotjaPostiaadress value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaPostiaadress
     */
    public void setEttevotjaPostiaadress(java.lang.String ettevotjaPostiaadress) {
        this.ettevotjaPostiaadress = ettevotjaPostiaadress;
    }


    /**
     * Gets the ettevotjaPostiaadressAdsOid value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return ettevotjaPostiaadressAdsOid
     */
    public java.lang.String getEttevotjaPostiaadressAdsOid() {
        return ettevotjaPostiaadressAdsOid;
    }


    /**
     * Sets the ettevotjaPostiaadressAdsOid value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param ettevotjaPostiaadressAdsOid
     */
    public void setEttevotjaPostiaadressAdsOid(java.lang.String ettevotjaPostiaadressAdsOid) {
        this.ettevotjaPostiaadressAdsOid = ettevotjaPostiaadressAdsOid;
    }


    /**
     * Gets the emtak value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return emtak
     */
    public java.lang.String[] getEmtak() {
        return emtak;
    }


    /**
     * Sets the emtak value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param emtak
     */
    public void setEmtak(java.lang.String[] emtak) {
        this.emtak = emtak;
    }

    public java.lang.String getEmtak(int i) {
        return this.emtak[i];
    }

    public void setEmtak(int i, java.lang.String _value) {
        this.emtak[i] = _value;
    }


    /**
     * Gets the arhiveerimiseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return arhiveerimiseKuupaev
     */
    public java.util.Date getArhiveerimiseKuupaev() {
        return arhiveerimiseKuupaev;
    }


    /**
     * Sets the arhiveerimiseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param arhiveerimiseKuupaev
     */
    public void setArhiveerimiseKuupaev(java.util.Date arhiveerimiseKuupaev) {
        this.arhiveerimiseKuupaev = arhiveerimiseKuupaev;
    }


    /**
     * Gets the taastamiseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return taastamiseKuupaev
     */
    public java.util.Date getTaastamiseKuupaev() {
        return taastamiseKuupaev;
    }


    /**
     * Sets the taastamiseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param taastamiseKuupaev
     */
    public void setTaastamiseKuupaev(java.util.Date taastamiseKuupaev) {
        this.taastamiseKuupaev = taastamiseKuupaev;
    }


    /**
     * Gets the loobumiseAlguseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return loobumiseAlguseKuupaev
     */
    public java.util.Date getLoobumiseAlguseKuupaev() {
        return loobumiseAlguseKuupaev;
    }


    /**
     * Sets the loobumiseAlguseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param loobumiseAlguseKuupaev
     */
    public void setLoobumiseAlguseKuupaev(java.util.Date loobumiseAlguseKuupaev) {
        this.loobumiseAlguseKuupaev = loobumiseAlguseKuupaev;
    }


    /**
     * Gets the loobumiseLopuKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return loobumiseLopuKuupaev
     */
    public java.util.Date getLoobumiseLopuKuupaev() {
        return loobumiseLopuKuupaev;
    }


    /**
     * Sets the loobumiseLopuKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param loobumiseLopuKuupaev
     */
    public void setLoobumiseLopuKuupaev(java.util.Date loobumiseLopuKuupaev) {
        this.loobumiseLopuKuupaev = loobumiseLopuKuupaev;
    }


    /**
     * Gets the peatamiseAlguseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return peatamiseAlguseKuupaev
     */
    public java.util.Date getPeatamiseAlguseKuupaev() {
        return peatamiseAlguseKuupaev;
    }


    /**
     * Sets the peatamiseAlguseKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param peatamiseAlguseKuupaev
     */
    public void setPeatamiseAlguseKuupaev(java.util.Date peatamiseAlguseKuupaev) {
        this.peatamiseAlguseKuupaev = peatamiseAlguseKuupaev;
    }


    /**
     * Gets the peatamiseLopuKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return peatamiseLopuKuupaev
     */
    public java.util.Date getPeatamiseLopuKuupaev() {
        return peatamiseLopuKuupaev;
    }


    /**
     * Sets the peatamiseLopuKuupaev value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param peatamiseLopuKuupaev
     */
    public void setPeatamiseLopuKuupaev(java.util.Date peatamiseLopuKuupaev) {
        this.peatamiseLopuKuupaev = peatamiseLopuKuupaev;
    }


    /**
     * Gets the tegevuskoht value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return tegevuskoht
     */
    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht[] getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht[] tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }

    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht getTegevuskoht(int i) {
        return this.tegevuskoht[i];
    }

    public void setTegevuskoht(int i, ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht _value) {
        this.tegevuskoht[i] = _value;
    }


    /**
     * Gets the isik value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return isik
     */
    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik[] getIsik() {
        return isik;
    }


    /**
     * Sets the isik value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param isik
     */
    public void setIsik(ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik[] isik) {
        this.isik = isik;
    }

    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik getIsik(int i) {
        return this.isik[i];
    }

    public void setIsik(int i, ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik _value) {
        this.isik[i] = _value;
    }


    /**
     * Gets the soiduk value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return soiduk
     */
    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk[] getSoiduk() {
        return soiduk;
    }


    /**
     * Sets the soiduk value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param soiduk
     */
    public void setSoiduk(ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk[] soiduk) {
        this.soiduk = soiduk;
    }

    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk getSoiduk(int i) {
        return this.soiduk[i];
    }

    public void setSoiduk(int i, ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk _value) {
        this.soiduk[i] = _value;
    }


    /**
     * Gets the kytus value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @return kytus
     */
    public java.lang.String[] getKytus() {
        return kytus;
    }


    /**
     * Sets the kytus value for this AndmeteMuudatusedVastusMuudatus.
     * 
     * @param kytus
     */
    public void setKytus(java.lang.String[] kytus) {
        this.kytus = kytus;
    }

    public java.lang.String getKytus(int i) {
        return this.kytus[i];
    }

    public void setKytus(int i, java.lang.String _value) {
        this.kytus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndmeteMuudatusedVastusMuudatus)) return false;
        AndmeteMuudatusedVastusMuudatus other = (AndmeteMuudatusedVastusMuudatus) obj;
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
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.kehtivAlates==null && other.getKehtivAlates()==null) || 
             (this.kehtivAlates!=null &&
              this.kehtivAlates.equals(other.getKehtivAlates()))) &&
            ((this.kehtivKuni==null && other.getKehtivKuni()==null) || 
             (this.kehtivKuni!=null &&
              this.kehtivKuni.equals(other.getKehtivKuni()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.tegevusalaLiik==null && other.getTegevusalaLiik()==null) || 
             (this.tegevusalaLiik!=null &&
              java.util.Arrays.equals(this.tegevusalaLiik, other.getTegevusalaLiik()))) &&
            ((this.ettevotjaId==null && other.getEttevotjaId()==null) || 
             (this.ettevotjaId!=null &&
              this.ettevotjaId.equals(other.getEttevotjaId()))) &&
            ((this.ettevotjaNimi==null && other.getEttevotjaNimi()==null) || 
             (this.ettevotjaNimi!=null &&
              this.ettevotjaNimi.equals(other.getEttevotjaNimi()))) &&
            ((this.ettevotjaRegistrikood==null && other.getEttevotjaRegistrikood()==null) || 
             (this.ettevotjaRegistrikood!=null &&
              this.ettevotjaRegistrikood.equals(other.getEttevotjaRegistrikood()))) &&
            ((this.ettevotjaTelefon==null && other.getEttevotjaTelefon()==null) || 
             (this.ettevotjaTelefon!=null &&
              this.ettevotjaTelefon.equals(other.getEttevotjaTelefon()))) &&
            ((this.ettevotjaMobiil==null && other.getEttevotjaMobiil()==null) || 
             (this.ettevotjaMobiil!=null &&
              this.ettevotjaMobiil.equals(other.getEttevotjaMobiil()))) &&
            ((this.ettevotjaEpost==null && other.getEttevotjaEpost()==null) || 
             (this.ettevotjaEpost!=null &&
              this.ettevotjaEpost.equals(other.getEttevotjaEpost()))) &&
            ((this.ettevotjaPostiaadress==null && other.getEttevotjaPostiaadress()==null) || 
             (this.ettevotjaPostiaadress!=null &&
              this.ettevotjaPostiaadress.equals(other.getEttevotjaPostiaadress()))) &&
            ((this.ettevotjaPostiaadressAdsOid==null && other.getEttevotjaPostiaadressAdsOid()==null) || 
             (this.ettevotjaPostiaadressAdsOid!=null &&
              this.ettevotjaPostiaadressAdsOid.equals(other.getEttevotjaPostiaadressAdsOid()))) &&
            ((this.emtak==null && other.getEmtak()==null) || 
             (this.emtak!=null &&
              java.util.Arrays.equals(this.emtak, other.getEmtak()))) &&
            ((this.arhiveerimiseKuupaev==null && other.getArhiveerimiseKuupaev()==null) || 
             (this.arhiveerimiseKuupaev!=null &&
              this.arhiveerimiseKuupaev.equals(other.getArhiveerimiseKuupaev()))) &&
            ((this.taastamiseKuupaev==null && other.getTaastamiseKuupaev()==null) || 
             (this.taastamiseKuupaev!=null &&
              this.taastamiseKuupaev.equals(other.getTaastamiseKuupaev()))) &&
            ((this.loobumiseAlguseKuupaev==null && other.getLoobumiseAlguseKuupaev()==null) || 
             (this.loobumiseAlguseKuupaev!=null &&
              this.loobumiseAlguseKuupaev.equals(other.getLoobumiseAlguseKuupaev()))) &&
            ((this.loobumiseLopuKuupaev==null && other.getLoobumiseLopuKuupaev()==null) || 
             (this.loobumiseLopuKuupaev!=null &&
              this.loobumiseLopuKuupaev.equals(other.getLoobumiseLopuKuupaev()))) &&
            ((this.peatamiseAlguseKuupaev==null && other.getPeatamiseAlguseKuupaev()==null) || 
             (this.peatamiseAlguseKuupaev!=null &&
              this.peatamiseAlguseKuupaev.equals(other.getPeatamiseAlguseKuupaev()))) &&
            ((this.peatamiseLopuKuupaev==null && other.getPeatamiseLopuKuupaev()==null) || 
             (this.peatamiseLopuKuupaev!=null &&
              this.peatamiseLopuKuupaev.equals(other.getPeatamiseLopuKuupaev()))) &&
            ((this.tegevuskoht==null && other.getTegevuskoht()==null) || 
             (this.tegevuskoht!=null &&
              java.util.Arrays.equals(this.tegevuskoht, other.getTegevuskoht()))) &&
            ((this.isik==null && other.getIsik()==null) || 
             (this.isik!=null &&
              java.util.Arrays.equals(this.isik, other.getIsik()))) &&
            ((this.soiduk==null && other.getSoiduk()==null) || 
             (this.soiduk!=null &&
              java.util.Arrays.equals(this.soiduk, other.getSoiduk()))) &&
            ((this.kytus==null && other.getKytus()==null) || 
             (this.kytus!=null &&
              java.util.Arrays.equals(this.kytus, other.getKytus())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getKehtivAlates() != null) {
            _hashCode += getKehtivAlates().hashCode();
        }
        if (getKehtivKuni() != null) {
            _hashCode += getKehtivKuni().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTegevusalaLiik() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusalaLiik());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusalaLiik(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEttevotjaId() != null) {
            _hashCode += getEttevotjaId().hashCode();
        }
        if (getEttevotjaNimi() != null) {
            _hashCode += getEttevotjaNimi().hashCode();
        }
        if (getEttevotjaRegistrikood() != null) {
            _hashCode += getEttevotjaRegistrikood().hashCode();
        }
        if (getEttevotjaTelefon() != null) {
            _hashCode += getEttevotjaTelefon().hashCode();
        }
        if (getEttevotjaMobiil() != null) {
            _hashCode += getEttevotjaMobiil().hashCode();
        }
        if (getEttevotjaEpost() != null) {
            _hashCode += getEttevotjaEpost().hashCode();
        }
        if (getEttevotjaPostiaadress() != null) {
            _hashCode += getEttevotjaPostiaadress().hashCode();
        }
        if (getEttevotjaPostiaadressAdsOid() != null) {
            _hashCode += getEttevotjaPostiaadressAdsOid().hashCode();
        }
        if (getEmtak() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmtak());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmtak(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArhiveerimiseKuupaev() != null) {
            _hashCode += getArhiveerimiseKuupaev().hashCode();
        }
        if (getTaastamiseKuupaev() != null) {
            _hashCode += getTaastamiseKuupaev().hashCode();
        }
        if (getLoobumiseAlguseKuupaev() != null) {
            _hashCode += getLoobumiseAlguseKuupaev().hashCode();
        }
        if (getLoobumiseLopuKuupaev() != null) {
            _hashCode += getLoobumiseLopuKuupaev().hashCode();
        }
        if (getPeatamiseAlguseKuupaev() != null) {
            _hashCode += getPeatamiseAlguseKuupaev().hashCode();
        }
        if (getPeatamiseLopuKuupaev() != null) {
            _hashCode += getPeatamiseLopuKuupaev().hashCode();
        }
        if (getTegevuskoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskoht(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsik() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsik());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsik(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoiduk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoiduk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoiduk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKytus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKytus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKytus(), i);
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
