/**
 * RegistreeringDetailneVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistreeringDetailneVastus  implements java.io.Serializable {
    private java.math.BigInteger kirjeteArv;

    private ee.x_road.mtr.producer.RegistrikanneDetailneTegevusType[] registreeringud;

    public RegistreeringDetailneVastus() {
    }

    public RegistreeringDetailneVastus(
           java.math.BigInteger kirjeteArv,
           ee.x_road.mtr.producer.RegistrikanneDetailneTegevusType[] registreeringud) {
           this.kirjeteArv = kirjeteArv;
           this.registreeringud = registreeringud;
    }


    /**
     * Gets the kirjeteArv value for this RegistreeringDetailneVastus.
     * 
     * @return kirjeteArv
     */
    public java.math.BigInteger getKirjeteArv() {
        return kirjeteArv;
    }


    /**
     * Sets the kirjeteArv value for this RegistreeringDetailneVastus.
     * 
     * @param kirjeteArv
     */
    public void setKirjeteArv(java.math.BigInteger kirjeteArv) {
        this.kirjeteArv = kirjeteArv;
    }


    /**
     * Gets the registreeringud value for this RegistreeringDetailneVastus.
     * 
     * @return registreeringud
     */
    public ee.x_road.mtr.producer.RegistrikanneDetailneTegevusType[] getRegistreeringud() {
        return registreeringud;
    }


    /**
     * Sets the registreeringud value for this RegistreeringDetailneVastus.
     * 
     * @param registreeringud
     */
    public void setRegistreeringud(ee.x_road.mtr.producer.RegistrikanneDetailneTegevusType[] registreeringud) {
        this.registreeringud = registreeringud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringDetailneVastus)) return false;
        RegistreeringDetailneVastus other = (RegistreeringDetailneVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirjeteArv==null && other.getKirjeteArv()==null) || 
             (this.kirjeteArv!=null &&
              this.kirjeteArv.equals(other.getKirjeteArv()))) &&
            ((this.registreeringud==null && other.getRegistreeringud()==null) || 
             (this.registreeringud!=null &&
              java.util.Arrays.equals(this.registreeringud, other.getRegistreeringud())));
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
        if (getKirjeteArv() != null) {
            _hashCode += getKirjeteArv().hashCode();
        }
        if (getRegistreeringud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistreeringud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistreeringud(), i);
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
