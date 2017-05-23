/**
 * Klassifikaatori_vaartus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Klassifikaatori_vaartus  implements java.io.Serializable {
    private java.lang.String klassifikaatori_vaartuse_kood;

    private java.lang.String klassifikaatori_vaartuse_nimetus;

    private java.util.Date klassifikaatori_vaartuse_algus_kpv;

    private java.util.Date klassifikaatori_vaartuse_lopp_kpv;

    public Klassifikaatori_vaartus() {
    }

    public Klassifikaatori_vaartus(
           java.lang.String klassifikaatori_vaartuse_kood,
           java.lang.String klassifikaatori_vaartuse_nimetus,
           java.util.Date klassifikaatori_vaartuse_algus_kpv,
           java.util.Date klassifikaatori_vaartuse_lopp_kpv) {
           this.klassifikaatori_vaartuse_kood = klassifikaatori_vaartuse_kood;
           this.klassifikaatori_vaartuse_nimetus = klassifikaatori_vaartuse_nimetus;
           this.klassifikaatori_vaartuse_algus_kpv = klassifikaatori_vaartuse_algus_kpv;
           this.klassifikaatori_vaartuse_lopp_kpv = klassifikaatori_vaartuse_lopp_kpv;
    }


    /**
     * Gets the klassifikaatori_vaartuse_kood value for this Klassifikaatori_vaartus.
     * 
     * @return klassifikaatori_vaartuse_kood
     */
    public java.lang.String getKlassifikaatori_vaartuse_kood() {
        return klassifikaatori_vaartuse_kood;
    }


    /**
     * Sets the klassifikaatori_vaartuse_kood value for this Klassifikaatori_vaartus.
     * 
     * @param klassifikaatori_vaartuse_kood
     */
    public void setKlassifikaatori_vaartuse_kood(java.lang.String klassifikaatori_vaartuse_kood) {
        this.klassifikaatori_vaartuse_kood = klassifikaatori_vaartuse_kood;
    }


    /**
     * Gets the klassifikaatori_vaartuse_nimetus value for this Klassifikaatori_vaartus.
     * 
     * @return klassifikaatori_vaartuse_nimetus
     */
    public java.lang.String getKlassifikaatori_vaartuse_nimetus() {
        return klassifikaatori_vaartuse_nimetus;
    }


    /**
     * Sets the klassifikaatori_vaartuse_nimetus value for this Klassifikaatori_vaartus.
     * 
     * @param klassifikaatori_vaartuse_nimetus
     */
    public void setKlassifikaatori_vaartuse_nimetus(java.lang.String klassifikaatori_vaartuse_nimetus) {
        this.klassifikaatori_vaartuse_nimetus = klassifikaatori_vaartuse_nimetus;
    }


    /**
     * Gets the klassifikaatori_vaartuse_algus_kpv value for this Klassifikaatori_vaartus.
     * 
     * @return klassifikaatori_vaartuse_algus_kpv
     */
    public java.util.Date getKlassifikaatori_vaartuse_algus_kpv() {
        return klassifikaatori_vaartuse_algus_kpv;
    }


    /**
     * Sets the klassifikaatori_vaartuse_algus_kpv value for this Klassifikaatori_vaartus.
     * 
     * @param klassifikaatori_vaartuse_algus_kpv
     */
    public void setKlassifikaatori_vaartuse_algus_kpv(java.util.Date klassifikaatori_vaartuse_algus_kpv) {
        this.klassifikaatori_vaartuse_algus_kpv = klassifikaatori_vaartuse_algus_kpv;
    }


    /**
     * Gets the klassifikaatori_vaartuse_lopp_kpv value for this Klassifikaatori_vaartus.
     * 
     * @return klassifikaatori_vaartuse_lopp_kpv
     */
    public java.util.Date getKlassifikaatori_vaartuse_lopp_kpv() {
        return klassifikaatori_vaartuse_lopp_kpv;
    }


    /**
     * Sets the klassifikaatori_vaartuse_lopp_kpv value for this Klassifikaatori_vaartus.
     * 
     * @param klassifikaatori_vaartuse_lopp_kpv
     */
    public void setKlassifikaatori_vaartuse_lopp_kpv(java.util.Date klassifikaatori_vaartuse_lopp_kpv) {
        this.klassifikaatori_vaartuse_lopp_kpv = klassifikaatori_vaartuse_lopp_kpv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Klassifikaatori_vaartus)) return false;
        Klassifikaatori_vaartus other = (Klassifikaatori_vaartus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.klassifikaatori_vaartuse_kood==null && other.getKlassifikaatori_vaartuse_kood()==null) || 
             (this.klassifikaatori_vaartuse_kood!=null &&
              this.klassifikaatori_vaartuse_kood.equals(other.getKlassifikaatori_vaartuse_kood()))) &&
            ((this.klassifikaatori_vaartuse_nimetus==null && other.getKlassifikaatori_vaartuse_nimetus()==null) || 
             (this.klassifikaatori_vaartuse_nimetus!=null &&
              this.klassifikaatori_vaartuse_nimetus.equals(other.getKlassifikaatori_vaartuse_nimetus()))) &&
            ((this.klassifikaatori_vaartuse_algus_kpv==null && other.getKlassifikaatori_vaartuse_algus_kpv()==null) || 
             (this.klassifikaatori_vaartuse_algus_kpv!=null &&
              this.klassifikaatori_vaartuse_algus_kpv.equals(other.getKlassifikaatori_vaartuse_algus_kpv()))) &&
            ((this.klassifikaatori_vaartuse_lopp_kpv==null && other.getKlassifikaatori_vaartuse_lopp_kpv()==null) || 
             (this.klassifikaatori_vaartuse_lopp_kpv!=null &&
              this.klassifikaatori_vaartuse_lopp_kpv.equals(other.getKlassifikaatori_vaartuse_lopp_kpv())));
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
        if (getKlassifikaatori_vaartuse_kood() != null) {
            _hashCode += getKlassifikaatori_vaartuse_kood().hashCode();
        }
        if (getKlassifikaatori_vaartuse_nimetus() != null) {
            _hashCode += getKlassifikaatori_vaartuse_nimetus().hashCode();
        }
        if (getKlassifikaatori_vaartuse_algus_kpv() != null) {
            _hashCode += getKlassifikaatori_vaartuse_algus_kpv().hashCode();
        }
        if (getKlassifikaatori_vaartuse_lopp_kpv() != null) {
            _hashCode += getKlassifikaatori_vaartuse_lopp_kpv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
