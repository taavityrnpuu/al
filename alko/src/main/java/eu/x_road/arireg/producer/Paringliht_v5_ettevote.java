/**
 * Paringliht_v5_ettevote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringliht_v5_ettevote  implements java.io.Serializable {
    private java.lang.String evnimi;

    private java.lang.String oiguslik_vorm;

    private java.lang.String oiguslik_vorm_tekstina;

    private java.lang.String oigusliku_vormi_alaliik;

    private java.lang.String oigusliku_vormi_alaliik_tekstina;

    private eu.x_road.arireg.producer.Paringliht_v5_kehtetunimi[] kehtetud_nimed;

    private java.lang.String ariregistri_kood;

    private java.lang.String staatus;

    private java.lang.String staatus_tekstina;

    private java.lang.String tegutseb;

    private java.lang.String tegutseb_tekstina;

    private java.lang.String registrist_kustutamise_aeg;

    private java.lang.String piirkond;

    private java.lang.String piirkond_tekstina;

    private eu.x_road.arireg.producer.Paringliht_v5_evkapital evkapitalid;

    private eu.x_road.arireg.producer.Paringliht_v5_evaadress evaadressid;

    private java.lang.String esmakande_aeg;

    public Paringliht_v5_ettevote() {
    }

    public Paringliht_v5_ettevote(
           java.lang.String evnimi,
           java.lang.String oiguslik_vorm,
           java.lang.String oiguslik_vorm_tekstina,
           java.lang.String oigusliku_vormi_alaliik,
           java.lang.String oigusliku_vormi_alaliik_tekstina,
           eu.x_road.arireg.producer.Paringliht_v5_kehtetunimi[] kehtetud_nimed,
           java.lang.String ariregistri_kood,
           java.lang.String staatus,
           java.lang.String staatus_tekstina,
           java.lang.String tegutseb,
           java.lang.String tegutseb_tekstina,
           java.lang.String registrist_kustutamise_aeg,
           java.lang.String piirkond,
           java.lang.String piirkond_tekstina,
           eu.x_road.arireg.producer.Paringliht_v5_evkapital evkapitalid,
           eu.x_road.arireg.producer.Paringliht_v5_evaadress evaadressid,
           java.lang.String esmakande_aeg) {
           this.evnimi = evnimi;
           this.oiguslik_vorm = oiguslik_vorm;
           this.oiguslik_vorm_tekstina = oiguslik_vorm_tekstina;
           this.oigusliku_vormi_alaliik = oigusliku_vormi_alaliik;
           this.oigusliku_vormi_alaliik_tekstina = oigusliku_vormi_alaliik_tekstina;
           this.kehtetud_nimed = kehtetud_nimed;
           this.ariregistri_kood = ariregistri_kood;
           this.staatus = staatus;
           this.staatus_tekstina = staatus_tekstina;
           this.tegutseb = tegutseb;
           this.tegutseb_tekstina = tegutseb_tekstina;
           this.registrist_kustutamise_aeg = registrist_kustutamise_aeg;
           this.piirkond = piirkond;
           this.piirkond_tekstina = piirkond_tekstina;
           this.evkapitalid = evkapitalid;
           this.evaadressid = evaadressid;
           this.esmakande_aeg = esmakande_aeg;
    }


    /**
     * Gets the evnimi value for this Paringliht_v5_ettevote.
     * 
     * @return evnimi
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }


    /**
     * Sets the evnimi value for this Paringliht_v5_ettevote.
     * 
     * @param evnimi
     */
    public void setEvnimi(java.lang.String evnimi) {
        this.evnimi = evnimi;
    }


    /**
     * Gets the oiguslik_vorm value for this Paringliht_v5_ettevote.
     * 
     * @return oiguslik_vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Paringliht_v5_ettevote.
     * 
     * @param oiguslik_vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the oiguslik_vorm_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @return oiguslik_vorm_tekstina
     */
    public java.lang.String getOiguslik_vorm_tekstina() {
        return oiguslik_vorm_tekstina;
    }


    /**
     * Sets the oiguslik_vorm_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @param oiguslik_vorm_tekstina
     */
    public void setOiguslik_vorm_tekstina(java.lang.String oiguslik_vorm_tekstina) {
        this.oiguslik_vorm_tekstina = oiguslik_vorm_tekstina;
    }


    /**
     * Gets the oigusliku_vormi_alaliik value for this Paringliht_v5_ettevote.
     * 
     * @return oigusliku_vormi_alaliik
     */
    public java.lang.String getOigusliku_vormi_alaliik() {
        return oigusliku_vormi_alaliik;
    }


    /**
     * Sets the oigusliku_vormi_alaliik value for this Paringliht_v5_ettevote.
     * 
     * @param oigusliku_vormi_alaliik
     */
    public void setOigusliku_vormi_alaliik(java.lang.String oigusliku_vormi_alaliik) {
        this.oigusliku_vormi_alaliik = oigusliku_vormi_alaliik;
    }


    /**
     * Gets the oigusliku_vormi_alaliik_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @return oigusliku_vormi_alaliik_tekstina
     */
    public java.lang.String getOigusliku_vormi_alaliik_tekstina() {
        return oigusliku_vormi_alaliik_tekstina;
    }


    /**
     * Sets the oigusliku_vormi_alaliik_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @param oigusliku_vormi_alaliik_tekstina
     */
    public void setOigusliku_vormi_alaliik_tekstina(java.lang.String oigusliku_vormi_alaliik_tekstina) {
        this.oigusliku_vormi_alaliik_tekstina = oigusliku_vormi_alaliik_tekstina;
    }


    /**
     * Gets the kehtetud_nimed value for this Paringliht_v5_ettevote.
     * 
     * @return kehtetud_nimed
     */
    public eu.x_road.arireg.producer.Paringliht_v5_kehtetunimi[] getKehtetud_nimed() {
        return kehtetud_nimed;
    }


    /**
     * Sets the kehtetud_nimed value for this Paringliht_v5_ettevote.
     * 
     * @param kehtetud_nimed
     */
    public void setKehtetud_nimed(eu.x_road.arireg.producer.Paringliht_v5_kehtetunimi[] kehtetud_nimed) {
        this.kehtetud_nimed = kehtetud_nimed;
    }


    /**
     * Gets the ariregistri_kood value for this Paringliht_v5_ettevote.
     * 
     * @return ariregistri_kood
     */
    public java.lang.String getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Paringliht_v5_ettevote.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.String ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the staatus value for this Paringliht_v5_ettevote.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Paringliht_v5_ettevote.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @return staatus_tekstina
     */
    public java.lang.String getStaatus_tekstina() {
        return staatus_tekstina;
    }


    /**
     * Sets the staatus_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @param staatus_tekstina
     */
    public void setStaatus_tekstina(java.lang.String staatus_tekstina) {
        this.staatus_tekstina = staatus_tekstina;
    }


    /**
     * Gets the tegutseb value for this Paringliht_v5_ettevote.
     * 
     * @return tegutseb
     */
    public java.lang.String getTegutseb() {
        return tegutseb;
    }


    /**
     * Sets the tegutseb value for this Paringliht_v5_ettevote.
     * 
     * @param tegutseb
     */
    public void setTegutseb(java.lang.String tegutseb) {
        this.tegutseb = tegutseb;
    }


    /**
     * Gets the tegutseb_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @return tegutseb_tekstina
     */
    public java.lang.String getTegutseb_tekstina() {
        return tegutseb_tekstina;
    }


    /**
     * Sets the tegutseb_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @param tegutseb_tekstina
     */
    public void setTegutseb_tekstina(java.lang.String tegutseb_tekstina) {
        this.tegutseb_tekstina = tegutseb_tekstina;
    }


    /**
     * Gets the registrist_kustutamise_aeg value for this Paringliht_v5_ettevote.
     * 
     * @return registrist_kustutamise_aeg
     */
    public java.lang.String getRegistrist_kustutamise_aeg() {
        return registrist_kustutamise_aeg;
    }


    /**
     * Sets the registrist_kustutamise_aeg value for this Paringliht_v5_ettevote.
     * 
     * @param registrist_kustutamise_aeg
     */
    public void setRegistrist_kustutamise_aeg(java.lang.String registrist_kustutamise_aeg) {
        this.registrist_kustutamise_aeg = registrist_kustutamise_aeg;
    }


    /**
     * Gets the piirkond value for this Paringliht_v5_ettevote.
     * 
     * @return piirkond
     */
    public java.lang.String getPiirkond() {
        return piirkond;
    }


    /**
     * Sets the piirkond value for this Paringliht_v5_ettevote.
     * 
     * @param piirkond
     */
    public void setPiirkond(java.lang.String piirkond) {
        this.piirkond = piirkond;
    }


    /**
     * Gets the piirkond_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @return piirkond_tekstina
     */
    public java.lang.String getPiirkond_tekstina() {
        return piirkond_tekstina;
    }


    /**
     * Sets the piirkond_tekstina value for this Paringliht_v5_ettevote.
     * 
     * @param piirkond_tekstina
     */
    public void setPiirkond_tekstina(java.lang.String piirkond_tekstina) {
        this.piirkond_tekstina = piirkond_tekstina;
    }


    /**
     * Gets the evkapitalid value for this Paringliht_v5_ettevote.
     * 
     * @return evkapitalid
     */
    public eu.x_road.arireg.producer.Paringliht_v5_evkapital getEvkapitalid() {
        return evkapitalid;
    }


    /**
     * Sets the evkapitalid value for this Paringliht_v5_ettevote.
     * 
     * @param evkapitalid
     */
    public void setEvkapitalid(eu.x_road.arireg.producer.Paringliht_v5_evkapital evkapitalid) {
        this.evkapitalid = evkapitalid;
    }


    /**
     * Gets the evaadressid value for this Paringliht_v5_ettevote.
     * 
     * @return evaadressid
     */
    public eu.x_road.arireg.producer.Paringliht_v5_evaadress getEvaadressid() {
        return evaadressid;
    }


    /**
     * Sets the evaadressid value for this Paringliht_v5_ettevote.
     * 
     * @param evaadressid
     */
    public void setEvaadressid(eu.x_road.arireg.producer.Paringliht_v5_evaadress evaadressid) {
        this.evaadressid = evaadressid;
    }


    /**
     * Gets the esmakande_aeg value for this Paringliht_v5_ettevote.
     * 
     * @return esmakande_aeg
     */
    public java.lang.String getEsmakande_aeg() {
        return esmakande_aeg;
    }


    /**
     * Sets the esmakande_aeg value for this Paringliht_v5_ettevote.
     * 
     * @param esmakande_aeg
     */
    public void setEsmakande_aeg(java.lang.String esmakande_aeg) {
        this.esmakande_aeg = esmakande_aeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v5_ettevote)) return false;
        Paringliht_v5_ettevote other = (Paringliht_v5_ettevote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.evnimi==null && other.getEvnimi()==null) || 
             (this.evnimi!=null &&
              this.evnimi.equals(other.getEvnimi()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm()))) &&
            ((this.oiguslik_vorm_tekstina==null && other.getOiguslik_vorm_tekstina()==null) || 
             (this.oiguslik_vorm_tekstina!=null &&
              this.oiguslik_vorm_tekstina.equals(other.getOiguslik_vorm_tekstina()))) &&
            ((this.oigusliku_vormi_alaliik==null && other.getOigusliku_vormi_alaliik()==null) || 
             (this.oigusliku_vormi_alaliik!=null &&
              this.oigusliku_vormi_alaliik.equals(other.getOigusliku_vormi_alaliik()))) &&
            ((this.oigusliku_vormi_alaliik_tekstina==null && other.getOigusliku_vormi_alaliik_tekstina()==null) || 
             (this.oigusliku_vormi_alaliik_tekstina!=null &&
              this.oigusliku_vormi_alaliik_tekstina.equals(other.getOigusliku_vormi_alaliik_tekstina()))) &&
            ((this.kehtetud_nimed==null && other.getKehtetud_nimed()==null) || 
             (this.kehtetud_nimed!=null &&
              java.util.Arrays.equals(this.kehtetud_nimed, other.getKehtetud_nimed()))) &&
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_tekstina==null && other.getStaatus_tekstina()==null) || 
             (this.staatus_tekstina!=null &&
              this.staatus_tekstina.equals(other.getStaatus_tekstina()))) &&
            ((this.tegutseb==null && other.getTegutseb()==null) || 
             (this.tegutseb!=null &&
              this.tegutseb.equals(other.getTegutseb()))) &&
            ((this.tegutseb_tekstina==null && other.getTegutseb_tekstina()==null) || 
             (this.tegutseb_tekstina!=null &&
              this.tegutseb_tekstina.equals(other.getTegutseb_tekstina()))) &&
            ((this.registrist_kustutamise_aeg==null && other.getRegistrist_kustutamise_aeg()==null) || 
             (this.registrist_kustutamise_aeg!=null &&
              this.registrist_kustutamise_aeg.equals(other.getRegistrist_kustutamise_aeg()))) &&
            ((this.piirkond==null && other.getPiirkond()==null) || 
             (this.piirkond!=null &&
              this.piirkond.equals(other.getPiirkond()))) &&
            ((this.piirkond_tekstina==null && other.getPiirkond_tekstina()==null) || 
             (this.piirkond_tekstina!=null &&
              this.piirkond_tekstina.equals(other.getPiirkond_tekstina()))) &&
            ((this.evkapitalid==null && other.getEvkapitalid()==null) || 
             (this.evkapitalid!=null &&
              this.evkapitalid.equals(other.getEvkapitalid()))) &&
            ((this.evaadressid==null && other.getEvaadressid()==null) || 
             (this.evaadressid!=null &&
              this.evaadressid.equals(other.getEvaadressid()))) &&
            ((this.esmakande_aeg==null && other.getEsmakande_aeg()==null) || 
             (this.esmakande_aeg!=null &&
              this.esmakande_aeg.equals(other.getEsmakande_aeg())));
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
        if (getEvnimi() != null) {
            _hashCode += getEvnimi().hashCode();
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        if (getOiguslik_vorm_tekstina() != null) {
            _hashCode += getOiguslik_vorm_tekstina().hashCode();
        }
        if (getOigusliku_vormi_alaliik() != null) {
            _hashCode += getOigusliku_vormi_alaliik().hashCode();
        }
        if (getOigusliku_vormi_alaliik_tekstina() != null) {
            _hashCode += getOigusliku_vormi_alaliik_tekstina().hashCode();
        }
        if (getKehtetud_nimed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKehtetud_nimed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKehtetud_nimed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_tekstina() != null) {
            _hashCode += getStaatus_tekstina().hashCode();
        }
        if (getTegutseb() != null) {
            _hashCode += getTegutseb().hashCode();
        }
        if (getTegutseb_tekstina() != null) {
            _hashCode += getTegutseb_tekstina().hashCode();
        }
        if (getRegistrist_kustutamise_aeg() != null) {
            _hashCode += getRegistrist_kustutamise_aeg().hashCode();
        }
        if (getPiirkond() != null) {
            _hashCode += getPiirkond().hashCode();
        }
        if (getPiirkond_tekstina() != null) {
            _hashCode += getPiirkond_tekstina().hashCode();
        }
        if (getEvkapitalid() != null) {
            _hashCode += getEvkapitalid().hashCode();
        }
        if (getEvaadressid() != null) {
            _hashCode += getEvaadressid().hashCode();
        }
        if (getEsmakande_aeg() != null) {
            _hashCode += getEsmakande_aeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
