/**
 * KlassifikaatorValik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class KlassifikaatorValik  implements java.io.Serializable {
    private java.lang.String kood;

    private java.lang.String nimetus;

    private java.math.BigDecimal tagatisSumma;

    public KlassifikaatorValik() {
    }

    public KlassifikaatorValik(
           java.lang.String kood,
           java.lang.String nimetus,
           java.math.BigDecimal tagatisSumma) {
           this.kood = kood;
           this.nimetus = nimetus;
           this.tagatisSumma = tagatisSumma;
    }


    /**
     * Gets the kood value for this KlassifikaatorValik.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this KlassifikaatorValik.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimetus value for this KlassifikaatorValik.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this KlassifikaatorValik.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the tagatisSumma value for this KlassifikaatorValik.
     * 
     * @return tagatisSumma
     */
    public java.math.BigDecimal getTagatisSumma() {
        return tagatisSumma;
    }


    /**
     * Sets the tagatisSumma value for this KlassifikaatorValik.
     * 
     * @param tagatisSumma
     */
    public void setTagatisSumma(java.math.BigDecimal tagatisSumma) {
        this.tagatisSumma = tagatisSumma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KlassifikaatorValik)) return false;
        KlassifikaatorValik other = (KlassifikaatorValik) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.tagatisSumma==null && other.getTagatisSumma()==null) || 
             (this.tagatisSumma!=null &&
              this.tagatisSumma.equals(other.getTagatisSumma())));
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
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getTagatisSumma() != null) {
            _hashCode += getTagatisSumma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
