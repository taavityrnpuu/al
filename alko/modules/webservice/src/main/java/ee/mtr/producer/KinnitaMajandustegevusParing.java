/**
 * KinnitaMajandustegevusParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class KinnitaMajandustegevusParing  implements java.io.Serializable {
    private java.lang.String registrikood;

    private java.lang.String[] id;

    public KinnitaMajandustegevusParing() {
    }

    public KinnitaMajandustegevusParing(
           java.lang.String registrikood,
           java.lang.String[] id) {
           this.registrikood = registrikood;
           this.id = id;
    }


    /**
     * Gets the registrikood value for this KinnitaMajandustegevusParing.
     * 
     * @return registrikood
     */
    public java.lang.String getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this KinnitaMajandustegevusParing.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.lang.String registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the id value for this KinnitaMajandustegevusParing.
     * 
     * @return id
     */
    public java.lang.String[] getId() {
        return id;
    }


    /**
     * Sets the id value for this KinnitaMajandustegevusParing.
     * 
     * @param id
     */
    public void setId(java.lang.String[] id) {
        this.id = id;
    }

    public java.lang.String getId(int i) {
        return this.id[i];
    }

    public void setId(int i, java.lang.String _value) {
        this.id[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KinnitaMajandustegevusParing)) return false;
        KinnitaMajandustegevusParing other = (KinnitaMajandustegevusParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId())));
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
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
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
