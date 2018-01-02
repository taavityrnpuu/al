/**
 * Sooritakanne_ettevotjad_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Sooritakanne_ettevotjad_v4  implements java.io.Serializable {
    /* Täidetakse ainult muutmiskande korral */
    private java.lang.String registrikood;

    /* Täidetakse ainult ettevõtjaportaali esmakande korral */
    private java.lang.Integer asutamise_number;

    private eu.x_road.arireg.producer.Sooritakanne_kandesisu_v4 kande_sisu;

    /* Siia pannakse digiallkirjastatud notariaalakt, põhikiri jt
     * lisadokumendid */
    private eu.x_road.arireg.producer.DokumentType_v4[] dokumendid;

    public Sooritakanne_ettevotjad_v4() {
    }

    public Sooritakanne_ettevotjad_v4(
           java.lang.String registrikood,
           java.lang.Integer asutamise_number,
           eu.x_road.arireg.producer.Sooritakanne_kandesisu_v4 kande_sisu,
           eu.x_road.arireg.producer.DokumentType_v4[] dokumendid) {
           this.registrikood = registrikood;
           this.asutamise_number = asutamise_number;
           this.kande_sisu = kande_sisu;
           this.dokumendid = dokumendid;
    }


    /**
     * Gets the registrikood value for this Sooritakanne_ettevotjad_v4.
     * 
     * @return registrikood   * Täidetakse ainult muutmiskande korral
     */
    public java.lang.String getRegistrikood() {
        return registrikood;
    }


    /**
     * Sets the registrikood value for this Sooritakanne_ettevotjad_v4.
     * 
     * @param registrikood   * Täidetakse ainult muutmiskande korral
     */
    public void setRegistrikood(java.lang.String registrikood) {
        this.registrikood = registrikood;
    }


    /**
     * Gets the asutamise_number value for this Sooritakanne_ettevotjad_v4.
     * 
     * @return asutamise_number   * Täidetakse ainult ettevõtjaportaali esmakande korral
     */
    public java.lang.Integer getAsutamise_number() {
        return asutamise_number;
    }


    /**
     * Sets the asutamise_number value for this Sooritakanne_ettevotjad_v4.
     * 
     * @param asutamise_number   * Täidetakse ainult ettevõtjaportaali esmakande korral
     */
    public void setAsutamise_number(java.lang.Integer asutamise_number) {
        this.asutamise_number = asutamise_number;
    }


    /**
     * Gets the kande_sisu value for this Sooritakanne_ettevotjad_v4.
     * 
     * @return kande_sisu
     */
    public eu.x_road.arireg.producer.Sooritakanne_kandesisu_v4 getKande_sisu() {
        return kande_sisu;
    }


    /**
     * Sets the kande_sisu value for this Sooritakanne_ettevotjad_v4.
     * 
     * @param kande_sisu
     */
    public void setKande_sisu(eu.x_road.arireg.producer.Sooritakanne_kandesisu_v4 kande_sisu) {
        this.kande_sisu = kande_sisu;
    }


    /**
     * Gets the dokumendid value for this Sooritakanne_ettevotjad_v4.
     * 
     * @return dokumendid   * Siia pannakse digiallkirjastatud notariaalakt, põhikiri jt
     * lisadokumendid
     */
    public eu.x_road.arireg.producer.DokumentType_v4[] getDokumendid() {
        return dokumendid;
    }


    /**
     * Sets the dokumendid value for this Sooritakanne_ettevotjad_v4.
     * 
     * @param dokumendid   * Siia pannakse digiallkirjastatud notariaalakt, põhikiri jt
     * lisadokumendid
     */
    public void setDokumendid(eu.x_road.arireg.producer.DokumentType_v4[] dokumendid) {
        this.dokumendid = dokumendid;
    }

    public eu.x_road.arireg.producer.DokumentType_v4 getDokumendid(int i) {
        return this.dokumendid[i];
    }

    public void setDokumendid(int i, eu.x_road.arireg.producer.DokumentType_v4 _value) {
        this.dokumendid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sooritakanne_ettevotjad_v4)) return false;
        Sooritakanne_ettevotjad_v4 other = (Sooritakanne_ettevotjad_v4) obj;
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
            ((this.asutamise_number==null && other.getAsutamise_number()==null) || 
             (this.asutamise_number!=null &&
              this.asutamise_number.equals(other.getAsutamise_number()))) &&
            ((this.kande_sisu==null && other.getKande_sisu()==null) || 
             (this.kande_sisu!=null &&
              this.kande_sisu.equals(other.getKande_sisu()))) &&
            ((this.dokumendid==null && other.getDokumendid()==null) || 
             (this.dokumendid!=null &&
              java.util.Arrays.equals(this.dokumendid, other.getDokumendid())));
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
        if (getAsutamise_number() != null) {
            _hashCode += getAsutamise_number().hashCode();
        }
        if (getKande_sisu() != null) {
            _hashCode += getKande_sisu().hashCode();
        }
        if (getDokumendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDokumendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDokumendid(), i);
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
