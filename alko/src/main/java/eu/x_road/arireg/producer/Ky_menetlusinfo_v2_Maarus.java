/**
 * Ky_menetlusinfo_v2_Maarus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ky_menetlusinfo_v2_Maarus  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String tekst;

    private java.math.BigInteger liik;

    private java.lang.String liik_tekstina;

    private java.util.Calendar oleku_aeg;

    public Ky_menetlusinfo_v2_Maarus() {
    }

    public Ky_menetlusinfo_v2_Maarus(
           java.lang.String number,
           java.lang.String tekst,
           java.math.BigInteger liik,
           java.lang.String liik_tekstina,
           java.util.Calendar oleku_aeg) {
           this.number = number;
           this.tekst = tekst;
           this.liik = liik;
           this.liik_tekstina = liik_tekstina;
           this.oleku_aeg = oleku_aeg;
    }


    /**
     * Gets the number value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the tekst value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @return tekst
     */
    public java.lang.String getTekst() {
        return tekst;
    }


    /**
     * Sets the tekst value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @param tekst
     */
    public void setTekst(java.lang.String tekst) {
        this.tekst = tekst;
    }


    /**
     * Gets the liik value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @return liik
     */
    public java.math.BigInteger getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @param liik
     */
    public void setLiik(java.math.BigInteger liik) {
        this.liik = liik;
    }


    /**
     * Gets the liik_tekstina value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @return liik_tekstina
     */
    public java.lang.String getLiik_tekstina() {
        return liik_tekstina;
    }


    /**
     * Sets the liik_tekstina value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @param liik_tekstina
     */
    public void setLiik_tekstina(java.lang.String liik_tekstina) {
        this.liik_tekstina = liik_tekstina;
    }


    /**
     * Gets the oleku_aeg value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @return oleku_aeg
     */
    public java.util.Calendar getOleku_aeg() {
        return oleku_aeg;
    }


    /**
     * Sets the oleku_aeg value for this Ky_menetlusinfo_v2_Maarus.
     * 
     * @param oleku_aeg
     */
    public void setOleku_aeg(java.util.Calendar oleku_aeg) {
        this.oleku_aeg = oleku_aeg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ky_menetlusinfo_v2_Maarus)) return false;
        Ky_menetlusinfo_v2_Maarus other = (Ky_menetlusinfo_v2_Maarus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.tekst==null && other.getTekst()==null) || 
             (this.tekst!=null &&
              this.tekst.equals(other.getTekst()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.liik_tekstina==null && other.getLiik_tekstina()==null) || 
             (this.liik_tekstina!=null &&
              this.liik_tekstina.equals(other.getLiik_tekstina()))) &&
            ((this.oleku_aeg==null && other.getOleku_aeg()==null) || 
             (this.oleku_aeg!=null &&
              this.oleku_aeg.equals(other.getOleku_aeg())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getTekst() != null) {
            _hashCode += getTekst().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getLiik_tekstina() != null) {
            _hashCode += getLiik_tekstina().hashCode();
        }
        if (getOleku_aeg() != null) {
            _hashCode += getOleku_aeg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
