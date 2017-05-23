/**
 * RegistreeringDetailneParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistreeringDetailneParing  implements java.io.Serializable {
    private java.lang.String tegevusalaKood;

    private java.lang.String kood;

    private java.math.BigInteger[] tegevused;

    public RegistreeringDetailneParing() {
    }

    public RegistreeringDetailneParing(
           java.lang.String tegevusalaKood,
           java.lang.String kood,
           java.math.BigInteger[] tegevused) {
           this.tegevusalaKood = tegevusalaKood;
           this.kood = kood;
           this.tegevused = tegevused;
    }


    /**
     * Gets the tegevusalaKood value for this RegistreeringDetailneParing.
     * 
     * @return tegevusalaKood
     */
    public java.lang.String getTegevusalaKood() {
        return tegevusalaKood;
    }


    /**
     * Sets the tegevusalaKood value for this RegistreeringDetailneParing.
     * 
     * @param tegevusalaKood
     */
    public void setTegevusalaKood(java.lang.String tegevusalaKood) {
        this.tegevusalaKood = tegevusalaKood;
    }


    /**
     * Gets the kood value for this RegistreeringDetailneParing.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RegistreeringDetailneParing.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the tegevused value for this RegistreeringDetailneParing.
     * 
     * @return tegevused
     */
    public java.math.BigInteger[] getTegevused() {
        return tegevused;
    }


    /**
     * Sets the tegevused value for this RegistreeringDetailneParing.
     * 
     * @param tegevused
     */
    public void setTegevused(java.math.BigInteger[] tegevused) {
        this.tegevused = tegevused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreeringDetailneParing)) return false;
        RegistreeringDetailneParing other = (RegistreeringDetailneParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevusalaKood==null && other.getTegevusalaKood()==null) || 
             (this.tegevusalaKood!=null &&
              this.tegevusalaKood.equals(other.getTegevusalaKood()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.tegevused==null && other.getTegevused()==null) || 
             (this.tegevused!=null &&
              java.util.Arrays.equals(this.tegevused, other.getTegevused())));
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
        if (getTegevusalaKood() != null) {
            _hashCode += getTegevusalaKood().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getTegevused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevused(), i);
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
