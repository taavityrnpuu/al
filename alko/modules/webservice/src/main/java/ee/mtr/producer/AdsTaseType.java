/**
 * AdsTaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AdsTaseType  implements java.io.Serializable {
    private java.lang.String kood;

    private java.lang.String nimetus;

    private java.lang.String nimetus_liigiga;

    public AdsTaseType() {
    }

    public AdsTaseType(
           java.lang.String kood,
           java.lang.String nimetus,
           java.lang.String nimetus_liigiga) {
           this.kood = kood;
           this.nimetus = nimetus;
           this.nimetus_liigiga = nimetus_liigiga;
    }


    /**
     * Gets the kood value for this AdsTaseType.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this AdsTaseType.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimetus value for this AdsTaseType.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this AdsTaseType.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the nimetus_liigiga value for this AdsTaseType.
     * 
     * @return nimetus_liigiga
     */
    public java.lang.String getNimetus_liigiga() {
        return nimetus_liigiga;
    }


    /**
     * Sets the nimetus_liigiga value for this AdsTaseType.
     * 
     * @param nimetus_liigiga
     */
    public void setNimetus_liigiga(java.lang.String nimetus_liigiga) {
        this.nimetus_liigiga = nimetus_liigiga;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdsTaseType)) return false;
        AdsTaseType other = (AdsTaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.nimetus_liigiga==null && other.getNimetus_liigiga()==null) || 
             (this.nimetus_liigiga!=null &&
              this.nimetus_liigiga.equals(other.getNimetus_liigiga())));
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
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getNimetus_liigiga() != null) {
            _hashCode += getNimetus_liigiga().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
