/**
 * SoidukikaardiVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SoidukikaardiVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.YldinfoBaseType yldinfo;

    private ee.x_road.mtr.producer.SoidukikaartType[] soidukikaardid;

    public SoidukikaardiVastus() {
    }

    public SoidukikaardiVastus(
           ee.x_road.mtr.producer.YldinfoBaseType yldinfo,
           ee.x_road.mtr.producer.SoidukikaartType[] soidukikaardid) {
           this.yldinfo = yldinfo;
           this.soidukikaardid = soidukikaardid;
    }


    /**
     * Gets the yldinfo value for this SoidukikaardiVastus.
     * 
     * @return yldinfo
     */
    public ee.x_road.mtr.producer.YldinfoBaseType getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this SoidukikaardiVastus.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.x_road.mtr.producer.YldinfoBaseType yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the soidukikaardid value for this SoidukikaardiVastus.
     * 
     * @return soidukikaardid
     */
    public ee.x_road.mtr.producer.SoidukikaartType[] getSoidukikaardid() {
        return soidukikaardid;
    }


    /**
     * Sets the soidukikaardid value for this SoidukikaardiVastus.
     * 
     * @param soidukikaardid
     */
    public void setSoidukikaardid(ee.x_road.mtr.producer.SoidukikaartType[] soidukikaardid) {
        this.soidukikaardid = soidukikaardid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoidukikaardiVastus)) return false;
        SoidukikaardiVastus other = (SoidukikaardiVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yldinfo==null && other.getYldinfo()==null) || 
             (this.yldinfo!=null &&
              this.yldinfo.equals(other.getYldinfo()))) &&
            ((this.soidukikaardid==null && other.getSoidukikaardid()==null) || 
             (this.soidukikaardid!=null &&
              java.util.Arrays.equals(this.soidukikaardid, other.getSoidukikaardid())));
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
        if (getYldinfo() != null) {
            _hashCode += getYldinfo().hashCode();
        }
        if (getSoidukikaardid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoidukikaardid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoidukikaardid(), i);
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
