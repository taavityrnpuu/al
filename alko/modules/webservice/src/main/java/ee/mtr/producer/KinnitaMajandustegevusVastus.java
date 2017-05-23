/**
 * KinnitaMajandustegevusVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class KinnitaMajandustegevusVastus  implements java.io.Serializable {
    private java.lang.Boolean ok;

    private java.lang.String[] tundmatuID;

    private java.lang.String faultCode;

    private java.lang.String faultString;

    public KinnitaMajandustegevusVastus() {
    }

    public KinnitaMajandustegevusVastus(
           java.lang.Boolean ok,
           java.lang.String[] tundmatuID,
           java.lang.String faultCode,
           java.lang.String faultString) {
           this.ok = ok;
           this.tundmatuID = tundmatuID;
           this.faultCode = faultCode;
           this.faultString = faultString;
    }


    /**
     * Gets the ok value for this KinnitaMajandustegevusVastus.
     * 
     * @return ok
     */
    public java.lang.Boolean getOk() {
        return ok;
    }


    /**
     * Sets the ok value for this KinnitaMajandustegevusVastus.
     * 
     * @param ok
     */
    public void setOk(java.lang.Boolean ok) {
        this.ok = ok;
    }


    /**
     * Gets the tundmatuID value for this KinnitaMajandustegevusVastus.
     * 
     * @return tundmatuID
     */
    public java.lang.String[] getTundmatuID() {
        return tundmatuID;
    }


    /**
     * Sets the tundmatuID value for this KinnitaMajandustegevusVastus.
     * 
     * @param tundmatuID
     */
    public void setTundmatuID(java.lang.String[] tundmatuID) {
        this.tundmatuID = tundmatuID;
    }

    public java.lang.String getTundmatuID(int i) {
        return this.tundmatuID[i];
    }

    public void setTundmatuID(int i, java.lang.String _value) {
        this.tundmatuID[i] = _value;
    }


    /**
     * Gets the faultCode value for this KinnitaMajandustegevusVastus.
     * 
     * @return faultCode
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this KinnitaMajandustegevusVastus.
     * 
     * @param faultCode
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the faultString value for this KinnitaMajandustegevusVastus.
     * 
     * @return faultString
     */
    public java.lang.String getFaultString() {
        return faultString;
    }


    /**
     * Sets the faultString value for this KinnitaMajandustegevusVastus.
     * 
     * @param faultString
     */
    public void setFaultString(java.lang.String faultString) {
        this.faultString = faultString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KinnitaMajandustegevusVastus)) return false;
        KinnitaMajandustegevusVastus other = (KinnitaMajandustegevusVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ok==null && other.getOk()==null) || 
             (this.ok!=null &&
              this.ok.equals(other.getOk()))) &&
            ((this.tundmatuID==null && other.getTundmatuID()==null) || 
             (this.tundmatuID!=null &&
              java.util.Arrays.equals(this.tundmatuID, other.getTundmatuID()))) &&
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
        if (getOk() != null) {
            _hashCode += getOk().hashCode();
        }
        if (getTundmatuID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTundmatuID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTundmatuID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
