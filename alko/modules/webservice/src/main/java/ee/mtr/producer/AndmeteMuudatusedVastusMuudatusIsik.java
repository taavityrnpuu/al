/**
 * AndmeteMuudatusedVastusMuudatusIsik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AndmeteMuudatusedVastusMuudatusIsik  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String isikukood;

    private java.lang.String eesnimi;

    private java.lang.String perenimi;

    private java.util.Date synnipaev;

    private java.lang.String riik;

    private java.lang.String telefon;

    private java.lang.String epost;

    public AndmeteMuudatusedVastusMuudatusIsik() {
    }

    public AndmeteMuudatusedVastusMuudatusIsik(
           java.math.BigInteger id,
           java.lang.String isikukood,
           java.lang.String eesnimi,
           java.lang.String perenimi,
           java.util.Date synnipaev,
           java.lang.String riik,
           java.lang.String telefon,
           java.lang.String epost) {
           this.id = id;
           this.isikukood = isikukood;
           this.eesnimi = eesnimi;
           this.perenimi = perenimi;
           this.synnipaev = synnipaev;
           this.riik = riik;
           this.telefon = telefon;
           this.epost = epost;
    }


    /**
     * Gets the id value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the isikukood value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the eesnimi value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the perenimi value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return perenimi
     */
    public java.lang.String getPerenimi() {
        return perenimi;
    }


    /**
     * Sets the perenimi value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param perenimi
     */
    public void setPerenimi(java.lang.String perenimi) {
        this.perenimi = perenimi;
    }


    /**
     * Gets the synnipaev value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return synnipaev
     */
    public java.util.Date getSynnipaev() {
        return synnipaev;
    }


    /**
     * Sets the synnipaev value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param synnipaev
     */
    public void setSynnipaev(java.util.Date synnipaev) {
        this.synnipaev = synnipaev;
    }


    /**
     * Gets the riik value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return riik
     */
    public java.lang.String getRiik() {
        return riik;
    }


    /**
     * Sets the riik value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param riik
     */
    public void setRiik(java.lang.String riik) {
        this.riik = riik;
    }


    /**
     * Gets the telefon value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return telefon
     */
    public java.lang.String getTelefon() {
        return telefon;
    }


    /**
     * Sets the telefon value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }


    /**
     * Gets the epost value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @return epost
     */
    public java.lang.String getEpost() {
        return epost;
    }


    /**
     * Sets the epost value for this AndmeteMuudatusedVastusMuudatusIsik.
     * 
     * @param epost
     */
    public void setEpost(java.lang.String epost) {
        this.epost = epost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndmeteMuudatusedVastusMuudatusIsik)) return false;
        AndmeteMuudatusedVastusMuudatusIsik other = (AndmeteMuudatusedVastusMuudatusIsik) obj;
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
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.perenimi==null && other.getPerenimi()==null) || 
             (this.perenimi!=null &&
              this.perenimi.equals(other.getPerenimi()))) &&
            ((this.synnipaev==null && other.getSynnipaev()==null) || 
             (this.synnipaev!=null &&
              this.synnipaev.equals(other.getSynnipaev()))) &&
            ((this.riik==null && other.getRiik()==null) || 
             (this.riik!=null &&
              this.riik.equals(other.getRiik()))) &&
            ((this.telefon==null && other.getTelefon()==null) || 
             (this.telefon!=null &&
              this.telefon.equals(other.getTelefon()))) &&
            ((this.epost==null && other.getEpost()==null) || 
             (this.epost!=null &&
              this.epost.equals(other.getEpost())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getPerenimi() != null) {
            _hashCode += getPerenimi().hashCode();
        }
        if (getSynnipaev() != null) {
            _hashCode += getSynnipaev().hashCode();
        }
        if (getRiik() != null) {
            _hashCode += getRiik().hashCode();
        }
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        if (getEpost() != null) {
            _hashCode += getEpost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
