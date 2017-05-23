/**
 * Paringnimesobivus_v2_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringnimesobivus_v2_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Paringnimesobivus_v2_rida[] nimed;

    public Paringnimesobivus_v2_vastus() {
    }

    public Paringnimesobivus_v2_vastus(
           eu.x_road.arireg.producer.Paringnimesobivus_v2_rida[] nimed) {
           this.nimed = nimed;
    }


    /**
     * Gets the nimed value for this Paringnimesobivus_v2_vastus.
     * 
     * @return nimed
     */
    public eu.x_road.arireg.producer.Paringnimesobivus_v2_rida[] getNimed() {
        return nimed;
    }


    /**
     * Sets the nimed value for this Paringnimesobivus_v2_vastus.
     * 
     * @param nimed
     */
    public void setNimed(eu.x_road.arireg.producer.Paringnimesobivus_v2_rida[] nimed) {
        this.nimed = nimed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringnimesobivus_v2_vastus)) return false;
        Paringnimesobivus_v2_vastus other = (Paringnimesobivus_v2_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimed==null && other.getNimed()==null) || 
             (this.nimed!=null &&
              java.util.Arrays.equals(this.nimed, other.getNimed())));
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
        if (getNimed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNimed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNimed(), i);
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
