/**
 * MokaQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class MokaQuery  implements java.io.Serializable {
    private eu.x_road.arireg.producer.MokaType moka;

    public MokaQuery() {
    }

    public MokaQuery(
           eu.x_road.arireg.producer.MokaType moka) {
           this.moka = moka;
    }


    /**
     * Gets the moka value for this MokaQuery.
     * 
     * @return moka
     */
    public eu.x_road.arireg.producer.MokaType getMoka() {
        return moka;
    }


    /**
     * Sets the moka value for this MokaQuery.
     * 
     * @param moka
     */
    public void setMoka(eu.x_road.arireg.producer.MokaType moka) {
        this.moka = moka;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MokaQuery)) return false;
        MokaQuery other = (MokaQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moka==null && other.getMoka()==null) || 
             (this.moka!=null &&
              this.moka.equals(other.getMoka())));
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
        if (getMoka() != null) {
            _hashCode += getMoka().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
