/**
 * Ky_menetlusinfo_v2_Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_menetlusinfo_v2_Query  implements java.io.Serializable {
    private java.math.BigInteger sonumi_id;

    private java.lang.String kr_menetluse_nr;

    private java.lang.String menetleja_info;

    private eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Maarus maaruse_andmed;

    public Ky_menetlusinfo_v2_Query() {
    }

    public Ky_menetlusinfo_v2_Query(
           java.math.BigInteger sonumi_id,
           java.lang.String kr_menetluse_nr,
           java.lang.String menetleja_info,
           eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Maarus maaruse_andmed) {
           this.sonumi_id = sonumi_id;
           this.kr_menetluse_nr = kr_menetluse_nr;
           this.menetleja_info = menetleja_info;
           this.maaruse_andmed = maaruse_andmed;
    }


    /**
     * Gets the sonumi_id value for this Ky_menetlusinfo_v2_Query.
     * 
     * @return sonumi_id
     */
    public java.math.BigInteger getSonumi_id() {
        return sonumi_id;
    }


    /**
     * Sets the sonumi_id value for this Ky_menetlusinfo_v2_Query.
     * 
     * @param sonumi_id
     */
    public void setSonumi_id(java.math.BigInteger sonumi_id) {
        this.sonumi_id = sonumi_id;
    }


    /**
     * Gets the kr_menetluse_nr value for this Ky_menetlusinfo_v2_Query.
     * 
     * @return kr_menetluse_nr
     */
    public java.lang.String getKr_menetluse_nr() {
        return kr_menetluse_nr;
    }


    /**
     * Sets the kr_menetluse_nr value for this Ky_menetlusinfo_v2_Query.
     * 
     * @param kr_menetluse_nr
     */
    public void setKr_menetluse_nr(java.lang.String kr_menetluse_nr) {
        this.kr_menetluse_nr = kr_menetluse_nr;
    }


    /**
     * Gets the menetleja_info value for this Ky_menetlusinfo_v2_Query.
     * 
     * @return menetleja_info
     */
    public java.lang.String getMenetleja_info() {
        return menetleja_info;
    }


    /**
     * Sets the menetleja_info value for this Ky_menetlusinfo_v2_Query.
     * 
     * @param menetleja_info
     */
    public void setMenetleja_info(java.lang.String menetleja_info) {
        this.menetleja_info = menetleja_info;
    }


    /**
     * Gets the maaruse_andmed value for this Ky_menetlusinfo_v2_Query.
     * 
     * @return maaruse_andmed
     */
    public eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Maarus getMaaruse_andmed() {
        return maaruse_andmed;
    }


    /**
     * Sets the maaruse_andmed value for this Ky_menetlusinfo_v2_Query.
     * 
     * @param maaruse_andmed
     */
    public void setMaaruse_andmed(eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Maarus maaruse_andmed) {
        this.maaruse_andmed = maaruse_andmed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_menetlusinfo_v2_Query)) return false;
        Ky_menetlusinfo_v2_Query other = (Ky_menetlusinfo_v2_Query) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sonumi_id==null && other.getSonumi_id()==null) || 
             (this.sonumi_id!=null &&
              this.sonumi_id.equals(other.getSonumi_id()))) &&
            ((this.kr_menetluse_nr==null && other.getKr_menetluse_nr()==null) || 
             (this.kr_menetluse_nr!=null &&
              this.kr_menetluse_nr.equals(other.getKr_menetluse_nr()))) &&
            ((this.menetleja_info==null && other.getMenetleja_info()==null) || 
             (this.menetleja_info!=null &&
              this.menetleja_info.equals(other.getMenetleja_info()))) &&
            ((this.maaruse_andmed==null && other.getMaaruse_andmed()==null) || 
             (this.maaruse_andmed!=null &&
              this.maaruse_andmed.equals(other.getMaaruse_andmed())));
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
        if (getSonumi_id() != null) {
            _hashCode += getSonumi_id().hashCode();
        }
        if (getKr_menetluse_nr() != null) {
            _hashCode += getKr_menetluse_nr().hashCode();
        }
        if (getMenetleja_info() != null) {
            _hashCode += getMenetleja_info().hashCode();
        }
        if (getMaaruse_andmed() != null) {
            _hashCode += getMaaruse_andmed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
