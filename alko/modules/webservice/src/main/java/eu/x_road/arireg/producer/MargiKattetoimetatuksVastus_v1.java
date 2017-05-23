/**
 * MargiKattetoimetatuksVastus_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class MargiKattetoimetatuksVastus_v1  implements java.io.Serializable {
    private java.lang.String teade;

    public MargiKattetoimetatuksVastus_v1() {
    }

    public MargiKattetoimetatuksVastus_v1(
           java.lang.String teade) {
           this.teade = teade;
    }


    /**
     * Gets the teade value for this MargiKattetoimetatuksVastus_v1.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this MargiKattetoimetatuksVastus_v1.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MargiKattetoimetatuksVastus_v1)) return false;
        MargiKattetoimetatuksVastus_v1 other = (MargiKattetoimetatuksVastus_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade())));
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
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
