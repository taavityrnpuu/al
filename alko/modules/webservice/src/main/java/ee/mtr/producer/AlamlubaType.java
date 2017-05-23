/**
 * AlamlubaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AlamlubaType  implements java.io.Serializable {
    private java.util.Date kehtivuse_algus;

    private java.util.Date kehtivuse_lopp;

    private java.lang.String valjaandja_nimi;

    private java.lang.String valjaandja_kood;

    public AlamlubaType() {
    }

    public AlamlubaType(
           java.util.Date kehtivuse_algus,
           java.util.Date kehtivuse_lopp,
           java.lang.String valjaandja_nimi,
           java.lang.String valjaandja_kood) {
           this.kehtivuse_algus = kehtivuse_algus;
           this.kehtivuse_lopp = kehtivuse_lopp;
           this.valjaandja_nimi = valjaandja_nimi;
           this.valjaandja_kood = valjaandja_kood;
    }


    /**
     * Gets the kehtivuse_algus value for this AlamlubaType.
     * 
     * @return kehtivuse_algus
     */
    public java.util.Date getKehtivuse_algus() {
        return kehtivuse_algus;
    }


    /**
     * Sets the kehtivuse_algus value for this AlamlubaType.
     * 
     * @param kehtivuse_algus
     */
    public void setKehtivuse_algus(java.util.Date kehtivuse_algus) {
        this.kehtivuse_algus = kehtivuse_algus;
    }


    /**
     * Gets the kehtivuse_lopp value for this AlamlubaType.
     * 
     * @return kehtivuse_lopp
     */
    public java.util.Date getKehtivuse_lopp() {
        return kehtivuse_lopp;
    }


    /**
     * Sets the kehtivuse_lopp value for this AlamlubaType.
     * 
     * @param kehtivuse_lopp
     */
    public void setKehtivuse_lopp(java.util.Date kehtivuse_lopp) {
        this.kehtivuse_lopp = kehtivuse_lopp;
    }


    /**
     * Gets the valjaandja_nimi value for this AlamlubaType.
     * 
     * @return valjaandja_nimi
     */
    public java.lang.String getValjaandja_nimi() {
        return valjaandja_nimi;
    }


    /**
     * Sets the valjaandja_nimi value for this AlamlubaType.
     * 
     * @param valjaandja_nimi
     */
    public void setValjaandja_nimi(java.lang.String valjaandja_nimi) {
        this.valjaandja_nimi = valjaandja_nimi;
    }


    /**
     * Gets the valjaandja_kood value for this AlamlubaType.
     * 
     * @return valjaandja_kood
     */
    public java.lang.String getValjaandja_kood() {
        return valjaandja_kood;
    }


    /**
     * Sets the valjaandja_kood value for this AlamlubaType.
     * 
     * @param valjaandja_kood
     */
    public void setValjaandja_kood(java.lang.String valjaandja_kood) {
        this.valjaandja_kood = valjaandja_kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlamlubaType)) return false;
        AlamlubaType other = (AlamlubaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kehtivuse_algus==null && other.getKehtivuse_algus()==null) || 
             (this.kehtivuse_algus!=null &&
              this.kehtivuse_algus.equals(other.getKehtivuse_algus()))) &&
            ((this.kehtivuse_lopp==null && other.getKehtivuse_lopp()==null) || 
             (this.kehtivuse_lopp!=null &&
              this.kehtivuse_lopp.equals(other.getKehtivuse_lopp()))) &&
            ((this.valjaandja_nimi==null && other.getValjaandja_nimi()==null) || 
             (this.valjaandja_nimi!=null &&
              this.valjaandja_nimi.equals(other.getValjaandja_nimi()))) &&
            ((this.valjaandja_kood==null && other.getValjaandja_kood()==null) || 
             (this.valjaandja_kood!=null &&
              this.valjaandja_kood.equals(other.getValjaandja_kood())));
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
        if (getKehtivuse_algus() != null) {
            _hashCode += getKehtivuse_algus().hashCode();
        }
        if (getKehtivuse_lopp() != null) {
            _hashCode += getKehtivuse_lopp().hashCode();
        }
        if (getValjaandja_nimi() != null) {
            _hashCode += getValjaandja_nimi().hashCode();
        }
        if (getValjaandja_kood() != null) {
            _hashCode += getValjaandja_kood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
