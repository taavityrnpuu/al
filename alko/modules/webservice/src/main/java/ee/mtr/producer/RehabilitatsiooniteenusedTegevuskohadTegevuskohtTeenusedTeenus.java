/**
 * RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus  implements java.io.Serializable {
    private java.lang.String kood;

    private java.lang.String nimetus;

    public RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus() {
    }

    public RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus(
           java.lang.String kood,
           java.lang.String nimetus) {
           this.kood = kood;
           this.nimetus = nimetus;
    }


    /**
     * Gets the kood value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimetus value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus)) return false;
        RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus other = (RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus) obj;
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
              this.nimetus.equals(other.getNimetus())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
