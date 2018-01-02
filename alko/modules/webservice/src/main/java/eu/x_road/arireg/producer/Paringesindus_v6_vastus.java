/**
 * Paringesindus_v6_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringesindus_v6_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Paringesindus_v6_ettevote[] ettevotjad;

    public Paringesindus_v6_vastus() {
    }

    public Paringesindus_v6_vastus(
           eu.x_road.arireg.producer.Paringesindus_v6_ettevote[] ettevotjad) {
           this.ettevotjad = ettevotjad;
    }


    /**
     * Gets the ettevotjad value for this Paringesindus_v6_vastus.
     * 
     * @return ettevotjad
     */
    public eu.x_road.arireg.producer.Paringesindus_v6_ettevote[] getEttevotjad() {
        return ettevotjad;
    }


    /**
     * Sets the ettevotjad value for this Paringesindus_v6_vastus.
     * 
     * @param ettevotjad
     */
    public void setEttevotjad(eu.x_road.arireg.producer.Paringesindus_v6_ettevote[] ettevotjad) {
        this.ettevotjad = ettevotjad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringesindus_v6_vastus)) return false;
        Paringesindus_v6_vastus other = (Paringesindus_v6_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotjad==null && other.getEttevotjad()==null) || 
             (this.ettevotjad!=null &&
              java.util.Arrays.equals(this.ettevotjad, other.getEttevotjad())));
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
        if (getEttevotjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotjad(), i);
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
