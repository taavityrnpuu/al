/**
 * EarveRegistriParing_v1_IN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EarveRegistriParing_v1_IN  implements java.io.Serializable {
    private java.lang.Boolean tagasta_nimed;

    private java.math.BigInteger tulemuste_lk;

    private java.math.BigInteger[] registrikoodid;

    public EarveRegistriParing_v1_IN() {
    }

    public EarveRegistriParing_v1_IN(
           java.lang.Boolean tagasta_nimed,
           java.math.BigInteger tulemuste_lk,
           java.math.BigInteger[] registrikoodid) {
           this.tagasta_nimed = tagasta_nimed;
           this.tulemuste_lk = tulemuste_lk;
           this.registrikoodid = registrikoodid;
    }


    /**
     * Gets the tagasta_nimed value for this EarveRegistriParing_v1_IN.
     * 
     * @return tagasta_nimed
     */
    public java.lang.Boolean getTagasta_nimed() {
        return tagasta_nimed;
    }


    /**
     * Sets the tagasta_nimed value for this EarveRegistriParing_v1_IN.
     * 
     * @param tagasta_nimed
     */
    public void setTagasta_nimed(java.lang.Boolean tagasta_nimed) {
        this.tagasta_nimed = tagasta_nimed;
    }


    /**
     * Gets the tulemuste_lk value for this EarveRegistriParing_v1_IN.
     * 
     * @return tulemuste_lk
     */
    public java.math.BigInteger getTulemuste_lk() {
        return tulemuste_lk;
    }


    /**
     * Sets the tulemuste_lk value for this EarveRegistriParing_v1_IN.
     * 
     * @param tulemuste_lk
     */
    public void setTulemuste_lk(java.math.BigInteger tulemuste_lk) {
        this.tulemuste_lk = tulemuste_lk;
    }


    /**
     * Gets the registrikoodid value for this EarveRegistriParing_v1_IN.
     * 
     * @return registrikoodid
     */
    public java.math.BigInteger[] getRegistrikoodid() {
        return registrikoodid;
    }


    /**
     * Sets the registrikoodid value for this EarveRegistriParing_v1_IN.
     * 
     * @param registrikoodid
     */
    public void setRegistrikoodid(java.math.BigInteger[] registrikoodid) {
        this.registrikoodid = registrikoodid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EarveRegistriParing_v1_IN)) return false;
        EarveRegistriParing_v1_IN other = (EarveRegistriParing_v1_IN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tagasta_nimed==null && other.getTagasta_nimed()==null) || 
             (this.tagasta_nimed!=null &&
              this.tagasta_nimed.equals(other.getTagasta_nimed()))) &&
            ((this.tulemuste_lk==null && other.getTulemuste_lk()==null) || 
             (this.tulemuste_lk!=null &&
              this.tulemuste_lk.equals(other.getTulemuste_lk()))) &&
            ((this.registrikoodid==null && other.getRegistrikoodid()==null) || 
             (this.registrikoodid!=null &&
              java.util.Arrays.equals(this.registrikoodid, other.getRegistrikoodid())));
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
        if (getTagasta_nimed() != null) {
            _hashCode += getTagasta_nimed().hashCode();
        }
        if (getTulemuste_lk() != null) {
            _hashCode += getTulemuste_lk().hashCode();
        }
        if (getRegistrikoodid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikoodid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikoodid(), i);
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
