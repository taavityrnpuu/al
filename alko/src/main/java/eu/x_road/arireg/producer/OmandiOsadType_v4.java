/**
 * OmandiOsadType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;


/**
 * Omandi jagunemine - massiivi elemendi tüüp
 */
public class OmandiOsadType_v4  implements java.io.Serializable {
    /* L või E; Lisamine/Eemaldamine */
    private java.lang.String tegevus;

    /* H - Hooneühistu osa, K - kapitali jagunemine (osanikud aktsion2rid) */
    private java.lang.String liik;

    /* Osa suurus/summa. */
    private java.math.BigDecimal sissemaksu_summa;

    /* Osa valuuta */
    private java.lang.String sissemaksu_valuuta;

    /* Lihtomand, kaasomand või ühisomand. Kaasomandi ja ühisomandi
     * korral peab isikuid olema mitu. */
    private java.lang.String omandiliik;

    /* Liikmesuse number. Nt korteri või garaažiboksi number */
    private java.lang.Integer hy_liikmesus_number;

    private java.math.BigDecimal hy_liikmesus_pindala;

    private java.lang.Integer hy_liikmesus_maksumaar_lugeja;

    private java.lang.Integer hy_liikmesus_maksumaar_nimetaja;

    /* Omanike massiiv, lihtomandi korral ainult üks element, teiste
     * puhul rohkem
     *                         Aktsionäride osalused, Osanike osalused, HÜ
     * liikmesused jne... */
    private eu.x_road.arireg.producer.IsikType_v4[] isikud;

    private eu.x_road.arireg.producer.Osa_kitsendusedType_v4[] osa_kitsendused;

    public OmandiOsadType_v4() {
    }

    public OmandiOsadType_v4(
           java.lang.String tegevus,
           java.lang.String liik,
           java.math.BigDecimal sissemaksu_summa,
           java.lang.String sissemaksu_valuuta,
           java.lang.String omandiliik,
           java.lang.Integer hy_liikmesus_number,
           java.math.BigDecimal hy_liikmesus_pindala,
           java.lang.Integer hy_liikmesus_maksumaar_lugeja,
           java.lang.Integer hy_liikmesus_maksumaar_nimetaja,
           eu.x_road.arireg.producer.IsikType_v4[] isikud,
           eu.x_road.arireg.producer.Osa_kitsendusedType_v4[] osa_kitsendused) {
           this.tegevus = tegevus;
           this.liik = liik;
           this.sissemaksu_summa = sissemaksu_summa;
           this.sissemaksu_valuuta = sissemaksu_valuuta;
           this.omandiliik = omandiliik;
           this.hy_liikmesus_number = hy_liikmesus_number;
           this.hy_liikmesus_pindala = hy_liikmesus_pindala;
           this.hy_liikmesus_maksumaar_lugeja = hy_liikmesus_maksumaar_lugeja;
           this.hy_liikmesus_maksumaar_nimetaja = hy_liikmesus_maksumaar_nimetaja;
           this.isikud = isikud;
           this.osa_kitsendused = osa_kitsendused;
    }


    /**
     * Gets the tegevus value for this OmandiOsadType_v4.
     * 
     * @return tegevus   * L või E; Lisamine/Eemaldamine
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }


    /**
     * Sets the tegevus value for this OmandiOsadType_v4.
     * 
     * @param tegevus   * L või E; Lisamine/Eemaldamine
     */
    public void setTegevus(java.lang.String tegevus) {
        this.tegevus = tegevus;
    }


    /**
     * Gets the liik value for this OmandiOsadType_v4.
     * 
     * @return liik   * H - Hooneühistu osa, K - kapitali jagunemine (osanikud aktsion2rid)
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this OmandiOsadType_v4.
     * 
     * @param liik   * H - Hooneühistu osa, K - kapitali jagunemine (osanikud aktsion2rid)
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the sissemaksu_summa value for this OmandiOsadType_v4.
     * 
     * @return sissemaksu_summa   * Osa suurus/summa.
     */
    public java.math.BigDecimal getSissemaksu_summa() {
        return sissemaksu_summa;
    }


    /**
     * Sets the sissemaksu_summa value for this OmandiOsadType_v4.
     * 
     * @param sissemaksu_summa   * Osa suurus/summa.
     */
    public void setSissemaksu_summa(java.math.BigDecimal sissemaksu_summa) {
        this.sissemaksu_summa = sissemaksu_summa;
    }


    /**
     * Gets the sissemaksu_valuuta value for this OmandiOsadType_v4.
     * 
     * @return sissemaksu_valuuta   * Osa valuuta
     */
    public java.lang.String getSissemaksu_valuuta() {
        return sissemaksu_valuuta;
    }


