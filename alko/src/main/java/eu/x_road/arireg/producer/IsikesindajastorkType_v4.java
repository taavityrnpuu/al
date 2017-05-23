/**
 * IsikesindajastorkType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class IsikesindajastorkType_v4  implements java.io.Serializable {
    /* Isiku ID, kasutab vaid ettevõtjaportaal STORK esindaja seosteks */
    private java.math.BigInteger e_isikud_id;

    /* Isikukood */
    private java.lang.String isikukood;

    /* Isikukoodi riik */
    private java.lang.String isikukood_riik;

    /* Eesnimi */
    private java.lang.String givenname;

    /* Perenimi */
    private java.lang.String surname;

    /* Sünnikuupäev */
    private java.util.Date synniaeg;

    /* STORK poolt tagastatud esindusõiguse eritingimused */
    private java.lang.String mandatecontent;

    /* STORK autenditud JAH=1, EI=0 */
    private java.math.BigInteger stork_autenditud;

    /* STORK autentimise kuupäev */
    private java.util.Date stork_autenditud_kpv;

    /* STORK QAA level */
    private java.lang.String stork_qaa_level;

    /* STORK edastatud RAW andmestik JSON vormingus */
    private java.lang.String stork_data;

    public IsikesindajastorkType_v4() {
    }

    public IsikesindajastorkType_v4(
           java.math.BigInteger e_isikud_id,
           java.lang.String isikukood,
           java.lang.String isikukood_riik,
           java.lang.String givenname,
           java.lang.String surname,
           java.util.Date synniaeg,
           java.lang.String mandatecontent,
           java.math.BigInteger stork_autenditud,
           java.util.Date stork_autenditud_kpv,
           java.lang.String stork_qaa_level,
           java.lang.String stork_data) {
           this.e_isikud_id = e_isikud_id;
           this.isikukood = isikukood;
           this.isikukood_riik = isikukood_riik;
           this.givenname = givenname;
           this.surname = surname;
           this.synniaeg = synniaeg;
           this.mandatecontent = mandatecontent;
           this.stork_autenditud = stork_autenditud;
           this.stork_autenditud_kpv = stork_autenditud_kpv;
           this.stork_qaa_level = stork_qaa_level;
           this.stork_data = stork_data;
    }


    /**
     * Gets the e_isikud_id value for this IsikesindajastorkType_v4.
     * 
     * @return e_isikud_id   * Isiku ID, kasutab vaid ettevõtjaportaal STORK esindaja seosteks
     */
    public java.math.BigInteger getE_isikud_id() {
        return e_isikud_id;
    }


    /**
     * Sets the e_isikud_id value for this IsikesindajastorkType_v4.
     * 
     * @param e_isikud_id   * Isiku ID, kasutab vaid ettevõtjaportaal STORK esindaja seosteks
     */
    public void setE_isikud_id(java.math.BigInteger e_isikud_id) {
        this.e_isikud_id = e_isikud_id;
    }


    /**
     * Gets the isikukood value for this IsikesindajastorkType_v4.
     * 
     * @return isikukood   * Isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this IsikesindajastorkType_v4.
     * 
     * @param isikukood   * Isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the isikukood_riik value for this IsikesindajastorkType_v4.
     * 
     * @return isikukood_riik   * Isikukoodi riik
     */
    public java.lang.String getIsikukood_riik() {
        return isikukood_riik;
    }


    /**
     * Sets the isikukood_riik value for this IsikesindajastorkType_v4.
     * 
     * @param isikukood_riik   * Isikukoodi riik
     */
    public void setIsikukood_riik(java.lang.String isikukood_riik) {
        this.isikukood_riik = isikukood_riik;
    }


    /**
     * Gets the givenname value for this IsikesindajastorkType_v4.
     * 
     * @return givenname   * Eesnimi
     */
    public java.lang.String getGivenname() {
        return givenname;
    }


    /**
     * Sets the givenname value for this IsikesindajastorkType_v4.
     * 
     * @param givenname   * Eesnimi
     */
    public void setGivenname(java.lang.String givenname) {
        this.givenname = givenname;
    }


    /**
     * Gets the surname value for this IsikesindajastorkType_v4.
     * 
     * @return surname   * Perenimi
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this IsikesindajastorkType_v4.
     * 
     * @param surname   * Perenimi
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the synniaeg value for this IsikesindajastorkType_v4.
     * 
     * @return synniaeg   * Sünnikuupäev
     */
    public java.util.Date getSynniaeg() {
        return synniaeg;
    }


    /**
     * Sets the synniaeg value for this IsikesindajastorkType_v4.
     * 
     * @param synniaeg   * Sünnikuupäev
     */
    public void setSynniaeg(java.util.Date synniaeg) {
        this.synniaeg = synniaeg;
    }


    /**
     * Gets the mandatecontent value for this IsikesindajastorkType_v4.
     * 
     * @return mandatecontent   * STORK poolt tagastatud esindusõiguse eritingimused
     */
    public java.lang.String getMandatecontent() {
        return mandatecontent;
    }


    /**
     * Sets the mandatecontent value for this IsikesindajastorkType_v4.
     * 
     * @param mandatecontent   * STORK poolt tagastatud esindusõiguse eritingimused
     */
    public void setMandatecontent(java.lang.String mandatecontent) {
        this.mandatecontent = mandatecontent;
    }


    /**
     * Gets the stork_autenditud value for this IsikesindajastorkType_v4.
     * 
     * @return stork_autenditud   * STORK autenditud JAH=1, EI=0
     */
    public java.math.BigInteger getStork_autenditud() {
        return stork_autenditud;
    }


    /**
     * Sets the stork_autenditud value for this IsikesindajastorkType_v4.
     * 
     * @param stork_autenditud   * STORK autenditud JAH=1, EI=0
     */
    public void setStork_autenditud(java.math.BigInteger stork_autenditud) {
        this.stork_autenditud = stork_autenditud;
    }


    /**
     * Gets the stork_autenditud_kpv value for this IsikesindajastorkType_v4.
     * 
     * @return stork_autenditud_kpv   * STORK autentimise kuupäev
     */
    public java.util.Date getStork_autenditud_kpv() {
        return stork_autenditud_kpv;
    }


    /**
     * Sets the stork_autenditud_kpv value for this IsikesindajastorkType_v4.
     * 
     * @param stork_autenditud_kpv   * STORK autentimise kuupäev
     */
    public void setStork_autenditud_kpv(java.util.Date stork_autenditud_kpv) {
        this.stork_autenditud_kpv = stork_autenditud_kpv;
    }


    /**
     * Gets the stork_qaa_level value for this IsikesindajastorkType_v4.
     * 
     * @return stork_qaa_level   * STORK QAA level
     */
    public java.lang.String getStork_qaa_level() {
        return stork_qaa_level;
    }


    /**
     * Sets the stork_qaa_level value for this IsikesindajastorkType_v4.
     * 
     * @param stork_qaa_level   * STORK QAA level
     */
    public void setStork_qaa_level(java.lang.String stork_qaa_level) {
        this.stork_qaa_level = stork_qaa_level;
    }


    /**
     * Gets the stork_data value for this IsikesindajastorkType_v4.
     * 
     * @return stork_data   * STORK edastatud RAW andmestik JSON vormingus
     */
    public java.lang.String getStork_data() {
        return stork_data;
    }


    /**
     * Sets the stork_data value for this IsikesindajastorkType_v4.
     * 
     * @param stork_data   * STORK edastatud RAW andmestik JSON vormingus
     */
    public void setStork_data(java.lang.String stork_data) {
        this.stork_data = stork_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsikesindajastorkType_v4)) return false;
        IsikesindajastorkType_v4 other = (IsikesindajastorkType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.e_isikud_id==null && other.getE_isikud_id()==null) || 
             (this.e_isikud_id!=null &&
              this.e_isikud_id.equals(other.getE_isikud_id()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.isikukood_riik==null && other.getIsikukood_riik()==null) || 
             (this.isikukood_riik!=null &&
              this.isikukood_riik.equals(other.getIsikukood_riik()))) &&
            ((this.givenname==null && other.getGivenname()==null) || 
             (this.givenname!=null &&
              this.givenname.equals(other.getGivenname()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.synniaeg==null && other.getSynniaeg()==null) || 
             (this.synniaeg!=null &&
              this.synniaeg.equals(other.getSynniaeg()))) &&
            ((this.mandatecontent==null && other.getMandatecontent()==null) || 
             (this.mandatecontent!=null &&
              this.mandatecontent.equals(other.getMandatecontent()))) &&
            ((this.stork_autenditud==null && other.getStork_autenditud()==null) || 
             (this.stork_autenditud!=null &&
              this.stork_autenditud.equals(other.getStork_autenditud()))) &&
            ((this.stork_autenditud_kpv==null && other.getStork_autenditud_kpv()==null) || 
             (this.stork_autenditud_kpv!=null &&
              this.stork_autenditud_kpv.equals(other.getStork_autenditud_kpv()))) &&
            ((this.stork_qaa_level==null && other.getStork_qaa_level()==null) || 
             (this.stork_qaa_level!=null &&
              this.stork_qaa_level.equals(other.getStork_qaa_level()))) &&
            ((this.stork_data==null && other.getStork_data()==null) || 
             (this.stork_data!=null &&
              this.stork_data.equals(other.getStork_data())));
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
        if (getE_isikud_id() != null) {
            _hashCode += getE_isikud_id().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getIsikukood_riik() != null) {
            _hashCode += getIsikukood_riik().hashCode();
        }
        if (getGivenname() != null) {
            _hashCode += getGivenname().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getSynniaeg() != null) {
            _hashCode += getSynniaeg().hashCode();
        }
        if (getMandatecontent() != null) {
            _hashCode += getMandatecontent().hashCode();
        }
        if (getStork_autenditud() != null) {
            _hashCode += getStork_autenditud().hashCode();
        }
        if (getStork_autenditud_kpv() != null) {
            _hashCode += getStork_autenditud_kpv().hashCode();
        }
        if (getStork_qaa_level() != null) {
            _hashCode += getStork_qaa_level().hashCode();
        }
        if (getStork_data() != null) {
            _hashCode += getStork_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
