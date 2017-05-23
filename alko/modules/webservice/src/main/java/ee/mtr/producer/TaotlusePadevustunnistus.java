/**
 * TaotlusePadevustunnistus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotlusePadevustunnistus  implements java.io.Serializable {
    private boolean detailne;

    private java.lang.String number;

    private java.lang.String isikukood;

    private java.lang.String nimi;

    private java.lang.String valjastaja_registrikood;

    private java.lang.String valjastaja;

    private java.lang.String valjaandmiskoht;

    private java.util.Date valjastamise_kuupaev;

    private java.util.Date kehtivuse_lopp;

    private java.lang.String padevusulatused;

    public TaotlusePadevustunnistus() {
    }

    public TaotlusePadevustunnistus(
           boolean detailne,
           java.lang.String number,
           java.lang.String isikukood,
           java.lang.String nimi,
           java.lang.String valjastaja_registrikood,
           java.lang.String valjastaja,
           java.lang.String valjaandmiskoht,
           java.util.Date valjastamise_kuupaev,
           java.util.Date kehtivuse_lopp,
           java.lang.String padevusulatused) {
           this.detailne = detailne;
           this.number = number;
           this.isikukood = isikukood;
           this.nimi = nimi;
           this.valjastaja_registrikood = valjastaja_registrikood;
           this.valjastaja = valjastaja;
           this.valjaandmiskoht = valjaandmiskoht;
           this.valjastamise_kuupaev = valjastamise_kuupaev;
           this.kehtivuse_lopp = kehtivuse_lopp;
           this.padevusulatused = padevusulatused;
    }


    /**
     * Gets the detailne value for this TaotlusePadevustunnistus.
     * 
     * @return detailne
     */
    public boolean isDetailne() {
        return detailne;
    }


    /**
     * Sets the detailne value for this TaotlusePadevustunnistus.
     * 
     * @param detailne
     */
    public void setDetailne(boolean detailne) {
        this.detailne = detailne;
    }


    /**
     * Gets the number value for this TaotlusePadevustunnistus.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TaotlusePadevustunnistus.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the isikukood value for this TaotlusePadevustunnistus.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this TaotlusePadevustunnistus.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the nimi value for this TaotlusePadevustunnistus.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotlusePadevustunnistus.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the valjastaja_registrikood value for this TaotlusePadevustunnistus.
     * 
     * @return valjastaja_registrikood
     */
    public java.lang.String getValjastaja_registrikood() {
        return valjastaja_registrikood;
    }


    /**
     * Sets the valjastaja_registrikood value for this TaotlusePadevustunnistus.
     * 
     * @param valjastaja_registrikood
     */
    public void setValjastaja_registrikood(java.lang.String valjastaja_registrikood) {
        this.valjastaja_registrikood = valjastaja_registrikood;
    }


    /**
     * Gets the valjastaja value for this TaotlusePadevustunnistus.
     * 
     * @return valjastaja
     */
    public java.lang.String getValjastaja() {
        return valjastaja;
    }


    /**
     * Sets the valjastaja value for this TaotlusePadevustunnistus.
     * 
     * @param valjastaja
     */
    public void setValjastaja(java.lang.String valjastaja) {
        this.valjastaja = valjastaja;
    }


    /**
     * Gets the valjaandmiskoht value for this TaotlusePadevustunnistus.
     * 
     * @return valjaandmiskoht
     */
    public java.lang.String getValjaandmiskoht() {
        return valjaandmiskoht;
    }


    /**
     * Sets the valjaandmiskoht value for this TaotlusePadevustunnistus.
     * 
     * @param valjaandmiskoht
     */
    public void setValjaandmiskoht(java.lang.String valjaandmiskoht) {
        this.valjaandmiskoht = valjaandmiskoht;
    }


    /**
     * Gets the valjastamise_kuupaev value for this TaotlusePadevustunnistus.
     * 
     * @return valjastamise_kuupaev
     */
    public java.util.Date getValjastamise_kuupaev() {
        return valjastamise_kuupaev;
    }


    /**
     * Sets the valjastamise_kuupaev value for this TaotlusePadevustunnistus.
     * 
     * @param valjastamise_kuupaev
     */
    public void setValjastamise_kuupaev(java.util.Date valjastamise_kuupaev) {
        this.valjastamise_kuupaev = valjastamise_kuupaev;
    }


    /**
     * Gets the kehtivuse_lopp value for this TaotlusePadevustunnistus.
     * 
     * @return kehtivuse_lopp
     */
    public java.util.Date getKehtivuse_lopp() {
        return kehtivuse_lopp;
    }


    /**
     * Sets the kehtivuse_lopp value for this TaotlusePadevustunnistus.
     * 
     * @param kehtivuse_lopp
     */
    public void setKehtivuse_lopp(java.util.Date kehtivuse_lopp) {
        this.kehtivuse_lopp = kehtivuse_lopp;
    }


    /**
     * Gets the padevusulatused value for this TaotlusePadevustunnistus.
     * 
     * @return padevusulatused
     */
    public java.lang.String getPadevusulatused() {
        return padevusulatused;
    }


    /**
     * Sets the padevusulatused value for this TaotlusePadevustunnistus.
     * 
     * @param padevusulatused
     */
    public void setPadevusulatused(java.lang.String padevusulatused) {
        this.padevusulatused = padevusulatused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotlusePadevustunnistus)) return false;
        TaotlusePadevustunnistus other = (TaotlusePadevustunnistus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.detailne == other.isDetailne() &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.valjastaja_registrikood==null && other.getValjastaja_registrikood()==null) || 
             (this.valjastaja_registrikood!=null &&
              this.valjastaja_registrikood.equals(other.getValjastaja_registrikood()))) &&
            ((this.valjastaja==null && other.getValjastaja()==null) || 
             (this.valjastaja!=null &&
              this.valjastaja.equals(other.getValjastaja()))) &&
            ((this.valjaandmiskoht==null && other.getValjaandmiskoht()==null) || 
             (this.valjaandmiskoht!=null &&
              this.valjaandmiskoht.equals(other.getValjaandmiskoht()))) &&
            ((this.valjastamise_kuupaev==null && other.getValjastamise_kuupaev()==null) || 
             (this.valjastamise_kuupaev!=null &&
              this.valjastamise_kuupaev.equals(other.getValjastamise_kuupaev()))) &&
            ((this.kehtivuse_lopp==null && other.getKehtivuse_lopp()==null) || 
             (this.kehtivuse_lopp!=null &&
              this.kehtivuse_lopp.equals(other.getKehtivuse_lopp()))) &&
            ((this.padevusulatused==null && other.getPadevusulatused()==null) || 
             (this.padevusulatused!=null &&
              this.padevusulatused.equals(other.getPadevusulatused())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getValjastaja_registrikood() != null) {
            _hashCode += getValjastaja_registrikood().hashCode();
        }
        if (getValjastaja() != null) {
            _hashCode += getValjastaja().hashCode();
        }
        if (getValjaandmiskoht() != null) {
            _hashCode += getValjaandmiskoht().hashCode();
        }
        if (getValjastamise_kuupaev() != null) {
            _hashCode += getValjastamise_kuupaev().hashCode();
        }
        if (getKehtivuse_lopp() != null) {
            _hashCode += getKehtivuse_lopp().hashCode();
        }
        if (getPadevusulatused() != null) {
            _hashCode += getPadevusulatused().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
