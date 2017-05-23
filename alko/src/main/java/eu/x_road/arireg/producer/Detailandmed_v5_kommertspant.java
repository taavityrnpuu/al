/**
 * Detailandmed_v5_kommertspant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_kommertspant  implements java.io.Serializable {
    private java.math.BigInteger kirje_id;

    private java.math.BigInteger kaardi_piirkond;

    private java.math.BigInteger kaardi_nr;

    private java.lang.String kaardi_tyyp;

    private java.math.BigInteger kande_nr;

    private java.lang.String pandi_id;

    private java.lang.String pandi_number;

    private java.lang.String pandi_olek;

    private java.lang.String pandi_olek_tekstina;

    private java.lang.String pandi_jarjekoht;

    private java.lang.String pandi_jarjekoht_tekstina;

    private java.lang.String pandi_summa;

    private java.lang.String pandi_valuuta;

    private java.lang.String pandi_valuuta_tekstina;

    private java.util.Date algus_kpv;

    private java.util.Date lopp_kpv;

    private eu.x_road.arireg.producer.Detailandmed_v5_kp_jarjekoht[] jarjekohad;

    private eu.x_road.arireg.producer.Detailandmed_v5_kp_pandisumma[] pandisummad;

    private eu.x_road.arireg.producer.Detailandmed_v5_kp_pandipidaja[] pandipidajad;

    private eu.x_road.arireg.producer.Detailandmed_v5_kp_markus[] markused;

    public Detailandmed_v5_kommertspant() {
    }

    public Detailandmed_v5_kommertspant(
           java.math.BigInteger kirje_id,
           java.math.BigInteger kaardi_piirkond,
           java.math.BigInteger kaardi_nr,
           java.lang.String kaardi_tyyp,
           java.math.BigInteger kande_nr,
           java.lang.String pandi_id,
           java.lang.String pandi_number,
           java.lang.String pandi_olek,
           java.lang.String pandi_olek_tekstina,
           java.lang.String pandi_jarjekoht,
           java.lang.String pandi_jarjekoht_tekstina,
           java.lang.String pandi_summa,
           java.lang.String pandi_valuuta,
           java.lang.String pandi_valuuta_tekstina,
           java.util.Date algus_kpv,
           java.util.Date lopp_kpv,
           eu.x_road.arireg.producer.Detailandmed_v5_kp_jarjekoht[] jarjekohad,
           eu.x_road.arireg.producer.Detailandmed_v5_kp_pandisumma[] pandisummad,
           eu.x_road.arireg.producer.Detailandmed_v5_kp_pandipidaja[] pandipidajad,
           eu.x_road.arireg.producer.Detailandmed_v5_kp_markus[] markused) {
           this.kirje_id = kirje_id;
           this.kaardi_piirkond = kaardi_piirkond;
           this.kaardi_nr = kaardi_nr;
           this.kaardi_tyyp = kaardi_tyyp;
           this.kande_nr = kande_nr;
           this.pandi_id = pandi_id;
           this.pandi_number = pandi_number;
           this.pandi_olek = pandi_olek;
           this.pandi_olek_tekstina = pandi_olek_tekstina;
           this.pandi_jarjekoht = pandi_jarjekoht;
           this.pandi_jarjekoht_tekstina = pandi_jarjekoht_tekstina;
           this.pandi_summa = pandi_summa;
           this.pandi_valuuta = pandi_valuuta;
           this.pandi_valuuta_tekstina = pandi_valuuta_tekstina;
           this.algus_kpv = algus_kpv;
           this.lopp_kpv = lopp_kpv;
           this.jarjekohad = jarjekohad;
           this.pandisummad = pandisummad;
           this.pandipidajad = pandipidajad;
           this.markused = markused;
    }


    /**
     * Gets the kirje_id value for this Detailandmed_v5_kommertspant.
     * 
     * @return kirje_id
     */
    public java.math.BigInteger getKirje_id() {
        return kirje_id;
    }


    /**
     * Sets the kirje_id value for this Detailandmed_v5_kommertspant.
     * 
     * @param kirje_id
     */
    public void setKirje_id(java.math.BigInteger kirje_id) {
        this.kirje_id = kirje_id;
    }


    /**
     * Gets the kaardi_piirkond value for this Detailandmed_v5_kommertspant.
     * 
     * @return kaardi_piirkond
     */
    public java.math.BigInteger getKaardi_piirkond() {
        return kaardi_piirkond;
    }


    /**
     * Sets the kaardi_piirkond value for this Detailandmed_v5_kommertspant.
     * 
     * @param kaardi_piirkond
     */
    public void setKaardi_piirkond(java.math.BigInteger kaardi_piirkond) {
        this.kaardi_piirkond = kaardi_piirkond;
    }


    /**
     * Gets the kaardi_nr value for this Detailandmed_v5_kommertspant.
     * 
     * @return kaardi_nr
     */
    public java.math.BigInteger getKaardi_nr() {
        return kaardi_nr;
    }


    /**
     * Sets the kaardi_nr value for this Detailandmed_v5_kommertspant.
     * 
     * @param kaardi_nr
     */
    public void setKaardi_nr(java.math.BigInteger kaardi_nr) {
        this.kaardi_nr = kaardi_nr;
    }


    /**
     * Gets the kaardi_tyyp value for this Detailandmed_v5_kommertspant.
     * 
     * @return kaardi_tyyp
     */
    public java.lang.String getKaardi_tyyp() {
        return kaardi_tyyp;
    }


    /**
     * Sets the kaardi_tyyp value for this Detailandmed_v5_kommertspant.
     * 
     * @param kaardi_tyyp
     */
    public void setKaardi_tyyp(java.lang.String kaardi_tyyp) {
        this.kaardi_tyyp = kaardi_tyyp;
    }


    /**
     * Gets the kande_nr value for this Detailandmed_v5_kommertspant.
     * 
     * @return kande_nr
     */
    public java.math.BigInteger getKande_nr() {
        return kande_nr;
    }


    /**
     * Sets the kande_nr value for this Detailandmed_v5_kommertspant.
     * 
     * @param kande_nr
     */
    public void setKande_nr(java.math.BigInteger kande_nr) {
        this.kande_nr = kande_nr;
    }


    /**
     * Gets the pandi_id value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_id
     */
    public java.lang.String getPandi_id() {
        return pandi_id;
    }


    /**
     * Sets the pandi_id value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_id
     */
    public void setPandi_id(java.lang.String pandi_id) {
        this.pandi_id = pandi_id;
    }


    /**
     * Gets the pandi_number value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_number
     */
    public java.lang.String getPandi_number() {
        return pandi_number;
    }


    /**
     * Sets the pandi_number value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_number
     */
    public void setPandi_number(java.lang.String pandi_number) {
        this.pandi_number = pandi_number;
    }


    /**
     * Gets the pandi_olek value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_olek
     */
    public java.lang.String getPandi_olek() {
        return pandi_olek;
    }


    /**
     * Sets the pandi_olek value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_olek
     */
    public void setPandi_olek(java.lang.String pandi_olek) {
        this.pandi_olek = pandi_olek;
    }


    /**
     * Gets the pandi_olek_tekstina value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_olek_tekstina
     */
    public java.lang.String getPandi_olek_tekstina() {
        return pandi_olek_tekstina;
    }


    /**
     * Sets the pandi_olek_tekstina value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_olek_tekstina
     */
    public void setPandi_olek_tekstina(java.lang.String pandi_olek_tekstina) {
        this.pandi_olek_tekstina = pandi_olek_tekstina;
    }


    /**
     * Gets the pandi_jarjekoht value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_jarjekoht
     */
    public java.lang.String getPandi_jarjekoht() {
        return pandi_jarjekoht;
    }


    /**
     * Sets the pandi_jarjekoht value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_jarjekoht
     */
    public void setPandi_jarjekoht(java.lang.String pandi_jarjekoht) {
        this.pandi_jarjekoht = pandi_jarjekoht;
    }


    /**
     * Gets the pandi_jarjekoht_tekstina value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_jarjekoht_tekstina
     */
    public java.lang.String getPandi_jarjekoht_tekstina() {
        return pandi_jarjekoht_tekstina;
    }


    /**
     * Sets the pandi_jarjekoht_tekstina value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_jarjekoht_tekstina
     */
    public void setPandi_jarjekoht_tekstina(java.lang.String pandi_jarjekoht_tekstina) {
        this.pandi_jarjekoht_tekstina = pandi_jarjekoht_tekstina;
    }


    /**
     * Gets the pandi_summa value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_summa
     */
    public java.lang.String getPandi_summa() {
        return pandi_summa;
    }


    /**
     * Sets the pandi_summa value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_summa
     */
    public void setPandi_summa(java.lang.String pandi_summa) {
        this.pandi_summa = pandi_summa;
    }


    /**
     * Gets the pandi_valuuta value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_valuuta
     */
    public java.lang.String getPandi_valuuta() {
        return pandi_valuuta;
    }


    /**
     * Sets the pandi_valuuta value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_valuuta
     */
    public void setPandi_valuuta(java.lang.String pandi_valuuta) {
        this.pandi_valuuta = pandi_valuuta;
    }


    /**
     * Gets the pandi_valuuta_tekstina value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandi_valuuta_tekstina
     */
    public java.lang.String getPandi_valuuta_tekstina() {
        return pandi_valuuta_tekstina;
    }


    /**
     * Sets the pandi_valuuta_tekstina value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandi_valuuta_tekstina
     */
    public void setPandi_valuuta_tekstina(java.lang.String pandi_valuuta_tekstina) {
        this.pandi_valuuta_tekstina = pandi_valuuta_tekstina;
    }


    /**
     * Gets the algus_kpv value for this Detailandmed_v5_kommertspant.
     * 
     * @return algus_kpv
     */
    public java.util.Date getAlgus_kpv() {
        return algus_kpv;
    }


    /**
     * Sets the algus_kpv value for this Detailandmed_v5_kommertspant.
     * 
     * @param algus_kpv
     */
    public void setAlgus_kpv(java.util.Date algus_kpv) {
        this.algus_kpv = algus_kpv;
    }


    /**
     * Gets the lopp_kpv value for this Detailandmed_v5_kommertspant.
     * 
     * @return lopp_kpv
     */
    public java.util.Date getLopp_kpv() {
        return lopp_kpv;
    }


    /**
     * Sets the lopp_kpv value for this Detailandmed_v5_kommertspant.
     * 
     * @param lopp_kpv
     */
    public void setLopp_kpv(java.util.Date lopp_kpv) {
        this.lopp_kpv = lopp_kpv;
    }


    /**
     * Gets the jarjekohad value for this Detailandmed_v5_kommertspant.
     * 
     * @return jarjekohad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kp_jarjekoht[] getJarjekohad() {
        return jarjekohad;
    }


    /**
     * Sets the jarjekohad value for this Detailandmed_v5_kommertspant.
     * 
     * @param jarjekohad
     */
    public void setJarjekohad(eu.x_road.arireg.producer.Detailandmed_v5_kp_jarjekoht[] jarjekohad) {
        this.jarjekohad = jarjekohad;
    }


    /**
     * Gets the pandisummad value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandisummad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kp_pandisumma[] getPandisummad() {
        return pandisummad;
    }


    /**
     * Sets the pandisummad value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandisummad
     */
    public void setPandisummad(eu.x_road.arireg.producer.Detailandmed_v5_kp_pandisumma[] pandisummad) {
        this.pandisummad = pandisummad;
    }


    /**
     * Gets the pandipidajad value for this Detailandmed_v5_kommertspant.
     * 
     * @return pandipidajad
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kp_pandipidaja[] getPandipidajad() {
        return pandipidajad;
    }


    /**
     * Sets the pandipidajad value for this Detailandmed_v5_kommertspant.
     * 
     * @param pandipidajad
     */
    public void setPandipidajad(eu.x_road.arireg.producer.Detailandmed_v5_kp_pandipidaja[] pandipidajad) {
        this.pandipidajad = pandipidajad;
    }


    /**
     * Gets the markused value for this Detailandmed_v5_kommertspant.
     * 
     * @return markused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kp_markus[] getMarkused() {
        return markused;
    }


    /**
     * Sets the markused value for this Detailandmed_v5_kommertspant.
     * 
     * @param markused
     */
    public void setMarkused(eu.x_road.arireg.producer.Detailandmed_v5_kp_markus[] markused) {
        this.markused = markused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_kommertspant)) return false;
        Detailandmed_v5_kommertspant other = (Detailandmed_v5_kommertspant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kirje_id==null && other.getKirje_id()==null) || 
             (this.kirje_id!=null &&
              this.kirje_id.equals(other.getKirje_id()))) &&
            ((this.kaardi_piirkond==null && other.getKaardi_piirkond()==null) || 
             (this.kaardi_piirkond!=null &&
              this.kaardi_piirkond.equals(other.getKaardi_piirkond()))) &&
            ((this.kaardi_nr==null && other.getKaardi_nr()==null) || 
             (this.kaardi_nr!=null &&
              this.kaardi_nr.equals(other.getKaardi_nr()))) &&
            ((this.kaardi_tyyp==null && other.getKaardi_tyyp()==null) || 
             (this.kaardi_tyyp!=null &&
              this.kaardi_tyyp.equals(other.getKaardi_tyyp()))) &&
            ((this.kande_nr==null && other.getKande_nr()==null) || 
             (this.kande_nr!=null &&
              this.kande_nr.equals(other.getKande_nr()))) &&
            ((this.pandi_id==null && other.getPandi_id()==null) || 
             (this.pandi_id!=null &&
              this.pandi_id.equals(other.getPandi_id()))) &&
            ((this.pandi_number==null && other.getPandi_number()==null) || 
             (this.pandi_number!=null &&
              this.pandi_number.equals(other.getPandi_number()))) &&
            ((this.pandi_olek==null && other.getPandi_olek()==null) || 
             (this.pandi_olek!=null &&
              this.pandi_olek.equals(other.getPandi_olek()))) &&
            ((this.pandi_olek_tekstina==null && other.getPandi_olek_tekstina()==null) || 
             (this.pandi_olek_tekstina!=null &&
              this.pandi_olek_tekstina.equals(other.getPandi_olek_tekstina()))) &&
            ((this.pandi_jarjekoht==null && other.getPandi_jarjekoht()==null) || 
             (this.pandi_jarjekoht!=null &&
              this.pandi_jarjekoht.equals(other.getPandi_jarjekoht()))) &&
            ((this.pandi_jarjekoht_tekstina==null && other.getPandi_jarjekoht_tekstina()==null) || 
             (this.pandi_jarjekoht_tekstina!=null &&
              this.pandi_jarjekoht_tekstina.equals(other.getPandi_jarjekoht_tekstina()))) &&
            ((this.pandi_summa==null && other.getPandi_summa()==null) || 
             (this.pandi_summa!=null &&
              this.pandi_summa.equals(other.getPandi_summa()))) &&
            ((this.pandi_valuuta==null && other.getPandi_valuuta()==null) || 
             (this.pandi_valuuta!=null &&
              this.pandi_valuuta.equals(other.getPandi_valuuta()))) &&
            ((this.pandi_valuuta_tekstina==null && other.getPandi_valuuta_tekstina()==null) || 
             (this.pandi_valuuta_tekstina!=null &&
              this.pandi_valuuta_tekstina.equals(other.getPandi_valuuta_tekstina()))) &&
            ((this.algus_kpv==null && other.getAlgus_kpv()==null) || 
             (this.algus_kpv!=null &&
              this.algus_kpv.equals(other.getAlgus_kpv()))) &&
            ((this.lopp_kpv==null && other.getLopp_kpv()==null) || 
             (this.lopp_kpv!=null &&
              this.lopp_kpv.equals(other.getLopp_kpv()))) &&
            ((this.jarjekohad==null && other.getJarjekohad()==null) || 
             (this.jarjekohad!=null &&
              java.util.Arrays.equals(this.jarjekohad, other.getJarjekohad()))) &&
            ((this.pandisummad==null && other.getPandisummad()==null) || 
             (this.pandisummad!=null &&
              java.util.Arrays.equals(this.pandisummad, other.getPandisummad()))) &&
            ((this.pandipidajad==null && other.getPandipidajad()==null) || 
             (this.pandipidajad!=null &&
              java.util.Arrays.equals(this.pandipidajad, other.getPandipidajad()))) &&
            ((this.markused==null && other.getMarkused()==null) || 
             (this.markused!=null &&
              java.util.Arrays.equals(this.markused, other.getMarkused())));
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
        if (getKirje_id() != null) {
            _hashCode += getKirje_id().hashCode();
        }
        if (getKaardi_piirkond() != null) {
            _hashCode += getKaardi_piirkond().hashCode();
        }
        if (getKaardi_nr() != null) {
            _hashCode += getKaardi_nr().hashCode();
        }
        if (getKaardi_tyyp() != null) {
            _hashCode += getKaardi_tyyp().hashCode();
        }
        if (getKande_nr() != null) {
            _hashCode += getKande_nr().hashCode();
        }
        if (getPandi_id() != null) {
            _hashCode += getPandi_id().hashCode();
        }
        if (getPandi_number() != null) {
            _hashCode += getPandi_number().hashCode();
        }
        if (getPandi_olek() != null) {
            _hashCode += getPandi_olek().hashCode();
        }
        if (getPandi_olek_tekstina() != null) {
            _hashCode += getPandi_olek_tekstina().hashCode();
        }
        if (getPandi_jarjekoht() != null) {
            _hashCode += getPandi_jarjekoht().hashCode();
        }
        if (getPandi_jarjekoht_tekstina() != null) {
            _hashCode += getPandi_jarjekoht_tekstina().hashCode();
        }
        if (getPandi_summa() != null) {
            _hashCode += getPandi_summa().hashCode();
        }
        if (getPandi_valuuta() != null) {
            _hashCode += getPandi_valuuta().hashCode();
        }
        if (getPandi_valuuta_tekstina() != null) {
            _hashCode += getPandi_valuuta_tekstina().hashCode();
        }
        if (getAlgus_kpv() != null) {
            _hashCode += getAlgus_kpv().hashCode();
        }
        if (getLopp_kpv() != null) {
            _hashCode += getLopp_kpv().hashCode();
        }
        if (getJarjekohad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJarjekohad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJarjekohad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPandisummad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPandisummad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPandisummad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPandipidajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPandipidajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPandipidajad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarkused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkused(), i);
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
