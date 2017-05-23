/**
 * TaotluseIsik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseIsik  implements java.io.Serializable {
    private java.lang.String isikukood;

    private java.lang.String nimi;

    private java.lang.String telefon;

    private java.lang.String epost;

    public TaotluseIsik() {
    }

    public TaotluseIsik(
           java.lang.String isikukood,
           java.lang.String nimi,
           java.lang.String telefon,
           java.lang.String epost) {
           this.isikukood = isikukood;
           this.nimi = nimi;
           this.telefon = telefon;
           this.epost = epost;
    }


    /**
     * Gets the isikukood value for this TaotluseIsik.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this TaotluseIsik.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the nimi value for this TaotluseIsik.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseIsik.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the telefon value for this TaotluseIsik.
     * 
     * @return telefon
     */
    public java.lang.String getTelefon() {
        return telefon;
    }


    /**
     * Sets the telefon value for this TaotluseIsik.
     * 
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }


    /**
     * Gets the epost value for this TaotluseIsik.
     * 
     * @return epost
     */
    public java.lang.String getEpost() {
        return epost;
    }


    /**
     * Sets the epost value for this TaotluseIsik.
     * 
     * @param epost
     */
    public void setEpost(java.lang.String epost) {
        this.epost = epost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseIsik)) return false;
        TaotluseIsik other = (TaotluseIsik) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
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
