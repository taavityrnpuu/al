/**
 * RegistrikanneDetailneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistrikanneDetailneType  extends ee.x_road.mtr.producer.RegistrikanneType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht[] tegevuskoht;

    public RegistrikanneDetailneType() {
    }

    public RegistrikanneDetailneType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           org.apache.axis.types.URI mtrlink,
           ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht[] tegevuskoht) {
        super(
            tyyp,
            regnr,
            valdkond,
            tegevusala,
            tegevusalakood,
            registreerimisekp,
            mtrlink);
        this.tegevuskoht = tegevuskoht;
    }


    /**
     * Gets the tegevuskoht value for this RegistrikanneDetailneType.
     * 
     * @return tegevuskoht
     */
    public ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht[] getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this RegistrikanneDetailneType.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht[] tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }

    public ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht getTegevuskoht(int i) {
        return this.tegevuskoht[i];
    }

    public void setTegevuskoht(int i, ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht _value) {
        this.tegevuskoht[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneType)) return false;
        RegistrikanneDetailneType other = (RegistrikanneDetailneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tegevuskoht==null && other.getTegevuskoht()==null) || 
             (this.tegevuskoht!=null &&
              java.util.Arrays.equals(this.tegevuskoht, other.getTegevuskoht())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTegevuskoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskoht(), i);
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
