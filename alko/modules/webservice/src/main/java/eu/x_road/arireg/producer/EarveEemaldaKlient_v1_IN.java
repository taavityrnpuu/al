/**
 * EarveEemaldaKlient_v1_IN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EarveEemaldaKlient_v1_IN  implements java.io.Serializable {
    private java.lang.String earve_kasutajanimi;

    private java.lang.String earve_parool;

    private eu.x_road.arireg.producer.EarveEemaldaKlient_v1_Klient[] kliendid;

    public EarveEemaldaKlient_v1_IN() {
    }

    public EarveEemaldaKlient_v1_IN(
           java.lang.String earve_kasutajanimi,
           java.lang.String earve_parool,
           eu.x_road.arireg.producer.EarveEemaldaKlient_v1_Klient[] kliendid) {
           this.earve_kasutajanimi = earve_kasutajanimi;
           this.earve_parool = earve_parool;
           this.kliendid = kliendid;
    }


    /**
     * Gets the earve_kasutajanimi value for this EarveEemaldaKlient_v1_IN.
     * 
     * @return earve_kasutajanimi
     */
    public java.lang.String getEarve_kasutajanimi() {
        return earve_kasutajanimi;
    }


    /**
     * Sets the earve_kasutajanimi value for this EarveEemaldaKlient_v1_IN.
     * 
     * @param earve_kasutajanimi
     */
    public void setEarve_kasutajanimi(java.lang.String earve_kasutajanimi) {
        this.earve_kasutajanimi = earve_kasutajanimi;
    }


    /**
     * Gets the earve_parool value for this EarveEemaldaKlient_v1_IN.
     * 
     * @return earve_parool
     */
    public java.lang.String getEarve_parool() {
        return earve_parool;
    }


    /**
     * Sets the earve_parool value for this EarveEemaldaKlient_v1_IN.
     * 
     * @param earve_parool
     */
    public void setEarve_parool(java.lang.String earve_parool) {
        this.earve_parool = earve_parool;
    }


    /**
     * Gets the kliendid value for this EarveEemaldaKlient_v1_IN.
     * 
     * @return kliendid
     */
    public eu.x_road.arireg.producer.EarveEemaldaKlient_v1_Klient[] getKliendid() {
        return kliendid;
    }


    /**
     * Sets the kliendid value for this EarveEemaldaKlient_v1_IN.
     * 
     * @param kliendid
     */
    public void setKliendid(eu.x_road.arireg.producer.EarveEemaldaKlient_v1_Klient[] kliendid) {
        this.kliendid = kliendid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EarveEemaldaKlient_v1_IN)) return false;
        EarveEemaldaKlient_v1_IN other = (EarveEemaldaKlient_v1_IN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.earve_kasutajanimi==null && other.getEarve_kasutajanimi()==null) || 
             (this.earve_kasutajanimi!=null &&
              this.earve_kasutajanimi.equals(other.getEarve_kasutajanimi()))) &&
            ((this.earve_parool==null && other.getEarve_parool()==null) || 
             (this.earve_parool!=null &&
              this.earve_parool.equals(other.getEarve_parool()))) &&
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
        if (getEarve_kasutajanimi() != null) {
            _hashCode += getEarve_kasutajanimi().hashCode();
        }
        if (getEarve_parool() != null) {
            _hashCode += getEarve_parool().hashCode();
        }
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
