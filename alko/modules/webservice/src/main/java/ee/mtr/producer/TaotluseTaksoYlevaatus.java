/**
 * TaotluseTaksoYlevaatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseTaksoYlevaatus  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String registreerimismark;

    private java.util.Date kehtib_kuni;

    private boolean kasitsi;

    public TaotluseTaksoYlevaatus() {
    }

    public TaotluseTaksoYlevaatus(
           java.math.BigInteger id,
           java.lang.String registreerimismark,
           java.util.Date kehtib_kuni,
           boolean kasitsi) {
           this.id = id;
           this.registreerimismark = registreerimismark;
           this.kehtib_kuni = kehtib_kuni;
           this.kasitsi = kasitsi;
    }


    /**
     * Gets the id value for this TaotluseTaksoYlevaatus.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this TaotluseTaksoYlevaatus.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the registreerimismark value for this TaotluseTaksoYlevaatus.
     * 
     * @return registreerimismark
     */
    public java.lang.String getRegistreerimismark() {
        return registreerimismark;
    }


    /**
     * Sets the registreerimismark value for this TaotluseTaksoYlevaatus.
     * 
     * @param registreerimismark
     */
    public void setRegistreerimismark(java.lang.String registreerimismark) {
        this.registreerimismark = registreerimismark;
    }


    /**
     * Gets the kehtib_kuni value for this TaotluseTaksoYlevaatus.
     * 
     * @return kehtib_kuni
     */
    public java.util.Date getKehtib_kuni() {
        return kehtib_kuni;
    }


    /**
     * Sets the kehtib_kuni value for this TaotluseTaksoYlevaatus.
     * 
     * @param kehtib_kuni
     */
    public void setKehtib_kuni(java.util.Date kehtib_kuni) {
        this.kehtib_kuni = kehtib_kuni;
    }


    /**
     * Gets the kasitsi value for this TaotluseTaksoYlevaatus.
     * 
     * @return kasitsi
     */
    public boolean isKasitsi() {
        return kasitsi;
    }


    /**
     * Sets the kasitsi value for this TaotluseTaksoYlevaatus.
     * 
     * @param kasitsi
     */
    public void setKasitsi(boolean kasitsi) {
        this.kasitsi = kasitsi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseTaksoYlevaatus)) return false;
        TaotluseTaksoYlevaatus other = (TaotluseTaksoYlevaatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.registreerimismark==null && other.getRegistreerimismark()==null) || 
             (this.registreerimismark!=null &&
              this.registreerimismark.equals(other.getRegistreerimismark()))) &&
            ((this.kehtib_kuni==null && other.getKehtib_kuni()==null) || 
             (this.kehtib_kuni!=null &&
              this.kehtib_kuni.equals(other.getKehtib_kuni()))) &&
            this.kasitsi == other.isKasitsi();
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRegistreerimismark() != null) {
            _hashCode += getRegistreerimismark().hashCode();
        }
        if (getKehtib_kuni() != null) {
            _hashCode += getKehtib_kuni().hashCode();
        }
        _hashCode += (isKasitsi() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
