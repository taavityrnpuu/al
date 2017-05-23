/**
 * Seotud_isiku_otsing_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Seotud_isiku_otsing_vastus  implements java.io.Serializable {
    /* Saadame ainult 100 esimest vastust!! */
    private eu.x_road.arireg.producer.Fys_jur_isik[] isikud;

    /* Leitud isiku seoste kogu arv */
    private java.lang.Integer isikute_arv;

    public Seotud_isiku_otsing_vastus() {
    }

    public Seotud_isiku_otsing_vastus(
           eu.x_road.arireg.producer.Fys_jur_isik[] isikud,
           java.lang.Integer isikute_arv) {
           this.isikud = isikud;
           this.isikute_arv = isikute_arv;
    }


    /**
     * Gets the isikud value for this Seotud_isiku_otsing_vastus.
     * 
     * @return isikud   * Saadame ainult 100 esimest vastust!!
     */
    public eu.x_road.arireg.producer.Fys_jur_isik[] getIsikud() {
        return isikud;
    }


    /**
     * Sets the isikud value for this Seotud_isiku_otsing_vastus.
     * 
     * @param isikud   * Saadame ainult 100 esimest vastust!!
     */
    public void setIsikud(eu.x_road.arireg.producer.Fys_jur_isik[] isikud) {
        this.isikud = isikud;
    }

    public eu.x_road.arireg.producer.Fys_jur_isik getIsikud(int i) {
        return this.isikud[i];
    }

    public void setIsikud(int i, eu.x_road.arireg.producer.Fys_jur_isik _value) {
        this.isikud[i] = _value;
    }


    /**
     * Gets the isikute_arv value for this Seotud_isiku_otsing_vastus.
     * 
     * @return isikute_arv   * Leitud isiku seoste kogu arv
     */
    public java.lang.Integer getIsikute_arv() {
        return isikute_arv;
    }


    /**
     * Sets the isikute_arv value for this Seotud_isiku_otsing_vastus.
     * 
     * @param isikute_arv   * Leitud isiku seoste kogu arv
     */
    public void setIsikute_arv(java.lang.Integer isikute_arv) {
        this.isikute_arv = isikute_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seotud_isiku_otsing_vastus)) return false;
        Seotud_isiku_otsing_vastus other = (Seotud_isiku_otsing_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikud==null && other.getIsikud()==null) || 
             (this.isikud!=null &&
              java.util.Arrays.equals(this.isikud, other.getIsikud()))) &&
            ((this.isikute_arv==null && other.getIsikute_arv()==null) || 
             (this.isikute_arv!=null &&
              this.isikute_arv.equals(other.getIsikute_arv())));
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
        if (getIsikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsikud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsikute_arv() != null) {
            _hashCode += getIsikute_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
