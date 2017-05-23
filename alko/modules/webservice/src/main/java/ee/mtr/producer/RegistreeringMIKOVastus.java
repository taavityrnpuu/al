/**
 * RegistreeringMIKOVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistreeringMIKOVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.RegistriKanneMIKOType[] registrikanne;

    private java.math.BigInteger kirjeid;

    public RegistreeringMIKOVastus() {
    }

    public RegistreeringMIKOVastus(
           ee.x_road.mtr.producer.RegistriKanneMIKOType[] registrikanne,
           java.math.BigInteger kirjeid) {
           this.registrikanne = registrikanne;
           this.kirjeid = kirjeid;
    }


    /**
     * Gets the registrikanne value for this RegistreeringMIKOVastus.
     * 
     * @return registrikanne
     */
    public ee.x_road.mtr.producer.RegistriKanneMIKOType[] getRegistrikanne() {
        return registrikanne;
    }


    /**
     * Sets the registrikanne value for this RegistreeringMIKOVastus.
     * 
     * @param registrikanne
     */
    public void setRegistrikanne(ee.x_road.mtr.producer.RegistriKanneMIKOType[] registrikanne) {
        this.registrikanne = registrikanne;
    }

    public ee.x_road.mtr.producer.RegistriKanneMIKOType getRegistrikanne(int i) {
        return this.registrikanne[i];
    }

    public void setRegistrikanne(int i, ee.x_road.mtr.producer.RegistriKanneMIKOType _value) {
        this.registrikanne[i] = _value;
    }


    /**
     * Gets the kirjeid value for this RegistreeringMIKOVastus.
     * 
     * @return kirjeid
     */
    public java.math.BigInteger getKirjeid() {
        return kirjeid;
    }


    /**
     * Sets the kirjeid value for this RegistreeringMIKOVastus.
     * 
     * @param kirjeid
     */
    public void setKirjeid(java.math.BigInteger kirjeid) {
        this.kirjeid = kirjeid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringMIKOVastus)) return false;
        RegistreeringMIKOVastus other = (RegistreeringMIKOVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikanne==null && other.getRegistrikanne()==null) || 
             (this.registrikanne!=null &&
              java.util.Arrays.equals(this.registrikanne, other.getRegistrikanne()))) &&
            ((this.kirjeid==null && other.getKirjeid()==null) || 
             (this.kirjeid!=null &&
              this.kirjeid.equals(other.getKirjeid())));
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
        if (getRegistrikanne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikanne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikanne(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKirjeid() != null) {
            _hashCode += getKirjeid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
