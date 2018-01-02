/**
 * Osa_kitsendusedType_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Osa_kitsendusedType_v4  implements java.io.Serializable {
    /* K - Keelumärge
     *                         A - Arestimismärge
     *                         P - Osa pant
     *                         T - Tingimuslik võõrandamine
     *                         H - HY kitsendus */
    private java.lang.String liik;

    private java.lang.String jarjekoht;

    private java.lang.String kirjeldus;

    public Osa_kitsendusedType_v4() {
    }

    public Osa_kitsendusedType_v4(
           java.lang.String liik,
           java.lang.String jarjekoht,
           java.lang.String kirjeldus) {
           this.liik = liik;
           this.jarjekoht = jarjekoht;
           this.kirjeldus = kirjeldus;
    }


    /**
     * Gets the liik value for this Osa_kitsendusedType_v4.
     * 
     * @return liik   * K - Keelumärge
     *                         A - Arestimismärge
     *                         P - Osa pant
     *                         T - Tingimuslik võõrandamine
     *                         H - HY kitsendus
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Osa_kitsendusedType_v4.
     * 
     * @param liik   * K - Keelumärge
     *                         A - Arestimismärge
     *                         P - Osa pant
     *                         T - Tingimuslik võõrandamine
     *                         H - HY kitsendus
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the jarjekoht value for this Osa_kitsendusedType_v4.
     * 
     * @return jarjekoht
     */
    public java.lang.String getJarjekoht() {
        return jarjekoht;
    }


    /**
     * Sets the jarjekoht value for this Osa_kitsendusedType_v4.
     * 
     * @param jarjekoht
     */
    public void setJarjekoht(java.lang.String jarjekoht) {
        this.jarjekoht = jarjekoht;
    }


    /**
     * Gets the kirjeldus value for this Osa_kitsendusedType_v4.
     * 
     * @return kirjeldus
     */
    public java.lang.String getKirjeldus() {
        return kirjeldus;
    }


    /**
     * Sets the kirjeldus value for this Osa_kitsendusedType_v4.
     * 
     * @param kirjeldus
     */
    public void setKirjeldus(java.lang.String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Osa_kitsendusedType_v4)) return false;
        Osa_kitsendusedType_v4 other = (Osa_kitsendusedType_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.jarjekoht==null && other.getJarjekoht()==null) || 
             (this.jarjekoht!=null &&
              this.jarjekoht.equals(other.getJarjekoht()))) &&
            ((this.kirjeldus==null && other.getKirjeldus()==null) || 
             (this.kirjeldus!=null &&
              this.kirjeldus.equals(other.getKirjeldus())));
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
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getJarjekoht() != null) {
            _hashCode += getJarjekoht().hashCode();
        }
        if (getKirjeldus() != null) {
            _hashCode += getKirjeldus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
