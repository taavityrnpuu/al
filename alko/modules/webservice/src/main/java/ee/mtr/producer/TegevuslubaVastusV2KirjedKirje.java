/**
 * TegevuslubaVastusV2KirjedKirje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TegevuslubaVastusV2KirjedKirje  implements java.io.Serializable {
    private ee.x_road.mtr.producer.YldinfoType yldinfo;

    private ee.x_road.mtr.producer.RegistrikanneType registrikanne;

    private ee.x_road.mtr.producer.Erihoolekandeteenused erihoolekandeteenused;

    private ee.x_road.mtr.producer.Rehabilitatsiooniteenused rehabilitatsiooniteenused;

    public TegevuslubaVastusV2KirjedKirje() {
    }

    public TegevuslubaVastusV2KirjedKirje(
           ee.x_road.mtr.producer.YldinfoType yldinfo,
           ee.x_road.mtr.producer.RegistrikanneType registrikanne,
           ee.x_road.mtr.producer.Erihoolekandeteenused erihoolekandeteenused,
           ee.x_road.mtr.producer.Rehabilitatsiooniteenused rehabilitatsiooniteenused) {
           this.yldinfo = yldinfo;
           this.registrikanne = registrikanne;
           this.erihoolekandeteenused = erihoolekandeteenused;
           this.rehabilitatsiooniteenused = rehabilitatsiooniteenused;
    }


    /**
     * Gets the yldinfo value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @return yldinfo
     */
    public ee.x_road.mtr.producer.YldinfoType getYldinfo() {
        return yldinfo;
    }


    /**
     * Sets the yldinfo value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @param yldinfo
     */
    public void setYldinfo(ee.x_road.mtr.producer.YldinfoType yldinfo) {
        this.yldinfo = yldinfo;
    }


    /**
     * Gets the registrikanne value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @return registrikanne
     */
    public ee.x_road.mtr.producer.RegistrikanneType getRegistrikanne() {
        return registrikanne;
    }


    /**
     * Sets the registrikanne value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @param registrikanne
     */
    public void setRegistrikanne(ee.x_road.mtr.producer.RegistrikanneType registrikanne) {
        this.registrikanne = registrikanne;
    }


    /**
     * Gets the erihoolekandeteenused value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @return erihoolekandeteenused
     */
    public ee.x_road.mtr.producer.Erihoolekandeteenused getErihoolekandeteenused() {
        return erihoolekandeteenused;
    }


    /**
     * Sets the erihoolekandeteenused value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @param erihoolekandeteenused
     */
    public void setErihoolekandeteenused(ee.x_road.mtr.producer.Erihoolekandeteenused erihoolekandeteenused) {
        this.erihoolekandeteenused = erihoolekandeteenused;
    }


    /**
     * Gets the rehabilitatsiooniteenused value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @return rehabilitatsiooniteenused
     */
    public ee.x_road.mtr.producer.Rehabilitatsiooniteenused getRehabilitatsiooniteenused() {
        return rehabilitatsiooniteenused;
    }


    /**
     * Sets the rehabilitatsiooniteenused value for this TegevuslubaVastusV2KirjedKirje.
     * 
     * @param rehabilitatsiooniteenused
     */
    public void setRehabilitatsiooniteenused(ee.x_road.mtr.producer.Rehabilitatsiooniteenused rehabilitatsiooniteenused) {
        this.rehabilitatsiooniteenused = rehabilitatsiooniteenused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TegevuslubaVastusV2KirjedKirje)) return false;
        TegevuslubaVastusV2KirjedKirje other = (TegevuslubaVastusV2KirjedKirje) obj;
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
              this.registrikanne.equals(other.getRegistrikanne()))) &&
            ((this.erihoolekandeteenused==null && other.getErihoolekandeteenused()==null) || 
             (this.erihoolekandeteenused!=null &&
              this.erihoolekandeteenused.equals(other.getErihoolekandeteenused()))) &&
            ((this.rehabilitatsiooniteenused==null && other.getRehabilitatsiooniteenused()==null) || 
             (this.rehabilitatsiooniteenused!=null &&
              this.rehabilitatsiooniteenused.equals(other.getRehabilitatsiooniteenused())));
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
        if (getErihoolekandeteenused() != null) {
            _hashCode += getErihoolekandeteenused().hashCode();
        }
        if (getRehabilitatsiooniteenused() != null) {
            _hashCode += getRehabilitatsiooniteenused().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
