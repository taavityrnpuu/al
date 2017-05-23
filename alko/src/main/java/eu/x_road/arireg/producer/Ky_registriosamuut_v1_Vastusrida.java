/**
 * Ky_registriosamuut_v1_Vastusrida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_registriosamuut_v1_Vastusrida  implements java.io.Serializable {
    private java.math.BigInteger ariregistri_kood;

    private java.lang.String staatus;

    private eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] lisatud_registriosad;

    private eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] eemaldatud_registriosad;

    public Ky_registriosamuut_v1_Vastusrida() {
    }

    public Ky_registriosamuut_v1_Vastusrida(
           java.math.BigInteger ariregistri_kood,
           java.lang.String staatus,
           eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] lisatud_registriosad,
           eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] eemaldatud_registriosad) {
           this.ariregistri_kood = ariregistri_kood;
           this.staatus = staatus;
           this.lisatud_registriosad = lisatud_registriosad;
           this.eemaldatud_registriosad = eemaldatud_registriosad;
    }


    /**
     * Gets the ariregistri_kood value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @return ariregistri_kood
     */
    public java.math.BigInteger getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.math.BigInteger ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the staatus value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the lisatud_registriosad value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @return lisatud_registriosad
     */
    public eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] getLisatud_registriosad() {
        return lisatud_registriosad;
    }


    /**
     * Sets the lisatud_registriosad value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @param lisatud_registriosad
     */
    public void setLisatud_registriosad(eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] lisatud_registriosad) {
        this.lisatud_registriosad = lisatud_registriosad;
    }

    public eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa getLisatud_registriosad(int i) {
        return this.lisatud_registriosad[i];
    }

    public void setLisatud_registriosad(int i, eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa _value) {
        this.lisatud_registriosad[i] = _value;
    }


    /**
     * Gets the eemaldatud_registriosad value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @return eemaldatud_registriosad
     */
    public eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] getEemaldatud_registriosad() {
        return eemaldatud_registriosad;
    }


    /**
     * Sets the eemaldatud_registriosad value for this Ky_registriosamuut_v1_Vastusrida.
     * 
     * @param eemaldatud_registriosad
     */
    public void setEemaldatud_registriosad(eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa[] eemaldatud_registriosad) {
        this.eemaldatud_registriosad = eemaldatud_registriosad;
    }

    public eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa getEemaldatud_registriosad(int i) {
        return this.eemaldatud_registriosad[i];
    }

    public void setEemaldatud_registriosad(int i, eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa _value) {
        this.eemaldatud_registriosad[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_registriosamuut_v1_Vastusrida)) return false;
        Ky_registriosamuut_v1_Vastusrida other = (Ky_registriosamuut_v1_Vastusrida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.lisatud_registriosad==null && other.getLisatud_registriosad()==null) || 
             (this.lisatud_registriosad!=null &&
              java.util.Arrays.equals(this.lisatud_registriosad, other.getLisatud_registriosad()))) &&
            ((this.eemaldatud_registriosad==null && other.getEemaldatud_registriosad()==null) || 
             (this.eemaldatud_registriosad!=null &&
              java.util.Arrays.equals(this.eemaldatud_registriosad, other.getEemaldatud_registriosad())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getLisatud_registriosad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLisatud_registriosad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLisatud_registriosad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEemaldatud_registriosad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEemaldatud_registriosad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEemaldatud_registriosad(), i);
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
