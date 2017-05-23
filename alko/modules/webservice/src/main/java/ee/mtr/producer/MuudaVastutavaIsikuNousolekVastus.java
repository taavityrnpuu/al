/**
 * MuudaVastutavaIsikuNousolekVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class MuudaVastutavaIsikuNousolekVastus  implements java.io.Serializable {
    private boolean ok;

    public MuudaVastutavaIsikuNousolekVastus() {
    }

    public MuudaVastutavaIsikuNousolekVastus(
           boolean ok) {
           this.ok = ok;
    }


    /**
     * Gets the ok value for this MuudaVastutavaIsikuNousolekVastus.
     * 
     * @return ok
     */
    public boolean isOk() {
        return ok;
    }


    /**
     * Sets the ok value for this MuudaVastutavaIsikuNousolekVastus.
     * 
     * @param ok
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MuudaVastutavaIsikuNousolekVastus)) return false;
        MuudaVastutavaIsikuNousolekVastus other = (MuudaVastutavaIsikuNousolekVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ok == other.isOk();
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
        _hashCode += (isOk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
