/**
 * Ettevotja_muudatused_tasuta_paring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatused_tasuta_paring  implements java.io.Serializable {
    /* Näitab, millise kuupäeva kohta ettevõtja muudatusi päritakse. */
    private java.util.Date kuupaev;

    /* Võimalike ettevõtja muudatuste tüüpide filter - 'kandevalised',
     * 'kanded', 'maarused', 'aruandlusandmed'. Väärtus on kohustuslik ja
     * ühes päringus võib olla ainult üks valitud (sisuliselt maxOccurs=1). */
    private java.lang.String[] muudatuste_valik;

    /* Võimalikud kandeväliste muudatuste alamtüüpide filter - 'isikud',
     * 'sidevahendid', 'tegevusalad'. Kui see väli on defineerimata, siis
     * on valitud kõik tüübid. */
    private java.lang.String[] kandevalised_valik;

    /* Ettevõtja kande muudatuste kandeliikide filter. */
    private int[] kande_kandeliigid;

    /* Ettevõtja kande muudatuste kandeosade filter. */
    private java.lang.String[] kande_kandeosad;

    /* Ettevõtja kande muudatuste staatuse muutumisel endine staatus. */
    private java.lang.String kande_eelmine_staatus;

    /* Ettevõtja kande muudatuste staatuse muutumisel uus staatus. */
    private java.lang.String kande_uus_staatus;

    /* Ettevõtja muudatuste lehekülje number. 1000 muudatust lehel. */
    private java.lang.Integer tulemuste_lk;

    public Ettevotja_muudatused_tasuta_paring() {
    }

    public Ettevotja_muudatused_tasuta_paring(
           java.util.Date kuupaev,
           java.lang.String[] muudatuste_valik,
           java.lang.String[] kandevalised_valik,
           int[] kande_kandeliigid,
           java.lang.String[] kande_kandeosad,
           java.lang.String kande_eelmine_staatus,
           java.lang.String kande_uus_staatus,
           java.lang.Integer tulemuste_lk) {
           this.kuupaev = kuupaev;
           this.muudatuste_valik = muudatuste_valik;
           this.kandevalised_valik = kandevalised_valik;
           this.kande_kandeliigid = kande_kandeliigid;
           this.kande_kandeosad = kande_kandeosad;
           this.kande_eelmine_staatus = kande_eelmine_staatus;
           this.kande_uus_staatus = kande_uus_staatus;
           this.tulemuste_lk = tulemuste_lk;
    }


    /**
     * Gets the kuupaev value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return kuupaev   * Näitab, millise kuupäeva kohta ettevõtja muudatusi päritakse.
     */
    public java.util.Date getKuupaev() {
        return kuupaev;
    }


    /**
     * Sets the kuupaev value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param kuupaev   * Näitab, millise kuupäeva kohta ettevõtja muudatusi päritakse.
     */
    public void setKuupaev(java.util.Date kuupaev) {
        this.kuupaev = kuupaev;
    }


    /**
     * Gets the muudatuste_valik value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return muudatuste_valik   * Võimalike ettevõtja muudatuste tüüpide filter - 'kandevalised',
     * 'kanded', 'maarused', 'aruandlusandmed'. Väärtus on kohustuslik ja
     * ühes päringus võib olla ainult üks valitud (sisuliselt maxOccurs=1).
     */
    public java.lang.String[] getMuudatuste_valik() {
        return muudatuste_valik;
    }


    /**
     * Sets the muudatuste_valik value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param muudatuste_valik   * Võimalike ettevõtja muudatuste tüüpide filter - 'kandevalised',
     * 'kanded', 'maarused', 'aruandlusandmed'. Väärtus on kohustuslik ja
     * ühes päringus võib olla ainult üks valitud (sisuliselt maxOccurs=1).
     */
    public void setMuudatuste_valik(java.lang.String[] muudatuste_valik) {
        this.muudatuste_valik = muudatuste_valik;
    }

    public java.lang.String getMuudatuste_valik(int i) {
        return this.muudatuste_valik[i];
    }

    public void setMuudatuste_valik(int i, java.lang.String _value) {
        this.muudatuste_valik[i] = _value;
    }


    /**
     * Gets the kandevalised_valik value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return kandevalised_valik   * Võimalikud kandeväliste muudatuste alamtüüpide filter - 'isikud',
     * 'sidevahendid', 'tegevusalad'. Kui see väli on defineerimata, siis
     * on valitud kõik tüübid.
     */
    public java.lang.String[] getKandevalised_valik() {
        return kandevalised_valik;
    }


    /**
     * Sets the kandevalised_valik value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param kandevalised_valik   * Võimalikud kandeväliste muudatuste alamtüüpide filter - 'isikud',
     * 'sidevahendid', 'tegevusalad'. Kui see väli on defineerimata, siis
     * on valitud kõik tüübid.
     */
    public void setKandevalised_valik(java.lang.String[] kandevalised_valik) {
        this.kandevalised_valik = kandevalised_valik;
    }

    public java.lang.String getKandevalised_valik(int i) {
        return this.kandevalised_valik[i];
    }

    public void setKandevalised_valik(int i, java.lang.String _value) {
        this.kandevalised_valik[i] = _value;
    }


    /**
     * Gets the kande_kandeliigid value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return kande_kandeliigid   * Ettevõtja kande muudatuste kandeliikide filter.
     */
    public int[] getKande_kandeliigid() {
        return kande_kandeliigid;
    }


    /**
     * Sets the kande_kandeliigid value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param kande_kandeliigid   * Ettevõtja kande muudatuste kandeliikide filter.
     */
    public void setKande_kandeliigid(int[] kande_kandeliigid) {
        this.kande_kandeliigid = kande_kandeliigid;
    }

    public int getKande_kandeliigid(int i) {
        return this.kande_kandeliigid[i];
    }

    public void setKande_kandeliigid(int i, int _value) {
        this.kande_kandeliigid[i] = _value;
    }


    /**
     * Gets the kande_kandeosad value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return kande_kandeosad   * Ettevõtja kande muudatuste kandeosade filter.
     */
    public java.lang.String[] getKande_kandeosad() {
        return kande_kandeosad;
    }


    /**
     * Sets the kande_kandeosad value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param kande_kandeosad   * Ettevõtja kande muudatuste kandeosade filter.
     */
    public void setKande_kandeosad(java.lang.String[] kande_kandeosad) {
        this.kande_kandeosad = kande_kandeosad;
    }

    public java.lang.String getKande_kandeosad(int i) {
        return this.kande_kandeosad[i];
    }

    public void setKande_kandeosad(int i, java.lang.String _value) {
        this.kande_kandeosad[i] = _value;
    }


    /**
     * Gets the kande_eelmine_staatus value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return kande_eelmine_staatus   * Ettevõtja kande muudatuste staatuse muutumisel endine staatus.
     */
    public java.lang.String getKande_eelmine_staatus() {
        return kande_eelmine_staatus;
    }


    /**
     * Sets the kande_eelmine_staatus value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param kande_eelmine_staatus   * Ettevõtja kande muudatuste staatuse muutumisel endine staatus.
     */
    public void setKande_eelmine_staatus(java.lang.String kande_eelmine_staatus) {
        this.kande_eelmine_staatus = kande_eelmine_staatus;
    }


    /**
     * Gets the kande_uus_staatus value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return kande_uus_staatus   * Ettevõtja kande muudatuste staatuse muutumisel uus staatus.
     */
    public java.lang.String getKande_uus_staatus() {
        return kande_uus_staatus;
    }


    /**
     * Sets the kande_uus_staatus value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param kande_uus_staatus   * Ettevõtja kande muudatuste staatuse muutumisel uus staatus.
     */
    public void setKande_uus_staatus(java.lang.String kande_uus_staatus) {
        this.kande_uus_staatus = kande_uus_staatus;
    }


    /**
     * Gets the tulemuste_lk value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @return tulemuste_lk   * Ettevõtja muudatuste lehekülje number. 1000 muudatust lehel.
     */
    public java.lang.Integer getTulemuste_lk() {
        return tulemuste_lk;
    }


    /**
     * Sets the tulemuste_lk value for this Ettevotja_muudatused_tasuta_paring.
     * 
     * @param tulemuste_lk   * Ettevõtja muudatuste lehekülje number. 1000 muudatust lehel.
     */
    public void setTulemuste_lk(java.lang.Integer tulemuste_lk) {
        this.tulemuste_lk = tulemuste_lk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatused_tasuta_paring)) return false;
        Ettevotja_muudatused_tasuta_paring other = (Ettevotja_muudatused_tasuta_paring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kuupaev==null && other.getKuupaev()==null) || 
             (this.kuupaev!=null &&
              this.kuupaev.equals(other.getKuupaev()))) &&
            ((this.muudatuste_valik==null && other.getMuudatuste_valik()==null) || 
             (this.muudatuste_valik!=null &&
              java.util.Arrays.equals(this.muudatuste_valik, other.getMuudatuste_valik()))) &&
            ((this.kandevalised_valik==null && other.getKandevalised_valik()==null) || 
             (this.kandevalised_valik!=null &&
              java.util.Arrays.equals(this.kandevalised_valik, other.getKandevalised_valik()))) &&
            ((this.kande_kandeliigid==null && other.getKande_kandeliigid()==null) || 
             (this.kande_kandeliigid!=null &&
              java.util.Arrays.equals(this.kande_kandeliigid, other.getKande_kandeliigid()))) &&
            ((this.kande_kandeosad==null && other.getKande_kandeosad()==null) || 
             (this.kande_kandeosad!=null &&
              java.util.Arrays.equals(this.kande_kandeosad, other.getKande_kandeosad()))) &&
            ((this.kande_eelmine_staatus==null && other.getKande_eelmine_staatus()==null) || 
             (this.kande_eelmine_staatus!=null &&
              this.kande_eelmine_staatus.equals(other.getKande_eelmine_staatus()))) &&
            ((this.kande_uus_staatus==null && other.getKande_uus_staatus()==null) || 
             (this.kande_uus_staatus!=null &&
              this.kande_uus_staatus.equals(other.getKande_uus_staatus()))) &&
            ((this.tulemuste_lk==null && other.getTulemuste_lk()==null) || 
             (this.tulemuste_lk!=null &&
              this.tulemuste_lk.equals(other.getTulemuste_lk())));
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
        if (getKuupaev() != null) {
            _hashCode += getKuupaev().hashCode();
        }
        if (getMuudatuste_valik() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMuudatuste_valik());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMuudatuste_valik(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKandevalised_valik() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKandevalised_valik());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKandevalised_valik(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKande_kandeliigid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKande_kandeliigid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKande_kandeliigid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKande_kandeosad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKande_kandeosad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKande_kandeosad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKande_eelmine_staatus() != null) {
            _hashCode += getKande_eelmine_staatus().hashCode();
        }
        if (getKande_uus_staatus() != null) {
            _hashCode += getKande_uus_staatus().hashCode();
        }
        if (getTulemuste_lk() != null) {
            _hashCode += getTulemuste_lk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
