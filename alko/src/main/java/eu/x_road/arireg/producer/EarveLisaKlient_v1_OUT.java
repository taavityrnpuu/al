/**
 * EarveLisaKlient_v1_OUT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EarveLisaKlient_v1_OUT  implements java.io.Serializable {
    private eu.x_road.arireg.producer.EarveLisaKlient_v1Response_Klient[] kliendid;

    public EarveLisaKlient_v1_OUT() {
    }

    public EarveLisaKlient_v1_OUT(
           eu.x_road.arireg.producer.EarveLisaKlient_v1Response_Klient[] kliendid) {
           this.kliendid = kliendid;
    }


    /**
     * Gets the kliendid value for this EarveLisaKlient_v1_OUT.
     * 
     * @return kliendid
     */
    public eu.x_road.arireg.producer.EarveLisaKlient_v1Response_Klient[] getKliendid() {
        return kliendid;
    }


    /**
     * Sets the kliendid value for this EarveLisaKlient_v1_OUT.
     * 
     * @param kliendid
     */
    public void setKliendid(eu.x_road.arireg.producer.EarveLisaKlient_v1Response_Klient[] kliendid) {
        this.kliendid = kliendid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EarveLisaKlient_v1_OUT)) return false;
        EarveLisaKlient_v1_OUT other = (EarveLisaKlient_v1_OUT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kliendid==null && other.getKliendid()==null) || 
             (this.kliendid!=null &&
              java.util.Arrays.equals(this.kliendid, other.getKliendid())));
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
        if (getKliendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKliendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKliendid(), i);
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
