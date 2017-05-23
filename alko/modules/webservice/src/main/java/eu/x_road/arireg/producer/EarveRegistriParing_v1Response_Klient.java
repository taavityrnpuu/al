/**
 * EarveRegistriParing_v1Response_Klient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EarveRegistriParing_v1Response_Klient  implements java.io.Serializable {
    private java.math.BigInteger registrikood;

    private java.lang.String nimi;

    private java.lang.String teenusepakkuja;

    private eu.x_road.arireg.producer.Enum_earveRegistriParing_v1Response_Klient_Staatus staatus;

    public EarveRegistriParing_v1Response_Klient() {
    }

    public EarveRegistriParing_v1Response_Klient(
           java.math.BigInteger registrikood,
           java.lang.String nimi,
           java.lang.String teenusepakkuja,
           eu.x_road.arireg.producer.Enum_earveRegistriParing_v1Response_Klient_Staatus staatus) {
           this.registrikood = registrikood;
           this.nimi = nimi;
           this.teenusepakkuja = teenusepakkuja;
           this.staatus = staatus;
    }


    /**
     * Gets the registrikood value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @return registrikood
     */
    public java.math.BigInteger getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @param registrikood
     */
    public void setRegistrikood(java.math.BigInteger registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the nimi value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the teenusepakkuja value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @return teenusepakkuja
     */
    public java.lang.String getTeenusepakkuja() {
        return teenusepakkuja;
    }


    /**
     * Sets the teenusepakkuja value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @param teenusepakkuja
     */
    public void setTeenusepakkuja(java.lang.String teenusepakkuja) {
        this.teenusepakkuja = teenusepakkuja;
    }


    /**
     * Gets the staatus value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @return staatus
     */
    public eu.x_road.arireg.producer.Enum_earveRegistriParing_v1Response_Klient_Staatus getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this EarveRegistriParing_v1Response_Klient.
     * 
     * @param staatus
     */
    public void setStaatus(eu.x_road.arireg.producer.Enum_earveRegistriParing_v1Response_Klient_Staatus staatus) {
        this.staatus = staatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EarveRegistriParing_v1Response_Klient)) return false;
        EarveRegistriParing_v1Response_Klient other = (EarveRegistriParing_v1Response_Klient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrikood==null && other.getRegistrikood()==null) || 
             (this.registrikood!=null &&
              this.registrikood.equals(other.getRegistrikood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.teenusepakkuja==null && other.getTeenusepakkuja()==null) || 
             (this.teenusepakkuja!=null &&
              this.teenusepakkuja.equals(other.getTeenusepakkuja()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus())));
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
        if (getRegistrikood() != null) {
            _hashCode += getRegistrikood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getTeenusepakkuja() != null) {
            _hashCode += getTeenusepakkuja().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
