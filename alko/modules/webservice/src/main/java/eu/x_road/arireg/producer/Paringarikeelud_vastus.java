/**
 * Paringarikeelud_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringarikeelud_vastus  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Paringarikeelud_keeld[] arikeelud;

    public Paringarikeelud_vastus() {
    }

    public Paringarikeelud_vastus(
           eu.x_road.arireg.producer.Paringarikeelud_keeld[] arikeelud) {
           this.arikeelud = arikeelud;
    }


    /**
     * Gets the arikeelud value for this Paringarikeelud_vastus.
     * 
     * @return arikeelud
     */
    public eu.x_road.arireg.producer.Paringarikeelud_keeld[] getArikeelud() {
        return arikeelud;
    }


    /**
     * Sets the arikeelud value for this Paringarikeelud_vastus.
     * 
     * @param arikeelud
     */
    public void setArikeelud(eu.x_road.arireg.producer.Paringarikeelud_keeld[] arikeelud) {
        this.arikeelud = arikeelud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringarikeelud_vastus)) return false;
        Paringarikeelud_vastus other = (Paringarikeelud_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arikeelud==null && other.getArikeelud()==null) || 
             (this.arikeelud!=null &&
              java.util.Arrays.equals(this.arikeelud, other.getArikeelud())));
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
        if (getArikeelud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArikeelud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArikeelud(), i);
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
