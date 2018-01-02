/**
 * Xbrlesindusv2_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlesindusv2_paring  implements java.io.Serializable {
    private java.lang.String fyysilise_isiku_kood;

    private java.lang.String fyysilise_isiku_riik;

    private java.math.BigInteger[] registrikoodid;

    /* ESINDAJA - seadusjärgsed esindajad, ARUANNE - aruande esitajad,
     * SIDEVAHEND - sidevahendite esitajad, ERAKOND - erakonnanimekirja esitajad */
    private java.lang.String esindusliik;

    public Xbrlesindusv2_paring() {
    }

    public Xbrlesindusv2_paring(
           java.lang.String fyysilise_isiku_kood,
           java.lang.String fyysilise_isiku_riik,
           java.math.BigInteger[] registrikoodid,
           java.lang.String esindusliik) {
           this.fyysilise_isiku_kood = fyysilise_isiku_kood;
           this.fyysilise_isiku_riik = fyysilise_isiku_riik;
           this.registrikoodid = registrikoodid;
           this.esindusliik = esindusliik;
    }


    /**
     * Gets the fyysilise_isiku_kood value for this Xbrlesindusv2_paring.
     * 
     * @return fyysilise_isiku_kood
     */
    public java.lang.String getFyysilise_isiku_kood() {
        return fyysilise_isiku_kood;
    }


    /**
     * Sets the fyysilise_isiku_kood value for this Xbrlesindusv2_paring.
     * 
     * @param fyysilise_isiku_kood
     */
    public void setFyysilise_isiku_kood(java.lang.String fyysilise_isiku_kood) {
        this.fyysilise_isiku_kood = fyysilise_isiku_kood;
    }


    /**
     * Gets the fyysilise_isiku_riik value for this Xbrlesindusv2_paring.
     * 
     * @return fyysilise_isiku_riik
     */
    public java.lang.String getFyysilise_isiku_riik() {
        return fyysilise_isiku_riik;
    }


    /**
     * Sets the fyysilise_isiku_riik value for this Xbrlesindusv2_paring.
     * 
     * @param fyysilise_isiku_riik
     */
    public void setFyysilise_isiku_riik(java.lang.String fyysilise_isiku_riik) {
        this.fyysilise_isiku_riik = fyysilise_isiku_riik;
    }


    /**
     * Gets the registrikoodid value for this Xbrlesindusv2_paring.
     * 
     * @return registrikoodid
     */
    public java.math.BigInteger[] getRegistrikoodid() {
        return registrikoodid;
    }


    /**
     * Sets the registrikoodid value for this Xbrlesindusv2_paring.
     * 
     * @param registrikoodid
     */
    public void setRegistrikoodid(java.math.BigInteger[] registrikoodid) {
        this.registrikoodid = registrikoodid;
    }


    /**
     * Gets the esindusliik value for this Xbrlesindusv2_paring.
     * 
     * @return esindusliik   * ESINDAJA - seadusjärgsed esindajad, ARUANNE - aruande esitajad,
     * SIDEVAHEND - sidevahendite esitajad, ERAKOND - erakonnanimekirja esitajad
     */
    public java.lang.String getEsindusliik() {
        return esindusliik;
    }


    /**
     * Sets the esindusliik value for this Xbrlesindusv2_paring.
     * 
     * @param esindusliik   * ESINDAJA - seadusjärgsed esindajad, ARUANNE - aruande esitajad,
     * SIDEVAHEND - sidevahendite esitajad, ERAKOND - erakonnanimekirja esitajad
     */
    public void setEsindusliik(java.lang.String esindusliik) {
        this.esindusliik = esindusliik;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlesindusv2_paring)) return false;
        Xbrlesindusv2_paring other = (Xbrlesindusv2_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fyysilise_isiku_kood==null && other.getFyysilise_isiku_kood()==null) || 
             (this.fyysilise_isiku_kood!=null &&
              this.fyysilise_isiku_kood.equals(other.getFyysilise_isiku_kood()))) &&
            ((this.fyysilise_isiku_riik==null && other.getFyysilise_isiku_riik()==null) || 
             (this.fyysilise_isiku_riik!=null &&
              this.fyysilise_isiku_riik.equals(other.getFyysilise_isiku_riik()))) &&
            ((this.registrikoodid==null && other.getRegistrikoodid()==null) || 
             (this.registrikoodid!=null &&
              java.util.Arrays.equals(this.registrikoodid, other.getRegistrikoodid()))) &&
            ((this.esindusliik==null && other.getEsindusliik()==null) || 
             (this.esindusliik!=null &&
              this.esindusliik.equals(other.getEsindusliik())));
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
        if (getFyysilise_isiku_kood() != null) {
            _hashCode += getFyysilise_isiku_kood().hashCode();
        }
        if (getFyysilise_isiku_riik() != null) {
            _hashCode += getFyysilise_isiku_riik().hashCode();
        }
        if (getRegistrikoodid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikoodid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikoodid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEsindusliik() != null) {
            _hashCode += getEsindusliik().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
