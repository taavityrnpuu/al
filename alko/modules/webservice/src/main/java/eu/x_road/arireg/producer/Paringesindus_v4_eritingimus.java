/**
 * Paringesindus_v4_eritingimus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringesindus_v4_eritingimus  implements java.io.Serializable {
    private java.lang.String item;

    public Paringesindus_v4_eritingimus() {
    }

    public Paringesindus_v4_eritingimus(
           java.lang.String item) {
           this.item = item;
    }


    /**
     * Gets the item value for this Paringesindus_v4_eritingimus.
     * 
     * @return item
     */
    public java.lang.String getItem() {
        return item;
    }


    /**
     * Sets the item value for this Paringesindus_v4_eritingimus.
     * 
     * @param item
     */
    public void setItem(java.lang.String item) {
        this.item = item;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringesindus_v4_eritingimus)) return false;
        Paringesindus_v4_eritingimus other = (Paringesindus_v4_eritingimus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
