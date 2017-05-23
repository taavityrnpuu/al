/**
 * Xbrlesita_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesita_paring  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Xbrlesita_yldandmed yldandmed;

    private eu.x_road.arireg.producer.Xbrlesita_sidevahend[] sidevahendid;

    private eu.x_road.arireg.producer.Xbrlesita_osanik[] osanikud;

    private eu.x_road.arireg.producer.Xbrlesita_myygitulu_rida[] myygitulu;

    private org.apache.axis.types.URI[] manused;

    private eu.x_road.arireg.producer.Xbrlesita_audiitor[] audiitorid;

    private eu.x_road.arireg.producer.Xbrlesita_laiend_audiitor[] laiend_audiitorid;

    private java.lang.String xbrlinfo;

    public Xbrlesita_paring() {
    }

    public Xbrlesita_paring(
           eu.x_road.arireg.producer.Xbrlesita_yldandmed yldandmed,
           eu.x_road.arireg.producer.Xbrlesita_sidevahend[] sidevahendid,
           eu.x_road.arireg.producer.Xbrlesita_osanik[] osanikud,
           eu.x_road.arireg.producer.Xbrlesita_myygitulu_rida[] myygitulu,
           org.apache.axis.types.URI[] manused,
           eu.x_road.arireg.producer.Xbrlesita_audiitor[] audiitorid,
           eu.x_road.arireg.producer.Xbrlesita_laiend_audiitor[] laiend_audiitorid,
           java.lang.String xbrlinfo) {
           this.yldandmed = yldandmed;
           this.sidevahendid = sidevahendid;
           this.osanikud = osanikud;
           this.myygitulu = myygitulu;
           this.manused = manused;
           this.audiitorid = audiitorid;
           this.laiend_audiitorid = laiend_audiitorid;
           this.xbrlinfo = xbrlinfo;
    }


    /**
     * Gets the yldandmed value for this Xbrlesita_paring.
     * 
     * @return yldandmed
     */
    public eu.x_road.arireg.producer.Xbrlesita_yldandmed getYldandmed() {
        return yldandmed;
    }


    /**
     * Sets the yldandmed value for this Xbrlesita_paring.
     * 
     * @param yldandmed
     */
    public void setYldandmed(eu.x_road.arireg.producer.Xbrlesita_yldandmed yldandmed) {
        this.yldandmed = yldandmed;
    }


    /**
     * Gets the sidevahendid value for this Xbrlesita_paring.
     * 
     * @return sidevahendid
     */
    public eu.x_road.arireg.producer.Xbrlesita_sidevahend[] getSidevahendid() {
        return sidevahendid;
    }


    /**
     * Sets the sidevahendid value for this Xbrlesita_paring.
     * 
     * @param sidevahendid
     */
    public void setSidevahendid(eu.x_road.arireg.producer.Xbrlesita_sidevahend[] sidevahendid) {
        this.sidevahendid = sidevahendid;
    }


    /**
     * Gets the osanikud value for this Xbrlesita_paring.
     * 
     * @return osanikud
     */
    public eu.x_road.arireg.producer.Xbrlesita_osanik[] getOsanikud() {
        return osanikud;
    }


    /**
     * Sets the osanikud value for this Xbrlesita_paring.
     * 
     * @param osanikud
     */
    public void setOsanikud(eu.x_road.arireg.producer.Xbrlesita_osanik[] osanikud) {
        this.osanikud = osanikud;
    }


    /**
     * Gets the myygitulu value for this Xbrlesita_paring.
     * 
     * @return myygitulu
     */
    public eu.x_road.arireg.producer.Xbrlesita_myygitulu_rida[] getMyygitulu() {
        return myygitulu;
    }


    /**
     * Sets the myygitulu value for this Xbrlesita_paring.
     * 
     * @param myygitulu
     */
    public void setMyygitulu(eu.x_road.arireg.producer.Xbrlesita_myygitulu_rida[] myygitulu) {
        this.myygitulu = myygitulu;
    }


    /**
     * Gets the manused value for this Xbrlesita_paring.
     * 
     * @return manused
     */
    public org.apache.axis.types.URI[] getManused() {
        return manused;
    }


    /**
     * Sets the manused value for this Xbrlesita_paring.
     * 
     * @param manused
     */
    public void setManused(org.apache.axis.types.URI[] manused) {
        this.manused = manused;
    }


    /**
     * Gets the audiitorid value for this Xbrlesita_paring.
     * 
     * @return audiitorid
     */
    public eu.x_road.arireg.producer.Xbrlesita_audiitor[] getAudiitorid() {
        return audiitorid;
    }


    /**
     * Sets the audiitorid value for this Xbrlesita_paring.
     * 
     * @param audiitorid
     */
    public void setAudiitorid(eu.x_road.arireg.producer.Xbrlesita_audiitor[] audiitorid) {
        this.audiitorid = audiitorid;
    }


    /**
     * Gets the laiend_audiitorid value for this Xbrlesita_paring.
     * 
     * @return laiend_audiitorid
     */
    public eu.x_road.arireg.producer.Xbrlesita_laiend_audiitor[] getLaiend_audiitorid() {
        return laiend_audiitorid;
    }


    /**
     * Sets the laiend_audiitorid value for this Xbrlesita_paring.
     * 
     * @param laiend_audiitorid
     */
    public void setLaiend_audiitorid(eu.x_road.arireg.producer.Xbrlesita_laiend_audiitor[] laiend_audiitorid) {
        this.laiend_audiitorid = laiend_audiitorid;
    }


    /**
     * Gets the xbrlinfo value for this Xbrlesita_paring.
     * 
     * @return xbrlinfo
     */
    public java.lang.String getXbrlinfo() {
        return xbrlinfo;
    }


    /**
     * Sets the xbrlinfo value for this Xbrlesita_paring.
     * 
     * @param xbrlinfo
     */
    public void setXbrlinfo(java.lang.String xbrlinfo) {
        this.xbrlinfo = xbrlinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesita_paring)) return false;
        Xbrlesita_paring other = (Xbrlesita_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yldandmed==null && other.getYldandmed()==null) || 
             (this.yldandmed!=null &&
              this.yldandmed.equals(other.getYldandmed()))) &&
            ((this.sidevahendid==null && other.getSidevahendid()==null) || 
             (this.sidevahendid!=null &&
              java.util.Arrays.equals(this.sidevahendid, other.getSidevahendid()))) &&
            ((this.osanikud==null && other.getOsanikud()==null) || 
             (this.osanikud!=null &&
              java.util.Arrays.equals(this.osanikud, other.getOsanikud()))) &&
            ((this.myygitulu==null && other.getMyygitulu()==null) || 
             (this.myygitulu!=null &&
              java.util.Arrays.equals(this.myygitulu, other.getMyygitulu()))) &&
            ((this.manused==null && other.getManused()==null) || 
             (this.manused!=null &&
              java.util.Arrays.equals(this.manused, other.getManused()))) &&
            ((this.audiitorid==null && other.getAudiitorid()==null) || 
             (this.audiitorid!=null &&
              java.util.Arrays.equals(this.audiitorid, other.getAudiitorid()))) &&
            ((this.laiend_audiitorid==null && other.getLaiend_audiitorid()==null) || 
             (this.laiend_audiitorid!=null &&
              java.util.Arrays.equals(this.laiend_audiitorid, other.getLaiend_audiitorid()))) &&
            ((this.xbrlinfo==null && other.getXbrlinfo()==null) || 
             (this.xbrlinfo!=null &&
              this.xbrlinfo.equals(other.getXbrlinfo())));
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
        if (getYldandmed() != null) {
            _hashCode += getYldandmed().hashCode();
        }
        if (getSidevahendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSidevahendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSidevahendid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOsanikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOsanikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOsanikud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMyygitulu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMyygitulu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMyygitulu(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAudiitorid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudiitorid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudiitorid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLaiend_audiitorid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLaiend_audiitorid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLaiend_audiitorid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXbrlinfo() != null) {
            _hashCode += getXbrlinfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
