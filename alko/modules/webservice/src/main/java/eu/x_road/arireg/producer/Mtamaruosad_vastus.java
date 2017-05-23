/**
 * Mtamaruosad_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtamaruosad_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtamaruosad_osa[] osad;

    public Mtamaruosad_vastus() {
    }

    public Mtamaruosad_vastus(
           eu.x_road.arireg.producer.Mtamaruosad_osa[] osad) {
           this.osad = osad;
    }


    /**
     * Gets the osad value for this Mtamaruosad_vastus.
     * 
     * @return osad
     */
    public eu.x_road.arireg.producer.Mtamaruosad_osa[] getOsad() {
        return osad;
    }


    /**
     * Sets the osad value for this Mtamaruosad_vastus.
     * 
     * @param osad
     */
    public void setOsad(eu.x_road.arireg.producer.Mtamaruosad_osa[] osad) {
        this.osad = osad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtamaruosad_vastus)) return false;
        Mtamaruosad_vastus other = (Mtamaruosad_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.osad==null && other.getOsad()==null) || 
             (this.osad!=null &&
              java.util.Arrays.equals(this.osad, other.getOsad())));
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
        if (getOsad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOsad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOsad(), i);
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
