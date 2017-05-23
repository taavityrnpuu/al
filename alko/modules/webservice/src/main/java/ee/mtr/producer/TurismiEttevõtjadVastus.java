/**
 * TurismiEttevõtjadVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TurismiEttevõtjadVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.Asutus[] asutused;

    public TurismiEttevõtjadVastus() {
    }

    public TurismiEttevõtjadVastus(
           ee.x_road.mtr.producer.Asutus[] asutused) {
           this.asutused = asutused;
    }


    /**
     * Gets the asutused value for this TurismiEttevõtjadVastus.
     * 
     * @return asutused
     */
    public ee.x_road.mtr.producer.Asutus[] getAsutused() {
        return asutused;
    }


    /**
     * Sets the asutused value for this TurismiEttevõtjadVastus.
     * 
     * @param asutused
     */
    public void setAsutused(ee.x_road.mtr.producer.Asutus[] asutused) {
        this.asutused = asutused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TurismiEttevõtjadVastus)) return false;
        TurismiEttevõtjadVastus other = (TurismiEttevõtjadVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asutused==null && other.getAsutused()==null) || 
             (this.asutused!=null &&
              java.util.Arrays.equals(this.asutused, other.getAsutused())));
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
        if (getAsutused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsutused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsutused(), i);
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
