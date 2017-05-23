/**
 * SalvestaTaotlusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SalvestaTaotlusResponse  implements java.io.Serializable {
    private ee.x_road.mtr.producer.SalvestaTaotlusParing request;

    private ee.x_road.mtr.producer.SalvestaTaotlusVastus response;

    public SalvestaTaotlusResponse() {
    }

    public SalvestaTaotlusResponse(
           ee.x_road.mtr.producer.SalvestaTaotlusParing request,
           ee.x_road.mtr.producer.SalvestaTaotlusVastus response) {
           this.request = request;
           this.response = response;
    }


    /**
     * Gets the request value for this SalvestaTaotlusResponse.
     * 
     * @return request
     */
    public ee.x_road.mtr.producer.SalvestaTaotlusParing getRequest() {
        return request;
    }


    /**
     * Sets the request value for this SalvestaTaotlusResponse.
     * 
     * @param request
     */
    public void setRequest(ee.x_road.mtr.producer.SalvestaTaotlusParing request) {
        this.request = request;
    }


    /**
     * Gets the response value for this SalvestaTaotlusResponse.
     * 
     * @return response
     */
    public ee.x_road.mtr.producer.SalvestaTaotlusVastus getResponse() {
        return response;
    }


    /**
     * Sets the response value for this SalvestaTaotlusResponse.
     * 
     * @param response
     */
    public void setResponse(ee.x_road.mtr.producer.SalvestaTaotlusVastus response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvestaTaotlusResponse)) return false;
        SalvestaTaotlusResponse other = (SalvestaTaotlusResponse) obj;
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
