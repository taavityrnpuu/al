/**
 * Majandusaasta_aruannete_kirjed_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Majandusaasta_aruannete_kirjed_vastus  implements java.io.Serializable {
    private java.lang.String aruande_liik;

    private java.lang.String aruande_nimetus;

    private java.util.Date majandusaasta_algus;

    private java.util.Date majandusaasta_lopp;

    private eu.x_road.arireg.producer.Majandusaasta_aruanded_rida[] majandusaasta_aruanded_read;

    public Majandusaasta_aruannete_kirjed_vastus() {
    }

    public Majandusaasta_aruannete_kirjed_vastus(
           java.lang.String aruande_liik,
           java.lang.String aruande_nimetus,
           java.util.Date majandusaasta_algus,
           java.util.Date majandusaasta_lopp,
           eu.x_road.arireg.producer.Majandusaasta_aruanded_rida[] majandusaasta_aruanded_read) {
           this.aruande_liik = aruande_liik;
           this.aruande_nimetus = aruande_nimetus;
           this.majandusaasta_algus = majandusaasta_algus;
           this.majandusaasta_lopp = majandusaasta_lopp;
           this.majandusaasta_aruanded_read = majandusaasta_aruanded_read;
    }


    /**
     * Gets the aruande_liik value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @return aruande_liik
     */
    public java.lang.String getAruande_liik() {
        return aruande_liik;
    }


    /**
     * Sets the aruande_liik value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @param aruande_liik
     */
    public void setAruande_liik(java.lang.String aruande_liik) {
        this.aruande_liik = aruande_liik;
    }


    /**
     * Gets the aruande_nimetus value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @return aruande_nimetus
     */
    public java.lang.String getAruande_nimetus() {
        return aruande_nimetus;
    }


    /**
     * Sets the aruande_nimetus value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @param aruande_nimetus
     */
    public void setAruande_nimetus(java.lang.String aruande_nimetus) {
        this.aruande_nimetus = aruande_nimetus;
    }


    /**
     * Gets the majandusaasta_algus value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @return majandusaasta_algus
     */
    public java.util.Date getMajandusaasta_algus() {
        return majandusaasta_algus;
    }


    /**
     * Sets the majandusaasta_algus value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @param majandusaasta_algus
     */
    public void setMajandusaasta_algus(java.util.Date majandusaasta_algus) {
        this.majandusaasta_algus = majandusaasta_algus;
    }


    /**
     * Gets the majandusaasta_lopp value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @return majandusaasta_lopp
     */
    public java.util.Date getMajandusaasta_lopp() {
        return majandusaasta_lopp;
    }


    /**
     * Sets the majandusaasta_lopp value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @param majandusaasta_lopp
     */
    public void setMajandusaasta_lopp(java.util.Date majandusaasta_lopp) {
        this.majandusaasta_lopp = majandusaasta_lopp;
    }


    /**
     * Gets the majandusaasta_aruanded_read value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @return majandusaasta_aruanded_read
     */
    public eu.x_road.arireg.producer.Majandusaasta_aruanded_rida[] getMajandusaasta_aruanded_read() {
        return majandusaasta_aruanded_read;
    }


    /**
     * Sets the majandusaasta_aruanded_read value for this Majandusaasta_aruannete_kirjed_vastus.
     * 
     * @param majandusaasta_aruanded_read
     */
    public void setMajandusaasta_aruanded_read(eu.x_road.arireg.producer.Majandusaasta_aruanded_rida[] majandusaasta_aruanded_read) {
        this.majandusaasta_aruanded_read = majandusaasta_aruanded_read;
    }

    public eu.x_road.arireg.producer.Majandusaasta_aruanded_rida getMajandusaasta_aruanded_read(int i) {
        return this.majandusaasta_aruanded_read[i];
    }

    public void setMajandusaasta_aruanded_read(int i, eu.x_road.arireg.producer.Majandusaasta_aruanded_rida _value) {
        this.majandusaasta_aruanded_read[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandusaasta_aruannete_kirjed_vastus)) return false;
        Majandusaasta_aruannete_kirjed_vastus other = (Majandusaasta_aruannete_kirjed_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aruande_liik==null && other.getAruande_liik()==null) || 
             (this.aruande_liik!=null &&
              this.aruande_liik.equals(other.getAruande_liik()))) &&
            ((this.aruande_nimetus==null && other.getAruande_nimetus()==null) || 
             (this.aruande_nimetus!=null &&
              this.aruande_nimetus.equals(other.getAruande_nimetus()))) &&
            ((this.majandusaasta_algus==null && other.getMajandusaasta_algus()==null) || 
             (this.majandusaasta_algus!=null &&
              this.majandusaasta_algus.equals(other.getMajandusaasta_algus()))) &&
            ((this.majandusaasta_lopp==null && other.getMajandusaasta_lopp()==null) || 
             (this.majandusaasta_lopp!=null &&
              this.majandusaasta_lopp.equals(other.getMajandusaasta_lopp()))) &&
            ((this.majandusaasta_aruanded_read==null && other.getMajandusaasta_aruanded_read()==null) || 
             (this.majandusaasta_aruanded_read!=null &&
              java.util.Arrays.equals(this.majandusaasta_aruanded_read, other.getMajandusaasta_aruanded_read())));
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
        if (getAruande_liik() != null) {
            _hashCode += getAruande_liik().hashCode();
        }
        if (getAruande_nimetus() != null) {
            _hashCode += getAruande_nimetus().hashCode();
        }
        if (getMajandusaasta_algus() != null) {
            _hashCode += getMajandusaasta_algus().hashCode();
        }
        if (getMajandusaasta_lopp() != null) {
            _hashCode += getMajandusaasta_lopp().hashCode();
        }
        if (getMajandusaasta_aruanded_read() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMajandusaasta_aruanded_read());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMajandusaasta_aruanded_read(), i);
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
