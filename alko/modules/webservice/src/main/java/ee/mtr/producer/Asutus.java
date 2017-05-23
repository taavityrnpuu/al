/**
 * Asutus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Asutus  implements java.io.Serializable {
    private java.lang.String registreeringuNumber;

    private java.lang.String ettevõtjaNumber;

    private java.lang.String FIEIsikukood;

    private java.lang.String ettevõtjanimetusFIEnimi;

    private ee.x_road.mtr.producer.KlassifikaatorValik[] tegevusAlad;

    private java.util.Date FIESünnikuupäev;

    private java.util.Calendar andmeteTõesuseKontrolliKuupäev;

    public Asutus() {
    }

    public Asutus(
           java.lang.String registreeringuNumber,
           java.lang.String ettevõtjaNumber,
           java.lang.String FIEIsikukood,
           java.lang.String ettevõtjanimetusFIEnimi,
           ee.x_road.mtr.producer.KlassifikaatorValik[] tegevusAlad,
           java.util.Date FIESünnikuupäev,
           java.util.Calendar andmeteTõesuseKontrolliKuupäev) {
           this.registreeringuNumber = registreeringuNumber;
           this.ettevõtjaNumber = ettevõtjaNumber;
           this.FIEIsikukood = FIEIsikukood;
           this.ettevõtjanimetusFIEnimi = ettevõtjanimetusFIEnimi;
           this.tegevusAlad = tegevusAlad;
           this.FIESünnikuupäev = FIESünnikuupäev;
           this.andmeteTõesuseKontrolliKuupäev = andmeteTõesuseKontrolliKuupäev;
    }


    /**
     * Gets the registreeringuNumber value for this Asutus.
     * 
     * @return registreeringuNumber
     */
    public java.lang.String getRegistreeringuNumber() {
        return registreeringuNumber;
    }


    /**
     * Sets the registreeringuNumber value for this Asutus.
     * 
     * @param registreeringuNumber
     */
    public void setRegistreeringuNumber(java.lang.String registreeringuNumber) {
        this.registreeringuNumber = registreeringuNumber;
    }


    /**
     * Gets the ettevõtjaNumber value for this Asutus.
     * 
     * @return ettevõtjaNumber
     */
    public java.lang.String getEttevõtjaNumber() {
        return ettevõtjaNumber;
    }


    /**
     * Sets the ettevõtjaNumber value for this Asutus.
     * 
     * @param ettevõtjaNumber
     */
    public void setEttevõtjaNumber(java.lang.String ettevõtjaNumber) {
        this.ettevõtjaNumber = ettevõtjaNumber;
    }


    /**
     * Gets the FIEIsikukood value for this Asutus.
     * 
     * @return FIEIsikukood
     */
    public java.lang.String getFIEIsikukood() {
        return FIEIsikukood;
    }


    /**
     * Sets the FIEIsikukood value for this Asutus.
     * 
     * @param FIEIsikukood
     */
    public void setFIEIsikukood(java.lang.String FIEIsikukood) {
        this.FIEIsikukood = FIEIsikukood;
    }


    /**
     * Gets the ettevõtjanimetusFIEnimi value for this Asutus.
     * 
     * @return ettevõtjanimetusFIEnimi
     */
    public java.lang.String getEttevõtjanimetusFIEnimi() {
        return ettevõtjanimetusFIEnimi;
    }


    /**
     * Sets the ettevõtjanimetusFIEnimi value for this Asutus.
     * 
     * @param ettevõtjanimetusFIEnimi
     */
    public void setEttevõtjanimetusFIEnimi(java.lang.String ettevõtjanimetusFIEnimi) {
        this.ettevõtjanimetusFIEnimi = ettevõtjanimetusFIEnimi;
    }


    /**
     * Gets the tegevusAlad value for this Asutus.
     * 
     * @return tegevusAlad
     */
    public ee.x_road.mtr.producer.KlassifikaatorValik[] getTegevusAlad() {
        return tegevusAlad;
    }


    /**
     * Sets the tegevusAlad value for this Asutus.
     * 
     * @param tegevusAlad
     */
    public void setTegevusAlad(ee.x_road.mtr.producer.KlassifikaatorValik[] tegevusAlad) {
        this.tegevusAlad = tegevusAlad;
    }


    /**
     * Gets the FIESünnikuupäev value for this Asutus.
     * 
     * @return FIESünnikuupäev
     */
    public java.util.Date getFIESünnikuupäev() {
        return FIESünnikuupäev;
    }


    /**
     * Sets the FIESünnikuupäev value for this Asutus.
     * 
     * @param FIESünnikuupäev
     */
    public void setFIESünnikuupäev(java.util.Date FIESünnikuupäev) {
        this.FIESünnikuupäev = FIESünnikuupäev;
    }


    /**
     * Gets the andmeteTõesuseKontrolliKuupäev value for this Asutus.
     * 
     * @return andmeteTõesuseKontrolliKuupäev
     */
    public java.util.Calendar getAndmeteTõesuseKontrolliKuupäev() {
        return andmeteTõesuseKontrolliKuupäev;
    }


    /**
     * Sets the andmeteTõesuseKontrolliKuupäev value for this Asutus.
     * 
     * @param andmeteTõesuseKontrolliKuupäev
     */
    public void setAndmeteTõesuseKontrolliKuupäev(java.util.Calendar andmeteTõesuseKontrolliKuupäev) {
        this.andmeteTõesuseKontrolliKuupäev = andmeteTõesuseKontrolliKuupäev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Asutus)) return false;
        Asutus other = (Asutus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registreeringuNumber==null && other.getRegistreeringuNumber()==null) || 
             (this.registreeringuNumber!=null &&
              this.registreeringuNumber.equals(other.getRegistreeringuNumber()))) &&
            ((this.ettevõtjaNumber==null && other.getEttevõtjaNumber()==null) || 
             (this.ettevõtjaNumber!=null &&
              this.ettevõtjaNumber.equals(other.getEttevõtjaNumber()))) &&
            ((this.FIEIsikukood==null && other.getFIEIsikukood()==null) || 
             (this.FIEIsikukood!=null &&
              this.FIEIsikukood.equals(other.getFIEIsikukood()))) &&
            ((this.ettevõtjanimetusFIEnimi==null && other.getEttevõtjanimetusFIEnimi()==null) || 
             (this.ettevõtjanimetusFIEnimi!=null &&
              this.ettevõtjanimetusFIEnimi.equals(other.getEttevõtjanimetusFIEnimi()))) &&
            ((this.tegevusAlad==null && other.getTegevusAlad()==null) || 
             (this.tegevusAlad!=null &&
              java.util.Arrays.equals(this.tegevusAlad, other.getTegevusAlad()))) &&
            ((this.FIESünnikuupäev==null && other.getFIESünnikuupäev()==null) || 
             (this.FIESünnikuupäev!=null &&
              this.FIESünnikuupäev.equals(other.getFIESünnikuupäev()))) &&
            ((this.andmeteTõesuseKontrolliKuupäev==null && other.getAndmeteTõesuseKontrolliKuupäev()==null) || 
             (this.andmeteTõesuseKontrolliKuupäev!=null &&
              this.andmeteTõesuseKontrolliKuupäev.equals(other.getAndmeteTõesuseKontrolliKuupäev())));
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
        if (getRegistreeringuNumber() != null) {
            _hashCode += getRegistreeringuNumber().hashCode();
        }
        if (getEttevõtjaNumber() != null) {
            _hashCode += getEttevõtjaNumber().hashCode();
        }
        if (getFIEIsikukood() != null) {
            _hashCode += getFIEIsikukood().hashCode();
        }
        if (getEttevõtjanimetusFIEnimi() != null) {
            _hashCode += getEttevõtjanimetusFIEnimi().hashCode();
        }
        if (getTegevusAlad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusAlad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusAlad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFIESünnikuupäev() != null) {
            _hashCode += getFIESünnikuupäev().hashCode();
        }
        if (getAndmeteTõesuseKontrolliKuupäev() != null) {
            _hashCode += getAndmeteTõesuseKontrolliKuupäev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
