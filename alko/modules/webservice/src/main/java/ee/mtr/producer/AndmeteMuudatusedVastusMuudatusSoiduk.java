/**
 * AndmeteMuudatusedVastusMuudatusSoiduk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AndmeteMuudatusedVastusMuudatusSoiduk  implements java.io.Serializable {
    private java.lang.String registreerimismark;

    private java.math.BigInteger ehitusaasta;

    public AndmeteMuudatusedVastusMuudatusSoiduk() {
    }

    public AndmeteMuudatusedVastusMuudatusSoiduk(
           java.lang.String registreerimismark,
           java.math.BigInteger ehitusaasta) {
           this.registreerimismark = registreerimismark;
           this.ehitusaasta = ehitusaasta;
    }


    /**
     * Gets the registreerimismark value for this AndmeteMuudatusedVastusMuudatusSoiduk.
     * 
     * @return registreerimismark
     */
    public java.lang.String getRegistreerimismark() {
        return registreerimismark;
    }


    /**
     * Sets the registreerimismark value for this AndmeteMuudatusedVastusMuudatusSoiduk.
     * 
     * @param registreerimismark
     */
    public void setRegistreerimismark(java.lang.String registreerimismark) {
        this.registreerimismark = registreerimismark;
    }


    /**
     * Gets the ehitusaasta value for this AndmeteMuudatusedVastusMuudatusSoiduk.
     * 
     * @return ehitusaasta
     */
    public java.math.BigInteger getEhitusaasta() {
        return ehitusaasta;
    }


    /**
     * Sets the ehitusaasta value for this AndmeteMuudatusedVastusMuudatusSoiduk.
     * 
     * @param ehitusaasta
     */
    public void setEhitusaasta(java.math.BigInteger ehitusaasta) {
        this.ehitusaasta = ehitusaasta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndmeteMuudatusedVastusMuudatusSoiduk)) return false;
        AndmeteMuudatusedVastusMuudatusSoiduk other = (AndmeteMuudatusedVastusMuudatusSoiduk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registreerimismark==null && other.getRegistreerimismark()==null) || 
             (this.registreerimismark!=null &&
              this.registreerimismark.equals(other.getRegistreerimismark()))) &&
            ((this.ehitusaasta==null && other.getEhitusaasta()==null) || 
             (this.ehitusaasta!=null &&
              this.ehitusaasta.equals(other.getEhitusaasta())));
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
        if (getRegistreerimismark() != null) {
            _hashCode += getRegistreerimismark().hashCode();
        }
        if (getEhitusaasta() != null) {
            _hashCode += getEhitusaasta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
