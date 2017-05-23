/**
 * Company.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Company  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String regNumber;

    private int carCount;

    public Company() {
    }

    public Company(
           java.lang.String name,
           java.lang.String regNumber,
           int carCount) {
           this.name = name;
           this.regNumber = regNumber;
           this.carCount = carCount;
    }


    /**
     * Gets the name value for this Company.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Company.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the regNumber value for this Company.
     * 
     * @return regNumber
     */
    public java.lang.String getRegNumber() {
        return regNumber;
    }


    /**
     * Sets the regNumber value for this Company.
     * 
     * @param regNumber
     */
    public void setRegNumber(java.lang.String regNumber) {
        this.regNumber = regNumber;
    }


    /**
     * Gets the carCount value for this Company.
     * 
     * @return carCount
     */
    public int getCarCount() {
        return carCount;
    }


    /**
     * Sets the carCount value for this Company.
     * 
     * @param carCount
     */
    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Company)) return false;
        Company other = (Company) obj;
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
            ((this.regNumber==null && other.getRegNumber()==null) || 
             (this.regNumber!=null &&
              this.regNumber.equals(other.getRegNumber()))) &&
            this.carCount == other.getCarCount();
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
        if (getRegNumber() != null) {
            _hashCode += getRegNumber().hashCode();
        }
        _hashCode += getCarCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
