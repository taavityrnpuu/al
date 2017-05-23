/**
 * SidevahendType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class SidevahendType_v4  implements java.io.Serializable {
    private java.lang.String tegevus;

    private java.lang.String liik;

    /* Numbrid koos suunakoodiga */
    private java.lang.String sisu;

    public SidevahendType_v4() {
    }

    public SidevahendType_v4(
           java.lang.String tegevus,
           java.lang.String liik,
           java.lang.String sisu) {
           this.tegevus = tegevus;
           this.liik = liik;
           this.sisu = sisu;
    }


    /**
     * Gets the tegevus value for this SidevahendType_v4.
     * 
     * @return tegevus
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this SidevahendType_v4.
     * 
     * @param tegevus
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }


    /**
     * Gets the liik value for this SidevahendType_v4.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this SidevahendType_v4.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the sisu value for this SidevahendType_v4.
     * 
     * @return sisu   * Numbrid koos suunakoodiga
     */
    public java.lang.String getSisu() {
        return sisu;
    }


    /**
     * Sets the sisu value for this SidevahendType_v4.
     * 
     * @param sisu   * Numbrid koos suunakoodiga
     */
    public void setSisu(java.lang.String sisu) {
        this.sisu = sisu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SidevahendType_v4)) return false;
        SidevahendType_v4 other = (SidevahendType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.sisu==null && other.getSisu()==null) || 
             (this.sisu!=null &&
              this.sisu.equals(other.getSisu())));
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
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getSisu() != null) {
            _hashCode += getSisu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
