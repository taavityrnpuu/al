/**
 * Ky_registriosamuut_v1_Vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_registriosamuut_v1_Vastus  implements java.io.Serializable {
    private java.math.BigInteger staatus;

    private java.lang.String staatus_detailid;

    private eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida[] korteriyhistu;

    public Ky_registriosamuut_v1_Vastus() {
    }

    public Ky_registriosamuut_v1_Vastus(
           java.math.BigInteger staatus,
           java.lang.String staatus_detailid,
           eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida[] korteriyhistu) {
           this.staatus = staatus;
           this.staatus_detailid = staatus_detailid;
           this.korteriyhistu = korteriyhistu;
    }


    /**
     * Gets the staatus value for this Ky_registriosamuut_v1_Vastus.
     * 
     * @return staatus
     */
    public java.math.BigInteger getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Ky_registriosamuut_v1_Vastus.
     * 
     * @param staatus
     */
    public void setStaatus(java.math.BigInteger staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_detailid value for this Ky_registriosamuut_v1_Vastus.
     * 
     * @return staatus_detailid
     */
    public java.lang.String getStaatus_detailid() {
        return staatus_detailid;
    }


    /**
     * Sets the staatus_detailid value for this Ky_registriosamuut_v1_Vastus.
     * 
     * @param staatus_detailid
     */
    public void setStaatus_detailid(java.lang.String staatus_detailid) {
        this.staatus_detailid = staatus_detailid;
    }


    /**
     * Gets the korteriyhistu value for this Ky_registriosamuut_v1_Vastus.
     * 
     * @return korteriyhistu
     */
    public eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida[] getKorteriyhistu() {
        return korteriyhistu;
    }


    /**
     * Sets the korteriyhistu value for this Ky_registriosamuut_v1_Vastus.
     * 
     * @param korteriyhistu
     */
    public void setKorteriyhistu(eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida[] korteriyhistu) {
        this.korteriyhistu = korteriyhistu;
    }

    public eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida getKorteriyhistu(int i) {
        return this.korteriyhistu[i];
    }

    public void setKorteriyhistu(int i, eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida _value) {
        this.korteriyhistu[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_registriosamuut_v1_Vastus)) return false;
        Ky_registriosamuut_v1_Vastus other = (Ky_registriosamuut_v1_Vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_detailid==null && other.getStaatus_detailid()==null) || 
             (this.staatus_detailid!=null &&
              this.staatus_detailid.equals(other.getStaatus_detailid()))) &&
            ((this.korteriyhistu==null && other.getKorteriyhistu()==null) || 
             (this.korteriyhistu!=null &&
              java.util.Arrays.equals(this.korteriyhistu, other.getKorteriyhistu())));
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
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_detailid() != null) {
            _hashCode += getStaatus_detailid().hashCode();
        }
        if (getKorteriyhistu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKorteriyhistu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKorteriyhistu(), i);
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
