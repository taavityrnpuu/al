/**
 * Payer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Payer  implements java.io.Serializable {
    /* Maksja nimi. */
    private java.lang.String name;

    /* Maksja id.-kood (isikukood, asutuse/ettevõtte reg. nr.). */
    private java.lang.String regNum;

    /* Maksja arvelduskonto number. */
    private java.lang.String accountNum;

    /* Maksja viitenumber, mille alusel saab tehingu siduda teise
     * infosüsteemiga. */
    private java.lang.String refNum;

    /* Tehingu Maksjapoolne väärtuspäev. */
    private java.lang.String transmissionDate;

    public Payer() {
    }

    public Payer(
           java.lang.String name,
           java.lang.String regNum,
           java.lang.String accountNum,
           java.lang.String refNum,
           java.lang.String transmissionDate) {
           this.name = name;
           this.regNum = regNum;
           this.accountNum = accountNum;
           this.refNum = refNum;
           this.transmissionDate = transmissionDate;
    }


    /**
     * Gets the name value for this Payer.
     * 
     * @return name   * Maksja nimi.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Payer.
     * 
     * @param name   * Maksja nimi.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the regNum value for this Payer.
     * 
     * @return regNum   * Maksja id.-kood (isikukood, asutuse/ettevõtte reg. nr.).
     */
    public java.lang.String getRegNum() {
        return regNum;
    }


    /**
     * Sets the regNum value for this Payer.
     * 
     * @param regNum   * Maksja id.-kood (isikukood, asutuse/ettevõtte reg. nr.).
     */
    public void setRegNum(java.lang.String regNum) {
        this.regNum = regNum;
    }


    /**
     * Gets the accountNum value for this Payer.
     * 
     * @return accountNum   * Maksja arvelduskonto number.
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this Payer.
     * 
     * @param accountNum   * Maksja arvelduskonto number.
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the refNum value for this Payer.
     * 
     * @return refNum   * Maksja viitenumber, mille alusel saab tehingu siduda teise
     * infosüsteemiga.
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this Payer.
     * 
     * @param refNum   * Maksja viitenumber, mille alusel saab tehingu siduda teise
     * infosüsteemiga.
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the transmissionDate value for this Payer.
     * 
     * @return transmissionDate   * Tehingu Maksjapoolne väärtuspäev.
     */
    public java.lang.String getTransmissionDate() {
        return transmissionDate;
    }


    /**
     * Sets the transmissionDate value for this Payer.
     * 
     * @param transmissionDate   * Tehingu Maksjapoolne väärtuspäev.
     */
    public void setTransmissionDate(java.lang.String transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Payer)) return false;
        Payer other = (Payer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.regNum==null && other.getRegNum()==null) || 
             (this.regNum!=null &&
              this.regNum.equals(other.getRegNum()))) &&
            ((this.accountNum==null && other.getAccountNum()==null) || 
             (this.accountNum!=null &&
              this.accountNum.equals(other.getAccountNum()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.transmissionDate==null && other.getTransmissionDate()==null) || 
             (this.transmissionDate!=null &&
              this.transmissionDate.equals(other.getTransmissionDate())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRegNum() != null) {
            _hashCode += getRegNum().hashCode();
        }
        if (getAccountNum() != null) {
            _hashCode += getAccountNum().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getTransmissionDate() != null) {
            _hashCode += getTransmissionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
