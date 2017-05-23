/**
 * Mtabilanssfv3_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtabilanssfv3_vastus  implements java.io.Serializable {
    private org.apache.axis.types.URI manuse_id;

    public Mtabilanssfv3_vastus() {
    }

    public Mtabilanssfv3_vastus(
           org.apache.axis.types.URI manuse_id) {
           this.manuse_id = manuse_id;
    }


    /**
     * Gets the manuse_id value for this Mtabilanssfv3_vastus.
     * 
     * @return manuse_id
     */
    public org.apache.axis.types.URI getManuse_id() {
        return manuse_id;
    }


    /**
     * Sets the manuse_id value for this Mtabilanssfv3_vastus.
     * 
     * @param manuse_id
     */
    public void setManuse_id(org.apache.axis.types.URI manuse_id) {
        this.manuse_id = manuse_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtabilanssfv3_vastus)) return false;
        Mtabilanssfv3_vastus other = (Mtabilanssfv3_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manuse_id==null && other.getManuse_id()==null) || 
             (this.manuse_id!=null &&
              this.manuse_id.equals(other.getManuse_id())));
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
        if (getManuse_id() != null) {
            _hashCode += getManuse_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
