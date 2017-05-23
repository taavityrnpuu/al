/**
 * Paringliht_tasuta_ettevote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringliht_tasuta_ettevote  implements java.io.Serializable {
    private java.lang.String evnimi;

    private eu.x_road.arireg.producer.Paringliht_tasuta_kehtetunimi[] kehtetud_nimed;

    private java.lang.String ariregistri_kood;

    public Paringliht_tasuta_ettevote() {
    }

    public Paringliht_tasuta_ettevote(
           java.lang.String evnimi,
           eu.x_road.arireg.producer.Paringliht_tasuta_kehtetunimi[] kehtetud_nimed,
           java.lang.String ariregistri_kood) {
           this.evnimi = evnimi;
           this.kehtetud_nimed = kehtetud_nimed;
           this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the evnimi value for this Paringliht_tasuta_ettevote.
     * 
     * @return evnimi
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }


    /**
     * Sets the evnimi value for this Paringliht_tasuta_ettevote.
     * 
     * @param evnimi
     */
    public void setEvnimi(java.lang.String evnimi) {
        this.evnimi = evnimi;
    }


    /**
     * Gets the kehtetud_nimed value for this Paringliht_tasuta_ettevote.
     * 
     * @return kehtetud_nimed
     */
    public eu.x_road.arireg.producer.Paringliht_tasuta_kehtetunimi[] getKehtetud_nimed() {
        return kehtetud_nimed;
    }


    /**
     * Sets the kehtetud_nimed value for this Paringliht_tasuta_ettevote.
     * 
     * @param kehtetud_nimed
     */
    public void setKehtetud_nimed(eu.x_road.arireg.producer.Paringliht_tasuta_kehtetunimi[] kehtetud_nimed) {
        this.kehtetud_nimed = kehtetud_nimed;
    }


    /**
     * Gets the ariregistri_kood value for this Paringliht_tasuta_ettevote.
     * 
     * @return ariregistri_kood
     */
    public java.lang.String getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Paringliht_tasuta_ettevote.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.String ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_tasuta_ettevote)) return false;
        Paringliht_tasuta_ettevote other = (Paringliht_tasuta_ettevote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.evnimi==null && other.getEvnimi()==null) || 
             (this.evnimi!=null &&
              this.evnimi.equals(other.getEvnimi()))) &&
            ((this.kehtetud_nimed==null && other.getKehtetud_nimed()==null) || 
             (this.kehtetud_nimed!=null &&
              java.util.Arrays.equals(this.kehtetud_nimed, other.getKehtetud_nimed()))) &&
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood())));
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
        if (getEvnimi() != null) {
            _hashCode += getEvnimi().hashCode();
        }
        if (getKehtetud_nimed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKehtetud_nimed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKehtetud_nimed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
