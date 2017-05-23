/**
 * Paringnimesobivus_v2_rida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringnimesobivus_v2_rida  implements java.io.Serializable {
    private eu.x_road.arireg.producer.X_nimevastetyyp tyyp;

    private java.lang.String tekst;

    public Paringnimesobivus_v2_rida() {
    }

    public Paringnimesobivus_v2_rida(
           eu.x_road.arireg.producer.X_nimevastetyyp tyyp,
           java.lang.String tekst) {
           this.tyyp = tyyp;
           this.tekst = tekst;
    }


    /**
     * Gets the tyyp value for this Paringnimesobivus_v2_rida.
     * 
     * @return tyyp
     */
    public eu.x_road.arireg.producer.X_nimevastetyyp getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this Paringnimesobivus_v2_rida.
     * 
     * @param tyyp
     */
    public void setTyyp(eu.x_road.arireg.producer.X_nimevastetyyp tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the tekst value for this Paringnimesobivus_v2_rida.
     * 
     * @return tekst
     */
    public java.lang.String getTekst() {
        return tekst;
    }


    /**
     * Sets the tekst value for this Paringnimesobivus_v2_rida.
     * 
     * @param tekst
     */
    public void setTekst(java.lang.String tekst) {
        this.tekst = tekst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringnimesobivus_v2_rida)) return false;
        Paringnimesobivus_v2_rida other = (Paringnimesobivus_v2_rida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.tekst==null && other.getTekst()==null) || 
             (this.tekst!=null &&
              this.tekst.equals(other.getTekst())));
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getTekst() != null) {
            _hashCode += getTekst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
