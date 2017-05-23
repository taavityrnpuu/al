/**
 * RKOARRAsutused_v1_Sidevahend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class RKOARRAsutused_v1_Sidevahend  implements java.io.Serializable {
    private java.lang.String liik;

    private java.lang.String sisu;

    public RKOARRAsutused_v1_Sidevahend() {
    }

    public RKOARRAsutused_v1_Sidevahend(
           java.lang.String liik,
           java.lang.String sisu) {
           this.liik = liik;
           this.sisu = sisu;
    }


    /**
     * Gets the liik value for this RKOARRAsutused_v1_Sidevahend.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this RKOARRAsutused_v1_Sidevahend.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the sisu value for this RKOARRAsutused_v1_Sidevahend.
     * 
     * @return sisu
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this RKOARRAsutused_v1_Sidevahend.
     * 
     * @param sisu
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RKOARRAsutused_v1_Sidevahend)) return false;
        RKOARRAsutused_v1_Sidevahend other = (RKOARRAsutused_v1_Sidevahend) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
