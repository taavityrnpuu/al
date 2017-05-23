/**
 * DynVali.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class DynVali  implements java.io.Serializable {
    private java.math.BigInteger ID;

    private java.lang.String tunnus;

    private java.lang.String nimi;

    private java.lang.String tyyp;

    private java.lang.String vaartus;

    private java.lang.String input;

    private java.lang.String textarea;

    public DynVali() {
    }

    public DynVali(
           java.math.BigInteger ID,
           java.lang.String tunnus,
           java.lang.String nimi,
           java.lang.String tyyp,
           java.lang.String vaartus,
           java.lang.String input,
           java.lang.String textarea) {
           this.ID = ID;
           this.tunnus = tunnus;
           this.nimi = nimi;
           this.tyyp = tyyp;
           this.vaartus = vaartus;
           this.input = input;
           this.textarea = textarea;
    }


    /**
     * Gets the ID value for this DynVali.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DynVali.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the tunnus value for this DynVali.
     * 
     * @return tunnus
     */
    public java.lang.String getTunnus() {
        return tunnus;
    }


    /**
     * Sets the tunnus value for this DynVali.
     * 
     * @param tunnus
     */
    public void setTunnus(java.lang.String tunnus) {
        this.tunnus = tunnus;
    }


    /**
     * Gets the nimi value for this DynVali.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this DynVali.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the tyyp value for this DynVali.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this DynVali.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the vaartus value for this DynVali.
     * 
     * @return vaartus
     */
    public java.lang.String getVaartus() {
        return vaartus;
    }


    /**
     * Sets the vaartus value for this DynVali.
     * 
     * @param vaartus
     */
    public void setVaartus(java.lang.String vaartus) {
        this.vaartus = vaartus;
    }


    /**
     * Gets the input value for this DynVali.
     * 
     * @return input
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this DynVali.
     * 
     * @param input
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the textarea value for this DynVali.
     * 
     * @return textarea
     */
    public java.lang.String getTextarea() {
        return textarea;
    }


    /**
     * Sets the textarea value for this DynVali.
     * 
     * @param textarea
     */
    public void setTextarea(java.lang.String textarea) {
        this.textarea = textarea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynVali)) return false;
        DynVali other = (DynVali) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.tunnus==null && other.getTunnus()==null) || 
             (this.tunnus!=null &&
              this.tunnus.equals(other.getTunnus()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.vaartus==null && other.getVaartus()==null) || 
             (this.vaartus!=null &&
              this.vaartus.equals(other.getVaartus()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.textarea==null && other.getTextarea()==null) || 
             (this.textarea!=null &&
              this.textarea.equals(other.getTextarea())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getTunnus() != null) {
            _hashCode += getTunnus().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getVaartus() != null) {
            _hashCode += getVaartus().hashCode();
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getTextarea() != null) {
            _hashCode += getTextarea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
