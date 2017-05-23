/**
 * Ettevotja_muudatused_tasuline_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatused_tasuline_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    /* Näitab, millise kuupäeva kohta ettevõtja muudatusi päritakse. */
    private java.util.Date kuupaev;

    public Ettevotja_muudatused_tasuline_paring() {
    }

    public Ettevotja_muudatused_tasuline_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           java.util.Date kuupaev) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.kuupaev = kuupaev;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Ettevotja_muudatused_tasuline_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Ettevotja_muudatused_tasuline_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Ettevotja_muudatused_tasuline_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Ettevotja_muudatused_tasuline_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the kuupaev value for this Ettevotja_muudatused_tasuline_paring.
     * 
     * @return kuupaev   * Näitab, millise kuupäeva kohta ettevõtja muudatusi päritakse.
     */
    public java.util.Date getKuupaev() {
        return kuupaev;
    }


    /**
     * Sets the kuupaev value for this Ettevotja_muudatused_tasuline_paring.
     * 
     * @param kuupaev   * Näitab, millise kuupäeva kohta ettevõtja muudatusi päritakse.
     */
    public void setKuupaev(java.util.Date kuupaev) {
        this.kuupaev = kuupaev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatused_tasuline_paring)) return false;
        Ettevotja_muudatused_tasuline_paring other = (Ettevotja_muudatused_tasuline_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregister_kasutajanimi==null && other.getAriregister_kasutajanimi()==null) || 
             (this.ariregister_kasutajanimi!=null &&
              this.ariregister_kasutajanimi.equals(other.getAriregister_kasutajanimi()))) &&
            ((this.ariregister_parool==null && other.getAriregister_parool()==null) || 
             (this.ariregister_parool!=null &&
              this.ariregister_parool.equals(other.getAriregister_parool()))) &&
            ((this.kuupaev==null && other.getKuupaev()==null) || 
             (this.kuupaev!=null &&
              this.kuupaev.equals(other.getKuupaev())));
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
        if (getAriregister_kasutajanimi() != null) {
            _hashCode += getAriregister_kasutajanimi().hashCode();
        }
        if (getAriregister_parool() != null) {
            _hashCode += getAriregister_parool().hashCode();
        }
        if (getKuupaev() != null) {
            _hashCode += getKuupaev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