    /**
     * Sets the sissemaksu_valuuta value for this OmandiOsadType_v4.
     * 
     * @param sissemaksu_valuuta   * Osa valuuta
     */
    public void setSissemaksu_valuuta(java.lang.String sissemaksu_valuuta) {
        this.sissemaksu_valuuta = sissemaksu_valuuta;
    }


    /**
     * Gets the omandiliik value for this OmandiOsadType_v4.
     * 
     * @return omandiliik   * Lihtomand, kaasomand või ühisomand. Kaasomandi ja ühisomandi
     * korral peab isikuid olema mitu.
     */
    public java.lang.String getOmandiliik() {
        return omandiliik;
    }


    /**
     * Sets the omandiliik value for this OmandiOsadType_v4.
     * 
     * @param omandiliik   * Lihtomand, kaasomand või ühisomand. Kaasomandi ja ühisomandi
     * korral peab isikuid olema mitu.
     */
    public void setOmandiliik(java.lang.String omandiliik) {
        this.omandiliik = omandiliik;
    }


    /**
     * Gets the hy_liikmesus_number value for this OmandiOsadType_v4.
     * 
     * @return hy_liikmesus_number   * Liikmesuse number. Nt korteri või garaažiboksi number
     */
    public java.lang.Integer getHy_liikmesus_number() {
        return hy_liikmesus_number;
    }


    /**
     * Sets the hy_liikmesus_number value for this OmandiOsadType_v4.
     * 
     * @param hy_liikmesus_number   * Liikmesuse number. Nt korteri või garaažiboksi number
     */
    public void setHy_liikmesus_number(java.lang.Integer hy_liikmesus_number) {
        this.hy_liikmesus_number = hy_liikmesus_number;
    }


    /**
     * Gets the hy_liikmesus_pindala value for this OmandiOsadType_v4.
     * 
     * @return hy_liikmesus_pindala
     */
    public java.math.BigDecimal getHy_liikmesus_pindala() {
        return hy_liikmesus_pindala;
    }


    /**
     * Sets the hy_liikmesus_pindala value for this OmandiOsadType_v4.
     * 
     * @param hy_liikmesus_pindala
     */
    public void setHy_liikmesus_pindala(java.math.BigDecimal hy_liikmesus_pindala) {
        this.hy_liikmesus_pindala = hy_liikmesus_pindala;
    }


    /**
     * Gets the hy_liikmesus_maksumaar_lugeja value for this OmandiOsadType_v4.
     * 
     * @return hy_liikmesus_maksumaar_lugeja
     */
    public java.lang.Integer getHy_liikmesus_maksumaar_lugeja() {
        return hy_liikmesus_maksumaar_lugeja;
    }


    /**
     * Sets the hy_liikmesus_maksumaar_lugeja value for this OmandiOsadType_v4.
     * 
     * @param hy_liikmesus_maksumaar_lugeja
     */
    public void setHy_liikmesus_maksumaar_lugeja(java.lang.Integer hy_liikmesus_maksumaar_lugeja) {
        this.hy_liikmesus_maksumaar_lugeja = hy_liikmesus_maksumaar_lugeja;
    }


    /**
     * Gets the hy_liikmesus_maksumaar_nimetaja value for this OmandiOsadType_v4.
     * 
     * @return hy_liikmesus_maksumaar_nimetaja
     */
    public java.lang.Integer getHy_liikmesus_maksumaar_nimetaja() {
        return hy_liikmesus_maksumaar_nimetaja;
    }


    /**
     * Sets the hy_liikmesus_maksumaar_nimetaja value for this OmandiOsadType_v4.
     * 
     * @param hy_liikmesus_maksumaar_nimetaja
     */
    public void setHy_liikmesus_maksumaar_nimetaja(java.lang.Integer hy_liikmesus_maksumaar_nimetaja) {
        this.hy_liikmesus_maksumaar_nimetaja = hy_liikmesus_maksumaar_nimetaja;
    }


    /**
     * Gets the isikud value for this OmandiOsadType_v4.
     * 
     * @return isikud   * Omanike massiiv, lihtomandi korral ainult üks element, teiste
     * puhul rohkem
     *                         Aktsionäride osalused, Osanike osalused, HÜ
     * liikmesused jne...
     */
    public eu.x_road.arireg.producer.IsikType_v4[] getIsikud() {
        return isikud;
    }


    /**
     * Sets the isikud value for this OmandiOsadType_v4.
     * 
     * @param isikud   * Omanike massiiv, lihtomandi korral ainult üks element, teiste
     * puhul rohkem
     *                         Aktsionäride osalused, Osanike osalused, HÜ
     * liikmesused jne...
     */
    public void setIsikud(eu.x_road.arireg.producer.IsikType_v4[] isikud) {
        this.isikud = isikud;
    }

