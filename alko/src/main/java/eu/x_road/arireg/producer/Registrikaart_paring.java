/**
 * Registrikaart_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Registrikaart_paring  implements java.io.Serializable {
    private java.lang.String ariregister_kasutajanimi;

    private java.lang.String ariregister_parool;

    private int ariregistri_kood;

    /* R - registrikaart (vaikimisi), K – kommertspandikaart */
    private eu.x_road.arireg.producer.X_regkaardi_liik liik;

    /* K – kehtiv (vaikimisi), A – ajaloolised ja kehtivad */
    private eu.x_road.arireg.producer.X_regkaardi_kehtivus kehtivus;

    /* est (vaikimisi), eng */
    private java.lang.String keel;

    public Registrikaart_paring() {
    }

    public Registrikaart_paring(
           java.lang.String ariregister_kasutajanimi,
           java.lang.String ariregister_parool,
           int ariregistri_kood,
           eu.x_road.arireg.producer.X_regkaardi_liik liik,
           eu.x_road.arireg.producer.X_regkaardi_kehtivus kehtivus,
           java.lang.String keel) {
           this.ariregister_kasutajanimi = ariregister_kasutajanimi;
           this.ariregister_parool = ariregister_parool;
           this.ariregistri_kood = ariregistri_kood;
           this.liik = liik;
           this.kehtivus = kehtivus;
           this.keel = keel;
    }


    /**
     * Gets the ariregister_kasutajanimi value for this Registrikaart_paring.
     * 
     * @return ariregister_kasutajanimi
     */
    public java.lang.String getAriregister_kasutajanimi() {
        return ariregister_kasutajanimi;
    }


    /**
     * Sets the ariregister_kasutajanimi value for this Registrikaart_paring.
     * 
     * @param ariregister_kasutajanimi
     */
    public void setAriregister_kasutajanimi(java.lang.String ariregister_kasutajanimi) {
        this.ariregister_kasutajanimi = ariregister_kasutajanimi;
    }


    /**
     * Gets the ariregister_parool value for this Registrikaart_paring.
     * 
     * @return ariregister_parool
     */
    public java.lang.String getAriregister_parool() {
        return ariregister_parool;
    }


    /**
     * Sets the ariregister_parool value for this Registrikaart_paring.
     * 
     * @param ariregister_parool
     */
    public void setAriregister_parool(java.lang.String ariregister_parool) {
        this.ariregister_parool = ariregister_parool;
    }


    /**
     * Gets the ariregistri_kood value for this Registrikaart_paring.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Registrikaart_paring.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the liik value for this Registrikaart_paring.
     * 
     * @return liik   * R - registrikaart (vaikimisi), K – kommertspandikaart
     */
    public eu.x_road.arireg.producer.X_regkaardi_liik getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Registrikaart_paring.
     * 
     * @param liik   * R - registrikaart (vaikimisi), K – kommertspandikaart
     */
    public void setLiik(eu.x_road.arireg.producer.X_regkaardi_liik liik) {
        this.liik = liik;
    }


    /**
     * Gets the kehtivus value for this Registrikaart_paring.
     * 
     * @return kehtivus   * K – kehtiv (vaikimisi), A – ajaloolised ja kehtivad
     */
    public eu.x_road.arireg.producer.X_regkaardi_kehtivus getKehtivus() {
        return kehtivus;
    }


    /**
     * Sets the kehtivus value for this Registrikaart_paring.
     * 
     * @param kehtivus   * K – kehtiv (vaikimisi), A – ajaloolised ja kehtivad
     */
    public void setKehtivus(eu.x_road.arireg.producer.X_regkaardi_kehtivus kehtivus) {
        this.kehtivus = kehtivus;
    }


    /**
     * Gets the keel value for this Registrikaart_paring.
     * 
     * @return keel   * est (vaikimisi), eng
     */
    public java.lang.String getKeel() {
        return keel;
    }


    /**
     * Sets the keel value for this Registrikaart_paring.
     * 
     * @param keel   * est (vaikimisi), eng
     */
    public void setKeel(java.lang.String keel) {
        this.keel = keel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Registrikaart_paring)) return false;
        Registrikaart_paring other = (Registrikaart_paring) obj;
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
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.kehtivus==null && other.getKehtivus()==null) || 
             (this.kehtivus!=null &&
              this.kehtivus.equals(other.getKehtivus()))) &&
            ((this.keel==null && other.getKeel()==null) || 
             (this.keel!=null &&
              this.keel.equals(other.getKeel())));
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
        _hashCode += getAriregistri_kood();
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getKehtivus() != null) {
            _hashCode += getKehtivus().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
