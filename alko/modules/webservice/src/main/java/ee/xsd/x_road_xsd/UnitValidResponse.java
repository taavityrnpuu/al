/**
 * UnitValidResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.xsd.x_road_xsd;

public class UnitValidResponse  implements java.io.Serializable {
    private ee.x_road.xsd.x_road_xsd.UnitValidResponseRequest request;

    private ee.x_road.xsd.x_road_xsd.UnitValidResponseResponse response;

    public UnitValidResponse() {
    }

    public UnitValidResponse(
           ee.x_road.xsd.x_road_xsd.UnitValidResponseRequest request,
           ee.x_road.xsd.x_road_xsd.UnitValidResponseResponse response) {
           this.request = request;
           this.response = response;
    }


    /**
     * Gets the request value for this UnitValidResponse.
     * 
     * @return request
     */
    public ee.x_road.xsd.x_road_xsd.UnitValidResponseRequest getRequest() {
        return request;
    }


    /**
     * Sets the request value for this UnitValidResponse.
     * 
     * @param request
     */
    public void setRequest(ee.x_road.xsd.x_road_xsd.UnitValidResponseRequest request) {
        this.request = request;
    }


    /**
     * Gets the response value for this UnitValidResponse.
     * 
     * @return response
     */
    public ee.x_road.xsd.x_road_xsd.UnitValidResponseResponse getResponse() {
        return response;
    }


    /**
     * Sets the response value for this UnitValidResponse.
     * 
     * @param response
     */
    public void setResponse(ee.x_road.xsd.x_road_xsd.UnitValidResponseResponse response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitValidResponse)) return false;
        UnitValidResponse other = (UnitValidResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
