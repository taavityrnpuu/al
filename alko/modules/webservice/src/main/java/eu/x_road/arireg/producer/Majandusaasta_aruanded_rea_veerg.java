/**
 * Majandusaasta_aruanded_rea_veerg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Majandusaasta_aruanded_rea_veerg  implements java.io.Serializable {
    /* 01 – bilanss 
     *                         08 - bilanss 
     *                         12 - bilanss 
     *                         14 - bilanss
     *                         A1 - Majandusaasta lõpul 
     *                         A2 - Majandusaasta algul 
     *                         02 - kasumiaruanne skeem 1 
     *                         09 - kasumiaruanne skeem 1 
     *                         15 - kasumiaruanne skeem 1 
     *                         A1 – Aruande majandusaastal 
     *                         A2 – Eelmisel majandusaastal 
     *                         03 - kasumiaruanne skeem 2 
     *                         10 - kasumiaruanne skeem 2 
     *                         16 - kasumiaruanne skeem 2 
     *                         A1 - Aruande majandusaastal 
     *                         A2 - Eelmisel majandusaastal 
     *                         04 - rahavoogude aruanne 
     *                         A1 - Muutus aasta jooksul 
     *                         05 - põhivara liikumine skeem 1 
     *                         A1 - Maa 
     *                         A2 - Ehitised 
     *                         A3 - Masinad ja seadmed 
     *                         A4 - Muu inventar 
     *                         A5 - Akumuleeritud kulum 
     *                         A6 - Lõpetamata ehitus 
     *                         A7 - Ettemaksed 
     *                         A8 - Kokku 
     *                         06 - põhivara liikumine skeem 2 
     *                         A1 - Aasta alguseks 
     *                         A2 - Sissetulek  ostmine 
     *                         A3 - Sissetulek  rekonstrueerimine 
     *                         A4 - Väljaminek  müük 
     *                         A5 - Väljaminek  amortiseerunud  mahakandmine
     * 
     *                         A6 - Aasta lõpuks (soetusmaksumuses) 
     *                         A7 - Akumuleeritud kulum aasta lõpuks 
     *                         A8 - Aasta lõpuks (jääkmaksumus) 
     *                         07 - tulude-kulude aruanne 
     *                         11 - tulude-kulude aruanne 
     *                         17 - tulemiaruanne 
     *                         A1 - Majandusaasta lõpul 
     *                         A2 - Majandusaasta algul 
     *                         13 - rahavoogude aruanne 
     *                         18 - rahavoogude aruanne (kaudne meetod) 
     *                         19 - rahavoogude aruanne (otsene meetod) 
     *                         A1 – Aruande majandusaastal 
     *                         A2 – Eelmisel majandusaast */
    private java.lang.String veeru_kood;

    private java.lang.String veeru_nimetus;

    private int vaartus;

    public Majandusaasta_aruanded_rea_veerg() {
    }

    public Majandusaasta_aruanded_rea_veerg(
           java.lang.String veeru_kood,
           java.lang.String veeru_nimetus,
           int vaartus) {
           this.veeru_kood = veeru_kood;
           this.veeru_nimetus = veeru_nimetus;
           this.vaartus = vaartus;
    }


    /**
     * Gets the veeru_kood value for this Majandusaasta_aruanded_rea_veerg.
     * 
     * @return veeru_kood   * 01 – bilanss 
     *                         08 - bilanss 
     *                         12 - bilanss 
     *                         14 - bilanss
     *                         A1 - Majandusaasta lõpul 
     *                         A2 - Majandusaasta algul 
     *                         02 - kasumiaruanne skeem 1 
     *                         09 - kasumiaruanne skeem 1 
     *                         15 - kasumiaruanne skeem 1 
     *                         A1 – Aruande majandusaastal 
     *                         A2 – Eelmisel majandusaastal 
     *                         03 - kasumiaruanne skeem 2 
     *                         10 - kasumiaruanne skeem 2 
     *                         16 - kasumiaruanne skeem 2 
     *                         A1 - Aruande majandusaastal 
     *                         A2 - Eelmisel majandusaastal 
     *                         04 - rahavoogude aruanne 
     *                         A1 - Muutus aasta jooksul 
     *                         05 - põhivara liikumine skeem 1 
     *                         A1 - Maa 
     *                         A2 - Ehitised 
     *                         A3 - Masinad ja seadmed 
     *                         A4 - Muu inventar 
     *                         A5 - Akumuleeritud kulum 
     *                         A6 - Lõpetamata ehitus 
     *                         A7 - Ettemaksed 
     *                         A8 - Kokku 
     *                         06 - põhivara liikumine skeem 2 
     *                         A1 - Aasta alguseks 
     *                         A2 - Sissetulek  ostmine 
     *                         A3 - Sissetulek  rekonstrueerimine 
     *                         A4 - Väljaminek  müük 
     *                         A5 - Väljaminek  amortiseerunud  mahakandmine
     * 
     *                         A6 - Aasta lõpuks (soetusmaksumuses) 
     *                         A7 - Akumuleeritud kulum aasta lõpuks 
     *                         A8 - Aasta lõpuks (jääkmaksumus) 
     *                         07 - tulude-kulude aruanne 
     *                         11 - tulude-kulude aruanne 
     *                         17 - tulemiaruanne 
     *                         A1 - Majandusaasta lõpul 
     *                         A2 - Majandusaasta algul 
     *                         13 - rahavoogude aruanne 
     *                         18 - rahavoogude aruanne (kaudne meetod) 
     *                         19 - rahavoogude aruanne (otsene meetod) 
     *                         A1 – Aruande majandusaastal 
     *                         A2 – Eelmisel majandusaast
     */
    public java.lang.String getVeeru_kood() {
        return veeru_kood;
    }


    /**
     * Sets the veeru_kood value for this Majandusaasta_aruanded_rea_veerg.
     * 
     * @param veeru_kood   * 01 – bilanss 
     *                         08 - bilanss 
     *                         12 - bilanss 
     *                         14 - bilanss
     *                         A1 - Majandusaasta lõpul 
     *                         A2 - Majandusaasta algul 
     *                         02 - kasumiaruanne skeem 1 
     *                         09 - kasumiaruanne skeem 1 
     *                         15 - kasumiaruanne skeem 1 
     *                         A1 – Aruande majandusaastal 
     *                         A2 – Eelmisel majandusaastal 
     *                         03 - kasumiaruanne skeem 2 
     *                         10 - kasumiaruanne skeem 2 
     *                         16 - kasumiaruanne skeem 2 
     *                         A1 - Aruande majandusaastal 
     *                         A2 - Eelmisel majandusaastal 
     *                         04 - rahavoogude aruanne 
     *                         A1 - Muutus aasta jooksul 
     *                         05 - põhivara liikumine skeem 1 
     *                         A1 - Maa 
     *                         A2 - Ehitised 
     *                         A3 - Masinad ja seadmed 
     *                         A4 - Muu inventar 
     *                         A5 - Akumuleeritud kulum 
     *                         A6 - Lõpetamata ehitus 
     *                         A7 - Ettemaksed 
     *                         A8 - Kokku 
     *                         06 - põhivara liikumine skeem 2 
     *                         A1 - Aasta alguseks 
     *                         A2 - Sissetulek  ostmine 
     *                         A3 - Sissetulek  rekonstrueerimine 
     *                         A4 - Väljaminek  müük 
     *                         A5 - Väljaminek  amortiseerunud  mahakandmine
     * 
     *                         A6 - Aasta lõpuks (soetusmaksumuses) 
     *                         A7 - Akumuleeritud kulum aasta lõpuks 
     *                         A8 - Aasta lõpuks (jääkmaksumus) 
     *                         07 - tulude-kulude aruanne 
     *                         11 - tulude-kulude aruanne 
     *                         17 - tulemiaruanne 
     *                         A1 - Majandusaasta lõpul 
     *                         A2 - Majandusaasta algul 
     *                         13 - rahavoogude aruanne 
     *                         18 - rahavoogude aruanne (kaudne meetod) 
     *                         19 - rahavoogude aruanne (otsene meetod) 
     *                         A1 – Aruande majandusaastal 
     *                         A2 – Eelmisel majandusaast
     */
    public void setVeeru_kood(java.lang.String veeru_kood) {
        this.veeru_kood = veeru_kood;
    }


    /**
     * Gets the veeru_nimetus value for this Majandusaasta_aruanded_rea_veerg.
     * 
     * @return veeru_nimetus
     */
    public java.lang.String getVeeru_nimetus() {
        return veeru_nimetus;
    }


    /**
     * Sets the veeru_nimetus value for this Majandusaasta_aruanded_rea_veerg.
     * 
     * @param veeru_nimetus
     */
    public void setVeeru_nimetus(java.lang.String veeru_nimetus) {
        this.veeru_nimetus = veeru_nimetus;
    }


    /**
     * Gets the vaartus value for this Majandusaasta_aruanded_rea_veerg.
     * 
     * @return vaartus
     */
    public int getVaartus() {
        return vaartus;
    }


    /**
     * Sets the vaartus value for this Majandusaasta_aruanded_rea_veerg.
     * 
     * @param vaartus
     */
    public void setVaartus(int vaartus) {
        this.vaartus = vaartus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandusaasta_aruanded_rea_veerg)) return false;
        Majandusaasta_aruanded_rea_veerg other = (Majandusaasta_aruanded_rea_veerg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.veeru_kood==null && other.getVeeru_kood()==null) || 
             (this.veeru_kood!=null &&
              this.veeru_kood.equals(other.getVeeru_kood()))) &&
            ((this.veeru_nimetus==null && other.getVeeru_nimetus()==null) || 
             (this.veeru_nimetus!=null &&
              this.veeru_nimetus.equals(other.getVeeru_nimetus()))) &&
            this.vaartus == other.getVaartus();
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
        if (getVeeru_kood() != null) {
            _hashCode += getVeeru_kood().hashCode();
        }
        if (getVeeru_nimetus() != null) {
            _hashCode += getVeeru_nimetus().hashCode();
        }
        _hashCode += getVaartus();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
