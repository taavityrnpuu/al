/**
 * SalvestatavTaotlus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestatavTaotlus  implements java.io.Serializable {
    private java.math.BigInteger ID;

    private java.math.BigInteger vormiVersioonID;

    private java.lang.Boolean kehtivAlatesValjastamisest;

    private java.util.Date kehtivAlates;

    private java.lang.Boolean kehtivKuniVaikimisi;

    private java.util.Date kehtivKuni;

    private java.math.BigInteger kehtivusePerioodID;

    private java.lang.String taotlejaKommentaar;

    private java.lang.String esitajaTelefon;

    private java.lang.String esitajaEpost;

    private boolean esitamine;

    private java.lang.Object elemendid;

    public SalvestatavTaotlus() {
    }

    public SalvestatavTaotlus(
           java.math.BigInteger ID,
           java.math.BigInteger vormiVersioonID,
           java.lang.Boolean kehtivAlatesValjastamisest,
           java.util.Date kehtivAlates,
           java.lang.Boolean kehtivKuniVaikimisi,
           java.util.Date kehtivKuni,
           java.math.BigInteger kehtivusePerioodID,
           java.lang.String taotlejaKommentaar,
           java.lang.String esitajaTelefon,
           java.lang.String esitajaEpost,
           boolean esitamine,
           java.lang.Object elemendid) {
           this.ID = ID;
           this.vormiVersioonID = vormiVersioonID;
           this.kehtivAlatesValjastamisest = kehtivAlatesValjastamisest;
           this.kehtivAlates = kehtivAlates;
           this.kehtivKuniVaikimisi = kehtivKuniVaikimisi;
           this.kehtivKuni = kehtivKuni;
           this.kehtivusePerioodID = kehtivusePerioodID;
           this.taotlejaKommentaar = taotlejaKommentaar;
           this.esitajaTelefon = esitajaTelefon;
           this.esitajaEpost = esitajaEpost;
           this.esitamine = esitamine;
           this.elemendid = elemendid;
    }


    /**
     * Gets the ID value for this SalvestatavTaotlus.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SalvestatavTaotlus.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the vormiVersioonID value for this SalvestatavTaotlus.
     * 
     * @return vormiVersioonID
     */
    public java.math.BigInteger getVormiVersioonID() {
        return vormiVersioonID;
    }


    /**
     * Sets the vormiVersioonID value for this SalvestatavTaotlus.
     * 
     * @param vormiVersioonID
     */
    public void setVormiVersioonID(java.math.BigInteger vormiVersioonID) {
        this.vormiVersioonID = vormiVersioonID;
    }


    /**
     * Gets the kehtivAlatesValjastamisest value for this SalvestatavTaotlus.
     * 
     * @return kehtivAlatesValjastamisest
     */
    public java.lang.Boolean getKehtivAlatesValjastamisest() {
        return kehtivAlatesValjastamisest;
    }


    /**
     * Sets the kehtivAlatesValjastamisest value for this SalvestatavTaotlus.
     * 
     * @param kehtivAlatesValjastamisest
     */
    public void setKehtivAlatesValjastamisest(java.lang.Boolean kehtivAlatesValjastamisest) {
        this.kehtivAlatesValjastamisest = kehtivAlatesValjastamisest;
    }


    /**
     * Gets the kehtivAlates value for this SalvestatavTaotlus.
     * 
     * @return kehtivAlates
     */
    public java.util.Date getKehtivAlates() {
        return kehtivAlates;
    }


    /**
     * Sets the kehtivAlates value for this SalvestatavTaotlus.
     * 
     * @param kehtivAlates
     */
    public void setKehtivAlates(java.util.Date kehtivAlates) {
        this.kehtivAlates = kehtivAlates;
    }


    /**
     * Gets the kehtivKuniVaikimisi value for this SalvestatavTaotlus.
     * 
     * @return kehtivKuniVaikimisi
     */
    public java.lang.Boolean getKehtivKuniVaikimisi() {
        return kehtivKuniVaikimisi;
    }


    /**
     * Sets the kehtivKuniVaikimisi value for this SalvestatavTaotlus.
     * 
     * @param kehtivKuniVaikimisi
     */
    public void setKehtivKuniVaikimisi(java.lang.Boolean kehtivKuniVaikimisi) {
        this.kehtivKuniVaikimisi = kehtivKuniVaikimisi;
    }


    /**
     * Gets the kehtivKuni value for this SalvestatavTaotlus.
     * 
     * @return kehtivKuni
     */
    public java.util.Date getKehtivKuni() {
        return kehtivKuni;
    }


    /**
     * Sets the kehtivKuni value for this SalvestatavTaotlus.
     * 
     * @param kehtivKuni
     */
    public void setKehtivKuni(java.util.Date kehtivKuni) {
        this.kehtivKuni = kehtivKuni;
    }


    /**
     * Gets the kehtivusePerioodID value for this SalvestatavTaotlus.
     * 
     * @return kehtivusePerioodID
     */
    public java.math.BigInteger getKehtivusePerioodID() {
        return kehtivusePerioodID;
    }


    /**
     * Sets the kehtivusePerioodID value for this SalvestatavTaotlus.
     * 
     * @param kehtivusePerioodID
     */
    public void setKehtivusePerioodID(java.math.BigInteger kehtivusePerioodID) {
        this.kehtivusePerioodID = kehtivusePerioodID;
    }


    /**
     * Gets the taotlejaKommentaar value for this SalvestatavTaotlus.
     * 
     * @return taotlejaKommentaar
     */
    public java.lang.String getTaotlejaKommentaar() {
        return taotlejaKommentaar;
    }


    /**
     * Sets the taotlejaKommentaar value for this SalvestatavTaotlus.
     * 
     * @param taotlejaKommentaar
     */
    public void setTaotlejaKommentaar(java.lang.String taotlejaKommentaar) {
        this.taotlejaKommentaar = taotlejaKommentaar;
    }


    /**
     * Gets the esitajaTelefon value for this SalvestatavTaotlus.
     * 
     * @return esitajaTelefon
     */
    public java.lang.String getEsitajaTelefon() {
        return esitajaTelefon;
    }


    /**
     * Sets the esitajaTelefon value for this SalvestatavTaotlus.
     * 
     * @param esitajaTelefon
     */
    public void setEsitajaTelefon(java.lang.String esitajaTelefon) {
        this.esitajaTelefon = esitajaTelefon;
    }


    /**
     * Gets the esitajaEpost value for this SalvestatavTaotlus.
     * 
     * @return esitajaEpost
     */
    public java.lang.String getEsitajaEpost() {
        return esitajaEpost;
    }


    /**
     * Sets the esitajaEpost value for this SalvestatavTaotlus.
     * 
     * @param esitajaEpost
     */
    public void setEsitajaEpost(java.lang.String esitajaEpost) {
        this.esitajaEpost = esitajaEpost;
    }


    /**
     * Gets the esitamine value for this SalvestatavTaotlus.
     * 
     * @return esitamine
     */
    public boolean isEsitamine() {
        return esitamine;
    }


    /**
     * Sets the esitamine value for this SalvestatavTaotlus.
     * 
     * @param esitamine
     */
    public void setEsitamine(boolean esitamine) {
        this.esitamine = esitamine;
    }


    /**
     * Gets the elemendid value for this SalvestatavTaotlus.
     * 
     * @return elemendid
     */
    public java.lang.Object getElemendid() {
        return elemendid;
    }


    /**
     * Sets the elemendid value for this SalvestatavTaotlus.
     * 
     * @param elemendid
     */
    public void setElemendid(java.lang.Object elemendid) {
        this.elemendid = elemendid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestatavTaotlus)) return false;
        SalvestatavTaotlus other = (SalvestatavTaotlus) obj;
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
            this.esitamine == other.isEsitamine() &&
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
        _hashCode += (isEsitamine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getElemendid() != null) {
            _hashCode += getElemendid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
