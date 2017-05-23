/**
 * RegistriKanneVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistriKanneVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.RegistriKanneVastusKirjedKirje[] kirjed;

    private java.math.BigInteger kirjeid;

    public RegistriKanneVastus() {
    }

    public RegistriKanneVastus(
           ee.x_road.mtr.producer.RegistriKanneVastusKirjedKirje[] kirjed,
           java.math.BigInteger kirjeid) {
           this.kirjed = kirjed;
           this.kirjeid = kirjeid;
    }


    /**
     * Gets the kirjed value for this RegistriKanneVastus.
     * 
     * @return kirjed
     */
    public ee.x_road.mtr.producer.RegistriKanneVastusKirjedKirje[] getKirjed() {
        return kirjed;
    }


    /**
     * Sets the kirjed value for this RegistriKanneVastus.
     * 
     * @param kirjed
     */
    public void setKirjed(ee.x_road.mtr.producer.RegistriKanneVastusKirjedKirje[] kirjed) {
        this.kirjed = kirjed;
    }


    /**
     * Gets the kirjeid value for this RegistriKanneVastus.
     * 
     * @return kirjeid
     */
    public java.math.BigInteger getKirjeid() {
        return kirjeid;
    }


    /**
     * Sets the kirjeid value for this RegistriKanneVastus.
     * 
     * @param kirjeid
     */
    public void setKirjeid(java.math.BigInteger kirjeid) {
        this.kirjeid = kirjeid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistriKanneVastus)) return false;
        RegistriKanneVastus other = (RegistriKanneVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirjed==null && other.getKirjed()==null) || 
             (this.kirjed!=null &&
              java.util.Arrays.equals(this.kirjed, other.getKirjed()))) &&
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
        if (getKirjed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKirjed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKirjed(), i);
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
