/**
 * Mtabilsisuv2_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtabilsisuv2_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtabilsisuv2_aruanne[] aruanded;

    public Mtabilsisuv2_vastus() {
    }

    public Mtabilsisuv2_vastus(
           eu.x_road.arireg.producer.Mtabilsisuv2_aruanne[] aruanded) {
           this.aruanded = aruanded;
    }


    /**
     * Gets the aruanded value for this Mtabilsisuv2_vastus.
     * 
     * @return aruanded
     */
    public eu.x_road.arireg.producer.Mtabilsisuv2_aruanne[] getAruanded() {
        return aruanded;
    }


    /**
     * Sets the aruanded value for this Mtabilsisuv2_vastus.
     * 
     * @param aruanded
     */
    public void setAruanded(eu.x_road.arireg.producer.Mtabilsisuv2_aruanne[] aruanded) {
        this.aruanded = aruanded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtabilsisuv2_vastus)) return false;
        Mtabilsisuv2_vastus other = (Mtabilsisuv2_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aruanded==null && other.getAruanded()==null) || 
             (this.aruanded!=null &&
              java.util.Arrays.equals(this.aruanded, other.getAruanded())));
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
        if (getAruanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAruanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAruanded(), i);
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
