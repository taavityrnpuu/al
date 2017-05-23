/**
 * Evk_pohikiri.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Evk_pohikiri  implements java.io.Serializable {
    /* Põhikirja kinnitamise aeg */
    private java.util.Date pohikirja_kinnitamise_aeg;

    /* Põhikirja muutmise aeg */
    private java.util.Date pohikirja_muutmise_aeg;

    /* Põhikirja selgitus */
    private java.lang.String pohikirja_selgitus;

    public Evk_pohikiri() {
    }

    public Evk_pohikiri(
           java.util.Date pohikirja_kinnitamise_aeg,
           java.util.Date pohikirja_muutmise_aeg,
           java.lang.String pohikirja_selgitus) {
           this.pohikirja_kinnitamise_aeg = pohikirja_kinnitamise_aeg;
           this.pohikirja_muutmise_aeg = pohikirja_muutmise_aeg;
           this.pohikirja_selgitus = pohikirja_selgitus;
    }


    /**
     * Gets the pohikirja_kinnitamise_aeg value for this Evk_pohikiri.
     * 
     * @return pohikirja_kinnitamise_aeg   * Põhikirja kinnitamise aeg
     */
    public java.util.Date getPohikirja_kinnitamise_aeg() {
        return pohikirja_kinnitamise_aeg;
    }


    /**
     * Sets the pohikirja_kinnitamise_aeg value for this Evk_pohikiri.
     * 
     * @param pohikirja_kinnitamise_aeg   * Põhikirja kinnitamise aeg
     */
    public void setPohikirja_kinnitamise_aeg(java.util.Date pohikirja_kinnitamise_aeg) {
        this.pohikirja_kinnitamise_aeg = pohikirja_kinnitamise_aeg;
    }


    /**
     * Gets the pohikirja_muutmise_aeg value for this Evk_pohikiri.
     * 
     * @return pohikirja_muutmise_aeg   * Põhikirja muutmise aeg
     */
    public java.util.Date getPohikirja_muutmise_aeg() {
        return pohikirja_muutmise_aeg;
    }


    /**
     * Sets the pohikirja_muutmise_aeg value for this Evk_pohikiri.
     * 
     * @param pohikirja_muutmise_aeg   * Põhikirja muutmise aeg
     */
    public void setPohikirja_muutmise_aeg(java.util.Date pohikirja_muutmise_aeg) {
        this.pohikirja_muutmise_aeg = pohikirja_muutmise_aeg;
    }


    /**
     * Gets the pohikirja_selgitus value for this Evk_pohikiri.
     * 
     * @return pohikirja_selgitus   * Põhikirja selgitus
     */
    public java.lang.String getPohikirja_selgitus() {
        return pohikirja_selgitus;
    }


    /**
     * Sets the pohikirja_selgitus value for this Evk_pohikiri.
     * 
     * @param pohikirja_selgitus   * Põhikirja selgitus
     */
    public void setPohikirja_selgitus(java.lang.String pohikirja_selgitus) {
        this.pohikirja_selgitus = pohikirja_selgitus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evk_pohikiri)) return false;
        Evk_pohikiri other = (Evk_pohikiri) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pohikirja_kinnitamise_aeg==null && other.getPohikirja_kinnitamise_aeg()==null) || 
             (this.pohikirja_kinnitamise_aeg!=null &&
              this.pohikirja_kinnitamise_aeg.equals(other.getPohikirja_kinnitamise_aeg()))) &&
            ((this.pohikirja_muutmise_aeg==null && other.getPohikirja_muutmise_aeg()==null) || 
             (this.pohikirja_muutmise_aeg!=null &&
              this.pohikirja_muutmise_aeg.equals(other.getPohikirja_muutmise_aeg()))) &&
            ((this.pohikirja_selgitus==null && other.getPohikirja_selgitus()==null) || 
             (this.pohikirja_selgitus!=null &&
              this.pohikirja_selgitus.equals(other.getPohikirja_selgitus())));
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
        if (getPohikirja_kinnitamise_aeg() != null) {
            _hashCode += getPohikirja_kinnitamise_aeg().hashCode();
        }
        if (getPohikirja_muutmise_aeg() != null) {
            _hashCode += getPohikirja_muutmise_aeg().hashCode();
        }
        if (getPohikirja_selgitus() != null) {
            _hashCode += getPohikirja_selgitus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
