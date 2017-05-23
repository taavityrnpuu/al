/**
 * Menetlusinfo_v3_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Menetlusinfo_v3_paring  implements java.io.Serializable {
    private java.lang.String notar_id;

    private java.lang.String notar_isikukood;

    private java.util.Date algus_kuupaev;

    private java.util.Date lopp_kuupaev;

    public Menetlusinfo_v3_paring() {
    }

    public Menetlusinfo_v3_paring(
           java.lang.String notar_id,
           java.lang.String notar_isikukood,
           java.util.Date algus_kuupaev,
           java.util.Date lopp_kuupaev) {
           this.notar_id = notar_id;
           this.notar_isikukood = notar_isikukood;
           this.algus_kuupaev = algus_kuupaev;
           this.lopp_kuupaev = lopp_kuupaev;
    }


    /**
     * Gets the notar_id value for this Menetlusinfo_v3_paring.
     * 
     * @return notar_id
     */
    public java.lang.String getNotar_id() {
        return notar_id;
    }


    /**
     * Sets the notar_id value for this Menetlusinfo_v3_paring.
     * 
     * @param notar_id
     */
    public void setNotar_id(java.lang.String notar_id) {
        this.notar_id = notar_id;
    }


    /**
     * Gets the notar_isikukood value for this Menetlusinfo_v3_paring.
     * 
     * @return notar_isikukood
     */
    public java.lang.String getNotar_isikukood() {
        return notar_isikukood;
    }


    /**
     * Sets the notar_isikukood value for this Menetlusinfo_v3_paring.
     * 
     * @param notar_isikukood
     */
    public void setNotar_isikukood(java.lang.String notar_isikukood) {
        this.notar_isikukood = notar_isikukood;
    }


    /**
     * Gets the algus_kuupaev value for this Menetlusinfo_v3_paring.
     * 
     * @return algus_kuupaev
     */
    public java.util.Date getAlgus_kuupaev() {
        return algus_kuupaev;
    }


    /**
     * Sets the algus_kuupaev value for this Menetlusinfo_v3_paring.
     * 
     * @param algus_kuupaev
     */
    public void setAlgus_kuupaev(java.util.Date algus_kuupaev) {
        this.algus_kuupaev = algus_kuupaev;
    }


    /**
     * Gets the lopp_kuupaev value for this Menetlusinfo_v3_paring.
     * 
     * @return lopp_kuupaev
     */
    public java.util.Date getLopp_kuupaev() {
        return lopp_kuupaev;
    }


    /**
     * Sets the lopp_kuupaev value for this Menetlusinfo_v3_paring.
     * 
     * @param lopp_kuupaev
     */
    public void setLopp_kuupaev(java.util.Date lopp_kuupaev) {
        this.lopp_kuupaev = lopp_kuupaev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menetlusinfo_v3_paring)) return false;
        Menetlusinfo_v3_paring other = (Menetlusinfo_v3_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notar_id==null && other.getNotar_id()==null) || 
             (this.notar_id!=null &&
              this.notar_id.equals(other.getNotar_id()))) &&
            ((this.notar_isikukood==null && other.getNotar_isikukood()==null) || 
             (this.notar_isikukood!=null &&
              this.notar_isikukood.equals(other.getNotar_isikukood()))) &&
            ((this.algus_kuupaev==null && other.getAlgus_kuupaev()==null) || 
             (this.algus_kuupaev!=null &&
              this.algus_kuupaev.equals(other.getAlgus_kuupaev()))) &&
            ((this.lopp_kuupaev==null && other.getLopp_kuupaev()==null) || 
             (this.lopp_kuupaev!=null &&
              this.lopp_kuupaev.equals(other.getLopp_kuupaev())));
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
        if (getNotar_id() != null) {
            _hashCode += getNotar_id().hashCode();
        }
        if (getNotar_isikukood() != null) {
            _hashCode += getNotar_isikukood().hashCode();
        }
        if (getAlgus_kuupaev() != null) {
            _hashCode += getAlgus_kuupaev().hashCode();
        }
        if (getLopp_kuupaev() != null) {
            _hashCode += getLopp_kuupaev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
