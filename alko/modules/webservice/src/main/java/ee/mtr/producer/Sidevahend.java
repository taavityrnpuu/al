/**
 * Sidevahend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Sidevahend  implements java.io.Serializable {
    private java.lang.String telefon;

    private java.lang.String faks;

    private java.lang.String epost;

    private java.lang.String veebiaadress;

    public Sidevahend() {
    }

    public Sidevahend(
           java.lang.String telefon,
           java.lang.String faks,
           java.lang.String epost,
           java.lang.String veebiaadress) {
           this.telefon = telefon;
           this.faks = faks;
           this.epost = epost;
           this.veebiaadress = veebiaadress;
    }


    /**
     * Gets the telefon value for this Sidevahend.
     * 
     * @return telefon
     */
    public java.lang.String getTelefon() {
        return telefon;
    }


    /**
     * Sets the telefon value for this Sidevahend.
     * 
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }


    /**
     * Gets the faks value for this Sidevahend.
     * 
     * @return faks
     */
    public java.lang.String getFaks() {
        return faks;
    }


    /**
     * Sets the faks value for this Sidevahend.
     * 
     * @param faks
     */
    public void setFaks(java.lang.String faks) {
        this.faks = faks;
    }


    /**
     * Gets the epost value for this Sidevahend.
     * 
     * @return epost
     */
    public java.lang.String getEpost() {
        return epost;
    }


    /**
     * Sets the epost value for this Sidevahend.
     * 
     * @param epost
     */
    public void setEpost(java.lang.String epost) {
        this.epost = epost;
    }


    /**
     * Gets the veebiaadress value for this Sidevahend.
     * 
     * @return veebiaadress
     */
    public java.lang.String getVeebiaadress() {
        return veebiaadress;
    }


    /**
     * Sets the veebiaadress value for this Sidevahend.
     * 
     * @param veebiaadress
     */
    public void setVeebiaadress(java.lang.String veebiaadress) {
        this.veebiaadress = veebiaadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sidevahend)) return false;
        Sidevahend other = (Sidevahend) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.telefon==null && other.getTelefon()==null) || 
             (this.telefon!=null &&
              this.telefon.equals(other.getTelefon()))) &&
            ((this.faks==null && other.getFaks()==null) || 
             (this.faks!=null &&
              this.faks.equals(other.getFaks()))) &&
            ((this.epost==null && other.getEpost()==null) || 
             (this.epost!=null &&
              this.epost.equals(other.getEpost()))) &&
            ((this.veebiaadress==null && other.getVeebiaadress()==null) || 
             (this.veebiaadress!=null &&
              this.veebiaadress.equals(other.getVeebiaadress())));
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
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        if (getFaks() != null) {
            _hashCode += getFaks().hashCode();
        }
        if (getEpost() != null) {
            _hashCode += getEpost().hashCode();
        }
        if (getVeebiaadress() != null) {
            _hashCode += getVeebiaadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
