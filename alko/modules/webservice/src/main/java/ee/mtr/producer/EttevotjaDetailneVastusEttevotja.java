/**
 * EttevotjaDetailneVastusEttevotja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class EttevotjaDetailneVastusEttevotja  implements java.io.Serializable {
    private ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotjaYldinfo yldinfo;

    private ee.x_road.mtr.producer.RegistrikanneDetailneType[] registrikanne;

    public EttevotjaDetailneVastusEttevotja() {
    }

    public EttevotjaDetailneVastusEttevotja(
           ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotjaYldinfo yldinfo,
           ee.x_road.mtr.producer.RegistrikanneDetailneType[] registrikanne) {
           this.yldinfo = yldinfo;
           this.registrikanne = registrikanne;
    }


    /**
     * Gets the yldinfo value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @return yldinfo
     */
    public ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotjaYldinfo getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotjaYldinfo yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the registrikanne value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @return registrikanne
     */
    public ee.x_road.mtr.producer.RegistrikanneDetailneType[] getRegistrikanne() {
        return registrikanne;
    }


    /**
     * Sets the registrikanne value for this EttevotjaDetailneVastusEttevotja.
     * 
     * @param registrikanne
     */
    public void setRegistrikanne(ee.x_road.mtr.producer.RegistrikanneDetailneType[] registrikanne) {
        this.registrikanne = registrikanne;
    }

    public ee.x_road.mtr.producer.RegistrikanneDetailneType getRegistrikanne(int i) {
        return this.registrikanne[i];
    }

    public void setRegistrikanne(int i, ee.x_road.mtr.producer.RegistrikanneDetailneType _value) {
        this.registrikanne[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaDetailneVastusEttevotja)) return false;
        EttevotjaDetailneVastusEttevotja other = (EttevotjaDetailneVastusEttevotja) obj;
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
            ((this.registrikanne==null && other.getRegistrikanne()==null) || 
             (this.registrikanne!=null &&
              java.util.Arrays.equals(this.registrikanne, other.getRegistrikanne())));
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
        if (getRegistrikanne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikanne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikanne(), i);
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
