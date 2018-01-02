/**
 * EsindusoigusType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EsindusoigusType_v4  implements java.io.Serializable {
    private java.lang.String tegevus;

    /* Äriregistri päringu klassifikaator */
    private java.lang.String roll;

    /* Äriregistri päringu klassifikaator */
    private java.lang.String liik;

    private java.lang.String kirjeldus;

    /* Esindusõiguse tingimus JSON reegli kujul */
    private java.lang.String sisu_json;

    /* Esindusõiguse tingimus Inglise keeles */
    private java.lang.String sisu_eng;

    public EsindusoigusType_v4() {
    }

    public EsindusoigusType_v4(
           java.lang.String tegevus,
           java.lang.String roll,
           java.lang.String liik,
           java.lang.String kirjeldus,
           java.lang.String sisu_json,
           java.lang.String sisu_eng) {
           this.tegevus = tegevus;
           this.roll = roll;
           this.liik = liik;
           this.kirjeldus = kirjeldus;
           this.sisu_json = sisu_json;
           this.sisu_eng = sisu_eng;
    }


    /**
     * Gets the tegevus value for this EsindusoigusType_v4.
     * 
     * @return tegevus
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this EsindusoigusType_v4.
     * 
     * @param tegevus
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }


    /**
     * Gets the roll value for this EsindusoigusType_v4.
     * 
     * @return roll   * Äriregistri päringu klassifikaator
     */
    public java.lang.String getRoll() {
        return roll;
    }


    /**
     * Sets the roll value for this EsindusoigusType_v4.
     * 
     * @param roll   * Äriregistri päringu klassifikaator
     */
    public void setRoll(java.lang.String roll) {
        this.roll = roll;
    }


    /**
     * Gets the liik value for this EsindusoigusType_v4.
     * 
     * @return liik   * Äriregistri päringu klassifikaator
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this EsindusoigusType_v4.
     * 
     * @param liik   * Äriregistri päringu klassifikaator
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the kirjeldus value for this EsindusoigusType_v4.
     * 
     * @return kirjeldus
     */
    public java.lang.String getKirjeldus() {
        return kirjeldus;
    }


    /**
     * Sets the kirjeldus value for this EsindusoigusType_v4.
     * 
     * @param kirjeldus
     */
    public void setKirjeldus(java.lang.String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }


    /**
     * Gets the sisu_json value for this EsindusoigusType_v4.
     * 
     * @return sisu_json   * Esindusõiguse tingimus JSON reegli kujul
     */
    public java.lang.String getSisu_json() {
        return sisu_json;
    }


    /**
     * Sets the sisu_json value for this EsindusoigusType_v4.
     * 
     * @param sisu_json   * Esindusõiguse tingimus JSON reegli kujul
     */
    public void setSisu_json(java.lang.String sisu_json) {
        this.sisu_json = sisu_json;
    }


    /**
     * Gets the sisu_eng value for this EsindusoigusType_v4.
     * 
     * @return sisu_eng   * Esindusõiguse tingimus Inglise keeles
     */
    public java.lang.String getSisu_eng() {
        return sisu_eng;
    }


    /**
     * Sets the sisu_eng value for this EsindusoigusType_v4.
     * 
     * @param sisu_eng   * Esindusõiguse tingimus Inglise keeles
     */
    public void setSisu_eng(java.lang.String sisu_eng) {
        this.sisu_eng = sisu_eng;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EsindusoigusType_v4)) return false;
        EsindusoigusType_v4 other = (EsindusoigusType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus()))) &&
            ((this.roll==null && other.getRoll()==null) || 
             (this.roll!=null &&
              this.roll.equals(other.getRoll()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.kirjeldus==null && other.getKirjeldus()==null) || 
             (this.kirjeldus!=null &&
              this.kirjeldus.equals(other.getKirjeldus()))) &&
            ((this.sisu_json==null && other.getSisu_json()==null) || 
             (this.sisu_json!=null &&
              this.sisu_json.equals(other.getSisu_json()))) &&
            ((this.sisu_eng==null && other.getSisu_eng()==null) || 
             (this.sisu_eng!=null &&
              this.sisu_eng.equals(other.getSisu_eng())));
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
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        if (getRoll() != null) {
            _hashCode += getRoll().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getKirjeldus() != null) {
            _hashCode += getKirjeldus().hashCode();
        }
        if (getSisu_json() != null) {
            _hashCode += getSisu_json().hashCode();
        }
        if (getSisu_eng() != null) {
            _hashCode += getSisu_eng().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
