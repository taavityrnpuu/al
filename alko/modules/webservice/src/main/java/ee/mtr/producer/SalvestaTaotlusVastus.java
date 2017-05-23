/**
 * SalvestaTaotlusVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaTaotlusVastus  implements java.io.Serializable {
    private boolean OK;

    private java.math.BigInteger ID;

    private java.lang.String veateade;

    public SalvestaTaotlusVastus() {
    }

    public SalvestaTaotlusVastus(
           boolean OK,
           java.math.BigInteger ID,
           java.lang.String veateade) {
           this.OK = OK;
           this.ID = ID;
           this.veateade = veateade;
    }


    /**
     * Gets the OK value for this SalvestaTaotlusVastus.
     * 
     * @return OK
     */
    public boolean isOK() {
        return OK;
    }


    /**
     * Sets the OK value for this SalvestaTaotlusVastus.
     * 
     * @param OK
     */
    public void setOK(boolean OK) {
        this.OK = OK;
    }


    /**
     * Gets the ID value for this SalvestaTaotlusVastus.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SalvestaTaotlusVastus.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the veateade value for this SalvestaTaotlusVastus.
     * 
     * @return veateade
     */
    public java.lang.String getVeateade() {
        return veateade;
    }


    /**
     * Sets the veateade value for this SalvestaTaotlusVastus.
     * 
     * @param veateade
     */
    public void setVeateade(java.lang.String veateade) {
        this.veateade = veateade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaTaotlusVastus)) return false;
        SalvestaTaotlusVastus other = (SalvestaTaotlusVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.OK == other.isOK() &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.veateade==null && other.getVeateade()==null) || 
             (this.veateade!=null &&
              this.veateade.equals(other.getVeateade())));
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
        _hashCode += (isOK() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getVeateade() != null) {
            _hashCode += getVeateade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
