/**
 * RKOARRAsutusedParing_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class RKOARRAsutusedParing_v1  implements java.io.Serializable {
    private java.lang.Boolean kuva_kehtetud;

    public RKOARRAsutusedParing_v1() {
    }

    public RKOARRAsutusedParing_v1(
           java.lang.Boolean kuva_kehtetud) {
           this.kuva_kehtetud = kuva_kehtetud;
    }


    /**
     * Gets the kuva_kehtetud value for this RKOARRAsutusedParing_v1.
     * 
     * @return kuva_kehtetud
     */
    public java.lang.Boolean getKuva_kehtetud() {
        return kuva_kehtetud;
    }


    /**
     * Sets the kuva_kehtetud value for this RKOARRAsutusedParing_v1.
     * 
     * @param kuva_kehtetud
     */
    public void setKuva_kehtetud(java.lang.Boolean kuva_kehtetud) {
        this.kuva_kehtetud = kuva_kehtetud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RKOARRAsutusedParing_v1)) return false;
        RKOARRAsutusedParing_v1 other = (RKOARRAsutusedParing_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kuva_kehtetud==null && other.getKuva_kehtetud()==null) || 
             (this.kuva_kehtetud!=null &&
              this.kuva_kehtetud.equals(other.getKuva_kehtetud())));
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
        if (getKuva_kehtetud() != null) {
            _hashCode += getKuva_kehtetud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
