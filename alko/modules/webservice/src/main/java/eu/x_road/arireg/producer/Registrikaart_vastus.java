/**
 * Registrikaart_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Registrikaart_vastus  implements java.io.Serializable {
    private int ariregistri_kood;

    private org.apache.axis.types.URI viide_manusele;

    public Registrikaart_vastus() {
    }

    public Registrikaart_vastus(
           int ariregistri_kood,
           org.apache.axis.types.URI viide_manusele) {
           this.ariregistri_kood = ariregistri_kood;
           this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the ariregistri_kood value for this Registrikaart_vastus.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Registrikaart_vastus.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the viide_manusele value for this Registrikaart_vastus.
     * 
     * @return viide_manusele
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this Registrikaart_vastus.
     * 
     * @param viide_manusele
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Registrikaart_vastus)) return false;
        Registrikaart_vastus other = (Registrikaart_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.viide_manusele==null && other.getViide_manusele()==null) || 
             (this.viide_manusele!=null &&
              this.viide_manusele.equals(other.getViide_manusele())));
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
        _hashCode += getAriregistri_kood();
        if (getViide_manusele() != null) {
            _hashCode += getViide_manusele().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
