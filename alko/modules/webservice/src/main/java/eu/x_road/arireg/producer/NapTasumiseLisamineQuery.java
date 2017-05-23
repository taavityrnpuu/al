/**
 * NapTasumiseLisamineQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class NapTasumiseLisamineQuery  implements java.io.Serializable {
    private eu.x_road.arireg.producer.NapTasumiseLisamineType napTasumiseLisamine;

    public NapTasumiseLisamineQuery() {
    }

    public NapTasumiseLisamineQuery(
           eu.x_road.arireg.producer.NapTasumiseLisamineType napTasumiseLisamine) {
           this.napTasumiseLisamine = napTasumiseLisamine;
    }


    /**
     * Gets the napTasumiseLisamine value for this NapTasumiseLisamineQuery.
     * 
     * @return napTasumiseLisamine
     */
    public eu.x_road.arireg.producer.NapTasumiseLisamineType getNapTasumiseLisamine() {
        return napTasumiseLisamine;
    }


    /**
     * Sets the napTasumiseLisamine value for this NapTasumiseLisamineQuery.
     * 
     * @param napTasumiseLisamine
     */
    public void setNapTasumiseLisamine(eu.x_road.arireg.producer.NapTasumiseLisamineType napTasumiseLisamine) {
        this.napTasumiseLisamine = napTasumiseLisamine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NapTasumiseLisamineQuery)) return false;
        NapTasumiseLisamineQuery other = (NapTasumiseLisamineQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.napTasumiseLisamine==null && other.getNapTasumiseLisamine()==null) || 
             (this.napTasumiseLisamine!=null &&
              this.napTasumiseLisamine.equals(other.getNapTasumiseLisamine())));
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
        if (getNapTasumiseLisamine() != null) {
            _hashCode += getNapTasumiseLisamine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
