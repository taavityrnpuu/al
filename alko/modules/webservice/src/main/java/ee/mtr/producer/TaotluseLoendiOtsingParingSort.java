/**
 * TaotluseLoendiOtsingParingSort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseLoendiOtsingParingSort  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String suund;

    public TaotluseLoendiOtsingParingSort() {
    }

    public TaotluseLoendiOtsingParingSort(
           java.lang.String nimi,
           java.lang.String suund) {
           this.nimi = nimi;
           this.suund = suund;
    }


    /**
     * Gets the nimi value for this TaotluseLoendiOtsingParingSort.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseLoendiOtsingParingSort.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the suund value for this TaotluseLoendiOtsingParingSort.
     * 
     * @return suund
     */
    public java.lang.String getSuund() {
        return suund;
    }


    /**
     * Sets the suund value for this TaotluseLoendiOtsingParingSort.
     * 
     * @param suund
     */
    public void setSuund(java.lang.String suund) {
        this.suund = suund;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseLoendiOtsingParingSort)) return false;
        TaotluseLoendiOtsingParingSort other = (TaotluseLoendiOtsingParingSort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.suund==null && other.getSuund()==null) || 
             (this.suund!=null &&
              this.suund.equals(other.getSuund())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getSuund() != null) {
            _hashCode += getSuund().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
