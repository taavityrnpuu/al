/**
 * Klassifikaator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Klassifikaator  implements java.io.Serializable {
    private java.lang.String klassifikaatori_kood;

    private java.lang.String klassifikaatori_nimetus;

    private eu.x_road.arireg.producer.Klassifikaatori_vaartus[] klassifikaatori_vaartused;

    public Klassifikaator() {
    }

    public Klassifikaator(
           java.lang.String klassifikaatori_kood,
           java.lang.String klassifikaatori_nimetus,
           eu.x_road.arireg.producer.Klassifikaatori_vaartus[] klassifikaatori_vaartused) {
           this.klassifikaatori_kood = klassifikaatori_kood;
           this.klassifikaatori_nimetus = klassifikaatori_nimetus;
           this.klassifikaatori_vaartused = klassifikaatori_vaartused;
    }


    /**
     * Gets the klassifikaatori_kood value for this Klassifikaator.
     * 
     * @return klassifikaatori_kood
     */
    public java.lang.String getKlassifikaatori_kood() {
        return klassifikaatori_kood;
    }


    /**
     * Sets the klassifikaatori_kood value for this Klassifikaator.
     * 
     * @param klassifikaatori_kood
     */
    public void setKlassifikaatori_kood(java.lang.String klassifikaatori_kood) {
        this.klassifikaatori_kood = klassifikaatori_kood;
    }


    /**
     * Gets the klassifikaatori_nimetus value for this Klassifikaator.
     * 
     * @return klassifikaatori_nimetus
     */
    public java.lang.String getKlassifikaatori_nimetus() {
        return klassifikaatori_nimetus;
    }


    /**
     * Sets the klassifikaatori_nimetus value for this Klassifikaator.
     * 
     * @param klassifikaatori_nimetus
     */
    public void setKlassifikaatori_nimetus(java.lang.String klassifikaatori_nimetus) {
        this.klassifikaatori_nimetus = klassifikaatori_nimetus;
    }


    /**
     * Gets the klassifikaatori_vaartused value for this Klassifikaator.
     * 
     * @return klassifikaatori_vaartused
     */
    public eu.x_road.arireg.producer.Klassifikaatori_vaartus[] getKlassifikaatori_vaartused() {
        return klassifikaatori_vaartused;
    }


    /**
     * Sets the klassifikaatori_vaartused value for this Klassifikaator.
     * 
     * @param klassifikaatori_vaartused
     */
    public void setKlassifikaatori_vaartused(eu.x_road.arireg.producer.Klassifikaatori_vaartus[] klassifikaatori_vaartused) {
        this.klassifikaatori_vaartused = klassifikaatori_vaartused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Klassifikaator)) return false;
        Klassifikaator other = (Klassifikaator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.klassifikaatori_kood==null && other.getKlassifikaatori_kood()==null) || 
             (this.klassifikaatori_kood!=null &&
              this.klassifikaatori_kood.equals(other.getKlassifikaatori_kood()))) &&
            ((this.klassifikaatori_nimetus==null && other.getKlassifikaatori_nimetus()==null) || 
             (this.klassifikaatori_nimetus!=null &&
              this.klassifikaatori_nimetus.equals(other.getKlassifikaatori_nimetus()))) &&
            ((this.klassifikaatori_vaartused==null && other.getKlassifikaatori_vaartused()==null) || 
             (this.klassifikaatori_vaartused!=null &&
              java.util.Arrays.equals(this.klassifikaatori_vaartused, other.getKlassifikaatori_vaartused())));
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
        if (getKlassifikaatori_kood() != null) {
            _hashCode += getKlassifikaatori_kood().hashCode();
        }
        if (getKlassifikaatori_nimetus() != null) {
            _hashCode += getKlassifikaatori_nimetus().hashCode();
        }
        if (getKlassifikaatori_vaartused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKlassifikaatori_vaartused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKlassifikaatori_vaartused(), i);
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
