/**
 * LoadClassificatorResponseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseResponse  implements java.io.Serializable {
    private java.lang.String[] classificatorNames;

    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificators classificators;

    private java.lang.String faultCode;

    private java.lang.String faultString;

    public LoadClassificatorResponseResponse() {
    }

    public LoadClassificatorResponseResponse(
           java.lang.String[] classificatorNames,
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificators classificators,
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.classificatorNames = classificatorNames;
           this.classificators = classificators;
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the classificatorNames value for this LoadClassificatorResponseResponse.
     * 
     * @return classificatorNames
     */
    public java.lang.String[] getClassificatorNames() {
        return classificatorNames;
    }


    /**
     * Sets the classificatorNames value for this LoadClassificatorResponseResponse.
     * 
     * @param classificatorNames
     */
    public void setClassificatorNames(java.lang.String[] classificatorNames) {
        this.classificatorNames = classificatorNames;
    }


    /**
     * Gets the classificators value for this LoadClassificatorResponseResponse.
     * 
     * @return classificators
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificators getClassificators() {
        return classificators;
    }


    /**
     * Sets the classificators value for this LoadClassificatorResponseResponse.
     * 
     * @param classificators
     */
    public void setClassificators(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificators classificators) {
        this.classificators = classificators;
    }


    /**
     * Gets the faultCode value for this LoadClassificatorResponseResponse.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this LoadClassificatorResponseResponse.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this LoadClassificatorResponseResponse.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this LoadClassificatorResponseResponse.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseResponse)) return false;
        LoadClassificatorResponseResponse other = (LoadClassificatorResponseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classificatorNames==null && other.getClassificatorNames()==null) || 
             (this.classificatorNames!=null &&
              java.util.Arrays.equals(this.classificatorNames, other.getClassificatorNames()))) &&
            ((this.classificators==null && other.getClassificators()==null) || 
             (this.classificators!=null &&
              this.classificators.equals(other.getClassificators()))) &&
            ((this.faultCode==null && other.getFaultCode()==null) || 
             (this.faultCode!=null &&
              this.faultCode.equals(other.getFaultCode()))) &&
            ((this.faultString==null && other.getFaultString()==null) || 
             (this.faultString!=null &&
              this.faultString.equals(other.getFaultString())));
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
        if (getClassificatorNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassificatorNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassificatorNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassificators() != null) {
            _hashCode += getClassificators().hashCode();
        }
        if (getFaultCode() != null) {
            _hashCode += getFaultCode().hashCode();
        }
        if (getFaultString() != null) {
            _hashCode += getFaultString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
