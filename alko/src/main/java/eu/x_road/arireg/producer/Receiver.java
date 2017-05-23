/**
 * Receiver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Receiver  implements java.io.Serializable {
    /* Saaja nimi. */
    private java.lang.String name;

    /* Saaja id.-kood (isikukood, asutuse/ettevõtte reg. nr.). */
    private java.lang.String regNum;

    /* Saaja arvelduskonto number. */
    private java.lang.String accountNum;

    /* Saaja viitenumber. */
    private java.lang.String refNum;

    /* Tehingu teostamise kuupäev. */
    private java.lang.String receptionDate;

    public Receiver() {
    }

    public Receiver(
           java.lang.String name,
           java.lang.String regNum,
           java.lang.String accountNum,
           java.lang.String refNum,
           java.lang.String receptionDate) {
           this.name = name;
           this.regNum = regNum;
           this.accountNum = accountNum;
           this.refNum = refNum;
           this.receptionDate = receptionDate;
    }


    /**
     * Gets the name value for this Receiver.
     * 
     * @return name   * Saaja nimi.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Receiver.
     * 
     * @param name   * Saaja nimi.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the regNum value for this Receiver.
     * 
     * @return regNum   * Saaja id.-kood (isikukood, asutuse/ettevõtte reg. nr.).
     */
    public java.lang.String getRegNum() {
        return regNum;
    }


    /**
     * Sets the regNum value for this Receiver.
     * 
     * @param regNum   * Saaja id.-kood (isikukood, asutuse/ettevõtte reg. nr.).
     */
    public void setRegNum(java.lang.String regNum) {
        this.regNum = regNum;
    }


    /**
     * Gets the accountNum value for this Receiver.
     * 
     * @return accountNum   * Saaja arvelduskonto number.
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this Receiver.
     * 
     * @param accountNum   * Saaja arvelduskonto number.
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the refNum value for this Receiver.
     * 
     * @return refNum   * Saaja viitenumber.
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this Receiver.
     * 
     * @param refNum   * Saaja viitenumber.
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the receptionDate value for this Receiver.
     * 
     * @return receptionDate   * Tehingu teostamise kuupäev.
     */
    public java.lang.String getReceptionDate() {
        return receptionDate;
    }


    /**
     * Sets the receptionDate value for this Receiver.
     * 
     * @param receptionDate   * Tehingu teostamise kuupäev.
     */
    public void setReceptionDate(java.lang.String receptionDate) {
        this.receptionDate = receptionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Receiver)) return false;
        Receiver other = (Receiver) obj;
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
            ((this.receptionDate==null && other.getReceptionDate()==null) || 
             (this.receptionDate!=null &&
              this.receptionDate.equals(other.getReceptionDate())));
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
        if (getReceptionDate() != null) {
            _hashCode += getReceptionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
