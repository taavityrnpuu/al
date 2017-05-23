/**
 * RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik  implements java.io.Serializable {
    private java.lang.String isikukood;

    private java.lang.String eesnimi;

    private java.lang.String perekonnanimi;

    private java.lang.String telefon;

    private java.lang.String epost;

    public RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik() {
    }

    public RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik(
           java.lang.String isikukood,
           java.lang.String eesnimi,
           java.lang.String perekonnanimi,
           java.lang.String telefon,
           java.lang.String epost) {
           this.isikukood = isikukood;
           this.eesnimi = eesnimi;
           this.perekonnanimi = perekonnanimi;
           this.telefon = telefon;
           this.epost = epost;
    }


    /**
     * Gets the isikukood value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the eesnimi value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the perekonnanimi value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @return perekonnanimi
     */
    public java.lang.String getPerekonnanimi() {
        return perekonnanimi;
    }


    /**
     * Sets the perekonnanimi value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @param perekonnanimi
     */
    public void setPerekonnanimi(java.lang.String perekonnanimi) {
        this.perekonnanimi = perekonnanimi;
    }


    /**
     * Gets the telefon value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @return telefon
     */
    public java.lang.String getTelefon() {
        return telefon;
    }


    /**
     * Sets the telefon value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }


    /**
     * Gets the epost value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @return epost
     */
    public java.lang.String getEpost() {
        return epost;
    }


    /**
     * Sets the epost value for this RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.
     * 
     * @param epost
     */
    public void setEpost(java.lang.String epost) {
        this.epost = epost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik)) return false;
        RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik other = (RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik) obj;
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
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.perekonnanimi==null && other.getPerekonnanimi()==null) || 
             (this.perekonnanimi!=null &&
              this.perekonnanimi.equals(other.getPerekonnanimi()))) &&
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
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getPerekonnanimi() != null) {
            _hashCode += getPerekonnanimi().hashCode();
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
