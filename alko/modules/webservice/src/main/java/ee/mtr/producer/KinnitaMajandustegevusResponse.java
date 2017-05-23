/**
 * KinnitaMajandustegevusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class KinnitaMajandustegevusResponse  implements java.io.Serializable {
    private ee.x_road.mtr.producer.KinnitaMajandustegevusParing request;

    private ee.x_road.mtr.producer.KinnitaMajandustegevusVastus response;

    public KinnitaMajandustegevusResponse() {
    }

    public KinnitaMajandustegevusResponse(
           ee.x_road.mtr.producer.KinnitaMajandustegevusParing request,
           ee.x_road.mtr.producer.KinnitaMajandustegevusVastus response) {
           this.request = request;
           this.response = response;
    }


    /**
     * Gets the request value for this KinnitaMajandustegevusResponse.
     * 
     * @return request
     */
    public ee.x_road.mtr.producer.KinnitaMajandustegevusParing getRequest() {
        return request;
    }


    /**
     * Sets the request value for this KinnitaMajandustegevusResponse.
     * 
     * @param request
     */
    public void setRequest(ee.x_road.mtr.producer.KinnitaMajandustegevusParing request) {
        this.request = request;
    }


    /**
     * Gets the response value for this KinnitaMajandustegevusResponse.
     * 
     * @return response
     */
    public ee.x_road.mtr.producer.KinnitaMajandustegevusVastus getResponse() {
        return response;
    }


    /**
     * Sets the response value for this KinnitaMajandustegevusResponse.
     * 
     * @param response
     */
    public void setResponse(ee.x_road.mtr.producer.KinnitaMajandustegevusVastus response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KinnitaMajandustegevusResponse)) return false;
        KinnitaMajandustegevusResponse other = (KinnitaMajandustegevusResponse) obj;
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
