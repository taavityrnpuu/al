/**
 * Rekvisiidid_ettevote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Rekvisiidid_ettevote  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String ariregistri_kood;

    private java.lang.String kmkr_nr;

    private java.lang.String ettevotja_staatus;

    private java.lang.String ettevotja_staatus_tekstina;

    private eu.x_road.arireg.producer.Rekvisiidid_evaadress ettevotja_aadress;

    /* Info kohustuste täitmise kohta. Välja ei saadeta, kui info
     * puudub/ei saada ühendust */
    private java.lang.Boolean info_kohustuse_taitmise_kohta;

    private eu.x_road.arireg.producer.Rekvisiidid_maj_aruanne[] majandusaasta_aruanded;

    /* Maksuvõla info. Välja ei saadeta, kui info puudub/ei saada
     * ühendust */
    private java.lang.Boolean maksuvola_info;

    private java.lang.String teabesysteemi_link;

    public Rekvisiidid_ettevote() {
    }

    public Rekvisiidid_ettevote(
           java.lang.String nimi,
           java.lang.String ariregistri_kood,
           java.lang.String kmkr_nr,
           java.lang.String ettevotja_staatus,
           java.lang.String ettevotja_staatus_tekstina,
           eu.x_road.arireg.producer.Rekvisiidid_evaadress ettevotja_aadress,
           java.lang.Boolean info_kohustuse_taitmise_kohta,
           eu.x_road.arireg.producer.Rekvisiidid_maj_aruanne[] majandusaasta_aruanded,
           java.lang.Boolean maksuvola_info,
           java.lang.String teabesysteemi_link) {
           this.nimi = nimi;
           this.ariregistri_kood = ariregistri_kood;
           this.kmkr_nr = kmkr_nr;
           this.ettevotja_staatus = ettevotja_staatus;
           this.ettevotja_staatus_tekstina = ettevotja_staatus_tekstina;
           this.ettevotja_aadress = ettevotja_aadress;
           this.info_kohustuse_taitmise_kohta = info_kohustuse_taitmise_kohta;
           this.majandusaasta_aruanded = majandusaasta_aruanded;
           this.maksuvola_info = maksuvola_info;
           this.teabesysteemi_link = teabesysteemi_link;
    }


    /**
     * Gets the nimi value for this Rekvisiidid_ettevote.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Rekvisiidid_ettevote.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the ariregistri_kood value for this Rekvisiidid_ettevote.
     * 
     * @return ariregistri_kood
     */
    public java.lang.String getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Rekvisiidid_ettevote.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.String ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the kmkr_nr value for this Rekvisiidid_ettevote.
     * 
     * @return kmkr_nr
     */
    public java.lang.String getKmkr_nr() {
        return kmkr_nr;
    }


    /**
     * Sets the kmkr_nr value for this Rekvisiidid_ettevote.
     * 
     * @param kmkr_nr
     */
    public void setKmkr_nr(java.lang.String kmkr_nr) {
        this.kmkr_nr = kmkr_nr;
    }


    /**
     * Gets the ettevotja_staatus value for this Rekvisiidid_ettevote.
     * 
     * @return ettevotja_staatus
     */
    public java.lang.String getEttevotja_staatus() {
        return ettevotja_staatus;
    }


    /**
     * Sets the ettevotja_staatus value for this Rekvisiidid_ettevote.
     * 
     * @param ettevotja_staatus
     */
    public void setEttevotja_staatus(java.lang.String ettevotja_staatus) {
        this.ettevotja_staatus = ettevotja_staatus;
    }


    /**
     * Gets the ettevotja_staatus_tekstina value for this Rekvisiidid_ettevote.
     * 
     * @return ettevotja_staatus_tekstina
     */
    public java.lang.String getEttevotja_staatus_tekstina() {
        return ettevotja_staatus_tekstina;
    }


    /**
     * Sets the ettevotja_staatus_tekstina value for this Rekvisiidid_ettevote.
     * 
     * @param ettevotja_staatus_tekstina
     */
    public void setEttevotja_staatus_tekstina(java.lang.String ettevotja_staatus_tekstina) {
        this.ettevotja_staatus_tekstina = ettevotja_staatus_tekstina;
    }


    /**
     * Gets the ettevotja_aadress value for this Rekvisiidid_ettevote.
     * 
     * @return ettevotja_aadress
     */
    public eu.x_road.arireg.producer.Rekvisiidid_evaadress getEttevotja_aadress() {
        return ettevotja_aadress;
    }


    /**
     * Sets the ettevotja_aadress value for this Rekvisiidid_ettevote.
     * 
     * @param ettevotja_aadress
     */
    public void setEttevotja_aadress(eu.x_road.arireg.producer.Rekvisiidid_evaadress ettevotja_aadress) {
        this.ettevotja_aadress = ettevotja_aadress;
    }


    /**
     * Gets the info_kohustuse_taitmise_kohta value for this Rekvisiidid_ettevote.
     * 
     * @return info_kohustuse_taitmise_kohta   * Info kohustuste täitmise kohta. Välja ei saadeta, kui info
     * puudub/ei saada ühendust
     */
    public java.lang.Boolean getInfo_kohustuse_taitmise_kohta() {
        return info_kohustuse_taitmise_kohta;
    }


    /**
     * Sets the info_kohustuse_taitmise_kohta value for this Rekvisiidid_ettevote.
     * 
     * @param info_kohustuse_taitmise_kohta   * Info kohustuste täitmise kohta. Välja ei saadeta, kui info
     * puudub/ei saada ühendust
     */
    public void setInfo_kohustuse_taitmise_kohta(java.lang.Boolean info_kohustuse_taitmise_kohta) {
        this.info_kohustuse_taitmise_kohta = info_kohustuse_taitmise_kohta;
    }


    /**
     * Gets the majandusaasta_aruanded value for this Rekvisiidid_ettevote.
     * 
     * @return majandusaasta_aruanded
     */
    public eu.x_road.arireg.producer.Rekvisiidid_maj_aruanne[] getMajandusaasta_aruanded() {
        return majandusaasta_aruanded;
    }


    /**
     * Sets the majandusaasta_aruanded value for this Rekvisiidid_ettevote.
     * 
     * @param majandusaasta_aruanded
     */
    public void setMajandusaasta_aruanded(eu.x_road.arireg.producer.Rekvisiidid_maj_aruanne[] majandusaasta_aruanded) {
        this.majandusaasta_aruanded = majandusaasta_aruanded;
    }


    /**
     * Gets the maksuvola_info value for this Rekvisiidid_ettevote.
     * 
     * @return maksuvola_info   * Maksuvõla info. Välja ei saadeta, kui info puudub/ei saada
     * ühendust
     */
    public java.lang.Boolean getMaksuvola_info() {
        return maksuvola_info;
    }


    /**
     * Sets the maksuvola_info value for this Rekvisiidid_ettevote.
     * 
     * @param maksuvola_info   * Maksuvõla info. Välja ei saadeta, kui info puudub/ei saada
     * ühendust
     */
    public void setMaksuvola_info(java.lang.Boolean maksuvola_info) {
        this.maksuvola_info = maksuvola_info;
    }


    /**
     * Gets the teabesysteemi_link value for this Rekvisiidid_ettevote.
     * 
     * @return teabesysteemi_link
     */
    public java.lang.String getTeabesysteemi_link() {
        return teabesysteemi_link;
    }


    /**
     * Sets the teabesysteemi_link value for this Rekvisiidid_ettevote.
     * 
     * @param teabesysteemi_link
     */
    public void setTeabesysteemi_link(java.lang.String teabesysteemi_link) {
        this.teabesysteemi_link = teabesysteemi_link;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rekvisiidid_ettevote)) return false;
        Rekvisiidid_ettevote other = (Rekvisiidid_ettevote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.kmkr_nr==null && other.getKmkr_nr()==null) || 
             (this.kmkr_nr!=null &&
              this.kmkr_nr.equals(other.getKmkr_nr()))) &&
            ((this.ettevotja_staatus==null && other.getEttevotja_staatus()==null) || 
             (this.ettevotja_staatus!=null &&
              this.ettevotja_staatus.equals(other.getEttevotja_staatus()))) &&
            ((this.ettevotja_staatus_tekstina==null && other.getEttevotja_staatus_tekstina()==null) || 
             (this.ettevotja_staatus_tekstina!=null &&
              this.ettevotja_staatus_tekstina.equals(other.getEttevotja_staatus_tekstina()))) &&
            ((this.ettevotja_aadress==null && other.getEttevotja_aadress()==null) || 
             (this.ettevotja_aadress!=null &&
              this.ettevotja_aadress.equals(other.getEttevotja_aadress()))) &&
            ((this.info_kohustuse_taitmise_kohta==null && other.getInfo_kohustuse_taitmise_kohta()==null) || 
             (this.info_kohustuse_taitmise_kohta!=null &&
              this.info_kohustuse_taitmise_kohta.equals(other.getInfo_kohustuse_taitmise_kohta()))) &&
            ((this.majandusaasta_aruanded==null && other.getMajandusaasta_aruanded()==null) || 
             (this.majandusaasta_aruanded!=null &&
              java.util.Arrays.equals(this.majandusaasta_aruanded, other.getMajandusaasta_aruanded()))) &&
            ((this.maksuvola_info==null && other.getMaksuvola_info()==null) || 
             (this.maksuvola_info!=null &&
              this.maksuvola_info.equals(other.getMaksuvola_info()))) &&
            ((this.teabesysteemi_link==null && other.getTeabesysteemi_link()==null) || 
             (this.teabesysteemi_link!=null &&
              this.teabesysteemi_link.equals(other.getTeabesysteemi_link())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getKmkr_nr() != null) {
            _hashCode += getKmkr_nr().hashCode();
        }
        if (getEttevotja_staatus() != null) {
            _hashCode += getEttevotja_staatus().hashCode();
        }
        if (getEttevotja_staatus_tekstina() != null) {
            _hashCode += getEttevotja_staatus_tekstina().hashCode();
        }
        if (getEttevotja_aadress() != null) {
            _hashCode += getEttevotja_aadress().hashCode();
        }
        if (getInfo_kohustuse_taitmise_kohta() != null) {
            _hashCode += getInfo_kohustuse_taitmise_kohta().hashCode();
        }
        if (getMajandusaasta_aruanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMajandusaasta_aruanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMajandusaasta_aruanded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaksuvola_info() != null) {
            _hashCode += getMaksuvola_info().hashCode();
        }
        if (getTeabesysteemi_link() != null) {
            _hashCode += getTeabesysteemi_link().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
