/**
 * EVK_kanded_v1_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVK_kanded_v1_vastus  implements java.io.Serializable {
    /* Kanded */
    private eu.x_road.arireg.producer.Evk_seotud_kanne[] kanded;

    /* leitud kannete arv */
    private int leitud_kannete_arv;

    public EVK_kanded_v1_vastus() {
    }

    public EVK_kanded_v1_vastus(
           eu.x_road.arireg.producer.Evk_seotud_kanne[] kanded,
           int leitud_kannete_arv) {
           this.kanded = kanded;
           this.leitud_kannete_arv = leitud_kannete_arv;
    }


    /**
     * Gets the kanded value for this EVK_kanded_v1_vastus.
     * 
     * @return kanded   * Kanded
     */
    public eu.x_road.arireg.producer.Evk_seotud_kanne[] getKanded() {
        return kanded;
    }


    /**
     * Sets the kanded value for this EVK_kanded_v1_vastus.
     * 
     * @param kanded   * Kanded
     */
    public void setKanded(eu.x_road.arireg.producer.Evk_seotud_kanne[] kanded) {
        this.kanded = kanded;
    }


    /**
     * Gets the leitud_kannete_arv value for this EVK_kanded_v1_vastus.
     * 
     * @return leitud_kannete_arv   * leitud kannete arv
     */
    public int getLeitud_kannete_arv() {
        return leitud_kannete_arv;
    }


    /**
     * Sets the leitud_kannete_arv value for this EVK_kanded_v1_vastus.
     * 
     * @param leitud_kannete_arv   * leitud kannete arv
     */
    public void setLeitud_kannete_arv(int leitud_kannete_arv) {
        this.leitud_kannete_arv = leitud_kannete_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVK_kanded_v1_vastus)) return false;
        EVK_kanded_v1_vastus other = (EVK_kanded_v1_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kanded==null && other.getKanded()==null) || 
             (this.kanded!=null &&
              java.util.Arrays.equals(this.kanded, other.getKanded()))) &&
            this.leitud_kannete_arv == other.getLeitud_kannete_arv();
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
        if (getKanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKanded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLeitud_kannete_arv();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
