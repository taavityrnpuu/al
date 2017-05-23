/**
 * TaotluseLoend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseLoend  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String vaartus;

    private ee.x_road.mtr.producer.TaotluseLoendiVaartus[] vaartused;

    public TaotluseLoend() {
    }

    public TaotluseLoend(
           java.lang.String id,
           java.lang.String vaartus,
           ee.x_road.mtr.producer.TaotluseLoendiVaartus[] vaartused) {
           this.id = id;
           this.vaartus = vaartus;
           this.vaartused = vaartused;
    }


    /**
     * Gets the id value for this TaotluseLoend.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TaotluseLoend.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the vaartus value for this TaotluseLoend.
     * 
     * @return vaartus
     */
    public java.lang.String getVaartus() {
        return vaartus;
    }


    /**
     * Sets the vaartus value for this TaotluseLoend.
     * 
     * @param vaartus
     */
    public void setVaartus(java.lang.String vaartus) {
        this.vaartus = vaartus;
    }


    /**
     * Gets the vaartused value for this TaotluseLoend.
     * 
     * @return vaartused
     */
    public ee.x_road.mtr.producer.TaotluseLoendiVaartus[] getVaartused() {
        return vaartused;
    }


    /**
     * Sets the vaartused value for this TaotluseLoend.
     * 
     * @param vaartused
     */
    public void setVaartused(ee.x_road.mtr.producer.TaotluseLoendiVaartus[] vaartused) {
        this.vaartused = vaartused;
    }

    public ee.x_road.mtr.producer.TaotluseLoendiVaartus getVaartused(int i) {
        return this.vaartused[i];
    }

    public void setVaartused(int i, ee.x_road.mtr.producer.TaotluseLoendiVaartus _value) {
        this.vaartused[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseLoend)) return false;
        TaotluseLoend other = (TaotluseLoend) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.vaartus==null && other.getVaartus()==null) || 
             (this.vaartus!=null &&
              this.vaartus.equals(other.getVaartus()))) &&
            ((this.vaartused==null && other.getVaartused()==null) || 
             (this.vaartused!=null &&
              java.util.Arrays.equals(this.vaartused, other.getVaartused())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVaartus() != null) {
            _hashCode += getVaartus().hashCode();
        }
        if (getVaartused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVaartused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVaartused(), i);
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
