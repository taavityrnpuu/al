/**
 * Mtabilsisuv2_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtabilsisuv2_paring  implements java.io.Serializable {
    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    private java.math.BigInteger lk;

    public Mtabilsisuv2_paring() {
    }

    public Mtabilsisuv2_paring(
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv,
           java.math.BigInteger lk) {
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
           this.lk = lk;
    }


    /**
     * Gets the algus_kpv value for this Mtabilsisuv2_paring.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Mtabilsisuv2_paring.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Mtabilsisuv2_paring.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Mtabilsisuv2_paring.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the lk value for this Mtabilsisuv2_paring.
     * 
     * @return lk
     */
    public java.math.BigInteger getLk() {
        return lk;
    }


    /**
     * Sets the lk value for this Mtabilsisuv2_paring.
     * 
     * @param lk
     */
    public void setLk(java.math.BigInteger lk) {
        this.lk = lk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtabilsisuv2_paring)) return false;
        Mtabilsisuv2_paring other = (Mtabilsisuv2_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv()))) &&
            ((this.lk==null && other.getLk()==null) || 
             (this.lk!=null &&
              this.lk.equals(other.getLk())));
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
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        if (getLk() != null) {
            _hashCode += getLk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
