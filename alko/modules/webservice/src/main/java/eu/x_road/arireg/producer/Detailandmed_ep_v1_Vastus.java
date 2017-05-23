/**
 * Detailandmed_ep_v1_Vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_ep_v1_Vastus  implements java.io.Serializable {
    private org.apache.axis.types.URI viide_manusele;

    private java.math.BigInteger kirjete_arv;

    private java.math.BigInteger tellimuse_id;

    public Detailandmed_ep_v1_Vastus() {
    }

    public Detailandmed_ep_v1_Vastus(
           org.apache.axis.types.URI viide_manusele,
           java.math.BigInteger kirjete_arv,
           java.math.BigInteger tellimuse_id) {
           this.viide_manusele = viide_manusele;
           this.kirjete_arv = kirjete_arv;
           this.tellimuse_id = tellimuse_id;
    }


    /**
     * Gets the viide_manusele value for this Detailandmed_ep_v1_Vastus.
     * 
     * @return viide_manusele
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this Detailandmed_ep_v1_Vastus.
     * 
     * @param viide_manusele
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the kirjete_arv value for this Detailandmed_ep_v1_Vastus.
     * 
     * @return kirjete_arv
     */
    public java.math.BigInteger getKirjete_arv() {
        return kirjete_arv;
    }


    /**
     * Sets the kirjete_arv value for this Detailandmed_ep_v1_Vastus.
     * 
     * @param kirjete_arv
     */
    public void setKirjete_arv(java.math.BigInteger kirjete_arv) {
        this.kirjete_arv = kirjete_arv;
    }


    /**
     * Gets the tellimuse_id value for this Detailandmed_ep_v1_Vastus.
     * 
     * @return tellimuse_id
     */
    public java.math.BigInteger getTellimuse_id() {
        return tellimuse_id;
    }


    /**
     * Sets the tellimuse_id value for this Detailandmed_ep_v1_Vastus.
     * 
     * @param tellimuse_id
     */
    public void setTellimuse_id(java.math.BigInteger tellimuse_id) {
        this.tellimuse_id = tellimuse_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_ep_v1_Vastus)) return false;
        Detailandmed_ep_v1_Vastus other = (Detailandmed_ep_v1_Vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viide_manusele==null && other.getViide_manusele()==null) || 
             (this.viide_manusele!=null &&
              this.viide_manusele.equals(other.getViide_manusele()))) &&
            ((this.kirjete_arv==null && other.getKirjete_arv()==null) || 
             (this.kirjete_arv!=null &&
              this.kirjete_arv.equals(other.getKirjete_arv()))) &&
            ((this.tellimuse_id==null && other.getTellimuse_id()==null) || 
             (this.tellimuse_id!=null &&
              this.tellimuse_id.equals(other.getTellimuse_id())));
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
        if (getViide_manusele() != null) {
            _hashCode += getViide_manusele().hashCode();
        }
        if (getKirjete_arv() != null) {
            _hashCode += getKirjete_arv().hashCode();
        }
        if (getTellimuse_id() != null) {
            _hashCode += getTellimuse_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
