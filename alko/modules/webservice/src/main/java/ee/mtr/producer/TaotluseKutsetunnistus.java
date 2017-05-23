/**
 * TaotluseKutsetunnistus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseKutsetunnistus  implements java.io.Serializable {
    private boolean detailne;

    private java.lang.String registrinumber;

    private java.lang.String isikukood;

    private java.lang.String nimi;

    private java.lang.String kvalifikatsioon;

    private java.lang.String valdkond;

    private java.lang.String valjaandja;

    private java.util.Date valja_antud;

    private java.util.Date kehtib_alates;

    private java.util.Date kehtib_kuni;

    private boolean kehtetu;

    private java.lang.String kompetentsid;

    public TaotluseKutsetunnistus() {
    }

    public TaotluseKutsetunnistus(
           boolean detailne,
           java.lang.String registrinumber,
           java.lang.String isikukood,
           java.lang.String nimi,
           java.lang.String kvalifikatsioon,
           java.lang.String valdkond,
           java.lang.String valjaandja,
           java.util.Date valja_antud,
           java.util.Date kehtib_alates,
           java.util.Date kehtib_kuni,
           boolean kehtetu,
           java.lang.String kompetentsid) {
           this.detailne = detailne;
           this.registrinumber = registrinumber;
           this.isikukood = isikukood;
           this.nimi = nimi;
           this.kvalifikatsioon = kvalifikatsioon;
           this.valdkond = valdkond;
           this.valjaandja = valjaandja;
           this.valja_antud = valja_antud;
           this.kehtib_alates = kehtib_alates;
           this.kehtib_kuni = kehtib_kuni;
           this.kehtetu = kehtetu;
           this.kompetentsid = kompetentsid;
    }


    /**
     * Gets the detailne value for this TaotluseKutsetunnistus.
     * 
     * @return detailne
     */
    public boolean isDetailne() {
        return detailne;
    }


    /**
     * Sets the detailne value for this TaotluseKutsetunnistus.
     * 
     * @param detailne
     */
    public void setDetailne(boolean detailne) {
        this.detailne = detailne;
    }


    /**
     * Gets the registrinumber value for this TaotluseKutsetunnistus.
     * 
     * @return registrinumber
     */
    public java.lang.String getRegistrinumber() {
        return registrinumber;
    }


    /**
     * Sets the registrinumber value for this TaotluseKutsetunnistus.
     * 
     * @param registrinumber
     */
    public void setRegistrinumber(java.lang.String registrinumber) {
        this.registrinumber = registrinumber;
    }


    /**
     * Gets the isikukood value for this TaotluseKutsetunnistus.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this TaotluseKutsetunnistus.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the nimi value for this TaotluseKutsetunnistus.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseKutsetunnistus.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kvalifikatsioon value for this TaotluseKutsetunnistus.
     * 
     * @return kvalifikatsioon
     */
    public java.lang.String getKvalifikatsioon() {
        return kvalifikatsioon;
    }


    /**
     * Sets the kvalifikatsioon value for this TaotluseKutsetunnistus.
     * 
     * @param kvalifikatsioon
     */
    public void setKvalifikatsioon(java.lang.String kvalifikatsioon) {
        this.kvalifikatsioon = kvalifikatsioon;
    }


    /**
     * Gets the valdkond value for this TaotluseKutsetunnistus.
     * 
     * @return valdkond
     */
    public java.lang.String getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this TaotluseKutsetunnistus.
     * 
     * @param valdkond
     */
    public void setValdkond(java.lang.String valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the valjaandja value for this TaotluseKutsetunnistus.
     * 
     * @return valjaandja
     */
    public java.lang.String getValjaandja() {
        return valjaandja;
    }


    /**
     * Sets the valjaandja value for this TaotluseKutsetunnistus.
     * 
     * @param valjaandja
     */
    public void setValjaandja(java.lang.String valjaandja) {
        this.valjaandja = valjaandja;
    }


    /**
     * Gets the valja_antud value for this TaotluseKutsetunnistus.
     * 
     * @return valja_antud
     */
    public java.util.Date getValja_antud() {
        return valja_antud;
    }


    /**
     * Sets the valja_antud value for this TaotluseKutsetunnistus.
     * 
     * @param valja_antud
     */
    public void setValja_antud(java.util.Date valja_antud) {
        this.valja_antud = valja_antud;
    }


    /**
     * Gets the kehtib_alates value for this TaotluseKutsetunnistus.
     * 
     * @return kehtib_alates
     */
    public java.util.Date getKehtib_alates() {
        return kehtib_alates;
    }


    /**
     * Sets the kehtib_alates value for this TaotluseKutsetunnistus.
     * 
     * @param kehtib_alates
     */
    public void setKehtib_alates(java.util.Date kehtib_alates) {
        this.kehtib_alates = kehtib_alates;
    }


    /**
     * Gets the kehtib_kuni value for this TaotluseKutsetunnistus.
     * 
     * @return kehtib_kuni
     */
    public java.util.Date getKehtib_kuni() {
        return kehtib_kuni;
    }


    /**
     * Sets the kehtib_kuni value for this TaotluseKutsetunnistus.
     * 
     * @param kehtib_kuni
     */
    public void setKehtib_kuni(java.util.Date kehtib_kuni) {
        this.kehtib_kuni = kehtib_kuni;
    }


    /**
     * Gets the kehtetu value for this TaotluseKutsetunnistus.
     * 
     * @return kehtetu
     */
    public boolean isKehtetu() {
        return kehtetu;
    }


    /**
     * Sets the kehtetu value for this TaotluseKutsetunnistus.
     * 
     * @param kehtetu
     */
    public void setKehtetu(boolean kehtetu) {
        this.kehtetu = kehtetu;
    }


    /**
     * Gets the kompetentsid value for this TaotluseKutsetunnistus.
     * 
     * @return kompetentsid
     */
    public java.lang.String getKompetentsid() {
        return kompetentsid;
    }


    /**
     * Sets the kompetentsid value for this TaotluseKutsetunnistus.
     * 
     * @param kompetentsid
     */
    public void setKompetentsid(java.lang.String kompetentsid) {
        this.kompetentsid = kompetentsid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseKutsetunnistus)) return false;
        TaotluseKutsetunnistus other = (TaotluseKutsetunnistus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.detailne == other.isDetailne() &&
            ((this.registrinumber==null && other.getRegistrinumber()==null) || 
             (this.registrinumber!=null &&
              this.registrinumber.equals(other.getRegistrinumber()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.kvalifikatsioon==null && other.getKvalifikatsioon()==null) || 
             (this.kvalifikatsioon!=null &&
              this.kvalifikatsioon.equals(other.getKvalifikatsioon()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.valjaandja==null && other.getValjaandja()==null) || 
             (this.valjaandja!=null &&
              this.valjaandja.equals(other.getValjaandja()))) &&
            ((this.valja_antud==null && other.getValja_antud()==null) || 
             (this.valja_antud!=null &&
              this.valja_antud.equals(other.getValja_antud()))) &&
            ((this.kehtib_alates==null && other.getKehtib_alates()==null) || 
             (this.kehtib_alates!=null &&
              this.kehtib_alates.equals(other.getKehtib_alates()))) &&
            ((this.kehtib_kuni==null && other.getKehtib_kuni()==null) || 
             (this.kehtib_kuni!=null &&
              this.kehtib_kuni.equals(other.getKehtib_kuni()))) &&
            this.kehtetu == other.isKehtetu() &&
            ((this.kompetentsid==null && other.getKompetentsid()==null) || 
             (this.kompetentsid!=null &&
              this.kompetentsid.equals(other.getKompetentsid())));
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
        _hashCode += (isDetailne() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRegistrinumber() != null) {
            _hashCode += getRegistrinumber().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getKvalifikatsioon() != null) {
            _hashCode += getKvalifikatsioon().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getValjaandja() != null) {
            _hashCode += getValjaandja().hashCode();
        }
        if (getValja_antud() != null) {
            _hashCode += getValja_antud().hashCode();
        }
        if (getKehtib_alates() != null) {
            _hashCode += getKehtib_alates().hashCode();
        }
        if (getKehtib_kuni() != null) {
            _hashCode += getKehtib_kuni().hashCode();
        }
        _hashCode += (isKehtetu() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKompetentsid() != null) {
            _hashCode += getKompetentsid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
