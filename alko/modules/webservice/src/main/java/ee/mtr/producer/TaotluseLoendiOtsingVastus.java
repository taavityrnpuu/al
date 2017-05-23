/**
 * TaotluseLoendiOtsingVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseLoendiOtsingVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.TaotluseLoendiFilter[] filter;

    private ee.x_road.mtr.producer.TaotluseLoend[] loend;

    private java.math.BigInteger kokku;

    private java.math.BigInteger[] lehekyljed;

    public TaotluseLoendiOtsingVastus() {
    }

    public TaotluseLoendiOtsingVastus(
           ee.x_road.mtr.producer.TaotluseLoendiFilter[] filter,
           ee.x_road.mtr.producer.TaotluseLoend[] loend,
           java.math.BigInteger kokku,
           java.math.BigInteger[] lehekyljed) {
           this.filter = filter;
           this.loend = loend;
           this.kokku = kokku;
           this.lehekyljed = lehekyljed;
    }


    /**
     * Gets the filter value for this TaotluseLoendiOtsingVastus.
     * 
     * @return filter
     */
    public ee.x_road.mtr.producer.TaotluseLoendiFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this TaotluseLoendiOtsingVastus.
     * 
     * @param filter
     */
    public void setFilter(ee.x_road.mtr.producer.TaotluseLoendiFilter[] filter) {
        this.filter = filter;
    }

    public ee.x_road.mtr.producer.TaotluseLoendiFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, ee.x_road.mtr.producer.TaotluseLoendiFilter _value) {
        this.filter[i] = _value;
    }


    /**
     * Gets the loend value for this TaotluseLoendiOtsingVastus.
     * 
     * @return loend
     */
    public ee.x_road.mtr.producer.TaotluseLoend[] getLoend() {
        return loend;
    }


    /**
     * Sets the loend value for this TaotluseLoendiOtsingVastus.
     * 
     * @param loend
     */
    public void setLoend(ee.x_road.mtr.producer.TaotluseLoend[] loend) {
        this.loend = loend;
    }

    public ee.x_road.mtr.producer.TaotluseLoend getLoend(int i) {
        return this.loend[i];
    }

    public void setLoend(int i, ee.x_road.mtr.producer.TaotluseLoend _value) {
        this.loend[i] = _value;
    }


    /**
     * Gets the kokku value for this TaotluseLoendiOtsingVastus.
     * 
     * @return kokku
     */
    public java.math.BigInteger getKokku() {
        return kokku;
    }


    /**
     * Sets the kokku value for this TaotluseLoendiOtsingVastus.
     * 
     * @param kokku
     */
    public void setKokku(java.math.BigInteger kokku) {
        this.kokku = kokku;
    }


    /**
     * Gets the lehekyljed value for this TaotluseLoendiOtsingVastus.
     * 
     * @return lehekyljed
     */
    public java.math.BigInteger[] getLehekyljed() {
        return lehekyljed;
    }


    /**
     * Sets the lehekyljed value for this TaotluseLoendiOtsingVastus.
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
        if (!(obj instanceof TaotluseLoendiOtsingVastus)) return false;
        TaotluseLoendiOtsingVastus other = (TaotluseLoendiOtsingVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter()))) &&
            ((this.loend==null && other.getLoend()==null) || 
             (this.loend!=null &&
              java.util.Arrays.equals(this.loend, other.getLoend()))) &&
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
        if (getFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoend() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoend());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoend(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
