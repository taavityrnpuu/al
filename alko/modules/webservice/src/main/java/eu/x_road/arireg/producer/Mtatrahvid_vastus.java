/**
 * Mtatrahvid_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtatrahvid_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtatrahvid_trahv[] trahvid;

    public Mtatrahvid_vastus() {
    }

    public Mtatrahvid_vastus(
           eu.x_road.arireg.producer.Mtatrahvid_trahv[] trahvid) {
           this.trahvid = trahvid;
    }


    /**
     * Gets the trahvid value for this Mtatrahvid_vastus.
     * 
     * @return trahvid
     */
    public eu.x_road.arireg.producer.Mtatrahvid_trahv[] getTrahvid() {
        return trahvid;
    }


    /**
     * Sets the trahvid value for this Mtatrahvid_vastus.
     * 
     * @param trahvid
     */
    public void setTrahvid(eu.x_road.arireg.producer.Mtatrahvid_trahv[] trahvid) {
        this.trahvid = trahvid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtatrahvid_vastus)) return false;
        Mtatrahvid_vastus other = (Mtatrahvid_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trahvid==null && other.getTrahvid()==null) || 
             (this.trahvid!=null &&
              java.util.Arrays.equals(this.trahvid, other.getTrahvid())));
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
        if (getTrahvid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrahvid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrahvid(), i);
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
