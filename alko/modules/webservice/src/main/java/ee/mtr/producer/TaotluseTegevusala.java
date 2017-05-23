/**
 * TaotluseTegevusala.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseTegevusala  implements java.io.Serializable {
    private java.math.BigInteger vormiVersioonID;

    private java.lang.String nimi;

    private java.lang.String link;

    public TaotluseTegevusala() {
    }

    public TaotluseTegevusala(
           java.math.BigInteger vormiVersioonID,
           java.lang.String nimi,
           java.lang.String link) {
           this.vormiVersioonID = vormiVersioonID;
           this.nimi = nimi;
           this.link = link;
    }


    /**
     * Gets the vormiVersioonID value for this TaotluseTegevusala.
     * 
     * @return vormiVersioonID
     */
    public java.math.BigInteger getVormiVersioonID() {
        return vormiVersioonID;
    }


    /**
     * Sets the vormiVersioonID value for this TaotluseTegevusala.
     * 
     * @param vormiVersioonID
     */
    public void setVormiVersioonID(java.math.BigInteger vormiVersioonID) {
        this.vormiVersioonID = vormiVersioonID;
    }


    /**
     * Gets the nimi value for this TaotluseTegevusala.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseTegevusala.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the link value for this TaotluseTegevusala.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this TaotluseTegevusala.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseTegevusala)) return false;
        TaotluseTegevusala other = (TaotluseTegevusala) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vormiVersioonID==null && other.getVormiVersioonID()==null) || 
             (this.vormiVersioonID!=null &&
              this.vormiVersioonID.equals(other.getVormiVersioonID()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink())));
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
        if (getVormiVersioonID() != null) {
            _hashCode += getVormiVersioonID().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
