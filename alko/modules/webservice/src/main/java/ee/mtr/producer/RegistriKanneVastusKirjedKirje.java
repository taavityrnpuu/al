/**
 * RegistriKanneVastusKirjedKirje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistriKanneVastusKirjedKirje  implements java.io.Serializable {
    private ee.x_road.mtr.producer.YldinfoType yldinfo;

    private ee.x_road.mtr.producer.RegistrikanneType registrikanne;

    public RegistriKanneVastusKirjedKirje() {
    }

    public RegistriKanneVastusKirjedKirje(
           ee.x_road.mtr.producer.YldinfoType yldinfo,
           ee.x_road.mtr.producer.RegistrikanneType registrikanne) {
           this.yldinfo = yldinfo;
           this.registrikanne = registrikanne;
    }


    /**
     * Gets the yldinfo value for this RegistriKanneVastusKirjedKirje.
     * 
     * @return yldinfo
     */
    public ee.x_road.mtr.producer.YldinfoType getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this RegistriKanneVastusKirjedKirje.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.x_road.mtr.producer.YldinfoType yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the registrikanne value for this RegistriKanneVastusKirjedKirje.
     * 
     * @return registrikanne
     */
    public ee.x_road.mtr.producer.RegistrikanneType getRegistrikanne() {
        return registrikanne;
    }


    /**
     * Sets the registrikanne value for this RegistriKanneVastusKirjedKirje.
     * 
     * @param registrikanne
     */
    public void setRegistrikanne(ee.x_road.mtr.producer.RegistrikanneType registrikanne) {
        this.registrikanne = registrikanne;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistriKanneVastusKirjedKirje)) return false;
        RegistriKanneVastusKirjedKirje other = (RegistriKanneVastusKirjedKirje) obj;
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
              this.registrikanne.equals(other.getRegistrikanne())));
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
            _hashCode += getRegistrikanne().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
