/**
 * Xbrlpdfesita_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Xbrlpdfesita_paring  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Xbrlpdfesita_yldandmed yldandmed;

    private eu.x_road.arireg.producer.Xbrlpdfesita_myygitulu_rida[] myygitulu;

    private eu.x_road.arireg.producer.Xbrlpdfesita_laiend_audiitor[] laiend_audiitorid;

    private eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] bilansi_sisud;

    public Xbrlpdfesita_paring() {
    }

    public Xbrlpdfesita_paring(
           eu.x_road.arireg.producer.Xbrlpdfesita_yldandmed yldandmed,
           eu.x_road.arireg.producer.Xbrlpdfesita_myygitulu_rida[] myygitulu,
           eu.x_road.arireg.producer.Xbrlpdfesita_laiend_audiitor[] laiend_audiitorid,
           eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] bilansi_sisud) {
           this.yldandmed = yldandmed;
           this.myygitulu = myygitulu;
           this.laiend_audiitorid = laiend_audiitorid;
           this.bilansi_sisud = bilansi_sisud;
    }


    /**
     * Gets the yldandmed value for this Xbrlpdfesita_paring.
     * 
     * @return yldandmed
     */
    public eu.x_road.arireg.producer.Xbrlpdfesita_yldandmed getYldandmed() {
        return yldandmed;
    }


    /**
     * Sets the yldandmed value for this Xbrlpdfesita_paring.
     * 
     * @param yldandmed
     */
    public void setYldandmed(eu.x_road.arireg.producer.Xbrlpdfesita_yldandmed yldandmed) {
        this.yldandmed = yldandmed;
    }


    /**
     * Gets the myygitulu value for this Xbrlpdfesita_paring.
     * 
     * @return myygitulu
     */
    public eu.x_road.arireg.producer.Xbrlpdfesita_myygitulu_rida[] getMyygitulu() {
        return myygitulu;
    }


    /**
     * Sets the myygitulu value for this Xbrlpdfesita_paring.
     * 
     * @param myygitulu
     */
    public void setMyygitulu(eu.x_road.arireg.producer.Xbrlpdfesita_myygitulu_rida[] myygitulu) {
        this.myygitulu = myygitulu;
    }


    /**
     * Gets the laiend_audiitorid value for this Xbrlpdfesita_paring.
     * 
     * @return laiend_audiitorid
     */
    public eu.x_road.arireg.producer.Xbrlpdfesita_laiend_audiitor[] getLaiend_audiitorid() {
        return laiend_audiitorid;
    }


    /**
     * Sets the laiend_audiitorid value for this Xbrlpdfesita_paring.
     * 
     * @param laiend_audiitorid
     */
    public void setLaiend_audiitorid(eu.x_road.arireg.producer.Xbrlpdfesita_laiend_audiitor[] laiend_audiitorid) {
        this.laiend_audiitorid = laiend_audiitorid;
    }


    /**
     * Gets the bilansi_sisud value for this Xbrlpdfesita_paring.
     * 
     * @return bilansi_sisud
     */
    public eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] getBilansi_sisud() {
        return bilansi_sisud;
    }


    /**
     * Sets the bilansi_sisud value for this Xbrlpdfesita_paring.
     * 
     * @param bilansi_sisud
     */
    public void setBilansi_sisud(eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[] bilansi_sisud) {
        this.bilansi_sisud = bilansi_sisud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xbrlpdfesita_paring)) return false;
        Xbrlpdfesita_paring other = (Xbrlpdfesita_paring) obj;
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
            ((this.myygitulu==null && other.getMyygitulu()==null) || 
             (this.myygitulu!=null &&
              java.util.Arrays.equals(this.myygitulu, other.getMyygitulu()))) &&
            ((this.laiend_audiitorid==null && other.getLaiend_audiitorid()==null) || 
             (this.laiend_audiitorid!=null &&
              java.util.Arrays.equals(this.laiend_audiitorid, other.getLaiend_audiitorid()))) &&
            ((this.bilansi_sisud==null && other.getBilansi_sisud()==null) || 
             (this.bilansi_sisud!=null &&
              java.util.Arrays.equals(this.bilansi_sisud, other.getBilansi_sisud())));
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
        if (getBilansi_sisud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBilansi_sisud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBilansi_sisud(), i);
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
