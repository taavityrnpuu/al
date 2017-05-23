/**
 * Mtapaevik_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtapaevik_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtapaevik_paevik[] paevikud;

    public Mtapaevik_vastus() {
    }

    public Mtapaevik_vastus(
           eu.x_road.arireg.producer.Mtapaevik_paevik[] paevikud) {
           this.paevikud = paevikud;
    }


    /**
     * Gets the paevikud value for this Mtapaevik_vastus.
     * 
     * @return paevikud
     */
    public eu.x_road.arireg.producer.Mtapaevik_paevik[] getPaevikud() {
        return paevikud;
    }


    /**
     * Sets the paevikud value for this Mtapaevik_vastus.
     * 
     * @param paevikud
     */
    public void setPaevikud(eu.x_road.arireg.producer.Mtapaevik_paevik[] paevikud) {
        this.paevikud = paevikud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtapaevik_vastus)) return false;
        Mtapaevik_vastus other = (Mtapaevik_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paevikud==null && other.getPaevikud()==null) || 
             (this.paevikud!=null &&
              java.util.Arrays.equals(this.paevikud, other.getPaevikud())));
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
        if (getPaevikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaevikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaevikud(), i);
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
