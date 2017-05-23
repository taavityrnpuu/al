/**
 * Fys_jur_isik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Fys_jur_isik  implements java.io.Serializable {
    private java.lang.String fys_eesnimi;

    private java.lang.String fys_perenimi;

    private java.lang.String fys_synniaeg;

    private java.lang.String fys_isikukood;

    private java.lang.String jur_arinimi;

    private java.lang.String jur_ark;

    private java.lang.String jur_fys_valiskood;

    private java.lang.String jur_fys_valiskoodi_riik;

    public Fys_jur_isik() {
    }

    public Fys_jur_isik(
           java.lang.String fys_eesnimi,
           java.lang.String fys_perenimi,
           java.lang.String fys_synniaeg,
           java.lang.String fys_isikukood,
           java.lang.String jur_arinimi,
           java.lang.String jur_ark,
           java.lang.String jur_fys_valiskood,
           java.lang.String jur_fys_valiskoodi_riik) {
           this.fys_eesnimi = fys_eesnimi;
           this.fys_perenimi = fys_perenimi;
           this.fys_synniaeg = fys_synniaeg;
           this.fys_isikukood = fys_isikukood;
           this.jur_arinimi = jur_arinimi;
           this.jur_ark = jur_ark;
           this.jur_fys_valiskood = jur_fys_valiskood;
           this.jur_fys_valiskoodi_riik = jur_fys_valiskoodi_riik;
    }


    /**
     * Gets the fys_eesnimi value for this Fys_jur_isik.
     * 
     * @return fys_eesnimi
     */
    public java.lang.String getFys_eesnimi() {
        return fys_eesnimi;
    }


    /**
     * Sets the fys_eesnimi value for this Fys_jur_isik.
     * 
     * @param fys_eesnimi
     */
    public void setFys_eesnimi(java.lang.String fys_eesnimi) {
        this.fys_eesnimi = fys_eesnimi;
    }


    /**
     * Gets the fys_perenimi value for this Fys_jur_isik.
     * 
     * @return fys_perenimi
     */
    public java.lang.String getFys_perenimi() {
        return fys_perenimi;
    }


    /**
     * Sets the fys_perenimi value for this Fys_jur_isik.
     * 
     * @param fys_perenimi
     */
    public void setFys_perenimi(java.lang.String fys_perenimi) {
        this.fys_perenimi = fys_perenimi;
    }


    /**
     * Gets the fys_synniaeg value for this Fys_jur_isik.
     * 
     * @return fys_synniaeg
     */
    public java.lang.String getFys_synniaeg() {
        return fys_synniaeg;
    }


    /**
     * Sets the fys_synniaeg value for this Fys_jur_isik.
     * 
     * @param fys_synniaeg
     */
    public void setFys_synniaeg(java.lang.String fys_synniaeg) {
        this.fys_synniaeg = fys_synniaeg;
    }


    /**
     * Gets the fys_isikukood value for this Fys_jur_isik.
     * 
     * @return fys_isikukood
     */
    public java.lang.String getFys_isikukood() {
        return fys_isikukood;
    }


    /**
     * Sets the fys_isikukood value for this Fys_jur_isik.
     * 
     * @param fys_isikukood
     */
    public void setFys_isikukood(java.lang.String fys_isikukood) {
        this.fys_isikukood = fys_isikukood;
    }


    /**
     * Gets the jur_arinimi value for this Fys_jur_isik.
     * 
     * @return jur_arinimi
     */
    public java.lang.String getJur_arinimi() {
        return jur_arinimi;
    }


    /**
     * Sets the jur_arinimi value for this Fys_jur_isik.
     * 
     * @param jur_arinimi
     */
    public void setJur_arinimi(java.lang.String jur_arinimi) {
        this.jur_arinimi = jur_arinimi;
    }


    /**
     * Gets the jur_ark value for this Fys_jur_isik.
     * 
     * @return jur_ark
     */
    public java.lang.String getJur_ark() {
        return jur_ark;
    }


    /**
     * Sets the jur_ark value for this Fys_jur_isik.
     * 
     * @param jur_ark
     */
    public void setJur_ark(java.lang.String jur_ark) {
        this.jur_ark = jur_ark;
    }


    /**
     * Gets the jur_fys_valiskood value for this Fys_jur_isik.
     * 
     * @return jur_fys_valiskood
     */
    public java.lang.String getJur_fys_valiskood() {
        return jur_fys_valiskood;
    }


    /**
     * Sets the jur_fys_valiskood value for this Fys_jur_isik.
     * 
     * @param jur_fys_valiskood
     */
    public void setJur_fys_valiskood(java.lang.String jur_fys_valiskood) {
        this.jur_fys_valiskood = jur_fys_valiskood;
    }


    /**
     * Gets the jur_fys_valiskoodi_riik value for this Fys_jur_isik.
     * 
     * @return jur_fys_valiskoodi_riik
     */
    public java.lang.String getJur_fys_valiskoodi_riik() {
        return jur_fys_valiskoodi_riik;
    }


    /**
     * Sets the jur_fys_valiskoodi_riik value for this Fys_jur_isik.
     * 
     * @param jur_fys_valiskoodi_riik
     */
    public void setJur_fys_valiskoodi_riik(java.lang.String jur_fys_valiskoodi_riik) {
        this.jur_fys_valiskoodi_riik = jur_fys_valiskoodi_riik;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fys_jur_isik)) return false;
        Fys_jur_isik other = (Fys_jur_isik) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fys_eesnimi==null && other.getFys_eesnimi()==null) || 
             (this.fys_eesnimi!=null &&
              this.fys_eesnimi.equals(other.getFys_eesnimi()))) &&
            ((this.fys_perenimi==null && other.getFys_perenimi()==null) || 
             (this.fys_perenimi!=null &&
              this.fys_perenimi.equals(other.getFys_perenimi()))) &&
            ((this.fys_synniaeg==null && other.getFys_synniaeg()==null) || 
             (this.fys_synniaeg!=null &&
              this.fys_synniaeg.equals(other.getFys_synniaeg()))) &&
            ((this.fys_isikukood==null && other.getFys_isikukood()==null) || 
             (this.fys_isikukood!=null &&
              this.fys_isikukood.equals(other.getFys_isikukood()))) &&
            ((this.jur_arinimi==null && other.getJur_arinimi()==null) || 
             (this.jur_arinimi!=null &&
              this.jur_arinimi.equals(other.getJur_arinimi()))) &&
            ((this.jur_ark==null && other.getJur_ark()==null) || 
             (this.jur_ark!=null &&
              this.jur_ark.equals(other.getJur_ark()))) &&
            ((this.jur_fys_valiskood==null && other.getJur_fys_valiskood()==null) || 
             (this.jur_fys_valiskood!=null &&
              this.jur_fys_valiskood.equals(other.getJur_fys_valiskood()))) &&
            ((this.jur_fys_valiskoodi_riik==null && other.getJur_fys_valiskoodi_riik()==null) || 
             (this.jur_fys_valiskoodi_riik!=null &&
              this.jur_fys_valiskoodi_riik.equals(other.getJur_fys_valiskoodi_riik())));
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
        if (getFys_eesnimi() != null) {
            _hashCode += getFys_eesnimi().hashCode();
        }
        if (getFys_perenimi() != null) {
            _hashCode += getFys_perenimi().hashCode();
        }
        if (getFys_synniaeg() != null) {
            _hashCode += getFys_synniaeg().hashCode();
        }
        if (getFys_isikukood() != null) {
            _hashCode += getFys_isikukood().hashCode();
        }
        if (getJur_arinimi() != null) {
            _hashCode += getJur_arinimi().hashCode();
        }
        if (getJur_ark() != null) {
            _hashCode += getJur_ark().hashCode();
        }
        if (getJur_fys_valiskood() != null) {
            _hashCode += getJur_fys_valiskood().hashCode();
        }
        if (getJur_fys_valiskoodi_riik() != null) {
            _hashCode += getJur_fys_valiskoodi_riik().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
