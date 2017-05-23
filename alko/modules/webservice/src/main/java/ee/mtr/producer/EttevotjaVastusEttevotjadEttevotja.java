/**
 * EttevotjaVastusEttevotjadEttevotja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class EttevotjaVastusEttevotjadEttevotja  implements java.io.Serializable {
    private ee.x_road.mtr.producer.YldinfoType yldinfo;

    private ee.x_road.mtr.producer.RegistrikanneType[] registrikanded;

    public EttevotjaVastusEttevotjadEttevotja() {
    }

    public EttevotjaVastusEttevotjadEttevotja(
           ee.x_road.mtr.producer.YldinfoType yldinfo,
           ee.x_road.mtr.producer.RegistrikanneType[] registrikanded) {
           this.yldinfo = yldinfo;
           this.registrikanded = registrikanded;
    }


    /**
     * Gets the yldinfo value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @return yldinfo
     */
    public ee.x_road.mtr.producer.YldinfoType getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.x_road.mtr.producer.YldinfoType yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the registrikanded value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @return registrikanded
     */
    public ee.x_road.mtr.producer.RegistrikanneType[] getRegistrikanded() {
        return registrikanded;
    }


    /**
     * Sets the registrikanded value for this EttevotjaVastusEttevotjadEttevotja.
     * 
     * @param registrikanded
     */
    public void setRegistrikanded(ee.x_road.mtr.producer.RegistrikanneType[] registrikanded) {
        this.registrikanded = registrikanded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaVastusEttevotjadEttevotja)) return false;
        EttevotjaVastusEttevotjadEttevotja other = (EttevotjaVastusEttevotjadEttevotja) obj;
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
            ((this.registrikanded==null && other.getRegistrikanded()==null) || 
             (this.registrikanded!=null &&
              java.util.Arrays.equals(this.registrikanded, other.getRegistrikanded())));
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
        if (getRegistrikanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikanded(), i);
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
