/**
 * Ettevotja_muudatused_tasuline_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatused_tasuline_vastus  implements java.io.Serializable {
    /* Ettevõtjate muudatuste kirjed */
    private eu.x_road.arireg.producer.Ettevotja_muudatus[] ettevotja_muudatused;

    /* Ettevõtjate muudatuste arv */
    private java.lang.Integer tulemuste_arv;

    public Ettevotja_muudatused_tasuline_vastus() {
    }

    public Ettevotja_muudatused_tasuline_vastus(
           eu.x_road.arireg.producer.Ettevotja_muudatus[] ettevotja_muudatused,
           java.lang.Integer tulemuste_arv) {
           this.ettevotja_muudatused = ettevotja_muudatused;
           this.tulemuste_arv = tulemuste_arv;
    }


    /**
     * Gets the ettevotja_muudatused value for this Ettevotja_muudatused_tasuline_vastus.
     * 
     * @return ettevotja_muudatused   * Ettevõtjate muudatuste kirjed
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus[] getEttevotja_muudatused() {
        return ettevotja_muudatused;
    }


    /**
     * Sets the ettevotja_muudatused value for this Ettevotja_muudatused_tasuline_vastus.
     * 
     * @param ettevotja_muudatused   * Ettevõtjate muudatuste kirjed
     */
    public void setEttevotja_muudatused(eu.x_road.arireg.producer.Ettevotja_muudatus[] ettevotja_muudatused) {
        this.ettevotja_muudatused = ettevotja_muudatused;
    }

    public eu.x_road.arireg.producer.Ettevotja_muudatus getEttevotja_muudatused(int i) {
        return this.ettevotja_muudatused[i];
    }

    public void setEttevotja_muudatused(int i, eu.x_road.arireg.producer.Ettevotja_muudatus _value) {
        this.ettevotja_muudatused[i] = _value;
    }


    /**
     * Gets the tulemuste_arv value for this Ettevotja_muudatused_tasuline_vastus.
     * 
     * @return tulemuste_arv   * Ettevõtjate muudatuste arv
     */
    public java.lang.Integer getTulemuste_arv() {
        return tulemuste_arv;
    }


    /**
     * Sets the tulemuste_arv value for this Ettevotja_muudatused_tasuline_vastus.
     * 
     * @param tulemuste_arv   * Ettevõtjate muudatuste arv
     */
    public void setTulemuste_arv(java.lang.Integer tulemuste_arv) {
        this.tulemuste_arv = tulemuste_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatused_tasuline_vastus)) return false;
        Ettevotja_muudatused_tasuline_vastus other = (Ettevotja_muudatused_tasuline_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja_muudatused==null && other.getEttevotja_muudatused()==null) || 
             (this.ettevotja_muudatused!=null &&
              java.util.Arrays.equals(this.ettevotja_muudatused, other.getEttevotja_muudatused()))) &&
            ((this.tulemuste_arv==null && other.getTulemuste_arv()==null) || 
             (this.tulemuste_arv!=null &&
              this.tulemuste_arv.equals(other.getTulemuste_arv())));
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
        if (getEttevotja_muudatused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotja_muudatused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotja_muudatused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTulemuste_arv() != null) {
            _hashCode += getTulemuste_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
