/**
 * Erakonnanimekiri_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Erakonnanimekiri_vastus  implements java.io.Serializable {
    private java.math.BigInteger kood;

    private java.lang.String nimi;

    private java.util.Date esit_kpv;

    private eu.x_road.arireg.producer.Erakonnanimekiri_liige[] liikmed;

    public Erakonnanimekiri_vastus() {
    }

    public Erakonnanimekiri_vastus(
           java.math.BigInteger kood,
           java.lang.String nimi,
           java.util.Date esit_kpv,
           eu.x_road.arireg.producer.Erakonnanimekiri_liige[] liikmed) {
           this.kood = kood;
           this.nimi = nimi;
           this.esit_kpv = esit_kpv;
           this.liikmed = liikmed;
    }


    /**
     * Gets the kood value for this Erakonnanimekiri_vastus.
     * 
     * @return kood
     */
    public java.math.BigInteger getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this Erakonnanimekiri_vastus.
     * 
     * @param kood
     */
    public void setKood(java.math.BigInteger kood) {
        this.kood = kood;
    }


    /**
     * Gets the nimi value for this Erakonnanimekiri_vastus.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Erakonnanimekiri_vastus.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the esit_kpv value for this Erakonnanimekiri_vastus.
     * 
     * @return esit_kpv
     */
    public java.util.Date getEsit_kpv() {
        return esit_kpv;
    }


    /**
     * Sets the esit_kpv value for this Erakonnanimekiri_vastus.
     * 
     * @param esit_kpv
     */
    public void setEsit_kpv(java.util.Date esit_kpv) {
        this.esit_kpv = esit_kpv;
    }


    /**
     * Gets the liikmed value for this Erakonnanimekiri_vastus.
     * 
     * @return liikmed
     */
    public eu.x_road.arireg.producer.Erakonnanimekiri_liige[] getLiikmed() {
        return liikmed;
    }


    /**
     * Sets the liikmed value for this Erakonnanimekiri_vastus.
     * 
     * @param liikmed
     */
    public void setLiikmed(eu.x_road.arireg.producer.Erakonnanimekiri_liige[] liikmed) {
        this.liikmed = liikmed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Erakonnanimekiri_vastus)) return false;
        Erakonnanimekiri_vastus other = (Erakonnanimekiri_vastus) obj;
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
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.esit_kpv==null && other.getEsit_kpv()==null) || 
             (this.esit_kpv!=null &&
              this.esit_kpv.equals(other.getEsit_kpv()))) &&
            ((this.liikmed==null && other.getLiikmed()==null) || 
             (this.liikmed!=null &&
              java.util.Arrays.equals(this.liikmed, other.getLiikmed())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getEsit_kpv() != null) {
            _hashCode += getEsit_kpv().hashCode();
        }
        if (getLiikmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiikmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiikmed(), i);
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
