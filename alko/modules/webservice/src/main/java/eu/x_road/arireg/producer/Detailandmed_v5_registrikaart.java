/**
 * Detailandmed_v5_registrikaart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_registrikaart  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private eu.x_road.arireg.producer.Detailandmed_v5_kanne[] kanded;

    public Detailandmed_v5_registrikaart() {
    }

    public Detailandmed_v5_registrikaart(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           eu.x_road.arireg.producer.Detailandmed_v5_kanne[] kanded) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kanded = kanded;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_registrikaart.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_registrikaart.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_registrikaart.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_registrikaart.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_registrikaart.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_registrikaart.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_registrikaart.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_registrikaart.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kanded value for this Detailandmed_v5_registrikaart.
     * 
     * @return kanded
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kanne[] getKanded() {
        return kanded;
    }


    /**
     * Sets the kanded value for this Detailandmed_v5_registrikaart.
     * 
     * @param kanded
     */
    public void setKanded(eu.x_road.arireg.producer.Detailandmed_v5_kanne[] kanded) {
        this.kanded = kanded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_registrikaart)) return false;
        Detailandmed_v5_registrikaart other = (Detailandmed_v5_registrikaart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirje_id==null && other.getKirje_id()==null) || 
             (this.kirje_id!=null &&
              this.kirje_id.equals(other.getKirje_id()))) &&
            ((this.kaardi_piirkond==null && other.getKaardi_piirkond()==null) || 
             (this.kaardi_piirkond!=null &&
              this.kaardi_piirkond.equals(other.getKaardi_piirkond()))) &&
            ((this.kaardi_nr==null && other.getKaardi_nr()==null) || 
             (this.kaardi_nr!=null &&
              this.kaardi_nr.equals(other.getKaardi_nr()))) &&
            ((this.kaardi_tyyp==null && other.getKaardi_tyyp()==null) || 
             (this.kaardi_tyyp!=null &&
              this.kaardi_tyyp.equals(other.getKaardi_tyyp()))) &&
            ((this.kanded==null && other.getKanded()==null) || 
             (this.kanded!=null &&
              java.util.Arrays.equals(this.kanded, other.getKanded())));
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
        if (getKirje_id() != null) {
            _hashCode += getKirje_id().hashCode();
        }
        if (getKaardi_piirkond() != null) {
            _hashCode += getKaardi_piirkond().hashCode();
        }
        if (getKaardi_nr() != null) {
            _hashCode += getKaardi_nr().hashCode();
        }
        if (getKaardi_tyyp() != null) {
            _hashCode += getKaardi_tyyp().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
