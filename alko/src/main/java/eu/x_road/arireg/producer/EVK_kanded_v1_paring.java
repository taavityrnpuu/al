/**
 * EVK_kanded_v1_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVK_kanded_v1_paring  implements java.io.Serializable {
    /* Perioodi alguskuupäev */
    private java.util.Date alguskpv;

    /* Perioodi lõpukuupäev */
    private java.util.Date loppkpv;

    /* Ettevõtja täpne registrikood */
    private java.math.BigInteger evkood;

    /* Sündmus */
    private eu.x_road.arireg.producer.X_evk_syndmus syndmus;

    /* Klassifikaatorite tõlgete keel */
    private java.lang.String keel;

    public EVK_kanded_v1_paring() {
    }

    public EVK_kanded_v1_paring(
           java.util.Date alguskpv,
           java.util.Date loppkpv,
           java.math.BigInteger evkood,
           eu.x_road.arireg.producer.X_evk_syndmus syndmus,
           java.lang.String keel) {
           this.alguskpv = alguskpv;
           this.loppkpv = loppkpv;
           this.evkood = evkood;
           this.syndmus = syndmus;
           this.keel = keel;
    }


    /**
     * Gets the alguskpv value for this EVK_kanded_v1_paring.
     * 
     * @return alguskpv   * Perioodi alguskuupäev
     */
    public java.util.Date getAlguskpv() {
        return alguskpv;
    }


    /**
     * Sets the alguskpv value for this EVK_kanded_v1_paring.
     * 
     * @param alguskpv   * Perioodi alguskuupäev
     */
    public void setAlguskpv(java.util.Date alguskpv) {
        this.alguskpv = alguskpv;
    }


    /**
     * Gets the loppkpv value for this EVK_kanded_v1_paring.
     * 
     * @return loppkpv   * Perioodi lõpukuupäev
     */
    public java.util.Date getLoppkpv() {
        return loppkpv;
    }


    /**
     * Sets the loppkpv value for this EVK_kanded_v1_paring.
     * 
     * @param loppkpv   * Perioodi lõpukuupäev
     */
    public void setLoppkpv(java.util.Date loppkpv) {
        this.loppkpv = loppkpv;
    }


    /**
     * Gets the evkood value for this EVK_kanded_v1_paring.
     * 
     * @return evkood   * Ettevõtja täpne registrikood
     */
    public java.math.BigInteger getEvkood() {
        return evkood;
    }


    /**
     * Sets the evkood value for this EVK_kanded_v1_paring.
     * 
     * @param evkood   * Ettevõtja täpne registrikood
     */
    public void setEvkood(java.math.BigInteger evkood) {
        this.evkood = evkood;
    }


    /**
     * Gets the syndmus value for this EVK_kanded_v1_paring.
     * 
     * @return syndmus   * Sündmus
     */
    public eu.x_road.arireg.producer.X_evk_syndmus getSyndmus() {
        return syndmus;
    }


    /**
     * Sets the syndmus value for this EVK_kanded_v1_paring.
     * 
     * @param syndmus   * Sündmus
     */
    public void setSyndmus(eu.x_road.arireg.producer.X_evk_syndmus syndmus) {
        this.syndmus = syndmus;
    }


    /**
     * Gets the keel value for this EVK_kanded_v1_paring.
     * 
     * @return keel   * Klassifikaatorite tõlgete keel
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this EVK_kanded_v1_paring.
     * 
     * @param keel   * Klassifikaatorite tõlgete keel
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVK_kanded_v1_paring)) return false;
        EVK_kanded_v1_paring other = (EVK_kanded_v1_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alguskpv==null && other.getAlguskpv()==null) || 
             (this.alguskpv!=null &&
              this.alguskpv.equals(other.getAlguskpv()))) &&
            ((this.loppkpv==null && other.getLoppkpv()==null) || 
             (this.loppkpv!=null &&
              this.loppkpv.equals(other.getLoppkpv()))) &&
            ((this.evkood==null && other.getEvkood()==null) || 
             (this.evkood!=null &&
              this.evkood.equals(other.getEvkood()))) &&
            ((this.syndmus==null && other.getSyndmus()==null) || 
             (this.syndmus!=null &&
              this.syndmus.equals(other.getSyndmus()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel())));
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
        if (getAlguskpv() != null) {
            _hashCode += getAlguskpv().hashCode();
        }
        if (getLoppkpv() != null) {
            _hashCode += getLoppkpv().hashCode();
        }
        if (getEvkood() != null) {
            _hashCode += getEvkood().hashCode();
        }
        if (getSyndmus() != null) {
            _hashCode += getSyndmus().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
