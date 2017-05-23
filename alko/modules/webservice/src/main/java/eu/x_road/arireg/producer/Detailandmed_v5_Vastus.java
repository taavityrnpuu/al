/**
 * Detailandmed_v5_Vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_Vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Detailandmed_v5_ettevotja[] ettevotjad;

    private java.math.BigInteger leitud_ettevotjate_arv;

    public Detailandmed_v5_Vastus() {
    }

    public Detailandmed_v5_Vastus(
           eu.x_road.arireg.producer.Detailandmed_v5_ettevotja[] ettevotjad,
           java.math.BigInteger leitud_ettevotjate_arv) {
           this.ettevotjad = ettevotjad;
           this.leitud_ettevotjate_arv = leitud_ettevotjate_arv;
    }


    /**
     * Gets the ettevotjad value for this Detailandmed_v5_Vastus.
     * 
     * @return ettevotjad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_ettevotja[] getEttevotjad() {
        return ettevotjad;
    }


    /**
     * Sets the ettevotjad value for this Detailandmed_v5_Vastus.
     * 
     * @param ettevotjad
     */
    public void setEttevotjad(eu.x_road.arireg.producer.Detailandmed_v5_ettevotja[] ettevotjad) {
        this.ettevotjad = ettevotjad;
    }


    /**
     * Gets the leitud_ettevotjate_arv value for this Detailandmed_v5_Vastus.
     * 
     * @return leitud_ettevotjate_arv
     */
    public java.math.BigInteger getLeitud_ettevotjate_arv() {
        return leitud_ettevotjate_arv;
    }


    /**
     * Sets the leitud_ettevotjate_arv value for this Detailandmed_v5_Vastus.
     * 
     * @param leitud_ettevotjate_arv
     */
    public void setLeitud_ettevotjate_arv(java.math.BigInteger leitud_ettevotjate_arv) {
        this.leitud_ettevotjate_arv = leitud_ettevotjate_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_Vastus)) return false;
        Detailandmed_v5_Vastus other = (Detailandmed_v5_Vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotjad==null && other.getEttevotjad()==null) || 
             (this.ettevotjad!=null &&
              java.util.Arrays.equals(this.ettevotjad, other.getEttevotjad()))) &&
            ((this.leitud_ettevotjate_arv==null && other.getLeitud_ettevotjate_arv()==null) || 
             (this.leitud_ettevotjate_arv!=null &&
              this.leitud_ettevotjate_arv.equals(other.getLeitud_ettevotjate_arv())));
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
        if (getEttevotjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotjad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeitud_ettevotjate_arv() != null) {
            _hashCode += getLeitud_ettevotjate_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
