/**
 * NapTasumiseLisamineResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class NapTasumiseLisamineResponse  implements java.io.Serializable {
    private java.lang.String message;

    private int code;

    public NapTasumiseLisamineResponse() {
    }

    public NapTasumiseLisamineResponse(
           java.lang.String message,
           int code) {
           this.message = message;
           this.code = code;
    }


    /**
     * Gets the message value for this NapTasumiseLisamineResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this NapTasumiseLisamineResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the code value for this NapTasumiseLisamineResponse.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this NapTasumiseLisamineResponse.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NapTasumiseLisamineResponse)) return false;
        NapTasumiseLisamineResponse other = (NapTasumiseLisamineResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            this.code == other.getCode();
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        _hashCode += getCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
