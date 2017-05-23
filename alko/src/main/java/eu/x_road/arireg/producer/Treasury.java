/**
 * Treasury.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Treasury  implements java.io.Serializable {
    /* Dokumendi number. */
    private java.lang.String documentNum;

    /* Tehingu Riigikassapoolne unikaalne töökood (arhiveerimistunnus). */
    private java.lang.String orderNum;

    /* Tehingu pangapoolne arhiveerimistunnus juhul, kui on sooritatud
     * panga vahendusel. */
    private java.lang.String bankRef;

    public Treasury() {
    }

    public Treasury(
           java.lang.String documentNum,
           java.lang.String orderNum,
           java.lang.String bankRef) {
           this.documentNum = documentNum;
           this.orderNum = orderNum;
           this.bankRef = bankRef;
    }


    /**
     * Gets the documentNum value for this Treasury.
     * 
     * @return documentNum   * Dokumendi number.
     */
    public java.lang.String getDocumentNum() {
        return documentNum;
    }


    /**
     * Sets the documentNum value for this Treasury.
     * 
     * @param documentNum   * Dokumendi number.
     */
    public void setDocumentNum(java.lang.String documentNum) {
        this.documentNum = documentNum;
    }


    /**
     * Gets the orderNum value for this Treasury.
     * 
     * @return orderNum   * Tehingu Riigikassapoolne unikaalne töökood (arhiveerimistunnus).
     */
    public java.lang.String getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Treasury.
     * 
     * @param orderNum   * Tehingu Riigikassapoolne unikaalne töökood (arhiveerimistunnus).
     */
    public void setOrderNum(java.lang.String orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the bankRef value for this Treasury.
     * 
     * @return bankRef   * Tehingu pangapoolne arhiveerimistunnus juhul, kui on sooritatud
     * panga vahendusel.
     */
    public java.lang.String getBankRef() {
        return bankRef;
    }


    /**
     * Sets the bankRef value for this Treasury.
     * 
     * @param bankRef   * Tehingu pangapoolne arhiveerimistunnus juhul, kui on sooritatud
     * panga vahendusel.
     */
    public void setBankRef(java.lang.String bankRef) {
        this.bankRef = bankRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Treasury)) return false;
        Treasury other = (Treasury) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentNum==null && other.getDocumentNum()==null) || 
             (this.documentNum!=null &&
              this.documentNum.equals(other.getDocumentNum()))) &&
            ((this.orderNum==null && other.getOrderNum()==null) || 
             (this.orderNum!=null &&
              this.orderNum.equals(other.getOrderNum()))) &&
            ((this.bankRef==null && other.getBankRef()==null) || 
             (this.bankRef!=null &&
              this.bankRef.equals(other.getBankRef())));
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
        if (getDocumentNum() != null) {
            _hashCode += getDocumentNum().hashCode();
        }
        if (getOrderNum() != null) {
            _hashCode += getOrderNum().hashCode();
        }
        if (getBankRef() != null) {
            _hashCode += getBankRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
