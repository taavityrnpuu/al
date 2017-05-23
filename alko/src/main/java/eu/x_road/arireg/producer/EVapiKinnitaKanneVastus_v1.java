/**
 * EVapiKinnitaKanneVastus_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiKinnitaKanneVastus_v1  implements java.io.Serializable {
    private java.lang.String teade;

    private java.lang.String menetlus_id;

    public EVapiKinnitaKanneVastus_v1() {
    }

    public EVapiKinnitaKanneVastus_v1(
           java.lang.String teade,
           java.lang.String menetlus_id) {
           this.teade = teade;
           this.menetlus_id = menetlus_id;
    }


    /**
     * Gets the teade value for this EVapiKinnitaKanneVastus_v1.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this EVapiKinnitaKanneVastus_v1.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the menetlus_id value for this EVapiKinnitaKanneVastus_v1.
     * 
     * @return menetlus_id
     */
    public java.lang.String getMenetlus_id() {
        return menetlus_id;
    }


    /**
     * Sets the menetlus_id value for this EVapiKinnitaKanneVastus_v1.
     * 
     * @param menetlus_id
     */
    public void setMenetlus_id(java.lang.String menetlus_id) {
        this.menetlus_id = menetlus_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiKinnitaKanneVastus_v1)) return false;
        EVapiKinnitaKanneVastus_v1 other = (EVapiKinnitaKanneVastus_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade()))) &&
            ((this.menetlus_id==null && other.getMenetlus_id()==null) || 
             (this.menetlus_id!=null &&
              this.menetlus_id.equals(other.getMenetlus_id())));
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
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        if (getMenetlus_id() != null) {
            _hashCode += getMenetlus_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
