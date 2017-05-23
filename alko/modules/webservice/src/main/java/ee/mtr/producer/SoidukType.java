/**
 * SoidukType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SoidukType  implements java.io.Serializable {
    private java.lang.String registreerimismark;

    private java.lang.String mark;

    private java.lang.String mudel;

    private java.lang.String ehitusaasta;

    public SoidukType() {
    }

    public SoidukType(
           java.lang.String registreerimismark,
           java.lang.String mark,
           java.lang.String mudel,
           java.lang.String ehitusaasta) {
           this.registreerimismark = registreerimismark;
           this.mark = mark;
           this.mudel = mudel;
           this.ehitusaasta = ehitusaasta;
    }


    /**
     * Gets the registreerimismark value for this SoidukType.
     * 
     * @return registreerimismark
     */
    public java.lang.String getRegistreerimismark() {
        return registreerimismark;
    }


    /**
     * Sets the registreerimismark value for this SoidukType.
     * 
     * @param registreerimismark
     */
    public void setRegistreerimismark(java.lang.String registreerimismark) {
        this.registreerimismark = registreerimismark;
    }


    /**
     * Gets the mark value for this SoidukType.
     * 
     * @return mark
     */
    public java.lang.String getMark() {
        return mark;
    }


    /**
     * Sets the mark value for this SoidukType.
     * 
     * @param mark
     */
    public void setMark(java.lang.String mark) {
        this.mark = mark;
    }


    /**
     * Gets the mudel value for this SoidukType.
     * 
     * @return mudel
     */
    public java.lang.String getMudel() {
        return mudel;
    }


    /**
     * Sets the mudel value for this SoidukType.
     * 
     * @param mudel
     */
    public void setMudel(java.lang.String mudel) {
        this.mudel = mudel;
    }


    /**
     * Gets the ehitusaasta value for this SoidukType.
     * 
     * @return ehitusaasta
     */
    public java.lang.String getEhitusaasta() {
        return ehitusaasta;
    }


    /**
     * Sets the ehitusaasta value for this SoidukType.
     * 
     * @param ehitusaasta
     */
    public void setEhitusaasta(java.lang.String ehitusaasta) {
        this.ehitusaasta = ehitusaasta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoidukType)) return false;
        SoidukType other = (SoidukType) obj;
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
            ((this.mark==null && other.getMark()==null) || 
             (this.mark!=null &&
              this.mark.equals(other.getMark()))) &&
            ((this.mudel==null && other.getMudel()==null) || 
             (this.mudel!=null &&
              this.mudel.equals(other.getMudel()))) &&
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
        if (getMark() != null) {
            _hashCode += getMark().hashCode();
        }
        if (getMudel() != null) {
            _hashCode += getMudel().hashCode();
        }
        if (getEhitusaasta() != null) {
            _hashCode += getEhitusaasta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
