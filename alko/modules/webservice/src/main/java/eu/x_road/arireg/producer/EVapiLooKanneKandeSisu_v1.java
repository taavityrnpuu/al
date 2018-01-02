/**
 * EVapiLooKanneKandeSisu_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneKandeSisu_v1  implements java.io.Serializable {
    /* Uus ärinimi nii muutmiskande kui esmakande korral. */
    private java.lang.String uus_arinimi;

    private eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 asukoht;

    private eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 asukoht_pohikirjas;

    private eu.x_road.arireg.producer.EVapiLooKanneTegevusala_v1 pohitegevusala;

    /* Äriühingu kogukapitali suurus */
    private eu.x_road.arireg.producer.EVapiLooKanneKapital_v1 kapital;

    /* Isikute massiiv, nii registrikaardile kantavad isikud kui ka
     * kaardivälised isikud */
    private eu.x_road.arireg.producer.EVapiLooKanneIsik_v1[] isikud;

    /* Kandega pannakse kaasa täiskomplekt sidevahendeid, mitte ainult
     * muudatused??? */
    private eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1[] sidevahendid;

    public EVapiLooKanneKandeSisu_v1() {
    }

    public EVapiLooKanneKandeSisu_v1(
           java.lang.String uus_arinimi,
           eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 asukoht,
           eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 asukoht_pohikirjas,
           eu.x_road.arireg.producer.EVapiLooKanneTegevusala_v1 pohitegevusala,
           eu.x_road.arireg.producer.EVapiLooKanneKapital_v1 kapital,
           eu.x_road.arireg.producer.EVapiLooKanneIsik_v1[] isikud,
           eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1[] sidevahendid) {
           this.uus_arinimi = uus_arinimi;
           this.asukoht = asukoht;
           this.asukoht_pohikirjas = asukoht_pohikirjas;
           this.pohitegevusala = pohitegevusala;
           this.kapital = kapital;
           this.isikud = isikud;
           this.sidevahendid = sidevahendid;
    }


    /**
     * Gets the uus_arinimi value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return uus_arinimi   * Uus ärinimi nii muutmiskande kui esmakande korral.
     */
    public java.lang.String getUus_arinimi() {
        return uus_arinimi;
    }


    /**
     * Sets the uus_arinimi value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param uus_arinimi   * Uus ärinimi nii muutmiskande kui esmakande korral.
     */
    public void setUus_arinimi(java.lang.String uus_arinimi) {
        this.uus_arinimi = uus_arinimi;
    }


    /**
     * Gets the asukoht value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return asukoht
     */
    public eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 getAsukoht() {
        return asukoht;
    }


    /**
     * Sets the asukoht value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param asukoht
     */
    public void setAsukoht(eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 asukoht) {
        this.asukoht = asukoht;
    }


    /**
     * Gets the asukoht_pohikirjas value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return asukoht_pohikirjas
     */
    public eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 getAsukoht_pohikirjas() {
        return asukoht_pohikirjas;
    }


    /**
     * Sets the asukoht_pohikirjas value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param asukoht_pohikirjas
     */
    public void setAsukoht_pohikirjas(eu.x_road.arireg.producer.EVapiLooKanneAadress_v1 asukoht_pohikirjas) {
        this.asukoht_pohikirjas = asukoht_pohikirjas;
    }


    /**
     * Gets the pohitegevusala value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return pohitegevusala
     */
    public eu.x_road.arireg.producer.EVapiLooKanneTegevusala_v1 getPohitegevusala() {
        return pohitegevusala;
    }


    /**
     * Sets the pohitegevusala value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param pohitegevusala
     */
    public void setPohitegevusala(eu.x_road.arireg.producer.EVapiLooKanneTegevusala_v1 pohitegevusala) {
        this.pohitegevusala = pohitegevusala;
    }


    /**
     * Gets the kapital value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return kapital   * Äriühingu kogukapitali suurus
     */
    public eu.x_road.arireg.producer.EVapiLooKanneKapital_v1 getKapital() {
        return kapital;
    }


    /**
     * Sets the kapital value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param kapital   * Äriühingu kogukapitali suurus
     */
    public void setKapital(eu.x_road.arireg.producer.EVapiLooKanneKapital_v1 kapital) {
        this.kapital = kapital;
    }


    /**
     * Gets the isikud value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return isikud   * Isikute massiiv, nii registrikaardile kantavad isikud kui ka
     * kaardivälised isikud
     */
    public eu.x_road.arireg.producer.EVapiLooKanneIsik_v1[] getIsikud() {
        return isikud;
    }


    /**
     * Sets the isikud value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param isikud   * Isikute massiiv, nii registrikaardile kantavad isikud kui ka
     * kaardivälised isikud
     */
    public void setIsikud(eu.x_road.arireg.producer.EVapiLooKanneIsik_v1[] isikud) {
        this.isikud = isikud;
    }

    public eu.x_road.arireg.producer.EVapiLooKanneIsik_v1 getIsikud(int i) {
        return this.isikud[i];
    }

    public void setIsikud(int i, eu.x_road.arireg.producer.EVapiLooKanneIsik_v1 _value) {
        this.isikud[i] = _value;
    }


    /**
     * Gets the sidevahendid value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @return sidevahendid   * Kandega pannakse kaasa täiskomplekt sidevahendeid, mitte ainult
     * muudatused???
     */
    public eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1[] getSidevahendid() {
        return sidevahendid;
    }


    /**
     * Sets the sidevahendid value for this EVapiLooKanneKandeSisu_v1.
     * 
     * @param sidevahendid   * Kandega pannakse kaasa täiskomplekt sidevahendeid, mitte ainult
     * muudatused???
     */
    public void setSidevahendid(eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1[] sidevahendid) {
        this.sidevahendid = sidevahendid;
    }

    public eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1 getSidevahendid(int i) {
        return this.sidevahendid[i];
    }

    public void setSidevahendid(int i, eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1 _value) {
        this.sidevahendid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneKandeSisu_v1)) return false;
        EVapiLooKanneKandeSisu_v1 other = (EVapiLooKanneKandeSisu_v1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uus_arinimi==null && other.getUus_arinimi()==null) || 
             (this.uus_arinimi!=null &&
              this.uus_arinimi.equals(other.getUus_arinimi()))) &&
            ((this.asukoht==null && other.getAsukoht()==null) || 
             (this.asukoht!=null &&
              this.asukoht.equals(other.getAsukoht()))) &&
            ((this.asukoht_pohikirjas==null && other.getAsukoht_pohikirjas()==null) || 
             (this.asukoht_pohikirjas!=null &&
              this.asukoht_pohikirjas.equals(other.getAsukoht_pohikirjas()))) &&
            ((this.pohitegevusala==null && other.getPohitegevusala()==null) || 
             (this.pohitegevusala!=null &&
              this.pohitegevusala.equals(other.getPohitegevusala()))) &&
            ((this.kapital==null && other.getKapital()==null) || 
             (this.kapital!=null &&
              this.kapital.equals(other.getKapital()))) &&
            ((this.isikud==null && other.getIsikud()==null) || 
             (this.isikud!=null &&
              java.util.Arrays.equals(this.isikud, other.getIsikud()))) &&
            ((this.sidevahendid==null && other.getSidevahendid()==null) || 
             (this.sidevahendid!=null &&
              java.util.Arrays.equals(this.sidevahendid, other.getSidevahendid())));
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
        if (getUus_arinimi() != null) {
            _hashCode += getUus_arinimi().hashCode();
        }
        if (getAsukoht() != null) {
            _hashCode += getAsukoht().hashCode();
        }
        if (getAsukoht_pohikirjas() != null) {
            _hashCode += getAsukoht_pohikirjas().hashCode();
        }
        if (getPohitegevusala() != null) {
            _hashCode += getPohitegevusala().hashCode();
        }
        if (getKapital() != null) {
            _hashCode += getKapital().hashCode();
        }
        if (getIsikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsikud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
