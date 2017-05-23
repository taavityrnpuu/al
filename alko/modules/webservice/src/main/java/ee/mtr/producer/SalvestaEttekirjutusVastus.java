/**
 * SalvestaEttekirjutusVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaEttekirjutusVastus  implements java.io.Serializable {
    private boolean ok;

    private java.math.BigInteger id;

    private java.lang.String veakood;

    private java.lang.String veateade;

    public SalvestaEttekirjutusVastus() {
    }

    public SalvestaEttekirjutusVastus(
           boolean ok,
           java.math.BigInteger id,
           java.lang.String veakood,
           java.lang.String veateade) {
           this.ok = ok;
           this.id = id;
           this.veakood = veakood;
           this.veateade = veateade;
    }


    /**
     * Gets the ok value for this SalvestaEttekirjutusVastus.
     * 
     * @return ok
     */
    public boolean isOk() {
        return ok;
    }


    /**
     * Sets the ok value for this SalvestaEttekirjutusVastus.
     * 
     * @param ok
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }


    /**
     * Gets the id value for this SalvestaEttekirjutusVastus.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this SalvestaEttekirjutusVastus.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the veakood value for this SalvestaEttekirjutusVastus.
     * 
     * @return veakood
     */
    public java.lang.String getVeakood() {
        return veakood;
    }


    /**
     * Sets the veakood value for this SalvestaEttekirjutusVastus.
     * 
     * @param veakood
     */
    public void setVeakood(java.lang.String veakood) {
        this.veakood = veakood;
    }


    /**
     * Gets the veateade value for this SalvestaEttekirjutusVastus.
     * 
     * @return veateade
     */
    public java.lang.String getVeateade() {
        return veateade;
    }


    /**
     * Sets the veateade value for this SalvestaEttekirjutusVastus.
     * 
     * @param veateade
     */
    public void setVeateade(java.lang.String veateade) {
        this.veateade = veateade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaEttekirjutusVastus)) return false;
        SalvestaEttekirjutusVastus other = (SalvestaEttekirjutusVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ok == other.isOk() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.veakood==null && other.getVeakood()==null) || 
             (this.veakood!=null &&
              this.veakood.equals(other.getVeakood()))) &&
            ((this.veateade==null && other.getVeateade()==null) || 
             (this.veateade!=null &&
              this.veateade.equals(other.getVeateade())));
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
        _hashCode += (isOk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVeakood() != null) {
            _hashCode += getVeakood().hashCode();
        }
        if (getVeateade() != null) {
            _hashCode += getVeateade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
