/**
 * Mtabilanssv3_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtabilanssv3_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtabilanssv3_bilanss[] bilansid;

    public Mtabilanssv3_vastus() {
    }

    public Mtabilanssv3_vastus(
           eu.x_road.arireg.producer.Mtabilanssv3_bilanss[] bilansid) {
           this.bilansid = bilansid;
    }


    /**
     * Gets the bilansid value for this Mtabilanssv3_vastus.
     * 
     * @return bilansid
     */
    public eu.x_road.arireg.producer.Mtabilanssv3_bilanss[] getBilansid() {
        return bilansid;
    }


    /**
     * Sets the bilansid value for this Mtabilanssv3_vastus.
     * 
     * @param bilansid
     */
    public void setBilansid(eu.x_road.arireg.producer.Mtabilanssv3_bilanss[] bilansid) {
        this.bilansid = bilansid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtabilanssv3_vastus)) return false;
        Mtabilanssv3_vastus other = (Mtabilanssv3_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bilansid==null && other.getBilansid()==null) || 
             (this.bilansid!=null &&
              java.util.Arrays.equals(this.bilansid, other.getBilansid())));
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
        if (getBilansid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBilansid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBilansid(), i);
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
