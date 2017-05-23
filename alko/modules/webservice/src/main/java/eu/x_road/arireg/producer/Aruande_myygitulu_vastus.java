/**
 * Aruande_myygitulu_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Aruande_myygitulu_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Aruande_myygitulu_kirje[] kirjed;

    private java.math.BigInteger leitud_kirjete_arv;

    public Aruande_myygitulu_vastus() {
    }

    public Aruande_myygitulu_vastus(
           eu.x_road.arireg.producer.Aruande_myygitulu_kirje[] kirjed,
           java.math.BigInteger leitud_kirjete_arv) {
           this.kirjed = kirjed;
           this.leitud_kirjete_arv = leitud_kirjete_arv;
    }


    /**
     * Gets the kirjed value for this Aruande_myygitulu_vastus.
     * 
     * @return kirjed
     */
    public eu.x_road.arireg.producer.Aruande_myygitulu_kirje[] getKirjed() {
        return kirjed;
    }


    /**
     * Sets the kirjed value for this Aruande_myygitulu_vastus.
     * 
     * @param kirjed
     */
    public void setKirjed(eu.x_road.arireg.producer.Aruande_myygitulu_kirje[] kirjed) {
        this.kirjed = kirjed;
    }


    /**
     * Gets the leitud_kirjete_arv value for this Aruande_myygitulu_vastus.
     * 
     * @return leitud_kirjete_arv
     */
    public java.math.BigInteger getLeitud_kirjete_arv() {
        return leitud_kirjete_arv;
    }


    /**
     * Sets the leitud_kirjete_arv value for this Aruande_myygitulu_vastus.
     * 
     * @param leitud_kirjete_arv
     */
    public void setLeitud_kirjete_arv(java.math.BigInteger leitud_kirjete_arv) {
        this.leitud_kirjete_arv = leitud_kirjete_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aruande_myygitulu_vastus)) return false;
        Aruande_myygitulu_vastus other = (Aruande_myygitulu_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirjed==null && other.getKirjed()==null) || 
             (this.kirjed!=null &&
              java.util.Arrays.equals(this.kirjed, other.getKirjed()))) &&
            ((this.leitud_kirjete_arv==null && other.getLeitud_kirjete_arv()==null) || 
             (this.leitud_kirjete_arv!=null &&
              this.leitud_kirjete_arv.equals(other.getLeitud_kirjete_arv())));
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
        if (getKirjed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKirjed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKirjed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeitud_kirjete_arv() != null) {
            _hashCode += getLeitud_kirjete_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
