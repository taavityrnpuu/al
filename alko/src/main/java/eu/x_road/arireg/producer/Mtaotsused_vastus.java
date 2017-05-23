/**
 * Mtaotsused_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtaotsused_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtaotsused_otsus[] otsused;

    public Mtaotsused_vastus() {
    }

    public Mtaotsused_vastus(
           eu.x_road.arireg.producer.Mtaotsused_otsus[] otsused) {
           this.otsused = otsused;
    }


    /**
     * Gets the otsused value for this Mtaotsused_vastus.
     * 
     * @return otsused
     */
    public eu.x_road.arireg.producer.Mtaotsused_otsus[] getOtsused() {
        return otsused;
    }


    /**
     * Sets the otsused value for this Mtaotsused_vastus.
     * 
     * @param otsused
     */
    public void setOtsused(eu.x_road.arireg.producer.Mtaotsused_otsus[] otsused) {
        this.otsused = otsused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtaotsused_vastus)) return false;
        Mtaotsused_vastus other = (Mtaotsused_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otsused==null && other.getOtsused()==null) || 
             (this.otsused!=null &&
              java.util.Arrays.equals(this.otsused, other.getOtsused())));
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
        if (getOtsused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtsused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtsused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
