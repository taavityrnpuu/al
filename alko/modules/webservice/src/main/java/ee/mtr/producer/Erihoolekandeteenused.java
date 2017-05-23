/**
 * Erihoolekandeteenused.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Erihoolekandeteenused  implements java.io.Serializable {
    private ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskoht[] tegevuskohad;

    public Erihoolekandeteenused() {
    }

    public Erihoolekandeteenused(
           ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskoht[] tegevuskohad) {
           this.tegevuskohad = tegevuskohad;
    }


    /**
     * Gets the tegevuskohad value for this Erihoolekandeteenused.
     * 
     * @return tegevuskohad
     */
    public ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskoht[] getTegevuskohad() {
        return tegevuskohad;
    }


    /**
     * Sets the tegevuskohad value for this Erihoolekandeteenused.
     * 
     * @param tegevuskohad
     */
    public void setTegevuskohad(ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskoht[] tegevuskohad) {
        this.tegevuskohad = tegevuskohad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erihoolekandeteenused)) return false;
        Erihoolekandeteenused other = (Erihoolekandeteenused) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevuskohad==null && other.getTegevuskohad()==null) || 
             (this.tegevuskohad!=null &&
              java.util.Arrays.equals(this.tegevuskohad, other.getTegevuskohad())));
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
        if (getTegevuskohad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskohad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskohad(), i);
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
