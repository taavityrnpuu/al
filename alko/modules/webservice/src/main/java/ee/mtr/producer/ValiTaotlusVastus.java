/**
 * ValiTaotlusVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class ValiTaotlusVastus  implements java.io.Serializable {
    private java.lang.String muutmiseLink;

    public ValiTaotlusVastus() {
    }

    public ValiTaotlusVastus(
           java.lang.String muutmiseLink) {
           this.muutmiseLink = muutmiseLink;
    }


    /**
     * Gets the muutmiseLink value for this ValiTaotlusVastus.
     * 
     * @return muutmiseLink
     */
    public java.lang.String getMuutmiseLink() {
        return muutmiseLink;
    }


    /**
     * Sets the muutmiseLink value for this ValiTaotlusVastus.
     * 
     * @param muutmiseLink
     */
    public void setMuutmiseLink(java.lang.String muutmiseLink) {
        this.muutmiseLink = muutmiseLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValiTaotlusVastus)) return false;
        ValiTaotlusVastus other = (ValiTaotlusVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.muutmiseLink==null && other.getMuutmiseLink()==null) || 
             (this.muutmiseLink!=null &&
              this.muutmiseLink.equals(other.getMuutmiseLink())));
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
        if (getMuutmiseLink() != null) {
            _hashCode += getMuutmiseLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
