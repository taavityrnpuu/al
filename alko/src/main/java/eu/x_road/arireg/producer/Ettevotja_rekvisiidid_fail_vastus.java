/**
 * Ettevotja_rekvisiidid_fail_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_rekvisiidid_fail_vastus  implements java.io.Serializable {
    private java.util.Date faili_loomise_kuupaev;

    private int leitud_ettevotjate_arv;

    private java.lang.String faili_nimi;

    private org.apache.axis.types.URI viide_manusele;

    public Ettevotja_rekvisiidid_fail_vastus() {
    }

    public Ettevotja_rekvisiidid_fail_vastus(
           java.util.Date faili_loomise_kuupaev,
           int leitud_ettevotjate_arv,
           java.lang.String faili_nimi,
           org.apache.axis.types.URI viide_manusele) {
           this.faili_loomise_kuupaev = faili_loomise_kuupaev;
           this.leitud_ettevotjate_arv = leitud_ettevotjate_arv;
           this.faili_nimi = faili_nimi;
           this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the faili_loomise_kuupaev value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @return faili_loomise_kuupaev
     */
    public java.util.Date getFaili_loomise_kuupaev() {
        return faili_loomise_kuupaev;
    }


    /**
     * Sets the faili_loomise_kuupaev value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @param faili_loomise_kuupaev
     */
    public void setFaili_loomise_kuupaev(java.util.Date faili_loomise_kuupaev) {
        this.faili_loomise_kuupaev = faili_loomise_kuupaev;
    }


    /**
     * Gets the leitud_ettevotjate_arv value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @return leitud_ettevotjate_arv
     */
    public int getLeitud_ettevotjate_arv() {
        return leitud_ettevotjate_arv;
    }


    /**
     * Sets the leitud_ettevotjate_arv value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @param leitud_ettevotjate_arv
     */
    public void setLeitud_ettevotjate_arv(int leitud_ettevotjate_arv) {
        this.leitud_ettevotjate_arv = leitud_ettevotjate_arv;
    }


    /**
     * Gets the faili_nimi value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @return faili_nimi
     */
    public java.lang.String getFaili_nimi() {
        return faili_nimi;
    }


    /**
     * Sets the faili_nimi value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @param faili_nimi
     */
    public void setFaili_nimi(java.lang.String faili_nimi) {
        this.faili_nimi = faili_nimi;
    }


    /**
     * Gets the viide_manusele value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @return viide_manusele
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this Ettevotja_rekvisiidid_fail_vastus.
     * 
     * @param viide_manusele
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_rekvisiidid_fail_vastus)) return false;
        Ettevotja_rekvisiidid_fail_vastus other = (Ettevotja_rekvisiidid_fail_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faili_loomise_kuupaev==null && other.getFaili_loomise_kuupaev()==null) || 
             (this.faili_loomise_kuupaev!=null &&
              this.faili_loomise_kuupaev.equals(other.getFaili_loomise_kuupaev()))) &&
            this.leitud_ettevotjate_arv == other.getLeitud_ettevotjate_arv() &&
            ((this.faili_nimi==null && other.getFaili_nimi()==null) || 
             (this.faili_nimi!=null &&
              this.faili_nimi.equals(other.getFaili_nimi()))) &&
            ((this.viide_manusele==null && other.getViide_manusele()==null) || 
             (this.viide_manusele!=null &&
              this.viide_manusele.equals(other.getViide_manusele())));
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
        if (getFaili_loomise_kuupaev() != null) {
            _hashCode += getFaili_loomise_kuupaev().hashCode();
        }
        _hashCode += getLeitud_ettevotjate_arv();
        if (getFaili_nimi() != null) {
            _hashCode += getFaili_nimi().hashCode();
        }
        if (getViide_manusele() != null) {
            _hashCode += getViide_manusele().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
