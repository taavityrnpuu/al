/**
 * Menetlusinfo_v3_hoiatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Menetlusinfo_v3_hoiatus  implements java.io.Serializable {
    private java.lang.String hoiat_numb;

    private java.lang.String paevikukande_id;

    /* Menetluse number vanas vormingus (piirkond:menetluse_nr) */
    private java.lang.String paevikukande_id_vana;

    private java.util.Date hoiat_kuup;

    private java.lang.String hoiat_nimetus;

    private java.lang.String hoiat_tekst;

    public Menetlusinfo_v3_hoiatus() {
    }

    public Menetlusinfo_v3_hoiatus(
           java.lang.String hoiat_numb,
           java.lang.String paevikukande_id,
           java.lang.String paevikukande_id_vana,
           java.util.Date hoiat_kuup,
           java.lang.String hoiat_nimetus,
           java.lang.String hoiat_tekst) {
           this.hoiat_numb = hoiat_numb;
           this.paevikukande_id = paevikukande_id;
           this.paevikukande_id_vana = paevikukande_id_vana;
           this.hoiat_kuup = hoiat_kuup;
           this.hoiat_nimetus = hoiat_nimetus;
           this.hoiat_tekst = hoiat_tekst;
    }


    /**
     * Gets the hoiat_numb value for this Menetlusinfo_v3_hoiatus.
     * 
     * @return hoiat_numb
     */
    public java.lang.String getHoiat_numb() {
        return hoiat_numb;
    }


    /**
     * Sets the hoiat_numb value for this Menetlusinfo_v3_hoiatus.
     * 
     * @param hoiat_numb
     */
    public void setHoiat_numb(java.lang.String hoiat_numb) {
        this.hoiat_numb = hoiat_numb;
    }


    /**
     * Gets the paevikukande_id value for this Menetlusinfo_v3_hoiatus.
     * 
     * @return paevikukande_id
     */
    public java.lang.String getPaevikukande_id() {
        return paevikukande_id;
    }


    /**
     * Sets the paevikukande_id value for this Menetlusinfo_v3_hoiatus.
     * 
     * @param paevikukande_id
     */
    public void setPaevikukande_id(java.lang.String paevikukande_id) {
        this.paevikukande_id = paevikukande_id;
    }


    /**
     * Gets the paevikukande_id_vana value for this Menetlusinfo_v3_hoiatus.
     * 
     * @return paevikukande_id_vana   * Menetluse number vanas vormingus (piirkond:menetluse_nr)
     */
    public java.lang.String getPaevikukande_id_vana() {
        return paevikukande_id_vana;
    }


    /**
     * Sets the paevikukande_id_vana value for this Menetlusinfo_v3_hoiatus.
     * 
     * @param paevikukande_id_vana   * Menetluse number vanas vormingus (piirkond:menetluse_nr)
     */
    public void setPaevikukande_id_vana(java.lang.String paevikukande_id_vana) {
        this.paevikukande_id_vana = paevikukande_id_vana;
    }


    /**
     * Gets the hoiat_kuup value for this Menetlusinfo_v3_hoiatus.
     * 
     * @return hoiat_kuup
     */
    public java.util.Date getHoiat_kuup() {
        return hoiat_kuup;
    }


    /**
     * Sets the hoiat_kuup value for this Menetlusinfo_v3_hoiatus.
     * 
     * @param hoiat_kuup
     */
    public void setHoiat_kuup(java.util.Date hoiat_kuup) {
        this.hoiat_kuup = hoiat_kuup;
    }


    /**
     * Gets the hoiat_nimetus value for this Menetlusinfo_v3_hoiatus.
     * 
     * @return hoiat_nimetus
     */
    public java.lang.String getHoiat_nimetus() {
        return hoiat_nimetus;
    }


    /**
     * Sets the hoiat_nimetus value for this Menetlusinfo_v3_hoiatus.
     * 
     * @param hoiat_nimetus
     */
    public void setHoiat_nimetus(java.lang.String hoiat_nimetus) {
        this.hoiat_nimetus = hoiat_nimetus;
    }


    /**
     * Gets the hoiat_tekst value for this Menetlusinfo_v3_hoiatus.
     * 
     * @return hoiat_tekst
     */
    public java.lang.String getHoiat_tekst() {
        return hoiat_tekst;
    }


    /**
     * Sets the hoiat_tekst value for this Menetlusinfo_v3_hoiatus.
     * 
     * @param hoiat_tekst
     */
    public void setHoiat_tekst(java.lang.String hoiat_tekst) {
        this.hoiat_tekst = hoiat_tekst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menetlusinfo_v3_hoiatus)) return false;
        Menetlusinfo_v3_hoiatus other = (Menetlusinfo_v3_hoiatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hoiat_numb==null && other.getHoiat_numb()==null) || 
             (this.hoiat_numb!=null &&
              this.hoiat_numb.equals(other.getHoiat_numb()))) &&
            ((this.paevikukande_id==null && other.getPaevikukande_id()==null) || 
             (this.paevikukande_id!=null &&
              this.paevikukande_id.equals(other.getPaevikukande_id()))) &&
            ((this.paevikukande_id_vana==null && other.getPaevikukande_id_vana()==null) || 
             (this.paevikukande_id_vana!=null &&
              this.paevikukande_id_vana.equals(other.getPaevikukande_id_vana()))) &&
            ((this.hoiat_kuup==null && other.getHoiat_kuup()==null) || 
             (this.hoiat_kuup!=null &&
              this.hoiat_kuup.equals(other.getHoiat_kuup()))) &&
            ((this.hoiat_nimetus==null && other.getHoiat_nimetus()==null) || 
             (this.hoiat_nimetus!=null &&
              this.hoiat_nimetus.equals(other.getHoiat_nimetus()))) &&
            ((this.hoiat_tekst==null && other.getHoiat_tekst()==null) || 
             (this.hoiat_tekst!=null &&
              this.hoiat_tekst.equals(other.getHoiat_tekst())));
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
        if (getHoiat_numb() != null) {
            _hashCode += getHoiat_numb().hashCode();
        }
        if (getPaevikukande_id() != null) {
            _hashCode += getPaevikukande_id().hashCode();
        }
        if (getPaevikukande_id_vana() != null) {
            _hashCode += getPaevikukande_id_vana().hashCode();
        }
        if (getHoiat_kuup() != null) {
            _hashCode += getHoiat_kuup().hashCode();
        }
        if (getHoiat_nimetus() != null) {
            _hashCode += getHoiat_nimetus().hashCode();
        }
        if (getHoiat_tekst() != null) {
            _hashCode += getHoiat_tekst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