    public eu.x_road.arireg.producer.IsikType_v4 getIsikud(int i) {
        return this.isikud[i];
    }

    public void setIsikud(int i, eu.x_road.arireg.producer.IsikType_v4 _value) {
        this.isikud[i] = _value;
    }


    /**
     * Gets the osa_kitsendused value for this OmandiOsadType_v4.
     * 
     * @return osa_kitsendused
     */
    public eu.x_road.arireg.producer.Osa_kitsendusedType_v4[] getOsa_kitsendused() {
        return osa_kitsendused;
    }


    /**
     * Sets the osa_kitsendused value for this OmandiOsadType_v4.
     * 
     * @param osa_kitsendused
     */
    public void setOsa_kitsendused(eu.x_road.arireg.producer.Osa_kitsendusedType_v4[] osa_kitsendused) {
        this.osa_kitsendused = osa_kitsendused;
    }

    public eu.x_road.arireg.producer.Osa_kitsendusedType_v4 getOsa_kitsendused(int i) {
        return this.osa_kitsendused[i];
    }

    public void setOsa_kitsendused(int i, eu.x_road.arireg.producer.Osa_kitsendusedType_v4 _value) {
        this.osa_kitsendused[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OmandiOsadType_v4)) return false;
        OmandiOsadType_v4 other = (OmandiOsadType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tegevus==null && other.getTegevus()==null) || 
             (this.tegevus!=null &&
              this.tegevus.equals(other.getTegevus()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.sissemaksu_summa==null && other.getSissemaksu_summa()==null) || 
             (this.sissemaksu_summa!=null &&
              this.sissemaksu_summa.equals(other.getSissemaksu_summa()))) &&
            ((this.sissemaksu_valuuta==null && other.getSissemaksu_valuuta()==null) || 
             (this.sissemaksu_valuuta!=null &&
              this.sissemaksu_valuuta.equals(other.getSissemaksu_valuuta()))) &&
            ((this.omandiliik==null && other.getOmandiliik()==null) || 
             (this.omandiliik!=null &&
              this.omandiliik.equals(other.getOmandiliik()))) &&
            ((this.hy_liikmesus_number==null && other.getHy_liikmesus_number()==null) || 
             (this.hy_liikmesus_number!=null &&
              this.hy_liikmesus_number.equals(other.getHy_liikmesus_number()))) &&
            ((this.hy_liikmesus_pindala==null && other.getHy_liikmesus_pindala()==null) || 
             (this.hy_liikmesus_pindala!=null &&
              this.hy_liikmesus_pindala.equals(other.getHy_liikmesus_pindala()))) &&
            ((this.hy_liikmesus_maksumaar_lugeja==null && other.getHy_liikmesus_maksumaar_lugeja()==null) || 
             (this.hy_liikmesus_maksumaar_lugeja!=null &&
              this.hy_liikmesus_maksumaar_lugeja.equals(other.getHy_liikmesus_maksumaar_lugeja()))) &&
            ((this.hy_liikmesus_maksumaar_nimetaja==null && other.getHy_liikmesus_maksumaar_nimetaja()==null) || 
             (this.hy_liikmesus_maksumaar_nimetaja!=null &&
              this.hy_liikmesus_maksumaar_nimetaja.equals(other.getHy_liikmesus_maksumaar_nimetaja()))) &&
            ((this.isikud==null && other.getIsikud()==null) || 
             (this.isikud!=null &&
              java.util.Arrays.equals(this.isikud, other.getIsikud()))) &&
            ((this.osa_kitsendused==null && other.getOsa_kitsendused()==null) || 
             (this.osa_kitsendused!=null &&
              java.util.Arrays.equals(this.osa_kitsendused, other.getOsa_kitsendused())));
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
        if (getTegevus() != null) {
            _hashCode += getTegevus().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getSissemaksu_summa() != null) {
            _hashCode += getSissemaksu_summa().hashCode();
        }
        if (getSissemaksu_valuuta() != null) {
            _hashCode += getSissemaksu_valuuta().hashCode();
        }
        if (getOmandiliik() != null) {
            _hashCode += getOmandiliik().hashCode();
        }
        if (getHy_liikmesus_number() != null) {
            _hashCode += getHy_liikmesus_number().hashCode();
        }
        if (getHy_liikmesus_pindala() != null) {
            _hashCode += getHy_liikmesus_pindala().hashCode();
        }
        if (getHy_liikmesus_maksumaar_lugeja() != null) {
            _hashCode += getHy_liikmesus_maksumaar_lugeja().hashCode();
        }
        if (getHy_liikmesus_maksumaar_nimetaja() != null) {
            _hashCode += getHy_liikmesus_maksumaar_nimetaja().hashCode();
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
        if (getOsa_kitsendused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOsa_kitsendused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOsa_kitsendused(), i);
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
