/**
 * TegevuskohtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TegevuskohtType  implements java.io.Serializable {
    private java.lang.String liik;

    private java.lang.String nimetus;

    private ee.x_road.mtr.producer.AadressType aadress;

    private java.util.Date alguskp;

    private java.util.Date loppkp;

    public TegevuskohtType() {
    }

    public TegevuskohtType(
           java.lang.String liik,
           java.lang.String nimetus,
           ee.x_road.mtr.producer.AadressType aadress,
           java.util.Date alguskp,
           java.util.Date loppkp) {
           this.liik = liik;
           this.nimetus = nimetus;
           this.aadress = aadress;
           this.alguskp = alguskp;
           this.loppkp = loppkp;
    }


    /**
     * Gets the liik value for this TegevuskohtType.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this TegevuskohtType.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the nimetus value for this TegevuskohtType.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this TegevuskohtType.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the aadress value for this TegevuskohtType.
     * 
     * @return aadress
     */
    public ee.x_road.mtr.producer.AadressType getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this TegevuskohtType.
     * 
     * @param aadress
     */
    public void setAadress(ee.x_road.mtr.producer.AadressType aadress) {
        this.aadress = aadress;
    }


    /**
     * Gets the alguskp value for this TegevuskohtType.
     * 
     * @return alguskp
     */
    public java.util.Date getAlguskp() {
        return alguskp;
    }


    /**
     * Sets the alguskp value for this TegevuskohtType.
     * 
     * @param alguskp
     */
    public void setAlguskp(java.util.Date alguskp) {
        this.alguskp = alguskp;
    }


    /**
     * Gets the loppkp value for this TegevuskohtType.
     * 
     * @return loppkp
     */
    public java.util.Date getLoppkp() {
        return loppkp;
    }


    /**
     * Sets the loppkp value for this TegevuskohtType.
     * 
     * @param loppkp
     */
    public void setLoppkp(java.util.Date loppkp) {
        this.loppkp = loppkp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TegevuskohtType)) return false;
        TegevuskohtType other = (TegevuskohtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress()))) &&
            ((this.alguskp==null && other.getAlguskp()==null) || 
             (this.alguskp!=null &&
              this.alguskp.equals(other.getAlguskp()))) &&
            ((this.loppkp==null && other.getLoppkp()==null) || 
             (this.loppkp!=null &&
              this.loppkp.equals(other.getLoppkp())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        if (getAlguskp() != null) {
            _hashCode += getAlguskp().hashCode();
        }
        if (getLoppkp() != null) {
            _hashCode += getLoppkp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
