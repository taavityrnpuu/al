/**
 * AndmeteMuudatusedVastusMuudatusTegevuskoht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AndmeteMuudatusedVastusMuudatusTegevuskoht  implements java.io.Serializable {
    private java.lang.String tegevuskohaAadress;

    private java.lang.String tegevuskohaAadressAdsOid;

    private java.lang.String tegevuskohaNimetus;

    private java.lang.String tegevuskohaLiik;

    public AndmeteMuudatusedVastusMuudatusTegevuskoht() {
    }

    public AndmeteMuudatusedVastusMuudatusTegevuskoht(
           java.lang.String tegevuskohaAadress,
           java.lang.String tegevuskohaAadressAdsOid,
           java.lang.String tegevuskohaNimetus,
           java.lang.String tegevuskohaLiik) {
           this.tegevuskohaAadress = tegevuskohaAadress;
           this.tegevuskohaAadressAdsOid = tegevuskohaAadressAdsOid;
           this.tegevuskohaNimetus = tegevuskohaNimetus;
           this.tegevuskohaLiik = tegevuskohaLiik;
    }


    /**
     * Gets the tegevuskohaAadress value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @return tegevuskohaAadress
     */
    public java.lang.String getTegevuskohaAadress() {
        return tegevuskohaAadress;
    }


    /**
     * Sets the tegevuskohaAadress value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @param tegevuskohaAadress
     */
    public void setTegevuskohaAadress(java.lang.String tegevuskohaAadress) {
        this.tegevuskohaAadress = tegevuskohaAadress;
    }


    /**
     * Gets the tegevuskohaAadressAdsOid value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @return tegevuskohaAadressAdsOid
     */
    public java.lang.String getTegevuskohaAadressAdsOid() {
        return tegevuskohaAadressAdsOid;
    }


    /**
     * Sets the tegevuskohaAadressAdsOid value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @param tegevuskohaAadressAdsOid
     */
    public void setTegevuskohaAadressAdsOid(java.lang.String tegevuskohaAadressAdsOid) {
        this.tegevuskohaAadressAdsOid = tegevuskohaAadressAdsOid;
    }


    /**
     * Gets the tegevuskohaNimetus value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @return tegevuskohaNimetus
     */
    public java.lang.String getTegevuskohaNimetus() {
        return tegevuskohaNimetus;
    }


    /**
     * Sets the tegevuskohaNimetus value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @param tegevuskohaNimetus
     */
    public void setTegevuskohaNimetus(java.lang.String tegevuskohaNimetus) {
        this.tegevuskohaNimetus = tegevuskohaNimetus;
    }


    /**
     * Gets the tegevuskohaLiik value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @return tegevuskohaLiik
     */
    public java.lang.String getTegevuskohaLiik() {
        return tegevuskohaLiik;
    }


    /**
     * Sets the tegevuskohaLiik value for this AndmeteMuudatusedVastusMuudatusTegevuskoht.
     * 
     * @param tegevuskohaLiik
     */
    public void setTegevuskohaLiik(java.lang.String tegevuskohaLiik) {
        this.tegevuskohaLiik = tegevuskohaLiik;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndmeteMuudatusedVastusMuudatusTegevuskoht)) return false;
        AndmeteMuudatusedVastusMuudatusTegevuskoht other = (AndmeteMuudatusedVastusMuudatusTegevuskoht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevuskohaAadress==null && other.getTegevuskohaAadress()==null) || 
             (this.tegevuskohaAadress!=null &&
              this.tegevuskohaAadress.equals(other.getTegevuskohaAadress()))) &&
            ((this.tegevuskohaAadressAdsOid==null && other.getTegevuskohaAadressAdsOid()==null) || 
             (this.tegevuskohaAadressAdsOid!=null &&
              this.tegevuskohaAadressAdsOid.equals(other.getTegevuskohaAadressAdsOid()))) &&
            ((this.tegevuskohaNimetus==null && other.getTegevuskohaNimetus()==null) || 
             (this.tegevuskohaNimetus!=null &&
              this.tegevuskohaNimetus.equals(other.getTegevuskohaNimetus()))) &&
            ((this.tegevuskohaLiik==null && other.getTegevuskohaLiik()==null) || 
             (this.tegevuskohaLiik!=null &&
              this.tegevuskohaLiik.equals(other.getTegevuskohaLiik())));
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
        if (getTegevuskohaAadress() != null) {
            _hashCode += getTegevuskohaAadress().hashCode();
        }
        if (getTegevuskohaAadressAdsOid() != null) {
            _hashCode += getTegevuskohaAadressAdsOid().hashCode();
        }
        if (getTegevuskohaNimetus() != null) {
            _hashCode += getTegevuskohaNimetus().hashCode();
        }
        if (getTegevuskohaLiik() != null) {
            _hashCode += getTegevuskohaLiik().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
