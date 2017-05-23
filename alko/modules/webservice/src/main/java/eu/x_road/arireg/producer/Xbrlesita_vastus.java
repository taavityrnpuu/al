/**
 * Xbrlesita_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesita_vastus  implements java.io.Serializable {
    private int status;

    private java.lang.String status_text;

    private java.lang.Integer majpaevik_paev_nr;

    public Xbrlesita_vastus() {
    }

    public Xbrlesita_vastus(
           int status,
           java.lang.String status_text,
           java.lang.Integer majpaevik_paev_nr) {
           this.status = status;
           this.status_text = status_text;
           this.majpaevik_paev_nr = majpaevik_paev_nr;
    }


    /**
     * Gets the status value for this Xbrlesita_vastus.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Xbrlesita_vastus.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the status_text value for this Xbrlesita_vastus.
     * 
     * @return status_text
     */
    public java.lang.String getStatus_text() {
        return status_text;
    }


    /**
     * Sets the status_text value for this Xbrlesita_vastus.
     * 
     * @param status_text
     */
    public void setStatus_text(java.lang.String status_text) {
        this.status_text = status_text;
    }


    /**
     * Gets the majpaevik_paev_nr value for this Xbrlesita_vastus.
     * 
     * @return majpaevik_paev_nr
     */
    public java.lang.Integer getMajpaevik_paev_nr() {
        return majpaevik_paev_nr;
    }


    /**
     * Sets the majpaevik_paev_nr value for this Xbrlesita_vastus.
     * 
     * @param majpaevik_paev_nr
     */
    public void setMajpaevik_paev_nr(java.lang.Integer majpaevik_paev_nr) {
        this.majpaevik_paev_nr = majpaevik_paev_nr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesita_vastus)) return false;
        Xbrlesita_vastus other = (Xbrlesita_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.status_text==null && other.getStatus_text()==null) || 
             (this.status_text!=null &&
              this.status_text.equals(other.getStatus_text()))) &&
            ((this.majpaevik_paev_nr==null && other.getMajpaevik_paev_nr()==null) || 
             (this.majpaevik_paev_nr!=null &&
              this.majpaevik_paev_nr.equals(other.getMajpaevik_paev_nr())));
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
        _hashCode += getStatus();
        if (getStatus_text() != null) {
            _hashCode += getStatus_text().hashCode();
        }
        if (getMajpaevik_paev_nr() != null) {
            _hashCode += getMajpaevik_paev_nr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
