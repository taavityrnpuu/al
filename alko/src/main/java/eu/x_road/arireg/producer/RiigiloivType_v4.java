/**
 * RiigiloivType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class RiigiloivType_v4  implements java.io.Serializable {
    private java.math.BigDecimal summa;

    private java.lang.String valuuta;

    private java.lang.String viitenumber;

    /* Ei ole viitenumber vaid panga maksekorralduse selgitus */
    private java.lang.String selgitus;

    private java.util.Date kuupaev;

    public RiigiloivType_v4() {
    }

    public RiigiloivType_v4(
           java.math.BigDecimal summa,
           java.lang.String valuuta,
           java.lang.String viitenumber,
           java.lang.String selgitus,
           java.util.Date kuupaev) {
           this.summa = summa;
           this.valuuta = valuuta;
           this.viitenumber = viitenumber;
           this.selgitus = selgitus;
           this.kuupaev = kuupaev;
    }


    /**
     * Gets the summa value for this RiigiloivType_v4.
     * 
     * @return summa
     */
    public java.math.BigDecimal getSumma() {
        return summa;
    }


    /**
     * Sets the summa value for this RiigiloivType_v4.
     * 
     * @param summa
     */
    public void setSumma(java.math.BigDecimal summa) {
        this.summa = summa;
    }


    /**
     * Gets the valuuta value for this RiigiloivType_v4.
     * 
     * @return valuuta
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }


    /**
     * Sets the valuuta value for this RiigiloivType_v4.
     * 
     * @param valuuta
     */
    public void setValuuta(java.lang.String valuuta) {
        this.valuuta = valuuta;
    }


    /**
     * Gets the viitenumber value for this RiigiloivType_v4.
     * 
     * @return viitenumber
     */
    public java.lang.String getViitenumber() {
        return viitenumber;
    }


    /**
     * Sets the viitenumber value for this RiigiloivType_v4.
     * 
     * @param viitenumber
     */
    public void setViitenumber(java.lang.String viitenumber) {
        this.viitenumber = viitenumber;
    }


    /**
     * Gets the selgitus value for this RiigiloivType_v4.
     * 
     * @return selgitus   * Ei ole viitenumber vaid panga maksekorralduse selgitus
     */
    public java.lang.String getSelgitus() {
        return selgitus;
    }


    /**
     * Sets the selgitus value for this RiigiloivType_v4.
     * 
     * @param selgitus   * Ei ole viitenumber vaid panga maksekorralduse selgitus
     */
    public void setSelgitus(java.lang.String selgitus) {
        this.selgitus = selgitus;
    }


    /**
     * Gets the kuupaev value for this RiigiloivType_v4.
     * 
     * @return kuupaev
     */
    public java.util.Date getKuupaev() {
        return kuupaev;
    }


    /**
     * Sets the kuupaev value for this RiigiloivType_v4.
     * 
     * @param kuupaev
     */
    public void setKuupaev(java.util.Date kuupaev) {
        this.kuupaev = kuupaev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiigiloivType_v4)) return false;
        RiigiloivType_v4 other = (RiigiloivType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.summa==null && other.getSumma()==null) || 
             (this.summa!=null &&
              this.summa.equals(other.getSumma()))) &&
            ((this.valuuta==null && other.getValuuta()==null) || 
             (this.valuuta!=null &&
              this.valuuta.equals(other.getValuuta()))) &&
            ((this.viitenumber==null && other.getViitenumber()==null) || 
             (this.viitenumber!=null &&
              this.viitenumber.equals(other.getViitenumber()))) &&
            ((this.selgitus==null && other.getSelgitus()==null) || 
             (this.selgitus!=null &&
              this.selgitus.equals(other.getSelgitus()))) &&
            ((this.kuupaev==null && other.getKuupaev()==null) || 
             (this.kuupaev!=null &&
              this.kuupaev.equals(other.getKuupaev())));
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
        if (getSumma() != null) {
            _hashCode += getSumma().hashCode();
        }
        if (getValuuta() != null) {
            _hashCode += getValuuta().hashCode();
        }
        if (getViitenumber() != null) {
            _hashCode += getViitenumber().hashCode();
        }
        if (getSelgitus() != null) {
            _hashCode += getSelgitus().hashCode();
        }
        if (getKuupaev() != null) {
            _hashCode += getKuupaev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
