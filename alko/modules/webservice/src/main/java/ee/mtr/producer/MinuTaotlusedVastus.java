/**
 * MinuTaotlusedVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class MinuTaotlusedVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.TaotlusNimekirjas[] taotlus;

    private java.math.BigInteger kirjedAlates;

    private java.math.BigInteger kirjedKuni;

    private java.math.BigInteger kokku;

    private java.math.BigInteger[] lehekyljed;

    public MinuTaotlusedVastus() {
    }

    public MinuTaotlusedVastus(
           ee.x_road.mtr.producer.TaotlusNimekirjas[] taotlus,
           java.math.BigInteger kirjedAlates,
           java.math.BigInteger kirjedKuni,
           java.math.BigInteger kokku,
           java.math.BigInteger[] lehekyljed) {
           this.taotlus = taotlus;
           this.kirjedAlates = kirjedAlates;
           this.kirjedKuni = kirjedKuni;
           this.kokku = kokku;
           this.lehekyljed = lehekyljed;
    }


    /**
     * Gets the taotlus value for this MinuTaotlusedVastus.
     * 
     * @return taotlus
     */
    public ee.x_road.mtr.producer.TaotlusNimekirjas[] getTaotlus() {
        return taotlus;
    }


    /**
     * Sets the taotlus value for this MinuTaotlusedVastus.
     * 
     * @param taotlus
     */
    public void setTaotlus(ee.x_road.mtr.producer.TaotlusNimekirjas[] taotlus) {
        this.taotlus = taotlus;
    }

    public ee.x_road.mtr.producer.TaotlusNimekirjas getTaotlus(int i) {
        return this.taotlus[i];
    }

    public void setTaotlus(int i, ee.x_road.mtr.producer.TaotlusNimekirjas _value) {
        this.taotlus[i] = _value;
    }


    /**
     * Gets the kirjedAlates value for this MinuTaotlusedVastus.
     * 
     * @return kirjedAlates
     */
    public java.math.BigInteger getKirjedAlates() {
        return kirjedAlates;
    }


    /**
     * Sets the kirjedAlates value for this MinuTaotlusedVastus.
     * 
     * @param kirjedAlates
     */
    public void setKirjedAlates(java.math.BigInteger kirjedAlates) {
        this.kirjedAlates = kirjedAlates;
    }


    /**
     * Gets the kirjedKuni value for this MinuTaotlusedVastus.
     * 
     * @return kirjedKuni
     */
    public java.math.BigInteger getKirjedKuni() {
        return kirjedKuni;
    }


    /**
     * Sets the kirjedKuni value for this MinuTaotlusedVastus.
     * 
     * @param kirjedKuni
     */
    public void setKirjedKuni(java.math.BigInteger kirjedKuni) {
        this.kirjedKuni = kirjedKuni;
    }


    /**
     * Gets the kokku value for this MinuTaotlusedVastus.
     * 
     * @return kokku
     */
    public java.math.BigInteger getKokku() {
        return kokku;
    }


    /**
     * Sets the kokku value for this MinuTaotlusedVastus.
     * 
     * @param kokku
     */
    public void setKokku(java.math.BigInteger kokku) {
        this.kokku = kokku;
    }


    /**
     * Gets the lehekyljed value for this MinuTaotlusedVastus.
     * 
     * @return lehekyljed
     */
    public java.math.BigInteger[] getLehekyljed() {
        return lehekyljed;
    }


    /**
     * Sets the lehekyljed value for this MinuTaotlusedVastus.
     * 
     * @param lehekyljed
     */
    public void setLehekyljed(java.math.BigInteger[] lehekyljed) {
        this.lehekyljed = lehekyljed;
    }

    public java.math.BigInteger getLehekyljed(int i) {
        return this.lehekyljed[i];
    }

    public void setLehekyljed(int i, java.math.BigInteger _value) {
        this.lehekyljed[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinuTaotlusedVastus)) return false;
        MinuTaotlusedVastus other = (MinuTaotlusedVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taotlus==null && other.getTaotlus()==null) || 
             (this.taotlus!=null &&
              java.util.Arrays.equals(this.taotlus, other.getTaotlus()))) &&
            ((this.kirjedAlates==null && other.getKirjedAlates()==null) || 
             (this.kirjedAlates!=null &&
              this.kirjedAlates.equals(other.getKirjedAlates()))) &&
            ((this.kirjedKuni==null && other.getKirjedKuni()==null) || 
             (this.kirjedKuni!=null &&
              this.kirjedKuni.equals(other.getKirjedKuni()))) &&
            ((this.kokku==null && other.getKokku()==null) || 
             (this.kokku!=null &&
              this.kokku.equals(other.getKokku()))) &&
            ((this.lehekyljed==null && other.getLehekyljed()==null) || 
             (this.lehekyljed!=null &&
              java.util.Arrays.equals(this.lehekyljed, other.getLehekyljed())));
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
        if (getTaotlus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaotlus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaotlus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKirjedAlates() != null) {
            _hashCode += getKirjedAlates().hashCode();
        }
        if (getKirjedKuni() != null) {
            _hashCode += getKirjedKuni().hashCode();
        }
        if (getKokku() != null) {
            _hashCode += getKokku().hashCode();
        }
        if (getLehekyljed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLehekyljed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLehekyljed(), i);
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
