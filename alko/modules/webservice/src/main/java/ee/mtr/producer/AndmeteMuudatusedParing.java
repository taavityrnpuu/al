/**
 * AndmeteMuudatusedParing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AndmeteMuudatusedParing  implements java.io.Serializable {
    private java.util.Calendar alates;

    private java.lang.Boolean tegevuskohtadega;

    private java.lang.Boolean isikutega;

    private java.lang.Boolean soidukitega;

    private java.lang.Boolean kytusega;

    public AndmeteMuudatusedParing() {
    }

    public AndmeteMuudatusedParing(
           java.util.Calendar alates,
           java.lang.Boolean tegevuskohtadega,
           java.lang.Boolean isikutega,
           java.lang.Boolean soidukitega,
           java.lang.Boolean kytusega) {
           this.alates = alates;
           this.tegevuskohtadega = tegevuskohtadega;
           this.isikutega = isikutega;
           this.soidukitega = soidukitega;
           this.kytusega = kytusega;
    }


    /**
     * Gets the alates value for this AndmeteMuudatusedParing.
     * 
     * @return alates
     */
    public java.util.Calendar getAlates() {
        return alates;
    }


    /**
     * Sets the alates value for this AndmeteMuudatusedParing.
     * 
     * @param alates
     */
    public void setAlates(java.util.Calendar alates) {
        this.alates = alates;
    }


    /**
     * Gets the tegevuskohtadega value for this AndmeteMuudatusedParing.
     * 
     * @return tegevuskohtadega
     */
    public java.lang.Boolean getTegevuskohtadega() {
        return tegevuskohtadega;
    }


    /**
     * Sets the tegevuskohtadega value for this AndmeteMuudatusedParing.
     * 
     * @param tegevuskohtadega
     */
    public void setTegevuskohtadega(java.lang.Boolean tegevuskohtadega) {
        this.tegevuskohtadega = tegevuskohtadega;
    }


    /**
     * Gets the isikutega value for this AndmeteMuudatusedParing.
     * 
     * @return isikutega
     */
    public java.lang.Boolean getIsikutega() {
        return isikutega;
    }


    /**
     * Sets the isikutega value for this AndmeteMuudatusedParing.
     * 
     * @param isikutega
     */
    public void setIsikutega(java.lang.Boolean isikutega) {
        this.isikutega = isikutega;
    }


    /**
     * Gets the soidukitega value for this AndmeteMuudatusedParing.
     * 
     * @return soidukitega
     */
    public java.lang.Boolean getSoidukitega() {
        return soidukitega;
    }


    /**
     * Sets the soidukitega value for this AndmeteMuudatusedParing.
     * 
     * @param soidukitega
     */
    public void setSoidukitega(java.lang.Boolean soidukitega) {
        this.soidukitega = soidukitega;
    }


    /**
     * Gets the kytusega value for this AndmeteMuudatusedParing.
     * 
     * @return kytusega
     */
    public java.lang.Boolean getKytusega() {
        return kytusega;
    }


    /**
     * Sets the kytusega value for this AndmeteMuudatusedParing.
     * 
     * @param kytusega
     */
    public void setKytusega(java.lang.Boolean kytusega) {
        this.kytusega = kytusega;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndmeteMuudatusedParing)) return false;
        AndmeteMuudatusedParing other = (AndmeteMuudatusedParing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alates==null && other.getAlates()==null) || 
             (this.alates!=null &&
              this.alates.equals(other.getAlates()))) &&
            ((this.tegevuskohtadega==null && other.getTegevuskohtadega()==null) || 
             (this.tegevuskohtadega!=null &&
              this.tegevuskohtadega.equals(other.getTegevuskohtadega()))) &&
            ((this.isikutega==null && other.getIsikutega()==null) || 
             (this.isikutega!=null &&
              this.isikutega.equals(other.getIsikutega()))) &&
            ((this.soidukitega==null && other.getSoidukitega()==null) || 
             (this.soidukitega!=null &&
              this.soidukitega.equals(other.getSoidukitega()))) &&
            ((this.kytusega==null && other.getKytusega()==null) || 
             (this.kytusega!=null &&
              this.kytusega.equals(other.getKytusega())));
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
        if (getAlates() != null) {
            _hashCode += getAlates().hashCode();
        }
        if (getTegevuskohtadega() != null) {
            _hashCode += getTegevuskohtadega().hashCode();
        }
        if (getIsikutega() != null) {
            _hashCode += getIsikutega().hashCode();
        }
        if (getSoidukitega() != null) {
            _hashCode += getSoidukitega().hashCode();
        }
        if (getKytusega() != null) {
            _hashCode += getKytusega().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
