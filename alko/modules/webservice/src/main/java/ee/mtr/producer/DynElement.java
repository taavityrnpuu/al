/**
 * DynElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class DynElement  implements java.io.Serializable {
    private ee.x_road.mtr.producer.DynVali vali;

    private ee.x_road.mtr.producer.DynPlokk plokk;

    public DynElement() {
    }

    public DynElement(
           ee.x_road.mtr.producer.DynVali vali,
           ee.x_road.mtr.producer.DynPlokk plokk) {
           this.vali = vali;
           this.plokk = plokk;
    }


    /**
     * Gets the vali value for this DynElement.
     * 
     * @return vali
     */
    public ee.x_road.mtr.producer.DynVali getVali() {
        return vali;
    }


    /**
     * Sets the vali value for this DynElement.
     * 
     * @param vali
     */
    public void setVali(ee.x_road.mtr.producer.DynVali vali) {
        this.vali = vali;
    }


    /**
     * Gets the plokk value for this DynElement.
     * 
     * @return plokk
     */
    public ee.x_road.mtr.producer.DynPlokk getPlokk() {
        return plokk;
    }


    /**
     * Sets the plokk value for this DynElement.
     * 
     * @param plokk
     */
    public void setPlokk(ee.x_road.mtr.producer.DynPlokk plokk) {
        this.plokk = plokk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynElement)) return false;
        DynElement other = (DynElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vali==null && other.getVali()==null) || 
             (this.vali!=null &&
              this.vali.equals(other.getVali()))) &&
            ((this.plokk==null && other.getPlokk()==null) || 
             (this.plokk!=null &&
              this.plokk.equals(other.getPlokk())));
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
        if (getVali() != null) {
            _hashCode += getVali().hashCode();
        }
        if (getPlokk() != null) {
            _hashCode += getPlokk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
