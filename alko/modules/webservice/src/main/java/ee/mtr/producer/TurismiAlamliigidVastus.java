/**
 * TurismiAlamliigidVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TurismiAlamliigidVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.KlassifikaatorValik[] alamLiigid;

    public TurismiAlamliigidVastus() {
    }

    public TurismiAlamliigidVastus(
           ee.x_road.mtr.producer.KlassifikaatorValik[] alamLiigid) {
           this.alamLiigid = alamLiigid;
    }


    /**
     * Gets the alamLiigid value for this TurismiAlamliigidVastus.
     * 
     * @return alamLiigid
     */
    public ee.x_road.mtr.producer.KlassifikaatorValik[] getAlamLiigid() {
        return alamLiigid;
    }


    /**
     * Sets the alamLiigid value for this TurismiAlamliigidVastus.
     * 
     * @param alamLiigid
     */
    public void setAlamLiigid(ee.x_road.mtr.producer.KlassifikaatorValik[] alamLiigid) {
        this.alamLiigid = alamLiigid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TurismiAlamliigidVastus)) return false;
        TurismiAlamliigidVastus other = (TurismiAlamliigidVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alamLiigid==null && other.getAlamLiigid()==null) || 
             (this.alamLiigid!=null &&
              java.util.Arrays.equals(this.alamLiigid, other.getAlamLiigid())));
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
        if (getAlamLiigid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlamLiigid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlamLiigid(), i);
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
