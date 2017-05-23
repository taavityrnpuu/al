/**
 * Mtahoiatused_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtahoiatused_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtahoiatused_hoiatus[] hoiatused;

    public Mtahoiatused_vastus() {
    }

    public Mtahoiatused_vastus(
           eu.x_road.arireg.producer.Mtahoiatused_hoiatus[] hoiatused) {
           this.hoiatused = hoiatused;
    }


    /**
     * Gets the hoiatused value for this Mtahoiatused_vastus.
     * 
     * @return hoiatused
     */
    public eu.x_road.arireg.producer.Mtahoiatused_hoiatus[] getHoiatused() {
        return hoiatused;
    }


    /**
     * Sets the hoiatused value for this Mtahoiatused_vastus.
     * 
     * @param hoiatused
     */
    public void setHoiatused(eu.x_road.arireg.producer.Mtahoiatused_hoiatus[] hoiatused) {
        this.hoiatused = hoiatused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtahoiatused_vastus)) return false;
        Mtahoiatused_vastus other = (Mtahoiatused_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hoiatused==null && other.getHoiatused()==null) || 
             (this.hoiatused!=null &&
              java.util.Arrays.equals(this.hoiatused, other.getHoiatused())));
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
        if (getHoiatused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHoiatused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHoiatused(), i);
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
