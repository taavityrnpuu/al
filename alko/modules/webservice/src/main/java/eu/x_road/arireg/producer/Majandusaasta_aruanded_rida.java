/**
 * Majandusaasta_aruanded_rida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Majandusaasta_aruanded_rida  implements java.io.Serializable {
    private int rea_nr;

    private java.lang.String rea_nimetus;

    private eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg[] majandusaasta_aruanded_veerud;

    public Majandusaasta_aruanded_rida() {
    }

    public Majandusaasta_aruanded_rida(
           int rea_nr,
           java.lang.String rea_nimetus,
           eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg[] majandusaasta_aruanded_veerud) {
           this.rea_nr = rea_nr;
           this.rea_nimetus = rea_nimetus;
           this.majandusaasta_aruanded_veerud = majandusaasta_aruanded_veerud;
    }


    /**
     * Gets the rea_nr value for this Majandusaasta_aruanded_rida.
     * 
     * @return rea_nr
     */
    public int getRea_nr() {
        return rea_nr;
    }


    /**
     * Sets the rea_nr value for this Majandusaasta_aruanded_rida.
     * 
     * @param rea_nr
     */
    public void setRea_nr(int rea_nr) {
        this.rea_nr = rea_nr;
    }


    /**
     * Gets the rea_nimetus value for this Majandusaasta_aruanded_rida.
     * 
     * @return rea_nimetus
     */
    public java.lang.String getRea_nimetus() {
        return rea_nimetus;
    }


    /**
     * Sets the rea_nimetus value for this Majandusaasta_aruanded_rida.
     * 
     * @param rea_nimetus
     */
    public void setRea_nimetus(java.lang.String rea_nimetus) {
        this.rea_nimetus = rea_nimetus;
    }


    /**
     * Gets the majandusaasta_aruanded_veerud value for this Majandusaasta_aruanded_rida.
     * 
     * @return majandusaasta_aruanded_veerud
     */
    public eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg[] getMajandusaasta_aruanded_veerud() {
        return majandusaasta_aruanded_veerud;
    }


    /**
     * Sets the majandusaasta_aruanded_veerud value for this Majandusaasta_aruanded_rida.
     * 
     * @param majandusaasta_aruanded_veerud
     */
    public void setMajandusaasta_aruanded_veerud(eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg[] majandusaasta_aruanded_veerud) {
        this.majandusaasta_aruanded_veerud = majandusaasta_aruanded_veerud;
    }

    public eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg getMajandusaasta_aruanded_veerud(int i) {
        return this.majandusaasta_aruanded_veerud[i];
    }

    public void setMajandusaasta_aruanded_veerud(int i, eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg _value) {
        this.majandusaasta_aruanded_veerud[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandusaasta_aruanded_rida)) return false;
        Majandusaasta_aruanded_rida other = (Majandusaasta_aruanded_rida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.rea_nr == other.getRea_nr() &&
            ((this.rea_nimetus==null && other.getRea_nimetus()==null) || 
             (this.rea_nimetus!=null &&
              this.rea_nimetus.equals(other.getRea_nimetus()))) &&
            ((this.majandusaasta_aruanded_veerud==null && other.getMajandusaasta_aruanded_veerud()==null) || 
             (this.majandusaasta_aruanded_veerud!=null &&
              java.util.Arrays.equals(this.majandusaasta_aruanded_veerud, other.getMajandusaasta_aruanded_veerud())));
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
        _hashCode += getRea_nr();
        if (getRea_nimetus() != null) {
            _hashCode += getRea_nimetus().hashCode();
        }
        if (getMajandusaasta_aruanded_veerud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMajandusaasta_aruanded_veerud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMajandusaasta_aruanded_veerud(), i);
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
