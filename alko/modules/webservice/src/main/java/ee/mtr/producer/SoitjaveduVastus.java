/**
 * SoitjaveduVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SoitjaveduVastus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.YldinfoPostiAadressiga yldinfo;

    private ee.x_road.mtr.producer.SoitjaveduType[] soitjaveod;

    public SoitjaveduVastus() {
    }

    public SoitjaveduVastus(
           ee.x_road.mtr.producer.YldinfoPostiAadressiga yldinfo,
           ee.x_road.mtr.producer.SoitjaveduType[] soitjaveod) {
           this.yldinfo = yldinfo;
           this.soitjaveod = soitjaveod;
    }


    /**
     * Gets the yldinfo value for this SoitjaveduVastus.
     * 
     * @return yldinfo
     */
    public ee.x_road.mtr.producer.YldinfoPostiAadressiga getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this SoitjaveduVastus.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.x_road.mtr.producer.YldinfoPostiAadressiga yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the soitjaveod value for this SoitjaveduVastus.
     * 
     * @return soitjaveod
     */
    public ee.x_road.mtr.producer.SoitjaveduType[] getSoitjaveod() {
        return soitjaveod;
    }


    /**
     * Sets the soitjaveod value for this SoitjaveduVastus.
     * 
     * @param soitjaveod
     */
    public void setSoitjaveod(ee.x_road.mtr.producer.SoitjaveduType[] soitjaveod) {
        this.soitjaveod = soitjaveod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoitjaveduVastus)) return false;
        SoitjaveduVastus other = (SoitjaveduVastus) obj;
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
            ((this.soitjaveod==null && other.getSoitjaveod()==null) || 
             (this.soitjaveod!=null &&
              java.util.Arrays.equals(this.soitjaveod, other.getSoitjaveod())));
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
        if (getSoitjaveod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoitjaveod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoitjaveod(), i);
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
