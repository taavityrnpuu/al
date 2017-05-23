/**
 * TaotluseLoendiOtsingParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseLoendiOtsingParing  implements java.io.Serializable {
    private java.lang.String tyyp;

    private java.math.BigInteger tegevusalaId;

    private ee.x_road.mtr.producer.TaotluseLoendiFilter[] filter;

    private ee.x_road.mtr.producer.TaotluseLoendiOtsingParingSort sort;

    private java.math.BigInteger lehekylg;

    public TaotluseLoendiOtsingParing() {
    }

    public TaotluseLoendiOtsingParing(
           java.lang.String tyyp,
           java.math.BigInteger tegevusalaId,
           ee.x_road.mtr.producer.TaotluseLoendiFilter[] filter,
           ee.x_road.mtr.producer.TaotluseLoendiOtsingParingSort sort,
           java.math.BigInteger lehekylg) {
           this.tyyp = tyyp;
           this.tegevusalaId = tegevusalaId;
           this.filter = filter;
           this.sort = sort;
           this.lehekylg = lehekylg;
    }


    /**
     * Gets the tyyp value for this TaotluseLoendiOtsingParing.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this TaotluseLoendiOtsingParing.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the tegevusalaId value for this TaotluseLoendiOtsingParing.
     * 
     * @return tegevusalaId
     */
    public java.math.BigInteger getTegevusalaId() {
        return tegevusalaId;
    }


    /**
     * Sets the tegevusalaId value for this TaotluseLoendiOtsingParing.
     * 
     * @param tegevusalaId
     */
    public void setTegevusalaId(java.math.BigInteger tegevusalaId) {
        this.tegevusalaId = tegevusalaId;
    }


    /**
     * Gets the filter value for this TaotluseLoendiOtsingParing.
     * 
     * @return filter
     */
    public ee.x_road.mtr.producer.TaotluseLoendiFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this TaotluseLoendiOtsingParing.
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
     * Gets the sort value for this TaotluseLoendiOtsingParing.
     * 
     * @return sort
     */
    public ee.x_road.mtr.producer.TaotluseLoendiOtsingParingSort getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this TaotluseLoendiOtsingParing.
     * 
     * @param sort
     */
    public void setSort(ee.x_road.mtr.producer.TaotluseLoendiOtsingParingSort sort) {
        this.sort = sort;
    }


    /**
     * Gets the lehekylg value for this TaotluseLoendiOtsingParing.
     * 
     * @return lehekylg
     */
    public java.math.BigInteger getLehekylg() {
        return lehekylg;
    }


    /**
     * Sets the lehekylg value for this TaotluseLoendiOtsingParing.
     * 
     * @param lehekylg
     */
    public void setLehekylg(java.math.BigInteger lehekylg) {
        this.lehekylg = lehekylg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseLoendiOtsingParing)) return false;
        TaotluseLoendiOtsingParing other = (TaotluseLoendiOtsingParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.tegevusalaId==null && other.getTegevusalaId()==null) || 
             (this.tegevusalaId!=null &&
              this.tegevusalaId.equals(other.getTegevusalaId()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.lehekylg==null && other.getLehekylg()==null) || 
             (this.lehekylg!=null &&
              this.lehekylg.equals(other.getLehekylg())));
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getTegevusalaId() != null) {
            _hashCode += getTegevusalaId().hashCode();
        }
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
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getLehekylg() != null) {
            _hashCode += getLehekylg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
