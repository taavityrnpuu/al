/**
 * TaksolubaVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaksolubaVastus  implements java.io.Serializable {
    private boolean omabKehtivatLuba;

    public TaksolubaVastus() {
    }

    public TaksolubaVastus(
           boolean omabKehtivatLuba) {
           this.omabKehtivatLuba = omabKehtivatLuba;
    }


    /**
     * Gets the omabKehtivatLuba value for this TaksolubaVastus.
     * 
     * @return omabKehtivatLuba
     */
    public boolean isOmabKehtivatLuba() {
        return omabKehtivatLuba;
    }


    /**
     * Sets the omabKehtivatLuba value for this TaksolubaVastus.
     * 
     * @param omabKehtivatLuba
     */
    public void setOmabKehtivatLuba(boolean omabKehtivatLuba) {
        this.omabKehtivatLuba = omabKehtivatLuba;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaksolubaVastus)) return false;
        TaksolubaVastus other = (TaksolubaVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.omabKehtivatLuba == other.isOmabKehtivatLuba();
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
        _hashCode += (isOmabKehtivatLuba() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
