/**
 * Ettevotja_muudatused_tasuta_tootukassa_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatused_tasuta_tootukassa_vastus  implements java.io.Serializable {
    /* Ettevõtjate kandemuudatused */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kanne[] kanded;

    /* Ettevõtjate kandemuudatuste arv */
    private java.lang.Integer kanded_arv;

    public Ettevotja_muudatused_tasuta_tootukassa_vastus() {
    }

    public Ettevotja_muudatused_tasuta_tootukassa_vastus(
           eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kanne[] kanded,
           java.lang.Integer kanded_arv) {
           this.kanded = kanded;
           this.kanded_arv = kanded_arv;
    }


    /**
     * Gets the kanded value for this Ettevotja_muudatused_tasuta_tootukassa_vastus.
     * 
     * @return kanded   * Ettevõtjate kandemuudatused
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kanne[] getKanded() {
        return kanded;
    }


    /**
     * Sets the kanded value for this Ettevotja_muudatused_tasuta_tootukassa_vastus.
     * 
     * @param kanded   * Ettevõtjate kandemuudatused
     */
    public void setKanded(eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kanne[] kanded) {
        this.kanded = kanded;
    }


    /**
     * Gets the kanded_arv value for this Ettevotja_muudatused_tasuta_tootukassa_vastus.
     * 
     * @return kanded_arv   * Ettevõtjate kandemuudatuste arv
     */
    public java.lang.Integer getKanded_arv() {
        return kanded_arv;
    }


    /**
     * Sets the kanded_arv value for this Ettevotja_muudatused_tasuta_tootukassa_vastus.
     * 
     * @param kanded_arv   * Ettevõtjate kandemuudatuste arv
     */
    public void setKanded_arv(java.lang.Integer kanded_arv) {
        this.kanded_arv = kanded_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatused_tasuta_tootukassa_vastus)) return false;
        Ettevotja_muudatused_tasuta_tootukassa_vastus other = (Ettevotja_muudatused_tasuta_tootukassa_vastus) obj;
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
            ((this.kanded_arv==null && other.getKanded_arv()==null) || 
             (this.kanded_arv!=null &&
              this.kanded_arv.equals(other.getKanded_arv())));
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
        if (getKanded_arv() != null) {
            _hashCode += getKanded_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
