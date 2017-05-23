/**
 * CheckTransportManagerGoodReputeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class CheckTransportManagerGoodReputeRequest  implements java.io.Serializable {
    private ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body request;

    public CheckTransportManagerGoodReputeRequest() {
    }

    public CheckTransportManagerGoodReputeRequest(
           ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body request) {
           this.request = request;
    }


    /**
     * Gets the request value for this CheckTransportManagerGoodReputeRequest.
     * 
     * @return request
     */
    public ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body getRequest() {
        return request;
    }


    /**
     * Sets the request value for this CheckTransportManagerGoodReputeRequest.
     * 
     * @param request
     */
    public void setRequest(ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body request) {
        this.request = request;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckTransportManagerGoodReputeRequest)) return false;
        CheckTransportManagerGoodReputeRequest other = (CheckTransportManagerGoodReputeRequest) obj;
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
              this.request.equals(other.getRequest())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
