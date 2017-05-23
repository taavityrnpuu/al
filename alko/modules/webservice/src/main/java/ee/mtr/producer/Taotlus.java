/**
 * Taotlus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Taotlus  implements java.io.Serializable {
    private java.math.BigInteger ID;

    private java.math.BigInteger vormiVersioonID;

    private java.lang.String ettevotjaNimi;

    private java.lang.String ettevotjaKood;

    private java.util.Calendar sisestamiseAeg;

    private java.lang.String number;

    private java.util.Calendar esitamiseAeg;

    private java.util.Date menetluseTahtaeg;

    private java.lang.String tegevusala;

    private java.lang.String tulemus;

    private java.lang.String staatus;

    private java.lang.Boolean kehtivAlatesValjastamisest;

    private java.util.Date kehtivAlates;

    private java.lang.Boolean kehtivKuniVaikimisi;

    private java.util.Date kehtivKuni;

    private java.math.BigInteger kehtivusePerioodID;

    private java.lang.String taotlejaKommentaar;

    private java.lang.String esitajaTelefon;

    private java.lang.String esitajaEpost;

    private java.lang.String vaatamiseLink;

    private java.lang.String muutmiseLink;

    private boolean muutmine;

    private java.lang.Object elemendid;

    public Taotlus() {
    }

    public Taotlus(
           java.math.BigInteger ID,
           java.math.BigInteger vormiVersioonID,
           java.lang.String ettevotjaNimi,
           java.lang.String ettevotjaKood,
           java.util.Calendar sisestamiseAeg,
           java.lang.String number,
           java.util.Calendar esitamiseAeg,
           java.util.Date menetluseTahtaeg,
           java.lang.String tegevusala,
           java.lang.String tulemus,
           java.lang.String staatus,
           java.lang.Boolean kehtivAlatesValjastamisest,
           java.util.Date kehtivAlates,
           java.lang.Boolean kehtivKuniVaikimisi,
           java.util.Date kehtivKuni,
           java.math.BigInteger kehtivusePerioodID,
           java.lang.String taotlejaKommentaar,
           java.lang.String esitajaTelefon,
           java.lang.String esitajaEpost,
           java.lang.String vaatamiseLink,
           java.lang.String muutmiseLink,
           boolean muutmine,
           java.lang.Object elemendid) {
           this.ID = ID;
           this.vormiVersioonID = vormiVersioonID;
           this.ettevotjaNimi = ettevotjaNimi;
           this.ettevotjaKood = ettevotjaKood;
           this.sisestamiseAeg = sisestamiseAeg;
           this.number = number;
           this.esitamiseAeg = esitamiseAeg;
           this.menetluseTahtaeg = menetluseTahtaeg;
           this.tegevusala = tegevusala;
           this.tulemus = tulemus;
           this.staatus = staatus;
           this.kehtivAlatesValjastamisest = kehtivAlatesValjastamisest;
           this.kehtivAlates = kehtivAlates;
           this.kehtivKuniVaikimisi = kehtivKuniVaikimisi;
           this.kehtivKuni = kehtivKuni;
           this.kehtivusePerioodID = kehtivusePerioodID;
           this.taotlejaKommentaar = taotlejaKommentaar;
           this.esitajaTelefon = esitajaTelefon;
           this.esitajaEpost = esitajaEpost;
           this.vaatamiseLink = vaatamiseLink;
           this.muutmiseLink = muutmiseLink;
           this.muutmine = muutmine;
           this.elemendid = elemendid;
    }


    /**
     * Gets the ID value for this Taotlus.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Taotlus.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the vormiVersioonID value for this Taotlus.
     * 
     * @return vormiVersioonID
     */
    public java.math.BigInteger getVormiVersioonID() {
        return vormiVersioonID;
    }


    /**
     * Sets the vormiVersioonID value for this Taotlus.
     * 
     * @param vormiVersioonID
     */
    public void setVormiVersioonID(java.math.BigInteger vormiVersioonID) {
        this.vormiVersioonID = vormiVersioonID;
    }


    /**
     * Gets the ettevotjaNimi value for this Taotlus.
     * 
     * @return ettevotjaNimi
     */
    public java.lang.String getEttevotjaNimi() {
        return ettevotjaNimi;
    }


    /**
     * Sets the ettevotjaNimi value for this Taotlus.
     * 
     * @param ettevotjaNimi
     */
    public void setEttevotjaNimi(java.lang.String ettevotjaNimi) {
        this.ettevotjaNimi = ettevotjaNimi;
    }


    /**
     * Gets the ettevotjaKood value for this Taotlus.
     * 
     * @return ettevotjaKood
     */
    public java.lang.String getEttevotjaKood() {
        return ettevotjaKood;
    }


    /**
     * Sets the ettevotjaKood value for this Taotlus.
     * 
     * @param ettevotjaKood
     */
    public void setEttevotjaKood(java.lang.String ettevotjaKood) {
        this.ettevotjaKood = ettevotjaKood;
    }


    /**
     * Gets the sisestamiseAeg value for this Taotlus.
     * 
     * @return sisestamiseAeg
     */
    public java.util.Calendar getSisestamiseAeg() {
        return sisestamiseAeg;
    }


    /**
     * Sets the sisestamiseAeg value for this Taotlus.
     * 
     * @param sisestamiseAeg
     */
    public void setSisestamiseAeg(java.util.Calendar sisestamiseAeg) {
        this.sisestamiseAeg = sisestamiseAeg;
    }


    /**
     * Gets the number value for this Taotlus.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Taotlus.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the esitamiseAeg value for this Taotlus.
     * 
     * @return esitamiseAeg
     */
    public java.util.Calendar getEsitamiseAeg() {
        return esitamiseAeg;
    }


    /**
     * Sets the esitamiseAeg value for this Taotlus.
     * 
     * @param esitamiseAeg
     */
    public void setEsitamiseAeg(java.util.Calendar esitamiseAeg) {
        this.esitamiseAeg = esitamiseAeg;
    }


    /**
     * Gets the menetluseTahtaeg value for this Taotlus.
     * 
     * @return menetluseTahtaeg
     */
    public java.util.Date getMenetluseTahtaeg() {
        return menetluseTahtaeg;
    }


    /**
     * Sets the menetluseTahtaeg value for this Taotlus.
     * 
     * @param menetluseTahtaeg
     */
    public void setMenetluseTahtaeg(java.util.Date menetluseTahtaeg) {
        this.menetluseTahtaeg = menetluseTahtaeg;
    }


    /**
     * Gets the tegevusala value for this Taotlus.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this Taotlus.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the tulemus value for this Taotlus.
     * 
     * @return tulemus
     */
    public java.lang.String getTulemus() {
        return tulemus;
    }


    /**
     * Sets the tulemus value for this Taotlus.
     * 
     * @param tulemus
     */
    public void setTulemus(java.lang.String tulemus) {
        this.tulemus = tulemus;
    }


    /**
     * Gets the staatus value for this Taotlus.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Taotlus.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the kehtivAlatesValjastamisest value for this Taotlus.
     * 
     * @return kehtivAlatesValjastamisest
     */
    public java.lang.Boolean getKehtivAlatesValjastamisest() {
        return kehtivAlatesValjastamisest;
    }


    /**
     * Sets the kehtivAlatesValjastamisest value for this Taotlus.
     * 
     * @param kehtivAlatesValjastamisest
     */
    public void setKehtivAlatesValjastamisest(java.lang.Boolean kehtivAlatesValjastamisest) {
        this.kehtivAlatesValjastamisest = kehtivAlatesValjastamisest;
    }


    /**
     * Gets the kehtivAlates value for this Taotlus.
     * 
     * @return kehtivAlates
     */
    public java.util.Date getKehtivAlates() {
        return kehtivAlates;
    }


    /**
     * Sets the kehtivAlates value for this Taotlus.
     * 
     * @param kehtivAlates
     */
    public void setKehtivAlates(java.util.Date kehtivAlates) {
        this.kehtivAlates = kehtivAlates;
    }


    /**
     * Gets the kehtivKuniVaikimisi value for this Taotlus.
     * 
     * @return kehtivKuniVaikimisi
     */
    public java.lang.Boolean getKehtivKuniVaikimisi() {
        return kehtivKuniVaikimisi;
    }


    /**
     * Sets the kehtivKuniVaikimisi value for this Taotlus.
     * 
     * @param kehtivKuniVaikimisi
     */
    public void setKehtivKuniVaikimisi(java.lang.Boolean kehtivKuniVaikimisi) {
        this.kehtivKuniVaikimisi = kehtivKuniVaikimisi;
    }


    /**
     * Gets the kehtivKuni value for this Taotlus.
     * 
     * @return kehtivKuni
     */
    public java.util.Date getKehtivKuni() {
        return kehtivKuni;
    }


    /**
     * Sets the kehtivKuni value for this Taotlus.
     * 
     * @param kehtivKuni
     */
    public void setKehtivKuni(java.util.Date kehtivKuni) {
        this.kehtivKuni = kehtivKuni;
    }


    /**
     * Gets the kehtivusePerioodID value for this Taotlus.
     * 
     * @return kehtivusePerioodID
     */
    public java.math.BigInteger getKehtivusePerioodID() {
        return kehtivusePerioodID;
    }


    /**
     * Sets the kehtivusePerioodID value for this Taotlus.
     * 
     * @param kehtivusePerioodID
     */
    public void setKehtivusePerioodID(java.math.BigInteger kehtivusePerioodID) {
        this.kehtivusePerioodID = kehtivusePerioodID;
    }


    /**
     * Gets the taotlejaKommentaar value for this Taotlus.
     * 
     * @return taotlejaKommentaar
     */
    public java.lang.String getTaotlejaKommentaar() {
        return taotlejaKommentaar;
    }


    /**
     * Sets the taotlejaKommentaar value for this Taotlus.
     * 
     * @param taotlejaKommentaar
     */
    public void setTaotlejaKommentaar(java.lang.String taotlejaKommentaar) {
        this.taotlejaKommentaar = taotlejaKommentaar;
    }


    /**
     * Gets the esitajaTelefon value for this Taotlus.
     * 
     * @return esitajaTelefon
     */
    public java.lang.String getEsitajaTelefon() {
        return esitajaTelefon;
    }


    /**
     * Sets the esitajaTelefon value for this Taotlus.
     * 
     * @param esitajaTelefon
     */
    public void setEsitajaTelefon(java.lang.String esitajaTelefon) {
        this.esitajaTelefon = esitajaTelefon;
    }


    /**
     * Gets the esitajaEpost value for this Taotlus.
     * 
     * @return esitajaEpost
     */
    public java.lang.String getEsitajaEpost() {
        return esitajaEpost;
    }


    /**
     * Sets the esitajaEpost value for this Taotlus.
     * 
     * @param esitajaEpost
     */
    public void setEsitajaEpost(java.lang.String esitajaEpost) {
        this.esitajaEpost = esitajaEpost;
    }


    /**
     * Gets the vaatamiseLink value for this Taotlus.
     * 
     * @return vaatamiseLink
     */
    public java.lang.String getVaatamiseLink() {
        return vaatamiseLink;
    }


    /**
     * Sets the vaatamiseLink value for this Taotlus.
     * 
     * @param vaatamiseLink
     */
    public void setVaatamiseLink(java.lang.String vaatamiseLink) {
        this.vaatamiseLink = vaatamiseLink;
    }


    /**
     * Gets the muutmiseLink value for this Taotlus.
     * 
     * @return muutmiseLink
     */
    public java.lang.String getMuutmiseLink() {
        return muutmiseLink;
    }


    /**
     * Sets the muutmiseLink value for this Taotlus.
     * 
     * @param muutmiseLink
     */
    public void setMuutmiseLink(java.lang.String muutmiseLink) {
        this.muutmiseLink = muutmiseLink;
    }


    /**
     * Gets the muutmine value for this Taotlus.
     * 
     * @return muutmine
     */
    public boolean isMuutmine() {
        return muutmine;
    }


    /**
     * Sets the muutmine value for this Taotlus.
     * 
     * @param muutmine
     */
    public void setMuutmine(boolean muutmine) {
        this.muutmine = muutmine;
    }


    /**
     * Gets the elemendid value for this Taotlus.
     * 
     * @return elemendid
     */
    public java.lang.Object getElemendid() {
        return elemendid;
    }


    /**
     * Sets the elemendid value for this Taotlus.
     * 
     * @param elemendid
     */
    public void setElemendid(java.lang.Object elemendid) {
        this.elemendid = elemendid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taotlus)) return false;
        Taotlus other = (Taotlus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.vormiVersioonID==null && other.getVormiVersioonID()==null) || 
             (this.vormiVersioonID!=null &&
              this.vormiVersioonID.equals(other.getVormiVersioonID()))) &&
            ((this.ettevotjaNimi==null && other.getEttevotjaNimi()==null) || 
             (this.ettevotjaNimi!=null &&
              this.ettevotjaNimi.equals(other.getEttevotjaNimi()))) &&
            ((this.ettevotjaKood==null && other.getEttevotjaKood()==null) || 
             (this.ettevotjaKood!=null &&
              this.ettevotjaKood.equals(other.getEttevotjaKood()))) &&
            ((this.sisestamiseAeg==null && other.getSisestamiseAeg()==null) || 
             (this.sisestamiseAeg!=null &&
              this.sisestamiseAeg.equals(other.getSisestamiseAeg()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.esitamiseAeg==null && other.getEsitamiseAeg()==null) || 
             (this.esitamiseAeg!=null &&
              this.esitamiseAeg.equals(other.getEsitamiseAeg()))) &&
            ((this.menetluseTahtaeg==null && other.getMenetluseTahtaeg()==null) || 
             (this.menetluseTahtaeg!=null &&
              this.menetluseTahtaeg.equals(other.getMenetluseTahtaeg()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.tulemus==null && other.getTulemus()==null) || 
             (this.tulemus!=null &&
              this.tulemus.equals(other.getTulemus()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.kehtivAlatesValjastamisest==null && other.getKehtivAlatesValjastamisest()==null) || 
             (this.kehtivAlatesValjastamisest!=null &&
              this.kehtivAlatesValjastamisest.equals(other.getKehtivAlatesValjastamisest()))) &&
            ((this.kehtivAlates==null && other.getKehtivAlates()==null) || 
             (this.kehtivAlates!=null &&
              this.kehtivAlates.equals(other.getKehtivAlates()))) &&
            ((this.kehtivKuniVaikimisi==null && other.getKehtivKuniVaikimisi()==null) || 
             (this.kehtivKuniVaikimisi!=null &&
              this.kehtivKuniVaikimisi.equals(other.getKehtivKuniVaikimisi()))) &&
            ((this.kehtivKuni==null && other.getKehtivKuni()==null) || 
             (this.kehtivKuni!=null &&
              this.kehtivKuni.equals(other.getKehtivKuni()))) &&
            ((this.kehtivusePerioodID==null && other.getKehtivusePerioodID()==null) || 
             (this.kehtivusePerioodID!=null &&
              this.kehtivusePerioodID.equals(other.getKehtivusePerioodID()))) &&
            ((this.taotlejaKommentaar==null && other.getTaotlejaKommentaar()==null) || 
             (this.taotlejaKommentaar!=null &&
              this.taotlejaKommentaar.equals(other.getTaotlejaKommentaar()))) &&
            ((this.esitajaTelefon==null && other.getEsitajaTelefon()==null) || 
             (this.esitajaTelefon!=null &&
              this.esitajaTelefon.equals(other.getEsitajaTelefon()))) &&
            ((this.esitajaEpost==null && other.getEsitajaEpost()==null) || 
             (this.esitajaEpost!=null &&
              this.esitajaEpost.equals(other.getEsitajaEpost()))) &&
            ((this.vaatamiseLink==null && other.getVaatamiseLink()==null) || 
             (this.vaatamiseLink!=null &&
              this.vaatamiseLink.equals(other.getVaatamiseLink()))) &&
            ((this.muutmiseLink==null && other.getMuutmiseLink()==null) || 
             (this.muutmiseLink!=null &&
              this.muutmiseLink.equals(other.getMuutmiseLink()))) &&
            this.muutmine == other.isMuutmine() &&
            ((this.elemendid==null && other.getElemendid()==null) || 
             (this.elemendid!=null &&
              this.elemendid.equals(other.getElemendid())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getVormiVersioonID() != null) {
            _hashCode += getVormiVersioonID().hashCode();
        }
        if (getEttevotjaNimi() != null) {
            _hashCode += getEttevotjaNimi().hashCode();
        }
        if (getEttevotjaKood() != null) {
            _hashCode += getEttevotjaKood().hashCode();
        }
        if (getSisestamiseAeg() != null) {
            _hashCode += getSisestamiseAeg().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getEsitamiseAeg() != null) {
            _hashCode += getEsitamiseAeg().hashCode();
        }
        if (getMenetluseTahtaeg() != null) {
            _hashCode += getMenetluseTahtaeg().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTulemus() != null) {
            _hashCode += getTulemus().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getKehtivAlatesValjastamisest() != null) {
            _hashCode += getKehtivAlatesValjastamisest().hashCode();
        }
        if (getKehtivAlates() != null) {
            _hashCode += getKehtivAlates().hashCode();
        }
        if (getKehtivKuniVaikimisi() != null) {
            _hashCode += getKehtivKuniVaikimisi().hashCode();
        }
        if (getKehtivKuni() != null) {
            _hashCode += getKehtivKuni().hashCode();
        }
        if (getKehtivusePerioodID() != null) {
            _hashCode += getKehtivusePerioodID().hashCode();
        }
        if (getTaotlejaKommentaar() != null) {
            _hashCode += getTaotlejaKommentaar().hashCode();
        }
        if (getEsitajaTelefon() != null) {
            _hashCode += getEsitajaTelefon().hashCode();
        }
        if (getEsitajaEpost() != null) {
            _hashCode += getEsitajaEpost().hashCode();
        }
        if (getVaatamiseLink() != null) {
            _hashCode += getVaatamiseLink().hashCode();
        }
        if (getMuutmiseLink() != null) {
            _hashCode += getMuutmiseLink().hashCode();
        }
        _hashCode += (isMuutmine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getElemendid() != null) {
            _hashCode += getElemendid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
