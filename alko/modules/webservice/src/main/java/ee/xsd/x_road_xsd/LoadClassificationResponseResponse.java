/**
 * LoadClassificationResponseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class LoadClassificationResponseResponse  implements java.io.Serializable {
    private java.lang.String[] classificationNames;

    private ee.x_road.xsd.x_road_xsd.LoadClassificationResponseResponseClassifications classifications;

    private java.lang.String faultCode;

    private java.lang.String faultString;

    public LoadClassificationResponseResponse() {
    }

    public LoadClassificationResponseResponse(
           java.lang.String[] classificationNames,
           ee.x_road.xsd.x_road_xsd.LoadClassificationResponseResponseClassifications classifications,
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.classificationNames = classificationNames;
           this.classifications = classifications;
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the classificationNames value for this LoadClassificationResponseResponse.
     * 
     * @return classificationNames
     */
    public java.lang.String[] getClassificationNames() {
        return classificationNames;
    }


    /**
     * Sets the classificationNames value for this LoadClassificationResponseResponse.
     * 
     * @param classificationNames
     */
    public void setClassificationNames(java.lang.String[] classificationNames) {
        this.classificationNames = classificationNames;
    }


    /**
     * Gets the classifications value for this LoadClassificationResponseResponse.
     * 
     * @return classifications
     */
    public ee.x_road.xsd.x_road_xsd.LoadClassificationResponseResponseClassifications getClassifications() {
        return classifications;
    }


    /**
     * Sets the classifications value for this LoadClassificationResponseResponse.
     * 
     * @param classifications
     */
    public void setClassifications(ee.x_road.xsd.x_road_xsd.LoadClassificationResponseResponseClassifications classifications) {
        this.classifications = classifications;
    }


    /**
     * Gets the faultCode value for this LoadClassificationResponseResponse.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this LoadClassificationResponseResponse.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this LoadClassificationResponseResponse.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this LoadClassificationResponseResponse.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificationResponseResponse)) return false;
        LoadClassificationResponseResponse other = (LoadClassificationResponseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classificationNames==null && other.getClassificationNames()==null) || 
             (this.classificationNames!=null &&
              java.util.Arrays.equals(this.classificationNames, other.getClassificationNames()))) &&
            ((this.classifications==null && other.getClassifications()==null) || 
             (this.classifications!=null &&
              this.classifications.equals(other.getClassifications()))) &&
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
        if (getClassificationNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassificationNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassificationNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassifications() != null) {
            _hashCode += getClassifications().hashCode();
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
