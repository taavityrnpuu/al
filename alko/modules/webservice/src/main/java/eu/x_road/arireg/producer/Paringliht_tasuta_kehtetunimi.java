/**
 * Paringliht_tasuta_kehtetunimi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringliht_tasuta_kehtetunimi  implements java.io.Serializable {
    private java.lang.String evnimi;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    public Paringliht_tasuta_kehtetunimi() {
    }

    public Paringliht_tasuta_kehtetunimi(
           java.lang.String evnimi,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv) {
           this.evnimi = evnimi;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the evnimi value for this Paringliht_tasuta_kehtetunimi.
     * 
     * @return evnimi
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }


    /**
     * Sets the evnimi value for this Paringliht_tasuta_kehtetunimi.
     * 
     * @param evnimi
     */
    public void setEvnimi(java.lang.String evnimi) {
        this.evnimi = evnimi;
    }


    /**
     * Gets the algus_kpv value for this Paringliht_tasuta_kehtetunimi.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Paringliht_tasuta_kehtetunimi.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Paringliht_tasuta_kehtetunimi.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Paringliht_tasuta_kehtetunimi.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_tasuta_kehtetunimi)) return false;
        Paringliht_tasuta_kehtetunimi other = (Paringliht_tasuta_kehtetunimi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.evnimi==null && other.getEvnimi()==null) || 
             (this.evnimi!=null &&
              this.evnimi.equals(other.getEvnimi()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv())));
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
        if (getEvnimi() != null) {
            _hashCode += getEvnimi().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
