/**
 * TaotluseLoendiFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseLoendiFilter  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String kirjeldus;

    private java.lang.String tyyp;

    private java.lang.String vaartusString;

    private java.util.Date vaartusDate1;

    private java.util.Date vaartusDate2;

    public TaotluseLoendiFilter() {
    }

    public TaotluseLoendiFilter(
           java.lang.String nimi,
           java.lang.String kirjeldus,
           java.lang.String tyyp,
           java.lang.String vaartusString,
           java.util.Date vaartusDate1,
           java.util.Date vaartusDate2) {
           this.nimi = nimi;
           this.kirjeldus = kirjeldus;
           this.tyyp = tyyp;
           this.vaartusString = vaartusString;
           this.vaartusDate1 = vaartusDate1;
           this.vaartusDate2 = vaartusDate2;
    }


    /**
     * Gets the nimi value for this TaotluseLoendiFilter.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseLoendiFilter.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kirjeldus value for this TaotluseLoendiFilter.
     * 
     * @return kirjeldus
     */
    public java.lang.String getKirjeldus() {
        return kirjeldus;
    }


    /**
     * Sets the kirjeldus value for this TaotluseLoendiFilter.
     * 
     * @param kirjeldus
     */
    public void setKirjeldus(java.lang.String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }


    /**
     * Gets the tyyp value for this TaotluseLoendiFilter.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this TaotluseLoendiFilter.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the vaartusString value for this TaotluseLoendiFilter.
     * 
     * @return vaartusString
     */
    public java.lang.String getVaartusString() {
        return vaartusString;
    }


    /**
     * Sets the vaartusString value for this TaotluseLoendiFilter.
     * 
     * @param vaartusString
     */
    public void setVaartusString(java.lang.String vaartusString) {
        this.vaartusString = vaartusString;
    }


    /**
     * Gets the vaartusDate1 value for this TaotluseLoendiFilter.
     * 
     * @return vaartusDate1
     */
    public java.util.Date getVaartusDate1() {
        return vaartusDate1;
    }


    /**
     * Sets the vaartusDate1 value for this TaotluseLoendiFilter.
     * 
     * @param vaartusDate1
     */
    public void setVaartusDate1(java.util.Date vaartusDate1) {
        this.vaartusDate1 = vaartusDate1;
    }


    /**
     * Gets the vaartusDate2 value for this TaotluseLoendiFilter.
     * 
     * @return vaartusDate2
     */
    public java.util.Date getVaartusDate2() {
        return vaartusDate2;
    }


    /**
     * Sets the vaartusDate2 value for this TaotluseLoendiFilter.
     * 
     * @param vaartusDate2
     */
    public void setVaartusDate2(java.util.Date vaartusDate2) {
        this.vaartusDate2 = vaartusDate2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseLoendiFilter)) return false;
        TaotluseLoendiFilter other = (TaotluseLoendiFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.kirjeldus==null && other.getKirjeldus()==null) || 
             (this.kirjeldus!=null &&
              this.kirjeldus.equals(other.getKirjeldus()))) &&
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.vaartusString==null && other.getVaartusString()==null) || 
             (this.vaartusString!=null &&
              this.vaartusString.equals(other.getVaartusString()))) &&
            ((this.vaartusDate1==null && other.getVaartusDate1()==null) || 
             (this.vaartusDate1!=null &&
              this.vaartusDate1.equals(other.getVaartusDate1()))) &&
            ((this.vaartusDate2==null && other.getVaartusDate2()==null) || 
             (this.vaartusDate2!=null &&
              this.vaartusDate2.equals(other.getVaartusDate2())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getKirjeldus() != null) {
            _hashCode += getKirjeldus().hashCode();
        }
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getVaartusString() != null) {
            _hashCode += getVaartusString().hashCode();
        }
        if (getVaartusDate1() != null) {
            _hashCode += getVaartusDate1().hashCode();
        }
        if (getVaartusDate2() != null) {
            _hashCode += getVaartusDate2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
