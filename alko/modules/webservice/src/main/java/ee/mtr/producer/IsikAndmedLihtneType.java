/**
 * IsikAndmedLihtneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class IsikAndmedLihtneType  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String perekonnanimi;

    private java.lang.String isikukood;

    public IsikAndmedLihtneType() {
    }

    public IsikAndmedLihtneType(
           java.lang.String nimi,
           java.lang.String perekonnanimi,
           java.lang.String isikukood) {
           this.nimi = nimi;
           this.perekonnanimi = perekonnanimi;
           this.isikukood = isikukood;
    }


    /**
     * Gets the nimi value for this IsikAndmedLihtneType.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this IsikAndmedLihtneType.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the perekonnanimi value for this IsikAndmedLihtneType.
     * 
     * @return perekonnanimi
     */
    public java.lang.String getPerekonnanimi() {
        return perekonnanimi;
    }


    /**
     * Sets the perekonnanimi value for this IsikAndmedLihtneType.
     * 
     * @param perekonnanimi
     */
    public void setPerekonnanimi(java.lang.String perekonnanimi) {
        this.perekonnanimi = perekonnanimi;
    }


    /**
     * Gets the isikukood value for this IsikAndmedLihtneType.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this IsikAndmedLihtneType.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsikAndmedLihtneType)) return false;
        IsikAndmedLihtneType other = (IsikAndmedLihtneType) obj;
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
            ((this.perekonnanimi==null && other.getPerekonnanimi()==null) || 
             (this.perekonnanimi!=null &&
              this.perekonnanimi.equals(other.getPerekonnanimi()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood())));
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
        if (getPerekonnanimi() != null) {
            _hashCode += getPerekonnanimi().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
