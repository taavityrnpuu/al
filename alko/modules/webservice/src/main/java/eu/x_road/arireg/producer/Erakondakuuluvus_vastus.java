/**
 * Erakondakuuluvus_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Erakondakuuluvus_vastus  implements java.io.Serializable {
    private java.math.BigInteger isikukood;

    private java.lang.String eesnimi;

    private java.lang.String perenimi;

    private eu.x_road.arireg.producer.Erakondakuuluvus_liige[] liikmelisus;

    public Erakondakuuluvus_vastus() {
    }

    public Erakondakuuluvus_vastus(
           java.math.BigInteger isikukood,
           java.lang.String eesnimi,
           java.lang.String perenimi,
           eu.x_road.arireg.producer.Erakondakuuluvus_liige[] liikmelisus) {
           this.isikukood = isikukood;
           this.eesnimi = eesnimi;
           this.perenimi = perenimi;
           this.liikmelisus = liikmelisus;
    }


    /**
     * Gets the isikukood value for this Erakondakuuluvus_vastus.
     * 
     * @return isikukood
     */
    public java.math.BigInteger getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this Erakondakuuluvus_vastus.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.math.BigInteger isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the eesnimi value for this Erakondakuuluvus_vastus.
     * 
     * @return eesnimi
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }


    /**
     * Sets the eesnimi value for this Erakondakuuluvus_vastus.
     * 
     * @param eesnimi
     */
    public void setEesnimi(java.lang.String eesnimi) {
        this.eesnimi = eesnimi;
    }


    /**
     * Gets the perenimi value for this Erakondakuuluvus_vastus.
     * 
     * @return perenimi
     */
    public java.lang.String getPerenimi() {
        return perenimi;
    }


    /**
     * Sets the perenimi value for this Erakondakuuluvus_vastus.
     * 
     * @param perenimi
     */
    public void setPerenimi(java.lang.String perenimi) {
        this.perenimi = perenimi;
    }


    /**
     * Gets the liikmelisus value for this Erakondakuuluvus_vastus.
     * 
     * @return liikmelisus
     */
    public eu.x_road.arireg.producer.Erakondakuuluvus_liige[] getLiikmelisus() {
        return liikmelisus;
    }


    /**
     * Sets the liikmelisus value for this Erakondakuuluvus_vastus.
     * 
     * @param liikmelisus
     */
    public void setLiikmelisus(eu.x_road.arireg.producer.Erakondakuuluvus_liige[] liikmelisus) {
        this.liikmelisus = liikmelisus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erakondakuuluvus_vastus)) return false;
        Erakondakuuluvus_vastus other = (Erakondakuuluvus_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.eesnimi==null && other.getEesnimi()==null) || 
             (this.eesnimi!=null &&
              this.eesnimi.equals(other.getEesnimi()))) &&
            ((this.perenimi==null && other.getPerenimi()==null) || 
             (this.perenimi!=null &&
              this.perenimi.equals(other.getPerenimi()))) &&
            ((this.liikmelisus==null && other.getLiikmelisus()==null) || 
             (this.liikmelisus!=null &&
              java.util.Arrays.equals(this.liikmelisus, other.getLiikmelisus())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getEesnimi() != null) {
            _hashCode += getEesnimi().hashCode();
        }
        if (getPerenimi() != null) {
            _hashCode += getPerenimi().hashCode();
        }
        if (getLiikmelisus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiikmelisus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiikmelisus(), i);
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
