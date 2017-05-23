/**
 * CheckTransportManagerGoodReputeResponse_Body.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class CheckTransportManagerGoodReputeResponse_Body  implements java.io.Serializable {
    private ee.x_road.mtr.producer.Company[] companies;

    public CheckTransportManagerGoodReputeResponse_Body() {
    }

    public CheckTransportManagerGoodReputeResponse_Body(
           ee.x_road.mtr.producer.Company[] companies) {
           this.companies = companies;
    }


    /**
     * Gets the companies value for this CheckTransportManagerGoodReputeResponse_Body.
     * 
     * @return companies
     */
    public ee.x_road.mtr.producer.Company[] getCompanies() {
        return companies;
    }


    /**
     * Sets the companies value for this CheckTransportManagerGoodReputeResponse_Body.
     * 
     * @param companies
     */
    public void setCompanies(ee.x_road.mtr.producer.Company[] companies) {
        this.companies = companies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckTransportManagerGoodReputeResponse_Body)) return false;
        CheckTransportManagerGoodReputeResponse_Body other = (CheckTransportManagerGoodReputeResponse_Body) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companies==null && other.getCompanies()==null) || 
             (this.companies!=null &&
              java.util.Arrays.equals(this.companies, other.getCompanies())));
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
        if (getCompanies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanies(), i);
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
