/**
 * FokaHooldajaVastusFoka_hooldaja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class FokaHooldajaVastusFoka_hooldaja  implements java.io.Serializable {
    private java.lang.String isikukood;

    private java.lang.String nimi;

    private java.lang.String epost;

    private java.lang.String telefon;

    private ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaTuletorje tuletorje;

    private ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaKliima kliima;

    private ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote[] seotud_ettevotted;

    public FokaHooldajaVastusFoka_hooldaja() {
    }

    public FokaHooldajaVastusFoka_hooldaja(
           java.lang.String isikukood,
           java.lang.String nimi,
           java.lang.String epost,
           java.lang.String telefon,
           ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaTuletorje tuletorje,
           ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaKliima kliima,
           ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote[] seotud_ettevotted) {
           this.isikukood = isikukood;
           this.nimi = nimi;
           this.epost = epost;
           this.telefon = telefon;
           this.tuletorje = tuletorje;
           this.kliima = kliima;
           this.seotud_ettevotted = seotud_ettevotted;
    }


    /**
     * Gets the isikukood value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the nimi value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the epost value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return epost
     */
    public java.lang.String getEpost() {
        return epost;
    }


    /**
     * Sets the epost value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param epost
     */
    public void setEpost(java.lang.String epost) {
        this.epost = epost;
    }


    /**
     * Gets the telefon value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return telefon
     */
    public java.lang.String getTelefon() {
        return telefon;
    }


    /**
     * Sets the telefon value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }


    /**
     * Gets the tuletorje value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return tuletorje
     */
    public ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaTuletorje getTuletorje() {
        return tuletorje;
    }


    /**
     * Sets the tuletorje value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param tuletorje
     */
    public void setTuletorje(ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaTuletorje tuletorje) {
        this.tuletorje = tuletorje;
    }


    /**
     * Gets the kliima value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return kliima
     */
    public ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaKliima getKliima() {
        return kliima;
    }


    /**
     * Sets the kliima value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param kliima
     */
    public void setKliima(ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaKliima kliima) {
        this.kliima = kliima;
    }


    /**
     * Gets the seotud_ettevotted value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @return seotud_ettevotted
     */
    public ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote[] getSeotud_ettevotted() {
        return seotud_ettevotted;
    }


    /**
     * Sets the seotud_ettevotted value for this FokaHooldajaVastusFoka_hooldaja.
     * 
     * @param seotud_ettevotted
     */
    public void setSeotud_ettevotted(ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote[] seotud_ettevotted) {
        this.seotud_ettevotted = seotud_ettevotted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FokaHooldajaVastusFoka_hooldaja)) return false;
        FokaHooldajaVastusFoka_hooldaja other = (FokaHooldajaVastusFoka_hooldaja) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.epost==null && other.getEpost()==null) || 
             (this.epost!=null &&
              this.epost.equals(other.getEpost()))) &&
            ((this.telefon==null && other.getTelefon()==null) || 
             (this.telefon!=null &&
              this.telefon.equals(other.getTelefon()))) &&
            ((this.tuletorje==null && other.getTuletorje()==null) || 
             (this.tuletorje!=null &&
              this.tuletorje.equals(other.getTuletorje()))) &&
            ((this.kliima==null && other.getKliima()==null) || 
             (this.kliima!=null &&
              this.kliima.equals(other.getKliima()))) &&
            ((this.seotud_ettevotted==null && other.getSeotud_ettevotted()==null) || 
             (this.seotud_ettevotted!=null &&
              java.util.Arrays.equals(this.seotud_ettevotted, other.getSeotud_ettevotted())));
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
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getEpost() != null) {
            _hashCode += getEpost().hashCode();
        }
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        if (getTuletorje() != null) {
            _hashCode += getTuletorje().hashCode();
        }
        if (getKliima() != null) {
            _hashCode += getKliima().hashCode();
        }
        if (getSeotud_ettevotted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeotud_ettevotted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeotud_ettevotted(), i);
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
