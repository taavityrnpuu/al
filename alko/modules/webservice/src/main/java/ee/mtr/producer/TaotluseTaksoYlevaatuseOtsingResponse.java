/**
 * TaotluseTaksoYlevaatuseOtsingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseTaksoYlevaatuseOtsingResponse  implements java.io.Serializable {
    private ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing request;

    private ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] response;

    public TaotluseTaksoYlevaatuseOtsingResponse() {
    }

    public TaotluseTaksoYlevaatuseOtsingResponse(
           ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing request,
           ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] response) {
           this.request = request;
           this.response = response;
    }


    /**
     * Gets the request value for this TaotluseTaksoYlevaatuseOtsingResponse.
     * 
     * @return request
     */
    public ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing getRequest() {
        return request;
    }


    /**
     * Sets the request value for this TaotluseTaksoYlevaatuseOtsingResponse.
     * 
     * @param request
     */
    public void setRequest(ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing request) {
        this.request = request;
    }


    /**
     * Gets the response value for this TaotluseTaksoYlevaatuseOtsingResponse.
     * 
     * @return response
     */
    public ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this TaotluseTaksoYlevaatuseOtsingResponse.
     * 
     * @param response
     */
    public void setResponse(ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseTaksoYlevaatuseOtsingResponse)) return false;
        TaotluseTaksoYlevaatuseOtsingResponse other = (TaotluseTaksoYlevaatuseOtsingResponse) obj;
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
              java.util.Arrays.equals(this.response, other.getResponse())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
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
