/**
 * Ky_registriosamuut_v1_Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_registriosamuut_v1_Query  implements java.io.Serializable {
    private java.util.Date algus;

    private java.util.Date lopp;

    public Ky_registriosamuut_v1_Query() {
    }

    public Ky_registriosamuut_v1_Query(
           java.util.Date algus,
           java.util.Date lopp) {
           this.algus = algus;
           this.lopp = lopp;
    }


    /**
     * Gets the algus value for this Ky_registriosamuut_v1_Query.
     * 
     * @return algus
     */
    public java.util.Date getAlgus() {
        return algus;
    }


    /**
     * Sets the algus value for this Ky_registriosamuut_v1_Query.
     * 
     * @param algus
     */
    public void setAlgus(java.util.Date algus) {
        this.algus = algus;
    }


    /**
     * Gets the lopp value for this Ky_registriosamuut_v1_Query.
     * 
     * @return lopp
     */
    public java.util.Date getLopp() {
        return lopp;
    }


    /**
     * Sets the lopp value for this Ky_registriosamuut_v1_Query.
     * 
     * @param lopp
     */
    public void setLopp(java.util.Date lopp) {
        this.lopp = lopp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_registriosamuut_v1_Query)) return false;
        Ky_registriosamuut_v1_Query other = (Ky_registriosamuut_v1_Query) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.algus==null && other.getAlgus()==null) || 
             (this.algus!=null &&
              this.algus.equals(other.getAlgus()))) &&
            ((this.lopp==null && other.getLopp()==null) || 
             (this.lopp!=null &&
              this.lopp.equals(other.getLopp())));
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
        if (getAlgus() != null) {
            _hashCode += getAlgus().hashCode();
        }
        if (getLopp() != null) {
            _hashCode += getLopp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
