/**
 * Ev_seisundType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;


/**
 * Seisund
 */
public class Ev_seisundType_v4  implements java.io.Serializable {
    /* YHIN, KUST, YMB jne */
    private java.lang.String liik;

    private java.lang.String tekst;

    public Ev_seisundType_v4() {
    }

    public Ev_seisundType_v4(
           java.lang.String liik,
           java.lang.String tekst) {
           this.liik = liik;
           this.tekst = tekst;
    }


    /**
     * Gets the liik value for this Ev_seisundType_v4.
     * 
     * @return liik   * YHIN, KUST, YMB jne
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Ev_seisundType_v4.
     * 
     * @param liik   * YHIN, KUST, YMB jne
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the tekst value for this Ev_seisundType_v4.
     * 
     * @return tekst
     */
    public java.lang.String getTekst() {
        return tekst;
    }


    /**
     * Sets the tekst value for this Ev_seisundType_v4.
     * 
     * @param tekst
     */
    public void setTekst(java.lang.String tekst) {
        this.tekst = tekst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ev_seisundType_v4)) return false;
        Ev_seisundType_v4 other = (Ev_seisundType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getTekst() != null) {
            _hashCode += getTekst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
