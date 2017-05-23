/**
 * RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp  implements java.io.Serializable {
    private java.lang.String nimetus;

    private java.lang.String kood;

    public RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp() {
    }

    public RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp(
           java.lang.String nimetus,
           java.lang.String kood) {
           this.nimetus = nimetus;
           this.kood = kood;
    }


    /**
     * Gets the nimetus value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the kood value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp)) return false;
        RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp other = (RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood())));
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
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
