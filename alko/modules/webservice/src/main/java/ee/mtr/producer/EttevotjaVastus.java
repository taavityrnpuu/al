/**
 * EttevotjaVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class EttevotjaVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.EttevotjaVastusEttevotjadEttevotja[] ettevotjad;

    private java.math.BigInteger kirjeid;

    public EttevotjaVastus() {
    }

    public EttevotjaVastus(
           ee.x_road.mtr.producer.EttevotjaVastusEttevotjadEttevotja[] ettevotjad,
           java.math.BigInteger kirjeid) {
           this.ettevotjad = ettevotjad;
           this.kirjeid = kirjeid;
    }


    /**
     * Gets the ettevotjad value for this EttevotjaVastus.
     * 
     * @return ettevotjad
     */
    public ee.x_road.mtr.producer.EttevotjaVastusEttevotjadEttevotja[] getEttevotjad() {
        return ettevotjad;
    }


    /**
     * Sets the ettevotjad value for this EttevotjaVastus.
     * 
     * @param ettevotjad
     */
    public void setEttevotjad(ee.x_road.mtr.producer.EttevotjaVastusEttevotjadEttevotja[] ettevotjad) {
        this.ettevotjad = ettevotjad;
    }


    /**
     * Gets the kirjeid value for this EttevotjaVastus.
     * 
     * @return kirjeid
     */
    public java.math.BigInteger getKirjeid() {
        return kirjeid;
    }


    /**
     * Sets the kirjeid value for this EttevotjaVastus.
     * 
     * @param kirjeid
     */
    public void setKirjeid(java.math.BigInteger kirjeid) {
        this.kirjeid = kirjeid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaVastus)) return false;
        EttevotjaVastus other = (EttevotjaVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotjad==null && other.getEttevotjad()==null) || 
             (this.ettevotjad!=null &&
              java.util.Arrays.equals(this.ettevotjad, other.getEttevotjad()))) &&
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
        if (getEttevotjad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotjad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotjad(), i);
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
