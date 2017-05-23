/**
 * MinuTaotlusParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class MinuTaotlusParing  implements java.io.Serializable {
    private java.math.BigInteger ID;

    private java.math.BigInteger vormiVersioonID;

    public MinuTaotlusParing() {
    }

    public MinuTaotlusParing(
           java.math.BigInteger ID,
           java.math.BigInteger vormiVersioonID) {
           this.ID = ID;
           this.vormiVersioonID = vormiVersioonID;
    }


    /**
     * Gets the ID value for this MinuTaotlusParing.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this MinuTaotlusParing.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the vormiVersioonID value for this MinuTaotlusParing.
     * 
     * @return vormiVersioonID
     */
    public java.math.BigInteger getVormiVersioonID() {
        return vormiVersioonID;
    }


    /**
     * Sets the vormiVersioonID value for this MinuTaotlusParing.
     * 
     * @param vormiVersioonID
     */
    public void setVormiVersioonID(java.math.BigInteger vormiVersioonID) {
        this.vormiVersioonID = vormiVersioonID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinuTaotlusParing)) return false;
        MinuTaotlusParing other = (MinuTaotlusParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.vormiVersioonID==null && other.getVormiVersioonID()==null) || 
             (this.vormiVersioonID!=null &&
              this.vormiVersioonID.equals(other.getVormiVersioonID())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getVormiVersioonID() != null) {
            _hashCode += getVormiVersioonID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
