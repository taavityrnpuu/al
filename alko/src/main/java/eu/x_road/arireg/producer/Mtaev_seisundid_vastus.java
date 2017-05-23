/**
 * Mtaev_seisundid_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtaev_seisundid_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Mtaev_seisundid_seisund[] seisundid;

    public Mtaev_seisundid_vastus() {
    }

    public Mtaev_seisundid_vastus(
           eu.x_road.arireg.producer.Mtaev_seisundid_seisund[] seisundid) {
           this.seisundid = seisundid;
    }


    /**
     * Gets the seisundid value for this Mtaev_seisundid_vastus.
     * 
     * @return seisundid
     */
    public eu.x_road.arireg.producer.Mtaev_seisundid_seisund[] getSeisundid() {
        return seisundid;
    }


    /**
     * Sets the seisundid value for this Mtaev_seisundid_vastus.
     * 
     * @param seisundid
     */
    public void setSeisundid(eu.x_road.arireg.producer.Mtaev_seisundid_seisund[] seisundid) {
        this.seisundid = seisundid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtaev_seisundid_vastus)) return false;
        Mtaev_seisundid_vastus other = (Mtaev_seisundid_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seisundid==null && other.getSeisundid()==null) || 
             (this.seisundid!=null &&
              java.util.Arrays.equals(this.seisundid, other.getSeisundid())));
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
        if (getSeisundid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeisundid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeisundid(), i);
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
