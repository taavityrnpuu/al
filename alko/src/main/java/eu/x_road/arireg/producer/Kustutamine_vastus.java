/**
 * Kustutamine_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Kustutamine_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Kustutamine_kirje[] kirjed;

    public Kustutamine_vastus() {
    }

    public Kustutamine_vastus(
           eu.x_road.arireg.producer.Kustutamine_kirje[] kirjed) {
           this.kirjed = kirjed;
    }


    /**
     * Gets the kirjed value for this Kustutamine_vastus.
     * 
     * @return kirjed
     */
    public eu.x_road.arireg.producer.Kustutamine_kirje[] getKirjed() {
        return kirjed;
    }


    /**
     * Sets the kirjed value for this Kustutamine_vastus.
     * 
     * @param kirjed
     */
    public void setKirjed(eu.x_road.arireg.producer.Kustutamine_kirje[] kirjed) {
        this.kirjed = kirjed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kustutamine_vastus)) return false;
        Kustutamine_vastus other = (Kustutamine_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirjed==null && other.getKirjed()==null) || 
             (this.kirjed!=null &&
              java.util.Arrays.equals(this.kirjed, other.getKirjed())));
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
        if (getKirjed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKirjed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKirjed(), i);
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
